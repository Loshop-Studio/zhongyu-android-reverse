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
@Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0002*\u00020\u0004*\u00020\u0005H\u008a@"}, m13558d2 = {"<anonymous>", "Landroidx/paging/PageEvent;", "R", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1", m13596f = "PagingDataTransforms.jvm.kt", m13597i = {}, m13598l = {55}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes3.dex */
public final class PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PageEvent<R>>, Object> {
    final /* synthetic */ PageEvent<T> $event;
    final /* synthetic */ Function1<T, Iterable<R>> $transform;
    int label;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\u008a@"}, m13558d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "", "it"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1$1", m13596f = "PagingDataTransforms.jvm.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1$1 */
    public static final class C42851<T> extends SuspendLambda implements Function2<T, Continuation<? super Iterable<? extends R>>, Object> {
        final /* synthetic */ Function1<T, Iterable<R>> $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C42851(Function1<? super T, ? extends Iterable<? extends R>> function1, Continuation<? super C42851> continuation) {
            super(2, continuation);
            this.$transform = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C42851 c42851 = new C42851(this.$transform, continuation);
            c42851.L$0 = obj;
            return c42851;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((C42851<T>) obj, (Continuation) obj2);
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

        public final Object invoke(T t10, Continuation<? super Iterable<? extends R>> continuation) {
            return ((C42851) create(t10, continuation)).invokeSuspend(Unit.INSTANCE);
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
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        PageEvent<T> pageEvent = this.$event;
        C42851 c42851 = new C42851(this.$transform, null);
        this.label = 1;
        Object objFlatMap = pageEvent.flatMap(c42851, this);
        return objFlatMap == coroutine_suspended ? coroutine_suspended : objFlatMap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PageEvent<R>> continuation) {
        return ((PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
