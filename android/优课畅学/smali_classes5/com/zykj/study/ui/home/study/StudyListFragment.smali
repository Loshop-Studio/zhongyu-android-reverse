.class public final Lcom/zykj/study/ui/home/study/StudyListFragment;
.super Lcom/zykj/study/ui/home/study/Hilt_StudyListFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/study/Hilt_StudyListFragment<",
        "Lcom/zykj/study/databinding/FragmentStudyListBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public final g:Lh7/d;

.field public final h:Lh7/d;

.field public i:Lcom/zykj/study/adapter/CourseStudyAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/Hilt_StudyListFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v4, p0}, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/study/ui/home/study/StudyListFragment;->f:Lh7/d;

    .line 31
    .line 32
    new-instance v0, Ld5/d;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Ld5/d;-><init>(Lcom/zykj/study/ui/home/study/StudyListFragment;)V

    .line 35
    .line 36
    .line 37
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 38
    .line 39
    new-instance v2, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$viewModels$default$1;

    .line 40
    .line 41
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$viewModels$default$1;-><init>(Lx7/a;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-class v1, Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    new-instance v2, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$viewModels$default$2;

    .line 55
    .line 56
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$viewModels$default$2;-><init>(Lh7/d;)V

    .line 57
    .line 58
    .line 59
    new-instance v4, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$viewModels$default$3;

    .line 60
    .line 61
    invoke-direct {v4, v3, v0}, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$viewModels$default$3;-><init>(Lx7/a;Lh7/d;)V

    .line 62
    .line 63
    .line 64
    new-instance v5, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$viewModels$default$4;

    .line 65
    .line 66
    invoke-direct {v5, p0, v0}, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$viewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v1, v2, v4, v5}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Lcom/zykj/study/ui/home/study/StudyListFragment;->g:Lh7/d;

    .line 74
    .line 75
    const-class v0, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;

    .line 76
    .line 77
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    new-instance v1, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$activityViewModels$default$4;

    .line 82
    .line 83
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$activityViewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 84
    .line 85
    .line 86
    new-instance v2, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$activityViewModels$default$5;

    .line 87
    .line 88
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$activityViewModels$default$5;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 89
    .line 90
    .line 91
    new-instance v3, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$activityViewModels$default$6;

    .line 92
    .line 93
    invoke-direct {v3, p0}, Lcom/zykj/study/ui/home/study/StudyListFragment$special$$inlined$activityViewModels$default$6;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iput-object v0, p0, Lcom/zykj/study/ui/home/study/StudyListFragment;->h:Lh7/d;

    .line 101
    .line 102
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/study/StudyListFragment;Lcom/zykj/study/data/CourseStudyEntity;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/study/StudyListFragment;->r(Lcom/zykj/study/ui/home/study/StudyListFragment;Lcom/zykj/study/data/CourseStudyEntity;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/study/StudyListFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/study/StudyListFragment;->t(Lcom/zykj/study/ui/home/study/StudyListFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/study/StudyListFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/study/StudyListFragment;->s(Lcom/zykj/study/ui/home/study/StudyListFragment;)V

    return-void
.end method

.method public static final synthetic j(Lcom/zykj/study/ui/home/study/StudyListFragment;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/study/ui/home/study/StudyListFragment;->n(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic k(Lcom/zykj/study/ui/home/study/StudyListFragment;)Lcom/zykj/study/adapter/CourseStudyAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/study/StudyListFragment;->i:Lcom/zykj/study/adapter/CourseStudyAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Lcom/zykj/study/ui/home/study/StudyListFragment;)Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyListFragment;->p()Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic m(Lcom/zykj/study/ui/home/study/StudyListFragment;)Lcom/zykj/study/viewmodels/StudyViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyListFragment;->q()Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final n(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/zykj/study/R$drawable;->divider:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v1, v2}, Landroidx/core/content/res/ResourcesCompat;->getDrawable(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v1, Landroidx/recyclerview/widget/DividerItemDecoration;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/DividerItemDecoration;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method private final o()Lcom/zykj/study/viewmodels/DictViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/study/StudyListFragment;->f:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method private final p()Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/study/StudyListFragment;->h:Lh7/d;

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

.method private final q()Lcom/zykj/study/viewmodels/StudyViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/study/StudyListFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final r(Lcom/zykj/study/ui/home/study/StudyListFragment;Lcom/zykj/study/data/CourseStudyEntity;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyListFragment;->q()Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/StudyViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 18
    .line 19
    return-object p0
.end method

.method public static final s(Lcom/zykj/study/ui/home/study/StudyListFragment;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/study/StudyListFragment;->i:Lcom/zykj/study/adapter/CourseStudyAdapter;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, "courseStudyAdapter"

    .line 6
    .line 7
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroidx/paging/PagingDataAdapter;->refresh()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final t(Lcom/zykj/study/ui/home/study/StudyListFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
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
    .locals 2

    .line 1
    new-instance p1, Lcom/zykj/study/adapter/CourseStudyAdapter;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyListFragment;->o()Lcom/zykj/study/viewmodels/DictViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ld5/c;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Ld5/c;-><init>(Lcom/zykj/study/ui/home/study/StudyListFragment;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, v0, v1}, Lcom/zykj/study/adapter/CourseStudyAdapter;-><init>(Lcom/zykj/study/viewmodels/DictViewModel;Lx7/l;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lcom/zykj/study/ui/home/study/StudyListFragment;->i:Lcom/zykj/study/adapter/CourseStudyAdapter;

    .line 16
    .line 17
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$3;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$3;-><init>(Lcom/zykj/study/ui/home/study/StudyListFragment;Lm7/c;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v0, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$4;

    .line 35
    .line 36
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$4;-><init>(Lcom/zykj/study/ui/home/study/StudyListFragment;Lm7/c;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v0, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;

    .line 47
    .line 48
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;-><init>(Lcom/zykj/study/ui/home/study/StudyListFragment;Lm7/c;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 52
    .line 53
    .line 54
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 55
    .line 56
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string p2, "getViewLifecycleOwner(...)"

    .line 6
    .line 7
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v3, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-direct {v3, p0, p1}, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2;-><init>(Lcom/zykj/study/ui/home/study/StudyListFragment;Lm7/c;)V

    .line 18
    .line 19
    .line 20
    const/4 v4, 0x3

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    new-instance v0, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$3;

    .line 39
    .line 40
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$3;-><init>(Lcom/zykj/study/ui/home/study/StudyListFragment;Lm7/c;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudyListBinding;

    .line 51
    .line 52
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentStudyListBinding;->swipe:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 53
    .line 54
    new-instance p2, Ld5/b;

    .line 55
    .line 56
    invoke-direct {p2, p0}, Ld5/b;-><init>(Lcom/zykj/study/ui/home/study/StudyListFragment;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 60
    .line 61
    .line 62
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 63
    .line 64
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_study_list:I

    .line 2
    .line 3
    return v0
.end method
