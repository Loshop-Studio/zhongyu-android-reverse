package retrofit2;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "retrofit2.KotlinExtensions", m17801f = "KotlinExtensions.kt", m17802l = {119}, m17803m = "suspendAndThrow")
/* loaded from: classes5.dex */
public final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f19937a;

    /* renamed from: b */
    public /* synthetic */ Object f19938b;

    /* renamed from: c */
    public int f19939c;

    public KotlinExtensions$suspendAndThrow$1(InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f19938b = obj;
        this.f19939c |= Integer.MIN_VALUE;
        return KotlinExtensions.m18594e(null, this);
    }
}
