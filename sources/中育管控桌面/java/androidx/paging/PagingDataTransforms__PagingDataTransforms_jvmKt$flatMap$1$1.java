package androidx.paging;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [R] */
@Metadata(m7879d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0002*\u00020\u0004*\u00020\u0005H\u008a@"}, m7880d2 = {"<anonymous>", "Landroidx/paging/PageEvent;", "R", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {1, 8, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1", m7918f = "PagingDataTransforms.jvm.kt", m7919i = {}, m7920l = {55}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes3.dex */
public final class PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PageEvent<R>>, Object> {
    final /* synthetic */ PageEvent<T> $event;
    final /* synthetic */ Function1<T, Iterable<R>> $transform;
    int label;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\u008a@"}, m7880d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "", "it"}, m7881k = 3, m7882mv = {1, 8, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1$1", m7918f = "PagingDataTransforms.jvm.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1$1 */
    public static final class C37701<T> extends SuspendLambda implements Function2<T, Continuation<? super Iterable<? extends R>>, Object> {
        final /* synthetic */ Function1<T, Iterable<R>> $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C37701(Function1<? super T, ? extends Iterable<? extends R>> function1, Continuation<? super C37701> continuation) {
            super(2, continuation);
            this.$transform = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C37701 c37701 = new C37701(this.$transform, continuation);
            c37701.L$0 = obj;
            return c37701;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((C37701<T>) obj, (Continuation) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return this.$transform.invoke(this.L$0);
        }

        public final Object invoke(T t6, Continuation<? super Iterable<? extends R>> continuation) {
            return ((C37701) create(t6, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1(PageEvent<T> pageEvent, Function1<? super T, ? extends Iterable<? extends R>> function1, Continuation<? super PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1> continuation) {
        super(2, continuation);
        this.$event = pageEvent;
        this.$transform = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1(this.$event, this.$transform, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        PageEvent<T> pageEvent = this.$event;
        C37701 c37701 = new C37701(this.$transform, null);
        this.label = 1;
        Object objFlatMap = pageEvent.flatMap(c37701, this);
        return objFlatMap == coroutine_suspended ? coroutine_suspended : objFlatMap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PageEvent<R>> continuation) {
        return ((PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
