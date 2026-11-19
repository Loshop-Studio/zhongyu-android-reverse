.class public abstract Lcom/friday/common/base/BaseFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"

# interfaces
.implements Lcom/friday/common/base/IView;
.implements Lcom/friday/common/base/c;
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
        "Landroidx/fragment/app/Fragment;",
        "Lcom/friday/common/base/IView;",
        "Lcom/friday/common/base/c;",
        "Lcom/friday/common/base/b;"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private isLoadingNow:Z

.field private loading:Lcom/friday/common/widget/dialog/BaseDialog;

.field protected mBinding:Landroidx/databinding/ViewDataBinding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TBinding;"
        }
    .end annotation
.end field

.field protected mContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final o()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "requireActivity(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    instance-of v1, v0, Lcom/friday/common/base/BaseActivity;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Lcom/friday/common/base/BaseActivity;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    :try_start_0
    iput-boolean v2, p0, Lcom/friday/common/base/BaseFragment;->isLoadingNow:Z

    .line 22
    .line 23
    iget-object v0, p0, Lcom/friday/common/base/BaseFragment;->loading:Lcom/friday/common/widget/dialog/BaseDialog;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    :cond_1
    return-void

    .line 33
    :catch_0
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 34
    .line 35
    return-void
.end method

.method private final p(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "requireActivity(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    instance-of v1, v0, Lcom/friday/common/base/BaseActivity;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Lcom/friday/common/base/BaseActivity;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/friday/common/base/BaseFragment;->loading:Lcom/friday/common/widget/dialog/BaseDialog;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    sget-object v0, Lcom/friday/common/widget/dialog/a;->a:Lcom/friday/common/widget/dialog/a;

    .line 26
    .line 27
    sget v1, Lcom/friday/common/R$string;->waiting_please:I

    .line 28
    .line 29
    invoke-static {v1}, Lz1/b;->f(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, p1, v1}, Lcom/friday/common/widget/dialog/a;->J(ZLjava/lang/String;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lcom/friday/common/base/BaseFragment;->loading:Lcom/friday/common/widget/dialog/BaseDialog;

    .line 38
    .line 39
    :cond_1
    iget-boolean p1, p0, Lcom/friday/common/base/BaseFragment;->isLoadingNow:Z

    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    iget-object p1, p0, Lcom/friday/common/base/BaseFragment;->loading:Lcom/friday/common/widget/dialog/BaseDialog;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v1, "getSupportFragmentManager(...)"

    .line 57
    .line 58
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v1, "progress_dialog_base_fragment"

    .line 62
    .line 63
    invoke-virtual {p1, v0, v1}, Lcom/friday/common/widget/dialog/BaseDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    iput-boolean v2, p0, Lcom/friday/common/base/BaseFragment;->isLoadingNow:Z

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final getMBinding()Landroidx/databinding/ViewDataBinding;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBinding;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/friday/common/base/BaseFragment;->mBinding:Landroidx/databinding/ViewDataBinding;

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

.method public final getMContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/base/BaseFragment;->mContext:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "mContext"

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

.method public final hideLoadingOffline()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/base/BaseFragment;->loading:Lcom/friday/common/widget/dialog/BaseDialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public initDataSource()V
    .locals 0

    return-void
.end method

.method public initView()V
    .locals 0

    return-void
.end method

.method public isShowLoading(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lcom/friday/common/base/BaseFragment;->p(Z)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0}, Lcom/friday/common/base/BaseFragment;->o()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public needHideLoadingOnDestroy()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->setMContext(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Lcom/friday/common/base/c;->initData()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    .line 18
    .line 19
    const-string v0, "activity is null"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1
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
    .locals 2

    .line 1
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v1, " "

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    const-string v0, "\u5f53\u524d\u7684Fragment:"

    .line 32
    .line 33
    filled-new-array {v0, p3}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    invoke-static {p3}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p0}, Lcom/friday/common/base/c;->getLayoutId()I

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    const/4 v0, 0x0

    .line 45
    invoke-static {p1, p3, p2, v0}, Landroidx/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/ViewDataBinding;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string p2, "inflate(...)"

    .line 50
    .line 51
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->setMBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1, p0}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->needHideLoadingOnDestroy()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/friday/common/base/BaseFragment;->o()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 11
    .line 12
    .line 13
    return-void
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
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TBinding;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/common/base/BaseFragment;->mBinding:Landroidx/databinding/ViewDataBinding;

    .line 7
    .line 8
    return-void
.end method

.method public final setMContext(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/common/base/BaseFragment;->mContext:Landroid/content/Context;

    .line 7
    .line 8
    return-void
.end method
