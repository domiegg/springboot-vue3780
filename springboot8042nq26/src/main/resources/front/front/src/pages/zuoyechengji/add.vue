<template>
<div :style='{"width":"1200px","padding":"20px","margin":"0 auto","overflow":"hidden","position":"relative","background":"#fff"}'>
    <el-form
	  :style='{"width":"100%","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.3)","padding":"30px 40px 40px","margin":"20px auto 40px","position":"relative"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
    >
          <el-form-item :style='{"width":"45%","padding":"10px","margin":"0 2% 10px","background":"#fff","display":"inline-block"}' label="作业名称" prop="zuoyemingcheng">
            <el-input v-model="ruleForm.zuoyemingcheng" 
                placeholder="作业名称" clearable :disabled=" false  ||ro.zuoyemingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"45%","padding":"10px","margin":"0 2% 10px","background":"#fff","display":"inline-block"}' label="作业类型" prop="zuoyeleixing">
            <el-input v-model="ruleForm.zuoyeleixing" 
                placeholder="作业类型" clearable :disabled=" false  ||ro.zuoyeleixing"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"45%","padding":"10px","margin":"0 2% 10px","background":"#fff","display":"inline-block"}' label="图片" v-if="type!='cross' || (type=='cross' && !ro.tupian)" prop="tupian">
            <file-upload
            tip="点击上传图片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.tupian?ruleForm.tupian:''"
            @change="tupianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"width":"45%","padding":"10px","margin":"0 2% 10px","background":"#fff","display":"inline-block"}' class="upload" v-else label="图片" prop="tupian">
                <img v-if="ruleForm.tupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.tupian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.tupian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"width":"45%","padding":"10px","margin":"0 2% 10px","background":"#fff","display":"inline-block"}' label="学生姓名" prop="xingming">
            <el-input v-model="ruleForm.xingming" 
                placeholder="学生姓名" clearable :disabled=" false  ||ro.xingming"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"45%","padding":"10px","margin":"0 2% 10px","background":"#fff","display":"inline-block"}' label="分数" prop="fenshu">
            <el-input v-model.number="ruleForm.fenshu" 
                placeholder="分数" clearable :disabled=" false  ||ro.fenshu"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"45%","padding":"10px","margin":"0 2% 10px","background":"#fff","display":"inline-block"}'  label="成绩" prop="chengji">
            <el-select v-model="ruleForm.chengji" placeholder="请选择成绩" :disabled=" false  ||ro.chengji" >
              <el-option
                  v-for="(item,index) in chengjiOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"45%","padding":"10px","margin":"0 2% 10px","background":"#fff","display":"inline-block"}' label="批改时间" prop="pigaishijian">
              <el-date-picker
				  :disabled="true  ||ro.pigaishijian"
                  format="yyyy 年 MM 月 dd 日"
                  value-format="yyyy-MM-dd"
                  v-model="ruleForm.pigaishijian" 
                  type="date"
                  placeholder="批改时间">
              </el-date-picker> 
          </el-form-item>
          <el-form-item :style='{"width":"45%","padding":"10px","margin":"0 2% 10px","background":"#fff","display":"inline-block"}' label="教师姓名" prop="jiaoshixingming">
            <el-input v-model="ruleForm.jiaoshixingming" 
                placeholder="教师姓名" clearable :disabled=" false  ||ro.jiaoshixingming"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"45%","padding":"10px","margin":"0 2% 10px","background":"#fff","display":"inline-block"}' label="专业" prop="zhuanye">
            <el-input v-model="ruleForm.zhuanye" 
                placeholder="专业" clearable :disabled=" false  ||ro.zhuanye"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"45%","padding":"10px","margin":"0 2% 10px","background":"#fff","display":"inline-block"}' label="班级" prop="banji">
            <el-input v-model="ruleForm.banji" 
                placeholder="班级" clearable :disabled=" false  ||ro.banji"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"45%","padding":"10px","margin":"0 2% 10px","background":"#fff","display":"inline-block"}' label="评语" prop="pingyu">
            <el-input
              type="textarea"
              :rows="8"
              placeholder="评语"
              v-model="ruleForm.pingyu">
            </el-input>
          </el-form-item>
          <el-form-item :style='{"width":"45%","padding":"10px","margin":"0 2% 10px","background":"#fff","display":"inline-block"}' label="批改状况" prop="pigaizhuangkuang">
            <editor 
                :style='{"minHeight":"300px","padding":"0","margin":"0","borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.pigaizhuangkuang" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#ff721b","width":"110px","lineHeight":"36px","fontSize":"14px","height":"36px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"0px solid #ff721b","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#fff","borderRadius":"4px","background":"#170000","width":"110px","lineHeight":"36px","fontSize":"14px","height":"36px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
	  let self = this
      return {
        id: '',
        baseUrl: '',
        ro:{
				zuoyemingcheng : false,
				zuoyeleixing : false,
				tupian : false,
				xingming : false,
				fenshu : false,
				chengji : false,
				pingyu : false,
				pigaizhuangkuang : false,
				pigaishijian : false,
				jiaoshixingming : false,
				zhuanye : false,
				banji : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          zuoyemingcheng: '',
          zuoyeleixing: '',
          tupian: '',
          xingming: '',
          fenshu: '',
          chengji: '',
          pingyu: '',
          pigaizhuangkuang: '',
          pigaishijian: '',
          jiaoshixingming: '',
          zhuanye: '',
          banji: '',
        },
        chengjiOptions: [],


        rules: {
          zuoyemingcheng: [
          ],
          zuoyeleixing: [
          ],
          tupian: [
          ],
          xingming: [
          ],
          fenshu: [
            { required: true, message: '分数不能为空', trigger: 'blur' },
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          chengji: [
            { required: true, message: '成绩不能为空', trigger: 'blur' },
          ],
          pingyu: [
            { required: true, message: '评语不能为空', trigger: 'blur' },
          ],
          pigaizhuangkuang: [
          ],
          pigaishijian: [
          ],
          jiaoshixingming: [
          ],
          zhuanye: [
          ],
          banji: [
          ],
        },
		centerType: false,
      };
    },
    computed: {



    },
    components: {
    },
    created() {
		if(this.$route.query.centerType){
			this.centerType = true
		}
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
      this.ruleForm.pigaishijian = this.getCurDate()
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='zuoyemingcheng'){
              this.ruleForm.zuoyemingcheng = obj[o];
              this.ro.zuoyemingcheng = true;
              continue;
            }
            if(o=='zuoyeleixing'){
              this.ruleForm.zuoyeleixing = obj[o];
              this.ro.zuoyeleixing = true;
              continue;
            }
            if(o=='tupian'){
              this.ruleForm.tupian = obj[o].split(",")[0];
              this.ro.tupian = true;
              continue;
            }
            if(o=='xingming'){
              this.ruleForm.xingming = obj[o];
              this.ro.xingming = true;
              continue;
            }
            if(o=='fenshu'){
              this.ruleForm.fenshu = obj[o];
              this.ro.fenshu = true;
              continue;
            }
            if(o=='chengji'){
              this.ruleForm.chengji = obj[o];
              this.ro.chengji = true;
              continue;
            }
            if(o=='pingyu'){
              this.ruleForm.pingyu = obj[o];
              this.ro.pingyu = true;
              continue;
            }
            if(o=='pigaizhuangkuang'){
              this.ruleForm.pigaizhuangkuang = obj[o];
              this.ro.pigaizhuangkuang = true;
              continue;
            }
            if(o=='pigaishijian'){
              this.ruleForm.pigaishijian = obj[o];
              this.ro.pigaishijian = true;
              continue;
            }
            if(o=='jiaoshixingming'){
              this.ruleForm.jiaoshixingming = obj[o];
              this.ro.jiaoshixingming = true;
              continue;
            }
            if(o=='zhuanye'){
              this.ruleForm.zhuanye = obj[o];
              this.ro.zhuanye = true;
              continue;
            }
            if(o=='banji'){
              this.ruleForm.banji = obj[o];
              this.ro.banji = true;
              continue;
            }
          }
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if((json.jiaoshixingming!=''&&json.jiaoshixingming) || json.jiaoshixingming==0){
                this.ruleForm.jiaoshixingming = json.jiaoshixingming;
				this.ro.jiaoshixingming = true;
            }
            if((json.zhuanye!=''&&json.zhuanye) || json.zhuanye==0){
                this.ruleForm.zhuanye = json.zhuanye;
				this.ro.zhuanye = true;
            }
            if((json.banji!=''&&json.banji) || json.banji==0){
                this.ruleForm.banji = json.banji;
				this.ro.banji = true;
            }
          }
        });
        this.chengjiOptions = "优秀,良好,及格,不及格".split(',')

		if (localStorage.getItem('raffleType') && localStorage.getItem('raffleType') != null) {
			localStorage.removeItem('raffleType')
			setTimeout(() => {
				this.onSubmit()
			}, 300)
		}
      },

    // 多级联动参数
      // 多级联动参数
      info() {
        this.$http.get(`zuoyechengji/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {
			//更新跨表属性
			var crossuserid;
			var crossrefid;
			var crossoptnum;
			this.$refs["ruleForm"].validate(valid => {
				if(valid) {
					if(this.type=='cross'){
						var statusColumnName = localStorage.getItem('statusColumnName');
						var statusColumnValue = localStorage.getItem('statusColumnValue');
						if(statusColumnName && statusColumnName!='') {
							var obj = JSON.parse(localStorage.getItem('crossObj'));
							if(!statusColumnName.startsWith("[")) {
								for (var o in obj){
									if(o==statusColumnName){
										obj[o] = statusColumnValue;
									}
								}
								var table = localStorage.getItem('crossTable');
								this.$http.post(table+'/update', obj).then(res => {});
							} else {
								crossuserid=Number(localStorage.getItem('frontUserid'));
								crossrefid=obj['id'];
								crossoptnum=localStorage.getItem('statusColumnName');
								crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
							}
						}
					}
					if(crossrefid && crossuserid) {
						this.ruleForm.crossuserid=crossuserid;
						this.ruleForm.crossrefid=crossrefid;
						var params = {
							page: 1,
							limit: 10,
							crossuserid:crossuserid,
							crossrefid:crossrefid,
						}
						this.$http.get('zuoyechengji/list', {
							params: params
						}).then(res => {
							if(res.data.data.total>=crossoptnum) {
								this.$message({
									message: localStorage.getItem('tips'),
									type: 'error',
									duration: 1500,
								});
								return false;
							} else {
								// 跨表计算


								this.$http.post(`zuoyechengji/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
									if (res.data.code == 0) {
										this.$message({
											message: '操作成功',
											type: 'success',
											duration: 1500,
											onClose: () => {
												this.$router.go(-1);
											}
										});
									} else {
										this.$message({
											message: res.data.msg,
											type: 'error',
											duration: 1500
										});
									}
								});
							}
						});
					} else {


						this.$http.post(`zuoyechengji/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
							if (res.data.code == 0) {
								this.$message({
									message: '操作成功',
									type: 'success',
									duration: 1500,
									onClose: () => {
										this.$router.go(-1);
									}
								});
							} else {
								this.$message({
									message: res.data.msg,
									type: 'error',
									duration: 1500
								});
							}
						});
					}
				}
			});
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		// 返回
		back() {
			this.$router.go(-1);
		},
      tupianUploadChange(fileUrls) {
          this.ruleForm.tupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 80px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 80px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 1px solid #999;
	  border-radius: 4px;
	  padding: 0 12px;
	  outline: none;
	  color: #000;
	  width: 300px;
	  font-size: 14px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
	  border: 1px solid #999;
	  border-radius: 4px;
	  padding: 0 12px;
	  outline: none;
	  color: #000;
	  width: 300px;
	  font-size: 14px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 1px solid #999;
	  border-radius: 4px;
	  padding: 0 10px;
	  outline: none;
	  color: #000;
	  width: auto;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border: 1px solid #999;
	  border-radius: 4px;
	  padding: 0 10px 0 30px;
	  outline: none;
	  color: #000;
	  width: auto;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  border: 1px solid #666;
	  cursor: pointer;
	  border-radius: 30px;
	  color: #000;
	  width: 150px;
	  font-size: 32px;
	  line-height: 60px;
	  text-align: center;
	  height: 60px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px solid #666;
	  cursor: pointer;
	  border-radius: 30px;
	  color: #000;
	  width: 150px;
	  font-size: 32px;
	  line-height: 60px;
	  text-align: center;
	  height: 60px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px solid #666;
	  cursor: pointer;
	  border-radius: 30px;
	  color: #000;
	  width: 150px;
	  font-size: 32px;
	  line-height: 60px;
	  text-align: center;
	  height: 60px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #999;
	  border-radius: 4px;
	  padding: 12px;
	  outline: none;
	  color: #000;
	  width: 400px;
	  font-size: 14px;
	  height: 120px;
	}
</style>
