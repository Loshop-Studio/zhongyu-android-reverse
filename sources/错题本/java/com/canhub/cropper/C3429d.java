package com.canhub.cropper;

import android.content.Context;
import android.net.Uri;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5871c1;
import kotlinx.coroutines.InterfaceC6009v;
import p054e7.AbstractC5479k;
import p068g7.C5609e;
import p075h6.InterfaceC5636h;

/* renamed from: com.canhub.cropper.d */
/* loaded from: classes2.dex */
public final class C3429d implements InterfaceC6009v {

    /* renamed from: a */
    public final Context f2568a;

    /* renamed from: b */
    public final Uri f2569b;

    /* renamed from: c */
    public final int f2570c;

    /* renamed from: d */
    public final int f2571d;

    /* renamed from: e */
    public final WeakReference f2572e;

    /* renamed from: f */
    public C5871c1 f2573f = AbstractC6014x.m5631b();

    public C3429d(Context context, CropImageView cropImageView, Uri uri) {
        this.f2568a = context;
        this.f2569b = uri;
        this.f2572e = new WeakReference(cropImageView);
        float f = cropImageView.getResources().getDisplayMetrics().density;
        double d9 = f > 1.0f ? 1.0d / f : 1.0d;
        this.f2570c = (int) (r3.widthPixels * d9);
        this.f2571d = (int) (r3.heightPixels * d9);
    }

    @Override // kotlinx.coroutines.InterfaceC6009v
    public final InterfaceC5636h getCoroutineContext() {
        C5609e c5609e = AbstractC5896f0.f9343a;
        return AbstractC5479k.f8471a.plus(this.f2573f);
    }
}
