package com.lljjcoder.style.cityjd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.lljjcoder.bean.ProvinceBean;
import com.lljjcoder.style.citypickerview.C5752R;
import java.util.List;

/* loaded from: classes3.dex */
public class ProvinceAdapter extends BaseAdapter {
    Context context;
    List<ProvinceBean> mProList;
    private int provinceIndex = -1;

    public class Holder {
        TextView name;
        ImageView selectImg;

        public Holder() {
        }
    }

    public ProvinceAdapter(Context context, List<ProvinceBean> list) {
        this.context = context;
        this.mProList = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mProList.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i6) {
        return Long.parseLong(this.mProList.get(i6).getId());
    }

    public int getSelectedPosition() {
        return this.provinceIndex;
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
        ProvinceBean item = getItem(i6);
        holder.name.setText(item.getName());
        int i7 = this.provinceIndex;
        boolean z6 = i7 != -1 && this.mProList.get(i7).getName().equals(item.getName());
        holder.name.setEnabled(!z6);
        holder.selectImg.setVisibility(z6 ? 0 : 8);
        return view;
    }

    public void updateSelectedPosition(int i6) {
        this.provinceIndex = i6;
    }

    @Override // android.widget.Adapter
    public ProvinceBean getItem(int i6) {
        return this.mProList.get(i6);
    }
}
