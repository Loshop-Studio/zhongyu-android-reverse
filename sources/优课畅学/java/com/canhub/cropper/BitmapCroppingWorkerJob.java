package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.canhub.cropper.CropImageView;
import java.lang.ref.WeakReference;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.JobKt__JobKt;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.AbstractC8839h;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;

/* loaded from: classes3.dex */
public final class BitmapCroppingWorkerJob implements InterfaceC8822b0 {

    /* renamed from: a */
    public final Context f3307a;

    /* renamed from: b */
    public final WeakReference f3308b;

    /* renamed from: c */
    public final Uri f3309c;

    /* renamed from: d */
    public final Bitmap f3310d;

    /* renamed from: e */
    public final float[] f3311e;

    /* renamed from: f */
    public final int f3312f;

    /* renamed from: g */
    public final int f3313g;

    /* renamed from: h */
    public final int f3314h;

    /* renamed from: i */
    public final boolean f3315i;

    /* renamed from: j */
    public final int f3316j;

    /* renamed from: k */
    public final int f3317k;

    /* renamed from: l */
    public final int f3318l;

    /* renamed from: m */
    public final int f3319m;

    /* renamed from: n */
    public final boolean f3320n;

    /* renamed from: o */
    public final boolean f3321o;

    /* renamed from: p */
    public final CropImageView.RequestSizeOptions f3322p;

    /* renamed from: q */
    public final Bitmap.CompressFormat f3323q;

    /* renamed from: r */
    public final int f3324r;

    /* renamed from: s */
    public final Uri f3325s;

    /* renamed from: t */
    public InterfaceC9212n f3326t;

    /* renamed from: com.canhub.cropper.BitmapCroppingWorkerJob$a */
    public static final class C5457a {

        /* renamed from: a */
        public final Bitmap f3327a;

        /* renamed from: b */
        public final Uri f3328b;

        /* renamed from: c */
        public final Exception f3329c;

        /* renamed from: d */
        public final int f3330d;

        public C5457a(Bitmap bitmap, Uri uri, Exception exc, int i10) {
            this.f3327a = bitmap;
            this.f3328b = uri;
            this.f3329c = exc;
            this.f3330d = i10;
        }

        /* renamed from: a */
        public final Bitmap m3217a() {
            return this.f3327a;
        }

        /* renamed from: b */
        public final Exception m3218b() {
            return this.f3329c;
        }

        /* renamed from: c */
        public final int m3219c() {
            return this.f3330d;
        }

        /* renamed from: d */
        public final Uri m3220d() {
            return this.f3328b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5457a)) {
                return false;
            }
            C5457a c5457a = (C5457a) obj;
            return AbstractC9133u.m16128b(this.f3327a, c5457a.f3327a) && AbstractC9133u.m16128b(this.f3328b, c5457a.f3328b) && AbstractC9133u.m16128b(this.f3329c, c5457a.f3329c) && this.f3330d == c5457a.f3330d;
        }

        public int hashCode() {
            Bitmap bitmap = this.f3327a;
            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            Uri uri = this.f3328b;
            int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
            Exception exc = this.f3329c;
            return ((iHashCode2 + (exc != null ? exc.hashCode() : 0)) * 31) + Integer.hashCode(this.f3330d);
        }

        public String toString() {
            return "Result(bitmap=" + this.f3327a + ", uri=" + this.f3328b + ", error=" + this.f3329c + ", sampleSize=" + this.f3330d + ")";
        }
    }

    public BitmapCroppingWorkerJob(Context context, WeakReference cropImageViewReference, Uri uri, Bitmap bitmap, float[] cropPoints, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, boolean z11, boolean z12, CropImageView.RequestSizeOptions options, Bitmap.CompressFormat saveCompressFormat, int i17, Uri uri2) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(cropImageViewReference, "cropImageViewReference");
        AbstractC9133u.m16133g(cropPoints, "cropPoints");
        AbstractC9133u.m16133g(options, "options");
        AbstractC9133u.m16133g(saveCompressFormat, "saveCompressFormat");
        this.f3307a = context;
        this.f3308b = cropImageViewReference;
        this.f3309c = uri;
        this.f3310d = bitmap;
        this.f3311e = cropPoints;
        this.f3312f = i10;
        this.f3313g = i11;
        this.f3314h = i12;
        this.f3315i = z10;
        this.f3316j = i13;
        this.f3317k = i14;
        this.f3318l = i15;
        this.f3319m = i16;
        this.f3320n = z11;
        this.f3321o = z12;
        this.f3322p = options;
        this.f3323q = saveCompressFormat;
        this.f3324r = i17;
        this.f3325s = uri2;
        this.f3326t = JobKt__JobKt.m16233b(null, 1, null);
    }

    @Override // p135i8.InterfaceC8822b0
    public InterfaceC9100d getCoroutineContext() {
        return C8843i0.m14868c().plus(this.f3326t);
    }

    /* renamed from: u */
    public final void m3214u() {
        InterfaceC9212n.a.m16777a(this.f3326t, null, 1, null);
    }

    /* renamed from: v */
    public final Object m3215v(C5457a c5457a, InterfaceC9324c interfaceC9324c) {
        Object objM14848g = AbstractC8833f.m14848g(C8843i0.m14868c(), new BitmapCroppingWorkerJob$onPostExecute$2(this, c5457a, null), interfaceC9324c);
        return objM14848g == AbstractC9434a.m17291f() ? objM14848g : C8736p.f16368a;
    }

    /* renamed from: w */
    public final void m3216w() {
        this.f3326t = AbstractC8839h.m14861d(this, C8843i0.m14866a(), null, new BitmapCroppingWorkerJob$start$1(this, null), 2, null);
    }
}
