.class public Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;
.super Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;
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

.field private final mboundView0:Landroidx/appcompat/widget/LinearLayoutCompat;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView01:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final mboundView1:Landroidx/appcompat/widget/LinearLayoutCompat;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 9
    .line 10
    const-string v1, "layout_bind_view_model"

    .line 11
    .line 12
    filled-new-array {v1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x6

    .line 17
    filled-new-array {v2}, [I

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget v3, Lcom/zykj/study/R$layout;->layout_bind_view_model:I

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
    const-string v1, "layout_self_course_subscriber_list"

    .line 32
    .line 33
    const-string v2, "layout_other_course_subscriber_list"

    .line 34
    .line 35
    const-string v3, "layout_free_subscriber_list_empty"

    .line 36
    .line 37
    const-string v4, "layout_free_subscriber_list"

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
    sget v3, Lcom/zykj/study/R$layout;->layout_free_subscriber_list_empty:I

    .line 52
    .line 53
    sget v4, Lcom/zykj/study/R$layout;->layout_free_subscriber_list:I

    .line 54
    .line 55
    sget v5, Lcom/zykj/study/R$layout;->layout_self_course_subscriber_list:I

    .line 56
    .line 57
    sget v6, Lcom/zykj/study/R$layout;->layout_other_course_subscriber_list:I

    .line 58
    .line 59
    filled-new-array {v3, v4, v5, v6}, [I

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    const/4 v4, 0x1

    .line 64
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 65
    .line 66
    .line 67
    new-instance v0, Landroid/util/SparseIntArray;

    .line 68
    .line 69
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 70
    .line 71
    .line 72
    sput-object v0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 73
    .line 74
    sget v1, Lcom/zykj/study/R$id;->title:I

    .line 75
    .line 76
    const/4 v2, 0x7

    .line 77
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 78
    .line 79
    .line 80
    sget v1, Lcom/zykj/study/R$id;->subscribe_tab_list:I

    .line 81
    .line 82
    const/16 v2, 0x8

    .line 83
    .line 84
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 85
    .line 86
    .line 87
    sget v1, Lcom/zykj/study/R$id;->guideline4:I

    .line 88
    .line 89
    const/16 v2, 0x9

    .line 90
    .line 91
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 92
    .line 93
    .line 94
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
    sget-object v0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0xa

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 12

    const/4 v0, 0x3

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/zykj/study/databinding/LayoutFreeSubscriberListEmptyBinding;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroidx/constraintlayout/widget/Guideline;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lcom/zykj/study/databinding/LayoutOtherCourseSubscriberListBinding;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    const/4 v4, 0x6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v11}, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;Lcom/zykj/study/databinding/LayoutFreeSubscriberListEmptyBinding;Landroidx/constraintlayout/widget/Guideline;Lcom/zykj/study/databinding/LayoutOtherCourseSubscriberListBinding;Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;Landroidx/recyclerview/widget/RecyclerView;Lcom/xuexiang/xui/widget/actionbar/TitleBar;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, v1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 5
    iget-object p1, v1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberListEmpty:Lcom/zykj/study/databinding/LayoutFreeSubscriberListEmptyBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 p1, 0x0

    .line 6
    aget-object p1, p3, p1

    check-cast p1, Landroidx/appcompat/widget/LinearLayoutCompat;

    iput-object p1, v1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mboundView0:Landroidx/appcompat/widget/LinearLayoutCompat;

    const/4 p2, 0x0

    .line 7
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x6

    .line 8
    aget-object p1, p3, p1

    check-cast p1, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    iput-object p1, v1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mboundView01:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 9
    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 p1, 0x1

    .line 10
    aget-object p1, p3, p1

    check-cast p1, Landroidx/appcompat/widget/LinearLayoutCompat;

    iput-object p1, v1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mboundView1:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 11
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 12
    iget-object p1, v1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->otherCourseSubscriberList:Lcom/zykj/study/databinding/LayoutOtherCourseSubscriberListBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 13
    iget-object p1, v1, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 14
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 15
    invoke-virtual {p0}, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeFreeSubscriberList(Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

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

.method private onChangeFreeSubscriberListEmpty(Lcom/zykj/study/databinding/LayoutFreeSubscriberListEmptyBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x8

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

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

.method private onChangeOtherCourseSubscriberList(Lcom/zykj/study/databinding/LayoutOtherCourseSubscriberListBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x10

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

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

.method private onChangeSelfCourseSubscriberList(Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelIsDialogVisible(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kunminx/architecture/ui/callback/UnPeekLiveData<",
            "Ljava/lang/Boolean;",
            ">;I)Z"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x20

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelToastLiveData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kunminx/architecture/ui/callback/UnPeekLiveData<",
            "Lcom/zykj/base/bean/toast/ToastMessage;",
            ">;I)Z"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x4

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

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
    .locals 13

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    iput-wide v2, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

    .line 7
    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-object v4, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->mViewModel:Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 10
    .line 11
    const-wide/16 v5, 0xe4

    .line 12
    .line 13
    and-long/2addr v5, v0

    .line 14
    cmp-long v5, v5, v2

    .line 15
    .line 16
    const-wide/16 v6, 0xe0

    .line 17
    .line 18
    const-wide/16 v8, 0xc4

    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    if-eqz v5, :cond_4

    .line 22
    .line 23
    and-long v11, v0, v8

    .line 24
    .line 25
    cmp-long v5, v11, v2

    .line 26
    .line 27
    if-eqz v5, :cond_1

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    invoke-virtual {v4}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v5, v10

    .line 37
    :goto_0
    const/4 v11, 0x2

    .line 38
    invoke-virtual {p0, v11, v5}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 39
    .line 40
    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    invoke-virtual {v5}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    check-cast v11, Lcom/zykj/base/bean/toast/ToastMessage;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move-object v5, v10

    .line 51
    :cond_2
    :goto_1
    and-long v11, v0, v6

    .line 52
    .line 53
    cmp-long v11, v11, v2

    .line 54
    .line 55
    if-eqz v11, :cond_5

    .line 56
    .line 57
    if-eqz v4, :cond_3

    .line 58
    .line 59
    invoke-virtual {v4}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    move-object v4, v10

    .line 65
    :goto_2
    const/4 v11, 0x5

    .line 66
    invoke-virtual {p0, v11, v4}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 67
    .line 68
    .line 69
    if-eqz v4, :cond_5

    .line 70
    .line 71
    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    move-object v10, v4

    .line 76
    check-cast v10, Ljava/lang/Boolean;

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4
    move-object v5, v10

    .line 80
    :cond_5
    :goto_3
    and-long/2addr v6, v0

    .line 81
    cmp-long v4, v6, v2

    .line 82
    .line 83
    if-eqz v4, :cond_6

    .line 84
    .line 85
    iget-object v4, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mboundView01:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 86
    .line 87
    invoke-virtual {v4, v10}, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;->setIsDialogVisible(Ljava/lang/Boolean;)V

    .line 88
    .line 89
    .line 90
    :cond_6
    and-long/2addr v0, v8

    .line 91
    cmp-long v0, v0, v2

    .line 92
    .line 93
    if-eqz v0, :cond_7

    .line 94
    .line 95
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mboundView01:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 96
    .line 97
    invoke-virtual {v0, v5}, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;->setToastLiveData(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)V

    .line 98
    .line 99
    .line 100
    :cond_7
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberListEmpty:Lcom/zykj/study/databinding/LayoutFreeSubscriberListEmptyBinding;

    .line 101
    .line 102
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 106
    .line 107
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 111
    .line 112
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->otherCourseSubscriberList:Lcom/zykj/study/databinding/LayoutOtherCourseSubscriberListBinding;

    .line 116
    .line 117
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mboundView01:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 121
    .line 122
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :catchall_0
    move-exception v0

    .line 127
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberListEmpty:Lcom/zykj/study/databinding/LayoutFreeSubscriberListEmptyBinding;

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
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

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
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

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
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->otherCourseSubscriberList:Lcom/zykj/study/databinding/LayoutOtherCourseSubscriberListBinding;

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
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mboundView01:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

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
    const-wide/16 v0, 0x80

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberListEmpty:Lcom/zykj/study/databinding/LayoutFreeSubscriberListEmptyBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->otherCourseSubscriberList:Lcom/zykj/study/databinding/LayoutOtherCourseSubscriberListBinding;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mboundView01:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

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
    if-eqz p1, :cond_5

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_4

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p1, v0, :cond_2

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-eq p1, v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x5

    .line 16
    if-eq p1, v0, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_0
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 21
    .line 22
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->onChangeViewModelIsDialogVisible(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_1
    check-cast p2, Lcom/zykj/study/databinding/LayoutOtherCourseSubscriberListBinding;

    .line 28
    .line 29
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->onChangeOtherCourseSubscriberList(Lcom/zykj/study/databinding/LayoutOtherCourseSubscriberListBinding;I)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1

    .line 34
    :cond_2
    check-cast p2, Lcom/zykj/study/databinding/LayoutFreeSubscriberListEmptyBinding;

    .line 35
    .line 36
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->onChangeFreeSubscriberListEmpty(Lcom/zykj/study/databinding/LayoutFreeSubscriberListEmptyBinding;I)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    :cond_3
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 42
    .line 43
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->onChangeViewModelToastLiveData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :cond_4
    check-cast p2, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 49
    .line 50
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->onChangeFreeSubscriberList(Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;I)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :cond_5
    check-cast p2, Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 56
    .line 57
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->onChangeSelfCourseSubscriberList(Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;I)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    return p1
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
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberListEmpty:Lcom/zykj/study/databinding/LayoutFreeSubscriberListEmptyBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->freeSubscriberList:Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->otherCourseSubscriberList:Lcom/zykj/study/databinding/LayoutOtherCourseSubscriberListBinding;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mboundView01:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/16 v0, 0x3b

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    check-cast p2, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->setViewModel(Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
.end method

.method public setViewModel(Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->mViewModel:Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x40

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentManagementSubscribeBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x3b

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroidx/databinding/BaseObservable;->notifyPropertyChanged(I)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
.end method
