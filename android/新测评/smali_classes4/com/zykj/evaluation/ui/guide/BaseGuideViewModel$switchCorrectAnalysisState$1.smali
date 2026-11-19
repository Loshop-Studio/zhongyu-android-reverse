.class final Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$switchCorrectAnalysisState$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->z()V
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
    c = "com.zykj.evaluation.ui.guide.BaseGuideViewModel$switchCorrectAnalysisState$1"
    f = "BaseGuideViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$switchCorrectAnalysisState$1;->b:Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$switchCorrectAnalysisState$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$switchCorrectAnalysisState$1;->b:Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$switchCorrectAnalysisState$1;-><init>(Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$switchCorrectAnalysisState$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$switchCorrectAnalysisState$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$switchCorrectAnalysisState$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$switchCorrectAnalysisState$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, v0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$switchCorrectAnalysisState$1;->a:I

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$switchCorrectAnalysisState$1;->b:Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->o()Lh6/a;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lh6/a;->c()Lj6/a;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, Lj6/a$b;->c:Lj6/a$b;

    .line 24
    .line 25
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iget-object v3, v0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$switchCorrectAnalysisState$1;->b:Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;

    .line 30
    .line 31
    invoke-virtual {v3}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->o()Lh6/a;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    sget-object v2, Lj6/a$c;->c:Lj6/a$c;

    .line 38
    .line 39
    :cond_0
    move-object/from16 v18, v2

    .line 40
    .line 41
    const/16 v19, 0x1fff

    .line 42
    .line 43
    const/16 v20, 0x0

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v6, 0x0

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v10, 0x0

    .line 51
    const/4 v11, 0x0

    .line 52
    const/4 v12, 0x0

    .line 53
    const/4 v13, 0x0

    .line 54
    const/4 v14, 0x0

    .line 55
    const/4 v15, 0x0

    .line 56
    const/16 v16, 0x0

    .line 57
    .line 58
    const/16 v17, 0x0

    .line 59
    .line 60
    invoke-static/range {v4 .. v20}, Lh6/a;->b(Lh6/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lj6/a;ILjava/lang/Object;)Lh6/a;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v3, v2}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->v(Lh6/a;)V

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const-string v3, "isCorrectShowAnalysis"

    .line 72
    .line 73
    invoke-virtual {v2, v3, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    .line 74
    .line 75
    .line 76
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v1
.end method
