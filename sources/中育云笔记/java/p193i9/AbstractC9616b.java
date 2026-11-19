package p193i9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import java.util.List;

/* renamed from: i9.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9616b extends BaseAdapter {

    /* renamed from: c */
    public final Context f22143c;

    /* renamed from: d */
    public int f22144d;

    /* renamed from: e */
    public int f22145e;

    /* renamed from: f */
    public float f22146f;

    /* renamed from: g */
    public int f22147g;

    /* renamed from: i9.b$b */
    public static class b {

        /* renamed from: a */
        public TextView f22148a;

        public b(TextView textView) {
            this.f22148a = textView;
        }
    }

    public AbstractC9616b(Context context) {
        this.f22143c = context;
    }

    /* renamed from: a */
    public abstract Object mo18844a(int i10);

    /* renamed from: b */
    public String m18846b(int i10) {
        return getItem(i10).toString();
    }

    /* renamed from: c */
    public abstract List mo18845c();

    /* renamed from: d */
    public int m18847d() {
        return this.f22144d;
    }

    /* renamed from: e */
    public void m18848e(int i10) {
        this.f22144d = i10;
    }

    /* renamed from: f */
    public AbstractC9616b m18849f(int i10) {
        this.f22145e = i10;
        return this;
    }

    /* renamed from: g */
    public AbstractC9616b m18850g(float f10) {
        this.f22146f = f10;
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
            view = LayoutInflater.from(this.f22143c).inflate(R$layout.ms_layout_list_item, viewGroup, false);
            textView = (TextView) view.findViewById(R$id.tv_tinted_spinner);
            textView.setTextColor(this.f22145e);
            textView.setTextSize(0, this.f22146f);
            int i11 = this.f22147g;
            if (i11 != 0) {
                textView.setBackgroundResource(i11);
            }
            if (this.f22143c.getResources().getConfiguration().getLayoutDirection() == 1) {
                textView.setTextDirection(4);
            }
            view.setTag(new b(textView));
        } else {
            textView = ((b) view.getTag()).f22148a;
        }
        textView.setText(m18846b(i10));
        return view;
    }
}
