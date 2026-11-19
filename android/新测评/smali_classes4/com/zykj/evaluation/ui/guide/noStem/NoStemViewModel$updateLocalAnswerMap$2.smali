.class final Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->d0(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.ui.guide.noStem.NoStemViewModel$updateLocalAnswerMap$2"
    f = "NoStemViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;->d:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;->d:Ljava/util/List;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->E(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Landroidx/collection/ArrayMap;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;->c:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;->d:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;->c:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->b0(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lcom/zykj/evaluation/utils/LocalAnswerManager;->a:Lcom/zykj/evaluation/utils/LocalAnswerManager;

    .line 32
    .line 33
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 34
    .line 35
    invoke-static {v0}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->E(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Landroidx/collection/ArrayMap;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->p()Lg7/e;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget-object v2, Lg7/e;->d:Lg7/e$a;

    .line 46
    .line 47
    invoke-virtual {v2}, Lg7/e$a;->a()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v1, v2}, Lg7/e;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p1, v0, v1}, Lcom/zykj/evaluation/utils/LocalAnswerManager;->c(Ljava/util/Map;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1
.end method
