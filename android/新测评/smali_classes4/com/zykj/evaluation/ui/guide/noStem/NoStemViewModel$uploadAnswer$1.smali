.class final Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->f0(Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.zykj.evaluation.ui.guide.noStem.NoStemViewModel$uploadAnswer$1"
    f = "NoStemViewModel.kt"
    i = {}
    l = {
        0xcf
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;->d:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;->d:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v8

    .line 7
    iget v0, v7, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;->a:I

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
    goto :goto_1

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, v7, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->G(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v2, v7, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 36
    .line 37
    invoke-static {v2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->J(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Lcom/zykj/message/server/bean/UserInfo;

    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const-string v3, "getId(...)"

    .line 52
    .line 53
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    iget-object v4, v7, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 61
    .line 62
    invoke-virtual {v4}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->q()J

    .line 63
    .line 64
    .line 65
    move-result-wide v4

    .line 66
    iget-object v6, v7, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 67
    .line 68
    invoke-static {v6}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->C(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    if-eqz v6, :cond_2

    .line 73
    .line 74
    invoke-virtual {v6}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getState()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    const/4 v6, -0x1

    .line 80
    :goto_0
    new-instance v9, Lcom/zykj/evaluation/bean/UploadData;

    .line 81
    .line 82
    iget-object v10, v7, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;->c:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v11, v7, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;->d:Ljava/lang/String;

    .line 85
    .line 86
    sget-object v12, Lm5/e$c;->b:Lm5/e$c;

    .line 87
    .line 88
    invoke-virtual {v12}, Lm5/e;->a()I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const/4 v14, 0x4

    .line 93
    const/4 v15, 0x0

    .line 94
    const/4 v12, 0x0

    .line 95
    invoke-direct/range {v9 .. v15}, Lcom/zykj/evaluation/bean/UploadData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 96
    .line 97
    .line 98
    iput v1, v7, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;->a:I

    .line 99
    .line 100
    move-wide v1, v2

    .line 101
    move-wide v3, v4

    .line 102
    move v5, v6

    .line 103
    move-object v6, v9

    .line 104
    invoke-virtual/range {v0 .. v7}, Lcom/zykj/evaluation/upload/OssTaskManger;->t(JJILcom/zykj/evaluation/bean/UploadData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-ne v0, v8, :cond_3

    .line 109
    .line 110
    return-object v8

    .line 111
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 112
    .line 113
    return-object v0
.end method
