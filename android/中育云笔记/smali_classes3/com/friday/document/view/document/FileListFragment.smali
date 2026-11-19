.class public final Lcom/friday/document/view/document/FileListFragment;
.super Lcom/friday/document/view/document/Hilt_FileListFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/document/Hilt_FileListFragment<",
        "Lcom/friday/document/databinding/FragmentFileListBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:Lv2/x;

.field public final j:Lcom/friday/document/viewmodel/FolderViewModel;

.field public final k:Ljava/lang/String;

.field public final l:Lcom/friday/document/adapter/DocumentAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lv2/x;Lcom/friday/document/viewmodel/FolderViewModel;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "iFileListImpl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "mViewModel"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/friday/document/view/document/Hilt_FileListFragment;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/friday/document/view/document/FileListFragment;->i:Lv2/x;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/friday/document/view/document/FileListFragment;->j:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 17
    .line 18
    iput-object p3, p0, Lcom/friday/document/view/document/FileListFragment;->k:Ljava/lang/String;

    .line 19
    .line 20
    new-instance p1, Lcom/friday/document/adapter/DocumentAdapter;

    .line 21
    .line 22
    invoke-direct {p1}, Lcom/friday/document/adapter/DocumentAdapter;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/friday/document/view/document/FileListFragment;->l:Lcom/friday/document/adapter/DocumentAdapter;

    .line 26
    .line 27
    return-void
.end method

.method public static final A(Lcom/friday/document/view/document/FileListFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/document/FileListFragment;->i:Lv2/x;

    .line 2
    .line 3
    invoke-interface {v0}, Lv2/x;->c()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->isRefreshing()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object p0, p0, Lcom/friday/document/view/document/FileListFragment;->j:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->A0()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final B(Lcom/friday/document/view/document/FileListFragment;Landroidx/paging/CombinedLoadStates;)Lqc/q;
    .locals 3

    .line 1
    const-string v0, "loadState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/friday/document/databinding/FragmentFileListBinding;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentFileListBinding;->c:Landroid/widget/TextView;

    .line 13
    .line 14
    const-string v1, "emptyView"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/paging/CombinedLoadStates;->getSource()Landroidx/paging/LoadStates;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Landroidx/paging/LoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    instance-of v1, v1, Landroidx/paging/LoadState$NotLoading;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/paging/CombinedLoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Landroidx/paging/LoadState;->getEndOfPaginationReached()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    iget-object p0, p0, Lcom/friday/document/view/document/FileListFragment;->l:Lcom/friday/document/adapter/DocumentAdapter;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/paging/PagingDataAdapter;->getItemCount()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    const/4 p1, 0x1

    .line 49
    if-ge p0, p1, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move p1, v2

    .line 53
    :goto_0
    if-eqz p1, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/16 v2, 0x8

    .line 57
    .line 58
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 62
    .line 63
    return-object p0
.end method

.method public static final C(Lcom/friday/document/view/document/FileListFragment;Lcom/friday/document/adapter/a;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "option"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileEntity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcom/friday/document/view/document/FileListFragment;->i:Lv2/x;

    .line 12
    .line 13
    invoke-interface {p0, p1, p2}, Lv2/x;->e(Lcom/friday/document/adapter/a;Lcom/friday/common/entity/FileEntity;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 17
    .line 18
    return-object p0
.end method

.method public static final D(Lcom/friday/document/view/document/FileListFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "fileEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/friday/document/view/document/FileListFragment;->i:Lv2/x;

    .line 7
    .line 8
    invoke-interface {p0, p1}, Lv2/x;->b(Lcom/friday/common/entity/FileEntity;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 12
    .line 13
    return-object p0
.end method

.method private final initObserver()V
    .locals 13

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/view/document/FileListFragment$initObserver$1;

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    invoke-direct {v3, p0, v6}, Lcom/friday/document/view/document/FileListFragment$initObserver$1;-><init>(Lcom/friday/document/view/document/FileListFragment;Lvc/c;)V

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
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "getViewLifecycleOwner(...)"

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    new-instance v10, Lcom/friday/document/view/document/FileListFragment$initObserver$2;

    .line 32
    .line 33
    invoke-direct {v10, p0, v6}, Lcom/friday/document/view/document/FileListFragment$initObserver$2;-><init>(Lcom/friday/document/view/document/FileListFragment;Lvc/c;)V

    .line 34
    .line 35
    .line 36
    const/4 v11, 0x3

    .line 37
    const/4 v12, 0x0

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x0

    .line 40
    invoke-static/range {v7 .. v12}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    new-instance v10, Lcom/friday/document/view/document/FileListFragment$initObserver$3;

    .line 55
    .line 56
    invoke-direct {v10, p0, v6}, Lcom/friday/document/view/document/FileListFragment$initObserver$3;-><init>(Lcom/friday/document/view/document/FileListFragment;Lvc/c;)V

    .line 57
    .line 58
    .line 59
    invoke-static/range {v7 .. v12}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public static synthetic r(Lcom/friday/document/view/document/FileListFragment;Landroidx/paging/CombinedLoadStates;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/FileListFragment;->B(Lcom/friday/document/view/document/FileListFragment;Landroidx/paging/CombinedLoadStates;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcom/friday/document/view/document/FileListFragment;Lcom/friday/document/adapter/a;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/document/view/document/FileListFragment;->C(Lcom/friday/document/view/document/FileListFragment;Lcom/friday/document/adapter/a;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/friday/document/view/document/FileListFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/FileListFragment;->D(Lcom/friday/document/view/document/FileListFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/friday/document/view/document/FileListFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/FileListFragment;->A(Lcom/friday/document/view/document/FileListFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    return-void
.end method

.method public static final synthetic v(Lcom/friday/document/view/document/FileListFragment;)Lcom/friday/document/adapter/DocumentAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/view/document/FileListFragment;->l:Lcom/friday/document/adapter/DocumentAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic w(Lcom/friday/document/view/document/FileListFragment;)Lcom/friday/document/viewmodel/FolderViewModel;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/view/document/FileListFragment;->j:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final E()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/view/document/FileListFragment$setEmpty$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/document/view/document/FileListFragment$setEmpty$1;-><init>(Lcom/friday/document/view/document/FileListFragment;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->fragment_file_list:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/FileListFragment;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/friday/document/view/document/FileListFragment;->initObserver()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public initView()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/FragmentFileListBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentFileListBinding;->e:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 8
    .line 9
    sget v1, Lcom/friday/document/R$color;->colorAccent:I

    .line 10
    .line 11
    invoke-static {v1}, Lz1/b;->a(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    filled-new-array {v1}, [I

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorSchemeColors([I)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lv2/h;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, Lv2/h;-><init>(Lcom/friday/document/view/document/FileListFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/friday/document/databinding/FragmentFileListBinding;

    .line 35
    .line 36
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentFileListBinding;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 48
    .line 49
    .line 50
    new-instance v1, Lcom/friday/document/view/document/FileListFragment$initView$2$1;

    .line 51
    .line 52
    invoke-direct {v1, v0}, Lcom/friday/document/view/document/FileListFragment$initView$2$1;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/friday/document/view/document/FileListFragment;->l:Lcom/friday/document/adapter/DocumentAdapter;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lcom/friday/document/view/document/FileListFragment;->l:Lcom/friday/document/adapter/DocumentAdapter;

    .line 64
    .line 65
    new-instance v1, Lv2/i;

    .line 66
    .line 67
    invoke-direct {v1, p0}, Lv2/i;-><init>(Lcom/friday/document/view/document/FileListFragment;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroidx/paging/PagingDataAdapter;->addLoadStateListener(Lhd/l;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lcom/friday/document/view/document/FileListFragment;->l:Lcom/friday/document/adapter/DocumentAdapter;

    .line 74
    .line 75
    new-instance v1, Lv2/j;

    .line 76
    .line 77
    invoke-direct {v1, p0}, Lv2/j;-><init>(Lcom/friday/document/view/document/FileListFragment;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lcom/friday/document/adapter/DocumentAdapter;->q(Lhd/p;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lcom/friday/document/view/document/FileListFragment;->l:Lcom/friday/document/adapter/DocumentAdapter;

    .line 84
    .line 85
    new-instance v1, Lv2/k;

    .line 86
    .line 87
    invoke-direct {v1, p0}, Lv2/k;-><init>(Lcom/friday/document/view/document/FileListFragment;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Lcom/friday/document/adapter/DocumentAdapter;->r(Lhd/l;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final x()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/document/FileListFragment;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()Landroidx/recyclerview/widget/RecyclerView;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/FragmentFileListBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentFileListBinding;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    const-string v1, "recyclerView"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final z()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/FragmentFileListBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentFileListBinding;->e:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 8
    .line 9
    const-string v1, "refreshLayout"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
