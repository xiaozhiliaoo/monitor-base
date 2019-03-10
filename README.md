# monitor-base
springboot2,exporter,prometheus,grafana搭建监控体系

安装时候，直接下载(wget)官方tar/gz包，然后在本地解压，设置配置文件，直接启动程序，国内由于网络问题，
在build时候会网络超时。

#### step1 搭建springboot2程序 
   [application.yaml](src/main/resources/application.yaml)

#### step2 node_exporter安装

参考：https://github.com/prometheus/node_exporter
和 https://prometheus.io/docs/guides/node-exporter/

#### step3 mysql_exporter安装

参考：https://github.com/prometheus/mysqld_exporter

#### step4 prometheus安装和配置  
   [prometheus.yml](src/main/resources/prometheus.yml)

#### step5 grafana安装

参考：http://docs.grafana.org/installation/

#### step6 自定义panel:jvm,mysql,cpu相关指数

以上关系是：springboot2，exporter采集数据，prometheus拉取数据，在grafana中配置prometheus数据源或者自定义显示指标，然后展现监控指数。
这里仅仅做了一个简单的demo，每个组件详细使用需要自行看官网。
