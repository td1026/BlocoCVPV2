sudo apt-get install -y nginx
sudo cp /vagrant/provision/templates/temp_nginx.conf.j2 /etc/nginx/sites-enabled/default
sudo ufw allow 'Nginx HTTP'
sudo ufw enable
sudo systemctl restart nginx