package com.canhub.cropper;

import android.graphics.Rect;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.canhub.cropper.u */
/* loaded from: classes2.dex */
public class C3450u {

    /* renamed from: a */
    public final Uri f2630a;

    /* renamed from: b */
    public final Uri f2631b;

    /* renamed from: c */
    public final Exception f2632c;

    /* renamed from: d */
    public final float[] f2633d;

    /* renamed from: e */
    public final Rect f2634e;

    /* renamed from: f */
    public final Rect f2635f;

    /* renamed from: g */
    public final int f2636g;

    /* renamed from: h */
    public final int f2637h;

    public C3450u(Uri uri, Uri uri2, Exception exc, float[] cropPoints, Rect rect, Rect rect2, int i, int i8) {
        AbstractC5830k.m5330g(cropPoints, "cropPoints");
        this.f2630a = uri;
        this.f2631b = uri2;
        this.f2632c = exc;
        this.f2633d = cropPoints;
        this.f2634e = rect;
        this.f2635f = rect2;
        this.f2636g = i;
        this.f2637h = i8;
    }
}
