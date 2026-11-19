package com.xuexiang.xui.widget.searchview;

import android.content.Context;
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
import com.xuexiang.xui.widget.searchview.AbstractC8249a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xuexiang.xui.widget.searchview.d */
/* loaded from: classes5.dex */
public class C8252d extends BaseAdapter implements Filterable, AbstractC8249a.a {

    /* renamed from: c */
    public List f16936c = new ArrayList();

    /* renamed from: d */
    public String[] f16937d;

    /* renamed from: e */
    public Drawable f16938e;

    /* renamed from: f */
    public LayoutInflater f16939f;

    /* renamed from: g */
    public boolean f16940g;

    /* renamed from: h */
    public AbstractC8249a f16941h;

    /* renamed from: com.xuexiang.xui.widget.searchview.d$a */
    public class a {

        /* renamed from: a */
        public TextView f16942a;

        /* renamed from: b */
        public ImageView f16943b;

        public a(View view) {
            this.f16942a = (TextView) view.findViewById(R$id.suggestion_text);
            if (C8252d.this.f16938e != null) {
                ImageView imageView = (ImageView) view.findViewById(R$id.suggestion_icon);
                this.f16943b = imageView;
                imageView.setImageDrawable(C8252d.this.f16938e);
            }
        }
    }

    public C8252d(Context context, String[] strArr, Drawable drawable, boolean z10) {
        this.f16939f = LayoutInflater.from(context);
        this.f16937d = strArr;
        this.f16938e = drawable;
        this.f16940g = z10;
        m13223c(new C8251c());
    }

    @Override // com.xuexiang.xui.widget.searchview.AbstractC8249a.a
    /* renamed from: a */
    public void mo13219a(List list) {
        this.f16936c = list;
        notifyDataSetChanged();
    }

    /* renamed from: c */
    public C8252d m13223c(AbstractC8249a abstractC8249a) {
        this.f16941h = abstractC8249a;
        abstractC8249a.m13218c(this.f16937d);
        this.f16941h.m13217b(this);
        return this;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f16936c.size();
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f16941h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f16936c.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = this.f16939f.inflate(R$layout.xui_layout_search_view_suggest_item, viewGroup, false);
            aVar = new a(view);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.f16942a.setText((String) getItem(i10));
        if (this.f16940g) {
            aVar.f16942a.setSingleLine();
            aVar.f16942a.setEllipsize(TextUtils.TruncateAt.END);
        }
        return view;
    }
}
