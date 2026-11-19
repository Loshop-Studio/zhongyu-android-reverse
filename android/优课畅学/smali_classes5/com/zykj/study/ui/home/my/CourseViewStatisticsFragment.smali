.class public final Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_CourseViewStatisticsFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_CourseViewStatisticsFragment<",
        "Lcom/zykj/study/databinding/FragmentCourseViewStatisticsBinding;",
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
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_CourseViewStatisticsFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb5/i0;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lb5/i0;-><init>(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$special$$inlined$viewModels$default$1;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$special$$inlined$viewModels$default$1;-><init>(Lx7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$special$$inlined$viewModels$default$2;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$special$$inlined$viewModels$default$2;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$special$$inlined$viewModels$default$3;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$special$$inlined$viewModels$default$3;-><init>(Lx7/a;Lh7/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$special$$inlined$viewModels$default$4;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$special$$inlined$viewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->f:Lh7/d;

    .line 47
    .line 48
    new-instance v0, Lb5/j0;

    .line 49
    .line 50
    invoke-direct {v0}, Lb5/j0;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->g:Lh7/d;

    .line 58
    .line 59
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;Lcom/zykj/study/bean/teach/CatalogStudyProgress;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->s(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;Lcom/zykj/study/bean/teach/CatalogStudyProgress;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h()Lcom/zykj/study/adapter/StatisticsAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->u()Lcom/zykj/study/adapter/StatisticsAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->q(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->n(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;Lcom/zykj/study/bean/teach/GroupMemberProgress;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->r(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;Lcom/zykj/study/bean/teach/GroupMemberProgress;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;)Lcom/zykj/study/adapter/StatisticsAdapter;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->p()Lcom/zykj/study/adapter/StatisticsAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic m(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->t(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final n(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
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

.method private final o()Lcom/zykj/study/viewmodels/CourseViewViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->f:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final q(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->o()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->h(I)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 17
    .line 18
    return-object p0
.end method

.method public static final r(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;Lcom/zykj/study/bean/teach/GroupMemberProgress;)Lh7/p;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->o()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/zykj/study/bean/teach/CatalogStudyProgress;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->v(Lcom/zykj/study/bean/teach/CatalogStudyProgress;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 21
    .line 22
    return-object p0
.end method

.method public static final s(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;Lcom/zykj/study/bean/teach/CatalogStudyProgress;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->v(Lcom/zykj/study/bean/teach/CatalogStudyProgress;)V

    .line 5
    .line 6
    .line 7
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final u()Lcom/zykj/study/adapter/StatisticsAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/adapter/StatisticsAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/study/adapter/StatisticsAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentCourseViewStatisticsBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentCourseViewStatisticsBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->p()Lcom/zykj/study/adapter/StatisticsAdapter;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->p()Lcom/zykj/study/adapter/StatisticsAdapter;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance p2, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$initView$2$1;

    .line 21
    .line 22
    invoke-direct {p2, p0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$initView$2$1;-><init>(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->o()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    new-instance v0, Lb5/k0;

    .line 41
    .line 42
    invoke-direct {v0, p0}, Lb5/k0;-><init>(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$a;

    .line 46
    .line 47
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$a;-><init>(Lx7/l;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->o()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    new-instance v0, Lb5/l0;

    .line 66
    .line 67
    invoke-direct {v0, p0}, Lb5/l0;-><init>(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;)V

    .line 68
    .line 69
    .line 70
    new-instance v1, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$a;

    .line 71
    .line 72
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$a;-><init>(Lx7/l;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 76
    .line 77
    .line 78
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->o()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    new-instance v0, Lb5/m0;

    .line 91
    .line 92
    invoke-direct {v0, p0}, Lb5/m0;-><init>(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;)V

    .line 93
    .line 94
    .line 95
    new-instance v1, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$a;

    .line 96
    .line 97
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$a;-><init>(Lx7/l;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 101
    .line 102
    .line 103
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 104
    .line 105
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_course_view_statistics:I

    .line 2
    .line 3
    return v0
.end method

.method public final p()Lcom/zykj/study/adapter/StatisticsAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/adapter/StatisticsAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final t(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentCourseViewStatisticsBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentCourseViewStatisticsBinding;->emptyViewStub:Landroidx/databinding/ViewStubProxy;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewStubProxy;->isInflated()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/zykj/study/databinding/FragmentCourseViewStatisticsBinding;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentCourseViewStatisticsBinding;->emptyViewStub:Landroidx/databinding/ViewStubProxy;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/databinding/ViewStubProxy;->getRoot()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "getRoot(...)"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/16 p1, 0x8

    .line 37
    .line 38
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lcom/zykj/study/databinding/FragmentCourseViewStatisticsBinding;

    .line 49
    .line 50
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentCourseViewStatisticsBinding;->emptyViewStub:Landroidx/databinding/ViewStubProxy;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroidx/databinding/ViewStubProxy;->getViewStub()Landroid/view/ViewStub;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    .line 59
    .line 60
    .line 61
    :cond_2
    return-void
.end method

.method public final v(Lcom/zykj/study/bean/teach/CatalogStudyProgress;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->getGroupList()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v1, v0

    .line 20
    check-cast v1, Lcom/zykj/study/bean/teach/SuperviseGroupProgress;

    .line 21
    .line 22
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->o()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lcom/zykj/study/bean/teach/GroupMemberProgress;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/zykj/study/bean/teach/GroupMemberProgress;->getGroupId()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {v1}, Lcom/zykj/study/bean/teach/SuperviseGroupProgress;->getId()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-ne v2, v1, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/4 v0, 0x0

    .line 50
    :goto_0
    check-cast v0, Lcom/zykj/study/bean/teach/SuperviseGroupProgress;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/SuperviseGroupProgress;->getMemberList()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->p()Lcom/zykj/study/adapter/StatisticsAdapter;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->o()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Lcom/zykj/study/bean/course/CatalogBean;

    .line 75
    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    const/4 v1, 0x0

    .line 84
    :goto_1
    invoke-virtual {v0, v1}, Lcom/zykj/study/adapter/StatisticsAdapter;->c(Z)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->p()Lcom/zykj/study/adapter/StatisticsAdapter;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0, p1}, Lcom/zykj/study/adapter/StatisticsAdapter;->f(Ljava/util/List;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    return-void
.end method
