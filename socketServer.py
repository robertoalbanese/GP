import socket 

FORMAT = "utf-8"      

def sub_server(indirizzo, backlog=1): # blacklog quante richieste può accettare  
    try:
        s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        s.bind(indirizzo) # collegamento dell socket server al'ip della macchina che lo ospita 
        s.listen(backlog) # mi metto in ascolto di richieste specificando il backlog, cioè quante ne posso gestire 
        print("server initializated, listening...")
    except socket.error as error:
        #print(f"server crash {error}")
        print("try to rerun the server")
        sub_server(indirizzo, backlog=1)

    while True:
        conn, indirizzo_client = s.accept() # accetto la richiesta di un client, 
                                            # funzione che ritorna la connessione (il socket del client) e l'inidrizzo del client 
        richiesta = conn.recv(4096).decode(FORMAT) 
        if richiesta != "":
            #print(f"richiesta: {richiesta} ")

if __name__ == "__main__":
    sub_server(("93.38.66.132",29418)) #  "" = prende l'IP della macchina su cui sta girando però la porta deve essere specificata  