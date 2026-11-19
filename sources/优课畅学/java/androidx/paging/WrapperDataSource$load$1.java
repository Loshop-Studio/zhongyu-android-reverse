package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.paging.WrapperDataSource", m17801f = "WrapperDataSource.jvm.kt", m17802l = {68}, m17803m = "load$suspendImpl")
/* loaded from: classes3.dex */
public final class WrapperDataSource$load$1<Key, ValueFrom, ValueTo> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WrapperDataSource<Key, ValueFrom, ValueTo> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapperDataSource$load$1(WrapperDataSource<Key, ValueFrom, ValueTo> wrapperDataSource, InterfaceC9324c<? super WrapperDataSource$load$1> interfaceC9324c) {
        super(interfaceC9324c);
        this.this$0 = wrapperDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WrapperDataSource.load$suspendImpl(this.this$0, null, this);
    }
}
