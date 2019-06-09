import socket
import time
host = socket.gethostbyname(socket.gethostname())
print(host)
port = 9090
clients = []
sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
sock.bind((host, port))
exit = False
print('$erver has been started')
while not exit:
	try:
		data, addr = sock.recvfrom(1024)
		if addr not in clients:
			clients.append(addr)
		time_now = time.strftime("%Y-%m-%d:%H-%M-%S", time.localtime())
		print(addr[0] + " " + str(addr[1]) + " " + time_now + "/", end = "")
		print(data.decode('utf-8'))
		for client in clients:
			if addr != client:
				sock.sendto(data, client)
				clients.remove(client)
	except:
		try:
			continue
		except:
			exit = True
sock.close()