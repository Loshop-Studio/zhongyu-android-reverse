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
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.canhub.cropper.BitmapCroppingWorkerJob;
import com.canhub.cropper.BitmapLoadingWorkerJob;
import com.canhub.cropper.CropOverlayView;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p138j0.AnimationAnimationListenerC8985g;
import p212p7.InterfaceC9760a;

/* loaded from: classes3.dex */
public final class CropImageView extends FrameLayout implements CropOverlayView.InterfaceC5479b {

    /* renamed from: N */
    public static final C5471a f3451N = new C5471a(null);

    /* renamed from: A */
    public InterfaceC5477g f3452A;

    /* renamed from: B */
    public InterfaceC5473c f3453B;

    /* renamed from: C */
    public Uri f3454C;

    /* renamed from: D */
    public int f3455D;

    /* renamed from: E */
    public float f3456E;

    /* renamed from: F */
    public float f3457F;

    /* renamed from: G */
    public float f3458G;

    /* renamed from: H */
    public RectF f3459H;

    /* renamed from: I */
    public int f3460I;

    /* renamed from: J */
    public boolean f3461J;

    /* renamed from: K */
    public WeakReference f3462K;

    /* renamed from: L */
    public WeakReference f3463L;

    /* renamed from: M */
    public Uri f3464M;

    /* renamed from: a */
    public final ImageView f3465a;

    /* renamed from: b */
    public final CropOverlayView f3466b;

    /* renamed from: c */
    public final Matrix f3467c;

    /* renamed from: d */
    public final Matrix f3468d;

    /* renamed from: e */
    public final ProgressBar f3469e;

    /* renamed from: f */
    public final float[] f3470f;

    /* renamed from: g */
    public final float[] f3471g;

    /* renamed from: h */
    public AnimationAnimationListenerC8985g f3472h;

    /* renamed from: i */
    public Bitmap f3473i;

    /* renamed from: j */
    public int f3474j;

    /* renamed from: k */
    public int f3475k;

    /* renamed from: l */
    public boolean f3476l;

    /* renamed from: m */
    public boolean f3477m;

    /* renamed from: n */
    public int f3478n;

    /* renamed from: o */
    public int f3479o;

    /* renamed from: p */
    public int f3480p;

    /* renamed from: q */
    public ScaleType f3481q;

    /* renamed from: r */
    public boolean f3482r;

    /* renamed from: s */
    public boolean f3483s;

    /* renamed from: t */
    public boolean f3484t;

    /* renamed from: u */
    public String f3485u;

    /* renamed from: v */
    public float f3486v;

    /* renamed from: w */
    public int f3487w;

    /* renamed from: x */
    public boolean f3488x;

    /* renamed from: y */
    public boolean f3489y;

    /* renamed from: z */
    public int f3490z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CropCornerShape {

        /* renamed from: a */
        public static final CropCornerShape f3491a = new CropCornerShape("RECTANGLE", 0);

        /* renamed from: b */
        public static final CropCornerShape f3492b = new CropCornerShape("OVAL", 1);

        /* renamed from: c */
        public static final /* synthetic */ CropCornerShape[] f3493c;

        /* renamed from: d */
        public static final /* synthetic */ InterfaceC9760a f3494d;

        static {
            CropCornerShape[] cropCornerShapeArrM3294a = m3294a();
            f3493c = cropCornerShapeArrM3294a;
            f3494d = AbstractC9108a.m16085a(cropCornerShapeArrM3294a);
        }

        public CropCornerShape(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ CropCornerShape[] m3294a() {
            return new CropCornerShape[]{f3491a, f3492b};
        }

        public static CropCornerShape valueOf(String str) {
            return (CropCornerShape) Enum.valueOf(CropCornerShape.class, str);
        }

        public static CropCornerShape[] values() {
            return (CropCornerShape[]) f3493c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CropShape {

        /* renamed from: a */
        public static final CropShape f3495a = new CropShape("RECTANGLE", 0);

        /* renamed from: b */
        public static final CropShape f3496b = new CropShape("OVAL", 1);

        /* renamed from: c */
        public static final CropShape f3497c = new CropShape("RECTANGLE_VERTICAL_ONLY", 2);

        /* renamed from: d */
        public static final CropShape f3498d = new CropShape("RECTANGLE_HORIZONTAL_ONLY", 3);

        /* renamed from: e */
        public static final /* synthetic */ CropShape[] f3499e;

        /* renamed from: f */
        public static final /* synthetic */ InterfaceC9760a f3500f;

        static {
            CropShape[] cropShapeArrM3295a = m3295a();
            f3499e = cropShapeArrM3295a;
            f3500f = AbstractC9108a.m16085a(cropShapeArrM3295a);
        }

        public CropShape(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ CropShape[] m3295a() {
            return new CropShape[]{f3495a, f3496b, f3497c, f3498d};
        }

        public static CropShape valueOf(String str) {
            return (CropShape) Enum.valueOf(CropShape.class, str);
        }

        public static CropShape[] values() {
            return (CropShape[]) f3499e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Guidelines {

        /* renamed from: a */
        public static final Guidelines f3501a = new Guidelines("OFF", 0);

        /* renamed from: b */
        public static final Guidelines f3502b = new Guidelines("ON_TOUCH", 1);

        /* renamed from: c */
        public static final Guidelines f3503c = new Guidelines("ON", 2);

        /* renamed from: d */
        public static final /* synthetic */ Guidelines[] f3504d;

        /* renamed from: e */
        public static final /* synthetic */ InterfaceC9760a f3505e;

        static {
            Guidelines[] guidelinesArrM3296a = m3296a();
            f3504d = guidelinesArrM3296a;
            f3505e = AbstractC9108a.m16085a(guidelinesArrM3296a);
        }

        public Guidelines(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ Guidelines[] m3296a() {
            return new Guidelines[]{f3501a, f3502b, f3503c};
        }

        public static Guidelines valueOf(String str) {
            return (Guidelines) Enum.valueOf(Guidelines.class, str);
        }

        public static Guidelines[] values() {
            return (Guidelines[]) f3504d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RequestSizeOptions {

        /* renamed from: a */
        public static final RequestSizeOptions f3506a = new RequestSizeOptions("NONE", 0);

        /* renamed from: b */
        public static final RequestSizeOptions f3507b = new RequestSizeOptions("SAMPLING", 1);

        /* renamed from: c */
        public static final RequestSizeOptions f3508c = new RequestSizeOptions("RESIZE_INSIDE", 2);

        /* renamed from: d */
        public static final RequestSizeOptions f3509d = new RequestSizeOptions("RESIZE_FIT", 3);

        /* renamed from: e */
        public static final RequestSizeOptions f3510e = new RequestSizeOptions("RESIZE_EXACT", 4);

        /* renamed from: f */
        public static final /* synthetic */ RequestSizeOptions[] f3511f;

        /* renamed from: g */
        public static final /* synthetic */ InterfaceC9760a f3512g;

        static {
            RequestSizeOptions[] requestSizeOptionsArrM3297a = m3297a();
            f3511f = requestSizeOptionsArrM3297a;
            f3512g = AbstractC9108a.m16085a(requestSizeOptionsArrM3297a);
        }

        public RequestSizeOptions(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ RequestSizeOptions[] m3297a() {
            return new RequestSizeOptions[]{f3506a, f3507b, f3508c, f3509d, f3510e};
        }

        public static RequestSizeOptions valueOf(String str) {
            return (RequestSizeOptions) Enum.valueOf(RequestSizeOptions.class, str);
        }

        public static RequestSizeOptions[] values() {
            return (RequestSizeOptions[]) f3511f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ScaleType {

        /* renamed from: a */
        public static final ScaleType f3513a = new ScaleType("FIT_CENTER", 0);

        /* renamed from: b */
        public static final ScaleType f3514b = new ScaleType("CENTER", 1);

        /* renamed from: c */
        public static final ScaleType f3515c = new ScaleType("CENTER_CROP", 2);

        /* renamed from: d */
        public static final ScaleType f3516d = new ScaleType("CENTER_INSIDE", 3);

        /* renamed from: e */
        public static final /* synthetic */ ScaleType[] f3517e;

        /* renamed from: f */
        public static final /* synthetic */ InterfaceC9760a f3518f;

        static {
            ScaleType[] scaleTypeArrM3298a = m3298a();
            f3517e = scaleTypeArrM3298a;
            f3518f = AbstractC9108a.m16085a(scaleTypeArrM3298a);
        }

        public ScaleType(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ ScaleType[] m3298a() {
            return new ScaleType[]{f3513a, f3514b, f3515c, f3516d};
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) Enum.valueOf(ScaleType.class, str);
        }

        public static ScaleType[] values() {
            return (ScaleType[]) f3517e.clone();
        }
    }

    /* renamed from: com.canhub.cropper.CropImageView$a */
    public static final class C5471a {
        public /* synthetic */ C5471a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final int m3299a(int i10, int i11, int i12) {
            return i10 != Integer.MIN_VALUE ? i10 != 1073741824 ? i12 : i11 : Math.min(i12, i11);
        }

        public C5471a() {
        }
    }

    /* renamed from: com.canhub.cropper.CropImageView$b */
    public static class C5472b {

        /* renamed from: a */
        public final Bitmap f3519a;

        /* renamed from: b */
        public final Uri f3520b;

        /* renamed from: c */
        public final Bitmap f3521c;

        /* renamed from: d */
        public final Uri f3522d;

        /* renamed from: e */
        public final Exception f3523e;

        /* renamed from: f */
        public final float[] f3524f;

        /* renamed from: g */
        public final Rect f3525g;

        /* renamed from: h */
        public final Rect f3526h;

        /* renamed from: i */
        public final int f3527i;

        /* renamed from: j */
        public final int f3528j;

        public C5472b(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] cropPoints, Rect rect, Rect rect2, int i10, int i11) {
            AbstractC9133u.m16133g(cropPoints, "cropPoints");
            this.f3519a = bitmap;
            this.f3520b = uri;
            this.f3521c = bitmap2;
            this.f3522d = uri2;
            this.f3523e = exc;
            this.f3524f = cropPoints;
            this.f3525g = rect;
            this.f3526h = rect2;
            this.f3527i = i10;
            this.f3528j = i11;
        }

        /* renamed from: a */
        public final float[] m3300a() {
            return this.f3524f;
        }

        /* renamed from: b */
        public final Rect m3301b() {
            return this.f3525g;
        }

        /* renamed from: d */
        public final Exception m3302d() {
            return this.f3523e;
        }

        /* renamed from: f */
        public final Uri m3303f() {
            return this.f3520b;
        }

        /* renamed from: h */
        public final int m3304h() {
            return this.f3527i;
        }

        /* renamed from: i */
        public final int m3305i() {
            return this.f3528j;
        }

        /* renamed from: j */
        public final Uri m3306j() {
            return this.f3522d;
        }

        /* renamed from: k */
        public final Rect m3307k() {
            return this.f3526h;
        }
    }

    /* renamed from: com.canhub.cropper.CropImageView$c */
    public interface InterfaceC5473c {
        /* renamed from: a */
        void mo3259a(CropImageView cropImageView, C5472b c5472b);
    }

    /* renamed from: com.canhub.cropper.CropImageView$d */
    public interface InterfaceC5474d {
    }

    /* renamed from: com.canhub.cropper.CropImageView$e */
    public interface InterfaceC5475e {
    }

    /* renamed from: com.canhub.cropper.CropImageView$f */
    public interface InterfaceC5476f {
    }

    /* renamed from: com.canhub.cropper.CropImageView$g */
    public interface InterfaceC5477g {
        /* renamed from: b */
        void mo3260b(CropImageView cropImageView, Uri uri, Exception exc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CropImageView(android.content.Context r84, android.util.AttributeSet r85) {
        /*
            Method dump skipped, instructions count: 1005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: e */
    public static /* synthetic */ void m3275e(CropImageView cropImageView, Bitmap.CompressFormat compressFormat, int i10, int i11, int i12, RequestSizeOptions requestSizeOptions, Uri uri, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if ((i13 & 2) != 0) {
            i10 = 90;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        if ((i13 & 16) != 0) {
            requestSizeOptions = RequestSizeOptions.f3508c;
        }
        if ((i13 & 32) != 0) {
            uri = null;
        }
        cropImageView.m3280d(compressFormat, i10, i11, i12, requestSizeOptions, uri);
    }

    /* renamed from: i */
    public static /* synthetic */ Bitmap m3276i(CropImageView cropImageView, int i10, int i11, RequestSizeOptions requestSizeOptions, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            requestSizeOptions = RequestSizeOptions.f3508c;
        }
        return cropImageView.m3283h(i10, i11, requestSizeOptions);
    }

    @Override // com.canhub.cropper.CropOverlayView.InterfaceC5479b
    /* renamed from: a */
    public void mo3277a(boolean z10) {
        m3284j(z10, true);
    }

    /* renamed from: b */
    public final void m3278b(float f10, float f11, boolean z10, boolean z11) {
        if (this.f3473i != null) {
            if (f10 <= 0.0f || f11 <= 0.0f) {
                return;
            }
            this.f3467c.invert(this.f3468d);
            CropOverlayView cropOverlayView = this.f3466b;
            AbstractC9133u.m16130d(cropOverlayView);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            this.f3468d.mapRect(cropWindowRect);
            this.f3467c.reset();
            float f12 = 2;
            this.f3467c.postTranslate((f10 - r0.getWidth()) / f12, (f11 - r0.getHeight()) / f12);
            m3285k();
            int i10 = this.f3475k;
            if (i10 > 0) {
                C5484a c5484a = C5484a.f3592a;
                this.f3467c.postRotate(i10, c5484a.m3388w(this.f3470f), c5484a.m3389x(this.f3470f));
                m3285k();
            }
            C5484a c5484a2 = C5484a.f3592a;
            float fMin = Math.min(f10 / c5484a2.m3358D(this.f3470f), f11 / c5484a2.m3391z(this.f3470f));
            ScaleType scaleType = this.f3481q;
            if (scaleType == ScaleType.f3513a || ((scaleType == ScaleType.f3516d && fMin < 1.0f) || (fMin > 1.0f && this.f3489y))) {
                this.f3467c.postScale(fMin, fMin, c5484a2.m3388w(this.f3470f), c5484a2.m3389x(this.f3470f));
                m3285k();
            } else if (scaleType == ScaleType.f3515c) {
                this.f3456E = Math.max(getWidth() / c5484a2.m3358D(this.f3470f), getHeight() / c5484a2.m3391z(this.f3470f));
            }
            float f13 = this.f3476l ? -this.f3456E : this.f3456E;
            float f14 = this.f3477m ? -this.f3456E : this.f3456E;
            this.f3467c.postScale(f13, f14, c5484a2.m3388w(this.f3470f), c5484a2.m3389x(this.f3470f));
            m3285k();
            this.f3467c.mapRect(cropWindowRect);
            if (this.f3481q == ScaleType.f3515c && z10 && !z11) {
                this.f3457F = 0.0f;
                this.f3458G = 0.0f;
            } else if (z10) {
                this.f3457F = f10 > c5484a2.m3358D(this.f3470f) ? 0.0f : Math.max(Math.min((f10 / f12) - cropWindowRect.centerX(), -c5484a2.m3355A(this.f3470f)), getWidth() - c5484a2.m3356B(this.f3470f)) / f13;
                this.f3458G = f11 <= c5484a2.m3391z(this.f3470f) ? Math.max(Math.min((f11 / f12) - cropWindowRect.centerY(), -c5484a2.m3357C(this.f3470f)), getHeight() - c5484a2.m3387v(this.f3470f)) / f14 : 0.0f;
            } else {
                this.f3457F = Math.min(Math.max(this.f3457F * f13, -cropWindowRect.left), (-cropWindowRect.right) + f10) / f13;
                this.f3458G = Math.min(Math.max(this.f3458G * f14, -cropWindowRect.top), (-cropWindowRect.bottom) + f11) / f14;
            }
            this.f3467c.postTranslate(this.f3457F * f13, this.f3458G * f14);
            cropWindowRect.offset(this.f3457F * f13, this.f3458G * f14);
            this.f3466b.setCropWindowRect(cropWindowRect);
            m3285k();
            this.f3466b.invalidate();
            if (z11) {
                AnimationAnimationListenerC8985g animationAnimationListenerC8985g = this.f3472h;
                AbstractC9133u.m16130d(animationAnimationListenerC8985g);
                animationAnimationListenerC8985g.m15637c(this.f3470f, this.f3467c);
                this.f3465a.startAnimation(this.f3472h);
            } else {
                this.f3465a.setImageMatrix(this.f3467c);
            }
            m3293s(false);
        }
    }

    /* renamed from: c */
    public final void m3279c() {
        Bitmap bitmap = this.f3473i;
        if (bitmap != null && (this.f3480p > 0 || this.f3454C != null)) {
            AbstractC9133u.m16130d(bitmap);
            bitmap.recycle();
        }
        this.f3473i = null;
        this.f3480p = 0;
        this.f3454C = null;
        this.f3455D = 1;
        this.f3475k = 0;
        this.f3456E = 1.0f;
        this.f3457F = 0.0f;
        this.f3458G = 0.0f;
        this.f3467c.reset();
        this.f3459H = null;
        this.f3460I = 0;
        this.f3465a.setImageBitmap(null);
        m3290p();
    }

    /* renamed from: d */
    public final void m3280d(Bitmap.CompressFormat saveCompressFormat, int i10, int i11, int i12, RequestSizeOptions options, Uri uri) {
        AbstractC9133u.m16133g(saveCompressFormat, "saveCompressFormat");
        AbstractC9133u.m16133g(options, "options");
        if (this.f3453B == null) {
            throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        m3292r(i11, i12, options, saveCompressFormat, i10, uri);
    }

    /* renamed from: f */
    public final void m3281f() {
        this.f3476l = !this.f3476l;
        m3278b(getWidth(), getHeight(), true, false);
    }

    /* renamed from: g */
    public final void m3282g() {
        this.f3477m = !this.f3477m;
        m3278b(getWidth(), getHeight(), true, false);
    }

    public final Pair<Integer, Integer> getAspectRatio() {
        CropOverlayView cropOverlayView = this.f3466b;
        AbstractC9133u.m16130d(cropOverlayView);
        return new Pair<>(Integer.valueOf(cropOverlayView.getAspectRatioX()), Integer.valueOf(this.f3466b.getAspectRatioY()));
    }

    public final CropCornerShape getCornerShape() {
        CropOverlayView cropOverlayView = this.f3466b;
        AbstractC9133u.m16130d(cropOverlayView);
        return cropOverlayView.getCornerShape();
    }

    public final String getCropLabelText() {
        return this.f3485u;
    }

    public final int getCropLabelTextColor() {
        return this.f3487w;
    }

    public final float getCropLabelTextSize() {
        return this.f3486v;
    }

    public final float[] getCropPoints() {
        CropOverlayView cropOverlayView = this.f3466b;
        AbstractC9133u.m16130d(cropOverlayView);
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        float f10 = cropWindowRect.left;
        float f11 = cropWindowRect.top;
        float f12 = cropWindowRect.right;
        float f13 = cropWindowRect.bottom;
        float[] fArr = {f10, f11, f12, f11, f12, f13, f10, f13};
        this.f3467c.invert(this.f3468d);
        this.f3468d.mapPoints(fArr);
        float[] fArr2 = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            fArr2[i10] = fArr[i10] * this.f3455D;
        }
        return fArr2;
    }

    public final Rect getCropRect() {
        int i10 = this.f3455D;
        Bitmap bitmap = this.f3473i;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i10;
        int height = bitmap.getHeight() * i10;
        C5484a c5484a = C5484a.f3592a;
        CropOverlayView cropOverlayView = this.f3466b;
        AbstractC9133u.m16130d(cropOverlayView);
        return c5484a.m3390y(cropPoints, width, height, cropOverlayView.m3322o(), this.f3466b.getAspectRatioX(), this.f3466b.getAspectRatioY());
    }

    public final CropShape getCropShape() {
        CropOverlayView cropOverlayView = this.f3466b;
        AbstractC9133u.m16130d(cropOverlayView);
        return cropOverlayView.getCropShape();
    }

    public final RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.f3466b;
        if (cropOverlayView != null) {
            return cropOverlayView.getCropWindowRect();
        }
        return null;
    }

    public final Bitmap getCroppedImage() {
        return m3276i(this, 0, 0, null, 7, null);
    }

    public final Uri getCustomOutputUri() {
        return this.f3464M;
    }

    public final Guidelines getGuidelines() {
        CropOverlayView cropOverlayView = this.f3466b;
        AbstractC9133u.m16130d(cropOverlayView);
        return cropOverlayView.getGuidelines();
    }

    public final int getImageResource() {
        return this.f3480p;
    }

    public final Uri getImageUri() {
        return this.f3454C;
    }

    public final int getMaxZoom() {
        return this.f3490z;
    }

    public final int getRotatedDegrees() {
        return this.f3475k;
    }

    public final ScaleType getScaleType() {
        return this.f3481q;
    }

    public final Rect getWholeImageRect() {
        int i10 = this.f3455D;
        Bitmap bitmap = this.f3473i;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i10, bitmap.getHeight() * i10);
    }

    /* renamed from: h */
    public final Bitmap m3283h(int i10, int i11, RequestSizeOptions options) {
        int i12;
        Bitmap bitmapM3392a;
        AbstractC9133u.m16133g(options, "options");
        Bitmap bitmap = this.f3473i;
        if (bitmap == null) {
            return null;
        }
        RequestSizeOptions requestSizeOptions = RequestSizeOptions.f3506a;
        int i13 = options != requestSizeOptions ? i10 : 0;
        int i14 = options != requestSizeOptions ? i11 : 0;
        if (this.f3454C == null || (this.f3455D <= 1 && options != RequestSizeOptions.f3507b)) {
            i12 = i14;
            C5484a c5484a = C5484a.f3592a;
            float[] cropPoints = getCropPoints();
            int i15 = this.f3475k;
            CropOverlayView cropOverlayView = this.f3466b;
            AbstractC9133u.m16130d(cropOverlayView);
            bitmapM3392a = c5484a.m3372g(bitmap, cropPoints, i15, cropOverlayView.m3322o(), this.f3466b.getAspectRatioX(), this.f3466b.getAspectRatioY(), this.f3476l, this.f3477m).m3392a();
        } else {
            C5484a c5484a2 = C5484a.f3592a;
            Context context = getContext();
            AbstractC9133u.m16132f(context, "getContext(...)");
            Uri uri = this.f3454C;
            float[] cropPoints2 = getCropPoints();
            int i16 = this.f3475k;
            Bitmap bitmap2 = this.f3473i;
            AbstractC9133u.m16130d(bitmap2);
            int width = bitmap2.getWidth() * this.f3455D;
            Bitmap bitmap3 = this.f3473i;
            AbstractC9133u.m16130d(bitmap3);
            int height = bitmap3.getHeight() * this.f3455D;
            CropOverlayView cropOverlayView2 = this.f3466b;
            AbstractC9133u.m16130d(cropOverlayView2);
            i12 = i14;
            bitmapM3392a = c5484a2.m3369d(context, uri, cropPoints2, i16, width, height, cropOverlayView2.m3322o(), this.f3466b.getAspectRatioX(), this.f3466b.getAspectRatioY(), i13, i14, this.f3476l, this.f3477m).m3392a();
        }
        return C5484a.f3592a.m3361G(bitmapM3392a, i13, i12, options);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3284j(boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.m3284j(boolean, boolean):void");
    }

    /* renamed from: k */
    public final void m3285k() {
        float[] fArr = this.f3470f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        AbstractC9133u.m16130d(this.f3473i);
        fArr[2] = r4.getWidth();
        float[] fArr2 = this.f3470f;
        fArr2[3] = 0.0f;
        AbstractC9133u.m16130d(this.f3473i);
        fArr2[4] = r6.getWidth();
        float[] fArr3 = this.f3470f;
        AbstractC9133u.m16130d(this.f3473i);
        fArr3[5] = r6.getHeight();
        float[] fArr4 = this.f3470f;
        fArr4[6] = 0.0f;
        AbstractC9133u.m16130d(this.f3473i);
        fArr4[7] = r9.getHeight();
        this.f3467c.mapPoints(this.f3470f);
        float[] fArr5 = this.f3471g;
        fArr5[0] = 0.0f;
        fArr5[1] = 0.0f;
        fArr5[2] = 100.0f;
        fArr5[3] = 0.0f;
        fArr5[4] = 100.0f;
        fArr5[5] = 100.0f;
        fArr5[6] = 0.0f;
        fArr5[7] = 100.0f;
        this.f3467c.mapPoints(fArr5);
    }

    /* renamed from: l */
    public final void m3286l(BitmapCroppingWorkerJob.C5457a result) {
        AbstractC9133u.m16133g(result, "result");
        this.f3463L = null;
        m3291q();
        InterfaceC5473c interfaceC5473c = this.f3453B;
        if (interfaceC5473c != null) {
            interfaceC5473c.mo3259a(this, new C5472b(this.f3473i, this.f3454C, result.m3217a(), result.m3220d(), result.m3218b(), getCropPoints(), getCropRect(), getWholeImageRect(), getRotatedDegrees(), result.m3219c()));
        }
    }

    /* renamed from: m */
    public final void m3287m(BitmapLoadingWorkerJob.C5459a result) {
        CropImageView cropImageView;
        AbstractC9133u.m16133g(result, "result");
        this.f3462K = null;
        m3291q();
        if (result.m3232c() == null) {
            this.f3474j = result.m3231b();
            this.f3476l = result.m3233d();
            this.f3477m = result.m3234e();
            cropImageView = this;
            cropImageView.m3289o(result.m3230a(), 0, result.m3236g(), result.m3235f(), result.m3231b());
        } else {
            cropImageView = this;
        }
        InterfaceC5477g interfaceC5477g = cropImageView.f3452A;
        if (interfaceC5477g != null) {
            interfaceC5477g.mo3260b(this, result.m3236g(), result.m3232c());
        }
    }

    /* renamed from: n */
    public final void m3288n(int i10) {
        if (this.f3473i != null) {
            int i11 = i10 < 0 ? (i10 % 360) + 360 : i10 % 360;
            CropOverlayView cropOverlayView = this.f3466b;
            AbstractC9133u.m16130d(cropOverlayView);
            boolean z10 = !cropOverlayView.m3322o() && ((46 <= i11 && i11 < 135) || (216 <= i11 && i11 < 305));
            C5484a c5484a = C5484a.f3592a;
            c5484a.m3386u().set(this.f3466b.getCropWindowRect());
            RectF rectFM3386u = c5484a.m3386u();
            float fHeight = (z10 ? rectFM3386u.height() : rectFM3386u.width()) / 2.0f;
            RectF rectFM3386u2 = c5484a.m3386u();
            float fWidth = (z10 ? rectFM3386u2.width() : rectFM3386u2.height()) / 2.0f;
            if (z10) {
                boolean z11 = this.f3476l;
                this.f3476l = this.f3477m;
                this.f3477m = z11;
            }
            this.f3467c.invert(this.f3468d);
            c5484a.m3384s()[0] = c5484a.m3386u().centerX();
            c5484a.m3384s()[1] = c5484a.m3386u().centerY();
            c5484a.m3384s()[2] = 0.0f;
            c5484a.m3384s()[3] = 0.0f;
            c5484a.m3384s()[4] = 1.0f;
            c5484a.m3384s()[5] = 0.0f;
            this.f3468d.mapPoints(c5484a.m3384s());
            this.f3475k = (this.f3475k + i11) % 360;
            m3278b(getWidth(), getHeight(), true, false);
            this.f3467c.mapPoints(c5484a.m3385t(), c5484a.m3384s());
            float fSqrt = this.f3456E / ((float) Math.sqrt(Math.pow(c5484a.m3385t()[4] - c5484a.m3385t()[2], 2.0d) + Math.pow(c5484a.m3385t()[5] - c5484a.m3385t()[3], 2.0d)));
            this.f3456E = fSqrt;
            this.f3456E = Math.max(fSqrt, 1.0f);
            m3278b(getWidth(), getHeight(), true, false);
            this.f3467c.mapPoints(c5484a.m3385t(), c5484a.m3384s());
            float fSqrt2 = (float) Math.sqrt(Math.pow(c5484a.m3385t()[4] - c5484a.m3385t()[2], 2.0d) + Math.pow(c5484a.m3385t()[5] - c5484a.m3385t()[3], 2.0d));
            float f10 = fHeight * fSqrt2;
            float f11 = fWidth * fSqrt2;
            c5484a.m3386u().set(c5484a.m3385t()[0] - f10, c5484a.m3385t()[1] - f11, c5484a.m3385t()[0] + f10, c5484a.m3385t()[1] + f11);
            this.f3466b.m3327t();
            this.f3466b.setCropWindowRect(c5484a.m3386u());
            m3278b(getWidth(), getHeight(), true, false);
            m3284j(false, false);
            this.f3466b.m3320m();
        }
    }

    /* renamed from: o */
    public final void m3289o(Bitmap bitmap, int i10, Uri uri, int i11, int i12) {
        Bitmap bitmap2 = this.f3473i;
        if (bitmap2 == null || !AbstractC9133u.m16128b(bitmap2, bitmap)) {
            m3279c();
            this.f3473i = bitmap;
            this.f3465a.setImageBitmap(bitmap);
            this.f3454C = uri;
            this.f3480p = i10;
            this.f3455D = i11;
            this.f3475k = i12;
            m3278b(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f3466b;
            if (cropOverlayView != null) {
                cropOverlayView.m3327t();
                m3290p();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f3478n <= 0 || this.f3479o <= 0) {
            m3293s(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f3478n;
        layoutParams.height = this.f3479o;
        setLayoutParams(layoutParams);
        if (this.f3473i == null) {
            m3293s(true);
            return;
        }
        float f10 = i12 - i10;
        float f11 = i13 - i11;
        m3278b(f10, f11, true, false);
        RectF rectF = this.f3459H;
        if (rectF == null) {
            if (this.f3461J) {
                this.f3461J = false;
                m3284j(false, false);
                return;
            }
            return;
        }
        int i14 = this.f3460I;
        if (i14 != this.f3474j) {
            this.f3475k = i14;
            m3278b(f10, f11, true, false);
            this.f3460I = 0;
        }
        this.f3467c.mapRect(this.f3459H);
        CropOverlayView cropOverlayView = this.f3466b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropWindowRect(rectF);
        }
        m3284j(false, false);
        CropOverlayView cropOverlayView2 = this.f3466b;
        if (cropOverlayView2 != null) {
            cropOverlayView2.m3320m();
        }
        this.f3459H = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int width;
        int height;
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        Bitmap bitmap = this.f3473i;
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
        C5471a c5471a = f3451N;
        int iM3299a = c5471a.m3299a(mode, size, width);
        int iM3299a2 = c5471a.m3299a(mode2, size2, height);
        this.f3478n = iM3299a;
        this.f3479o = iM3299a2;
        setMeasuredDimension(iM3299a, iM3299a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRestoreInstanceState(android.os.Parcelable r10) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.onRestoreInstanceState(android.os.Parcelable):void");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Uri uriM3365K;
        if (this.f3454C == null && this.f3473i == null && this.f3480p < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        if (this.f3482r && this.f3454C == null && this.f3480p < 1) {
            C5484a c5484a = C5484a.f3592a;
            Context context = getContext();
            AbstractC9133u.m16132f(context, "getContext(...)");
            uriM3365K = c5484a.m3365K(context, this.f3473i, this.f3464M);
        } else {
            uriM3365K = this.f3454C;
        }
        if (uriM3365K != null && this.f3473i != null) {
            String string = UUID.randomUUID().toString();
            AbstractC9133u.m16132f(string, "toString(...)");
            C5484a.f3592a.m3363I(new Pair(string, new WeakReference(this.f3473i)));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", string);
        }
        WeakReference weakReference = this.f3462K;
        BitmapLoadingWorkerJob bitmapLoadingWorkerJob = weakReference != null ? (BitmapLoadingWorkerJob) weakReference.get() : null;
        if (bitmapLoadingWorkerJob != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", bitmapLoadingWorkerJob.m3227g());
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uriM3365K);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.f3480p);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.f3455D);
        bundle.putInt("DEGREES_ROTATED", this.f3475k);
        CropOverlayView cropOverlayView = this.f3466b;
        AbstractC9133u.m16130d(cropOverlayView);
        bundle.putParcelable("INITIAL_CROP_RECT", cropOverlayView.getInitialCropWindowRect());
        C5484a c5484a2 = C5484a.f3592a;
        c5484a2.m3386u().set(this.f3466b.getCropWindowRect());
        this.f3467c.invert(this.f3468d);
        this.f3468d.mapRect(c5484a2.m3386u());
        bundle.putParcelable("CROP_WINDOW_RECT", c5484a2.m3386u());
        CropShape cropShape = this.f3466b.getCropShape();
        AbstractC9133u.m16130d(cropShape);
        bundle.putString("CROP_SHAPE", cropShape.name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.f3489y);
        bundle.putInt("CROP_MAX_ZOOM", this.f3490z);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.f3476l);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.f3477m);
        bundle.putBoolean("SHOW_CROP_LABEL", this.f3484t);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f3461J = i12 > 0 && i13 > 0;
    }

    /* renamed from: p */
    public final void m3290p() {
        CropOverlayView cropOverlayView = this.f3466b;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.f3483s || this.f3473i == null) ? 4 : 0);
        }
    }

    /* renamed from: q */
    public final void m3291q() {
        this.f3469e.setVisibility(this.f3488x && ((this.f3473i == null && this.f3462K != null) || this.f3463L != null) ? 0 : 4);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* renamed from: r */
    public final void m3292r(int r22, int r23, com.canhub.cropper.CropImageView.RequestSizeOptions r24, android.graphics.Bitmap.CompressFormat r25, int r26, android.net.Uri r27) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.m3292r(int, int, com.canhub.cropper.CropImageView$RequestSizeOptions, android.graphics.Bitmap$CompressFormat, int, android.net.Uri):void");
    }

    /* renamed from: s */
    public final void m3293s(boolean z10) {
        if (this.f3473i != null && !z10) {
            C5484a c5484a = C5484a.f3592a;
            float fM3358D = (this.f3455D * 100.0f) / c5484a.m3358D(this.f3471g);
            float fM3391z = (this.f3455D * 100.0f) / c5484a.m3391z(this.f3471g);
            CropOverlayView cropOverlayView = this.f3466b;
            AbstractC9133u.m16130d(cropOverlayView);
            cropOverlayView.m3330w(getWidth(), getHeight(), fM3358D, fM3391z);
        }
        CropOverlayView cropOverlayView2 = this.f3466b;
        AbstractC9133u.m16130d(cropOverlayView2);
        cropOverlayView2.m3328u(z10 ? null : this.f3470f, getWidth(), getHeight());
    }

    public final void setAutoZoomEnabled(boolean z10) {
        if (this.f3489y != z10) {
            this.f3489y = z10;
            m3284j(false, false);
            CropOverlayView cropOverlayView = this.f3466b;
            AbstractC9133u.m16130d(cropOverlayView);
            cropOverlayView.invalidate();
        }
    }

    public final void setCenterMoveEnabled(boolean z10) {
        CropOverlayView cropOverlayView = this.f3466b;
        AbstractC9133u.m16130d(cropOverlayView);
        if (cropOverlayView.m3329v(z10)) {
            m3284j(false, false);
            this.f3466b.invalidate();
        }
    }

    public final void setCornerShape(CropCornerShape cropCornerShape) {
        CropOverlayView cropOverlayView = this.f3466b;
        AbstractC9133u.m16130d(cropOverlayView);
        AbstractC9133u.m16130d(cropCornerShape);
        cropOverlayView.setCropCornerShape(cropCornerShape);
    }

    public final void setCropLabelText(String cropLabelText) {
        AbstractC9133u.m16133g(cropLabelText, "cropLabelText");
        this.f3485u = cropLabelText;
        CropOverlayView cropOverlayView = this.f3466b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelText(cropLabelText);
        }
    }

    public final void setCropLabelTextColor(int i10) {
        this.f3487w = i10;
        CropOverlayView cropOverlayView = this.f3466b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextColor(i10);
        }
    }

    public final void setCropLabelTextSize(float f10) {
        this.f3486v = getCropLabelTextSize();
        CropOverlayView cropOverlayView = this.f3466b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextSize(f10);
        }
    }

    public final void setCropRect(Rect rect) {
        CropOverlayView cropOverlayView = this.f3466b;
        AbstractC9133u.m16130d(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(rect);
    }

    public final void setCropShape(CropShape cropShape) {
        CropOverlayView cropOverlayView = this.f3466b;
        AbstractC9133u.m16130d(cropOverlayView);
        AbstractC9133u.m16130d(cropShape);
        cropOverlayView.setCropShape(cropShape);
    }

    public final void setCustomOutputUri(Uri uri) {
        this.f3464M = uri;
    }

    public final void setFixedAspectRatio(boolean z10) {
        CropOverlayView cropOverlayView = this.f3466b;
        AbstractC9133u.m16130d(cropOverlayView);
        cropOverlayView.setFixedAspectRatio(z10);
    }

    public final void setFlippedHorizontally(boolean z10) {
        if (this.f3476l != z10) {
            this.f3476l = z10;
            m3278b(getWidth(), getHeight(), true, false);
        }
    }

    public final void setFlippedVertically(boolean z10) {
        if (this.f3477m != z10) {
            this.f3477m = z10;
            m3278b(getWidth(), getHeight(), true, false);
        }
    }

    public final void setGuidelines(Guidelines guidelines) {
        CropOverlayView cropOverlayView = this.f3466b;
        AbstractC9133u.m16130d(cropOverlayView);
        AbstractC9133u.m16130d(guidelines);
        cropOverlayView.setGuidelines(guidelines);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        CropOverlayView cropOverlayView = this.f3466b;
        AbstractC9133u.m16130d(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(null);
        m3289o(bitmap, 0, null, 1, 0);
    }

    public final void setImageCropOptions(CropImageOptions options) {
        AbstractC9133u.m16133g(options, "options");
        setScaleType(options.f3419i);
        this.f3464M = options.f3396P;
        CropOverlayView cropOverlayView = this.f3466b;
        if (cropOverlayView != null) {
            cropOverlayView.setInitialAttributeValues(options);
        }
        setMultiTouchEnabled(options.f3431o);
        setCenterMoveEnabled(options.f3433p);
        setShowCropOverlay(options.f3421j);
        setShowProgressBar(options.f3425l);
        setAutoZoomEnabled(options.f3429n);
        setMaxZoom(options.f3437r);
        setFlippedHorizontally(options.f3416g0);
        setFlippedVertically(options.f3418h0);
        this.f3489y = options.f3429n;
        this.f3483s = options.f3421j;
        this.f3488x = options.f3425l;
        this.f3469e.setIndeterminateTintList(ColorStateList.valueOf(options.f3427m));
    }

    public final void setImageResource(int i10) {
        if (i10 != 0) {
            CropOverlayView cropOverlayView = this.f3466b;
            AbstractC9133u.m16130d(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            m3289o(BitmapFactory.decodeResource(getResources(), i10), i10, null, 1, 0);
        }
    }

    public final void setImageUriAsync(Uri uri) {
        BitmapLoadingWorkerJob bitmapLoadingWorkerJob;
        if (uri != null) {
            WeakReference weakReference = this.f3462K;
            if (weakReference != null && (bitmapLoadingWorkerJob = (BitmapLoadingWorkerJob) weakReference.get()) != null) {
                bitmapLoadingWorkerJob.m3226f();
            }
            m3279c();
            CropOverlayView cropOverlayView = this.f3466b;
            AbstractC9133u.m16130d(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            Context context = getContext();
            AbstractC9133u.m16132f(context, "getContext(...)");
            WeakReference weakReference2 = new WeakReference(new BitmapLoadingWorkerJob(context, this, uri));
            this.f3462K = weakReference2;
            BitmapLoadingWorkerJob bitmapLoadingWorkerJob2 = (BitmapLoadingWorkerJob) weakReference2.get();
            if (bitmapLoadingWorkerJob2 != null) {
                bitmapLoadingWorkerJob2.m3229i();
            }
            m3291q();
        }
    }

    public final void setMaxZoom(int i10) {
        if (this.f3490z == i10 || i10 <= 0) {
            return;
        }
        this.f3490z = i10;
        m3284j(false, false);
        CropOverlayView cropOverlayView = this.f3466b;
        AbstractC9133u.m16130d(cropOverlayView);
        cropOverlayView.invalidate();
    }

    public final void setMultiTouchEnabled(boolean z10) {
        CropOverlayView cropOverlayView = this.f3466b;
        AbstractC9133u.m16130d(cropOverlayView);
        if (cropOverlayView.m3331x(z10)) {
            m3284j(false, false);
            this.f3466b.invalidate();
        }
    }

    public final void setOnCropImageCompleteListener(InterfaceC5473c interfaceC5473c) {
        this.f3453B = interfaceC5473c;
    }

    public final void setOnCropWindowChangedListener(InterfaceC5476f interfaceC5476f) {
    }

    public final void setOnSetCropOverlayMovedListener(InterfaceC5474d interfaceC5474d) {
    }

    public final void setOnSetCropOverlayReleasedListener(InterfaceC5475e interfaceC5475e) {
    }

    public final void setOnSetImageUriCompleteListener(InterfaceC5477g interfaceC5477g) {
        this.f3452A = interfaceC5477g;
    }

    public final void setRotatedDegrees(int i10) {
        int i11 = this.f3475k;
        if (i11 != i10) {
            m3288n(i10 - i11);
        }
    }

    public final void setSaveBitmapToInstanceState(boolean z10) {
        this.f3482r = z10;
    }

    public final void setScaleType(ScaleType scaleType) {
        AbstractC9133u.m16133g(scaleType, "scaleType");
        if (scaleType != this.f3481q) {
            this.f3481q = scaleType;
            this.f3456E = 1.0f;
            this.f3458G = 0.0f;
            this.f3457F = 0.0f;
            CropOverlayView cropOverlayView = this.f3466b;
            if (cropOverlayView != null) {
                cropOverlayView.m3327t();
            }
            requestLayout();
        }
    }

    public final void setShowCropLabel(boolean z10) {
        if (this.f3484t != z10) {
            this.f3484t = z10;
            CropOverlayView cropOverlayView = this.f3466b;
            if (cropOverlayView != null) {
                cropOverlayView.setCropperTextLabelVisibility(z10);
            }
        }
    }

    public final void setShowCropOverlay(boolean z10) {
        if (this.f3483s != z10) {
            this.f3483s = z10;
            m3290p();
        }
    }

    public final void setShowProgressBar(boolean z10) {
        if (this.f3488x != z10) {
            this.f3488x = z10;
            m3291q();
        }
    }

    public final void setSnapRadius(float f10) {
        if (f10 >= 0.0f) {
            CropOverlayView cropOverlayView = this.f3466b;
            AbstractC9133u.m16130d(cropOverlayView);
            cropOverlayView.setSnapRadius(f10);
        }
    }
}
