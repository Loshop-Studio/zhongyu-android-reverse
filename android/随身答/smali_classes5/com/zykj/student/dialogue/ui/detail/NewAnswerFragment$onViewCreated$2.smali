.class final Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlin/jvm/functions/Function0<",
        "+",
        "Lkotlin/Unit;",
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "enable",
        "Lkotlin/Function0;"
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
    c = "com.zykj.student.dialogue.ui.detail.NewAnswerFragment$onViewCreated$2"
    f = "NewAnswerFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    invoke-direct {v0, v1, p2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2;-><init>(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/jvm/functions/Function0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2;->a(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 16
    .line 17
    invoke-static {p1, v0}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->D(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Lkotlin/jvm/functions/Function0;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 21
    .line 22
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->A(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)Lcom/zykj/view/board/board/BoardFragment;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 v0, 0x0

    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    const-string p1, "sketchFragment"

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    move-object v1, v0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v1, p1

    .line 37
    :goto_0
    new-instance v4, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2$1;

    .line 38
    .line 39
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 40
    .line 41
    invoke-direct {v4, p1, v0}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Lkotlin/coroutines/Continuation;)V

    .line 42
    .line 43
    .line 44
    new-instance v5, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2$2;

    .line 45
    .line 46
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 47
    .line 48
    invoke-direct {v5, p1, v0}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$2$2;-><init>(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Lkotlin/coroutines/Continuation;)V

    .line 49
    .line 50
    .line 51
    const/4 v6, 0x2

    .line 52
    const/4 v7, 0x0

    .line 53
    const/4 v2, 0x0

    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-static/range {v1 .. v7}, Lcom/zykj/view/board/board/BoardFragment;->v0(Lcom/zykj/view/board/board/BoardFragment;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1
.end method
