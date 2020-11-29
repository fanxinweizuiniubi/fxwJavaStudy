## Redis学习

### 概述

redis全称：remote dictionary server

特点和用途：内存存储、持久化（rdb、aof）；效率高，可用于高速缓存；发布订阅系统；地图信息分析；计时器、计数器（浏览量）；支持多样数据类型；集群；事务...

### redis-key

~~~bash
set name fxw 
get name
exists name # 判断当前key是否存在 
expire name 10 # 设置为10s后过期
ttl name # 可以查看当前key还剩多久过期
type name # 查看当前key的类型
append key "hello" # 在当前key对应的value后面拼接字符串
flushdb # 清空当前库中的数据
getrange key 0 3 # 获取下标为0到3的字符串，闭区间[0,3]
setrange key 1 xx # 从指定位置下标开始替换字符串
setex k v # 存在才设置
setnx k v # 不存在才设置
mset k1 v1 k2 v2 k3 v3 # 设置多个值
mget k1 k2 k3 # 获得多个值	
msetnx # 是原子性操作，一个失败那么这一组都会失败
getset k v # 先返回当前k对应的v，再将当前k的v设置为新传入的值
~~~

~~~bash
set views 0
incr views # 当前值+1
incrby views 10 # 当前值+10
~~~

```bash
set name:id001:name zhangsan
set name:id001:age 18 # 巧妙设计key
```

### list

操作list的命令都是以"l"开头

~~~bash
lpush list one # 向list中添加，放到头部
lpop list # 将头部的第一个值移除
lrange list 0 -1 # 获取list中全部的值
rpush list right # 向list中添加，放到尾部
rpop list # 将尾部的第一个值移除
lindex list 1 # 获取下标为1的值
llen list # 获取list长度
lrem list 2 three # 移除2个three
ltrim list 1 2 # 只保留下标1到2之间的值
rpoplpush source target # 将source中的尾部放到target中的头部
lset list 0 item # 将list中的第0个元素设置为item
exist list # 判断list列表是否存在
linsert list before|after pivotStr value # 在指定元素前或后插入值
~~~

### set

~~~bash
sadd myset "hello" # 向set中添加元素
smembers myset # 查看当前set中的所有元素
sismember myset hello # 查看当前元素是否存在
scard myset # 查看当前set中有多少个元素
srem myset hello # 删除指定值
srandmember myset # 从set中随机选一个
spop myset # 从set中随机删除一个
smove myset1 myset2 hello # 将一个指定的值移动到另一个集合中
sdiff set1 set2 # 获取set1中存在set2中不存在的值
sinter set1 set2 # 获取set1和set2的交集
sunion set1 set2 # 获取set1和set2的并集
~~~

应用：获得两个用户的共同好友，可以使用交集。这两个的用户的好友分别被放在两个set中。

### hash

结构 key-Map<field,value>

~~~bash
hset myhash field01 value01 # 向hash中添加元素
hget myhash field01 # 获取myhash中的field01对应的字段
hmset myhash f1 v1 f2 v2 f3 v3 # set多个值
hmget myhash f1 f2 f3
hgetall myhash # 获取所有键值对
hdel myhash f1 # 删除hash中对应field的value
hlen myhash # 查看当前hash中的key的数量
hexists myhash f1 # 判断f1是否存在
hkeys myhash # 获取myhash中所有的key
hvals myhash # 获取myhash中所有的values
hincrby	myhash f3 1 # myhash中的f3增加1
~~~

应用：可以将一个对象的放到hash中，相当于java中的map。存储常常变的对象

### zset 有序集合

~~~bash
zadd myset 1 one 
zadd myset 2 two # 根据第三个字段排序
zrange myset 0 -1 # 查看所有元素
zrangebyscore myset -inf +inf # 将正无穷到负无穷中所有的数都从小到大排出来
zrangebyscore myset -inf +inf withscores # 将用来排序的字段也展示出来 
zrevrangebyscore # 从大到小排序
zrem myset one # 移除元素
zcard myset # 获取set集合的元素个数
~~~

### geospatial

~~~bash
geoadd china:city 116.23 40.22 beijing
geoadd china:city 121.48 31.40 shanghai # 添加
geopos china:city beijing # 获取指定地点的经纬度
geodist china:city beijing shanghai m # 获取指定地点之间的距离，并指定单位为米(m)
georadius key longitude latitude radius m|km|ft|mi # 附近的人
georadiusbymember key member radius m|km|ft|mi # 某一定点周围的人
~~~

可以用zset的命令来操作geospatial类型

### hyperloglog

占用内存小

~~~bash
pfadd mykey1 q w e r t y u 
pfadd mykey2 a s d f g h q w # 向mykey2中添加元素
pfcount mykey1 # 查看当前key中存在的个数
pfmerge mykey3 mykey1 mykey2 # 将mykey1和mykey2合并到mykey3中
~~~

### bitmaps

适合有两种状态的统计

~~~bash
setbit sign 0 1
setbit sign 1 0
setbit sign 2 1 # 记录周一到周三的打卡
bitcount sign # 统计其中为值1的数量
~~~





