package p191w4;

import kotlin.jvm.internal.AbstractC5830k;
import p212z4.C6814a;
import p212z4.C6816c;
import p212z4.C6818e;
import p212z4.C6820g;

/* renamed from: w4.a */
/* loaded from: classes3.dex */
public final class C6716a {

    /* renamed from: a */
    public final C6818e f11333a;

    /* renamed from: b */
    public final C6814a f11334b;

    /* renamed from: c */
    public final C6816c f11335c;

    /* renamed from: d */
    public final C6820g f11336d;

    public C6716a(C6818e c6818e, C6814a c6814a, C6816c c6816c, C6820g c6820g) {
        this.f11333a = c6818e;
        this.f11334b = c6814a;
        this.f11335c = c6816c;
        this.f11336d = c6820g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6716a)) {
            return false;
        }
        C6716a c6716a = (C6716a) obj;
        return AbstractC5830k.m5325b(this.f11333a, c6716a.f11333a) && AbstractC5830k.m5325b(this.f11334b, c6716a.f11334b) && AbstractC5830k.m5325b(this.f11335c, c6716a.f11335c) && AbstractC5830k.m5325b(this.f11336d, c6716a.f11336d);
    }

    public final int hashCode() {
        return this.f11336d.hashCode() + ((this.f11335c.hashCode() + ((this.f11334b.hashCode() + (this.f11333a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MainActivityRouteInfrastructure(detailRouteEnvironment=" + this.f11333a + ", askMaterialRouteEnvironment=" + this.f11334b + ", collectionRouteEnvironment=" + this.f11335c + ", homeRouteEnvironment=" + this.f11336d + ")";
    }
}
