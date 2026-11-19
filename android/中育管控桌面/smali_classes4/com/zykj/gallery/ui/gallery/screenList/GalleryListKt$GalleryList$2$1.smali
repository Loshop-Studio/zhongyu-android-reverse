.class final Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;
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
    c = "com.zykj.gallery.ui.gallery.screenList.GalleryListKt$GalleryList$2$1"
    f = "GalleryList.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Landroidx/paging/compose/LazyPagingItems;

.field public final synthetic c:Lkotlinx/coroutines/CoroutineScope;

.field public final synthetic d:Landroidx/compose/foundation/lazy/grid/LazyGridState;


# direct methods
.method public constructor <init>(Landroidx/paging/compose/LazyPagingItems;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;->b:Landroidx/paging/compose/LazyPagingItems;

    iput-object p2, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;->c:Lkotlinx/coroutines/CoroutineScope;

    iput-object p3, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;->d:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;

    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;->b:Landroidx/paging/compose/LazyPagingItems;

    iget-object v1, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;->c:Lkotlinx/coroutines/CoroutineScope;

    iget-object v2, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;->d:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;-><init>(Landroidx/paging/compose/LazyPagingItems;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;->b:Landroidx/paging/compose/LazyPagingItems;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/paging/compose/LazyPagingItems;->getLoadState()Landroidx/paging/CombinedLoadStates;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroidx/paging/CombinedLoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    instance-of p1, p1, Landroidx/paging/LoadState$NotLoading;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;->b:Landroidx/paging/compose/LazyPagingItems;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/paging/compose/LazyPagingItems;->getItemCount()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-lez p1, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;->c:Lkotlinx/coroutines/CoroutineScope;

    .line 34
    .line 35
    new-instance v3, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1$1;

    .line 36
    .line 37
    iget-object p1, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1;->d:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {v3, p1, v1}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt$GalleryList$2$1$1;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/coroutines/Continuation;)V

    .line 41
    .line 42
    .line 43
    const/4 v4, 0x3

    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 47
    .line 48
    .line 49
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method
