.class public final Lcom/friday/document/view/RecycleBinPreviewFragment;
.super Lcom/friday/document/view/Hilt_RecycleBinPreviewFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/Hilt_RecycleBinPreviewFragment<",
        "Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:Lqc/d;

.field public final j:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/Hilt_RecycleBinPreviewFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lu2/b0;

    .line 5
    .line 6
    invoke-direct {v0}, Lu2/b0;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/friday/document/view/RecycleBinPreviewFragment;->i:Lqc/d;

    .line 14
    .line 15
    const-class v0, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Lcom/friday/document/view/RecycleBinPreviewFragment$special$$inlined$activityViewModels$default$1;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Lcom/friday/document/view/RecycleBinPreviewFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lcom/friday/document/view/RecycleBinPreviewFragment$special$$inlined$activityViewModels$default$2;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v2, v3, p0}, Lcom/friday/document/view/RecycleBinPreviewFragment$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 30
    .line 31
    .line 32
    new-instance v3, Lcom/friday/document/view/RecycleBinPreviewFragment$special$$inlined$activityViewModels$default$3;

    .line 33
    .line 34
    invoke-direct {v3, p0}, Lcom/friday/document/view/RecycleBinPreviewFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/friday/document/view/RecycleBinPreviewFragment;->j:Lqc/d;

    .line 42
    .line 43
    return-void
.end method

.method public static synthetic A(Lcom/friday/document/view/RecycleBinPreviewFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->Y(Lcom/friday/document/view/RecycleBinPreviewFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    return-void
.end method

.method public static final synthetic B(Lcom/friday/document/view/RecycleBinPreviewFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->L()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic C(Lcom/friday/document/view/RecycleBinPreviewFragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/friday/common/entity/FileEntity;)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/friday/document/view/RecycleBinPreviewFragment;->M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/friday/common/entity/FileEntity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic D(Lcom/friday/document/view/RecycleBinPreviewFragment;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->P(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic E(Lcom/friday/document/view/RecycleBinPreviewFragment;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/RecycleBinPreviewFragment;->Q(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic F(Lcom/friday/document/view/RecycleBinPreviewFragment;)Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final synthetic G(Lcom/friday/document/view/RecycleBinPreviewFragment;)Lcom/friday/document/adapter/PreviewAdapter;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->R()Lcom/friday/document/adapter/PreviewAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic H(Lcom/friday/document/view/RecycleBinPreviewFragment;)Lcom/friday/document/viewmodel/RecycleBinViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->S()Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic I(Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->b0(Lcom/friday/common/entity/FileEntity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic J(Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->e0(Lcom/friday/common/entity/FileEntity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final K()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->S()Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->t0(Lcom/friday/common/entity/FileEntity;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final L()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->c:Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/16 v1, 0x8

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 39
    .line 40
    iget-object v0, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public static final N(Lcom/friday/document/view/RecycleBinPreviewFragment;ZLcom/friday/common/entity/FileEntity;Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$3$1;

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    invoke-direct {v3, p1, p0, p2, p3}, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$3$1;-><init>(ZLcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

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
    return-void
.end method

.method public static final O(Lcom/friday/document/view/RecycleBinPreviewFragment;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FileEntity;Landroid/view/View;)V
    .locals 8

    .line 1
    move-object v5, p0

    .line 2
    invoke-static {v5}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    new-instance v0, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;

    .line 7
    .line 8
    const/4 v7, 0x0

    .line 9
    move v1, p1

    .line 10
    move-object v2, p2

    .line 11
    move-object v3, p3

    .line 12
    move-object v4, p4

    .line 13
    move-object v6, p5

    .line 14
    invoke-direct/range {v0 .. v7}, Lcom/friday/document/view/RecycleBinPreviewFragment$displayOthers$4$1;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    move-object p3, v0

    .line 18
    const/4 p4, 0x3

    .line 19
    const/4 p5, 0x0

    .line 20
    const/4 p1, 0x0

    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-static/range {p0 .. p5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private final P(Ljava/util/List;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 6
    .line 7
    iget-object v1, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "getRoot(...)"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 19
    .line 20
    iget-object v3, v3, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 21
    .line 22
    const-string v4, "rvNote"

    .line 23
    .line 24
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v4, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 28
    .line 29
    iget-object v4, v4, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->g:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 30
    .line 31
    const-string v5, "refreshImage"

    .line 32
    .line 33
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v5, 0x3

    .line 37
    new-array v6, v5, [Landroid/view/View;

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    aput-object v1, v6, v7

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    aput-object v3, v6, v1

    .line 44
    .line 45
    const/4 v3, 0x2

    .line 46
    aput-object v4, v6, v3

    .line 47
    .line 48
    invoke-direct {p0, v6}, Lcom/friday/document/view/RecycleBinPreviewFragment;->d0([Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    iget-object v4, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 52
    .line 53
    invoke-virtual {v4}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-static {v4, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object v6, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->c:Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;

    .line 61
    .line 62
    invoke-virtual {v6}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-static {v6, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v8, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 70
    .line 71
    iget-object v8, v8, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->i:Landroidx/core/widget/NestedScrollView;

    .line 72
    .line 73
    const-string v9, "scrollView"

    .line 74
    .line 75
    invoke-static {v8, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v9, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 79
    .line 80
    invoke-virtual {v9}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    invoke-static {v9, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-object v10, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->c:Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;

    .line 88
    .line 89
    invoke-virtual {v10}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    invoke-static {v10, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const/4 v2, 0x5

    .line 97
    new-array v2, v2, [Landroid/view/View;

    .line 98
    .line 99
    aput-object v4, v2, v7

    .line 100
    .line 101
    aput-object v6, v2, v1

    .line 102
    .line 103
    aput-object v8, v2, v3

    .line 104
    .line 105
    aput-object v9, v2, v5

    .line 106
    .line 107
    const/4 v1, 0x4

    .line 108
    aput-object v10, v2, v1

    .line 109
    .line 110
    invoke-direct {p0, v2}, Lcom/friday/document/view/RecycleBinPreviewFragment;->c0([Landroid/view/View;)V

    .line 111
    .line 112
    .line 113
    iget-object v0, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 114
    .line 115
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 116
    .line 117
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->R()Lcom/friday/document/adapter/PreviewAdapter;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public static final T(Lcom/friday/document/view/RecycleBinPreviewFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/common/widget/dialog/FBIWarningDialog;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/friday/common/widget/dialog/FBIWarningDialog;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-class v0, Lcom/friday/common/widget/dialog/FBIWarningDialog;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, p0, v0}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final U(Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final V(Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p1, p0, v1}, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/view/RecycleBinPreviewFragment;Lvc/c;)V

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
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 18
    .line 19
    return-object p0
.end method

.method public static final W(Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    new-instance v3, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->isDir(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    :try_start_0
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getZipFilePath()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    new-instance v4, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/ZipUtils;->unzipFile(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catch_0
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance v2, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 91
    .line 92
    .line 93
    const-string p0, "\u5fae\u8bfe\u6587\u4ef6\u89e3\u538b\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5"

    .line 94
    .line 95
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    .line 98
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 99
    .line 100
    return-object p0

    .line 101
    :cond_0
    :goto_0
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 102
    .line 103
    .line 104
    sget-object p0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p0, p1}, Lcom/friday/common/helper/c;->t(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_1
    invoke-direct {p0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->K()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 137
    .line 138
    .line 139
    :goto_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 140
    .line 141
    return-object p0
.end method

.method public static final X(Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 4

    .line 1
    const-string v0, "ivCover"

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 10
    .line 11
    iget-object v1, v1, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 12
    .line 13
    iget-object v1, v1, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/io/File;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p1, ".jpg"

    .line 40
    .line 41
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance v2, Lw/g$a;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-direct {v2, v3}, Lw/g$a;-><init>(Landroid/content/Context;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v0}, Lw/g$a;->d(Ljava/lang/Object;)Lw/g$a;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0, v1}, Lw/j;->q(Lw/g$a;Landroid/widget/ImageView;)Lw/g$a;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sget-object v1, Lcoil3/request/CachePolicy;->h:Lcoil3/request/CachePolicy;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lw/g$a;->k(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Lw/g$a;->f(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lw/g$a;->l(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 85
    .line 86
    .line 87
    sget v1, Lcom/friday/document/R$drawable;->icon_micor_class_normal:I

    .line 88
    .line 89
    invoke-static {v0, v1}, Lw/j;->b(Lw/g$a;I)Lw/g$a;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lw/g$a;->c()Lw/g;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {p1, v0}, Lcoil3/e;->c(Lw/g;)Lw/c;

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 105
    .line 106
    iget-object p1, p1, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 107
    .line 108
    iget-object p1, p1, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 109
    .line 110
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    sget v0, Lcom/friday/document/R$drawable;->icon_micor_class_normal:I

    .line 114
    .line 115
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-static {v1}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    new-instance v2, Lw/g$a;

    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-direct {v2, v3}, Lw/g$a;-><init>(Landroid/content/Context;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v0}, Lw/g$a;->d(Ljava/lang/Object;)Lw/g$a;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v0, p1}, Lw/j;->q(Lw/g$a;Landroid/widget/ImageView;)Lw/g$a;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p1}, Lw/g$a;->c()Lw/g;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-interface {v1, p1}, Lcoil3/e;->c(Lw/g;)Lw/c;

    .line 149
    .line 150
    .line 151
    :goto_0
    const/4 p1, 0x0

    .line 152
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 153
    .line 154
    .line 155
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 156
    .line 157
    return-object p0
.end method

.method public static final Y(Lcom/friday/document/view/RecycleBinPreviewFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->R()Lcom/friday/document/adapter/PreviewAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/friday/document/adapter/PreviewAdapter;->d()V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    invoke-virtual {p1, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final Z()Lcom/friday/document/adapter/PreviewAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/document/adapter/PreviewAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/document/adapter/PreviewAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final a0(Lcom/friday/document/view/RecycleBinPreviewFragment;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;)Lqc/q;
    .locals 4

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "popupWindow"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "binding"

    .line 12
    .line 13
    invoke-static {p3, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->S()Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->W()Lcom/friday/common/entity/FileEntity;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    iget-object v0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->f:Landroid/widget/TextView;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getUpdateTime()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v3, "\u4fee\u6539\u65f6\u95f4\uff1a"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->e:Landroid/widget/TextView;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getCreateTime()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v2, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string v3, "\u521b\u5efa\u65f6\u95f4\uff1a"

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->syncUncompleted()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    iget-object v0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->d:Landroid/widget/LinearLayout;

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->h:Landroid/widget/TextView;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->isFailedState()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_0

    .line 100
    .line 101
    iget-object p0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->c:Landroid/widget/ImageView;

    .line 102
    .line 103
    sget p1, Lcom/friday/document/R$drawable;->icon_sync_failed:I

    .line 104
    .line 105
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 106
    .line 107
    .line 108
    iget-object p0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->g:Landroid/widget/TextView;

    .line 109
    .line 110
    const-string p1, "\u6587\u4ef6\u540c\u6b65\u5931\u8d25"

    .line 111
    .line 112
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    iget-object p0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->g:Landroid/widget/TextView;

    .line 116
    .line 117
    const/high16 p1, -0x10000

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_0
    iget-object p1, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->c:Landroid/widget/ImageView;

    .line 124
    .line 125
    sget v0, Lcom/friday/document/R$drawable;->icon_to_be_synced:I

    .line 126
    .line 127
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 128
    .line 129
    .line 130
    iget-object p1, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->g:Landroid/widget/TextView;

    .line 131
    .line 132
    const-string v0, "\u6587\u4ef6\u7b49\u5f85\u540c\u6b65"

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->g:Landroid/widget/TextView;

    .line 138
    .line 139
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    sget p3, Lcom/friday/document/R$color;->app_l_dark:I

    .line 144
    .line 145
    invoke-static {p0, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_1
    iget-object p0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->d:Landroid/widget/LinearLayout;

    .line 154
    .line 155
    const/16 p1, 0x8

    .line 156
    .line 157
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 158
    .line 159
    .line 160
    iget-object p0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->h:Landroid/widget/TextView;

    .line 161
    .line 162
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 163
    .line 164
    .line 165
    :cond_2
    :goto_0
    invoke-virtual {p2}, Landroid/widget/PopupWindow;->dismiss()V

    .line 166
    .line 167
    .line 168
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 169
    .line 170
    return-object p0
.end method

.method private final varargs c0([Landroid/view/View;)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method private final varargs d0([Landroid/view/View;)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_0

    .line 5
    .line 6
    aget-object v3, p1, v2

    .line 7
    .line 8
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    add-int/lit8 v2, v2, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void
.end method

.method private final e0(Lcom/friday/common/entity/FileEntity;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->syncUncompleted()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 12
    .line 13
    iget-object p1, p1, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->e:Landroid/widget/ImageView;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget v1, Lcom/friday/document/R$drawable;->ic_error_note_info:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 35
    .line 36
    iget-object p1, p1, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 37
    .line 38
    iget-object p1, p1, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->g:Landroid/widget/ImageView;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget v1, Lcom/friday/document/R$drawable;->ic_error_note_info:I

    .line 45
    .line 46
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 59
    .line 60
    iget-object p1, p1, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 61
    .line 62
    iget-object p1, p1, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->e:Landroid/widget/ImageView;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sget v1, Lcom/friday/document/R$mipmap;->icon_note_info:I

    .line 69
    .line 70
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 82
    .line 83
    iget-object p1, p1, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 84
    .line 85
    iget-object p1, p1, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->g:Landroid/widget/ImageView;

    .line 86
    .line 87
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sget v1, Lcom/friday/document/R$mipmap;->icon_note_info:I

    .line 92
    .line 93
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public static synthetic r(Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->X(Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s()Lcom/friday/document/adapter/PreviewAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/document/view/RecycleBinPreviewFragment;->Z()Lcom/friday/document/adapter/PreviewAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic t(Lcom/friday/document/view/RecycleBinPreviewFragment;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/document/view/RecycleBinPreviewFragment;->a0(Lcom/friday/document/view/RecycleBinPreviewFragment;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->U(Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lcom/friday/document/view/RecycleBinPreviewFragment;ZLcom/friday/common/entity/FileEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/document/view/RecycleBinPreviewFragment;->N(Lcom/friday/document/view/RecycleBinPreviewFragment;ZLcom/friday/common/entity/FileEntity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic w(Lcom/friday/document/view/RecycleBinPreviewFragment;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FileEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/friday/document/view/RecycleBinPreviewFragment;->O(Lcom/friday/document/view/RecycleBinPreviewFragment;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FileEntity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic x(Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->V(Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lcom/friday/document/view/RecycleBinPreviewFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->T(Lcom/friday/document/view/RecycleBinPreviewFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic z(Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->W(Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/friday/common/entity/FileEntity;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v6, p5

    .line 6
    .line 7
    const-string v0, "11"

    .line 8
    .line 9
    invoke-virtual {v6}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sget-object v2, Lk2/n;->a:Lk2/n$a;

    .line 18
    .line 19
    move-object/from16 v5, p3

    .line 20
    .line 21
    invoke-virtual {v2, v5}, Lk2/n$a;->c(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {v1}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 30
    .line 31
    iget-object v4, v4, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 32
    .line 33
    iget-object v4, v4, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->f:Landroid/widget/ImageView;

    .line 34
    .line 35
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 43
    .line 44
    iget-object v2, v2, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 45
    .line 46
    invoke-virtual {v2}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const/16 v4, 0x8

    .line 51
    .line 52
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 60
    .line 61
    iget-object v2, v2, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->c:Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;

    .line 62
    .line 63
    invoke-virtual {v2}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 75
    .line 76
    iget-object v2, v2, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 77
    .line 78
    invoke-virtual {v2}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    const/4 v4, 0x0

    .line 83
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    .line 86
    const/4 v7, 0x3

    .line 87
    const/4 v8, 0x1

    .line 88
    const-string v9, "ivCoverIcon"

    .line 89
    .line 90
    const-string v10, "microClassName"

    .line 91
    .line 92
    const-string v11, "ivLogo"

    .line 93
    .line 94
    const-string v12, "tvName"

    .line 95
    .line 96
    const-string v13, "ivCover"

    .line 97
    .line 98
    const-string v14, "tvView"

    .line 99
    .line 100
    if-eqz v0, :cond_2

    .line 101
    .line 102
    invoke-virtual {v6}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v15

    .line 106
    const/16 v16, 0x2

    .line 107
    .line 108
    invoke-virtual {v6}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    move/from16 v17, v4

    .line 113
    .line 114
    new-instance v4, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v2, ".jpg"

    .line 126
    .line 127
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-static {v2}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-nez v2, :cond_1

    .line 139
    .line 140
    sget-object v2, Lf2/c;->a:Lf2/c;

    .line 141
    .line 142
    invoke-virtual {v2}, Lf2/c;->e()Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-nez v2, :cond_0

    .line 147
    .line 148
    sget v2, Lcom/friday/document/R$string;->connect_network_please:I

    .line 149
    .line 150
    invoke-static {v2}, Lz1/b;->h(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->S()Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    const/4 v4, 0x0

    .line 158
    invoke-virtual {v2, v4}, Lcom/friday/document/viewmodel/BaseFileViewModel;->u0(Lcom/friday/common/entity/FileEntity;)V

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_0
    invoke-virtual {v1, v8}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->S()Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v2, v6}, Lcom/friday/document/viewmodel/BaseFileViewModel;->x(Lcom/friday/common/entity/FileEntity;)V

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_1
    invoke-virtual {v1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->S()Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {v2, v6}, Lcom/friday/document/viewmodel/BaseFileViewModel;->u0(Lcom/friday/common/entity/FileEntity;)V

    .line 178
    .line 179
    .line 180
    :goto_0
    invoke-virtual {v1}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 185
    .line 186
    iget-object v2, v2, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 187
    .line 188
    iget-object v4, v2, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->j:Landroid/widget/TextView;

    .line 189
    .line 190
    invoke-static {v4, v12}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    iget-object v12, v2, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->k:Landroid/widget/TextView;

    .line 194
    .line 195
    invoke-static {v12, v14}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    iget-object v15, v2, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->f:Landroid/widget/ImageView;

    .line 199
    .line 200
    invoke-static {v15, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    new-array v11, v7, [Landroid/view/View;

    .line 204
    .line 205
    aput-object v4, v11, v17

    .line 206
    .line 207
    aput-object v12, v11, v8

    .line 208
    .line 209
    aput-object v15, v11, v16

    .line 210
    .line 211
    invoke-direct {v1, v11}, Lcom/friday/document/view/RecycleBinPreviewFragment;->c0([Landroid/view/View;)V

    .line 212
    .line 213
    .line 214
    iget-object v4, v2, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 215
    .line 216
    invoke-static {v4, v10}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    iget-object v10, v2, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 220
    .line 221
    invoke-static {v10, v13}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    iget-object v2, v2, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->e:Landroidx/appcompat/widget/AppCompatImageView;

    .line 225
    .line 226
    invoke-static {v2, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    new-array v7, v7, [Landroid/view/View;

    .line 230
    .line 231
    aput-object v4, v7, v17

    .line 232
    .line 233
    aput-object v10, v7, v8

    .line 234
    .line 235
    aput-object v2, v7, v16

    .line 236
    .line 237
    invoke-direct {v1, v7}, Lcom/friday/document/view/RecycleBinPreviewFragment;->d0([Landroid/view/View;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    check-cast v2, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 245
    .line 246
    iget-object v2, v2, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 247
    .line 248
    iget-object v2, v2, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 249
    .line 250
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 251
    .line 252
    .line 253
    goto :goto_1

    .line 254
    :cond_2
    move/from16 v17, v4

    .line 255
    .line 256
    const/16 v16, 0x2

    .line 257
    .line 258
    invoke-virtual {v1}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    check-cast v2, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 263
    .line 264
    iget-object v2, v2, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 265
    .line 266
    iget-object v4, v2, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->k:Landroid/widget/TextView;

    .line 267
    .line 268
    invoke-static {v4, v14}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    iget-object v15, v2, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->j:Landroid/widget/TextView;

    .line 272
    .line 273
    invoke-static {v15, v12}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    iget-object v12, v2, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->f:Landroid/widget/ImageView;

    .line 277
    .line 278
    invoke-static {v12, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    new-array v11, v7, [Landroid/view/View;

    .line 282
    .line 283
    aput-object v4, v11, v17

    .line 284
    .line 285
    aput-object v15, v11, v8

    .line 286
    .line 287
    aput-object v12, v11, v16

    .line 288
    .line 289
    invoke-direct {v1, v11}, Lcom/friday/document/view/RecycleBinPreviewFragment;->d0([Landroid/view/View;)V

    .line 290
    .line 291
    .line 292
    iget-object v4, v2, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 293
    .line 294
    invoke-static {v4, v10}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    iget-object v10, v2, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 298
    .line 299
    invoke-static {v10, v13}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    iget-object v2, v2, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->e:Landroidx/appcompat/widget/AppCompatImageView;

    .line 303
    .line 304
    invoke-static {v2, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    new-array v7, v7, [Landroid/view/View;

    .line 308
    .line 309
    aput-object v4, v7, v17

    .line 310
    .line 311
    aput-object v10, v7, v8

    .line 312
    .line 313
    aput-object v2, v7, v16

    .line 314
    .line 315
    invoke-direct {v1, v7}, Lcom/friday/document/view/RecycleBinPreviewFragment;->c0([Landroid/view/View;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    check-cast v2, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 323
    .line 324
    iget-object v2, v2, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 325
    .line 326
    iget-object v2, v2, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->j:Landroid/widget/TextView;

    .line 327
    .line 328
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    .line 330
    .line 331
    :goto_1
    invoke-virtual {v1}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    check-cast v2, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 336
    .line 337
    iget-object v2, v2, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 338
    .line 339
    iget-object v2, v2, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 340
    .line 341
    invoke-static {v2, v13}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    new-instance v4, Lu2/i0;

    .line 345
    .line 346
    invoke-direct {v4, v1, v0, v6}, Lu2/i0;-><init>(Lcom/friday/document/view/RecycleBinPreviewFragment;ZLcom/friday/common/entity/FileEntity;)V

    .line 347
    .line 348
    .line 349
    const-wide/16 v7, 0x3e8

    .line 350
    .line 351
    invoke-static {v2, v7, v8, v4}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    check-cast v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 359
    .line 360
    iget-object v0, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 361
    .line 362
    iget-object v9, v0, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->k:Landroid/widget/TextView;

    .line 363
    .line 364
    invoke-static {v9, v14}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    new-instance v0, Lu2/j0;

    .line 368
    .line 369
    move-object/from16 v4, p1

    .line 370
    .line 371
    move/from16 v2, p4

    .line 372
    .line 373
    invoke-direct/range {v0 .. v6}, Lu2/j0;-><init>(Lcom/friday/document/view/RecycleBinPreviewFragment;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FileEntity;)V

    .line 374
    .line 375
    .line 376
    invoke-static {v9, v7, v8, v0}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v1}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    check-cast v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 384
    .line 385
    iget-object v0, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 386
    .line 387
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->k:Landroid/widget/TextView;

    .line 388
    .line 389
    sget v2, Lcom/friday/document/R$string;->others_play:I

    .line 390
    .line 391
    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 396
    .line 397
    .line 398
    return-void
.end method

.method public final Q(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 6
    .line 7
    iget-object v1, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "getRoot(...)"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 19
    .line 20
    iget-object v3, v3, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->i:Landroidx/core/widget/NestedScrollView;

    .line 21
    .line 22
    const-string v4, "scrollView"

    .line 23
    .line 24
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    new-array v5, v4, [Landroid/view/View;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    aput-object v1, v5, v6

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    aput-object v3, v5, v1

    .line 35
    .line 36
    invoke-direct {p0, v5}, Lcom/friday/document/view/RecycleBinPreviewFragment;->d0([Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    iget-object v3, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 40
    .line 41
    invoke-virtual {v3}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v5, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->c:Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;

    .line 49
    .line 50
    invoke-virtual {v5}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-static {v5, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object v2, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 58
    .line 59
    iget-object v2, v2, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 60
    .line 61
    const-string v7, "rvNote"

    .line 62
    .line 63
    invoke-static {v2, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 67
    .line 68
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->g:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 69
    .line 70
    const-string v7, "refreshImage"

    .line 71
    .line 72
    invoke-static {v0, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 v7, 0x4

    .line 76
    new-array v7, v7, [Landroid/view/View;

    .line 77
    .line 78
    aput-object v3, v7, v6

    .line 79
    .line 80
    aput-object v5, v7, v1

    .line 81
    .line 82
    aput-object v2, v7, v4

    .line 83
    .line 84
    const/4 v1, 0x3

    .line 85
    aput-object v0, v7, v1

    .line 86
    .line 87
    invoke-direct {p0, v7}, Lcom/friday/document/view/RecycleBinPreviewFragment;->c0([Landroid/view/View;)V

    .line 88
    .line 89
    .line 90
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v1, Lcom/friday/document/view/RecycleBinPreviewFragment$displayTxt$3;

    .line 95
    .line 96
    const/4 v2, 0x0

    .line 97
    invoke-direct {v1, p1, p0, v2}, Lcom/friday/document/view/RecycleBinPreviewFragment$displayTxt$3;-><init>(Ljava/lang/String;Lcom/friday/document/view/RecycleBinPreviewFragment;Lvc/c;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v1, p2}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    if-ne p1, p2, :cond_0

    .line 109
    .line 110
    return-object p1

    .line 111
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 112
    .line 113
    return-object p1
.end method

.method public final R()Lcom/friday/document/adapter/PreviewAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/RecycleBinPreviewFragment;->i:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/adapter/PreviewAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final S()Lcom/friday/document/viewmodel/RecycleBinViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/RecycleBinPreviewFragment;->j:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final b0(Lcom/friday/common/entity/FileEntity;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 6
    .line 7
    iget-object v1, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->k:Landroid/widget/TextView;

    .line 10
    .line 11
    const/16 v2, 0xd

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {v1, v2, v3, v3, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->f:Landroid/widget/ImageView;

    .line 20
    .line 21
    const/16 v2, 0x8

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 27
    .line 28
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->k:Landroid/widget/TextView;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->recycle_preview_fragment:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->initDataSource()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->c:Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;->c:Landroid/widget/ImageView;

    .line 16
    .line 17
    new-instance v1, Lu2/d0;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Lu2/d0;-><init>(Lcom/friday/document/view/RecycleBinPreviewFragment;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 32
    .line 33
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->e:Landroid/widget/ImageView;

    .line 34
    .line 35
    const-string v1, "ivNoteInfo"

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 45
    .line 46
    iget-object v1, v1, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 47
    .line 48
    iget-object v1, v1, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->g:Landroid/widget/ImageView;

    .line 49
    .line 50
    const-string v2, "ivNoteInfoOthers"

    .line 51
    .line 52
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 v2, 0x2

    .line 56
    new-array v2, v2, [Landroid/view/View;

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    aput-object v0, v2, v3

    .line 60
    .line 61
    const/4 v0, 0x1

    .line 62
    aput-object v1, v2, v0

    .line 63
    .line 64
    invoke-virtual {p0, v2}, Lcom/friday/common/base/BaseFragment;->setClickListener([Landroid/view/View;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->S()Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->J()Landroidx/lifecycle/MutableLiveData;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v2, Lu2/e0;

    .line 80
    .line 81
    invoke-direct {v2, p0}, Lu2/e0;-><init>(Lcom/friday/document/view/RecycleBinPreviewFragment;)V

    .line 82
    .line 83
    .line 84
    new-instance v3, Lcom/friday/document/view/RecycleBinPreviewFragment$a;

    .line 85
    .line 86
    invoke-direct {v3, v2}, Lcom/friday/document/view/RecycleBinPreviewFragment$a;-><init>(Lhd/l;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->S()Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->F()Landroidx/lifecycle/LiveData;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    new-instance v2, Lu2/f0;

    .line 105
    .line 106
    invoke-direct {v2, p0}, Lu2/f0;-><init>(Lcom/friday/document/view/RecycleBinPreviewFragment;)V

    .line 107
    .line 108
    .line 109
    new-instance v3, Lcom/friday/document/view/RecycleBinPreviewFragment$a;

    .line 110
    .line 111
    invoke-direct {v3, v2}, Lcom/friday/document/view/RecycleBinPreviewFragment$a;-><init>(Lhd/l;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->S()Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->I()Landroidx/lifecycle/MutableLiveData;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    new-instance v2, Lu2/g0;

    .line 130
    .line 131
    invoke-direct {v2, p0}, Lu2/g0;-><init>(Lcom/friday/document/view/RecycleBinPreviewFragment;)V

    .line 132
    .line 133
    .line 134
    new-instance v3, Lcom/friday/document/view/RecycleBinPreviewFragment$a;

    .line 135
    .line 136
    invoke-direct {v3, v2}, Lcom/friday/document/view/RecycleBinPreviewFragment$a;-><init>(Lhd/l;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->S()Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->H()Landroidx/lifecycle/MutableLiveData;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    new-instance v2, Lu2/h0;

    .line 155
    .line 156
    invoke-direct {v2, p0}, Lu2/h0;-><init>(Lcom/friday/document/view/RecycleBinPreviewFragment;)V

    .line 157
    .line 158
    .line 159
    new-instance v3, Lcom/friday/document/view/RecycleBinPreviewFragment$a;

    .line 160
    .line 161
    invoke-direct {v3, v2}, Lcom/friday/document/view/RecycleBinPreviewFragment$a;-><init>(Lhd/l;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public initView()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseFragment;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->L()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->c:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 16
    .line 17
    const-string v1, "fabEdit"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/16 v1, 0x8

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 32
    .line 33
    iget-object v0, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 34
    .line 35
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->d:Landroid/widget/ImageView;

    .line 36
    .line 37
    const-string v2, "ivFullScreen"

    .line 38
    .line 39
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 50
    .line 51
    iget-object v0, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 52
    .line 53
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 54
    .line 55
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->R()Lcom/friday/document/adapter/PreviewAdapter;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 79
    .line 80
    iget-object v0, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 81
    .line 82
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->g:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 83
    .line 84
    new-instance v1, Lu2/a0;

    .line 85
    .line 86
    invoke-direct {v1, p0, v0}, Lu2/a0;-><init>(Lcom/friday/document/view/RecycleBinPreviewFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

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
    check-cast v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutShareNotePreviewBinding;->e:Landroid/widget/ImageView;

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/friday/document/databinding/RecyclePreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 32
    .line 33
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->g:Landroid/widget/ImageView;

    .line 34
    .line 35
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-void

    .line 43
    :cond_1
    :goto_0
    new-instance v0, Lm2/a$a;

    .line 44
    .line 45
    new-instance v1, Lm2/a;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const-string v3, "requireActivity(...)"

    .line 52
    .line 53
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {v1, v2}, Lm2/a;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v1}, Lm2/a$a;-><init>(Lm2/a;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v1}, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->a(Landroid/view/LayoutInflater;)Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const-string v2, "inflate(...)"

    .line 71
    .line 72
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lm2/a$a;->b(Landroidx/databinding/ViewDataBinding;)Lm2/a$a;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const/4 v1, 0x1

    .line 80
    invoke-virtual {v0, v1}, Lm2/a$a;->d(Z)Lm2/a$a;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-instance v1, Lu2/c0;

    .line 85
    .line 86
    invoke-direct {v1, p0}, Lu2/c0;-><init>(Lcom/friday/document/view/RecycleBinPreviewFragment;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Lm2/a$a;->c(Lhd/q;)Lm2/a$a;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Lm2/a$a;->a()Lm2/a;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const/16 v1, 0x50

    .line 98
    .line 99
    const/4 v2, 0x0

    .line 100
    invoke-virtual {v0, p1, v2, v2, v1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public onResume()V
    .locals 7

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->R()Lcom/friday/document/adapter/PreviewAdapter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/friday/document/adapter/PreviewAdapter;->a()V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v4, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {v4, p0, v0}, Lcom/friday/document/view/RecycleBinPreviewFragment$onResume$1;-><init>(Lcom/friday/document/view/RecycleBinPreviewFragment;Lvc/c;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x3

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 26
    .line 27
    .line 28
    return-void
.end method
