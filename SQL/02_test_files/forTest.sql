-- ******** DO ON CLASS COMPUTER ************
-- su -
-- yum -y install mysql-server
-- yum -y install mysql
-- service mysqld start
-- mkdir -p /home/stu***/mysql/test
-- cd /home/stu***/mysql/test
-- vim odb1.txt
CREATE TABLE IF NOT EXISTS `suser` (
`pkey` int unsigned NOT NULL AUTO_INCREMENT PRIMARY KEY,
`id` int unsigned NOT NULL,
`username` char(32) NOT NULL,
`password` char(32) NOT NULL,
`access_level` char(32) NOT NULL,
`access_cnt` int unsigned NOT NULL,
`access_denied_cnt` int unsigned NOT NULL,
`create_date` datetime,
`last_access_date` datetime,
`fkey_odemo` int unsigned NOT NULL,
`age` int unsigned NOT NULL);

CREATE TABLE `sdemo` (
`pkey` int unsigned NOT NULL AUTO_INCREMENT PRIMARY KEY,
`f_name` char(32) NOT NULL,
`m_name` char(32) NOT NULL,
`l_name` char(32) NOT NULL,
`street` char(32) NOT NULL,
`city` char(32) NOT NULL,
`state` char(32) NOT NULL,
`zip` char(32) NOT NULL,
`phone` char(32) NOT NULL);


INSERT INTO `suser` (`pkey`, `id`, `username`, `password`, `access_level`, `access_cnt`, `access_denied_cnt`, `create_date`, `last_access_date`, `fkey_odemo`,`age`) VALUES
(NULL,0,"root","pwroot55","kadjhfskhfj","new_account","root","0","0",NOW(),NOW(),"-1","0"),
(NULL,1,"bdoswald","pwroot55","aefushdfs","new_account","web_master","0","0",NOW(),NOW(),"1","99"),
(NULL,2,"bsroland","pwbetty55","iahsdfiuash","new_account","customer","0","0",NOW(),NOW(),"2","26"),
(NULL,1,"sjsmith","pwsmith55","asdfsadfsadf","new_account","web_master","0","0",NOW(),NOW(),"3","56");

INSERT INTO `sdemo` (`pkey`, `f_name`, `m_name`, `l_name`, `street`, `city`, `state`, `zip`, `phone`) VALUES
(NULL,"Bob","Dean","Oswald","3153 NW 15th","Ankeny","Iowa","50023","637-238-1279"),
(NULL,"Betty","Sue","Roland","8080 NW Intel","Porterville","California","93257","111-867-5309"),
(NULL,"Scott","James","Smith","Maple","Ankeny","Iowa","50023","515-289-8976");

-- mysql -t < odb1.txt
