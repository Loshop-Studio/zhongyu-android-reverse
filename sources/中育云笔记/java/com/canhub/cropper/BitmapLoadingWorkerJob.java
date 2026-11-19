package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
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
public final class BitmapLoadingWorkerJob implements InterfaceC11122i0 {

    /* renamed from: c */
    public final Context f5112c;

    /* renamed from: d */
    public final Uri f5113d;

    /* renamed from: e */
    public final int f5114e;

    /* renamed from: f */
    public final int f5115f;

    /* renamed from: g */
    public final WeakReference f5116g;

    /* renamed from: h */
    public InterfaceC10045g f5117h;

    /* renamed from: com.canhub.cropper.BitmapLoadingWorkerJob$a */
    public static final class C5878a {

        /* renamed from: a */
        public final Uri f5118a;

        /* renamed from: b */
        public final Bitmap f5119b;

        /* renamed from: c */
        public final int f5120c;

        /* renamed from: d */
        public final int f5121d;

        /* renamed from: e */
        public final boolean f5122e;

        /* renamed from: f */
        public final boolean f5123f;

        /* renamed from: g */
        public final Exception f5124g;

        public C5878a(Uri uri, Bitmap bitmap, int i10, int i11, boolean z10, boolean z11, Exception exc) {
            AbstractC9979u.m20294g(uri, "uri");
            this.f5118a = uri;
            this.f5119b = bitmap;
            this.f5120c = i10;
            this.f5121d = i11;
            this.f5122e = z10;
            this.f5123f = z11;
            this.f5124g = exc;
        }

        /* renamed from: a */
        public final Bitmap m4432a() {
            return this.f5119b;
        }

        /* renamed from: b */
        public final int m4433b() {
            return this.f5121d;
        }

        /* renamed from: c */
        public final Exception m4434c() {
            return this.f5124g;
        }

        /* renamed from: d */
        public final boolean m4435d() {
            return this.f5122e;
        }

        /* renamed from: e */
        public final boolean m4436e() {
            return this.f5123f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5878a)) {
                return false;
            }
            C5878a c5878a = (C5878a) obj;
            return AbstractC9979u.m20289b(this.f5118a, c5878a.f5118a) && AbstractC9979u.m20289b(this.f5119b, c5878a.f5119b) && this.f5120c == c5878a.f5120c && this.f5121d == c5878a.f5121d && this.f5122e == c5878a.f5122e && this.f5123f == c5878a.f5123f && AbstractC9979u.m20289b(this.f5124g, c5878a.f5124g);
        }

        /* renamed from: f */
        public final int m4437f() {
            return this.f5120c;
        }

        /* renamed from: g */
        public final Uri m4438g() {
            return this.f5118a;
        }

        public int hashCode() {
            int iHashCode = this.f5118a.hashCode() * 31;
            Bitmap bitmap = this.f5119b;
            int iHashCode2 = (((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Integer.hashCode(this.f5120c)) * 31) + Integer.hashCode(this.f5121d)) * 31) + Boolean.hashCode(this.f5122e)) * 31) + Boolean.hashCode(this.f5123f)) * 31;
            Exception exc = this.f5124g;
            return iHashCode2 + (exc != null ? exc.hashCode() : 0);
        }

        public String toString() {
            return "Result(uri=" + this.f5118a + ", bitmap=" + this.f5119b + ", loadSampleSize=" + this.f5120c + ", degreesRotated=" + this.f5121d + ", flipHorizontally=" + this.f5122e + ", flipVertically=" + this.f5123f + ", error=" + this.f5124g + ")";
        }
    }

    public BitmapLoadingWorkerJob(Context context, CropImageView cropImageView, Uri uri) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(cropImageView, "cropImageView");
        AbstractC9979u.m20294g(uri, "uri");
        this.f5112c = context;
        this.f5113d = uri;
        this.f5116g = new WeakReference(cropImageView);
        this.f5117h = JobKt__JobKt.m20385b(null, 1, null);
        float f10 = cropImageView.getResources().getDisplayMetrics().density;
        double d10 = f10 > 1.0f ? 1.0d / f10 : 1.0d;
        this.f5114e = (int) (r3.widthPixels * d10);
        this.f5115f = (int) (r3.heightPixels * d10);
    }

    /* renamed from: f */
    public final void m4428f() {
        InterfaceC10045g.a.m20900a(this.f5117h, null, 1, null);
    }

    /* renamed from: g */
    public final Uri m4429g() {
        return this.f5113d;
    }

    @Override // sd.InterfaceC11122i0
    public InterfaceC9945d getCoroutineContext() {
        return C11157r0.m24800c().plus(this.f5117h);
    }

    /* renamed from: h */
    public final Object m4430h(C5878a c5878a, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24800c(), new BitmapLoadingWorkerJob$onPostExecute$2(this, c5878a, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* renamed from: i */
    public final void m4431i() {
        this.f5117h = AbstractC11117h.m24726d(this, C11157r0.m24798a(), null, new BitmapLoadingWorkerJob$start$1(this, null), 2, null);
    }
}
