.class final Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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
    c = "com.zykj.student.dialogue.ui.ask.AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1"
    f = "AskQuestionDialogFragment.kt"
    i = {}
    l = {
        0x5a
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAskQuestionDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AskQuestionDialogFragment.kt\ncom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;ZLkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;->b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

    iput-boolean p2, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;->c:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;->c(Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;->r(Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;Landroid/net/Uri;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;->b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

    iget-boolean v1, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;->c:Z

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;-><init>(Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;ZLkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;->a:I

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
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;->b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;->o(Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;)Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-boolean v1, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;->c:Z

    .line 34
    .line 35
    iput v2, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;->a:I

    .line 36
    .line 37
    invoke-virtual {p1, v1, p0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->P(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    :goto_0
    iget-boolean p1, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;->c:Z

    .line 45
    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;->b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;->q(Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;)Lu6/b;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 55
    .line 56
    .line 57
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_3
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;->b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

    .line 61
    .line 62
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;->p(Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;)Lm7/n;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1;->b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;

    .line 67
    .line 68
    new-instance v3, Lcom/zykj/student/dialogue/ui/ask/a;

    .line 69
    .line 70
    invoke-direct {v3, p1}, Lcom/zykj/student/dialogue/ui/ask/a;-><init>(Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;)V

    .line 71
    .line 72
    .line 73
    const/4 v4, 0x1

    .line 74
    const/4 v5, 0x0

    .line 75
    const/4 v1, 0x0

    .line 76
    const/4 v2, 0x1

    .line 77
    invoke-static/range {v0 .. v5}, Lm7/n;->y(Lm7/n;Landroid/net/Uri;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p1
.end method
