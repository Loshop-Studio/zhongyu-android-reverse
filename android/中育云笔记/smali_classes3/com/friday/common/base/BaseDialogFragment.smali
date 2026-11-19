.class public abstract Lcom/friday/common/base/BaseDialogFragment;
.super Landroidx/appcompat/app/AppCompatDialogFragment;
.source "SourceFile"

# interfaces
.implements Lcom/friday/common/base/c;
.implements Lcom/friday/common/base/IView;
.implements Lcom/friday/common/base/b;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Binding:",
        "Landroidx/databinding/ViewDataBinding;",
        ">",
        "Landroidx/appcompat/app/AppCompatDialogFragment;",
        "Lcom/friday/common/base/c;",
        "Lcom/friday/common/base/IView;",
        "Lcom/friday/common/base/b;"
    }
.end annotation


# instance fields
.field public d:Landroidx/databinding/ViewDataBinding;

.field public e:Lcom/friday/common/widget/dialog/BaseDialog;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatDialogFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final o()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/base/BaseDialogFragment;->e:Lcom/friday/common/widget/dialog/BaseDialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private final p(Z)V
    .locals 2

    .line 1
    sget-object v0, Lf2/c;->a:Lf2/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf2/c;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/friday/common/base/BaseDialogFragment;->e:Lcom/friday/common/widget/dialog/BaseDialog;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    sget-object v0, Lcom/friday/common/widget/dialog/a;->a:Lcom/friday/common/widget/dialog/a;

    .line 15
    .line 16
    sget v1, Lcom/friday/common/R$string;->waiting_please:I

    .line 17
    .line 18
    invoke-static {v1}, Lz1/b;->f(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, p1, v1}, Lcom/friday/common/widget/dialog/a;->J(ZLjava/lang/String;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lcom/friday/common/base/BaseDialogFragment;->e:Lcom/friday/common/widget/dialog/BaseDialog;

    .line 27
    .line 28
    :cond_1
    iget-object p1, p0, Lcom/friday/common/base/BaseDialogFragment;->e:Lcom/friday/common/widget/dialog/BaseDialog;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "getSupportFragmentManager(...)"

    .line 41
    .line 42
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v1, "progress_dialog_base_fragment"

    .line 46
    .line 47
    invoke-virtual {p1, v0, v1}, Lcom/friday/common/widget/dialog/BaseDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public final getMBinding()Landroidx/databinding/ViewDataBinding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/base/BaseDialogFragment;->d:Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "mBinding"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public isShowLoading(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lcom/friday/common/base/BaseDialogFragment;->p(Z)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0}, Lcom/friday/common/base/BaseDialogFragment;->o()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lcom/friday/common/base/c;->initData()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/friday/common/base/b;->onClick(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lcom/friday/common/base/c;->getLayoutId()I

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {p1, p3, p2, v0}, Landroidx/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/ViewDataBinding;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string p2, "inflate(...)"

    .line 16
    .line 17
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseDialogFragment;->setMBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1, p0}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public final varargs setClickListener([Landroid/view/View;)V
    .locals 3

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_0

    .line 9
    .line 10
    aget-object v2, p1, v1

    .line 11
    .line 12
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void
.end method

.method public final setMBinding(Landroidx/databinding/ViewDataBinding;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/common/base/BaseDialogFragment;->d:Landroidx/databinding/ViewDataBinding;

    .line 7
    .line 8
    return-void
.end method

.method public show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "manager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
