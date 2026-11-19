package p321r8;

import android.content.Context;
import android.widget.OverScroller;

/* renamed from: r8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10914a extends AbstractC10916c {

    /* renamed from: a */
    public final OverScroller f26347a;

    public AbstractC10914a(Context context) {
        this.f26347a = new OverScroller(context);
    }

    @Override // p321r8.AbstractC10916c
    /* renamed from: b */
    public void mo23754b(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f26347a.fling(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19);
    }

    @Override // p321r8.AbstractC10916c
    /* renamed from: c */
    public void mo23755c(boolean z10) {
        this.f26347a.forceFinished(z10);
    }

    @Override // p321r8.AbstractC10916c
    /* renamed from: d */
    public int mo23756d() {
        return this.f26347a.getCurrX();
    }

    @Override // p321r8.AbstractC10916c
    /* renamed from: e */
    public int mo23757e() {
        return this.f26347a.getCurrY();
    }

    @Override // p321r8.AbstractC10916c
    /* renamed from: g */
    public boolean mo23758g() {
        return this.f26347a.isFinished();
    }
}
