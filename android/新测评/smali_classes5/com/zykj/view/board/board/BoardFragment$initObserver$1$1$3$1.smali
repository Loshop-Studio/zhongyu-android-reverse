.class final Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lq7/c2;",
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
        "Lq7/c2;",
        "state",
        "",
        "<anonymous>",
        "(Lq7/c2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$3$1"
    f = "BoardFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->c:Lcom/zykj/view/board/board/BoardFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lq7/c2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;

    .line 6
    .line 7
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;

    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->c:Lcom/zykj/view/board/board/BoardFragment;

    invoke-direct {v0, v1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq7/c2;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->a(Lq7/c2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq7/c2;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->c:Lcom/zykj/view/board/board/BoardFragment;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->g0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    const-string p1, "mBinding"

    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->k:Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;

    .line 30
    .line 31
    iget-object v1, p1, Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 32
    .line 33
    invoke-virtual {v0}, Lq7/c2;->e()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p1, Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 41
    .line 42
    invoke-virtual {v0}, Lq7/c2;->c()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p1, Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 50
    .line 51
    invoke-virtual {v0}, Lq7/c2;->d()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p1, Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;->e:Landroidx/appcompat/widget/AppCompatImageView;

    .line 59
    .line 60
    invoke-virtual {v0}, Lq7/c2;->f()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;->a:Landroidx/appcompat/widget/AppCompatImageView;

    .line 68
    .line 69
    invoke-virtual {v0}, Lq7/c2;->b()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 74
    .line 75
    .line 76
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1
.end method
