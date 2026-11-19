package p136p3;

import android.database.DataSetObserver;
import com.xuexiang.xui.widget.tabbar.TabSegment;

/* renamed from: p3.g */
/* loaded from: classes3.dex */
public final class C6369g extends DataSetObserver {

    /* renamed from: a */
    public final boolean f10410a;

    /* renamed from: b */
    public final /* synthetic */ TabSegment f10411b;

    public C6369g(TabSegment tabSegment, boolean z8) {
        this.f10411b = tabSegment;
        this.f10410a = z8;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f10411b.m3593g(this.f10410a);
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f10411b.m3593g(this.f10410a);
    }
}
