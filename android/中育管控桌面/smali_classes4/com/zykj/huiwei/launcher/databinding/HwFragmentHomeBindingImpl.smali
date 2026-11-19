.class public Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;
.super Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;
.source "SourceFile"


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# instance fields
.field private mDirtyFlags:J

.field private final mboundView1:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 8
    .line 9
    const-string v1, "hw_include_home_sidebar"

    .line 10
    .line 11
    filled-new-array {v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x6

    .line 16
    filled-new-array {v2}, [I

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const v3, 0x7f0c004c

    .line 21
    .line 22
    .line 23
    filled-new-array {v3}, [I

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 29
    .line 30
    .line 31
    const-string v1, "hw_include_home_app"

    .line 32
    .line 33
    const-string v2, "hw_state_view"

    .line 34
    .line 35
    const-string v3, "hw_include_home_title"

    .line 36
    .line 37
    const-string v4, "hw_include_home_homework"

    .line 38
    .line 39
    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x4

    .line 44
    const/4 v3, 0x5

    .line 45
    const/4 v4, 0x2

    .line 46
    const/4 v5, 0x3

    .line 47
    filled-new-array {v4, v5, v2, v3}, [I

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const v3, 0x7f0c004a

    .line 52
    .line 53
    .line 54
    const v4, 0x7f0c0058

    .line 55
    .line 56
    .line 57
    const v5, 0x7f0c004d

    .line 58
    .line 59
    .line 60
    const v6, 0x7f0c004b

    .line 61
    .line 62
    .line 63
    filled-new-array {v5, v6, v3, v4}, [I

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const/4 v4, 0x1

    .line 68
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    sput-object v0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 73
    .line 74
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3
    .param p1    # Landroidx/databinding/DataBindingComponent;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x7

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 10

    const/4 v0, 0x0

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeHomeworkBinding;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;

    const/4 v4, 0x4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v9}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/drawerlayout/widget/DrawerLayout;Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeHomeworkBinding;Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->drawLayout:Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object p1, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeApp:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 6
    iget-object p1, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeHomework:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeHomeworkBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 7
    iget-object p1, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeSideBar:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 8
    iget-object p1, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeTitle:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 p1, 0x1

    .line 9
    aget-object p1, p3, p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p1, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mboundView1:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x5

    .line 11
    aget-object p1, p3, p1

    check-cast p1, Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    iput-object p1, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 12
    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 13
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 14
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeIncludeApp(Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x8

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method private onChangeIncludeHomework(Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeHomeworkBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method private onChangeIncludeSideBar(Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method private onChangeIncludeTitle(Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x4

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method


# virtual methods
.method public executeBindings()V
    .locals 11

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    iput-wide v2, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 7
    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-object v4, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->mVm:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->mMainViewModel:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 14
    .line 15
    const-wide/16 v7, 0x110

    .line 16
    .line 17
    and-long/2addr v7, v0

    .line 18
    cmp-long v7, v7, v2

    .line 19
    .line 20
    const-wide/16 v8, 0x120

    .line 21
    .line 22
    and-long/2addr v8, v0

    .line 23
    cmp-long v8, v8, v2

    .line 24
    .line 25
    const-wide/16 v9, 0x140

    .line 26
    .line 27
    and-long/2addr v0, v9

    .line 28
    cmp-long v0, v0, v2

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeApp:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;

    .line 33
    .line 34
    invoke-virtual {v0, v6}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->setClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeHomework:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeHomeworkBinding;

    .line 38
    .line 39
    invoke-virtual {v0, v6}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeHomeworkBinding;->setClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeSideBar:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;

    .line 43
    .line 44
    invoke-virtual {v0, v6}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->setClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeTitle:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;

    .line 48
    .line 49
    invoke-virtual {v0, v6}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->setClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    if-eqz v7, :cond_1

    .line 53
    .line 54
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeApp:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;

    .line 55
    .line 56
    invoke-virtual {v0, v4}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->setVm(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeHomework:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeHomeworkBinding;

    .line 60
    .line 61
    invoke-virtual {v0, v4}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeHomeworkBinding;->setVm(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeSideBar:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;

    .line 65
    .line 66
    invoke-virtual {v0, v4}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->setVm(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeTitle:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;

    .line 70
    .line 71
    invoke-virtual {v0, v4}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->setVm(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 75
    .line 76
    invoke-virtual {v0, v4}, Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;->setVm(Lcom/zykj/base/BaseViewModel;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    if-eqz v8, :cond_2

    .line 80
    .line 81
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeSideBar:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;

    .line 82
    .line 83
    invoke-virtual {v0, v5}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->setMainViewModel(Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeTitle:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;

    .line 87
    .line 88
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeHomework:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeHomeworkBinding;

    .line 92
    .line 93
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeApp:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;

    .line 97
    .line 98
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 102
    .line 103
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeSideBar:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;

    .line 107
    .line 108
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :catchall_0
    move-exception v0

    .line 113
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return v1

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeTitle:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->hasPendingBindings()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeHomework:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeHomeworkBinding;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->hasPendingBindings()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    return v1

    .line 34
    :cond_2
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeApp:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->hasPendingBindings()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    return v1

    .line 43
    :cond_3
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->hasPendingBindings()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    return v1

    .line 52
    :cond_4
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeSideBar:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->hasPendingBindings()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    return v1

    .line 61
    :cond_5
    const/4 v0, 0x0

    .line 62
    return v0

    .line 63
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x100

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeTitle:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeHomework:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeHomeworkBinding;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeApp:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeSideBar:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw v0
.end method

.method public onFieldChange(ILjava/lang/Object;I)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :cond_0
    check-cast p2, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;

    .line 15
    .line 16
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->onChangeIncludeApp(Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;I)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_1
    check-cast p2, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;

    .line 22
    .line 23
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->onChangeIncludeTitle(Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;I)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_2
    check-cast p2, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeHomeworkBinding;

    .line 29
    .line 30
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->onChangeIncludeHomework(Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeHomeworkBinding;I)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1

    .line 35
    :cond_3
    check-cast p2, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;

    .line 36
    .line 37
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->onChangeIncludeSideBar(Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;I)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1
.end method

.method public setClickListener(Landroid/view/View$OnClickListener;)V
    .locals 4
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x40

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-virtual {p0, p1}, Landroidx/databinding/BaseObservable;->notifyPropertyChanged(I)V

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw p1
.end method

.method public setHomeworkAdapter(Lcom/zykj/huiwei/launcher/ui/adapter/HomeworkAdapter;)V
    .locals 0
    .param p1    # Lcom/zykj/huiwei/launcher/ui/adapter/HomeworkAdapter;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->mHomeworkAdapter:Lcom/zykj/huiwei/launcher/ui/adapter/HomeworkAdapter;

    .line 2
    .line 3
    return-void
.end method

.method public setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeTitle:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeHomework:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeHomeworkBinding;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeApp:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->includeSideBar:Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public setMainViewModel(Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->mMainViewModel:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x20

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/4 p1, 0x4

    .line 13
    invoke-virtual {p0, p1}, Landroidx/databinding/BaseObservable;->notifyPropertyChanged(I)V

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw p1
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x7

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    check-cast p2, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->setVm(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)V

    .line 8
    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/4 v0, 0x4

    .line 12
    if-ne v0, p1, :cond_1

    .line 13
    .line 14
    check-cast p2, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 15
    .line 16
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->setMainViewModel(Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;)V

    .line 17
    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 v0, 0x2

    .line 21
    if-ne v0, p1, :cond_2

    .line 22
    .line 23
    check-cast p2, Landroid/view/View$OnClickListener;

    .line 24
    .line 25
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->setClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    .line 27
    .line 28
    return v1

    .line 29
    :cond_2
    const/4 v0, 0x3

    .line 30
    if-ne v0, p1, :cond_3

    .line 31
    .line 32
    check-cast p2, Lcom/zykj/huiwei/launcher/ui/adapter/HomeworkAdapter;

    .line 33
    .line 34
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->setHomeworkAdapter(Lcom/zykj/huiwei/launcher/ui/adapter/HomeworkAdapter;)V

    .line 35
    .line 36
    .line 37
    return v1

    .line 38
    :cond_3
    const/4 p1, 0x0

    .line 39
    return p1
.end method

.method public setVm(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBinding;->mVm:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x10

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentHomeBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/4 p1, 0x7

    .line 13
    invoke-virtual {p0, p1}, Landroidx/databinding/BaseObservable;->notifyPropertyChanged(I)V

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw p1
.end method
