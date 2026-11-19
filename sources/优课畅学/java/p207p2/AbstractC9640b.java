package p207p2;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC6872b;
import com.xuexiang.xui.utils.AbstractC6877g;
import com.xuexiang.xui.widget.XUIWrapContentListView;
import p150k1.AbstractC9051b;

/* renamed from: p2.b */
/* loaded from: classes4.dex */
public abstract class AbstractC9640b extends AbstractC9641c {

    /* renamed from: A */
    public boolean f19316A;

    /* renamed from: y */
    public ListView f19317y;

    /* renamed from: z */
    public ListAdapter f19318z;

    public AbstractC9640b(Context context, ListAdapter listAdapter) {
        super(context);
        this.f19318z = listAdapter;
    }

    /* renamed from: w */
    public AbstractC9640b m18221w(int i10, int i11) {
        int iM6425a = AbstractC6872b.m6425a(m18208d(), 5.0f);
        if (i11 != 0) {
            this.f19317y = new XUIWrapContentListView(m18208d(), i11);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
            layoutParams.setMargins(0, iM6425a, 0, iM6425a);
            this.f19317y.setLayoutParams(layoutParams);
        } else {
            this.f19317y = new XUIWrapContentListView(m18208d());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, -2);
            layoutParams2.setMargins(0, iM6425a, 0, iM6425a);
            this.f19317y.setLayoutParams(layoutParams2);
        }
        this.f19317y.setPadding(iM6425a, 0, iM6425a, 0);
        this.f19317y.setAdapter(this.f19318z);
        this.f19317y.setVerticalScrollBarEnabled(false);
        this.f19317y.setOverScrollMode(2);
        m18223y(this.f19317y);
        mo18217m(this.f19317y);
        return this;
    }

    /* renamed from: x */
    public AbstractC9640b m18222x(boolean z10) {
        this.f19316A = z10;
        ListView listView = this.f19317y;
        if (listView != null) {
            m18223y(listView);
        }
        return this;
    }

    /* renamed from: y */
    public final void m18223y(ListView listView) {
        if (!this.f19316A) {
            listView.setDivider(null);
            return;
        }
        listView.setDivider(new ColorDrawable(AbstractC6877g.m6479m(m18208d(), R$attr.xui_config_color_separator_light)));
        if (AbstractC9051b.m15853h()) {
            listView.setDividerHeight(AbstractC6872b.m6425a(m18208d(), 1.0f));
        } else {
            listView.setDividerHeight(AbstractC6872b.m6425a(m18208d(), 0.5f));
        }
    }
}
