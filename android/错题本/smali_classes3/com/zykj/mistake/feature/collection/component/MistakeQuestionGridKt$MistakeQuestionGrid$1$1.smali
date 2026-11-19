.class final Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;
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
    c = "com.zykj.mistake.feature.collection.component.MistakeQuestionGridKt$MistakeQuestionGrid$1$1"
    f = "MistakeQuestionGrid.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $hasMore:Z

.field final synthetic $isLoadingMore:Z

.field final synthetic $isRefreshing:Z

.field final synthetic $items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lp4/b;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onLoadMore:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation
.end field

.field final synthetic $shouldLoadMore:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/State;ZZZLjava/util/List;Lr6/a;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Boolean;",
            ">;ZZZ",
            "Ljava/util/List<",
            "Lp4/b;",
            ">;",
            "Lr6/a;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$shouldLoadMore:Landroidx/compose/runtime/State;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$isRefreshing:Z

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$isLoadingMore:Z

    .line 6
    .line 7
    iput-boolean p4, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$hasMore:Z

    .line 8
    .line 9
    iput-object p5, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$items:Ljava/util/List;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$onLoadMore:Lr6/a;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 8
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
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$shouldLoadMore:Landroidx/compose/runtime/State;

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$isRefreshing:Z

    .line 6
    .line 7
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$isLoadingMore:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$hasMore:Z

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$items:Ljava/util/List;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$onLoadMore:Lr6/a;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;-><init>(Landroidx/compose/runtime/State;ZZZLjava/util/List;Lr6/a;Lh6/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$shouldLoadMore:Landroidx/compose/runtime/State;

    .line 11
    .line 12
    invoke-interface {p1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget-boolean p1, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$isRefreshing:Z

    .line 25
    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    iget-boolean p1, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$isLoadingMore:Z

    .line 29
    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    iget-boolean p1, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$hasMore:Z

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$items:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$1$1;->$onLoadMore:Lr6/a;

    .line 45
    .line 46
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_0
    sget-object p1, Ld6/s;->a:Ld6/s;

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
