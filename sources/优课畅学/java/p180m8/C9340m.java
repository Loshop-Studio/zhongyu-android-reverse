package p180m8;

import kotlinx.coroutines.channels.InterfaceC9163f;
import p123h7.C8736p;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;

/* renamed from: m8.m */
/* loaded from: classes5.dex */
public final class C9340m implements InterfaceC9267d {

    /* renamed from: a */
    public final InterfaceC9163f f18398a;

    public C9340m(InterfaceC9163f interfaceC9163f) {
        this.f18398a = interfaceC9163f;
    }

    @Override // p169l8.InterfaceC9267d
    public Object emit(Object obj, InterfaceC9324c interfaceC9324c) {
        Object objSend = this.f18398a.send(obj, interfaceC9324c);
        return objSend == AbstractC9434a.m17291f() ? objSend : C8736p.f16368a;
    }
}
