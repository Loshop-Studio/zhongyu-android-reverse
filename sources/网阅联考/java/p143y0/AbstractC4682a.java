package p143y0;

import android.content.Context;
import android.widget.OverScroller;

/* renamed from: y0.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4682a extends AbstractC4684c {

    /* renamed from: a */
    public final OverScroller f5999a;

    public AbstractC4682a(Context context) {
        this.f5999a = new OverScroller(context);
    }

    @Override // p143y0.AbstractC4684c
    /* renamed from: b */
    public void mo6612b(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f5999a.fling(i4, i5, i6, i7, i8, i9, i10, i11, i12, i13);
    }

    @Override // p143y0.AbstractC4684c
    /* renamed from: c */
    public void mo6613c(boolean z3) {
        this.f5999a.forceFinished(z3);
    }

    @Override // p143y0.AbstractC4684c
    /* renamed from: d */
    public int mo6614d() {
        return this.f5999a.getCurrX();
    }

    @Override // p143y0.AbstractC4684c
    /* renamed from: e */
    public int mo6615e() {
        return this.f5999a.getCurrY();
    }

    @Override // p143y0.AbstractC4684c
    /* renamed from: g */
    public boolean mo6616g() {
        return this.f5999a.isFinished();
    }
}
