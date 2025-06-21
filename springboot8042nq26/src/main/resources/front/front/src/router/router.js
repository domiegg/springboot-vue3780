import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import shiyanshiguanliyuanList from '../pages/shiyanshiguanliyuan/list'
import shiyanshiguanliyuanDetail from '../pages/shiyanshiguanliyuan/detail'
import shiyanshiguanliyuanAdd from '../pages/shiyanshiguanliyuan/add'
import xueshengList from '../pages/xuesheng/list'
import xueshengDetail from '../pages/xuesheng/detail'
import xueshengAdd from '../pages/xuesheng/add'
import jiaoshiList from '../pages/jiaoshi/list'
import jiaoshiDetail from '../pages/jiaoshi/detail'
import jiaoshiAdd from '../pages/jiaoshi/add'
import kechengleixingList from '../pages/kechengleixing/list'
import kechengleixingDetail from '../pages/kechengleixing/detail'
import kechengleixingAdd from '../pages/kechengleixing/add'
import kechengziliaoList from '../pages/kechengziliao/list'
import kechengziliaoDetail from '../pages/kechengziliao/detail'
import kechengziliaoAdd from '../pages/kechengziliao/add'
import xuexishipinList from '../pages/xuexishipin/list'
import xuexishipinDetail from '../pages/xuexishipin/detail'
import xuexishipinAdd from '../pages/xuexishipin/add'
import shiyanshileixingList from '../pages/shiyanshileixing/list'
import shiyanshileixingDetail from '../pages/shiyanshileixing/detail'
import shiyanshileixingAdd from '../pages/shiyanshileixing/add'
import shiyanshiList from '../pages/shiyanshi/list'
import shiyanshiDetail from '../pages/shiyanshi/detail'
import shiyanshiAdd from '../pages/shiyanshi/add'
import yuyueshenqingList from '../pages/yuyueshenqing/list'
import yuyueshenqingDetail from '../pages/yuyueshenqing/detail'
import yuyueshenqingAdd from '../pages/yuyueshenqing/add'
import quxiaoyuyueList from '../pages/quxiaoyuyue/list'
import quxiaoyuyueDetail from '../pages/quxiaoyuyue/detail'
import quxiaoyuyueAdd from '../pages/quxiaoyuyue/add'
import shiyongjiluList from '../pages/shiyongjilu/list'
import shiyongjiluDetail from '../pages/shiyongjilu/detail'
import shiyongjiluAdd from '../pages/shiyongjilu/add'
import zuoyexinxiList from '../pages/zuoyexinxi/list'
import zuoyexinxiDetail from '../pages/zuoyexinxi/detail'
import zuoyexinxiAdd from '../pages/zuoyexinxi/add'
import zuoyetijiaoList from '../pages/zuoyetijiao/list'
import zuoyetijiaoDetail from '../pages/zuoyetijiao/detail'
import zuoyetijiaoAdd from '../pages/zuoyetijiao/add'
import zuoyechengjiList from '../pages/zuoyechengji/list'
import zuoyechengjiDetail from '../pages/zuoyechengji/detail'
import zuoyechengjiAdd from '../pages/zuoyechengji/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'
import friendlinkList from '../pages/friendlink/list'
import friendlinkDetail from '../pages/friendlink/detail'
import friendlinkAdd from '../pages/friendlink/add'
import discusskechengziliaoList from '../pages/discusskechengziliao/list'
import discusskechengziliaoDetail from '../pages/discusskechengziliao/detail'
import discusskechengziliaoAdd from '../pages/discusskechengziliao/add'
import discussxuexishipinList from '../pages/discussxuexishipin/list'
import discussxuexishipinDetail from '../pages/discussxuexishipin/detail'
import discussxuexishipinAdd from '../pages/discussxuexishipin/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'shiyanshiguanliyuan',
					component: shiyanshiguanliyuanList
				},
				{
					path: 'shiyanshiguanliyuanDetail',
					component: shiyanshiguanliyuanDetail
				},
				{
					path: 'shiyanshiguanliyuanAdd',
					component: shiyanshiguanliyuanAdd
				},
				{
					path: 'xuesheng',
					component: xueshengList
				},
				{
					path: 'xueshengDetail',
					component: xueshengDetail
				},
				{
					path: 'xueshengAdd',
					component: xueshengAdd
				},
				{
					path: 'jiaoshi',
					component: jiaoshiList
				},
				{
					path: 'jiaoshiDetail',
					component: jiaoshiDetail
				},
				{
					path: 'jiaoshiAdd',
					component: jiaoshiAdd
				},
				{
					path: 'kechengleixing',
					component: kechengleixingList
				},
				{
					path: 'kechengleixingDetail',
					component: kechengleixingDetail
				},
				{
					path: 'kechengleixingAdd',
					component: kechengleixingAdd
				},
				{
					path: 'kechengziliao',
					component: kechengziliaoList
				},
				{
					path: 'kechengziliaoDetail',
					component: kechengziliaoDetail
				},
				{
					path: 'kechengziliaoAdd',
					component: kechengziliaoAdd
				},
				{
					path: 'xuexishipin',
					component: xuexishipinList
				},
				{
					path: 'xuexishipinDetail',
					component: xuexishipinDetail
				},
				{
					path: 'xuexishipinAdd',
					component: xuexishipinAdd
				},
				{
					path: 'shiyanshileixing',
					component: shiyanshileixingList
				},
				{
					path: 'shiyanshileixingDetail',
					component: shiyanshileixingDetail
				},
				{
					path: 'shiyanshileixingAdd',
					component: shiyanshileixingAdd
				},
				{
					path: 'shiyanshi',
					component: shiyanshiList
				},
				{
					path: 'shiyanshiDetail',
					component: shiyanshiDetail
				},
				{
					path: 'shiyanshiAdd',
					component: shiyanshiAdd
				},
				{
					path: 'yuyueshenqing',
					component: yuyueshenqingList
				},
				{
					path: 'yuyueshenqingDetail',
					component: yuyueshenqingDetail
				},
				{
					path: 'yuyueshenqingAdd',
					component: yuyueshenqingAdd
				},
				{
					path: 'quxiaoyuyue',
					component: quxiaoyuyueList
				},
				{
					path: 'quxiaoyuyueDetail',
					component: quxiaoyuyueDetail
				},
				{
					path: 'quxiaoyuyueAdd',
					component: quxiaoyuyueAdd
				},
				{
					path: 'shiyongjilu',
					component: shiyongjiluList
				},
				{
					path: 'shiyongjiluDetail',
					component: shiyongjiluDetail
				},
				{
					path: 'shiyongjiluAdd',
					component: shiyongjiluAdd
				},
				{
					path: 'zuoyexinxi',
					component: zuoyexinxiList
				},
				{
					path: 'zuoyexinxiDetail',
					component: zuoyexinxiDetail
				},
				{
					path: 'zuoyexinxiAdd',
					component: zuoyexinxiAdd
				},
				{
					path: 'zuoyetijiao',
					component: zuoyetijiaoList
				},
				{
					path: 'zuoyetijiaoDetail',
					component: zuoyetijiaoDetail
				},
				{
					path: 'zuoyetijiaoAdd',
					component: zuoyetijiaoAdd
				},
				{
					path: 'zuoyechengji',
					component: zuoyechengjiList
				},
				{
					path: 'zuoyechengjiDetail',
					component: zuoyechengjiDetail
				},
				{
					path: 'zuoyechengjiAdd',
					component: zuoyechengjiAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
				{
					path: 'friendlink',
					component: friendlinkList
				},
				{
					path: 'friendlinkDetail',
					component: friendlinkDetail
				},
				{
					path: 'friendlinkAdd',
					component: friendlinkAdd
				},
				{
					path: 'discusskechengziliao',
					component: discusskechengziliaoList
				},
				{
					path: 'discusskechengziliaoDetail',
					component: discusskechengziliaoDetail
				},
				{
					path: 'discusskechengziliaoAdd',
					component: discusskechengziliaoAdd
				},
				{
					path: 'discussxuexishipin',
					component: discussxuexishipinList
				},
				{
					path: 'discussxuexishipinDetail',
					component: discussxuexishipinDetail
				},
				{
					path: 'discussxuexishipinAdd',
					component: discussxuexishipinAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
