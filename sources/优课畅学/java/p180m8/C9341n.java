package p180m8;

import kotlin.coroutines.InterfaceC9100d;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9538c;

/* renamed from: m8.n */
/* loaded from: classes5.dex */
public final class C9341n implements InterfaceC9324c, InterfaceC9538c {

    /* renamed from: a */
    public final InterfaceC9324c f18399a;

    /* renamed from: b */
    public final InterfaceC9100d f18400b;

    public C9341n(InterfaceC9324c interfaceC9324c, InterfaceC9100d interfaceC9100d) {
        this.f18399a = interfaceC9324c;
        this.f18400b = interfaceC9100d;
    }

    @Override // p201o7.InterfaceC9538c
    public InterfaceC9538c getCallerFrame() {
        InterfaceC9324c interfaceC9324c = this.f18399a;
        if (interfaceC9324c instanceof InterfaceC9538c) {
            return (InterfaceC9538c) interfaceC9324c;
        }
        return null;
    }

    @Override // p179m7.InterfaceC9324c
    public InterfaceC9100d getContext() {
        return this.f18400b;
    }

    @Override // p179m7.InterfaceC9324c
    public void resumeWith(Object obj) {
        this.f18399a.resumeWith(obj);
    }
}
