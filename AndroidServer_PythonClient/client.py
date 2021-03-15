import socket 

PORT = 8080
SERVER = "192.168.1.55" # IP del server 
ADDR = (SERVER, PORT)
FORMAT = "utf-8"
DISCONNECT_MESSAGE = "!DISCONNECT" 



def send_msg(msg, client):

    message = msg.encode(FORMAT) # codificarlo in binario per la trasmissione
    client.send(message) # mando msg 
    #print(client.recv(2048).decode(FORMAT))# decodifico risposta e la printo 
    client.close()
    



def main():
    
    while(True):
        client = socket.socket(socket.AF_INET, socket.SOCK_STREAM) # creo il client
        client.connect(ADDR) # indirizzo del server a cui devo connettermi 
        print("Write the msg to send:")
        msg1 = input()
        send_msg(msg1, client)

if __name__ == "__main__":
    main()
