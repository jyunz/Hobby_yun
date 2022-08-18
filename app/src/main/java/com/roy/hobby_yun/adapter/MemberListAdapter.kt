package com.roy.hobby_yun.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.roy.hobby_yun.R
import com.roy.hobby_yun.data.Members

class MemberListAdapter(
    val mContext : Context ,
    val resId : Int,
    val mList : List<Members>) : ArrayAdapter<Members>(mContext, resId, mList) {


//    xml을 가지고 객체로 변환해주는 (화면에 뿌리도록 도와주는) 변수를 멤버변수로 생성

    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        convertView 는 재사용성에서 다시쓸 뷰가 있는지를 체크하는 부분

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inflater.inflate(R.layout.fragment_allmembers,null)
        }

        val row = tempRow!!

        return row
    }

}