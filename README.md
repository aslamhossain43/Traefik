# Traefik-Consul-Microservices
0. Add some domains in your system:
1. traefik.www.mytraefik.com
2. consul.www.mytraefik.com
3. s1.www.mytraefik.com
4. s2.www.mytraefik.com
5. loadbalancing.www.mytraefik.com
6. In root directory(Traefik-Consul-Microservices) run 'mvn clean install -DskipTests'
7. In edge directory run 'sudo docker-compose up -d'
8. Finally check:
9. Traefik: http://traefik.www.mytraefik.com:8080/
10. Consul: http://consul.www.mytraefik.com/
11. Service-1: http://s1.www.mytraefik.com/
12. Service-2: http://s2.www.mytraefik.com/s2
13. Service-3,4 loadbalancing: http://loadbalancing.www.mytraefik.com/



