<template>
<div class="home-preview" :style='{"width":"100%","margin":"0px auto","flexDirection":"column","display":"flex"}'>




		<!-- 系统简介 -->
		<div id="system" class="animate__animated" :style='{"padding":"60px calc((100% - 1200px)/2) 0","margin":"0","overflow":"hidden","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20231028/0866a9ae11ce4c3f873acbca399c64ea.png) no-repeat center top / cover","display":"flex","width":"100%","position":"relative","justifyContent":"flex-end","height":"auto","order":"3"}'>
		  <div :style='{"margin":"20px 0 50px","overflow":"hidden","color":"#fff","textAlign":"center","background":"url(http://codegen.caihongy.cn/20231031/c2cc05588a7e4ac4af616b5d87558470.png) no-repeat center center","width":"100%","lineHeight":"1.5","fontSize":"32px","height":"50px","order":"2"}'>{{systemIntroductionDetail.title}}</div>
		  <div :style='{"width":"100%","margin":"0","lineHeight":"1","fontSize":"32px","color":"#a8adb4","textAlign":"center"}'>{{systemIntroductionDetail.subtitle}}</div>
		  <div :style='{"padding":"0","flexWrap":"wrap","left":"20%","bottom":"60px","display":"flex","width":"360px","position":"absolute","float":"left","height":"280px","zIndex":"1"}'>
		    <img :style='{"width":"100%","objectFit":"cover","display":"block","height":"100%"}' :src="baseUrl + systemIntroductionDetail.picture1">
		    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + systemIntroductionDetail.picture2">
		    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + systemIntroductionDetail.picture3">
		  </div>
		  <div :style='{"padding":"0 0 0 10%","margin":"30px 0 90px","overflow":"hidden","color":"#fff","background":"none","width":"calc(100% - 360px)","lineHeight":"24px","fontSize":"16px","textIndent":"2","float":"right","height":"196px","order":"3"}' v-html="systemIntroductionDetail.content"></div>
		  <div :style='{"left":"calc(20% - 50px)","background":"#262626","bottom":"60px","display":"block","width":"459px","position":"absolute","height":"247px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"border":"0","margin":"10px auto","textAlign":"center","background":"#409EFF","display":"none","width":"80px","lineHeight":"32px"}' @click="toDetail('systemintroDetail',systemIntroductionDetail)">
		    <span :style='{"color":"#f5f5f5","fontSize":"12px"}'>更多</span>
		    <span class="icon iconfont icon-gengduo1" :style='{"color":"#f5f5f5","fontSize":"12px"}'></span>
		  </div>
		</div>
		<!-- 系统简介 -->
		
	<!-- 新闻资讯 -->
	<div id="animate_newsnews" class="news animate__animated" :style='{"padding":"90px calc((100% - 1200px)/2) 90px","margin":"0px 0 0 0","background":"#F4F4F4"}'>
		<div v-if="true" class="idea newsIdea" :style='{"padding":"20px","flexWrap":"wrap","justifyContent":"center","display":"flex"}'>
			<div class="box1" :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"36px","color":"#9E9E9E","textAlign":"center","height":"auto"}'>Bullish Headlines</div>
			<div class="box2" :style='{"width":"50px","margin":"0 300px 0 0","background":"#B6B6B6","height":"2px"}'></div>
			<div class="box3" :style='{"width":"50px","background":"#B6B6B6","height":"2px"}'></div>
			<div class="box4" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		</div>
		
		<div class="title" :style='{"width":"300px","margin":"-50px auto 20px","lineHeight":"54px","textAlign":"center"}'>
			<span :style='{"color":"#505050","fontSize":"32px"}'>公告信息</span>
		</div>
		
			
			
			
			
			
			
			
			
			
			
		







		<div v-if="newsList.length" class="list list18 index-pv1" :style='{"width":"100%","padding":"0","justifyContent":"space-between","display":"flex","height":"auto"}'>
		  <div :style='{"width":"63%","overflow":"hidden","background":"#fff","justifyContent":"space-between","display":"flex","height":"480px"}' class="left">
		    <div :style='{"width":"50%","flexDirection":"column","background":"#f5f5f5","justifyContent":"space-between","display":"flex","height":"auto"}' class="list">
			  <template v-for="(item,index) in newsList">
		      <div v-if="index < 6" @click="toDetail('newsDetail', item)" @mouseenter="newsMouseove18(index)" class="item" :class="index == newsIndex18 ? 'active' : ''">
		        <div class="name">{{item.title}}</div>
		      </div>
			  </template>
		    </div>
		    <div :style='{"width":"50%","height":"480px"}' class="imgs">
			  <template v-for="(item,index) in newsList">
		      <img v-if="index < 6" v-show="index == newsIndex18" :style='{"width":"100%","objectFit":"cover","display":"block","height":"480px"}' :src="baseUrl + item.picture" alt="">
			  </template>
		    </div>
		  </div>
		  <div :style='{"width":"35%","overflow":"hidden","background":"#fff","height":"480px"}' class="right">
		    <div v-if="newsList.length > 6" :style='{"cursor":"pointer","width":"100%","position":"relative","height":"200px"}' class="top list-item animation-box" @click="toDetail('newsDetail', newsList[6])">
		      <img :style='{"width":"100%","objectFit":"cover","display":"block","height":"200px"}' :src="baseUrl + newsList[6].picture">
		      <div :style='{"width":"100%","position":"absolute","left":"0","bottom":"0","background":"rgba(0,0,0,.3)"}'>
		        <div :style='{"padding":"0 10px","lineHeight":"44px","fontSize":"18px","color":"#fff"}' class="title">{{newsList[6].title}}</div>
		      </div>
		    </div>
		    <div v-if="newsList.length > 7" :style='{"width":"100%","padding":"10px","background":"#fff","height":"auto"}' class="list">
			  <template v-for="(item,index) in newsList">
		      <div v-if="index > 6" :style='{"cursor":"pointer","borderColor":"#f5f5f5","alignItems":"center","borderWidth":"0 0 1px","display":"flex","width":"100%","borderStyle":"solid","height":"45px"}' class="item" @click="toDetail('newsDetail', item)">
		        <div class="dian"></div>
		        <div class="title" >{{item.title}}</div>
		        <div :style='{"padding":"0 6px"}' class="time">
		          <span class="icon iconfont icon-shijian21"></span>
		          <span class="text">{{item.addtime}}</span>
		        </div>
		      </div>
			  </template>
		    </div>
		  </div>
		</div>




		<div @click="moreBtn('news')" :style='{"border":"0","width":"80px","margin":"20px auto","lineHeight":"32px","textAlign":"center","display":"none"}'>
			<span :style='{"color":"#9E9E9E","fontSize":"14px"}'>更多</span>
			<i :style='{"color":"#9E9E9E","fontSize":"14px"}' class="icon iconfont icon-gengduo1"></i>
		</div>
		
		</div>
	<!-- 新闻资讯 -->


<!-- 商品推荐 -->
<div id="animate_recommendkechengziliao" class="recommend animate__animated" :style='{"padding":"50px 0","margin":"0","background":"#fff","order":"2"}'>
	<!-- <div v-if="true" class="idea recommendIdea" :style='{"padding":"0px","flexWrap":"wrap","justifyContent":"center","display":"flex"}'>
		<div class="box1" :style='{"width":"100%","margin":"0 0 40px","fontSize":"36px","color":"#9E9E9E","textAlign":"center"}'>Hot Commodity</div>
		<div class="box2" :style='{"width":"50px","margin":"0 350px 0","background":"#B6B6B6","height":"2px"}'></div>
		<div class="box3" :style='{"width":"50px","background":"#B6B6B6","height":"2px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"60px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"width":"300px","margin":"-90px auto 20px","lineHeight":"54px","textAlign":"center"}'>
		<span :style='{"color":"#505050","fontSize":"32px"}'>课程资料推荐</span>
	</div> -->
	
	
	
	
	
	
	
	
	
	



	<!-- <div v-if="kechengziliaoRecommend.length" class="list list12 index-pv1 list12kechengziliao" :style='{"width":"100%","padding":"10px calc((100% - 1200px)/2)","background":"#fff","height":"auto"}'>
	  <div class="tab" :style='{"width":"100%","margin":"0 0 20px","justifyContent":"center","display":"flex","height":"auto"}'>
	    <template v-for="item,index in recommendList12kechengziliao">
		<div v-if="index < 4" @click="recommendIndexClick12(index + 1, 'kechengziliao')" class="item" :class="index + 1 == recommendIndex12kechengziliao ? 'active' : ''">
			<img v-if="item.image" :style='{"width":"40px","margin":"0 5px 0 0","objectFit":"cover","display":"inline-block","height":"40px"}' :src="baseUrl + (item.image?item.image.split(',')[0]:'')">
			<div :style='{"color":"inherit","fontSize":"14px","display":"inline-block"}'>{{item[recommendColumn12kechengziliao]}}</div>
		</div>
		</template>
		<div class="more" @click="moreBtn('kechengziliao')">
		  <div :style='{"color":"inherit","fontSize":"14px"}'>更多</div>
		  <span class="icon iconfont icon-jiantou25" :style='{"color":"inherit","margin":"0 0 0 2px","fontSize":"14px"}'></span>
		</div>
	  </div>
	  <div class="list" :style='{"overflow":"hidden","flexWrap":"wrap","flex":"1","background":"#fff","display":"flex","height":"auto"}'>
	    <div :style='{"cursor":"pointer","width":"30%","margin":"10px","position":"relative","height":"auto"}' class="item list-item animation-box" v-for="item,index in kechengziliaoRecommend" :key="index" @click="toDetail('kechengziliaoDetail', item)">
			<img :name="item.id" :style='{"width":"100%","objectFit":"cover","display":"block","height":"240px"}' v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
			<img :name="item.id" :style='{"width":"100%","objectFit":"cover","display":"block","height":"240px"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
			<div class="line1" :style='{"padding":"0 10px","lineHeight":"30px","fontSize":"15px","color":"#505050"}'>{{item.kechengmingcheng}}</div>
			<div class="line1" :style='{"padding":"0 10px","lineHeight":"30px","fontSize":"15px","color":"#505050"}'>{{item.kechengleixing}}</div>
	    </div>
	  </div>
	</div> -->




	
	<div @click="moreBtn('kechengziliao')" :style='{"border":"0","width":"80px","margin":"0px auto 20px","lineHeight":"32px","textAlign":"center","display":"none"}'>
		<span :style='{"color":"#9E9E9E","fontSize":"14px"}'>更多</span>
		<i :style='{"color":"#9E9E9E","fontSize":"14px"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	
</div>
<!-- 商品推荐 -->

<!-- 商品推荐 -->
<div id="animate_recommendxuexishipin" class="recommend animate__animated" :style='{"padding":"50px 0","margin":"0","background":"#fff","order":"2"}'>
	<!-- <div v-if="true" class="idea recommendIdea" :style='{"padding":"0px","flexWrap":"wrap","justifyContent":"center","display":"flex"}'>
		<div class="box1" :style='{"width":"100%","margin":"0 0 40px","fontSize":"36px","color":"#9E9E9E","textAlign":"center"}'>Hot Commodity</div>
		<div class="box2" :style='{"width":"50px","margin":"0 350px 0","background":"#B6B6B6","height":"2px"}'></div>
		<div class="box3" :style='{"width":"50px","background":"#B6B6B6","height":"2px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"60px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"width":"300px","margin":"-90px auto 20px","lineHeight":"54px","textAlign":"center"}'>
		<span :style='{"color":"#505050","fontSize":"32px"}'>学习视频推荐</span>
	</div> -->
	
	
	
	
	
	
	
	
	
	



	<!-- <div v-if="xuexishipinRecommend.length" class="list list12 index-pv1 list12xuexishipin" :style='{"width":"100%","padding":"10px calc((100% - 1200px)/2)","background":"#fff","height":"auto"}'>
	  <div class="tab" :style='{"width":"100%","margin":"0 0 20px","justifyContent":"center","display":"flex","height":"auto"}'>
	    <template v-for="item,index in recommendList12xuexishipin">
		<div v-if="index < 4" @click="recommendIndexClick12(index + 1, 'xuexishipin')" class="item" :class="index + 1 == recommendIndex12xuexishipin ? 'active' : ''">
			<img v-if="item.image" :style='{"width":"40px","margin":"0 5px 0 0","objectFit":"cover","display":"inline-block","height":"40px"}' :src="baseUrl + (item.image?item.image.split(',')[0]:'')">
			<div :style='{"color":"inherit","fontSize":"14px","display":"inline-block"}'>{{item[recommendColumn12xuexishipin]}}</div>
		</div>
		</template>
		<div class="more" @click="moreBtn('xuexishipin')">
		  <div :style='{"color":"inherit","fontSize":"14px"}'>更多</div>
		  <span class="icon iconfont icon-jiantou25" :style='{"color":"inherit","margin":"0 0 0 2px","fontSize":"14px"}'></span>
		</div>
	  </div>
	  <div class="list" :style='{"overflow":"hidden","flexWrap":"wrap","flex":"1","background":"#fff","display":"flex","height":"auto"}'>
	    <div :style='{"cursor":"pointer","width":"30%","margin":"10px","position":"relative","height":"auto"}' class="item list-item animation-box" v-for="item,index in xuexishipinRecommend" :key="index" @click="toDetail('xuexishipinDetail', item)">
			<img :name="item.id" :style='{"width":"100%","objectFit":"cover","display":"block","height":"240px"}' v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
			<img :name="item.id" :style='{"width":"100%","objectFit":"cover","display":"block","height":"240px"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
			<div class="line1" :style='{"padding":"0 10px","lineHeight":"30px","fontSize":"15px","color":"#505050"}'>{{item.kechengmingcheng}}</div>
			<div class="line1" :style='{"padding":"0 10px","lineHeight":"30px","fontSize":"15px","color":"#505050"}'>{{item.kechengleixing}}</div>
	    </div>
	  </div>
	</div> -->




	
	<div @click="moreBtn('xuexishipin')" :style='{"border":"0","width":"80px","margin":"0px auto 20px","lineHeight":"32px","textAlign":"center","display":"none"}'>
		<span :style='{"color":"#9E9E9E","fontSize":"14px"}'>更多</span>
		<i :style='{"color":"#9E9E9E","fontSize":"14px"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	
</div>
<!-- 商品推荐 -->

	
	<!-- 友链 -->
	<div id="friendly" class="friendly animate__animated" :style='{"minHeight":"420px","width":"100%","padding":"50px calc((100% - 1200px)/2)","margin":"0","background":"#fff","order":"5"}'>
	  <div :style='{"borderColor":"#aaa","margin":"10px auto","textAlign":"center","borderWidth":"0","background":"url(http://codegen.caihongy.cn/20231030/b0a104e921154259aeab455b61eabd27.png) no-repeat center top","width":"356px","borderStyle":"solid","height":"104px"}'>
	    <div :style='{"padding":"0 10px","borderColor":"rgba(64, 158, 255)","margin":"60px 0 0","color":"#505050","borderWidth":"0","display":"inline-block","lineHeight":"32px","fontSize":"32px","borderStyle":"solid"}'>合作伙伴</div>
	  </div>
	  <div :style='{"width":"100%","padding":"10px 0 0 0","flexWrap":"wrap","display":"flex","height":"auto"}'>
	    <div :style='{"margin":"0 2% 20px 0","alignItems":"center","flexDirection":"column","display":"flex","width":"23%","justifyContent":"center","height":"180px"}' v-for="item in friendLinkList" :key="item.id" @click="friendlinkClick(item.url)">
	      <img :style='{"border":"1px solid #e6e6e6","padding":"10px","margin":"0 auto","objectFit":"contain","borderRadius":"0px","display":"block","width":"100%","height":"160px"}' :src="item.picture?(baseUrl + item.picture.split(',')[0]): ''" alt="">
	      <div :style='{"lineHeight":"24px","fontSize":"14px","color":"#333","display":"none"}'>{{item.name}}</div>
	    </div>
	  </div>
	</div>
	<!-- 友链 -->
</div>
</template>

<script>
import 'animate.css'
import Swiper from "swiper";

  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        systemIntroductionDetail: {},
        newsList: [],
        kechengziliaoRecommend: [],
        xuexishipinRecommend: [],



		newsIndex18: 0,
		recommendIndex12kechengziliao: 0,
		recommendList12kechengziliao: [],
		recommendColumn12kechengziliao: '',
		recommendIndex12xuexishipin: 0,
		recommendList12xuexishipin: [],
		recommendColumn12xuexishipin: '',


		friendLinkList: [],
      }
    },
    created() {
		this.baseUrl = this.$config.baseUrl;
		this.getNewsList();
		this.getSystemIntroduction();
		this.getList();
		this.kechengziliaoRecommendCate()
		this.xuexishipinRecommendCate()
		this.getFriendLinkList()
    },
	mounted() {
		window.addEventListener('scroll', this.handleScroll)
		setTimeout(()=>{
			this.handleScroll()
		},100)
		
		this.swiperChanges()
	},
	beforeDestroy() {
	  window.removeEventListener('scroll', this.handleScroll)
	},
    //方法集合
    methods: {
		swiperChanges() {
			setTimeout(()=>{
			},750)
		},
		// 获取友链列表
		getFriendLinkList(){
			this.$http.get('friendlink/list', {params:{page: 1,limit: 100}}).then(res => {
			  if(res.data.code == 0) {
			    this.friendLinkList = res.data.data.list
			  }
			})
		},
		// 友链跳转
		friendlinkClick(url){
			if(url){
				window.open(url)
			}
		},
		newsMouseove18(index) {
			this.newsIndex18 = index
		},
		kechengziliaoRecommendCate(){
			this.$http.get('kechengleixing/list',{}).then(res => {
			  if (res.data.code == 0) {
				this.recommendList12kechengziliao = res.data.data.list
			  }
			});
			this.recommendColumn12kechengziliao = 'kechengleixing'
		},
		xuexishipinRecommendCate(){
			this.$http.get('kechengleixing/list',{}).then(res => {
			  if (res.data.code == 0) {
				this.recommendList12xuexishipin = res.data.data.list
			  }
			});
			this.recommendColumn12xuexishipin = 'kechengleixing'
		},
		recommendIndexClick12(index, name) {
			this['recommendIndex12' + name] = index
			this.getList()
			
			document.querySelectorAll('.recommend .list12' + name + ' .list .item').forEach(el => {
			  el.classList.remove("active")
			})
			setTimeout(() => {
			  document.querySelectorAll('.recommend .list12' + name + ' .list .item').forEach(el => {
			    el.classList.add("active")
			  })
			}, 1);
		},


		handleScroll() {
			let arr = [
				{id:'search',css:'animate__bounce'},
				{id:'about',css:'animate__lightSpeedInLeft'},
				{id:'system',css:'animate__backInRight'},
				{id:'animate_recommendkechengziliao',css:'animate__zoomInLeft'},
				{id:'animate_recommendxuexishipin',css:'animate__zoomInLeft'},
				{id:'animate_newsnews',css:'animate__rotateInUpLeft'},
				{id:'msgs',css:'animate__swing'},
				{id:'friendly',css:'animate__backInUp'}
			]
			
			for (let i in arr) {
				let doc = document.getElementById(arr[i].id)
				if (doc) {
					let top = doc.offsetTop
					let win_top = window.innerHeight + window.pageYOffset
					// console.log(top,win_top)
					if (win_top > top && doc.classList.value.indexOf(arr[i].css) < 0) {
						// console.log(doc)
						doc.classList.add(arr[i].css)
					}
				}
			}
		},
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
      getSystemIntroduction() {
          this.$http.get('systemintro/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.systemIntroductionDetail = res.data.data;
            }
          })
      },
		getNewsList() {
			let data = {
				page: 1,
				limit: 13,
                sort: 'addtime',
				order: 'desc'
			}
			this.$http.get('news/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
			let autoSortUrl = "";
			let data = {}
          autoSortUrl = "kechengziliao/autoSort";
          if(localStorage.getItem('frontToken')) {
              autoSortUrl = "kechengziliao/autoSort2";
          }
			data = {
				page: 1,
				limit: 6,
			}
			if(this.recommendIndex12kechengziliao != 0){
				data.kechengleixing = this.recommendList12kechengziliao[this.recommendIndex12kechengziliao - 1].kechengleixing
			}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.kechengziliaoRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
          autoSortUrl = "xuexishipin/autoSort";
          if(localStorage.getItem('frontToken')) {
              autoSortUrl = "xuexishipin/autoSort2";
          }
			data = {
				page: 1,
				limit: 6,
			}
			if(this.recommendIndex12xuexishipin != 0){
				data.kechengleixing = this.recommendList12xuexishipin[this.recommendIndex12xuexishipin - 1].kechengleixing
			}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.xuexishipinRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
			
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {id: item.id}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
		// -------- search --------
		.search .select /deep/ .el-input__inner {
			border: 0;
			border-radius: 20px 0 0 20px;
			padding: 0 10px 0 10px;
			outline: none;
			color: #fff;
			background: rgba(0,0,0,0.5);
			width: 120px;
			font-size: 14px;
			height: 44px;
		}
		
		.search .input /deep/ .el-input__inner {
			border: 0;
			border-radius: 0 20px 20px 0;
			padding: 0 10px;
			outline: none;
			color: #fff;
			background: rgba(0,0,0,0.5);
			width: 480px;
			font-size: 14px;
			height: 44px;
		}
		// -------- search --------
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
	




	.home-preview .news .list18 .left .list .item {
				cursor: pointer;
				padding: 0 20px;
				background: #fff;
				width: 100%;
				border-color: #F4F4F4;
				border-width: 0 0 1px 0;
				border-style: solid;
				height: 80px;
			}
	
	.home-preview .news .list18 .left .list .item:hover {
				background: #ff721b;
			}
	
	.home-preview .news .list18 .left .list .item .name {
				color: #333;
				font-size: 18px;
				line-height: 80px;
			}
	
	.home-preview .news .list18 .left .list .item:hover .name {
				color: #fff;
			}
	
	.home-preview .news .list18 .right .list .item .dian {
				border-radius: 100%;
				margin: 0 6px;
				background: #D8D8D8;
				width: 4px;
				height: 4px;
			}
	.home-preview .news .list18 .right .list .item:hover .dian {
				background: #ff721b;
			}
	
	.home-preview .news .list18 .right .list .item .title {
				overflow: hidden;
				color: #333;
				flex: 1;
				font-size: 14px;
				line-height: 24px;
				transition: 0.3s;
				height: 24px;
			}
	.home-preview .news .list18 .right .list .item:hover .title {
				color: #ff721b;
			}
	
	.home-preview .news .list18 .right .list .item .time .icon {
				color: #9b9b9b;
				font-size: 12px;
				line-height: 24px;
			}
	.home-preview .news .list18 .right .list .item:hover .time .icon {
				color: #ff721b;
			}
	.home-preview .news .list18 .right .list .item .time .text {
				color: #9b9b9b;
				font-size: 12px;
				line-height: 24px;
			}
	.home-preview .news .list18 .right .list .item:hover .time .text {
				color: #ff721b;
			}



	.home-preview .recommend .list12 .tab .item {
				cursor: pointer;
				border: 1px solid #9E9E9E;
				padding: 0 10px;
				margin: 0 10px;
				color: #9E9E9E;
				width: auto;
				font-size: 16px;
				line-height: 45px;
				height: 50px;
			}
	
	.home-preview .recommend .list12 .tab .item:hover {
				color: #fff;
				background: #242424;
			}
	
	.home-preview .recommend .list12 .tab .item.active {
				color: #fff;
				background: #242424;
				border-color: #999;
				border-width: 0 0 1px 0;
				border-style: solid;
			}
	
	.home-preview .recommend .list12 .tab .more {
				cursor: pointer;
				align-self: start;
				padding: 5px 10px;
				margin: 0 10px;
				color: #9E9E9E;
				background: #fff;
				display: none;
				line-height: 44px;
				align-items: center;
			}
	
	.home-preview .recommend .list12 .tab .more:hover {
				color: #242424;
			}
	
	.home-preview .recommend .list12 .item.active {
	  animation-name: mymove;
	
	  &:nth-of-type(1) {
	    animation-duration: 1s;
	  }
	  &:nth-of-type(2) {
	    animation-duration: 1.2s;
	  }
	  &:nth-of-type(3) {
	    animation-duration: 1.4s;
	  }
	  &:nth-of-type(4) {
	    animation-duration: 1.6s;
	  }
	  &:nth-of-type(5) {
	    animation-duration: 1.8s;
	  }
	  &:nth-of-type(6) {
	    animation-duration: 2s;
	  }
	}
	
	@keyframes mymove
	{
		from {top: 320px;}
		to {top: 0;}
	}



	.home-preview .lists .list16 .list-item {
				cursor: pointer;
				padding: 0;
				margin: 0 0 20px;
				overflow: hidden;
				background: #ebebeb;
				display: flex;
				width: 49%;
				font-size: 0;
				position: relative;
				height: auto;
			}
	
	.home-preview .lists .list16 .list-item:hover {
				background: #ff721b;
			}
	
	.home-preview .lists .list16 .list-item .title {
				padding: 0 10px;
				overflow: hidden;
				color: #333;
				font-size: 14px;
				border-color: red;
				border-width: 0;
				line-height: 36px;
				border-style: solid;
				height: 36px;
			}
	
	.home-preview .lists .list16 .list-item:hover .title {
				color: #fff;
			}
	
	.home-preview .lists .list16 .list-item .time .icon {
				margin: 0 2px 0 0;
				color: #868686;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .time .icon {
				color: #fff;
			}
	.home-preview .lists .list16 .list-item .time .text {
				color: #868686;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .time .text {
				color: #fff;
			}
	
	.home-preview .lists .list16 .list-item .publisher .icon {
				margin: 0 2px 0 0;
				color: #666;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .publisher .icon {
				color: #fff;
			}
	.home-preview .lists .list16 .list-item .publisher .text {
				color: #868686;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .publisher .text {
				color: #fff;
			}
	
	.home-preview .lists .list16 .list-item .like .icon {
				margin: 0 2px 0 0;
				color: #868686;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .like .icon {
				color: #fff;
			}
	.home-preview .lists .list16 .list-item .like .text {
				color: #868686;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .like .text {
				color: #fff;
			}
	
	.home-preview .lists .list16 .list-item .collect .icon {
				margin: 0 2px 0 0;
				color: #868686;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .collect .icon {
				color: #fff;
			}
	.home-preview .lists .list16 .list-item .collect .text {
				color: #868686;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .collect .text {
				color: #fff;
			}
	
	.home-preview .lists .list16 .list-item .view .icon {
				margin: 0 2px 0 0;
				color: #868686;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .view .icon {
				color: #fff;
			}
	.home-preview .lists .list16 .list-item .view .text {
				color: #868686;
				font-size: 12px;
				line-height: 28px;
			}
	.home-preview .lists .list16 .list-item:hover .view .text {
				color: #fff;
			}
	
	.home-preview .lists .list16 .list-item .desc {
				overflow: hidden;
				color: #868686;
				width: 50%;
				font-size: 14px;
				line-height: 1.5;
				height: auto;
			}
	.home-preview .lists .list16 .list-item:hover .desc {
				color: #fff;
			}
</style>
