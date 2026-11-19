package p107p0;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: p0.a */
/* loaded from: classes2.dex */
public class C4447a extends Scroller {

    /* renamed from: a */
    public int f5140a;

    public C4447a(Context context, Interpolator interpolator, int i4) {
        super(context, interpolator);
        this.f5140a = i4;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i4, int i5, int i6, int i7, int i8) {
        super.startScroll(i4, i5, i6, i7, this.f5140a);
    }
}
