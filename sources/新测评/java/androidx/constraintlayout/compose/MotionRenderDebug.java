package androidx.constraintlayout.compose;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.internal.view.SupportMenu;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u0000 z2\u00020\u0001:\u0001zB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J>\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u00122\u0006\u0010Y\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u00122\u0006\u0010[\u001a\u00020B2\u0006\u0010\\\u001a\u00020BJ6\u0010]\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\u0006\u0010Y\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u0012JZ\u0010]\u001a\u00020S2\u0006\u0010T\u001a\u00020U2*\u0010_\u001a&\u0012\u0006\u0012\u0004\u0018\u00010a\u0012\u0004\u0012\u00020W\u0018\u00010`j\u0012\u0012\u0006\u0012\u0004\u0018\u00010a\u0012\u0004\u0012\u00020W\u0018\u0001`b2\u0006\u0010X\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\u0006\u0010Y\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u0012J6\u0010c\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010d\u001a\u00020\u00122\u0006\u0010e\u001a\u00020\u00122\u0006\u0010V\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u0012J\u0010\u0010f\u001a\u00020S2\u0006\u0010T\u001a\u00020UH\u0002J\u0010\u0010g\u001a\u00020S2\u0006\u0010T\u001a\u00020UH\u0002J\u0010\u0010h\u001a\u00020S2\u0006\u0010T\u001a\u00020UH\u0002J \u0010i\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010j\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u0003H\u0002J\u0010\u0010l\u001a\u00020S2\u0006\u0010T\u001a\u00020UH\u0002J \u0010m\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010j\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u0003H\u0002J@\u0010n\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010j\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u00032\u0006\u0010o\u001a\u00020\u00122\u0006\u0010p\u001a\u00020\u00122\u0006\u0010Y\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u0012H\u0002J\u0018\u0010q\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0002J8\u0010\\\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010d\u001a\u00020\u00122\u0006\u0010e\u001a\u00020\u00122\u0006\u0010V\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u0012H\u0002J0\u0010r\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010s\u001a\u00020\u00032\u0006\u0010t\u001a\u00020\u00032\u0006\u0010u\u001a\u00020\u00032\u0006\u0010v\u001a\u00020\u0003H\u0002J\u0016\u0010w\u001a\u00020S2\u0006\u0010x\u001a\u00020a2\u0006\u0010y\u001a\u00020\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\u001d\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0014R\u001a\u0010)\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001aR\u001a\u0010,\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001a\u0010/\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001aR\u001c\u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u000209X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010>\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010$\"\u0004\b@\u0010&R\u001a\u0010A\u001a\u00020BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u000e\u0010G\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010H\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0014R\u0014\u0010J\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\u0014R\u001a\u0010L\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0014\"\u0004\bN\u0010 R\u001a\u0010O\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0018\"\u0004\bQ\u0010\u001a¨\u0006{"}, m13558d2 = {"Landroidx/constraintlayout/compose/MotionRenderDebug;", "", "textSize", "", "(F)V", "mBounds", "Landroid/graphics/Rect;", "getMBounds", "()Landroid/graphics/Rect;", "setMBounds", "(Landroid/graphics/Rect;)V", "mDashPathEffect", "Landroid/graphics/DashPathEffect;", "getMDashPathEffect", "()Landroid/graphics/DashPathEffect;", "setMDashPathEffect", "(Landroid/graphics/DashPathEffect;)V", "mDiamondSize", "", "getMDiamondSize", "()I", "mFillPaint", "Landroid/graphics/Paint;", "getMFillPaint", "()Landroid/graphics/Paint;", "setMFillPaint", "(Landroid/graphics/Paint;)V", "mGraphColor", "getMGraphColor", "mKeyFrameCount", "getMKeyFrameCount", "setMKeyFrameCount", "(I)V", "mKeyFramePoints", "", "getMKeyFramePoints", "()[F", "setMKeyFramePoints", "([F)V", "mKeyframeColor", "getMKeyframeColor", "mPaint", "getMPaint", "setMPaint", "mPaintGraph", "getMPaintGraph", "setMPaintGraph", "mPaintKeyframes", "getMPaintKeyframes", "setMPaintKeyframes", "mPath", "Landroid/graphics/Path;", "getMPath", "()Landroid/graphics/Path;", "setMPath", "(Landroid/graphics/Path;)V", "mPathMode", "", "getMPathMode", "()[I", "setMPathMode", "([I)V", "mPoints", "getMPoints", "setMPoints", "mPresentationMode", "", "getMPresentationMode", "()Z", "setMPresentationMode", "(Z)V", "mRectangle", "mRedColor", "getMRedColor", "mShadowColor", "getMShadowColor", "mShadowTranslate", "getMShadowTranslate", "setMShadowTranslate", "mTextPaint", "getMTextPaint", "setMTextPaint", "basicDraw", "", "canvas", "Landroid/graphics/Canvas;", "motionController", "Landroidx/constraintlayout/core/motion/Motion;", TypedValues.TransitionType.S_DURATION, "layoutWidth", "layoutHeight", "drawPath", "drawTicks", "draw", "debugPath", "frameArrayList", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "drawAll", "mode", "keyFrames", "drawBasicPath", "drawPathAsConfigured", "drawPathCartesian", "drawPathCartesianTicks", "x", "y", "drawPathRelative", "drawPathRelativeTicks", "drawPathScreenTicks", "viewWidth", "viewHeight", "drawRectangle", "drawTranslation", "x1", "y1", "x2", "y2", "getTextBounds", "text", "paint", "Companion", "constraintlayout-compose_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class MotionRenderDebug {
    private static final int DEBUG_PATH_TICKS_PER_MS = 16;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    public static final int MAX_KEY_FRAMES = 50;
    private DashPathEffect mDashPathEffect;
    private Paint mFillPaint;
    private int mKeyFrameCount;
    private float[] mKeyFramePoints;
    private Paint mPaint;
    private Paint mPaintGraph;
    private Paint mPaintKeyframes;
    private Path mPath;
    private int[] mPathMode;
    private float[] mPoints;
    private boolean mPresentationMode;
    private final float[] mRectangle;
    private int mShadowTranslate;
    private Paint mTextPaint;
    public static final int $stable = 8;
    private final int mRedColor = -21965;
    private final int mKeyframeColor = -2067046;
    private final int mGraphColor = -13391360;
    private final int mShadowColor = 1996488704;
    private final int mDiamondSize = 10;
    private Rect mBounds = new Rect();

    public MotionRenderDebug(float f10) {
        this.mShadowTranslate = 1;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setColor(-21965);
        this.mPaint.setStrokeWidth(2.0f);
        Paint paint2 = this.mPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.mPaintKeyframes = paint3;
        paint3.setAntiAlias(true);
        this.mPaintKeyframes.setColor(-2067046);
        this.mPaintKeyframes.setStrokeWidth(2.0f);
        this.mPaintKeyframes.setStyle(style);
        Paint paint4 = new Paint();
        this.mPaintGraph = paint4;
        paint4.setAntiAlias(true);
        this.mPaintGraph.setColor(-13391360);
        this.mPaintGraph.setStrokeWidth(2.0f);
        this.mPaintGraph.setStyle(style);
        Paint paint5 = new Paint();
        this.mTextPaint = paint5;
        paint5.setAntiAlias(true);
        this.mTextPaint.setColor(-13391360);
        this.mTextPaint.setTextSize(f10);
        this.mRectangle = new float[8];
        Paint paint6 = new Paint();
        this.mFillPaint = paint6;
        paint6.setAntiAlias(true);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.mDashPathEffect = dashPathEffect;
        this.mPaintGraph.setPathEffect(dashPathEffect);
        this.mKeyFramePoints = new float[100];
        this.mPathMode = new int[50];
        if (this.mPresentationMode) {
            this.mPaint.setStrokeWidth(8.0f);
            this.mFillPaint.setStrokeWidth(8.0f);
            this.mPaintKeyframes.setStrokeWidth(8.0f);
            this.mShadowTranslate = 4;
        }
    }

    private final void drawBasicPath(Canvas canvas) {
        float[] fArr = this.mPoints;
        Intrinsics.checkNotNull(fArr);
        canvas.drawLines(fArr, this.mPaint);
    }

    private final void drawPathAsConfigured(Canvas canvas) {
        int i10 = this.mKeyFrameCount;
        boolean z9 = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.mPathMode[i11];
            if (i12 == 1) {
                z9 = true;
            }
            if (i12 == 0) {
                z10 = true;
            }
        }
        if (z9) {
            drawPathRelative(canvas);
        }
        if (z10) {
            drawPathCartesian(canvas);
        }
    }

    private final void drawPathCartesian(Canvas canvas) {
        float[] fArr = this.mPoints;
        Intrinsics.checkNotNull(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.mPoints;
        Intrinsics.checkNotNull(fArr2);
        float f11 = fArr2[1];
        float[] fArr3 = this.mPoints;
        Intrinsics.checkNotNull(fArr3);
        Intrinsics.checkNotNull(this.mPoints);
        float f12 = fArr3[r5.length - 2];
        float[] fArr4 = this.mPoints;
        Intrinsics.checkNotNull(fArr4);
        float[] fArr5 = this.mPoints;
        Intrinsics.checkNotNull(fArr5);
        float f13 = fArr4[fArr5.length - 1];
        canvas.drawLine(Math.min(f10, f12), Math.max(f11, f13), Math.max(f10, f12), Math.max(f11, f13), this.mPaintGraph);
        canvas.drawLine(Math.min(f10, f12), Math.min(f11, f13), Math.min(f10, f12), Math.max(f11, f13), this.mPaintGraph);
    }

    private final void drawPathCartesianTicks(Canvas canvas, float x9, float y9) {
        float[] fArr = this.mPoints;
        Intrinsics.checkNotNull(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.mPoints;
        Intrinsics.checkNotNull(fArr2);
        float f11 = fArr2[1];
        float[] fArr3 = this.mPoints;
        Intrinsics.checkNotNull(fArr3);
        float[] fArr4 = this.mPoints;
        Intrinsics.checkNotNull(fArr4);
        float f12 = fArr3[fArr4.length - 2];
        float[] fArr5 = this.mPoints;
        Intrinsics.checkNotNull(fArr5);
        float[] fArr6 = this.mPoints;
        Intrinsics.checkNotNull(fArr6);
        float f13 = fArr5[fArr6.length - 1];
        float fMin = Math.min(f10, f12);
        float fMax = Math.max(f11, f13);
        float fMin2 = x9 - Math.min(f10, f12);
        float fMax2 = Math.max(f11, f13) - y9;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        float f14 = 100;
        sb.append(((int) (((f14 * fMin2) / Math.abs(f12 - f10)) + 0.5d)) / 100.0f);
        String string = sb.toString();
        getTextBounds(string, this.mTextPaint);
        float f15 = 2;
        canvas.drawText(string, ((fMin2 / f15) - (this.mBounds.width() / 2)) + fMin, y9 - 20, this.mTextPaint);
        canvas.drawLine(x9, y9, Math.min(f10, f12), y9, this.mPaintGraph);
        String str = "" + (((int) (((f14 * fMax2) / Math.abs(f13 - f11)) + 0.5d)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawText(str, x9 + 5, fMax - ((fMax2 / f15) - (this.mBounds.height() / 2)), this.mTextPaint);
        canvas.drawLine(x9, y9, x9, Math.max(f11, f13), this.mPaintGraph);
    }

    private final void drawPathRelative(Canvas canvas) {
        float[] fArr = this.mPoints;
        Intrinsics.checkNotNull(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.mPoints;
        Intrinsics.checkNotNull(fArr2);
        float f11 = fArr2[1];
        float[] fArr3 = this.mPoints;
        Intrinsics.checkNotNull(fArr3);
        Intrinsics.checkNotNull(this.mPoints);
        float f12 = fArr3[r2.length - 2];
        float[] fArr4 = this.mPoints;
        Intrinsics.checkNotNull(fArr4);
        float[] fArr5 = this.mPoints;
        Intrinsics.checkNotNull(fArr5);
        canvas.drawLine(f10, f11, f12, fArr4[fArr5.length - 1], this.mPaintGraph);
    }

    private final void drawPathRelativeTicks(Canvas canvas, float x9, float y9) {
        float[] fArr = this.mPoints;
        Intrinsics.checkNotNull(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.mPoints;
        Intrinsics.checkNotNull(fArr2);
        float f11 = fArr2[1];
        float[] fArr3 = this.mPoints;
        Intrinsics.checkNotNull(fArr3);
        float[] fArr4 = this.mPoints;
        Intrinsics.checkNotNull(fArr4);
        float f12 = fArr3[fArr4.length - 2];
        float[] fArr5 = this.mPoints;
        Intrinsics.checkNotNull(fArr5);
        float[] fArr6 = this.mPoints;
        Intrinsics.checkNotNull(fArr6);
        float f13 = fArr5[fArr6.length - 1];
        float fHypot = (float) Math.hypot(f10 - f12, f11 - f13);
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float f16 = (((x9 - f10) * f14) + ((y9 - f11) * f15)) / (fHypot * fHypot);
        float f17 = f10 + (f14 * f16);
        float f18 = f11 + (f16 * f15);
        Path path = new Path();
        path.moveTo(x9, y9);
        path.lineTo(f17, f18);
        float fHypot2 = (float) Math.hypot(f17 - x9, f18 - y9);
        String str = "" + (((int) ((100 * fHypot2) / fHypot)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2) - (this.mBounds.width() / 2), -20.0f, this.mTextPaint);
        canvas.drawLine(x9, y9, f17, f18, this.mPaintGraph);
    }

    private final void drawPathScreenTicks(Canvas canvas, float x9, float y9, int viewWidth, int viewHeight, int layoutWidth, int layoutHeight) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        float f10 = 100;
        sb.append(((int) ((((x9 - (viewWidth / 2)) * f10) / (layoutWidth - viewWidth)) + 0.5d)) / 100.0f);
        String string = sb.toString();
        getTextBounds(string, this.mTextPaint);
        float f11 = 2;
        canvas.drawText(string, ((x9 / f11) - (this.mBounds.width() / 2)) + 0.0f, y9 - 20, this.mTextPaint);
        canvas.drawLine(x9, y9, Math.min(0.0f, 1.0f), y9, this.mPaintGraph);
        String str = "" + (((int) (((f10 * (y9 - (viewHeight / 2))) / (layoutHeight - viewHeight)) + 0.5d)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawText(str, x9 + 5, 0.0f - ((y9 / f11) - (this.mBounds.height() / 2)), this.mTextPaint);
        canvas.drawLine(x9, y9, x9, Math.max(0.0f, 1.0f), this.mPaintGraph);
    }

    private final void drawRectangle(Canvas canvas, Motion motionController) {
        Path path = this.mPath;
        Intrinsics.checkNotNull(path);
        path.reset();
        int i10 = 0;
        while (true) {
            motionController.buildRect(i10 / 50, this.mRectangle, 0);
            Path path2 = this.mPath;
            Intrinsics.checkNotNull(path2);
            float[] fArr = this.mRectangle;
            path2.moveTo(fArr[0], fArr[1]);
            Path path3 = this.mPath;
            Intrinsics.checkNotNull(path3);
            float[] fArr2 = this.mRectangle;
            path3.lineTo(fArr2[2], fArr2[3]);
            Path path4 = this.mPath;
            Intrinsics.checkNotNull(path4);
            float[] fArr3 = this.mRectangle;
            path4.lineTo(fArr3[4], fArr3[5]);
            Path path5 = this.mPath;
            Intrinsics.checkNotNull(path5);
            float[] fArr4 = this.mRectangle;
            path5.lineTo(fArr4[6], fArr4[7]);
            Path path6 = this.mPath;
            Intrinsics.checkNotNull(path6);
            path6.close();
            if (i10 == 50) {
                this.mPaint.setColor(1140850688);
                canvas.translate(2.0f, 2.0f);
                Path path7 = this.mPath;
                Intrinsics.checkNotNull(path7);
                canvas.drawPath(path7, this.mPaint);
                canvas.translate(-2.0f, -2.0f);
                this.mPaint.setColor(SupportMenu.CATEGORY_MASK);
                Path path8 = this.mPath;
                Intrinsics.checkNotNull(path8);
                canvas.drawPath(path8, this.mPaint);
                return;
            }
            i10++;
        }
    }

    private final void drawTicks(Canvas canvas, int mode, int keyFrames, Motion motionController, int layoutWidth, int layoutHeight) {
        int width;
        int height;
        if (motionController.getView() != null) {
            width = motionController.getView().getWidth();
            height = motionController.getView().getHeight();
        } else {
            width = 0;
            height = 0;
        }
        int i10 = keyFrames - 1;
        for (int i11 = 1; i11 < i10; i11++) {
            if (mode != 4 || this.mPathMode[i11 - 1] != 0) {
                float[] fArr = this.mKeyFramePoints;
                int i12 = i11 * 2;
                float f10 = fArr[i12];
                float f11 = fArr[i12 + 1];
                Path path = this.mPath;
                Intrinsics.checkNotNull(path);
                path.reset();
                Path path2 = this.mPath;
                Intrinsics.checkNotNull(path2);
                path2.moveTo(f10, this.mDiamondSize + f11);
                Path path3 = this.mPath;
                Intrinsics.checkNotNull(path3);
                path3.lineTo(this.mDiamondSize + f10, f11);
                Path path4 = this.mPath;
                Intrinsics.checkNotNull(path4);
                path4.lineTo(f10, f11 - this.mDiamondSize);
                Path path5 = this.mPath;
                Intrinsics.checkNotNull(path5);
                path5.lineTo(f10 - this.mDiamondSize, f11);
                Path path6 = this.mPath;
                Intrinsics.checkNotNull(path6);
                path6.close();
                if (mode == 4) {
                    int i13 = this.mPathMode[i11 - 1];
                    if (i13 == 1) {
                        drawPathRelativeTicks(canvas, f10 - 0.0f, f11 - 0.0f);
                    } else if (i13 == 0) {
                        drawPathCartesianTicks(canvas, f10 - 0.0f, f11 - 0.0f);
                    } else if (i13 == 2) {
                        drawPathScreenTicks(canvas, f10 - 0.0f, f11 - 0.0f, width, height, layoutWidth, layoutHeight);
                    }
                    Path path7 = this.mPath;
                    Intrinsics.checkNotNull(path7);
                    canvas.drawPath(path7, this.mFillPaint);
                }
                if (mode == 2) {
                    drawPathRelativeTicks(canvas, f10 - 0.0f, f11 - 0.0f);
                }
                if (mode == 3) {
                    drawPathCartesianTicks(canvas, f10 - 0.0f, f11 - 0.0f);
                }
                if (mode == 6) {
                    drawPathScreenTicks(canvas, f10 - 0.0f, f11 - 0.0f, width, height, layoutWidth, layoutHeight);
                }
                Path path8 = this.mPath;
                Intrinsics.checkNotNull(path8);
                canvas.drawPath(path8, this.mFillPaint);
            }
        }
        float[] fArr2 = this.mPoints;
        Intrinsics.checkNotNull(fArr2);
        if (fArr2.length > 1) {
            float[] fArr3 = this.mPoints;
            Intrinsics.checkNotNull(fArr3);
            float f12 = fArr3[0];
            float[] fArr4 = this.mPoints;
            Intrinsics.checkNotNull(fArr4);
            canvas.drawCircle(f12, fArr4[1], 8.0f, this.mPaintKeyframes);
            float[] fArr5 = this.mPoints;
            Intrinsics.checkNotNull(fArr5);
            float[] fArr6 = this.mPoints;
            Intrinsics.checkNotNull(fArr6);
            float f13 = fArr5[fArr6.length - 2];
            float[] fArr7 = this.mPoints;
            Intrinsics.checkNotNull(fArr7);
            float[] fArr8 = this.mPoints;
            Intrinsics.checkNotNull(fArr8);
            canvas.drawCircle(f13, fArr7[fArr8.length - 1], 8.0f, this.mPaintKeyframes);
        }
    }

    private final void drawTranslation(Canvas canvas, float x12, float y12, float x22, float y22) {
        canvas.drawRect(x12, y12, x22, y22, this.mPaintGraph);
        canvas.drawLine(x12, y12, x22, y22, this.mPaintGraph);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void basicDraw(android.graphics.Canvas r9, androidx.constraintlayout.core.motion.Motion r10, int r11, int r12, int r13, boolean r14, boolean r15) {
        /*
            r8 = this;
            float[] r0 = r8.mKeyFramePoints
            int[] r1 = r8.mPathMode
            r2 = 0
            int r0 = r10.buildKeyFrames(r0, r1, r2)
            r8.mKeyFrameCount = r0
            int r11 = r11 / 16
            float[] r0 = r8.mPoints
            if (r0 == 0) goto L19
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.length
            int r1 = r11 * 2
            if (r0 == r1) goto L26
        L19:
            int r0 = r11 * 2
            float[] r0 = new float[r0]
            r8.mPoints = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r8.mPath = r0
        L26:
            int r0 = r8.mShadowTranslate
            float r1 = (float) r0
            float r0 = (float) r0
            r9.translate(r1, r0)
            android.graphics.Paint r0 = r8.mPaint
            int r1 = r8.mShadowColor
            r0.setColor(r1)
            android.graphics.Paint r0 = r8.mFillPaint
            int r1 = r8.mShadowColor
            r0.setColor(r1)
            android.graphics.Paint r0 = r8.mPaintKeyframes
            int r1 = r8.mShadowColor
            r0.setColor(r1)
            android.graphics.Paint r0 = r8.mPaintGraph
            int r1 = r8.mShadowColor
            r0.setColor(r1)
            float[] r0 = r8.mPoints
            r10.buildPath(r0, r11)
            if (r14 == 0) goto L53
            r8.drawBasicPath(r9)
        L53:
            r3 = 1
            if (r15 == 0) goto L61
            int r4 = r8.mKeyFrameCount
            r1 = r8
            r2 = r9
            r5 = r10
            r6 = r12
            r7 = r13
            r1.drawTicks(r2, r3, r4, r5, r6, r7)
            goto L66
        L61:
            r1 = r8
            r2 = r9
            r5 = r10
            r6 = r12
            r7 = r13
        L66:
            android.graphics.Paint r9 = r1.mPaint
            int r10 = r1.mRedColor
            r9.setColor(r10)
            android.graphics.Paint r9 = r1.mPaintKeyframes
            int r10 = r1.mKeyframeColor
            r9.setColor(r10)
            android.graphics.Paint r9 = r1.mFillPaint
            int r10 = r1.mKeyframeColor
            r9.setColor(r10)
            android.graphics.Paint r9 = r1.mPaintGraph
            int r10 = r1.mGraphColor
            r9.setColor(r10)
            int r9 = r1.mShadowTranslate
            float r10 = (float) r9
            float r10 = -r10
            float r9 = (float) r9
            float r9 = -r9
            r2.translate(r10, r9)
            if (r14 == 0) goto L90
            r8.drawBasicPath(r2)
        L90:
            if (r15 == 0) goto L97
            int r4 = r1.mKeyFrameCount
            r1.drawTicks(r2, r3, r4, r5, r6, r7)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionRenderDebug.basicDraw(android.graphics.Canvas, androidx.constraintlayout.core.motion.Motion, int, int, int, boolean, boolean):void");
    }

    public final void draw(Canvas canvas, HashMap<String, Motion> frameArrayList, int duration, int debugPath, int layoutWidth, int layoutHeight) {
        if (frameArrayList == null || frameArrayList.size() == 0) {
            return;
        }
        canvas.save();
        Iterator<Motion> it = frameArrayList.values().iterator();
        while (it.hasNext()) {
            draw(canvas, it.next(), duration, debugPath, layoutWidth, layoutHeight);
        }
        canvas.restore();
    }

    public final void drawAll(Canvas canvas, int mode, int keyFrames, Motion motionController, int layoutWidth, int layoutHeight) {
        if (mode == 4) {
            drawPathAsConfigured(canvas);
        }
        if (mode == 2) {
            drawPathRelative(canvas);
        }
        if (mode == 3) {
            drawPathCartesian(canvas);
        }
        drawBasicPath(canvas);
        drawTicks(canvas, mode, keyFrames, motionController, layoutWidth, layoutHeight);
    }

    public final Rect getMBounds() {
        return this.mBounds;
    }

    public final DashPathEffect getMDashPathEffect() {
        return this.mDashPathEffect;
    }

    public final int getMDiamondSize() {
        return this.mDiamondSize;
    }

    public final Paint getMFillPaint() {
        return this.mFillPaint;
    }

    public final int getMGraphColor() {
        return this.mGraphColor;
    }

    public final int getMKeyFrameCount() {
        return this.mKeyFrameCount;
    }

    public final float[] getMKeyFramePoints() {
        return this.mKeyFramePoints;
    }

    public final int getMKeyframeColor() {
        return this.mKeyframeColor;
    }

    public final Paint getMPaint() {
        return this.mPaint;
    }

    public final Paint getMPaintGraph() {
        return this.mPaintGraph;
    }

    public final Paint getMPaintKeyframes() {
        return this.mPaintKeyframes;
    }

    public final Path getMPath() {
        return this.mPath;
    }

    public final int[] getMPathMode() {
        return this.mPathMode;
    }

    public final float[] getMPoints() {
        return this.mPoints;
    }

    public final boolean getMPresentationMode() {
        return this.mPresentationMode;
    }

    public final int getMRedColor() {
        return this.mRedColor;
    }

    public final int getMShadowColor() {
        return this.mShadowColor;
    }

    public final int getMShadowTranslate() {
        return this.mShadowTranslate;
    }

    public final Paint getMTextPaint() {
        return this.mTextPaint;
    }

    public final void getTextBounds(String text, Paint paint) {
        paint.getTextBounds(text, 0, text.length(), this.mBounds);
    }

    public final void setMBounds(Rect rect) {
        this.mBounds = rect;
    }

    public final void setMDashPathEffect(DashPathEffect dashPathEffect) {
        this.mDashPathEffect = dashPathEffect;
    }

    public final void setMFillPaint(Paint paint) {
        this.mFillPaint = paint;
    }

    public final void setMKeyFrameCount(int i10) {
        this.mKeyFrameCount = i10;
    }

    public final void setMKeyFramePoints(float[] fArr) {
        this.mKeyFramePoints = fArr;
    }

    public final void setMPaint(Paint paint) {
        this.mPaint = paint;
    }

    public final void setMPaintGraph(Paint paint) {
        this.mPaintGraph = paint;
    }

    public final void setMPaintKeyframes(Paint paint) {
        this.mPaintKeyframes = paint;
    }

    public final void setMPath(Path path) {
        this.mPath = path;
    }

    public final void setMPathMode(int[] iArr) {
        this.mPathMode = iArr;
    }

    public final void setMPoints(float[] fArr) {
        this.mPoints = fArr;
    }

    public final void setMPresentationMode(boolean z9) {
        this.mPresentationMode = z9;
    }

    public final void setMShadowTranslate(int i10) {
        this.mShadowTranslate = i10;
    }

    public final void setMTextPaint(Paint paint) {
        this.mTextPaint = paint;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r10, androidx.constraintlayout.core.motion.Motion r11, int r12, int r13, int r14, int r15) {
        /*
            r9 = this;
            int r0 = r11.getDrawPath()
            r1 = 1
            if (r13 <= 0) goto Lb
            if (r0 != 0) goto Lb
            r4 = r1
            goto Lc
        Lb:
            r4 = r0
        Lc:
            if (r4 != 0) goto L10
            goto L9a
        L10:
            float[] r13 = r9.mKeyFramePoints
            int[] r0 = r9.mPathMode
            r2 = 0
            int r13 = r11.buildKeyFrames(r13, r0, r2)
            r9.mKeyFrameCount = r13
            if (r4 < r1) goto L9a
            int r12 = r12 / 16
            float[] r13 = r9.mPoints
            if (r13 == 0) goto L2b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
            int r13 = r13.length
            int r0 = r12 * 2
            if (r13 == r0) goto L38
        L2b:
            int r13 = r12 * 2
            float[] r13 = new float[r13]
            r9.mPoints = r13
            android.graphics.Path r13 = new android.graphics.Path
            r13.<init>()
            r9.mPath = r13
        L38:
            int r13 = r9.mShadowTranslate
            float r0 = (float) r13
            float r13 = (float) r13
            r10.translate(r0, r13)
            android.graphics.Paint r13 = r9.mPaint
            int r0 = r9.mShadowColor
            r13.setColor(r0)
            android.graphics.Paint r13 = r9.mFillPaint
            int r0 = r9.mShadowColor
            r13.setColor(r0)
            android.graphics.Paint r13 = r9.mPaintKeyframes
            int r0 = r9.mShadowColor
            r13.setColor(r0)
            android.graphics.Paint r13 = r9.mPaintGraph
            int r0 = r9.mShadowColor
            r13.setColor(r0)
            float[] r13 = r9.mPoints
            r11.buildPath(r13, r12)
            int r5 = r9.mKeyFrameCount
            r2 = r9
            r3 = r10
            r6 = r11
            r7 = r14
            r8 = r15
            r2.drawAll(r3, r4, r5, r6, r7, r8)
            android.graphics.Paint r10 = r2.mPaint
            int r11 = r2.mRedColor
            r10.setColor(r11)
            android.graphics.Paint r10 = r2.mPaintKeyframes
            int r11 = r2.mKeyframeColor
            r10.setColor(r11)
            android.graphics.Paint r10 = r2.mFillPaint
            int r11 = r2.mKeyframeColor
            r10.setColor(r11)
            android.graphics.Paint r10 = r2.mPaintGraph
            int r11 = r2.mGraphColor
            r10.setColor(r11)
            int r10 = r2.mShadowTranslate
            float r11 = (float) r10
            float r11 = -r11
            float r10 = (float) r10
            float r10 = -r10
            r3.translate(r11, r10)
            int r5 = r2.mKeyFrameCount
            r2.drawAll(r3, r4, r5, r6, r7, r8)
            r10 = 5
            if (r4 != r10) goto L9a
            r9.drawRectangle(r3, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionRenderDebug.draw(android.graphics.Canvas, androidx.constraintlayout.core.motion.Motion, int, int, int, int):void");
    }
}
