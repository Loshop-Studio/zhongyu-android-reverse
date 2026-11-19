.class final Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->V(Lcom/zykj/student/dialogue/bean/resp/QuestionResp;)V
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
    c = "com.zykj.student.dialogue.ui.home.HomeViewModel$updateSelectedState$1"
    f = "HomeViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,509:1\n230#2,5:510\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1\n*L\n263#1:510,5\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

.field public final synthetic c:Lcom/zykj/student/dialogue/bean/resp/QuestionResp;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lcom/zykj/student/dialogue/bean/resp/QuestionResp;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1;->b:Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1;->c:Lcom/zykj/student/dialogue/bean/resp/QuestionResp;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1;

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1;->b:Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1;->c:Lcom/zykj/student/dialogue/bean/resp/QuestionResp;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lcom/zykj/student/dialogue/bean/resp/QuestionResp;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1;->b:Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->s(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1;->b:Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1;->c:Lcom/zykj/student/dialogue/bean/resp/QuestionResp;

    .line 20
    .line 21
    :cond_0
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    move-object v3, v2

    .line 26
    check-cast v3, Ls6/s2;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->E()Lkotlinx/coroutines/flow/StateFlow;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-interface {v4}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Ls6/s2;

    .line 37
    .line 38
    invoke-virtual {v4}, Ls6/s2;->j()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->getId()J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    invoke-static {v0, v4, v5, v6}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->t(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Ljava/util/List;J)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    const/16 v12, 0xef

    .line 51
    .line 52
    const/4 v13, 0x0

    .line 53
    const/4 v4, 0x0

    .line 54
    const/4 v5, 0x0

    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v9, 0x0

    .line 58
    const/4 v10, 0x0

    .line 59
    const/4 v11, 0x0

    .line 60
    invoke-static/range {v3 .. v13}, Ls6/s2;->b(Ls6/s2;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;ZLjava/util/List;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ls6/s2;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-interface {p1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_0

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 76
    .line 77
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1
.end method
