package androidx.lifecycle;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.lifecycle.CoroutineLiveData", m17801f = "CoroutineLiveData.kt", m17802l = {TbsListener.ErrorCode.RENAME_EXCEPTION, TbsListener.ErrorCode.COPY_INSTALL_SUCCESS}, m17803m = "emitSource$lifecycle_livedata_release")
/* loaded from: classes3.dex */
public final class CoroutineLiveData$emitSource$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoroutineLiveData<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveData$emitSource$1(CoroutineLiveData<T> coroutineLiveData, InterfaceC9324c<? super CoroutineLiveData$emitSource$1> interfaceC9324c) {
        super(interfaceC9324c);
        this.this$0 = coroutineLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emitSource$lifecycle_livedata_release(null, this);
    }
}
