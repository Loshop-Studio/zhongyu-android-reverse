.class final Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/zykj/student/dialogue/ui/home/b;",
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/home/b;",
        "it",
        "",
        "<anonymous>",
        "(Lcom/zykj/student/dialogue/ui/home/b;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$13$1"
    f = "HomeFragment.kt"
    i = {
        0x0
    }
    l = {
        0x12c
    }
    m = "invokeSuspend"
    n = {
        "it"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/student/dialogue/ui/home/HomeFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomeFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;->c:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/student/dialogue/ui/home/HomeFragment;Lcom/zykj/student/dialogue/ui/home/b;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;->g(Lcom/zykj/student/dialogue/ui/home/HomeFragment;Lcom/zykj/student/dialogue/ui/home/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lcom/zykj/student/dialogue/ui/home/HomeFragment;Lcom/zykj/student/dialogue/ui/home/b;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/student/dialogue/ui/home/HomeFragment;->N(Lcom/zykj/student/dialogue/ui/home/HomeFragment;)Lu6/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p1, Lcom/zykj/student/dialogue/ui/home/b$a;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/home/b$a;->a()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0, p1}, Lu6/d;->c(Z)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    .line 16
    return-object p0
.end method


# virtual methods
.method public final c(Lcom/zykj/student/dialogue/ui/home/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;->c:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    invoke-direct {v0, v1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeFragment;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/b;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;->c(Lcom/zykj/student/dialogue/ui/home/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/student/dialogue/ui/home/b;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;->a:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

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
    instance-of p1, v0, Lcom/zykj/student/dialogue/ui/home/b$a;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;->c:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    .line 36
    .line 37
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/home/HomeFragment;->M(Lcom/zykj/student/dialogue/ui/home/HomeFragment;)Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    move-object v2, v0

    .line 42
    check-cast v2, Lcom/zykj/student/dialogue/ui/home/b$a;

    .line 43
    .line 44
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/ui/home/b$a;->a()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    iget-object v4, p0, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;->c:Lcom/zykj/student/dialogue/ui/home/HomeFragment;

    .line 49
    .line 50
    new-instance v5, Lcom/zykj/student/dialogue/ui/home/g;

    .line 51
    .line 52
    invoke-direct {v5, v4, v0}, Lcom/zykj/student/dialogue/ui/home/g;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeFragment;Lcom/zykj/student/dialogue/ui/home/b;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;->b:Ljava/lang/Object;

    .line 60
    .line 61
    iput v3, p0, Lcom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$13$1;->a:I

    .line 62
    .line 63
    invoke-virtual {p1, v2, v5, p0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->G(ZLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v1, :cond_2

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p1
.end method
