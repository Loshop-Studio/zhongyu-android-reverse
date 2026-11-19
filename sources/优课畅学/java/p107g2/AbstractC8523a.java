package p107g2;

import android.content.Context;
import android.widget.OverScroller;

/* renamed from: g2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC8523a extends AbstractC8525c {

    /* renamed from: a */
    public final OverScroller f16107a;

    public AbstractC8523a(Context context) {
        this.f16107a = new OverScroller(context);
    }

    @Override // p107g2.AbstractC8525c
    /* renamed from: b */
    public void mo13886b(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f16107a.fling(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19);
    }

    @Override // p107g2.AbstractC8525c
    /* renamed from: c */
    public void mo13887c(boolean z10) {
        this.f16107a.forceFinished(z10);
    }

    @Override // p107g2.AbstractC8525c
    /* renamed from: d */
    public int mo13888d() {
        return this.f16107a.getCurrX();
    }

    @Override // p107g2.AbstractC8525c
    /* renamed from: e */
    public int mo13889e() {
        return this.f16107a.getCurrY();
    }

    @Override // p107g2.AbstractC8525c
    /* renamed from: g */
    public boolean mo13890g() {
        return this.f16107a.isFinished();
    }
}
