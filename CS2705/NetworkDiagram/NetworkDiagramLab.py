# Tyler Jacox
# Network Diagram Lab
# 03 OCT 2017

import ipaddress
from tabulate import tabulate

ipInterface = ipaddress.ip_interface('138.191.0.0/16')
ipNetwork = ipInterface.network

college = list(ipaddress.ip_network(ipNetwork).subnets(prefixlen_diff=4))
print('Departments')
print(tabulate([['Applied Science', college[0], college[0].network_address + 1, college[0].broadcast_address - 1],
                ['Arts & Humanities', college[1], college[1].network_address + 1, college[1].broadcast_address - 1],
                ['Education', college[2], college[2].network_address + 1, college[2].broadcast_address - 1],
                ['Business & Economics', college[3], college[3].network_address + 1, college[3].broadcast_address - 1],
                ['Health', college[4], college[4].network_address + 1, college[4].broadcast_address - 1],
                ['Science', college[5], college[5].network_address + 1, college[5].broadcast_address - 1],
                ['Social & Behavioral Science', college[6], college[6].network_address + 1,
                 college[6].broadcast_address - 1],
                ['Information Technology', college[7], college[7].network_address + 1,
                 college[7].broadcast_address - 1],
                ['Student Affairs', college[8], college[8].network_address + 1, college[8].broadcast_address - 1],
                ['Facilities Management', college[9], college[9].network_address + 1, college[9].broadcast_address - 1],
                ['Administrative Services', college[10], college[10].network_address + 1,
                 college[10].broadcast_address - 1]],
               headers=['Name', 'Network Address and Subnet', 'Host IP', 'Addresss Range']) + '\n')

ipInterface = ipaddress.ip_interface(college[0])
ipNetwork = ipInterface.network
applied = list(ipaddress.ip_network(ipNetwork).subnets(prefixlen_diff=3))
print('Department of Applied Science')
print(tabulate([['Computer Science', applied[0], applied[0].network_address + 1, applied[0].broadcast_address - 1],
                ['Professional Sales', applied[1], applied[1].network_address + 1, applied[1].broadcast_address - 1],
                ['Manufacturing Engineering', applied[2], applied[2].network_address + 1, applied[2].broadcast_address - 1],
                ['Construction Management', applied[3], applied[3].network_address + 1, applied[3].broadcast_address - 1],
                ['Automotive Technology', applied[4], applied[4].network_address + 1, applied[4].broadcast_address - 1],
                ['Network Technology', applied[5], applied[5].network_address + 1, applied[5].broadcast_address - 1],
                ['Web Design', applied[6], applied[6].network_address + 1,
                 applied[6].broadcast_address - 1],
                ['Engineering', applied[7], applied[7].network_address + 1,
                 applied[7].broadcast_address - 1]],
               headers=['Name', 'Network Address and Subnet', 'Host IP', 'Addresss Range']) + '\n')

ipInterface = ipaddress.ip_interface(college[1])
ipNetwork = ipInterface.network
applied = list(ipaddress.ip_network(ipNetwork).subnets(prefixlen_diff=3))
print('Department of Arts and Humanities')
print(tabulate([['Korean', applied[0], applied[0].network_address + 1, applied[0].broadcast_address - 1],
                ['German', applied[1], applied[1].network_address + 1, applied[1].broadcast_address - 1],
                ['Spanish', applied[2], applied[2].network_address + 1, applied[2].broadcast_address - 1],
                ['French', applied[3], applied[3].network_address + 1, applied[3].broadcast_address - 1],
                ['English', applied[4], applied[4].network_address + 1, applied[4].broadcast_address - 1],
                ['Visual Arts', applied[5], applied[5].network_address + 1, applied[5].broadcast_address - 1],
                ['Performing Arts', applied[6], applied[6].network_address + 1,
                 applied[6].broadcast_address - 1],
                ['Communications', applied[7], applied[7].network_address + 1,
                 applied[7].broadcast_address - 1]],
               headers=['Name', 'Network Address and Subnet', 'Host IP', 'Addresss Range']) + '\n')

ipInterface = ipaddress.ip_interface(college[2])
ipNetwork = ipInterface.network
applied = list(ipaddress.ip_network(ipNetwork).subnets(prefixlen_diff=3))
print('Department of Education')
print(tabulate([['Child and Family Studies', applied[0], applied[0].network_address + 1, applied[0].broadcast_address - 1],
                ['Health Promotion', applied[1], applied[1].network_address + 1, applied[1].broadcast_address - 1],
                ['Athletic Training', applied[2], applied[2].network_address + 1, applied[2].broadcast_address - 1],
                ['French', applied[3], applied[3].network_address + 1, applied[3].broadcast_address - 1],
                ['English', applied[4], applied[4].network_address + 1, applied[4].broadcast_address - 1],
                ['Visual Arts', applied[5], applied[5].network_address + 1, applied[5].broadcast_address - 1],
                ['Performing Arts', applied[6], applied[6].network_address + 1,
                 applied[6].broadcast_address - 1],
                ['Communications', applied[7], applied[7].network_address + 1,
                 applied[7].broadcast_address - 1]],
               headers=['Name', 'Network Address and Subnet', 'Host IP', 'Addresss Range']) + '\n')

ipInterface = ipaddress.ip_interface(college[3])
ipNetwork = ipInterface.network
applied = list(ipaddress.ip_network(ipNetwork).subnets(prefixlen_diff=3))
print('Department of Business & Economics')
print(tabulate([['Buisness Administration', applied[0], applied[0].network_address + 1, applied[0].broadcast_address - 1],
                ['Economics', applied[1], applied[1].network_address + 1, applied[1].broadcast_address - 1],
                ['Information Systems Tech', applied[2], applied[2].network_address + 1, applied[2].broadcast_address - 1],
                ['Master of Buisness Admin', applied[3], applied[3].network_address + 1, applied[3].broadcast_address - 1],
                ['Accounting', applied[4], applied[4].network_address + 1, applied[4].broadcast_address - 1],
                ['Buisness Education', applied[5], applied[5].network_address + 1, applied[5].broadcast_address - 1],
                ['Master of Accountancy', applied[6], applied[6].network_address + 1,
                 applied[6].broadcast_address - 1],
                ['Master of Taxation', applied[7], applied[7].network_address + 1,
                 applied[7].broadcast_address - 1]],
               headers=['Name', 'Network Address and Subnet', 'Host IP', 'Addresss Range']) + '\n')

ipInterface = ipaddress.ip_interface(college[4])
ipNetwork = ipInterface.network
applied = list(ipaddress.ip_network(ipNetwork).subnets(prefixlen_diff=3))
print('Department of Health')
print(tabulate([['Dental Hygiene', applied[0], applied[0].network_address + 1, applied[0].broadcast_address - 1],
                ['Emergency Care', applied[1], applied[1].network_address + 1, applied[1].broadcast_address - 1],
                ['Health Information Mgmt', applied[2], applied[2].network_address + 1, applied[2].broadcast_address - 1],
                ['Nursing', applied[3], applied[3].network_address + 1, applied[3].broadcast_address - 1],
                ['Medical Laboratory', applied[4], applied[4].network_address + 1, applied[4].broadcast_address - 1],
                ['Radiology', applied[5], applied[5].network_address + 1, applied[5].broadcast_address - 1],
                ['Respiratory Therapy', applied[6], applied[6].network_address + 1,
                 applied[6].broadcast_address - 1],
                ['Occupational Therapy', applied[7], applied[7].network_address + 1,
                 applied[7].broadcast_address - 1]],
               headers=['Name', 'Network Address and Subnet', 'Host IP', 'Addresss Range']) + '\n')

ipInterface = ipaddress.ip_interface(college[5])
ipNetwork = ipInterface.network
applied = list(ipaddress.ip_network(ipNetwork).subnets(prefixlen_diff=3))
print('Department of Science')
print(tabulate([['Botany', applied[0], applied[0].network_address + 1, applied[0].broadcast_address - 1],
                ['Geosciences', applied[1], applied[1].network_address + 1, applied[1].broadcast_address - 1],
                ['Microbiology', applied[2], applied[2].network_address + 1, applied[2].broadcast_address - 1],
                ['Developmental Math', applied[3], applied[3].network_address + 1, applied[3].broadcast_address - 1],
                ['Physics', applied[4], applied[4].network_address + 1, applied[4].broadcast_address - 1],
                ['Zoology', applied[5], applied[5].network_address + 1, applied[5].broadcast_address - 1],
                ['Mathematics', applied[6], applied[6].network_address + 1,
                 applied[6].broadcast_address - 1],
                ['Human Anatomy Physiology', applied[7], applied[7].network_address + 1,
                 applied[7].broadcast_address - 1]],
               headers=['Name', 'Network Address and Subnet', 'Host IP', 'Addresss Range']) + '\n')

ipInterface = ipaddress.ip_interface(college[6])
ipNetwork = ipInterface.network
applied = list(ipaddress.ip_network(ipNetwork).subnets(prefixlen_diff=3))
print('Department of Social and Behavioral Science')
print(tabulate([['Criminal Justice', applied[0], applied[0].network_address + 1, applied[0].broadcast_address - 1],
                ['Geography', applied[1], applied[1].network_address + 1, applied[1].broadcast_address - 1],
                ['History', applied[2], applied[2].network_address + 1, applied[2].broadcast_address - 1],
                ['Military Science', applied[3], applied[3].network_address + 1, applied[3].broadcast_address - 1],
                ['Philosophy & Poli Sci', applied[4], applied[4].network_address + 1, applied[4].broadcast_address - 1],
                ['Psychology', applied[5], applied[5].network_address + 1, applied[5].broadcast_address - 1],
                ['Social Work', applied[6], applied[6].network_address + 1,
                 applied[6].broadcast_address - 1],
                ['Sociology & Anthropology', applied[7], applied[7].network_address + 1,
                 applied[7].broadcast_address - 1]],
               headers=['Name', 'Network Address and Subnet', 'Host IP', 'Addresss Range']) + '\n')

ipInterface = ipaddress.ip_interface(college[7])
ipNetwork = ipInterface.network
applied = list(ipaddress.ip_network(ipNetwork).subnets(prefixlen_diff=3))
print('Department of Information Technology')
print(tabulate([['Computing Support', applied[0], applied[0].network_address + 1, applied[0].broadcast_address - 1],
                ['Telecommunications ', applied[1], applied[1].network_address + 1, applied[1].broadcast_address - 1],
                ['Administrative Computing', applied[2], applied[2].network_address + 1, applied[2].broadcast_address - 1],
                ['Networking ', applied[3], applied[3].network_address + 1, applied[3].broadcast_address - 1],
                ['Academic Computing', applied[4], applied[4].network_address + 1, applied[4].broadcast_address - 1],
                ['Computer Security', applied[5], applied[5].network_address + 1, applied[5].broadcast_address - 1],
                ['Database Administration', applied[6], applied[6].network_address + 1,
                 applied[6].broadcast_address - 1],
                ['VP of IT Office ', applied[7], applied[7].network_address + 1,
                 applied[7].broadcast_address - 1]],
               headers=['Name', 'Network Address and Subnet', 'Host IP', 'Addresss Range']) + '\n')

ipInterface = ipaddress.ip_interface(college[8])
ipNetwork = ipInterface.network
applied = list(ipaddress.ip_network(ipNetwork).subnets(prefixlen_diff=3))
print('Department of Student Affairs')
print(tabulate([['Student Life', applied[0], applied[0].network_address + 1, applied[0].broadcast_address - 1],
                ['Student Services ', applied[1], applied[1].network_address + 1, applied[1].broadcast_address - 1],
                ['Outreach', applied[2], applied[2].network_address + 1, applied[2].broadcast_address - 1],
                ['Academic Support', applied[3], applied[3].network_address + 1, applied[3].broadcast_address - 1],
                ['Focused Interest', applied[4], applied[4].network_address + 1, applied[4].broadcast_address - 1],
                ['Career Services ', applied[5], applied[5].network_address + 1, applied[5].broadcast_address - 1],
                ['Veterans Affairs', applied[6], applied[6].network_address + 1,
                 applied[6].broadcast_address - 1],
                ['Diversity', applied[7], applied[7].network_address + 1,
                 applied[7].broadcast_address - 1]],
               headers=['Name', 'Network Address and Subnet', 'Host IP', 'Addresss Range']) + '\n')

ipInterface = ipaddress.ip_interface(college[9])
ipNetwork = ipInterface.network
applied = list(ipaddress.ip_network(ipNetwork).subnets(prefixlen_diff=3))
print('Department of Facilities Management')
print(tabulate([['Campus Planning', applied[0], applied[0].network_address + 1, applied[0].broadcast_address - 1],
                ['Construction', applied[1], applied[1].network_address + 1, applied[1].broadcast_address - 1],
                ['Custodial', applied[2], applied[2].network_address + 1, applied[2].broadcast_address - 1],
                ['Landscaping', applied[3], applied[3].network_address + 1, applied[3].broadcast_address - 1],
                ['Electrical', applied[4], applied[4].network_address + 1, applied[4].broadcast_address - 1],
                ['Mechanical ', applied[5], applied[5].network_address + 1, applied[5].broadcast_address - 1],
                ['Business Services', applied[6], applied[6].network_address + 1,
                 applied[6].broadcast_address - 1],
                ['Parking Services', applied[7], applied[7].network_address + 1,
                 applied[7].broadcast_address - 1]],
               headers=['Name', 'Network Address and Subnet', 'Host IP', 'Addresss Range']) + '\n')

ipInterface = ipaddress.ip_interface(college[10])
ipNetwork = ipInterface.network
applied = list(ipaddress.ip_network(ipNetwork).subnets(prefixlen_diff=3))
print('Department of Administrative Services')
print(tabulate([['Athletics', applied[0], applied[0].network_address + 1, applied[0].broadcast_address - 1],
                ['Accounting', applied[1], applied[1].network_address + 1, applied[1].broadcast_address - 1],
                ['Budget  ', applied[2], applied[2].network_address + 1, applied[2].broadcast_address - 1],
                ['Enviro Health & Safety', applied[3], applied[3].network_address + 1, applied[3].broadcast_address - 1],
                ['Printing  ', applied[4], applied[4].network_address + 1, applied[4].broadcast_address - 1],
                ['Human Resources', applied[5], applied[5].network_address + 1, applied[5].broadcast_address - 1],
                ['Purchasing', applied[6], applied[6].network_address + 1,
                 applied[6].broadcast_address - 1],
                ['Police and Security', applied[7], applied[7].network_address + 1,
                 applied[7].broadcast_address - 1]],
               headers=['Name', 'Network Address and Subnet', 'Host IP', 'Addresss Range']) + '\n')