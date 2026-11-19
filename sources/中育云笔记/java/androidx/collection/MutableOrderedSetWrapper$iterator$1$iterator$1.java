package androidx.collection;

import androidx.collection.MutableOrderedSetWrapper;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p181hd.InterfaceC9544p;
import p296pd.AbstractC10661i;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", m26211f = "OrderedScatterSet.kt", m26212l = {1489}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MutableOrderedSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements InterfaceC9544p {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutableOrderedSetWrapper<E> this$0;
    final /* synthetic */ MutableOrderedSetWrapper.C10021 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper$iterator$1$iterator$1(MutableOrderedSetWrapper<E> mutableOrderedSetWrapper, MutableOrderedSetWrapper.C10021 c10021, InterfaceC11588c<? super MutableOrderedSetWrapper$iterator$1$iterator$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = mutableOrderedSetWrapper;
        this.this$1 = c10021;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, interfaceC11588c);
        mutableOrderedSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableOrderedSetWrapper mutableOrderedSetWrapper;
        int i10;
        MutableOrderedSetWrapper.C10021 c10021;
        long[] jArr;
        AbstractC10661i abstractC10661i;
        Object objM25952f = AbstractC11725a.m25952f();
        int i11 = this.label;
        if (i11 == 0) {
            AbstractC9924b.m20071b(obj);
            AbstractC10661i abstractC10661i2 = (AbstractC10661i) this.L$0;
            MutableOrderedScatterSet mutableOrderedScatterSet = ((MutableOrderedSetWrapper) this.this$0).parent;
            MutableOrderedSetWrapper.C10021 c100212 = this.this$1;
            mutableOrderedSetWrapper = this.this$0;
            long[] jArr2 = mutableOrderedScatterSet.nodes;
            i10 = mutableOrderedScatterSet.tail;
            c10021 = c100212;
            jArr = jArr2;
            abstractC10661i = abstractC10661i2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.I$0;
            jArr = (long[]) this.L$3;
            mutableOrderedSetWrapper = (MutableOrderedSetWrapper) this.L$2;
            c10021 = (MutableOrderedSetWrapper.C10021) this.L$1;
            abstractC10661i = (AbstractC10661i) this.L$0;
            AbstractC9924b.m20071b(obj);
        }
        while (i10 != Integer.MAX_VALUE) {
            int i12 = (int) ((jArr[i10] >> 31) & SieveCacheKt.NodeLinkMask);
            c10021.setCurrent(i10);
            Object obj2 = mutableOrderedSetWrapper.parent.elements[i10];
            this.L$0 = abstractC10661i;
            this.L$1 = c10021;
            this.L$2 = mutableOrderedSetWrapper;
            this.L$3 = jArr;
            this.I$0 = i12;
            this.label = 1;
            if (abstractC10661i.mo22551a(obj2, this) == objM25952f) {
                return objM25952f;
            }
            i10 = i12;
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(AbstractC10661i abstractC10661i, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) create(abstractC10661i, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
