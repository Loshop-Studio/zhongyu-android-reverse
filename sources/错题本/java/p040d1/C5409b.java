package p040d1;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.runtime.MutableState;
import com.google.accompanist.drawablepainter.DrawablePainter;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: d1.b */
/* loaded from: classes2.dex */
public final class C5409b implements Drawable.Callback {

    /* renamed from: a */
    public final /* synthetic */ DrawablePainter f8369a;

    public C5409b(DrawablePainter drawablePainter) {
        this.f8369a = drawablePainter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable d9) {
        AbstractC5830k.m5330g(d9, "d");
        DrawablePainter drawablePainter = this.f8369a;
        MutableState mutableState = drawablePainter.f2797b;
        mutableState.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue() + 1));
        drawablePainter.f2798c.setValue(Size.m10498boximpl(AbstractC5410c.m4800a(drawablePainter.f2796a)));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [d6.e, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable d9, Runnable what, long j7) {
        AbstractC5830k.m5330g(d9, "d");
        AbstractC5830k.m5330g(what, "what");
        ((Handler) AbstractC5410c.f8370a.getValue()).postAtTime(what, j7);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [d6.e, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable d9, Runnable what) {
        AbstractC5830k.m5330g(d9, "d");
        AbstractC5830k.m5330g(what, "what");
        ((Handler) AbstractC5410c.f8370a.getValue()).removeCallbacks(what);
    }
}
