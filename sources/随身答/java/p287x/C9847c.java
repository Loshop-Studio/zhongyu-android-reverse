package p287x;

import coil3.network.NetworkFetcher;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import p090e0.InterfaceC7809g;
import p151k.C8247r;
import p277w.AbstractC9788b;

/* renamed from: x.c */
/* loaded from: classes3.dex */
public final class C9847c implements InterfaceC7809g {
    @Override // p090e0.InterfaceC7809g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public NetworkFetcher.Factory factory() {
        return AbstractC9788b.m16592d();
    }

    @Override // p090e0.InterfaceC7809g
    public int priority() {
        return 2;
    }

    @Override // p090e0.InterfaceC7809g
    public KClass type() {
        return Reflection.getOrCreateKotlinClass(C8247r.class);
    }
}
