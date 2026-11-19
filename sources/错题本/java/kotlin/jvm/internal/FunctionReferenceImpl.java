package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6780d;

/* loaded from: classes2.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i, InterfaceC6780d interfaceC6780d, String str, String str2) {
        super(i, CallableReference.NO_RECEIVER, ((InterfaceC5822c) interfaceC6780d).mo5318c(), str, str2, !(interfaceC6780d instanceof InterfaceC6779c) ? 1 : 0);
    }

    @SinceKotlin(version = "1.4")
    public FunctionReferenceImpl(int i, Class cls, String str, String str2, int i8) {
        super(i, CallableReference.NO_RECEIVER, cls, str, str2, i8);
    }

    @SinceKotlin(version = "1.4")
    public FunctionReferenceImpl(int i, Object obj, Class cls, String str, String str2, int i8) {
        super(i, obj, cls, str, str2, i8);
    }
}
