# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/ui/home/my/MyFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_MyFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_MyFragment<",
        "Lcom/zykj/study/databinding/FragmentMyBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public g:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_MyFragment;-><init>()V

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
    new-instance v1, Lcom/zykj/study/ui/home/my/MyFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/my/MyFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/study/ui/home/my/MyFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/ui/home/my/MyFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/zykj/study/ui/home/my/MyFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/zykj/study/ui/home/my/MyFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/MyFragment;->f:Lh7/d;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/my/MyFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/MyFragment;->o(Lcom/zykj/study/ui/home/my/MyFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/MyFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/MyFragment;->q(Lcom/zykj/study/ui/home/my/MyFragment;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/my/MyFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/MyFragment;->p(Lcom/zykj/study/ui/home/my/MyFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/my/MyFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/MyFragment;->n(Lcom/zykj/study/ui/home/my/MyFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic k(Lcom/zykj/study/ui/home/my/MyFragment;)Lcom/zykj/lib/login/ui/main/LoginViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/MyFragment;->m()Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic l(Lcom/zykj/study/ui/home/my/MyFragment;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/MyFragment;->r(Ljava/lang/Integer;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final m()Lcom/zykj/lib/login/ui/main/LoginViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyFragment;->f:Lh7/d;

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

.method public static final n(Lcom/zykj/study/ui/home/my/MyFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/MyFragment;->r(Ljava/lang/Integer;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lcom/zykj/study/databinding/FragmentMyBinding;

    .line 17
    .line 18
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentMyBinding;->fragmentContainerMy:Landroidx/fragment/app/FragmentContainerView;

    .line 19
    .line 20
    const-string p1, "fragmentContainerMy"

    .line 21
    .line 22
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Landroidx/navigation/ViewKt;->findNavController(Landroid/view/View;)Landroidx/navigation/NavController;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Landroidx/navigation/NavController;->getCurrentDestination()Landroidx/navigation/NavDestination;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/navigation/NavDestination;->getId()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    sget v0, Lcom/zykj/study/R$id;->settingFragment:I

    .line 40
    .line 41
    if-ne p1, v0, :cond_0

    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    sget p1, Lcom/zykj/study/R$id;->action_global_settingFragment:I

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(I)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public static final o(Lcom/zykj/study/ui/home/my/MyFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/MyFragment;->r(Ljava/lang/Integer;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lcom/zykj/study/databinding/FragmentMyBinding;

    .line 17
    .line 18
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentMyBinding;->fragmentContainerMy:Landroidx/fragment/app/FragmentContainerView;

    .line 19
    .line 20
    const-string p1, "fragmentContainerMy"

    .line 21
    .line 22
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Landroidx/navigation/Navigation;->findNavController(Landroid/view/View;)Landroidx/navigation/NavController;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Landroidx/navigation/NavController;->getCurrentDestination()Landroidx/navigation/NavDestination;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/navigation/NavDestination;->getId()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    sget v0, Lcom/zykj/study/R$id;->myCourseFragment:I

    .line 40
    .line 41
    if-ne p1, v0, :cond_0

    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    sget p1, Lcom/zykj/study/R$id;->action_global_myCourseFragment:I

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(I)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public static final p(Lcom/zykj/study/ui/home/my/MyFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/MyFragment;->r(Ljava/lang/Integer;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lcom/zykj/study/databinding/FragmentMyBinding;

    .line 17
    .line 18
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentMyBinding;->fragmentContainerMy:Landroidx/fragment/app/FragmentContainerView;

    .line 19
    .line 20
    const-string p1, "fragmentContainerMy"

    .line 21
    .line 22
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Landroidx/navigation/ViewKt;->findNavController(Landroid/view/View;)Landroidx/navigation/NavController;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Landroidx/navigation/NavController;->getCurrentDestination()Landroidx/navigation/NavDestination;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/navigation/NavDestination;->getId()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    sget v0, Lcom/zykj/study/R$id;->teacherFragment:I

    .line 40
    .line 41
    if-ne p1, v0, :cond_0

    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    sget p1, Lcom/zykj/study/R$id;->action_global_teacherFragment:I

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(I)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public static final q(Lcom/zykj/study/ui/home/my/MyFragment;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentMyBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentMyBinding;->swipe:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "getViewLifecycleOwner(...)"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v5, Lcom/zykj/study/ui/home/my/MyFragment$initView$5$1;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-direct {v5, p0, v0}, Lcom/zykj/study/ui/home/my/MyFragment$initView$5$1;-><init>(Lcom/zykj/study/ui/home/my/MyFragment;Lm7/c;)V

    .line 30
    .line 31
    .line 32
    const/4 v6, 0x3

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 37
    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/study/ui/home/my/MyFragment$initData$2;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {v3, p0, p1}, Lcom/zykj/study/ui/home/my/MyFragment$initData$2;-><init>(Lcom/zykj/study/ui/home/my/MyFragment;Lm7/c;)V

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
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 19
    .line 20
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
    check-cast p1, Lcom/zykj/study/databinding/FragmentMyBinding;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/MyFragment;->m()Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2}, Lcom/zykj/lib/login/ui/main/LoginViewModel;->c()Landroidx/datastore/core/DataStore;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p2}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v4, 0x3

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v1, 0x0

    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    invoke-static/range {v0 .. v5}, Landroidx/lifecycle/FlowLiveDataConversions;->asLiveData$default(Ll8/c;Lkotlin/coroutines/d;JILjava/lang/Object;)Landroidx/lifecycle/LiveData;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentMyBinding;->setUserBean(Landroidx/lifecycle/LiveData;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lcom/zykj/study/databinding/FragmentMyBinding;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentMyBinding;->tvSetting:Landroid/widget/TextView;

    .line 38
    .line 39
    new-instance p2, Lb5/i3;

    .line 40
    .line 41
    invoke-direct {p2, p0}, Lb5/i3;-><init>(Lcom/zykj/study/ui/home/my/MyFragment;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Lcom/zykj/study/databinding/FragmentMyBinding;

    .line 52
    .line 53
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentMyBinding;->tvMyProduct:Landroid/widget/TextView;

    .line 54
    .line 55
    new-instance p2, Lb5/j3;

    .line 56
    .line 57
    invoke-direct {p2, p0}, Lb5/j3;-><init>(Lcom/zykj/study/ui/home/my/MyFragment;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Lcom/zykj/study/databinding/FragmentMyBinding;

    .line 68
    .line 69
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentMyBinding;->tvTeacher:Landroid/widget/TextView;

    .line 70
    .line 71
    new-instance p2, Lb5/k3;

    .line 72
    .line 73
    invoke-direct {p2, p0}, Lb5/k3;-><init>(Lcom/zykj/study/ui/home/my/MyFragment;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Lcom/zykj/study/databinding/FragmentMyBinding;

    .line 84
    .line 85
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentMyBinding;->swipe:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 86
    .line 87
    new-instance p2, Lb5/l3;

    .line 88
    .line 89
    invoke-direct {p2, p0}, Lb5/l3;-><init>(Lcom/zykj/study/ui/home/my/MyFragment;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyFragment;->g:Ljava/lang/Integer;

    .line 96
    .line 97
    if-nez p1, :cond_0

    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, Lcom/zykj/study/databinding/FragmentMyBinding;

    .line 104
    .line 105
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentMyBinding;->tvSetting:Landroid/widget/TextView;

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    invoke-static {p1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/MyFragment;->r(Ljava/lang/Integer;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/MyFragment;->r(Ljava/lang/Integer;)V

    .line 120
    .line 121
    .line 122
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 123
    .line 124
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_my:I

    .line 2
    .line 3
    return v0
.end method

.method public final r(Ljava/lang/Integer;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentMyBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentMyBinding;->tvSetting:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lcom/zykj/study/databinding/FragmentMyBinding;

    .line 14
    .line 15
    iget-object v1, v1, Lcom/zykj/study/databinding/FragmentMyBinding;->tvSetting:Landroid/widget/TextView;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x1

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-ne v4, v1, :cond_1

    .line 31
    .line 32
    move v1, v3

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    move v1, v2

    .line 35
    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lcom/zykj/study/databinding/FragmentMyBinding;

    .line 43
    .line 44
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentMyBinding;->tvMyProduct:Landroid/widget/TextView;

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lcom/zykj/study/databinding/FragmentMyBinding;

    .line 51
    .line 52
    iget-object v1, v1, Lcom/zykj/study/databinding/FragmentMyBinding;->tvMyProduct:Landroid/widget/TextView;

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-ne v4, v1, :cond_3

    .line 66
    .line 67
    move v1, v3

    .line 68
    goto :goto_3

    .line 69
    :cond_3
    :goto_2
    move v1, v2

    .line 70
    :goto_3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Lcom/zykj/study/databinding/FragmentMyBinding;

    .line 78
    .line 79
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentMyBinding;->tvTeacher:Landroid/widget/TextView;

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Lcom/zykj/study/databinding/FragmentMyBinding;

    .line 86
    .line 87
    iget-object v1, v1, Lcom/zykj/study/databinding/FragmentMyBinding;->tvTeacher:Landroid/widget/TextView;

    .line 88
    .line 89
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez p1, :cond_4

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-ne v4, v1, :cond_5

    .line 101
    .line 102
    move v2, v3

    .line 103
    :cond_5
    :goto_4
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setSelected(Z)V

    .line 104
    .line 105
    .line 106
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/MyFragment;->g:Ljava/lang/Integer;

    .line 107
    .line 108
    return-void
.end method
