.class public final Lcom/friday/document/view/document/NewestFragment;
.super Lcom/friday/document/view/document/Hilt_NewestFragment;
.source "SourceFile"

# interfaces
.implements Lj2/c;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/document/Hilt_NewestFragment<",
        "Lcom/friday/document/viewmodel/NewestViewModel;",
        "Lcom/friday/document/adapter/DocumentAdapter;",
        "Lcom/friday/document/databinding/DocumentFragmentBinding;",
        ">;",
        "Lj2/c;"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/document/Hilt_NewestFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic R(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/document/adapter/a;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/document/view/document/NewestFragment;->j0(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/document/adapter/a;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Lcom/friday/document/view/document/NewestFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/NewestFragment;->g0(Lcom/friday/document/view/document/NewestFragment;Ljava/lang/Boolean;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T(Lcom/friday/document/view/document/NewestFragment;Ljava/util/List;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/NewestFragment;->d0(Lcom/friday/document/view/document/NewestFragment;Ljava/util/List;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic U(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/common/entity/UpdateSpecifiedItem;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/NewestFragment;->e0(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/common/entity/UpdateSpecifiedItem;)V

    return-void
.end method

.method public static synthetic V(Lcom/friday/document/view/document/NewestFragment;Landroidx/paging/CombinedLoadStates;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/NewestFragment;->i0(Lcom/friday/document/view/document/NewestFragment;Landroidx/paging/CombinedLoadStates;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic W(Lcom/friday/document/view/document/NewestFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/NewestFragment;->l0(Lcom/friday/document/view/document/NewestFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    return-void
.end method

.method public static synthetic X(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/NewestFragment;->f0(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Y(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/NewestFragment;->b0(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/NewestFragment;->k0(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method private final a0(Lcom/friday/common/entity/FileEntity;)V
    .locals 5

    .line 1
    new-instance v0, Lpb/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "requireContext(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-direct {v0, v1, v4, v2, v3}, Lpb/d;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/n;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lv2/g0;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1}, Lv2/g0;-><init>(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/common/entity/FileEntity;)V

    .line 21
    .line 22
    .line 23
    const-string p1, "\u5373\u5c06\u5220\u9664\u8be5\u7b14\u8bb0\u6587\u4ef6\uff0c\u5e76\u4ece\u670d\u52a1\u5668\u91cd\u65b0\u83b7\u53d6\u3002\u672a\u6210\u529f\u540c\u6b65\u5230\u670d\u52a1\u5668\u7684\u6587\u4ef6\u5185\u5bb9\u5c06\u65e0\u6cd5\u627e\u56de"

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {v0, p1, v2, v1, v2}, Lpb/d;->g(Ljava/lang/String;ZLhd/a;Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final b0(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/NewestViewModel;->H0(Lcom/friday/common/entity/FileEntity;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p0
.end method

.method private final c0(Ljava/util/List;)V
    .locals 5

    .line 1
    new-instance v0, Lpb/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "requireContext(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-direct {v0, v1, v4, v2, v3}, Lpb/d;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/n;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lv2/f0;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1}, Lv2/f0;-><init>(Lcom/friday/document/view/document/NewestFragment;Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    const-string p1, "\u5185\u5bb9\u5c06\u88ab\u5220\u9664\uff0c\u53ef\u5728\u56de\u6536\u7ad9\u4e2d\u6062\u590d"

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {v0, p1, v2, v1, v2}, Lpb/d;->g(Ljava/lang/String;ZLhd/a;Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final d0(Lcom/friday/document/view/document/NewestFragment;Ljava/util/List;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->n0(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final e0(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/common/entity/UpdateSpecifiedItem;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/friday/common/entity/UpdateSpecifiedItem;->getFromPage()Lcom/friday/common/entity/FromPage;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/friday/common/entity/FromPage;->FROM_NEWEST:Lcom/friday/common/entity/FromPage;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/friday/common/entity/UpdateSpecifiedItem;->getFileId()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->s0(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public static final f0(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v2, 0x31

    .line 15
    .line 16
    if-eq v1, v2, :cond_4

    .line 17
    .line 18
    const/16 v2, 0x36

    .line 19
    .line 20
    if-eq v1, v2, :cond_2

    .line 21
    .line 22
    const/16 v2, 0x621

    .line 23
    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const-string v1, "12"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_5

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const-string v1, "6"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    invoke-virtual {p0, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->A(Lcom/friday/common/entity/FileEntity;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_4
    const-string v1, "1"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_5
    invoke-virtual {p0, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->z(Lcom/friday/common/entity/FileEntity;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 66
    .line 67
    iget-object v0, v0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 68
    .line 69
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 70
    .line 71
    const-string v1, "recyclerView"

    .line 72
    .line 73
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p0, v0, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->N(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 84
    .line 85
    return-object p0
.end method

.method public static final g0(Lcom/friday/document/view/document/NewestFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 12
    .line 13
    iget-object p0, p0, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->j:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 23
    .line 24
    return-object p0
.end method

.method public static final i0(Lcom/friday/document/view/document/NewestFragment;Landroidx/paging/CombinedLoadStates;)Lqc/q;
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
    check-cast v0, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->c:Landroid/widget/TextView;

    .line 15
    .line 16
    const-string v1, "emptyView"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/paging/CombinedLoadStates;->getSource()Landroidx/paging/LoadStates;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Landroidx/paging/LoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    instance-of v1, v1, Landroidx/paging/LoadState$NotLoading;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/paging/CombinedLoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Landroidx/paging/LoadState;->getEndOfPaginationReached()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->D()Landroidx/paging/PagingDataAdapter;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Lcom/friday/document/adapter/DocumentAdapter;

    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/paging/PagingDataAdapter;->getItemCount()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    const/4 p1, 0x1

    .line 55
    if-ge p0, p1, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move p1, v2

    .line 59
    :goto_0
    if-eqz p1, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const/16 v2, 0x8

    .line 63
    .line 64
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 68
    .line 69
    return-object p0
.end method

.method public static final j0(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/document/adapter/a;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 11

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
    sget-object v0, Lcom/friday/document/adapter/a$d;->b:Lcom/friday/document/adapter/a$d;

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p0, p1, v0, p2}, Lcom/friday/document/view/document/BaseDocumentFragment;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :cond_0
    sget-object v0, Lcom/friday/document/adapter/a$c;->b:Lcom/friday/document/adapter/a$c;

    .line 37
    .line 38
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isConnected()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    sget-object v0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string p0, "requireActivity(...)"

    .line 57
    .line 58
    invoke-static {v1, p0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    const/16 v9, 0xf8

    .line 70
    .line 71
    const/4 v10, 0x0

    .line 72
    const/4 v4, 0x0

    .line 73
    const/4 v5, 0x0

    .line 74
    const/4 v6, 0x0

    .line 75
    const/4 v7, 0x0

    .line 76
    const/4 v8, 0x0

    .line 77
    invoke-static/range {v0 .. v10}, Lcom/friday/common/helper/c;->b(Lcom/friday/common/helper/c;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;ZZLjava/util/ArrayList;ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_0

    .line 81
    .line 82
    :cond_1
    const-string p0, "\u5f53\u524d\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8fde\u63a5\u540e\u518d\u6b21\u5c1d\u8bd5"

    .line 83
    .line 84
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_0

    .line 88
    .line 89
    :cond_2
    sget-object v0, Lcom/friday/document/adapter/a$b;->b:Lcom/friday/document/adapter/a$b;

    .line 90
    .line 91
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_3

    .line 102
    .line 103
    const-string p0, "\u8bf7\u7b49\u5f85\u7b14\u8bb0\u540c\u6b65\u5b8c\u6210\u540e\u518d\u5220\u9664"

    .line 104
    .line 105
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_3
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p1}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-direct {p0, p1}, Lcom/friday/document/view/document/NewestFragment;->c0(Ljava/util/List;)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_4
    sget-object v0, Lcom/friday/document/adapter/a$f;->b:Lcom/friday/document/adapter/a$f;

    .line 122
    .line 123
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_5

    .line 128
    .line 129
    invoke-direct {p0, p2}, Lcom/friday/document/view/document/NewestFragment;->a0(Lcom/friday/common/entity/FileEntity;)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_5
    sget-object v0, Lcom/friday/document/adapter/a$a;->b:Lcom/friday/document/adapter/a$a;

    .line 134
    .line 135
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_7

    .line 140
    .line 141
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    check-cast p1, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 146
    .line 147
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->h0()Landroidx/lifecycle/LiveData;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 156
    .line 157
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eqz p1, :cond_6

    .line 162
    .line 163
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 168
    .line 169
    invoke-virtual {p0, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel;->z0(Lcom/friday/common/entity/FileEntity;)V

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_6
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    check-cast p0, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 178
    .line 179
    invoke-virtual {p0, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel;->t0(Lcom/friday/common/entity/FileEntity;)V

    .line 180
    .line 181
    .line 182
    goto :goto_0

    .line 183
    :cond_7
    sget-object v0, Lcom/friday/document/adapter/a$e;->b:Lcom/friday/document/adapter/a$e;

    .line 184
    .line 185
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-eqz p1, :cond_8

    .line 190
    .line 191
    const-string p1, "NewestFragment.kt->  DocumentOption.SyncRetry\uff0c\u5355\u4e2a\u540c\u6b65\u6587\u4ef6"

    .line 192
    .line 193
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    check-cast p0, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 205
    .line 206
    invoke-virtual {p0, p2}, Lcom/friday/document/viewmodel/NewestViewModel;->J0(Lcom/friday/common/entity/FileEntity;)V

    .line 207
    .line 208
    .line 209
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 210
    .line 211
    return-object p0

    .line 212
    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 213
    .line 214
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 215
    .line 216
    .line 217
    throw p0
.end method

.method public static final k0(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "fileEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, v0, p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->w0(ZLcom/friday/common/entity/FileEntity;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 17
    .line 18
    return-object p0
.end method

.method public static final l0(Lcom/friday/document/view/document/NewestFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->y()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->isRefreshing()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->A0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->document_fragment:I

    .line 2
    .line 3
    return v0
.end method

.method public final h0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lcom/friday/document/view/document/NewestFragment$initRecyclerView$1$1;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lcom/friday/document/view/document/NewestFragment$initRecyclerView$1$1;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->D()Landroidx/paging/PagingDataAdapter;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->D()Landroidx/paging/PagingDataAdapter;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lcom/friday/document/adapter/DocumentAdapter;

    .line 43
    .line 44
    new-instance v1, Lv2/c0;

    .line 45
    .line 46
    invoke-direct {v1, p0}, Lv2/c0;-><init>(Lcom/friday/document/view/document/NewestFragment;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroidx/paging/PagingDataAdapter;->addLoadStateListener(Lhd/l;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->D()Landroidx/paging/PagingDataAdapter;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lcom/friday/document/adapter/DocumentAdapter;

    .line 57
    .line 58
    new-instance v1, Lv2/d0;

    .line 59
    .line 60
    invoke-direct {v1, p0}, Lv2/d0;-><init>(Lcom/friday/document/view/document/NewestFragment;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lcom/friday/document/adapter/DocumentAdapter;->q(Lhd/p;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->D()Landroidx/paging/PagingDataAdapter;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Lcom/friday/document/adapter/DocumentAdapter;

    .line 71
    .line 72
    new-instance v1, Lv2/e0;

    .line 73
    .line 74
    invoke-direct {v1, p0}, Lv2/e0;-><init>(Lcom/friday/document/view/document/NewestFragment;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Lcom/friday/document/adapter/DocumentAdapter;->r(Lhd/l;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public initData()V
    .locals 3

    .line 1
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "requireActivity(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    .line 13
    .line 14
    .line 15
    const-class v1, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lcom/friday/document/view/document/BaseDocumentFragment;->P(Lcom/friday/document/viewmodel/BaseFileViewModel;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Lcom/friday/document/adapter/DocumentAdapter;

    .line 27
    .line 28
    invoke-direct {v0}, Lcom/friday/document/adapter/DocumentAdapter;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/friday/document/view/document/BaseDocumentFragment;->O(Landroidx/paging/PagingDataAdapter;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->F()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/friday/document/view/document/NewestFragment;->h0()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/friday/document/view/document/NewestFragment;->initView()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/friday/document/view/document/NewestFragment;->initDataSource()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 51
    .line 52
    iget-object v0, v0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 53
    .line 54
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->e:Landroidx/appcompat/widget/AppCompatImageView;

    .line 55
    .line 56
    const/16 v1, 0x8

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 66
    .line 67
    iget-object v0, v0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 68
    .line 69
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->m:Landroidx/appcompat/widget/AppCompatTextView;

    .line 70
    .line 71
    sget v1, Lcom/friday/document/R$string;->newest:I

    .line 72
    .line 73
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    const-string v0, "NewestFragment\u5f00\u59cb\u6267\u884c\u81ea\u52a8\u540c\u6b65\u903b\u8f91------------"

    .line 81
    .line 82
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->N()Lcom/friday/document/service/FileManager;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Lcom/friday/document/service/FileManager;->E()V

    .line 100
    .line 101
    .line 102
    const/4 v0, 0x1

    .line 103
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->A0()V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public initDataSource()V
    .locals 10

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseFragment;->initDataSource()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->F()Landroidx/lifecycle/LiveData;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Lv2/y;

    .line 19
    .line 20
    invoke-direct {v2, p0}, Lv2/y;-><init>(Lcom/friday/document/view/document/NewestFragment;)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Lcom/friday/document/view/document/NewestFragment$a;

    .line 24
    .line 25
    invoke-direct {v3, v2}, Lcom/friday/document/view/document/NewestFragment$a;-><init>(Lhd/l;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    new-instance v7, Lcom/friday/document/view/document/NewestFragment$initDataSource$2;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-direct {v7, p0, v0}, Lcom/friday/document/view/document/NewestFragment$initDataSource$2;-><init>(Lcom/friday/document/view/document/NewestFragment;Lvc/c;)V

    .line 39
    .line 40
    .line 41
    const/4 v8, 0x3

    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-static/range {v4 .. v9}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->j0()Landroidx/lifecycle/MutableLiveData;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    new-instance v3, Lv2/z;

    .line 63
    .line 64
    invoke-direct {v3, p0}, Lv2/z;-><init>(Lcom/friday/document/view/document/NewestFragment;)V

    .line 65
    .line 66
    .line 67
    new-instance v4, Lcom/friday/document/view/document/NewestFragment$a;

    .line 68
    .line 69
    invoke-direct {v4, v3}, Lcom/friday/document/view/document/NewestFragment$a;-><init>(Lhd/l;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2, v4}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 73
    .line 74
    .line 75
    const-string v1, "UpdateSelectedNote"

    .line 76
    .line 77
    const-class v2, Lcom/friday/common/entity/UpdateSpecifiedItem;

    .line 78
    .line 79
    invoke-static {v1, v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    new-instance v2, Lv2/a0;

    .line 84
    .line 85
    invoke-direct {v2, p0}, Lv2/a0;-><init>(Lcom/friday/document/view/document/NewestFragment;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v1, p0, v2}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    const-string v2, "getViewLifecycleOwner(...)"

    .line 96
    .line 97
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    new-instance v6, Lcom/friday/document/view/document/NewestFragment$initDataSource$5;

    .line 105
    .line 106
    invoke-direct {v6, p0, v0}, Lcom/friday/document/view/document/NewestFragment$initDataSource$5;-><init>(Lcom/friday/document/view/document/NewestFragment;Lvc/c;)V

    .line 107
    .line 108
    .line 109
    const/4 v7, 0x3

    .line 110
    const/4 v8, 0x0

    .line 111
    const/4 v4, 0x0

    .line 112
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public initView()V
    .locals 8

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseFragment;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->h0()Landroidx/lifecycle/LiveData;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Lcom/friday/document/databinding/DocumentFragmentBinding;->a(Landroidx/lifecycle/LiveData;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->i0()Landroidx/lifecycle/LiveData;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Lcom/friday/document/databinding/DocumentFragmentBinding;->c(Landroidx/lifecycle/LiveData;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->M()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sget v1, Lcom/friday/document/R$id;->fragment_preview:I

    .line 67
    .line 68
    new-instance v2, Lcom/friday/document/view/NewestPreviewFragment;

    .line 69
    .line 70
    invoke-direct {v2}, Lcom/friday/document/view/NewestPreviewFragment;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 85
    .line 86
    iget-object v0, v0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 87
    .line 88
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->j:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 89
    .line 90
    sget v1, Lcom/friday/document/R$color;->colorAccent:I

    .line 91
    .line 92
    invoke-static {v1}, Lz1/b;->a(I)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    filled-new-array {v1}, [I

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorSchemeColors([I)V

    .line 101
    .line 102
    .line 103
    new-instance v1, Lv2/b0;

    .line 104
    .line 105
    invoke-direct {v1, p0, v0}, Lv2/b0;-><init>(Lcom/friday/document/view/document/NewestFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 116
    .line 117
    iget-object v0, v0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 118
    .line 119
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->f:Landroidx/appcompat/widget/AppCompatImageView;

    .line 120
    .line 121
    const-string v1, "ivSearch"

    .line 122
    .line 123
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    check-cast v1, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 131
    .line 132
    iget-object v1, v1, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 133
    .line 134
    iget-object v1, v1, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->e:Landroidx/appcompat/widget/AppCompatImageView;

    .line 135
    .line 136
    const-string v2, "ivMore"

    .line 137
    .line 138
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    check-cast v2, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 146
    .line 147
    iget-object v2, v2, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 148
    .line 149
    iget-object v2, v2, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 150
    .line 151
    const-string v3, "ivSync"

    .line 152
    .line 153
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    const/4 v3, 0x3

    .line 157
    new-array v4, v3, [Landroid/view/View;

    .line 158
    .line 159
    const/4 v5, 0x0

    .line 160
    aput-object v0, v4, v5

    .line 161
    .line 162
    const/4 v0, 0x1

    .line 163
    aput-object v1, v4, v0

    .line 164
    .line 165
    const/4 v1, 0x2

    .line 166
    aput-object v2, v4, v1

    .line 167
    .line 168
    invoke-virtual {p0, v4}, Lcom/friday/common/base/BaseFragment;->setClickListener([Landroid/view/View;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    check-cast v2, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 176
    .line 177
    iget-object v2, v2, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 178
    .line 179
    iget-object v2, v2, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->n:Landroidx/appcompat/widget/AppCompatTextView;

    .line 180
    .line 181
    const-string v4, "tvMove"

    .line 182
    .line 183
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    check-cast v4, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 191
    .line 192
    iget-object v4, v4, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 193
    .line 194
    iget-object v4, v4, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 195
    .line 196
    const-string v6, "tvDelete"

    .line 197
    .line 198
    invoke-static {v4, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    check-cast v6, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 206
    .line 207
    iget-object v6, v6, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 208
    .line 209
    iget-object v6, v6, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->k:Landroidx/appcompat/widget/AppCompatTextView;

    .line 210
    .line 211
    const-string v7, "tvCancel"

    .line 212
    .line 213
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    new-array v3, v3, [Landroid/view/View;

    .line 217
    .line 218
    aput-object v2, v3, v5

    .line 219
    .line 220
    aput-object v4, v3, v0

    .line 221
    .line 222
    aput-object v6, v3, v1

    .line 223
    .line 224
    invoke-virtual {p0, v3}, Lcom/friday/common/base/BaseFragment;->setClickListener([Landroid/view/View;)V

    .line 225
    .line 226
    .line 227
    return-void
.end method

.method public j()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {v0, v3, v1, v2, v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->x0(Lcom/friday/document/viewmodel/BaseFileViewModel;ZLcom/friday/common/entity/FileEntity;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/friday/common/base/BaseFragment;->onClick(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    new-instance v5, Lcom/friday/document/view/document/NewestFragment$onClick$1;

    .line 31
    .line 32
    invoke-direct {v5, p0, v1}, Lcom/friday/document/view/document/NewestFragment$onClick$1;-><init>(Lcom/friday/document/view/document/NewestFragment;Lvc/c;)V

    .line 33
    .line 34
    .line 35
    const/4 v6, 0x3

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 48
    .line 49
    iget-object v0, v0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 50
    .line 51
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->f:Landroidx/appcompat/widget/AppCompatImageView;

    .line 52
    .line 53
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    sget-object p1, Lk2/v;->a:Lk2/v$a;

    .line 60
    .line 61
    const-string v0, "Search"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    sget-object p1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/friday/common/helper/c;->n()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 77
    .line 78
    iget-object v0, v0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 79
    .line 80
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->n:Landroidx/appcompat/widget/AppCompatTextView;

    .line 81
    .line 82
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isConnected()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_2

    .line 93
    .line 94
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const-string v0, "getViewLifecycleOwner(...)"

    .line 99
    .line 100
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    new-instance v5, Lcom/friday/document/view/document/NewestFragment$onClick$2;

    .line 108
    .line 109
    invoke-direct {v5, p0, v1}, Lcom/friday/document/view/document/NewestFragment$onClick$2;-><init>(Lcom/friday/document/view/document/NewestFragment;Lvc/c;)V

    .line 110
    .line 111
    .line 112
    const/4 v6, 0x3

    .line 113
    const/4 v7, 0x0

    .line 114
    const/4 v3, 0x0

    .line 115
    const/4 v4, 0x0

    .line 116
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_2
    const-string p1, "\u5f53\u524d\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8fde\u63a5\u540e\u518d\u6b21\u5c1d\u8bd5"

    .line 121
    .line 122
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_3
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 131
    .line 132
    iget-object v0, v0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 133
    .line 134
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 135
    .line 136
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    check-cast p1, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 147
    .line 148
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->V()Lvd/u;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-interface {p1}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    check-cast p1, Ljava/util/List;

    .line 157
    .line 158
    check-cast p1, Ljava/lang/Iterable;

    .line 159
    .line 160
    instance-of v0, p1, Ljava/util/Collection;

    .line 161
    .line 162
    if-eqz v0, :cond_4

    .line 163
    .line 164
    move-object v0, p1

    .line 165
    check-cast v0, Ljava/util/Collection;

    .line 166
    .line 167
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_4

    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_6

    .line 183
    .line 184
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    check-cast v1, Lcom/friday/common/entity/FileEntity;

    .line 189
    .line 190
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-eqz v1, :cond_5

    .line 195
    .line 196
    const-string p1, "\u5b58\u5728\u672a\u540c\u6b65\u7684\u7b14\u8bb0\uff0c\u8bf7\u7b49\u5f85\u7b14\u8bb0\u540c\u6b65\u5b8c\u6210\u540e\u518d\u5220\u9664"

    .line 197
    .line 198
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_6
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    .line 203
    .line 204
    const/16 v1, 0xa

    .line 205
    .line 206
    invoke-static {p1, v1}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 211
    .line 212
    .line 213
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-eqz v1, :cond_7

    .line 222
    .line 223
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    check-cast v1, Lcom/friday/common/entity/FileEntity;

    .line 228
    .line 229
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    goto :goto_1

    .line 237
    :cond_7
    invoke-direct {p0, v0}, Lcom/friday/document/view/document/NewestFragment;->c0(Ljava/util/List;)V

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :cond_8
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    check-cast v0, Lcom/friday/document/databinding/DocumentFragmentBinding;

    .line 246
    .line 247
    iget-object v0, v0, Lcom/friday/document/databinding/DocumentFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileBrowserBinding;

    .line 248
    .line 249
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutFileBrowserBinding;->k:Landroidx/appcompat/widget/AppCompatTextView;

    .line 250
    .line 251
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    if-eqz p1, :cond_9

    .line 256
    .line 257
    invoke-virtual {p0}, Lcom/friday/document/view/document/NewestFragment;->j()V

    .line 258
    .line 259
    .line 260
    :cond_9
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseFragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/NewestViewModel;->G0()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
