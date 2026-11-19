package com.zykj.gallery.p034ui.gallery.screenList;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.gallery.ui.gallery.screenList.GalleryListKt$GalleryList$2$1", m7918f = "GalleryList.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class GalleryListKt$GalleryList$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f5847a;

    /* renamed from: b */
    public final /* synthetic */ LazyPagingItems f5848b;

    /* renamed from: c */
    public final /* synthetic */ CoroutineScope f5849c;

    /* renamed from: d */
    public final /* synthetic */ LazyGridState f5850d;

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.gallery.ui.gallery.screenList.GalleryListKt$GalleryList$2$1$1", m7918f = "GalleryList.kt", m7919i = {}, m7920l = {87}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.gallery.ui.gallery.screenList.GalleryListKt$GalleryList$2$1$1 */
    public static final class C60281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f5851a;

        /* renamed from: b */
        public final /* synthetic */ LazyGridState f5852b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60281(LazyGridState lazyGridState, Continuation continuation) {
            super(2, continuation);
            this.f5852b = lazyGridState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C60281(this.f5852b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f5851a;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                LazyGridState lazyGridState = this.f5852b;
                this.f5851a = 1;
                if (LazyGridState.animateScrollToItem$default(lazyGridState, 0, 0, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C60281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryListKt$GalleryList$2$1(LazyPagingItems lazyPagingItems, CoroutineScope coroutineScope, LazyGridState lazyGridState, Continuation continuation) {
        super(2, continuation);
        this.f5848b = lazyPagingItems;
        this.f5849c = coroutineScope;
        this.f5850d = lazyGridState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GalleryListKt$GalleryList$2$1(this.f5848b, this.f5849c, this.f5850d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f5847a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if ((this.f5848b.getLoadState().getRefresh() instanceof LoadState.NotLoading) && this.f5848b.getItemCount() > 0) {
            BuildersKt__Builders_commonKt.launch$default(this.f5849c, null, null, new C60281(this.f5850d, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((GalleryListKt$GalleryList$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
