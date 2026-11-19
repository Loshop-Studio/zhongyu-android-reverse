package p280x;

import coil3.network.NetworkFetcher;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import p030c0.InterfaceC5083h;
import p137k.C7848t;
import p270w.AbstractC9724b;

/* renamed from: x.c */
/* loaded from: classes3.dex */
public final class C9826c implements InterfaceC5083h {
    @Override // p030c0.InterfaceC5083h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public NetworkFetcher.Factory factory() {
        return AbstractC9724b.m16256d();
    }

    @Override // p030c0.InterfaceC5083h
    public int priority() {
        return 2;
    }

    @Override // p030c0.InterfaceC5083h
    public KClass type() {
        return Reflection.getOrCreateKotlinClass(C7848t.class);
    }
}
