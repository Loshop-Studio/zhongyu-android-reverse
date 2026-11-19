package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.channels.ProduceKt", m17801f = "Produce.kt", m17802l = {150}, m17803m = "awaitClose")
/* loaded from: classes5.dex */
public final class ProduceKt$awaitClose$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f17665a;

    /* renamed from: b */
    public Object f17666b;

    /* renamed from: c */
    public /* synthetic */ Object f17667c;

    /* renamed from: d */
    public int f17668d;

    public ProduceKt$awaitClose$1(InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17667c = obj;
        this.f17668d |= Integer.MIN_VALUE;
        return ProduceKt.m16521a(null, null, this);
    }
}
