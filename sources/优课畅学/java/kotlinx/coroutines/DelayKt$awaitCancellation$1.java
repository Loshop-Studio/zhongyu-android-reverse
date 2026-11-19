package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.DelayKt", m17801f = "Delay.kt", m17802l = {160}, m17803m = "awaitCancellation")
/* loaded from: classes5.dex */
public final class DelayKt$awaitCancellation$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f17559a;

    /* renamed from: b */
    public int f17560b;

    public DelayKt$awaitCancellation$1(InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17559a = obj;
        this.f17560b |= Integer.MIN_VALUE;
        return DelayKt.m16226a(this);
    }
}
