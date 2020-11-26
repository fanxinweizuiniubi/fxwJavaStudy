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



