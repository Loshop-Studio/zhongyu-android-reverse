.class public final Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;
.super Lcom/zykj/lib/login/ui/teacher/Hilt_TeacherLoginFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/lib/login/ui/teacher/Hilt_TeacherLoginFragment<",
        "Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;",
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
    invoke-direct {p0}, Lcom/zykj/lib/login/ui/teacher/Hilt_TeacherLoginFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Lcom/zykj/lib/login/R$id;->nav_login:I

    .line 5
    .line 6
    new-instance v1, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$special$$inlined$hiltNavGraphViewModels$1;

    .line 7
    .line 8
    invoke-direct {v1, p0, v0}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$special$$inlined$hiltNavGraphViewModels$1;-><init>(Landroidx/fragment/app/Fragment;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$special$$inlined$hiltNavGraphViewModels$2;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$special$$inlined$hiltNavGraphViewModels$2;-><init>(Lh7/d;)V

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
    new-instance v3, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$special$$inlined$hiltNavGraphViewModels$3;

    .line 27
    .line 28
    invoke-direct {v3, v0}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$special$$inlined$hiltNavGraphViewModels$3;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$special$$inlined$hiltNavGraphViewModels$4;

    .line 32
    .line 33
    invoke-direct {v4, p0, v0}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$special$$inlined$hiltNavGraphViewModels$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0, v2, v1, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;->f:Lh7/d;

    .line 41
    .line 42
    return-void
.end method

.method public static synthetic g(Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;Landroidx/activity/OnBackPressedCallback;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;->j(Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;Landroidx/activity/OnBackPressedCallback;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;)Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;->i()Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final j(Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;Landroidx/activity/OnBackPressedCallback;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "$this$addCallback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-virtual {p0, p1}, Landroid/app/Activity;->moveTaskToBack(Z)Z

    .line 12
    .line 13
    .line 14
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 15
    .line 16
    return-object p0
.end method


# virtual methods
.method public final i()Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;->f:Lh7/d;

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

.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initData$1;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initData$1;-><init>(Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initData$1;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput v3, v0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initData$1;->c:I

    .line 54
    .line 55
    invoke-super {p0, v0}, Lcom/zykj/base/BaseFragment;->initData(Lm7/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v1, :cond_3

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v3, Lp3/b;

    .line 71
    .line 72
    invoke-direct {v3, p0}, Lp3/b;-><init>(Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;)V

    .line 73
    .line 74
    .line 75
    const/4 v4, 0x2

    .line 76
    const/4 v5, 0x0

    .line 77
    const/4 v2, 0x0

    .line 78
    move-object v1, p0

    .line 79
    invoke-static/range {v0 .. v5}, Landroidx/activity/OnBackPressedDispatcherKt;->addCallback$default(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;ZLx7/l;ILjava/lang/Object;)Landroidx/activity/OnBackPressedCallback;

    .line 80
    .line 81
    .line 82
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 83
    .line 84
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;->i()Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->a(Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Lcom/zykj/message/client/MessageClient;->a:Lcom/zykj/message/client/MessageClient;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/message/client/MessageClient;->g()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const-string p2, "policyCheckView"

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;

    .line 29
    .line 30
    iget-object p1, p1, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->g:Lcom/zykj/policy/ui/PolicyCheckView;

    .line 31
    .line 32
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/16 p2, 0x8

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p1, Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "requireContext(...)"

    .line 48
    .line 49
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, v0}, Lcom/zykj/policy/ext/PolicyHelper$Builder;-><init>(Landroid/content/Context;)V

    .line 53
    .line 54
    .line 55
    const-string v0, "https://web.alicdn.zykj.org/privacypolicy/selfStudy/userServiceAgreement.html"

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->g(Ljava/lang/String;)Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string v0, "https://web.alicdn.zykj.org/privacypolicy/selfStudy/userPrivacyPolicy.html"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->f(Ljava/lang/String;)Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;

    .line 72
    .line 73
    iget-object v0, v0, Lcom/zykj/lib/login/databinding/LoginFragmentLoginTeacherBinding;->g:Lcom/zykj/policy/ui/PolicyCheckView;

    .line 74
    .line 75
    invoke-static {v0, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v0}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->h(Lcom/zykj/policy/ui/PolicyCheckView;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    const-string p2, "getViewLifecycleOwner(...)"

    .line 86
    .line 87
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v3, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initView$2;

    .line 95
    .line 96
    const/4 p1, 0x0

    .line 97
    invoke-direct {v3, p0, p1}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initView$2;-><init>(Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;Lm7/c;)V

    .line 98
    .line 99
    .line 100
    const/4 v4, 0x3

    .line 101
    const/4 v5, 0x0

    .line 102
    const/4 v1, 0x0

    .line 103
    const/4 v2, 0x0

    .line 104
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 105
    .line 106
    .line 107
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 108
    .line 109
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/lib/login/R$layout;->login_fragment_login_teacher:I

    .line 2
    .line 3
    return v0
.end method
