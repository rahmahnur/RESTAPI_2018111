package com.example.tugas_api.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas_api.R;
import com.example.tugas_api.model.SportsItem;

import java.util.List;

public class SportAdapter extends RecyclerView.Adapter<SportAdapter.SekolahViewHolder>{
  private final Context context;
  private List<SportsItem> sportsItems;

  public SportAdapter(Context context, List<SportsItem> sportsItems) {
    this.context = context;
    this.sportsItems = sportsItems;
  }

  public List<SportsItem> getSportsItems() {
    return sportsItems;
  }

  public void setSportsItems(List<SportsItem> sportsItems) {
    this.sportsItems = sportsItems;
  }


  @NonNull
  @Override
  public SportAdapter.SekolahViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(context).inflate(R.layout.item_sekolah, parent, false);
    return new SekolahViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull SportAdapter.SekolahViewHolder holder, int position) {
    SportsItem sportsItem = getSportsItems().get(position);
    holder.textView1.setText(sportsItem.getStrSport());
    holder.textView2.setText(sportsItem.getStrFormat());
  }

  @Override
  public int getItemCount() {
    return sportsItems.size();
  }

  public class SekolahViewHolder extends RecyclerView.ViewHolder {
    TextView textView1, textView2, textView3;
    public SekolahViewHolder(@NonNull View itemView) {
      super(itemView);
      textView1 = itemView.findViewById(R.id.textView1);
      textView2 = itemView.findViewById(R.id.textView2);
    }
  }
}
