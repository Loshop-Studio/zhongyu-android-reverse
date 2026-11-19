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
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alibaba.fastjson.asm.Opcodes;
import com.canhub.cropper.CropImageView;
import com.google.protobuf.DescriptorProtos;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10978w;

/* loaded from: classes3.dex */
public final class CropImageOptions implements Parcelable {
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new C5889a();

    /* renamed from: A */
    public float f5151A;

    /* renamed from: B */
    public float f5152B;

    /* renamed from: C */
    public float f5153C;

    /* renamed from: D */
    public int f5154D;

    /* renamed from: E */
    public int f5155E;

    /* renamed from: F */
    public float f5156F;

    /* renamed from: G */
    public int f5157G;

    /* renamed from: H */
    public int f5158H;

    /* renamed from: I */
    public int f5159I;

    /* renamed from: J */
    public int f5160J;

    /* renamed from: K */
    public int f5161K;

    /* renamed from: L */
    public int f5162L;

    /* renamed from: M */
    public int f5163M;

    /* renamed from: N */
    public int f5164N;

    /* renamed from: O */
    public CharSequence f5165O;

    /* renamed from: P */
    public int f5166P;

    /* renamed from: Q */
    public Integer f5167Q;

    /* renamed from: R */
    public Uri f5168R;

    /* renamed from: S */
    public Bitmap.CompressFormat f5169S;

    /* renamed from: T */
    public int f5170T;

    /* renamed from: U */
    public int f5171U;

    /* renamed from: V */
    public int f5172V;

    /* renamed from: W */
    public CropImageView.RequestSizeOptions f5173W;

    /* renamed from: X */
    public boolean f5174X;

    /* renamed from: Y */
    public Rect f5175Y;

    /* renamed from: Z */
    public int f5176Z;

    /* renamed from: c */
    public boolean f5177c;

    /* renamed from: d */
    public boolean f5178d;

    /* renamed from: e */
    public CropImageView.CropShape f5179e;

    /* renamed from: e0 */
    public boolean f5180e0;

    /* renamed from: f */
    public CropImageView.CropCornerShape f5181f;

    /* renamed from: f0 */
    public boolean f5182f0;

    /* renamed from: g */
    public float f5183g;

    /* renamed from: g0 */
    public boolean f5184g0;

    /* renamed from: h */
    public float f5185h;

    /* renamed from: h0 */
    public int f5186h0;

    /* renamed from: i */
    public float f5187i;

    /* renamed from: i0 */
    public boolean f5188i0;

    /* renamed from: j */
    public CropImageView.Guidelines f5189j;

    /* renamed from: j0 */
    public boolean f5190j0;

    /* renamed from: k */
    public CropImageView.ScaleType f5191k;

    /* renamed from: k0 */
    public CharSequence f5192k0;

    /* renamed from: l */
    public boolean f5193l;

    /* renamed from: l0 */
    public int f5194l0;

    /* renamed from: m */
    public boolean f5195m;

    /* renamed from: m0 */
    public boolean f5196m0;

    /* renamed from: n */
    public boolean f5197n;

    /* renamed from: n0 */
    public boolean f5198n0;

    /* renamed from: o */
    public int f5199o;

    /* renamed from: o0 */
    public String f5200o0;

    /* renamed from: p */
    public boolean f5201p;

    /* renamed from: p0 */
    public List f5202p0;

    /* renamed from: q */
    public boolean f5203q;

    /* renamed from: q0 */
    public float f5204q0;

    /* renamed from: r */
    public boolean f5205r;

    /* renamed from: r0 */
    public int f5206r0;

    /* renamed from: s */
    public boolean f5207s;

    /* renamed from: s0 */
    public String f5208s0;

    /* renamed from: t */
    public int f5209t;

    /* renamed from: t0 */
    public int f5210t0;

    /* renamed from: u */
    public float f5211u;

    /* renamed from: u0 */
    public Integer f5212u0;

    /* renamed from: v */
    public boolean f5213v;

    /* renamed from: v0 */
    public Integer f5214v0;

    /* renamed from: w */
    public int f5215w;

    /* renamed from: w0 */
    public Integer f5216w0;

    /* renamed from: x */
    public int f5217x;

    /* renamed from: x0 */
    public Integer f5218x0;

    /* renamed from: y */
    public float f5219y;

    /* renamed from: z */
    public int f5220z;

    /* renamed from: com.canhub.cropper.CropImageOptions$a */
    public static final class C5889a implements Parcelable.Creator {
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
            throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageOptions.C5889a.createFromParcel(android.os.Parcel):com.canhub.cropper.CropImageOptions");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CropImageOptions[] newArray(int i10) {
            return new CropImageOptions[i10];
        }
    }

    public CropImageOptions(boolean z10, boolean z11, CropImageView.CropShape cropShape, CropImageView.CropCornerShape cornerShape, float f10, float f11, float f12, CropImageView.Guidelines guidelines, CropImageView.ScaleType scaleType, boolean z12, boolean z13, boolean z14, int i10, boolean z15, boolean z16, boolean z17, boolean z18, int i11, float f13, boolean z19, int i12, int i13, float f14, int i14, float f15, float f16, float f17, int i15, int i16, float f18, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, CharSequence activityTitle, int i25, Integer num, Uri uri, Bitmap.CompressFormat outputCompressFormat, int i26, int i27, int i28, CropImageView.RequestSizeOptions outputRequestSizeOptions, boolean z20, Rect rect, int i29, boolean z21, boolean z22, boolean z23, int i30, boolean z24, boolean z25, CharSequence charSequence, int i31, boolean z26, boolean z27, String str, List list, float f19, int i32, String str2, int i33, Integer num2, Integer num3, Integer num4, Integer num5) {
        AbstractC9979u.m20294g(cropShape, "cropShape");
        AbstractC9979u.m20294g(cornerShape, "cornerShape");
        AbstractC9979u.m20294g(guidelines, "guidelines");
        AbstractC9979u.m20294g(scaleType, "scaleType");
        AbstractC9979u.m20294g(activityTitle, "activityTitle");
        AbstractC9979u.m20294g(outputCompressFormat, "outputCompressFormat");
        AbstractC9979u.m20294g(outputRequestSizeOptions, "outputRequestSizeOptions");
        this.f5177c = z10;
        this.f5178d = z11;
        this.f5179e = cropShape;
        this.f5181f = cornerShape;
        this.f5183g = f10;
        this.f5185h = f11;
        this.f5187i = f12;
        this.f5189j = guidelines;
        this.f5191k = scaleType;
        this.f5193l = z12;
        this.f5195m = z13;
        this.f5197n = z14;
        this.f5199o = i10;
        this.f5201p = z15;
        this.f5203q = z16;
        this.f5205r = z17;
        this.f5207s = z18;
        this.f5209t = i11;
        this.f5211u = f13;
        this.f5213v = z19;
        this.f5215w = i12;
        this.f5217x = i13;
        this.f5219y = f14;
        this.f5220z = i14;
        this.f5151A = f15;
        this.f5152B = f16;
        this.f5153C = f17;
        this.f5154D = i15;
        this.f5155E = i16;
        this.f5156F = f18;
        this.f5157G = i17;
        this.f5158H = i18;
        this.f5159I = i19;
        this.f5160J = i20;
        this.f5161K = i21;
        this.f5162L = i22;
        this.f5163M = i23;
        this.f5164N = i24;
        this.f5165O = activityTitle;
        this.f5166P = i25;
        this.f5167Q = num;
        this.f5168R = uri;
        this.f5169S = outputCompressFormat;
        this.f5170T = i26;
        this.f5171U = i27;
        this.f5172V = i28;
        this.f5173W = outputRequestSizeOptions;
        this.f5174X = z20;
        this.f5175Y = rect;
        this.f5176Z = i29;
        this.f5180e0 = z21;
        this.f5182f0 = z22;
        this.f5184g0 = z23;
        this.f5186h0 = i30;
        this.f5188i0 = z24;
        this.f5190j0 = z25;
        this.f5192k0 = charSequence;
        this.f5194l0 = i31;
        this.f5196m0 = z26;
        this.f5198n0 = z27;
        this.f5200o0 = str;
        this.f5202p0 = list;
        this.f5204q0 = f19;
        this.f5206r0 = i32;
        this.f5208s0 = str2;
        this.f5210t0 = i33;
        this.f5212u0 = num2;
        this.f5214v0 = num3;
        this.f5216w0 = num4;
        this.f5218x0 = num5;
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
        return this.f5177c == cropImageOptions.f5177c && this.f5178d == cropImageOptions.f5178d && this.f5179e == cropImageOptions.f5179e && this.f5181f == cropImageOptions.f5181f && Float.compare(this.f5183g, cropImageOptions.f5183g) == 0 && Float.compare(this.f5185h, cropImageOptions.f5185h) == 0 && Float.compare(this.f5187i, cropImageOptions.f5187i) == 0 && this.f5189j == cropImageOptions.f5189j && this.f5191k == cropImageOptions.f5191k && this.f5193l == cropImageOptions.f5193l && this.f5195m == cropImageOptions.f5195m && this.f5197n == cropImageOptions.f5197n && this.f5199o == cropImageOptions.f5199o && this.f5201p == cropImageOptions.f5201p && this.f5203q == cropImageOptions.f5203q && this.f5205r == cropImageOptions.f5205r && this.f5207s == cropImageOptions.f5207s && this.f5209t == cropImageOptions.f5209t && Float.compare(this.f5211u, cropImageOptions.f5211u) == 0 && this.f5213v == cropImageOptions.f5213v && this.f5215w == cropImageOptions.f5215w && this.f5217x == cropImageOptions.f5217x && Float.compare(this.f5219y, cropImageOptions.f5219y) == 0 && this.f5220z == cropImageOptions.f5220z && Float.compare(this.f5151A, cropImageOptions.f5151A) == 0 && Float.compare(this.f5152B, cropImageOptions.f5152B) == 0 && Float.compare(this.f5153C, cropImageOptions.f5153C) == 0 && this.f5154D == cropImageOptions.f5154D && this.f5155E == cropImageOptions.f5155E && Float.compare(this.f5156F, cropImageOptions.f5156F) == 0 && this.f5157G == cropImageOptions.f5157G && this.f5158H == cropImageOptions.f5158H && this.f5159I == cropImageOptions.f5159I && this.f5160J == cropImageOptions.f5160J && this.f5161K == cropImageOptions.f5161K && this.f5162L == cropImageOptions.f5162L && this.f5163M == cropImageOptions.f5163M && this.f5164N == cropImageOptions.f5164N && AbstractC9979u.m20289b(this.f5165O, cropImageOptions.f5165O) && this.f5166P == cropImageOptions.f5166P && AbstractC9979u.m20289b(this.f5167Q, cropImageOptions.f5167Q) && AbstractC9979u.m20289b(this.f5168R, cropImageOptions.f5168R) && this.f5169S == cropImageOptions.f5169S && this.f5170T == cropImageOptions.f5170T && this.f5171U == cropImageOptions.f5171U && this.f5172V == cropImageOptions.f5172V && this.f5173W == cropImageOptions.f5173W && this.f5174X == cropImageOptions.f5174X && AbstractC9979u.m20289b(this.f5175Y, cropImageOptions.f5175Y) && this.f5176Z == cropImageOptions.f5176Z && this.f5180e0 == cropImageOptions.f5180e0 && this.f5182f0 == cropImageOptions.f5182f0 && this.f5184g0 == cropImageOptions.f5184g0 && this.f5186h0 == cropImageOptions.f5186h0 && this.f5188i0 == cropImageOptions.f5188i0 && this.f5190j0 == cropImageOptions.f5190j0 && AbstractC9979u.m20289b(this.f5192k0, cropImageOptions.f5192k0) && this.f5194l0 == cropImageOptions.f5194l0 && this.f5196m0 == cropImageOptions.f5196m0 && this.f5198n0 == cropImageOptions.f5198n0 && AbstractC9979u.m20289b(this.f5200o0, cropImageOptions.f5200o0) && AbstractC9979u.m20289b(this.f5202p0, cropImageOptions.f5202p0) && Float.compare(this.f5204q0, cropImageOptions.f5204q0) == 0 && this.f5206r0 == cropImageOptions.f5206r0 && AbstractC9979u.m20289b(this.f5208s0, cropImageOptions.f5208s0) && this.f5210t0 == cropImageOptions.f5210t0 && AbstractC9979u.m20289b(this.f5212u0, cropImageOptions.f5212u0) && AbstractC9979u.m20289b(this.f5214v0, cropImageOptions.f5214v0) && AbstractC9979u.m20289b(this.f5216w0, cropImageOptions.f5216w0) && AbstractC9979u.m20289b(this.f5218x0, cropImageOptions.f5218x0);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Boolean.hashCode(this.f5177c) * 31) + Boolean.hashCode(this.f5178d)) * 31) + this.f5179e.hashCode()) * 31) + this.f5181f.hashCode()) * 31) + Float.hashCode(this.f5183g)) * 31) + Float.hashCode(this.f5185h)) * 31) + Float.hashCode(this.f5187i)) * 31) + this.f5189j.hashCode()) * 31) + this.f5191k.hashCode()) * 31) + Boolean.hashCode(this.f5193l)) * 31) + Boolean.hashCode(this.f5195m)) * 31) + Boolean.hashCode(this.f5197n)) * 31) + Integer.hashCode(this.f5199o)) * 31) + Boolean.hashCode(this.f5201p)) * 31) + Boolean.hashCode(this.f5203q)) * 31) + Boolean.hashCode(this.f5205r)) * 31) + Boolean.hashCode(this.f5207s)) * 31) + Integer.hashCode(this.f5209t)) * 31) + Float.hashCode(this.f5211u)) * 31) + Boolean.hashCode(this.f5213v)) * 31) + Integer.hashCode(this.f5215w)) * 31) + Integer.hashCode(this.f5217x)) * 31) + Float.hashCode(this.f5219y)) * 31) + Integer.hashCode(this.f5220z)) * 31) + Float.hashCode(this.f5151A)) * 31) + Float.hashCode(this.f5152B)) * 31) + Float.hashCode(this.f5153C)) * 31) + Integer.hashCode(this.f5154D)) * 31) + Integer.hashCode(this.f5155E)) * 31) + Float.hashCode(this.f5156F)) * 31) + Integer.hashCode(this.f5157G)) * 31) + Integer.hashCode(this.f5158H)) * 31) + Integer.hashCode(this.f5159I)) * 31) + Integer.hashCode(this.f5160J)) * 31) + Integer.hashCode(this.f5161K)) * 31) + Integer.hashCode(this.f5162L)) * 31) + Integer.hashCode(this.f5163M)) * 31) + Integer.hashCode(this.f5164N)) * 31) + this.f5165O.hashCode()) * 31) + Integer.hashCode(this.f5166P)) * 31;
        Integer num = this.f5167Q;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Uri uri = this.f5168R;
        int iHashCode3 = (((((((((((((iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31) + this.f5169S.hashCode()) * 31) + Integer.hashCode(this.f5170T)) * 31) + Integer.hashCode(this.f5171U)) * 31) + Integer.hashCode(this.f5172V)) * 31) + this.f5173W.hashCode()) * 31) + Boolean.hashCode(this.f5174X)) * 31;
        Rect rect = this.f5175Y;
        int iHashCode4 = (((((((((((((((iHashCode3 + (rect == null ? 0 : rect.hashCode())) * 31) + Integer.hashCode(this.f5176Z)) * 31) + Boolean.hashCode(this.f5180e0)) * 31) + Boolean.hashCode(this.f5182f0)) * 31) + Boolean.hashCode(this.f5184g0)) * 31) + Integer.hashCode(this.f5186h0)) * 31) + Boolean.hashCode(this.f5188i0)) * 31) + Boolean.hashCode(this.f5190j0)) * 31;
        CharSequence charSequence = this.f5192k0;
        int iHashCode5 = (((((((iHashCode4 + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + Integer.hashCode(this.f5194l0)) * 31) + Boolean.hashCode(this.f5196m0)) * 31) + Boolean.hashCode(this.f5198n0)) * 31;
        String str = this.f5200o0;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f5202p0;
        int iHashCode7 = (((((iHashCode6 + (list == null ? 0 : list.hashCode())) * 31) + Float.hashCode(this.f5204q0)) * 31) + Integer.hashCode(this.f5206r0)) * 31;
        String str2 = this.f5208s0;
        int iHashCode8 = (((iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.f5210t0)) * 31;
        Integer num2 = this.f5212u0;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f5214v0;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f5216w0;
        int iHashCode11 = (iHashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f5218x0;
        return iHashCode11 + (num5 != null ? num5.hashCode() : 0);
    }

    public String toString() {
        boolean z10 = this.f5177c;
        boolean z11 = this.f5178d;
        CropImageView.CropShape cropShape = this.f5179e;
        CropImageView.CropCornerShape cropCornerShape = this.f5181f;
        float f10 = this.f5183g;
        float f11 = this.f5185h;
        float f12 = this.f5187i;
        CropImageView.Guidelines guidelines = this.f5189j;
        CropImageView.ScaleType scaleType = this.f5191k;
        boolean z12 = this.f5193l;
        boolean z13 = this.f5195m;
        boolean z14 = this.f5197n;
        int i10 = this.f5199o;
        boolean z15 = this.f5201p;
        boolean z16 = this.f5203q;
        boolean z17 = this.f5205r;
        boolean z18 = this.f5207s;
        int i11 = this.f5209t;
        float f13 = this.f5211u;
        boolean z19 = this.f5213v;
        int i12 = this.f5215w;
        int i13 = this.f5217x;
        float f14 = this.f5219y;
        int i14 = this.f5220z;
        float f15 = this.f5151A;
        float f16 = this.f5152B;
        float f17 = this.f5153C;
        int i15 = this.f5154D;
        int i16 = this.f5155E;
        float f18 = this.f5156F;
        int i17 = this.f5157G;
        int i18 = this.f5158H;
        int i19 = this.f5159I;
        int i20 = this.f5160J;
        int i21 = this.f5161K;
        int i22 = this.f5162L;
        int i23 = this.f5163M;
        int i24 = this.f5164N;
        CharSequence charSequence = this.f5165O;
        int i25 = this.f5166P;
        Integer num = this.f5167Q;
        Uri uri = this.f5168R;
        Bitmap.CompressFormat compressFormat = this.f5169S;
        int i26 = this.f5170T;
        int i27 = this.f5171U;
        int i28 = this.f5172V;
        CropImageView.RequestSizeOptions requestSizeOptions = this.f5173W;
        boolean z20 = this.f5174X;
        Rect rect = this.f5175Y;
        int i29 = this.f5176Z;
        boolean z21 = this.f5180e0;
        boolean z22 = this.f5182f0;
        boolean z23 = this.f5184g0;
        int i30 = this.f5186h0;
        boolean z24 = this.f5188i0;
        boolean z25 = this.f5190j0;
        CharSequence charSequence2 = this.f5192k0;
        return "CropImageOptions(imageSourceIncludeGallery=" + z10 + ", imageSourceIncludeCamera=" + z11 + ", cropShape=" + cropShape + ", cornerShape=" + cropCornerShape + ", cropCornerRadius=" + f10 + ", snapRadius=" + f11 + ", touchRadius=" + f12 + ", guidelines=" + guidelines + ", scaleType=" + scaleType + ", showCropOverlay=" + z12 + ", showCropLabel=" + z13 + ", showProgressBar=" + z14 + ", progressBarColor=" + i10 + ", autoZoomEnabled=" + z15 + ", multiTouchEnabled=" + z16 + ", centerMoveEnabled=" + z17 + ", canChangeCropWindow=" + z18 + ", maxZoom=" + i11 + ", initialCropWindowPaddingRatio=" + f13 + ", fixAspectRatio=" + z19 + ", aspectRatioX=" + i12 + ", aspectRatioY=" + i13 + ", borderLineThickness=" + f14 + ", borderLineColor=" + i14 + ", borderCornerThickness=" + f15 + ", borderCornerOffset=" + f16 + ", borderCornerLength=" + f17 + ", borderCornerColor=" + i15 + ", circleCornerFillColorHexValue=" + i16 + ", guidelinesThickness=" + f18 + ", guidelinesColor=" + i17 + ", backgroundColor=" + i18 + ", minCropWindowWidth=" + i19 + ", minCropWindowHeight=" + i20 + ", minCropResultWidth=" + i21 + ", minCropResultHeight=" + i22 + ", maxCropResultWidth=" + i23 + ", maxCropResultHeight=" + i24 + ", activityTitle=" + ((Object) charSequence) + ", activityMenuIconColor=" + i25 + ", activityMenuTextColor=" + num + ", customOutputUri=" + uri + ", outputCompressFormat=" + compressFormat + ", outputCompressQuality=" + i26 + ", outputRequestWidth=" + i27 + ", outputRequestHeight=" + i28 + ", outputRequestSizeOptions=" + requestSizeOptions + ", noOutputImage=" + z20 + ", initialCropWindowRectangle=" + rect + ", initialRotation=" + i29 + ", allowRotation=" + z21 + ", allowFlipping=" + z22 + ", allowCounterRotation=" + z23 + ", rotationDegrees=" + i30 + ", flipHorizontally=" + z24 + ", flipVertically=" + z25 + ", cropMenuCropButtonTitle=" + ((Object) charSequence2) + ", cropMenuCropButtonIcon=" + this.f5194l0 + ", skipEditing=" + this.f5196m0 + ", showIntentChooser=" + this.f5198n0 + ", intentChooserTitle=" + this.f5200o0 + ", intentChooserPriorityList=" + this.f5202p0 + ", cropperLabelTextSize=" + this.f5204q0 + ", cropperLabelTextColor=" + this.f5206r0 + ", cropperLabelText=" + this.f5208s0 + ", activityBackgroundColor=" + this.f5210t0 + ", toolbarColor=" + this.f5212u0 + ", toolbarTitleColor=" + this.f5214v0 + ", toolbarBackButtonColor=" + this.f5216w0 + ", toolbarTintColor=" + this.f5218x0 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9979u.m20294g(dest, "dest");
        dest.writeInt(this.f5177c ? 1 : 0);
        dest.writeInt(this.f5178d ? 1 : 0);
        dest.writeString(this.f5179e.name());
        dest.writeString(this.f5181f.name());
        dest.writeFloat(this.f5183g);
        dest.writeFloat(this.f5185h);
        dest.writeFloat(this.f5187i);
        dest.writeString(this.f5189j.name());
        dest.writeString(this.f5191k.name());
        dest.writeInt(this.f5193l ? 1 : 0);
        dest.writeInt(this.f5195m ? 1 : 0);
        dest.writeInt(this.f5197n ? 1 : 0);
        dest.writeInt(this.f5199o);
        dest.writeInt(this.f5201p ? 1 : 0);
        dest.writeInt(this.f5203q ? 1 : 0);
        dest.writeInt(this.f5205r ? 1 : 0);
        dest.writeInt(this.f5207s ? 1 : 0);
        dest.writeInt(this.f5209t);
        dest.writeFloat(this.f5211u);
        dest.writeInt(this.f5213v ? 1 : 0);
        dest.writeInt(this.f5215w);
        dest.writeInt(this.f5217x);
        dest.writeFloat(this.f5219y);
        dest.writeInt(this.f5220z);
        dest.writeFloat(this.f5151A);
        dest.writeFloat(this.f5152B);
        dest.writeFloat(this.f5153C);
        dest.writeInt(this.f5154D);
        dest.writeInt(this.f5155E);
        dest.writeFloat(this.f5156F);
        dest.writeInt(this.f5157G);
        dest.writeInt(this.f5158H);
        dest.writeInt(this.f5159I);
        dest.writeInt(this.f5160J);
        dest.writeInt(this.f5161K);
        dest.writeInt(this.f5162L);
        dest.writeInt(this.f5163M);
        dest.writeInt(this.f5164N);
        TextUtils.writeToParcel(this.f5165O, dest, i10);
        dest.writeInt(this.f5166P);
        Integer num = this.f5167Q;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeParcelable(this.f5168R, i10);
        dest.writeString(this.f5169S.name());
        dest.writeInt(this.f5170T);
        dest.writeInt(this.f5171U);
        dest.writeInt(this.f5172V);
        dest.writeString(this.f5173W.name());
        dest.writeInt(this.f5174X ? 1 : 0);
        dest.writeParcelable(this.f5175Y, i10);
        dest.writeInt(this.f5176Z);
        dest.writeInt(this.f5180e0 ? 1 : 0);
        dest.writeInt(this.f5182f0 ? 1 : 0);
        dest.writeInt(this.f5184g0 ? 1 : 0);
        dest.writeInt(this.f5186h0);
        dest.writeInt(this.f5188i0 ? 1 : 0);
        dest.writeInt(this.f5190j0 ? 1 : 0);
        TextUtils.writeToParcel(this.f5192k0, dest, i10);
        dest.writeInt(this.f5194l0);
        dest.writeInt(this.f5196m0 ? 1 : 0);
        dest.writeInt(this.f5198n0 ? 1 : 0);
        dest.writeString(this.f5200o0);
        dest.writeStringList(this.f5202p0);
        dest.writeFloat(this.f5204q0);
        dest.writeInt(this.f5206r0);
        dest.writeString(this.f5208s0);
        dest.writeInt(this.f5210t0);
        Integer num2 = this.f5212u0;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.f5214v0;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Integer num4 = this.f5216w0;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        Integer num5 = this.f5218x0;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num5.intValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CropImageOptions(boolean z10, boolean z11, CropImageView.CropShape cropShape, CropImageView.CropCornerShape cropCornerShape, float f10, float f11, float f12, CropImageView.Guidelines guidelines, CropImageView.ScaleType scaleType, boolean z12, boolean z13, boolean z14, int i10, boolean z15, boolean z16, boolean z17, boolean z18, int i11, float f13, boolean z19, int i12, int i13, float f14, int i14, float f15, float f16, float f17, int i15, int i16, float f18, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, CharSequence charSequence, int i25, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i26, int i27, int i28, CropImageView.RequestSizeOptions requestSizeOptions, boolean z20, Rect rect, int i29, boolean z21, boolean z22, boolean z23, int i30, boolean z24, boolean z25, CharSequence charSequence2, int i31, boolean z26, boolean z27, String str, List list, float f19, int i32, String str2, int i33, Integer num2, Integer num3, Integer num4, Integer num5, int i34, int i35, int i36, AbstractC9972n abstractC9972n) {
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
        CropImageView.CropShape cropShape2 = (i34 & 4) != 0 ? CropImageView.CropShape.f5265c : cropShape;
        CropImageView.CropCornerShape cropCornerShape2 = (i34 & 8) != 0 ? CropImageView.CropCornerShape.f5261c : cropCornerShape;
        float fApplyDimension7 = (i34 & 16) != 0 ? TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics()) : f10;
        float fApplyDimension8 = (i34 & 32) != 0 ? TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics()) : f11;
        float fApplyDimension9 = (i34 & 64) != 0 ? TypedValue.applyDimension(1, 24.0f, Resources.getSystem().getDisplayMetrics()) : f12;
        CropImageView.Guidelines guidelines2 = (i34 & 128) != 0 ? CropImageView.Guidelines.f5273e : guidelines;
        CropImageView.ScaleType scaleType2 = (i34 & 256) != 0 ? CropImageView.ScaleType.f5283c : scaleType;
        boolean z31 = (i34 & 512) != 0 ? true : z12;
        boolean z32 = (i34 & 1024) != 0 ? false : z13;
        boolean z33 = (i34 & 2048) != 0 ? true : z14;
        int iRgb = (i34 & 4096) != 0 ? Color.rgb(Opcodes.IFEQ, 51, Opcodes.IFEQ) : i10;
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
        int iArgb3 = (i34 & 1073741824) != 0 ? Color.argb(170, 255, 255, 255) : i17;
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
        int i53 = (i35 & 16) != 0 ? DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE : i23;
        int i54 = (i35 & 32) != 0 ? DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE : i24;
        CharSequence charSequence3 = (i35 & 64) != 0 ? "" : charSequence;
        int i55 = (i35 & 128) != 0 ? 0 : i25;
        int i56 = iApplyDimension2;
        Integer num6 = (i35 & 256) != 0 ? null : num;
        Uri uri2 = (i35 & 512) != 0 ? null : uri;
        Bitmap.CompressFormat compressFormat2 = (i35 & 1024) != 0 ? Bitmap.CompressFormat.JPEG : compressFormat;
        int i57 = (i35 & 2048) != 0 ? 90 : i26;
        int i58 = (i35 & 4096) != 0 ? 0 : i27;
        int i59 = (i35 & 8192) != 0 ? 0 : i28;
        CropImageView.RequestSizeOptions requestSizeOptions3 = (i35 & 16384) != 0 ? CropImageView.RequestSizeOptions.f5276c : requestSizeOptions;
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
        List listM24136n = (i35 & 536870912) != 0 ? AbstractC10978w.m24136n() : list;
        if ((i35 & 1073741824) != 0) {
            requestSizeOptions2 = requestSizeOptions3;
            i45 = i51;
            fApplyDimension6 = TypedValue.applyDimension(2, 20.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            requestSizeOptions2 = requestSizeOptions3;
            i45 = i51;
            fApplyDimension6 = f19;
        }
        this(z35, z30, cropShape2, cropCornerShape2, fApplyDimension7, fApplyDimension8, fApplyDimension9, guidelines2, scaleType2, z31, z32, z33, i37, z34, z28, z37, z38, i46, f25, z39, i47, i48, f20, i38, f21, f22, f23, i40, i50, f24, i41, i42, i44, i56, i45, i52, i53, i54, charSequence3, i55, num6, uri2, compressFormat2, i57, i58, i59, requestSizeOptions2, z40, rect2, i60, z41, z42, z43, i61, z44, z45, charSequence4, i62, z46, z47, str3, listM24136n, fApplyDimension6, (i35 & Integer.MIN_VALUE) != 0 ? -1 : i32, (i36 & 1) != 0 ? "" : str2, (i36 & 2) != 0 ? -1 : i33, (i36 & 4) != 0 ? null : num2, (i36 & 8) != 0 ? null : num3, (i36 & 16) != 0 ? null : num4, (i36 & 32) != 0 ? null : num5);
    }
}
