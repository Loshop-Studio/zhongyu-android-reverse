package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.canhub.cropper.CropImageView;
import java.lang.ref.WeakReference;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.JobKt__JobKt;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import sd.AbstractC11109f;
import sd.AbstractC11117h;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class BitmapCroppingWorkerJob implements InterfaceC11122i0 {

    /* renamed from: c */
    public final Context f5077c;

    /* renamed from: d */
    public final WeakReference f5078d;

    /* renamed from: e */
    public final Uri f5079e;

    /* renamed from: f */
    public final Bitmap f5080f;

    /* renamed from: g */
    public final float[] f5081g;

    /* renamed from: h */
    public final int f5082h;

    /* renamed from: i */
    public final int f5083i;

    /* renamed from: j */
    public final int f5084j;

    /* renamed from: k */
    public final boolean f5085k;

    /* renamed from: l */
    public final int f5086l;

    /* renamed from: m */
    public final int f5087m;

    /* renamed from: n */
    public final int f5088n;

    /* renamed from: o */
    public final int f5089o;

    /* renamed from: p */
    public final boolean f5090p;

    /* renamed from: q */
    public final boolean f5091q;

    /* renamed from: r */
    public final CropImageView.RequestSizeOptions f5092r;

    /* renamed from: s */
    public final Bitmap.CompressFormat f5093s;

    /* renamed from: t */
    public final int f5094t;

    /* renamed from: u */
    public final Uri f5095u;

    /* renamed from: v */
    public InterfaceC10045g f5096v;

    /* renamed from: com.canhub.cropper.BitmapCroppingWorkerJob$a */
    public static final class C5876a {

        /* renamed from: a */
        public final Bitmap f5097a;

        /* renamed from: b */
        public final Uri f5098b;

        /* renamed from: c */
        public final Exception f5099c;

        /* renamed from: d */
        public final int f5100d;

        public C5876a(Bitmap bitmap, Uri uri, Exception exc, int i10) {
            this.f5097a = bitmap;
            this.f5098b = uri;
            this.f5099c = exc;
            this.f5100d = i10;
        }

        /* renamed from: a */
        public final Bitmap m4419a() {
            return this.f5097a;
        }

        /* renamed from: b */
        public final Exception m4420b() {
            return this.f5099c;
        }

        /* renamed from: c */
        public final int m4421c() {
            return this.f5100d;
        }

        /* renamed from: d */
        public final Uri m4422d() {
            return this.f5098b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5876a)) {
                return false;
            }
            C5876a c5876a = (C5876a) obj;
            return AbstractC9979u.m20289b(this.f5097a, c5876a.f5097a) && AbstractC9979u.m20289b(this.f5098b, c5876a.f5098b) && AbstractC9979u.m20289b(this.f5099c, c5876a.f5099c) && this.f5100d == c5876a.f5100d;
        }

        public int hashCode() {
            Bitmap bitmap = this.f5097a;
            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            Uri uri = this.f5098b;
            int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
            Exception exc = this.f5099c;
            return ((iHashCode2 + (exc != null ? exc.hashCode() : 0)) * 31) + Integer.hashCode(this.f5100d);
        }

        public String toString() {
            return "Result(bitmap=" + this.f5097a + ", uri=" + this.f5098b + ", error=" + this.f5099c + ", sampleSize=" + this.f5100d + ")";
        }
    }

    public BitmapCroppingWorkerJob(Context context, WeakReference cropImageViewReference, Uri uri, Bitmap bitmap, float[] cropPoints, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, boolean z11, boolean z12, CropImageView.RequestSizeOptions options, Bitmap.CompressFormat saveCompressFormat, int i17, Uri uri2) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(cropImageViewReference, "cropImageViewReference");
        AbstractC9979u.m20294g(cropPoints, "cropPoints");
        AbstractC9979u.m20294g(options, "options");
        AbstractC9979u.m20294g(saveCompressFormat, "saveCompressFormat");
        this.f5077c = context;
        this.f5078d = cropImageViewReference;
        this.f5079e = uri;
        this.f5080f = bitmap;
        this.f5081g = cropPoints;
        this.f5082h = i10;
        this.f5083i = i11;
        this.f5084j = i12;
        this.f5085k = z10;
        this.f5086l = i13;
        this.f5087m = i14;
        this.f5088n = i15;
        this.f5089o = i16;
        this.f5090p = z11;
        this.f5091q = z12;
        this.f5092r = options;
        this.f5093s = saveCompressFormat;
        this.f5094t = i17;
        this.f5095u = uri2;
        this.f5096v = JobKt__JobKt.m20385b(null, 1, null);
    }

    @Override // sd.InterfaceC11122i0
    public InterfaceC9945d getCoroutineContext() {
        return C11157r0.m24800c().plus(this.f5096v);
    }

    /* renamed from: u */
    public final void m4416u() {
        InterfaceC10045g.a.m20900a(this.f5096v, null, 1, null);
    }

    /* renamed from: v */
    public final Object m4417v(C5876a c5876a, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24800c(), new BitmapCroppingWorkerJob$onPostExecute$2(this, c5876a, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* renamed from: w */
    public final void m4418w() {
        this.f5096v = AbstractC11117h.m24726d(this, C11157r0.m24798a(), null, new BitmapCroppingWorkerJob$start$1(this, null), 2, null);
    }
}
