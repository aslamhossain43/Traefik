# Traefik-Consul-Microservices
0. Add some domains in your system:
1. www.mytraefik.com
2. consul.www.mytraefik.com
3. s1.www.mytraefik.com
4. loadbalancing.www.mytraefik.com
5. In root directory(Traefik-Consul-Microservices) run 'mvn clean install -DskipTests'
6. In edge directory run 'sudo docker-compose up -d'
7. Finally check:
8. Traefik: www.mytraefik.com/
9. Consul: http://consul.www.mytraefik.com/
10. Service-1: http://s1.www.mytraefik.com/
11. Service-2: http://www.mytraefik.com/s2
12. Service-3,4 loadbalancing: http://loadbalancing.www.mytraefik.com/



