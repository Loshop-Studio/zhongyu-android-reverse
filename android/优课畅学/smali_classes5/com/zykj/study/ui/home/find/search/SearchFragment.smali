.class public final Lcom/zykj/study/ui/home/find/search/SearchFragment;
.super Lcom/zykj/study/ui/home/find/search/Hilt_SearchFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/find/search/Hilt_SearchFragment<",
        "Lcom/zykj/study/databinding/FragmentSearchBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public g:Lcom/zykj/study/ui/home/find/search/SearchResultFragment;

.field public h:Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/search/Hilt_SearchFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/study/ui/home/find/search/SearchFragment$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/find/search/SearchFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/study/ui/home/find/search/SearchFragment$special$$inlined$viewModels$default$2;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/find/search/SearchFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

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
    new-instance v2, Lcom/zykj/study/ui/home/find/search/SearchFragment$special$$inlined$viewModels$default$3;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/find/search/SearchFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/study/ui/home/find/search/SearchFragment$special$$inlined$viewModels$default$4;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/home/find/search/SearchFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/zykj/study/ui/home/find/search/SearchFragment$special$$inlined$viewModels$default$5;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/find/search/SearchFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/ui/home/find/search/SearchFragment;->f:Lh7/d;

    .line 47
    .line 48
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/find/search/SearchFragment;Ljava/lang/String;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/search/SearchFragment;->n(Lcom/zykj/study/ui/home/find/search/SearchFragment;Ljava/lang/String;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/find/search/SearchFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/search/SearchFragment;->q(Lcom/zykj/study/ui/home/find/search/SearchFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/find/search/SearchFragment;Ljava/lang/String;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/search/SearchFragment;->o(Lcom/zykj/study/ui/home/find/search/SearchFragment;Ljava/lang/String;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/find/search/SearchFragment;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/find/search/SearchFragment;->p(Lcom/zykj/study/ui/home/find/search/SearchFragment;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic k(Lcom/zykj/study/ui/home/find/search/SearchFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/search/SearchFragment;->m()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final n(Lcom/zykj/study/ui/home/find/search/SearchFragment;Ljava/lang/String;)Lh7/p;
    .locals 1

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget v0, Lcom/zykj/study/R$id;->fragment_container:I

    .line 19
    .line 20
    iget-object p0, p0, Lcom/zykj/study/ui/home/find/search/SearchFragment;->h:Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;

    .line 21
    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    const-string p0, "searchHistoryFragment"

    .line 25
    .line 26
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    :cond_0
    invoke-virtual {p1, v0, p0}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    .line 35
    .line 36
    .line 37
    :cond_1
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 38
    .line 39
    return-object p0
.end method

.method public static final o(Lcom/zykj/study/ui/home/find/search/SearchFragment;Ljava/lang/String;)Lh7/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentSearchBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentSearchBinding;->etSearch:Lcom/xuexiang/xui/widget/edittext/ClearEditText;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/xuexiang/xui/utils/d;->d(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lcom/zykj/study/databinding/FragmentSearchBinding;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentSearchBinding;->etSearch:Lcom/xuexiang/xui/widget/edittext/ClearEditText;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-lez p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    sget v0, Lcom/zykj/study/R$id;->fragment_container:I

    .line 41
    .line 42
    iget-object p0, p0, Lcom/zykj/study/ui/home/find/search/SearchFragment;->g:Lcom/zykj/study/ui/home/find/search/SearchResultFragment;

    .line 43
    .line 44
    if-nez p0, :cond_0

    .line 45
    .line 46
    const-string p0, "searchResultFragment"

    .line 47
    .line 48
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    :cond_0
    invoke-virtual {p1, v0, p0}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    .line 57
    .line 58
    .line 59
    :cond_1
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 60
    .line 61
    return-object p0
.end method

.method public static final p(Lcom/zykj/study/ui/home/find/search/SearchFragment;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p1, 0x3

    .line 2
    if-ne p2, p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lcom/zykj/study/databinding/FragmentSearchBinding;

    .line 9
    .line 10
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentSearchBinding;->etSearch:Lcom/xuexiang/xui/widget/edittext/ClearEditText;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/xuexiang/xui/utils/d;->d(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/search/SearchFragment;->l()Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/SearchViewModel;->k()V

    .line 20
    .line 21
    .line 22
    :cond_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public static final q(Lcom/zykj/study/ui/home/find/search/SearchFragment;Landroid/view/View;)V
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


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/find/search/SearchFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/find/search/SearchFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/find/search/SearchFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/find/search/SearchFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/find/search/SearchFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/find/search/SearchFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/find/search/SearchFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/find/search/SearchFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/find/search/SearchFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/find/search/SearchFragment$initData$1;->c:I

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
    new-instance p1, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;

    .line 63
    .line 64
    invoke-direct {p1}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lcom/zykj/study/ui/home/find/search/SearchFragment;->g:Lcom/zykj/study/ui/home/find/search/SearchResultFragment;

    .line 68
    .line 69
    new-instance p1, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;

    .line 70
    .line 71
    invoke-direct {p1}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Lcom/zykj/study/ui/home/find/search/SearchFragment;->h:Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;

    .line 75
    .line 76
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-instance v0, Lcom/zykj/study/ui/home/find/search/SearchFragment$initData$2;

    .line 81
    .line 82
    const/4 v1, 0x0

    .line 83
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/find/search/SearchFragment$initData$2;-><init>(Lcom/zykj/study/ui/home/find/search/SearchFragment;Lm7/c;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lx7/p;)Lkotlinx/coroutines/n;

    .line 87
    .line 88
    .line 89
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 90
    .line 91
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
    check-cast p1, Lcom/zykj/study/databinding/FragmentSearchBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/search/SearchFragment;->l()Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentSearchBinding;->setSearchViewModel(Lcom/zykj/study/viewmodels/SearchViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/search/SearchFragment;->l()Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/SearchViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    new-instance v0, Lz4/a;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lz4/a;-><init>(Lcom/zykj/study/ui/home/find/search/SearchFragment;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lcom/zykj/study/ui/home/find/search/SearchFragment$b;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/find/search/SearchFragment$b;-><init>(Lx7/l;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/search/SearchFragment;->l()Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/SearchViewModel;->g()Landroidx/lifecycle/MutableLiveData;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    new-instance v0, Lz4/b;

    .line 52
    .line 53
    invoke-direct {v0, p0}, Lz4/b;-><init>(Lcom/zykj/study/ui/home/find/search/SearchFragment;)V

    .line 54
    .line 55
    .line 56
    new-instance v1, Lcom/zykj/study/ui/home/find/search/SearchFragment$b;

    .line 57
    .line 58
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/find/search/SearchFragment$b;-><init>(Lx7/l;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Lcom/zykj/study/databinding/FragmentSearchBinding;

    .line 69
    .line 70
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentSearchBinding;->etSearch:Lcom/xuexiang/xui/widget/edittext/ClearEditText;

    .line 71
    .line 72
    new-instance p2, Le5/j;

    .line 73
    .line 74
    invoke-direct {p2}, Le5/j;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 78
    .line 79
    .line 80
    new-instance p2, Lz4/c;

    .line 81
    .line 82
    invoke-direct {p2, p0}, Lz4/c;-><init>(Lcom/zykj/study/ui/home/find/search/SearchFragment;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 86
    .line 87
    .line 88
    :try_start_0
    sget-object p2, Lkotlin/Result;->b:Lkotlin/Result$a;

    .line 89
    .line 90
    const-class p2, Landroid/widget/TextView;

    .line 91
    .line 92
    const-string v0, "mDeviceProvisionedState"

    .line 93
    .line 94
    invoke-virtual {p2, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    const/4 v0, 0x1

    .line 99
    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 100
    .line 101
    .line 102
    const-string v1, "null cannot be cast to non-null type android.widget.TextView"

    .line 103
    .line 104
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v0}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {p2, p1, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    new-instance p2, Lcom/zykj/study/ui/home/find/search/SearchFragment$a;

    .line 115
    .line 116
    invoke-direct {p2}, Lcom/zykj/study/ui/home/find/search/SearchFragment$a;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setCustomInsertionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 120
    .line 121
    .line 122
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 123
    .line 124
    invoke-static {p1}, Lkotlin/Result;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    goto :goto_0

    .line 129
    :catchall_0
    move-exception p1

    .line 130
    sget-object p2, Lkotlin/Result;->b:Lkotlin/Result$a;

    .line 131
    .line 132
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-static {p1}, Lkotlin/Result;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    if-eqz p1, :cond_0

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 147
    .line 148
    .line 149
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, Lcom/zykj/study/databinding/FragmentSearchBinding;

    .line 154
    .line 155
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentSearchBinding;->tvCancel:Landroid/widget/TextView;

    .line 156
    .line 157
    new-instance p2, Lz4/d;

    .line 158
    .line 159
    invoke-direct {p2, p0}, Lz4/d;-><init>(Lcom/zykj/study/ui/home/find/search/SearchFragment;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 163
    .line 164
    .line 165
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 166
    .line 167
    return-object p1
.end method

.method public final l()Lcom/zykj/study/viewmodels/SearchViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/search/SearchFragment;->f:Lh7/d;

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

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_search:I

    .line 2
    .line 3
    return v0
.end method

.method public final m()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget v1, Lcom/zykj/study/R$id;->fragment_container:I

    .line 10
    .line 11
    iget-object v2, p0, Lcom/zykj/study/ui/home/find/search/SearchFragment;->h:Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    const-string v2, "searchHistoryFragment"

    .line 16
    .line 17
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    :cond_0
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/search/SearchFragment;->l()Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/SearchViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, ""

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/search/SearchFragment;->l()Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/SearchViewModel;->g()Landroidx/lifecycle/MutableLiveData;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentSearchBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentSearchBinding;->etSearch:Lcom/xuexiang/xui/widget/edittext/ClearEditText;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/xuexiang/xui/utils/d;->d(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
