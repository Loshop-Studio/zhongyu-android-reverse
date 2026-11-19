.class final Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->d0()V
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
    c = "com.zykj.evaluation.ui.detail.BaseDetailViewModel$removeMistake$1"
    f = "BaseDetailViewModel.kt"
    i = {}
    l = {
        0x245
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;-><init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v7

    .line 7
    iget v0, v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;->a:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    move-object/from16 v0, p1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 32
    .line 33
    invoke-static {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->n(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;)Lp5/j;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v2, v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 38
    .line 39
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->G()J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    iget-object v4, v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 44
    .line 45
    invoke-virtual {v4}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->a0()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_2

    .line 50
    .line 51
    iget-object v4, v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 52
    .line 53
    invoke-virtual {v4}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->z()J

    .line 54
    .line 55
    .line 56
    move-result-wide v4

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    iget-object v4, v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 59
    .line 60
    invoke-virtual {v4}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->Q()J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    :goto_0
    iget-object v8, v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 65
    .line 66
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->a0()Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    iput v1, v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;->a:I

    .line 71
    .line 72
    move-wide v1, v2

    .line 73
    move-wide v3, v4

    .line 74
    move v5, v8

    .line 75
    invoke-interface/range {v0 .. v6}, Lp5/j;->d(JJZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-ne v0, v7, :cond_3

    .line 80
    .line 81
    return-object v7

    .line 82
    :cond_3
    :goto_1
    check-cast v0, Lcom/zykj/http/bean/ApiResp;

    .line 83
    .line 84
    invoke-static {v0}, Lo5/g;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    iget-object v0, v6, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$removeMistake$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->w()Lcom/zykj/evaluation/ui/detail/b;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    sget-object v20, Lcom/zykj/evaluation/ui/detail/d$a;->c:Lcom/zykj/evaluation/ui/detail/d$a;

    .line 94
    .line 95
    const v29, 0xfefff

    .line 96
    .line 97
    .line 98
    const/16 v30, 0x0

    .line 99
    .line 100
    const/4 v8, 0x0

    .line 101
    const/4 v9, 0x0

    .line 102
    const/4 v10, 0x0

    .line 103
    const/4 v11, 0x0

    .line 104
    const/4 v12, 0x0

    .line 105
    const/4 v13, 0x0

    .line 106
    const/4 v14, 0x0

    .line 107
    const/4 v15, 0x0

    .line 108
    const/16 v16, 0x0

    .line 109
    .line 110
    const/16 v17, 0x0

    .line 111
    .line 112
    const/16 v18, 0x0

    .line 113
    .line 114
    const/16 v19, 0x0

    .line 115
    .line 116
    const/16 v21, 0x0

    .line 117
    .line 118
    const/16 v22, 0x0

    .line 119
    .line 120
    const/16 v23, 0x0

    .line 121
    .line 122
    const/16 v24, 0x0

    .line 123
    .line 124
    const/16 v25, 0x0

    .line 125
    .line 126
    const-wide/16 v26, 0x0

    .line 127
    .line 128
    const/16 v28, 0x0

    .line 129
    .line 130
    invoke-static/range {v7 .. v30}, Lcom/zykj/evaluation/ui/detail/b;->b(Lcom/zykj/evaluation/ui/detail/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;ZZLjava/lang/String;ZLcom/zykj/evaluation/ui/detail/a;Lcom/zykj/evaluation/ui/detail/d;Lw5/i;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/b;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->h0(Lcom/zykj/evaluation/ui/detail/b;)V

    .line 135
    .line 136
    .line 137
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 138
    .line 139
    return-object v0
.end method
