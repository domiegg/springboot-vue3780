const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot8042nq26/",
            name: "springboot8042nq26",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot8042nq26/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校实验室预约系统"
        } 
    }
}
export default base
