package androidx.datastore.core;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", m17801f = "DataStoreImpl.kt", m17802l = {TbsListener.ErrorCode.ERROR_QBSDK_INIT_ERROR_EMPTY_BUNDLE}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DataStoreImpl$transformAndWrite$2$newData$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ Data<T> $curData;
    final /* synthetic */ InterfaceC10574p $transform;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$transformAndWrite$2$newData$1(InterfaceC10574p interfaceC10574p, Data<T> data, InterfaceC9324c<? super DataStoreImpl$transformAndWrite$2$newData$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$transform = interfaceC10574p;
        this.$curData = data;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new DataStoreImpl$transformAndWrite$2$newData$1(this.$transform, this.$curData, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super T> interfaceC9324c) {
        return ((DataStoreImpl$transformAndWrite$2$newData$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return obj;
        }
        AbstractC9079b.m15926b(obj);
        InterfaceC10574p interfaceC10574p = this.$transform;
        Object value = this.$curData.getValue();
        this.label = 1;
        Object objInvoke = interfaceC10574p.invoke(value, this);
        return objInvoke == objM17291f ? objM17291f : objInvoke;
    }
}
