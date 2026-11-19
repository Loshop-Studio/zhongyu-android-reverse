.class final Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->g0(Z)V
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
    c = "com.zykj.evaluation.ui.detail.BaseDetailViewModel$setAskForHelp$1"
    f = "BaseDetailViewModel.kt"
    i = {}
    l = {
        0x151
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;ZLkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iput-boolean p2, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;->c:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iget-boolean v1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;->c:Z

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;-><init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;ZLkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;->a:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    move-object/from16 v2, p1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v1

    .line 28
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 32
    .line 33
    invoke-static {v2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->n(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;)Lp5/j;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v4, Lcom/zykj/evaluation/bean/AskForHelpReq;

    .line 38
    .line 39
    iget-object v5, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 40
    .line 41
    invoke-virtual {v5}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->N()J

    .line 42
    .line 43
    .line 44
    move-result-wide v5

    .line 45
    iget-object v7, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 46
    .line 47
    invoke-virtual {v7}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->Q()J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    iget-boolean v9, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;->c:Z

    .line 52
    .line 53
    invoke-direct/range {v4 .. v9}, Lcom/zykj/evaluation/bean/AskForHelpReq;-><init>(JJZ)V

    .line 54
    .line 55
    .line 56
    iput v3, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;->a:I

    .line 57
    .line 58
    invoke-interface {v2, v4, v0}, Lp5/j;->h(Lcom/zykj/evaluation/bean/AskForHelpReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-ne v2, v1, :cond_2

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_2
    :goto_0
    check-cast v2, Lcom/zykj/http/bean/ApiResp;

    .line 66
    .line 67
    invoke-static {v2}, Lo5/g;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 71
    .line 72
    iget-boolean v2, v0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$setAskForHelp$1;->c:Z

    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->w()Lcom/zykj/evaluation/ui/detail/b;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    sget-object v2, Lcom/zykj/evaluation/ui/detail/a$b;->c:Lcom/zykj/evaluation/ui/detail/a$b;

    .line 81
    .line 82
    :goto_1
    move-object v15, v2

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    sget-object v2, Lcom/zykj/evaluation/ui/detail/a$a;->c:Lcom/zykj/evaluation/ui/detail/a$a;

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :goto_2
    const v25, 0xff7ff

    .line 88
    .line 89
    .line 90
    const/16 v26, 0x0

    .line 91
    .line 92
    const/4 v4, 0x0

    .line 93
    const/4 v5, 0x0

    .line 94
    const/4 v6, 0x0

    .line 95
    const/4 v7, 0x0

    .line 96
    const/4 v8, 0x0

    .line 97
    const/4 v9, 0x0

    .line 98
    const/4 v10, 0x0

    .line 99
    const/4 v11, 0x0

    .line 100
    const/4 v12, 0x0

    .line 101
    const/4 v13, 0x0

    .line 102
    const/4 v14, 0x0

    .line 103
    const/16 v16, 0x0

    .line 104
    .line 105
    const/16 v17, 0x0

    .line 106
    .line 107
    const/16 v18, 0x0

    .line 108
    .line 109
    const/16 v19, 0x0

    .line 110
    .line 111
    const/16 v20, 0x0

    .line 112
    .line 113
    const/16 v21, 0x0

    .line 114
    .line 115
    const-wide/16 v22, 0x0

    .line 116
    .line 117
    const/16 v24, 0x0

    .line 118
    .line 119
    invoke-static/range {v3 .. v26}, Lcom/zykj/evaluation/ui/detail/b;->b(Lcom/zykj/evaluation/ui/detail/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;ZZLjava/lang/String;ZLcom/zykj/evaluation/ui/detail/a;Lcom/zykj/evaluation/ui/detail/d;Lw5/i;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/b;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v1, v2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->h0(Lcom/zykj/evaluation/ui/detail/b;)V

    .line 124
    .line 125
    .line 126
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 127
    .line 128
    return-object v1
.end method
