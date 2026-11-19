package androidx.datastore.core;

import androidx.datastore.core.MultiProcessCoordinator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.datastore.core.MultiProcessCoordinator$Companion", m17801f = "MultiProcessCoordinator.android.kt", m17802l = {182}, m17803m = "getExclusiveFileLockWithRetryIfDeadlock")
/* renamed from: androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 */
/* loaded from: classes2.dex */
public final class C3751xe413854a extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MultiProcessCoordinator.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3751xe413854a(MultiProcessCoordinator.Companion companion, InterfaceC9324c<? super C3751xe413854a> interfaceC9324c) {
        super(interfaceC9324c);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getExclusiveFileLockWithRetryIfDeadlock(null, this);
    }
}
