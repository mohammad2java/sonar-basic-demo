
#sonarqube setup( with jdk 11 only)
-----------------------
	step1: 
	if you use windows desktop
	----------------------------
	wsl  (this is not required for linx/mac desktop docker
	sysctl -w vm.max_map_count=524288
	sysctl -w fs.file-max=131072
	ulimit -n 131072
	ulimit -u 8192
	
    step:2
     run compose.yaml 
     goto that dir and run docker compose up
     
     step3: open http://localhost:9000
     default user & pass : admin
     if reset by me : then pass: adminpwd
     
     
     how to create sonar project (manual option)
     -----------------------------------------------
     projects>create projects>manually>enter projectname*key>select branch>click setup
     
     then next step to to configure this project for analysis.
     if you want to do it locally there is option called locally
     locally>generate-token/existing token>generate>continue>maven>copymaven command.
     
     like
     mvn clean verify sonar:sonar -Dsonar.projectKey=project2 -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqp_9b151bf840fb4d843ede2152d541b280777f64fb
    
    goto root directory of project and run above command.
    
    
    
    note:
     for code coverrage need to add jacoco-maven-plugin as plugin & dependency ..refer pom.xml
     quality_gates
     ----------------
     quality_gates is way to finalize the build so be pass /failed based on 
     different different parameters:
     1) code coverage
     2) issue count(blocker,critical)
     3) duplicate lines
     4) ..so many things
     
     
     using sonar web interface we can configure and make it default if want to apply it.
     
     
     
    
  
  
     
     
     
  

