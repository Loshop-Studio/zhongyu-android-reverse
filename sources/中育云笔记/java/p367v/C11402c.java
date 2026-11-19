package p367v;

import coil3.network.NetworkFetcher;
import kotlin.jvm.internal.AbstractC9983y;
import p001a0.InterfaceC0011h;
import p212k.C9766t;
import p280od.InterfaceC10469c;
import p352u.AbstractC11312b;

/* renamed from: v.c */
/* loaded from: classes3.dex */
public final class C11402c implements InterfaceC0011h {
    @Override // p001a0.InterfaceC0011h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public NetworkFetcher.Factory factory() {
        return AbstractC11312b.m25259d();
    }

    @Override // p001a0.InterfaceC0011h
    public int priority() {
        return 2;
    }

    @Override // p001a0.InterfaceC0011h
    public InterfaceC10469c type() {
        return AbstractC9983y.m20315b(C9766t.class);
    }
}
