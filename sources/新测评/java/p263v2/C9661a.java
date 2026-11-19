package p263v2;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: v2.a */
/* loaded from: classes4.dex */
public class C9661a extends Scroller {

    /* renamed from: a */
    public int f16917a;

    public C9661a(Context context, Interpolator interpolator, int i10) {
        super(context, interpolator);
        this.f16917a = i10;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i10, int i11, int i12, int i13, int i14) {
        super.startScroll(i10, i11, i12, i13, this.f16917a);
    }
}
