.class public Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;
.super Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;
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

.field private final mboundView0:Landroid/widget/FrameLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

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
    .locals 5

    .line 1
    new-instance v0, Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 9
    .line 10
    const-string v1, "hw_state_view"

    .line 11
    .line 12
    filled-new-array {v1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/16 v2, 0xb

    .line 17
    .line 18
    filled-new-array {v2}, [I

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const v3, 0x7f0c0058

    .line 23
    .line 24
    .line 25
    filled-new-array {v3}, [I

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const/4 v4, 0x1

    .line 30
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 31
    .line 32
    .line 33
    new-instance v0, Landroid/util/SparseIntArray;

    .line 34
    .line 35
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 39
    .line 40
    const v1, 0x7f0901ad

    .line 41
    .line 42
    .line 43
    const/16 v2, 0xc

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 46
    .line 47
    .line 48
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
    sget-object v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0xd

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 14

    const/4 v0, 0x6

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Lcom/zykj/huiwei/launcher/ui/view/BubbleProgressView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/view/View;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroidx/appcompat/widget/AppCompatImageView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/view/View;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroidx/appcompat/widget/AppCompatTextView;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroidx/appcompat/widget/AppCompatTextView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroidx/appcompat/widget/AppCompatTextView;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroid/widget/TextView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroidx/appcompat/widget/AppCompatTextView;

    const/16 v3, 0xb

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v13}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/huiwei/launcher/ui/view/BubbleProgressView;Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/ImageView;Landroid/view/View;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatTextView;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->bubbleProgress:Lcom/zykj/huiwei/launcher/ui/view/BubbleProgressView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->divider:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 6
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->ivClose:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 7
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/FrameLayout;

    iput-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mboundView0:Landroid/widget/FrameLayout;

    .line 8
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x1

    .line 9
    aget-object v1, p3, v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mboundView1:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 10
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/16 v1, 0xb

    .line 11
    aget-object v1, p3, v1

    check-cast v1, Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    iput-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 12
    invoke-virtual {p0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 13
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->spacer:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 14
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvCancel:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 15
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvConfirm:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 16
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvContent:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 17
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 18
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvVersion:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 19
    invoke-virtual {p0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 20
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeVmCancel(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x40

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmConfirm(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x100

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmContent(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x20

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmIsShowCancel(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x400

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmIsShowClose(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x200

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmIsShowConfirm(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmIsShowContent(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x4

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmIsShowProgress(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x80

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmProgress(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Float;",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x10

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmTitle(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmVersion(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x8

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

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
    .locals 53

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->mVm:Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 12
    .line 13
    iget-object v6, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->mOnClickListener:Landroid/view/View$OnClickListener;

    .line 14
    .line 15
    const-wide/16 v7, 0x2fff

    .line 16
    .line 17
    and-long/2addr v7, v2

    .line 18
    cmp-long v7, v7, v4

    .line 19
    .line 20
    const-wide/16 v16, 0x2880

    .line 21
    .line 22
    const-wide/16 v18, 0x2840

    .line 23
    .line 24
    const-wide/16 v20, 0x2820

    .line 25
    .line 26
    const-wide/16 v22, 0x2810

    .line 27
    .line 28
    const-wide/16 v24, 0x2808

    .line 29
    .line 30
    const-wide/16 v26, 0x2804

    .line 31
    .line 32
    const-wide/16 v28, 0x2802

    .line 33
    .line 34
    const-wide/16 v30, 0x2801

    .line 35
    .line 36
    move-wide/from16 v32, v4

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    const/4 v5, 0x0

    .line 40
    const/16 v34, 0x0

    .line 41
    .line 42
    const/16 v35, 0x0

    .line 43
    .line 44
    if-eqz v7, :cond_1e

    .line 45
    .line 46
    and-long v36, v2, v30

    .line 47
    .line 48
    cmp-long v7, v36, v32

    .line 49
    .line 50
    if-eqz v7, :cond_1

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->m()Landroidx/lifecycle/MutableLiveData;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move-object/from16 v7, v34

    .line 60
    .line 61
    :goto_0
    invoke-virtual {v1, v5, v7}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 62
    .line 63
    .line 64
    if-eqz v7, :cond_1

    .line 65
    .line 66
    invoke-virtual {v7}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    check-cast v7, Ljava/lang/String;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move-object/from16 v7, v34

    .line 74
    .line 75
    :goto_1
    and-long v36, v2, v28

    .line 76
    .line 77
    cmp-long v36, v36, v32

    .line 78
    .line 79
    if-eqz v36, :cond_4

    .line 80
    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->s()Landroidx/lifecycle/MutableLiveData;

    .line 84
    .line 85
    .line 86
    move-result-object v36

    .line 87
    move-object/from16 v5, v36

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    move-object/from16 v5, v34

    .line 91
    .line 92
    :goto_2
    invoke-virtual {v1, v4, v5}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 93
    .line 94
    .line 95
    if-eqz v5, :cond_3

    .line 96
    .line 97
    invoke-virtual {v5}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v37

    .line 101
    check-cast v37, Ljava/lang/Boolean;

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_3
    move-object/from16 v37, v34

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    move-object/from16 v5, v34

    .line 108
    .line 109
    move-object/from16 v37, v5

    .line 110
    .line 111
    :goto_3
    and-long v38, v2, v26

    .line 112
    .line 113
    cmp-long v38, v38, v32

    .line 114
    .line 115
    if-eqz v38, :cond_7

    .line 116
    .line 117
    if-eqz v0, :cond_5

    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->t()Landroidx/lifecycle/MutableLiveData;

    .line 120
    .line 121
    .line 122
    move-result-object v38

    .line 123
    move-object/from16 v8, v38

    .line 124
    .line 125
    :goto_4
    const-wide/32 v38, 0x8000

    .line 126
    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_5
    move-object/from16 v8, v34

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :goto_5
    const/4 v9, 0x2

    .line 133
    invoke-virtual {v1, v9, v8}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 134
    .line 135
    .line 136
    if-eqz v8, :cond_6

    .line 137
    .line 138
    invoke-virtual {v8}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    check-cast v8, Ljava/lang/Boolean;

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_6
    move-object/from16 v8, v34

    .line 146
    .line 147
    :goto_6
    invoke-static {v8}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    xor-int/2addr v9, v4

    .line 152
    goto :goto_7

    .line 153
    :cond_7
    const-wide/32 v38, 0x8000

    .line 154
    .line 155
    .line 156
    move-object/from16 v8, v34

    .line 157
    .line 158
    const/4 v9, 0x0

    .line 159
    :goto_7
    and-long v40, v2, v24

    .line 160
    .line 161
    cmp-long v40, v40, v32

    .line 162
    .line 163
    if-eqz v40, :cond_9

    .line 164
    .line 165
    if-eqz v0, :cond_8

    .line 166
    .line 167
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 168
    .line 169
    .line 170
    move-result-object v40

    .line 171
    move-object/from16 v10, v40

    .line 172
    .line 173
    :goto_8
    const-wide/16 v40, 0x2c02

    .line 174
    .line 175
    goto :goto_9

    .line 176
    :cond_8
    move-object/from16 v10, v34

    .line 177
    .line 178
    goto :goto_8

    .line 179
    :goto_9
    const/4 v11, 0x3

    .line 180
    invoke-virtual {v1, v11, v10}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 181
    .line 182
    .line 183
    if-eqz v10, :cond_a

    .line 184
    .line 185
    invoke-virtual {v10}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    check-cast v10, Ljava/lang/String;

    .line 190
    .line 191
    goto :goto_a

    .line 192
    :cond_9
    const-wide/16 v40, 0x2c02

    .line 193
    .line 194
    :cond_a
    move-object/from16 v10, v34

    .line 195
    .line 196
    :goto_a
    and-long v42, v2, v22

    .line 197
    .line 198
    cmp-long v11, v42, v32

    .line 199
    .line 200
    if-eqz v11, :cond_d

    .line 201
    .line 202
    if-eqz v0, :cond_b

    .line 203
    .line 204
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 205
    .line 206
    .line 207
    move-result-object v11

    .line 208
    :goto_b
    const-wide/16 v42, 0x2a00

    .line 209
    .line 210
    goto :goto_c

    .line 211
    :cond_b
    move-object/from16 v11, v34

    .line 212
    .line 213
    goto :goto_b

    .line 214
    :goto_c
    const/4 v12, 0x4

    .line 215
    invoke-virtual {v1, v12, v11}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 216
    .line 217
    .line 218
    if-eqz v11, :cond_c

    .line 219
    .line 220
    invoke-virtual {v11}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    check-cast v11, Ljava/lang/Float;

    .line 225
    .line 226
    goto :goto_d

    .line 227
    :cond_c
    move-object/from16 v11, v34

    .line 228
    .line 229
    :goto_d
    invoke-static {v11}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Float;)F

    .line 230
    .line 231
    .line 232
    move-result v35

    .line 233
    goto :goto_e

    .line 234
    :cond_d
    const-wide/16 v42, 0x2a00

    .line 235
    .line 236
    :goto_e
    and-long v11, v2, v20

    .line 237
    .line 238
    cmp-long v11, v11, v32

    .line 239
    .line 240
    if-eqz v11, :cond_f

    .line 241
    .line 242
    if-eqz v0, :cond_e

    .line 243
    .line 244
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 245
    .line 246
    .line 247
    move-result-object v11

    .line 248
    goto :goto_f

    .line 249
    :cond_e
    move-object/from16 v11, v34

    .line 250
    .line 251
    :goto_f
    const/4 v12, 0x5

    .line 252
    invoke-virtual {v1, v12, v11}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 253
    .line 254
    .line 255
    if-eqz v11, :cond_f

    .line 256
    .line 257
    invoke-virtual {v11}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    check-cast v11, Ljava/lang/String;

    .line 262
    .line 263
    goto :goto_10

    .line 264
    :cond_f
    move-object/from16 v11, v34

    .line 265
    .line 266
    :goto_10
    and-long v12, v2, v18

    .line 267
    .line 268
    cmp-long v12, v12, v32

    .line 269
    .line 270
    if-eqz v12, :cond_11

    .line 271
    .line 272
    if-eqz v0, :cond_10

    .line 273
    .line 274
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 275
    .line 276
    .line 277
    move-result-object v12

    .line 278
    goto :goto_11

    .line 279
    :cond_10
    move-object/from16 v12, v34

    .line 280
    .line 281
    :goto_11
    const/4 v13, 0x6

    .line 282
    invoke-virtual {v1, v13, v12}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 283
    .line 284
    .line 285
    if-eqz v12, :cond_11

    .line 286
    .line 287
    invoke-virtual {v12}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v12

    .line 291
    check-cast v12, Ljava/lang/String;

    .line 292
    .line 293
    goto :goto_12

    .line 294
    :cond_11
    move-object/from16 v12, v34

    .line 295
    .line 296
    :goto_12
    and-long v44, v2, v16

    .line 297
    .line 298
    cmp-long v13, v44, v32

    .line 299
    .line 300
    if-eqz v13, :cond_13

    .line 301
    .line 302
    if-eqz v0, :cond_12

    .line 303
    .line 304
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->u()Landroidx/lifecycle/MutableLiveData;

    .line 305
    .line 306
    .line 307
    move-result-object v13

    .line 308
    :goto_13
    const-wide/16 v44, 0x2900

    .line 309
    .line 310
    goto :goto_14

    .line 311
    :cond_12
    move-object/from16 v13, v34

    .line 312
    .line 313
    goto :goto_13

    .line 314
    :goto_14
    const/4 v14, 0x7

    .line 315
    invoke-virtual {v1, v14, v13}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 316
    .line 317
    .line 318
    if-eqz v13, :cond_14

    .line 319
    .line 320
    invoke-virtual {v13}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v13

    .line 324
    check-cast v13, Ljava/lang/Boolean;

    .line 325
    .line 326
    goto :goto_15

    .line 327
    :cond_13
    const-wide/16 v44, 0x2900

    .line 328
    .line 329
    :cond_14
    move-object/from16 v13, v34

    .line 330
    .line 331
    :goto_15
    and-long v14, v2, v44

    .line 332
    .line 333
    cmp-long v14, v14, v32

    .line 334
    .line 335
    if-eqz v14, :cond_16

    .line 336
    .line 337
    if-eqz v0, :cond_15

    .line 338
    .line 339
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->g()Landroidx/lifecycle/MutableLiveData;

    .line 340
    .line 341
    .line 342
    move-result-object v14

    .line 343
    goto :goto_16

    .line 344
    :cond_15
    move-object/from16 v14, v34

    .line 345
    .line 346
    :goto_16
    const/16 v15, 0x8

    .line 347
    .line 348
    invoke-virtual {v1, v15, v14}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 349
    .line 350
    .line 351
    if-eqz v14, :cond_16

    .line 352
    .line 353
    invoke-virtual {v14}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v14

    .line 357
    check-cast v14, Ljava/lang/String;

    .line 358
    .line 359
    goto :goto_17

    .line 360
    :cond_16
    move-object/from16 v14, v34

    .line 361
    .line 362
    :goto_17
    and-long v46, v2, v42

    .line 363
    .line 364
    cmp-long v15, v46, v32

    .line 365
    .line 366
    if-eqz v15, :cond_18

    .line 367
    .line 368
    if-eqz v0, :cond_17

    .line 369
    .line 370
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->r()Landroidx/lifecycle/MutableLiveData;

    .line 371
    .line 372
    .line 373
    move-result-object v15

    .line 374
    goto :goto_18

    .line 375
    :cond_17
    move-object/from16 v15, v34

    .line 376
    .line 377
    :goto_18
    const/16 v4, 0x9

    .line 378
    .line 379
    invoke-virtual {v1, v4, v15}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 380
    .line 381
    .line 382
    if-eqz v15, :cond_18

    .line 383
    .line 384
    invoke-virtual {v15}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v4

    .line 388
    check-cast v4, Ljava/lang/Boolean;

    .line 389
    .line 390
    goto :goto_19

    .line 391
    :cond_18
    move-object/from16 v4, v34

    .line 392
    .line 393
    :goto_19
    and-long v47, v2, v40

    .line 394
    .line 395
    cmp-long v15, v47, v32

    .line 396
    .line 397
    if-eqz v15, :cond_1d

    .line 398
    .line 399
    if-eqz v0, :cond_19

    .line 400
    .line 401
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->q()Landroidx/lifecycle/MutableLiveData;

    .line 402
    .line 403
    .line 404
    move-result-object v47

    .line 405
    move-wide/from16 v51, v2

    .line 406
    .line 407
    move-object/from16 v2, v47

    .line 408
    .line 409
    move-wide/from16 v47, v51

    .line 410
    .line 411
    goto :goto_1a

    .line 412
    :cond_19
    move-wide/from16 v47, v2

    .line 413
    .line 414
    move-object/from16 v2, v34

    .line 415
    .line 416
    :goto_1a
    const/16 v3, 0xa

    .line 417
    .line 418
    invoke-virtual {v1, v3, v2}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 419
    .line 420
    .line 421
    if-eqz v2, :cond_1a

    .line 422
    .line 423
    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    move-object/from16 v34, v2

    .line 428
    .line 429
    check-cast v34, Ljava/lang/Boolean;

    .line 430
    .line 431
    :cond_1a
    invoke-static/range {v34 .. v34}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 432
    .line 433
    .line 434
    move-result v2

    .line 435
    if-eqz v15, :cond_1b

    .line 436
    .line 437
    if-eqz v2, :cond_1c

    .line 438
    .line 439
    or-long v47, v47, v38

    .line 440
    .line 441
    :cond_1b
    :goto_1b
    move-object v15, v10

    .line 442
    move-object v10, v7

    .line 443
    move-object/from16 v7, v34

    .line 444
    .line 445
    move-object/from16 v34, v5

    .line 446
    .line 447
    move-object v5, v4

    .line 448
    move v4, v2

    .line 449
    move/from16 v2, v35

    .line 450
    .line 451
    goto :goto_1c

    .line 452
    :cond_1c
    const-wide/16 v49, 0x4000

    .line 453
    .line 454
    or-long v47, v47, v49

    .line 455
    .line 456
    goto :goto_1b

    .line 457
    :cond_1d
    move-wide/from16 v47, v2

    .line 458
    .line 459
    move-object v15, v10

    .line 460
    move/from16 v2, v35

    .line 461
    .line 462
    move-object v10, v7

    .line 463
    move-object/from16 v7, v34

    .line 464
    .line 465
    move-object/from16 v34, v5

    .line 466
    .line 467
    move-object v5, v4

    .line 468
    const/4 v4, 0x0

    .line 469
    goto :goto_1c

    .line 470
    :cond_1e
    move-wide/from16 v47, v2

    .line 471
    .line 472
    const-wide/32 v38, 0x8000

    .line 473
    .line 474
    .line 475
    const-wide/16 v40, 0x2c02

    .line 476
    .line 477
    const-wide/16 v42, 0x2a00

    .line 478
    .line 479
    const-wide/16 v44, 0x2900

    .line 480
    .line 481
    move-object/from16 v5, v34

    .line 482
    .line 483
    move-object v7, v5

    .line 484
    move-object v8, v7

    .line 485
    move-object v10, v8

    .line 486
    move-object v11, v10

    .line 487
    move-object v12, v11

    .line 488
    move-object v13, v12

    .line 489
    move-object v14, v13

    .line 490
    move-object v15, v14

    .line 491
    move-object/from16 v37, v15

    .line 492
    .line 493
    move/from16 v2, v35

    .line 494
    .line 495
    const/4 v4, 0x0

    .line 496
    const/4 v9, 0x0

    .line 497
    :goto_1c
    const-wide/16 v49, 0x3000

    .line 498
    .line 499
    and-long v49, v47, v49

    .line 500
    .line 501
    cmp-long v3, v49, v32

    .line 502
    .line 503
    and-long v38, v47, v38

    .line 504
    .line 505
    cmp-long v35, v38, v32

    .line 506
    .line 507
    if-eqz v35, :cond_21

    .line 508
    .line 509
    if-eqz v0, :cond_1f

    .line 510
    .line 511
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->s()Landroidx/lifecycle/MutableLiveData;

    .line 512
    .line 513
    .line 514
    move-result-object v34

    .line 515
    :cond_1f
    move/from16 v35, v3

    .line 516
    .line 517
    move-object/from16 v3, v34

    .line 518
    .line 519
    move/from16 v34, v4

    .line 520
    .line 521
    const/4 v4, 0x1

    .line 522
    invoke-virtual {v1, v4, v3}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 523
    .line 524
    .line 525
    if-eqz v3, :cond_20

    .line 526
    .line 527
    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    move-object/from16 v37, v3

    .line 532
    .line 533
    check-cast v37, Ljava/lang/Boolean;

    .line 534
    .line 535
    :cond_20
    invoke-static/range {v37 .. v37}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 536
    .line 537
    .line 538
    move-result v3

    .line 539
    :goto_1d
    move-object/from16 v4, v37

    .line 540
    .line 541
    goto :goto_1e

    .line 542
    :cond_21
    move/from16 v35, v3

    .line 543
    .line 544
    move/from16 v34, v4

    .line 545
    .line 546
    const/4 v3, 0x0

    .line 547
    goto :goto_1d

    .line 548
    :goto_1e
    and-long v37, v47, v40

    .line 549
    .line 550
    cmp-long v37, v37, v32

    .line 551
    .line 552
    if-eqz v37, :cond_22

    .line 553
    .line 554
    if-eqz v34, :cond_22

    .line 555
    .line 556
    goto :goto_1f

    .line 557
    :cond_22
    const/4 v3, 0x0

    .line 558
    :goto_1f
    and-long v22, v47, v22

    .line 559
    .line 560
    cmp-long v22, v22, v32

    .line 561
    .line 562
    if-eqz v22, :cond_23

    .line 563
    .line 564
    move/from16 v22, v3

    .line 565
    .line 566
    iget-object v3, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->bubbleProgress:Lcom/zykj/huiwei/launcher/ui/view/BubbleProgressView;

    .line 567
    .line 568
    invoke-static {v3, v2}, Li4/h;->c(Lcom/zykj/huiwei/launcher/ui/view/BubbleProgressView;F)V

    .line 569
    .line 570
    .line 571
    goto :goto_20

    .line 572
    :cond_23
    move/from16 v22, v3

    .line 573
    .line 574
    :goto_20
    and-long v2, v47, v16

    .line 575
    .line 576
    cmp-long v2, v2, v32

    .line 577
    .line 578
    if-eqz v2, :cond_24

    .line 579
    .line 580
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->bubbleProgress:Lcom/zykj/huiwei/launcher/ui/view/BubbleProgressView;

    .line 581
    .line 582
    invoke-static {v2, v13}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 583
    .line 584
    .line 585
    :cond_24
    and-long v2, v47, v26

    .line 586
    .line 587
    cmp-long v2, v2, v32

    .line 588
    .line 589
    if-eqz v2, :cond_25

    .line 590
    .line 591
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->divider:Landroid/view/View;

    .line 592
    .line 593
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 594
    .line 595
    .line 596
    move-result-object v3

    .line 597
    invoke-static {v2, v3}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 598
    .line 599
    .line 600
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvContent:Landroidx/appcompat/widget/AppCompatTextView;

    .line 601
    .line 602
    invoke-static {v2, v8}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 603
    .line 604
    .line 605
    :cond_25
    const-wide/16 v2, 0x2000

    .line 606
    .line 607
    and-long v2, v47, v2

    .line 608
    .line 609
    cmp-long v2, v2, v32

    .line 610
    .line 611
    if-eqz v2, :cond_26

    .line 612
    .line 613
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->ivClose:Landroidx/appcompat/widget/AppCompatImageView;

    .line 614
    .line 615
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 616
    .line 617
    .line 618
    move-result-object v3

    .line 619
    const v8, 0x7f070a03

    .line 620
    .line 621
    .line 622
    invoke-virtual {v3, v8}, Landroid/content/res/Resources;->getDimension(I)F

    .line 623
    .line 624
    .line 625
    move-result v3

    .line 626
    invoke-static {v2, v3}, Li4/h;->a(Landroid/view/View;F)V

    .line 627
    .line 628
    .line 629
    :cond_26
    if-eqz v35, :cond_27

    .line 630
    .line 631
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->ivClose:Landroidx/appcompat/widget/AppCompatImageView;

    .line 632
    .line 633
    invoke-static {v2, v6}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 634
    .line 635
    .line 636
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvCancel:Landroidx/appcompat/widget/AppCompatTextView;

    .line 637
    .line 638
    invoke-static {v2, v6}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 639
    .line 640
    .line 641
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvConfirm:Landroidx/appcompat/widget/AppCompatTextView;

    .line 642
    .line 643
    invoke-static {v2, v6}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 644
    .line 645
    .line 646
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvTitle:Landroid/widget/TextView;

    .line 647
    .line 648
    invoke-static {v2, v6}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 649
    .line 650
    .line 651
    :cond_27
    and-long v2, v47, v42

    .line 652
    .line 653
    cmp-long v2, v2, v32

    .line 654
    .line 655
    if-eqz v2, :cond_28

    .line 656
    .line 657
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->ivClose:Landroidx/appcompat/widget/AppCompatImageView;

    .line 658
    .line 659
    invoke-static {v2, v5}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 660
    .line 661
    .line 662
    :cond_28
    const-wide/16 v2, 0x2800

    .line 663
    .line 664
    and-long v2, v47, v2

    .line 665
    .line 666
    cmp-long v2, v2, v32

    .line 667
    .line 668
    if-eqz v2, :cond_29

    .line 669
    .line 670
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 671
    .line 672
    invoke-virtual {v2, v0}, Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;->setVm(Lcom/zykj/base/BaseViewModel;)V

    .line 673
    .line 674
    .line 675
    :cond_29
    if-eqz v37, :cond_2a

    .line 676
    .line 677
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->spacer:Landroid/view/View;

    .line 678
    .line 679
    invoke-static/range {v22 .. v22}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    invoke-static {v0, v2}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 684
    .line 685
    .line 686
    :cond_2a
    const-wide/16 v2, 0x2c00

    .line 687
    .line 688
    and-long v2, v47, v2

    .line 689
    .line 690
    cmp-long v0, v2, v32

    .line 691
    .line 692
    if-eqz v0, :cond_2b

    .line 693
    .line 694
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvCancel:Landroidx/appcompat/widget/AppCompatTextView;

    .line 695
    .line 696
    invoke-static {v0, v7}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 697
    .line 698
    .line 699
    :cond_2b
    and-long v2, v47, v18

    .line 700
    .line 701
    cmp-long v0, v2, v32

    .line 702
    .line 703
    if-eqz v0, :cond_2c

    .line 704
    .line 705
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvCancel:Landroidx/appcompat/widget/AppCompatTextView;

    .line 706
    .line 707
    invoke-static {v0, v12}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 708
    .line 709
    .line 710
    :cond_2c
    and-long v2, v47, v28

    .line 711
    .line 712
    cmp-long v0, v2, v32

    .line 713
    .line 714
    if-eqz v0, :cond_2d

    .line 715
    .line 716
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvConfirm:Landroidx/appcompat/widget/AppCompatTextView;

    .line 717
    .line 718
    invoke-static {v0, v4}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 719
    .line 720
    .line 721
    :cond_2d
    and-long v2, v47, v44

    .line 722
    .line 723
    cmp-long v0, v2, v32

    .line 724
    .line 725
    if-eqz v0, :cond_2e

    .line 726
    .line 727
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvConfirm:Landroidx/appcompat/widget/AppCompatTextView;

    .line 728
    .line 729
    invoke-static {v0, v14}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 730
    .line 731
    .line 732
    :cond_2e
    and-long v2, v47, v20

    .line 733
    .line 734
    cmp-long v0, v2, v32

    .line 735
    .line 736
    if-eqz v0, :cond_2f

    .line 737
    .line 738
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvContent:Landroidx/appcompat/widget/AppCompatTextView;

    .line 739
    .line 740
    invoke-static {v0, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 741
    .line 742
    .line 743
    :cond_2f
    and-long v2, v47, v30

    .line 744
    .line 745
    cmp-long v0, v2, v32

    .line 746
    .line 747
    if-eqz v0, :cond_30

    .line 748
    .line 749
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvTitle:Landroid/widget/TextView;

    .line 750
    .line 751
    invoke-static {v0, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 752
    .line 753
    .line 754
    :cond_30
    and-long v2, v47, v24

    .line 755
    .line 756
    cmp-long v0, v2, v32

    .line 757
    .line 758
    if-eqz v0, :cond_31

    .line 759
    .line 760
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvVersion:Landroidx/appcompat/widget/AppCompatTextView;

    .line 761
    .line 762
    invoke-static {v0, v15}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 763
    .line 764
    .line 765
    :cond_31
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 766
    .line 767
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 768
    .line 769
    .line 770
    return-void

    .line 771
    :catchall_0
    move-exception v0

    .line 772
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 773
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

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
    const/4 v0, 0x0

    .line 26
    return v0

    .line 27
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x2000

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
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
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 7
    .line 8
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->onChangeVmIsShowCancel(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :pswitch_1
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 14
    .line 15
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->onChangeVmIsShowClose(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :pswitch_2
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 21
    .line 22
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->onChangeVmConfirm(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :pswitch_3
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 28
    .line 29
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->onChangeVmIsShowProgress(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1

    .line 34
    :pswitch_4
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 35
    .line 36
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->onChangeVmCancel(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    :pswitch_5
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 42
    .line 43
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->onChangeVmContent(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :pswitch_6
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 49
    .line 50
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->onChangeVmProgress(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :pswitch_7
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 56
    .line 57
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->onChangeVmVersion(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    return p1

    .line 62
    :pswitch_8
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 63
    .line 64
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->onChangeVmIsShowContent(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    return p1

    .line 69
    :pswitch_9
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 70
    .line 71
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->onChangeVmIsShowConfirm(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    return p1

    .line 76
    :pswitch_a
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 77
    .line 78
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->onChangeVmTitle(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    return p1

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
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
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 4
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->mOnClickListener:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x1000

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/4 p1, 0x6

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
    check-cast p2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->setVm(Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;)V

    .line 8
    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/4 v0, 0x6

    .line 12
    if-ne v0, p1, :cond_1

    .line 13
    .line 14
    check-cast p2, Landroid/view/View$OnClickListener;

    .line 15
    .line 16
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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

.method public setVm(Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->mVm:Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x800

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl;->mDirtyFlags:J

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
