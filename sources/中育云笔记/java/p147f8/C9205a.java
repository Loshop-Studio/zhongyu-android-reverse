package p147f8;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: f8.a */
/* loaded from: classes5.dex */
public class C9205a extends Scroller {

    /* renamed from: a */
    public int f21454a;

    public C9205a(Context context, Interpolator interpolator, int i10) {
        super(context, interpolator);
        this.f21454a = i10;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i10, int i11, int i12, int i13, int i14) {
        super.startScroll(i10, i11, i12, i13, this.f21454a);
    }
}
