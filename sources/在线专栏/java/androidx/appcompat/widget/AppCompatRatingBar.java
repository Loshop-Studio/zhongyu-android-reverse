package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p015c.C1038a;

/* loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* renamed from: a */
    private final C0217i f842a;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1038a.f5729H);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        Bitmap bitmapM884b = this.f842a.m884b();
        if (bitmapM884b != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapM884b.getWidth() * getNumStars(), i4, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        C0204b0.m762a(this, getContext());
        C0217i c0217i = new C0217i(this);
        this.f842a = c0217i;
        c0217i.mo885c(attributeSet, i4);
    }
}
