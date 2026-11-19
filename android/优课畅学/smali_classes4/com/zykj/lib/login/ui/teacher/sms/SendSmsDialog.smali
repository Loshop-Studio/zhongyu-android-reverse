.class public final Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;
.super Lcom/zykj/lib/login/ui/teacher/sms/Hilt_SendSmsDialog;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/lib/login/ui/teacher/sms/Hilt_SendSmsDialog<",
        "Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public final g:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/login/ui/teacher/sms/Hilt_SendSmsDialog;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Lcom/zykj/lib/login/R$id;->nav_login:I

    .line 5
    .line 6
    new-instance v1, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$hiltNavGraphViewModels$1;

    .line 7
    .line 8
    invoke-direct {v1, p0, v0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$hiltNavGraphViewModels$1;-><init>(Landroidx/fragment/app/Fragment;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$hiltNavGraphViewModels$2;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$hiltNavGraphViewModels$2;-><init>(Lh7/d;)V

    .line 18
    .line 19
    .line 20
    const-class v2, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 21
    .line 22
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$hiltNavGraphViewModels$3;

    .line 27
    .line 28
    invoke-direct {v3, v0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$hiltNavGraphViewModels$3;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$hiltNavGraphViewModels$4;

    .line 32
    .line 33
    invoke-direct {v4, p0, v0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$hiltNavGraphViewModels$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0, v2, v1, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;->f:Lh7/d;

    .line 41
    .line 42
    new-instance v0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$viewModels$default$1;

    .line 43
    .line 44
    invoke-direct {v0, p0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 45
    .line 46
    .line 47
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 48
    .line 49
    new-instance v2, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$viewModels$default$2;

    .line 50
    .line 51
    invoke-direct {v2, v0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-class v1, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

    .line 59
    .line 60
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    new-instance v2, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$viewModels$default$3;

    .line 65
    .line 66
    invoke-direct {v2, v0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 67
    .line 68
    .line 69
    new-instance v3, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$viewModels$default$4;

    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-direct {v3, v4, v0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 73
    .line 74
    .line 75
    new-instance v4, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$viewModels$default$5;

    .line 76
    .line 77
    invoke-direct {v4, p0, v0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;->g:Lh7/d;

    .line 85
    .line 86
    return-void
.end method

.method public static synthetic g(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;->m(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;Landroid/view/View;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;->n(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;Landroid/view/View;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;)Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;->k()Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic j(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;)Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;->l()Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final m(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final n(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;Landroid/view/View;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;->l()Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->k()V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 14
    .line 15
    return-object p0
.end method


# virtual methods
.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;->l()Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->a(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;)V

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
    new-instance v3, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$initView$2;

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-direct {v3, p0, p1}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$initView$2;-><init>(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;Lm7/c;)V

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
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;

    .line 45
    .line 46
    iget-object p1, p1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->d:Landroid/widget/ImageView;

    .line 47
    .line 48
    new-instance p2, Lr3/a;

    .line 49
    .line 50
    invoke-direct {p2, p0}, Lr3/a;-><init>(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;

    .line 61
    .line 62
    iget-object p1, p1, Lcom/zykj/lib/login/databinding/LoginDialogSendSmsBinding;->e:Landroid/widget/TextView;

    .line 63
    .line 64
    const-string p2, "tvConfirm"

    .line 65
    .line 66
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    new-instance p2, Lr3/b;

    .line 70
    .line 71
    invoke-direct {p2, p0}, Lr3/b;-><init>(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1, p2}, Lk4/b;->e(Landroid/view/View;Lx7/l;)V

    .line 75
    .line 76
    .line 77
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 78
    .line 79
    return-object p1
.end method

.method public final k()Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;->f:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final l()Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/lib/login/R$layout;->login_dialog_send_sms:I

    .line 2
    .line 3
    return v0
.end method
