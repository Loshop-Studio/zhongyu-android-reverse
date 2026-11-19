.class final Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$applyEvents$5;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;->s(Landroidx/paging/PagingData;Lcom/zykj/student/dialogue/ui/home/p;)Landroidx/paging/PagingData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;",
        "it"
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
    c = "com.zykj.student.dialogue.ui.home.HomePagerViewModel$applyEvents$5"
    f = "HomePagerViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/student/dialogue/ui/home/p;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/p;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$applyEvents$5;->c:Lcom/zykj/student/dialogue/ui/home/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/student/dialogue/bean/resp/QuestionResp;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$applyEvents$5;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$applyEvents$5;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$applyEvents$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$applyEvents$5;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$applyEvents$5;->c:Lcom/zykj/student/dialogue/ui/home/p;

    invoke-direct {v0, v1, p2}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$applyEvents$5;-><init>(Lcom/zykj/student/dialogue/ui/home/p;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$applyEvents$5;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$applyEvents$5;->a(Lcom/zykj/student/dialogue/bean/resp/QuestionResp;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$applyEvents$5;->b:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    check-cast v2, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;

    .line 7
    .line 8
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget v1, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$applyEvents$5;->a:I

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->getId()J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$applyEvents$5;->c:Lcom/zykj/student/dialogue/ui/home/p;

    .line 23
    .line 24
    check-cast v1, Lcom/zykj/student/dialogue/ui/home/p$c;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/home/p$c;->a()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    cmp-long v1, v3, v5

    .line 35
    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$applyEvents$5;->c:Lcom/zykj/student/dialogue/ui/home/p;

    .line 39
    .line 40
    check-cast v1, Lcom/zykj/student/dialogue/ui/home/p$c;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/home/p$c;->b()I

    .line 43
    .line 44
    .line 45
    move-result v23

    .line 46
    const v26, 0x37ffff

    .line 47
    .line 48
    .line 49
    const/16 v27, 0x0

    .line 50
    .line 51
    const-wide/16 v3, 0x0

    .line 52
    .line 53
    const/4 v5, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v9, 0x0

    .line 58
    const/4 v10, 0x0

    .line 59
    const/4 v11, 0x0

    .line 60
    const/4 v12, 0x0

    .line 61
    const/4 v13, 0x0

    .line 62
    const/4 v14, 0x0

    .line 63
    const/4 v15, 0x0

    .line 64
    const/16 v16, 0x0

    .line 65
    .line 66
    const/16 v17, 0x0

    .line 67
    .line 68
    const/16 v18, 0x0

    .line 69
    .line 70
    const/16 v19, 0x0

    .line 71
    .line 72
    const/16 v20, 0x0

    .line 73
    .line 74
    const/16 v21, 0x0

    .line 75
    .line 76
    const/16 v22, 0x0

    .line 77
    .line 78
    const/16 v24, 0x0

    .line 79
    .line 80
    const/16 v25, 0x0

    .line 81
    .line 82
    invoke-static/range {v2 .. v27}, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->copy$default(Lcom/zykj/student/dialogue/bean/resp/QuestionResp;JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;IIZZILjava/lang/Object;)Lcom/zykj/student/dialogue/bean/resp/QuestionResp;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    return-object v1

    .line 87
    :cond_0
    return-object v2

    .line 88
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 91
    .line 92
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw v1
.end method
