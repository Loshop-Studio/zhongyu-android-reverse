package p190w3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.p035xw.repo.BubbleSeekBar;

/* renamed from: w3.d */
/* loaded from: classes3.dex */
public final class C6712d extends View {

    /* renamed from: a */
    public final Paint f11325a;

    /* renamed from: b */
    public final Path f11326b;

    /* renamed from: c */
    public final RectF f11327c;

    /* renamed from: d */
    public final Rect f11328d;

    /* renamed from: e */
    public String f11329e;

    /* renamed from: f */
    public final /* synthetic */ BubbleSeekBar f11330f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6712d(BubbleSeekBar bubbleSeekBar, Context context) {
        super(context, null, 0);
        this.f11330f = bubbleSeekBar;
        this.f11329e = "";
        Paint paint = new Paint();
        this.f11325a = paint;
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        this.f11326b = new Path();
        this.f11327c = new RectF();
        this.f11328d = new Rect();
    }

    /* renamed from: a */
    public final void m6405a(String str) {
        if (str == null || this.f11329e.equals(str)) {
            return;
        }
        this.f11329e = str;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f11326b;
        path.reset();
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight();
        BubbleSeekBar bubbleSeekBar = this.f11330f;
        float f = measuredHeight - (bubbleSeekBar.f5135e0 / 3.0f);
        path.moveTo(measuredWidth, f);
        double dSqrt = Math.sqrt(3.0d) / 2.0d;
        int i = bubbleSeekBar.f5135e0;
        float measuredWidth2 = (float) ((getMeasuredWidth() / 2.0f) - (dSqrt * i));
        float f7 = i * 1.5f;
        path.quadTo(measuredWidth2 - AbstractC6715g.m6407a(2), f7 - AbstractC6715g.m6407a(2), measuredWidth2, f7);
        path.arcTo(this.f11327c, 150.0f, 240.0f);
        path.quadTo(((float) ((getMeasuredWidth() / 2.0f) + ((Math.sqrt(3.0d) / 2.0d) * bubbleSeekBar.f5135e0))) + AbstractC6715g.m6407a(2), f7 - AbstractC6715g.m6407a(2), measuredWidth, f);
        path.close();
        int i8 = bubbleSeekBar.f5110F;
        Paint paint = this.f11325a;
        paint.setColor(i8);
        canvas.drawPath(path, paint);
        paint.setTextSize(bubbleSeekBar.f5111G);
        paint.setColor(bubbleSeekBar.f5112H);
        String str = this.f11329e;
        paint.getTextBounds(str, 0, str.length(), this.f11328d);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f8 = bubbleSeekBar.f5135e0;
        float f9 = fontMetrics.descent;
        canvas.drawText(this.f11329e, getMeasuredWidth() / 2.0f, (((f9 - fontMetrics.ascent) / 2.0f) + f8) - f9, paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        BubbleSeekBar bubbleSeekBar = this.f11330f;
        int i9 = bubbleSeekBar.f5135e0;
        setMeasuredDimension(i9 * 3, i9 * 3);
        this.f11327c.set((getMeasuredWidth() / 2.0f) - bubbleSeekBar.f5135e0, 0.0f, (getMeasuredWidth() / 2.0f) + bubbleSeekBar.f5135e0, r4 * 2);
    }
}
