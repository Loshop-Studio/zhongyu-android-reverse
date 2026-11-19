package com.zykj.gallery.p034ui.gallery.screenList;

import androidx.compose.runtime.MutableState;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.gallery.ui.gallery.screenList.GalleryListKt$GalleryList$onRefresh$1$1$1", m7918f = "GalleryList.kt", m7919i = {0, 1, 1, 1, 1, 1}, m7920l = {100, 106}, m7921m = "invokeSuspend", m7922n = {"refreshStartTime", "refreshStartTime", "actualRefreshDuration", "minAnimationDuration", "it", "$i$a$-let-GalleryListKt$GalleryList$onRefresh$1$1$1$3"}, m7923s = {"J$0", "J$0", "J$1", "J$2", "J$3", "I$0"})
/* loaded from: classes4.dex */
public final class GalleryListKt$GalleryList$onRefresh$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public long f5853a;

    /* renamed from: b */
    public long f5854b;

    /* renamed from: c */
    public long f5855c;

    /* renamed from: d */
    public long f5856d;

    /* renamed from: e */
    public int f5857e;

    /* renamed from: f */
    public int f5858f;

    /* renamed from: g */
    public final /* synthetic */ Function0 f5859g;

    /* renamed from: h */
    public final /* synthetic */ LazyPagingItems f5860h;

    /* renamed from: i */
    public final /* synthetic */ MutableState f5861i;

    @Metadata(m7879d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7880d2 = {"<anonymous>", "", "it", "Landroidx/paging/LoadState;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.gallery.ui.gallery.screenList.GalleryListKt$GalleryList$onRefresh$1$1$1$2", m7918f = "GalleryList.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.gallery.ui.gallery.screenList.GalleryListKt$GalleryList$onRefresh$1$1$1$2 */
    public static final class C60292 extends SuspendLambda implements Function2<LoadState, Continuation<? super Boolean>, Object> {

        /* renamed from: a */
        public int f5862a;

        /* renamed from: b */
        public /* synthetic */ Object f5863b;

        public C60292(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(LoadState loadState, Continuation continuation) {
            return ((C60292) create(loadState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C60292 c60292 = new C60292(continuation);
            c60292.f5863b = obj;
            return c60292;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LoadState loadState = (LoadState) this.f5863b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f5862a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean((loadState instanceof LoadState.NotLoading) || (loadState instanceof LoadState.Error));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryListKt$GalleryList$onRefresh$1$1$1(Function0 function0, LazyPagingItems lazyPagingItems, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.f5859g = function0;
        this.f5860h = lazyPagingItems;
        this.f5861i = mutableState;
    }

    /* renamed from: b */
    public static final LoadState m5097b(LazyPagingItems lazyPagingItems) {
        return lazyPagingItems.getLoadState().getRefresh();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GalleryListKt$GalleryList$onRefresh$1$1$1(this.f5859g, this.f5860h, this.f5861i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r10, r14) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.f5858f
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.ResultKt.throwOnFailure(r15)
            goto L70
        L13:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1b:
            long r4 = r14.f5853a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L4a
        L21:
            kotlin.ResultKt.throwOnFailure(r15)
            long r5 = java.lang.System.currentTimeMillis()
            kotlin.jvm.functions.Function0 r15 = r14.f5859g
            r15.invoke()
            androidx.paging.compose.LazyPagingItems r15 = r14.f5860h
            com.zykj.gallery.ui.gallery.screenList.a r1 = new com.zykj.gallery.ui.gallery.screenList.a
            r1.<init>()
            kotlinx.coroutines.flow.Flow r15 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r1)
            com.zykj.gallery.ui.gallery.screenList.GalleryListKt$GalleryList$onRefresh$1$1$1$2 r1 = new com.zykj.gallery.ui.gallery.screenList.GalleryListKt$GalleryList$onRefresh$1$1$1$2
            r7 = 0
            r1.<init>(r7)
            r14.f5853a = r5
            r14.f5858f = r4
            java.lang.Object r15 = kotlinx.coroutines.flow.FlowKt.first(r15, r1, r14)
            if (r15 != r0) goto L49
            goto L6f
        L49:
            r4 = r5
        L4a:
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            r8 = 2000(0x7d0, double:9.88E-321)
            long r10 = r8 - r6
            r12 = 0
            long r10 = kotlin.ranges.RangesKt.coerceAtLeast(r10, r12)
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 <= 0) goto L70
            r14.f5853a = r4
            r14.f5854b = r6
            r14.f5855c = r8
            r14.f5856d = r10
            r14.f5857e = r2
            r14.f5858f = r3
            java.lang.Object r15 = kotlinx.coroutines.DelayKt.delay(r10, r14)
            if (r15 != r0) goto L70
        L6f:
            return r0
        L70:
            androidx.compose.runtime.MutableState r15 = r14.f5861i
            com.zykj.gallery.p034ui.gallery.screenList.GalleryListKt.m5069I(r15, r2)
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.gallery.p034ui.gallery.screenList.GalleryListKt$GalleryList$onRefresh$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1.smali:209
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((GalleryListKt$GalleryList$onRefresh$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
