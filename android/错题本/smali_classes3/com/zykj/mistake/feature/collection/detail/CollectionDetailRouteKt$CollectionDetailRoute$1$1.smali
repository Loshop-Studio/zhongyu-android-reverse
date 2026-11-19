.class final Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$1$1;
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
    c = "com.zykj.mistake.feature.collection.detail.CollectionDetailRouteKt$CollectionDetailRoute$1$1"
    f = "CollectionDetailRoute.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $args:Lu4/c;

.field final synthetic $viewModel:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

.field label:I


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lu4/c;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;",
            "Lu4/c;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$1$1;->$viewModel:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$1$1;->$args:Lu4/c;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 2
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
    new-instance p1, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$1$1;->$viewModel:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$1$1;->$args:Lu4/c;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$1$1;-><init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lu4/c;Lh6/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$1$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$1$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$1$1;->$viewModel:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$1$1;->$args:Lu4/c;

    .line 13
    .line 14
    new-instance v1, Lcom/zykj/mistake/feature/collection/detail/f0;

    .line 15
    .line 16
    iget-object v2, v0, Lu4/c;->a:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v3, v0, Lu4/c;->b:Ljava/lang/String;

    .line 19
    .line 20
    iget v4, v0, Lu4/c;->c:I

    .line 21
    .line 22
    iget-object v0, v0, Lu4/c;->d:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 23
    .line 24
    invoke-direct {v1, v2, v3, v4, v0}, Lcom/zykj/mistake/feature/collection/detail/f0;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->d(Lcom/zykj/mistake/feature/collection/detail/y0;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method
