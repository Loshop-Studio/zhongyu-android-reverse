.class final Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$getLocalCorrectResultMap$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->O0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.ui.detail.toCorrectSelf.ToCorrectSelfDetailViewModel$getLocalCorrectResultMap$2"
    f = "ToCorrectSelfDetailViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$getLocalCorrectResultMap$2;->b:Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$getLocalCorrectResultMap$2;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$getLocalCorrectResultMap$2;->b:Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$getLocalCorrectResultMap$2;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$getLocalCorrectResultMap$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$getLocalCorrectResultMap$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$getLocalCorrectResultMap$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$getLocalCorrectResultMap$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$getLocalCorrectResultMap$2;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$getLocalCorrectResultMap$2;->b:Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->D0(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;)Landroidx/collection/ArrayMap;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroidx/collection/SimpleArrayMap;->clear()V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lcom/zykj/evaluation/utils/LocalCorrectResultManager;->a:Lcom/zykj/evaluation/utils/LocalCorrectResultManager;

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$getLocalCorrectResultMap$2;->b:Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Lg7/e;->d:Lg7/e$a;

    .line 29
    .line 30
    invoke-virtual {v1}, Lg7/e$a;->a()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Lg7/e;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p1, v0}, Lcom/zykj/evaluation/utils/LocalCorrectResultManager;->a(Ljava/lang/String;)Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$getLocalCorrectResultMap$2;->b:Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;

    .line 43
    .line 44
    invoke-static {v0}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->D0(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;)Landroidx/collection/ArrayMap;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, p1}, Landroidx/collection/ArrayMap;->putAll(Ljava/util/Map;)V

    .line 49
    .line 50
    .line 51
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1
.end method
