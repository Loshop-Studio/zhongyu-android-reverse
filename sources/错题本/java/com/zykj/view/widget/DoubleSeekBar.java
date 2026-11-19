package com.zykj.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\bC\u0018\u00002\u00020\u0001:\u0004\u0093\u0001\u0094\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0011H\u0002¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010$J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b(\u0010\u0017J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b)\u0010\u0017J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b*\u0010\u0017J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010\u0017J\u000f\u0010,\u001a\u00020\u0011H\u0002¢\u0006\u0004\b,\u0010$J\u001f\u0010.\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001eH\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R$\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00106R6\u0010L\u001a\b\u0012\u0004\u0012\u00020J0I2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0I8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u0002000R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010MR*\u0010T\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bT\u00106\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010Y\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bY\u00106\u001a\u0004\bZ\u0010V\"\u0004\b[\u0010XR*\u0010\\\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010!R*\u0010a\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010]\u001a\u0004\bb\u0010_\"\u0004\bc\u0010!R*\u0010d\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bd\u00106\u001a\u0004\be\u0010V\"\u0004\bf\u0010XR\u0016\u0010g\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010]R\u0016\u0010h\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010j\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR*\u0010l\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010]\u001a\u0004\bm\u0010_\"\u0004\bn\u0010!R*\u0010o\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bo\u00106\u001a\u0004\bp\u0010V\"\u0004\bq\u0010XR\u0016\u0010r\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010kR\u0016\u0010s\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u00106R*\u0010t\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bt\u00106\u001a\u0004\bu\u0010V\"\u0004\bv\u0010XR*\u0010w\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bw\u00106\u001a\u0004\bx\u0010V\"\u0004\by\u0010XR\u0016\u0010z\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010]R\u0016\u0010{\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010]R\u0014\u0010|\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010kR\u0016\u0010}\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u00106R+\u0010~\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010]\u001a\u0004\b\u007f\u0010_\"\u0005\b\u0080\u0001\u0010!R.\u0010\u0081\u0001\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u00106\u001a\u0005\b\u0082\u0001\u0010V\"\u0005\b\u0083\u0001\u0010XR\u0018\u0010\u0084\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010]R\u0018\u0010\u0085\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u00106R\u0018\u0010\u0086\u0001\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010kR\u0018\u0010\u0087\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u00106R\u0018\u0010\u0088\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u00106R\u0016\u0010\u0089\u0001\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010kR\u0017\u0010\u008a\u0001\u001a\u0002028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u008c\u0001\u001a\u0002028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008b\u0001R\u0017\u0010\u008d\u0001\u001a\u0002028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008b\u0001R\u0017\u0010\u008e\u0001\u001a\u0002028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008b\u0001R\u0018\u0010\u008f\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010]R\u0018\u0010\u0090\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010]R\u0018\u0010\u0091\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010]R\u0018\u0010\u0092\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010]¨\u0006\u0095\u0001"}, m5110d2 = {"Lcom/zykj/view/widget/DoubleSeekBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "widthMeasureSpec", "heightMeasureSpec", "Ld6/s;", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "", "x", "refreshSeekBar", "(F)V", "refreshMask", "calculateTrackLocation", "()V", "calculateKeyPointLocation", "calculateMaskLocation", "calculateThumbLocation", "drawTrack", "drawKeyPoint", "drawMask", "drawThumb", "initPaint", "y", "handleTouchMode", "(FF)I", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/Path;", "calculateLineInRectF", "(Landroid/graphics/RectF;)Landroid/graphics/Path;", "mTouchOffset", "I", "Landroid/graphics/Paint;", "mPaint", "Landroid/graphics/Paint;", "Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;", "seekChangeListener", "Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;", "getSeekChangeListener", "()Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;", "setSeekChangeListener", "(Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;)V", "Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;", "maskChangeListener", "Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;", "getMaskChangeListener", "()Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;", "setMaskChangeListener", "(Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;)V", "mCurrentTouchMode", "", "", "value", "keyPointList", "Ljava/util/List;", "getKeyPointList", "()Ljava/util/List;", "setKeyPointList", "(Ljava/util/List;)V", "", "mKeyPointRectList", "keyPointColor", "getKeyPointColor", "()I", "setKeyPointColor", "(I)V", "barSize", "getBarSize", "setBarSize", "max", "F", "getMax", "()F", "setMax", "min", "getMin", "setMin", "seekBarColor", "getSeekBarColor", "setSeekBarColor", "mSeekLength", "mIsTouching", "Z", "mSeekBarRectF", "Landroid/graphics/RectF;", "progress", "getProgress", "setProgress", "trackColor", "getTrackColor", "setTrackColor", "mTrackRectF", "mTrackWidth", "thumbSize", "getThumbSize", "setThumbSize", "thumbColor", "getThumbColor", "setThumbColor", "mThumbRadius", "mTouchThumbRadius", "mThumbRect", "mThumbHeight", "maskProgress", "getMaskProgress", "setMaskProgress", "maskColor", "getMaskColor", "setMaskColor", "mMaskStrokeSize", "mMaskHeight", "mMaskRectF", "mMaskDecoratorSize", "mMaskDecoratorConner", "mTempRect", "mMaskLeftPath", "Landroid/graphics/Path;", "mMaskLeftIconPath", "mMaskRightPath", "mMaskRightLine", "mPaddingStart", "mPaddingTop", "mPaddingRight", "mPaddingBottom", "OnSeekChangeListener", "OnMaskChangeListener", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDoubleSeekBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleSeekBar.kt\ncom/zykj/view/widget/DoubleSeekBar\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,595:1\n1869#2,2:596\n1869#2,2:598\n*S KotlinDebug\n*F\n+ 1 DoubleSeekBar.kt\ncom/zykj/view/widget/DoubleSeekBar\n*L\n289#1:596,2\n455#1:598,2\n*E\n"})
/* loaded from: classes3.dex */
public final class DoubleSeekBar extends View {
    private int barSize;
    private int keyPointColor;

    @NotNull
    private List<long[]> keyPointList;
    private int mCurrentTouchMode;
    private boolean mIsTouching;

    @NotNull
    private final List<RectF> mKeyPointRectList;
    private int mMaskDecoratorConner;
    private int mMaskDecoratorSize;
    private int mMaskHeight;

    @NotNull
    private final Path mMaskLeftIconPath;

    @NotNull
    private final Path mMaskLeftPath;

    @NotNull
    private RectF mMaskRectF;

    @NotNull
    private final Path mMaskRightLine;

    @NotNull
    private final Path mMaskRightPath;
    private float mMaskStrokeSize;
    private float mPaddingBottom;
    private float mPaddingRight;
    private float mPaddingStart;
    private float mPaddingTop;

    @NotNull
    private final Paint mPaint;

    @NotNull
    private RectF mSeekBarRectF;
    private float mSeekLength;

    @NotNull
    private final RectF mTempRect;
    private int mThumbHeight;
    private float mThumbRadius;

    @NotNull
    private final RectF mThumbRect;
    private final int mTouchOffset;
    private float mTouchThumbRadius;

    @NotNull
    private RectF mTrackRectF;
    private int mTrackWidth;

    @Nullable
    private OnMaskChangeListener maskChangeListener;
    private int maskColor;
    private float maskProgress;
    private float max;
    private float min;
    private float progress;
    private int seekBarColor;

    @Nullable
    private OnSeekChangeListener seekChangeListener;
    private int thumbColor;
    private int thumbSize;
    private int trackColor;

    @Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\n¨\u0006\fÀ\u0006\u0003"}, m5110d2 = {"Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;", "", "Lcom/zykj/view/widget/DoubleSeekBar;", "seekBar", "", "progress", "Ld6/s;", "onSeeking", "(Lcom/zykj/view/widget/DoubleSeekBar;F)V", "onStartTrackingTouch", "(Lcom/zykj/view/widget/DoubleSeekBar;)V", "onStopTrackingTouch", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface OnMaskChangeListener {
        void onSeeking(@NotNull DoubleSeekBar seekBar, float progress);

        void onStartTrackingTouch(@NotNull DoubleSeekBar seekBar);

        void onStopTrackingTouch(@NotNull DoubleSeekBar seekBar);
    }

    @Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\n¨\u0006\fÀ\u0006\u0003"}, m5110d2 = {"Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;", "", "Lcom/zykj/view/widget/DoubleSeekBar;", "seekBar", "", "progress", "Ld6/s;", "onSeeking", "(Lcom/zykj/view/widget/DoubleSeekBar;F)V", "onStartTrackingTouch", "(Lcom/zykj/view/widget/DoubleSeekBar;)V", "onStopTrackingTouch", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface OnSeekChangeListener {
        void onSeeking(@NotNull DoubleSeekBar seekBar, float progress);

        void onStartTrackingTouch(@NotNull DoubleSeekBar seekBar);

        void onStopTrackingTouch(@NotNull DoubleSeekBar seekBar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DoubleSeekBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        AbstractC5830k.m5330g(context, "context");
    }

    private final void calculateKeyPointLocation() {
        ArrayList arrayList = new ArrayList();
        for (long[] jArr : this.keyPointList) {
            if (jArr[0] < this.min || jArr[1] > this.max) {
                return;
            }
            RectF rectF = new RectF();
            float f = this.mPaddingStart;
            float f7 = jArr[0];
            float f8 = this.min;
            float f9 = this.mSeekLength;
            float f10 = this.max;
            rectF.left = (((f7 - f8) * f9) / (f10 - f8)) + f;
            rectF.right = (((jArr[1] - f8) * f9) / (f10 - f8)) + f;
            float f11 = this.mPaddingTop;
            int i = this.mMaskHeight;
            int i8 = this.mTrackWidth;
            float f12 = ((i - i8) / 2) + f11;
            rectF.top = f12;
            rectF.bottom = f12 + i8;
            arrayList.add(rectF);
        }
        this.mKeyPointRectList.clear();
        this.mKeyPointRectList.addAll(arrayList);
    }

    private final Path calculateLineInRectF(RectF rectF) {
        Path path = new Path();
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float f = fWidth + fHeight;
        int i = 10;
        while (true) {
            float f7 = i;
            if (f7 >= f) {
                return path;
            }
            if (f7 > fWidth && f7 < fHeight) {
                path.moveTo(rectF.left, rectF.bottom - (f7 - fWidth));
                path.lineTo(rectF.right, rectF.bottom - f7);
            } else if (f7 < fHeight) {
                path.moveTo(rectF.right - f7, rectF.bottom);
                path.lineTo(rectF.right, rectF.bottom - f7);
            } else if (f7 > fWidth) {
                path.moveTo(rectF.left, rectF.bottom - (f7 - fWidth));
                path.lineTo(rectF.right - (f7 - fHeight), rectF.top);
            } else {
                path.moveTo(rectF.right - f7, rectF.bottom);
                path.lineTo(rectF.right - (f7 - fHeight), rectF.top);
            }
            i += 10;
        }
    }

    private final void calculateMaskLocation() {
        RectF rectF = this.mMaskRectF;
        float f = this.mPaddingStart;
        float f7 = this.maskProgress;
        float f8 = this.min;
        float f9 = this.mSeekLength;
        float f10 = (((f7 - f8) * f9) / (this.max - f8)) + f;
        rectF.left = f10;
        float f11 = this.mPaddingTop;
        rectF.top = f11;
        rectF.right = f + f9;
        float f12 = this.mMaskHeight + f11;
        rectF.bottom = f12;
        float f13 = this.mMaskStrokeSize;
        float f14 = (f10 - (f13 * 0.5f)) - this.mMaskDecoratorSize;
        float f15 = f10 - (f13 * 0.5f);
        Path path = this.mMaskLeftPath;
        path.reset();
        path.moveTo(f15, f11);
        path.lineTo(f15, f12);
        path.lineTo(this.mMaskDecoratorConner + f14, f12);
        RectF rectF2 = this.mTempRect;
        int i = this.mMaskDecoratorConner;
        rectF2.set(f14, f12 - (i * 2), (i * 2) + f14, f12);
        path.arcTo(this.mTempRect, 90.0f, 90.0f);
        path.lineTo(f14, this.mMaskDecoratorConner + f11);
        RectF rectF3 = this.mTempRect;
        int i8 = this.mMaskDecoratorConner;
        rectF3.set(f14, f11, (i8 * 2) + f14, (i8 * 2) + f11);
        path.arcTo(this.mTempRect, 180.0f, 90.0f);
        path.lineTo(f15, f11);
        Path path2 = this.mMaskLeftIconPath;
        path2.reset();
        path2.moveTo(f15 - (this.mMaskDecoratorSize / 4), this.mMaskRectF.centerY() - (this.mMaskDecoratorSize / 2));
        path2.lineTo(f14 + (this.mMaskDecoratorSize / 4), this.mMaskRectF.centerY());
        path2.lineTo(f15 - (this.mMaskDecoratorSize / 4), this.mMaskRectF.centerY() + (this.mMaskDecoratorSize / 2));
        RectF rectF4 = this.mMaskRectF;
        float f16 = rectF4.right;
        float f17 = this.mMaskStrokeSize;
        float f18 = (f17 * 0.5f) + f16;
        float f19 = rectF4.top;
        float f20 = (f17 * 0.5f) + f16 + this.mMaskDecoratorSize;
        float f21 = rectF4.bottom;
        Path path3 = this.mMaskRightPath;
        path3.reset();
        path3.moveTo(f18, f19);
        path3.lineTo(f18, f21);
        path3.lineTo(f20 - this.mMaskDecoratorConner, f21);
        RectF rectF5 = this.mTempRect;
        int i9 = this.mMaskDecoratorConner;
        rectF5.set(f20 - (i9 * 2), f21 - (i9 * 2), f20, f21);
        path3.arcTo(this.mTempRect, 90.0f, -90.0f);
        path3.lineTo(f20, this.mMaskDecoratorConner + f19);
        RectF rectF6 = this.mTempRect;
        int i10 = this.mMaskDecoratorConner;
        rectF6.set(f20 - (i10 * 2), f19, f20, (i10 * 2) + f19);
        path3.arcTo(this.mTempRect, 0.0f, -90.0f);
        path3.lineTo(f18, f19);
        Path path4 = this.mMaskRightLine;
        path4.reset();
        path4.set(calculateLineInRectF(new RectF(f18, f19, f20, f21)));
    }

    private final void calculateThumbLocation() {
        RectF rectF = this.mThumbRect;
        float f = this.mPaddingStart;
        float f7 = this.progress;
        float f8 = this.min;
        float f9 = (((f7 - f8) * this.mSeekLength) / (this.max - f8)) + f;
        float f10 = this.mThumbRadius;
        float f11 = f9 - f10;
        rectF.left = f11;
        rectF.right = (f10 * 2) + f11;
        float f12 = this.mPaddingTop;
        rectF.top = f12;
        rectF.bottom = f12 + this.mThumbHeight;
    }

    private final void calculateTrackLocation() {
        RectF rectF = this.mTrackRectF;
        float f = this.mPaddingStart;
        rectF.left = f;
        float f7 = this.progress;
        float f8 = this.min;
        float f9 = this.mSeekLength;
        float f10 = (((f7 - f8) * f9) / (this.max - f8)) + f;
        rectF.right = f10;
        float f11 = this.mPaddingTop;
        int i = this.mMaskHeight;
        int i8 = this.mTrackWidth;
        float f12 = ((i - i8) / 2) + f11;
        rectF.top = f12;
        float f13 = i8 + f12;
        rectF.bottom = f13;
        RectF rectF2 = this.mSeekBarRectF;
        rectF2.left = f10;
        rectF2.right = rectF.left + f9;
        rectF2.top = f12;
        rectF2.bottom = f13;
    }

    private final void drawKeyPoint(Canvas canvas) {
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setColor(this.keyPointColor);
        Iterator<T> it = this.mKeyPointRectList.iterator();
        while (it.hasNext()) {
            canvas.drawRect((RectF) it.next(), this.mPaint);
        }
    }

    private final void drawMask(Canvas canvas) {
        this.mPaint.setColor(this.maskColor);
        this.mPaint.setStrokeWidth(this.mMaskStrokeSize);
        Paint paint = this.mPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        canvas.drawRect(this.mMaskRectF, this.mPaint);
        this.mPaint.setStrokeWidth(this.mMaskStrokeSize);
        this.mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawPath(this.mMaskLeftPath, this.mPaint);
        this.mPaint.setColor(-1);
        float f = 2;
        this.mPaint.setStrokeWidth(this.mMaskStrokeSize / f);
        this.mPaint.setStyle(style);
        canvas.drawPath(this.mMaskLeftIconPath, this.mPaint);
        this.mPaint.setColor(this.maskColor);
        this.mPaint.setStrokeWidth(this.mMaskStrokeSize);
        this.mPaint.setStyle(style);
        canvas.drawPath(this.mMaskRightPath, this.mPaint);
        this.mPaint.setStrokeWidth(this.mMaskStrokeSize / f);
        this.mPaint.setStyle(style);
        canvas.drawPath(this.mMaskRightLine, this.mPaint);
    }

    private final void drawThumb(Canvas canvas) {
        this.mPaint.setColor(this.thumbColor);
        this.mPaint.setStyle(Paint.Style.FILL);
        Log.i("drawThumb", "rect -> " + this.mThumbRect);
        RectF rectF = this.mThumbRect;
        float f = this.mThumbRadius;
        canvas.drawRoundRect(rectF, f, f, this.mPaint);
    }

    private final void drawTrack(Canvas canvas) {
        this.mPaint.setStyle(Paint.Style.FILL);
        if (this.mMaskRectF.left <= this.mTrackRectF.right) {
            RectF rectF = new RectF(this.mTrackRectF);
            rectF.right = this.mMaskRectF.left;
            this.mPaint.setColor(this.seekBarColor);
            canvas.drawRect(rectF, this.mPaint);
            RectF rectF2 = new RectF(this.mTrackRectF);
            rectF2.left = this.mMaskRectF.left;
            this.mPaint.setColor(this.trackColor);
            canvas.drawRect(rectF2, this.mPaint);
        } else {
            this.mPaint.setColor(this.trackColor);
            canvas.drawRect(this.mTrackRectF, this.mPaint);
        }
        this.mPaint.setColor(this.seekBarColor);
        canvas.drawRect(this.mSeekBarRectF, this.mPaint);
    }

    private final int handleTouchMode(float x3, float y2) {
        RectF rectF = new RectF();
        float f = this.mPaddingStart;
        int i = this.mTouchOffset;
        rectF.left = f - i;
        float f7 = this.mPaddingTop;
        rectF.top = f7 - i;
        rectF.right = f + this.mSeekLength + i;
        rectF.bottom = f7 + this.mThumbHeight + i;
        RectF rectF2 = new RectF();
        RectF rectF3 = this.mMaskRectF;
        float f8 = rectF3.left;
        int i8 = this.mTouchOffset;
        rectF2.left = f8 - i8;
        rectF2.top = rectF3.top - i8;
        rectF2.right = rectF3.left + i8;
        rectF2.bottom = rectF3.bottom + i8;
        if (rectF2.contains(x3, y2)) {
            return 1;
        }
        return rectF.contains(x3, y2) ? 0 : -1;
    }

    private final void initPaint() {
        Paint paint = this.mPaint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
    }

    private final void refreshMask(float x3) {
        RectF rectF = this.mTrackRectF;
        float f = rectF.left;
        if (x3 >= f && x3 <= this.mSeekBarRectF.right) {
            float f7 = this.min;
            setMaskProgress((((this.max - f7) * (x3 - f)) / this.mSeekLength) + f7);
        } else if (x3 < f) {
            setMaskProgress(this.min);
        } else if (x3 > rectF.right) {
            setMaskProgress(this.max);
        }
    }

    private final void refreshSeekBar(float x3) {
        RectF rectF = this.mTrackRectF;
        float f = rectF.left;
        if (x3 >= f && x3 <= this.mSeekBarRectF.right) {
            float f7 = this.min;
            setProgress((((this.max - f7) * (x3 - f)) / this.mSeekLength) + f7);
        } else if (x3 < f) {
            setProgress(this.min);
        } else if (x3 > rectF.right) {
            setProgress(this.max);
        }
    }

    public final int getBarSize() {
        return this.barSize;
    }

    public final int getKeyPointColor() {
        return this.keyPointColor;
    }

    @NotNull
    public final List<long[]> getKeyPointList() {
        return this.keyPointList;
    }

    @Nullable
    public final OnMaskChangeListener getMaskChangeListener() {
        return this.maskChangeListener;
    }

    public final int getMaskColor() {
        return this.maskColor;
    }

    public final float getMaskProgress() {
        return this.maskProgress;
    }

    public final float getMax() {
        return this.max;
    }

    public final float getMin() {
        return this.min;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int getSeekBarColor() {
        return this.seekBarColor;
    }

    @Nullable
    public final OnSeekChangeListener getSeekChangeListener() {
        return this.seekChangeListener;
    }

    public final int getThumbColor() {
        return this.thumbColor;
    }

    public final int getThumbSize() {
        return this.thumbSize;
    }

    public final int getTrackColor() {
        return this.trackColor;
    }

    @Override // android.view.View
    public synchronized void onDraw(@NotNull Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "canvas");
        drawTrack(canvas);
        drawKeyPoint(canvas);
        drawMask(canvas);
        drawThumb(canvas);
    }

    @Override // android.view.View
    public synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        try {
            int size = View.MeasureSpec.getSize(widthMeasureSpec);
            int mode = View.MeasureSpec.getMode(heightMeasureSpec);
            int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
            this.mPaddingStart = Math.max(this.mPaddingStart, getPaddingStart());
            this.mPaddingTop = Math.max(this.mPaddingTop, getPaddingTop());
            this.mPaddingRight = Math.max(this.mPaddingRight, getPaddingRight());
            float fMax = Math.max(this.mPaddingBottom, getPaddingBottom());
            this.mPaddingBottom = fMax;
            this.mSeekLength = (size - this.mPaddingStart) - this.mPaddingRight;
            int i = (int) (this.mPaddingTop + fMax);
            if (mode == 1073741824) {
                this.mMaskHeight = Math.max(this.mMaskHeight, size2 - i);
            }
            int i8 = this.mMaskHeight;
            this.mThumbHeight = i8;
            setMeasuredDimension(size, i8 + i);
            calculateTrackLocation();
            calculateThumbLocation();
            calculateMaskLocation();
            calculateKeyPointLocation();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@NotNull Parcelable state) {
        AbstractC5830k.m5330g(state, "state");
        if (!(state instanceof Bundle)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Bundle bundle = (Bundle) state;
        setProgress(bundle.getFloat("seek_bar_progress"));
        setMaskProgress(bundle.getFloat("seek_bar_mask_progress"));
        super.onRestoreInstanceState(bundle.getParcelable("seek_bar_state"));
    }

    @Override // android.view.View
    @NotNull
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("seek_bar_state", super.onSaveInstanceState());
        bundle.putFloat("seek_bar_progress", this.progress);
        bundle.putFloat("seek_bar_mask_progress", this.maskProgress);
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r4, r0)
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == 0) goto L66
            if (r0 == r1) goto L3e
            r2 = 2
            if (r0 == r2) goto L15
            r2 = 3
            if (r0 == r2) goto L3e
            goto L78
        L15:
            int r0 = r3.mCurrentTouchMode
            if (r0 == 0) goto L2d
            if (r0 == r1) goto L1c
            goto L78
        L1c:
            float r0 = r4.getX()
            r3.refreshMask(r0)
            com.zykj.view.widget.DoubleSeekBar$OnMaskChangeListener r0 = r3.maskChangeListener
            if (r0 == 0) goto L78
            float r1 = r3.progress
            r0.onSeeking(r3, r1)
            goto L78
        L2d:
            float r0 = r4.getX()
            r3.refreshSeekBar(r0)
            com.zykj.view.widget.DoubleSeekBar$OnSeekChangeListener r0 = r3.seekChangeListener
            if (r0 == 0) goto L78
            float r1 = r3.progress
            r0.onSeeking(r3, r1)
            goto L78
        L3e:
            int r0 = r3.mCurrentTouchMode
            if (r0 == 0) goto L54
            if (r0 == r1) goto L45
            goto L78
        L45:
            float r0 = r4.getX()
            r3.refreshMask(r0)
            com.zykj.view.widget.DoubleSeekBar$OnMaskChangeListener r0 = r3.maskChangeListener
            if (r0 == 0) goto L78
            r0.onStopTrackingTouch(r3)
            goto L78
        L54:
            r0 = 0
            r3.mIsTouching = r0
            float r0 = r4.getX()
            r3.refreshSeekBar(r0)
            com.zykj.view.widget.DoubleSeekBar$OnSeekChangeListener r0 = r3.seekChangeListener
            if (r0 == 0) goto L78
            r0.onStopTrackingTouch(r3)
            goto L78
        L66:
            float r0 = r4.getX()
            float r2 = r4.getY()
            int r0 = r3.handleTouchMode(r0, r2)
            r3.mCurrentTouchMode = r0
            if (r0 == 0) goto L8c
            if (r0 == r1) goto L7d
        L78:
            boolean r4 = super.onTouchEvent(r4)
            return r4
        L7d:
            float r4 = r4.getX()
            r3.refreshMask(r4)
            com.zykj.view.widget.DoubleSeekBar$OnMaskChangeListener r4 = r3.maskChangeListener
            if (r4 == 0) goto L8b
            r4.onStartTrackingTouch(r3)
        L8b:
            return r1
        L8c:
            r3.mIsTouching = r1
            float r4 = r4.getX()
            r3.refreshSeekBar(r4)
            com.zykj.view.widget.DoubleSeekBar$OnSeekChangeListener r4 = r3.seekChangeListener
            if (r4 == 0) goto L9c
            r4.onStartTrackingTouch(r3)
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.widget.DoubleSeekBar.onTouchEvent(android.view.MotionEvent):boolean"); // DEX body: android/错题本/smali_classes3/com/zykj/view/widget/DoubleSeekBar.smali:3719
    }

    public final void setBarSize(int i) {
        this.barSize = i;
        this.mTrackWidth = i;
        calculateTrackLocation();
        calculateKeyPointLocation();
        invalidate();
    }

    public final void setKeyPointColor(int i) {
        this.keyPointColor = i;
        invalidate();
    }

    public final void setKeyPointList(@NotNull List<long[]> value) {
        AbstractC5830k.m5330g(value, "value");
        this.keyPointList = value;
        calculateTrackLocation();
        invalidate();
    }

    public final void setMaskChangeListener(@Nullable OnMaskChangeListener onMaskChangeListener) {
        this.maskChangeListener = onMaskChangeListener;
    }

    public final void setMaskColor(int i) {
        this.maskColor = i;
        invalidate();
    }

    public final void setMaskProgress(float f) {
        this.maskProgress = f;
        calculateMaskLocation();
        invalidate();
    }

    public final void setMax(float f) {
        if (this.max > this.min) {
            this.max = f;
            calculateTrackLocation();
            calculateThumbLocation();
            calculateKeyPointLocation();
            invalidate();
        }
    }

    public final void setMin(float f) {
        if (this.max > this.min) {
            this.min = f;
            calculateTrackLocation();
            calculateThumbLocation();
            calculateKeyPointLocation();
            invalidate();
        }
    }

    public final void setProgress(float f) {
        this.progress = f;
        calculateTrackLocation();
        calculateThumbLocation();
        invalidate();
    }

    public final void setSeekBarColor(int i) {
        this.seekBarColor = i;
        invalidate();
    }

    public final void setSeekChangeListener(@Nullable OnSeekChangeListener onSeekChangeListener) {
        this.seekChangeListener = onSeekChangeListener;
    }

    public final void setThumbColor(int i) {
        this.thumbColor = i;
        invalidate();
    }

    public final void setThumbSize(int i) {
        this.thumbSize = i;
        float f = i * 0.5f;
        this.mThumbRadius = f;
        this.mTouchThumbRadius = f * 1.2f;
        calculateThumbLocation();
        invalidate();
    }

    public final void setTrackColor(int i) {
        this.trackColor = i;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DoubleSeekBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5830k.m5330g(context, "context");
    }

    public /* synthetic */ DoubleSeekBar(Context context, AttributeSet attributeSet, int i, int i8, AbstractC5824e abstractC5824e) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DoubleSeekBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC5830k.m5330g(context, "context");
        this.mTouchOffset = 25;
        this.mPaint = new Paint();
        this.mCurrentTouchMode = -1;
        this.keyPointList = EmptyList.INSTANCE;
        this.mKeyPointRectList = new ArrayList();
        this.keyPointColor = Color.parseColor("#C8C9CC");
        this.barSize = 6;
        this.max = 100.0f;
        this.seekBarColor = Color.parseColor("#EBEDF0");
        this.mSeekBarRectF = new RectF();
        this.trackColor = Color.parseColor("#EBEDF0");
        this.mTrackRectF = new RectF();
        this.mTrackWidth = this.barSize;
        this.thumbSize = 9;
        this.thumbColor = Color.parseColor("#54576A");
        float f = this.thumbSize * 0.5f;
        this.mThumbRadius = f;
        this.mTouchThumbRadius = f * 1.2f;
        this.mThumbRect = new RectF();
        this.mThumbHeight = 47;
        this.maskColor = Color.parseColor("#FF3B30");
        this.mMaskStrokeSize = 3.0f;
        this.mMaskHeight = 47;
        this.mMaskRectF = new RectF();
        this.mMaskDecoratorSize = 16;
        this.mMaskDecoratorConner = 3;
        this.mTempRect = new RectF();
        this.mMaskLeftPath = new Path();
        this.mMaskLeftIconPath = new Path();
        this.mMaskRightPath = new Path();
        this.mMaskRightLine = new Path();
        int i8 = this.mMaskDecoratorSize;
        float f7 = this.mMaskStrokeSize;
        this.mPaddingStart = i8 + f7;
        this.mPaddingTop = f7 * 0.5f;
        this.mPaddingRight = i8 + f7;
        this.mPaddingBottom = f7 * 0.5f;
        initPaint();
    }
}
