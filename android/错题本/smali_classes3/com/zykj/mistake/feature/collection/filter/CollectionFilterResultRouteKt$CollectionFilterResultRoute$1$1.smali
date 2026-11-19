.class final Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1;
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
    c = "com.zykj.mistake.feature.collection.filter.CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1"
    f = "CollectionFilterResultRoute.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $args:Lcom/zykj/mistake/feature/collection/filter/l;

.field final synthetic $viewModel:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

.field label:I


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Lcom/zykj/mistake/feature/collection/filter/l;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;",
            "Lcom/zykj/mistake/feature/collection/filter/l;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1;->$viewModel:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1;->$args:Lcom/zykj/mistake/feature/collection/filter/l;

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
    new-instance p1, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1;->$viewModel:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1;->$args:Lcom/zykj/mistake/feature/collection/filter/l;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1;-><init>(Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Lcom/zykj/mistake/feature/collection/filter/l;Lh6/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1;->$viewModel:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/z;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1;->$args:Lcom/zykj/mistake/feature/collection/filter/l;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lcom/zykj/mistake/feature/collection/filter/z;-><init>(Lcom/zykj/mistake/feature/collection/filter/l;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->c(Lcom/zykj/mistake/feature/collection/filter/r0;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method
