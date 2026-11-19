package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;

@InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", m17801f = "DataStoreImpl.kt", m17802l = {437, 458, 546, 468}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DataStoreImpl$InitDataStore$doRun$initData$1 extends SuspendLambda implements InterfaceC10570l {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;
    final /* synthetic */ DataStoreImpl<T>.InitDataStore this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$initData$1(DataStoreImpl<T> dataStoreImpl, DataStoreImpl<T>.InitDataStore initDataStore, InterfaceC9324c<? super DataStoreImpl$InitDataStore$doRun$initData$1> interfaceC9324c) {
        super(1, interfaceC9324c);
        this.this$0 = dataStoreImpl;
        this.this$1 = initDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
        return new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this.this$1, interfaceC9324c);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p300x7.InterfaceC10570l
    public final Object invoke(InterfaceC9324c<? super Data<T>> interfaceC9324c) {
        return ((DataStoreImpl$InitDataStore$doRun$initData$1) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
