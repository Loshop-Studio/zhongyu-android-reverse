package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6780d;

/* loaded from: classes2.dex */
public class MutablePropertyReference0Impl extends MutablePropertyReference0 {
    public MutablePropertyReference0Impl(InterfaceC6780d interfaceC6780d, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((InterfaceC5822c) interfaceC6780d).mo5318c(), str, str2, !(interfaceC6780d instanceof InterfaceC6779c) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0
    public Object get() {
        getGetter();
        throw null;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0
    public void set(Object obj) {
        getSetter();
        throw null;
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference0Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
