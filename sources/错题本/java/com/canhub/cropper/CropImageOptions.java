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
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.canhub.cropper.CropImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(m5109d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m5110d2 = {"Lcom/canhub/cropper/CropImageOptions;", "Landroid/os/Parcelable;", "cropper_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCropImageOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageOptions.kt\ncom/canhub/cropper/CropImageOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
/* loaded from: classes2.dex */
public final /* data */ class CropImageOptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new C3449t();

    /* renamed from: A */
    public final float f2371A;

    /* renamed from: B */
    public int f2372B;

    /* renamed from: C */
    public final int f2373C;

    /* renamed from: D */
    public final float f2374D;

    /* renamed from: E */
    public final int f2375E;

    /* renamed from: F */
    public final int f2376F;

    /* renamed from: G */
    public final int f2377G;

    /* renamed from: H */
    public final int f2378H;

    /* renamed from: I */
    public final int f2379I;

    /* renamed from: J */
    public final int f2380J;

    /* renamed from: K */
    public final int f2381K;

    /* renamed from: L */
    public final int f2382L;

    /* renamed from: M */
    public final CharSequence f2383M;

    /* renamed from: N */
    public final int f2384N;

    /* renamed from: O */
    public final Integer f2385O;

    /* renamed from: P */
    public final Uri f2386P;

    /* renamed from: Q */
    public final Bitmap.CompressFormat f2387Q;

    /* renamed from: R */
    public final int f2388R;

    /* renamed from: S */
    public final int f2389S;

    /* renamed from: T */
    public final int f2390T;

    /* renamed from: U */
    public final CropImageView.RequestSizeOptions f2391U;

    /* renamed from: V */
    public final boolean f2392V;

    /* renamed from: W */
    public final Rect f2393W;

    /* renamed from: X */
    public final int f2394X;

    /* renamed from: Y */
    public final boolean f2395Y;

    /* renamed from: Z */
    public final boolean f2396Z;

    /* renamed from: a */
    public final boolean f2397a;

    /* renamed from: b */
    public final boolean f2398b;

    /* renamed from: c */
    public final CropImageView.CropShape f2399c;

    /* renamed from: c0 */
    public final boolean f2400c0;

    /* renamed from: d */
    public final CropImageView.CropCornerShape f2401d;

    /* renamed from: d0 */
    public final int f2402d0;

    /* renamed from: e */
    public final float f2403e;

    /* renamed from: e0 */
    public final boolean f2404e0;

    /* renamed from: f */
    public final float f2405f;

    /* renamed from: f0 */
    public final boolean f2406f0;

    /* renamed from: g */
    public final float f2407g;

    /* renamed from: g0 */
    public final CharSequence f2408g0;

    /* renamed from: h */
    public final CropImageView.Guidelines f2409h;

    /* renamed from: h0 */
    public final int f2410h0;

    /* renamed from: i */
    public final CropImageView.ScaleType f2411i;

    /* renamed from: i0 */
    public final boolean f2412i0;

    /* renamed from: j */
    public final boolean f2413j;

    /* renamed from: j0 */
    public final boolean f2414j0;

    /* renamed from: k */
    public final boolean f2415k;

    /* renamed from: k0 */
    public final String f2416k0;

    /* renamed from: l */
    public final boolean f2417l;

    /* renamed from: l0 */
    public final List f2418l0;

    /* renamed from: m */
    public int f2419m;

    /* renamed from: m0 */
    public final float f2420m0;

    /* renamed from: n */
    public boolean f2421n;

    /* renamed from: n0 */
    public final int f2422n0;

    /* renamed from: o */
    public boolean f2423o;

    /* renamed from: o0 */
    public final String f2424o0;

    /* renamed from: p */
    public final boolean f2425p;

    /* renamed from: p0 */
    public final int f2426p0;

    /* renamed from: q */
    public final boolean f2427q;

    /* renamed from: q0 */
    public final Integer f2428q0;

    /* renamed from: r */
    public final int f2429r;

    /* renamed from: r0 */
    public final Integer f2430r0;

    /* renamed from: s */
    public float f2431s;

    /* renamed from: s0 */
    public final Integer f2432s0;

    /* renamed from: t */
    public final boolean f2433t;

    /* renamed from: t0 */
    public final Integer f2434t0;

    /* renamed from: u */
    public final int f2435u;

    /* renamed from: v */
    public final int f2436v;

    /* renamed from: w */
    public final float f2437w;

    /* renamed from: x */
    public int f2438x;

    /* renamed from: y */
    public final float f2439y;

    /* renamed from: z */
    public final float f2440z;

    public CropImageOptions(boolean z8, boolean z9, CropImageView.CropShape cropShape, CropImageView.CropCornerShape cornerShape, float f, float f7, float f8, CropImageView.Guidelines guidelines, CropImageView.ScaleType scaleType, boolean z10, boolean z11, boolean z12, int i, boolean z13, boolean z14, boolean z15, boolean z16, int i8, float f9, boolean z17, int i9, int i10, float f10, int i11, float f11, float f12, float f13, int i12, int i13, float f14, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, CharSequence activityTitle, int i22, Integer num, Uri uri, Bitmap.CompressFormat outputCompressFormat, int i23, int i24, int i25, CropImageView.RequestSizeOptions outputRequestSizeOptions, boolean z18, Rect rect, int i26, boolean z19, boolean z20, boolean z21, int i27, boolean z22, boolean z23, CharSequence charSequence, int i28, boolean z24, boolean z25, String str, List list, float f15, int i29, String str2, int i30, Integer num2, Integer num3, Integer num4, Integer num5) {
        AbstractC5830k.m5330g(cropShape, "cropShape");
        AbstractC5830k.m5330g(cornerShape, "cornerShape");
        AbstractC5830k.m5330g(guidelines, "guidelines");
        AbstractC5830k.m5330g(scaleType, "scaleType");
        AbstractC5830k.m5330g(activityTitle, "activityTitle");
        AbstractC5830k.m5330g(outputCompressFormat, "outputCompressFormat");
        AbstractC5830k.m5330g(outputRequestSizeOptions, "outputRequestSizeOptions");
        this.f2397a = z8;
        this.f2398b = z9;
        this.f2399c = cropShape;
        this.f2401d = cornerShape;
        this.f2403e = f;
        this.f2405f = f7;
        this.f2407g = f8;
        this.f2409h = guidelines;
        this.f2411i = scaleType;
        this.f2413j = z10;
        this.f2415k = z11;
        this.f2417l = z12;
        this.f2419m = i;
        this.f2421n = z13;
        this.f2423o = z14;
        this.f2425p = z15;
        this.f2427q = z16;
        this.f2429r = i8;
        this.f2431s = f9;
        this.f2433t = z17;
        this.f2435u = i9;
        this.f2436v = i10;
        this.f2437w = f10;
        this.f2438x = i11;
        this.f2439y = f11;
        this.f2440z = f12;
        this.f2371A = f13;
        this.f2372B = i12;
        this.f2373C = i13;
        this.f2374D = f14;
        this.f2375E = i14;
        this.f2376F = i15;
        this.f2377G = i16;
        this.f2378H = i17;
        this.f2379I = i18;
        this.f2380J = i19;
        this.f2381K = i20;
        this.f2382L = i21;
        this.f2383M = activityTitle;
        this.f2384N = i22;
        this.f2385O = num;
        this.f2386P = uri;
        this.f2387Q = outputCompressFormat;
        this.f2388R = i23;
        this.f2389S = i24;
        this.f2390T = i25;
        this.f2391U = outputRequestSizeOptions;
        this.f2392V = z18;
        this.f2393W = rect;
        this.f2394X = i26;
        this.f2395Y = z19;
        this.f2396Z = z20;
        this.f2400c0 = z21;
        this.f2402d0 = i27;
        this.f2404e0 = z22;
        this.f2406f0 = z23;
        this.f2408g0 = charSequence;
        this.f2410h0 = i28;
        this.f2412i0 = z24;
        this.f2414j0 = z25;
        this.f2416k0 = str;
        this.f2418l0 = list;
        this.f2420m0 = f15;
        this.f2422n0 = i29;
        this.f2424o0 = str2;
        this.f2426p0 = i30;
        this.f2428q0 = num2;
        this.f2430r0 = num3;
        this.f2432s0 = num4;
        this.f2434t0 = num5;
        if (i8 < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        }
        if (f8 < 0.0f) {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
        if (f9 < 0.0f || f9 >= 0.5d) {
            throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
        }
        if (i9 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
        }
        if (f14 < 0.0f) {
            throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
        }
        if (i17 < 0) {
            throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
        }
        if (i18 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
        }
        if (i19 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
        }
        if (i20 < i18) {
            throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
        }
        if (i21 < i19) {
            throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
        }
        if (i24 < 0) {
            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
        }
        if (i25 < 0) {
            throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
        }
        if (i27 < 0 || i27 > 360) {
            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CropImageOptions)) {
            return false;
        }
        CropImageOptions cropImageOptions = (CropImageOptions) obj;
        return this.f2397a == cropImageOptions.f2397a && this.f2398b == cropImageOptions.f2398b && this.f2399c == cropImageOptions.f2399c && this.f2401d == cropImageOptions.f2401d && Float.compare(this.f2403e, cropImageOptions.f2403e) == 0 && Float.compare(this.f2405f, cropImageOptions.f2405f) == 0 && Float.compare(this.f2407g, cropImageOptions.f2407g) == 0 && this.f2409h == cropImageOptions.f2409h && this.f2411i == cropImageOptions.f2411i && this.f2413j == cropImageOptions.f2413j && this.f2415k == cropImageOptions.f2415k && this.f2417l == cropImageOptions.f2417l && this.f2419m == cropImageOptions.f2419m && this.f2421n == cropImageOptions.f2421n && this.f2423o == cropImageOptions.f2423o && this.f2425p == cropImageOptions.f2425p && this.f2427q == cropImageOptions.f2427q && this.f2429r == cropImageOptions.f2429r && Float.compare(this.f2431s, cropImageOptions.f2431s) == 0 && this.f2433t == cropImageOptions.f2433t && this.f2435u == cropImageOptions.f2435u && this.f2436v == cropImageOptions.f2436v && Float.compare(this.f2437w, cropImageOptions.f2437w) == 0 && this.f2438x == cropImageOptions.f2438x && Float.compare(this.f2439y, cropImageOptions.f2439y) == 0 && Float.compare(this.f2440z, cropImageOptions.f2440z) == 0 && Float.compare(this.f2371A, cropImageOptions.f2371A) == 0 && this.f2372B == cropImageOptions.f2372B && this.f2373C == cropImageOptions.f2373C && Float.compare(this.f2374D, cropImageOptions.f2374D) == 0 && this.f2375E == cropImageOptions.f2375E && this.f2376F == cropImageOptions.f2376F && this.f2377G == cropImageOptions.f2377G && this.f2378H == cropImageOptions.f2378H && this.f2379I == cropImageOptions.f2379I && this.f2380J == cropImageOptions.f2380J && this.f2381K == cropImageOptions.f2381K && this.f2382L == cropImageOptions.f2382L && AbstractC5830k.m5325b(this.f2383M, cropImageOptions.f2383M) && this.f2384N == cropImageOptions.f2384N && AbstractC5830k.m5325b(this.f2385O, cropImageOptions.f2385O) && AbstractC5830k.m5325b(this.f2386P, cropImageOptions.f2386P) && this.f2387Q == cropImageOptions.f2387Q && this.f2388R == cropImageOptions.f2388R && this.f2389S == cropImageOptions.f2389S && this.f2390T == cropImageOptions.f2390T && this.f2391U == cropImageOptions.f2391U && this.f2392V == cropImageOptions.f2392V && AbstractC5830k.m5325b(this.f2393W, cropImageOptions.f2393W) && this.f2394X == cropImageOptions.f2394X && this.f2395Y == cropImageOptions.f2395Y && this.f2396Z == cropImageOptions.f2396Z && this.f2400c0 == cropImageOptions.f2400c0 && this.f2402d0 == cropImageOptions.f2402d0 && this.f2404e0 == cropImageOptions.f2404e0 && this.f2406f0 == cropImageOptions.f2406f0 && AbstractC5830k.m5325b(this.f2408g0, cropImageOptions.f2408g0) && this.f2410h0 == cropImageOptions.f2410h0 && this.f2412i0 == cropImageOptions.f2412i0 && this.f2414j0 == cropImageOptions.f2414j0 && AbstractC5830k.m5325b(this.f2416k0, cropImageOptions.f2416k0) && AbstractC5830k.m5325b(this.f2418l0, cropImageOptions.f2418l0) && Float.compare(this.f2420m0, cropImageOptions.f2420m0) == 0 && this.f2422n0 == cropImageOptions.f2422n0 && AbstractC5830k.m5325b(this.f2424o0, cropImageOptions.f2424o0) && this.f2426p0 == cropImageOptions.f2426p0 && AbstractC5830k.m5325b(this.f2428q0, cropImageOptions.f2428q0) && AbstractC5830k.m5325b(this.f2430r0, cropImageOptions.f2430r0) && AbstractC5830k.m5325b(this.f2432s0, cropImageOptions.f2432s0) && AbstractC5830k.m5325b(this.f2434t0, cropImageOptions.f2434t0);
    }

    public final int hashCode() {
        int iM902c = AbstractC0584a.m902c(this.f2384N, (this.f2383M.hashCode() + AbstractC0584a.m902c(this.f2382L, AbstractC0584a.m902c(this.f2381K, AbstractC0584a.m902c(this.f2380J, AbstractC0584a.m902c(this.f2379I, AbstractC0584a.m902c(this.f2378H, AbstractC0584a.m902c(this.f2377G, AbstractC0584a.m902c(this.f2376F, AbstractC0584a.m902c(this.f2375E, AbstractC0584a.m901b(this.f2374D, AbstractC0584a.m902c(this.f2373C, AbstractC0584a.m902c(this.f2372B, AbstractC0584a.m901b(this.f2371A, AbstractC0584a.m901b(this.f2440z, AbstractC0584a.m901b(this.f2439y, AbstractC0584a.m902c(this.f2438x, AbstractC0584a.m901b(this.f2437w, AbstractC0584a.m902c(this.f2436v, AbstractC0584a.m902c(this.f2435u, AbstractC0584a.m908i(this.f2433t, AbstractC0584a.m901b(this.f2431s, AbstractC0584a.m902c(this.f2429r, AbstractC0584a.m908i(this.f2427q, AbstractC0584a.m908i(this.f2425p, AbstractC0584a.m908i(this.f2423o, AbstractC0584a.m908i(this.f2421n, AbstractC0584a.m902c(this.f2419m, AbstractC0584a.m908i(this.f2417l, AbstractC0584a.m908i(this.f2415k, AbstractC0584a.m908i(this.f2413j, (this.f2411i.hashCode() + ((this.f2409h.hashCode() + AbstractC0584a.m901b(this.f2407g, AbstractC0584a.m901b(this.f2405f, AbstractC0584a.m901b(this.f2403e, (this.f2401d.hashCode() + ((this.f2399c.hashCode() + AbstractC0584a.m908i(this.f2398b, Boolean.hashCode(this.f2397a) * 31, 31)) * 31)) * 31, 31), 31), 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31);
        Integer num = this.f2385O;
        int iHashCode = (iM902c + (num == null ? 0 : num.hashCode())) * 31;
        Uri uri = this.f2386P;
        int iM908i = AbstractC0584a.m908i(this.f2392V, (this.f2391U.hashCode() + AbstractC0584a.m902c(this.f2390T, AbstractC0584a.m902c(this.f2389S, AbstractC0584a.m902c(this.f2388R, (this.f2387Q.hashCode() + ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31)) * 31, 31), 31), 31)) * 31, 31);
        Rect rect = this.f2393W;
        int iM908i2 = AbstractC0584a.m908i(this.f2406f0, AbstractC0584a.m908i(this.f2404e0, AbstractC0584a.m902c(this.f2402d0, AbstractC0584a.m908i(this.f2400c0, AbstractC0584a.m908i(this.f2396Z, AbstractC0584a.m908i(this.f2395Y, AbstractC0584a.m902c(this.f2394X, (iM908i + (rect == null ? 0 : rect.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31);
        CharSequence charSequence = this.f2408g0;
        int iM908i3 = AbstractC0584a.m908i(this.f2414j0, AbstractC0584a.m908i(this.f2412i0, AbstractC0584a.m902c(this.f2410h0, (iM908i2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31), 31), 31);
        String str = this.f2416k0;
        int iHashCode2 = (iM908i3 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f2418l0;
        int iM902c2 = AbstractC0584a.m902c(this.f2422n0, AbstractC0584a.m901b(this.f2420m0, (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
        String str2 = this.f2424o0;
        int iM902c3 = AbstractC0584a.m902c(this.f2426p0, (iM902c2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num2 = this.f2428q0;
        int iHashCode3 = (iM902c3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f2430r0;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f2432s0;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f2434t0;
        return iHashCode5 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        int i = this.f2419m;
        boolean z8 = this.f2421n;
        boolean z9 = this.f2423o;
        float f = this.f2431s;
        int i8 = this.f2438x;
        int i9 = this.f2372B;
        StringBuilder sb = new StringBuilder("CropImageOptions(imageSourceIncludeGallery=");
        sb.append(this.f2397a);
        sb.append(", imageSourceIncludeCamera=");
        sb.append(this.f2398b);
        sb.append(", cropShape=");
        sb.append(this.f2399c);
        sb.append(", cornerShape=");
        sb.append(this.f2401d);
        sb.append(", cropCornerRadius=");
        sb.append(this.f2403e);
        sb.append(", snapRadius=");
        sb.append(this.f2405f);
        sb.append(", touchRadius=");
        sb.append(this.f2407g);
        sb.append(", guidelines=");
        sb.append(this.f2409h);
        sb.append(", scaleType=");
        sb.append(this.f2411i);
        sb.append(", showCropOverlay=");
        sb.append(this.f2413j);
        sb.append(", showCropLabel=");
        AbstractC1923c.m1058v(", showProgressBar=", ", progressBarColor=", sb, this.f2415k, this.f2417l);
        sb.append(i);
        sb.append(", autoZoomEnabled=");
        sb.append(z8);
        sb.append(", multiTouchEnabled=");
        AbstractC1923c.m1058v(", centerMoveEnabled=", ", canChangeCropWindow=", sb, z9, this.f2425p);
        sb.append(this.f2427q);
        sb.append(", maxZoom=");
        sb.append(this.f2429r);
        sb.append(", initialCropWindowPaddingRatio=");
        sb.append(f);
        sb.append(", fixAspectRatio=");
        sb.append(this.f2433t);
        sb.append(", aspectRatioX=");
        AbstractC1923c.m1059w(sb, this.f2435u, ", aspectRatioY=", this.f2436v, ", borderLineThickness=");
        sb.append(this.f2437w);
        sb.append(", borderLineColor=");
        sb.append(i8);
        sb.append(", borderCornerThickness=");
        sb.append(this.f2439y);
        sb.append(", borderCornerOffset=");
        sb.append(this.f2440z);
        sb.append(", borderCornerLength=");
        sb.append(this.f2371A);
        sb.append(", borderCornerColor=");
        sb.append(i9);
        sb.append(", circleCornerFillColorHexValue=");
        sb.append(this.f2373C);
        sb.append(", guidelinesThickness=");
        sb.append(this.f2374D);
        sb.append(", guidelinesColor=");
        AbstractC1923c.m1059w(sb, this.f2375E, ", backgroundColor=", this.f2376F, ", minCropWindowWidth=");
        AbstractC1923c.m1059w(sb, this.f2377G, ", minCropWindowHeight=", this.f2378H, ", minCropResultWidth=");
        AbstractC1923c.m1059w(sb, this.f2379I, ", minCropResultHeight=", this.f2380J, ", maxCropResultWidth=");
        AbstractC1923c.m1059w(sb, this.f2381K, ", maxCropResultHeight=", this.f2382L, ", activityTitle=");
        sb.append((Object) this.f2383M);
        sb.append(", activityMenuIconColor=");
        sb.append(this.f2384N);
        sb.append(", activityMenuTextColor=");
        sb.append(this.f2385O);
        sb.append(", customOutputUri=");
        sb.append(this.f2386P);
        sb.append(", outputCompressFormat=");
        sb.append(this.f2387Q);
        sb.append(", outputCompressQuality=");
        sb.append(this.f2388R);
        sb.append(", outputRequestWidth=");
        AbstractC1923c.m1059w(sb, this.f2389S, ", outputRequestHeight=", this.f2390T, ", outputRequestSizeOptions=");
        sb.append(this.f2391U);
        sb.append(", noOutputImage=");
        sb.append(this.f2392V);
        sb.append(", initialCropWindowRectangle=");
        sb.append(this.f2393W);
        sb.append(", initialRotation=");
        sb.append(this.f2394X);
        sb.append(", allowRotation=");
        AbstractC1923c.m1058v(", allowFlipping=", ", allowCounterRotation=", sb, this.f2395Y, this.f2396Z);
        sb.append(this.f2400c0);
        sb.append(", rotationDegrees=");
        sb.append(this.f2402d0);
        sb.append(", flipHorizontally=");
        AbstractC1923c.m1058v(", flipVertically=", ", cropMenuCropButtonTitle=", sb, this.f2404e0, this.f2406f0);
        sb.append((Object) this.f2408g0);
        sb.append(", cropMenuCropButtonIcon=");
        sb.append(this.f2410h0);
        sb.append(", skipEditing=");
        AbstractC1923c.m1058v(", showIntentChooser=", ", intentChooserTitle=", sb, this.f2412i0, this.f2414j0);
        sb.append(this.f2416k0);
        sb.append(", intentChooserPriorityList=");
        sb.append(this.f2418l0);
        sb.append(", cropperLabelTextSize=");
        sb.append(this.f2420m0);
        sb.append(", cropperLabelTextColor=");
        sb.append(this.f2422n0);
        sb.append(", cropperLabelText=");
        sb.append(this.f2424o0);
        sb.append(", activityBackgroundColor=");
        sb.append(this.f2426p0);
        sb.append(", toolbarColor=");
        sb.append(this.f2428q0);
        sb.append(", toolbarTitleColor=");
        sb.append(this.f2430r0);
        sb.append(", toolbarBackButtonColor=");
        sb.append(this.f2432s0);
        sb.append(", toolbarTintColor=");
        sb.append(this.f2434t0);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        AbstractC5830k.m5330g(dest, "dest");
        dest.writeInt(this.f2397a ? 1 : 0);
        dest.writeInt(this.f2398b ? 1 : 0);
        dest.writeString(this.f2399c.name());
        dest.writeString(this.f2401d.name());
        dest.writeFloat(this.f2403e);
        dest.writeFloat(this.f2405f);
        dest.writeFloat(this.f2407g);
        dest.writeString(this.f2409h.name());
        dest.writeString(this.f2411i.name());
        dest.writeInt(this.f2413j ? 1 : 0);
        dest.writeInt(this.f2415k ? 1 : 0);
        dest.writeInt(this.f2417l ? 1 : 0);
        dest.writeInt(this.f2419m);
        dest.writeInt(this.f2421n ? 1 : 0);
        dest.writeInt(this.f2423o ? 1 : 0);
        dest.writeInt(this.f2425p ? 1 : 0);
        dest.writeInt(this.f2427q ? 1 : 0);
        dest.writeInt(this.f2429r);
        dest.writeFloat(this.f2431s);
        dest.writeInt(this.f2433t ? 1 : 0);
        dest.writeInt(this.f2435u);
        dest.writeInt(this.f2436v);
        dest.writeFloat(this.f2437w);
        dest.writeInt(this.f2438x);
        dest.writeFloat(this.f2439y);
        dest.writeFloat(this.f2440z);
        dest.writeFloat(this.f2371A);
        dest.writeInt(this.f2372B);
        dest.writeInt(this.f2373C);
        dest.writeFloat(this.f2374D);
        dest.writeInt(this.f2375E);
        dest.writeInt(this.f2376F);
        dest.writeInt(this.f2377G);
        dest.writeInt(this.f2378H);
        dest.writeInt(this.f2379I);
        dest.writeInt(this.f2380J);
        dest.writeInt(this.f2381K);
        dest.writeInt(this.f2382L);
        TextUtils.writeToParcel(this.f2383M, dest, i);
        dest.writeInt(this.f2384N);
        Integer num = this.f2385O;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeParcelable(this.f2386P, i);
        dest.writeString(this.f2387Q.name());
        dest.writeInt(this.f2388R);
        dest.writeInt(this.f2389S);
        dest.writeInt(this.f2390T);
        dest.writeString(this.f2391U.name());
        dest.writeInt(this.f2392V ? 1 : 0);
        dest.writeParcelable(this.f2393W, i);
        dest.writeInt(this.f2394X);
        dest.writeInt(this.f2395Y ? 1 : 0);
        dest.writeInt(this.f2396Z ? 1 : 0);
        dest.writeInt(this.f2400c0 ? 1 : 0);
        dest.writeInt(this.f2402d0);
        dest.writeInt(this.f2404e0 ? 1 : 0);
        dest.writeInt(this.f2406f0 ? 1 : 0);
        TextUtils.writeToParcel(this.f2408g0, dest, i);
        dest.writeInt(this.f2410h0);
        dest.writeInt(this.f2412i0 ? 1 : 0);
        dest.writeInt(this.f2414j0 ? 1 : 0);
        dest.writeString(this.f2416k0);
        dest.writeStringList(this.f2418l0);
        dest.writeFloat(this.f2420m0);
        dest.writeInt(this.f2422n0);
        dest.writeString(this.f2424o0);
        dest.writeInt(this.f2426p0);
        Integer num2 = this.f2428q0;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.f2430r0;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Integer num4 = this.f2432s0;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        Integer num5 = this.f2434t0;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num5.intValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CropImageOptions(CropImageView.CropShape cropShape, CropImageView.CropCornerShape cropCornerShape, float f, float f7, float f8, CropImageView.Guidelines guidelines, CropImageView.ScaleType scaleType, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i, float f9, boolean z14, int i8, int i9, float f10, int i10, float f11, float f12, float f13, int i11, int i12, float f14, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, boolean z15, boolean z16, float f15, int i21, String str, int i22, int i23, int i24) {
        int i25;
        float fApplyDimension;
        boolean z17;
        int iArgb;
        CropImageView.CropShape cropShape2 = (i22 & 4) != 0 ? CropImageView.CropShape.RECTANGLE : cropShape;
        CropImageView.CropCornerShape cropCornerShape2 = (i22 & 8) != 0 ? CropImageView.CropCornerShape.RECTANGLE : cropCornerShape;
        float fApplyDimension2 = (i22 & 16) != 0 ? TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics()) : f;
        float fApplyDimension3 = (i22 & 32) != 0 ? TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics()) : f7;
        float fApplyDimension4 = (i22 & 64) != 0 ? TypedValue.applyDimension(1, 24.0f, Resources.getSystem().getDisplayMetrics()) : f8;
        CropImageView.Guidelines guidelines2 = (i22 & 128) != 0 ? CropImageView.Guidelines.f2485ON : guidelines;
        CropImageView.ScaleType scaleType2 = (i22 & 256) != 0 ? CropImageView.ScaleType.FIT_CENTER : scaleType;
        boolean z18 = (i22 & 512) != 0 ? true : z8;
        boolean z19 = (i22 & 1024) != 0 ? false : z9;
        boolean z20 = (i22 & 2048) != 0 ? true : z10;
        int iRgb = Color.rgb(153, 51, 153);
        boolean z21 = (i22 & 8192) != 0 ? true : z11;
        boolean z22 = (i22 & 16384) != 0 ? false : z12;
        boolean z23 = (32768 & i22) != 0 ? true : z13;
        int i26 = (131072 & i22) != 0 ? 4 : i;
        float f16 = (262144 & i22) != 0 ? 0.0f : f9;
        boolean z24 = (524288 & i22) != 0 ? false : z14;
        int i27 = (1048576 & i22) != 0 ? 1 : i8;
        int i28 = (2097152 & i22) != 0 ? 1 : i9;
        if ((i22 & 4194304) != 0) {
            i25 = 4194304;
            fApplyDimension = TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            i25 = 4194304;
            fApplyDimension = f10;
        }
        int iArgb2 = (i22 & 8388608) != 0 ? Color.argb(170, 255, 255, 255) : i10;
        float fApplyDimension5 = (16777216 & i22) != 0 ? TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics()) : f11;
        float fApplyDimension6 = (33554432 & i22) != 0 ? TypedValue.applyDimension(1, 5.0f, Resources.getSystem().getDisplayMetrics()) : f12;
        float fApplyDimension7 = (67108864 & i22) != 0 ? TypedValue.applyDimension(1, 14.0f, Resources.getSystem().getDisplayMetrics()) : f13;
        int i29 = (134217728 & i22) != 0 ? -1 : i11;
        int i30 = (268435456 & i22) != 0 ? -1 : i12;
        float fApplyDimension8 = (536870912 & i22) != 0 ? TypedValue.applyDimension(1, 1.0f, Resources.getSystem().getDisplayMetrics()) : f14;
        int iArgb3 = (i22 & BasicMeasure.EXACTLY) != 0 ? Color.argb(170, 255, 255, 255) : i13;
        if ((i22 & Integer.MIN_VALUE) != 0) {
            z17 = false;
            iArgb = Color.argb(119, 0, 0, 0);
        } else {
            z17 = false;
            iArgb = i14;
        }
        this(true, true, cropShape2, cropCornerShape2, fApplyDimension2, fApplyDimension3, fApplyDimension4, guidelines2, scaleType2, z18, z19, z20, iRgb, z21, z22, z23, true, i26, f16, z24, i27, i28, fApplyDimension, iArgb2, fApplyDimension5, fApplyDimension6, fApplyDimension7, i29, i30, fApplyDimension8, iArgb3, iArgb, (i23 & 1) != 0 ? (int) TypedValue.applyDimension(1, 42.0f, Resources.getSystem().getDisplayMetrics()) : i15, (i23 & 2) != 0 ? (int) TypedValue.applyDimension(1, 42.0f, Resources.getSystem().getDisplayMetrics()) : i16, (i23 & 4) != 0 ? 40 : i17, (i23 & 8) != 0 ? 40 : i18, (i23 & 16) != 0 ? 99999 : i19, (i23 & 32) != 0 ? 99999 : i20, "", 0, null, null, Bitmap.CompressFormat.JPEG, 90, 0, 0, CropImageView.RequestSizeOptions.NONE, false, null, -1, true, true, false, 90, (i23 & i25) != 0 ? z17 : z15, (i23 & 8388608) != 0 ? z17 : z16, null, 0, false, false, null, EmptyList.INSTANCE, (i23 & BasicMeasure.EXACTLY) != 0 ? TypedValue.applyDimension(2, 20.0f, Resources.getSystem().getDisplayMetrics()) : f15, (i23 & Integer.MIN_VALUE) != 0 ? -1 : i21, (i24 & 1) != 0 ? "" : str, -1, null, null, null, null);
    }
}
