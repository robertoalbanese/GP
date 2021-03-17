import socket
import json
import time

PORT = 8080
SERVER = "130.251.13.122"  # IP del server
ADDR = (SERVER, PORT)
FORMAT = "utf-8"
DISCONNECT_MESSAGE = "!DISCONNECT"


def send_msg(msg, client):

    message = msg.encode(FORMAT)  # codificarlo in binario per la trasmissione
    client.send(message)  # mando msg
    # print(client.recv(2048).decode(FORMAT))# decodifico risposta e la printo
    client.close()


def main():

    with open('rpy.JSON') as j:
        data = json.load(j)

    i = 1
    #print("Write pitch")
    #pitch = input()
    data['pitch'] = i
    msg = json.dumps(data)
    while (True):
        #print("Write pitch")
        #pitch = input()
        data['pitch'] = 5
        msg = json.dumps(data)
        client = socket.socket(
            socket.AF_INET, socket.SOCK_STREAM)  # creo il client
        client.connect(ADDR)  # indirizzo del server a cui devo connettermi
        print("Sanding the jason msg...")
        send_msg(msg, client)
        i = i + 1
        time.sleep(1)


if __name__ == "__main__":
    main()
