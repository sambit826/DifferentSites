Set-ExecutionPolicy Bypass
%__APPDIR__%wbem\wmic.exe path win32_networkadapter where NetConnectionID="Wi-fI" call enable