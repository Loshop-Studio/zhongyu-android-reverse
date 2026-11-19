.class public final Lcom/zykj/lib/login/ui/student/StudentLoginFragment;
.super Lcom/zykj/lib/login/ui/student/Hilt_StudentLoginFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/lib/login/ui/student/StudentLoginFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/lib/login/ui/student/Hilt_StudentLoginFragment<",
        "Lcom/zykj/lib/login/databinding/LoginFragmentLoginStudentBinding;",
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
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/lib/login/ui/student/Hilt_StudentLoginFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment;->f:Lh7/d;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic g(Lcom/zykj/lib/login/ui/student/StudentLoginFragment;Lcom/zykj/message/server/bean/ServerInfo;Lcom/zykj/message/server/bean/UserInfo;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/lib/login/ui/student/StudentLoginFragment;->l(Lcom/zykj/lib/login/ui/student/StudentLoginFragment;Lcom/zykj/message/server/bean/ServerInfo;Lcom/zykj/message/server/bean/UserInfo;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/lib/login/ui/student/StudentLoginFragment;Lcom/zykj/message/server/bean/ServerInfo;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/lib/login/ui/student/StudentLoginFragment;->m(Lcom/zykj/lib/login/ui/student/StudentLoginFragment;Lcom/zykj/message/server/bean/ServerInfo;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lcom/zykj/lib/login/ui/student/StudentLoginFragment;)Lcom/zykj/lib/login/ui/main/LoginViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/lib/login/ui/student/StudentLoginFragment;->j()Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final l(Lcom/zykj/lib/login/ui/student/StudentLoginFragment;Lcom/zykj/message/server/bean/ServerInfo;Lcom/zykj/message/server/bean/UserInfo;)Lh7/p;
    .locals 8

    .line 1
    const-string v0, "userInfo"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "getViewLifecycleOwner(...)"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    new-instance v5, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {v5, p0, p2, p1, v0}, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;-><init>(Lcom/zykj/lib/login/ui/student/StudentLoginFragment;Lcom/zykj/message/server/bean/UserInfo;Lcom/zykj/message/server/bean/ServerInfo;Lm7/c;)V

    .line 27
    .line 28
    .line 29
    const/4 v6, 0x2

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 33
    .line 34
    .line 35
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 36
    .line 37
    return-object p0
.end method

.method public static final m(Lcom/zykj/lib/login/ui/student/StudentLoginFragment;Lcom/zykj/message/server/bean/ServerInfo;)Lh7/p;
    .locals 7

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->b()Lcom/zykj/message/server/bean/Status;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    move v0, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v2, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$a;->a:[I

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    aget v0, v2, v0

    .line 22
    .line 23
    :goto_0
    if-eq v0, v1, :cond_3

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    if-eq v0, v1, :cond_2

    .line 27
    .line 28
    const/4 p1, 0x2

    .line 29
    if-eq v0, p1, :cond_3

    .line 30
    .line 31
    const/4 p1, 0x3

    .line 32
    if-ne v0, p1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 36
    .line 37
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 38
    .line 39
    .line 40
    throw p0

    .line 41
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/lib/login/ui/student/StudentLoginFragment;->k(Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v0, "getViewLifecycleOwner(...)"

    .line 50
    .line 51
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    new-instance v4, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$initView$2$1;

    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    invoke-direct {v4, p0, p1}, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$initView$2$1;-><init>(Lcom/zykj/lib/login/ui/student/StudentLoginFragment;Lm7/c;)V

    .line 66
    .line 67
    .line 68
    const/4 v5, 0x2

    .line 69
    const/4 v6, 0x0

    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 72
    .line 73
    .line 74
    :goto_2
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 75
    .line 76
    return-object p0
.end method


# virtual methods
.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object p1, Lcom/zykj/message/client/MessageClient;->a:Lcom/zykj/message/client/MessageClient;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/message/client/MessageClient;->g()Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    new-instance p2, Lo3/a;

    .line 10
    .line 11
    invoke-direct {p2, p0}, Lo3/a;-><init>(Lcom/zykj/lib/login/ui/student/StudentLoginFragment;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lcom/zykj/message/client/MessageClient;->a(Lx7/l;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const-string v0, "requireContext(...)"

    .line 23
    .line 24
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p1, p2, v0}, Lcom/zykj/message/client/MessageClient;->c(Landroid/content/Context;Z)V

    .line 29
    .line 30
    .line 31
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 32
    .line 33
    return-object p1
.end method

.method public final j()Lcom/zykj/lib/login/ui/main/LoginViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment;->f:Lh7/d;

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

.method public final k(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/message/client/MessageClient;->a:Lcom/zykj/message/client/MessageClient;

    .line 2
    .line 3
    new-instance v1, Lo3/b;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lo3/b;-><init>(Lcom/zykj/lib/login/ui/student/StudentLoginFragment;Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/zykj/message/client/MessageClient;->b(Lx7/l;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/lib/login/R$layout;->login_fragment_login_student:I

    .line 2
    .line 3
    return v0
.end method
