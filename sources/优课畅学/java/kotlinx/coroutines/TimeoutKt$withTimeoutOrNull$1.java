package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.TimeoutKt", m17801f = "Timeout.kt", m17802l = {101}, m17803m = "withTimeoutOrNull")
/* loaded from: classes5.dex */
public final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {

    /* renamed from: a */
    public long f17583a;

    /* renamed from: b */
    public Object f17584b;

    /* renamed from: c */
    public Object f17585c;

    /* renamed from: d */
    public /* synthetic */ Object f17586d;

    /* renamed from: e */
    public int f17587e;

    public TimeoutKt$withTimeoutOrNull$1(InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17586d = obj;
        this.f17587e |= Integer.MIN_VALUE;
        return TimeoutKt.m16328e(0L, null, this);
    }
}
