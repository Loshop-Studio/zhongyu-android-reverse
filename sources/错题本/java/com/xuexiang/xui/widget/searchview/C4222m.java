package com.xuexiang.xui.widget.searchview;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import java.util.List;

/* renamed from: com.xuexiang.xui.widget.searchview.m */
/* loaded from: classes3.dex */
public final class C4222m extends BaseAdapter implements Filterable {

    /* renamed from: a */
    public List f4866a;

    /* renamed from: b */
    public String[] f4867b;

    /* renamed from: c */
    public Drawable f4868c;

    /* renamed from: d */
    public LayoutInflater f4869d;

    /* renamed from: e */
    public boolean f4870e;

    /* renamed from: f */
    public AbstractC4210a f4871f;

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f4866a.size();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.f4871f;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f4866a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C4221l c4221l;
        Drawable drawable = this.f4868c;
        if (view == null) {
            view = this.f4869d.inflate(R$layout.xui_layout_search_view_suggest_item, viewGroup, false);
            c4221l = new C4221l();
            c4221l.f4865a = (TextView) view.findViewById(R$id.suggestion_text);
            if (drawable != null) {
                ((ImageView) view.findViewById(R$id.suggestion_icon)).setImageDrawable(drawable);
            }
            view.setTag(c4221l);
        } else {
            c4221l = (C4221l) view.getTag();
        }
        String str = (String) this.f4866a.get(i);
        TextView textView = c4221l.f4865a;
        textView.setText(str);
        if (this.f4870e) {
            textView.setSingleLine();
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        return view;
    }
}
