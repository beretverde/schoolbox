import ipaddress
from tabulate import tabulate

ipinterface = ipaddress.ip_interface('138.191.0.0/25')
ipnetwork = ipinterface.network

classrooms = (list(ipaddress.ip_network(ipnetwork).subnets(prefixlen_diff=2)))
# print(len(list(classrooms[0].hosts())))
# print(classrooms[0])
# print(classrooms[1])
# print(classrooms[2])
# print(classrooms[3])

# print('Small classes')
smallClass1 = (list(ipaddress.ip_network(classrooms[2]).subnets()))
smallClass2 = (list(ipaddress.ip_network(classrooms[3]).subnets()))

# print(smallClass1[0])
# print(smallClass1[1])
# print(smallClass2[0])
# print(smallClass2[1])

# print('Large Class')
largeClass = (list(ipaddress.ip_network(classrooms[1]).subnets(prefixlen_diff=1)))

# print(largeClass[0])
# print(largeClass[1])

# print('Labs')
labs = (list(ipaddress.ip_network(smallClass2[1]).subnets()))

# print(labs[0])
# print(labs[1])

print('Class Room Network Lab')
print(tabulate([['Lab 1', labs[0], labs[0].network_address,
                 labs[0].broadcast_address, len(list(labs[0].hosts())),
                 labs[0].network_address + 1,
                 labs[0].broadcast_address - 1],
                ['Lab 2', labs[1], labs[1].network_address,
                 labs[1].broadcast_address, len(list(labs[1].hosts())),
                 labs[1].network_address + 1,
                 labs[1].broadcast_address - 1],
                ['Classroom 3', smallClass1[0], smallClass1[0].network_address,
                 smallClass1[0].broadcast_address, len(list(smallClass1[0].hosts())),
                 smallClass1[0].network_address + 1,
                 smallClass1[0].broadcast_address - 1],
                ['Classroom 4', smallClass1[1], smallClass1[1].network_address,
                 smallClass1[1].broadcast_address, len(list(smallClass1[1].hosts())),
                 smallClass1[1].network_address + 1,
                 smallClass1[1].broadcast_address - 1],
                ['Classroom 5', smallClass2[0], smallClass2[0].network_address,
                 smallClass2[0].broadcast_address, len(list(smallClass2[0].hosts())),
                 smallClass2[0].network_address + 1,
                 smallClass2[0].broadcast_address - 1],
                ['Classroom 1', classrooms[0], classrooms[0].network_address,
                 classrooms[0].broadcast_address, len(list(classrooms[0].hosts())),
                 classrooms[0].network_address + 1,
                 classrooms[0].broadcast_address - 1],
                ['Classroom 2', classrooms[1], classrooms[1].network_address,
                 classrooms[1].broadcast_address, len(list(classrooms[1].hosts())),
                 classrooms[1].network_address + 1,
                 classrooms[1].broadcast_address - 1]],

               headers=['Name', 'Network Address and Subnet', 'Network Address', 'Broadcast Address', '# Computers',
                        'Valid Host', 'Range']) + '\n')
