<template>
	<div>

	<div class="container" :style='{"minHeight":"100vh","alignItems":"center","background":"url(http://codegen.caihongy.cn/20231027/d8df5c0e259243699a639a32c7803c8a.png)","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
		<el-form class='rgs-form' v-if="pageFlag=='register'" :style='{"width":"600px","padding":"20px","margin":"0","position":"relative","borderRadius":"10px","height":"auto"}' ref="registerForm" :model="registerForm" :rules="rules">
			<div v-if="false" :style='{"width":"100%","margin":"0 0 30px 0","lineHeight":"44px","fontSize":"30px","color":"#fff","textAlign":"center"}'>USER / REGISTER</div>
			<div v-if="true" :style='{"width":"100%","margin":"0 0 30px","lineHeight":"44px","fontSize":"30px","color":"#fff","textAlign":"center"}'>高校实验室预约系统注册</p></div>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='shiyanshiguanliyuan'" prop="zhanghao">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('zhanghao')?'required':''">账号：</div>
				<el-input v-model="registerForm.zhanghao"  placeholder="请输入账号" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='shiyanshiguanliyuan'" prop="mima">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='shiyanshiguanliyuan'" prop="mima2">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='shiyanshiguanliyuan'" prop="guanliyuanxingming">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('guanliyuanxingming')?'required':''">管理员姓名：</div>
				<el-input v-model="registerForm.guanliyuanxingming"  placeholder="请输入管理员姓名" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='shiyanshiguanliyuan'" prop="touxiang">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('touxiang')?'required':''">头像：</div>
                <file-upload
					tip="点击上传头像"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.touxiang?registerForm.touxiang:''"
					@change="shiyanshiguanliyuantouxiangUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='shiyanshiguanliyuan'" prop="xingbie">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('xingbie')?'required':''">性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in shiyanshiguanliyuanxingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='shiyanshiguanliyuan'" prop="lianxidianhua">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('lianxidianhua')?'required':''">联系电话：</div>
				<el-input v-model="registerForm.lianxidianhua"  placeholder="请输入联系电话" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='xuesheng'" prop="xuehao">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('xuehao')?'required':''">学号：</div>
				<el-input v-model="registerForm.xuehao"  placeholder="请输入学号" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='xuesheng'" prop="mima">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='xuesheng'" prop="mima2">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='xuesheng'" prop="xingming">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('xingming')?'required':''">姓名：</div>
				<el-input v-model="registerForm.xingming"  placeholder="请输入姓名" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='xuesheng'" prop="touxiang">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('touxiang')?'required':''">头像：</div>
                <file-upload
					tip="点击上传头像"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.touxiang?registerForm.touxiang:''"
					@change="xueshengtouxiangUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='xuesheng'" prop="xingbie">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('xingbie')?'required':''">性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in xueshengxingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='xuesheng'" prop="nianling">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('nianling')?'required':''">年龄：</div>
				<el-input v-model.number="registerForm.nianling"  placeholder="请输入年龄" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='xuesheng'" prop="zhuanye">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('zhuanye')?'required':''">专业：</div>
				<el-input v-model="registerForm.zhuanye"  placeholder="请输入专业" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='xuesheng'" prop="banji">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('banji')?'required':''">班级：</div>
				<el-input v-model="registerForm.banji"  placeholder="请输入班级" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='xuesheng'" prop="shouji">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('shouji')?'required':''">手机：</div>
				<el-input v-model="registerForm.shouji"  placeholder="请输入手机" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='jiaoshi'" prop="gonghao">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('gonghao')?'required':''">工号：</div>
				<el-input v-model="registerForm.gonghao"  placeholder="请输入工号" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='jiaoshi'" prop="mima">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='jiaoshi'" prop="mima2">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='jiaoshi'" prop="jiaoshixingming">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('jiaoshixingming')?'required':''">教师姓名：</div>
				<el-input v-model="registerForm.jiaoshixingming"  placeholder="请输入教师姓名" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='jiaoshi'" prop="touxiang">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('touxiang')?'required':''">头像：</div>
                <file-upload
					tip="点击上传头像"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.touxiang?registerForm.touxiang:''"
					@change="jiaoshitouxiangUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='jiaoshi'" prop="xingbie">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('xingbie')?'required':''">性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in jiaoshixingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='jiaoshi'" prop="nianling">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('nianling')?'required':''">年龄：</div>
				<el-input v-model.number="registerForm.nianling"  placeholder="请输入年龄" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='jiaoshi'" prop="zhicheng">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('zhicheng')?'required':''">职称：</div>
				<el-input v-model="registerForm.zhicheng"  placeholder="请输入职称" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0 auto 20px","height":"auto"}' v-if="tableName=='jiaoshi'" prop="shouji">
				<div v-if="true" :style='{"padding":"0 10px 0 0","color":"#fff","textAlign":"right","display":"inline-block","width":"120px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('shouji')?'required':''">手机：</div>
				<el-input v-model="registerForm.shouji"  placeholder="请输入手机" />
			</el-form-item>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"20px auto 5px","outline":"none","color":"#333","borderRadius":"0px","background":"rgba(255,255,255,.6)","display":"block","width":"343px","fontSize":"22px","height":"50px"}' type="primary" @click="submitForm('registerForm')">注册</el-button>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","boxShadow":"0 0 6px rgba(64, 158, 255, .5)","margin":"20px auto 5px","color":"#fff","display":"none","outline":"none","borderRadius":"8px","background":"rgba(64, 158, 255, 1)","width":"80%","fontSize":"16px","height":"44px"}' @click="resetForm('registerForm')">重置</el-button>
			<router-link :style='{"cursor":"pointer","padding":"8px","margin":"20px 0 0","color":"#333","textAlign":"right","background":"rgba(255,255,255,.6)","display":"inline-block","width":"auto","lineHeight":"1","fontSize":"16px","textDecoration":"none","float":"right"}' to="/login">已有账户登录</router-link>
			<div class="idea1" :style='{"width":"100%","background":"red","display":"none","height":"40px"}'></div>
			<div class="idea2" :style='{"width":"100%","background":"blue","display":"none","height":"40px"}'></div>
		</el-form>
    </div>
  </div>
</div>
</template>

<script>

export default {
    //数据集合
    data() {
		return {
            pageFlag : '',
			tableName: '',
			registerForm: {},
			forgetForm: {},
			rules: {},
			requiredRules: {},
            shiyanshiguanliyuanxingbieOptions: [],
            xueshengxingbieOptions: [],
            jiaoshixingbieOptions: [],
		}
    },
	mounted() {
		if(this.$route.query.pageFlag=='register'){
			this.tableName = this.$route.query.role;
			if(this.tableName=='shiyanshiguanliyuan'){
				this.registerForm = {
					zhanghao: '',
					mima: '',
					mima2: '',
					guanliyuanxingming: '',
					touxiang: '',
					xingbie: '',
					lianxidianhua: '',
				}
			}
			if(this.tableName=='xuesheng'){
				this.registerForm = {
					xuehao: '',
					mima: '',
					mima2: '',
					xingming: '',
					touxiang: '',
					xingbie: '',
					nianling: '',
					zhuanye: '',
					banji: '',
					shouji: '',
				}
			}
			if(this.tableName=='jiaoshi'){
				this.registerForm = {
					gonghao: '',
					mima: '',
					mima2: '',
					jiaoshixingming: '',
					touxiang: '',
					xingbie: '',
					nianling: '',
					zhicheng: '',
					shouji: '',
				}
			}
			if ('shiyanshiguanliyuan' == this.tableName) {
				this.requiredRules.zhanghao = [{ required: true, message: '请输入账号', trigger: 'blur' }]
			}
			if ('shiyanshiguanliyuan' == this.tableName) {
				this.requiredRules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			if ('shiyanshiguanliyuan' == this.tableName) {
				this.requiredRules.guanliyuanxingming = [{ required: true, message: '请输入管理员姓名', trigger: 'blur' }]
			}
			if ('xuesheng' == this.tableName) {
				this.requiredRules.xuehao = [{ required: true, message: '请输入学号', trigger: 'blur' }]
			}
			if ('xuesheng' == this.tableName) {
				this.requiredRules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			if ('xuesheng' == this.tableName) {
				this.requiredRules.xingming = [{ required: true, message: '请输入姓名', trigger: 'blur' }]
			}
			if ('jiaoshi' == this.tableName) {
				this.requiredRules.gonghao = [{ required: true, message: '请输入工号', trigger: 'blur' }]
			}
			if ('jiaoshi' == this.tableName) {
				this.requiredRules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			if ('jiaoshi' == this.tableName) {
				this.requiredRules.jiaoshixingming = [{ required: true, message: '请输入教师姓名', trigger: 'blur' }]
			}
		}
	},
    created() {
		this.pageFlag = this.$route.query.pageFlag;
		if(this.$route.query.pageFlag=='register'){
		  if ('shiyanshiguanliyuan' == this.tableName) {
			this.rules.zhanghao = [{ required: true, message: '请输入账号', trigger: 'blur' }];
		  }
		  if ('shiyanshiguanliyuan' == this.tableName) {
			this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
		  }
		  if ('shiyanshiguanliyuan' == this.tableName) {
			this.rules.guanliyuanxingming = [{ required: true, message: '请输入管理员姓名', trigger: 'blur' }];
		  }
			this.shiyanshiguanliyuanxingbieOptions = "男,女".split(',');
		  if ('shiyanshiguanliyuan' == this.tableName) {
			this.rules.lianxidianhua = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
		  }
		  if ('xuesheng' == this.tableName) {
			this.rules.xuehao = [{ required: true, message: '请输入学号', trigger: 'blur' }];
		  }
		  if ('xuesheng' == this.tableName) {
			this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
		  }
		  if ('xuesheng' == this.tableName) {
			this.rules.xingming = [{ required: true, message: '请输入姓名', trigger: 'blur' }];
		  }
			this.xueshengxingbieOptions = "男,女".split(',');
		  if ('xuesheng' == this.tableName) {
			this.rules.nianling = [{ required: true, validator: this.$validate.isIntNumer, trigger: 'blur' }];
		  }
		  if ('xuesheng' == this.tableName) {
			this.rules.shouji = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
		  }
		  if ('jiaoshi' == this.tableName) {
			this.rules.gonghao = [{ required: true, message: '请输入工号', trigger: 'blur' }];
		  }
		  if ('jiaoshi' == this.tableName) {
			this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
		  }
		  if ('jiaoshi' == this.tableName) {
			this.rules.jiaoshixingming = [{ required: true, message: '请输入教师姓名', trigger: 'blur' }];
		  }
			this.jiaoshixingbieOptions = "男,女".split(',');
		  if ('jiaoshi' == this.tableName) {
			this.rules.nianling = [{ required: true, validator: this.$validate.isIntNumer, trigger: 'blur' }];
		  }
		  if ('jiaoshi' == this.tableName) {
			this.rules.shouji = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
		  }
		}
    },
    //方法集合
    methods: {
		changeRules(name){
			if(this.requiredRules[name]){
				return true
			}
			return false
		},
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
        // 下二随
      shiyanshiguanliyuantouxiangUploadChange(fileUrls) {
          this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
      xueshengtouxiangUploadChange(fileUrls) {
          this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
      jiaoshitouxiangUploadChange(fileUrls) {
          this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },

        // 多级联动参数


      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            var url=this.tableName+"/register";
				if((!this.registerForm.zhanghao) && `shiyanshiguanliyuan` == this.tableName){
					this.$message.error(`账号不能为空`);
					return
				}
               if(`shiyanshiguanliyuan` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
				if((!this.registerForm.mima) && `shiyanshiguanliyuan` == this.tableName){
					this.$message.error(`密码不能为空`);
					return
				}
				if((!this.registerForm.guanliyuanxingming) && `shiyanshiguanliyuan` == this.tableName){
					this.$message.error(`管理员姓名不能为空`);
					return
				}
					if(`shiyanshiguanliyuan` == this.tableName && this.registerForm.lianxidianhua &&(!this.$validate.isMobile2(this.registerForm.lianxidianhua))){
						this.$message.error(`联系电话应输入手机格式`);
						return
					}
				if((!this.registerForm.xuehao) && `xuesheng` == this.tableName){
					this.$message.error(`学号不能为空`);
					return
				}
               if(`xuesheng` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
				if((!this.registerForm.mima) && `xuesheng` == this.tableName){
					this.$message.error(`密码不能为空`);
					return
				}
				if((!this.registerForm.xingming) && `xuesheng` == this.tableName){
					this.$message.error(`姓名不能为空`);
					return
				}
				if(`xuesheng` == this.tableName && this.registerForm.nianling &&(!this.$validate.isIntNumer2(this.registerForm.nianling))){
					this.$message.error(`年龄应输入整数`);
					return
				}
					if(`xuesheng` == this.tableName && this.registerForm.shouji &&(!this.$validate.isMobile2(this.registerForm.shouji))){
						this.$message.error(`手机应输入手机格式`);
						return
					}
				if((!this.registerForm.gonghao) && `jiaoshi` == this.tableName){
					this.$message.error(`工号不能为空`);
					return
				}
               if(`jiaoshi` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
				if((!this.registerForm.mima) && `jiaoshi` == this.tableName){
					this.$message.error(`密码不能为空`);
					return
				}
				if((!this.registerForm.jiaoshixingming) && `jiaoshi` == this.tableName){
					this.$message.error(`教师姓名不能为空`);
					return
				}
				if(`jiaoshi` == this.tableName && this.registerForm.nianling &&(!this.$validate.isIntNumer2(this.registerForm.nianling))){
					this.$message.error(`年龄应输入整数`);
					return
				}
					if(`jiaoshi` == this.tableName && this.registerForm.shouji &&(!this.$validate.isMobile2(this.registerForm.shouji))){
						this.$message.error(`手机应输入手机格式`);
						return
					}
            this.$http.post(url, this.registerForm).then(res => {
              if (res.data.code === 0) {
                this.$message({
                  message: '注册成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.$router.push('/login');
                  }
                });
              } else {
                this.$message.error(res.data.msg);
              }
            });
          } else {
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.container {
		position: relative;
		background: url(http://codegen.caihongy.cn/20231027/d8df5c0e259243699a639a32c7803c8a.png);
		
		.el-input {
		  width: auto;
		}
		
		.el-date-editor.el-input {
			width: auto;
		}
		
		.el-form-item /deep/ .el-form-item__content {
						display: flex;
					}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border: 3px solid #fff;
						border-radius: 0px;
						padding: 0 10px;
						box-shadow: inset 0px 0px 16px 0px #332001;
						color: #333;
						background: rgba(255,255,255,.6);
						width: 100%;
						font-size: 14px;
						min-width: 400px;
						height: 44px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border: 3px solid #fff;
						border-radius: 0px;
						padding: 0 10px;
						box-shadow: inset 0px 0px 16px 0px #332001;
						color: #333;
						background: rgba(255,255,255,.6);
						width: 100%;
						font-size: 14px;
						min-width: 400px;
						height: 44px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 3px solid #fff;
						border-radius: 0px;
						padding: 0 10px 0 30px;
						box-shadow: inset 0px 0px 16px 0px #332001;
						color: #333;
						background: rgba(255,255,255,.6);
						width: 100%;
						font-size: 14px;
						min-width: 400px;
						height: 44px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 3px solid #fff;
						border-radius: 0px;
						padding: 0 10px 0 30px;
						box-shadow: inset 0px 0px 16px 0px #332001;
						color: #333;
						background: rgba(255,255,255,.6);
						width: 100%;
						font-size: 14px;
						min-width: 400px;
						height: 44px;
					}
		
		.rgs-form /deep/ .el-upload--picture-card {
			background: transparent;
			border: 0;
			border-radius: 0;
			width: auto;
			height: auto;
			line-height: initial;
			vertical-align: middle;
		}
		
		.rgs-form /deep/ .upload .upload-img {
		  		  border: 3px solid #fff;
		  		  cursor: pointer;
		  		  border-radius: 0px;
		  		  box-shadow: inset 0px 0px 16px 0px #332001;
		  		  color: #333;
		  		  background: rgba(255,255,255,.6);
		  		  width: 120px;
		  		  font-size: 24px;
		  		  line-height: 56px;
		  		  text-align: center;
		  		  height: 60px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 3px solid #fff;
		  		  cursor: pointer;
		  		  border-radius: 0px;
		  		  box-shadow: inset 0px 0px 16px 0px #332001;
		  		  color: #333;
		  		  background: rgba(255,255,255,.6);
		  		  width: 120px;
		  		  font-size: 24px;
		  		  line-height: 56px;
		  		  text-align: center;
		  		  height: 60px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 3px solid #fff;
		  		  cursor: pointer;
		  		  border-radius: 0px;
		  		  box-shadow: inset 0px 0px 16px 0px #332001;
		  		  color: #333;
		  		  background: rgba(255,255,255,.6);
		  		  width: 120px;
		  		  font-size: 24px;
		  		  line-height: 56px;
		  		  text-align: center;
		  		  height: 60px;
		  		}
	}
	.required {
		position: relative;
	}
	.required::after{
				color: red;
				left: 110px;
				position: absolute;
				content: "*";
			}
</style>
