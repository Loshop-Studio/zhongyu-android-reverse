.class public final Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog;
.super Lcom/zykj/lib/login/ui/teacher/pwd/Hilt_ChangePwdDialog;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/lib/login/ui/teacher/pwd/Hilt_ChangePwdDialog<",
        "Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/login/ui/teacher/pwd/Hilt_ChangePwdDialog;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$special$$inlined$viewModels$default$2;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$special$$inlined$viewModels$default$3;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$special$$inlined$viewModels$default$4;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$special$$inlined$viewModels$default$5;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog;->f:Lh7/d;

    .line 47
    .line 48
    return-void
.end method

.method public static final synthetic g(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog;)Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog;->h()Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final h()Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog;->f:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog;->h()Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/lib/login/databinding/LoginDialogChangePwdBinding;->a(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string p2, "getViewLifecycleOwner(...)"

    .line 19
    .line 20
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v3, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2;

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-direct {v3, p0, p1}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2;-><init>(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog;Lm7/c;)V

    .line 31
    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v1, 0x0

    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 38
    .line 39
    .line 40
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 41
    .line 42
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/lib/login/R$layout;->login_dialog_change_pwd:I

    .line 2
    .line 3
    return v0
.end method
