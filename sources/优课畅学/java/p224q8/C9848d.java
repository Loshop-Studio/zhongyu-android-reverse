package p224q8;

import kotlin.jvm.internal.AbstractC9126n;
import kotlinx.coroutines.selects.SelectKt;
import p300x7.InterfaceC10575q;

/* renamed from: q8.d */
/* loaded from: classes5.dex */
public final class C9848d implements InterfaceC9847c {

    /* renamed from: a */
    public final Object f19649a;

    /* renamed from: b */
    public final InterfaceC10575q f19650b;

    /* renamed from: c */
    public final InterfaceC10575q f19651c;

    /* renamed from: d */
    public final InterfaceC10575q f19652d;

    public C9848d(Object obj, InterfaceC10575q interfaceC10575q, InterfaceC10575q interfaceC10575q2) {
        this.f19649a = obj;
        this.f19650b = interfaceC10575q;
        this.f19651c = interfaceC10575q2;
        this.f19652d = SelectKt.f18153a;
    }

    @Override // p224q8.InterfaceC9853i
    /* renamed from: a */
    public InterfaceC10575q mo18370a() {
        return this.f19650b;
    }

    @Override // p224q8.InterfaceC9853i
    /* renamed from: b */
    public InterfaceC10575q mo18371b() {
        return this.f19651c;
    }

    @Override // p224q8.InterfaceC9853i
    /* renamed from: c */
    public InterfaceC10575q mo18372c() {
        return this.f19652d;
    }

    @Override // p224q8.InterfaceC9853i
    /* renamed from: d */
    public Object mo18373d() {
        return this.f19649a;
    }

    public /* synthetic */ C9848d(Object obj, InterfaceC10575q interfaceC10575q, InterfaceC10575q interfaceC10575q2, int i10, AbstractC9126n abstractC9126n) {
        this(obj, interfaceC10575q, (i10 & 4) != 0 ? null : interfaceC10575q2);
    }
}
