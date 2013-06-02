#!/bin/sh
#
# Note: This script have passed test on RedHat Enterprise 5.1
#
# Usage: 
#	archive directory  -- if directory no provide, this script 
#	                      will process the current dir.		
#

dir=${1%/} 
dir=${dir:-.}
benchMark=$(date -d '30 days ago' +%s)
curDate=`date +%Y%m%d`

#log all the files deleted 
log_file=/tmp/archive_$curDate.log
touch $log_file

for fname in `ls $1 | grep -e '200\w-\w\{3\}-\w\{2\}--\w\{4\}\.zip'` 
do
    flag=-1
    fYear=`echo $fname | cut -c 0-4`
    fMonth=`echo $fname | cut -c 6-8`
    fDay=`echo $fname | cut -c 10-11`
    
    fDate=`date -d "$fMonth $fDay $fYear" +%s`

    let flag=$benchMark-$fDate
    if [ $flag -gt 0 ] ; then
	echo "file $dir/$fname been removed on $curDate" >> $log_file 
        rm -f $dir/$fname
    fi
done
