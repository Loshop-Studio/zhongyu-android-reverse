package com.huawei.hms.common.internal;

/* loaded from: classes5.dex */
public class ResolveClientBean {

    /* renamed from: a */
    public final int f11571a;

    /* renamed from: b */
    public final AnyClient f11572b;

    /* renamed from: c */
    public int f11573c;

    public ResolveClientBean(AnyClient anyClient, int i10) {
        this.f11572b = anyClient;
        this.f11571a = Objects.hashCode(anyClient);
        this.f11573c = i10;
    }

    public void clientReconnect() {
        this.f11572b.connect(this.f11573c, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ResolveClientBean)) {
            return false;
        }
        return this.f11572b.equals(((ResolveClientBean) obj).f11572b);
    }

    public AnyClient getClient() {
        return this.f11572b;
    }

    public int hashCode() {
        return this.f11571a;
    }
}
