package p169l8;

import java.util.List;
import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.channels.BufferOverflow;
import p179m7.InterfaceC9324c;
import p180m8.InterfaceC9336i;

/* renamed from: l8.j */
/* loaded from: classes5.dex */
public final class C9273j implements InterfaceC9280q, InterfaceC9266c, InterfaceC9336i {

    /* renamed from: a */
    public final InterfaceC9212n f18270a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC9280q f18271b;

    public C9273j(InterfaceC9280q interfaceC9280q, InterfaceC9212n interfaceC9212n) {
        this.f18270a = interfaceC9212n;
        this.f18271b = interfaceC9280q;
    }

    @Override // p180m8.InterfaceC9336i
    /* renamed from: c */
    public InterfaceC9266c mo16671c(InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        return AbstractC9281r.m17057d(this, interfaceC9100d, i10, bufferOverflow);
    }

    @Override // p169l8.InterfaceC9275l, p169l8.InterfaceC9266c
    public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        return this.f18271b.collect(interfaceC9267d, interfaceC9324c);
    }

    @Override // p169l8.InterfaceC9275l
    /* renamed from: d */
    public List mo16672d() {
        return this.f18271b.mo16672d();
    }

    @Override // p169l8.InterfaceC9280q
    public Object getValue() {
        return this.f18271b.getValue();
    }
}
