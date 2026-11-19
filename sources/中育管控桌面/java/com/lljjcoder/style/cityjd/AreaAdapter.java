package com.lljjcoder.style.cityjd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.lljjcoder.bean.DistrictBean;
import com.lljjcoder.style.citypickerview.C5752R;
import java.util.List;

/* loaded from: classes3.dex */
public class AreaAdapter extends BaseAdapter {
    Context context;
    private int districtIndex = -1;
    List<DistrictBean> mDistrictList;

    public class Holder {
        TextView name;
        ImageView selectImg;

        public Holder() {
        }
    }

    public AreaAdapter(Context context, List<DistrictBean> list) {
        this.context = context;
        this.mDistrictList = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mDistrictList.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i6) {
        return Long.parseLong(this.mDistrictList.get(i6).getId());
    }

    public int getSelectedPosition() {
        return this.districtIndex;
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
        DistrictBean item = getItem(i6);
        holder.name.setText(item.getName());
        int i7 = this.districtIndex;
        boolean z6 = i7 != -1 && this.mDistrictList.get(i7).getName().equals(item.getName());
        holder.name.setEnabled(!z6);
        holder.selectImg.setVisibility(z6 ? 0 : 8);
        return view;
    }

    public void updateSelectedPosition(int i6) {
        this.districtIndex = i6;
    }

    @Override // android.widget.Adapter
    public DistrictBean getItem(int i6) {
        return this.mDistrictList.get(i6);
    }
}
