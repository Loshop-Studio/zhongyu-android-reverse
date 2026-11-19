package p175w1;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: w1.a */
/* loaded from: classes3.dex */
public class C7809a extends Scroller {

    /* renamed from: a */
    public int f10372a;

    public C7809a(Context context, Interpolator interpolator, int i6) {
        super(context, interpolator);
        this.f10372a = i6;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i6, int i7, int i8, int i9, int i10) {
        super.startScroll(i6, i7, i8, i9, this.f10372a);
    }
}
