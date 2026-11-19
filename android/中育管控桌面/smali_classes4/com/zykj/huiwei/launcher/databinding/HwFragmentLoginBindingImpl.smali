.class public Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;
.super Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;
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
.field private etPasswordandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private etSchoolCodeandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private etUsernameandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

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

.field private policyCheckViewandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;


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
    sput-object v0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

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
    const/16 v2, 0x8

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
    sput-object v0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 39
    .line 40
    const v1, 0x7f09008c

    .line 41
    .line 42
    .line 43
    const/16 v2, 0x9

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 46
    .line 47
    .line 48
    const v1, 0x7f0901ae

    .line 49
    .line 50
    .line 51
    const/16 v2, 0xa

    .line 52
    .line 53
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 54
    .line 55
    .line 56
    const v1, 0x7f09035d

    .line 57
    .line 58
    .line 59
    const/16 v2, 0xb

    .line 60
    .line 61
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 62
    .line 63
    .line 64
    const v1, 0x7f090379

    .line 65
    .line 66
    .line 67
    const/16 v2, 0xc

    .line 68
    .line 69
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 70
    .line 71
    .line 72
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
    sget-object v0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0xd

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 14

    const/16 v0, 0x9

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroid/view/View;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroidx/appcompat/widget/AppCompatEditText;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroidx/appcompat/widget/AppCompatEditText;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroidx/appcompat/widget/AppCompatEditText;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroidx/appcompat/widget/AppCompatImageView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lcom/zykj/policy/ui/PolicyCheckView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroidx/appcompat/widget/AppCompatTextView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroid/widget/TextView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroid/widget/TextView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroid/widget/TextView;

    const/4 v3, 0x5

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v13}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/view/View;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatImageView;Lcom/zykj/policy/ui/PolicyCheckView;Landroidx/appcompat/widget/AppCompatTextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 3
    new-instance v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl$1;

    invoke-direct {v1, p0}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl$1;-><init>(Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;)V

    iput-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->etPasswordandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 4
    new-instance v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl$2;

    invoke-direct {v1, p0}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl$2;-><init>(Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;)V

    iput-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->etSchoolCodeandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 5
    new-instance v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl$3;

    invoke-direct {v1, p0}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl$3;-><init>(Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;)V

    iput-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->etUsernameandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 6
    new-instance v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl$4;

    invoke-direct {v1, p0}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl$4;-><init>(Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;)V

    iput-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->policyCheckViewandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

    const-wide/16 v1, -0x1

    .line 7
    iput-wide v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mDirtyFlags:J

    .line 8
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->etPassword:Landroidx/appcompat/widget/AppCompatEditText;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 9
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->etSchoolCode:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 10
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->etUsername:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 11
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/FrameLayout;

    iput-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mboundView0:Landroid/widget/FrameLayout;

    .line 12
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x1

    .line 13
    aget-object v1, p3, v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mboundView1:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 14
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/16 v1, 0x8

    .line 15
    aget-object v1, p3, v1

    check-cast v1, Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    iput-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 16
    invoke-virtual {p0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 17
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->policyCheckView:Lcom/zykj/policy/ui/PolicyCheckView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 18
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->tvNet:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 19
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->tvUpdateTime:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 20
    invoke-virtual {p0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 21
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeVmIsPolicyChecked(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmPassword(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x8

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmSchoolCode(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x10

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmShowLogin(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mDirtyFlags:J

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

.method private onChangeVmUserName(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x4

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mDirtyFlags:J

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
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->mVm:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 12
    .line 13
    const-wide/16 v6, 0x7f

    .line 14
    .line 15
    and-long/2addr v6, v2

    .line 16
    cmp-long v6, v6, v4

    .line 17
    .line 18
    const-wide/16 v9, 0x68

    .line 19
    .line 20
    const-wide/16 v11, 0x64

    .line 21
    .line 22
    const-wide/16 v13, 0x62

    .line 23
    .line 24
    const-wide/16 v15, 0x61

    .line 25
    .line 26
    move-wide/from16 v17, v4

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    if-eqz v6, :cond_d

    .line 31
    .line 32
    and-long v19, v2, v15

    .line 33
    .line 34
    cmp-long v6, v19, v17

    .line 35
    .line 36
    if-eqz v6, :cond_2

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->u()Landroidx/lifecycle/MutableLiveData;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v6, v5

    .line 46
    :goto_0
    invoke-virtual {v1, v4, v6}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 47
    .line 48
    .line 49
    if-eqz v6, :cond_1

    .line 50
    .line 51
    invoke-virtual {v6}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/Boolean;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-object v4, v5

    .line 59
    :goto_1
    invoke-static {v4}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    :cond_2
    and-long v19, v2, v13

    .line 64
    .line 65
    cmp-long v6, v19, v17

    .line 66
    .line 67
    if-eqz v6, :cond_4

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    :goto_2
    const-wide/16 v19, 0x70

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    move-object v6, v5

    .line 79
    goto :goto_2

    .line 80
    :goto_3
    const/4 v7, 0x1

    .line 81
    invoke-virtual {v1, v7, v6}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 82
    .line 83
    .line 84
    if-eqz v6, :cond_5

    .line 85
    .line 86
    invoke-virtual {v6}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    check-cast v6, Ljava/lang/Boolean;

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_4
    const-wide/16 v19, 0x70

    .line 94
    .line 95
    :cond_5
    move-object v6, v5

    .line 96
    :goto_4
    and-long v7, v2, v11

    .line 97
    .line 98
    cmp-long v7, v7, v17

    .line 99
    .line 100
    if-eqz v7, :cond_7

    .line 101
    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->r()Landroidx/lifecycle/MutableLiveData;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    goto :goto_5

    .line 109
    :cond_6
    move-object v7, v5

    .line 110
    :goto_5
    const/4 v8, 0x2

    .line 111
    invoke-virtual {v1, v8, v7}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 112
    .line 113
    .line 114
    if-eqz v7, :cond_7

    .line 115
    .line 116
    invoke-virtual {v7}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    check-cast v7, Ljava/lang/String;

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_7
    move-object v7, v5

    .line 124
    :goto_6
    and-long v21, v2, v9

    .line 125
    .line 126
    cmp-long v8, v21, v17

    .line 127
    .line 128
    if-eqz v8, :cond_9

    .line 129
    .line 130
    if-eqz v0, :cond_8

    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    :goto_7
    move-wide/from16 v21, v9

    .line 137
    .line 138
    goto :goto_8

    .line 139
    :cond_8
    move-object v8, v5

    .line 140
    goto :goto_7

    .line 141
    :goto_8
    const/4 v9, 0x3

    .line 142
    invoke-virtual {v1, v9, v8}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 143
    .line 144
    .line 145
    if-eqz v8, :cond_a

    .line 146
    .line 147
    invoke-virtual {v8}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    check-cast v8, Ljava/lang/String;

    .line 152
    .line 153
    goto :goto_9

    .line 154
    :cond_9
    move-wide/from16 v21, v9

    .line 155
    .line 156
    :cond_a
    move-object v8, v5

    .line 157
    :goto_9
    and-long v9, v2, v19

    .line 158
    .line 159
    cmp-long v9, v9, v17

    .line 160
    .line 161
    if-eqz v9, :cond_c

    .line 162
    .line 163
    if-eqz v0, :cond_b

    .line 164
    .line 165
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    goto :goto_a

    .line 170
    :cond_b
    move-object v9, v5

    .line 171
    :goto_a
    const/4 v10, 0x4

    .line 172
    invoke-virtual {v1, v10, v9}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 173
    .line 174
    .line 175
    if-eqz v9, :cond_c

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
    goto :goto_b

    .line 184
    :cond_c
    move-object v9, v5

    .line 185
    goto :goto_b

    .line 186
    :cond_d
    move-wide/from16 v21, v9

    .line 187
    .line 188
    const-wide/16 v19, 0x70

    .line 189
    .line 190
    move-object v6, v5

    .line 191
    move-object v7, v6

    .line 192
    move-object v8, v7

    .line 193
    move-object v9, v8

    .line 194
    :goto_b
    and-long v21, v2, v21

    .line 195
    .line 196
    cmp-long v10, v21, v17

    .line 197
    .line 198
    if-eqz v10, :cond_e

    .line 199
    .line 200
    iget-object v10, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->etPassword:Landroidx/appcompat/widget/AppCompatEditText;

    .line 201
    .line 202
    invoke-static {v10, v8}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 203
    .line 204
    .line 205
    :cond_e
    const-wide/16 v21, 0x40

    .line 206
    .line 207
    and-long v21, v2, v21

    .line 208
    .line 209
    cmp-long v8, v21, v17

    .line 210
    .line 211
    if-eqz v8, :cond_f

    .line 212
    .line 213
    iget-object v8, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->etPassword:Landroidx/appcompat/widget/AppCompatEditText;

    .line 214
    .line 215
    invoke-virtual {v8}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    move-wide/from16 v21, v11

    .line 220
    .line 221
    const v11, 0x7f07058b

    .line 222
    .line 223
    .line 224
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimension(I)F

    .line 225
    .line 226
    .line 227
    move-result v10

    .line 228
    const v12, 0x7f0e0011

    .line 229
    .line 230
    .line 231
    invoke-static {v8, v12, v10}, Li4/h;->e(Landroid/widget/TextView;IF)V

    .line 232
    .line 233
    .line 234
    iget-object v8, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->etPassword:Landroidx/appcompat/widget/AppCompatEditText;

    .line 235
    .line 236
    iget-object v10, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->etPasswordandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 237
    .line 238
    invoke-static {v8, v5, v5, v5, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 239
    .line 240
    .line 241
    iget-object v8, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->etSchoolCode:Landroidx/appcompat/widget/AppCompatEditText;

    .line 242
    .line 243
    invoke-virtual {v8}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimension(I)F

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    const v12, 0x7f0e0012

    .line 252
    .line 253
    .line 254
    invoke-static {v8, v12, v10}, Li4/h;->e(Landroid/widget/TextView;IF)V

    .line 255
    .line 256
    .line 257
    iget-object v8, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->etSchoolCode:Landroidx/appcompat/widget/AppCompatEditText;

    .line 258
    .line 259
    iget-object v10, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->etSchoolCodeandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 260
    .line 261
    invoke-static {v8, v5, v5, v5, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 262
    .line 263
    .line 264
    iget-object v8, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->etUsername:Landroidx/appcompat/widget/AppCompatEditText;

    .line 265
    .line 266
    invoke-virtual {v8}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimension(I)F

    .line 271
    .line 272
    .line 273
    move-result v10

    .line 274
    const v11, 0x7f0e0013

    .line 275
    .line 276
    .line 277
    invoke-static {v8, v11, v10}, Li4/h;->e(Landroid/widget/TextView;IF)V

    .line 278
    .line 279
    .line 280
    iget-object v8, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->etUsername:Landroidx/appcompat/widget/AppCompatEditText;

    .line 281
    .line 282
    iget-object v10, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->etUsernameandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 283
    .line 284
    invoke-static {v8, v5, v5, v5, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 285
    .line 286
    .line 287
    iget-object v8, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->policyCheckView:Lcom/zykj/policy/ui/PolicyCheckView;

    .line 288
    .line 289
    iget-object v10, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->policyCheckViewandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 290
    .line 291
    invoke-static {v8, v5, v10}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setListeners(Landroid/widget/CompoundButton;Landroid/widget/CompoundButton$OnCheckedChangeListener;Landroidx/databinding/InverseBindingListener;)V

    .line 292
    .line 293
    .line 294
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->tvNet:Landroid/widget/TextView;

    .line 295
    .line 296
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    const v10, 0x7f07043e

    .line 301
    .line 302
    .line 303
    invoke-virtual {v8, v10}, Landroid/content/res/Resources;->getDimension(I)F

    .line 304
    .line 305
    .line 306
    move-result v8

    .line 307
    const v11, 0x7f0e0010

    .line 308
    .line 309
    .line 310
    invoke-static {v5, v11, v8}, Li4/h;->e(Landroid/widget/TextView;IF)V

    .line 311
    .line 312
    .line 313
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->tvUpdateTime:Landroid/widget/TextView;

    .line 314
    .line 315
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 316
    .line 317
    .line 318
    move-result-object v8

    .line 319
    invoke-virtual {v8, v10}, Landroid/content/res/Resources;->getDimension(I)F

    .line 320
    .line 321
    .line 322
    move-result v8

    .line 323
    const v10, 0x7f0801cf

    .line 324
    .line 325
    .line 326
    invoke-static {v5, v10, v8}, Li4/h;->e(Landroid/widget/TextView;IF)V

    .line 327
    .line 328
    .line 329
    goto :goto_c

    .line 330
    :cond_f
    move-wide/from16 v21, v11

    .line 331
    .line 332
    :goto_c
    and-long v10, v2, v19

    .line 333
    .line 334
    cmp-long v5, v10, v17

    .line 335
    .line 336
    if-eqz v5, :cond_10

    .line 337
    .line 338
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->etSchoolCode:Landroidx/appcompat/widget/AppCompatEditText;

    .line 339
    .line 340
    invoke-static {v5, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 341
    .line 342
    .line 343
    :cond_10
    and-long v8, v2, v21

    .line 344
    .line 345
    cmp-long v5, v8, v17

    .line 346
    .line 347
    if-eqz v5, :cond_11

    .line 348
    .line 349
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->etUsername:Landroidx/appcompat/widget/AppCompatEditText;

    .line 350
    .line 351
    invoke-static {v5, v7}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 352
    .line 353
    .line 354
    :cond_11
    and-long v7, v2, v13

    .line 355
    .line 356
    cmp-long v5, v7, v17

    .line 357
    .line 358
    if-eqz v5, :cond_12

    .line 359
    .line 360
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mboundView1:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 361
    .line 362
    invoke-static {v5, v6}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 363
    .line 364
    .line 365
    :cond_12
    const-wide/16 v5, 0x60

    .line 366
    .line 367
    and-long/2addr v5, v2

    .line 368
    cmp-long v5, v5, v17

    .line 369
    .line 370
    if-eqz v5, :cond_13

    .line 371
    .line 372
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 373
    .line 374
    invoke-virtual {v5, v0}, Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;->setVm(Lcom/zykj/base/BaseViewModel;)V

    .line 375
    .line 376
    .line 377
    :cond_13
    and-long/2addr v2, v15

    .line 378
    cmp-long v0, v2, v17

    .line 379
    .line 380
    if-eqz v0, :cond_14

    .line 381
    .line 382
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->policyCheckView:Lcom/zykj/policy/ui/PolicyCheckView;

    .line 383
    .line 384
    invoke-static {v0, v4}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setChecked(Landroid/widget/CompoundButton;Z)V

    .line 385
    .line 386
    .line 387
    :cond_14
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 388
    .line 389
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 390
    .line 391
    .line 392
    return-void

    .line 393
    :catchall_0
    move-exception v0

    .line 394
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 395
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

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
    const-wide/16 v0, 0x40

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

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
    if-eqz p1, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_3

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_0
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 18
    .line 19
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->onChangeVmSchoolCode(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_1
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 25
    .line 26
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->onChangeVmPassword(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_2
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 32
    .line 33
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->onChangeVmUserName(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1

    .line 38
    :cond_3
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 39
    .line 40
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->onChangeVmShowLogin(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1

    .line 45
    :cond_4
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 46
    .line 47
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->onChangeVmIsPolicyChecked(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
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
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mboundView11:Lcom/zykj/huiwei/launcher/databinding/HwStateViewBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x7

    .line 2
    if-ne v0, p1, :cond_0

    .line 3
    .line 4
    check-cast p2, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 5
    .line 6
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->setVm(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public setVm(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->mVm:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x20

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl;->mDirtyFlags:J

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
