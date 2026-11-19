package com.lljjcoder.style.cityjd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.lljjcoder.bean.CityBean;
import com.lljjcoder.style.citypickerview.C5752R;
import java.util.List;

/* loaded from: classes3.dex */
public class CityAdapter extends BaseAdapter {
    private int cityIndex = -1;
    Context context;
    List<CityBean> mCityList;

    public class Holder {
        TextView name;
        ImageView selectImg;

        public Holder() {
        }
    }

    public CityAdapter(Context context, List<CityBean> list) {
        this.context = context;
        this.mCityList = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mCityList.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i6) {
        return Long.parseLong(this.mCityList.get(i6).getId());
    }

    public int getSelectedPosition() {
        return this.cityIndex;
    }

    @Override // android.widget.Adapter
    public View getView(int i6, View view, ViewGroup viewGroup) {
        Holder holder;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C5752R.layout.pop_jdcitypicker_item, viewGroup, false);
            holder = new Holder();
            holder.name = (TextView) view.findViewById(C5752R.id.name);
            holder.selectImg = (ImageView) view.findViewById(C5752R.id.selectImg);
            view.setTag(holder);
        } else {
            holder = (Holder) view.getTag();
        }
        CityBean item = getItem(i6);
        holder.name.setText(item.getName());
        int i7 = this.cityIndex;
        boolean z6 = i7 != -1 && this.mCityList.get(i7).getName().equals(item.getName());
        holder.name.setEnabled(!z6);
        holder.selectImg.setVisibility(z6 ? 0 : 8);
        return view;
    }

    public void updateSelectedPosition(int i6) {
        this.cityIndex = i6;
    }

    @Override // android.widget.Adapter
    public CityBean getItem(int i6) {
        return this.mCityList.get(i6);
    }
}
