#!/bin/bash
# omenu1.sh

function do_pause
{
echo "press enter to continue"
read select
}
function do_network_menu
{
clear
echo "what to do? (network_menu)"
echo "(e edit configuration"
echo "(r reset"
echo "(c ...."
echo "(q quit"

read select
case "$select" in
e)
 vim /etc/sysconfig/network-scripts/ifcfg-eth0
 vim /etc/sysconfig/network
 vim ?etc/resolv.conf
;;
r)
# service network restart
service network status
do_pause
;;
c)
echo "doing c"
do_pause
;;
q)
clear
return
;;
*)
echo
