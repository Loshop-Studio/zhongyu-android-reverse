package com.zykj.evaluation.p057ui.sheet;

import android.graphics.Bitmap;
import com.zykj.evaluation.p057ui.sheet.AbstractC6934b;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p026b7.C5031t0;

/* renamed from: com.zykj.evaluation.ui.sheet.a */
/* loaded from: classes4.dex */
public final class C6933a {

    /* renamed from: a */
    public final Bitmap f9945a;

    /* renamed from: b */
    public final List f9946b;

    /* renamed from: c */
    public final C5031t0 f9947c;

    /* renamed from: d */
    public final AbstractC6934b f9948d;

    /* renamed from: e */
    public final List f9949e;

    /* renamed from: f */
    public final boolean f9950f;

    public C6933a(Bitmap previewBitmap, List correctDataList, C5031t0 correctFunction, AbstractC6934b scanResult, List indexList, boolean z9) {
        Intrinsics.checkNotNullParameter(previewBitmap, "previewBitmap");
        Intrinsics.checkNotNullParameter(correctDataList, "correctDataList");
        Intrinsics.checkNotNullParameter(correctFunction, "correctFunction");
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        Intrinsics.checkNotNullParameter(indexList, "indexList");
        this.f9945a = previewBitmap;
        this.f9946b = correctDataList;
        this.f9947c = correctFunction;
        this.f9948d = scanResult;
        this.f9949e = indexList;
        this.f9950f = z9;
    }

    /* renamed from: b */
    public static /* synthetic */ C6933a m10208b(C6933a c6933a, Bitmap bitmap, List list, C5031t0 c5031t0, AbstractC6934b abstractC6934b, List list2, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bitmap = c6933a.f9945a;
        }
        if ((i10 & 2) != 0) {
            list = c6933a.f9946b;
        }
        if ((i10 & 4) != 0) {
            c5031t0 = c6933a.f9947c;
        }
        if ((i10 & 8) != 0) {
            abstractC6934b = c6933a.f9948d;
        }
        if ((i10 & 16) != 0) {
            list2 = c6933a.f9949e;
        }
        if ((i10 & 32) != 0) {
            z9 = c6933a.f9950f;
        }
        List list3 = list2;
        boolean z10 = z9;
        return c6933a.m10209a(bitmap, list, c5031t0, abstractC6934b, list3, z10);
    }

    /* renamed from: a */
    public final C6933a m10209a(Bitmap previewBitmap, List correctDataList, C5031t0 correctFunction, AbstractC6934b scanResult, List indexList, boolean z9) {
        Intrinsics.checkNotNullParameter(previewBitmap, "previewBitmap");
        Intrinsics.checkNotNullParameter(correctDataList, "correctDataList");
        Intrinsics.checkNotNullParameter(correctFunction, "correctFunction");
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        Intrinsics.checkNotNullParameter(indexList, "indexList");
        return new C6933a(previewBitmap, correctDataList, correctFunction, scanResult, indexList, z9);
    }

    /* renamed from: c */
    public final List m10210c() {
        return this.f9946b;
    }

    /* renamed from: d */
    public final C5031t0 m10211d() {
        return this.f9947c;
    }

    /* renamed from: e */
    public final List m10212e() {
        return this.f9949e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6933a)) {
            return false;
        }
        C6933a c6933a = (C6933a) obj;
        return Intrinsics.areEqual(this.f9945a, c6933a.f9945a) && Intrinsics.areEqual(this.f9946b, c6933a.f9946b) && Intrinsics.areEqual(this.f9947c, c6933a.f9947c) && Intrinsics.areEqual(this.f9948d, c6933a.f9948d) && Intrinsics.areEqual(this.f9949e, c6933a.f9949e) && this.f9950f == c6933a.f9950f;
    }

    /* renamed from: f */
    public final Bitmap m10213f() {
        return this.f9945a;
    }

    /* renamed from: g */
    public final AbstractC6934b m10214g() {
        return this.f9948d;
    }

    /* renamed from: h */
    public final boolean m10215h() {
        return this.f9950f;
    }

    public int hashCode() {
        return (((((((((this.f9945a.hashCode() * 31) + this.f9946b.hashCode()) * 31) + this.f9947c.hashCode()) * 31) + this.f9948d.hashCode()) * 31) + this.f9949e.hashCode()) * 31) + Boolean.hashCode(this.f9950f);
    }

    public String toString() {
        return "PreviewState(previewBitmap=" + this.f9945a + ", correctDataList=" + this.f9946b + ", correctFunction=" + this.f9947c + ", scanResult=" + this.f9948d + ", indexList=" + this.f9949e + ", isAllComplete=" + this.f9950f + ")";
    }

    public /* synthetic */ C6933a(Bitmap bitmap, List list, C5031t0 c5031t0, AbstractC6934b abstractC6934b, List list2, boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8) : bitmap, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? new C5031t0(null, null, 3, null) : c5031t0, (i10 & 8) != 0 ? AbstractC6934b.a.f9952b : abstractC6934b, (i10 & 16) != 0 ? CollectionsKt.emptyList() : list2, (i10 & 32) != 0 ? false : z9);
    }
}
