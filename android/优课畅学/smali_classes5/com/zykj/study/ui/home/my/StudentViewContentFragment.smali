.class public final Lcom/zykj/study/ui/home/my/StudentViewContentFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_StudentViewContentFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_StudentViewContentFragment<",
        "Lcom/zykj/study/databinding/FragmentStudentViewContentBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public final g:Lh7/d;

.field public h:Lcom/zykj/study/adapter/CatalogProgressAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_StudentViewContentFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb5/d4;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lb5/d4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$1;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$1;-><init>(Lx7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v2, Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 21
    .line 22
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$2;

    .line 27
    .line 28
    invoke-direct {v3, v0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$2;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$3;

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    invoke-direct {v4, v5, v0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$3;-><init>(Lx7/a;Lh7/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v6, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$4;

    .line 38
    .line 39
    invoke-direct {v6, p0, v0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v2, v3, v4, v6}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->f:Lh7/d;

    .line 47
    .line 48
    new-instance v0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$5;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 51
    .line 52
    .line 53
    new-instance v2, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$6;

    .line 54
    .line 55
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$6;-><init>(Lx7/a;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-class v1, Lcom/zykj/study/viewmodels/StudentViewContentViewModel;

    .line 63
    .line 64
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    new-instance v2, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$7;

    .line 69
    .line 70
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$7;-><init>(Lh7/d;)V

    .line 71
    .line 72
    .line 73
    new-instance v3, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$8;

    .line 74
    .line 75
    invoke-direct {v3, v5, v0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$8;-><init>(Lx7/a;Lh7/d;)V

    .line 76
    .line 77
    .line 78
    new-instance v4, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$9;

    .line 79
    .line 80
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$special$$inlined$viewModels$default$9;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->g:Lh7/d;

    .line 88
    .line 89
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->n(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->o(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;Ljava/util/List;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->p(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;)Lcom/zykj/study/viewmodels/StudentViewContentViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->l()Lcom/zykj/study/viewmodels/StudentViewContentViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic k(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;)Lcom/zykj/study/viewmodels/StudentViewViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->m()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final n(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;)Lh7/p;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->l()Lcom/zykj/study/viewmodels/StudentViewContentViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->getSuperviseGroup()Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getId()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->getSuperviseGroupMember()Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->getUserId()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, v1, p1}, Lcom/zykj/study/viewmodels/StudentViewContentViewModel;->e(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudentViewContentBinding;

    .line 31
    .line 32
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudentViewContentBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 36
    .line 37
    .line 38
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 39
    .line 40
    return-object p0
.end method

.method public static final o(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;Ljava/util/List;)Lh7/p;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->h:Lcom/zykj/study/adapter/CatalogProgressAdapter;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v1, p1

    .line 13
    :goto_0
    invoke-virtual {v0, v1}, Lcom/zykj/study/adapter/CatalogProgressAdapter;->g(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    if-eqz p1, :cond_3

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudentViewContentBinding;

    .line 30
    .line 31
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudentViewContentBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/study/view/MultipleStatusView;->f()V

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudentViewContentBinding;

    .line 42
    .line 43
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudentViewContentBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 44
    .line 45
    sget p1, Lcom/zykj/study/R$layout;->layout_status_course_no_catalog:I

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lcom/zykj/study/view/MultipleStatusView;->d(I)V

    .line 48
    .line 49
    .line 50
    :goto_2
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 51
    .line 52
    return-object p0
.end method

.method public static final p(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireParentFragment()Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "requireParentFragment(...)"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$1;->c:I

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
    new-instance p1, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-direct {p1, p0, v0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;-><init>(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;Lm7/c;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0, p1, v3, v0}, Li8/f;->f(Lkotlin/coroutines/d;Lx7/p;ILjava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Lcom/zykj/study/adapter/CatalogProgressAdapter;

    .line 73
    .line 74
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->h:Lcom/zykj/study/adapter/CatalogProgressAdapter;

    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->m()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->d()Landroidx/lifecycle/MutableLiveData;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance v0, Lb5/e4;

    .line 85
    .line 86
    invoke-direct {v0, p0}, Lb5/e4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;)V

    .line 87
    .line 88
    .line 89
    new-instance v1, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$a;

    .line 90
    .line 91
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$a;-><init>(Lx7/l;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 95
    .line 96
    .line 97
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 98
    .line 99
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentViewContentBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->m()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentStudentViewContentBinding;->setEntity(Lcom/zykj/study/viewmodels/StudentViewViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentViewContentBinding;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentStudentViewContentBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 21
    .line 22
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->h:Lcom/zykj/study/adapter/CatalogProgressAdapter;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->m()Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->d()Landroidx/lifecycle/MutableLiveData;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;

    .line 40
    .line 41
    if-nez p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudentViewContentBinding;

    .line 48
    .line 49
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentStudentViewContentBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/zykj/study/view/MultipleStatusView;->h()V

    .line 52
    .line 53
    .line 54
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 55
    .line 56
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->l()Lcom/zykj/study/viewmodels/StudentViewContentViewModel;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudentViewContentViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    new-instance v0, Lb5/c4;

    .line 69
    .line 70
    invoke-direct {v0, p0}, Lb5/c4;-><init>(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;)V

    .line 71
    .line 72
    .line 73
    new-instance v1, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$a;

    .line 74
    .line 75
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$a;-><init>(Lx7/l;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 79
    .line 80
    .line 81
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 82
    .line 83
    return-object p1
.end method

.method public final l()Lcom/zykj/study/viewmodels/StudentViewContentViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/StudentViewContentViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_student_view_content:I

    .line 2
    .line 3
    return v0
.end method

.method public final m()Lcom/zykj/study/viewmodels/StudentViewViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->f:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 8
    .line 9
    return-object v0
.end method
