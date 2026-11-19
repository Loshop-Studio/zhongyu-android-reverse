package p291x3;

import android.content.Context;
import android.widget.OverScroller;

/* renamed from: x3.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9874a extends AbstractC9876c {

    /* renamed from: a */
    public final OverScroller f17630a;

    public AbstractC9874a(Context context) {
        this.f17630a = new OverScroller(context);
    }

    @Override // p291x3.AbstractC9876c
    /* renamed from: b */
    public void mo16872b(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f17630a.fling(i9, i10, i11, i12, i13, i14, i15, i16, i17, i18);
    }

    @Override // p291x3.AbstractC9876c
    /* renamed from: c */
    public void mo16873c(boolean z9) {
        this.f17630a.forceFinished(z9);
    }

    @Override // p291x3.AbstractC9876c
    /* renamed from: d */
    public int mo16874d() {
        return this.f17630a.getCurrX();
    }

    @Override // p291x3.AbstractC9876c
    /* renamed from: e */
    public int mo16875e() {
        return this.f17630a.getCurrY();
    }

    @Override // p291x3.AbstractC9876c
    /* renamed from: g */
    public boolean mo16876g() {
        return this.f17630a.isFinished();
    }
}
