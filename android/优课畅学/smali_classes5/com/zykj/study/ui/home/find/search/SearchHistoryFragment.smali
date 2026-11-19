.class public final Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;
.super Lcom/zykj/study/ui/home/find/search/Hilt_SearchHistoryFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/find/search/Hilt_SearchHistoryFragment<",
        "Lcom/zykj/study/databinding/FragmentSearchHistoryBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public g:Lcom/zykj/study/adapter/SearchHistoryAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/search/Hilt_SearchHistoryFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz4/g;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lz4/g;-><init>(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$special$$inlined$viewModels$default$1;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$special$$inlined$viewModels$default$1;-><init>(Lx7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$special$$inlined$viewModels$default$2;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$special$$inlined$viewModels$default$2;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$special$$inlined$viewModels$default$3;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$special$$inlined$viewModels$default$3;-><init>(Lx7/a;Lh7/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$special$$inlined$viewModels$default$4;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$special$$inlined$viewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;->f:Lh7/d;

    .line 47
    .line 48
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;->m(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;->l(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic i(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;)Lcom/zykj/study/adapter/SearchHistoryAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;->g:Lcom/zykj/study/adapter/SearchHistoryAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;)Lcom/zykj/study/viewmodels/SearchViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;->k()Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final k()Lcom/zykj/study/viewmodels/SearchViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;->f:Lh7/d;

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

.method public static final l(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;->k()Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/SearchViewModel;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final m(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
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
    instance-of v0, p1, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$1;->c:I

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
    new-instance p1, Lcom/zykj/study/adapter/SearchHistoryAdapter;

    .line 63
    .line 64
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;->k()Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-direct {p1, v0}, Lcom/zykj/study/adapter/SearchHistoryAdapter;-><init>(Lcom/zykj/study/viewmodels/SearchViewModel;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;->g:Lcom/zykj/study/adapter/SearchHistoryAdapter;

    .line 72
    .line 73
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance v0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$2;

    .line 78
    .line 79
    const/4 v1, 0x0

    .line 80
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment$initData$2;-><init>(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;Lm7/c;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lx7/p;)Lkotlinx/coroutines/n;

    .line 84
    .line 85
    .line 86
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 87
    .line 88
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
    check-cast p1, Lcom/zykj/study/databinding/FragmentSearchHistoryBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentSearchHistoryBinding;->recycleHistory:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    iget-object p2, p0, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;->g:Lcom/zykj/study/adapter/SearchHistoryAdapter;

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    const-string p2, "historyAdapter"

    .line 14
    .line 15
    invoke-static {p2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    :cond_0
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
    check-cast p1, Lcom/zykj/study/databinding/FragmentSearchHistoryBinding;

    .line 27
    .line 28
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentSearchHistoryBinding;->tvClear:Landroid/widget/TextView;

    .line 29
    .line 30
    new-instance p2, Lz4/f;

    .line 31
    .line 32
    invoke-direct {p2, p0}, Lz4/f;-><init>(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 39
    .line 40
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_search_history:I

    .line 2
    .line 3
    return v0
.end method
