package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
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
public final class BitmapLoadingWorkerJob implements InterfaceC8822b0 {

    /* renamed from: a */
    public final Context f3342a;

    /* renamed from: b */
    public final Uri f3343b;

    /* renamed from: c */
    public final int f3344c;

    /* renamed from: d */
    public final int f3345d;

    /* renamed from: e */
    public final WeakReference f3346e;

    /* renamed from: f */
    public InterfaceC9212n f3347f;

    /* renamed from: com.canhub.cropper.BitmapLoadingWorkerJob$a */
    public static final class C5459a {

        /* renamed from: a */
        public final Uri f3348a;

        /* renamed from: b */
        public final Bitmap f3349b;

        /* renamed from: c */
        public final int f3350c;

        /* renamed from: d */
        public final int f3351d;

        /* renamed from: e */
        public final boolean f3352e;

        /* renamed from: f */
        public final boolean f3353f;

        /* renamed from: g */
        public final Exception f3354g;

        public C5459a(Uri uri, Bitmap bitmap, int i10, int i11, boolean z10, boolean z11, Exception exc) {
            AbstractC9133u.m16133g(uri, "uri");
            this.f3348a = uri;
            this.f3349b = bitmap;
            this.f3350c = i10;
            this.f3351d = i11;
            this.f3352e = z10;
            this.f3353f = z11;
            this.f3354g = exc;
        }

        /* renamed from: a */
        public final Bitmap m3230a() {
            return this.f3349b;
        }

        /* renamed from: b */
        public final int m3231b() {
            return this.f3351d;
        }

        /* renamed from: c */
        public final Exception m3232c() {
            return this.f3354g;
        }

        /* renamed from: d */
        public final boolean m3233d() {
            return this.f3352e;
        }

        /* renamed from: e */
        public final boolean m3234e() {
            return this.f3353f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5459a)) {
                return false;
            }
            C5459a c5459a = (C5459a) obj;
            return AbstractC9133u.m16128b(this.f3348a, c5459a.f3348a) && AbstractC9133u.m16128b(this.f3349b, c5459a.f3349b) && this.f3350c == c5459a.f3350c && this.f3351d == c5459a.f3351d && this.f3352e == c5459a.f3352e && this.f3353f == c5459a.f3353f && AbstractC9133u.m16128b(this.f3354g, c5459a.f3354g);
        }

        /* renamed from: f */
        public final int m3235f() {
            return this.f3350c;
        }

        /* renamed from: g */
        public final Uri m3236g() {
            return this.f3348a;
        }

        public int hashCode() {
            int iHashCode = this.f3348a.hashCode() * 31;
            Bitmap bitmap = this.f3349b;
            int iHashCode2 = (((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Integer.hashCode(this.f3350c)) * 31) + Integer.hashCode(this.f3351d)) * 31) + Boolean.hashCode(this.f3352e)) * 31) + Boolean.hashCode(this.f3353f)) * 31;
            Exception exc = this.f3354g;
            return iHashCode2 + (exc != null ? exc.hashCode() : 0);
        }

        public String toString() {
            return "Result(uri=" + this.f3348a + ", bitmap=" + this.f3349b + ", loadSampleSize=" + this.f3350c + ", degreesRotated=" + this.f3351d + ", flipHorizontally=" + this.f3352e + ", flipVertically=" + this.f3353f + ", error=" + this.f3354g + ")";
        }
    }

    public BitmapLoadingWorkerJob(Context context, CropImageView cropImageView, Uri uri) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(cropImageView, "cropImageView");
        AbstractC9133u.m16133g(uri, "uri");
        this.f3342a = context;
        this.f3343b = uri;
        this.f3346e = new WeakReference(cropImageView);
        this.f3347f = JobKt__JobKt.m16233b(null, 1, null);
        float f10 = cropImageView.getResources().getDisplayMetrics().density;
        double d10 = f10 > 1.0f ? 1.0d / f10 : 1.0d;
        this.f3344c = (int) (r3.widthPixels * d10);
        this.f3345d = (int) (r3.heightPixels * d10);
    }

    /* renamed from: f */
    public final void m3226f() {
        InterfaceC9212n.a.m16777a(this.f3347f, null, 1, null);
    }

    /* renamed from: g */
    public final Uri m3227g() {
        return this.f3343b;
    }

    @Override // p135i8.InterfaceC8822b0
    public InterfaceC9100d getCoroutineContext() {
        return C8843i0.m14868c().plus(this.f3347f);
    }

    /* renamed from: h */
    public final Object m3228h(C5459a c5459a, InterfaceC9324c interfaceC9324c) {
        Object objM14848g = AbstractC8833f.m14848g(C8843i0.m14868c(), new BitmapLoadingWorkerJob$onPostExecute$2(this, c5459a, null), interfaceC9324c);
        return objM14848g == AbstractC9434a.m17291f() ? objM14848g : C8736p.f16368a;
    }

    /* renamed from: i */
    public final void m3229i() {
        this.f3347f = AbstractC8839h.m14861d(this, C8843i0.m14866a(), null, new BitmapLoadingWorkerJob$start$1(this, null), 2, null);
    }
}
