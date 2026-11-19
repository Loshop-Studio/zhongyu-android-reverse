.class public Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;
.super Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;[Landroid/view/View;)V
    .locals 3
    .param p1    # Landroidx/databinding/DataBindingComponent;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # [Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x15

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;[Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;[Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;[Landroid/view/View;[Ljava/lang/Object;)V
    .locals 25

    const/4 v0, 0x0

    .line 2
    aget-object v2, p2, v0

    const/4 v1, 0x4

    aget-object v1, p3, v1

    move-object v4, v1

    check-cast v4, Landroid/view/View;

    const/4 v1, 0x3

    aget-object v1, p3, v1

    move-object v5, v1

    check-cast v5, Landroidx/constraintlayout/widget/Group;

    const/4 v1, 0x5

    aget-object v1, p3, v1

    move-object v6, v1

    check-cast v6, Landroidx/appcompat/widget/AppCompatImageView;

    const/16 v1, 0x8

    aget-object v1, p3, v1

    move-object v7, v1

    check-cast v7, Landroid/view/View;

    const/4 v1, 0x7

    aget-object v1, p3, v1

    move-object v8, v1

    check-cast v8, Landroidx/appcompat/widget/AppCompatImageView;

    const/16 v1, 0xc

    aget-object v1, p3, v1

    move-object v9, v1

    check-cast v9, Landroidx/appcompat/widget/AppCompatImageView;

    const/16 v1, 0x10

    aget-object v1, p3, v1

    move-object v10, v1

    check-cast v10, Landroidx/appcompat/widget/AppCompatImageView;

    const/16 v1, 0x13

    aget-object v1, p3, v1

    move-object v11, v1

    check-cast v11, Landroidx/appcompat/widget/AppCompatImageView;

    const/16 v1, 0xa

    aget-object v1, p3, v1

    move-object v12, v1

    check-cast v12, Landroid/widget/TextView;

    const/4 v1, 0x1

    aget-object v1, p3, v1

    move-object v13, v1

    check-cast v13, Landroid/widget/TextView;

    const/4 v1, 0x2

    aget-object v1, p3, v1

    move-object v14, v1

    check-cast v14, Landroid/widget/TextView;

    const/4 v1, 0x6

    aget-object v1, p3, v1

    move-object v15, v1

    check-cast v15, Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    const/16 v1, 0x9

    aget-object v1, p3, v1

    move-object/from16 v16, v1

    check-cast v16, Landroid/widget/TextView;

    const/16 v1, 0xd

    aget-object v1, p3, v1

    move-object/from16 v17, v1

    check-cast v17, Landroid/widget/TextView;

    const/16 v1, 0x11

    aget-object v1, p3, v1

    move-object/from16 v18, v1

    check-cast v18, Landroid/widget/TextView;

    const/16 v1, 0x14

    aget-object v1, p3, v1

    move-object/from16 v19, v1

    check-cast v19, Landroid/widget/TextView;

    aget-object v0, p3, v0

    move-object/from16 v20, v0

    check-cast v20, Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object/from16 v21, v0

    check-cast v21, Landroid/widget/TextView;

    const/16 v0, 0xf

    aget-object v0, p3, v0

    move-object/from16 v22, v0

    check-cast v22, Landroid/widget/TextView;

    const/16 v0, 0x12

    aget-object v0, p3, v0

    move-object/from16 v23, v0

    check-cast v23, Landroid/widget/TextView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object/from16 v24, v0

    check-cast v24, Landroidx/constraintlayout/widget/Group;

    const/16 v3, 0x9

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v24}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/view/View;Landroidx/constraintlayout/widget/Group;Landroidx/appcompat/widget/AppCompatImageView;Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/Group;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->clickUserInfo:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->groupInfo:Landroidx/constraintlayout/widget/Group;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 6
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->ivAvatar:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 7
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->ivDot:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->ivEnvelope:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 9
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->ivWeather:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 10
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->ivWeather2:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 11
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->ivWeather3:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 12
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvClass:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 13
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvDate:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 14
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvLocation:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 15
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvName:Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 16
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvStudyNo:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 17
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvTemp:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 18
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvTemp2:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 19
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvTemp3:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 20
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvTime:Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 21
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvWeather:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 22
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvWeek2:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 23
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvWeek3:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 24
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->weatherGroup:Landroidx/constraintlayout/widget/Group;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v1, p2

    .line 25
    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setRootTag([Landroid/view/View;)V

    .line 26
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeVmIsMsgDotVisible(Landroidx/lifecycle/LiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x20

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmIsShowWeather(Landroidx/lifecycle/LiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmShowHomeTime(Landroidx/lifecycle/LiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/zykj/huiwei/launcher/bean/HomeTime;",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x4

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x8

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmWeatherAfterTomorrow(Landroidx/lifecycle/LiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x10

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmWeatherLocation(Landroidx/lifecycle/LiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x80

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmWeatherToady(Landroidx/lifecycle/LiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x100

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmWeatherTomorrow(Landroidx/lifecycle/LiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x40

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

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
    .locals 39

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->mVm:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 12
    .line 13
    iget-object v6, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 14
    .line 15
    const-wide/16 v7, 0xbff

    .line 16
    .line 17
    and-long/2addr v7, v2

    .line 18
    cmp-long v7, v7, v4

    .line 19
    .line 20
    const-wide/16 v14, 0xa20

    .line 21
    .line 22
    const-wide/16 v16, 0xa10

    .line 23
    .line 24
    const-wide/16 v18, 0xa08

    .line 25
    .line 26
    const-wide/16 v20, 0xa04

    .line 27
    .line 28
    const-wide/16 v22, 0xa02

    .line 29
    .line 30
    const-wide/16 v24, 0xa01

    .line 31
    .line 32
    const/16 v26, 0x0

    .line 33
    .line 34
    if-eqz v7, :cond_1c

    .line 35
    .line 36
    and-long v27, v2, v24

    .line 37
    .line 38
    cmp-long v7, v27, v4

    .line 39
    .line 40
    if-eqz v7, :cond_1

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->U()Landroidx/lifecycle/LiveData;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    :goto_0
    move-wide/from16 v27, v4

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    move-object/from16 v7, v26

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :goto_1
    const/4 v4, 0x0

    .line 55
    invoke-virtual {v1, v4, v7}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 56
    .line 57
    .line 58
    if-eqz v7, :cond_2

    .line 59
    .line 60
    invoke-virtual {v7}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Ljava/lang/Boolean;

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_1
    move-wide/from16 v27, v4

    .line 68
    .line 69
    :cond_2
    move-object/from16 v4, v26

    .line 70
    .line 71
    :goto_2
    and-long v29, v2, v22

    .line 72
    .line 73
    cmp-long v5, v29, v27

    .line 74
    .line 75
    if-eqz v5, :cond_6

    .line 76
    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->D()Landroidx/lifecycle/LiveData;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    goto :goto_3

    .line 84
    :cond_3
    move-object/from16 v5, v26

    .line 85
    .line 86
    :goto_3
    const/4 v7, 0x1

    .line 87
    invoke-virtual {v1, v7, v5}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 88
    .line 89
    .line 90
    if-eqz v5, :cond_4

    .line 91
    .line 92
    invoke-virtual {v5}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    check-cast v5, Lcom/zykj/huiwei/launcher/proto/g;

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_4
    move-object/from16 v5, v26

    .line 100
    .line 101
    :goto_4
    if-eqz v5, :cond_5

    .line 102
    .line 103
    invoke-virtual {v5}, Lcom/zykj/huiwei/launcher/proto/g;->getStudentNumber()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-virtual {v5}, Lcom/zykj/huiwei/launcher/proto/g;->getClassName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    :goto_5
    const-wide/16 v29, 0xb00

    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_5
    move-object/from16 v5, v26

    .line 115
    .line 116
    move-object v7, v5

    .line 117
    goto :goto_5

    .line 118
    :goto_6
    iget-object v8, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvStudyNo:Landroid/widget/TextView;

    .line 119
    .line 120
    invoke-virtual {v8}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    const v9, 0x7f110096

    .line 125
    .line 126
    .line 127
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-virtual {v8, v9, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    iget-object v8, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvClass:Landroid/widget/TextView;

    .line 136
    .line 137
    invoke-virtual {v8}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    const v9, 0x7f110065

    .line 142
    .line 143
    .line 144
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-virtual {v8, v9, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    goto :goto_7

    .line 153
    :cond_6
    const-wide/16 v29, 0xb00

    .line 154
    .line 155
    move-object/from16 v5, v26

    .line 156
    .line 157
    move-object v7, v5

    .line 158
    :goto_7
    and-long v8, v2, v20

    .line 159
    .line 160
    cmp-long v8, v8, v27

    .line 161
    .line 162
    if-eqz v8, :cond_9

    .line 163
    .line 164
    if-eqz v0, :cond_7

    .line 165
    .line 166
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->B()Landroidx/lifecycle/LiveData;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    goto :goto_8

    .line 171
    :cond_7
    move-object/from16 v8, v26

    .line 172
    .line 173
    :goto_8
    const/4 v9, 0x2

    .line 174
    invoke-virtual {v1, v9, v8}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 175
    .line 176
    .line 177
    if-eqz v8, :cond_8

    .line 178
    .line 179
    invoke-virtual {v8}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    check-cast v8, Lcom/zykj/huiwei/launcher/bean/HomeTime;

    .line 184
    .line 185
    goto :goto_9

    .line 186
    :cond_8
    move-object/from16 v8, v26

    .line 187
    .line 188
    :goto_9
    if-eqz v8, :cond_9

    .line 189
    .line 190
    invoke-virtual {v8}, Lcom/zykj/huiwei/launcher/bean/HomeTime;->getTime()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    invoke-virtual {v8}, Lcom/zykj/huiwei/launcher/bean/HomeTime;->getDate()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    goto :goto_a

    .line 199
    :cond_9
    move-object/from16 v8, v26

    .line 200
    .line 201
    move-object v9, v8

    .line 202
    :goto_a
    and-long v31, v2, v18

    .line 203
    .line 204
    cmp-long v31, v31, v27

    .line 205
    .line 206
    if-eqz v31, :cond_c

    .line 207
    .line 208
    if-eqz v0, :cond_a

    .line 209
    .line 210
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->L()Landroidx/lifecycle/LiveData;

    .line 211
    .line 212
    .line 213
    move-result-object v31

    .line 214
    move-object/from16 v10, v31

    .line 215
    .line 216
    :goto_b
    const-wide/16 v31, 0xa80

    .line 217
    .line 218
    goto :goto_c

    .line 219
    :cond_a
    move-object/from16 v10, v26

    .line 220
    .line 221
    goto :goto_b

    .line 222
    :goto_c
    const/4 v11, 0x3

    .line 223
    invoke-virtual {v1, v11, v10}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 224
    .line 225
    .line 226
    if-eqz v10, :cond_b

    .line 227
    .line 228
    invoke-virtual {v10}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    check-cast v10, Lcom/zykj/huiwei/launcher/proto/m;

    .line 233
    .line 234
    goto :goto_d

    .line 235
    :cond_b
    move-object/from16 v10, v26

    .line 236
    .line 237
    :goto_d
    if-eqz v10, :cond_d

    .line 238
    .line 239
    invoke-virtual {v10}, Lcom/zykj/huiwei/launcher/proto/m;->getRealName()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    goto :goto_e

    .line 244
    :cond_c
    const-wide/16 v31, 0xa80

    .line 245
    .line 246
    :cond_d
    move-object/from16 v10, v26

    .line 247
    .line 248
    :goto_e
    and-long v33, v2, v16

    .line 249
    .line 250
    cmp-long v11, v33, v27

    .line 251
    .line 252
    if-eqz v11, :cond_f

    .line 253
    .line 254
    if-eqz v0, :cond_e

    .line 255
    .line 256
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->N()Landroidx/lifecycle/LiveData;

    .line 257
    .line 258
    .line 259
    move-result-object v11

    .line 260
    :goto_f
    const-wide/16 v33, 0xa40

    .line 261
    .line 262
    goto :goto_10

    .line 263
    :cond_e
    move-object/from16 v11, v26

    .line 264
    .line 265
    goto :goto_f

    .line 266
    :goto_10
    const/4 v12, 0x4

    .line 267
    invoke-virtual {v1, v12, v11}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 268
    .line 269
    .line 270
    if-eqz v11, :cond_10

    .line 271
    .line 272
    invoke-virtual {v11}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v11

    .line 276
    check-cast v11, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;

    .line 277
    .line 278
    goto :goto_11

    .line 279
    :cond_f
    const-wide/16 v33, 0xa40

    .line 280
    .line 281
    :cond_10
    move-object/from16 v11, v26

    .line 282
    .line 283
    :goto_11
    and-long v12, v2, v14

    .line 284
    .line 285
    cmp-long v12, v12, v27

    .line 286
    .line 287
    if-eqz v12, :cond_12

    .line 288
    .line 289
    if-eqz v0, :cond_11

    .line 290
    .line 291
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->T()Landroidx/lifecycle/LiveData;

    .line 292
    .line 293
    .line 294
    move-result-object v12

    .line 295
    goto :goto_12

    .line 296
    :cond_11
    move-object/from16 v12, v26

    .line 297
    .line 298
    :goto_12
    const/4 v13, 0x5

    .line 299
    invoke-virtual {v1, v13, v12}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 300
    .line 301
    .line 302
    if-eqz v12, :cond_12

    .line 303
    .line 304
    invoke-virtual {v12}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v12

    .line 308
    check-cast v12, Ljava/lang/Boolean;

    .line 309
    .line 310
    goto :goto_13

    .line 311
    :cond_12
    move-object/from16 v12, v26

    .line 312
    .line 313
    :goto_13
    and-long v35, v2, v33

    .line 314
    .line 315
    cmp-long v13, v35, v27

    .line 316
    .line 317
    if-eqz v13, :cond_14

    .line 318
    .line 319
    if-eqz v0, :cond_13

    .line 320
    .line 321
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->S()Landroidx/lifecycle/LiveData;

    .line 322
    .line 323
    .line 324
    move-result-object v13

    .line 325
    :goto_14
    move-wide/from16 v35, v14

    .line 326
    .line 327
    goto :goto_15

    .line 328
    :cond_13
    move-object/from16 v13, v26

    .line 329
    .line 330
    goto :goto_14

    .line 331
    :goto_15
    const/4 v14, 0x6

    .line 332
    invoke-virtual {v1, v14, v13}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 333
    .line 334
    .line 335
    if-eqz v13, :cond_15

    .line 336
    .line 337
    invoke-virtual {v13}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v13

    .line 341
    check-cast v13, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;

    .line 342
    .line 343
    goto :goto_16

    .line 344
    :cond_14
    move-wide/from16 v35, v14

    .line 345
    .line 346
    :cond_15
    move-object/from16 v13, v26

    .line 347
    .line 348
    :goto_16
    and-long v14, v2, v31

    .line 349
    .line 350
    cmp-long v14, v14, v27

    .line 351
    .line 352
    if-eqz v14, :cond_17

    .line 353
    .line 354
    if-eqz v0, :cond_16

    .line 355
    .line 356
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->Q()Landroidx/lifecycle/LiveData;

    .line 357
    .line 358
    .line 359
    move-result-object v14

    .line 360
    goto :goto_17

    .line 361
    :cond_16
    move-object/from16 v14, v26

    .line 362
    .line 363
    :goto_17
    const/4 v15, 0x7

    .line 364
    invoke-virtual {v1, v15, v14}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 365
    .line 366
    .line 367
    if-eqz v14, :cond_17

    .line 368
    .line 369
    invoke-virtual {v14}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v14

    .line 373
    check-cast v14, Ljava/lang/String;

    .line 374
    .line 375
    goto :goto_18

    .line 376
    :cond_17
    move-object/from16 v14, v26

    .line 377
    .line 378
    :goto_18
    and-long v37, v2, v29

    .line 379
    .line 380
    cmp-long v15, v37, v27

    .line 381
    .line 382
    if-eqz v15, :cond_1b

    .line 383
    .line 384
    if-eqz v0, :cond_18

    .line 385
    .line 386
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->R()Landroidx/lifecycle/LiveData;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    goto :goto_19

    .line 391
    :cond_18
    move-object/from16 v0, v26

    .line 392
    .line 393
    :goto_19
    const/16 v15, 0x8

    .line 394
    .line 395
    invoke-virtual {v1, v15, v0}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 396
    .line 397
    .line 398
    if-eqz v0, :cond_19

    .line 399
    .line 400
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;

    .line 405
    .line 406
    goto :goto_1a

    .line 407
    :cond_19
    move-object/from16 v0, v26

    .line 408
    .line 409
    :goto_1a
    if-eqz v0, :cond_1a

    .line 410
    .line 411
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;->getTextDay()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v26

    .line 415
    :cond_1a
    move-object v15, v4

    .line 416
    move-object/from16 v4, v26

    .line 417
    .line 418
    goto :goto_1b

    .line 419
    :cond_1b
    move-object v15, v4

    .line 420
    move-object/from16 v0, v26

    .line 421
    .line 422
    move-object v4, v0

    .line 423
    goto :goto_1b

    .line 424
    :cond_1c
    move-wide/from16 v27, v4

    .line 425
    .line 426
    move-wide/from16 v35, v14

    .line 427
    .line 428
    const-wide/16 v29, 0xb00

    .line 429
    .line 430
    const-wide/16 v31, 0xa80

    .line 431
    .line 432
    const-wide/16 v33, 0xa40

    .line 433
    .line 434
    move-object/from16 v0, v26

    .line 435
    .line 436
    move-object v4, v0

    .line 437
    move-object v5, v4

    .line 438
    move-object v7, v5

    .line 439
    move-object v8, v7

    .line 440
    move-object v9, v8

    .line 441
    move-object v10, v9

    .line 442
    move-object v11, v10

    .line 443
    move-object v12, v11

    .line 444
    move-object v13, v12

    .line 445
    move-object v14, v13

    .line 446
    move-object v15, v14

    .line 447
    :goto_1b
    const-wide/16 v37, 0xc00

    .line 448
    .line 449
    and-long v37, v2, v37

    .line 450
    .line 451
    cmp-long v26, v37, v27

    .line 452
    .line 453
    move-wide/from16 v37, v2

    .line 454
    .line 455
    if-eqz v26, :cond_1d

    .line 456
    .line 457
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->clickUserInfo:Landroid/view/View;

    .line 458
    .line 459
    invoke-static {v2, v6}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 460
    .line 461
    .line 462
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvLocation:Landroid/widget/TextView;

    .line 463
    .line 464
    invoke-static {v2, v6}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 465
    .line 466
    .line 467
    :cond_1d
    and-long v2, v37, v35

    .line 468
    .line 469
    cmp-long v2, v2, v27

    .line 470
    .line 471
    if-eqz v2, :cond_1e

    .line 472
    .line 473
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->ivDot:Landroid/view/View;

    .line 474
    .line 475
    invoke-static {v2, v12}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 476
    .line 477
    .line 478
    :cond_1e
    and-long v2, v37, v29

    .line 479
    .line 480
    cmp-long v2, v2, v27

    .line 481
    .line 482
    if-eqz v2, :cond_1f

    .line 483
    .line 484
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->ivWeather:Landroidx/appcompat/widget/AppCompatImageView;

    .line 485
    .line 486
    invoke-static {v2, v0}, Li4/h;->h(Landroid/widget/ImageView;Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;)V

    .line 487
    .line 488
    .line 489
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvTemp:Landroid/widget/TextView;

    .line 490
    .line 491
    invoke-static {v2, v0}, Li4/h;->i(Landroid/widget/TextView;Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;)V

    .line 492
    .line 493
    .line 494
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvWeather:Landroid/widget/TextView;

    .line 495
    .line 496
    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 497
    .line 498
    .line 499
    :cond_1f
    and-long v2, v37, v33

    .line 500
    .line 501
    cmp-long v0, v2, v27

    .line 502
    .line 503
    if-eqz v0, :cond_20

    .line 504
    .line 505
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->ivWeather2:Landroidx/appcompat/widget/AppCompatImageView;

    .line 506
    .line 507
    invoke-static {v0, v13}, Li4/h;->h(Landroid/widget/ImageView;Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;)V

    .line 508
    .line 509
    .line 510
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvTemp2:Landroid/widget/TextView;

    .line 511
    .line 512
    invoke-static {v0, v13}, Li4/h;->i(Landroid/widget/TextView;Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;)V

    .line 513
    .line 514
    .line 515
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvWeek2:Landroid/widget/TextView;

    .line 516
    .line 517
    invoke-static {v0, v13}, Li4/h;->j(Landroid/widget/TextView;Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;)V

    .line 518
    .line 519
    .line 520
    :cond_20
    and-long v2, v37, v16

    .line 521
    .line 522
    cmp-long v0, v2, v27

    .line 523
    .line 524
    if-eqz v0, :cond_21

    .line 525
    .line 526
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->ivWeather3:Landroidx/appcompat/widget/AppCompatImageView;

    .line 527
    .line 528
    invoke-static {v0, v11}, Li4/h;->h(Landroid/widget/ImageView;Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;)V

    .line 529
    .line 530
    .line 531
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvTemp3:Landroid/widget/TextView;

    .line 532
    .line 533
    invoke-static {v0, v11}, Li4/h;->i(Landroid/widget/TextView;Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;)V

    .line 534
    .line 535
    .line 536
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvWeek3:Landroid/widget/TextView;

    .line 537
    .line 538
    invoke-static {v0, v11}, Li4/h;->j(Landroid/widget/TextView;Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;)V

    .line 539
    .line 540
    .line 541
    :cond_21
    and-long v2, v37, v22

    .line 542
    .line 543
    cmp-long v0, v2, v27

    .line 544
    .line 545
    if-eqz v0, :cond_22

    .line 546
    .line 547
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvClass:Landroid/widget/TextView;

    .line 548
    .line 549
    invoke-static {v0, v5}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 550
    .line 551
    .line 552
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvStudyNo:Landroid/widget/TextView;

    .line 553
    .line 554
    invoke-static {v0, v7}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 555
    .line 556
    .line 557
    :cond_22
    and-long v2, v37, v20

    .line 558
    .line 559
    cmp-long v0, v2, v27

    .line 560
    .line 561
    if-eqz v0, :cond_23

    .line 562
    .line 563
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvDate:Landroid/widget/TextView;

    .line 564
    .line 565
    invoke-static {v0, v8}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 566
    .line 567
    .line 568
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvTime:Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    .line 569
    .line 570
    invoke-static {v0, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 571
    .line 572
    .line 573
    :cond_23
    and-long v2, v37, v31

    .line 574
    .line 575
    cmp-long v0, v2, v27

    .line 576
    .line 577
    if-eqz v0, :cond_24

    .line 578
    .line 579
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvLocation:Landroid/widget/TextView;

    .line 580
    .line 581
    invoke-static {v0, v14}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 582
    .line 583
    .line 584
    :cond_24
    const-wide/16 v2, 0x800

    .line 585
    .line 586
    and-long v2, v37, v2

    .line 587
    .line 588
    cmp-long v0, v2, v27

    .line 589
    .line 590
    if-eqz v0, :cond_25

    .line 591
    .line 592
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvLocation:Landroid/widget/TextView;

    .line 593
    .line 594
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 595
    .line 596
    .line 597
    move-result-object v2

    .line 598
    const v3, 0x7f070a03

    .line 599
    .line 600
    .line 601
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 602
    .line 603
    .line 604
    move-result v2

    .line 605
    iget-object v3, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvLocation:Landroid/widget/TextView;

    .line 606
    .line 607
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 608
    .line 609
    .line 610
    move-result-object v3

    .line 611
    const v4, 0x7f070a72

    .line 612
    .line 613
    .line 614
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 615
    .line 616
    .line 617
    move-result v3

    .line 618
    const v4, 0x7f0e0007

    .line 619
    .line 620
    .line 621
    invoke-static {v0, v4, v2, v3}, Li4/h;->f(Landroid/widget/TextView;IFF)V

    .line 622
    .line 623
    .line 624
    :cond_25
    and-long v2, v37, v18

    .line 625
    .line 626
    cmp-long v0, v2, v27

    .line 627
    .line 628
    if-eqz v0, :cond_26

    .line 629
    .line 630
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->tvName:Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    .line 631
    .line 632
    invoke-static {v0, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 633
    .line 634
    .line 635
    :cond_26
    and-long v2, v37, v24

    .line 636
    .line 637
    cmp-long v0, v2, v27

    .line 638
    .line 639
    if-eqz v0, :cond_27

    .line 640
    .line 641
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->weatherGroup:Landroidx/constraintlayout/widget/Group;

    .line 642
    .line 643
    invoke-static {v0, v15}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 644
    .line 645
    .line 646
    :cond_27
    return-void

    .line 647
    :catchall_0
    move-exception v0

    .line 648
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 649
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

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
    const-wide/16 v0, 0x800

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

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
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    return p1

    .line 6
    :pswitch_0
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 7
    .line 8
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->onChangeVmWeatherToady(Landroidx/lifecycle/LiveData;I)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :pswitch_1
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 14
    .line 15
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->onChangeVmWeatherLocation(Landroidx/lifecycle/LiveData;I)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :pswitch_2
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 21
    .line 22
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->onChangeVmWeatherTomorrow(Landroidx/lifecycle/LiveData;I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :pswitch_3
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 28
    .line 29
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->onChangeVmIsMsgDotVisible(Landroidx/lifecycle/LiveData;I)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1

    .line 34
    :pswitch_4
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 35
    .line 36
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->onChangeVmWeatherAfterTomorrow(Landroidx/lifecycle/LiveData;I)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    :pswitch_5
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 42
    .line 43
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->onChangeVmUserCacheBean(Landroidx/lifecycle/LiveData;I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :pswitch_6
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 49
    .line 50
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->onChangeVmShowHomeTime(Landroidx/lifecycle/LiveData;I)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :pswitch_7
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 56
    .line 57
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->onChangeVmStudentInfo(Landroidx/lifecycle/LiveData;I)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    return p1

    .line 62
    :pswitch_8
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 63
    .line 64
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->onChangeVmIsShowWeather(Landroidx/lifecycle/LiveData;I)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    return p1

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setClickListener(Landroid/view/View$OnClickListener;)V
    .locals 4
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x400

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

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
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->setVm(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)V

    .line 8
    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/4 v0, 0x2

    .line 12
    if-ne v0, p1, :cond_1

    .line 13
    .line 14
    check-cast p2, Landroid/view/View$OnClickListener;

    .line 15
    .line 16
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->setClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method public setVm(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBinding;->mVm:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x200

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl;->mDirtyFlags:J

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
