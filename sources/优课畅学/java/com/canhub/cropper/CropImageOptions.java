package com.canhub.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.canhub.cropper.CropImageView;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;

/* loaded from: classes3.dex */
public final class CropImageOptions implements Parcelable {
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new C5470a();

    /* renamed from: A */
    public float f3381A;

    /* renamed from: B */
    public int f3382B;

    /* renamed from: C */
    public int f3383C;

    /* renamed from: D */
    public float f3384D;

    /* renamed from: E */
    public int f3385E;

    /* renamed from: F */
    public int f3386F;

    /* renamed from: G */
    public int f3387G;

    /* renamed from: H */
    public int f3388H;

    /* renamed from: I */
    public int f3389I;

    /* renamed from: J */
    public int f3390J;

    /* renamed from: K */
    public int f3391K;

    /* renamed from: L */
    public int f3392L;

    /* renamed from: M */
    public CharSequence f3393M;

    /* renamed from: N */
    public int f3394N;

    /* renamed from: O */
    public Integer f3395O;

    /* renamed from: P */
    public Uri f3396P;

    /* renamed from: Q */
    public Bitmap.CompressFormat f3397Q;

    /* renamed from: R */
    public int f3398R;

    /* renamed from: S */
    public int f3399S;

    /* renamed from: T */
    public int f3400T;

    /* renamed from: U */
    public CropImageView.RequestSizeOptions f3401U;

    /* renamed from: V */
    public boolean f3402V;

    /* renamed from: W */
    public Rect f3403W;

    /* renamed from: X */
    public int f3404X;

    /* renamed from: Y */
    public boolean f3405Y;

    /* renamed from: Z */
    public boolean f3406Z;

    /* renamed from: a */
    public boolean f3407a;

    /* renamed from: b */
    public boolean f3408b;

    /* renamed from: c */
    public CropImageView.CropShape f3409c;

    /* renamed from: d */
    public CropImageView.CropCornerShape f3410d;

    /* renamed from: e */
    public float f3411e;

    /* renamed from: e0 */
    public boolean f3412e0;

    /* renamed from: f */
    public float f3413f;

    /* renamed from: f0 */
    public int f3414f0;

    /* renamed from: g */
    public float f3415g;

    /* renamed from: g0 */
    public boolean f3416g0;

    /* renamed from: h */
    public CropImageView.Guidelines f3417h;

    /* renamed from: h0 */
    public boolean f3418h0;

    /* renamed from: i */
    public CropImageView.ScaleType f3419i;

    /* renamed from: i0 */
    public CharSequence f3420i0;

    /* renamed from: j */
    public boolean f3421j;

    /* renamed from: j0 */
    public int f3422j0;

    /* renamed from: k */
    public boolean f3423k;

    /* renamed from: k0 */
    public boolean f3424k0;

    /* renamed from: l */
    public boolean f3425l;

    /* renamed from: l0 */
    public boolean f3426l0;

    /* renamed from: m */
    public int f3427m;

    /* renamed from: m0 */
    public String f3428m0;

    /* renamed from: n */
    public boolean f3429n;

    /* renamed from: n0 */
    public List f3430n0;

    /* renamed from: o */
    public boolean f3431o;

    /* renamed from: o0 */
    public float f3432o0;

    /* renamed from: p */
    public boolean f3433p;

    /* renamed from: p0 */
    public int f3434p0;

    /* renamed from: q */
    public boolean f3435q;

    /* renamed from: q0 */
    public String f3436q0;

    /* renamed from: r */
    public int f3437r;

    /* renamed from: r0 */
    public int f3438r0;

    /* renamed from: s */
    public float f3439s;

    /* renamed from: s0 */
    public Integer f3440s0;

    /* renamed from: t */
    public boolean f3441t;

    /* renamed from: t0 */
    public Integer f3442t0;

    /* renamed from: u */
    public int f3443u;

    /* renamed from: u0 */
    public Integer f3444u0;

    /* renamed from: v */
    public int f3445v;

    /* renamed from: v0 */
    public Integer f3446v0;

    /* renamed from: w */
    public float f3447w;

    /* renamed from: x */
    public int f3448x;

    /* renamed from: y */
    public float f3449y;

    /* renamed from: z */
    public float f3450z;

    /* renamed from: com.canhub.cropper.CropImageOptions$a */
    public static final class C5470a implements Parcelable.Creator {
        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.canhub.cropper.CropImageOptions createFromParcel(android.os.Parcel r74) {
            /*
                Method dump skipped, instructions count: 670
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageOptions.C5470a.createFromParcel(android.os.Parcel):com.canhub.cropper.CropImageOptions");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CropImageOptions[] newArray(int i10) {
            return new CropImageOptions[i10];
        }
    }

    public CropImageOptions(boolean z10, boolean z11, CropImageView.CropShape cropShape, CropImageView.CropCornerShape cornerShape, float f10, float f11, float f12, CropImageView.Guidelines guidelines, CropImageView.ScaleType scaleType, boolean z12, boolean z13, boolean z14, int i10, boolean z15, boolean z16, boolean z17, boolean z18, int i11, float f13, boolean z19, int i12, int i13, float f14, int i14, float f15, float f16, float f17, int i15, int i16, float f18, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, CharSequence activityTitle, int i25, Integer num, Uri uri, Bitmap.CompressFormat outputCompressFormat, int i26, int i27, int i28, CropImageView.RequestSizeOptions outputRequestSizeOptions, boolean z20, Rect rect, int i29, boolean z21, boolean z22, boolean z23, int i30, boolean z24, boolean z25, CharSequence charSequence, int i31, boolean z26, boolean z27, String str, List list, float f19, int i32, String str2, int i33, Integer num2, Integer num3, Integer num4, Integer num5) {
        AbstractC9133u.m16133g(cropShape, "cropShape");
        AbstractC9133u.m16133g(cornerShape, "cornerShape");
        AbstractC9133u.m16133g(guidelines, "guidelines");
        AbstractC9133u.m16133g(scaleType, "scaleType");
        AbstractC9133u.m16133g(activityTitle, "activityTitle");
        AbstractC9133u.m16133g(outputCompressFormat, "outputCompressFormat");
        AbstractC9133u.m16133g(outputRequestSizeOptions, "outputRequestSizeOptions");
        this.f3407a = z10;
        this.f3408b = z11;
        this.f3409c = cropShape;
        this.f3410d = cornerShape;
        this.f3411e = f10;
        this.f3413f = f11;
        this.f3415g = f12;
        this.f3417h = guidelines;
        this.f3419i = scaleType;
        this.f3421j = z12;
        this.f3423k = z13;
        this.f3425l = z14;
        this.f3427m = i10;
        this.f3429n = z15;
        this.f3431o = z16;
        this.f3433p = z17;
        this.f3435q = z18;
        this.f3437r = i11;
        this.f3439s = f13;
        this.f3441t = z19;
        this.f3443u = i12;
        this.f3445v = i13;
        this.f3447w = f14;
        this.f3448x = i14;
        this.f3449y = f15;
        this.f3450z = f16;
        this.f3381A = f17;
        this.f3382B = i15;
        this.f3383C = i16;
        this.f3384D = f18;
        this.f3385E = i17;
        this.f3386F = i18;
        this.f3387G = i19;
        this.f3388H = i20;
        this.f3389I = i21;
        this.f3390J = i22;
        this.f3391K = i23;
        this.f3392L = i24;
        this.f3393M = activityTitle;
        this.f3394N = i25;
        this.f3395O = num;
        this.f3396P = uri;
        this.f3397Q = outputCompressFormat;
        this.f3398R = i26;
        this.f3399S = i27;
        this.f3400T = i28;
        this.f3401U = outputRequestSizeOptions;
        this.f3402V = z20;
        this.f3403W = rect;
        this.f3404X = i29;
        this.f3405Y = z21;
        this.f3406Z = z22;
        this.f3412e0 = z23;
        this.f3414f0 = i30;
        this.f3416g0 = z24;
        this.f3418h0 = z25;
        this.f3420i0 = charSequence;
        this.f3422j0 = i31;
        this.f3424k0 = z26;
        this.f3426l0 = z27;
        this.f3428m0 = str;
        this.f3430n0 = list;
        this.f3432o0 = f19;
        this.f3434p0 = i32;
        this.f3436q0 = str2;
        this.f3438r0 = i33;
        this.f3440s0 = num2;
        this.f3442t0 = num3;
        this.f3444u0 = num4;
        this.f3446v0 = num5;
        if (i11 < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        }
        if (f12 < 0.0f) {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
        if (f13 < 0.0f || f13 >= 0.5d) {
            throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
        }
        if (i12 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (i13 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (f14 < 0.0f) {
            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
        }
        if (f15 < 0.0f) {
            throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
        }
        if (f18 < 0.0f) {
            throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
        }
        if (i20 < 0) {
            throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
        }
        if (i21 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
        }
        if (i22 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
        }
        if (i23 < i21) {
            throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
        }
        if (i24 < i22) {
            throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
        }
        if (i27 < 0) {
            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
        }
        if (i28 < 0) {
            throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
        }
        if (i30 < 0 || i30 > 360) {
            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CropImageOptions)) {
            return false;
        }
        CropImageOptions cropImageOptions = (CropImageOptions) obj;
        return this.f3407a == cropImageOptions.f3407a && this.f3408b == cropImageOptions.f3408b && this.f3409c == cropImageOptions.f3409c && this.f3410d == cropImageOptions.f3410d && Float.compare(this.f3411e, cropImageOptions.f3411e) == 0 && Float.compare(this.f3413f, cropImageOptions.f3413f) == 0 && Float.compare(this.f3415g, cropImageOptions.f3415g) == 0 && this.f3417h == cropImageOptions.f3417h && this.f3419i == cropImageOptions.f3419i && this.f3421j == cropImageOptions.f3421j && this.f3423k == cropImageOptions.f3423k && this.f3425l == cropImageOptions.f3425l && this.f3427m == cropImageOptions.f3427m && this.f3429n == cropImageOptions.f3429n && this.f3431o == cropImageOptions.f3431o && this.f3433p == cropImageOptions.f3433p && this.f3435q == cropImageOptions.f3435q && this.f3437r == cropImageOptions.f3437r && Float.compare(this.f3439s, cropImageOptions.f3439s) == 0 && this.f3441t == cropImageOptions.f3441t && this.f3443u == cropImageOptions.f3443u && this.f3445v == cropImageOptions.f3445v && Float.compare(this.f3447w, cropImageOptions.f3447w) == 0 && this.f3448x == cropImageOptions.f3448x && Float.compare(this.f3449y, cropImageOptions.f3449y) == 0 && Float.compare(this.f3450z, cropImageOptions.f3450z) == 0 && Float.compare(this.f3381A, cropImageOptions.f3381A) == 0 && this.f3382B == cropImageOptions.f3382B && this.f3383C == cropImageOptions.f3383C && Float.compare(this.f3384D, cropImageOptions.f3384D) == 0 && this.f3385E == cropImageOptions.f3385E && this.f3386F == cropImageOptions.f3386F && this.f3387G == cropImageOptions.f3387G && this.f3388H == cropImageOptions.f3388H && this.f3389I == cropImageOptions.f3389I && this.f3390J == cropImageOptions.f3390J && this.f3391K == cropImageOptions.f3391K && this.f3392L == cropImageOptions.f3392L && AbstractC9133u.m16128b(this.f3393M, cropImageOptions.f3393M) && this.f3394N == cropImageOptions.f3394N && AbstractC9133u.m16128b(this.f3395O, cropImageOptions.f3395O) && AbstractC9133u.m16128b(this.f3396P, cropImageOptions.f3396P) && this.f3397Q == cropImageOptions.f3397Q && this.f3398R == cropImageOptions.f3398R && this.f3399S == cropImageOptions.f3399S && this.f3400T == cropImageOptions.f3400T && this.f3401U == cropImageOptions.f3401U && this.f3402V == cropImageOptions.f3402V && AbstractC9133u.m16128b(this.f3403W, cropImageOptions.f3403W) && this.f3404X == cropImageOptions.f3404X && this.f3405Y == cropImageOptions.f3405Y && this.f3406Z == cropImageOptions.f3406Z && this.f3412e0 == cropImageOptions.f3412e0 && this.f3414f0 == cropImageOptions.f3414f0 && this.f3416g0 == cropImageOptions.f3416g0 && this.f3418h0 == cropImageOptions.f3418h0 && AbstractC9133u.m16128b(this.f3420i0, cropImageOptions.f3420i0) && this.f3422j0 == cropImageOptions.f3422j0 && this.f3424k0 == cropImageOptions.f3424k0 && this.f3426l0 == cropImageOptions.f3426l0 && AbstractC9133u.m16128b(this.f3428m0, cropImageOptions.f3428m0) && AbstractC9133u.m16128b(this.f3430n0, cropImageOptions.f3430n0) && Float.compare(this.f3432o0, cropImageOptions.f3432o0) == 0 && this.f3434p0 == cropImageOptions.f3434p0 && AbstractC9133u.m16128b(this.f3436q0, cropImageOptions.f3436q0) && this.f3438r0 == cropImageOptions.f3438r0 && AbstractC9133u.m16128b(this.f3440s0, cropImageOptions.f3440s0) && AbstractC9133u.m16128b(this.f3442t0, cropImageOptions.f3442t0) && AbstractC9133u.m16128b(this.f3444u0, cropImageOptions.f3444u0) && AbstractC9133u.m16128b(this.f3446v0, cropImageOptions.f3446v0);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Boolean.hashCode(this.f3407a) * 31) + Boolean.hashCode(this.f3408b)) * 31) + this.f3409c.hashCode()) * 31) + this.f3410d.hashCode()) * 31) + Float.hashCode(this.f3411e)) * 31) + Float.hashCode(this.f3413f)) * 31) + Float.hashCode(this.f3415g)) * 31) + this.f3417h.hashCode()) * 31) + this.f3419i.hashCode()) * 31) + Boolean.hashCode(this.f3421j)) * 31) + Boolean.hashCode(this.f3423k)) * 31) + Boolean.hashCode(this.f3425l)) * 31) + Integer.hashCode(this.f3427m)) * 31) + Boolean.hashCode(this.f3429n)) * 31) + Boolean.hashCode(this.f3431o)) * 31) + Boolean.hashCode(this.f3433p)) * 31) + Boolean.hashCode(this.f3435q)) * 31) + Integer.hashCode(this.f3437r)) * 31) + Float.hashCode(this.f3439s)) * 31) + Boolean.hashCode(this.f3441t)) * 31) + Integer.hashCode(this.f3443u)) * 31) + Integer.hashCode(this.f3445v)) * 31) + Float.hashCode(this.f3447w)) * 31) + Integer.hashCode(this.f3448x)) * 31) + Float.hashCode(this.f3449y)) * 31) + Float.hashCode(this.f3450z)) * 31) + Float.hashCode(this.f3381A)) * 31) + Integer.hashCode(this.f3382B)) * 31) + Integer.hashCode(this.f3383C)) * 31) + Float.hashCode(this.f3384D)) * 31) + Integer.hashCode(this.f3385E)) * 31) + Integer.hashCode(this.f3386F)) * 31) + Integer.hashCode(this.f3387G)) * 31) + Integer.hashCode(this.f3388H)) * 31) + Integer.hashCode(this.f3389I)) * 31) + Integer.hashCode(this.f3390J)) * 31) + Integer.hashCode(this.f3391K)) * 31) + Integer.hashCode(this.f3392L)) * 31) + this.f3393M.hashCode()) * 31) + Integer.hashCode(this.f3394N)) * 31;
        Integer num = this.f3395O;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Uri uri = this.f3396P;
        int iHashCode3 = (((((((((((((iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31) + this.f3397Q.hashCode()) * 31) + Integer.hashCode(this.f3398R)) * 31) + Integer.hashCode(this.f3399S)) * 31) + Integer.hashCode(this.f3400T)) * 31) + this.f3401U.hashCode()) * 31) + Boolean.hashCode(this.f3402V)) * 31;
        Rect rect = this.f3403W;
        int iHashCode4 = (((((((((((((((iHashCode3 + (rect == null ? 0 : rect.hashCode())) * 31) + Integer.hashCode(this.f3404X)) * 31) + Boolean.hashCode(this.f3405Y)) * 31) + Boolean.hashCode(this.f3406Z)) * 31) + Boolean.hashCode(this.f3412e0)) * 31) + Integer.hashCode(this.f3414f0)) * 31) + Boolean.hashCode(this.f3416g0)) * 31) + Boolean.hashCode(this.f3418h0)) * 31;
        CharSequence charSequence = this.f3420i0;
        int iHashCode5 = (((((((iHashCode4 + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + Integer.hashCode(this.f3422j0)) * 31) + Boolean.hashCode(this.f3424k0)) * 31) + Boolean.hashCode(this.f3426l0)) * 31;
        String str = this.f3428m0;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f3430n0;
        int iHashCode7 = (((((iHashCode6 + (list == null ? 0 : list.hashCode())) * 31) + Float.hashCode(this.f3432o0)) * 31) + Integer.hashCode(this.f3434p0)) * 31;
        String str2 = this.f3436q0;
        int iHashCode8 = (((iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.f3438r0)) * 31;
        Integer num2 = this.f3440s0;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f3442t0;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f3444u0;
        int iHashCode11 = (iHashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f3446v0;
        return iHashCode11 + (num5 != null ? num5.hashCode() : 0);
    }

    public String toString() {
        boolean z10 = this.f3407a;
        boolean z11 = this.f3408b;
        CropImageView.CropShape cropShape = this.f3409c;
        CropImageView.CropCornerShape cropCornerShape = this.f3410d;
        float f10 = this.f3411e;
        float f11 = this.f3413f;
        float f12 = this.f3415g;
        CropImageView.Guidelines guidelines = this.f3417h;
        CropImageView.ScaleType scaleType = this.f3419i;
        boolean z12 = this.f3421j;
        boolean z13 = this.f3423k;
        boolean z14 = this.f3425l;
        int i10 = this.f3427m;
        boolean z15 = this.f3429n;
        boolean z16 = this.f3431o;
        boolean z17 = this.f3433p;
        boolean z18 = this.f3435q;
        int i11 = this.f3437r;
        float f13 = this.f3439s;
        boolean z19 = this.f3441t;
        int i12 = this.f3443u;
        int i13 = this.f3445v;
        float f14 = this.f3447w;
        int i14 = this.f3448x;
        float f15 = this.f3449y;
        float f16 = this.f3450z;
        float f17 = this.f3381A;
        int i15 = this.f3382B;
        int i16 = this.f3383C;
        float f18 = this.f3384D;
        int i17 = this.f3385E;
        int i18 = this.f3386F;
        int i19 = this.f3387G;
        int i20 = this.f3388H;
        int i21 = this.f3389I;
        int i22 = this.f3390J;
        int i23 = this.f3391K;
        int i24 = this.f3392L;
        CharSequence charSequence = this.f3393M;
        int i25 = this.f3394N;
        Integer num = this.f3395O;
        Uri uri = this.f3396P;
        Bitmap.CompressFormat compressFormat = this.f3397Q;
        int i26 = this.f3398R;
        int i27 = this.f3399S;
        int i28 = this.f3400T;
        CropImageView.RequestSizeOptions requestSizeOptions = this.f3401U;
        boolean z20 = this.f3402V;
        Rect rect = this.f3403W;
        int i29 = this.f3404X;
        boolean z21 = this.f3405Y;
        boolean z22 = this.f3406Z;
        boolean z23 = this.f3412e0;
        int i30 = this.f3414f0;
        boolean z24 = this.f3416g0;
        boolean z25 = this.f3418h0;
        CharSequence charSequence2 = this.f3420i0;
        return "CropImageOptions(imageSourceIncludeGallery=" + z10 + ", imageSourceIncludeCamera=" + z11 + ", cropShape=" + cropShape + ", cornerShape=" + cropCornerShape + ", cropCornerRadius=" + f10 + ", snapRadius=" + f11 + ", touchRadius=" + f12 + ", guidelines=" + guidelines + ", scaleType=" + scaleType + ", showCropOverlay=" + z12 + ", showCropLabel=" + z13 + ", showProgressBar=" + z14 + ", progressBarColor=" + i10 + ", autoZoomEnabled=" + z15 + ", multiTouchEnabled=" + z16 + ", centerMoveEnabled=" + z17 + ", canChangeCropWindow=" + z18 + ", maxZoom=" + i11 + ", initialCropWindowPaddingRatio=" + f13 + ", fixAspectRatio=" + z19 + ", aspectRatioX=" + i12 + ", aspectRatioY=" + i13 + ", borderLineThickness=" + f14 + ", borderLineColor=" + i14 + ", borderCornerThickness=" + f15 + ", borderCornerOffset=" + f16 + ", borderCornerLength=" + f17 + ", borderCornerColor=" + i15 + ", circleCornerFillColorHexValue=" + i16 + ", guidelinesThickness=" + f18 + ", guidelinesColor=" + i17 + ", backgroundColor=" + i18 + ", minCropWindowWidth=" + i19 + ", minCropWindowHeight=" + i20 + ", minCropResultWidth=" + i21 + ", minCropResultHeight=" + i22 + ", maxCropResultWidth=" + i23 + ", maxCropResultHeight=" + i24 + ", activityTitle=" + ((Object) charSequence) + ", activityMenuIconColor=" + i25 + ", activityMenuTextColor=" + num + ", customOutputUri=" + uri + ", outputCompressFormat=" + compressFormat + ", outputCompressQuality=" + i26 + ", outputRequestWidth=" + i27 + ", outputRequestHeight=" + i28 + ", outputRequestSizeOptions=" + requestSizeOptions + ", noOutputImage=" + z20 + ", initialCropWindowRectangle=" + rect + ", initialRotation=" + i29 + ", allowRotation=" + z21 + ", allowFlipping=" + z22 + ", allowCounterRotation=" + z23 + ", rotationDegrees=" + i30 + ", flipHorizontally=" + z24 + ", flipVertically=" + z25 + ", cropMenuCropButtonTitle=" + ((Object) charSequence2) + ", cropMenuCropButtonIcon=" + this.f3422j0 + ", skipEditing=" + this.f3424k0 + ", showIntentChooser=" + this.f3426l0 + ", intentChooserTitle=" + this.f3428m0 + ", intentChooserPriorityList=" + this.f3430n0 + ", cropperLabelTextSize=" + this.f3432o0 + ", cropperLabelTextColor=" + this.f3434p0 + ", cropperLabelText=" + this.f3436q0 + ", activityBackgroundColor=" + this.f3438r0 + ", toolbarColor=" + this.f3440s0 + ", toolbarTitleColor=" + this.f3442t0 + ", toolbarBackButtonColor=" + this.f3444u0 + ", toolbarTintColor=" + this.f3446v0 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeInt(this.f3407a ? 1 : 0);
        dest.writeInt(this.f3408b ? 1 : 0);
        dest.writeString(this.f3409c.name());
        dest.writeString(this.f3410d.name());
        dest.writeFloat(this.f3411e);
        dest.writeFloat(this.f3413f);
        dest.writeFloat(this.f3415g);
        dest.writeString(this.f3417h.name());
        dest.writeString(this.f3419i.name());
        dest.writeInt(this.f3421j ? 1 : 0);
        dest.writeInt(this.f3423k ? 1 : 0);
        dest.writeInt(this.f3425l ? 1 : 0);
        dest.writeInt(this.f3427m);
        dest.writeInt(this.f3429n ? 1 : 0);
        dest.writeInt(this.f3431o ? 1 : 0);
        dest.writeInt(this.f3433p ? 1 : 0);
        dest.writeInt(this.f3435q ? 1 : 0);
        dest.writeInt(this.f3437r);
        dest.writeFloat(this.f3439s);
        dest.writeInt(this.f3441t ? 1 : 0);
        dest.writeInt(this.f3443u);
        dest.writeInt(this.f3445v);
        dest.writeFloat(this.f3447w);
        dest.writeInt(this.f3448x);
        dest.writeFloat(this.f3449y);
        dest.writeFloat(this.f3450z);
        dest.writeFloat(this.f3381A);
        dest.writeInt(this.f3382B);
        dest.writeInt(this.f3383C);
        dest.writeFloat(this.f3384D);
        dest.writeInt(this.f3385E);
        dest.writeInt(this.f3386F);
        dest.writeInt(this.f3387G);
        dest.writeInt(this.f3388H);
        dest.writeInt(this.f3389I);
        dest.writeInt(this.f3390J);
        dest.writeInt(this.f3391K);
        dest.writeInt(this.f3392L);
        TextUtils.writeToParcel(this.f3393M, dest, i10);
        dest.writeInt(this.f3394N);
        Integer num = this.f3395O;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeParcelable(this.f3396P, i10);
        dest.writeString(this.f3397Q.name());
        dest.writeInt(this.f3398R);
        dest.writeInt(this.f3399S);
        dest.writeInt(this.f3400T);
        dest.writeString(this.f3401U.name());
        dest.writeInt(this.f3402V ? 1 : 0);
        dest.writeParcelable(this.f3403W, i10);
        dest.writeInt(this.f3404X);
        dest.writeInt(this.f3405Y ? 1 : 0);
        dest.writeInt(this.f3406Z ? 1 : 0);
        dest.writeInt(this.f3412e0 ? 1 : 0);
        dest.writeInt(this.f3414f0);
        dest.writeInt(this.f3416g0 ? 1 : 0);
        dest.writeInt(this.f3418h0 ? 1 : 0);
        TextUtils.writeToParcel(this.f3420i0, dest, i10);
        dest.writeInt(this.f3422j0);
        dest.writeInt(this.f3424k0 ? 1 : 0);
        dest.writeInt(this.f3426l0 ? 1 : 0);
        dest.writeString(this.f3428m0);
        dest.writeStringList(this.f3430n0);
        dest.writeFloat(this.f3432o0);
        dest.writeInt(this.f3434p0);
        dest.writeString(this.f3436q0);
        dest.writeInt(this.f3438r0);
        Integer num2 = this.f3440s0;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.f3442t0;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Integer num4 = this.f3444u0;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        Integer num5 = this.f3446v0;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num5.intValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CropImageOptions(boolean z10, boolean z11, CropImageView.CropShape cropShape, CropImageView.CropCornerShape cropCornerShape, float f10, float f11, float f12, CropImageView.Guidelines guidelines, CropImageView.ScaleType scaleType, boolean z12, boolean z13, boolean z14, int i10, boolean z15, boolean z16, boolean z17, boolean z18, int i11, float f13, boolean z19, int i12, int i13, float f14, int i14, float f15, float f16, float f17, int i15, int i16, float f18, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, CharSequence charSequence, int i25, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i26, int i27, int i28, CropImageView.RequestSizeOptions requestSizeOptions, boolean z20, Rect rect, int i29, boolean z21, boolean z22, boolean z23, int i30, boolean z24, boolean z25, CharSequence charSequence2, int i31, boolean z26, boolean z27, String str, List list, float f19, int i32, String str2, int i33, Integer num2, Integer num3, Integer num4, Integer num5, int i34, int i35, int i36, AbstractC9126n abstractC9126n) {
        boolean z28;
        int i37;
        float fApplyDimension;
        float f20;
        int i38;
        int i39;
        float fApplyDimension2;
        float f21;
        float fApplyDimension3;
        float f22;
        float fApplyDimension4;
        float f23;
        int i40;
        float fApplyDimension5;
        float f24;
        int iArgb;
        int i41;
        int i42;
        int i43;
        int iApplyDimension;
        int i44;
        int iApplyDimension2;
        CropImageView.RequestSizeOptions requestSizeOptions2;
        int i45;
        float fApplyDimension6;
        boolean z29 = (i34 & 1) != 0 ? true : z10;
        boolean z30 = (i34 & 2) != 0 ? true : z11;
        CropImageView.CropShape cropShape2 = (i34 & 4) != 0 ? CropImageView.CropShape.f3495a : cropShape;
        CropImageView.CropCornerShape cropCornerShape2 = (i34 & 8) != 0 ? CropImageView.CropCornerShape.f3491a : cropCornerShape;
        float fApplyDimension7 = (i34 & 16) != 0 ? TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics()) : f10;
        float fApplyDimension8 = (i34 & 32) != 0 ? TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics()) : f11;
        float fApplyDimension9 = (i34 & 64) != 0 ? TypedValue.applyDimension(1, 24.0f, Resources.getSystem().getDisplayMetrics()) : f12;
        CropImageView.Guidelines guidelines2 = (i34 & 128) != 0 ? CropImageView.Guidelines.f3503c : guidelines;
        CropImageView.ScaleType scaleType2 = (i34 & 256) != 0 ? CropImageView.ScaleType.f3513a : scaleType;
        boolean z31 = (i34 & 512) != 0 ? true : z12;
        boolean z32 = (i34 & 1024) != 0 ? false : z13;
        boolean z33 = (i34 & 2048) != 0 ? true : z14;
        int iRgb = (i34 & 4096) != 0 ? Color.rgb(153, 51, 153) : i10;
        boolean z34 = (i34 & 8192) != 0 ? true : z15;
        boolean z35 = z29;
        boolean z36 = (i34 & 16384) != 0 ? false : z16;
        boolean z37 = (i34 & 32768) != 0 ? true : z17;
        boolean z38 = (i34 & 65536) != 0 ? true : z18;
        int i46 = (i34 & 131072) != 0 ? 4 : i11;
        float f25 = (i34 & 262144) != 0 ? 0.0f : f13;
        boolean z39 = (i34 & 524288) != 0 ? false : z19;
        int i47 = (i34 & 1048576) != 0 ? 1 : i12;
        int i48 = (i34 & 2097152) != 0 ? 1 : i13;
        if ((i34 & 4194304) != 0) {
            z28 = z36;
            i37 = iRgb;
            fApplyDimension = TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            z28 = z36;
            i37 = iRgb;
            fApplyDimension = f14;
        }
        int iArgb2 = (i34 & 8388608) != 0 ? Color.argb(170, 255, 255, 255) : i14;
        if ((i34 & 16777216) != 0) {
            f20 = fApplyDimension;
            i38 = iArgb2;
            i39 = 1;
            fApplyDimension2 = TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            f20 = fApplyDimension;
            i38 = iArgb2;
            i39 = 1;
            fApplyDimension2 = f15;
        }
        if ((i34 & 33554432) != 0) {
            f21 = fApplyDimension2;
            fApplyDimension3 = TypedValue.applyDimension(i39, 5.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            f21 = fApplyDimension2;
            fApplyDimension3 = f16;
        }
        if ((i34 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            f22 = fApplyDimension3;
            fApplyDimension4 = TypedValue.applyDimension(i39, 14.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            f22 = fApplyDimension3;
            fApplyDimension4 = f17;
        }
        int i49 = (i34 & 134217728) != 0 ? -1 : i15;
        int i50 = (i34 & 268435456) != 0 ? -1 : i16;
        if ((i34 & 536870912) != 0) {
            f23 = fApplyDimension4;
            i40 = i49;
            fApplyDimension5 = TypedValue.applyDimension(1, 1.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            f23 = fApplyDimension4;
            i40 = i49;
            fApplyDimension5 = f18;
        }
        int iArgb3 = (i34 & BasicMeasure.EXACTLY) != 0 ? Color.argb(170, 255, 255, 255) : i17;
        if ((i34 & Integer.MIN_VALUE) != 0) {
            f24 = fApplyDimension5;
            iArgb = Color.argb(119, 0, 0, 0);
        } else {
            f24 = fApplyDimension5;
            iArgb = i18;
        }
        if ((i35 & 1) != 0) {
            i41 = iArgb3;
            i42 = iArgb;
            i43 = 1;
            iApplyDimension = (int) TypedValue.applyDimension(1, 42.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            i41 = iArgb3;
            i42 = iArgb;
            i43 = 1;
            iApplyDimension = i19;
        }
        if ((i35 & 2) != 0) {
            i44 = iApplyDimension;
            iApplyDimension2 = (int) TypedValue.applyDimension(i43, 42.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            i44 = iApplyDimension;
            iApplyDimension2 = i20;
        }
        int i51 = (i35 & 4) != 0 ? 40 : i21;
        int i52 = (i35 & 8) != 0 ? 40 : i22;
        int i53 = (i35 & 16) != 0 ? 99999 : i23;
        int i54 = (i35 & 32) != 0 ? 99999 : i24;
        CharSequence charSequence3 = (i35 & 64) != 0 ? "" : charSequence;
        int i55 = (i35 & 128) != 0 ? 0 : i25;
        int i56 = iApplyDimension2;
        Integer num6 = (i35 & 256) != 0 ? null : num;
        Uri uri2 = (i35 & 512) != 0 ? null : uri;
        Bitmap.CompressFormat compressFormat2 = (i35 & 1024) != 0 ? Bitmap.CompressFormat.JPEG : compressFormat;
        int i57 = (i35 & 2048) != 0 ? 90 : i26;
        int i58 = (i35 & 4096) != 0 ? 0 : i27;
        int i59 = (i35 & 8192) != 0 ? 0 : i28;
        CropImageView.RequestSizeOptions requestSizeOptions3 = (i35 & 16384) != 0 ? CropImageView.RequestSizeOptions.f3506a : requestSizeOptions;
        boolean z40 = (i35 & 32768) != 0 ? false : z20;
        Rect rect2 = (i35 & 65536) != 0 ? null : rect;
        int i60 = (i35 & 131072) != 0 ? -1 : i29;
        boolean z41 = (i35 & 262144) != 0 ? true : z21;
        boolean z42 = (i35 & 524288) != 0 ? true : z22;
        boolean z43 = (i35 & 1048576) != 0 ? false : z23;
        int i61 = (i35 & 2097152) != 0 ? 90 : i30;
        boolean z44 = (i35 & 4194304) != 0 ? false : z24;
        boolean z45 = (i35 & 8388608) != 0 ? false : z25;
        CharSequence charSequence4 = (i35 & 16777216) != 0 ? null : charSequence2;
        int i62 = (i35 & 33554432) != 0 ? 0 : i31;
        boolean z46 = (i35 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? false : z26;
        boolean z47 = (i35 & 134217728) != 0 ? false : z27;
        String str3 = (i35 & 268435456) != 0 ? null : str;
        List listM14771n = (i35 & 536870912) != 0 ? AbstractC8809v.m14771n() : list;
        if ((i35 & BasicMeasure.EXACTLY) != 0) {
            requestSizeOptions2 = requestSizeOptions3;
            i45 = i51;
            fApplyDimension6 = TypedValue.applyDimension(2, 20.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            requestSizeOptions2 = requestSizeOptions3;
            i45 = i51;
            fApplyDimension6 = f19;
        }
        this(z35, z30, cropShape2, cropCornerShape2, fApplyDimension7, fApplyDimension8, fApplyDimension9, guidelines2, scaleType2, z31, z32, z33, i37, z34, z28, z37, z38, i46, f25, z39, i47, i48, f20, i38, f21, f22, f23, i40, i50, f24, i41, i42, i44, i56, i45, i52, i53, i54, charSequence3, i55, num6, uri2, compressFormat2, i57, i58, i59, requestSizeOptions2, z40, rect2, i60, z41, z42, z43, i61, z44, z45, charSequence4, i62, z46, z47, str3, listM14771n, fApplyDimension6, (i35 & Integer.MIN_VALUE) != 0 ? -1 : i32, (i36 & 1) != 0 ? "" : str2, (i36 & 2) != 0 ? -1 : i33, (i36 & 4) != 0 ? null : num2, (i36 & 8) != 0 ? null : num3, (i36 & 16) != 0 ? null : num4, (i36 & 32) != 0 ? null : num5);
    }
}
