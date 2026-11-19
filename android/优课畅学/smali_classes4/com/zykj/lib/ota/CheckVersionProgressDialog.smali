.class public final Lcom/zykj/lib/ota/CheckVersionProgressDialog;
.super Lcom/zykj/lib/ota/Hilt_CheckVersionProgressDialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/lib/ota/Hilt_CheckVersionProgressDialog<",
        "Lcom/zykj/lib/ota/databinding/DialogCheckVersionProgressBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

.field public final g:Lh7/d;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/ota/Hilt_CheckVersionProgressDialog;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/lib/ota/CheckVersionProgressDialog$b;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog$b;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialog;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    new-instance v0, Lcom/zykj/lib/ota/CheckVersionProgressDialog$special$$inlined$viewModels$default$1;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 28
    .line 29
    new-instance v2, Lcom/zykj/lib/ota/CheckVersionProgressDialog$special$$inlined$viewModels$default$2;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-class v1, Lcom/zykj/lib/ota/viewmodel/VersionViewModel;

    .line 39
    .line 40
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v2, Lcom/zykj/lib/ota/CheckVersionProgressDialog$special$$inlined$viewModels$default$3;

    .line 45
    .line 46
    invoke-direct {v2, v0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Lcom/zykj/lib/ota/CheckVersionProgressDialog$special$$inlined$viewModels$default$4;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-direct {v3, v4, v0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 53
    .line 54
    .line 55
    new-instance v4, Lcom/zykj/lib/ota/CheckVersionProgressDialog$special$$inlined$viewModels$default$5;

    .line 56
    .line 57
    invoke-direct {v4, p0, v0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialog;->g:Lh7/d;

    .line 65
    .line 66
    return-void
.end method

.method public static synthetic g(Lcom/zykj/lib/ota/CheckVersionProgressDialog;Lcom/zykj/base/bean/toast/ToastMessage;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/lib/ota/CheckVersionProgressDialog;->l(Lcom/zykj/lib/ota/CheckVersionProgressDialog;Lcom/zykj/base/bean/toast/ToastMessage;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/lib/ota/CheckVersionProgressDialog;Lcom/zykj/lib/ota/bean/VersionInfo;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/lib/ota/CheckVersionProgressDialog;->k(Lcom/zykj/lib/ota/CheckVersionProgressDialog;Lcom/zykj/lib/ota/bean/VersionInfo;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lcom/zykj/lib/ota/CheckVersionProgressDialog;Lcom/zykj/lib/ota/bean/VersionInfo;)Lh7/p;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 8
    .line 9
    .line 10
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/lib/ota/bean/VersionInfo;->getVersionCode()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog;->i()Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->d()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-le v0, v1, :cond_1

    .line 26
    .line 27
    sget-object v0, Lcom/zykj/lib/ota/a;->a:Lcom/zykj/lib/ota/a$c;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lcom/zykj/lib/ota/a$c;->b(Lcom/zykj/lib/ota/bean/VersionInfo;)Landroidx/navigation/NavDirections;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog;->i()Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->c()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 56
    .line 57
    .line 58
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_2
    sget-object p1, Lcom/zykj/lib/ota/a;->a:Lcom/zykj/lib/ota/a$c;

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog;->i()Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->e()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p1, v0}, Lcom/zykj/lib/ota/a$c;->a(Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 83
    .line 84
    return-object p0
.end method

.method public static final l(Lcom/zykj/lib/ota/CheckVersionProgressDialog;Lcom/zykj/base/bean/toast/ToastMessage;)Lh7/p;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/base/bean/toast/ToastErrorMessage;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    instance-of v0, p1, Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/base/bean/toast/ToastMessage;->getMessageResId()Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    sget-object v0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/zykj/base/utils/XToastUtils;->error(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->dismiss()V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/base/bean/toast/ToastMessage;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    sget-object v0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lcom/zykj/base/utils/XToastUtils;->error(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->dismiss()V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_2
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 48
    .line 49
    return-object p0
.end method


# virtual methods
.method public final i()Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialog;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/lib/ota/databinding/DialogCheckVersionProgressBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog;->i()Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2}, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->c()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-virtual {p1, p2}, Lcom/zykj/lib/ota/databinding/DialogCheckVersionProgressBinding;->a(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog;->j()Lcom/zykj/lib/ota/viewmodel/VersionViewModel;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog;->i()Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p2}, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->b()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog;->i()Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->d()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog;->i()Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->a()Lcom/zykj/lib/ota/bean/AppType;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p1, p2, v0, v1}, Lcom/zykj/lib/ota/viewmodel/VersionViewModel;->g(Ljava/lang/String;ILcom/zykj/lib/ota/bean/AppType;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog;->j()Lcom/zykj/lib/ota/viewmodel/VersionViewModel;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Lcom/zykj/lib/ota/viewmodel/VersionViewModel;->i()Landroidx/lifecycle/MutableLiveData;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    new-instance v0, Ls3/b;

    .line 62
    .line 63
    invoke-direct {v0, p0}, Ls3/b;-><init>(Lcom/zykj/lib/ota/CheckVersionProgressDialog;)V

    .line 64
    .line 65
    .line 66
    new-instance v1, Lcom/zykj/lib/ota/CheckVersionProgressDialog$a;

    .line 67
    .line 68
    invoke-direct {v1, v0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog$a;-><init>(Lx7/l;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog;->j()Lcom/zykj/lib/ota/viewmodel/VersionViewModel;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    new-instance v0, Ls3/c;

    .line 87
    .line 88
    invoke-direct {v0, p0}, Ls3/c;-><init>(Lcom/zykj/lib/ota/CheckVersionProgressDialog;)V

    .line 89
    .line 90
    .line 91
    new-instance v1, Lcom/zykj/lib/ota/CheckVersionProgressDialog$a;

    .line 92
    .line 93
    invoke-direct {v1, v0}, Lcom/zykj/lib/ota/CheckVersionProgressDialog$a;-><init>(Lx7/l;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2, v1}, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 97
    .line 98
    .line 99
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 100
    .line 101
    return-object p1
.end method

.method public final j()Lcom/zykj/lib/ota/viewmodel/VersionViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialog;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/lib/ota/viewmodel/VersionViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/lib/ota/R$layout;->dialog_check_version_progress:I

    .line 2
    .line 3
    return v0
.end method
