package p214z6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6471c;

/* renamed from: z6.f */
/* loaded from: classes2.dex */
public final class C6828f implements InterfaceC6830h {

    /* renamed from: a */
    public final InterfaceC6830h f11571a;

    /* renamed from: b */
    public final boolean f11572b;

    /* renamed from: c */
    public final InterfaceC6471c f11573c;

    public C6828f(InterfaceC6830h interfaceC6830h, boolean z8, InterfaceC6471c predicate) {
        AbstractC5830k.m5330g(predicate, "predicate");
        this.f11571a = interfaceC6830h;
        this.f11572b = z8;
        this.f11573c = predicate;
    }

    @Override // p214z6.InterfaceC6830h
    public final Iterator iterator() {
        return new C6827e(this);
    }
}
