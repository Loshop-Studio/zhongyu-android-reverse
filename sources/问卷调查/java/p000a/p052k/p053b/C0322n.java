package p000a.p052k.p053b;

import android.os.Bundle;
import android.os.Parcelable;
import p000a.p057m.AbstractC0355d;
import p000a.p062p.C0404a;

/* renamed from: a.k.b.n */
/* loaded from: classes.dex */
public class C0322n implements C0404a.b {

    /* renamed from: a */
    public final /* synthetic */ ActivityC0326p f2023a;

    public C0322n(ActivityC0326p activityC0326p) {
        this.f2023a = activityC0326p;
    }

    @Override // p000a.p062p.C0404a.b
    /* renamed from: a */
    public Bundle mo21a() {
        Bundle bundle = new Bundle();
        while (ActivityC0326p.m1194n(this.f2023a.f2029i.f2114a.f2124e, AbstractC0355d.b.CREATED)) {
        }
        this.f2023a.f2030j.m1282d(AbstractC0355d.a.ON_STOP);
        Parcelable parcelableM1034b0 = this.f2023a.f2029i.f2114a.f2124e.m1034b0();
        if (parcelableM1034b0 != null) {
            bundle.putParcelable("android:support:fragments", parcelableM1034b0);
        }
        return bundle;
    }
}
