def call(){
  timeout(time: 1, unit: "MINUTEs"){
    waitForQualityGate abortpipeline: false
  }
}
