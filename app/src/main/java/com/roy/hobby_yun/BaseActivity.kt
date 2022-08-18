package com.roy.hobby_yun

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

//    this는 어떤 화면에서 작업이 이루어지는지 알려주는 용도로 사용.
//    그러나 앱구조가 복잡해지면 this이외의 키워드를 찾아내서 사용해야 함.
//    그것이 불편하고 헷갈리기때문에 어느곳에서 사용하던 같은 키워드로 통일 => mContext
//     val mContext = this 를 멤버변수로 생성해 두고 상속받아서 사용.
//     Toast, Alert 등에서 this를 사용해야 할 때 mContext 를 대신 대입

    val mContext = this

//     이벤트 처리와 데이터띄우는 것은 따로 처리 하기 위해서 setupEvents 와  setValues 두가지로 정리
//    그런데 이벤트 처리가 한가지만 있는게 아니고 여러가지가 각각있기 때문에 fun setupEvents() {}가 정석인데
//    {}를 안하고 따로 설정 그러므로 fun setupEvents()가 필요는 한데 지금 안써.의 의미로 abstract 를 사용

    abstract fun setupEvents()
    abstract fun setupValues()

}