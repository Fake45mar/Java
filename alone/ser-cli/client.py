import threading
import time
import socket
shutdown = False
join = False
def receving(name, sock):
	while not shutdown:
		try:
			while True:
				data, addr = sock.recvfrom(1024)
				print(data.decode('utf-8'))
				time.sleep(0.2)
		except:
			pass
host = socket.gethostbyname(socket.gethostname())
port = 0
server = ('172.20.10.8', 9090)
sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
sock.bind((host, port))
sock.setblocking(0)
name = input('Name: ')
recThr = threading.Thread(target = receving, args = ("RecvThread", sock))
recThr.start()
while shutdown == False:
	if join == False:
		sock.sendto((name + ' ' + 'join chat').encode('utf-8'), server)
		join = True
	else:
		try:
			message = input('Write a message - ')
			if message != "":
				sock.sendto((name + ' ' + message).encode(), server)
			time.sleep(0.2)
		except:
			sock.sendto((name + ' ' + 'left chat').encode(), server)
			shutdown = True
		finally:
			pass
recThr.join()
sock.close()