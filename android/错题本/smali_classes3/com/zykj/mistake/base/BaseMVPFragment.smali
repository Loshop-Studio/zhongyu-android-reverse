.class public abstract Lcom/zykj/mistake/base/BaseMVPFragment;
.super Lcom/zykj/mistake/base/BaseFragment;
.source "SourceFile"

# interfaces
.implements Li4/b;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P::",
        "Lcom/zykj/mistake/base/BasePresenter;",
        "T:",
        "Landroidx/databinding/ViewDataBinding;",
        ">",
        "Lcom/zykj/mistake/base/BaseFragment<",
        "TT;>;",
        "Li4/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\'\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0008\u0008\u0001\u0010\u0004*\u00020\u00032\u0008\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u0006B\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/zykj/mistake/base/BaseMVPFragment;",
        "Lcom/zykj/mistake/base/BasePresenter;",
        "P",
        "Landroidx/databinding/ViewDataBinding;",
        "T",
        "Lcom/zykj/mistake/base/BaseFragment;",
        "Li4/b;",
        "<init>",
        "()V",
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
.field public b:Lcom/zykj/mistake/base/BasePresenter;

.field public c:Landroid/app/ProgressDialog;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/mistake/base/BaseFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/base/BaseMVPFragment;->c:Landroid/app/ProgressDialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final d(Z)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/zykj/mistake/base/BaseMVPFragment;->c:Landroid/app/ProgressDialog;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "\u8bf7\u7a0d\u5019\u3002\u3002"

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const-string v2, ""

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-static {p1, v2, v0, v1, v3}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/zykj/mistake/base/BaseMVPFragment;->c:Landroid/app/ProgressDialog;

    .line 23
    .line 24
    return-void
.end method

.method public final h()Lcom/zykj/mistake/base/BasePresenter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/base/BaseMVPFragment;->b:Lcom/zykj/mistake/base/BasePresenter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "mPresenter"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public abstract i()Ljava/lang/Class;
.end method

.method public abstract j()V
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    const-string v0, "inflater"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lcom/zykj/mistake/base/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPFragment;->i()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-virtual {p2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const-string p3, "newInstance(...)"

    .line 19
    .line 20
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    check-cast p2, Lcom/zykj/mistake/base/BasePresenter;

    .line 24
    .line 25
    iput-object p2, p0, Lcom/zykj/mistake/base/BaseMVPFragment;->b:Lcom/zykj/mistake/base/BasePresenter;

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPFragment;->h()Lcom/zykj/mistake/base/BasePresenter;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    iput-object p0, p2, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPFragment;->j()V

    .line 34
    .line 35
    .line 36
    return-object p1
.end method

.method public onDestroy()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPFragment;->h()Lcom/zykj/mistake/base/BasePresenter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-interface {v1}, Li4/b;->c()V

    .line 13
    .line 14
    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    iput-object v1, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v2, v0, Lcom/zykj/mistake/base/BasePresenter;->b:Ls5/a;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2}, Ls5/a;->dispose()V

    .line 23
    .line 24
    .line 25
    :cond_1
    iput-object v1, v0, Lcom/zykj/mistake/base/BasePresenter;->b:Ls5/a;

    .line 26
    .line 27
    return-void
.end method
