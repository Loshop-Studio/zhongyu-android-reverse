.class public final Lcom/zykj/study/ui/MainActivity;
.super Lcom/zykj/study/ui/Hilt_MainActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/Hilt_MainActivity<",
        "Lcom/zykj/study/databinding/ActivityMainBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public e:Ll8/g;

.field public f:Ll8/g;

.field public final g:Lh7/d;

.field public final h:Lh7/d;

.field public final i:Lh7/d;

.field public final j:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/Hilt_MainActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/study/ui/MainActivity$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/MainActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 10
    .line 11
    const-class v2, Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lcom/zykj/study/ui/MainActivity$special$$inlined$viewModels$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Lcom/zykj/study/ui/MainActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/zykj/study/ui/MainActivity$special$$inlined$viewModels$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Lcom/zykj/study/ui/MainActivity$special$$inlined$viewModels$default$3;-><init>(Lx7/a;Landroidx/activity/ComponentActivity;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Le8/c;Lx7/a;Lx7/a;Lx7/a;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/zykj/study/ui/MainActivity;->g:Lh7/d;

    .line 32
    .line 33
    new-instance v0, Lcom/zykj/study/ui/MainActivity$special$$inlined$viewModels$default$4;

    .line 34
    .line 35
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/MainActivity$special$$inlined$viewModels$default$4;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 39
    .line 40
    const-class v2, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;

    .line 41
    .line 42
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, Lcom/zykj/study/ui/MainActivity$special$$inlined$viewModels$default$5;

    .line 47
    .line 48
    invoke-direct {v3, p0}, Lcom/zykj/study/ui/MainActivity$special$$inlined$viewModels$default$5;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 49
    .line 50
    .line 51
    new-instance v4, Lcom/zykj/study/ui/MainActivity$special$$inlined$viewModels$default$6;

    .line 52
    .line 53
    invoke-direct {v4, v5, p0}, Lcom/zykj/study/ui/MainActivity$special$$inlined$viewModels$default$6;-><init>(Lx7/a;Landroidx/activity/ComponentActivity;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Le8/c;Lx7/a;Lx7/a;Lx7/a;)V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Lcom/zykj/study/ui/MainActivity;->h:Lh7/d;

    .line 60
    .line 61
    new-instance v0, Lu4/e;

    .line 62
    .line 63
    invoke-direct {v0, p0}, Lu4/e;-><init>(Lcom/zykj/study/ui/MainActivity;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, Lcom/zykj/study/ui/MainActivity;->i:Lh7/d;

    .line 71
    .line 72
    new-instance v0, Lu4/f;

    .line 73
    .line 74
    invoke-direct {v0, p0}, Lu4/f;-><init>(Lcom/zykj/study/ui/MainActivity;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p0, Lcom/zykj/study/ui/MainActivity;->j:Lh7/d;

    .line 82
    .line 83
    return-void
.end method

.method public static final synthetic A(Lcom/zykj/study/ui/MainActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/MainActivity;->M()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final B(Lcom/zykj/study/ui/MainActivity;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/ui/MainActivity$deauthorizedDialog$2$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/MainActivity$deauthorizedDialog$2$1;-><init>(Lcom/zykj/study/ui/MainActivity;Lm7/c;)V

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    invoke-static {v1, v0, p0, v1}, Li8/f;->f(Lkotlin/coroutines/d;Lx7/p;ILjava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 13
    .line 14
    return-object p0
.end method

.method private final H()Lcom/zykj/lib/login/ui/main/LoginViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/MainActivity;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final I(Lcom/zykj/study/ui/MainActivity;)Lh7/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "activity"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "null cannot be cast to non-null type android.app.ActivityManager"

    .line 16
    .line 17
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast p0, Landroid/app/ActivityManager;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/app/ActivityManager;->getAppTasks()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Landroid/app/ActivityManager$AppTask;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/app/ActivityManager$AppTask;->finishAndRemoveTask()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 50
    .line 51
    return-object p0
.end method

.method public static final J()Lh7/p;
    .locals 1

    .line 1
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final N(Lcom/zykj/study/ui/MainActivity;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;
    .locals 2

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    sget v1, Lcom/zykj/study/R$string;->hint:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->G(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget v1, Lcom/zykj/lib/error/code/R$string;->net_token_error:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->h(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget v1, Lcom/zykj/study/R$string;->got_it:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->f(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Lu4/g;

    .line 34
    .line 35
    invoke-direct {v1, p0}, Lu4/g;-><init>(Lcom/zykj/study/ui/MainActivity;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->c()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public static final O(Lcom/zykj/study/ui/MainActivity;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/study/ui/MainActivity;->M()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic r(Lcom/zykj/study/ui/MainActivity;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/MainActivity;->B(Lcom/zykj/study/ui/MainActivity;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcom/zykj/study/ui/MainActivity;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/MainActivity;->N(Lcom/zykj/study/ui/MainActivity;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t()Lh7/p;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/study/ui/MainActivity;->J()Lh7/p;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic u(Lcom/zykj/study/ui/MainActivity;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/MainActivity;->I(Lcom/zykj/study/ui/MainActivity;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lcom/zykj/study/ui/MainActivity;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/MainActivity;->O(Lcom/zykj/study/ui/MainActivity;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static final synthetic w(Lcom/zykj/study/ui/MainActivity;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/MainActivity;->C()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic x(Lcom/zykj/study/ui/MainActivity;)Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/MainActivity;->E()Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic y(Lcom/zykj/study/ui/MainActivity;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/MainActivity;->F()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic z(Lcom/zykj/study/ui/MainActivity;)Lcom/zykj/lib/login/ui/main/LoginViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/MainActivity;->H()Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final C()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/MainActivity;->i:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 8
    .line 9
    return-object v0
.end method

.method public final D()Ll8/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/MainActivity;->f:Ll8/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "lessonDeauthorizedFlow"

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

.method public final E()Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/MainActivity;->h:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final F()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/MainActivity;->j:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getValue(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 13
    .line 14
    return-object v0
.end method

.method public final G()Ll8/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/MainActivity;->e:Ll8/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "unauthorizedFlow"

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

.method public final K()V
    .locals 13

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/study/ui/MainActivity$observeAuthFail$1;

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    invoke-direct {v3, p0, v6}, Lcom/zykj/study/ui/MainActivity$observeAuthFail$1;-><init>(Lcom/zykj/study/ui/MainActivity;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    new-instance v10, Lcom/zykj/study/ui/MainActivity$observeAuthFail$2;

    .line 23
    .line 24
    invoke-direct {v10, p0, v6}, Lcom/zykj/study/ui/MainActivity$observeAuthFail$2;-><init>(Lcom/zykj/study/ui/MainActivity;Lm7/c;)V

    .line 25
    .line 26
    .line 27
    const/4 v11, 0x3

    .line 28
    const/4 v12, 0x0

    .line 29
    const/4 v8, 0x0

    .line 30
    const/4 v9, 0x0

    .line 31
    invoke-static/range {v7 .. v12}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final L()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/study/ui/MainActivity$observeLogout$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/study/ui/MainActivity$observeLogout$1;-><init>(Lcom/zykj/study/ui/MainActivity;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final M()V
    .locals 3

    .line 1
    sget v0, Lcom/zykj/study/R$id;->nav_host_fragment:I

    .line 2
    .line 3
    invoke-static {p0, v0}, Landroidx/navigation/ActivityKt;->findNavController(Landroid/app/Activity;I)Landroidx/navigation/NavController;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/navigation/NavController;->getCurrentDestination()Landroidx/navigation/NavDestination;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget v1, Lcom/zykj/study/R$id;->nav_host_fragment:I

    .line 14
    .line 15
    invoke-static {p0, v1}, Landroidx/navigation/ActivityKt;->findNavController(Landroid/app/Activity;I)Landroidx/navigation/NavController;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0}, Landroidx/navigation/NavDestination;->getId()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-virtual {v1, v0, v2}, Landroidx/navigation/NavController;->popBackStack(IZ)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    sget v0, Lcom/zykj/study/R$id;->nav_host_fragment:I

    .line 28
    .line 29
    invoke-static {p0, v0}, Landroidx/navigation/ActivityKt;->findNavController(Landroid/app/Activity;I)Landroidx/navigation/NavController;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget v1, Lcom/zykj/study/R$id;->action_global_mainFragment:I

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroidx/navigation/NavController;->navigate(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/MainActivity;->K()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/study/ui/MainActivity;->L()V

    .line 5
    .line 6
    .line 7
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 8
    .line 9
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p1, Lcom/zykj/message/client/MessageClient;->a:Lcom/zykj/message/client/MessageClient;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/message/client/MessageClient;->g()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    new-instance p1, Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lcom/zykj/policy/ext/PolicyHelper$Builder;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    const-string p2, "https://web.alicdn.zykj.org/privacypolicy/selfStudy/userServiceAgreement.html"

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->g(Ljava/lang/String;)Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "https://web.alicdn.zykj.org/privacypolicy/selfStudy/userPrivacyPolicy.html"

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->f(Ljava/lang/String;)Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p2, Lu4/c;

    .line 27
    .line 28
    invoke-direct {p2, p0}, Lu4/c;-><init>(Lcom/zykj/study/ui/MainActivity;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->d(Lx7/a;)Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance p2, Lu4/d;

    .line 36
    .line 37
    invoke-direct {p2}, Lu4/d;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->e(Lx7/a;)Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->i()V

    .line 45
    .line 46
    .line 47
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 48
    .line 49
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    # RE layout layout/activity_main (0x7f0c001c), APK res/v9.xml
    sget v0, Lcom/zykj/study/R$layout;->activity_main:I

    .line 2
    .line 3
    return v0
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/zykj/study/ui/Hilt_MainActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/study/ui/MainActivity;->F()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/study/ui/MainActivity;->F()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->dismiss()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public onSupportNavigateUp()Z
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$id;->nav_host_fragment:I

    .line 2
    .line 3
    invoke-static {p0, v0}, Landroidx/navigation/ActivityKt;->findNavController(Landroid/app/Activity;I)Landroidx/navigation/NavController;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method
