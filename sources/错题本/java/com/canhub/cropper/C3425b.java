package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.canhub.cropper.CropImageView;
import java.lang.ref.WeakReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5871c1;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p054e7.AbstractC5479k;
import p068g7.C5609e;
import p075h6.InterfaceC5636h;

/* renamed from: com.canhub.cropper.b */
/* loaded from: classes2.dex */
public final class C3425b implements InterfaceC6009v {

    /* renamed from: a */
    public final Context f2538a;

    /* renamed from: b */
    public final WeakReference f2539b;

    /* renamed from: c */
    public final Uri f2540c;

    /* renamed from: d */
    public final Bitmap f2541d;

    /* renamed from: e */
    public final float[] f2542e;

    /* renamed from: f */
    public final int f2543f;

    /* renamed from: g */
    public final int f2544g;

    /* renamed from: h */
    public final int f2545h;

    /* renamed from: i */
    public final boolean f2546i;

    /* renamed from: j */
    public final int f2547j;

    /* renamed from: k */
    public final int f2548k;

    /* renamed from: l */
    public final int f2549l;

    /* renamed from: m */
    public final int f2550m;

    /* renamed from: n */
    public final boolean f2551n;

    /* renamed from: o */
    public final boolean f2552o;

    /* renamed from: p */
    public final CropImageView.RequestSizeOptions f2553p;

    /* renamed from: q */
    public final Bitmap.CompressFormat f2554q;

    /* renamed from: r */
    public final int f2555r;

    /* renamed from: s */
    public final Uri f2556s;

    /* renamed from: t */
    public C5871c1 f2557t;

    public C3425b(Context context, WeakReference weakReference, Uri uri, Bitmap bitmap, float[] cropPoints, int i, int i8, int i9, boolean z8, int i10, int i11, int i12, int i13, boolean z9, boolean z10, CropImageView.RequestSizeOptions options, Bitmap.CompressFormat saveCompressFormat, int i14, Uri uri2) {
        AbstractC5830k.m5330g(cropPoints, "cropPoints");
        AbstractC5830k.m5330g(options, "options");
        AbstractC5830k.m5330g(saveCompressFormat, "saveCompressFormat");
        this.f2538a = context;
        this.f2539b = weakReference;
        this.f2540c = uri;
        this.f2541d = bitmap;
        this.f2542e = cropPoints;
        this.f2543f = i;
        this.f2544g = i8;
        this.f2545h = i9;
        this.f2546i = z8;
        this.f2547j = i10;
        this.f2548k = i11;
        this.f2549l = i12;
        this.f2550m = i13;
        this.f2551n = z9;
        this.f2552o = z10;
        this.f2553p = options;
        this.f2554q = saveCompressFormat;
        this.f2555r = i14;
        this.f2556s = uri2;
        this.f2557t = AbstractC6014x.m5631b();
    }

    /* renamed from: a */
    public static final Object m2454a(C3425b c3425b, C3423a c3423a, SuspendLambda suspendLambda) throws Throwable {
        c3425b.getClass();
        C5609e c5609e = AbstractC5896f0.f9343a;
        Object objM5626F = AbstractC6014x.m5626F(AbstractC5479k.f8471a, new BitmapCroppingWorkerJob$onPostExecute$2(c3425b, c3423a, null), suspendLambda);
        return objM5626F == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5626F : C5443s.f8405a;
    }

    @Override // kotlinx.coroutines.InterfaceC6009v
    public final InterfaceC5636h getCoroutineContext() {
        C5609e c5609e = AbstractC5896f0.f9343a;
        return AbstractC5479k.f8471a.plus(this.f2557t);
    }
}
