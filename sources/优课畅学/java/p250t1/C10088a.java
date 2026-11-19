package p250t1;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: t1.a */
/* loaded from: classes4.dex */
public class C10088a extends Scroller {

    /* renamed from: a */
    public int f20146a;

    public C10088a(Context context, Interpolator interpolator, int i10) {
        super(context, interpolator);
        this.f20146a = i10;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i10, int i11, int i12, int i13, int i14) {
        super.startScroll(i10, i11, i12, i13, this.f20146a);
    }
}
