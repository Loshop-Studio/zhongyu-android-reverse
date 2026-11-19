.class final Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->t()V
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
    c = "com.zykj.evaluation.ui.guide.BaseGuideViewModel$refreshSubmitProgress$1"
    f = "BaseGuideViewModel.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x50
    }
    m = "invokeSuspend"
    n = {
        "it",
        "$i$a$-let-BaseGuideViewModel$refreshSubmitProgress$1$1"
    }
    s = {
        "J$0",
        "I$0"
    }
.end annotation


# instance fields
.field public a:J

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;->e:Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;->e:Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;-><init>(Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;->d:I

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
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;

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
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;->e:Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->n()Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getExamId()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;->e:Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;

    .line 44
    .line 45
    invoke-static {p1}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->m(Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;)Lp5/j;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;->c:Ljava/lang/Object;

    .line 50
    .line 51
    iput-wide v3, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;->a:J

    .line 52
    .line 53
    const/4 v5, 0x0

    .line 54
    iput v5, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;->b:I

    .line 55
    .line 56
    iput v2, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;->d:I

    .line 57
    .line 58
    invoke-interface {v1, v3, v4, p0}, Lp5/j;->c(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-ne v1, v0, :cond_2

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_2
    move-object v0, p1

    .line 66
    move-object p1, v1

    .line 67
    :goto_0
    check-cast p1, Lcom/zykj/http/bean/ApiResp;

    .line 68
    .line 69
    invoke-static {p1}, Lo5/g;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Lcom/zykj/evaluation/bean/ExamProgress;

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->A(Lcom/zykj/evaluation/bean/ExamProgress;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p1
.end method
