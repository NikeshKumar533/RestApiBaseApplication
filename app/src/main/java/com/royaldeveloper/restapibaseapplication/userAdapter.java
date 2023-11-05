package com.royaldeveloper.restapibaseapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class userAdapter extends RecyclerView.Adapter<userAdapter.userHolder> {
    MainActivity mainActivity;
    List<userModel> allUserList;
    public userAdapter(MainActivity mainActivity,List<userModel> allUserList) {
        this.mainActivity=mainActivity;
        this.allUserList=allUserList;
    }

    @NonNull
    @Override
    public userHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new userHolder(LayoutInflater.from(mainActivity).inflate(R.layout.item_user,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull userHolder holder, int position) {
        holder.albumId.setText("albumId: "+allUserList.get(position).getAlbumId());
        holder.id.setText("id: "+allUserList.get(position).getId());
        holder.title.setText(allUserList.get(position).getTitle());

        String imageUrl=allUserList.get(position).getUrl();
        Picasso.get()
                .load(imageUrl)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return allUserList.size();
    }

    class userHolder extends  RecyclerView.ViewHolder{
        TextView albumId,id,title;
        ImageView imageView;

        public userHolder(@NonNull View itemView) {
            super(itemView);

            albumId=itemView.findViewById(R.id.albumId);
            id=itemView.findViewById(R.id.id);
            title=itemView.findViewById(R.id.title);
            imageView=itemView.findViewById(R.id.imageView);

        }
    }
}
