.class public final Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc5/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->O0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$f;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic b(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;ZZ)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$f;->c(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;ZZ)V

    return-void
.end method

.method public static final c(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;ZZ)V
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->K(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "mBinding"

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    move-object v0, v1

    .line 14
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->r:Landroid/widget/ImageView;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->K(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v1, p0

    .line 30
    :goto_0
    iget-object p0, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->n:Landroid/widget/ImageView;

    .line 31
    .line 32
    invoke-virtual {p0, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 33
    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public a(ZZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$f;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$f;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 10
    .line 11
    new-instance v2, Ls7/g0;

    .line 12
    .line 13
    invoke-direct {v2, v1, p1, p2}, Ls7/g0;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;ZZ)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
