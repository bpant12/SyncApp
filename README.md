# SyncApp

Configure SyncApp Server Setup

1.docker run -d -p 27017:27017 -P --name my-mongo mongo:3.2.20

2.docker ps
          This command will give you mongo docker container id< id1>

3.docker inspect  < id1>
    Here you will get <IPAddress> of mongo container

4.docker run -d -e TZ=Asia/Calcutta -e mongodburl= <IPAddress> -p 8089:8080 -P --name syncapp_container-new  teachingpark/s-app1:1.0-beta


5. Then Go to URL to see the dashboard:
http://your ip or localhost:8089/app/#/main


Configure SyncApp Client Setup:

1. Get latest code from https://github.com/bpant12/SyncApp/
2. Change Server URL as per enviornment in ../main/resources/config/config.json
   for example if you have multiple SyncApp server running , one for localhost another for qe etc. then change the SyncApp URL as per URL in step 3 above.By default localhost URL will be set.

   
