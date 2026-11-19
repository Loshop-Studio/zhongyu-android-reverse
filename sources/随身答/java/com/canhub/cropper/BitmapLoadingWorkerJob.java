package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
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
public final class BitmapLoadingWorkerJob implements CoroutineScope {

    /* renamed from: a */
    public final Context f3697a;

    /* renamed from: b */
    public final Uri f3698b;

    /* renamed from: c */
    public final int f3699c;

    /* renamed from: d */
    public final int f3700d;

    /* renamed from: e */
    public final WeakReference f3701e;

    /* renamed from: f */
    public Job f3702f;

    /* renamed from: com.canhub.cropper.BitmapLoadingWorkerJob$a */
    public static final class C5515a {

        /* renamed from: a */
        public final Uri f3703a;

        /* renamed from: b */
        public final Bitmap f3704b;

        /* renamed from: c */
        public final int f3705c;

        /* renamed from: d */
        public final int f3706d;

        /* renamed from: e */
        public final boolean f3707e;

        /* renamed from: f */
        public final boolean f3708f;

        /* renamed from: g */
        public final Exception f3709g;

        public C5515a(Uri uri, Bitmap bitmap, int i9, int i10, boolean z9, boolean z10, Exception exc) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f3703a = uri;
            this.f3704b = bitmap;
            this.f3705c = i9;
            this.f3706d = i10;
            this.f3707e = z9;
            this.f3708f = z10;
            this.f3709g = exc;
        }

        /* renamed from: a */
        public final Bitmap m3412a() {
            return this.f3704b;
        }

        /* renamed from: b */
        public final int m3413b() {
            return this.f3706d;
        }

        /* renamed from: c */
        public final Exception m3414c() {
            return this.f3709g;
        }

        /* renamed from: d */
        public final boolean m3415d() {
            return this.f3707e;
        }

        /* renamed from: e */
        public final boolean m3416e() {
            return this.f3708f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5515a)) {
                return false;
            }
            C5515a c5515a = (C5515a) obj;
            return Intrinsics.areEqual(this.f3703a, c5515a.f3703a) && Intrinsics.areEqual(this.f3704b, c5515a.f3704b) && this.f3705c == c5515a.f3705c && this.f3706d == c5515a.f3706d && this.f3707e == c5515a.f3707e && this.f3708f == c5515a.f3708f && Intrinsics.areEqual(this.f3709g, c5515a.f3709g);
        }

        /* renamed from: f */
        public final int m3417f() {
            return this.f3705c;
        }

        /* renamed from: g */
        public final Uri m3418g() {
            return this.f3703a;
        }

        public int hashCode() {
            int iHashCode = this.f3703a.hashCode() * 31;
            Bitmap bitmap = this.f3704b;
            int iHashCode2 = (((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Integer.hashCode(this.f3705c)) * 31) + Integer.hashCode(this.f3706d)) * 31) + Boolean.hashCode(this.f3707e)) * 31) + Boolean.hashCode(this.f3708f)) * 31;
            Exception exc = this.f3709g;
            return iHashCode2 + (exc != null ? exc.hashCode() : 0);
        }

        public String toString() {
            return "Result(uri=" + this.f3703a + ", bitmap=" + this.f3704b + ", loadSampleSize=" + this.f3705c + ", degreesRotated=" + this.f3706d + ", flipHorizontally=" + this.f3707e + ", flipVertically=" + this.f3708f + ", error=" + this.f3709g + ")";
        }
    }

    public BitmapLoadingWorkerJob(Context context, CropImageView cropImageView, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cropImageView, "cropImageView");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f3697a = context;
        this.f3698b = uri;
        this.f3701e = new WeakReference(cropImageView);
        this.f3702f = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        float f10 = cropImageView.getResources().getDisplayMetrics().density;
        double d10 = f10 > 1.0f ? 1.0d / f10 : 1.0d;
        this.f3699c = (int) (r3.widthPixels * d10);
        this.f3700d = (int) (r3.heightPixels * d10);
    }

    /* renamed from: f */
    public final void m3408f() {
        Job.DefaultImpls.cancel$default(this.f3702f, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: g */
    public final Uri m3409g() {
        return this.f3698b;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getMain().plus(this.f3702f);
    }

    /* renamed from: h */
    public final Object m3410h(C5515a c5515a, Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new BitmapLoadingWorkerJob$onPostExecute$2(this, c5515a, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* renamed from: i */
    public final void m3411i() {
        this.f3702f = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getDefault(), null, new BitmapLoadingWorkerJob$start$1(this, null), 2, null);
    }
}
