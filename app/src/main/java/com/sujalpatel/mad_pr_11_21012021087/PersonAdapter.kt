package com.sujalpatel.mad_pr_11_21012021087

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.google.android.material.button.MaterialButton
import java.util.ArrayList

class PersonAdapter(val context:Context,val array:ArrayList<Person>):RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {


    inner class PersonViewHolder(val view: View):ViewHolder(view){

    }


//    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.person_item,parent,false)
//        val person_data = array.get(position)
//        view.findViewById<TextView>(R.id.textView_name).text=person_data.name
//        view.findViewById<TextView>(R.id.textView_no).text=person_data.phoneNo
//        view.findViewById<TextView>(R.id.textView_email).text=person_data.emailId
//        view.findViewById<TextView>(R.id.textView_address).text=person_data.address
//        view.findViewById<MaterialButton>(R.id.btn_location).setOnClickListener {
//            Intent(parent.context,MapsActivity::class.java).putExtra("Object",person_data).apply { context.startActivity(this) }
//        }
//        return view
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.person_item,parent,false)
        return PersonViewHolder(view)
    }

    override fun getItemCount(): Int {
       return array.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person_data = array.get(position)

        val view = holder.view
        view.findViewById<TextView>(R.id.textView_name).text=person_data.name
        view.findViewById<TextView>(R.id.textView_no).text=person_data.phoneNo
        view.findViewById<TextView>(R.id.textView_email).text=person_data.emailId
        view.findViewById<TextView>(R.id.textView_address).text=person_data.address
        view.findViewById<MaterialButton>(R.id.btn_location).setOnClickListener {
            Intent(context,MapsActivity::class.java).putExtra("Object",person_data).apply { context.startActivity(this) }
        }
    }

}