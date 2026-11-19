package p047c9;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.utils.AbstractC8041g;
import com.xuexiang.xui.widget.XUIWrapContentListView;
import p420y7.AbstractC11916b;

/* renamed from: c9.a */
/* loaded from: classes5.dex */
public abstract class AbstractC5408a extends AbstractC5409b {

    /* renamed from: A */
    public boolean f3456A;

    /* renamed from: y */
    public ListView f3457y;

    /* renamed from: z */
    public ListAdapter f3458z;

    public AbstractC5408a(Context context, ListAdapter listAdapter) {
        super(context);
        this.f3458z = listAdapter;
    }

    /* renamed from: w */
    public AbstractC5408a m2846w(int i10, int i11) {
        int iM12188b = AbstractC8037c.m12188b(m13052d(), 5.0f);
        if (i11 != 0) {
            this.f3457y = new XUIWrapContentListView(m13052d(), i11);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
            layoutParams.setMargins(0, iM12188b, 0, iM12188b);
            this.f3457y.setLayoutParams(layoutParams);
        } else {
            this.f3457y = new XUIWrapContentListView(m13052d());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, -2);
            layoutParams2.setMargins(0, iM12188b, 0, iM12188b);
            this.f3457y.setLayoutParams(layoutParams2);
        }
        this.f3457y.setPadding(iM12188b, 0, iM12188b, 0);
        this.f3457y.setAdapter(this.f3458z);
        this.f3457y.setVerticalScrollBarEnabled(false);
        this.f3457y.setOverScrollMode(2);
        m2848y(this.f3457y);
        mo2850m(this.f3457y);
        return this;
    }

    /* renamed from: x */
    public AbstractC5408a m2847x(boolean z10) {
        this.f3456A = z10;
        ListView listView = this.f3457y;
        if (listView != null) {
            m2848y(listView);
        }
        return this;
    }

    /* renamed from: y */
    public final void m2848y(ListView listView) {
        if (!this.f3456A) {
            listView.setDivider(null);
            return;
        }
        listView.setDivider(new ColorDrawable(AbstractC8041g.m12217d(m13052d(), R$attr.xui_config_color_separator_light)));
        if (AbstractC11916b.m26463g()) {
            listView.setDividerHeight(AbstractC8037c.m12188b(m13052d(), 1.0f));
        } else {
            listView.setDividerHeight(AbstractC8037c.m12188b(m13052d(), 0.5f));
        }
    }
}
