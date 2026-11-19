.class public final Lcom/zykj/study/ui/home/find/search/SearchResultFragment;
.super Lcom/zykj/study/ui/home/find/search/Hilt_SearchResultFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/find/search/Hilt_SearchResultFragment<",
        "Lcom/zykj/study/databinding/FragmentSearchResultBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public final g:Lh7/d;

.field public h:Lcom/zykj/study/adapter/CourseAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/search/Hilt_SearchResultFragment;-><init>()V

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
    new-instance v1, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v4, p0}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;->f:Lh7/d;

    .line 31
    .line 32
    new-instance v0, Lz4/k;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lz4/k;-><init>(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;)V

    .line 35
    .line 36
    .line 37
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 38
    .line 39
    new-instance v2, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$special$$inlined$viewModels$default$1;

    .line 40
    .line 41
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$special$$inlined$viewModels$default$1;-><init>(Lx7/a;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-class v1, Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    new-instance v2, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$special$$inlined$viewModels$default$2;

    .line 55
    .line 56
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$special$$inlined$viewModels$default$2;-><init>(Lh7/d;)V

    .line 57
    .line 58
    .line 59
    new-instance v4, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$special$$inlined$viewModels$default$3;

    .line 60
    .line 61
    invoke-direct {v4, v3, v0}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$special$$inlined$viewModels$default$3;-><init>(Lx7/a;Lh7/d;)V

    .line 62
    .line 63
    .line 64
    new-instance v3, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$special$$inlined$viewModels$default$4;

    .line 65
    .line 66
    invoke-direct {v3, p0, v0}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$special$$inlined$viewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v1, v2, v4, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;->g:Lh7/d;

    .line 74
    .line 75
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;->q(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;->p(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;Lcom/zykj/study/bean/course/CourseSimpleBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;->o(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;Lcom/zykj/study/bean/course/CourseSimpleBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;)Lcom/zykj/study/viewmodels/SearchViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;->n()Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final k(Landroidx/recyclerview/widget/RecyclerView;)V
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
    const/4 v3, 0x0

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
    new-instance v1, Landroidx/recyclerview/widget/DividerItemDecoration;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/DividerItemDecoration;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method private final m()Lcom/zykj/study/viewmodels/DictViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;->f:Lh7/d;

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

.method private final n()Lcom/zykj/study/viewmodels/SearchViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final o(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;Lcom/zykj/study/bean/course/CourseSimpleBean;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/study/ui/home/find/search/a;->a:Lcom/zykj/study/ui/home/find/search/a$b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/study/ui/home/find/search/a$b;->a(Lcom/zykj/study/bean/course/CourseSimpleBean;)Landroidx/navigation/NavDirections;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 20
    .line 21
    return-object p0
.end method

.method public static final p(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;->l()Lcom/zykj/study/adapter/CourseAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/paging/PagingDataAdapter;->refresh()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final q(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
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
    instance-of v0, p1, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$initData$1;->c:I

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
    new-instance p1, Lcom/zykj/study/adapter/CourseAdapter;

    .line 63
    .line 64
    new-instance v0, Lz4/j;

    .line 65
    .line 66
    invoke-direct {v0, p0}, Lz4/j;-><init>(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;->m()Lcom/zykj/study/viewmodels/DictViewModel;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-direct {p1, v0, v1}, Lcom/zykj/study/adapter/CourseAdapter;-><init>(Lx7/l;Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;->r(Lcom/zykj/study/adapter/CourseAdapter;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance v0, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$initData$3;

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$initData$3;-><init>(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;Lm7/c;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 90
    .line 91
    .line 92
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    new-instance v0, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$initData$4;

    .line 97
    .line 98
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment$initData$4;-><init>(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;Lm7/c;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 102
    .line 103
    .line 104
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 105
    .line 106
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentSearchResultBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentSearchResultBinding;->recycleView:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;->k(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;->l()Lcom/zykj/study/adapter/CourseAdapter;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lcom/zykj/study/databinding/FragmentSearchResultBinding;

    .line 27
    .line 28
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentSearchResultBinding;->swipe:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 29
    .line 30
    new-instance p2, Lz4/i;

    .line 31
    .line 32
    invoke-direct {p2, p0}, Lz4/i;-><init>(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 39
    .line 40
    return-object p1
.end method

.method public final l()Lcom/zykj/study/adapter/CourseAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;->h:Lcom/zykj/study/adapter/CourseAdapter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "courseAdapter"

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

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_search_result:I

    .line 2
    .line 3
    return v0
.end method

.method public final r(Lcom/zykj/study/adapter/CourseAdapter;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;->h:Lcom/zykj/study/adapter/CourseAdapter;

    .line 7
    .line 8
    return-void
.end method
