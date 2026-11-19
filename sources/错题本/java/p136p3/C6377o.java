package p136p3;

import android.database.DataSetObserver;
import com.xuexiang.xui.widget.tabbar.VerticalTabLayout;

/* renamed from: p3.o */
/* loaded from: classes3.dex */
public final class C6377o extends DataSetObserver {

    /* renamed from: a */
    public final /* synthetic */ VerticalTabLayout f10425a;

    public C6377o(VerticalTabLayout verticalTabLayout) {
        this.f10425a = verticalTabLayout;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = VerticalTabLayout.f4959p;
        this.f10425a.m3603d();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = VerticalTabLayout.f4959p;
        this.f10425a.m3603d();
    }
}
