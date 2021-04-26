package com.ibmclub.discounts;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ibmclub.discounts.models.Post;
import com.ibmclub.discounts.models.Posts;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

	private List<Post> posts;
	private int rowLayout;

	public PostAdapter(Posts posts, int rowLayout) {
		this.posts = posts.getPosts();
		this.rowLayout = rowLayout;
	}

	@Override
	public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
		return new PostViewHolder(view);
	}

	@Override
	public void onBindViewHolder(PostViewHolder holder, final int position) {
		holder.name.setText(posts.get(position).getName());
//		holder.title.setText(posts.get(position).getTitle());
		holder.category.setText(posts.get(position).getCategory());
		holder.description.setText(posts.get(position).getUrl());
	}

	@Override
	public int getItemCount() {
		return posts.size();
	}

	static class PostViewHolder extends RecyclerView.ViewHolder {
		TextView name;
//		TextView title;
		TextView category;
		TextView description;

		PostViewHolder(View v) {
			super(v);
			name = (TextView) v.findViewById(R.id.name);
//			title = (TextView) v.findViewById(R.id.title);
			category = (TextView) v.findViewById(R.id.category);
			description = (TextView) v.findViewById(R.id.description);
		}
	}
}