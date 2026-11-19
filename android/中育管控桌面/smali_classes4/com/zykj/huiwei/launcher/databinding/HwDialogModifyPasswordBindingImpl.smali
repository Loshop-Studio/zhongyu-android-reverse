.class public Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;
.super Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;
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
.field private etNewPass1androidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private etNewPassandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private etOldPassandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

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
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

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
    const/16 v2, 0xa

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
    sput-object v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 39
    .line 40
    const v1, 0x7f09036c

    .line 41
    .line 42
    .line 43
    const/16 v2, 0xb

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 46
    .line 47
    .line 48
    const v1, 0x7f090365

    .line 49
    .line 50
    .line 51
    const/16 v2, 0xc

    .line 52
    .line 53
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 54
    .line 55
    .line 56
    const v1, 0x7f090366

    .line 57
    .line 58
    .line 59
    const/16 v2, 0xd

    .line 60
    .line 61
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 62
    .line 63
    .line 64
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
    sget-object v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0xe

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 15

    const/4 v0, 0x5

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroidx/appcompat/widget/AppCompatEditText;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroidx/appcompat/widget/AppCompatEditText;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroidx/appcompat/widget/AppCompatEditText;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroidx/appcompat/widget/AppCompatImageView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroid/widget/TextView;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroid/widget/TextView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroid/widget/TextView;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Landroid/widget/TextView;

    const/4 v3, 0x6

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v14}, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 3
    new-instance v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl$1;

    invoke-direct {v1, p0}, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl$1;-><init>(Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;)V

    iput-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->etNewPassandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 4
    new-instance v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl$2;

    invoke-direct {v1, p0}, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl$2;-><init>(Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;)V

    iput-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->etNewPass1androidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 5
    new-instance v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl$3;

    invoke-direct {v1, p0}, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl$3;-><init>(Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;)V

    iput-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->etOldPassandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    const-wide/16 v1, -0x1

    .line 6
    iput-wide v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

    .line 7
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->etNewPass:Landroidx/appcompat/widget/AppCompatEditText;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->etNewPass1:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 9
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->etOldPass:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 10
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->ivClose:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 11
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/FrameLayout;

    iput-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mboundView0:Landroid/widget/FrameLayout;

    .line 12
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x1

    .line 13
    aget-object v1, p3, v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mboundView1:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 14
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/16 v1, 0xa

    .line 15
    aget-object v1, p3, v1

    check-cast v1, Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    iput-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 16
    invoke-virtual {p0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 17
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->tvModify:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 18
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->tvNewPassTips:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 19
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->tvNewPassTips1:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 20
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 21
    invoke-virtual {p0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 22
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeVmDoubleNewPassTips(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmDoubleNewPasswordLiveData(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x8

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmIsBtnEnable(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmNewPassTips(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x10

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmNewPasswordLiveData(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x4

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmOldPasswordLiveData(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x20

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

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
    iget-wide v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->mVm:Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;

    .line 12
    .line 13
    iget-object v6, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->mOnClickListener:Landroid/view/View$OnClickListener;

    .line 14
    .line 15
    const-wide/16 v7, 0x17f

    .line 16
    .line 17
    and-long/2addr v7, v2

    .line 18
    cmp-long v7, v7, v4

    .line 19
    .line 20
    const-wide/16 v12, 0x148

    .line 21
    .line 22
    const-wide/16 v14, 0x144

    .line 23
    .line 24
    const-wide/16 v16, 0x142

    .line 25
    .line 26
    const-wide/16 v18, 0x141

    .line 27
    .line 28
    move-wide/from16 v20, v4

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    if-eqz v7, :cond_f

    .line 33
    .line 34
    and-long v22, v2, v18

    .line 35
    .line 36
    cmp-long v7, v22, v20

    .line 37
    .line 38
    if-eqz v7, :cond_1

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-object v7, v5

    .line 48
    :goto_0
    invoke-virtual {v1, v4, v7}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 49
    .line 50
    .line 51
    if-eqz v7, :cond_1

    .line 52
    .line 53
    invoke-virtual {v7}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    check-cast v7, Ljava/lang/Boolean;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move-object v7, v5

    .line 61
    :goto_1
    and-long v22, v2, v16

    .line 62
    .line 63
    cmp-long v22, v22, v20

    .line 64
    .line 65
    if-eqz v22, :cond_4

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->g()Landroidx/lifecycle/MutableLiveData;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    :goto_2
    const-wide/16 v22, 0x160

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_2
    move-object v4, v5

    .line 77
    goto :goto_2

    .line 78
    :goto_3
    const/4 v8, 0x1

    .line 79
    invoke-virtual {v1, v8, v4}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 80
    .line 81
    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Ljava/lang/Boolean;

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_3
    move-object v4, v5

    .line 92
    :goto_4
    invoke-static {v4}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    goto :goto_5

    .line 97
    :cond_4
    const-wide/16 v22, 0x160

    .line 98
    .line 99
    :goto_5
    and-long v8, v2, v14

    .line 100
    .line 101
    cmp-long v8, v8, v20

    .line 102
    .line 103
    if-eqz v8, :cond_6

    .line 104
    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    goto :goto_6

    .line 112
    :cond_5
    move-object v8, v5

    .line 113
    :goto_6
    const/4 v9, 0x2

    .line 114
    invoke-virtual {v1, v9, v8}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 115
    .line 116
    .line 117
    if-eqz v8, :cond_6

    .line 118
    .line 119
    invoke-virtual {v8}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    check-cast v8, Ljava/lang/String;

    .line 124
    .line 125
    goto :goto_7

    .line 126
    :cond_6
    move-object v8, v5

    .line 127
    :goto_7
    and-long v24, v2, v12

    .line 128
    .line 129
    cmp-long v9, v24, v20

    .line 130
    .line 131
    if-eqz v9, :cond_8

    .line 132
    .line 133
    if-eqz v0, :cond_7

    .line 134
    .line 135
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    :goto_8
    const-wide/16 v24, 0x150

    .line 140
    .line 141
    goto :goto_9

    .line 142
    :cond_7
    move-object v9, v5

    .line 143
    goto :goto_8

    .line 144
    :goto_9
    const/4 v10, 0x3

    .line 145
    invoke-virtual {v1, v10, v9}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 146
    .line 147
    .line 148
    if-eqz v9, :cond_9

    .line 149
    .line 150
    invoke-virtual {v9}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    check-cast v9, Ljava/lang/String;

    .line 155
    .line 156
    goto :goto_a

    .line 157
    :cond_8
    const-wide/16 v24, 0x150

    .line 158
    .line 159
    :cond_9
    move-object v9, v5

    .line 160
    :goto_a
    and-long v10, v2, v24

    .line 161
    .line 162
    cmp-long v10, v10, v20

    .line 163
    .line 164
    if-eqz v10, :cond_b

    .line 165
    .line 166
    if-eqz v0, :cond_a

    .line 167
    .line 168
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->d()Landroidx/lifecycle/MutableLiveData;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    goto :goto_b

    .line 173
    :cond_a
    move-object v10, v5

    .line 174
    :goto_b
    const/4 v11, 0x4

    .line 175
    invoke-virtual {v1, v11, v10}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 176
    .line 177
    .line 178
    if-eqz v10, :cond_b

    .line 179
    .line 180
    invoke-virtual {v10}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    check-cast v10, Ljava/lang/Boolean;

    .line 185
    .line 186
    goto :goto_c

    .line 187
    :cond_b
    move-object v10, v5

    .line 188
    :goto_c
    and-long v26, v2, v22

    .line 189
    .line 190
    cmp-long v11, v26, v20

    .line 191
    .line 192
    if-eqz v11, :cond_d

    .line 193
    .line 194
    if-eqz v0, :cond_c

    .line 195
    .line 196
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    :goto_d
    move-wide/from16 v26, v12

    .line 201
    .line 202
    goto :goto_e

    .line 203
    :cond_c
    move-object v11, v5

    .line 204
    goto :goto_d

    .line 205
    :goto_e
    const/4 v12, 0x5

    .line 206
    invoke-virtual {v1, v12, v11}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 207
    .line 208
    .line 209
    if-eqz v11, :cond_e

    .line 210
    .line 211
    invoke-virtual {v11}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    check-cast v11, Ljava/lang/String;

    .line 216
    .line 217
    goto :goto_f

    .line 218
    :cond_d
    move-wide/from16 v26, v12

    .line 219
    .line 220
    :cond_e
    move-object v11, v5

    .line 221
    goto :goto_f

    .line 222
    :cond_f
    move-wide/from16 v26, v12

    .line 223
    .line 224
    const-wide/16 v22, 0x160

    .line 225
    .line 226
    const-wide/16 v24, 0x150

    .line 227
    .line 228
    move-object v7, v5

    .line 229
    move-object v8, v7

    .line 230
    move-object v9, v8

    .line 231
    move-object v10, v9

    .line 232
    move-object v11, v10

    .line 233
    :goto_f
    const-wide/16 v12, 0x180

    .line 234
    .line 235
    and-long/2addr v12, v2

    .line 236
    cmp-long v12, v12, v20

    .line 237
    .line 238
    and-long v13, v2, v14

    .line 239
    .line 240
    cmp-long v13, v13, v20

    .line 241
    .line 242
    if-eqz v13, :cond_10

    .line 243
    .line 244
    iget-object v13, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->etNewPass:Landroidx/appcompat/widget/AppCompatEditText;

    .line 245
    .line 246
    invoke-static {v13, v8}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 247
    .line 248
    .line 249
    :cond_10
    const-wide/16 v13, 0x100

    .line 250
    .line 251
    and-long/2addr v13, v2

    .line 252
    cmp-long v8, v13, v20

    .line 253
    .line 254
    if-eqz v8, :cond_11

    .line 255
    .line 256
    iget-object v8, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->etNewPass:Landroidx/appcompat/widget/AppCompatEditText;

    .line 257
    .line 258
    iget-object v13, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->etNewPassandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 259
    .line 260
    invoke-static {v8, v5, v5, v5, v13}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 261
    .line 262
    .line 263
    iget-object v8, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->etNewPass1:Landroidx/appcompat/widget/AppCompatEditText;

    .line 264
    .line 265
    iget-object v13, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->etNewPass1androidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 266
    .line 267
    invoke-static {v8, v5, v5, v5, v13}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 268
    .line 269
    .line 270
    iget-object v8, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->etOldPass:Landroidx/appcompat/widget/AppCompatEditText;

    .line 271
    .line 272
    iget-object v13, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->etOldPassandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 273
    .line 274
    invoke-static {v8, v5, v5, v5, v13}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 275
    .line 276
    .line 277
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->ivClose:Landroidx/appcompat/widget/AppCompatImageView;

    .line 278
    .line 279
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 280
    .line 281
    .line 282
    move-result-object v8

    .line 283
    const v13, 0x7f070a03

    .line 284
    .line 285
    .line 286
    invoke-virtual {v8, v13}, Landroid/content/res/Resources;->getDimension(I)F

    .line 287
    .line 288
    .line 289
    move-result v8

    .line 290
    invoke-static {v5, v8}, Li4/h;->a(Landroid/view/View;F)V

    .line 291
    .line 292
    .line 293
    :cond_11
    and-long v13, v2, v26

    .line 294
    .line 295
    cmp-long v5, v13, v20

    .line 296
    .line 297
    if-eqz v5, :cond_12

    .line 298
    .line 299
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->etNewPass1:Landroidx/appcompat/widget/AppCompatEditText;

    .line 300
    .line 301
    invoke-static {v5, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 302
    .line 303
    .line 304
    :cond_12
    and-long v8, v2, v22

    .line 305
    .line 306
    cmp-long v5, v8, v20

    .line 307
    .line 308
    if-eqz v5, :cond_13

    .line 309
    .line 310
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->etOldPass:Landroidx/appcompat/widget/AppCompatEditText;

    .line 311
    .line 312
    invoke-static {v5, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 313
    .line 314
    .line 315
    :cond_13
    if-eqz v12, :cond_14

    .line 316
    .line 317
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->ivClose:Landroidx/appcompat/widget/AppCompatImageView;

    .line 318
    .line 319
    invoke-static {v5, v6}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 320
    .line 321
    .line 322
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->tvModify:Landroid/widget/TextView;

    .line 323
    .line 324
    invoke-static {v5, v6}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 325
    .line 326
    .line 327
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->tvTitle:Landroid/widget/TextView;

    .line 328
    .line 329
    invoke-static {v5, v6}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 330
    .line 331
    .line 332
    :cond_14
    const-wide/16 v5, 0x140

    .line 333
    .line 334
    and-long/2addr v5, v2

    .line 335
    cmp-long v5, v5, v20

    .line 336
    .line 337
    if-eqz v5, :cond_15

    .line 338
    .line 339
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 340
    .line 341
    invoke-virtual {v5, v0}, Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;->setVm(Lcom/zykj/base/BaseViewModel;)V

    .line 342
    .line 343
    .line 344
    :cond_15
    and-long v5, v2, v16

    .line 345
    .line 346
    cmp-long v0, v5, v20

    .line 347
    .line 348
    if-eqz v0, :cond_16

    .line 349
    .line 350
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->tvModify:Landroid/widget/TextView;

    .line 351
    .line 352
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 353
    .line 354
    .line 355
    :cond_16
    and-long v4, v2, v24

    .line 356
    .line 357
    cmp-long v0, v4, v20

    .line 358
    .line 359
    if-eqz v0, :cond_17

    .line 360
    .line 361
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->tvNewPassTips:Landroid/widget/TextView;

    .line 362
    .line 363
    invoke-static {v0, v10}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 364
    .line 365
    .line 366
    :cond_17
    and-long v2, v2, v18

    .line 367
    .line 368
    cmp-long v0, v2, v20

    .line 369
    .line 370
    if-eqz v0, :cond_18

    .line 371
    .line 372
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->tvNewPassTips1:Landroid/widget/TextView;

    .line 373
    .line 374
    invoke-static {v0, v7}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 375
    .line 376
    .line 377
    :cond_18
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 378
    .line 379
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 380
    .line 381
    .line 382
    return-void

    .line 383
    :catchall_0
    move-exception v0

    .line 384
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 385
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

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
    const-wide/16 v0, 0x100

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

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
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 21
    .line 22
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->onChangeVmOldPasswordLiveData(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_1
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 28
    .line 29
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->onChangeVmNewPassTips(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1

    .line 34
    :cond_2
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 35
    .line 36
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->onChangeVmDoubleNewPasswordLiveData(Landroidx/lifecycle/MutableLiveData;I)Z

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
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->onChangeVmNewPasswordLiveData(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :cond_4
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 49
    .line 50
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->onChangeVmIsBtnEnable(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :cond_5
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 56
    .line 57
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->onChangeVmDoubleNewPassTips(Landroidx/lifecycle/MutableLiveData;I)Z

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
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->mOnClickListener:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x80

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

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
    check-cast p2, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->setVm(Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;)V

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
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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

.method public setVm(Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBinding;->mVm:Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x40

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl;->mDirtyFlags:J

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
