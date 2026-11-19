.class final Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.submit.SubmitWork$doWork$2$job$1"
    f = "SubmitWork.kt"
    i = {}
    l = {
        0x5b,
        0x5b
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/submit/SubmitWork;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:I

.field public final synthetic f:Lkotlin/jvm/internal/Ref$ObjectRef;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/submit/SubmitWork;JJILkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->b:Lcom/zykj/evaluation/submit/SubmitWork;

    iput-wide p2, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->c:J

    iput-wide p4, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->d:J

    iput p6, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->e:I

    iput-object p7, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9

    new-instance v0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;

    iget-object v1, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->b:Lcom/zykj/evaluation/submit/SubmitWork;

    iget-wide v2, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->c:J

    iget-wide v4, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->d:J

    iget v6, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->e:I

    iget-object v7, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;-><init>(Lcom/zykj/evaluation/submit/SubmitWork;JJILkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    move-object v9, p0

    .line 19
    goto :goto_2

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
    move-object v9, p0

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move p1, v3

    .line 37
    iget-object v3, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->b:Lcom/zykj/evaluation/submit/SubmitWork;

    .line 38
    .line 39
    iget-wide v4, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->c:J

    .line 40
    .line 41
    iget-wide v6, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->d:J

    .line 42
    .line 43
    iget v8, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->e:I

    .line 44
    .line 45
    iput p1, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->a:I

    .line 46
    .line 47
    move-object v9, p0

    .line 48
    invoke-virtual/range {v3 .. v9}, Lcom/zykj/evaluation/submit/SubmitWork;->o(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    :goto_0
    check-cast p1, Lkotlinx/coroutines/flow/Flow;

    .line 56
    .line 57
    new-instance v1, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1$1;

    .line 58
    .line 59
    iget-object v3, v9, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    invoke-direct {v1, v3, v4}, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    .line 63
    .line 64
    .line 65
    iput v2, v9, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;->a:I

    .line 66
    .line 67
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/flow/FlowKt;->collectLatest(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v0, :cond_4

    .line 72
    .line 73
    :goto_1
    return-object v0

    .line 74
    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p1
.end method
