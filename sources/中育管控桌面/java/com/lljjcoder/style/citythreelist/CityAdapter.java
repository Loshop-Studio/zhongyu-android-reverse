package com.lljjcoder.style.citythreelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.lljjcoder.style.citylist.bean.CityInfoBean;
import com.lljjcoder.style.citypickerview.C5752R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class CityAdapter extends RecyclerView.Adapter<MyViewHolder> {
    List<CityInfoBean> cityList;
    Context context;
    private OnItemSelectedListener mOnItemClickListener;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: tv */
        TextView f3682tv;

        public MyViewHolder(View view) {
            super(view);
            this.f3682tv = (TextView) view.findViewById(C5752R.id.default_item_city_name_tv);
        }
    }

    public interface OnItemSelectedListener {
        void onItemSelected(View view, int i6);
    }

    public CityAdapter(Context context, List<CityInfoBean> list) {
        new ArrayList();
        this.cityList = list;
        this.context = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.cityList.size();
    }

    public void setOnItemClickListener(OnItemSelectedListener onItemSelectedListener) {
        this.mOnItemClickListener = onItemSelectedListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(MyViewHolder myViewHolder, final int i6) {
        myViewHolder.f3682tv.setText(this.cityList.get(i6).getName());
        myViewHolder.f3682tv.setOnClickListener(new View.OnClickListener() { // from class: com.lljjcoder.style.citythreelist.CityAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (CityAdapter.this.mOnItemClickListener == null || i6 >= CityAdapter.this.cityList.size()) {
                    return;
                }
                CityAdapter.this.mOnItemClickListener.onItemSelected(view, i6);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i6) {
        return new MyViewHolder(LayoutInflater.from(this.context).inflate(C5752R.layout.item_citylist, viewGroup, false));
    }
}
