package p000a.p005b.p014h;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import io.github.inflationx.calligraphy3.C1088R;

/* renamed from: a.b.h.n */
/* loaded from: classes.dex */
public class C0095n extends RatingBar {

    /* renamed from: b */
    public final C0093m f716b;

    public C0095n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1088R.attr.ratingBarStyle);
        C0100p0.m376a(this, getContext());
        C0093m c0093m = new C0093m(this);
        this.f716b = c0093m;
        c0093m.mo363a(attributeSet, C1088R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f716b.f707b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
