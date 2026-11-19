package p167l3;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: l3.a */
/* loaded from: classes4.dex */
public class C8883a extends Scroller {

    /* renamed from: a */
    public int f14679a;

    public C8883a(Context context, Interpolator interpolator, int i9) {
        super(context, interpolator);
        this.f14679a = i9;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i9, int i10, int i11, int i12, int i13) {
        super.startScroll(i9, i10, i11, i12, this.f14679a);
    }
}
