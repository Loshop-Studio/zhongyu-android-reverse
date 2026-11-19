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

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, m13558d2 = {"<anonymous>", "Landroidx/paging/PageEvent;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1", m13596f = "PagingDataTransforms.jvm.kt", m13597i = {}, m13598l = {71}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes3.dex */
public final class PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PageEvent<T>>, Object> {
    final /* synthetic */ PageEvent<T> $event;
    final /* synthetic */ Function1<T, Boolean> $predicate;
    int label;

    @Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "it"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1$1", m13596f = "PagingDataTransforms.jvm.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1$1 */
    public static final class C42841 extends SuspendLambda implements Function2<T, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Function1<T, Boolean> $predicate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C42841(Function1<? super T, Boolean> function1, Continuation<? super C42841> continuation) {
            super(2, continuation);
            this.$predicate = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C42841 c42841 = new C42841(this.$predicate, continuation);
            c42841.L$0 = obj;
            return c42841;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Boolean> continuation) {
            return invoke2((C42841) obj, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return this.$predicate.invoke(this.L$0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t10, Continuation<? super Boolean> continuation) {
            return ((C42841) create(t10, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1(PageEvent<T> pageEvent, Function1<? super T, Boolean> function1, Continuation<? super PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1> continuation) {
        super(2, continuation);
        this.$event = pageEvent;
        this.$predicate = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1(this.$event, this.$predicate, continuation);
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
        C42841 c42841 = new C42841(this.$predicate, null);
        this.label = 1;
        Object objFilter = pageEvent.filter(c42841, this);
        return objFilter == coroutine_suspended ? coroutine_suspended : objFilter;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PageEvent<T>> continuation) {
        return ((PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
