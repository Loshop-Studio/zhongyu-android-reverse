package com.zykj.video.play.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zykj.video.play.R$id;
import com.zykj.video.play.R$layout;
import java.util.ArrayList;
import java.util.List;
import p143j5.C9020g;

/* loaded from: classes5.dex */
public class TCVodQualityView extends RelativeLayout {

    /* renamed from: a */
    public Context f14779a;

    /* renamed from: b */
    public InterfaceC8189b f14780b;

    /* renamed from: c */
    public ListView f14781c;

    /* renamed from: d */
    public C8190c f14782d;

    /* renamed from: e */
    public List f14783e;

    /* renamed from: f */
    public int f14784f;

    /* renamed from: com.zykj.video.play.view.TCVodQualityView$a */
    public class C8188a implements AdapterView.OnItemClickListener {
        public C8188a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            C9020g c9020g;
            if (TCVodQualityView.this.f14780b != null && TCVodQualityView.this.f14783e != null && TCVodQualityView.this.f14783e.size() > 0 && (c9020g = (C9020g) TCVodQualityView.this.f14783e.get(i10)) != null && i10 != TCVodQualityView.this.f14784f) {
                TCVodQualityView.this.f14780b.mo12463f(c9020g);
            }
            TCVodQualityView.this.f14784f = i10;
            TCVodQualityView.this.f14782d.notifyDataSetChanged();
        }
    }

    /* renamed from: com.zykj.video.play.view.TCVodQualityView$b */
    public interface InterfaceC8189b {
        /* renamed from: f */
        void mo12463f(C9020g c9020g);
    }

    /* renamed from: com.zykj.video.play.view.TCVodQualityView$c */
    public class C8190c extends BaseAdapter {
        public C8190c() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return TCVodQualityView.this.f14783e.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return Integer.valueOf(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                TCVodQualityView tCVodQualityView = TCVodQualityView.this;
                view = tCVodQualityView.new C8191d(tCVodQualityView.f14779a);
            }
            C8191d c8191d = (C8191d) view;
            c8191d.setSelected(false);
            c8191d.m12557b(((C9020g) TCVodQualityView.this.f14783e.get(i10)).f17245d);
            if (TCVodQualityView.this.f14784f == i10) {
                c8191d.setSelected(true);
            }
            return c8191d;
        }
    }

    /* renamed from: com.zykj.video.play.view.TCVodQualityView$d */
    public class C8191d extends RelativeLayout {

        /* renamed from: a */
        public TextView f14787a;

        public C8191d(Context context) {
            super(context);
            m12556a(context);
        }

        /* renamed from: a */
        public final void m12556a(Context context) {
            LayoutInflater.from(context).inflate(R$layout.superplayer_quality_item_view, this);
            this.f14787a = (TextView) findViewById(R$id.superplayer_tv_quality);
        }

        /* renamed from: b */
        public void m12557b(String str) {
            this.f14787a.setText(str);
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            this.f14787a.setSelected(z10);
        }
    }

    public TCVodQualityView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14784f = -1;
        m12555g(context);
    }

    /* renamed from: g */
    public final void m12555g(Context context) {
        this.f14779a = context;
        this.f14783e = new ArrayList();
        LayoutInflater.from(this.f14779a).inflate(R$layout.superplayer_quality_popup_view, this);
        ListView listView = (ListView) findViewById(R$id.superplayer_lv_quality);
        this.f14781c = listView;
        listView.setOnItemClickListener(new C8188a());
        C8190c c8190c = new C8190c();
        this.f14782d = c8190c;
        this.f14781c.setAdapter((ListAdapter) c8190c);
    }

    public void setCallback(InterfaceC8189b interfaceC8189b) {
        this.f14780b = interfaceC8189b;
    }

    public void setDefaultSelectedQuality(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f14784f = i10;
        this.f14782d.notifyDataSetChanged();
    }

    public void setVideoQualityList(List<C9020g> list) {
        this.f14783e.clear();
        this.f14783e.addAll(list);
        C8190c c8190c = this.f14782d;
        if (c8190c != null) {
            c8190c.notifyDataSetChanged();
        }
    }
}
