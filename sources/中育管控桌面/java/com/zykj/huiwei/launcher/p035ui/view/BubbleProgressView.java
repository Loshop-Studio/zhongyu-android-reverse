package com.zykj.huiwei.launcher.p035ui.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.manage.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0014R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010(R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010.R\u0014\u00105\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b4\u0010.R\u0016\u00108\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010<\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00107R\u0016\u0010>\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00107R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00107R\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00107R\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010.R\u0016\u0010N\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010.R\u0016\u0010P\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010.R\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010.¨\u0006R"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/view/BubbleProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "w", "h", "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "progress", "setProgress", "(F)V", "setProgressWithAnim", "a", "b", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mPaintProgress", "mPaintBubble", "c", "mPaintProgressStr", "Landroid/graphics/PathMeasure;", "d", "Landroid/graphics/PathMeasure;", "mPathMeasure", "Landroid/graphics/Path;", "e", "Landroid/graphics/Path;", "mPathSrc", "f", "mPathDst", "g", "mPathBubble", "I", "mColorProgressBg", "i", "mColorProgress", "j", "mColorProgressFull", "k", "mColorProgressStr", "l", "F", "mProgressHeight", "m", "mProgress", "n", "mBubbleTriangleHeight", "o", "mBubbleRectRound", "", "p", "Ljava/lang/String;", "mProgressStr", "q", "mTextSize", "Landroid/graphics/Paint$FontMetricsInt;", "r", "Landroid/graphics/Paint$FontMetricsInt;", "mFontMetricsInt", "s", "mProgressStrMargin", "t", "mBubbleWidth", "u", "mBubbleheight", "v", "mColorBubble", "mColorBubbleFull", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nBubbleProgressView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BubbleProgressView.kt\ncom/zykj/huiwei/launcher/ui/view/BubbleProgressView\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,189:1\n404#2:190\n404#2:191\n*S KotlinDebug\n*F\n+ 1 BubbleProgressView.kt\ncom/zykj/huiwei/launcher/ui/view/BubbleProgressView\n*L\n64#1:190\n83#1:191\n*E\n"})
/* loaded from: classes4.dex */
public final class BubbleProgressView extends View {

    /* renamed from: a, reason: from kotlin metadata */
    public Paint mPaintProgress;

    /* renamed from: b, reason: from kotlin metadata */
    public Paint mPaintBubble;

    /* renamed from: c, reason: from kotlin metadata */
    public Paint mPaintProgressStr;

    /* renamed from: d, reason: from kotlin metadata */
    public PathMeasure mPathMeasure;

    /* renamed from: e, reason: from kotlin metadata */
    public Path mPathSrc;

    /* renamed from: f, reason: from kotlin metadata */
    public Path mPathDst;

    /* renamed from: g, reason: from kotlin metadata */
    public Path mPathBubble;

    /* renamed from: h, reason: from kotlin metadata */
    public int mColorProgressBg;

    /* renamed from: i, reason: from kotlin metadata */
    public int mColorProgress;

    /* renamed from: j, reason: from kotlin metadata */
    public int mColorProgressFull;

    /* renamed from: k, reason: from kotlin metadata */
    public final int mColorProgressStr;

    /* renamed from: l, reason: from kotlin metadata */
    public float mProgressHeight;

    /* renamed from: m, reason: from kotlin metadata */
    public float mProgress;

    /* renamed from: n, reason: from kotlin metadata */
    public float mBubbleTriangleHeight;

    /* renamed from: o, reason: from kotlin metadata */
    public float mBubbleRectRound;

    /* renamed from: p, reason: from kotlin metadata */
    public String mProgressStr;

    /* renamed from: q, reason: from kotlin metadata */
    public float mTextSize;

    /* renamed from: r, reason: from kotlin metadata */
    public Paint.FontMetricsInt mFontMetricsInt;

    /* renamed from: s, reason: from kotlin metadata */
    public float mProgressStrMargin;

    /* renamed from: t, reason: from kotlin metadata */
    public int mBubbleWidth;

    /* renamed from: u, reason: from kotlin metadata */
    public int mBubbleheight;

    /* renamed from: v, reason: from kotlin metadata */
    public int mColorBubble;

    /* renamed from: w, reason: from kotlin metadata */
    public int mColorBubbleFull;

    @JvmOverloads
    public BubbleProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void m6014a(Canvas canvas) {
        int i6 = this.mBubbleWidth;
        int i7 = this.mBubbleheight;
        Path path = this.mPathBubble;
        Intrinsics.checkNotNull(path);
        path.reset();
        float[] fArr = new float[2];
        PathMeasure pathMeasure = this.mPathMeasure;
        Intrinsics.checkNotNull(pathMeasure);
        float length = pathMeasure.getLength() * this.mProgress;
        PathMeasure pathMeasure2 = this.mPathMeasure;
        Intrinsics.checkNotNull(pathMeasure2);
        pathMeasure2.getPosTan(length, fArr, new float[2]);
        Path path2 = this.mPathBubble;
        Intrinsics.checkNotNull(path2);
        path2.moveTo(fArr[0], fArr[1] - this.mProgressHeight);
        Path path3 = this.mPathBubble;
        Intrinsics.checkNotNull(path3);
        float f6 = fArr[0];
        float f7 = this.mBubbleTriangleHeight;
        path3.lineTo(f6 + f7, (fArr[1] - this.mProgressHeight) - f7);
        Path path4 = this.mPathBubble;
        Intrinsics.checkNotNull(path4);
        float f8 = fArr[0];
        float f9 = this.mBubbleTriangleHeight;
        path4.lineTo(f8 - f9, (fArr[1] - this.mProgressHeight) - f9);
        Path path5 = this.mPathBubble;
        Intrinsics.checkNotNull(path5);
        path5.close();
        float f10 = fArr[0];
        float f11 = this.mBubbleTriangleHeight;
        float f12 = i6 * 0.5f;
        float f13 = fArr[1];
        float f14 = this.mProgressHeight;
        RectF rectF = new RectF((f10 - f11) - f12, ((f13 - f11) - f14) - i7, f10 + f11 + f12, (f13 - f11) - f14);
        Path path6 = this.mPathBubble;
        Intrinsics.checkNotNull(path6);
        float f15 = this.mBubbleRectRound;
        path6.addRoundRect(rectF, f15, f15, Path.Direction.CW);
        Paint paint = this.mPaintBubble;
        Intrinsics.checkNotNull(paint);
        paint.setColor(this.mProgress == 1.0f ? this.mColorBubbleFull : this.mColorBubble);
        Path path7 = this.mPathBubble;
        Intrinsics.checkNotNull(path7);
        Paint paint2 = this.mPaintBubble;
        Intrinsics.checkNotNull(paint2);
        canvas.drawPath(path7, paint2);
        Paint.FontMetricsInt fontMetricsInt = this.mFontMetricsInt;
        Intrinsics.checkNotNull(fontMetricsInt);
        int i8 = fontMetricsInt.bottom;
        Paint.FontMetricsInt fontMetricsInt2 = this.mFontMetricsInt;
        Intrinsics.checkNotNull(fontMetricsInt2);
        int i9 = (i8 - fontMetricsInt2.ascent) / 2;
        Paint.FontMetricsInt fontMetricsInt3 = this.mFontMetricsInt;
        Intrinsics.checkNotNull(fontMetricsInt3);
        int i10 = i9 - fontMetricsInt3.bottom;
        String str = this.mProgress == 1.0f ? "完成" : this.mProgressStr;
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY() + i10;
        Paint paint3 = this.mPaintProgressStr;
        Intrinsics.checkNotNull(paint3);
        canvas.drawText(str, fCenterX, fCenterY, paint3);
    }

    /* renamed from: b */
    public final void m6015b(Canvas canvas) {
        Path path = this.mPathDst;
        Intrinsics.checkNotNull(path);
        path.reset();
        Paint paint = this.mPaintProgress;
        Intrinsics.checkNotNull(paint);
        paint.setColor(this.mColorProgressBg);
        Path path2 = this.mPathSrc;
        Intrinsics.checkNotNull(path2);
        Paint paint2 = this.mPaintProgress;
        Intrinsics.checkNotNull(paint2);
        canvas.drawPath(path2, paint2);
        PathMeasure pathMeasure = this.mPathMeasure;
        Intrinsics.checkNotNull(pathMeasure);
        float length = pathMeasure.getLength() * this.mProgress;
        PathMeasure pathMeasure2 = this.mPathMeasure;
        Intrinsics.checkNotNull(pathMeasure2);
        pathMeasure2.getSegment(0.0f, length, this.mPathDst, true);
        Paint paint3 = this.mPaintProgress;
        Intrinsics.checkNotNull(paint3);
        paint3.setColor(this.mProgress == 1.0f ? this.mColorProgressFull : this.mColorProgress);
        Path path3 = this.mPathDst;
        Intrinsics.checkNotNull(path3);
        Paint paint4 = this.mPaintProgress;
        Intrinsics.checkNotNull(paint4);
        canvas.drawPath(path3, paint4);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        m6015b(canvas);
        m6014a(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int w6, int h6, int oldw, int oldh) {
        super.onSizeChanged(w6, h6, oldw, oldh);
        Path path = this.mPathSrc;
        Intrinsics.checkNotNull(path);
        float f6 = 2;
        float f7 = h6;
        path.moveTo((this.mBubbleWidth / f6) + this.mBubbleTriangleHeight, f7 - (this.mProgressHeight * f6));
        Path path2 = this.mPathSrc;
        Intrinsics.checkNotNull(path2);
        path2.lineTo((w6 - (this.mBubbleWidth / f6)) - this.mBubbleTriangleHeight, f7 - (this.mProgressHeight * f6));
        PathMeasure pathMeasure = this.mPathMeasure;
        Intrinsics.checkNotNull(pathMeasure);
        pathMeasure.setPath(this.mPathSrc, false);
        invalidate();
    }

    public final void setProgress(float progress) {
        this.mProgress = progress;
        this.mProgressStr = ((int) (progress * 100)) + "%";
        invalidate();
    }

    public final void setProgressWithAnim(float progress) {
        ObjectAnimator.ofFloat(this, "progress", 0.0f, progress).setDuration(2000L).start();
    }

    public /* synthetic */ BubbleProgressView(Context context, AttributeSet attributeSet, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, (i7 & 4) != 0 ? 0 : i6);
    }

    public BubbleProgressView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.mColorProgressStr = -1;
        this.mProgressHeight = 5.0f;
        this.mBubbleTriangleHeight = 5.0f;
        this.mBubbleRectRound = 5.0f;
        this.mProgressStr = "0%";
        this.mTextSize = 20.0f;
        this.mProgressStrMargin = 15.0f;
        this.mBubbleWidth = 30;
        this.mBubbleheight = 15;
        this.mProgressHeight = getResources().getDimensionPixelSize(R.dimen.view_1);
        this.mTextSize = getResources().getDimensionPixelSize(R.dimen.view_6);
        this.mBubbleTriangleHeight = getResources().getDimensionPixelSize(R.dimen.view_2);
        this.mBubbleRectRound = getResources().getDimensionPixelSize(R.dimen.view_4);
        this.mBubbleWidth = getResources().getDimensionPixelSize(R.dimen.view_14);
        this.mBubbleheight = getResources().getDimensionPixelSize(R.dimen.view_8);
        this.mProgressStrMargin = getResources().getDimensionPixelSize(R.dimen.view_2);
        this.mColorProgressBg = -1116673;
        this.mColorProgress = getResources().getColor(R.color.color1575FB, null);
        this.mColorProgressFull = Color.parseColor("#27c69a");
        Paint paint = new Paint(1);
        this.mPaintProgress = paint;
        Intrinsics.checkNotNull(paint);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = this.mPaintProgress;
        Intrinsics.checkNotNull(paint2);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = this.mPaintProgress;
        Intrinsics.checkNotNull(paint3);
        paint3.setStrokeWidth(this.mProgressHeight);
        Paint paint4 = new Paint(1);
        this.mPaintBubble = paint4;
        Intrinsics.checkNotNull(paint4);
        paint4.setStrokeCap(cap);
        Paint paint5 = this.mPaintBubble;
        Intrinsics.checkNotNull(paint5);
        Paint.Style style = Paint.Style.FILL;
        paint5.setStyle(style);
        Paint paint6 = this.mPaintBubble;
        Intrinsics.checkNotNull(paint6);
        paint6.setStrokeJoin(Paint.Join.ROUND);
        Paint paint7 = new Paint(1);
        this.mPaintProgressStr = paint7;
        Intrinsics.checkNotNull(paint7);
        paint7.setStyle(style);
        Paint paint8 = this.mPaintProgressStr;
        Intrinsics.checkNotNull(paint8);
        paint8.setColor(-1);
        Paint paint9 = this.mPaintProgressStr;
        Intrinsics.checkNotNull(paint9);
        paint9.setTextSize(this.mTextSize);
        Paint paint10 = this.mPaintProgressStr;
        Intrinsics.checkNotNull(paint10);
        paint10.setTextAlign(Paint.Align.CENTER);
        this.mPathSrc = new Path();
        this.mPathDst = new Path();
        this.mPathBubble = new Path();
        this.mPathMeasure = new PathMeasure();
        this.mColorBubble = getResources().getColor(R.color.color1575FB, null);
        this.mColorBubbleFull = Color.parseColor("#27c69a");
        Paint paint11 = this.mPaintProgressStr;
        Intrinsics.checkNotNull(paint11);
        this.mFontMetricsInt = paint11.getFontMetricsInt();
    }
}
