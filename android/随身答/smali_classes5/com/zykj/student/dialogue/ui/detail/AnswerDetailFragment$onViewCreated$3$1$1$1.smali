.class public final Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J*\u0010\t\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\u000c\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J*\u0010\r\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "com/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1",
        "Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionListener;",
        "onTransitionStarted",
        "",
        "p0",
        "Landroidx/constraintlayout/motion/widget/MotionLayout;",
        "p1",
        "",
        "p2",
        "onTransitionChange",
        "p3",
        "",
        "onTransitionCompleted",
        "onTransitionTrigger",
        "",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onTransitionChange(Landroidx/constraintlayout/motion/widget/MotionLayout;IIF)V
    .locals 0

    return-void
.end method

.method public onTransitionCompleted(Landroidx/constraintlayout/motion/widget/MotionLayout;I)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->o(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->K()Lkotlinx/coroutines/flow/StateFlow;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lp6/k;

    .line 16
    .line 17
    invoke-virtual {p1}, Lp6/k;->s()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->o(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance p2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$a;

    .line 30
    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    invoke-direct {p2, v0, v1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$a;-><init>(J)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->w(Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    .line 43
    .line 44
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->o(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance p2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$b;

    .line 49
    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    invoke-direct {p2, v0, v1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$b;-><init>(J)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->w(Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    .line 61
    .line 62
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->m(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const/4 p2, 0x0

    .line 67
    const-string v0, "binding"

    .line 68
    .line 69
    if-nez p1, :cond_1

    .line 70
    .line 71
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    move-object p1, p2

    .line 75
    :cond_1
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->h:Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-virtual {p1, v1}, Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;->setIntercepted(Z)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    .line 82
    .line 83
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->m(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-nez p1, :cond_2

    .line 88
    .line 89
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    move-object p2, p1

    .line 94
    :goto_1
    iget-object p1, p2, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->h:Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;

    .line 95
    .line 96
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->removeTransitionListener(Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionListener;)Z

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public onTransitionStarted(Landroidx/constraintlayout/motion/widget/MotionLayout;II)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->m(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x0

    .line 8
    const-string p3, "binding"

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    move-object p1, p2

    .line 16
    :cond_0
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->h:Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p1, v0}, Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;->setIntercepted(Z)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->m(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object p2, p1

    .line 35
    :goto_0
    iget-object p1, p2, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->b:Landroid/widget/FrameLayout;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    .line 42
    .line 43
    const/4 p3, 0x0

    .line 44
    invoke-virtual {p1, p3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    const-wide/16 v0, 0x12c

    .line 49
    .line 50
    invoke-virtual {p3, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1$a;

    .line 55
    .line 56
    invoke-direct {v0, p2, p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1$a;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;Landroid/view/ViewPropertyAnimator;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public onTransitionTrigger(Landroidx/constraintlayout/motion/widget/MotionLayout;IZF)V
    .locals 0

    return-void
.end method
