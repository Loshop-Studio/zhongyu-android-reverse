.class public Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;
.super Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;
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

.field private final mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;
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
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

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
    const/4 v2, 0x4

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
    new-instance v0, Landroid/util/SparseIntArray;

    .line 32
    .line 33
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 37
    .line 38
    sget v1, Lcom/zykj/study/R$id;->toolbar:I

    .line 39
    .line 40
    const/4 v2, 0x5

    .line 41
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 42
    .line 43
    .line 44
    sget v1, Lcom/zykj/study/R$id;->multiple_status_view:I

    .line 45
    .line 46
    const/4 v2, 0x6

    .line 47
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 48
    .line 49
    .line 50
    sget v1, Lcom/zykj/study/R$id;->viewPager:I

    .line 51
    .line 52
    const/4 v2, 0x7

    .line 53
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 54
    .line 55
    .line 56
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
    sget-object v0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x8

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 12

    const/4 v0, 0x0

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroidx/viewpager2/widget/ViewPager2;

    const/4 v4, 0x5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v11}, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;Lcom/xuexiang/xui/widget/actionbar/TitleBar;Landroid/widget/TextView;Landroidx/viewpager2/widget/ViewPager2;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;->fragmentTeachDetails:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object p1, v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;->imageView16:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 6
    iget-object p1, v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;->imageView17:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 7
    aget-object p1, p3, p1

    check-cast p1, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    iput-object p1, v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 8
    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 9
    iget-object p1, v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;->tvCourseProgress:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 10
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 11
    invoke-virtual {p0}, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelCurrentMemberProgressLiveData(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/zykj/study/bean/teach/GroupMemberProgress;",
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x10

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mDirtyFlags:J

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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelIsMenuPopupShow(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelSelectFragmentIndex(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Integer;",
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x4

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mDirtyFlags:J

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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x8

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mDirtyFlags:J

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
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;->mViewModel:Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

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
    const-wide/16 v9, 0x70

    .line 19
    .line 20
    const-wide/16 v11, 0x68

    .line 21
    .line 22
    const-wide/16 v13, 0x1400

    .line 23
    .line 24
    const-wide/16 v15, 0x65

    .line 25
    .line 26
    const-wide/16 v17, 0x62

    .line 27
    .line 28
    move-wide/from16 v19, v4

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    if-eqz v6, :cond_10

    .line 32
    .line 33
    and-long v21, v2, v17

    .line 34
    .line 35
    cmp-long v6, v21, v19

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 v6, 0x0

    .line 48
    :goto_0
    invoke-virtual {v1, v5, v6}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 49
    .line 50
    .line 51
    if-eqz v6, :cond_1

    .line 52
    .line 53
    invoke-virtual {v6}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Ljava/lang/Boolean;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const/4 v6, 0x0

    .line 61
    :goto_1
    and-long v22, v2, v15

    .line 62
    .line 63
    cmp-long v22, v22, v19

    .line 64
    .line 65
    if-eqz v22, :cond_6

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 70
    .line 71
    .line 72
    move-result-object v23

    .line 73
    move-object/from16 v5, v23

    .line 74
    .line 75
    :goto_2
    const-wide/16 v24, 0x80

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_2
    const/4 v5, 0x0

    .line 79
    goto :goto_2

    .line 80
    :goto_3
    const/4 v7, 0x2

    .line 81
    invoke-virtual {v1, v7, v5}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 82
    .line 83
    .line 84
    if-eqz v5, :cond_3

    .line 85
    .line 86
    invoke-virtual {v5}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    check-cast v5, Ljava/lang/Integer;

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_3
    const/4 v5, 0x0

    .line 94
    :goto_4
    invoke-static {v5}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-nez v5, :cond_4

    .line 99
    .line 100
    const/4 v5, 0x1

    .line 101
    goto :goto_5

    .line 102
    :cond_4
    move v5, v4

    .line 103
    :goto_5
    if-eqz v22, :cond_7

    .line 104
    .line 105
    if-eqz v5, :cond_5

    .line 106
    .line 107
    or-long/2addr v2, v13

    .line 108
    goto :goto_6

    .line 109
    :cond_5
    const-wide/16 v7, 0xa00

    .line 110
    .line 111
    or-long/2addr v2, v7

    .line 112
    goto :goto_6

    .line 113
    :cond_6
    const-wide/16 v24, 0x80

    .line 114
    .line 115
    move v5, v4

    .line 116
    :cond_7
    :goto_6
    and-long v7, v2, v11

    .line 117
    .line 118
    cmp-long v7, v7, v19

    .line 119
    .line 120
    if-eqz v7, :cond_9

    .line 121
    .line 122
    if-eqz v0, :cond_8

    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    goto :goto_7

    .line 129
    :cond_8
    const/4 v7, 0x0

    .line 130
    :goto_7
    const/4 v8, 0x3

    .line 131
    invoke-virtual {v1, v8, v7}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 132
    .line 133
    .line 134
    if-eqz v7, :cond_a

    .line 135
    .line 136
    invoke-virtual {v7}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    check-cast v8, Lcom/zykj/base/bean/toast/ToastMessage;

    .line 141
    .line 142
    goto :goto_8

    .line 143
    :cond_9
    const/4 v7, 0x0

    .line 144
    :cond_a
    :goto_8
    and-long v26, v2, v9

    .line 145
    .line 146
    cmp-long v8, v26, v19

    .line 147
    .line 148
    if-eqz v8, :cond_f

    .line 149
    .line 150
    if-eqz v0, :cond_b

    .line 151
    .line 152
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 153
    .line 154
    .line 155
    move-result-object v22

    .line 156
    move-wide/from16 v26, v9

    .line 157
    .line 158
    move-object/from16 v9, v22

    .line 159
    .line 160
    goto :goto_9

    .line 161
    :cond_b
    move-wide/from16 v26, v9

    .line 162
    .line 163
    const/4 v9, 0x0

    .line 164
    :goto_9
    const/4 v10, 0x4

    .line 165
    invoke-virtual {v1, v10, v9}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 166
    .line 167
    .line 168
    if-eqz v9, :cond_c

    .line 169
    .line 170
    invoke-virtual {v9}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    check-cast v9, Lcom/zykj/study/bean/teach/GroupMemberProgress;

    .line 175
    .line 176
    goto :goto_a

    .line 177
    :cond_c
    const/4 v9, 0x0

    .line 178
    :goto_a
    if-nez v9, :cond_d

    .line 179
    .line 180
    const/16 v23, 0x1

    .line 181
    .line 182
    goto :goto_b

    .line 183
    :cond_d
    move/from16 v23, v4

    .line 184
    .line 185
    :goto_b
    if-eqz v8, :cond_11

    .line 186
    .line 187
    if-eqz v23, :cond_e

    .line 188
    .line 189
    const-wide/16 v28, 0x100

    .line 190
    .line 191
    or-long v2, v2, v28

    .line 192
    .line 193
    goto :goto_d

    .line 194
    :cond_e
    or-long v2, v2, v24

    .line 195
    .line 196
    goto :goto_d

    .line 197
    :cond_f
    move-wide/from16 v26, v9

    .line 198
    .line 199
    move/from16 v23, v4

    .line 200
    .line 201
    :goto_c
    const/4 v9, 0x0

    .line 202
    goto :goto_d

    .line 203
    :cond_10
    move-wide/from16 v26, v9

    .line 204
    .line 205
    const-wide/16 v24, 0x80

    .line 206
    .line 207
    move v5, v4

    .line 208
    move/from16 v23, v5

    .line 209
    .line 210
    const/4 v6, 0x0

    .line 211
    const/4 v7, 0x0

    .line 212
    goto :goto_c

    .line 213
    :cond_11
    :goto_d
    and-long v24, v2, v24

    .line 214
    .line 215
    cmp-long v8, v24, v19

    .line 216
    .line 217
    if-eqz v8, :cond_13

    .line 218
    .line 219
    if-eqz v9, :cond_12

    .line 220
    .line 221
    invoke-virtual {v9}, Lcom/zykj/study/bean/teach/GroupMemberProgress;->getGroupName()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    invoke-virtual {v9}, Lcom/zykj/study/bean/teach/GroupMemberProgress;->getMembers()I

    .line 226
    .line 227
    .line 228
    move-result v9

    .line 229
    goto :goto_e

    .line 230
    :cond_12
    move v9, v4

    .line 231
    const/4 v8, 0x0

    .line 232
    :goto_e
    iget-object v10, v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;->tvCourseProgress:Landroid/widget/TextView;

    .line 233
    .line 234
    invoke-virtual {v10}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    move-wide/from16 v24, v11

    .line 239
    .line 240
    sget v11, Lcom/zykj/study/R$string;->supervise_group_name_with_member:I

    .line 241
    .line 242
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    filled-new-array {v8, v9}, [Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    invoke-virtual {v10, v11, v8}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    goto :goto_f

    .line 255
    :cond_13
    move-wide/from16 v24, v11

    .line 256
    .line 257
    const/4 v8, 0x0

    .line 258
    :goto_f
    and-long v9, v2, v13

    .line 259
    .line 260
    cmp-long v9, v9, v19

    .line 261
    .line 262
    if-eqz v9, :cond_17

    .line 263
    .line 264
    if-eqz v0, :cond_14

    .line 265
    .line 266
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    goto :goto_10

    .line 271
    :cond_14
    const/4 v0, 0x0

    .line 272
    :goto_10
    invoke-virtual {v1, v4, v0}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 273
    .line 274
    .line 275
    if-eqz v0, :cond_15

    .line 276
    .line 277
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    check-cast v0, Ljava/lang/Boolean;

    .line 282
    .line 283
    goto :goto_11

    .line 284
    :cond_15
    const/4 v0, 0x0

    .line 285
    :goto_11
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    const-wide/16 v9, 0x1000

    .line 290
    .line 291
    and-long/2addr v9, v2

    .line 292
    cmp-long v9, v9, v19

    .line 293
    .line 294
    if-eqz v9, :cond_16

    .line 295
    .line 296
    xor-int/lit8 v9, v0, 0x1

    .line 297
    .line 298
    goto :goto_12

    .line 299
    :cond_16
    move v9, v4

    .line 300
    goto :goto_12

    .line 301
    :cond_17
    move v0, v4

    .line 302
    move v9, v0

    .line 303
    :goto_12
    and-long v10, v2, v26

    .line 304
    .line 305
    cmp-long v10, v10, v19

    .line 306
    .line 307
    if-eqz v10, :cond_18

    .line 308
    .line 309
    if-eqz v23, :cond_19

    .line 310
    .line 311
    const-string v8, ""

    .line 312
    .line 313
    goto :goto_13

    .line 314
    :cond_18
    const/4 v8, 0x0

    .line 315
    :cond_19
    :goto_13
    and-long v11, v2, v15

    .line 316
    .line 317
    cmp-long v11, v11, v19

    .line 318
    .line 319
    if-eqz v11, :cond_1b

    .line 320
    .line 321
    if-eqz v5, :cond_1a

    .line 322
    .line 323
    goto :goto_14

    .line 324
    :cond_1a
    move v0, v4

    .line 325
    :goto_14
    if-eqz v5, :cond_1c

    .line 326
    .line 327
    move v4, v9

    .line 328
    goto :goto_15

    .line 329
    :cond_1b
    move v0, v4

    .line 330
    :cond_1c
    :goto_15
    if-eqz v11, :cond_1d

    .line 331
    .line 332
    iget-object v9, v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;->imageView16:Landroid/widget/ImageView;

    .line 333
    .line 334
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    invoke-static {v9, v4}, Le5/c;->t(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 339
    .line 340
    .line 341
    iget-object v4, v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;->imageView17:Landroid/widget/ImageView;

    .line 342
    .line 343
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-static {v4, v0}, Le5/c;->t(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 348
    .line 349
    .line 350
    :cond_1d
    and-long v11, v2, v17

    .line 351
    .line 352
    cmp-long v0, v11, v19

    .line 353
    .line 354
    if-eqz v0, :cond_1e

    .line 355
    .line 356
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 357
    .line 358
    invoke-virtual {v0, v6}, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;->setIsDialogVisible(Ljava/lang/Boolean;)V

    .line 359
    .line 360
    .line 361
    :cond_1e
    and-long v11, v2, v24

    .line 362
    .line 363
    cmp-long v0, v11, v19

    .line 364
    .line 365
    if-eqz v0, :cond_1f

    .line 366
    .line 367
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 368
    .line 369
    invoke-virtual {v0, v7}, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;->setToastLiveData(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)V

    .line 370
    .line 371
    .line 372
    :cond_1f
    if-eqz v10, :cond_20

    .line 373
    .line 374
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;->tvCourseProgress:Landroid/widget/TextView;

    .line 375
    .line 376
    invoke-static {v0, v8}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 377
    .line 378
    .line 379
    :cond_20
    const-wide/16 v6, 0x64

    .line 380
    .line 381
    and-long/2addr v2, v6

    .line 382
    cmp-long v0, v2, v19

    .line 383
    .line 384
    if-eqz v0, :cond_21

    .line 385
    .line 386
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;->tvCourseProgress:Landroid/widget/TextView;

    .line 387
    .line 388
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-static {v0, v2}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 393
    .line 394
    .line 395
    :cond_21
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 396
    .line 397
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 398
    .line 399
    .line 400
    return-void

    .line 401
    :catchall_0
    move-exception v0

    .line 402
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 403
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

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
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

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
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->onChangeViewModelCurrentMemberProgressLiveData(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_1
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 25
    .line 26
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->onChangeViewModelToastLiveData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

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
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->onChangeViewModelSelectFragmentIndex(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1

    .line 38
    :cond_3
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 39
    .line 40
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->onChangeViewModelIsDialogVisible(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

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
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->onChangeViewModelIsMenuPopupShow(Landroidx/lifecycle/MutableLiveData;I)Z

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
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

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
    const/16 v0, 0x3b

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    check-cast p2, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->setViewModel(Lcom/zykj/study/viewmodels/TeachDetailsViewModel;)V

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

.method public setViewModel(Lcom/zykj/study/viewmodels/TeachDetailsViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/study/viewmodels/TeachDetailsViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;->mViewModel:Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x20

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentTeachDetailsBindingImpl;->mDirtyFlags:J

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
