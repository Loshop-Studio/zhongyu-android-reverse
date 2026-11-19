package androidx.paging.compose;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, m13413d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1", m13451f = "LazyPagingItems.kt", m13452i = {}, m13453l = {210, 212}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes3.dex */
public final class LazyPagingItemsKt$collectAsLazyPagingItems$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineContext $context;
    final /* synthetic */ LazyPagingItems<T> $lazyPagingItems;
    int label;

    @Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, m13413d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1", m13451f = "LazyPagingItems.kt", m13452i = {}, m13453l = {213}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1 */
    public static final class C44681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LazyPagingItems<T> $lazyPagingItems;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44681(LazyPagingItems<T> lazyPagingItems, Continuation<? super C44681> continuation) {
            super(2, continuation);
            this.$lazyPagingItems = lazyPagingItems;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C44681(this.$lazyPagingItems, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.label;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                LazyPagingItems<T> lazyPagingItems = this.$lazyPagingItems;
                this.label = 1;
                if (lazyPagingItems.collectPagingData$paging_compose_release(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C44681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPagingItemsKt$collectAsLazyPagingItems$1$1(CoroutineContext coroutineContext, LazyPagingItems<T> lazyPagingItems, Continuation<? super LazyPagingItemsKt$collectAsLazyPagingItems$1$1> continuation) {
        super(2, continuation);
        this.$context = coroutineContext;
        this.$lazyPagingItems = lazyPagingItems;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LazyPagingItemsKt$collectAsLazyPagingItems$1$1(this.$context, this.$lazyPagingItems, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r6.collectPagingData$paging_compose_release(r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r6, r1, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L46
        L1b:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.coroutines.CoroutineContext r6 = r5.$context
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r1)
            if (r6 == 0) goto L33
            androidx.paging.compose.LazyPagingItems<T> r6 = r5.$lazyPagingItems
            r5.label = r3
            java.lang.Object r6 = r6.collectPagingData$paging_compose_release(r5)
            if (r6 != r0) goto L46
            goto L45
        L33:
            kotlin.coroutines.CoroutineContext r6 = r5.$context
            androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1 r1 = new androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1
            androidx.paging.compose.LazyPagingItems<T> r3 = r5.$lazyPagingItems
            r4 = 0
            r1.<init>(r3, r4)
            r5.label = r2
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r1, r5)
            if (r6 != r0) goto L46
        L45:
            return r0
        L46:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LazyPagingItemsKt$collectAsLazyPagingItems$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
