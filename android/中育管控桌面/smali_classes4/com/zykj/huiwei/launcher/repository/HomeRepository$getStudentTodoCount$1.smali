.class final Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/repository/HomeRepository;->c(I)Lkotlinx/coroutines/flow/Flow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/flow/FlowCollector<",
        "-",
        "Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;",
        ">;",
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
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/flow/FlowCollector;",
        "Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;"
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
    c = "com.zykj.huiwei.launcher.repository.HomeRepository$getStudentTodoCount$1"
    f = "HomeRepository.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x1b,
        0x1b
    }
    m = "invokeSuspend"
    n = {
        "$this$flow",
        "$this$flow"
    }
    s = {
        "L$0",
        "L$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

.field public final synthetic e:I


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/repository/HomeRepository;ILkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->d:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    iput p2, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance v0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->d:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    iget v2, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->e:I

    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;-><init>(Lcom/zykj/huiwei/launcher/repository/HomeRepository;ILkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/flow/FlowCollector;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->invoke(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/flow/FlowCollector;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->b:I

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    const/4 v4, 0x1

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    if-eq v2, v4, :cond_1

    .line 16
    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Lkotlinx/coroutines/flow/FlowCollector;

    .line 34
    .line 35
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->d:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    .line 43
    .line 44
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/repository/HomeRepository;->a(Lcom/zykj/huiwei/launcher/repository/HomeRepository;)Lcom/zykj/huiwei/launcher/api/HomeService;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget v2, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->e:I

    .line 49
    .line 50
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    iput-object v5, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->c:Ljava/lang/Object;

    .line 55
    .line 56
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->a:Ljava/lang/Object;

    .line 57
    .line 58
    iput v4, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->b:I

    .line 59
    .line 60
    invoke-interface {p1, v2, p0}, Lcom/zykj/huiwei/launcher/api/HomeService;->getStudentUserTodo(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v1, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    move-object v2, v0

    .line 68
    :goto_0
    check-cast p1, Lcom/zykj/http/bean/ApiResp;

    .line 69
    .line 70
    invoke-static {p1}, La3/a;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->c:Ljava/lang/Object;

    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->a:Ljava/lang/Object;

    .line 82
    .line 83
    iput v3, p0, Lcom/zykj/huiwei/launcher/repository/HomeRepository$getStudentTodoCount$1;->b:I

    .line 84
    .line 85
    invoke-interface {v2, p1, p0}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-ne p1, v1, :cond_4

    .line 90
    .line 91
    :goto_1
    return-object v1

    .line 92
    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p1
.end method
