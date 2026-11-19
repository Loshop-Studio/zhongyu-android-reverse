.class public Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;
.super Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;
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

.field private final mboundView0:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/util/SparseIntArray;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 7
    .line 8
    const v1, 0x7f0901ce

    .line 9
    .line 10
    .line 11
    const/16 v2, 0xd

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 14
    .line 15
    .line 16
    const v1, 0x7f0901cf

    .line 17
    .line 18
    .line 19
    const/16 v2, 0xe

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 22
    .line 23
    .line 24
    const v1, 0x7f09036e

    .line 25
    .line 26
    .line 27
    const/16 v2, 0xf

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 30
    .line 31
    .line 32
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
    sget-object v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x10

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 19

    const/4 v0, 0x1

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroidx/appcompat/widget/AppCompatImageView;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v15, v0

    check-cast v15, Landroid/widget/TextView;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    const/16 v0, 0xf

    aget-object v0, p3, v0

    move-object/from16 v17, v0

    check-cast v17, Lcom/zykj/policy/ui/PolicyCheckView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object/from16 v18, v0

    check-cast v18, Landroid/widget/TextView;

    const/4 v3, 0x6

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v18}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/appcompat/widget/AppCompatImageView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Landroid/widget/TextView;Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;Lcom/zykj/policy/ui/PolicyCheckView;Landroid/widget/TextView;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->ivAvatar:Landroidx/appcompat/widget/AppCompatImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 5
    aget-object v1, p3, v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mboundView0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 7
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuCheckUpdate:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuDeviceNo:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 9
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuExit:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 10
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuModifyGesture:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 11
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuModifyPassword:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 12
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuSchoolNotice:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 13
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuService:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 14
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuSystemMsg:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 15
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->tvClass:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 16
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->tvName:Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 17
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->tvStudyNo:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 18
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 19
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeMainViewModelDeviceId(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x4

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmStudentInfo(Landroidx/lifecycle/LiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/zykj/huiwei/launcher/proto/g;",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmUnReadMessageCount(Landroidx/lifecycle/LiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/String;",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmUnReadNoticeCount(Landroidx/lifecycle/LiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/String;",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x8

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmUserCacheBean(Landroidx/lifecycle/LiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/zykj/huiwei/launcher/proto/m;",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x20

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmVersionName(Landroidx/lifecycle/LiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/String;",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x10

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

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
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->mVm:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 12
    .line 13
    iget-object v6, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->mMainViewModel:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 14
    .line 15
    iget-object v7, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 16
    .line 17
    const-wide/16 v8, 0x27b

    .line 18
    .line 19
    and-long/2addr v8, v2

    .line 20
    cmp-long v8, v8, v4

    .line 21
    .line 22
    const-wide/16 v11, 0x250

    .line 23
    .line 24
    const-wide/16 v13, 0x248

    .line 25
    .line 26
    const-wide/16 v15, 0x242

    .line 27
    .line 28
    const-wide/16 v17, 0x241

    .line 29
    .line 30
    const/16 v19, 0x0

    .line 31
    .line 32
    if-eqz v8, :cond_f

    .line 33
    .line 34
    and-long v20, v2, v17

    .line 35
    .line 36
    cmp-long v8, v20, v4

    .line 37
    .line 38
    if-eqz v8, :cond_1

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->J()Landroidx/lifecycle/LiveData;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    :goto_0
    move-wide/from16 v20, v4

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    move-object/from16 v8, v19

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :goto_1
    const/4 v4, 0x0

    .line 53
    invoke-virtual {v1, v4, v8}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 54
    .line 55
    .line 56
    if-eqz v8, :cond_2

    .line 57
    .line 58
    invoke-virtual {v8}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Ljava/lang/String;

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_1
    move-wide/from16 v20, v4

    .line 66
    .line 67
    :cond_2
    move-object/from16 v4, v19

    .line 68
    .line 69
    :goto_2
    and-long v22, v2, v15

    .line 70
    .line 71
    cmp-long v5, v22, v20

    .line 72
    .line 73
    if-eqz v5, :cond_6

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->D()Landroidx/lifecycle/LiveData;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    move-object/from16 v5, v19

    .line 83
    .line 84
    :goto_3
    const/4 v8, 0x1

    .line 85
    invoke-virtual {v1, v8, v5}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 86
    .line 87
    .line 88
    if-eqz v5, :cond_4

    .line 89
    .line 90
    invoke-virtual {v5}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Lcom/zykj/huiwei/launcher/proto/g;

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_4
    move-object/from16 v5, v19

    .line 98
    .line 99
    :goto_4
    if-eqz v5, :cond_5

    .line 100
    .line 101
    invoke-virtual {v5}, Lcom/zykj/huiwei/launcher/proto/g;->getStudentNumber()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-virtual {v5}, Lcom/zykj/huiwei/launcher/proto/g;->getClassName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    :goto_5
    const-wide/16 v22, 0x260

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_5
    move-object/from16 v5, v19

    .line 113
    .line 114
    move-object v8, v5

    .line 115
    goto :goto_5

    .line 116
    :goto_6
    iget-object v9, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->tvStudyNo:Landroid/widget/TextView;

    .line 117
    .line 118
    invoke-virtual {v9}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    const v10, 0x7f110096

    .line 123
    .line 124
    .line 125
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    invoke-virtual {v9, v10, v8}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    iget-object v9, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->tvClass:Landroid/widget/TextView;

    .line 134
    .line 135
    invoke-virtual {v9}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    const v10, 0x7f110065

    .line 140
    .line 141
    .line 142
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-virtual {v9, v10, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    goto :goto_7

    .line 151
    :cond_6
    const-wide/16 v22, 0x260

    .line 152
    .line 153
    move-object/from16 v5, v19

    .line 154
    .line 155
    move-object v8, v5

    .line 156
    :goto_7
    and-long v9, v2, v13

    .line 157
    .line 158
    cmp-long v9, v9, v20

    .line 159
    .line 160
    if-eqz v9, :cond_8

    .line 161
    .line 162
    if-eqz v0, :cond_7

    .line 163
    .line 164
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->K()Landroidx/lifecycle/LiveData;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    goto :goto_8

    .line 169
    :cond_7
    move-object/from16 v9, v19

    .line 170
    .line 171
    :goto_8
    const/4 v10, 0x3

    .line 172
    invoke-virtual {v1, v10, v9}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 173
    .line 174
    .line 175
    if-eqz v9, :cond_8

    .line 176
    .line 177
    invoke-virtual {v9}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    check-cast v9, Ljava/lang/String;

    .line 182
    .line 183
    goto :goto_9

    .line 184
    :cond_8
    move-object/from16 v9, v19

    .line 185
    .line 186
    :goto_9
    and-long v24, v2, v11

    .line 187
    .line 188
    cmp-long v10, v24, v20

    .line 189
    .line 190
    if-eqz v10, :cond_a

    .line 191
    .line 192
    if-eqz v0, :cond_9

    .line 193
    .line 194
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->M()Landroidx/lifecycle/LiveData;

    .line 195
    .line 196
    .line 197
    move-result-object v10

    .line 198
    :goto_a
    move-wide/from16 v24, v11

    .line 199
    .line 200
    goto :goto_b

    .line 201
    :cond_9
    move-object/from16 v10, v19

    .line 202
    .line 203
    goto :goto_a

    .line 204
    :goto_b
    const/4 v11, 0x4

    .line 205
    invoke-virtual {v1, v11, v10}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 206
    .line 207
    .line 208
    if-eqz v10, :cond_b

    .line 209
    .line 210
    invoke-virtual {v10}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    check-cast v10, Ljava/lang/String;

    .line 215
    .line 216
    goto :goto_c

    .line 217
    :cond_a
    move-wide/from16 v24, v11

    .line 218
    .line 219
    :cond_b
    move-object/from16 v10, v19

    .line 220
    .line 221
    :goto_c
    and-long v11, v2, v22

    .line 222
    .line 223
    cmp-long v11, v11, v20

    .line 224
    .line 225
    if-eqz v11, :cond_e

    .line 226
    .line 227
    if-eqz v0, :cond_c

    .line 228
    .line 229
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->L()Landroidx/lifecycle/LiveData;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    goto :goto_d

    .line 234
    :cond_c
    move-object/from16 v0, v19

    .line 235
    .line 236
    :goto_d
    const/4 v11, 0x5

    .line 237
    invoke-virtual {v1, v11, v0}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 238
    .line 239
    .line 240
    if-eqz v0, :cond_d

    .line 241
    .line 242
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/m;

    .line 247
    .line 248
    goto :goto_e

    .line 249
    :cond_d
    move-object/from16 v0, v19

    .line 250
    .line 251
    :goto_e
    if-eqz v0, :cond_e

    .line 252
    .line 253
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/m;->getRealName()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    goto :goto_f

    .line 258
    :cond_e
    move-object/from16 v0, v19

    .line 259
    .line 260
    goto :goto_f

    .line 261
    :cond_f
    move-wide/from16 v20, v4

    .line 262
    .line 263
    move-wide/from16 v24, v11

    .line 264
    .line 265
    const-wide/16 v22, 0x260

    .line 266
    .line 267
    move-object/from16 v0, v19

    .line 268
    .line 269
    move-object v4, v0

    .line 270
    move-object v5, v4

    .line 271
    move-object v8, v5

    .line 272
    move-object v9, v8

    .line 273
    move-object v10, v9

    .line 274
    :goto_f
    const-wide/16 v11, 0x284

    .line 275
    .line 276
    and-long/2addr v11, v2

    .line 277
    cmp-long v11, v11, v20

    .line 278
    .line 279
    if-eqz v11, :cond_11

    .line 280
    .line 281
    if-eqz v6, :cond_10

    .line 282
    .line 283
    invoke-virtual {v6}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    goto :goto_10

    .line 288
    :cond_10
    move-object/from16 v6, v19

    .line 289
    .line 290
    :goto_10
    const/4 v12, 0x2

    .line 291
    invoke-virtual {v1, v12, v6}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 292
    .line 293
    .line 294
    if-eqz v6, :cond_11

    .line 295
    .line 296
    invoke-virtual {v6}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    move-object/from16 v19, v6

    .line 301
    .line 302
    check-cast v19, Ljava/lang/String;

    .line 303
    .line 304
    :cond_11
    move-object/from16 v6, v19

    .line 305
    .line 306
    const-wide/16 v26, 0x300

    .line 307
    .line 308
    and-long v26, v2, v26

    .line 309
    .line 310
    cmp-long v12, v26, v20

    .line 311
    .line 312
    if-eqz v12, :cond_12

    .line 313
    .line 314
    iget-object v12, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->ivAvatar:Landroidx/appcompat/widget/AppCompatImageView;

    .line 315
    .line 316
    invoke-static {v12, v7}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 317
    .line 318
    .line 319
    iget-object v12, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuCheckUpdate:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 320
    .line 321
    invoke-static {v12, v7}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 322
    .line 323
    .line 324
    iget-object v12, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuDeviceNo:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 325
    .line 326
    invoke-static {v12, v7}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 327
    .line 328
    .line 329
    iget-object v12, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuExit:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 330
    .line 331
    invoke-static {v12, v7}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 332
    .line 333
    .line 334
    iget-object v12, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuModifyGesture:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 335
    .line 336
    invoke-static {v12, v7}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 337
    .line 338
    .line 339
    iget-object v12, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuModifyPassword:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 340
    .line 341
    invoke-static {v12, v7}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 342
    .line 343
    .line 344
    iget-object v12, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuSchoolNotice:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 345
    .line 346
    invoke-static {v12, v7}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 347
    .line 348
    .line 349
    iget-object v12, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuService:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 350
    .line 351
    invoke-static {v12, v7}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 352
    .line 353
    .line 354
    iget-object v12, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuSystemMsg:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 355
    .line 356
    invoke-static {v12, v7}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 357
    .line 358
    .line 359
    :cond_12
    and-long v24, v2, v24

    .line 360
    .line 361
    cmp-long v7, v24, v20

    .line 362
    .line 363
    if-eqz v7, :cond_13

    .line 364
    .line 365
    iget-object v7, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuCheckUpdate:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 366
    .line 367
    invoke-static {v7, v10}, Lh4/f;->a(Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    :cond_13
    if-eqz v11, :cond_14

    .line 371
    .line 372
    iget-object v7, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuDeviceNo:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 373
    .line 374
    invoke-static {v7, v6}, Lh4/f;->a(Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    :cond_14
    and-long v6, v2, v13

    .line 378
    .line 379
    cmp-long v6, v6, v20

    .line 380
    .line 381
    if-eqz v6, :cond_15

    .line 382
    .line 383
    iget-object v6, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuSchoolNotice:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 384
    .line 385
    invoke-static {v6, v9}, Lh4/f;->a(Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    :cond_15
    and-long v6, v2, v17

    .line 389
    .line 390
    cmp-long v6, v6, v20

    .line 391
    .line 392
    if-eqz v6, :cond_16

    .line 393
    .line 394
    iget-object v6, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuSystemMsg:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 395
    .line 396
    invoke-static {v6, v4}, Lh4/f;->a(Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    :cond_16
    and-long v6, v2, v15

    .line 400
    .line 401
    cmp-long v4, v6, v20

    .line 402
    .line 403
    if-eqz v4, :cond_17

    .line 404
    .line 405
    iget-object v4, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->tvClass:Landroid/widget/TextView;

    .line 406
    .line 407
    invoke-static {v4, v5}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 408
    .line 409
    .line 410
    iget-object v4, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->tvStudyNo:Landroid/widget/TextView;

    .line 411
    .line 412
    invoke-static {v4, v8}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 413
    .line 414
    .line 415
    :cond_17
    and-long v2, v2, v22

    .line 416
    .line 417
    cmp-long v2, v2, v20

    .line 418
    .line 419
    if-eqz v2, :cond_18

    .line 420
    .line 421
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->tvName:Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    .line 422
    .line 423
    invoke-static {v2, v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 424
    .line 425
    .line 426
    :cond_18
    return-void

    .line 427
    :catchall_0
    move-exception v0

    .line 428
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 429
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    monitor-exit p0

    .line 12
    return v0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    monitor-exit p0

    .line 16
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x200

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
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
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 21
    .line 22
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->onChangeVmUserCacheBean(Landroidx/lifecycle/LiveData;I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_1
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 28
    .line 29
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->onChangeVmVersionName(Landroidx/lifecycle/LiveData;I)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1

    .line 34
    :cond_2
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 35
    .line 36
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->onChangeVmUnReadNoticeCount(Landroidx/lifecycle/LiveData;I)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    :cond_3
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 42
    .line 43
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->onChangeMainViewModelDeviceId(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :cond_4
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 49
    .line 50
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->onChangeVmStudentInfo(Landroidx/lifecycle/LiveData;I)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :cond_5
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 56
    .line 57
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->onChangeVmUnReadMessageCount(Landroidx/lifecycle/LiveData;I)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    return p1
.end method

.method public setClickListener(Landroid/view/View$OnClickListener;)V
    .locals 4
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x100

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

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

.method public setMainViewModel(Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->mMainViewModel:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x80

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

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
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->setVm(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)V

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
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->setMainViewModel(Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;)V

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
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->setClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    .line 27
    .line 28
    return v1

    .line 29
    :cond_2
    const/4 p1, 0x0

    .line 30
    return p1
.end method

.method public setVm(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->mVm:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x40

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl;->mDirtyFlags:J

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
