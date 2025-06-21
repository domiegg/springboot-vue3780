import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import zuoyechengji from '@/views/modules/zuoyechengji/list'
    import discusskechengziliao from '@/views/modules/discusskechengziliao/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import shiyanshi from '@/views/modules/shiyanshi/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import zuoyetijiao from '@/views/modules/zuoyetijiao/list'
    import shiyanshiguanliyuan from '@/views/modules/shiyanshiguanliyuan/list'
    import discussxuexishipin from '@/views/modules/discussxuexishipin/list'
    import kechengleixing from '@/views/modules/kechengleixing/list'
    import zuoyexinxi from '@/views/modules/zuoyexinxi/list'
    import friendlink from '@/views/modules/friendlink/list'
    import yuyueshenqing from '@/views/modules/yuyueshenqing/list'
    import forum from '@/views/modules/forum/list'
    import kechengziliao from '@/views/modules/kechengziliao/list'
    import systemintro from '@/views/modules/systemintro/list'
    import shiyanshileixing from '@/views/modules/shiyanshileixing/list'
    import shiyongjilu from '@/views/modules/shiyongjilu/list'
    import xuexishipin from '@/views/modules/xuexishipin/list'
    import config from '@/views/modules/config/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/zuoyechengji',
        name: '作业成绩',
        component: zuoyechengji
      }
      ,{
	path: '/discusskechengziliao',
        name: '课程资料评论',
        component: discusskechengziliao
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/shiyanshi',
        name: '实验室',
        component: shiyanshi
      }
      ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
      ,{
	path: '/zuoyetijiao',
        name: '作业提交',
        component: zuoyetijiao
      }
      ,{
	path: '/shiyanshiguanliyuan',
        name: '实验室管理员',
        component: shiyanshiguanliyuan
      }
      ,{
	path: '/discussxuexishipin',
        name: '学习视频评论',
        component: discussxuexishipin
      }
      ,{
	path: '/kechengleixing',
        name: '课程类型',
        component: kechengleixing
      }
      ,{
	path: '/zuoyexinxi',
        name: '作业信息',
        component: zuoyexinxi
      }
      ,{
	path: '/friendlink',
        name: '友情链接',
        component: friendlink
      }
      ,{
	path: '/yuyueshenqing',
        name: '预约申请',
        component: yuyueshenqing
      }
      ,{
	path: '/forum',
        name: '论坛交流',
        component: forum
      }
      ,{
	path: '/kechengziliao',
        name: '课程资料',
        component: kechengziliao
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/shiyanshileixing',
        name: '实验室类型',
        component: shiyanshileixing
      }
      ,{
	path: '/shiyongjilu',
        name: '使用记录',
        component: shiyongjilu
      }
      ,{
	path: '/xuexishipin',
        name: '学习视频',
        component: xuexishipin
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/newstype',
        name: '公告信息分类',
        component: newstype
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
