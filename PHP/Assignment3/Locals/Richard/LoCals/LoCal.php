<?php
require_once("logger.php");
require_once("framework.php");
do_openlog();
do_set_eol(1);
do_write_header("LoCals");
$cmd1=htmlspecialchars($_POST["n_cmd1"]);
echo "debug cmd1 is ".$cmd1."<br>\n";
switch($cmd1)
{
case "req_home":
   do_write_page_title("Home");
   do_write_btn1("Products","req_products");
   do_write_break(2);
   do_write_btn1("Login","req_login"); //Needs to be split into users
break;
case "req_products":
   do_write_page_title("Products");
   do_write_btn1("Home","req_home");
   do_write_break(2);
   do_write_btn1("Login","req_login"); //Needs to be split into users
break;
case "req_login_customer":
   do_write_page_title("Customer Account");
   do_write_btn1("Home","req_home");
   do_write_break(2);
   do_write_btn1("Products","req_products");
break;
case "req_login_root":
   do_write_page_title("Root Account");
   do_write_btn1("Home","req_home");
   do_write_break(2);
   do_write_btn1("Products","req_products");
   do_write_break(2);
   do_write_btn1("Manage Web","req_manage_web");
   do_write_break(2);
   do_write_btn1("Create Web","req_create_web");
   do_write_break(2);
   do_write_btn1("Manage Data","req_manage_data");
   do_write_break(2);
   do_write_btn1("Create Data","req_create_data");
break;
    case "req_manage_web":
    do_write_page_title("Manage Web");
    do_write_btn1("Home","req_home");
    do_write_break(2);
    do_write_btn1("Products","req_products");
    do_write_break(2);
    do_write_btn1("Login","req_login_root");
    do_write_break(2);
    do_write_btn1("Manage User","req_manage_web_user");
    break;
      case "req_manage_web_user":
      do_write_page_title("Manage User");
      do_write_btn1("Home","req_home");
      do_write_break(2);
      do_write_btn1("Products","req_products");
      do_write_break(2);
      do_write_btn1("Manage Web","req_manage_web");
      break;
    case "req_create_web":
    do_write_page_title("Create Web");
    do_write_btn1("Home","req_home");
    do_write_break(2);
    do_write_btn1("Products","req_products");
    do_write_break(2);
    do_write_btn1("Login","req_login_root");
    break;
    case "req_manage_data":
    do_write_page_title("Manage Data");
    do_write_btn1("Home","req_home");
    do_write_break(2);
    do_write_btn1("Products","req_products");
    do_write_break(2);
    do_write_btn1("Login","req_login_root");
    do_write_break(2);
    do_write_btn1("Manage User","req_manage_data_user");
    break;
      case "req_manage_data_user":
      do_write_page_title("Manage User");
      do_write_btn1("Home","req_home");
      do_write_break(2);
      do_write_btn1("Products","req_products");
      do_write_break(2);
      do_write_btn1("Manage Data","req_manage_data");
      break;
    case "req_create_data":
    do_write_page_title("Create Data");
    do_write_btn1("Home","req_home");
    do_write_break(2);
    do_write_btn1("Products","req_products");
    do_write_break(2);
    do_write_btn1("Login","req_login_root");
    break;
case "req_login_WebMaster":
   do_write_page_title("WebMaster Account");
   do_write_btn1("Home","req_home");
   do_write_break(2);
   do_write_btn1("Products","req_products");
   do_write_break(2);
   do_write_btn1("Manage Customer","req_manage_customer");
   do_write_break(2);
   do_write_btn1("Create Customer","req_create_customer");
break;
  case "req_manage_customer":
     do_write_page_title("Manage Customer");
     do_write_btn1("Home","req_home");
     do_write_break(2);
     do_write_btn1("Products","req_products");
     do_write_break(2);
     do_write_btn1("Manage Users","req_manage_customer_users");
     do_write_break(2);
     do_write_btn1("WebMaster Account","req_login_WebMaster");
  break;
  case "req_create_customer":
     do_write_page_title("Create Customer");
     do_write_btn1("Home","req_home");
     do_write_break(2);
     do_write_btn1("Products","req_products");
     do_write_break(2);
     do_write_btn1("WebMaster Account","req_login_WebMaster");
  break;
case "req_login_DataMaster":
   do_write_page_title("DataMaster Account");
   do_write_btn1("Home","req_home");
   do_write_break(2);
   do_write_btn1("Products","req_products");
   do_write_break(2);
   do_write_btn1("Edit Products","req_edit_products");
break;
  case "req_edit_products":
     do_write_page_title("Edit Products");
     do_write_btn1("Home","req_home");
     do_write_break(2);
     do_write_btn1("Products","req_products");
     do_write_break(2);
     do_write_btn1("DataMaster Account","req_login_DataMaster");
  break;

do_write_footer();
do_closelog();
?>
