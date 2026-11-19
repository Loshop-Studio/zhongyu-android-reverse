package p076i2;

import android.content.Context;
import android.widget.OverScroller;

/* renamed from: i2.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6517a extends AbstractC6519c {

    /* renamed from: a */
    public final OverScroller f8339a;

    public AbstractC6517a(Context context) {
        this.f8339a = new OverScroller(context);
    }

    @Override // p076i2.AbstractC6519c
    /* renamed from: b */
    public void mo7261b(int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f8339a.fling(i6, i7, i8, i9, i10, i11, i12, i13, i14, i15);
    }

    @Override // p076i2.AbstractC6519c
    /* renamed from: c */
    public void mo7262c(boolean z6) {
        this.f8339a.forceFinished(z6);
    }

    @Override // p076i2.AbstractC6519c
    /* renamed from: d */
    public int mo7263d() {
        return this.f8339a.getCurrX();
    }

    @Override // p076i2.AbstractC6519c
    /* renamed from: e */
    public int mo7264e() {
        return this.f8339a.getCurrY();
    }

    @Override // p076i2.AbstractC6519c
    /* renamed from: g */
    public boolean mo7265g() {
        return this.f8339a.isFinished();
    }
}
