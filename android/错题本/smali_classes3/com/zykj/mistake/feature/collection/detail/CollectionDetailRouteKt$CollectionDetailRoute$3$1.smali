.class final Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.collection.detail.CollectionDetailRouteKt$CollectionDetailRoute$3$1"
    f = "CollectionDetailRoute.kt"
    i = {}
    l = {
        0x2f
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $backStackEntry:Landroidx/navigation/NavBackStackEntry;

.field final synthetic $mainNavController:Lt4/e;

.field final synthetic $viewModel:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/navigation/NavBackStackEntry;Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lt4/e;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavBackStackEntry;",
            "Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;",
            "Lt4/e;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;->$backStackEntry:Landroidx/navigation/NavBackStackEntry;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;->$viewModel:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;->$mainNavController:Lt4/e;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;->$backStackEntry:Landroidx/navigation/NavBackStackEntry;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;->$viewModel:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;->$mainNavController:Lt4/e;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;-><init>(Landroidx/navigation/NavBackStackEntry;Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lt4/e;Lh6/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :cond_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;->$backStackEntry:Landroidx/navigation/NavBackStackEntry;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/navigation/NavBackStackEntry;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v1, "nav_result_collection_removed_item_id"

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual {p1, v1, v3}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/m0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v1, Lcom/zykj/mistake/feature/collection/detail/d;

    .line 39
    .line 40
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;->$viewModel:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 41
    .line 42
    iget-object v4, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;->$mainNavController:Lt4/e;

    .line 43
    .line 44
    iget-object v5, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;->$backStackEntry:Landroidx/navigation/NavBackStackEntry;

    .line 45
    .line 46
    invoke-direct {v1, v3, v4, v5}, Lcom/zykj/mistake/feature/collection/detail/d;-><init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lt4/e;Landroidx/navigation/NavBackStackEntry;)V

    .line 47
    .line 48
    .line 49
    iput v2, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;->label:I

    .line 50
    .line 51
    invoke-interface {p1, v1, p0}, Lkotlinx/coroutines/flow/f;->collect(Lkotlinx/coroutines/flow/g;Lh6/c;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v0, :cond_2

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    :goto_0
    new-instance p1, Lkotlin/KotlinNothingValueException;

    .line 59
    .line 60
    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 61
    .line 62
    .line 63
    throw p1
.end method
