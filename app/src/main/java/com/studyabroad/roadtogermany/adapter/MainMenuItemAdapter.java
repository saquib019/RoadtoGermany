package com.studyabroad.roadtogermany.adapter;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.studyabroad.roadtogermany.R;
import com.studyabroad.roadtogermany.pojo.MainMenuItems;

import java.util.List;


public class MainMenuItemAdapter extends RecyclerView.Adapter<MainMenuItemAdapter.CustomViewHolder>{
    private FragmentActivity myContext;
    private Context context;
    private List<MainMenuItems> ItemList;


    public MainMenuItemAdapter(Context context, List<MainMenuItems> ItemList) {
        this.context = context;
        this.ItemList = ItemList;
    }

    @NonNull
    @Override
    public MainMenuItemAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_main_menu_item,null);

        return new MainMenuItemAdapter.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CustomViewHolder holder, int position) {
        MainMenuItems items = ItemList.get(position);

        holder.itemName.setText(items.getItem());
        holder.definition.setText(items.getDefinition());



        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
                ProfileBottomSheet bottomSheet = new ProfileBottomSheet();
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                //            bottomSheet.setUser(empName,desgnation,pfNumber,phoneNumber,joinDate,"ICT Operation Department, Head Office");
                bottomSheet.show(activity.getSupportFragmentManager(), "profileBottomSheet");

*/

            }
        });
    }




    @Override
    public int getItemCount() {
        return ItemList.size();
    }



    public class CustomViewHolder extends RecyclerView.ViewHolder{

        private TextView itemName,definition;
        private RelativeLayout parentLayout;
        private  androidx.cardview.widget.CardView cardView;


        public CustomViewHolder(View itemView) {
            super(itemView);

            itemName = (TextView)itemView.findViewById(R.id.itemName);
            definition = (TextView)itemView.findViewById(R.id.definition);



            // parentLayout = itemView.findViewById(R.id.parent_layout);
            cardView = itemView.findViewById(R.id.itemViewCV);

        }
    }


}