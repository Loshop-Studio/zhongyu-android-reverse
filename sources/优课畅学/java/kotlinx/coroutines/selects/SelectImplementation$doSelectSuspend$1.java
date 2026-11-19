package kotlinx.coroutines.selects;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.selects.SelectImplementation", m17801f = "Select.kt", m17802l = {438, 441}, m17803m = "doSelectSuspend")
/* loaded from: classes5.dex */
public final class SelectImplementation$doSelectSuspend$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f18149a;

    /* renamed from: b */
    public /* synthetic */ Object f18150b;

    /* renamed from: c */
    public final /* synthetic */ SelectImplementation f18151c;

    /* renamed from: d */
    public int f18152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImplementation$doSelectSuspend$1(SelectImplementation selectImplementation, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f18151c = selectImplementation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18150b = obj;
        this.f18152d |= Integer.MIN_VALUE;
        return this.f18151c.m16849q(this);
    }
}
