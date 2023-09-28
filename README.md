icacls.exe your_key_name.pem /reset

icacls.exe your_key_name.pem /grant:r "$($env:username):(r)"

icacls.exe your_key_name.pem /grant:r "username:r"

icacls.exe your_key_name.pem /inheritance:r

scp -i venu.pem /path/of/your/file ec2-user@ip:/home/ec2-user
