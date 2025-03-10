### 介绍
java毕业设计，微信小程序外卖系统
### 3000多套系统，需要联系
抠：3565014707 微：a13424421017

#### 软件架构
#### 整体架构模式
这是一个典型的 前后端分离的三端架构，包含：

管理后台（client_admin）：基于 Vue.js 的 SPA 应用，提供后台管理功能。

用户端（client_home）：基于 uni-app 的多端应用（支持小程序、H5 等），面向终端用户。

后端服务（server）：基于 Spring Boot + MyBatis 的 Java 服务，提供 RESTful API。
#### 分层架构设计
后端分层（server目录）：

Controller层：controller 包处理 HTTP 请求（如 AboutUsController）。

Service层：service 包实现业务逻辑（如 AboutUsService）。

DAO层：dao 包（AccessTokenMapper）与 resources/mapper 下的 XML 文件结合，通过 MyBatis 操作数据库。

实体层：entity 包（如 AboutUs）映射数据库表结构。

前端分层（client_admin和client_home）：

视图层：views 目录定义页面组件（如商品详情页 goods/details.vue）。

组件层：components 封装可复用的 UI 组件（如 bar_chart.vue 图表组件）。

状态管理：store 使用 Vuex（管理后台）或类似状态库（uni-app）管理全局数据。
#### 多端适配与权限控制
多端兼容性：
client_home 使用 uni-app 组件库（如 uni-goods-nav、uni-calendar），支持跨平台运行（微信小程序、H5 等）。

权限管理：
后端通过 LoginInterceptor 拦截器实现接口权限控制。
前端管理后台通过路由（router/index.js）限制页面访问权限。
#### 核心功能模块解析
##### 管理后台（client_admin）功能
内容管理：
article（文章管理）、notice（公告管理）、slides（轮播图管理）。

用户与权限：
user_group（用户分组）、staff（员工管理）、registered_users（注册用户管理）。

订单与商品：
order（订单管理）、goods（商品管理）、flavor_management（商品口味管理）。

数据统计：
total_sales_by_category（分类销售额统计）、classified_sales（分类销售分析）。
##### 用户端（client_home）功能
商品展示与交易：
goods/details.vue（商品详情页）、cart/index.vue（购物车）、pay/index.vue（支付页面）。

订单服务：
order/details.vue（订单详情）、order_refund/list.vue（退款管理）。

用户交互：
user/address.vue（用户地址管理）、comment/edit.vue（评价功能）。

多端适配：
使用 uni-app 组件（如 uni-search-bar 搜索栏）实现跨平台一致体验。
##### 后端服务（server）功能
基础服务：
提供 AboutUsController（关于我们）、AccessTokenMapper（令牌管理）等基础 API。

业务支撑：
订单处理（order相关模块）、商品库存管理（goods相关模块）。

文件与媒体：
static 目录存储图片（如 aplipay.png）和上传文件（1572763932278390784.jpg）。
