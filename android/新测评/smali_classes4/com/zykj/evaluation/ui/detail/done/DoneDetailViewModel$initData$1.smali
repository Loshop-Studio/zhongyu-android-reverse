.class final Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;->U(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V
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
    c = "com.zykj.evaluation.ui.detail.done.DoneDetailViewModel$initData$1"
    f = "DoneDetailViewModel.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x40
    }
    m = "invokeSuspend"
    n = {
        "it",
        "$i$a$-let-DoneDetailViewModel$initData$1$1"
    }
    s = {
        "L$0",
        "I$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDoneDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoneDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n1#2:513\n*E\n"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public c:I

.field public final synthetic d:Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;-><init>(Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    .line 18
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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;

    .line 32
    .line 33
    invoke-static {p1}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;->C0(Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;

    .line 40
    .line 41
    invoke-static {v1}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;->B0(Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;

    .line 54
    .line 55
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    iput-object v3, p0, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;->a:Ljava/lang/Object;

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    iput v3, p0, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;->b:I

    .line 63
    .line 64
    iput v2, p0, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;->c:I

    .line 65
    .line 66
    invoke-static {v1, p1, p0}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;->D0(Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;Lcom/zykj/evaluation/ui/detail/GuideQuestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v0, :cond_2

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p1
.end method
