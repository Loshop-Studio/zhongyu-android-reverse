.class final Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt;->p(Landroidx/compose/ui/Modifier;Landroidx/paging/compose/LazyPagingItems;Ljava/util/List;Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.gallery.ui.gallery.screenList.GalleryListKt$GalleryList$onRefresh$1$1$1"
    f = "GalleryList.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x64,
        0x6a
    }
    m = "invokeSuspend"
    n = {
        "refreshStartTime",
        "refreshStartTime",
        "actualRefreshDuration",
        "minAnimationDuration",
        "it",
        "$i$a$-let-GalleryListKt$GalleryList$onRefresh$1$1$1$3"
    }
    s = {
        "J$0",
        "J$0",
        "J$1",
        "J$2",
        "J$3",
        "I$0"
    }
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:J

.field public e:I

.field public f:I

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:Landroidx/paging/compose/LazyPagingItems;

.field public final synthetic i:Landroidx/compose/runtime/MutableState;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;Landroidx/paging/compose/LazyPagingItems;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->g:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->h:Landroidx/paging/compose/LazyPagingItems;

    iput-object p3, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->i:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static synthetic a(Landroidx/paging/compose/LazyPagingItems;)Landroidx/paging/LoadState;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->b(Landroidx/paging/compose/LazyPagingItems;)Landroidx/paging/LoadState;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/paging/compose/LazyPagingItems;)Landroidx/paging/LoadState;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/paging/compose/LazyPagingItems;->getLoadState()Landroidx/paging/CombinedLoadStates;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/paging/CombinedLoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;

    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->g:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->h:Landroidx/paging/compose/LazyPagingItems;

    iget-object v2, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->i:Landroidx/compose/runtime/MutableState;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/paging/compose/LazyPagingItems;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->f:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v4, :cond_1

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    iget-wide v4, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->a:J

    .line 29
    .line 30
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v5

    .line 41
    iget-object p1, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->g:Lkotlin/jvm/functions/Function0;

    .line 42
    .line 43
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->h:Landroidx/paging/compose/LazyPagingItems;

    .line 47
    .line 48
    new-instance v1, Lcom/zykj/gallery/ui/gallery/screenList/a;

    .line 49
    .line 50
    invoke-direct {v1, p1}, Lcom/zykj/gallery/ui/gallery/screenList/a;-><init>(Landroidx/paging/compose/LazyPagingItems;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v1}, Landroidx/compose/runtime/SnapshotStateKt;->snapshotFlow(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/flow/Flow;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v1, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1$2;

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    invoke-direct {v1, v7}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 61
    .line 62
    .line 63
    iput-wide v5, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->a:J

    .line 64
    .line 65
    iput v4, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->f:I

    .line 66
    .line 67
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v0, :cond_3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    move-wide v4, v5

    .line 75
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 76
    .line 77
    .line 78
    move-result-wide v6

    .line 79
    sub-long/2addr v6, v4

    .line 80
    const-wide/16 v8, 0x7d0

    .line 81
    .line 82
    sub-long v10, v8, v6

    .line 83
    .line 84
    const-wide/16 v12, 0x0

    .line 85
    .line 86
    invoke-static {v10, v11, v12, v13}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    .line 87
    .line 88
    .line 89
    move-result-wide v10

    .line 90
    cmp-long p1, v10, v12

    .line 91
    .line 92
    if-lez p1, :cond_4

    .line 93
    .line 94
    iput-wide v4, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->a:J

    .line 95
    .line 96
    iput-wide v6, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->b:J

    .line 97
    .line 98
    iput-wide v8, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->c:J

    .line 99
    .line 100
    iput-wide v10, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->d:J

    .line 101
    .line 102
    iput v2, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->e:I

    .line 103
    .line 104
    iput v3, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->f:I

    .line 105
    .line 106
    invoke-static {v10, v11, p0}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-ne p1, v0, :cond_4

    .line 111
    .line 112
    :goto_1
    return-object v0

    .line 113
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$onRefresh$1$1$1;->i:Landroidx/compose/runtime/MutableState;

    .line 114
    .line 115
    invoke-static {p1, v2}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt;->I(Landroidx/compose/runtime/MutableState;Z)V

    .line 116
    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 119
    .line 120
    return-object p1
.end method
