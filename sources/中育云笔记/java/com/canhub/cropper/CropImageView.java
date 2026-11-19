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
import android.util.AttributeSet;
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
import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p140f1.AnimationAnimationListenerC9155g;
import p425yc.InterfaceC11943a;

/* loaded from: classes3.dex */
public final class CropImageView extends FrameLayout implements CropOverlayView.InterfaceC5898b {

    /* renamed from: P */
    public static final C5890a f5221P = new C5890a(null);

    /* renamed from: A */
    public boolean f5222A;

    /* renamed from: B */
    public int f5223B;

    /* renamed from: C */
    public InterfaceC5896g f5224C;

    /* renamed from: D */
    public InterfaceC5892c f5225D;

    /* renamed from: E */
    public Uri f5226E;

    /* renamed from: F */
    public int f5227F;

    /* renamed from: G */
    public float f5228G;

    /* renamed from: H */
    public float f5229H;

    /* renamed from: I */
    public float f5230I;

    /* renamed from: J */
    public RectF f5231J;

    /* renamed from: K */
    public int f5232K;

    /* renamed from: L */
    public boolean f5233L;

    /* renamed from: M */
    public WeakReference f5234M;

    /* renamed from: N */
    public WeakReference f5235N;

    /* renamed from: O */
    public Uri f5236O;

    /* renamed from: c */
    public final ImageView f5237c;

    /* renamed from: d */
    public final CropOverlayView f5238d;

    /* renamed from: e */
    public final Matrix f5239e;

    /* renamed from: f */
    public final Matrix f5240f;

    /* renamed from: g */
    public final ProgressBar f5241g;

    /* renamed from: h */
    public final float[] f5242h;

    /* renamed from: i */
    public final float[] f5243i;

    /* renamed from: j */
    public AnimationAnimationListenerC9155g f5244j;

    /* renamed from: k */
    public Bitmap f5245k;

    /* renamed from: l */
    public int f5246l;

    /* renamed from: m */
    public int f5247m;

    /* renamed from: n */
    public boolean f5248n;

    /* renamed from: o */
    public boolean f5249o;

    /* renamed from: p */
    public int f5250p;

    /* renamed from: q */
    public int f5251q;

    /* renamed from: r */
    public int f5252r;

    /* renamed from: s */
    public ScaleType f5253s;

    /* renamed from: t */
    public boolean f5254t;

    /* renamed from: u */
    public boolean f5255u;

    /* renamed from: v */
    public boolean f5256v;

    /* renamed from: w */
    public String f5257w;

    /* renamed from: x */
    public float f5258x;

    /* renamed from: y */
    public int f5259y;

    /* renamed from: z */
    public boolean f5260z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CropCornerShape {

        /* renamed from: c */
        public static final CropCornerShape f5261c = new CropCornerShape("RECTANGLE", 0);

        /* renamed from: d */
        public static final CropCornerShape f5262d = new CropCornerShape("OVAL", 1);

        /* renamed from: e */
        public static final /* synthetic */ CropCornerShape[] f5263e;

        /* renamed from: f */
        public static final /* synthetic */ InterfaceC11943a f5264f;

        static {
            CropCornerShape[] cropCornerShapeArrM4496a = m4496a();
            f5263e = cropCornerShapeArrM4496a;
            f5264f = AbstractC9953a.m20230a(cropCornerShapeArrM4496a);
        }

        public CropCornerShape(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ CropCornerShape[] m4496a() {
            return new CropCornerShape[]{f5261c, f5262d};
        }

        public static CropCornerShape valueOf(String str) {
            return (CropCornerShape) Enum.valueOf(CropCornerShape.class, str);
        }

        public static CropCornerShape[] values() {
            return (CropCornerShape[]) f5263e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CropShape {

        /* renamed from: c */
        public static final CropShape f5265c = new CropShape("RECTANGLE", 0);

        /* renamed from: d */
        public static final CropShape f5266d = new CropShape("OVAL", 1);

        /* renamed from: e */
        public static final CropShape f5267e = new CropShape("RECTANGLE_VERTICAL_ONLY", 2);

        /* renamed from: f */
        public static final CropShape f5268f = new CropShape("RECTANGLE_HORIZONTAL_ONLY", 3);

        /* renamed from: g */
        public static final /* synthetic */ CropShape[] f5269g;

        /* renamed from: h */
        public static final /* synthetic */ InterfaceC11943a f5270h;

        static {
            CropShape[] cropShapeArrM4497a = m4497a();
            f5269g = cropShapeArrM4497a;
            f5270h = AbstractC9953a.m20230a(cropShapeArrM4497a);
        }

        public CropShape(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ CropShape[] m4497a() {
            return new CropShape[]{f5265c, f5266d, f5267e, f5268f};
        }

        public static CropShape valueOf(String str) {
            return (CropShape) Enum.valueOf(CropShape.class, str);
        }

        public static CropShape[] values() {
            return (CropShape[]) f5269g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Guidelines {

        /* renamed from: c */
        public static final Guidelines f5271c = new Guidelines("OFF", 0);

        /* renamed from: d */
        public static final Guidelines f5272d = new Guidelines("ON_TOUCH", 1);

        /* renamed from: e */
        public static final Guidelines f5273e = new Guidelines("ON", 2);

        /* renamed from: f */
        public static final /* synthetic */ Guidelines[] f5274f;

        /* renamed from: g */
        public static final /* synthetic */ InterfaceC11943a f5275g;

        static {
            Guidelines[] guidelinesArrM4498a = m4498a();
            f5274f = guidelinesArrM4498a;
            f5275g = AbstractC9953a.m20230a(guidelinesArrM4498a);
        }

        public Guidelines(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ Guidelines[] m4498a() {
            return new Guidelines[]{f5271c, f5272d, f5273e};
        }

        public static Guidelines valueOf(String str) {
            return (Guidelines) Enum.valueOf(Guidelines.class, str);
        }

        public static Guidelines[] values() {
            return (Guidelines[]) f5274f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RequestSizeOptions {

        /* renamed from: c */
        public static final RequestSizeOptions f5276c = new RequestSizeOptions("NONE", 0);

        /* renamed from: d */
        public static final RequestSizeOptions f5277d = new RequestSizeOptions("SAMPLING", 1);

        /* renamed from: e */
        public static final RequestSizeOptions f5278e = new RequestSizeOptions("RESIZE_INSIDE", 2);

        /* renamed from: f */
        public static final RequestSizeOptions f5279f = new RequestSizeOptions("RESIZE_FIT", 3);

        /* renamed from: g */
        public static final RequestSizeOptions f5280g = new RequestSizeOptions("RESIZE_EXACT", 4);

        /* renamed from: h */
        public static final /* synthetic */ RequestSizeOptions[] f5281h;

        /* renamed from: i */
        public static final /* synthetic */ InterfaceC11943a f5282i;

        static {
            RequestSizeOptions[] requestSizeOptionsArrM4499a = m4499a();
            f5281h = requestSizeOptionsArrM4499a;
            f5282i = AbstractC9953a.m20230a(requestSizeOptionsArrM4499a);
        }

        public RequestSizeOptions(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ RequestSizeOptions[] m4499a() {
            return new RequestSizeOptions[]{f5276c, f5277d, f5278e, f5279f, f5280g};
        }

        public static RequestSizeOptions valueOf(String str) {
            return (RequestSizeOptions) Enum.valueOf(RequestSizeOptions.class, str);
        }

        public static RequestSizeOptions[] values() {
            return (RequestSizeOptions[]) f5281h.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ScaleType {

        /* renamed from: c */
        public static final ScaleType f5283c = new ScaleType("FIT_CENTER", 0);

        /* renamed from: d */
        public static final ScaleType f5284d = new ScaleType("CENTER", 1);

        /* renamed from: e */
        public static final ScaleType f5285e = new ScaleType("CENTER_CROP", 2);

        /* renamed from: f */
        public static final ScaleType f5286f = new ScaleType("CENTER_INSIDE", 3);

        /* renamed from: g */
        public static final /* synthetic */ ScaleType[] f5287g;

        /* renamed from: h */
        public static final /* synthetic */ InterfaceC11943a f5288h;

        static {
            ScaleType[] scaleTypeArrM4500a = m4500a();
            f5287g = scaleTypeArrM4500a;
            f5288h = AbstractC9953a.m20230a(scaleTypeArrM4500a);
        }

        public ScaleType(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ ScaleType[] m4500a() {
            return new ScaleType[]{f5283c, f5284d, f5285e, f5286f};
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) Enum.valueOf(ScaleType.class, str);
        }

        public static ScaleType[] values() {
            return (ScaleType[]) f5287g.clone();
        }
    }

    /* renamed from: com.canhub.cropper.CropImageView$a */
    public static final class C5890a {
        public /* synthetic */ C5890a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final int m4501a(int i10, int i11, int i12) {
            return i10 != Integer.MIN_VALUE ? i10 != 1073741824 ? i12 : i11 : Math.min(i12, i11);
        }

        public C5890a() {
        }
    }

    /* renamed from: com.canhub.cropper.CropImageView$b */
    public static class C5891b {

        /* renamed from: c */
        public final Bitmap f5289c;

        /* renamed from: d */
        public final Uri f5290d;

        /* renamed from: e */
        public final Bitmap f5291e;

        /* renamed from: f */
        public final Uri f5292f;

        /* renamed from: g */
        public final Exception f5293g;

        /* renamed from: h */
        public final float[] f5294h;

        /* renamed from: i */
        public final Rect f5295i;

        /* renamed from: j */
        public final Rect f5296j;

        /* renamed from: k */
        public final int f5297k;

        /* renamed from: l */
        public final int f5298l;

        public C5891b(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] cropPoints, Rect rect, Rect rect2, int i10, int i11) {
            AbstractC9979u.m20294g(cropPoints, "cropPoints");
            this.f5289c = bitmap;
            this.f5290d = uri;
            this.f5291e = bitmap2;
            this.f5292f = uri2;
            this.f5293g = exc;
            this.f5294h = cropPoints;
            this.f5295i = rect;
            this.f5296j = rect2;
            this.f5297k = i10;
            this.f5298l = i11;
        }

        /* renamed from: a */
        public final float[] m4502a() {
            return this.f5294h;
        }

        /* renamed from: b */
        public final Rect m4503b() {
            return this.f5295i;
        }

        /* renamed from: c */
        public final Exception m4504c() {
            return this.f5293g;
        }

        /* renamed from: g */
        public final Uri m4505g() {
            return this.f5290d;
        }

        /* renamed from: h */
        public final int m4506h() {
            return this.f5297k;
        }

        /* renamed from: i */
        public final int m4507i() {
            return this.f5298l;
        }

        /* renamed from: j */
        public final Uri m4508j() {
            return this.f5292f;
        }

        /* renamed from: k */
        public final Rect m4509k() {
            return this.f5296j;
        }
    }

    /* renamed from: com.canhub.cropper.CropImageView$c */
    public interface InterfaceC5892c {
        /* renamed from: q */
        void mo4467q(CropImageView cropImageView, C5891b c5891b);
    }

    /* renamed from: com.canhub.cropper.CropImageView$d */
    public interface InterfaceC5893d {
    }

    /* renamed from: com.canhub.cropper.CropImageView$e */
    public interface InterfaceC5894e {
    }

    /* renamed from: com.canhub.cropper.CropImageView$f */
    public interface InterfaceC5895f {
    }

    /* renamed from: com.canhub.cropper.CropImageView$g */
    public interface InterfaceC5896g {
        /* renamed from: v */
        void mo2667v(CropImageView cropImageView, Uri uri, Exception exc);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CropImageView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        AbstractC9979u.m20294g(context, "context");
    }

    /* renamed from: e */
    public static /* synthetic */ void m4476e(CropImageView cropImageView, Bitmap.CompressFormat compressFormat, int i10, int i11, int i12, RequestSizeOptions requestSizeOptions, Uri uri, int i13, Object obj) {
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
            requestSizeOptions = RequestSizeOptions.f5278e;
        }
        if ((i13 & 32) != 0) {
            uri = null;
        }
        cropImageView.m4481d(compressFormat, i10, i11, i12, requestSizeOptions, uri);
    }

    /* renamed from: i */
    public static /* synthetic */ Bitmap m4477i(CropImageView cropImageView, int i10, int i11, RequestSizeOptions requestSizeOptions, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            requestSizeOptions = RequestSizeOptions.f5278e;
        }
        return cropImageView.m4484h(i10, i11, requestSizeOptions);
    }

    @Override // com.canhub.cropper.CropOverlayView.InterfaceC5898b
    /* renamed from: a */
    public void mo4478a(boolean z10) {
        m4485j(z10, true);
    }

    /* renamed from: b */
    public final void m4479b(float f10, float f11, boolean z10, boolean z11) {
        if (this.f5245k != null) {
            if (f10 <= 0.0f || f11 <= 0.0f) {
                return;
            }
            this.f5239e.invert(this.f5240f);
            CropOverlayView cropOverlayView = this.f5238d;
            AbstractC9979u.m20291d(cropOverlayView);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            this.f5240f.mapRect(cropWindowRect);
            this.f5239e.reset();
            float f12 = 2;
            this.f5239e.postTranslate((f10 - r0.getWidth()) / f12, (f11 - r0.getHeight()) / f12);
            m4486k();
            int i10 = this.f5247m;
            if (i10 > 0) {
                C5903a c5903a = C5903a.f5362a;
                this.f5239e.postRotate(i10, c5903a.m4590w(this.f5242h), c5903a.m4591x(this.f5242h));
                m4486k();
            }
            C5903a c5903a2 = C5903a.f5362a;
            float fMin = Math.min(f10 / c5903a2.m4560D(this.f5242h), f11 / c5903a2.m4593z(this.f5242h));
            ScaleType scaleType = this.f5253s;
            if (scaleType == ScaleType.f5283c || ((scaleType == ScaleType.f5286f && fMin < 1.0f) || (fMin > 1.0f && this.f5222A))) {
                this.f5239e.postScale(fMin, fMin, c5903a2.m4590w(this.f5242h), c5903a2.m4591x(this.f5242h));
                m4486k();
            } else if (scaleType == ScaleType.f5285e) {
                this.f5228G = Math.max(getWidth() / c5903a2.m4560D(this.f5242h), getHeight() / c5903a2.m4593z(this.f5242h));
            }
            float f13 = this.f5248n ? -this.f5228G : this.f5228G;
            float f14 = this.f5249o ? -this.f5228G : this.f5228G;
            this.f5239e.postScale(f13, f14, c5903a2.m4590w(this.f5242h), c5903a2.m4591x(this.f5242h));
            m4486k();
            this.f5239e.mapRect(cropWindowRect);
            if (this.f5253s == ScaleType.f5285e && z10 && !z11) {
                this.f5229H = 0.0f;
                this.f5230I = 0.0f;
            } else if (z10) {
                this.f5229H = f10 > c5903a2.m4560D(this.f5242h) ? 0.0f : Math.max(Math.min((f10 / f12) - cropWindowRect.centerX(), -c5903a2.m4557A(this.f5242h)), getWidth() - c5903a2.m4558B(this.f5242h)) / f13;
                this.f5230I = f11 <= c5903a2.m4593z(this.f5242h) ? Math.max(Math.min((f11 / f12) - cropWindowRect.centerY(), -c5903a2.m4559C(this.f5242h)), getHeight() - c5903a2.m4589v(this.f5242h)) / f14 : 0.0f;
            } else {
                this.f5229H = Math.min(Math.max(this.f5229H * f13, -cropWindowRect.left), (-cropWindowRect.right) + f10) / f13;
                this.f5230I = Math.min(Math.max(this.f5230I * f14, -cropWindowRect.top), (-cropWindowRect.bottom) + f11) / f14;
            }
            this.f5239e.postTranslate(this.f5229H * f13, this.f5230I * f14);
            cropWindowRect.offset(this.f5229H * f13, this.f5230I * f14);
            this.f5238d.setCropWindowRect(cropWindowRect);
            m4486k();
            this.f5238d.invalidate();
            if (z11) {
                AnimationAnimationListenerC9155g animationAnimationListenerC9155g = this.f5244j;
                AbstractC9979u.m20291d(animationAnimationListenerC9155g);
                animationAnimationListenerC9155g.m18046b(this.f5242h, this.f5239e);
                this.f5237c.startAnimation(this.f5244j);
            } else {
                this.f5237c.setImageMatrix(this.f5239e);
            }
            m4495t(false);
        }
    }

    /* renamed from: c */
    public final void m4480c() {
        Bitmap bitmap = this.f5245k;
        if (bitmap != null && (this.f5252r > 0 || this.f5226E != null)) {
            AbstractC9979u.m20291d(bitmap);
            bitmap.recycle();
        }
        this.f5245k = null;
        this.f5252r = 0;
        this.f5226E = null;
        this.f5227F = 1;
        this.f5247m = 0;
        this.f5228G = 1.0f;
        this.f5229H = 0.0f;
        this.f5230I = 0.0f;
        this.f5239e.reset();
        this.f5231J = null;
        this.f5232K = 0;
        this.f5237c.setImageBitmap(null);
        m4492q();
    }

    /* renamed from: d */
    public final void m4481d(Bitmap.CompressFormat saveCompressFormat, int i10, int i11, int i12, RequestSizeOptions options, Uri uri) {
        AbstractC9979u.m20294g(saveCompressFormat, "saveCompressFormat");
        AbstractC9979u.m20294g(options, "options");
        if (this.f5225D == null) {
            throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        m4494s(i11, i12, options, saveCompressFormat, i10, uri);
    }

    /* renamed from: f */
    public final void m4482f() {
        this.f5248n = !this.f5248n;
        m4479b(getWidth(), getHeight(), true, false);
    }

    /* renamed from: g */
    public final void m4483g() {
        this.f5249o = !this.f5249o;
        m4479b(getWidth(), getHeight(), true, false);
    }

    public final Pair<Integer, Integer> getAspectRatio() {
        CropOverlayView cropOverlayView = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView);
        return new Pair<>(Integer.valueOf(cropOverlayView.getAspectRatioX()), Integer.valueOf(this.f5238d.getAspectRatioY()));
    }

    public final CropCornerShape getCornerShape() {
        CropOverlayView cropOverlayView = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView);
        return cropOverlayView.getCornerShape();
    }

    public final String getCropLabelText() {
        return this.f5257w;
    }

    public final int getCropLabelTextColor() {
        return this.f5259y;
    }

    public final float getCropLabelTextSize() {
        return this.f5258x;
    }

    public final float[] getCropPoints() {
        CropOverlayView cropOverlayView = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView);
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        float f10 = cropWindowRect.left;
        float f11 = cropWindowRect.top;
        float f12 = cropWindowRect.right;
        float f13 = cropWindowRect.bottom;
        float[] fArr = {f10, f11, f12, f11, f12, f13, f10, f13};
        this.f5239e.invert(this.f5240f);
        this.f5240f.mapPoints(fArr);
        float[] fArr2 = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            fArr2[i10] = fArr[i10] * this.f5227F;
        }
        return fArr2;
    }

    public final Rect getCropRect() {
        int i10 = this.f5227F;
        Bitmap bitmap = this.f5245k;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i10;
        int height = bitmap.getHeight() * i10;
        C5903a c5903a = C5903a.f5362a;
        CropOverlayView cropOverlayView = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView);
        return c5903a.m4592y(cropPoints, width, height, cropOverlayView.m4524o(), this.f5238d.getAspectRatioX(), this.f5238d.getAspectRatioY());
    }

    public final CropShape getCropShape() {
        CropOverlayView cropOverlayView = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView);
        return cropOverlayView.getCropShape();
    }

    public final RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.f5238d;
        if (cropOverlayView != null) {
            return cropOverlayView.getCropWindowRect();
        }
        return null;
    }

    public final Bitmap getCroppedImage() {
        return m4477i(this, 0, 0, null, 7, null);
    }

    public final Uri getCustomOutputUri() {
        return this.f5236O;
    }

    public final Guidelines getGuidelines() {
        CropOverlayView cropOverlayView = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView);
        return cropOverlayView.getGuidelines();
    }

    public final int getImageResource() {
        return this.f5252r;
    }

    public final Uri getImageUri() {
        return this.f5226E;
    }

    public final int getMaxZoom() {
        return this.f5223B;
    }

    public final int getRotatedDegrees() {
        return this.f5247m;
    }

    public final ScaleType getScaleType() {
        return this.f5253s;
    }

    public final Rect getWholeImageRect() {
        int i10 = this.f5227F;
        Bitmap bitmap = this.f5245k;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i10, bitmap.getHeight() * i10);
    }

    /* renamed from: h */
    public final Bitmap m4484h(int i10, int i11, RequestSizeOptions options) {
        int i12;
        Bitmap bitmapM4594a;
        AbstractC9979u.m20294g(options, "options");
        Bitmap bitmap = this.f5245k;
        if (bitmap == null) {
            return null;
        }
        RequestSizeOptions requestSizeOptions = RequestSizeOptions.f5276c;
        int i13 = options != requestSizeOptions ? i10 : 0;
        int i14 = options != requestSizeOptions ? i11 : 0;
        if (this.f5226E == null || (this.f5227F <= 1 && options != RequestSizeOptions.f5277d)) {
            i12 = i14;
            C5903a c5903a = C5903a.f5362a;
            float[] cropPoints = getCropPoints();
            int i15 = this.f5247m;
            CropOverlayView cropOverlayView = this.f5238d;
            AbstractC9979u.m20291d(cropOverlayView);
            bitmapM4594a = c5903a.m4574g(bitmap, cropPoints, i15, cropOverlayView.m4524o(), this.f5238d.getAspectRatioX(), this.f5238d.getAspectRatioY(), this.f5248n, this.f5249o).m4594a();
        } else {
            C5903a c5903a2 = C5903a.f5362a;
            Context context = getContext();
            AbstractC9979u.m20293f(context, "getContext(...)");
            Uri uri = this.f5226E;
            float[] cropPoints2 = getCropPoints();
            int i16 = this.f5247m;
            Bitmap bitmap2 = this.f5245k;
            AbstractC9979u.m20291d(bitmap2);
            int width = bitmap2.getWidth() * this.f5227F;
            Bitmap bitmap3 = this.f5245k;
            AbstractC9979u.m20291d(bitmap3);
            int height = bitmap3.getHeight() * this.f5227F;
            CropOverlayView cropOverlayView2 = this.f5238d;
            AbstractC9979u.m20291d(cropOverlayView2);
            i12 = i14;
            bitmapM4594a = c5903a2.m4571d(context, uri, cropPoints2, i16, width, height, cropOverlayView2.m4524o(), this.f5238d.getAspectRatioX(), this.f5238d.getAspectRatioY(), i13, i14, this.f5248n, this.f5249o).m4594a();
        }
        return C5903a.f5362a.m4563G(bitmapM4594a, i13, i12, options);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4485j(boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.m4485j(boolean, boolean):void");
    }

    /* renamed from: k */
    public final void m4486k() {
        float[] fArr = this.f5242h;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        AbstractC9979u.m20291d(this.f5245k);
        fArr[2] = r4.getWidth();
        float[] fArr2 = this.f5242h;
        fArr2[3] = 0.0f;
        AbstractC9979u.m20291d(this.f5245k);
        fArr2[4] = r6.getWidth();
        float[] fArr3 = this.f5242h;
        AbstractC9979u.m20291d(this.f5245k);
        fArr3[5] = r6.getHeight();
        float[] fArr4 = this.f5242h;
        fArr4[6] = 0.0f;
        AbstractC9979u.m20291d(this.f5245k);
        fArr4[7] = r9.getHeight();
        this.f5239e.mapPoints(this.f5242h);
        float[] fArr5 = this.f5243i;
        fArr5[0] = 0.0f;
        fArr5[1] = 0.0f;
        fArr5[2] = 100.0f;
        fArr5[3] = 0.0f;
        fArr5[4] = 100.0f;
        fArr5[5] = 100.0f;
        fArr5[6] = 0.0f;
        fArr5[7] = 100.0f;
        this.f5239e.mapPoints(fArr5);
    }

    /* renamed from: l */
    public final void m4487l(BitmapCroppingWorkerJob.C5876a result) {
        AbstractC9979u.m20294g(result, "result");
        this.f5235N = null;
        m4493r();
        InterfaceC5892c interfaceC5892c = this.f5225D;
        if (interfaceC5892c != null) {
            interfaceC5892c.mo4467q(this, new C5891b(this.f5245k, this.f5226E, result.m4419a(), result.m4422d(), result.m4420b(), getCropPoints(), getCropRect(), getWholeImageRect(), getRotatedDegrees(), result.m4421c()));
        }
    }

    /* renamed from: m */
    public final void m4488m(BitmapLoadingWorkerJob.C5878a result) {
        CropImageView cropImageView;
        AbstractC9979u.m20294g(result, "result");
        this.f5234M = null;
        m4493r();
        if (result.m4434c() == null) {
            this.f5246l = result.m4433b();
            this.f5248n = result.m4435d();
            this.f5249o = result.m4436e();
            cropImageView = this;
            cropImageView.m4491p(result.m4432a(), 0, result.m4438g(), result.m4437f(), result.m4433b());
        } else {
            cropImageView = this;
        }
        InterfaceC5896g interfaceC5896g = cropImageView.f5224C;
        if (interfaceC5896g != null) {
            interfaceC5896g.mo2667v(this, result.m4438g(), result.m4434c());
        }
    }

    /* renamed from: n */
    public final void m4489n(int i10) {
        if (this.f5245k != null) {
            int i11 = i10 < 0 ? (i10 % 360) + 360 : i10 % 360;
            CropOverlayView cropOverlayView = this.f5238d;
            AbstractC9979u.m20291d(cropOverlayView);
            boolean z10 = !cropOverlayView.m4524o() && ((46 <= i11 && i11 < 135) || (216 <= i11 && i11 < 305));
            C5903a c5903a = C5903a.f5362a;
            c5903a.m4588u().set(this.f5238d.getCropWindowRect());
            RectF rectFM4588u = c5903a.m4588u();
            float fHeight = (z10 ? rectFM4588u.height() : rectFM4588u.width()) / 2.0f;
            RectF rectFM4588u2 = c5903a.m4588u();
            float fWidth = (z10 ? rectFM4588u2.width() : rectFM4588u2.height()) / 2.0f;
            if (z10) {
                boolean z11 = this.f5248n;
                this.f5248n = this.f5249o;
                this.f5249o = z11;
            }
            this.f5239e.invert(this.f5240f);
            c5903a.m4586s()[0] = c5903a.m4588u().centerX();
            c5903a.m4586s()[1] = c5903a.m4588u().centerY();
            c5903a.m4586s()[2] = 0.0f;
            c5903a.m4586s()[3] = 0.0f;
            c5903a.m4586s()[4] = 1.0f;
            c5903a.m4586s()[5] = 0.0f;
            this.f5240f.mapPoints(c5903a.m4586s());
            this.f5247m = (this.f5247m + i11) % 360;
            m4479b(getWidth(), getHeight(), true, false);
            this.f5239e.mapPoints(c5903a.m4587t(), c5903a.m4586s());
            float fSqrt = this.f5228G / ((float) Math.sqrt(Math.pow(c5903a.m4587t()[4] - c5903a.m4587t()[2], 2.0d) + Math.pow(c5903a.m4587t()[5] - c5903a.m4587t()[3], 2.0d)));
            this.f5228G = fSqrt;
            this.f5228G = Math.max(fSqrt, 1.0f);
            m4479b(getWidth(), getHeight(), true, false);
            this.f5239e.mapPoints(c5903a.m4587t(), c5903a.m4586s());
            float fSqrt2 = (float) Math.sqrt(Math.pow(c5903a.m4587t()[4] - c5903a.m4587t()[2], 2.0d) + Math.pow(c5903a.m4587t()[5] - c5903a.m4587t()[3], 2.0d));
            float f10 = fHeight * fSqrt2;
            float f11 = fWidth * fSqrt2;
            c5903a.m4588u().set(c5903a.m4587t()[0] - f10, c5903a.m4587t()[1] - f11, c5903a.m4587t()[0] + f10, c5903a.m4587t()[1] + f11);
            this.f5238d.m4529t();
            this.f5238d.setCropWindowRect(c5903a.m4588u());
            m4479b(getWidth(), getHeight(), true, false);
            m4485j(false, false);
            this.f5238d.m4522m();
        }
    }

    /* renamed from: o */
    public final void m4490o(int i10, int i11) {
        CropOverlayView cropOverlayView = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView);
        cropOverlayView.setAspectRatioX(i10);
        this.f5238d.setAspectRatioY(i11);
        this.f5238d.setFixedAspectRatio(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f5250p <= 0 || this.f5251q <= 0) {
            m4495t(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f5250p;
        layoutParams.height = this.f5251q;
        setLayoutParams(layoutParams);
        if (this.f5245k == null) {
            m4495t(true);
            return;
        }
        float f10 = i12 - i10;
        float f11 = i13 - i11;
        m4479b(f10, f11, true, false);
        RectF rectF = this.f5231J;
        if (rectF == null) {
            if (this.f5233L) {
                this.f5233L = false;
                m4485j(false, false);
                return;
            }
            return;
        }
        int i14 = this.f5232K;
        if (i14 != this.f5246l) {
            this.f5247m = i14;
            m4479b(f10, f11, true, false);
            this.f5232K = 0;
        }
        this.f5239e.mapRect(this.f5231J);
        CropOverlayView cropOverlayView = this.f5238d;
        if (cropOverlayView != null) {
            cropOverlayView.setCropWindowRect(rectF);
        }
        m4485j(false, false);
        CropOverlayView cropOverlayView2 = this.f5238d;
        if (cropOverlayView2 != null) {
            cropOverlayView2.m4522m();
        }
        this.f5231J = null;
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
        Bitmap bitmap = this.f5245k;
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
        C5890a c5890a = f5221P;
        int iM4501a = c5890a.m4501a(mode, size, width);
        int iM4501a2 = c5890a.m4501a(mode2, size2, height);
        this.f5250p = iM4501a;
        this.f5251q = iM4501a2;
        setMeasuredDimension(iM4501a, iM4501a2);
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
        Uri uriM4567K;
        if (this.f5226E == null && this.f5245k == null && this.f5252r < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        if (this.f5254t && this.f5226E == null && this.f5252r < 1) {
            C5903a c5903a = C5903a.f5362a;
            Context context = getContext();
            AbstractC9979u.m20293f(context, "getContext(...)");
            uriM4567K = c5903a.m4567K(context, this.f5245k, this.f5236O);
        } else {
            uriM4567K = this.f5226E;
        }
        if (uriM4567K != null && this.f5245k != null) {
            String string = UUID.randomUUID().toString();
            AbstractC9979u.m20293f(string, "toString(...)");
            C5903a.f5362a.m4565I(new Pair(string, new WeakReference(this.f5245k)));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", string);
        }
        WeakReference weakReference = this.f5234M;
        BitmapLoadingWorkerJob bitmapLoadingWorkerJob = weakReference != null ? (BitmapLoadingWorkerJob) weakReference.get() : null;
        if (bitmapLoadingWorkerJob != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", bitmapLoadingWorkerJob.m4429g());
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uriM4567K);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.f5252r);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.f5227F);
        bundle.putInt("DEGREES_ROTATED", this.f5247m);
        CropOverlayView cropOverlayView = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView);
        bundle.putParcelable("INITIAL_CROP_RECT", cropOverlayView.getInitialCropWindowRect());
        C5903a c5903a2 = C5903a.f5362a;
        c5903a2.m4588u().set(this.f5238d.getCropWindowRect());
        this.f5239e.invert(this.f5240f);
        this.f5240f.mapRect(c5903a2.m4588u());
        bundle.putParcelable("CROP_WINDOW_RECT", c5903a2.m4588u());
        CropShape cropShape = this.f5238d.getCropShape();
        AbstractC9979u.m20291d(cropShape);
        bundle.putString("CROP_SHAPE", cropShape.name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.f5222A);
        bundle.putInt("CROP_MAX_ZOOM", this.f5223B);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.f5248n);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.f5249o);
        bundle.putBoolean("SHOW_CROP_LABEL", this.f5256v);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f5233L = i12 > 0 && i13 > 0;
    }

    /* renamed from: p */
    public final void m4491p(Bitmap bitmap, int i10, Uri uri, int i11, int i12) {
        Bitmap bitmap2 = this.f5245k;
        if (bitmap2 == null || !AbstractC9979u.m20289b(bitmap2, bitmap)) {
            m4480c();
            this.f5245k = bitmap;
            this.f5237c.setImageBitmap(bitmap);
            this.f5226E = uri;
            this.f5252r = i10;
            this.f5227F = i11;
            this.f5247m = i12;
            m4479b(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f5238d;
            if (cropOverlayView != null) {
                cropOverlayView.m4529t();
                m4492q();
            }
        }
    }

    /* renamed from: q */
    public final void m4492q() {
        CropOverlayView cropOverlayView = this.f5238d;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.f5255u || this.f5245k == null) ? 4 : 0);
        }
    }

    /* renamed from: r */
    public final void m4493r() {
        this.f5241g.setVisibility(this.f5260z && ((this.f5245k == null && this.f5234M != null) || this.f5235N != null) ? 0 : 4);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* renamed from: s */
    public final void m4494s(int r22, int r23, com.canhub.cropper.CropImageView.RequestSizeOptions r24, android.graphics.Bitmap.CompressFormat r25, int r26, android.net.Uri r27) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.m4494s(int, int, com.canhub.cropper.CropImageView$RequestSizeOptions, android.graphics.Bitmap$CompressFormat, int, android.net.Uri):void");
    }

    public final void setAutoZoomEnabled(boolean z10) {
        if (this.f5222A != z10) {
            this.f5222A = z10;
            m4485j(false, false);
            CropOverlayView cropOverlayView = this.f5238d;
            AbstractC9979u.m20291d(cropOverlayView);
            cropOverlayView.invalidate();
        }
    }

    public final void setCenterMoveEnabled(boolean z10) {
        CropOverlayView cropOverlayView = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView);
        if (cropOverlayView.m4531v(z10)) {
            m4485j(false, false);
            this.f5238d.invalidate();
        }
    }

    public final void setCornerShape(CropCornerShape cropCornerShape) {
        CropOverlayView cropOverlayView = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView);
        AbstractC9979u.m20291d(cropCornerShape);
        cropOverlayView.setCropCornerShape(cropCornerShape);
    }

    public final void setCropLabelText(String cropLabelText) {
        AbstractC9979u.m20294g(cropLabelText, "cropLabelText");
        this.f5257w = cropLabelText;
        CropOverlayView cropOverlayView = this.f5238d;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelText(cropLabelText);
        }
    }

    public final void setCropLabelTextColor(int i10) {
        this.f5259y = i10;
        CropOverlayView cropOverlayView = this.f5238d;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextColor(i10);
        }
    }

    public final void setCropLabelTextSize(float f10) {
        this.f5258x = getCropLabelTextSize();
        CropOverlayView cropOverlayView = this.f5238d;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextSize(f10);
        }
    }

    public final void setCropRect(Rect rect) {
        CropOverlayView cropOverlayView = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(rect);
    }

    public final void setCropShape(CropShape cropShape) {
        CropOverlayView cropOverlayView = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView);
        AbstractC9979u.m20291d(cropShape);
        cropOverlayView.setCropShape(cropShape);
    }

    public final void setCustomOutputUri(Uri uri) {
        this.f5236O = uri;
    }

    public final void setFixedAspectRatio(boolean z10) {
        CropOverlayView cropOverlayView = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView);
        cropOverlayView.setFixedAspectRatio(z10);
    }

    public final void setFlippedHorizontally(boolean z10) {
        if (this.f5248n != z10) {
            this.f5248n = z10;
            m4479b(getWidth(), getHeight(), true, false);
        }
    }

    public final void setFlippedVertically(boolean z10) {
        if (this.f5249o != z10) {
            this.f5249o = z10;
            m4479b(getWidth(), getHeight(), true, false);
        }
    }

    public final void setGuidelines(Guidelines guidelines) {
        CropOverlayView cropOverlayView = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView);
        AbstractC9979u.m20291d(guidelines);
        cropOverlayView.setGuidelines(guidelines);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        CropOverlayView cropOverlayView = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(null);
        m4491p(bitmap, 0, null, 1, 0);
    }

    public final void setImageCropOptions(CropImageOptions options) {
        AbstractC9979u.m20294g(options, "options");
        setScaleType(options.f5191k);
        this.f5236O = options.f5168R;
        CropOverlayView cropOverlayView = this.f5238d;
        if (cropOverlayView != null) {
            cropOverlayView.setInitialAttributeValues(options);
        }
        setMultiTouchEnabled(options.f5203q);
        setCenterMoveEnabled(options.f5205r);
        setShowCropOverlay(options.f5193l);
        setShowProgressBar(options.f5197n);
        setAutoZoomEnabled(options.f5201p);
        setMaxZoom(options.f5209t);
        setFlippedHorizontally(options.f5188i0);
        setFlippedVertically(options.f5190j0);
        this.f5222A = options.f5201p;
        this.f5255u = options.f5193l;
        this.f5260z = options.f5197n;
        this.f5241g.setIndeterminateTintList(ColorStateList.valueOf(options.f5199o));
    }

    public final void setImageResource(int i10) {
        if (i10 != 0) {
            CropOverlayView cropOverlayView = this.f5238d;
            AbstractC9979u.m20291d(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            m4491p(BitmapFactory.decodeResource(getResources(), i10), i10, null, 1, 0);
        }
    }

    public final void setImageUriAsync(Uri uri) {
        BitmapLoadingWorkerJob bitmapLoadingWorkerJob;
        if (uri != null) {
            WeakReference weakReference = this.f5234M;
            if (weakReference != null && (bitmapLoadingWorkerJob = (BitmapLoadingWorkerJob) weakReference.get()) != null) {
                bitmapLoadingWorkerJob.m4428f();
            }
            m4480c();
            CropOverlayView cropOverlayView = this.f5238d;
            AbstractC9979u.m20291d(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            Context context = getContext();
            AbstractC9979u.m20293f(context, "getContext(...)");
            WeakReference weakReference2 = new WeakReference(new BitmapLoadingWorkerJob(context, this, uri));
            this.f5234M = weakReference2;
            BitmapLoadingWorkerJob bitmapLoadingWorkerJob2 = (BitmapLoadingWorkerJob) weakReference2.get();
            if (bitmapLoadingWorkerJob2 != null) {
                bitmapLoadingWorkerJob2.m4431i();
            }
            m4493r();
        }
    }

    public final void setMaxZoom(int i10) {
        if (this.f5223B == i10 || i10 <= 0) {
            return;
        }
        this.f5223B = i10;
        m4485j(false, false);
        CropOverlayView cropOverlayView = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView);
        cropOverlayView.invalidate();
    }

    public final void setMultiTouchEnabled(boolean z10) {
        CropOverlayView cropOverlayView = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView);
        if (cropOverlayView.m4533x(z10)) {
            m4485j(false, false);
            this.f5238d.invalidate();
        }
    }

    public final void setOnCropImageCompleteListener(InterfaceC5892c interfaceC5892c) {
        this.f5225D = interfaceC5892c;
    }

    public final void setOnCropWindowChangedListener(InterfaceC5895f interfaceC5895f) {
    }

    public final void setOnSetCropOverlayMovedListener(InterfaceC5893d interfaceC5893d) {
    }

    public final void setOnSetCropOverlayReleasedListener(InterfaceC5894e interfaceC5894e) {
    }

    public final void setOnSetImageUriCompleteListener(InterfaceC5896g interfaceC5896g) {
        this.f5224C = interfaceC5896g;
    }

    public final void setRotatedDegrees(int i10) {
        int i11 = this.f5247m;
        if (i11 != i10) {
            m4489n(i10 - i11);
        }
    }

    public final void setSaveBitmapToInstanceState(boolean z10) {
        this.f5254t = z10;
    }

    public final void setScaleType(ScaleType scaleType) {
        AbstractC9979u.m20294g(scaleType, "scaleType");
        if (scaleType != this.f5253s) {
            this.f5253s = scaleType;
            this.f5228G = 1.0f;
            this.f5230I = 0.0f;
            this.f5229H = 0.0f;
            CropOverlayView cropOverlayView = this.f5238d;
            if (cropOverlayView != null) {
                cropOverlayView.m4529t();
            }
            requestLayout();
        }
    }

    public final void setShowCropLabel(boolean z10) {
        if (this.f5256v != z10) {
            this.f5256v = z10;
            CropOverlayView cropOverlayView = this.f5238d;
            if (cropOverlayView != null) {
                cropOverlayView.setCropperTextLabelVisibility(z10);
            }
        }
    }

    public final void setShowCropOverlay(boolean z10) {
        if (this.f5255u != z10) {
            this.f5255u = z10;
            m4492q();
        }
    }

    public final void setShowProgressBar(boolean z10) {
        if (this.f5260z != z10) {
            this.f5260z = z10;
            m4493r();
        }
    }

    public final void setSnapRadius(float f10) {
        if (f10 >= 0.0f) {
            CropOverlayView cropOverlayView = this.f5238d;
            AbstractC9979u.m20291d(cropOverlayView);
            cropOverlayView.setSnapRadius(f10);
        }
    }

    /* renamed from: t */
    public final void m4495t(boolean z10) {
        if (this.f5245k != null && !z10) {
            C5903a c5903a = C5903a.f5362a;
            float fM4560D = (this.f5227F * 100.0f) / c5903a.m4560D(this.f5243i);
            float fM4593z = (this.f5227F * 100.0f) / c5903a.m4593z(this.f5243i);
            CropOverlayView cropOverlayView = this.f5238d;
            AbstractC9979u.m20291d(cropOverlayView);
            cropOverlayView.m4532w(getWidth(), getHeight(), fM4560D, fM4593z);
        }
        CropOverlayView cropOverlayView2 = this.f5238d;
        AbstractC9979u.m20291d(cropOverlayView2);
        cropOverlayView2.m4530u(z10 ? null : this.f5242h, getWidth(), getHeight());
    }

    public /* synthetic */ CropImageView(Context context, AttributeSet attributeSet, int i10, AbstractC9972n abstractC9972n) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
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
}
