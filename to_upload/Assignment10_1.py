import os
from sys import *

def Directory_Watcher1(Dir_Name,File_Extention):

    Fd = open("Demo.txt",'a')
    counter =0

    for Foldername, Subfolder, Filename in os.walk(Dir_Name):
        
        for fname in Filename:
            if(fname.endswith(File_Extention)):
                Fd.write(fname+'\n')
                counter+=1
    print(counter) 

def main(): 
    print()

    if(argv[1] == "-h"):
        print("This script will travel the directory and copy file names which has a given extention and paste that name into newly created txt file ")
        exit()

    if(argv[1] == "-u"):
        print("Usage : <Application_name> <Direcory_Name> <File_Extention>")
        exit()

    Directory_Watcher1(argv[1],argv[2])

if(__name__ == "__main__"):
    main()