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
    public final Context f3909a;

    /* renamed from: b */
    public final Uri f3910b;

    /* renamed from: c */
    public final int f3911c;

    /* renamed from: d */
    public final int f3912d;

    /* renamed from: e */
    public final WeakReference f3913e;

    /* renamed from: f */
    public Job f3914f;

    /* renamed from: com.canhub.cropper.BitmapLoadingWorkerJob$a */
    public static final class C5410a {

        /* renamed from: a */
        public final Uri f3915a;

        /* renamed from: b */
        public final Bitmap f3916b;

        /* renamed from: c */
        public final int f3917c;

        /* renamed from: d */
        public final int f3918d;

        /* renamed from: e */
        public final boolean f3919e;

        /* renamed from: f */
        public final boolean f3920f;

        /* renamed from: g */
        public final Exception f3921g;

        public C5410a(Uri uri, Bitmap bitmap, int i10, int i11, boolean z9, boolean z10, Exception exc) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f3915a = uri;
            this.f3916b = bitmap;
            this.f3917c = i10;
            this.f3918d = i11;
            this.f3919e = z9;
            this.f3920f = z10;
            this.f3921g = exc;
        }

        /* renamed from: a */
        public final Bitmap m3786a() {
            return this.f3916b;
        }

        /* renamed from: b */
        public final int m3787b() {
            return this.f3918d;
        }

        /* renamed from: c */
        public final Exception m3788c() {
            return this.f3921g;
        }

        /* renamed from: d */
        public final boolean m3789d() {
            return this.f3919e;
        }

        /* renamed from: e */
        public final boolean m3790e() {
            return this.f3920f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5410a)) {
                return false;
            }
            C5410a c5410a = (C5410a) obj;
            return Intrinsics.areEqual(this.f3915a, c5410a.f3915a) && Intrinsics.areEqual(this.f3916b, c5410a.f3916b) && this.f3917c == c5410a.f3917c && this.f3918d == c5410a.f3918d && this.f3919e == c5410a.f3919e && this.f3920f == c5410a.f3920f && Intrinsics.areEqual(this.f3921g, c5410a.f3921g);
        }

        /* renamed from: f */
        public final int m3791f() {
            return this.f3917c;
        }

        /* renamed from: g */
        public final Uri m3792g() {
            return this.f3915a;
        }

        public int hashCode() {
            int iHashCode = this.f3915a.hashCode() * 31;
            Bitmap bitmap = this.f3916b;
            int iHashCode2 = (((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Integer.hashCode(this.f3917c)) * 31) + Integer.hashCode(this.f3918d)) * 31) + Boolean.hashCode(this.f3919e)) * 31) + Boolean.hashCode(this.f3920f)) * 31;
            Exception exc = this.f3921g;
            return iHashCode2 + (exc != null ? exc.hashCode() : 0);
        }

        public String toString() {
            return "Result(uri=" + this.f3915a + ", bitmap=" + this.f3916b + ", loadSampleSize=" + this.f3917c + ", degreesRotated=" + this.f3918d + ", flipHorizontally=" + this.f3919e + ", flipVertically=" + this.f3920f + ", error=" + this.f3921g + ")";
        }
    }

    public BitmapLoadingWorkerJob(Context context, CropImageView cropImageView, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cropImageView, "cropImageView");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f3909a = context;
        this.f3910b = uri;
        this.f3913e = new WeakReference(cropImageView);
        this.f3914f = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        float f10 = cropImageView.getResources().getDisplayMetrics().density;
        double d10 = f10 > 1.0f ? 1.0d / f10 : 1.0d;
        this.f3911c = (int) (r3.widthPixels * d10);
        this.f3912d = (int) (r3.heightPixels * d10);
    }

    /* renamed from: f */
    public final void m3782f() {
        Job.DefaultImpls.cancel$default(this.f3914f, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: g */
    public final Uri m3783g() {
        return this.f3910b;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getMain().plus(this.f3914f);
    }

    /* renamed from: h */
    public final Object m3784h(C5410a c5410a, Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new BitmapLoadingWorkerJob$onPostExecute$2(this, c5410a, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* renamed from: i */
    public final void m3785i() {
        this.f3914f = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getDefault(), null, new BitmapLoadingWorkerJob$start$1(this, null), 2, null);
    }
}
