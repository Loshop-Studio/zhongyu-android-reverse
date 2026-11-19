package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", m17801f = "Combine.kt", m17802l = {29, 30}, m17803m = "emit")
/* loaded from: classes5.dex */
public final class CombineKt$combineInternal$2$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f18043a;

    /* renamed from: b */
    public final /* synthetic */ CombineKt$combineInternal$2.C92011.AnonymousClass1 f18044b;

    /* renamed from: c */
    public int f18045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2$1$1$emit$1(CombineKt$combineInternal$2.C92011.AnonymousClass1 anonymousClass1, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f18044b = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18043a = obj;
        this.f18045c |= Integer.MIN_VALUE;
        return this.f18044b.emit(null, this);
    }
}
