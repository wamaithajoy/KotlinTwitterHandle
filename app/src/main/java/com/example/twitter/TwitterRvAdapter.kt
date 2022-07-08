package com.example.twitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRvAdapter(var twitterlist:List<Twitter>) :
RecyclerView.Adapter<TweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_list_item,parent,false)
        return TweetViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currentTweet=twitterlist.get(position)
        holder.tvretweets.text=currentTweet.retweets
        holder.tvName.text=currentTweet.username
        holder.tvHandle.text=currentTweet.handle
        holder.tvTweet.text=currentTweet.tweet
        holder.tvcomments.text=currentTweet.comments
        holder.tvlikes.text=currentTweet.like


    }

    override fun getItemCount(): Int {
       return twitterlist.size
    }


}
class TweetViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView){
            var tvretweets=itemView.findViewById<TextView>(R.id.tvretweets)
            var imgPerson=itemView.findViewById<ImageView>(R.id.imgPerson)
            var tvName=itemView.findViewById<TextView>(R.id.tvName)
            var tvHandle=itemView.findViewById<TextView>(R.id.tvHandle)
            var tvTweet=itemView.findViewById<TextView>(R.id.tvTweet)
            var imgComment=itemView.findViewById<ImageView>(R.id.imgComment)
            var imgLike=itemView.findViewById<ImageView>(R.id.imgLike)
            var imgRetween=itemView.findViewById<ImageView>(R.id.imgRetween)
            var imgShare=itemView.findViewById<ImageView>(R.id.imgShare)
            var tvcomments=itemView.findViewById<TextView>(R.id.tvcomments)
            var tvlikes=itemView.findViewById<TextView>(R.id.tvlikes)

        }