# Tyler Jacox
# Lab 2 Binary Decimal Conversion
# CS 2705 Fundamentals of Programming

#Question 1
octet01=192
octet02=168
octet03=16
octet04=13

binOctet01=bin(octet01)[2:].zfill(8)
binOctet02=bin(octet02)[2:].zfill(8)
binOctet03=bin(octet03)[2:].zfill(8)
binOctet04=bin(octet04)[2:].zfill(8)

IPAddress=("The binary IP address of 192.168.16.13 is {0}.{1}.{2}.{3}")

print(IPAddress.format(binOctet01,binOctet02,binOctet03,binOctet04))

#Question 2
octet01=164
octet02=10
octet03=241
octet04=2

binOctet01=bin(octet01)[2:].zfill(8)
binOctet02=bin(octet02)[2:].zfill(8)
binOctet03=bin(octet03)[2:].zfill(8)
binOctet04=bin(octet04)[2:].zfill(8)

IPAddress="The binary IP address of 164.10.241.2 is {0}.{1}.{2}.{3}"

print(IPAddress.format(binOctet01,binOctet02,binOctet03,binOctet04))

#Question 3
octet01=10
octet02=244
octet03=116
octet04=15

binOctet01=bin(octet01)[2:].zfill(8)
binOctet02=bin(octet02)[2:].zfill(8)
binOctet03=bin(octet03)[2:].zfill(8)
binOctet04=bin(octet04)[2:].zfill(8)

IPAddress="The binary IP address of 10.244.116.15 is {0}.{1}.{2}.{3}"

print(IPAddress.format(binOctet01,binOctet02,binOctet03,binOctet04))

#Question 4
octet01=15
octet02=255
octet03=200
octet04=153

binOctet01=bin(octet01)[2:].zfill(8)
binOctet02=bin(octet02)[2:].zfill(8)
binOctet03=bin(octet03)[2:].zfill(8)
binOctet04=bin(octet04)[2:].zfill(8)

IPAddress="The binary IP address of 15.255.200.153 is {0}.{1}.{2}.{3}"

print(IPAddress.format(binOctet01,binOctet02,binOctet03,binOctet04))

#Question 5
octet01=172
octet02=99
octet03=62
octet04=9

binOctet01=bin(octet01)[2:].zfill(8)
binOctet02=bin(octet02)[2:].zfill(8)
binOctet03=bin(octet03)[2:].zfill(8)
binOctet04=bin(octet04)[2:].zfill(8)

IPAddress="The binary IP address of 172.99.62.9 is {0}.{1}.{2}.{3}"

print(IPAddress.format(binOctet01,binOctet02,binOctet03,binOctet04))

#Question 6
octet01='10110100'
octet02='11101011'
octet03='00001000'
octet04='10010001'

decOctet01=int(octet01,2)
decOctet02=int(octet02,2)
decOctet03=int(octet03,2)
decOctet04=int(octet04,2)

IPAddress="The decimal IP address of 10110100.11101011.00001000.10010001 is {0}.{1}.{2}.{3}"
print(IPAddress.format(decOctet01,decOctet02,decOctet03,decOctet04))

#Question 7
octet01='10001100'
octet02='11111111'
octet03='11000000'
octet04='00000001'

decOctet01=int(octet01,2)
decOctet02=int(octet02,2)
decOctet03=int(octet03,2)
decOctet04=int(octet04,2)

IPAddress="The decimal IP address of 10001100.11111111.11000000.00000001 is {0}.{1}.{2}.{3}"
print(IPAddress.format(decOctet01,decOctet02,decOctet03,decOctet04))

#Question 8
octet01='00010001'
octet02='11001100'
octet03='00000001'
octet04='00010010'

decOctet01=int(octet01,2)
decOctet02=int(octet02,2)
decOctet03=int(octet03,2)
decOctet04=int(octet04,2)

IPAddress="The decimal IP address of 00010001.11001100.00000001.00010010 is {0}.{1}.{2}.{3}"
print(IPAddress.format(decOctet01,decOctet02,decOctet03,decOctet04))

#Question 9
octet01='11100111'
octet02='00110011'
octet03='10101010'
octet04='11111110'

decOctet01=int(octet01,2)
decOctet02=int(octet02,2)
decOctet03=int(octet03,2)
decOctet04=int(octet04,2)

IPAddress="The decimal IP address of 11100111.00110011.10101010.11111110 is {0}.{1}.{2}.{3}"
print(IPAddress.format(decOctet01,decOctet02,decOctet03,decOctet04))

#Question 10
octet01='00010111'
octet02='11101110'
octet03='01010101'
octet04='10000000'

decOctet01=int(octet01,2)
decOctet02=int(octet02,2)
decOctet03=int(octet03,2)
decOctet04=int(octet04,2)

IPAddress="The decimal IP address of 00010111.11101110.01010101.10000000 is {0}.{1}.{2}.{3}"
print(IPAddress.format(decOctet01,decOctet02,decOctet03,decOctet04))