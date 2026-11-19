package p240s2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import java.util.List;

/* renamed from: s2.b */
/* loaded from: classes4.dex */
public abstract class AbstractC9971b extends BaseAdapter {

    /* renamed from: a */
    public final Context f20010a;

    /* renamed from: b */
    public int f20011b;

    /* renamed from: c */
    public int f20012c;

    /* renamed from: d */
    public float f20013d;

    /* renamed from: e */
    public int f20014e;

    /* renamed from: s2.b$b */
    public static class b {

        /* renamed from: a */
        public TextView f20015a;

        public b(TextView textView) {
            this.f20015a = textView;
        }
    }

    public AbstractC9971b(Context context) {
        this.f20010a = context;
    }

    /* renamed from: a */
    public abstract Object mo18653a(int i10);

    /* renamed from: b */
    public String m18655b(int i10) {
        return getItem(i10).toString();
    }

    /* renamed from: c */
    public abstract List mo18654c();

    /* renamed from: d */
    public int m18656d() {
        return this.f20011b;
    }

    /* renamed from: e */
    public void m18657e(int i10) {
        this.f20011b = i10;
    }

    /* renamed from: f */
    public AbstractC9971b m18658f(int i10) {
        this.f20012c = i10;
        return this;
    }

    /* renamed from: g */
    public AbstractC9971b m18659g(float f10) {
        this.f20013d = f10;
        return this;
    }

    @Override // android.widget.Adapter
    public abstract int getCount();

    @Override // android.widget.Adapter
    public abstract Object getItem(int i10);

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView;
        if (view == null) {
            view = LayoutInflater.from(this.f20010a).inflate(R$layout.ms_layout_list_item, viewGroup, false);
            textView = (TextView) view.findViewById(R$id.tv_tinted_spinner);
            textView.setTextColor(this.f20012c);
            textView.setTextSize(0, this.f20013d);
            int i11 = this.f20014e;
            if (i11 != 0) {
                textView.setBackgroundResource(i11);
            }
            if (this.f20010a.getResources().getConfiguration().getLayoutDirection() == 1) {
                textView.setTextDirection(4);
            }
            view.setTag(new b(textView));
        } else {
            textView = ((b) view.getTag()).f20015a;
        }
        textView.setText(m18655b(i10));
        return view;
    }
}
