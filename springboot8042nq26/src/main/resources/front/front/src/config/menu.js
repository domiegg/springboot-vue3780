const menu = {
    list() {
        return [{
            "backMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-send",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "实验室管理员",
                    "menuJump": "列表",
                    "tableName": "shiyanshiguanliyuan"
                }],
                "menu": "实验室管理员管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-shop",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "学生",
                    "menuJump": "列表",
                    "tableName": "xuesheng"
                }],
                "menu": "学生管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-attentionfavor",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "教师",
                    "menuJump": "列表",
                    "tableName": "jiaoshi"
                }],
                "menu": "教师管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-goods",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "实验室类型",
                    "menuJump": "列表",
                    "tableName": "shiyanshileixing"
                }],
                "menu": "实验室类型管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "预约"],
                    "appFrontIcon": "cuIcon-goods",
                    "buttons": ["查看", "修改", "删除", "新增"],
                    "menu": "实验室",
                    "menuJump": "列表",
                    "tableName": "shiyanshi"
                }],
                "menu": "实验室管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "审核", "实验室预约次数统计", "预约取消次数统计", "首页总数", "首页统计", "取消", "使用"],
                    "appFrontIcon": "cuIcon-newshot",
                    "buttons": ["查看", "修改", "删除", "首页总数", "首页统计", "审核"],
                    "menu": "预约申请",
                    "menuJump": "列表",
                    "tableName": "yuyueshenqing"
                }],
                "menu": "预约申请管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "实验室使用人数统计", "首页总数", "首页统计"],
                    "appFrontIcon": "cuIcon-shop",
                    "buttons": ["查看", "修改", "删除", "首页总数", "首页统计"],
                    "menu": "使用记录",
                    "menuJump": "列表",
                    "tableName": "shiyongjilu"
                }],
                "menu": "使用记录管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "提交作业"],
                    "appFrontIcon": "cuIcon-phone",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "作业信息",
                    "menuJump": "列表",
                    "tableName": "zuoyexinxi"
                }],
                "menu": "作业信息管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "批改作业"],
                    "appFrontIcon": "cuIcon-news",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "作业提交",
                    "menuJump": "列表",
                    "tableName": "zuoyetijiao"
                }],
                "menu": "作业提交管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "作业分数统计", "作业成绩统计", "首页总数", "首页统计"],
                    "appFrontIcon": "cuIcon-vipcard",
                    "buttons": ["查看", "修改", "删除", "首页总数", "首页统计"],
                    "menu": "作业成绩",
                    "menuJump": "列表",
                    "tableName": "zuoyechengji"
                }],
                "menu": "作业成绩管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-group",
                    "buttons": ["查看", "删除"],
                    "menu": "论坛交流",
                    "tableName": "forum"
                }],
                "menu": "论坛交流"
            }, {
                "child": [{
                    "allButtons": ["查看", "修改"],
                    "appFrontIcon": "cuIcon-time",
                    "buttons": ["查看", "修改"],
                    "menu": "系统简介",
                    "tableName": "systemintro"
                }, {
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-skin",
                    "buttons": ["查看", "修改", "删除", "新增"],
                    "menu": "友情链接",
                    "tableName": "friendlink"
                }, {
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-wenzi",
                    "buttons": ["查看", "修改"],
                    "menu": "轮播图管理",
                    "tableName": "config"
                }, {
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-news",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "公告信息",
                    "tableName": "news"
                }, {
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-news",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "公告信息分类",
                    "tableName": "newstype"
                }],
                "menu": "系统管理"
            }],
            "frontMenu": [ {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "预约"],
                    "appFrontIcon": "cuIcon-keyboard",
                    "buttons": ["查看", "预约"],
                    "menu": "实验室列表",
                    "menuJump": "列表",
                    "tableName": "shiyanshi"
                }],
                "menu": "实验室模块"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "提交作业"],
                    "appFrontIcon": "cuIcon-attentionfavor",
                    "buttons": ["查看", "提交作业"],
                    "menu": "作业信息列表",
                    "menuJump": "列表",
                    "tableName": "zuoyexinxi"
                }],
                "menu": "作业信息模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "管理员",
            "tableName": "users"
        }, {
            "backMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-goods",
                    "buttons": ["查看", "修改", "删除", "新增"],
                    "menu": "实验室类型",
                    "menuJump": "列表",
                    "tableName": "shiyanshileixing"
                }],
                "menu": "实验室类型管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "预约"],
                    "appFrontIcon": "cuIcon-goods",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "实验室",
                    "menuJump": "列表",
                    "tableName": "shiyanshi"
                }],
                "menu": "实验室管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "审核", "实验室预约次数统计", "预约取消次数统计", "首页总数", "首页统计", "取消", "使用"],
                    "appFrontIcon": "cuIcon-newshot",
                    "buttons": ["查看", "修改", "删除", "审核", "首页总数", "首页统计"],
                    "menu": "预约申请",
                    "menuJump": "列表",
                    "tableName": "yuyueshenqing"
                }],
                "menu": "预约申请管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "实验室使用人数统计", "首页总数", "首页统计"],
                    "appFrontIcon": "cuIcon-shop",
                    "buttons": ["查看", "修改", "删除", "首页总数", "首页统计"],
                    "menu": "使用记录",
                    "menuJump": "列表",
                    "tableName": "shiyongjilu"
                }],
                "menu": "使用记录管理"
            }],
            "frontMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "预约"],
                    "appFrontIcon": "cuIcon-keyboard",
                    "buttons": ["查看", "预约"],
                    "menu": "实验室列表",
                    "menuJump": "列表",
                    "tableName": "shiyanshi"
                }],
                "menu": "实验室模块"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "提交作业"],
                    "appFrontIcon": "cuIcon-attentionfavor",
                    "buttons": ["查看", "提交作业"],
                    "menu": "作业信息列表",
                    "menuJump": "列表",
                    "tableName": "zuoyexinxi"
                }],
                "menu": "作业信息模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "实验室管理员",
            "tableName": "shiyanshiguanliyuan"
        }, {
            "backMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "审核", "实验室预约次数统计", "预约取消次数统计", "首页总数", "首页统计", "取消", "使用"],
                    "appFrontIcon": "cuIcon-newshot",
                    "buttons": ["查看", "取消", "使用"],
                    "menu": "预约申请",
                    "menuJump": "列表",
                    "tableName": "yuyueshenqing"
                }],
                "menu": "预约申请管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "实验室使用人数统计", "首页总数", "首页统计"],
                    "appFrontIcon": "cuIcon-shop",
                    "buttons": ["查看"],
                    "menu": "使用记录",
                    "menuJump": "列表",
                    "tableName": "shiyongjilu"
                }],
                "menu": "使用记录管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "批改作业"],
                    "appFrontIcon": "cuIcon-news",
                    "buttons": ["查看"],
                    "menu": "作业提交",
                    "menuJump": "列表",
                    "tableName": "zuoyetijiao"
                }],
                "menu": "作业提交管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "作业分数统计", "作业成绩统计", "首页总数", "首页统计"],
                    "appFrontIcon": "cuIcon-vipcard",
                    "buttons": ["查看"],
                    "menu": "作业成绩",
                    "menuJump": "列表",
                    "tableName": "zuoyechengji"
                }],
                "menu": "作业成绩管理"
            }],
            "frontMenu": [ {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "预约"],
                    "appFrontIcon": "cuIcon-keyboard",
                    "buttons": ["查看", "预约"],
                    "menu": "实验室列表",
                    "menuJump": "列表",
                    "tableName": "shiyanshi"
                }],
                "menu": "实验室模块"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "提交作业"],
                    "appFrontIcon": "cuIcon-attentionfavor",
                    "buttons": ["查看", "提交作业"],
                    "menu": "作业信息列表",
                    "menuJump": "列表",
                    "tableName": "zuoyexinxi"
                }],
                "menu": "作业信息模块"
            }],
            "hasBackLogin": "否",
            "hasBackRegister": "否",
            "hasFrontLogin": "是",
            "hasFrontRegister": "是",
            "roleName": "学生",
            "tableName": "xuesheng"
        }, {
            "backMenu": [ {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "提交作业"],
                    "appFrontIcon": "cuIcon-phone",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "作业信息",
                    "menuJump": "列表",
                    "tableName": "zuoyexinxi"
                }],
                "menu": "作业信息管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "批改作业"],
                    "appFrontIcon": "cuIcon-news",
                    "buttons": ["查看", "修改", "删除", "批改作业"],
                    "menu": "作业提交",
                    "menuJump": "列表",
                    "tableName": "zuoyetijiao"
                }],
                "menu": "作业提交管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "作业分数统计", "作业成绩统计", "首页总数", "首页统计"],
                    "appFrontIcon": "cuIcon-vipcard",
                    "buttons": ["查看", "修改", "删除", "首页统计", "首页总数"],
                    "menu": "作业成绩",
                    "menuJump": "列表",
                    "tableName": "zuoyechengji"
                }],
                "menu": "作业成绩管理"
            }],
            "frontMenu": [ {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "预约"],
                    "appFrontIcon": "cuIcon-keyboard",
                    "buttons": ["查看", "预约"],
                    "menu": "实验室列表",
                    "menuJump": "列表",
                    "tableName": "shiyanshi"
                }],
                "menu": "实验室模块"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "提交作业"],
                    "appFrontIcon": "cuIcon-attentionfavor",
                    "buttons": ["查看", "提交作业"],
                    "menu": "作业信息列表",
                    "menuJump": "列表",
                    "tableName": "zuoyexinxi"
                }],
                "menu": "作业信息模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "是",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "教师",
            "tableName": "jiaoshi"
        }]
    }
}
export default menu;
