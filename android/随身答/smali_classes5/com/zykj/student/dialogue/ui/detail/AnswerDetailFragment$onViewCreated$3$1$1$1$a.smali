.class public final Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1;->onTransitionStarted(Landroidx/constraintlayout/motion/widget/MotionLayout;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

.field public final synthetic b:Landroid/view/ViewPropertyAnimator;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;Landroid/view/ViewPropertyAnimator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1$a;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1$a;->b:Landroid/view/ViewPropertyAnimator;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    const-string v0, "animation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1$a;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->m(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const-string p1, "binding"

    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    move-object p1, v0

    .line 21
    :cond_0
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->b:Landroid/widget/FrameLayout;

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1$a;->b:Landroid/view/ViewPropertyAnimator;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 30
    .line 31
    .line 32
    return-void
.end method
