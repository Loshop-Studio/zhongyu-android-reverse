.class public final Landroidx/paging/PageFetcherSnapshot;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/PageFetcherSnapshot$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Key:",
        "Ljava/lang/Object;",
        "Value:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u0002*\u0008\u0008\u0001\u0010\u0003*\u00020\u00022\u00020\u0002By\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0016\u0008\u0002\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\r\u0012\u0016\u0008\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000f\u0012\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0011\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020\u000bJ\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH\u0086@\u00a2\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0002\u0010.J\u001e\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0082@\u00a2\u0006\u0002\u00105J%\u00106\u001a\u0008\u0012\u0004\u0012\u00028\u0000072\u0006\u00101\u001a\u0002022\u0008\u00108\u001a\u0004\u0018\u00018\u0000H\u0002\u00a2\u0006\u0002\u00109J5\u0010:\u001a\u00020;2\u0006\u00101\u001a\u0002022\u0008\u0010<\u001a\u0004\u0018\u00018\u00002\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010>H\u0002\u00a2\u0006\u0002\u0010?J\u0008\u0010@\u001a\u00020\u000bH\u0002J \u0010A\u001a\u00020\u000b2\u0006\u00101\u001a\u0002022\u0008\u0010*\u001a\u0004\u0018\u00010+H\u0082@\u00a2\u0006\u0002\u0010BJ \u0010C\u001a\u00020\u000b*\u0008\u0012\u0004\u0012\u00020D0\n2\u0006\u00101\u001a\u000202H\u0082@\u00a2\u0006\u0002\u0010EJ7\u0010F\u001a\u0004\u0018\u00018\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010G2\u0006\u00101\u001a\u0002022\u0006\u0010H\u001a\u00020D2\u0006\u0010I\u001a\u00020DH\u0002\u00a2\u0006\u0002\u0010JJ.\u0010K\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010G2\u0006\u00101\u001a\u0002022\u0006\u0010L\u001a\u00020MH\u0082@\u00a2\u0006\u0002\u0010NJ&\u0010O\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010G2\u0006\u00101\u001a\u000202H\u0082@\u00a2\u0006\u0002\u0010PJ\u000c\u0010Q\u001a\u00020\u000b*\u00020RH\u0002R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010 \u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u001a0\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006S"
    }
    d2 = {
        "Landroidx/paging/PageFetcherSnapshot;",
        "Key",
        "",
        "Value",
        "initialKey",
        "pagingSource",
        "Landroidx/paging/PagingSource;",
        "config",
        "Landroidx/paging/PagingConfig;",
        "retryFlow",
        "Lkotlinx/coroutines/flow/Flow;",
        "",
        "remoteMediatorConnection",
        "Landroidx/paging/RemoteMediatorConnection;",
        "previousPagingState",
        "Landroidx/paging/PagingState;",
        "jumpCallback",
        "Lkotlin/Function0;",
        "(Ljava/lang/Object;Landroidx/paging/PagingSource;Landroidx/paging/PagingConfig;Lkotlinx/coroutines/flow/Flow;Landroidx/paging/RemoteMediatorConnection;Landroidx/paging/PagingState;Lkotlin/jvm/functions/Function0;)V",
        "hintHandler",
        "Landroidx/paging/HintHandler;",
        "getInitialKey$paging_common_release",
        "()Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "pageEventCh",
        "Lkotlinx/coroutines/channels/Channel;",
        "Landroidx/paging/PageEvent;",
        "pageEventChCollected",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "Landroidx/paging/internal/AtomicBoolean;",
        "pageEventChannelFlowJob",
        "Lkotlinx/coroutines/CompletableJob;",
        "pageEventFlow",
        "getPageEventFlow",
        "()Lkotlinx/coroutines/flow/Flow;",
        "getPagingSource$paging_common_release",
        "()Landroidx/paging/PagingSource;",
        "getRemoteMediatorConnection",
        "()Landroidx/paging/RemoteMediatorConnection;",
        "stateHolder",
        "Landroidx/paging/PageFetcherSnapshotState$Holder;",
        "accessHint",
        "viewportHint",
        "Landroidx/paging/ViewportHint;",
        "close",
        "currentPagingState",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "doInitialLoad",
        "doLoad",
        "loadType",
        "Landroidx/paging/LoadType;",
        "generationalHint",
        "Landroidx/paging/GenerationalViewportHint;",
        "(Landroidx/paging/LoadType;Landroidx/paging/GenerationalViewportHint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadParams",
        "Landroidx/paging/PagingSource$LoadParams;",
        "key",
        "(Landroidx/paging/LoadType;Ljava/lang/Object;)Landroidx/paging/PagingSource$LoadParams;",
        "loadResultLog",
        "",
        "loadKey",
        "result",
        "Landroidx/paging/PagingSource$LoadResult;",
        "(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;",
        "onInvalidLoad",
        "retryLoadError",
        "(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "collectAsGenerationalViewportHints",
        "",
        "(Lkotlinx/coroutines/flow/Flow;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "nextLoadKeyOrNull",
        "Landroidx/paging/PageFetcherSnapshotState;",
        "generationId",
        "presentedItemsBeyondAnchor",
        "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;II)Ljava/lang/Object;",
        "setError",
        "error",
        "Landroidx/paging/LoadState$Error;",
        "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "setLoading",
        "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "startConsumingHints",
        "Lkotlinx/coroutines/CoroutineScope;",
        "paging-common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n+ 2 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 FlowExt.kt\nandroidx/paging/FlowExtKt\n+ 5 PagingLogger.kt\nandroidx/paging/PagingLoggerKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,639:1\n390#2:640\n391#2:649\n390#2:652\n391#2:661\n390#2:673\n391#2:682\n390#2:694\n391#2:703\n390#2:715\n391#2:724\n390#2:736\n391#2:745\n390#2:758\n391#2:767\n390#2:769\n391#2:778\n390#2:790\n391#2:799\n390#2:831\n391#2:840\n390#2:852\n391#2:861\n390#2:863\n391#2:872\n120#3,8:641\n129#3:650\n120#3,8:653\n129#3:662\n120#3,8:674\n129#3:683\n120#3,8:695\n129#3:704\n120#3,8:716\n129#3:725\n120#3,8:737\n129#3:746\n120#3,8:759\n129#3:768\n120#3,8:770\n129#3:779\n120#3,8:791\n129#3:800\n120#3,8:832\n129#3:841\n120#3,8:853\n129#3:862\n120#3,8:864\n129#3:873\n98#4:651\n32#5,10:663\n32#5,10:684\n32#5,10:705\n32#5,10:726\n32#5,10:747\n32#5,10:780\n32#5,10:801\n32#5,10:811\n32#5,10:821\n32#5,10:842\n1#6:757\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n*L\n210#1:640\n210#1:649\n284#1:652\n284#1:661\n294#1:673\n294#1:682\n324#1:694\n324#1:703\n336#1:715\n336#1:724\n352#1:736\n352#1:745\n374#1:758\n374#1:767\n410#1:769\n410#1:778\n446#1:790\n446#1:799\n470#1:831\n470#1:840\n492#1:852\n492#1:861\n527#1:863\n527#1:872\n210#1:641,8\n210#1:650\n284#1:653,8\n284#1:662\n294#1:674,8\n294#1:683\n324#1:695,8\n324#1:704\n336#1:716,8\n336#1:725\n352#1:737,8\n352#1:746\n374#1:759,8\n374#1:768\n410#1:770,8\n410#1:779\n446#1:791,8\n446#1:800\n470#1:832,8\n470#1:841\n492#1:853,8\n492#1:862\n527#1:864,8\n527#1:873\n251#1:651\n288#1:663,10\n322#1:684,10\n330#1:705,10\n351#1:726,10\n358#1:747,10\n423#1:780,10\n452#1:801,10\n456#1:811,10\n469#1:821,10\n481#1:842,10\n*E\n"
    }
.end annotation


# instance fields
.field private final config:Landroidx/paging/PagingConfig;

.field private final hintHandler:Landroidx/paging/HintHandler;

.field private final initialKey:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TKey;"
        }
    .end annotation
.end field

.field private final jumpCallback:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final pageEventCh:Lkotlinx/coroutines/channels/Channel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/Channel<",
            "Landroidx/paging/PageEvent<",
            "TValue;>;>;"
        }
    .end annotation
.end field

.field private final pageEventChCollected:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final pageEventChannelFlowJob:Lkotlinx/coroutines/CompletableJob;

.field private final pageEventFlow:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Landroidx/paging/PageEvent<",
            "TValue;>;>;"
        }
    .end annotation
.end field

.field private final pagingSource:Landroidx/paging/PagingSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagingSource<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field

.field private final previousPagingState:Landroidx/paging/PagingState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagingState<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field

.field private final remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/RemoteMediatorConnection<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field

.field private final retryFlow:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PageFetcherSnapshotState$Holder<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroidx/paging/PagingSource;Landroidx/paging/PagingConfig;Lkotlinx/coroutines/flow/Flow;Landroidx/paging/RemoteMediatorConnection;Landroidx/paging/PagingState;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKey;",
            "Landroidx/paging/PagingSource<",
            "TKey;TValue;>;",
            "Landroidx/paging/PagingConfig;",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/paging/RemoteMediatorConnection<",
            "TKey;TValue;>;",
            "Landroidx/paging/PagingState<",
            "TKey;TValue;>;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pagingSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retryFlow"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jumpCallback"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot;->initialKey:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Landroidx/paging/PageFetcherSnapshot;->pagingSource:Landroidx/paging/PagingSource;

    .line 4
    iput-object p3, p0, Landroidx/paging/PageFetcherSnapshot;->config:Landroidx/paging/PagingConfig;

    .line 5
    iput-object p4, p0, Landroidx/paging/PageFetcherSnapshot;->retryFlow:Lkotlinx/coroutines/flow/Flow;

    .line 6
    iput-object p5, p0, Landroidx/paging/PageFetcherSnapshot;->remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;

    .line 7
    iput-object p6, p0, Landroidx/paging/PageFetcherSnapshot;->previousPagingState:Landroidx/paging/PagingState;

    .line 8
    iput-object p7, p0, Landroidx/paging/PageFetcherSnapshot;->jumpCallback:Lkotlin/jvm/functions/Function0;

    .line 9
    iget p1, p3, Landroidx/paging/PagingConfig;->jumpThreshold:I

    const/high16 p4, -0x80000000

    if-eq p1, p4, :cond_1

    invoke-virtual {p2}, Landroidx/paging/PagingSource;->getJumpingSupported()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :cond_1
    :goto_0
    new-instance p1, Landroidx/paging/HintHandler;

    invoke-direct {p1}, Landroidx/paging/HintHandler;-><init>()V

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot;->hintHandler:Landroidx/paging/HintHandler;

    .line 11
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventChCollected:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, -0x2

    const/4 p2, 0x6

    const/4 p4, 0x0

    .line 12
    invoke-static {p1, p4, p4, p2, p4}, Lkotlinx/coroutines/channels/ChannelKt;->Channel$default(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/Channel;

    move-result-object p1

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventCh:Lkotlinx/coroutines/channels/Channel;

    .line 13
    new-instance p1, Landroidx/paging/PageFetcherSnapshotState$Holder;

    invoke-direct {p1, p3}, Landroidx/paging/PageFetcherSnapshotState$Holder;-><init>(Landroidx/paging/PagingConfig;)V

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    const/4 p1, 0x1

    .line 14
    invoke-static {p4, p1, p4}, Lkotlinx/coroutines/JobKt;->Job$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableJob;

    move-result-object p1

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventChannelFlowJob:Lkotlinx/coroutines/CompletableJob;

    .line 15
    new-instance p2, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1;

    invoke-direct {p2, p0, p4}, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1;-><init>(Landroidx/paging/PageFetcherSnapshot;Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, p2}, Landroidx/paging/CancelableChannelFlowKt;->cancelableChannelFlow(Lkotlinx/coroutines/Job;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    .line 16
    new-instance p2, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$2;

    invoke-direct {p2, p0, p4}, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$2;-><init>(Landroidx/paging/PageFetcherSnapshot;Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, p2}, Lkotlinx/coroutines/flow/FlowKt;->onStart(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventFlow:Lkotlinx/coroutines/flow/Flow;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Landroidx/paging/PagingSource;Landroidx/paging/PagingConfig;Lkotlinx/coroutines/flow/Flow;Landroidx/paging/RemoteMediatorConnection;Landroidx/paging/PagingState;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x10

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_1

    move-object p6, v0

    :cond_1
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_2

    .line 17
    sget-object p7, Landroidx/paging/PageFetcherSnapshot$1;->INSTANCE:Landroidx/paging/PageFetcherSnapshot$1;

    :cond_2
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 18
    invoke-direct/range {p1 .. p8}, Landroidx/paging/PageFetcherSnapshot;-><init>(Ljava/lang/Object;Landroidx/paging/PagingSource;Landroidx/paging/PagingConfig;Lkotlinx/coroutines/flow/Flow;Landroidx/paging/RemoteMediatorConnection;Landroidx/paging/PagingState;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static final synthetic access$collectAsGenerationalViewportHints(Landroidx/paging/PageFetcherSnapshot;Lkotlinx/coroutines/flow/Flow;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/paging/PageFetcherSnapshot;->collectAsGenerationalViewportHints(Lkotlinx/coroutines/flow/Flow;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$doInitialLoad(Landroidx/paging/PageFetcherSnapshot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/paging/PageFetcherSnapshot;->doInitialLoad(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$doLoad(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/LoadType;Landroidx/paging/GenerationalViewportHint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/paging/PageFetcherSnapshot;->doLoad(Landroidx/paging/LoadType;Landroidx/paging/GenerationalViewportHint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getConfig$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/PagingConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshot;->config:Landroidx/paging/PagingConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getHintHandler$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/HintHandler;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshot;->hintHandler:Landroidx/paging/HintHandler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getJumpCallback$p(Landroidx/paging/PageFetcherSnapshot;)Lkotlin/jvm/functions/Function0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshot;->jumpCallback:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPageEventCh$p(Landroidx/paging/PageFetcherSnapshot;)Lkotlinx/coroutines/channels/Channel;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventCh:Lkotlinx/coroutines/channels/Channel;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPageEventChCollected$p(Landroidx/paging/PageFetcherSnapshot;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventChCollected:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPreviousPagingState$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/PagingState;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshot;->previousPagingState:Landroidx/paging/PagingState;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getRetryFlow$p(Landroidx/paging/PageFetcherSnapshot;)Lkotlinx/coroutines/flow/Flow;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshot;->retryFlow:Lkotlinx/coroutines/flow/Flow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getStateHolder$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/PageFetcherSnapshotState$Holder;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$retryLoadError(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/paging/PageFetcherSnapshot;->retryLoadError(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$setError(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/paging/PageFetcherSnapshot;->setError(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$setLoading(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/paging/PageFetcherSnapshot;->setLoading(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$startConsumingHints(Landroidx/paging/PageFetcherSnapshot;Lkotlinx/coroutines/CoroutineScope;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/paging/PageFetcherSnapshot;->startConsumingHints(Lkotlinx/coroutines/CoroutineScope;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final collectAsGenerationalViewportHints(Lkotlinx/coroutines/flow/Flow;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/paging/LoadType;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/paging/PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p0, p2}, Landroidx/paging/PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1;-><init>(Lkotlin/coroutines/Continuation;Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/LoadType;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Landroidx/paging/FlowExtKt;->simpleTransformLatest(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance v0, Landroidx/paging/PageFetcherSnapshot$collectAsGenerationalViewportHints$3;

    .line 12
    .line 13
    invoke-direct {v0, p2, v1}, Landroidx/paging/PageFetcherSnapshot$collectAsGenerationalViewportHints$3;-><init>(Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0}, Landroidx/paging/FlowExtKt;->simpleRunningReduce(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->conflate(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance v0, Landroidx/paging/PageFetcherSnapshot$collectAsGenerationalViewportHints$4;

    .line 25
    .line 26
    invoke-direct {v0, p0, p2}, Landroidx/paging/PageFetcherSnapshot$collectAsGenerationalViewportHints$4;-><init>(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/LoadType;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v0, p3}, Lkotlinx/coroutines/flow/Flow;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-ne p1, p2, :cond_0

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p1
.end method

.method private final doInitialLoad(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;-><init>(Landroidx/paging/PageFetcherSnapshot;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x0

    .line 36
    packed-switch v2, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :pswitch_0
    iget-object v0, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lkotlinx/coroutines/sync/Mutex;

    .line 50
    .line 51
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto/16 :goto_e

    .line 55
    .line 56
    :catchall_0
    move-exception p1

    .line 57
    goto/16 :goto_f

    .line 58
    .line 59
    :pswitch_1
    iget-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$3:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Lkotlinx/coroutines/sync/Mutex;

    .line 62
    .line 63
    iget-object v3, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v3, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 66
    .line 67
    iget-object v4, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v4, Landroidx/paging/PagingSource$LoadResult;

    .line 70
    .line 71
    iget-object v6, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v6, Landroidx/paging/PageFetcherSnapshot;

    .line 74
    .line 75
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto/16 :goto_c

    .line 79
    .line 80
    :pswitch_2
    iget-object v1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$3:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Lkotlinx/coroutines/sync/Mutex;

    .line 83
    .line 84
    iget-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 87
    .line 88
    iget-object v3, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v3, Landroidx/paging/PagingSource$LoadResult;

    .line 91
    .line 92
    iget-object v0, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Landroidx/paging/PageFetcherSnapshot;

    .line 95
    .line 96
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto/16 :goto_a

    .line 100
    .line 101
    :pswitch_3
    iget-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v2, Lkotlinx/coroutines/sync/Mutex;

    .line 104
    .line 105
    iget-object v3, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v3, Landroidx/paging/PagingSource$LoadResult;

    .line 108
    .line 109
    iget-object v4, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v4, Landroidx/paging/PageFetcherSnapshot;

    .line 112
    .line 113
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 114
    .line 115
    .line 116
    goto/16 :goto_7

    .line 117
    .line 118
    :catchall_1
    move-exception p1

    .line 119
    goto/16 :goto_8

    .line 120
    .line 121
    :pswitch_4
    iget-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$3:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v2, Lkotlinx/coroutines/sync/Mutex;

    .line 124
    .line 125
    iget-object v3, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v3, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 128
    .line 129
    iget-object v4, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v4, Landroidx/paging/PagingSource$LoadResult;

    .line 132
    .line 133
    iget-object v6, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v6, Landroidx/paging/PageFetcherSnapshot;

    .line 136
    .line 137
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto/16 :goto_6

    .line 141
    .line 142
    :pswitch_5
    iget-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$3:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v2, Lkotlinx/coroutines/sync/Mutex;

    .line 145
    .line 146
    iget-object v6, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v6, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 149
    .line 150
    iget-object v7, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v7, Landroidx/paging/PagingSource$LoadResult;

    .line 153
    .line 154
    iget-object v8, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v8, Landroidx/paging/PageFetcherSnapshot;

    .line 157
    .line 158
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_4

    .line 162
    .line 163
    :pswitch_6
    iget-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v2, Landroidx/paging/PageFetcherSnapshot;

    .line 166
    .line 167
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    move-object v6, v2

    .line 171
    goto/16 :goto_3

    .line 172
    .line 173
    :pswitch_7
    iget-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v2, Lkotlinx/coroutines/sync/Mutex;

    .line 176
    .line 177
    iget-object v6, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v6, Landroidx/paging/PageFetcherSnapshot;

    .line 180
    .line 181
    :try_start_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :catchall_2
    move-exception p1

    .line 186
    goto/16 :goto_11

    .line 187
    .line 188
    :pswitch_8
    iget-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v2, Lkotlinx/coroutines/sync/Mutex;

    .line 191
    .line 192
    iget-object v6, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v6, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 195
    .line 196
    iget-object v7, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v7, Landroidx/paging/PageFetcherSnapshot;

    .line 199
    .line 200
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :pswitch_9
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    iget-object v6, p0, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 208
    .line 209
    invoke-static {v6}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lkotlinx/coroutines/sync/Mutex;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    iput-object p0, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 214
    .line 215
    iput-object v6, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 216
    .line 217
    iput-object p1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    .line 218
    .line 219
    const/4 v2, 0x1

    .line 220
    iput v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    .line 221
    .line 222
    invoke-interface {p1, v5, v0}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    if-ne v2, v1, :cond_1

    .line 227
    .line 228
    goto/16 :goto_d

    .line 229
    .line 230
    :cond_1
    move-object v7, p0

    .line 231
    move-object v2, p1

    .line 232
    :goto_1
    :try_start_3
    invoke-static {v6}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    sget-object v6, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 237
    .line 238
    iput-object v7, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 239
    .line 240
    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 241
    .line 242
    iput-object v5, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    .line 243
    .line 244
    iput v4, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    .line 245
    .line 246
    invoke-direct {v7, p1, v6, v0}, Landroidx/paging/PageFetcherSnapshot;->setLoading(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    if-ne p1, v1, :cond_2

    .line 251
    .line 252
    goto/16 :goto_d

    .line 253
    .line 254
    :cond_2
    move-object v6, v7

    .line 255
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 256
    .line 257
    invoke-interface {v2, v5}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    sget-object p1, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 261
    .line 262
    iget-object v2, v6, Landroidx/paging/PageFetcherSnapshot;->initialKey:Ljava/lang/Object;

    .line 263
    .line 264
    invoke-direct {v6, p1, v2}, Landroidx/paging/PageFetcherSnapshot;->loadParams(Landroidx/paging/LoadType;Ljava/lang/Object;)Landroidx/paging/PagingSource$LoadParams;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    sget-object v2, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 269
    .line 270
    invoke-virtual {v2, v3}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 271
    .line 272
    .line 273
    move-result v7

    .line 274
    if-eqz v7, :cond_3

    .line 275
    .line 276
    new-instance v7, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    const-string v8, "Start REFRESH with loadKey "

    .line 282
    .line 283
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    iget-object v8, v6, Landroidx/paging/PageFetcherSnapshot;->initialKey:Ljava/lang/Object;

    .line 287
    .line 288
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    const-string v8, " on "

    .line 292
    .line 293
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    iget-object v8, v6, Landroidx/paging/PageFetcherSnapshot;->pagingSource:Landroidx/paging/PagingSource;

    .line 297
    .line 298
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    invoke-virtual {v2, v3, v7, v5}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 306
    .line 307
    .line 308
    :cond_3
    iget-object v2, v6, Landroidx/paging/PageFetcherSnapshot;->pagingSource:Landroidx/paging/PagingSource;

    .line 309
    .line 310
    iput-object v6, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 311
    .line 312
    iput-object v5, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 313
    .line 314
    iput v3, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    .line 315
    .line 316
    invoke-virtual {v2, p1, v0}, Landroidx/paging/PagingSource;->load(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    if-ne p1, v1, :cond_4

    .line 321
    .line 322
    goto/16 :goto_d

    .line 323
    .line 324
    :cond_4
    :goto_3
    check-cast p1, Landroidx/paging/PagingSource$LoadResult;

    .line 325
    .line 326
    instance-of v2, p1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 327
    .line 328
    if-eqz v2, :cond_10

    .line 329
    .line 330
    iget-object v2, v6, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 331
    .line 332
    invoke-static {v2}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lkotlinx/coroutines/sync/Mutex;

    .line 333
    .line 334
    .line 335
    move-result-object v7

    .line 336
    iput-object v6, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 337
    .line 338
    iput-object p1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 339
    .line 340
    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    .line 341
    .line 342
    iput-object v7, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$3:Ljava/lang/Object;

    .line 343
    .line 344
    const/4 v8, 0x4

    .line 345
    iput v8, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    .line 346
    .line 347
    invoke-interface {v7, v5, v0}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v8

    .line 351
    if-ne v8, v1, :cond_5

    .line 352
    .line 353
    goto/16 :goto_d

    .line 354
    .line 355
    :cond_5
    move-object v8, v6

    .line 356
    move-object v6, v2

    .line 357
    move-object v2, v7

    .line 358
    move-object v7, p1

    .line 359
    :goto_4
    :try_start_4
    invoke-static {v6}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    sget-object v6, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 364
    .line 365
    move-object v9, v7

    .line 366
    check-cast v9, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 367
    .line 368
    const/4 v10, 0x0

    .line 369
    invoke-virtual {p1, v10, v6, v9}, Landroidx/paging/PageFetcherSnapshotState;->insert(ILandroidx/paging/LoadType;Landroidx/paging/PagingSource$LoadResult$Page;)Z

    .line 370
    .line 371
    .line 372
    move-result v9

    .line 373
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common_release()Landroidx/paging/MutableLoadStateCollection;

    .line 374
    .line 375
    .line 376
    move-result-object v10

    .line 377
    sget-object v11, Landroidx/paging/LoadState$NotLoading;->Companion:Landroidx/paging/LoadState$NotLoading$Companion;

    .line 378
    .line 379
    invoke-virtual {v11}, Landroidx/paging/LoadState$NotLoading$Companion;->getIncomplete$paging_common_release()Landroidx/paging/LoadState$NotLoading;

    .line 380
    .line 381
    .line 382
    move-result-object v12

    .line 383
    invoke-virtual {v10, v6, v12}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V

    .line 384
    .line 385
    .line 386
    move-object v10, v7

    .line 387
    check-cast v10, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 388
    .line 389
    invoke-virtual {v10}, Landroidx/paging/PagingSource$LoadResult$Page;->getPrevKey()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v10

    .line 393
    if-nez v10, :cond_6

    .line 394
    .line 395
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common_release()Landroidx/paging/MutableLoadStateCollection;

    .line 396
    .line 397
    .line 398
    move-result-object v10

    .line 399
    sget-object v12, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 400
    .line 401
    invoke-virtual {v11}, Landroidx/paging/LoadState$NotLoading$Companion;->getComplete$paging_common_release()Landroidx/paging/LoadState$NotLoading;

    .line 402
    .line 403
    .line 404
    move-result-object v13

    .line 405
    invoke-virtual {v10, v12, v13}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V

    .line 406
    .line 407
    .line 408
    goto :goto_5

    .line 409
    :catchall_3
    move-exception p1

    .line 410
    goto/16 :goto_b

    .line 411
    .line 412
    :cond_6
    :goto_5
    move-object v10, v7

    .line 413
    check-cast v10, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 414
    .line 415
    invoke-virtual {v10}, Landroidx/paging/PagingSource$LoadResult$Page;->getNextKey()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v10

    .line 419
    if-nez v10, :cond_7

    .line 420
    .line 421
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common_release()Landroidx/paging/MutableLoadStateCollection;

    .line 422
    .line 423
    .line 424
    move-result-object p1

    .line 425
    sget-object v10, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 426
    .line 427
    invoke-virtual {v11}, Landroidx/paging/LoadState$NotLoading$Companion;->getComplete$paging_common_release()Landroidx/paging/LoadState$NotLoading;

    .line 428
    .line 429
    .line 430
    move-result-object v11

    .line 431
    invoke-virtual {p1, v10, v11}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 432
    .line 433
    .line 434
    :cond_7
    invoke-interface {v2, v5}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    if-eqz v9, :cond_b

    .line 438
    .line 439
    sget-object p1, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 440
    .line 441
    invoke-virtual {p1, v3}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 442
    .line 443
    .line 444
    move-result v2

    .line 445
    if-eqz v2, :cond_8

    .line 446
    .line 447
    iget-object v2, v8, Landroidx/paging/PageFetcherSnapshot;->initialKey:Ljava/lang/Object;

    .line 448
    .line 449
    invoke-direct {v8, v6, v2, v7}, Landroidx/paging/PageFetcherSnapshot;->loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    invoke-virtual {p1, v3, v2, v5}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 454
    .line 455
    .line 456
    :cond_8
    iget-object v3, v8, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 457
    .line 458
    invoke-static {v3}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lkotlinx/coroutines/sync/Mutex;

    .line 459
    .line 460
    .line 461
    move-result-object p1

    .line 462
    iput-object v8, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 463
    .line 464
    iput-object v7, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 465
    .line 466
    iput-object v3, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    .line 467
    .line 468
    iput-object p1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$3:Ljava/lang/Object;

    .line 469
    .line 470
    const/4 v2, 0x5

    .line 471
    iput v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    .line 472
    .line 473
    invoke-interface {p1, v5, v0}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    if-ne v2, v1, :cond_9

    .line 478
    .line 479
    goto/16 :goto_d

    .line 480
    .line 481
    :cond_9
    move-object v2, p1

    .line 482
    move-object v4, v7

    .line 483
    move-object v6, v8

    .line 484
    :goto_6
    :try_start_5
    invoke-static {v3}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 485
    .line 486
    .line 487
    move-result-object p1

    .line 488
    iget-object v3, v6, Landroidx/paging/PageFetcherSnapshot;->pageEventCh:Lkotlinx/coroutines/channels/Channel;

    .line 489
    .line 490
    move-object v7, v4

    .line 491
    check-cast v7, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 492
    .line 493
    sget-object v8, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 494
    .line 495
    invoke-virtual {p1, v7, v8}, Landroidx/paging/PageFetcherSnapshotState;->toPageEvent$paging_common_release(Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/LoadType;)Landroidx/paging/PageEvent;

    .line 496
    .line 497
    .line 498
    move-result-object p1

    .line 499
    iput-object v6, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 500
    .line 501
    iput-object v4, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 502
    .line 503
    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    .line 504
    .line 505
    iput-object v5, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$3:Ljava/lang/Object;

    .line 506
    .line 507
    const/4 v7, 0x6

    .line 508
    iput v7, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    .line 509
    .line 510
    invoke-interface {v3, p1, v0}, Lkotlinx/coroutines/channels/SendChannel;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object p1

    .line 514
    if-ne p1, v1, :cond_a

    .line 515
    .line 516
    goto/16 :goto_d

    .line 517
    .line 518
    :cond_a
    move-object v3, v4

    .line 519
    move-object v4, v6

    .line 520
    :goto_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 521
    .line 522
    invoke-interface {v2, v5}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    goto :goto_9

    .line 526
    :goto_8
    invoke-interface {v2, v5}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    throw p1

    .line 530
    :cond_b
    sget-object p1, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 531
    .line 532
    invoke-virtual {p1, v4}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    if-eqz v2, :cond_c

    .line 537
    .line 538
    iget-object v2, v8, Landroidx/paging/PageFetcherSnapshot;->initialKey:Ljava/lang/Object;

    .line 539
    .line 540
    invoke-direct {v8, v6, v2, v5}, Landroidx/paging/PageFetcherSnapshot;->loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    invoke-virtual {p1, v4, v2, v5}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 545
    .line 546
    .line 547
    :cond_c
    move-object v3, v7

    .line 548
    move-object v4, v8

    .line 549
    :goto_9
    iget-object p1, v4, Landroidx/paging/PageFetcherSnapshot;->remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;

    .line 550
    .line 551
    if-eqz p1, :cond_16

    .line 552
    .line 553
    move-object p1, v3

    .line 554
    check-cast p1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 555
    .line 556
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadResult$Page;->getPrevKey()Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    if-eqz v2, :cond_d

    .line 561
    .line 562
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadResult$Page;->getNextKey()Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object p1

    .line 566
    if-nez p1, :cond_16

    .line 567
    .line 568
    :cond_d
    iget-object v2, v4, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 569
    .line 570
    invoke-static {v2}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lkotlinx/coroutines/sync/Mutex;

    .line 571
    .line 572
    .line 573
    move-result-object p1

    .line 574
    iput-object v4, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 575
    .line 576
    iput-object v3, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 577
    .line 578
    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    .line 579
    .line 580
    iput-object p1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$3:Ljava/lang/Object;

    .line 581
    .line 582
    const/4 v6, 0x7

    .line 583
    iput v6, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    .line 584
    .line 585
    invoke-interface {p1, v5, v0}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    if-ne v0, v1, :cond_e

    .line 590
    .line 591
    goto/16 :goto_d

    .line 592
    .line 593
    :cond_e
    move-object v1, p1

    .line 594
    move-object v0, v4

    .line 595
    :goto_a
    :try_start_6
    invoke-static {v2}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 596
    .line 597
    .line 598
    move-result-object p1

    .line 599
    iget-object v2, v0, Landroidx/paging/PageFetcherSnapshot;->hintHandler:Landroidx/paging/HintHandler;

    .line 600
    .line 601
    invoke-virtual {v2}, Landroidx/paging/HintHandler;->getLastAccessHint()Landroidx/paging/ViewportHint$Access;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    invoke-virtual {p1, v2}, Landroidx/paging/PageFetcherSnapshotState;->currentPagingState$paging_common_release(Landroidx/paging/ViewportHint$Access;)Landroidx/paging/PagingState;

    .line 606
    .line 607
    .line 608
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 609
    invoke-interface {v1, v5}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    check-cast v3, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 613
    .line 614
    invoke-virtual {v3}, Landroidx/paging/PagingSource$LoadResult$Page;->getPrevKey()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    if-nez v1, :cond_f

    .line 619
    .line 620
    iget-object v1, v0, Landroidx/paging/PageFetcherSnapshot;->remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;

    .line 621
    .line 622
    sget-object v2, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 623
    .line 624
    invoke-interface {v1, v2, p1}, Landroidx/paging/RemoteMediatorConnection;->requestLoad(Landroidx/paging/LoadType;Landroidx/paging/PagingState;)V

    .line 625
    .line 626
    .line 627
    :cond_f
    invoke-virtual {v3}, Landroidx/paging/PagingSource$LoadResult$Page;->getNextKey()Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    if-nez v1, :cond_16

    .line 632
    .line 633
    iget-object v0, v0, Landroidx/paging/PageFetcherSnapshot;->remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;

    .line 634
    .line 635
    sget-object v1, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 636
    .line 637
    invoke-interface {v0, v1, p1}, Landroidx/paging/RemoteMediatorConnection;->requestLoad(Landroidx/paging/LoadType;Landroidx/paging/PagingState;)V

    .line 638
    .line 639
    .line 640
    goto/16 :goto_10

    .line 641
    .line 642
    :catchall_4
    move-exception p1

    .line 643
    invoke-interface {v1, v5}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 644
    .line 645
    .line 646
    throw p1

    .line 647
    :goto_b
    invoke-interface {v2, v5}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    throw p1

    .line 651
    :cond_10
    instance-of v2, p1, Landroidx/paging/PagingSource$LoadResult$Error;

    .line 652
    .line 653
    if-eqz v2, :cond_14

    .line 654
    .line 655
    sget-object v2, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 656
    .line 657
    invoke-virtual {v2, v4}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 658
    .line 659
    .line 660
    move-result v3

    .line 661
    if-eqz v3, :cond_11

    .line 662
    .line 663
    sget-object v3, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 664
    .line 665
    iget-object v7, v6, Landroidx/paging/PageFetcherSnapshot;->initialKey:Ljava/lang/Object;

    .line 666
    .line 667
    invoke-direct {v6, v3, v7, p1}, Landroidx/paging/PageFetcherSnapshot;->loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v3

    .line 671
    invoke-virtual {v2, v4, v3, v5}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 672
    .line 673
    .line 674
    :cond_11
    iget-object v3, v6, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 675
    .line 676
    invoke-static {v3}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lkotlinx/coroutines/sync/Mutex;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    iput-object v6, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 681
    .line 682
    iput-object p1, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 683
    .line 684
    iput-object v3, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    .line 685
    .line 686
    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$3:Ljava/lang/Object;

    .line 687
    .line 688
    const/16 v4, 0x8

    .line 689
    .line 690
    iput v4, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    .line 691
    .line 692
    invoke-interface {v2, v5, v0}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v4

    .line 696
    if-ne v4, v1, :cond_12

    .line 697
    .line 698
    goto :goto_d

    .line 699
    :cond_12
    move-object v4, p1

    .line 700
    :goto_c
    :try_start_7
    invoke-static {v3}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 701
    .line 702
    .line 703
    move-result-object p1

    .line 704
    new-instance v3, Landroidx/paging/LoadState$Error;

    .line 705
    .line 706
    check-cast v4, Landroidx/paging/PagingSource$LoadResult$Error;

    .line 707
    .line 708
    invoke-virtual {v4}, Landroidx/paging/PagingSource$LoadResult$Error;->getThrowable()Ljava/lang/Throwable;

    .line 709
    .line 710
    .line 711
    move-result-object v4

    .line 712
    invoke-direct {v3, v4}, Landroidx/paging/LoadState$Error;-><init>(Ljava/lang/Throwable;)V

    .line 713
    .line 714
    .line 715
    sget-object v4, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 716
    .line 717
    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 718
    .line 719
    iput-object v5, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 720
    .line 721
    iput-object v5, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$2:Ljava/lang/Object;

    .line 722
    .line 723
    iput-object v5, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->L$3:Ljava/lang/Object;

    .line 724
    .line 725
    const/16 v7, 0x9

    .line 726
    .line 727
    iput v7, v0, Landroidx/paging/PageFetcherSnapshot$doInitialLoad$1;->label:I

    .line 728
    .line 729
    invoke-direct {v6, p1, v4, v3, v0}, Landroidx/paging/PageFetcherSnapshot;->setError(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 733
    if-ne p1, v1, :cond_13

    .line 734
    .line 735
    :goto_d
    return-object v1

    .line 736
    :cond_13
    move-object v0, v2

    .line 737
    :goto_e
    :try_start_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 738
    .line 739
    invoke-interface {v0, v5}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 740
    .line 741
    .line 742
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 743
    .line 744
    return-object p1

    .line 745
    :catchall_5
    move-exception p1

    .line 746
    move-object v0, v2

    .line 747
    :goto_f
    invoke-interface {v0, v5}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 748
    .line 749
    .line 750
    throw p1

    .line 751
    :cond_14
    instance-of v0, p1, Landroidx/paging/PagingSource$LoadResult$Invalid;

    .line 752
    .line 753
    if-eqz v0, :cond_16

    .line 754
    .line 755
    sget-object v0, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 756
    .line 757
    invoke-virtual {v0, v4}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 758
    .line 759
    .line 760
    move-result v1

    .line 761
    if-eqz v1, :cond_15

    .line 762
    .line 763
    sget-object v1, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 764
    .line 765
    iget-object v2, v6, Landroidx/paging/PageFetcherSnapshot;->initialKey:Ljava/lang/Object;

    .line 766
    .line 767
    invoke-direct {v6, v1, v2, p1}, Landroidx/paging/PageFetcherSnapshot;->loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object p1

    .line 771
    invoke-virtual {v0, v4, p1, v5}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 772
    .line 773
    .line 774
    :cond_15
    invoke-direct {v6}, Landroidx/paging/PageFetcherSnapshot;->onInvalidLoad()V

    .line 775
    .line 776
    .line 777
    :cond_16
    :goto_10
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 778
    .line 779
    return-object p1

    .line 780
    :goto_11
    invoke-interface {v2, v5}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 781
    .line 782
    .line 783
    throw p1

    .line 784
    nop

    .line 785
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final doLoad(Landroidx/paging/LoadType;Landroidx/paging/GenerationalViewportHint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/LoadType;",
            "Landroidx/paging/GenerationalViewportHint;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    instance-of v3, v2, Landroidx/paging/PageFetcherSnapshot$doLoad$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;

    .line 13
    .line 14
    iget v4, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;

    .line 27
    .line 28
    invoke-direct {v3, v1, v2}, Landroidx/paging/PageFetcherSnapshot$doLoad$1;-><init>(Landroidx/paging/PageFetcherSnapshot;Lkotlin/coroutines/Continuation;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 38
    .line 39
    const-string v6, "Use doInitialLoad for LoadType == REFRESH"

    .line 40
    .line 41
    packed-switch v5, :pswitch_data_0

    .line 42
    .line 43
    .line 44
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :pswitch_0
    iget v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->I$1:I

    .line 53
    .line 54
    iget v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->I$0:I

    .line 55
    .line 56
    iget-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v12, Lkotlinx/coroutines/sync/Mutex;

    .line 59
    .line 60
    iget-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v13, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 63
    .line 64
    iget-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v14, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 67
    .line 68
    iget-object v15, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v15, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 71
    .line 72
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v7, Lkotlin/jvm/internal/Ref$IntRef;

    .line 75
    .line 76
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v8, Landroidx/paging/GenerationalViewportHint;

    .line 79
    .line 80
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v9, Landroidx/paging/LoadType;

    .line 83
    .line 84
    iget-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v11, Landroidx/paging/PageFetcherSnapshot;

    .line 87
    .line 88
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-object v10, v8

    .line 92
    move-object v1, v12

    .line 93
    move-object v8, v15

    .line 94
    move-object v12, v11

    .line 95
    move-object v11, v9

    .line 96
    move-object v9, v7

    .line 97
    goto/16 :goto_26

    .line 98
    .line 99
    :pswitch_1
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$8:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v5, v0

    .line 102
    check-cast v5, Lkotlinx/coroutines/sync/Mutex;

    .line 103
    .line 104
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Landroidx/paging/PagingSource$LoadResult;

    .line 107
    .line 108
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v7, Landroidx/paging/PagingSource$LoadParams;

    .line 111
    .line 112
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v8, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 115
    .line 116
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v9, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 119
    .line 120
    iget-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v11, Lkotlin/jvm/internal/Ref$IntRef;

    .line 123
    .line 124
    iget-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v12, Landroidx/paging/GenerationalViewportHint;

    .line 127
    .line 128
    iget-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v13, Landroidx/paging/LoadType;

    .line 131
    .line 132
    iget-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v14, Landroidx/paging/PageFetcherSnapshot;

    .line 135
    .line 136
    :try_start_0
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    .line 138
    .line 139
    move-object v10, v12

    .line 140
    move-object v12, v11

    .line 141
    move-object v11, v13

    .line 142
    goto/16 :goto_22

    .line 143
    .line 144
    :catchall_0
    move-exception v0

    .line 145
    :goto_1
    const/4 v14, 0x0

    .line 146
    goto/16 :goto_27

    .line 147
    .line 148
    :pswitch_2
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$9:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, Landroidx/paging/PageFetcherSnapshotState;

    .line 151
    .line 152
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$8:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v5, Lkotlinx/coroutines/sync/Mutex;

    .line 155
    .line 156
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v7, Landroidx/paging/PagingSource$LoadResult;

    .line 159
    .line 160
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v8, Landroidx/paging/PagingSource$LoadParams;

    .line 163
    .line 164
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v9, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 167
    .line 168
    iget-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v11, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 171
    .line 172
    iget-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v12, Lkotlin/jvm/internal/Ref$IntRef;

    .line 175
    .line 176
    iget-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v13, Landroidx/paging/GenerationalViewportHint;

    .line 179
    .line 180
    iget-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v14, Landroidx/paging/LoadType;

    .line 183
    .line 184
    iget-object v15, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v15, Landroidx/paging/PageFetcherSnapshot;

    .line 187
    .line 188
    :try_start_1
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 189
    .line 190
    .line 191
    goto/16 :goto_1e

    .line 192
    .line 193
    :pswitch_3
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$10:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, Lkotlinx/coroutines/sync/Mutex;

    .line 196
    .line 197
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$9:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v5, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 200
    .line 201
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$8:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v7, Landroidx/paging/LoadType;

    .line 204
    .line 205
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v8, Landroidx/paging/PagingSource$LoadResult;

    .line 208
    .line 209
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v9, Landroidx/paging/PagingSource$LoadParams;

    .line 212
    .line 213
    iget-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v11, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 216
    .line 217
    iget-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v12, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 220
    .line 221
    iget-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v13, Lkotlin/jvm/internal/Ref$IntRef;

    .line 224
    .line 225
    iget-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v14, Landroidx/paging/GenerationalViewportHint;

    .line 228
    .line 229
    iget-object v15, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v15, Landroidx/paging/LoadType;

    .line 232
    .line 233
    iget-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v10, Landroidx/paging/PageFetcherSnapshot;

    .line 236
    .line 237
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    move-object v2, v8

    .line 241
    move-object v8, v9

    .line 242
    move-object v9, v11

    .line 243
    move-object v11, v12

    .line 244
    move-object v12, v13

    .line 245
    move-object v13, v14

    .line 246
    move-object v14, v7

    .line 247
    move-object v7, v0

    .line 248
    goto/16 :goto_1d

    .line 249
    .line 250
    :pswitch_4
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v0, Landroidx/paging/PageFetcherSnapshotState;

    .line 253
    .line 254
    iget-object v4, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v4, Lkotlinx/coroutines/sync/Mutex;

    .line 257
    .line 258
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v5, Landroidx/paging/GenerationalViewportHint;

    .line 261
    .line 262
    iget-object v3, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v3, Landroidx/paging/LoadType;

    .line 265
    .line 266
    :try_start_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 267
    .line 268
    .line 269
    goto/16 :goto_19

    .line 270
    .line 271
    :catchall_1
    move-exception v0

    .line 272
    :goto_2
    const/4 v14, 0x0

    .line 273
    goto/16 :goto_1a

    .line 274
    .line 275
    :pswitch_5
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v0, Lkotlinx/coroutines/sync/Mutex;

    .line 278
    .line 279
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v5, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 282
    .line 283
    iget-object v6, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v6, Landroidx/paging/PagingSource$LoadResult;

    .line 286
    .line 287
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v7, Landroidx/paging/GenerationalViewportHint;

    .line 290
    .line 291
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v8, Landroidx/paging/LoadType;

    .line 294
    .line 295
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v9, Landroidx/paging/PageFetcherSnapshot;

    .line 298
    .line 299
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    move-object v2, v0

    .line 303
    move-object v0, v3

    .line 304
    move-object v12, v7

    .line 305
    move-object v3, v8

    .line 306
    goto/16 :goto_18

    .line 307
    .line 308
    :pswitch_6
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$9:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v0, Lkotlinx/coroutines/sync/Mutex;

    .line 311
    .line 312
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$8:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v5, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 315
    .line 316
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v7, Landroidx/paging/PagingSource$LoadResult;

    .line 319
    .line 320
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v8, Landroidx/paging/PagingSource$LoadParams;

    .line 323
    .line 324
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v9, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 327
    .line 328
    iget-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v10, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 331
    .line 332
    iget-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v11, Lkotlin/jvm/internal/Ref$IntRef;

    .line 335
    .line 336
    iget-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v12, Landroidx/paging/GenerationalViewportHint;

    .line 339
    .line 340
    iget-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v13, Landroidx/paging/LoadType;

    .line 343
    .line 344
    iget-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v14, Landroidx/paging/PageFetcherSnapshot;

    .line 347
    .line 348
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    move-object v2, v7

    .line 352
    move-object v7, v0

    .line 353
    goto/16 :goto_13

    .line 354
    .line 355
    :pswitch_7
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v0, Landroidx/paging/PagingSource$LoadParams;

    .line 358
    .line 359
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v5, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 362
    .line 363
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 366
    .line 367
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v8, Lkotlin/jvm/internal/Ref$IntRef;

    .line 370
    .line 371
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v9, Landroidx/paging/GenerationalViewportHint;

    .line 374
    .line 375
    iget-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v10, Landroidx/paging/LoadType;

    .line 378
    .line 379
    iget-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v11, Landroidx/paging/PageFetcherSnapshot;

    .line 382
    .line 383
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    move-object v12, v9

    .line 387
    move-object v13, v10

    .line 388
    move-object v9, v11

    .line 389
    move-object v10, v7

    .line 390
    move-object v11, v8

    .line 391
    move-object v8, v0

    .line 392
    move-object v0, v5

    .line 393
    goto/16 :goto_f

    .line 394
    .line 395
    :pswitch_8
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 398
    .line 399
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 400
    .line 401
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v7, Lkotlinx/coroutines/sync/Mutex;

    .line 404
    .line 405
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v8, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 408
    .line 409
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v9, Lkotlin/jvm/internal/Ref$IntRef;

    .line 412
    .line 413
    iget-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v10, Landroidx/paging/GenerationalViewportHint;

    .line 416
    .line 417
    iget-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v11, Landroidx/paging/LoadType;

    .line 420
    .line 421
    iget-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v12, Landroidx/paging/PageFetcherSnapshot;

    .line 424
    .line 425
    :try_start_3
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 426
    .line 427
    .line 428
    goto/16 :goto_a

    .line 429
    .line 430
    :catchall_2
    move-exception v0

    .line 431
    :goto_3
    const/4 v14, 0x0

    .line 432
    goto/16 :goto_29

    .line 433
    .line 434
    :pswitch_9
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 437
    .line 438
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v5, Lkotlinx/coroutines/sync/Mutex;

    .line 441
    .line 442
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast v7, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 445
    .line 446
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v8, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 449
    .line 450
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v9, Lkotlin/jvm/internal/Ref$IntRef;

    .line 453
    .line 454
    iget-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v10, Landroidx/paging/GenerationalViewportHint;

    .line 457
    .line 458
    iget-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v11, Landroidx/paging/LoadType;

    .line 461
    .line 462
    iget-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v12, Landroidx/paging/PageFetcherSnapshot;

    .line 465
    .line 466
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    goto/16 :goto_9

    .line 470
    .line 471
    :pswitch_a
    iget-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v0, Lkotlinx/coroutines/sync/Mutex;

    .line 474
    .line 475
    iget-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v5, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 478
    .line 479
    iget-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v7, Lkotlin/jvm/internal/Ref$IntRef;

    .line 482
    .line 483
    iget-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast v8, Landroidx/paging/GenerationalViewportHint;

    .line 486
    .line 487
    iget-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v9, Landroidx/paging/LoadType;

    .line 490
    .line 491
    iget-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 492
    .line 493
    check-cast v10, Landroidx/paging/PageFetcherSnapshot;

    .line 494
    .line 495
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    move-object v2, v0

    .line 499
    move-object v0, v9

    .line 500
    goto :goto_4

    .line 501
    :pswitch_b
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    sget-object v2, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 505
    .line 506
    if-eq v0, v2, :cond_2e

    .line 507
    .line 508
    new-instance v7, Lkotlin/jvm/internal/Ref$IntRef;

    .line 509
    .line 510
    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 511
    .line 512
    .line 513
    iget-object v5, v1, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 514
    .line 515
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lkotlinx/coroutines/sync/Mutex;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    iput-object v1, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 520
    .line 521
    iput-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 522
    .line 523
    move-object/from16 v8, p2

    .line 524
    .line 525
    iput-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 526
    .line 527
    iput-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 528
    .line 529
    iput-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 530
    .line 531
    iput-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 532
    .line 533
    const/4 v9, 0x1

    .line 534
    iput v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 535
    .line 536
    const/4 v9, 0x0

    .line 537
    invoke-interface {v2, v9, v3}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v10

    .line 541
    if-ne v10, v4, :cond_1

    .line 542
    .line 543
    goto/16 :goto_25

    .line 544
    .line 545
    :cond_1
    move-object v10, v1

    .line 546
    :goto_4
    :try_start_4
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 547
    .line 548
    .line 549
    move-result-object v5

    .line 550
    sget-object v9, Landroidx/paging/PageFetcherSnapshot$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 551
    .line 552
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 553
    .line 554
    .line 555
    move-result v11

    .line 556
    aget v9, v9, v11

    .line 557
    .line 558
    const/4 v11, 0x1

    .line 559
    if-eq v9, v11, :cond_2d

    .line 560
    .line 561
    const/4 v12, 0x2

    .line 562
    if-eq v9, v12, :cond_4

    .line 563
    .line 564
    const/4 v12, 0x3

    .line 565
    if-eq v9, v12, :cond_2

    .line 566
    .line 567
    goto/16 :goto_8

    .line 568
    .line 569
    :cond_2
    invoke-virtual {v5}, Landroidx/paging/PageFetcherSnapshotState;->getInitialPageIndex$paging_common_release()I

    .line 570
    .line 571
    .line 572
    move-result v9

    .line 573
    invoke-virtual {v8}, Landroidx/paging/GenerationalViewportHint;->getHint()Landroidx/paging/ViewportHint;

    .line 574
    .line 575
    .line 576
    move-result-object v12

    .line 577
    invoke-virtual {v12}, Landroidx/paging/ViewportHint;->getOriginalPageOffsetLast()I

    .line 578
    .line 579
    .line 580
    move-result v12

    .line 581
    add-int/2addr v9, v12

    .line 582
    add-int/2addr v9, v11

    .line 583
    if-gez v9, :cond_3

    .line 584
    .line 585
    iget v11, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 586
    .line 587
    iget-object v12, v10, Landroidx/paging/PageFetcherSnapshot;->config:Landroidx/paging/PagingConfig;

    .line 588
    .line 589
    iget v12, v12, Landroidx/paging/PagingConfig;->pageSize:I

    .line 590
    .line 591
    neg-int v9, v9

    .line 592
    mul-int/2addr v12, v9

    .line 593
    add-int/2addr v11, v12

    .line 594
    iput v11, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 595
    .line 596
    const/4 v9, 0x0

    .line 597
    goto :goto_5

    .line 598
    :catchall_3
    move-exception v0

    .line 599
    const/4 v14, 0x0

    .line 600
    goto/16 :goto_2a

    .line 601
    .line 602
    :cond_3
    :goto_5
    invoke-virtual {v5}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common_release()Ljava/util/List;

    .line 603
    .line 604
    .line 605
    move-result-object v11

    .line 606
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    .line 607
    .line 608
    .line 609
    move-result v11

    .line 610
    if-gt v9, v11, :cond_6

    .line 611
    .line 612
    :goto_6
    iget v12, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 613
    .line 614
    invoke-virtual {v5}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common_release()Ljava/util/List;

    .line 615
    .line 616
    .line 617
    move-result-object v13

    .line 618
    invoke-interface {v13, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v13

    .line 622
    check-cast v13, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 623
    .line 624
    invoke-virtual {v13}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 625
    .line 626
    .line 627
    move-result-object v13

    .line 628
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 629
    .line 630
    .line 631
    move-result v13

    .line 632
    add-int/2addr v12, v13

    .line 633
    iput v12, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 634
    .line 635
    if-eq v9, v11, :cond_6

    .line 636
    .line 637
    add-int/lit8 v9, v9, 0x1

    .line 638
    .line 639
    goto :goto_6

    .line 640
    :cond_4
    invoke-virtual {v5}, Landroidx/paging/PageFetcherSnapshotState;->getInitialPageIndex$paging_common_release()I

    .line 641
    .line 642
    .line 643
    move-result v9

    .line 644
    invoke-virtual {v8}, Landroidx/paging/GenerationalViewportHint;->getHint()Landroidx/paging/ViewportHint;

    .line 645
    .line 646
    .line 647
    move-result-object v11

    .line 648
    invoke-virtual {v11}, Landroidx/paging/ViewportHint;->getOriginalPageOffsetFirst()I

    .line 649
    .line 650
    .line 651
    move-result v11

    .line 652
    add-int/2addr v9, v11

    .line 653
    const/16 v17, 0x1

    .line 654
    .line 655
    add-int/lit8 v9, v9, -0x1

    .line 656
    .line 657
    invoke-virtual {v5}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common_release()Ljava/util/List;

    .line 658
    .line 659
    .line 660
    move-result-object v11

    .line 661
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    .line 662
    .line 663
    .line 664
    move-result v11

    .line 665
    if-le v9, v11, :cond_5

    .line 666
    .line 667
    iget v11, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 668
    .line 669
    iget-object v12, v10, Landroidx/paging/PageFetcherSnapshot;->config:Landroidx/paging/PagingConfig;

    .line 670
    .line 671
    iget v12, v12, Landroidx/paging/PagingConfig;->pageSize:I

    .line 672
    .line 673
    invoke-virtual {v5}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common_release()Ljava/util/List;

    .line 674
    .line 675
    .line 676
    move-result-object v13

    .line 677
    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    .line 678
    .line 679
    .line 680
    move-result v13

    .line 681
    sub-int/2addr v9, v13

    .line 682
    mul-int/2addr v12, v9

    .line 683
    add-int/2addr v11, v12

    .line 684
    iput v11, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 685
    .line 686
    invoke-virtual {v5}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common_release()Ljava/util/List;

    .line 687
    .line 688
    .line 689
    move-result-object v9

    .line 690
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    .line 691
    .line 692
    .line 693
    move-result v9

    .line 694
    :cond_5
    if-ltz v9, :cond_6

    .line 695
    .line 696
    const/4 v11, 0x0

    .line 697
    :goto_7
    iget v12, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 698
    .line 699
    invoke-virtual {v5}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common_release()Ljava/util/List;

    .line 700
    .line 701
    .line 702
    move-result-object v13

    .line 703
    invoke-interface {v13, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v13

    .line 707
    check-cast v13, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 708
    .line 709
    invoke-virtual {v13}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 710
    .line 711
    .line 712
    move-result-object v13

    .line 713
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 714
    .line 715
    .line 716
    move-result v13

    .line 717
    add-int/2addr v12, v13

    .line 718
    iput v12, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 719
    .line 720
    if-eq v11, v9, :cond_6

    .line 721
    .line 722
    add-int/lit8 v11, v11, 0x1

    .line 723
    .line 724
    goto :goto_7

    .line 725
    :cond_6
    :goto_8
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 726
    .line 727
    const/4 v9, 0x0

    .line 728
    invoke-interface {v2, v9}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 729
    .line 730
    .line 731
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 732
    .line 733
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 734
    .line 735
    .line 736
    iget-object v5, v10, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 737
    .line 738
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lkotlinx/coroutines/sync/Mutex;

    .line 739
    .line 740
    .line 741
    move-result-object v9

    .line 742
    iput-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 743
    .line 744
    iput-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 745
    .line 746
    iput-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 747
    .line 748
    iput-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 749
    .line 750
    iput-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 751
    .line 752
    iput-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 753
    .line 754
    iput-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 755
    .line 756
    iput-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 757
    .line 758
    const/4 v12, 0x2

    .line 759
    iput v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 760
    .line 761
    const/4 v11, 0x0

    .line 762
    invoke-interface {v9, v11, v3}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v12

    .line 766
    if-ne v12, v4, :cond_7

    .line 767
    .line 768
    goto/16 :goto_25

    .line 769
    .line 770
    :cond_7
    move-object v11, v7

    .line 771
    move-object v7, v5

    .line 772
    move-object v5, v9

    .line 773
    move-object v9, v11

    .line 774
    move-object v11, v0

    .line 775
    move-object v0, v2

    .line 776
    move-object v12, v10

    .line 777
    move-object v10, v8

    .line 778
    move-object v8, v0

    .line 779
    :goto_9
    :try_start_5
    invoke-static {v7}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 780
    .line 781
    .line 782
    move-result-object v2

    .line 783
    invoke-virtual {v10}, Landroidx/paging/GenerationalViewportHint;->getGenerationId()I

    .line 784
    .line 785
    .line 786
    move-result v7

    .line 787
    invoke-virtual {v10}, Landroidx/paging/GenerationalViewportHint;->getHint()Landroidx/paging/ViewportHint;

    .line 788
    .line 789
    .line 790
    move-result-object v13

    .line 791
    invoke-virtual {v13, v11}, Landroidx/paging/ViewportHint;->presentedItemsBeyondAnchor$paging_common_release(Landroidx/paging/LoadType;)I

    .line 792
    .line 793
    .line 794
    move-result v13

    .line 795
    iget v14, v9, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 796
    .line 797
    add-int/2addr v13, v14

    .line 798
    invoke-direct {v12, v2, v11, v7, v13}, Landroidx/paging/PageFetcherSnapshot;->nextLoadKeyOrNull(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;II)Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v7

    .line 802
    if-eqz v7, :cond_9

    .line 803
    .line 804
    iput-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 805
    .line 806
    iput-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 807
    .line 808
    iput-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 809
    .line 810
    iput-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 811
    .line 812
    iput-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 813
    .line 814
    iput-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 815
    .line 816
    iput-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 817
    .line 818
    iput-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 819
    .line 820
    const/4 v13, 0x3

    .line 821
    iput v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 822
    .line 823
    invoke-direct {v12, v2, v11, v3}, Landroidx/paging/PageFetcherSnapshot;->setLoading(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 827
    if-ne v2, v4, :cond_8

    .line 828
    .line 829
    goto/16 :goto_25

    .line 830
    .line 831
    :cond_8
    move-object/from16 v18, v7

    .line 832
    .line 833
    move-object v7, v5

    .line 834
    move-object/from16 v5, v18

    .line 835
    .line 836
    :goto_a
    move-object v2, v5

    .line 837
    move-object v5, v7

    .line 838
    :goto_b
    const/4 v7, 0x0

    .line 839
    goto :goto_c

    .line 840
    :catchall_4
    move-exception v0

    .line 841
    move-object v7, v5

    .line 842
    goto/16 :goto_3

    .line 843
    .line 844
    :cond_9
    const/4 v2, 0x0

    .line 845
    goto :goto_b

    .line 846
    :goto_c
    invoke-interface {v5, v7}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 847
    .line 848
    .line 849
    iput-object v2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 850
    .line 851
    new-instance v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 852
    .line 853
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 854
    .line 855
    .line 856
    :goto_d
    iget-object v2, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 857
    .line 858
    if-eqz v2, :cond_2c

    .line 859
    .line 860
    invoke-direct {v12, v11, v2}, Landroidx/paging/PageFetcherSnapshot;->loadParams(Landroidx/paging/LoadType;Ljava/lang/Object;)Landroidx/paging/PagingSource$LoadParams;

    .line 861
    .line 862
    .line 863
    move-result-object v2

    .line 864
    sget-object v5, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 865
    .line 866
    const/4 v13, 0x3

    .line 867
    invoke-virtual {v5, v13}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 868
    .line 869
    .line 870
    move-result v7

    .line 871
    if-eqz v7, :cond_a

    .line 872
    .line 873
    new-instance v7, Ljava/lang/StringBuilder;

    .line 874
    .line 875
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 876
    .line 877
    .line 878
    const-string v13, "Start "

    .line 879
    .line 880
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 881
    .line 882
    .line 883
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 884
    .line 885
    .line 886
    const-string v13, " with loadKey "

    .line 887
    .line 888
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 889
    .line 890
    .line 891
    iget-object v13, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 892
    .line 893
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 894
    .line 895
    .line 896
    const-string v13, " on "

    .line 897
    .line 898
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 899
    .line 900
    .line 901
    iget-object v13, v12, Landroidx/paging/PageFetcherSnapshot;->pagingSource:Landroidx/paging/PagingSource;

    .line 902
    .line 903
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 904
    .line 905
    .line 906
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v7

    .line 910
    const/4 v13, 0x3

    .line 911
    const/4 v14, 0x0

    .line 912
    invoke-virtual {v5, v13, v7, v14}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 913
    .line 914
    .line 915
    goto :goto_e

    .line 916
    :cond_a
    const/4 v14, 0x0

    .line 917
    :goto_e
    iget-object v5, v12, Landroidx/paging/PageFetcherSnapshot;->pagingSource:Landroidx/paging/PagingSource;

    .line 918
    .line 919
    iput-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 920
    .line 921
    iput-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 922
    .line 923
    iput-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 924
    .line 925
    iput-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 926
    .line 927
    iput-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 928
    .line 929
    iput-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 930
    .line 931
    iput-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 932
    .line 933
    iput-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 934
    .line 935
    iput-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$8:Ljava/lang/Object;

    .line 936
    .line 937
    const/4 v7, 0x4

    .line 938
    iput v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 939
    .line 940
    invoke-virtual {v5, v2, v3}, Landroidx/paging/PagingSource;->load(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v5

    .line 944
    if-ne v5, v4, :cond_b

    .line 945
    .line 946
    goto/16 :goto_25

    .line 947
    .line 948
    :cond_b
    move-object v13, v11

    .line 949
    move-object v11, v9

    .line 950
    move-object v9, v12

    .line 951
    move-object v12, v10

    .line 952
    move-object v10, v8

    .line 953
    move-object v8, v2

    .line 954
    move-object v2, v5

    .line 955
    :goto_f
    check-cast v2, Landroidx/paging/PagingSource$LoadResult;

    .line 956
    .line 957
    instance-of v5, v2, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 958
    .line 959
    if-eqz v5, :cond_18

    .line 960
    .line 961
    sget-object v5, Landroidx/paging/PageFetcherSnapshot$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 962
    .line 963
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 964
    .line 965
    .line 966
    move-result v7

    .line 967
    aget v5, v5, v7

    .line 968
    .line 969
    const/4 v7, 0x2

    .line 970
    if-eq v5, v7, :cond_d

    .line 971
    .line 972
    const/4 v7, 0x3

    .line 973
    if-ne v5, v7, :cond_c

    .line 974
    .line 975
    move-object v5, v2

    .line 976
    check-cast v5, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 977
    .line 978
    invoke-virtual {v5}, Landroidx/paging/PagingSource$LoadResult$Page;->getNextKey()Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v5

    .line 982
    goto :goto_10

    .line 983
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 984
    .line 985
    invoke-direct {v0, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 986
    .line 987
    .line 988
    throw v0

    .line 989
    :cond_d
    move-object v5, v2

    .line 990
    check-cast v5, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 991
    .line 992
    invoke-virtual {v5}, Landroidx/paging/PagingSource$LoadResult$Page;->getPrevKey()Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v5

    .line 996
    :goto_10
    iget-object v7, v9, Landroidx/paging/PageFetcherSnapshot;->pagingSource:Landroidx/paging/PagingSource;

    .line 997
    .line 998
    invoke-virtual {v7}, Landroidx/paging/PagingSource;->getKeyReuseSupported()Z

    .line 999
    .line 1000
    .line 1001
    move-result v7

    .line 1002
    if-nez v7, :cond_10

    .line 1003
    .line 1004
    iget-object v7, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1005
    .line 1006
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1007
    .line 1008
    .line 1009
    move-result v5

    .line 1010
    if-nez v5, :cond_e

    .line 1011
    .line 1012
    goto :goto_12

    .line 1013
    :cond_e
    sget-object v0, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 1014
    .line 1015
    if-ne v13, v0, :cond_f

    .line 1016
    .line 1017
    const-string v0, "prevKey"

    .line 1018
    .line 1019
    goto :goto_11

    .line 1020
    :cond_f
    const-string v0, "nextKey"

    .line 1021
    .line 1022
    :goto_11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1023
    .line 1024
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1025
    .line 1026
    .line 1027
    const-string v3, "The same value, "

    .line 1028
    .line 1029
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1030
    .line 1031
    .line 1032
    iget-object v3, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1033
    .line 1034
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1035
    .line 1036
    .line 1037
    const-string v3, ", was passed as the "

    .line 1038
    .line 1039
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1043
    .line 1044
    .line 1045
    const-string v0, " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            "

    .line 1046
    .line 1047
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v0

    .line 1054
    const/4 v9, 0x1

    .line 1055
    const/4 v14, 0x0

    .line 1056
    invoke-static {v0, v14, v9, v14}, Lkotlin/text/StringsKt;->trimMargin$default(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 1061
    .line 1062
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1067
    .line 1068
    .line 1069
    throw v2

    .line 1070
    :cond_10
    :goto_12
    iget-object v5, v9, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 1071
    .line 1072
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lkotlinx/coroutines/sync/Mutex;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v7

    .line 1076
    iput-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 1077
    .line 1078
    iput-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 1079
    .line 1080
    iput-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 1081
    .line 1082
    iput-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 1083
    .line 1084
    iput-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 1085
    .line 1086
    iput-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 1087
    .line 1088
    iput-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 1089
    .line 1090
    iput-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 1091
    .line 1092
    iput-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$8:Ljava/lang/Object;

    .line 1093
    .line 1094
    iput-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$9:Ljava/lang/Object;

    .line 1095
    .line 1096
    const/4 v14, 0x5

    .line 1097
    iput v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 1098
    .line 1099
    const/4 v14, 0x0

    .line 1100
    invoke-interface {v7, v14, v3}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v15

    .line 1104
    if-ne v15, v4, :cond_11

    .line 1105
    .line 1106
    goto/16 :goto_25

    .line 1107
    .line 1108
    :cond_11
    move-object v14, v9

    .line 1109
    move-object v9, v0

    .line 1110
    :goto_13
    :try_start_6
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v0

    .line 1114
    invoke-virtual {v12}, Landroidx/paging/GenerationalViewportHint;->getGenerationId()I

    .line 1115
    .line 1116
    .line 1117
    move-result v5

    .line 1118
    move-object v15, v2

    .line 1119
    check-cast v15, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 1120
    .line 1121
    invoke-virtual {v0, v5, v13, v15}, Landroidx/paging/PageFetcherSnapshotState;->insert(ILandroidx/paging/LoadType;Landroidx/paging/PagingSource$LoadResult$Page;)Z

    .line 1122
    .line 1123
    .line 1124
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 1125
    const/4 v5, 0x0

    .line 1126
    invoke-interface {v7, v5}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 1127
    .line 1128
    .line 1129
    if-nez v0, :cond_12

    .line 1130
    .line 1131
    sget-object v0, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 1132
    .line 1133
    const/4 v12, 0x2

    .line 1134
    invoke-virtual {v0, v12}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 1135
    .line 1136
    .line 1137
    move-result v2

    .line 1138
    if-eqz v2, :cond_2c

    .line 1139
    .line 1140
    iget-object v2, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1141
    .line 1142
    invoke-direct {v14, v13, v2, v5}, Landroidx/paging/PageFetcherSnapshot;->loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v2

    .line 1146
    invoke-virtual {v0, v12, v2, v5}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 1147
    .line 1148
    .line 1149
    goto/16 :goto_28

    .line 1150
    .line 1151
    :cond_12
    sget-object v0, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 1152
    .line 1153
    const/4 v15, 0x3

    .line 1154
    invoke-virtual {v0, v15}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 1155
    .line 1156
    .line 1157
    move-result v7

    .line 1158
    if-eqz v7, :cond_13

    .line 1159
    .line 1160
    iget-object v7, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1161
    .line 1162
    invoke-direct {v14, v13, v7, v2}, Landroidx/paging/PageFetcherSnapshot;->loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v7

    .line 1166
    invoke-virtual {v0, v15, v7, v5}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 1167
    .line 1168
    .line 1169
    :cond_13
    iget v0, v11, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 1170
    .line 1171
    move-object v5, v2

    .line 1172
    check-cast v5, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 1173
    .line 1174
    invoke-virtual {v5}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v7

    .line 1178
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 1179
    .line 1180
    .line 1181
    move-result v7

    .line 1182
    add-int/2addr v0, v7

    .line 1183
    iput v0, v11, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 1184
    .line 1185
    sget-object v0, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 1186
    .line 1187
    if-ne v13, v0, :cond_15

    .line 1188
    .line 1189
    invoke-virtual {v5}, Landroidx/paging/PagingSource$LoadResult$Page;->getPrevKey()Ljava/lang/Object;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v0

    .line 1193
    if-eqz v0, :cond_14

    .line 1194
    .line 1195
    goto :goto_15

    .line 1196
    :cond_14
    :goto_14
    const/4 v5, 0x1

    .line 1197
    goto :goto_16

    .line 1198
    :cond_15
    :goto_15
    sget-object v0, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 1199
    .line 1200
    if-ne v13, v0, :cond_16

    .line 1201
    .line 1202
    invoke-virtual {v5}, Landroidx/paging/PagingSource$LoadResult$Page;->getNextKey()Ljava/lang/Object;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v0

    .line 1206
    if-nez v0, :cond_16

    .line 1207
    .line 1208
    goto :goto_14

    .line 1209
    :goto_16
    iput-boolean v5, v9, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 1210
    .line 1211
    goto :goto_17

    .line 1212
    :cond_16
    const/4 v5, 0x1

    .line 1213
    :goto_17
    move-object v0, v9

    .line 1214
    move-object v9, v14

    .line 1215
    :cond_17
    const/4 v7, 0x2

    .line 1216
    goto/16 :goto_1b

    .line 1217
    .line 1218
    :catchall_5
    move-exception v0

    .line 1219
    const/4 v14, 0x0

    .line 1220
    invoke-interface {v7, v14}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 1221
    .line 1222
    .line 1223
    throw v0

    .line 1224
    :cond_18
    const/4 v5, 0x1

    .line 1225
    const/4 v14, 0x0

    .line 1226
    const/4 v15, 0x3

    .line 1227
    instance-of v7, v2, Landroidx/paging/PagingSource$LoadResult$Error;

    .line 1228
    .line 1229
    if-eqz v7, :cond_1c

    .line 1230
    .line 1231
    sget-object v0, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 1232
    .line 1233
    const/4 v7, 0x2

    .line 1234
    invoke-virtual {v0, v7}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 1235
    .line 1236
    .line 1237
    move-result v5

    .line 1238
    if-eqz v5, :cond_19

    .line 1239
    .line 1240
    iget-object v5, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1241
    .line 1242
    invoke-direct {v9, v13, v5, v2}, Landroidx/paging/PageFetcherSnapshot;->loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v5

    .line 1246
    invoke-virtual {v0, v7, v5, v14}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 1247
    .line 1248
    .line 1249
    :cond_19
    iget-object v5, v9, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 1250
    .line 1251
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lkotlinx/coroutines/sync/Mutex;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v0

    .line 1255
    iput-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 1256
    .line 1257
    iput-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 1258
    .line 1259
    iput-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 1260
    .line 1261
    iput-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 1262
    .line 1263
    iput-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 1264
    .line 1265
    iput-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 1266
    .line 1267
    iput-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 1268
    .line 1269
    const/4 v6, 0x6

    .line 1270
    iput v6, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 1271
    .line 1272
    invoke-interface {v0, v14, v3}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v6

    .line 1276
    if-ne v6, v4, :cond_1a

    .line 1277
    .line 1278
    goto/16 :goto_25

    .line 1279
    .line 1280
    :cond_1a
    move-object v6, v2

    .line 1281
    move-object v2, v0

    .line 1282
    move-object v0, v3

    .line 1283
    move-object v3, v13

    .line 1284
    :goto_18
    :try_start_7
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v5

    .line 1288
    new-instance v7, Landroidx/paging/LoadState$Error;

    .line 1289
    .line 1290
    check-cast v6, Landroidx/paging/PagingSource$LoadResult$Error;

    .line 1291
    .line 1292
    invoke-virtual {v6}, Landroidx/paging/PagingSource$LoadResult$Error;->getThrowable()Ljava/lang/Throwable;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v6

    .line 1296
    invoke-direct {v7, v6}, Landroidx/paging/LoadState$Error;-><init>(Ljava/lang/Throwable;)V

    .line 1297
    .line 1298
    .line 1299
    iput-object v3, v0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 1300
    .line 1301
    iput-object v12, v0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 1302
    .line 1303
    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 1304
    .line 1305
    iput-object v5, v0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 1306
    .line 1307
    const/4 v14, 0x0

    .line 1308
    iput-object v14, v0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 1309
    .line 1310
    iput-object v14, v0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 1311
    .line 1312
    const/4 v6, 0x7

    .line 1313
    iput v6, v0, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 1314
    .line 1315
    invoke-direct {v9, v5, v3, v7, v0}, Landroidx/paging/PageFetcherSnapshot;->setError(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 1319
    if-ne v0, v4, :cond_1b

    .line 1320
    .line 1321
    goto/16 :goto_25

    .line 1322
    .line 1323
    :cond_1b
    move-object v4, v2

    .line 1324
    move-object v0, v5

    .line 1325
    move-object v5, v12

    .line 1326
    :goto_19
    :try_start_8
    invoke-virtual {v0}, Landroidx/paging/PageFetcherSnapshotState;->getFailedHintsByLoadType$paging_common_release()Ljava/util/Map;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v0

    .line 1330
    invoke-virtual {v5}, Landroidx/paging/GenerationalViewportHint;->getHint()Landroidx/paging/ViewportHint;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v2

    .line 1334
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1335
    .line 1336
    .line 1337
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 1338
    .line 1339
    const/4 v14, 0x0

    .line 1340
    invoke-interface {v4, v14}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 1341
    .line 1342
    .line 1343
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1344
    .line 1345
    return-object v0

    .line 1346
    :catchall_6
    move-exception v0

    .line 1347
    move-object v4, v2

    .line 1348
    goto/16 :goto_2

    .line 1349
    .line 1350
    :goto_1a
    invoke-interface {v4, v14}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 1351
    .line 1352
    .line 1353
    throw v0

    .line 1354
    :cond_1c
    instance-of v7, v2, Landroidx/paging/PagingSource$LoadResult$Invalid;

    .line 1355
    .line 1356
    if-eqz v7, :cond_17

    .line 1357
    .line 1358
    sget-object v0, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 1359
    .line 1360
    const/4 v7, 0x2

    .line 1361
    invoke-virtual {v0, v7}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 1362
    .line 1363
    .line 1364
    move-result v3

    .line 1365
    if-eqz v3, :cond_1d

    .line 1366
    .line 1367
    iget-object v3, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1368
    .line 1369
    invoke-direct {v9, v13, v3, v2}, Landroidx/paging/PageFetcherSnapshot;->loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v2

    .line 1373
    invoke-virtual {v0, v7, v2, v14}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 1374
    .line 1375
    .line 1376
    :cond_1d
    invoke-direct {v9}, Landroidx/paging/PageFetcherSnapshot;->onInvalidLoad()V

    .line 1377
    .line 1378
    .line 1379
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1380
    .line 1381
    return-object v0

    .line 1382
    :goto_1b
    sget-object v14, Landroidx/paging/PageFetcherSnapshot$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 1383
    .line 1384
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 1385
    .line 1386
    .line 1387
    move-result v16

    .line 1388
    aget v14, v14, v16

    .line 1389
    .line 1390
    if-ne v14, v7, :cond_1e

    .line 1391
    .line 1392
    sget-object v14, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 1393
    .line 1394
    goto :goto_1c

    .line 1395
    :cond_1e
    sget-object v14, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 1396
    .line 1397
    :goto_1c
    iget-object v5, v9, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 1398
    .line 1399
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lkotlinx/coroutines/sync/Mutex;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v7

    .line 1403
    iput-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 1404
    .line 1405
    iput-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 1406
    .line 1407
    iput-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 1408
    .line 1409
    iput-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 1410
    .line 1411
    iput-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 1412
    .line 1413
    iput-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 1414
    .line 1415
    iput-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 1416
    .line 1417
    iput-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 1418
    .line 1419
    iput-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$8:Ljava/lang/Object;

    .line 1420
    .line 1421
    iput-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$9:Ljava/lang/Object;

    .line 1422
    .line 1423
    iput-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$10:Ljava/lang/Object;

    .line 1424
    .line 1425
    const/16 v15, 0x8

    .line 1426
    .line 1427
    iput v15, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 1428
    .line 1429
    move-object/from16 p1, v0

    .line 1430
    .line 1431
    const/4 v15, 0x0

    .line 1432
    invoke-interface {v7, v15, v3}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v0

    .line 1436
    if-ne v0, v4, :cond_1f

    .line 1437
    .line 1438
    goto/16 :goto_25

    .line 1439
    .line 1440
    :cond_1f
    move-object v15, v13

    .line 1441
    move-object v13, v12

    .line 1442
    move-object v12, v11

    .line 1443
    move-object v11, v10

    .line 1444
    move-object v10, v9

    .line 1445
    move-object/from16 v9, p1

    .line 1446
    .line 1447
    :goto_1d
    :try_start_9
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v0

    .line 1451
    invoke-virtual {v13}, Landroidx/paging/GenerationalViewportHint;->getHint()Landroidx/paging/ViewportHint;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v5

    .line 1455
    invoke-virtual {v0, v14, v5}, Landroidx/paging/PageFetcherSnapshotState;->dropEventOrNull(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;)Landroidx/paging/PageEvent$Drop;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v5

    .line 1459
    if-eqz v5, :cond_21

    .line 1460
    .line 1461
    invoke-virtual {v0, v5}, Landroidx/paging/PageFetcherSnapshotState;->drop(Landroidx/paging/PageEvent$Drop;)V

    .line 1462
    .line 1463
    .line 1464
    iget-object v14, v10, Landroidx/paging/PageFetcherSnapshot;->pageEventCh:Lkotlinx/coroutines/channels/Channel;

    .line 1465
    .line 1466
    iput-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 1467
    .line 1468
    iput-object v15, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 1469
    .line 1470
    iput-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 1471
    .line 1472
    iput-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 1473
    .line 1474
    iput-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 1475
    .line 1476
    iput-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 1477
    .line 1478
    iput-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 1479
    .line 1480
    iput-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 1481
    .line 1482
    iput-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$8:Ljava/lang/Object;

    .line 1483
    .line 1484
    iput-object v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$9:Ljava/lang/Object;

    .line 1485
    .line 1486
    const/4 v1, 0x0

    .line 1487
    iput-object v1, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$10:Ljava/lang/Object;

    .line 1488
    .line 1489
    const/16 v1, 0x9

    .line 1490
    .line 1491
    iput v1, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 1492
    .line 1493
    invoke-interface {v14, v5, v3}, Lkotlinx/coroutines/channels/SendChannel;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 1497
    if-ne v1, v4, :cond_20

    .line 1498
    .line 1499
    goto/16 :goto_25

    .line 1500
    .line 1501
    :cond_20
    move-object v5, v7

    .line 1502
    move-object v14, v15

    .line 1503
    move-object v7, v2

    .line 1504
    move-object v15, v10

    .line 1505
    :goto_1e
    :try_start_a
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1506
    .line 1507
    move-object v2, v7

    .line 1508
    move-object v10, v15

    .line 1509
    move-object v15, v14

    .line 1510
    :goto_1f
    move-object v7, v8

    .line 1511
    goto :goto_20

    .line 1512
    :catchall_7
    move-exception v0

    .line 1513
    move-object v5, v7

    .line 1514
    goto/16 :goto_1

    .line 1515
    .line 1516
    :cond_21
    move-object v5, v7

    .line 1517
    goto :goto_1f

    .line 1518
    :goto_20
    invoke-virtual {v13}, Landroidx/paging/GenerationalViewportHint;->getGenerationId()I

    .line 1519
    .line 1520
    .line 1521
    move-result v1

    .line 1522
    invoke-virtual {v13}, Landroidx/paging/GenerationalViewportHint;->getHint()Landroidx/paging/ViewportHint;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v8

    .line 1526
    invoke-virtual {v8, v15}, Landroidx/paging/ViewportHint;->presentedItemsBeyondAnchor$paging_common_release(Landroidx/paging/LoadType;)I

    .line 1527
    .line 1528
    .line 1529
    move-result v8

    .line 1530
    iget v14, v12, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 1531
    .line 1532
    add-int/2addr v8, v14

    .line 1533
    invoke-direct {v10, v0, v15, v1, v8}, Landroidx/paging/PageFetcherSnapshot;->nextLoadKeyOrNull(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;II)Ljava/lang/Object;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v1

    .line 1537
    iput-object v1, v11, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1538
    .line 1539
    if-nez v1, :cond_23

    .line 1540
    .line 1541
    invoke-virtual {v0}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common_release()Landroidx/paging/MutableLoadStateCollection;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v1

    .line 1545
    invoke-virtual {v1, v15}, Landroidx/paging/MutableLoadStateCollection;->get(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v1

    .line 1549
    instance-of v1, v1, Landroidx/paging/LoadState$Error;

    .line 1550
    .line 1551
    if-nez v1, :cond_23

    .line 1552
    .line 1553
    invoke-virtual {v0}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common_release()Landroidx/paging/MutableLoadStateCollection;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v1

    .line 1557
    iget-boolean v8, v9, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 1558
    .line 1559
    if-eqz v8, :cond_22

    .line 1560
    .line 1561
    sget-object v8, Landroidx/paging/LoadState$NotLoading;->Companion:Landroidx/paging/LoadState$NotLoading$Companion;

    .line 1562
    .line 1563
    invoke-virtual {v8}, Landroidx/paging/LoadState$NotLoading$Companion;->getComplete$paging_common_release()Landroidx/paging/LoadState$NotLoading;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v8

    .line 1567
    goto :goto_21

    .line 1568
    :cond_22
    sget-object v8, Landroidx/paging/LoadState$NotLoading;->Companion:Landroidx/paging/LoadState$NotLoading$Companion;

    .line 1569
    .line 1570
    invoke-virtual {v8}, Landroidx/paging/LoadState$NotLoading$Companion;->getIncomplete$paging_common_release()Landroidx/paging/LoadState$NotLoading;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v8

    .line 1574
    :goto_21
    invoke-virtual {v1, v15, v8}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V

    .line 1575
    .line 1576
    .line 1577
    :cond_23
    move-object v1, v2

    .line 1578
    check-cast v1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 1579
    .line 1580
    invoke-virtual {v0, v1, v15}, Landroidx/paging/PageFetcherSnapshotState;->toPageEvent$paging_common_release(Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/LoadType;)Landroidx/paging/PageEvent;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v0

    .line 1584
    iget-object v1, v10, Landroidx/paging/PageFetcherSnapshot;->pageEventCh:Lkotlinx/coroutines/channels/Channel;

    .line 1585
    .line 1586
    iput-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 1587
    .line 1588
    iput-object v15, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 1589
    .line 1590
    iput-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 1591
    .line 1592
    iput-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 1593
    .line 1594
    iput-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 1595
    .line 1596
    iput-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 1597
    .line 1598
    iput-object v7, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 1599
    .line 1600
    iput-object v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 1601
    .line 1602
    iput-object v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$8:Ljava/lang/Object;

    .line 1603
    .line 1604
    const/4 v14, 0x0

    .line 1605
    iput-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$9:Ljava/lang/Object;

    .line 1606
    .line 1607
    iput-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$10:Ljava/lang/Object;

    .line 1608
    .line 1609
    const/16 v8, 0xa

    .line 1610
    .line 1611
    iput v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 1612
    .line 1613
    invoke-interface {v1, v0, v3}, Lkotlinx/coroutines/channels/SendChannel;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v0

    .line 1617
    if-ne v0, v4, :cond_24

    .line 1618
    .line 1619
    goto :goto_25

    .line 1620
    :cond_24
    move-object v0, v2

    .line 1621
    move-object v8, v9

    .line 1622
    move-object v14, v10

    .line 1623
    move-object v9, v11

    .line 1624
    move-object v10, v13

    .line 1625
    move-object v11, v15

    .line 1626
    :goto_22
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 1627
    .line 1628
    const/4 v15, 0x0

    .line 1629
    invoke-interface {v5, v15}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 1630
    .line 1631
    .line 1632
    instance-of v1, v7, Landroidx/paging/PagingSource$LoadParams$Prepend;

    .line 1633
    .line 1634
    if-eqz v1, :cond_25

    .line 1635
    .line 1636
    move-object v1, v0

    .line 1637
    check-cast v1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 1638
    .line 1639
    invoke-virtual {v1}, Landroidx/paging/PagingSource$LoadResult$Page;->getPrevKey()Ljava/lang/Object;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v1

    .line 1643
    if-nez v1, :cond_25

    .line 1644
    .line 1645
    const/4 v5, 0x1

    .line 1646
    goto :goto_23

    .line 1647
    :cond_25
    const/4 v5, 0x0

    .line 1648
    :goto_23
    instance-of v1, v7, Landroidx/paging/PagingSource$LoadParams$Append;

    .line 1649
    .line 1650
    if-eqz v1, :cond_26

    .line 1651
    .line 1652
    check-cast v0, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 1653
    .line 1654
    invoke-virtual {v0}, Landroidx/paging/PagingSource$LoadResult$Page;->getNextKey()Ljava/lang/Object;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v0

    .line 1658
    if-nez v0, :cond_26

    .line 1659
    .line 1660
    const/4 v0, 0x1

    .line 1661
    goto :goto_24

    .line 1662
    :cond_26
    const/4 v0, 0x0

    .line 1663
    :goto_24
    iget-object v1, v14, Landroidx/paging/PageFetcherSnapshot;->remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;

    .line 1664
    .line 1665
    if-eqz v1, :cond_2b

    .line 1666
    .line 1667
    if-nez v5, :cond_27

    .line 1668
    .line 1669
    if-eqz v0, :cond_2b

    .line 1670
    .line 1671
    :cond_27
    iget-object v13, v14, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 1672
    .line 1673
    invoke-static {v13}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lkotlinx/coroutines/sync/Mutex;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v1

    .line 1677
    iput-object v14, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$0:Ljava/lang/Object;

    .line 1678
    .line 1679
    iput-object v11, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$1:Ljava/lang/Object;

    .line 1680
    .line 1681
    iput-object v10, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$2:Ljava/lang/Object;

    .line 1682
    .line 1683
    iput-object v12, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$3:Ljava/lang/Object;

    .line 1684
    .line 1685
    iput-object v9, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$4:Ljava/lang/Object;

    .line 1686
    .line 1687
    iput-object v8, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$5:Ljava/lang/Object;

    .line 1688
    .line 1689
    iput-object v13, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$6:Ljava/lang/Object;

    .line 1690
    .line 1691
    iput-object v1, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$7:Ljava/lang/Object;

    .line 1692
    .line 1693
    const/4 v15, 0x0

    .line 1694
    iput-object v15, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->L$8:Ljava/lang/Object;

    .line 1695
    .line 1696
    iput v5, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->I$0:I

    .line 1697
    .line 1698
    iput v0, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->I$1:I

    .line 1699
    .line 1700
    const/16 v2, 0xb

    .line 1701
    .line 1702
    iput v2, v3, Landroidx/paging/PageFetcherSnapshot$doLoad$1;->label:I

    .line 1703
    .line 1704
    invoke-interface {v1, v15, v3}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v2

    .line 1708
    if-ne v2, v4, :cond_28

    .line 1709
    .line 1710
    :goto_25
    return-object v4

    .line 1711
    :cond_28
    move-object/from16 v18, v14

    .line 1712
    .line 1713
    move-object v14, v8

    .line 1714
    move-object v8, v9

    .line 1715
    move-object v9, v12

    .line 1716
    move-object/from16 v12, v18

    .line 1717
    .line 1718
    :goto_26
    :try_start_b
    invoke-static {v13}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v2

    .line 1722
    iget-object v7, v12, Landroidx/paging/PageFetcherSnapshot;->hintHandler:Landroidx/paging/HintHandler;

    .line 1723
    .line 1724
    invoke-virtual {v7}, Landroidx/paging/HintHandler;->getLastAccessHint()Landroidx/paging/ViewportHint$Access;

    .line 1725
    .line 1726
    .line 1727
    move-result-object v7

    .line 1728
    invoke-virtual {v2, v7}, Landroidx/paging/PageFetcherSnapshotState;->currentPagingState$paging_common_release(Landroidx/paging/ViewportHint$Access;)Landroidx/paging/PagingState;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 1732
    const/4 v15, 0x0

    .line 1733
    invoke-interface {v1, v15}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 1734
    .line 1735
    .line 1736
    if-eqz v5, :cond_29

    .line 1737
    .line 1738
    iget-object v1, v12, Landroidx/paging/PageFetcherSnapshot;->remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;

    .line 1739
    .line 1740
    sget-object v5, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 1741
    .line 1742
    invoke-interface {v1, v5, v2}, Landroidx/paging/RemoteMediatorConnection;->requestLoad(Landroidx/paging/LoadType;Landroidx/paging/PagingState;)V

    .line 1743
    .line 1744
    .line 1745
    :cond_29
    if-eqz v0, :cond_2a

    .line 1746
    .line 1747
    iget-object v0, v12, Landroidx/paging/PageFetcherSnapshot;->remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;

    .line 1748
    .line 1749
    sget-object v1, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 1750
    .line 1751
    invoke-interface {v0, v1, v2}, Landroidx/paging/RemoteMediatorConnection;->requestLoad(Landroidx/paging/LoadType;Landroidx/paging/PagingState;)V

    .line 1752
    .line 1753
    .line 1754
    :cond_2a
    move-object/from16 v1, p0

    .line 1755
    .line 1756
    move-object v0, v14

    .line 1757
    goto/16 :goto_d

    .line 1758
    .line 1759
    :catchall_8
    move-exception v0

    .line 1760
    const/4 v14, 0x0

    .line 1761
    invoke-interface {v1, v14}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 1762
    .line 1763
    .line 1764
    throw v0

    .line 1765
    :cond_2b
    move-object/from16 v1, p0

    .line 1766
    .line 1767
    move-object v0, v8

    .line 1768
    move-object v8, v9

    .line 1769
    move-object v9, v12

    .line 1770
    move-object v12, v14

    .line 1771
    goto/16 :goto_d

    .line 1772
    .line 1773
    :goto_27
    invoke-interface {v5, v14}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 1774
    .line 1775
    .line 1776
    throw v0

    .line 1777
    :cond_2c
    :goto_28
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1778
    .line 1779
    return-object v0

    .line 1780
    :goto_29
    invoke-interface {v7, v14}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 1781
    .line 1782
    .line 1783
    throw v0

    .line 1784
    :cond_2d
    :try_start_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1785
    .line 1786
    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1787
    .line 1788
    .line 1789
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 1790
    :goto_2a
    invoke-interface {v2, v14}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 1791
    .line 1792
    .line 1793
    throw v0

    .line 1794
    :cond_2e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1795
    .line 1796
    invoke-direct {v0, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1797
    .line 1798
    .line 1799
    throw v0

    .line 1800
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final loadParams(Landroidx/paging/LoadType;Ljava/lang/Object;)Landroidx/paging/PagingSource$LoadParams;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/LoadType;",
            "TKey;)",
            "Landroidx/paging/PagingSource$LoadParams<",
            "TKey;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/paging/PagingSource$LoadParams;->Companion:Landroidx/paging/PagingSource$LoadParams$Companion;

    .line 2
    .line 3
    sget-object v1, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 4
    .line 5
    if-ne p1, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/paging/PageFetcherSnapshot;->config:Landroidx/paging/PagingConfig;

    .line 8
    .line 9
    iget v1, v1, Landroidx/paging/PagingConfig;->initialLoadSize:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Landroidx/paging/PageFetcherSnapshot;->config:Landroidx/paging/PagingConfig;

    .line 13
    .line 14
    iget v1, v1, Landroidx/paging/PagingConfig;->pageSize:I

    .line 15
    .line 16
    :goto_0
    iget-object v2, p0, Landroidx/paging/PageFetcherSnapshot;->config:Landroidx/paging/PagingConfig;

    .line 17
    .line 18
    iget-boolean v2, v2, Landroidx/paging/PagingConfig;->enablePlaceholders:Z

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2, v1, v2}, Landroidx/paging/PagingSource$LoadParams$Companion;->create(Landroidx/paging/LoadType;Ljava/lang/Object;IZ)Landroidx/paging/PagingSource$LoadParams;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method private final loadResultLog(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/LoadType;",
            "TKey;",
            "Landroidx/paging/PagingSource$LoadResult<",
            "TKey;TValue;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const-string v0, "End "

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    new-instance p3, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string p1, " with loadkey "

    .line 17
    .line 18
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p1, ". Load CANCELLED."

    .line 25
    .line 26
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p1, " with loadKey "

    .line 46
    .line 47
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p1, ". Returned "

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1
.end method

.method private final nextLoadKeyOrNull(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;II)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageFetcherSnapshotState<",
            "TKey;TValue;>;",
            "Landroidx/paging/LoadType;",
            "II)TKey;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroidx/paging/PageFetcherSnapshotState;->generationId$paging_common_release(Landroidx/paging/LoadType;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eq p3, v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common_release()Landroidx/paging/MutableLoadStateCollection;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p3, p2}, Landroidx/paging/MutableLoadStateCollection;->get(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    instance-of p3, p3, Landroidx/paging/LoadState$Error;

    .line 18
    .line 19
    if-eqz p3, :cond_1

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_1
    iget-object p3, p0, Landroidx/paging/PageFetcherSnapshot;->config:Landroidx/paging/PagingConfig;

    .line 23
    .line 24
    iget p3, p3, Landroidx/paging/PagingConfig;->prefetchDistance:I

    .line 25
    .line 26
    if-lt p4, p3, :cond_2

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_2
    sget-object p3, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 30
    .line 31
    if-ne p2, p3, :cond_3

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common_release()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadResult$Page;->getPrevKey()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_3
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getPages$paging_common_release()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 57
    .line 58
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadResult$Page;->getNextKey()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
.end method

.method private final onInvalidLoad()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/paging/PageFetcherSnapshot;->close()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshot;->pagingSource:Landroidx/paging/PagingSource;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/paging/PagingSource;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final retryLoadError(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/LoadType;",
            "Landroidx/paging/ViewportHint;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/paging/PageFetcherSnapshot$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    invoke-direct {p0, p3}, Landroidx/paging/PageFetcherSnapshot;->doInitialLoad(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-ne p1, p2, :cond_0

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_1
    if-eqz p2, :cond_2

    .line 27
    .line 28
    iget-object p3, p0, Landroidx/paging/PageFetcherSnapshot;->hintHandler:Landroidx/paging/HintHandler;

    .line 29
    .line 30
    invoke-virtual {p3, p1, p2}, Landroidx/paging/HintHandler;->forceSetHint(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;)V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string p2, "Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1
.end method

.method private final setError(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageFetcherSnapshotState<",
            "TKey;TValue;>;",
            "Landroidx/paging/LoadType;",
            "Landroidx/paging/LoadState$Error;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common_release()Landroidx/paging/MutableLoadStateCollection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Landroidx/paging/MutableLoadStateCollection;->get(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common_release()Landroidx/paging/MutableLoadStateCollection;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, p2, p3}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V

    .line 20
    .line 21
    .line 22
    iget-object p2, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventCh:Lkotlinx/coroutines/channels/Channel;

    .line 23
    .line 24
    new-instance p3, Landroidx/paging/PageEvent$LoadStateUpdate;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common_release()Landroidx/paging/MutableLoadStateCollection;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Landroidx/paging/MutableLoadStateCollection;->snapshot()Landroidx/paging/LoadStates;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-direct {p3, p1, v0}, Landroidx/paging/PageEvent$LoadStateUpdate;-><init>(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p2, p3, p4}, Lkotlinx/coroutines/channels/SendChannel;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    if-ne p1, p2, :cond_0

    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p1
.end method

.method private final setLoading(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageFetcherSnapshotState<",
            "TKey;TValue;>;",
            "Landroidx/paging/LoadType;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common_release()Landroidx/paging/MutableLoadStateCollection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Landroidx/paging/MutableLoadStateCollection;->get(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Landroidx/paging/LoadState$Loading;->INSTANCE:Landroidx/paging/LoadState$Loading;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common_release()Landroidx/paging/MutableLoadStateCollection;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p2, v1}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V

    .line 22
    .line 23
    .line 24
    iget-object p2, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventCh:Lkotlinx/coroutines/channels/Channel;

    .line 25
    .line 26
    new-instance v0, Landroidx/paging/PageEvent$LoadStateUpdate;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common_release()Landroidx/paging/MutableLoadStateCollection;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Landroidx/paging/MutableLoadStateCollection;->snapshot()Landroidx/paging/LoadStates;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {v0, p1, v1}, Landroidx/paging/PageEvent$LoadStateUpdate;-><init>(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p2, v0, p3}, Lkotlinx/coroutines/channels/SendChannel;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    if-ne p1, p2, :cond_0

    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p1
.end method

.method private final startConsumingHints(Lkotlinx/coroutines/CoroutineScope;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/paging/PageFetcherSnapshot;->config:Landroidx/paging/PagingConfig;

    .line 4
    .line 5
    iget v1, v1, Landroidx/paging/PagingConfig;->jumpThreshold:I

    .line 6
    .line 7
    const/high16 v2, -0x80000000

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    new-instance v7, Landroidx/paging/PageFetcherSnapshot$startConsumingHints$1;

    .line 13
    .line 14
    invoke-direct {v7, v0, v3}, Landroidx/paging/PageFetcherSnapshot$startConsumingHints$1;-><init>(Landroidx/paging/PageFetcherSnapshot;Lkotlin/coroutines/Continuation;)V

    .line 15
    .line 16
    .line 17
    const/4 v8, 0x3

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    move-object/from16 v4, p1

    .line 22
    .line 23
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 24
    .line 25
    .line 26
    :cond_0
    new-instance v13, Landroidx/paging/PageFetcherSnapshot$startConsumingHints$2;

    .line 27
    .line 28
    invoke-direct {v13, v0, v3}, Landroidx/paging/PageFetcherSnapshot$startConsumingHints$2;-><init>(Landroidx/paging/PageFetcherSnapshot;Lkotlin/coroutines/Continuation;)V

    .line 29
    .line 30
    .line 31
    const/4 v14, 0x3

    .line 32
    const/4 v15, 0x0

    .line 33
    const/4 v11, 0x0

    .line 34
    const/4 v12, 0x0

    .line 35
    move-object/from16 v10, p1

    .line 36
    .line 37
    invoke-static/range {v10 .. v15}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 38
    .line 39
    .line 40
    new-instance v13, Landroidx/paging/PageFetcherSnapshot$startConsumingHints$3;

    .line 41
    .line 42
    invoke-direct {v13, v0, v3}, Landroidx/paging/PageFetcherSnapshot$startConsumingHints$3;-><init>(Landroidx/paging/PageFetcherSnapshot;Lkotlin/coroutines/Continuation;)V

    .line 43
    .line 44
    .line 45
    invoke-static/range {v10 .. v15}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 46
    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final accessHint(Landroidx/paging/ViewportHint;)V
    .locals 1

    .line 1
    const-string v0, "viewportHint"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshot;->hintHandler:Landroidx/paging/HintHandler;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/paging/HintHandler;->processHint(Landroidx/paging/ViewportHint;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final close()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventChannelFlowJob:Lkotlinx/coroutines/CompletableJob;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final currentPagingState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/paging/PagingState<",
            "TKey;TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;-><init>(Landroidx/paging/PageFetcherSnapshot;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object v1, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->L$2:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lkotlinx/coroutines/sync/Mutex;

    .line 42
    .line 43
    iget-object v2, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 46
    .line 47
    iget-object v0, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Landroidx/paging/PageFetcherSnapshot;

    .line 50
    .line 51
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object v2, p0, Landroidx/paging/PageFetcherSnapshot;->stateHolder:Landroidx/paging/PageFetcherSnapshotState$Holder;

    .line 67
    .line 68
    invoke-static {v2}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lkotlinx/coroutines/sync/Mutex;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p0, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->L$0:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v2, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->L$1:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object p1, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->L$2:Ljava/lang/Object;

    .line 77
    .line 78
    iput v3, v0, Landroidx/paging/PageFetcherSnapshot$currentPagingState$1;->label:I

    .line 79
    .line 80
    invoke-interface {p1, v4, v0}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-ne v0, v1, :cond_3

    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_3
    move-object v0, p0

    .line 88
    move-object v1, p1

    .line 89
    :goto_1
    :try_start_0
    invoke-static {v2}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget-object v0, v0, Landroidx/paging/PageFetcherSnapshot;->hintHandler:Landroidx/paging/HintHandler;

    .line 94
    .line 95
    invoke-virtual {v0}, Landroidx/paging/HintHandler;->getLastAccessHint()Landroidx/paging/ViewportHint$Access;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p1, v0}, Landroidx/paging/PageFetcherSnapshotState;->currentPagingState$paging_common_release(Landroidx/paging/ViewportHint$Access;)Landroidx/paging/PagingState;

    .line 100
    .line 101
    .line 102
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    invoke-interface {v1, v4}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    return-object p1

    .line 107
    :catchall_0
    move-exception p1

    .line 108
    invoke-interface {v1, v4}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    throw p1
.end method

.method public final getInitialKey$paging_common_release()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TKey;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshot;->initialKey:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPageEventFlow()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Landroidx/paging/PageEvent<",
            "TValue;>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshot;->pageEventFlow:Lkotlinx/coroutines/flow/Flow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPagingSource$paging_common_release()Landroidx/paging/PagingSource;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/PagingSource<",
            "TKey;TValue;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshot;->pagingSource:Landroidx/paging/PagingSource;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRemoteMediatorConnection()Landroidx/paging/RemoteMediatorConnection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/RemoteMediatorConnection<",
            "TKey;TValue;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PageFetcherSnapshot;->remoteMediatorConnection:Landroidx/paging/RemoteMediatorConnection;

    .line 2
    .line 3
    return-object v0
.end method
