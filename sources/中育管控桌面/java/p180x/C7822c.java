package p180x;

import coil3.network.NetworkFetcher;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import p023c0.InterfaceC4463h;
import p087k.C6621t;
import p173w.AbstractC7802b;

/* renamed from: x.c */
/* loaded from: classes3.dex */
public final class C7822c implements InterfaceC4463h {
    @Override // p023c0.InterfaceC4463h
    /* renamed from: a */
    public int mo1539a() {
        return 2;
    }

    @Override // p023c0.InterfaceC4463h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public NetworkFetcher.Factory factory() {
        return AbstractC7802b.m9380d();
    }

    @Override // p023c0.InterfaceC4463h
    public KClass type() {
        return Reflection.getOrCreateKotlinClass(C6621t.class);
    }
}
