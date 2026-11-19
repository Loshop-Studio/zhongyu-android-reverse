package p108h3;

import android.content.Context;
import android.widget.OverScroller;

/* renamed from: h3.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7620a extends AbstractC7622c {

    /* renamed from: a */
    public final OverScroller f12781a;

    public AbstractC7620a(Context context) {
        this.f12781a = new OverScroller(context);
    }

    @Override // p108h3.AbstractC7622c
    /* renamed from: b */
    public void mo12545b(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f12781a.fling(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19);
    }

    @Override // p108h3.AbstractC7622c
    /* renamed from: c */
    public void mo12546c(boolean z9) {
        this.f12781a.forceFinished(z9);
    }

    @Override // p108h3.AbstractC7622c
    /* renamed from: d */
    public int mo12547d() {
        return this.f12781a.getCurrX();
    }

    @Override // p108h3.AbstractC7622c
    /* renamed from: e */
    public int mo12548e() {
        return this.f12781a.getCurrY();
    }

    @Override // p108h3.AbstractC7622c
    /* renamed from: g */
    public boolean mo12549g() {
        return this.f12781a.isFinished();
    }
}
