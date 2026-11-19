package androidx.collection;

import androidx.collection.MutableOrderedSetWrapper;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p101f8.AbstractC8471i;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", m17801f = "OrderedScatterSet.kt", m17802l = {1489}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MutableOrderedSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements InterfaceC10574p {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutableOrderedSetWrapper<E> this$0;
    final /* synthetic */ MutableOrderedSetWrapper.C09721 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper$iterator$1$iterator$1(MutableOrderedSetWrapper<E> mutableOrderedSetWrapper, MutableOrderedSetWrapper.C09721 c09721, InterfaceC9324c<? super MutableOrderedSetWrapper$iterator$1$iterator$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = mutableOrderedSetWrapper;
        this.this$1 = c09721;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, interfaceC9324c);
        mutableOrderedSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(AbstractC8471i abstractC8471i, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) create(abstractC8471i, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableOrderedSetWrapper mutableOrderedSetWrapper;
        int i10;
        MutableOrderedSetWrapper.C09721 c09721;
        long[] jArr;
        AbstractC8471i abstractC8471i;
        Object objM17291f = AbstractC9434a.m17291f();
        int i11 = this.label;
        if (i11 == 0) {
            AbstractC9079b.m15926b(obj);
            AbstractC8471i abstractC8471i2 = (AbstractC8471i) this.L$0;
            MutableOrderedScatterSet mutableOrderedScatterSet = ((MutableOrderedSetWrapper) this.this$0).parent;
            MutableOrderedSetWrapper.C09721 c097212 = this.this$1;
            mutableOrderedSetWrapper = this.this$0;
            long[] jArr2 = mutableOrderedScatterSet.nodes;
            i10 = mutableOrderedScatterSet.tail;
            c09721 = c097212;
            jArr = jArr2;
            abstractC8471i = abstractC8471i2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.I$0;
            jArr = (long[]) this.L$3;
            mutableOrderedSetWrapper = (MutableOrderedSetWrapper) this.L$2;
            c09721 = (MutableOrderedSetWrapper.C09721) this.L$1;
            abstractC8471i = (AbstractC8471i) this.L$0;
            AbstractC9079b.m15926b(obj);
        }
        while (i10 != Integer.MAX_VALUE) {
            int i12 = (int) ((jArr[i10] >> 31) & SieveCacheKt.NodeLinkMask);
            c09721.setCurrent(i10);
            Object obj2 = mutableOrderedSetWrapper.parent.elements[i10];
            this.L$0 = abstractC8471i;
            this.L$1 = c09721;
            this.L$2 = mutableOrderedSetWrapper;
            this.L$3 = jArr;
            this.I$0 = i12;
            this.label = 1;
            if (abstractC8471i.mo13820a(obj2, this) == objM17291f) {
                return objM17291f;
            }
            i10 = i12;
        }
        return C8736p.f16368a;
    }
}
