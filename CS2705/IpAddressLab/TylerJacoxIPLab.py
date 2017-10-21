import ipaddress

#1
print('1. What is the first address of a block of classless addresses if one of the addresses is 192.168.2.76/28?')
ipInterface = ipaddress.ip_interface('192.168.2.76/28')
ipnetwork=ipInterface.network
print('{} is the network address'.format(ipaddress.ip_network(ipnetwork).network_address))
print('{} is the first usable address'.format((ipaddress.ip_network(ipnetwork).network_address)+1)+"\n")

# 2
print('2. What is the first address of a block of classless addresses if one of the addresses is 192.168.2.76/9?')
ipInterface = ipaddress.ip_interface('192.168.2.76/9')
ipnetwork=ipInterface.network
print('{} is the network address'.format(ipaddress.ip_network(ipnetwork).network_address))
print('{} is the first usable address'.format((ipaddress.ip_network(ipnetwork).network_address)+1)+"\n")

# 3
print('3. What is the first address of a block of classless addresses if one of the addresses is 192.168.2.137/27?')
ipInterface = ipaddress.ip_interface('192.168.2.137/27')
ipnetwork=ipInterface.network
print('{} is the network address'.format(ipaddress.ip_network(ipnetwork).network_address))
print('{} is the first usable address'.format((ipaddress.ip_network(ipnetwork).network_address)+1)+"\n")

# 4
print('4. Find the number of addresses in a block of classless addresses if one of the addresses is 101.10.2.8/15.')
ipInterface = ipaddress.ip_interface('101.10.2.8/15')
ipnetwork=ipInterface.network
print('{} is the number of total addresses available'.format(ipaddress.ip_network(ipnetwork).num_addresses))
print('{} is the number of usable addresses available'.format((len(list(ipaddress.ip_network(ipnetwork).hosts()))))+"\n")

# 5
print('5. Find the number of addresses in a block of classless addresses if one of the addresses is 101.10.2.8/29.')
ipInterface = ipaddress.ip_interface('101.10.2.8/29')
ipnetwork=ipInterface.network
print('{} is the number of total addresses available'.format(ipaddress.ip_network(ipnetwork).num_addresses))
print('{} is the number of usable addresses available'.format((len(list(ipaddress.ip_network(ipnetwork).hosts()))))+"\n")

# 6
print('6. What is the last address of a block of classless addresses if one of the addresses is 192.168.2.137/27?')
ipInterface = ipaddress.ip_interface('192.168.2.137/27')
ipnetwork=ipInterface.network
print('{} is the broadcast address'.format(ipaddress.ip_network(ipnetwork).broadcast_address))
print('{} is the last usable address'.format((ipaddress.ip_network(ipnetwork).broadcast_address)-1)+"\n")

# 7
print('7. What is the last address of a block of classless addresses if one of the addresses is 110.10.2.55/30?')
ipInterface = ipaddress.ip_interface('110.10.2.55/30')
ipnetwork=ipInterface.network
print('{} is the broadcast address'.format(ipaddress.ip_network(ipnetwork).broadcast_address))
print('{} is the last usable address'.format((ipaddress.ip_network(ipnetwork).broadcast_address)-1)+"\n")

# 8
print('8. An organization is granted a block; one address is 110.10.10.64/20. The organization needs 10 subnets. What is the subnet prefix length?')
ipInterface = ipaddress.ip_interface('110.10.10.64/20')
ipnetwork=ipInterface.network
print('{} is the network address'.format(ipaddress.ip_network(ipnetwork).network_address))
print(len(list(ipaddress.ip_network(ipnetwork).subnets(prefixlen_diff=4))))
print('The prefix length is /{}'.format(ipaddress.ip_network('110.10.0.0/24').prefixlen)+"\n")

# 9
print('9. An organization is granted a block; one address is 110.10.10.64/25. If the subnet prefix length is /28, what is the maximum number of subnets?')
ipInterface = ipaddress.ip_interface('110.10.10.64/25')
ipnetwork=ipInterface.network
subnets=len(list(ipaddress.ip_network(ipnetwork).subnets(prefixlen_diff=3)))
total=ipaddress.ip_network(ipnetwork).num_addresses
print('{} is the maximum number of subnets'.format(total/subnets)+"\n")

# 10
print('10. An organization is granted a block of classless addresses with the starting address: 156.78.51.24/25. How many addresses are granted?')
print('{} addresses are granted'.format(pow((32-25),2))+"\n")

# 11
print('11. An organization is granted a block of classless addresses with the starting address: 156.78.51.24/30. How many addresses are granted?')
print('{} addresses are granted'.format(pow((32-30),2))+"\n")

# 12
print('12. An organization is granted a block of classless addresses with the starting address: 166.25.132.0/3. How many addresses are granted?')
print('{} addresses are granted'.format(pow((32-3),2))+"\n")