.class final Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->E(JLjava/lang/String;)V
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
    c = "com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$updateCategory$2"
    f = "EditCategoryViewModel.kt"
    i = {}
    l = {
        0x3b,
        0x3d
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;JLjava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;->b:Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    iput-wide p2, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;->c:J

    iput-object p4, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;->d:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6

    new-instance v0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;->b:Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    iget-wide v2, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;->c:J

    iget-object v4, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;->d:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;-><init>(Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;JLjava/lang/String;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;->a:I

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
    goto :goto_2

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;->b:Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->m(Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;)Lk6/g;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance v1, Lcom/zykj/student/dialogue/bean/req/UpdateCategoryReq;

    .line 41
    .line 42
    iget-wide v4, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;->c:J

    .line 43
    .line 44
    iget-object v6, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;->d:Ljava/lang/String;

    .line 45
    .line 46
    invoke-direct {v1, v4, v5, v6}, Lcom/zykj/student/dialogue/bean/req/UpdateCategoryReq;-><init>(JLjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iput v3, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;->a:I

    .line 50
    .line 51
    invoke-interface {p1, v1, p0}, Lk6/g;->r(Lcom/zykj/student/dialogue/bean/req/UpdateCategoryReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v0, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    :goto_0
    check-cast p1, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 59
    .line 60
    invoke-static {p1}, Li6/c;->b(Lcom/zykj/student/dialogue/network/BaseResponse;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;->b:Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 64
    .line 65
    invoke-static {p1, v3}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->q(Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;Z)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;->b:Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 69
    .line 70
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->n(Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    new-instance v1, Lcom/zykj/student/dialogue/ui/home/category/a$b;

    .line 75
    .line 76
    invoke-direct {v1, v3}, Lcom/zykj/student/dialogue/ui/home/category/a$b;-><init>(Z)V

    .line 77
    .line 78
    .line 79
    iput v2, p0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$updateCategory$2;->a:I

    .line 80
    .line 81
    invoke-interface {p1, v1, p0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v0, :cond_4

    .line 86
    .line 87
    :goto_1
    return-object v0

    .line 88
    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p1
.end method
