package p000a.p005b.p014h;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import io.github.inflationx.calligraphy3.C1088R;

/* renamed from: a.b.h.p */
/* loaded from: classes.dex */
public class C0099p extends SeekBar {

    /* renamed from: b */
    public final C0101q f743b;

    public C0099p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1088R.attr.seekBarStyle);
        C0100p0.m376a(this, getContext());
        C0101q c0101q = new C0101q(this);
        this.f743b = c0101q;
        c0101q.mo363a(attributeSet, C1088R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0101q c0101q = this.f743b;
        Drawable drawable = c0101q.f752e;
        if (drawable != null && drawable.isStateful() && drawable.setState(c0101q.f751d.getDrawableState())) {
            c0101q.f751d.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f743b.f752e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f743b.m381d(canvas);
    }
}
