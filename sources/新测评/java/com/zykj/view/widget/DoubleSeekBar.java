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
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\bY\u0018\u00002\u00020\u0001:\u00023%B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0011H\u0002¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010$J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b(\u0010\u0017J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b)\u0010\u0017J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b*\u0010\u0017J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010\u0017J\u000f\u0010,\u001a\u00020\u0011H\u0002¢\u0006\u0004\b,\u0010$J\u001f\u0010.\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001eH\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00108R$\u0010@\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010G\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00105R6\u0010Q\u001a\b\u0012\u0004\u0012\u00020J0I2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0I8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u0002000R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010LR*\u0010X\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u00105\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR*\u0010[\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00105\u001a\u0004\bY\u0010U\"\u0004\bZ\u0010WR*\u0010`\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010!R*\u0010c\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\\\u001a\u0004\ba\u0010^\"\u0004\bb\u0010!R*\u0010f\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u00105\u001a\u0004\bd\u0010U\"\u0004\be\u0010WR\u0016\u0010g\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\\R\u0016\u0010j\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010m\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR*\u0010q\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010\\\u001a\u0004\bo\u0010^\"\u0004\bp\u0010!R*\u0010u\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\br\u00105\u001a\u0004\bs\u0010U\"\u0004\bt\u0010WR\u0016\u0010w\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010lR\u0016\u0010y\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u00105R*\u0010}\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bz\u00105\u001a\u0004\b{\u0010U\"\u0004\b|\u0010WR,\u0010\u0081\u0001\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0013\n\u0004\b~\u00105\u001a\u0004\b\u007f\u0010U\"\u0005\b\u0080\u0001\u0010WR\u0018\u0010\u0083\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\\R\u0018\u0010\u0085\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\\R\u0015\u0010\u0086\u0001\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010lR\u0017\u0010\u0087\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00105R.\u0010\u008b\u0001\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010\\\u001a\u0005\b\u0089\u0001\u0010^\"\u0005\b\u008a\u0001\u0010!R.\u0010\u008f\u0001\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u00105\u001a\u0005\b\u008d\u0001\u0010U\"\u0005\b\u008e\u0001\u0010WR\u0018\u0010\u0091\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010\\R\u0018\u0010\u0093\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u00105R\u0018\u0010\u0095\u0001\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010lR\u0018\u0010\u0097\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u00105R\u0017\u0010\u0098\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u00105R\u0016\u0010\u009a\u0001\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010lR\u0017\u0010\u009d\u0001\u001a\u0002028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0016\u0010\u009e\u0001\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010\u009c\u0001R\u0017\u0010 \u0001\u001a\u0002028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009c\u0001R\u0017\u0010¢\u0001\u001a\u0002028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010\u009c\u0001R\u0018\u0010¤\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b£\u0001\u0010\\R\u0018\u0010¦\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¥\u0001\u0010\\R\u0018\u0010¨\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b§\u0001\u0010\\R\u0018\u0010ª\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b©\u0001\u0010\\¨\u0006«\u0001"}, m13558d2 = {"Lcom/zykj/view/widget/DoubleSeekBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "", "x", "m", "(F)V", "l", "e", "()V", "a", "c", "d", "i", "f", "g", "h", "k", "y", "j", "(FF)I", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/Path;", "b", "(Landroid/graphics/RectF;)Landroid/graphics/Path;", "I", "mTouchOffset", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mPaint", "Lcom/zykj/view/widget/DoubleSeekBar$b;", "Lcom/zykj/view/widget/DoubleSeekBar$b;", "getSeekChangeListener", "()Lcom/zykj/view/widget/DoubleSeekBar$b;", "setSeekChangeListener", "(Lcom/zykj/view/widget/DoubleSeekBar$b;)V", "seekChangeListener", "Lcom/zykj/view/widget/DoubleSeekBar$a;", "Lcom/zykj/view/widget/DoubleSeekBar$a;", "getMaskChangeListener", "()Lcom/zykj/view/widget/DoubleSeekBar$a;", "setMaskChangeListener", "(Lcom/zykj/view/widget/DoubleSeekBar$a;)V", "maskChangeListener", "mCurrentTouchMode", "", "", "value", "Ljava/util/List;", "getKeyPointList", "()Ljava/util/List;", "setKeyPointList", "(Ljava/util/List;)V", "keyPointList", "", "mKeyPointRectList", "getKeyPointColor", "()I", "setKeyPointColor", "(I)V", "keyPointColor", "getBarSize", "setBarSize", "barSize", "F", "getMax", "()F", "setMax", "max", "getMin", "setMin", "min", "getSeekBarColor", "setSeekBarColor", "seekBarColor", "mSeekLength", "n", "Z", "mIsTouching", "o", "Landroid/graphics/RectF;", "mSeekBarRectF", "p", "getProgress", "setProgress", "progress", "q", "getTrackColor", "setTrackColor", "trackColor", "r", "mTrackRectF", "s", "mTrackWidth", "t", "getThumbSize", "setThumbSize", "thumbSize", "u", "getThumbColor", "setThumbColor", "thumbColor", "v", "mThumbRadius", "w", "mTouchThumbRadius", "mThumbRect", "mThumbHeight", "z", "getMaskProgress", "setMaskProgress", "maskProgress", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getMaskColor", "setMaskColor", "maskColor", "B", "mMaskStrokeSize", "C", "mMaskHeight", "D", "mMaskRectF", ExifInterface.LONGITUDE_EAST, "mMaskDecoratorSize", "mMaskDecoratorConner", "G", "mTempRect", "H", "Landroid/graphics/Path;", "mMaskLeftPath", "mMaskLeftIconPath", "J", "mMaskRightPath", "K", "mMaskRightLine", "L", "mPaddingStart", "M", "mPaddingTop", "N", "mPaddingRight", "O", "mPaddingBottom", "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nDoubleSeekBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleSeekBar.kt\ncom/zykj/view/widget/DoubleSeekBar\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,595:1\n1869#2,2:596\n1869#2,2:598\n*S KotlinDebug\n*F\n+ 1 DoubleSeekBar.kt\ncom/zykj/view/widget/DoubleSeekBar\n*L\n289#1:596,2\n455#1:598,2\n*E\n"})
/* loaded from: classes5.dex */
public final class DoubleSeekBar extends View {

    /* renamed from: A, reason: from kotlin metadata */
    public int maskColor;

    /* renamed from: B, reason: from kotlin metadata */
    public float mMaskStrokeSize;

    /* renamed from: C, reason: from kotlin metadata */
    public int mMaskHeight;

    /* renamed from: D, reason: from kotlin metadata */
    public RectF mMaskRectF;

    /* renamed from: E, reason: from kotlin metadata */
    public int mMaskDecoratorSize;

    /* renamed from: F, reason: from kotlin metadata */
    public int mMaskDecoratorConner;

    /* renamed from: G, reason: from kotlin metadata */
    public final RectF mTempRect;

    /* renamed from: H, reason: from kotlin metadata */
    public final Path mMaskLeftPath;

    /* renamed from: I, reason: from kotlin metadata */
    public final Path mMaskLeftIconPath;

    /* renamed from: J, reason: from kotlin metadata */
    public final Path mMaskRightPath;

    /* renamed from: K, reason: from kotlin metadata */
    public final Path mMaskRightLine;

    /* renamed from: L, reason: from kotlin metadata */
    public float mPaddingStart;

    /* renamed from: M, reason: from kotlin metadata */
    public float mPaddingTop;

    /* renamed from: N, reason: from kotlin metadata */
    public float mPaddingRight;

    /* renamed from: O, reason: from kotlin metadata */
    public float mPaddingBottom;

    /* renamed from: a, reason: from kotlin metadata */
    public final int mTouchOffset;

    /* renamed from: b, reason: from kotlin metadata */
    public final Paint mPaint;

    /* renamed from: c, reason: from kotlin metadata */
    public InterfaceC7269b seekChangeListener;

    /* renamed from: d, reason: from kotlin metadata */
    public InterfaceC7268a maskChangeListener;

    /* renamed from: e, reason: from kotlin metadata */
    public int mCurrentTouchMode;

    /* renamed from: f, reason: from kotlin metadata */
    public List keyPointList;

    /* renamed from: g, reason: from kotlin metadata */
    public final List mKeyPointRectList;

    /* renamed from: h, reason: from kotlin metadata */
    public int keyPointColor;

    /* renamed from: i, reason: from kotlin metadata */
    public int barSize;

    /* renamed from: j, reason: from kotlin metadata */
    public float max;

    /* renamed from: k, reason: from kotlin metadata */
    public float min;

    /* renamed from: l, reason: from kotlin metadata */
    public int seekBarColor;

    /* renamed from: m, reason: from kotlin metadata */
    public float mSeekLength;

    /* renamed from: n, reason: from kotlin metadata */
    public boolean mIsTouching;

    /* renamed from: o, reason: from kotlin metadata */
    public RectF mSeekBarRectF;

    /* renamed from: p, reason: from kotlin metadata */
    public float progress;

    /* renamed from: q, reason: from kotlin metadata */
    public int trackColor;

    /* renamed from: r, reason: from kotlin metadata */
    public RectF mTrackRectF;

    /* renamed from: s, reason: from kotlin metadata */
    public int mTrackWidth;

    /* renamed from: t, reason: from kotlin metadata */
    public int thumbSize;

    /* renamed from: u, reason: from kotlin metadata */
    public int thumbColor;

    /* renamed from: v, reason: from kotlin metadata */
    public float mThumbRadius;

    /* renamed from: w, reason: from kotlin metadata */
    public float mTouchThumbRadius;

    /* renamed from: x, reason: from kotlin metadata */
    public final RectF mThumbRect;

    /* renamed from: y, reason: from kotlin metadata */
    public int mThumbHeight;

    /* renamed from: z, reason: from kotlin metadata */
    public float maskProgress;

    /* renamed from: com.zykj.view.widget.DoubleSeekBar$a */
    public interface InterfaceC7268a {
        /* renamed from: a */
        void mo11085a(DoubleSeekBar doubleSeekBar);

        /* renamed from: b */
        void mo11086b(DoubleSeekBar doubleSeekBar, float f10);

        /* renamed from: c */
        void mo11087c(DoubleSeekBar doubleSeekBar);
    }

    /* renamed from: com.zykj.view.widget.DoubleSeekBar$b */
    public interface InterfaceC7269b {
        /* renamed from: a */
        void mo11082a(DoubleSeekBar doubleSeekBar);

        /* renamed from: b */
        void mo11083b(DoubleSeekBar doubleSeekBar, float f10);

        /* renamed from: c */
        void mo11084c(DoubleSeekBar doubleSeekBar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DoubleSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public final void m11467a() {
        ArrayList arrayList = new ArrayList();
        for (long[] jArr : this.keyPointList) {
            if (jArr[0] < this.min || jArr[1] > this.max) {
                return;
            }
            RectF rectF = new RectF();
            float f10 = this.mPaddingStart;
            float f11 = jArr[0];
            float f12 = this.min;
            float f13 = this.mSeekLength;
            float f14 = this.max;
            rectF.left = (((f11 - f12) * f13) / (f14 - f12)) + f10;
            rectF.right = f10 + (((jArr[1] - f12) * f13) / (f14 - f12));
            float f15 = this.mPaddingTop;
            int i10 = this.mMaskHeight;
            int i11 = this.mTrackWidth;
            float f16 = f15 + ((i10 - i11) / 2);
            rectF.top = f16;
            rectF.bottom = f16 + i11;
            arrayList.add(rectF);
        }
        this.mKeyPointRectList.clear();
        this.mKeyPointRectList.addAll(arrayList);
    }

    /* renamed from: b */
    public final Path m11468b(RectF rectF) {
        Path path = new Path();
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float f10 = fWidth + fHeight;
        int i10 = 10;
        while (true) {
            float f11 = i10;
            if (f11 >= f10) {
                return path;
            }
            if (f11 > fWidth && f11 < fHeight) {
                path.moveTo(rectF.left, rectF.bottom - (f11 - fWidth));
                path.lineTo(rectF.right, rectF.bottom - f11);
            } else if (f11 < fHeight) {
                path.moveTo(rectF.right - f11, rectF.bottom);
                path.lineTo(rectF.right, rectF.bottom - f11);
            } else if (f11 > fWidth) {
                path.moveTo(rectF.left, rectF.bottom - (f11 - fWidth));
                path.lineTo(rectF.right - (f11 - fHeight), rectF.top);
            } else {
                path.moveTo(rectF.right - f11, rectF.bottom);
                path.lineTo(rectF.right - (f11 - fHeight), rectF.top);
            }
            i10 += 10;
        }
    }

    /* renamed from: c */
    public final void m11469c() {
        RectF rectF = this.mMaskRectF;
        float f10 = this.mPaddingStart;
        float f11 = this.maskProgress;
        float f12 = this.min;
        float f13 = this.mSeekLength;
        float f14 = (((f11 - f12) * f13) / (this.max - f12)) + f10;
        rectF.left = f14;
        float f15 = this.mPaddingTop;
        rectF.top = f15;
        rectF.right = f10 + f13;
        float f16 = this.mMaskHeight + f15;
        rectF.bottom = f16;
        float f17 = this.mMaskStrokeSize;
        float f18 = (f14 - (f17 * 0.5f)) - this.mMaskDecoratorSize;
        float f19 = f14 - (f17 * 0.5f);
        Path path = this.mMaskLeftPath;
        path.reset();
        path.moveTo(f19, f15);
        path.lineTo(f19, f16);
        path.lineTo(this.mMaskDecoratorConner + f18, f16);
        RectF rectF2 = this.mTempRect;
        int i10 = this.mMaskDecoratorConner;
        rectF2.set(f18, f16 - (i10 * 2), (i10 * 2) + f18, f16);
        path.arcTo(this.mTempRect, 90.0f, 90.0f);
        path.lineTo(f18, this.mMaskDecoratorConner + f15);
        RectF rectF3 = this.mTempRect;
        int i11 = this.mMaskDecoratorConner;
        rectF3.set(f18, f15, (i11 * 2) + f18, (i11 * 2) + f15);
        path.arcTo(this.mTempRect, 180.0f, 90.0f);
        path.lineTo(f19, f15);
        Path path2 = this.mMaskLeftIconPath;
        path2.reset();
        path2.moveTo(f19 - (this.mMaskDecoratorSize / 4), this.mMaskRectF.centerY() - (this.mMaskDecoratorSize / 2));
        path2.lineTo(f18 + (this.mMaskDecoratorSize / 4), this.mMaskRectF.centerY());
        path2.lineTo(f19 - (this.mMaskDecoratorSize / 4), this.mMaskRectF.centerY() + (this.mMaskDecoratorSize / 2));
        RectF rectF4 = this.mMaskRectF;
        float f20 = rectF4.right;
        float f21 = this.mMaskStrokeSize;
        float f22 = (f21 * 0.5f) + f20;
        float f23 = rectF4.top;
        float f24 = f20 + (f21 * 0.5f) + this.mMaskDecoratorSize;
        float f25 = rectF4.bottom;
        Path path3 = this.mMaskRightPath;
        path3.reset();
        path3.moveTo(f22, f23);
        path3.lineTo(f22, f25);
        path3.lineTo(f24 - this.mMaskDecoratorConner, f25);
        RectF rectF5 = this.mTempRect;
        int i12 = this.mMaskDecoratorConner;
        rectF5.set(f24 - (i12 * 2), f25 - (i12 * 2), f24, f25);
        path3.arcTo(this.mTempRect, 90.0f, -90.0f);
        path3.lineTo(f24, this.mMaskDecoratorConner + f23);
        RectF rectF6 = this.mTempRect;
        int i13 = this.mMaskDecoratorConner;
        rectF6.set(f24 - (i13 * 2), f23, f24, (i13 * 2) + f23);
        path3.arcTo(this.mTempRect, 0.0f, -90.0f);
        path3.lineTo(f22, f23);
        Path path4 = this.mMaskRightLine;
        path4.reset();
        path4.set(m11468b(new RectF(f22, f23, f24, f25)));
    }

    /* renamed from: d */
    public final void m11470d() {
        RectF rectF = this.mThumbRect;
        float f10 = this.mPaddingStart;
        float f11 = this.progress;
        float f12 = this.min;
        float f13 = f10 + (((f11 - f12) * this.mSeekLength) / (this.max - f12));
        float f14 = this.mThumbRadius;
        float f15 = f13 - f14;
        rectF.left = f15;
        rectF.right = f15 + (f14 * 2);
        float f16 = this.mPaddingTop;
        rectF.top = f16;
        rectF.bottom = f16 + this.mThumbHeight;
    }

    /* renamed from: e */
    public final void m11471e() {
        RectF rectF = this.mTrackRectF;
        float f10 = this.mPaddingStart;
        rectF.left = f10;
        float f11 = this.progress;
        float f12 = this.min;
        float f13 = this.mSeekLength;
        float f14 = f10 + (((f11 - f12) * f13) / (this.max - f12));
        rectF.right = f14;
        float f15 = this.mPaddingTop;
        int i10 = this.mMaskHeight;
        int i11 = this.mTrackWidth;
        float f16 = f15 + ((i10 - i11) / 2);
        rectF.top = f16;
        float f17 = i11 + f16;
        rectF.bottom = f17;
        RectF rectF2 = this.mSeekBarRectF;
        rectF2.left = f14;
        rectF2.right = rectF.left + f13;
        rectF2.top = f16;
        rectF2.bottom = f17;
    }

    /* renamed from: f */
    public final void m11472f(Canvas canvas) {
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setColor(this.keyPointColor);
        Iterator it = this.mKeyPointRectList.iterator();
        while (it.hasNext()) {
            canvas.drawRect((RectF) it.next(), this.mPaint);
        }
    }

    /* renamed from: g */
    public final void m11473g(Canvas canvas) {
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
        float f10 = 2;
        this.mPaint.setStrokeWidth(this.mMaskStrokeSize / f10);
        this.mPaint.setStyle(style);
        canvas.drawPath(this.mMaskLeftIconPath, this.mPaint);
        this.mPaint.setColor(this.maskColor);
        this.mPaint.setStrokeWidth(this.mMaskStrokeSize);
        this.mPaint.setStyle(style);
        canvas.drawPath(this.mMaskRightPath, this.mPaint);
        this.mPaint.setStrokeWidth(this.mMaskStrokeSize / f10);
        this.mPaint.setStyle(style);
        canvas.drawPath(this.mMaskRightLine, this.mPaint);
    }

    public final int getBarSize() {
        return this.barSize;
    }

    public final int getKeyPointColor() {
        return this.keyPointColor;
    }

    public final List<long[]> getKeyPointList() {
        return this.keyPointList;
    }

    public final InterfaceC7268a getMaskChangeListener() {
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

    public final InterfaceC7269b getSeekChangeListener() {
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

    /* renamed from: h */
    public final void m11474h(Canvas canvas) {
        this.mPaint.setColor(this.thumbColor);
        this.mPaint.setStyle(Paint.Style.FILL);
        Log.i("drawThumb", "rect -> " + this.mThumbRect);
        RectF rectF = this.mThumbRect;
        float f10 = this.mThumbRadius;
        canvas.drawRoundRect(rectF, f10, f10, this.mPaint);
    }

    /* renamed from: i */
    public final void m11475i(Canvas canvas) {
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

    /* renamed from: j */
    public final int m11476j(float x9, float y9) {
        RectF rectF = new RectF();
        float f10 = this.mPaddingStart;
        int i10 = this.mTouchOffset;
        rectF.left = f10 - i10;
        float f11 = this.mPaddingTop;
        rectF.top = f11 - i10;
        rectF.right = f10 + this.mSeekLength + i10;
        rectF.bottom = f11 + this.mThumbHeight + i10;
        RectF rectF2 = new RectF();
        RectF rectF3 = this.mMaskRectF;
        float f12 = rectF3.left;
        int i11 = this.mTouchOffset;
        rectF2.left = f12 - i11;
        rectF2.top = rectF3.top - i11;
        rectF2.right = rectF3.left + i11;
        rectF2.bottom = rectF3.bottom + i11;
        if (rectF2.contains(x9, y9)) {
            return 1;
        }
        return rectF.contains(x9, y9) ? 0 : -1;
    }

    /* renamed from: k */
    public final void m11477k() {
        Paint paint = this.mPaint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
    }

    /* renamed from: l */
    public final void m11478l(float x9) {
        RectF rectF = this.mTrackRectF;
        float f10 = rectF.left;
        if (x9 >= f10 && x9 <= this.mSeekBarRectF.right) {
            float f11 = this.min;
            setMaskProgress(f11 + (((x9 - f10) * (this.max - f11)) / this.mSeekLength));
        } else if (x9 < f10) {
            setMaskProgress(this.min);
        } else if (x9 > rectF.right) {
            setMaskProgress(this.max);
        }
    }

    /* renamed from: m */
    public final void m11479m(float x9) {
        RectF rectF = this.mTrackRectF;
        float f10 = rectF.left;
        if (x9 >= f10 && x9 <= this.mSeekBarRectF.right) {
            float f11 = this.min;
            setProgress(f11 + (((x9 - f10) * (this.max - f11)) / this.mSeekLength));
        } else if (x9 < f10) {
            setProgress(this.min);
        } else if (x9 > rectF.right) {
            setProgress(this.max);
        }
    }

    @Override // android.view.View
    public synchronized void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        m11475i(canvas);
        m11472f(canvas);
        m11473g(canvas);
        m11474h(canvas);
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
            int i10 = (int) (this.mPaddingTop + fMax);
            if (mode == 1073741824) {
                this.mMaskHeight = Math.max(this.mMaskHeight, size2 - i10);
            }
            int i11 = this.mMaskHeight;
            this.mThumbHeight = i11;
            setMeasuredDimension(size, i11 + i10);
            m11471e();
            m11470d();
            m11469c();
            m11467a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
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
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
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
            r3.m11478l(r0)
            com.zykj.view.widget.DoubleSeekBar$a r0 = r3.maskChangeListener
            if (r0 == 0) goto L78
            float r1 = r3.progress
            r0.mo11086b(r3, r1)
            goto L78
        L2d:
            float r0 = r4.getX()
            r3.m11479m(r0)
            com.zykj.view.widget.DoubleSeekBar$b r0 = r3.seekChangeListener
            if (r0 == 0) goto L78
            float r1 = r3.progress
            r0.mo11083b(r3, r1)
            goto L78
        L3e:
            int r0 = r3.mCurrentTouchMode
            if (r0 == 0) goto L54
            if (r0 == r1) goto L45
            goto L78
        L45:
            float r0 = r4.getX()
            r3.m11478l(r0)
            com.zykj.view.widget.DoubleSeekBar$a r0 = r3.maskChangeListener
            if (r0 == 0) goto L78
            r0.mo11085a(r3)
            goto L78
        L54:
            r0 = 0
            r3.mIsTouching = r0
            float r0 = r4.getX()
            r3.m11479m(r0)
            com.zykj.view.widget.DoubleSeekBar$b r0 = r3.seekChangeListener
            if (r0 == 0) goto L78
            r0.mo11082a(r3)
            goto L78
        L66:
            float r0 = r4.getX()
            float r2 = r4.getY()
            int r0 = r3.m11476j(r0, r2)
            r3.mCurrentTouchMode = r0
            if (r0 == 0) goto L8c
            if (r0 == r1) goto L7d
        L78:
            boolean r4 = super.onTouchEvent(r4)
            return r4
        L7d:
            float r4 = r4.getX()
            r3.m11478l(r4)
            com.zykj.view.widget.DoubleSeekBar$a r4 = r3.maskChangeListener
            if (r4 == 0) goto L8b
            r4.mo11087c(r3)
        L8b:
            return r1
        L8c:
            r3.mIsTouching = r1
            float r4 = r4.getX()
            r3.m11479m(r4)
            com.zykj.view.widget.DoubleSeekBar$b r4 = r3.seekChangeListener
            if (r4 == 0) goto L9c
            r4.mo11084c(r3)
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.widget.DoubleSeekBar.onTouchEvent(android.view.MotionEvent):boolean"); // DEX body: android/新测评/smali_classes5/com/zykj/view/widget/DoubleSeekBar.smali:3624
    }

    public final void setBarSize(int i10) {
        this.barSize = i10;
        this.mTrackWidth = i10;
        m11471e();
        m11467a();
        invalidate();
    }

    public final void setKeyPointColor(int i10) {
        this.keyPointColor = i10;
        invalidate();
    }

    public final void setKeyPointList(List<long[]> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.keyPointList = value;
        m11471e();
        invalidate();
    }

    public final void setMaskChangeListener(InterfaceC7268a interfaceC7268a) {
        this.maskChangeListener = interfaceC7268a;
    }

    public final void setMaskColor(int i10) {
        this.maskColor = i10;
        invalidate();
    }

    public final void setMaskProgress(float f10) {
        this.maskProgress = f10;
        m11469c();
        invalidate();
    }

    public final void setMax(float f10) {
        if (this.max > this.min) {
            this.max = f10;
            m11471e();
            m11470d();
            m11467a();
            invalidate();
        }
    }

    public final void setMin(float f10) {
        if (this.max > this.min) {
            this.min = f10;
            m11471e();
            m11470d();
            m11467a();
            invalidate();
        }
    }

    public final void setProgress(float f10) {
        this.progress = f10;
        m11471e();
        m11470d();
        invalidate();
    }

    public final void setSeekBarColor(int i10) {
        this.seekBarColor = i10;
        invalidate();
    }

    public final void setSeekChangeListener(InterfaceC7269b interfaceC7269b) {
        this.seekChangeListener = interfaceC7269b;
    }

    public final void setThumbColor(int i10) {
        this.thumbColor = i10;
        invalidate();
    }

    public final void setThumbSize(int i10) {
        this.thumbSize = i10;
        float f10 = i10 * 0.5f;
        this.mThumbRadius = f10;
        this.mTouchThumbRadius = f10 * 1.2f;
        m11470d();
        invalidate();
    }

    public final void setTrackColor(int i10) {
        this.trackColor = i10;
        invalidate();
    }

    public /* synthetic */ DoubleSeekBar(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleSeekBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mTouchOffset = 25;
        this.mPaint = new Paint();
        this.mCurrentTouchMode = -1;
        this.keyPointList = CollectionsKt.emptyList();
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
        float f10 = this.thumbSize * 0.5f;
        this.mThumbRadius = f10;
        this.mTouchThumbRadius = f10 * 1.2f;
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
        int i11 = this.mMaskDecoratorSize;
        float f11 = this.mMaskStrokeSize;
        this.mPaddingStart = i11 + f11;
        this.mPaddingTop = f11 * 0.5f;
        this.mPaddingRight = i11 + f11;
        this.mPaddingBottom = f11 * 0.5f;
        m11477k();
    }
}
