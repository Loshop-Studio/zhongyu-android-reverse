package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.canhub.cropper.CropImageView;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes3.dex */
public final class BitmapCroppingWorkerJob implements CoroutineScope {

    /* renamed from: a */
    public final Context f3874a;

    /* renamed from: b */
    public final WeakReference f3875b;

    /* renamed from: c */
    public final Uri f3876c;

    /* renamed from: d */
    public final Bitmap f3877d;

    /* renamed from: e */
    public final float[] f3878e;

    /* renamed from: f */
    public final int f3879f;

    /* renamed from: g */
    public final int f3880g;

    /* renamed from: h */
    public final int f3881h;

    /* renamed from: i */
    public final boolean f3882i;

    /* renamed from: j */
    public final int f3883j;

    /* renamed from: k */
    public final int f3884k;

    /* renamed from: l */
    public final int f3885l;

    /* renamed from: m */
    public final int f3886m;

    /* renamed from: n */
    public final boolean f3887n;

    /* renamed from: o */
    public final boolean f3888o;

    /* renamed from: p */
    public final CropImageView.RequestSizeOptions f3889p;

    /* renamed from: q */
    public final Bitmap.CompressFormat f3890q;

    /* renamed from: r */
    public final int f3891r;

    /* renamed from: s */
    public final Uri f3892s;

    /* renamed from: t */
    public Job f3893t;

    /* renamed from: com.canhub.cropper.BitmapCroppingWorkerJob$a */
    public static final class C5408a {

        /* renamed from: a */
        public final Bitmap f3894a;

        /* renamed from: b */
        public final Uri f3895b;

        /* renamed from: c */
        public final Exception f3896c;

        /* renamed from: d */
        public final int f3897d;

        public C5408a(Bitmap bitmap, Uri uri, Exception exc, int i10) {
            this.f3894a = bitmap;
            this.f3895b = uri;
            this.f3896c = exc;
            this.f3897d = i10;
        }

        /* renamed from: a */
        public final Bitmap m3773a() {
            return this.f3894a;
        }

        /* renamed from: b */
        public final Exception m3774b() {
            return this.f3896c;
        }

        /* renamed from: c */
        public final int m3775c() {
            return this.f3897d;
        }

        /* renamed from: d */
        public final Uri m3776d() {
            return this.f3895b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5408a)) {
                return false;
            }
            C5408a c5408a = (C5408a) obj;
            return Intrinsics.areEqual(this.f3894a, c5408a.f3894a) && Intrinsics.areEqual(this.f3895b, c5408a.f3895b) && Intrinsics.areEqual(this.f3896c, c5408a.f3896c) && this.f3897d == c5408a.f3897d;
        }

        public int hashCode() {
            Bitmap bitmap = this.f3894a;
            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            Uri uri = this.f3895b;
            int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
            Exception exc = this.f3896c;
            return ((iHashCode2 + (exc != null ? exc.hashCode() : 0)) * 31) + Integer.hashCode(this.f3897d);
        }

        public String toString() {
            return "Result(bitmap=" + this.f3894a + ", uri=" + this.f3895b + ", error=" + this.f3896c + ", sampleSize=" + this.f3897d + ")";
        }
    }

    public BitmapCroppingWorkerJob(Context context, WeakReference cropImageViewReference, Uri uri, Bitmap bitmap, float[] cropPoints, int i10, int i11, int i12, boolean z9, int i13, int i14, int i15, int i16, boolean z10, boolean z11, CropImageView.RequestSizeOptions options, Bitmap.CompressFormat saveCompressFormat, int i17, Uri uri2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cropImageViewReference, "cropImageViewReference");
        Intrinsics.checkNotNullParameter(cropPoints, "cropPoints");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(saveCompressFormat, "saveCompressFormat");
        this.f3874a = context;
        this.f3875b = cropImageViewReference;
        this.f3876c = uri;
        this.f3877d = bitmap;
        this.f3878e = cropPoints;
        this.f3879f = i10;
        this.f3880g = i11;
        this.f3881h = i12;
        this.f3882i = z9;
        this.f3883j = i13;
        this.f3884k = i14;
        this.f3885l = i15;
        this.f3886m = i16;
        this.f3887n = z10;
        this.f3888o = z11;
        this.f3889p = options;
        this.f3890q = saveCompressFormat;
        this.f3891r = i17;
        this.f3892s = uri2;
        this.f3893t = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getMain().plus(this.f3893t);
    }

    /* renamed from: u */
    public final void m3770u() {
        Job.DefaultImpls.cancel$default(this.f3893t, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: v */
    public final Object m3771v(C5408a c5408a, Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new BitmapCroppingWorkerJob$onPostExecute$2(this, c5408a, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* renamed from: w */
    public final void m3772w() {
        this.f3893t = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getDefault(), null, new BitmapCroppingWorkerJob$start$1(this, null), 2, null);
    }
}
