package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.internal.ThreadContextKt;
import p123h7.C8736p;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p180m8.AbstractC9331d;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public final class UndispatchedContextCollector implements InterfaceC9267d {

    /* renamed from: a */
    public final InterfaceC9100d f18060a;

    /* renamed from: b */
    public final Object f18061b;

    /* renamed from: c */
    public final InterfaceC10574p f18062c;

    public UndispatchedContextCollector(InterfaceC9267d interfaceC9267d, InterfaceC9100d interfaceC9100d) {
        this.f18060a = interfaceC9100d;
        this.f18061b = ThreadContextKt.m16748b(interfaceC9100d);
        this.f18062c = new UndispatchedContextCollector$emitRef$1(interfaceC9267d, null);
    }

    @Override // p169l8.InterfaceC9267d
    public Object emit(Object obj, InterfaceC9324c interfaceC9324c) {
        Object objM17164b = AbstractC9331d.m17164b(this.f18060a, obj, this.f18061b, this.f18062c, interfaceC9324c);
        return objM17164b == AbstractC9434a.m17291f() ? objM17164b : C8736p.f16368a;
    }
}
