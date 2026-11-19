package p169l8;

import java.util.List;
import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.channels.BufferOverflow;
import p179m7.InterfaceC9324c;
import p180m8.InterfaceC9336i;

/* renamed from: l8.i */
/* loaded from: classes5.dex */
public final class C9272i implements InterfaceC9275l, InterfaceC9266c, InterfaceC9336i {

    /* renamed from: a */
    public final InterfaceC9212n f18268a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC9275l f18269b;

    public C9272i(InterfaceC9275l interfaceC9275l, InterfaceC9212n interfaceC9212n) {
        this.f18268a = interfaceC9212n;
        this.f18269b = interfaceC9275l;
    }

    @Override // p180m8.InterfaceC9336i
    /* renamed from: c */
    public InterfaceC9266c mo16671c(InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        return AbstractC9276m.m17047e(this, interfaceC9100d, i10, bufferOverflow);
    }

    @Override // p169l8.InterfaceC9275l, p169l8.InterfaceC9266c
    public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        return this.f18269b.collect(interfaceC9267d, interfaceC9324c);
    }

    @Override // p169l8.InterfaceC9275l
    /* renamed from: d */
    public List mo16672d() {
        return this.f18269b.mo16672d();
    }
}
