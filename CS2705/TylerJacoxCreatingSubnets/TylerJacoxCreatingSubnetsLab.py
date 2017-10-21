#CS2705
#Tyler Jacox
# Creating Subnets
import ipaddress

#Question 1

print('1.) What is the subnet mask value for:')
# 2 bit subnet mask -- 11000000.00000000.00000000.00000000
ipInterface = ipaddress.ip_interface('192.168.5.0/2')
print('1. a. 2-bit mask: {}'.format(ipInterface.netmask)+"\n")

ipInterface = ipaddress.ip_interface('192.168.5.0/13')
print('2. a 13-bit mask: {}'.format(ipInterface.netmask)+"\n")

ipInterface = ipaddress.ip_interface('192.168.5.0/5')
print('3. a 5-bit mask: {}'.format(ipInterface.netmask)+"\n")

ipInterface = ipaddress.ip_interface('192.168.5.0/11')
print('4. a 11-bit mask: {}'.format(ipInterface.netmask)+"\n")

ipInterface = ipaddress.ip_interface('192.168.5.0/9')
print('5. a 9-bit mask: {}'.format(ipInterface.netmask)+"\n")

ipInterface = ipaddress.ip_interface('192.168.5.0/10')
print('6. a 10-bit mask: {}'.format(ipInterface.netmask)+"\n")

ipInterface = ipaddress.ip_interface('192.168.5.0/4')
print('7. a 4-bit mask: {}'.format(ipInterface.netmask)+"\n")

ipInterface = ipaddress.ip_interface('192.168.5.0/14')
print('8. a 14-bit mask: {}'.format(ipInterface.netmask)+"\n")

ipInterface = ipaddress.ip_interface('192.168.5.0/6')
print('9. a 6-bit mask: {}'.format(ipInterface.netmask)+"\n")

ipInterface = ipaddress.ip_interface('192.168.5.0/8')
print('10. a 8-bit mask: {}'.format(ipInterface.netmask)+"\n")

ipInterface = ipaddress.ip_interface('192.168.5.0/12')
print('11. a 12-bit mask: {}'.format(ipInterface.netmask)+"\n")

#Question 2

print('2.) Use the IP address 132.8.150.67/22 and find the following')
ipInterface = ipaddress.ip_interface('132.8.150.67/22')
ipNetwork=ipInterface.network
print('Network Address: {}'.format(ipNetwork.network_address))
print('Broadcast Address: {}'.format(ipNetwork.broadcast_address))
print('Number of Host: {}'.format(len(list(ipNetwork.hosts()))))
print('Valid Host Range: {0}-{1}'.format(ipNetwork.network_address+1,ipNetwork.broadcast_address-1)+"\n")

#Question 3

print('3.) Use the IP address 200.16.5.74/30 and find the following')
ipInterface = ipaddress.ip_interface('200.16.5.74/30')
ipNetwork=ipInterface.network
print('Network Address: {}'.format(ipNetwork.network_address))
print('Broadcast Address: {}'.format(ipNetwork.broadcast_address))
print('Number of Host: {}'.format(len(list(ipNetwork.hosts()))))
print('Valid Host Range: {0}-{1}'.format(ipNetwork.network_address+1,ipNetwork.broadcast_address-1)+"\n")

#Question 4

print('4.) Use the IP address 166.0.13.8 with subnet mask of 255.255.252.0 and find the following')
ipInterface = ipaddress.ip_interface('255.255.252.0')
ipNetwork=ipInterface.network
print('Network Address: {}'.format(ipNetwork.network_address))
print('Broadcast Address: {}'.format(ipNetwork.broadcast_address))
print('Number of Host: {}'.format(len(list(ipNetwork.hosts()))))
print('Valid Host Range: {0}-{1}'.format(ipNetwork.network_address+1,ipNetwork.broadcast_address-1)+"\n")

#Question 5

print('5.) With this subnet mask 255.255.240.0 answer the following:')
ipInterface = ipaddress.ip_interface('10.10.10.10/255.255.255.0')
ipNetwork=ipInterface.network
print('# of Bits used in subnet mask: {}'.format(ipNetwork.prefixlen))
print('# of Hosts: {}'.format(len(list((ipNetwork.hosts()))))+"\n")

#Question 6

print('6.) With this subnet mask 255.255.255.192 answer the following:')
ipInterface = ipaddress.ip_interface('10.10.10.10/255.255.255.192')
ipNetwork=ipInterface.network
print('# of Bits used in subnet mask: {}'.format(ipNetwork.prefixlen))
print('# of Hosts: {}'.format(len(list((ipNetwork.hosts()))))+"\n")

#Question 7

print('7.) With this subnet mask 255.255.252.0 answer the following:')
ipInterface = ipaddress.ip_interface('10.10.10.10/255.255.252.0')
ipNetwork=ipInterface.network
print('# of Bits used in subnet mask: {}'.format(ipNetwork.prefixlen))
print('# of Hosts: {}'.format(len(list((ipNetwork.hosts()))))+"\n")

#Question 8

print('8.) With this subnet mask 255.255.255.248 answer the following:')
ipInterface = ipaddress.ip_interface('10.10.10.10/255.255.255.248')
ipNetwork=ipInterface.network
print('# of Bits used in subnet mask: {}'.format(ipNetwork.prefixlen))
print('# of Hosts: {}'.format(len(list((ipNetwork.hosts()))))+"\n")

#Question 9

print('You’re a manager of a network that has 56 remote site and you have one Class B license. What subnet mask would you use with having the max amount of hosts at each site 1000?')
ipInterface = ipaddress.ip_interface('10.10.10.10/16')
# Class B has a /16 mask
ipNetwork=ipInterface.network
print(ipNetwork)
bitsBorrowed=6
ipSubnetLength= ipNetwork.prefixlen + bitsBorrowed
print('The subnet mask length is {}'.format(ipSubnetLength))
print('The 57 subnets needed are less than the {} subnets created'.format(len(list(ipaddress.ip_network(ipNetwork).subnets(prefixlen_diff=bitsBorrowed)))))
ipSubnet=str('10.10.10.10')+'/'+str(ipSubnetLength)
print(ipSubnet)
ipSubnetAddress = ipaddress.ip_network(ipSubnet,strict=False)
print('The 1000 hosts needed are equal or less than the {} host in each subnet'.format(len(list(ipaddress.ip_network(ipSubnetAddress).hosts()))))

