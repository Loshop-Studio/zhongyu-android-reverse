package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.StartedLazily$command$1;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", m17801f = "SharingStarted.kt", m17802l = {154}, m17803m = "emit")
/* loaded from: classes5.dex */
public final class StartedLazily$command$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f17951a;

    /* renamed from: b */
    public final /* synthetic */ StartedLazily$command$1.C91951 f17952b;

    /* renamed from: c */
    public int f17953c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1$1$emit$1(StartedLazily$command$1.C91951 c91951, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f17952b = c91951;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17951a = obj;
        this.f17953c |= Integer.MIN_VALUE;
        return this.f17952b.m16680c(0, this);
    }
}
