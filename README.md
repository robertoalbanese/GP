# File list 
_provaSocket_ è la prova di un doppio socket tra app e uno script in python. Quindi permette la comunicazione in entrambe le direzioni. 
_AndroidServe_PythonClient_ Contiene due script: un che invia semplicemente una striga, latro un file JSON con pitch, roll e yaw (l' app printa solo il valore del pitch).
_DJISimulatorDemo_ è il codice del simulatore con del controllo del drone tramite stick, riadattato con il nostro socket che manda pacchetti JSON con le posizioni angolari e le fa printare al simulatore (Quindi gli stick sono stati rimossi).
# Android
provaSocket è il progetto android con il client. Modificare indirizzo IP nel file SocketClient con l'indirizzo IP del proprio PC.
# Script Python
socketServer.py è il server (PC). Modificare IP e port nel metodo sub_server con l'indirizzo IP del proprio PC.
