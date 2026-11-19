package androidx.paging;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1", m17801f = "PagingDataTransforms.jvm.kt", m17802l = {39}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ PageEvent<T> $event;
    final /* synthetic */ InterfaceC10570l $transform;
    int label;

    @InterfaceC9539d(m17800c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1$1", m17801f = "PagingDataTransforms.jvm.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1$1 */
    public static final class C43731 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10570l $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43731(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C43731> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$transform = interfaceC10570l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C43731 c43731 = new C43731(this.$transform, interfaceC9324c);
            c43731.L$0 = obj;
            return c43731;
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((C43731) obj, (InterfaceC9324c) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return this.$transform.invoke(this.L$0);
        }

        public final Object invoke(T t10, InterfaceC9324c<? super R> interfaceC9324c) {
            return ((C43731) create(t10, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1(PageEvent<T> pageEvent, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$event = pageEvent;
        this.$transform = interfaceC10570l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1(this.$event, this.$transform, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super PageEvent<R>> interfaceC9324c) {
        return ((PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
        PageEvent<T> pageEvent = this.$event;
        C43731 c43731 = new C43731(this.$transform, null);
        this.label = 1;
        Object map = pageEvent.map(c43731, this);
        return map == objM17291f ? objM17291f : map;
    }
}
