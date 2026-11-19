.class public final Lcom/zykj/view/board/simple/SimpleFragment$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/simple/SimpleFragment;->Z(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/simple/SimpleFragment;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/simple/SimpleFragment;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$b;->a:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/view/board/simple/SimpleFragment$b;->b:Z

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$b;->a:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->A(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const-string p1, "mBinding"

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->k:Landroidx/appcompat/widget/AppCompatImageView;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$b;->a:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 22
    .line 23
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->B(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-boolean v0, p0, Lcom/zykj/view/board/simple/SimpleFragment$b;->b:Z

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lcom/zykj/view/board/simple/SimpleViewModel;->l(Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
