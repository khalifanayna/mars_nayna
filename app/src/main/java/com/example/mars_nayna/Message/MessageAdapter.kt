
package com.example.mars_nayna.Message

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.bumptech.glide.Glide
import com.example.mars_nayna.Home.Pertemuan_5.FifthActivity
import com.example.mars_nayna.databinding.ItemMessageBinding
import com.google.android.material.snackbar.Snackbar

class MessageAdapter(
    context: Context,
    private val messages: List<MessageModel>
) : ArrayAdapter<MessageModel>(context, 0, messages) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val binding = ItemMessageBinding.inflate(
            LayoutInflater.from(context),
            parent,
            false
        )

        val view = binding.root
        val data = messages[position]

        Glide.with(context)
            .load(data.avatarUrl)
            .into(binding.avatarImg)

        binding.textSender.text = data.senderName
        binding.textMessage.text = data.messageText
        binding.textAge.text = "${data.age}"

        view.setOnClickListener {
//            val i = Intent(context, FifthActivity::class.java)
//            context.startActivity(i)
//
//            i.putExtra("nama", data.senderName)

            Snackbar.make(
                parent,
                "Pesan dari ${data.senderName}: ${data.messageText}",
                Snackbar.LENGTH_SHORT
            ).show()
        }

        return view
    }
}
