# Traefik-Consul-Microservices
0. Add some domains in your system:
1. www.mytraefik.com
2. s1.www.mytraefik.com
3. loadbalancing.www.mytraefik.com
4. In root directory(Traefik) run 'mvn clean install -DskipTests'
5. In edge directory run 'sudo docker-compose up -d'
6. Finally check:
7. http://s1.www.mytraefik.com/
8. http://www.mytraefik.com/s2
9. http://loadbalancing.www.mytraefik.com/



