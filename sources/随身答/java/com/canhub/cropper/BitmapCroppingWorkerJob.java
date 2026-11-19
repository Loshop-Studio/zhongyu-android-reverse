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
    public final Context f3662a;

    /* renamed from: b */
    public final WeakReference f3663b;

    /* renamed from: c */
    public final Uri f3664c;

    /* renamed from: d */
    public final Bitmap f3665d;

    /* renamed from: e */
    public final float[] f3666e;

    /* renamed from: f */
    public final int f3667f;

    /* renamed from: g */
    public final int f3668g;

    /* renamed from: h */
    public final int f3669h;

    /* renamed from: i */
    public final boolean f3670i;

    /* renamed from: j */
    public final int f3671j;

    /* renamed from: k */
    public final int f3672k;

    /* renamed from: l */
    public final int f3673l;

    /* renamed from: m */
    public final int f3674m;

    /* renamed from: n */
    public final boolean f3675n;

    /* renamed from: o */
    public final boolean f3676o;

    /* renamed from: p */
    public final CropImageView.RequestSizeOptions f3677p;

    /* renamed from: q */
    public final Bitmap.CompressFormat f3678q;

    /* renamed from: r */
    public final int f3679r;

    /* renamed from: s */
    public final Uri f3680s;

    /* renamed from: t */
    public Job f3681t;

    /* renamed from: com.canhub.cropper.BitmapCroppingWorkerJob$a */
    public static final class C5513a {

        /* renamed from: a */
        public final Bitmap f3682a;

        /* renamed from: b */
        public final Uri f3683b;

        /* renamed from: c */
        public final Exception f3684c;

        /* renamed from: d */
        public final int f3685d;

        public C5513a(Bitmap bitmap, Uri uri, Exception exc, int i9) {
            this.f3682a = bitmap;
            this.f3683b = uri;
            this.f3684c = exc;
            this.f3685d = i9;
        }

        /* renamed from: a */
        public final Bitmap m3399a() {
            return this.f3682a;
        }

        /* renamed from: b */
        public final Exception m3400b() {
            return this.f3684c;
        }

        /* renamed from: c */
        public final int m3401c() {
            return this.f3685d;
        }

        /* renamed from: d */
        public final Uri m3402d() {
            return this.f3683b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5513a)) {
                return false;
            }
            C5513a c5513a = (C5513a) obj;
            return Intrinsics.areEqual(this.f3682a, c5513a.f3682a) && Intrinsics.areEqual(this.f3683b, c5513a.f3683b) && Intrinsics.areEqual(this.f3684c, c5513a.f3684c) && this.f3685d == c5513a.f3685d;
        }

        public int hashCode() {
            Bitmap bitmap = this.f3682a;
            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            Uri uri = this.f3683b;
            int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
            Exception exc = this.f3684c;
            return ((iHashCode2 + (exc != null ? exc.hashCode() : 0)) * 31) + Integer.hashCode(this.f3685d);
        }

        public String toString() {
            return "Result(bitmap=" + this.f3682a + ", uri=" + this.f3683b + ", error=" + this.f3684c + ", sampleSize=" + this.f3685d + ")";
        }
    }

    public BitmapCroppingWorkerJob(Context context, WeakReference cropImageViewReference, Uri uri, Bitmap bitmap, float[] cropPoints, int i9, int i10, int i11, boolean z9, int i12, int i13, int i14, int i15, boolean z10, boolean z11, CropImageView.RequestSizeOptions options, Bitmap.CompressFormat saveCompressFormat, int i16, Uri uri2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cropImageViewReference, "cropImageViewReference");
        Intrinsics.checkNotNullParameter(cropPoints, "cropPoints");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(saveCompressFormat, "saveCompressFormat");
        this.f3662a = context;
        this.f3663b = cropImageViewReference;
        this.f3664c = uri;
        this.f3665d = bitmap;
        this.f3666e = cropPoints;
        this.f3667f = i9;
        this.f3668g = i10;
        this.f3669h = i11;
        this.f3670i = z9;
        this.f3671j = i12;
        this.f3672k = i13;
        this.f3673l = i14;
        this.f3674m = i15;
        this.f3675n = z10;
        this.f3676o = z11;
        this.f3677p = options;
        this.f3678q = saveCompressFormat;
        this.f3679r = i16;
        this.f3680s = uri2;
        this.f3681t = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getMain().plus(this.f3681t);
    }

    /* renamed from: u */
    public final void m3396u() {
        Job.DefaultImpls.cancel$default(this.f3681t, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: v */
    public final Object m3397v(C5513a c5513a, Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new BitmapCroppingWorkerJob$onPostExecute$2(this, c5513a, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* renamed from: w */
    public final void m3398w() {
        this.f3681t = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getDefault(), null, new BitmapCroppingWorkerJob$start$1(this, null), 2, null);
    }
}
