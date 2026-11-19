.class final Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;
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
    c = "com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel$requestApi$2"
    f = "MistakeCollectionFilterResultViewModel.kt"
    i = {}
    l = {
        0x1ec
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $onComplete:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation
.end field

.field final synthetic $onSuccess:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $request:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;


# direct methods
.method public constructor <init>(Lr6/c;Lr6/c;Lr6/a;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/a;",
            "Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;->$request:Lr6/c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;->$onSuccess:Lr6/c;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;->$onComplete:Lr6/a;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

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
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;->$request:Lr6/c;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;->$onSuccess:Lr6/c;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;->$onComplete:Lr6/a;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;-><init>(Lr6/c;Lr6/c;Lr6/a;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Lh6/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    check-cast p1, Lkotlin/Result;

    .line 14
    .line 15
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;->$request:Lr6/c;

    .line 32
    .line 33
    iput v2, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;->label:I

    .line 34
    .line 35
    invoke-static {p1, p0}, Lcom/zykj/mistake/data/e;->a(Lr6/c;Lh6/c;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;->$onSuccess:Lr6/c;

    .line 43
    .line 44
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_3
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;->this$0:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 54
    .line 55
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    new-instance v1, Lcom/zykj/mistake/feature/collection/filter/p;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-nez p1, :cond_4

    .line 68
    .line 69
    const-string p1, ""

    .line 70
    .line 71
    :cond_4
    invoke-direct {v1, p1}, Lcom/zykj/mistake/feature/collection/filter/p;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->f(Lcom/zykj/mistake/feature/collection/filter/q;)V

    .line 75
    .line 76
    .line 77
    :cond_5
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;->$onComplete:Lr6/a;

    .line 78
    .line 79
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 83
    .line 84
    return-object p1
.end method
