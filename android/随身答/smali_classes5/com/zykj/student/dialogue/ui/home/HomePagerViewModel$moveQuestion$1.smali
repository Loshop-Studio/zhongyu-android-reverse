.class final Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;->y(Ljava/util/List;J)V
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
    c = "com.zykj.student.dialogue.ui.home.HomePagerViewModel$moveQuestion$1"
    f = "HomePagerViewModel.kt"
    i = {}
    l = {
        0x6c
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:J


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;Ljava/util/List;JLkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->b:Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->c:Ljava/util/List;

    iput-wide p3, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->d:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6

    new-instance v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->b:Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;

    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->c:Ljava/util/List;

    iget-wide v3, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->d:J

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;-><init>(Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;Ljava/util/List;JLkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->a:I

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->b:Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;->n(Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;)Lk6/g;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v1, Lcom/zykj/student/dialogue/bean/req/MoveCategoryReq;

    .line 34
    .line 35
    iget-object v3, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->c:Ljava/util/List;

    .line 36
    .line 37
    iget-wide v4, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->d:J

    .line 38
    .line 39
    invoke-direct {v1, v3, v4, v5}, Lcom/zykj/student/dialogue/bean/req/MoveCategoryReq;-><init>(Ljava/util/List;J)V

    .line 40
    .line 41
    .line 42
    iput v2, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->a:I

    .line 43
    .line 44
    invoke-interface {p1, v1, p0}, Lk6/g;->k(Lcom/zykj/student/dialogue/bean/req/MoveCategoryReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-ne p1, v0, :cond_2

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_2
    :goto_0
    check-cast p1, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 52
    .line 53
    invoke-static {p1}, Li6/c;->b(Lcom/zykj/student/dialogue/network/BaseResponse;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->b:Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;

    .line 57
    .line 58
    sget-object v0, Lcom/zykj/student/dialogue/ui/home/r$b;->a:Lcom/zykj/student/dialogue/ui/home/r$b;

    .line 59
    .line 60
    invoke-static {p1, v0}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;->r(Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;Lcom/zykj/student/dialogue/ui/home/r;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->b:Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;

    .line 64
    .line 65
    new-instance v0, Lcom/zykj/student/dialogue/ui/home/p$a;

    .line 66
    .line 67
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->c:Ljava/util/List;

    .line 68
    .line 69
    invoke-direct {v0, v1}, Lcom/zykj/student/dialogue/ui/home/p$a;-><init>(Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v0}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;->A(Lcom/zykj/student/dialogue/ui/home/p;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel$moveQuestion$1;->b:Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;

    .line 76
    .line 77
    new-instance v0, Lh6/b$a$b;

    .line 78
    .line 79
    const-string v1, "\u79fb\u52a8\u6210\u529f"

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lh6/b$a$b;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v0}, Lcom/zykj/student/dialogue/base/BaseViewModel;->g(Lh6/b;)V

    .line 85
    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p1
.end method
