.class final Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;
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
    c = "com.zykj.mistake.feature.home.HomeRouteKt$HomeRoute$5$1"
    f = "HomeRoute.kt"
    i = {}
    l = {
        0x71
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $collectionViewModel:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

.field final synthetic $notebookViewModel:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

.field final synthetic $reviewViewModel:Lcom/zykj/mistake/feature/review/ReviewViewModel;

.field final synthetic $shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

.field label:I


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lcom/zykj/mistake/feature/review/ReviewViewModel;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/main/MainShellViewModel;",
            "Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;",
            "Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;",
            "Lcom/zykj/mistake/feature/review/ReviewViewModel;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;->$notebookViewModel:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;->$collectionViewModel:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;->$reviewViewModel:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 6
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
    new-instance v0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;->$notebookViewModel:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;->$collectionViewModel:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;->$reviewViewModel:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lcom/zykj/mistake/feature/review/ReviewViewModel;Lh6/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;->label:I

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
    iget-object p1, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 26
    .line 27
    iget-object v1, p1, Lcom/zykj/mistake/main/MainShellViewModel;->f:Lkotlinx/coroutines/flow/a0;

    .line 28
    .line 29
    new-instance v3, Lcom/zykj/mistake/feature/home/h;

    .line 30
    .line 31
    iget-object v4, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;->$notebookViewModel:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 32
    .line 33
    iget-object v5, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;->$collectionViewModel:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 34
    .line 35
    iget-object v6, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;->$reviewViewModel:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 36
    .line 37
    invoke-direct {v3, p1, v4, v5, v6}, Lcom/zykj/mistake/feature/home/h;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lcom/zykj/mistake/feature/review/ReviewViewModel;)V

    .line 38
    .line 39
    .line 40
    iput v2, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;->label:I

    .line 41
    .line 42
    iget-object p1, v1, Lkotlinx/coroutines/flow/a0;->a:Lkotlinx/coroutines/flow/m0;

    .line 43
    .line 44
    invoke-interface {p1, v3, p0}, Lkotlinx/coroutines/flow/f;->collect(Lkotlinx/coroutines/flow/g;Lh6/c;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-ne p1, v0, :cond_2

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_2
    :goto_0
    new-instance p1, Lkotlin/KotlinNothingValueException;

    .line 52
    .line 53
    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 54
    .line 55
    .line 56
    throw p1
.end method
