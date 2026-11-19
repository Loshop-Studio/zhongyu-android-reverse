package com.canhub.cropper;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p092j6.InterfaceC5748a;

@Metadata(m5109d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002:\u0011\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001\u001a\u001e!$'£\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\rJ\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010$¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101R(\u00104\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b2\u00103\u0012\u0004\b7\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u0010\rR(\u0010>\u001a\u0004\u0018\u00010.2\b\u00109\u001a\u0004\u0018\u00010.8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R$\u0010B\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010;\u001a\u0004\b@\u0010=\"\u0004\bA\u00101R$\u0010D\u001a\u00020C2\u0006\u0010D\u001a\u00020C8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010J\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010I8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010P\u001a\u0004\u0018\u00010O2\b\u0010P\u001a\u0004\u0018\u00010O8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010V\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u00105\"\u0004\bW\u0010\rR$\u0010Y\u001a\u00020X2\u0006\u0010Y\u001a\u00020X8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010a\u001a\u00020X2\u0006\u0010^\u001a\u00020X8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010[\"\u0004\b`\u0010]R$\u0010c\u001a\u00020\t2\u0006\u0010b\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u00105\"\u0004\bd\u0010\rR$\u0010f\u001a\u00020\t2\u0006\u0010e\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u00105\"\u0004\bg\u0010\rR(\u0010i\u001a\u0004\u0018\u00010h2\b\u0010i\u001a\u0004\u0018\u00010h8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001d\u0010q\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020X0n8F¢\u0006\u0006\u001a\u0004\bo\u0010pR$\u0010s\u001a\u00020\t2\u0006\u0010r\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u00105\"\u0004\bt\u0010\rR$\u0010v\u001a\u00020\t2\u0006\u0010u\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u00105\"\u0004\bw\u0010\rR$\u0010y\u001a\u00020\t2\u0006\u0010x\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\by\u00105\"\u0004\bz\u0010\rR%\u0010|\u001a\u00020{2\u0006\u0010|\u001a\u00020{8F@FX\u0086\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R)\u0010\u0085\u0001\u001a\u00020\u00162\u0007\u0010\u0081\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0005\b\u0084\u0001\u0010\u0019R(\u0010\u0086\u0001\u001a\u00020X2\u0007\u0010\u0086\u0001\u001a\u00020X8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010[\"\u0005\b\u0088\u0001\u0010]R(\u0010\u008c\u0001\u001a\u00020X2\u0007\u0010\u0089\u0001\u001a\u00020X8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008a\u0001\u0010[\"\u0005\b\u008b\u0001\u0010]R\u0017\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008d\u00018F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R0\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u008d\u00012\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008d\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u008f\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0017\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00018F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0015\u0010\u009d\u0001\u001a\u00030\u009a\u00018F¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006¤\u0001"}, m5110d2 = {"Lcom/canhub/cropper/CropImageView;", "Landroid/widget/FrameLayout;", "Lcom/canhub/cropper/a0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "multiTouchEnabled", "Ld6/s;", "setMultiTouchEnabled", "(Z)V", "centerMoveEnabled", "setCenterMoveEnabled", "fixAspectRatio", "setFixedAspectRatio", "Lcom/canhub/cropper/CropImageOptions;", "options", "setImageCropOptions", "(Lcom/canhub/cropper/CropImageOptions;)V", "", "snapRadius", "setSnapRadius", "(F)V", "Lcom/canhub/cropper/x;", "listener", "setOnSetCropOverlayReleasedListener", "(Lcom/canhub/cropper/x;)V", "Lcom/canhub/cropper/w;", "setOnSetCropOverlayMovedListener", "(Lcom/canhub/cropper/w;)V", "Lcom/canhub/cropper/y;", "setOnCropWindowChangedListener", "(Lcom/canhub/cropper/y;)V", "Lcom/canhub/cropper/z;", "setOnSetImageUriCompleteListener", "(Lcom/canhub/cropper/z;)V", "Lcom/canhub/cropper/v;", "setOnCropImageCompleteListener", "(Lcom/canhub/cropper/v;)V", "Landroid/graphics/Bitmap;", "bitmap", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "Landroid/net/Uri;", "uri", "setImageUriAsync", "(Landroid/net/Uri;)V", "r", "Z", "isSaveBitmapToInstanceState", "()Z", "setSaveBitmapToInstanceState", "isSaveBitmapToInstanceState$annotations", "()V", "value", "C", "Landroid/net/Uri;", "getImageUri", "()Landroid/net/Uri;", "imageUri", "M", "getCustomOutputUri", "setCustomOutputUri", "customOutputUri", "Lcom/canhub/cropper/CropImageView$ScaleType;", "scaleType", "getScaleType", "()Lcom/canhub/cropper/CropImageView$ScaleType;", "setScaleType", "(Lcom/canhub/cropper/CropImageView$ScaleType;)V", "Lcom/canhub/cropper/CropImageView$CropShape;", "cropShape", "getCropShape", "()Lcom/canhub/cropper/CropImageView$CropShape;", "setCropShape", "(Lcom/canhub/cropper/CropImageView$CropShape;)V", "Lcom/canhub/cropper/CropImageView$CropCornerShape;", "cornerShape", "getCornerShape", "()Lcom/canhub/cropper/CropImageView$CropCornerShape;", "setCornerShape", "(Lcom/canhub/cropper/CropImageView$CropCornerShape;)V", "autoZoomEnabled", "isAutoZoomEnabled", "setAutoZoomEnabled", "", "maxZoom", "getMaxZoom", "()I", "setMaxZoom", "(I)V", "degrees", "getRotatedDegrees", "setRotatedDegrees", "rotatedDegrees", "flipHorizontally", "isFlippedHorizontally", "setFlippedHorizontally", "flipVertically", "isFlippedVertically", "setFlippedVertically", "Lcom/canhub/cropper/CropImageView$Guidelines;", "guidelines", "getGuidelines", "()Lcom/canhub/cropper/CropImageView$Guidelines;", "setGuidelines", "(Lcom/canhub/cropper/CropImageView$Guidelines;)V", "Landroid/util/Pair;", "getAspectRatio", "()Landroid/util/Pair;", "aspectRatio", "showProgressBar", "isShowProgressBar", "setShowProgressBar", "showCropOverlay", "isShowCropOverlay", "setShowCropOverlay", "showCropLabel", "isShowCropLabel", "setShowCropLabel", "", "cropLabelText", "getCropLabelText", "()Ljava/lang/String;", "setCropLabelText", "(Ljava/lang/String;)V", "textSize", "getCropLabelTextSize", "()F", "setCropLabelTextSize", "cropLabelTextSize", "cropLabelTextColor", "getCropLabelTextColor", "setCropLabelTextColor", "resId", "getImageResource", "setImageResource", "imageResource", "Landroid/graphics/Rect;", "getWholeImageRect", "()Landroid/graphics/Rect;", "wholeImageRect", "rect", "getCropRect", "setCropRect", "(Landroid/graphics/Rect;)V", "cropRect", "Landroid/graphics/RectF;", "getCropWindowRect", "()Landroid/graphics/RectF;", "cropWindowRect", "", "getCropPoints", "()[F", "cropPoints", "CropShape", "CropCornerShape", "ScaleType", "Guidelines", "RequestSizeOptions", "com/canhub/cropper/u", "cropper_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCropImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/CropImageView\n+ 2 ParcelableUtils.kt\ncom/canhub/cropper/ParcelableUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Pair.kt\nandroidx/core/util/PairKt\n*L\n1#1,1896:1\n7#2,5:1897\n7#2,5:1905\n7#2,5:1910\n7#2,5:1915\n7#2,5:1920\n7#2,5:1925\n1#3:1902\n66#4:1903\n78#4:1904\n*S KotlinDebug\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/CropImageView\n*L\n1809#1:1897,5\n1134#1:1905,5\n1159#1:1910,5\n1165#1:1915,5\n1171#1:1920,5\n1187#1:1925,5\n1047#1:1903\n1047#1:1904\n*E\n"})
/* loaded from: classes2.dex */
public final class CropImageView extends FrameLayout implements InterfaceC3424a0 {

    /* renamed from: N */
    public static final /* synthetic */ int f2441N = 0;

    /* renamed from: A */
    public InterfaceC3455z f2442A;

    /* renamed from: B */
    public InterfaceC3451v f2443B;

    /* renamed from: C, reason: from kotlin metadata */
    public Uri imageUri;

    /* renamed from: D */
    public int f2445D;

    /* renamed from: E */
    public float f2446E;

    /* renamed from: F */
    public float f2447F;

    /* renamed from: G */
    public float f2448G;

    /* renamed from: H */
    public RectF f2449H;

    /* renamed from: I */
    public int f2450I;

    /* renamed from: J */
    public boolean f2451J;

    /* renamed from: K */
    public WeakReference f2452K;

    /* renamed from: L */
    public WeakReference f2453L;

    /* renamed from: M, reason: from kotlin metadata */
    public Uri customOutputUri;

    /* renamed from: a */
    public final ImageView f2455a;

    /* renamed from: b */
    public final CropOverlayView f2456b;

    /* renamed from: c */
    public final Matrix f2457c;

    /* renamed from: d */
    public final Matrix f2458d;

    /* renamed from: e */
    public final ProgressBar f2459e;

    /* renamed from: f */
    public final float[] f2460f;

    /* renamed from: g */
    public final float[] f2461g;

    /* renamed from: h */
    public AnimationAnimationListenerC3447r f2462h;

    /* renamed from: i */
    public Bitmap f2463i;

    /* renamed from: j */
    public int f2464j;

    /* renamed from: k */
    public int f2465k;

    /* renamed from: l */
    public boolean f2466l;

    /* renamed from: m */
    public boolean f2467m;

    /* renamed from: n */
    public int f2468n;

    /* renamed from: o */
    public int f2469o;

    /* renamed from: p */
    public int f2470p;

    /* renamed from: q */
    public ScaleType f2471q;

    /* renamed from: r, reason: from kotlin metadata */
    public boolean isSaveBitmapToInstanceState;

    /* renamed from: s */
    public boolean f2473s;

    /* renamed from: t */
    public boolean f2474t;

    /* renamed from: u */
    public String f2475u;

    /* renamed from: v */
    public float f2476v;

    /* renamed from: w */
    public int f2477w;

    /* renamed from: x */
    public boolean f2478x;

    /* renamed from: y */
    public boolean f2479y;

    /* renamed from: z */
    public int f2480z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/canhub/cropper/CropImageView$CropCornerShape;", "", "RECTANGLE", "OVAL", "cropper_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class CropCornerShape {
        public static final CropCornerShape OVAL;
        public static final CropCornerShape RECTANGLE;

        /* renamed from: a */
        public static final /* synthetic */ CropCornerShape[] f2481a;

        /* renamed from: b */
        public static final /* synthetic */ InterfaceC5748a f2482b;

        static {
            CropCornerShape cropCornerShape = new CropCornerShape("RECTANGLE", 0);
            RECTANGLE = cropCornerShape;
            CropCornerShape cropCornerShape2 = new CropCornerShape("OVAL", 1);
            OVAL = cropCornerShape2;
            CropCornerShape[] cropCornerShapeArr = {cropCornerShape, cropCornerShape2};
            f2481a = cropCornerShapeArr;
            f2482b = AbstractC5817a.m5310a(cropCornerShapeArr);
        }

        @NotNull
        public static InterfaceC5748a getEntries() {
            return f2482b;
        }

        public static CropCornerShape valueOf(String str) {
            return (CropCornerShape) Enum.valueOf(CropCornerShape.class, str);
        }

        public static CropCornerShape[] values() {
            return (CropCornerShape[]) f2481a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m5110d2 = {"Lcom/canhub/cropper/CropImageView$CropShape;", "", "RECTANGLE", "OVAL", "RECTANGLE_VERTICAL_ONLY", "RECTANGLE_HORIZONTAL_ONLY", "cropper_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class CropShape {
        public static final CropShape OVAL;
        public static final CropShape RECTANGLE;
        public static final CropShape RECTANGLE_HORIZONTAL_ONLY;
        public static final CropShape RECTANGLE_VERTICAL_ONLY;

        /* renamed from: a */
        public static final /* synthetic */ CropShape[] f2483a;

        /* renamed from: b */
        public static final /* synthetic */ InterfaceC5748a f2484b;

        static {
            CropShape cropShape = new CropShape("RECTANGLE", 0);
            RECTANGLE = cropShape;
            CropShape cropShape2 = new CropShape("OVAL", 1);
            OVAL = cropShape2;
            CropShape cropShape3 = new CropShape("RECTANGLE_VERTICAL_ONLY", 2);
            RECTANGLE_VERTICAL_ONLY = cropShape3;
            CropShape cropShape4 = new CropShape("RECTANGLE_HORIZONTAL_ONLY", 3);
            RECTANGLE_HORIZONTAL_ONLY = cropShape4;
            CropShape[] cropShapeArr = {cropShape, cropShape2, cropShape3, cropShape4};
            f2483a = cropShapeArr;
            f2484b = AbstractC5817a.m5310a(cropShapeArr);
        }

        @NotNull
        public static InterfaceC5748a getEntries() {
            return f2484b;
        }

        public static CropShape valueOf(String str) {
            return (CropShape) Enum.valueOf(CropShape.class, str);
        }

        public static CropShape[] values() {
            return (CropShape[]) f2483a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/canhub/cropper/CropImageView$Guidelines;", "", "OFF", "ON_TOUCH", "ON", "cropper_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Guidelines {
        public static final Guidelines OFF;

        /* renamed from: ON */
        public static final Guidelines f2485ON;
        public static final Guidelines ON_TOUCH;

        /* renamed from: a */
        public static final /* synthetic */ Guidelines[] f2486a;

        /* renamed from: b */
        public static final /* synthetic */ InterfaceC5748a f2487b;

        static {
            Guidelines guidelines = new Guidelines("OFF", 0);
            OFF = guidelines;
            Guidelines guidelines2 = new Guidelines("ON_TOUCH", 1);
            ON_TOUCH = guidelines2;
            Guidelines guidelines3 = new Guidelines("ON", 2);
            f2485ON = guidelines3;
            Guidelines[] guidelinesArr = {guidelines, guidelines2, guidelines3};
            f2486a = guidelinesArr;
            f2487b = AbstractC5817a.m5310a(guidelinesArr);
        }

        @NotNull
        public static InterfaceC5748a getEntries() {
            return f2487b;
        }

        public static Guidelines valueOf(String str) {
            return (Guidelines) Enum.valueOf(Guidelines.class, str);
        }

        public static Guidelines[] values() {
            return (Guidelines[]) f2486a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m5110d2 = {"Lcom/canhub/cropper/CropImageView$RequestSizeOptions;", "", "NONE", "SAMPLING", "RESIZE_INSIDE", "RESIZE_FIT", "RESIZE_EXACT", "cropper_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class RequestSizeOptions {
        public static final RequestSizeOptions NONE;
        public static final RequestSizeOptions RESIZE_EXACT;
        public static final RequestSizeOptions RESIZE_FIT;
        public static final RequestSizeOptions RESIZE_INSIDE;
        public static final RequestSizeOptions SAMPLING;

        /* renamed from: a */
        public static final /* synthetic */ RequestSizeOptions[] f2488a;

        /* renamed from: b */
        public static final /* synthetic */ InterfaceC5748a f2489b;

        static {
            RequestSizeOptions requestSizeOptions = new RequestSizeOptions("NONE", 0);
            NONE = requestSizeOptions;
            RequestSizeOptions requestSizeOptions2 = new RequestSizeOptions("SAMPLING", 1);
            SAMPLING = requestSizeOptions2;
            RequestSizeOptions requestSizeOptions3 = new RequestSizeOptions("RESIZE_INSIDE", 2);
            RESIZE_INSIDE = requestSizeOptions3;
            RequestSizeOptions requestSizeOptions4 = new RequestSizeOptions("RESIZE_FIT", 3);
            RESIZE_FIT = requestSizeOptions4;
            RequestSizeOptions requestSizeOptions5 = new RequestSizeOptions("RESIZE_EXACT", 4);
            RESIZE_EXACT = requestSizeOptions5;
            RequestSizeOptions[] requestSizeOptionsArr = {requestSizeOptions, requestSizeOptions2, requestSizeOptions3, requestSizeOptions4, requestSizeOptions5};
            f2488a = requestSizeOptionsArr;
            f2489b = AbstractC5817a.m5310a(requestSizeOptionsArr);
        }

        @NotNull
        public static InterfaceC5748a getEntries() {
            return f2489b;
        }

        public static RequestSizeOptions valueOf(String str) {
            return (RequestSizeOptions) Enum.valueOf(RequestSizeOptions.class, str);
        }

        public static RequestSizeOptions[] values() {
            return (RequestSizeOptions[]) f2488a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m5110d2 = {"Lcom/canhub/cropper/CropImageView$ScaleType;", "", "FIT_CENTER", "CENTER", "CENTER_CROP", "CENTER_INSIDE", "cropper_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ScaleType {
        public static final ScaleType CENTER;
        public static final ScaleType CENTER_CROP;
        public static final ScaleType CENTER_INSIDE;
        public static final ScaleType FIT_CENTER;

        /* renamed from: a */
        public static final /* synthetic */ ScaleType[] f2490a;

        /* renamed from: b */
        public static final /* synthetic */ InterfaceC5748a f2491b;

        static {
            ScaleType scaleType = new ScaleType("FIT_CENTER", 0);
            FIT_CENTER = scaleType;
            ScaleType scaleType2 = new ScaleType("CENTER", 1);
            CENTER = scaleType2;
            ScaleType scaleType3 = new ScaleType("CENTER_CROP", 2);
            CENTER_CROP = scaleType3;
            ScaleType scaleType4 = new ScaleType("CENTER_INSIDE", 3);
            CENTER_INSIDE = scaleType4;
            ScaleType[] scaleTypeArr = {scaleType, scaleType2, scaleType3, scaleType4};
            f2490a = scaleTypeArr;
            f2491b = AbstractC5817a.m5310a(scaleTypeArr);
        }

        @NotNull
        public static InterfaceC5748a getEntries() {
            return f2491b;
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) Enum.valueOf(ScaleType.class, str);
        }

        public static ScaleType[] values() {
            return (ScaleType[]) f2490a.clone();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CropImageView(@NotNull Context context) {
        this(context, null);
        AbstractC5830k.m5330g(context, "context");
    }

    /* renamed from: a */
    public final void m2436a(float f, float f7, boolean z8, boolean z9) {
        if (this.f2463i != null) {
            if (f <= 0.0f || f7 <= 0.0f) {
                return;
            }
            Matrix matrix = this.f2457c;
            Matrix matrix2 = this.f2458d;
            matrix.invert(matrix2);
            CropOverlayView cropOverlayView = this.f2456b;
            AbstractC5830k.m5327d(cropOverlayView);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            matrix2.mapRect(cropWindowRect);
            matrix.reset();
            float f8 = 2;
            matrix.postTranslate((f - r0.getWidth()) / f8, (f7 - r0.getHeight()) / f8);
            m2440e();
            int i = this.f2465k;
            float[] fArr = this.f2460f;
            if (i > 0) {
                matrix.postRotate(i, AbstractC3437h.m2482m(fArr), AbstractC3437h.m2483n(fArr));
                m2440e();
            }
            float fMin = Math.min(f / AbstractC3437h.m2489t(fArr), f7 / AbstractC3437h.m2485p(fArr));
            ScaleType scaleType = this.f2471q;
            if (scaleType == ScaleType.FIT_CENTER || ((scaleType == ScaleType.CENTER_INSIDE && fMin < 1.0f) || (fMin > 1.0f && this.f2479y))) {
                matrix.postScale(fMin, fMin, AbstractC3437h.m2482m(fArr), AbstractC3437h.m2483n(fArr));
                m2440e();
            } else if (scaleType == ScaleType.CENTER_CROP) {
                this.f2446E = Math.max(getWidth() / AbstractC3437h.m2489t(fArr), getHeight() / AbstractC3437h.m2485p(fArr));
            }
            float f9 = this.f2466l ? -this.f2446E : this.f2446E;
            float f10 = this.f2467m ? -this.f2446E : this.f2446E;
            matrix.postScale(f9, f10, AbstractC3437h.m2482m(fArr), AbstractC3437h.m2483n(fArr));
            m2440e();
            matrix.mapRect(cropWindowRect);
            if (this.f2471q == ScaleType.CENTER_CROP && z8 && !z9) {
                this.f2447F = 0.0f;
                this.f2448G = 0.0f;
            } else if (z8) {
                this.f2447F = f > AbstractC3437h.m2489t(fArr) ? 0.0f : Math.max(Math.min((f / f8) - cropWindowRect.centerX(), -AbstractC3437h.m2486q(fArr)), getWidth() - AbstractC3437h.m2487r(fArr)) / f9;
                this.f2448G = f7 <= AbstractC3437h.m2485p(fArr) ? Math.max(Math.min((f7 / f8) - cropWindowRect.centerY(), -AbstractC3437h.m2488s(fArr)), getHeight() - AbstractC3437h.m2481l(fArr)) / f10 : 0.0f;
            } else {
                this.f2447F = Math.min(Math.max(this.f2447F * f9, -cropWindowRect.left), (-cropWindowRect.right) + f) / f9;
                this.f2448G = Math.min(Math.max(this.f2448G * f10, -cropWindowRect.top), (-cropWindowRect.bottom) + f7) / f10;
            }
            matrix.postTranslate(this.f2447F * f9, this.f2448G * f10);
            cropWindowRect.offset(this.f2447F * f9, this.f2448G * f10);
            cropOverlayView.setCropWindowRect(cropWindowRect);
            m2440e();
            cropOverlayView.invalidate();
            ImageView imageView = this.f2455a;
            if (z9) {
                AnimationAnimationListenerC3447r animationAnimationListenerC3447r = this.f2462h;
                AbstractC5830k.m5327d(animationAnimationListenerC3447r);
                System.arraycopy(fArr, 0, animationAnimationListenerC3447r.f2620d, 0, 8);
                animationAnimationListenerC3447r.f2622f.set(animationAnimationListenerC3447r.f2618b.getCropWindowRect());
                matrix.getValues(animationAnimationListenerC3447r.f2624h);
                imageView.startAnimation(this.f2462h);
            } else {
                imageView.setImageMatrix(matrix);
            }
            m2445j(false);
        }
    }

    /* renamed from: b */
    public final void m2437b() {
        Bitmap bitmap = this.f2463i;
        if (bitmap != null && (this.f2470p > 0 || this.imageUri != null)) {
            AbstractC5830k.m5327d(bitmap);
            bitmap.recycle();
        }
        this.f2463i = null;
        this.f2470p = 0;
        this.imageUri = null;
        this.f2445D = 1;
        this.f2465k = 0;
        this.f2446E = 1.0f;
        this.f2447F = 0.0f;
        this.f2448G = 0.0f;
        this.f2457c.reset();
        this.f2449H = null;
        this.f2450I = 0;
        this.f2455a.setImageBitmap(null);
        m2443h();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* renamed from: c */
    public final void m2438c(android.graphics.Bitmap.CompressFormat r22, int r23, int r24, int r25, com.canhub.cropper.CropImageView.RequestSizeOptions r26, android.net.Uri r27) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.m2438c(android.graphics.Bitmap$CompressFormat, int, int, int, com.canhub.cropper.CropImageView$RequestSizeOptions, android.net.Uri):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2439d(boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.m2439d(boolean, boolean):void");
    }

    /* renamed from: e */
    public final void m2440e() {
        float[] fArr = this.f2460f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        AbstractC5830k.m5327d(this.f2463i);
        fArr[2] = r4.getWidth();
        fArr[3] = 0.0f;
        AbstractC5830k.m5327d(this.f2463i);
        fArr[4] = r6.getWidth();
        AbstractC5830k.m5327d(this.f2463i);
        fArr[5] = r6.getHeight();
        fArr[6] = 0.0f;
        AbstractC5830k.m5327d(this.f2463i);
        fArr[7] = r9.getHeight();
        Matrix matrix = this.f2457c;
        matrix.mapPoints(fArr);
        float[] fArr2 = this.f2461g;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 100.0f;
        fArr2[3] = 0.0f;
        fArr2[4] = 100.0f;
        fArr2[5] = 100.0f;
        fArr2[6] = 0.0f;
        fArr2[7] = 100.0f;
        matrix.mapPoints(fArr2);
    }

    /* renamed from: f */
    public final void m2441f(int i) {
        if (this.f2463i != null) {
            int i8 = i < 0 ? (i % 360) + 360 : i % 360;
            CropOverlayView cropOverlayView = this.f2456b;
            AbstractC5830k.m5327d(cropOverlayView);
            boolean z8 = !cropOverlayView.f2530z && ((46 <= i8 && i8 < 135) || (216 <= i8 && i8 < 305));
            RectF rectF = AbstractC3437h.f2605c;
            rectF.set(cropOverlayView.getCropWindowRect());
            float fHeight = (z8 ? rectF.height() : rectF.width()) / 2.0f;
            float fWidth = (z8 ? rectF.width() : rectF.height()) / 2.0f;
            if (z8) {
                boolean z9 = this.f2466l;
                this.f2466l = this.f2467m;
                this.f2467m = z9;
            }
            Matrix matrix = this.f2457c;
            Matrix matrix2 = this.f2458d;
            matrix.invert(matrix2);
            float[] fArr = AbstractC3437h.f2606d;
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.centerY();
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            matrix2.mapPoints(fArr);
            this.f2465k = (this.f2465k + i8) % 360;
            m2436a(getWidth(), getHeight(), true, false);
            float[] fArr2 = AbstractC3437h.f2607e;
            matrix.mapPoints(fArr2, fArr);
            float fSqrt = this.f2446E / ((float) Math.sqrt(Math.pow(fArr2[5] - fArr2[3], 2.0d) + Math.pow(fArr2[4] - fArr2[2], 2.0d)));
            this.f2446E = fSqrt;
            this.f2446E = Math.max(fSqrt, 1.0f);
            m2436a(getWidth(), getHeight(), true, false);
            matrix.mapPoints(fArr2, fArr);
            float fSqrt2 = (float) Math.sqrt(Math.pow(fArr2[5] - fArr2[3], 2.0d) + Math.pow(fArr2[4] - fArr2[2], 2.0d));
            float f = fHeight * fSqrt2;
            float f7 = fWidth * fSqrt2;
            float f8 = fArr2[0];
            float f9 = fArr2[1];
            rectF.set(f8 - f, f9 - f7, f8 + f, f9 + f7);
            cropOverlayView.m2452g();
            cropOverlayView.setCropWindowRect(rectF);
            m2436a(getWidth(), getHeight(), true, false);
            m2439d(false, false);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            cropOverlayView.m2450e(cropWindowRect);
            cropOverlayView.f2511g.f2579a.set(cropWindowRect);
        }
    }

    /* renamed from: g */
    public final void m2442g(Bitmap bitmap, int i, Uri uri, int i8, int i9) {
        Bitmap bitmap2 = this.f2463i;
        if (bitmap2 == null || !AbstractC5830k.m5325b(bitmap2, bitmap)) {
            m2437b();
            this.f2463i = bitmap;
            this.f2455a.setImageBitmap(bitmap);
            this.imageUri = uri;
            this.f2470p = i;
            this.f2445D = i8;
            this.f2465k = i9;
            m2436a(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f2456b;
            if (cropOverlayView != null) {
                cropOverlayView.m2452g();
                m2443h();
            }
        }
    }

    @NotNull
    public final Pair<Integer, Integer> getAspectRatio() {
        CropOverlayView cropOverlayView = this.f2456b;
        AbstractC5830k.m5327d(cropOverlayView);
        return new Pair<>(Integer.valueOf(cropOverlayView.getF2492A()), Integer.valueOf(cropOverlayView.getF2493B()));
    }

    @Nullable
    public final CropCornerShape getCornerShape() {
        CropOverlayView cropOverlayView = this.f2456b;
        AbstractC5830k.m5327d(cropOverlayView);
        return cropOverlayView.getCornerShape();
    }

    @NotNull
    /* renamed from: getCropLabelText, reason: from getter */
    public final String getF2475u() {
        return this.f2475u;
    }

    /* renamed from: getCropLabelTextColor, reason: from getter */
    public final int getF2477w() {
        return this.f2477w;
    }

    /* renamed from: getCropLabelTextSize, reason: from getter */
    public final float getF2476v() {
        return this.f2476v;
    }

    @NotNull
    public final float[] getCropPoints() {
        CropOverlayView cropOverlayView = this.f2456b;
        AbstractC5830k.m5327d(cropOverlayView);
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        float f = cropWindowRect.left;
        float f7 = cropWindowRect.top;
        float f8 = cropWindowRect.right;
        float f9 = cropWindowRect.bottom;
        float[] fArr = {f, f7, f8, f7, f8, f9, f, f9};
        Matrix matrix = this.f2457c;
        Matrix matrix2 = this.f2458d;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        float[] fArr2 = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr2[i] = fArr[i] * this.f2445D;
        }
        return fArr2;
    }

    @Nullable
    public final Rect getCropRect() {
        int i = this.f2445D;
        Bitmap bitmap = this.f2463i;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i;
        int height = bitmap.getHeight() * i;
        Rect rect = AbstractC3437h.f2603a;
        CropOverlayView cropOverlayView = this.f2456b;
        AbstractC5830k.m5327d(cropOverlayView);
        return AbstractC3437h.m2484o(cropPoints, width, height, cropOverlayView.f2530z, cropOverlayView.getF2492A(), cropOverlayView.getF2493B());
    }

    @Nullable
    public final CropShape getCropShape() {
        CropOverlayView cropOverlayView = this.f2456b;
        AbstractC5830k.m5327d(cropOverlayView);
        return cropOverlayView.getCropShape();
    }

    @Nullable
    public final RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.f2456b;
        if (cropOverlayView != null) {
            return cropOverlayView.getCropWindowRect();
        }
        return null;
    }

    @JvmOverloads
    @Nullable
    public final Bitmap getCroppedImage() {
        Bitmap bitmap;
        RequestSizeOptions options = RequestSizeOptions.RESIZE_INSIDE;
        AbstractC5830k.m5330g(options, "options");
        Bitmap bitmap2 = this.f2463i;
        if (bitmap2 == null) {
            return null;
        }
        Uri uri = this.imageUri;
        CropOverlayView cropOverlayView = this.f2456b;
        if (uri == null || (this.f2445D <= 1 && options != RequestSizeOptions.SAMPLING)) {
            Rect rect = AbstractC3437h.f2603a;
            float[] cropPoints = getCropPoints();
            int i = this.f2465k;
            AbstractC5830k.m5327d(cropOverlayView);
            bitmap = AbstractC3437h.m2474e(bitmap2, cropPoints, i, cropOverlayView.f2530z, cropOverlayView.getF2492A(), cropOverlayView.getF2493B(), this.f2466l, this.f2467m).f2577a;
        } else {
            Rect rect2 = AbstractC3437h.f2603a;
            Context context = getContext();
            AbstractC5830k.m5329f(context, "getContext(...)");
            Uri uri2 = this.imageUri;
            float[] cropPoints2 = getCropPoints();
            int i8 = this.f2465k;
            Bitmap bitmap3 = this.f2463i;
            AbstractC5830k.m5327d(bitmap3);
            int width = bitmap3.getWidth() * this.f2445D;
            Bitmap bitmap4 = this.f2463i;
            AbstractC5830k.m5327d(bitmap4);
            int height = bitmap4.getHeight() * this.f2445D;
            AbstractC5830k.m5327d(cropOverlayView);
            bitmap = AbstractC3437h.m2472c(context, uri2, cropPoints2, i8, width, height, cropOverlayView.f2530z, cropOverlayView.getF2492A(), cropOverlayView.getF2493B(), 0, 0, this.f2466l, this.f2467m).f2577a;
        }
        return AbstractC3437h.m2490u(bitmap, 0, 0, options);
    }

    @Nullable
    public final Uri getCustomOutputUri() {
        return this.customOutputUri;
    }

    @Nullable
    public final Guidelines getGuidelines() {
        CropOverlayView cropOverlayView = this.f2456b;
        AbstractC5830k.m5327d(cropOverlayView);
        return cropOverlayView.getGuidelines();
    }

    /* renamed from: getImageResource, reason: from getter */
    public final int getF2470p() {
        return this.f2470p;
    }

    @Nullable
    public final Uri getImageUri() {
        return this.imageUri;
    }

    /* renamed from: getMaxZoom, reason: from getter */
    public final int getF2480z() {
        return this.f2480z;
    }

    /* renamed from: getRotatedDegrees, reason: from getter */
    public final int getF2465k() {
        return this.f2465k;
    }

    @NotNull
    /* renamed from: getScaleType, reason: from getter */
    public final ScaleType getF2471q() {
        return this.f2471q;
    }

    @Nullable
    public final Rect getWholeImageRect() {
        int i = this.f2445D;
        Bitmap bitmap = this.f2463i;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i, bitmap.getHeight() * i);
    }

    /* renamed from: h */
    public final void m2443h() {
        CropOverlayView cropOverlayView = this.f2456b;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.f2473s || this.f2463i == null) ? 4 : 0);
        }
    }

    /* renamed from: i */
    public final void m2444i() {
        this.f2459e.setVisibility(this.f2478x && ((this.f2463i == null && this.f2452K != null) || this.f2453L != null) ? 0 : 4);
    }

    /* renamed from: j */
    public final void m2445j(boolean z8) {
        Bitmap bitmap = this.f2463i;
        CropOverlayView cropOverlayView = this.f2456b;
        if (bitmap != null && !z8) {
            float[] fArr = this.f2461g;
            float fM2489t = (this.f2445D * 100.0f) / AbstractC3437h.m2489t(fArr);
            float fM2485p = (this.f2445D * 100.0f) / AbstractC3437h.m2485p(fArr);
            AbstractC5830k.m5327d(cropOverlayView);
            float width = getWidth();
            float height = getHeight();
            C3432e0 c3432e0 = cropOverlayView.f2511g;
            c3432e0.f2583e = width;
            c3432e0.f2584f = height;
            c3432e0.f2589k = fM2489t;
            c3432e0.f2590l = fM2485p;
        }
        AbstractC5830k.m5327d(cropOverlayView);
        cropOverlayView.m2453h(z8 ? null : this.f2460f, getWidth(), getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        super.onLayout(z8, i, i8, i9, i10);
        if (this.f2468n <= 0 || this.f2469o <= 0) {
            m2445j(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f2468n;
        layoutParams.height = this.f2469o;
        setLayoutParams(layoutParams);
        if (this.f2463i == null) {
            m2445j(true);
            return;
        }
        float f = i9 - i;
        float f7 = i10 - i8;
        m2436a(f, f7, true, false);
        RectF rectF = this.f2449H;
        if (rectF == null) {
            if (this.f2451J) {
                this.f2451J = false;
                m2439d(false, false);
                return;
            }
            return;
        }
        int i11 = this.f2450I;
        if (i11 != this.f2464j) {
            this.f2465k = i11;
            m2436a(f, f7, true, false);
            this.f2450I = 0;
        }
        this.f2457c.mapRect(this.f2449H);
        CropOverlayView cropOverlayView = this.f2456b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropWindowRect(rectF);
        }
        m2439d(false, false);
        if (cropOverlayView != null) {
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            cropOverlayView.m2450e(cropWindowRect);
            cropOverlayView.f2511g.f2579a.set(cropWindowRect);
        }
        this.f2449H = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i8) {
        int width;
        int height;
        super.onMeasure(i, i8);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        Bitmap bitmap = this.f2463i;
        if (bitmap == null) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (size2 == 0) {
            size2 = bitmap.getHeight();
        }
        double width2 = size < bitmap.getWidth() ? size / bitmap.getWidth() : Double.POSITIVE_INFINITY;
        double height2 = size2 < bitmap.getHeight() ? size2 / bitmap.getHeight() : Double.POSITIVE_INFINITY;
        if (width2 == Double.POSITIVE_INFINITY && height2 == Double.POSITIVE_INFINITY) {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        } else if (width2 <= height2) {
            height = (int) (bitmap.getHeight() * width2);
            width = size;
        } else {
            width = (int) (bitmap.getWidth() * height2);
            height = size2;
        }
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(width, size);
        } else if (mode != 1073741824) {
            size = width;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(height, size2);
        } else if (mode2 != 1073741824) {
            size2 = height;
        }
        this.f2468n = size;
        this.f2469o = size2;
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRestoreInstanceState(android.os.Parcelable r10) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.onRestoreInstanceState(android.os.Parcelable):void");
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Uri uriM2491v;
        if (this.imageUri == null && this.f2463i == null && this.f2470p < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        if (this.isSaveBitmapToInstanceState && this.imageUri == null && this.f2470p < 1) {
            Rect rect = AbstractC3437h.f2603a;
            Context context = getContext();
            AbstractC5830k.m5329f(context, "getContext(...)");
            Bitmap bitmap = this.f2463i;
            Uri uri = this.customOutputUri;
            try {
                AbstractC5830k.m5327d(bitmap);
                uriM2491v = AbstractC3437h.m2491v(context, bitmap, Bitmap.CompressFormat.JPEG, 95, uri);
            } catch (Exception e) {
                Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e);
                uriM2491v = null;
            }
        } else {
            uriM2491v = this.imageUri;
        }
        if (uriM2491v != null && this.f2463i != null) {
            String string = UUID.randomUUID().toString();
            AbstractC5830k.m5329f(string, "toString(...)");
            Rect rect2 = AbstractC3437h.f2603a;
            AbstractC3437h.f2609g = new Pair(string, new WeakReference(this.f2463i));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", string);
        }
        WeakReference weakReference = this.f2452K;
        C3429d c3429d = weakReference != null ? (C3429d) weakReference.get() : null;
        if (c3429d != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", c3429d.f2569b);
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uriM2491v);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.f2470p);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.f2445D);
        bundle.putInt("DEGREES_ROTATED", this.f2465k);
        CropOverlayView cropOverlayView = this.f2456b;
        AbstractC5830k.m5327d(cropOverlayView);
        bundle.putParcelable("INITIAL_CROP_RECT", cropOverlayView.getF2502K());
        RectF rectF = AbstractC3437h.f2605c;
        rectF.set(cropOverlayView.getCropWindowRect());
        Matrix matrix = this.f2457c;
        Matrix matrix2 = this.f2458d;
        matrix.invert(matrix2);
        matrix2.mapRect(rectF);
        bundle.putParcelable("CROP_WINDOW_RECT", rectF);
        CropShape cropShape = cropOverlayView.getCropShape();
        AbstractC5830k.m5327d(cropShape);
        bundle.putString("CROP_SHAPE", cropShape.name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.f2479y);
        bundle.putInt("CROP_MAX_ZOOM", this.f2480z);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.f2466l);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.f2467m);
        bundle.putBoolean("SHOW_CROP_LABEL", this.f2474t);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        this.f2451J = i9 > 0 && i10 > 0;
    }

    public final void setAutoZoomEnabled(boolean z8) {
        if (this.f2479y != z8) {
            this.f2479y = z8;
            m2439d(false, false);
            CropOverlayView cropOverlayView = this.f2456b;
            AbstractC5830k.m5327d(cropOverlayView);
            cropOverlayView.invalidate();
        }
    }

    public final void setCenterMoveEnabled(boolean centerMoveEnabled) {
        CropOverlayView cropOverlayView = this.f2456b;
        AbstractC5830k.m5327d(cropOverlayView);
        if (cropOverlayView.f2510f != centerMoveEnabled) {
            cropOverlayView.f2510f = centerMoveEnabled;
            m2439d(false, false);
            cropOverlayView.invalidate();
        }
    }

    public final void setCornerShape(@Nullable CropCornerShape cropCornerShape) {
        CropOverlayView cropOverlayView = this.f2456b;
        AbstractC5830k.m5327d(cropOverlayView);
        AbstractC5830k.m5327d(cropCornerShape);
        cropOverlayView.setCropCornerShape(cropCornerShape);
    }

    public final void setCropLabelText(@NotNull String cropLabelText) {
        AbstractC5830k.m5330g(cropLabelText, "cropLabelText");
        this.f2475u = cropLabelText;
        CropOverlayView cropOverlayView = this.f2456b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelText(cropLabelText);
        }
    }

    public final void setCropLabelTextColor(int i) {
        this.f2477w = i;
        CropOverlayView cropOverlayView = this.f2456b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextColor(i);
        }
    }

    public final void setCropLabelTextSize(float f) {
        this.f2476v = getF2476v();
        CropOverlayView cropOverlayView = this.f2456b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextSize(f);
        }
    }

    public final void setCropRect(@Nullable Rect rect) {
        CropOverlayView cropOverlayView = this.f2456b;
        AbstractC5830k.m5327d(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(rect);
    }

    public final void setCropShape(@Nullable CropShape cropShape) {
        CropOverlayView cropOverlayView = this.f2456b;
        AbstractC5830k.m5327d(cropOverlayView);
        AbstractC5830k.m5327d(cropShape);
        cropOverlayView.setCropShape(cropShape);
    }

    public final void setCustomOutputUri(@Nullable Uri uri) {
        this.customOutputUri = uri;
    }

    public final void setFixedAspectRatio(boolean fixAspectRatio) {
        CropOverlayView cropOverlayView = this.f2456b;
        AbstractC5830k.m5327d(cropOverlayView);
        cropOverlayView.setFixedAspectRatio(fixAspectRatio);
    }

    public final void setFlippedHorizontally(boolean z8) {
        if (this.f2466l != z8) {
            this.f2466l = z8;
            m2436a(getWidth(), getHeight(), true, false);
        }
    }

    public final void setFlippedVertically(boolean z8) {
        if (this.f2467m != z8) {
            this.f2467m = z8;
            m2436a(getWidth(), getHeight(), true, false);
        }
    }

    public final void setGuidelines(@Nullable Guidelines guidelines) {
        CropOverlayView cropOverlayView = this.f2456b;
        AbstractC5830k.m5327d(cropOverlayView);
        AbstractC5830k.m5327d(guidelines);
        cropOverlayView.setGuidelines(guidelines);
    }

    public final void setImageBitmap(@Nullable Bitmap bitmap) {
        CropOverlayView cropOverlayView = this.f2456b;
        AbstractC5830k.m5327d(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(null);
        m2442g(bitmap, 0, null, 1, 0);
    }

    public final void setImageCropOptions(@NotNull CropImageOptions options) {
        AbstractC5830k.m5330g(options, "options");
        boolean z8 = options.f2417l;
        boolean z9 = options.f2413j;
        setScaleType(options.f2411i);
        this.customOutputUri = options.f2386P;
        CropOverlayView cropOverlayView = this.f2456b;
        if (cropOverlayView != null) {
            cropOverlayView.setInitialAttributeValues(options);
        }
        setMultiTouchEnabled(options.f2423o);
        setCenterMoveEnabled(options.f2425p);
        setShowCropOverlay(z9);
        setShowProgressBar(z8);
        setAutoZoomEnabled(options.f2421n);
        setMaxZoom(options.f2429r);
        setFlippedHorizontally(options.f2404e0);
        setFlippedVertically(options.f2406f0);
        this.f2479y = options.f2421n;
        this.f2473s = z9;
        this.f2478x = z8;
        this.f2459e.setIndeterminateTintList(ColorStateList.valueOf(options.f2419m));
    }

    public final void setImageResource(int i) {
        if (i != 0) {
            CropOverlayView cropOverlayView = this.f2456b;
            AbstractC5830k.m5327d(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            m2442g(BitmapFactory.decodeResource(getResources(), i), i, null, 1, 0);
        }
    }

    public final void setImageUriAsync(@Nullable Uri uri) {
        C3429d c3429d;
        if (uri != null) {
            WeakReference weakReference = this.f2452K;
            if (weakReference != null && (c3429d = (C3429d) weakReference.get()) != null) {
                c3429d.f2573f.cancel(null);
            }
            m2437b();
            CropOverlayView cropOverlayView = this.f2456b;
            AbstractC5830k.m5327d(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            Context context = getContext();
            AbstractC5830k.m5329f(context, "getContext(...)");
            WeakReference weakReference2 = new WeakReference(new C3429d(context, this, uri));
            this.f2452K = weakReference2;
            C3429d c3429d2 = (C3429d) weakReference2.get();
            if (c3429d2 != null) {
                c3429d2.f2573f = AbstractC6014x.m5651v(c3429d2, AbstractC5896f0.f9343a, null, new BitmapLoadingWorkerJob$start$1(c3429d2, null), 2);
            }
            m2444i();
        }
    }

    public final void setMaxZoom(int i) {
        if (this.f2480z == i || i <= 0) {
            return;
        }
        this.f2480z = i;
        m2439d(false, false);
        CropOverlayView cropOverlayView = this.f2456b;
        AbstractC5830k.m5327d(cropOverlayView);
        cropOverlayView.invalidate();
    }

    public final void setMultiTouchEnabled(boolean multiTouchEnabled) {
        CropOverlayView cropOverlayView = this.f2456b;
        AbstractC5830k.m5327d(cropOverlayView);
        if (cropOverlayView.f2509e != multiTouchEnabled) {
            cropOverlayView.f2509e = multiTouchEnabled;
            if (multiTouchEnabled && cropOverlayView.f2508d == null) {
                cropOverlayView.f2508d = new ScaleGestureDetector(cropOverlayView.getContext(), new C3426b0(cropOverlayView));
            }
            m2439d(false, false);
            cropOverlayView.invalidate();
        }
    }

    public final void setOnCropImageCompleteListener(@Nullable InterfaceC3451v listener) {
        this.f2443B = listener;
    }

    public final void setOnCropWindowChangedListener(@Nullable InterfaceC3454y listener) {
    }

    public final void setOnSetCropOverlayMovedListener(@Nullable InterfaceC3452w listener) {
    }

    public final void setOnSetCropOverlayReleasedListener(@Nullable InterfaceC3453x listener) {
    }

    public final void setOnSetImageUriCompleteListener(@Nullable InterfaceC3455z listener) {
        this.f2442A = listener;
    }

    public final void setRotatedDegrees(int i) {
        int i8 = this.f2465k;
        if (i8 != i) {
            m2441f(i - i8);
        }
    }

    public final void setSaveBitmapToInstanceState(boolean z8) {
        this.isSaveBitmapToInstanceState = z8;
    }

    public final void setScaleType(@NotNull ScaleType scaleType) {
        AbstractC5830k.m5330g(scaleType, "scaleType");
        if (scaleType != this.f2471q) {
            this.f2471q = scaleType;
            this.f2446E = 1.0f;
            this.f2448G = 0.0f;
            this.f2447F = 0.0f;
            CropOverlayView cropOverlayView = this.f2456b;
            if (cropOverlayView != null) {
                cropOverlayView.m2452g();
            }
            requestLayout();
        }
    }

    public final void setShowCropLabel(boolean z8) {
        if (this.f2474t != z8) {
            this.f2474t = z8;
            CropOverlayView cropOverlayView = this.f2456b;
            if (cropOverlayView != null) {
                cropOverlayView.setCropperTextLabelVisibility(z8);
            }
        }
    }

    public final void setShowCropOverlay(boolean z8) {
        if (this.f2473s != z8) {
            this.f2473s = z8;
            m2443h();
        }
    }

    public final void setShowProgressBar(boolean z8) {
        if (this.f2478x != z8) {
            this.f2478x = z8;
            m2444i();
        }
    }

    public final void setSnapRadius(float snapRadius) {
        if (snapRadius >= 0.0f) {
            CropOverlayView cropOverlayView = this.f2456b;
            AbstractC5830k.m5327d(cropOverlayView);
            cropOverlayView.setSnapRadius(snapRadius);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CropImageView(@org.jetbrains.annotations.NotNull android.content.Context r52, @org.jetbrains.annotations.Nullable android.util.AttributeSet r53) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.<init>(android.content.Context, android.util.AttributeSet):void");
    }
}
