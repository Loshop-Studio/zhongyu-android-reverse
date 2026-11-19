.class public final Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/listener/WithdrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initPageControl()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "com/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$2",
        "Lcom/zykj/blackboard/listener/WithdrawListener;",
        "",
        "canWithdraw",
        "canRecover",
        "Ld6/s;",
        "onWithdraw",
        "(ZZ)V",
        "view_release"
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
.field final synthetic this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$2;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;ZZ)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$2;->onWithdraw$lambda$0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;ZZ)V

    return-void
.end method

.method private static final onWithdraw$lambda$0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;ZZ)V
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->access$getMBinding$p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivWithdraw:Landroid/widget/ImageView;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->access$getMBinding$p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->ivRecover:Landroid/widget/ImageView;

    .line 22
    .line 23
    invoke-virtual {p0, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v1

    .line 31
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v1
.end method


# virtual methods
.method public onWithdraw(ZZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$2;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

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
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initPageControl$2;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/view/board/evaluation/g;

    .line 12
    .line 13
    invoke-direct {v2, v1, p1, p2}, Lcom/zykj/view/board/evaluation/g;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;ZZ)V

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
