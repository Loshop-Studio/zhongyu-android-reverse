.class public abstract Lcom/friday/common/base/BaseActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"

# interfaces
.implements Lcom/friday/common/base/IView;
.implements Lcom/friday/common/base/c;
.implements Lcom/friday/common/base/b;
.implements Lsd/i0;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Binding:",
        "Landroidx/databinding/ViewDataBinding;",
        ">",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "Lcom/friday/common/base/IView;",
        "Lcom/friday/common/base/c;",
        "Lcom/friday/common/base/b;",
        "Lsd/i0;"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final synthetic $$delegate_0:Lsd/i0;

.field private isLoadingNow:Z

.field private loading:Lcom/friday/common/widget/dialog/BaseDialog;

.field protected mBinding:Landroidx/databinding/ViewDataBinding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TBinding;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lkotlinx/coroutines/d;->b()Lsd/i0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/friday/common/base/BaseActivity;->$$delegate_0:Lsd/i0;

    .line 9
    .line 10
    return-void
.end method

.method public static final synthetic access$hideLoading(Lcom/friday/common/base/BaseActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->J()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$showLoading(Lcom/friday/common/base/BaseActivity;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseActivity;->K(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final J()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/base/BaseActivity;->loading:Lcom/friday/common/widget/dialog/BaseDialog;

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
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/friday/common/base/BaseActivity;->isLoadingNow:Z

    .line 10
    .line 11
    return-void
.end method

.method public final K(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/common/base/BaseActivity;->loading:Lcom/friday/common/widget/dialog/BaseDialog;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/friday/common/widget/dialog/a;->a:Lcom/friday/common/widget/dialog/a;

    .line 6
    .line 7
    sget v1, Lcom/friday/common/R$string;->waiting_please:I

    .line 8
    .line 9
    invoke-static {v1}, Lz1/b;->f(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, p1, v1}, Lcom/friday/common/widget/dialog/a;->J(ZLjava/lang/String;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/friday/common/base/BaseActivity;->loading:Lcom/friday/common/widget/dialog/BaseDialog;

    .line 18
    .line 19
    :cond_0
    iget-boolean p1, p0, Lcom/friday/common/base/BaseActivity;->isLoadingNow:Z

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget-object p1, p0, Lcom/friday/common/base/BaseActivity;->loading:Lcom/friday/common/widget/dialog/BaseDialog;

    .line 25
    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "getSupportFragmentManager(...)"

    .line 33
    .line 34
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, "progress_dialog_base_activity"

    .line 38
    .line 39
    invoke-virtual {p1, v0, v1}, Lcom/friday/common/widget/dialog/BaseDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    const/4 p1, 0x1

    .line 43
    iput-boolean p1, p0, Lcom/friday/common/base/BaseActivity;->isLoadingNow:Z

    .line 44
    .line 45
    return-void
.end method

.method public getCoroutineContext()Lkotlin/coroutines/d;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/base/BaseActivity;->$$delegate_0:Lsd/i0;

    invoke-interface {v0}, Lsd/i0;->getCoroutineContext()Lkotlin/coroutines/d;

    move-result-object v0

    return-object v0
.end method

.method public final getMBinding()Landroidx/databinding/ViewDataBinding;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBinding;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/friday/common/base/BaseActivity;->mBinding:Landroidx/databinding/ViewDataBinding;

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

.method public initDataSource()V
    .locals 0

    return-void
.end method

.method public initView()V
    .locals 0

    return-void
.end method

.method public isShowLoading(Z)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/common/base/BaseActivity$isShowLoading$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, v2}, Lcom/friday/common/base/BaseActivity$isShowLoading$1;-><init>(ZLcom/friday/common/base/BaseActivity;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lhd/p;)Lkotlinx/coroutines/g;

    .line 12
    .line 13
    .line 14
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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v1, "Current Activity: "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-string v0, "\u5f53\u524d\u7684ActivityLifecycle"

    .line 30
    .line 31
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p0}, Lcom/friday/common/base/c;->getLayoutId()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-static {p0, p1}, Landroidx/databinding/DataBindingUtil;->setContentView(Landroid/app/Activity;I)Landroidx/databinding/ViewDataBinding;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v0, "setContentView(...)"

    .line 47
    .line 48
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseActivity;->setMBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1, p0}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0}, Lcom/gyf/immersionbar/ImmersionBar;->with(Landroid/app/Activity;)Lcom/gyf/immersionbar/ImmersionBar;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const-string v0, "this"

    .line 66
    .line 67
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 v0, 0x1

    .line 71
    invoke-virtual {p1, v0}, Lcom/gyf/immersionbar/ImmersionBar;->statusBarDarkFont(Z)Lcom/gyf/immersionbar/ImmersionBar;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/gyf/immersionbar/ImmersionBar;->init()V

    .line 75
    .line 76
    .line 77
    invoke-interface {p0}, Lcom/friday/common/base/c;->initData()V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, v0, v1, v0}, Lkotlinx/coroutines/d;->d(Lsd/i0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onPause()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    .line 2
    .line 3
    .line 4
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
    iput-object p1, p0, Lcom/friday/common/base/BaseActivity;->mBinding:Landroidx/databinding/ViewDataBinding;

    .line 7
    .line 8
    return-void
.end method
