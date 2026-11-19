package androidx.paging;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1", m26211f = "PagingDataTransforms.jvm.kt", m26212l = {66}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ PageEvent<T> $event;
    final /* synthetic */ InterfaceC9540l $predicate;
    int label;

    @InterfaceC11829d(m26210c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1$1", m26211f = "PagingDataTransforms.jvm.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1$1 */
    public static final class C42771 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9540l $predicate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42771(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C42771> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$predicate = interfaceC9540l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C42771 c42771 = new C42771(this.$predicate, interfaceC11588c);
            c42771.L$0 = obj;
            return c42771;
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((C42771) obj, (InterfaceC11588c<? super Boolean>) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return this.$predicate.invoke(this.L$0);
        }

        public final Object invoke(T t10, InterfaceC11588c<? super Boolean> interfaceC11588c) {
            return ((C42771) create(t10, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1(PageEvent<T> pageEvent, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$event = pageEvent;
        this.$predicate = interfaceC9540l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1(this.$event, this.$predicate, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        PageEvent<T> pageEvent = this.$event;
        C42771 c42771 = new C42771(this.$predicate, null);
        this.label = 1;
        Object objFilter = pageEvent.filter(c42771, this);
        return objFilter == objM25952f ? objM25952f : objFilter;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super PageEvent<T>> interfaceC11588c) {
        return ((PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
