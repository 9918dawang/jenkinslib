package org.devops
//打印
def PrintMe(content){
  printf(content)
}


//格式化输出
def PrintMes(value,color){
   colors=['red':"\033[40;31n >>>>>>>>>>>${value}<<<<<<<<< \033[0n",
          'blue':"\033[47;34n ${value} \033[0n",
           'green':".[1;32m >>>>>>>>>>>${value}<<<<<<<<< [n",
           'green1':"\033[40;32m >>>>>>>>>>>${value}<<<<<<<<< \033[0m"]
  ansiColor('xterm') {
    println(colors[color])
  }
}
