.class final Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;
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
    c = "com.zykj.mistake.feature.home.HomeRouteKt$HomeRoute$6$1"
    f = "HomeRoute.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $collectionViewModel:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

.field final synthetic $homeState$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lcom/zykj/mistake/feature/home/o;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $reviewViewModel:Lcom/zykj/mistake/feature/review/ReviewViewModel;

.field final synthetic $shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

.field label:I


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lcom/zykj/mistake/feature/review/ReviewViewModel;Landroidx/compose/runtime/State;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/main/MainShellViewModel;",
            "Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;",
            "Lcom/zykj/mistake/feature/review/ReviewViewModel;",
            "Landroidx/compose/runtime/State<",
            "Lcom/zykj/mistake/feature/home/o;",
            ">;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->$collectionViewModel:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->$reviewViewModel:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->$homeState$delegate:Landroidx/compose/runtime/State;

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
    new-instance v0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->$collectionViewModel:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->$reviewViewModel:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->$homeState$delegate:Landroidx/compose/runtime/State;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lcom/zykj/mistake/feature/review/ReviewViewModel;Landroidx/compose/runtime/State;Lh6/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->$homeState$delegate:Landroidx/compose/runtime/State;

    .line 11
    .line 12
    invoke-interface {p1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lcom/zykj/mistake/feature/home/o;

    .line 17
    .line 18
    iget-object p1, p1, Lcom/zykj/mistake/feature/home/o;->a:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 19
    .line 20
    sget-object v0, Lcom/zykj/mistake/feature/home/HomeTab;->MISTAKE_COLLECTION:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    if-ne p1, v0, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 26
    .line 27
    iget-boolean v0, p1, Lcom/zykj/mistake/main/MainShellViewModel;->h:Z

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput-boolean v1, p1, Lcom/zykj/mistake/main/MainShellViewModel;->h:Z

    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->$collectionViewModel:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 35
    .line 36
    sget-object v0, Lcom/zykj/mistake/feature/collection/list/s;->a:Lcom/zykj/mistake/feature/collection/list/s;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->a(Lcom/zykj/mistake/feature/collection/list/u;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->$homeState$delegate:Landroidx/compose/runtime/State;

    .line 42
    .line 43
    invoke-interface {p1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Lcom/zykj/mistake/feature/home/o;

    .line 48
    .line 49
    iget-object p1, p1, Lcom/zykj/mistake/feature/home/o;->a:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 50
    .line 51
    sget-object v0, Lcom/zykj/mistake/feature/home/HomeTab;->REVIEW:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 52
    .line 53
    if-ne p1, v0, :cond_3

    .line 54
    .line 55
    iget-object p1, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->$shellViewModel:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 56
    .line 57
    iget-boolean v0, p1, Lcom/zykj/mistake/main/MainShellViewModel;->i:Z

    .line 58
    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    iput-boolean v1, p1, Lcom/zykj/mistake/main/MainShellViewModel;->i:Z

    .line 63
    .line 64
    iget-object p1, p0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;->$reviewViewModel:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 65
    .line 66
    sget-object v0, Lcom/zykj/mistake/feature/review/e;->a:Lcom/zykj/mistake/feature/review/e;

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/feature/review/ReviewViewModel;->a(Lcom/zykj/mistake/feature/review/h;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    :goto_1
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p1
.end method
