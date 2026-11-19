.class public Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;
.super Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;
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

.field private final mboundView3:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
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
    sput-object v0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

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
    const/16 v2, 0x8

    .line 17
    .line 18
    filled-new-array {v2}, [I

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    sget v3, Lcom/zykj/study/R$layout;->layout_bind_view_model:I

    .line 23
    .line 24
    filled-new-array {v3}, [I

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Landroid/util/SparseIntArray;

    .line 33
    .line 34
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 38
    .line 39
    sget v1, Lcom/zykj/study/R$id;->toolbar:I

    .line 40
    .line 41
    const/16 v2, 0x9

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 44
    .line 45
    .line 46
    sget v1, Lcom/zykj/study/R$id;->tv_user_name:I

    .line 47
    .line 48
    const/16 v2, 0xa

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 51
    .line 52
    .line 53
    sget v1, Lcom/zykj/study/R$id;->multiple_status_view:I

    .line 54
    .line 55
    const/16 v2, 0xb

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 58
    .line 59
    .line 60
    sget v1, Lcom/zykj/study/R$id;->fragment_student_exercise:I

    .line 61
    .line 62
    const/16 v2, 0xc

    .line 63
    .line 64
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 65
    .line 66
    .line 67
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
    sget-object v0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0xd

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 15

    const/16 v0, 0xc

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroidx/fragment/app/FragmentContainerView;

    const/4 v0, 0x0

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroidx/appcompat/widget/AppCompatImageView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroidx/appcompat/widget/AppCompatImageView;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/LinearLayout;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/LinearLayout;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Lcom/zykj/study/view/MultipleStatusView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroid/widget/TextView;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Landroidx/appcompat/widget/AppCompatTextView;

    const/4 v3, 0x4

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v14}, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/fragment/app/FragmentContainerView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lcom/zykj/study/view/MultipleStatusView;Lcom/xuexiang/xui/widget/actionbar/TitleBar;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatTextView;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object v1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->fragmentStudentExercises:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object v1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->imageView17:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 6
    iget-object v1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->ivLast:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 7
    iget-object v1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->ivNext:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    iget-object v1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->llGroupSelect:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 9
    iget-object v1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->llUserSelect:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/16 v1, 0x8

    .line 10
    aget-object v1, p3, v1

    check-cast v1, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    iput-object v1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 11
    invoke-virtual {p0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 v1, 0x3

    .line 12
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mboundView3:Landroid/widget/ImageView;

    .line 13
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 14
    iget-object v1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->tvCourseProgress:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 15
    invoke-virtual {p0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 16
    invoke-virtual {p0}, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelCurrentStatisticsGroupLiveData(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/zykj/study/bean/exercise/ExerciseBean;",
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x8

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelIsShowLiveData(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x4

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

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
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-boolean v0, v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->mFromScore:Z

    .line 12
    .line 13
    iget-boolean v6, v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->mEnable:Z

    .line 14
    .line 15
    iget-object v7, v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->mExamClickListener:Landroid/view/View$OnClickListener;

    .line 16
    .line 17
    iget-object v8, v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->mViewModel:Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 18
    .line 19
    const-wide/16 v9, 0x110

    .line 20
    .line 21
    and-long v11, v2, v9

    .line 22
    .line 23
    cmp-long v11, v11, v4

    .line 24
    .line 25
    const/4 v12, 0x0

    .line 26
    if-eqz v11, :cond_0

    .line 27
    .line 28
    xor-int/lit8 v11, v0, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v11, v12

    .line 32
    :goto_0
    const-wide/16 v13, 0x18f

    .line 33
    .line 34
    and-long/2addr v13, v2

    .line 35
    cmp-long v13, v13, v4

    .line 36
    .line 37
    const-wide/16 v14, 0x188

    .line 38
    .line 39
    const-wide/16 v16, 0x184

    .line 40
    .line 41
    const-wide/16 v18, 0x182

    .line 42
    .line 43
    const-wide/16 v20, 0x181

    .line 44
    .line 45
    const/16 v22, 0x0

    .line 46
    .line 47
    if-eqz v13, :cond_f

    .line 48
    .line 49
    and-long v23, v2, v20

    .line 50
    .line 51
    cmp-long v13, v23, v4

    .line 52
    .line 53
    if-eqz v13, :cond_2

    .line 54
    .line 55
    if-eqz v8, :cond_1

    .line 56
    .line 57
    invoke-virtual {v8}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 58
    .line 59
    .line 60
    move-result-object v13

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    move-object/from16 v13, v22

    .line 63
    .line 64
    :goto_1
    invoke-virtual {v1, v12, v13}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 65
    .line 66
    .line 67
    if-eqz v13, :cond_2

    .line 68
    .line 69
    invoke-virtual {v13}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    check-cast v13, Ljava/lang/Boolean;

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    move-object/from16 v13, v22

    .line 77
    .line 78
    :goto_2
    and-long v23, v2, v18

    .line 79
    .line 80
    cmp-long v23, v23, v4

    .line 81
    .line 82
    move-wide/from16 v24, v4

    .line 83
    .line 84
    const/4 v4, 0x1

    .line 85
    if-eqz v23, :cond_5

    .line 86
    .line 87
    if-eqz v8, :cond_3

    .line 88
    .line 89
    invoke-virtual {v8}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    goto :goto_3

    .line 94
    :cond_3
    move-object/from16 v5, v22

    .line 95
    .line 96
    :goto_3
    invoke-virtual {v1, v4, v5}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 97
    .line 98
    .line 99
    if-eqz v5, :cond_4

    .line 100
    .line 101
    invoke-virtual {v5}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    check-cast v5, Ljava/lang/Boolean;

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_4
    move-object/from16 v5, v22

    .line 109
    .line 110
    :goto_4
    invoke-static {v5}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 111
    .line 112
    .line 113
    move-result v23

    .line 114
    xor-int/lit8 v23, v23, 0x1

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_5
    move/from16 v23, v12

    .line 118
    .line 119
    move-object/from16 v5, v22

    .line 120
    .line 121
    :goto_5
    and-long v26, v2, v16

    .line 122
    .line 123
    cmp-long v26, v26, v24

    .line 124
    .line 125
    if-eqz v26, :cond_7

    .line 126
    .line 127
    if-eqz v8, :cond_6

    .line 128
    .line 129
    invoke-virtual {v8}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 130
    .line 131
    .line 132
    move-result-object v26

    .line 133
    move-object/from16 v4, v26

    .line 134
    .line 135
    :goto_6
    move-wide/from16 v27, v9

    .line 136
    .line 137
    goto :goto_7

    .line 138
    :cond_6
    move-object/from16 v4, v22

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :goto_7
    const/4 v9, 0x2

    .line 142
    invoke-virtual {v1, v9, v4}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 143
    .line 144
    .line 145
    if-eqz v4, :cond_8

    .line 146
    .line 147
    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    check-cast v9, Lcom/zykj/base/bean/toast/ToastMessage;

    .line 152
    .line 153
    goto :goto_8

    .line 154
    :cond_7
    move-wide/from16 v27, v9

    .line 155
    .line 156
    move-object/from16 v4, v22

    .line 157
    .line 158
    :cond_8
    :goto_8
    and-long v9, v2, v14

    .line 159
    .line 160
    cmp-long v9, v9, v24

    .line 161
    .line 162
    if-eqz v9, :cond_e

    .line 163
    .line 164
    if-eqz v8, :cond_9

    .line 165
    .line 166
    invoke-virtual {v8}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    goto :goto_9

    .line 171
    :cond_9
    move-object/from16 v8, v22

    .line 172
    .line 173
    :goto_9
    const/4 v10, 0x3

    .line 174
    invoke-virtual {v1, v10, v8}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 175
    .line 176
    .line 177
    if-eqz v8, :cond_a

    .line 178
    .line 179
    invoke-virtual {v8}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    check-cast v8, Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 184
    .line 185
    goto :goto_a

    .line 186
    :cond_a
    move-object/from16 v8, v22

    .line 187
    .line 188
    :goto_a
    if-eqz v8, :cond_b

    .line 189
    .line 190
    invoke-virtual {v8}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getTitle()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    goto :goto_b

    .line 195
    :cond_b
    move-object/from16 v8, v22

    .line 196
    .line 197
    :goto_b
    if-nez v8, :cond_c

    .line 198
    .line 199
    const/4 v12, 0x1

    .line 200
    :cond_c
    if-eqz v9, :cond_10

    .line 201
    .line 202
    if-eqz v12, :cond_d

    .line 203
    .line 204
    const-wide/16 v9, 0x400

    .line 205
    .line 206
    :goto_c
    or-long/2addr v2, v9

    .line 207
    goto :goto_d

    .line 208
    :cond_d
    const-wide/16 v9, 0x200

    .line 209
    .line 210
    goto :goto_c

    .line 211
    :cond_e
    move-object/from16 v8, v22

    .line 212
    .line 213
    goto :goto_d

    .line 214
    :cond_f
    move-wide/from16 v24, v4

    .line 215
    .line 216
    move-wide/from16 v27, v9

    .line 217
    .line 218
    move/from16 v23, v12

    .line 219
    .line 220
    move-object/from16 v4, v22

    .line 221
    .line 222
    move-object v5, v4

    .line 223
    move-object v8, v5

    .line 224
    move-object v13, v8

    .line 225
    :cond_10
    :goto_d
    and-long v9, v2, v14

    .line 226
    .line 227
    cmp-long v9, v9, v24

    .line 228
    .line 229
    if-eqz v9, :cond_12

    .line 230
    .line 231
    if-eqz v12, :cond_11

    .line 232
    .line 233
    const-string v8, ""

    .line 234
    .line 235
    :cond_11
    move-object/from16 v22, v8

    .line 236
    .line 237
    :cond_12
    move-object/from16 v8, v22

    .line 238
    .line 239
    and-long v14, v2, v18

    .line 240
    .line 241
    cmp-long v10, v14, v24

    .line 242
    .line 243
    if-eqz v10, :cond_13

    .line 244
    .line 245
    iget-object v10, v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->imageView17:Landroid/widget/ImageView;

    .line 246
    .line 247
    invoke-static {v10, v5}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 248
    .line 249
    .line 250
    iget-object v5, v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mboundView3:Landroid/widget/ImageView;

    .line 251
    .line 252
    invoke-static/range {v23 .. v23}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 253
    .line 254
    .line 255
    move-result-object v10

    .line 256
    invoke-static {v5, v10}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 257
    .line 258
    .line 259
    :cond_13
    const-wide/16 v14, 0x120

    .line 260
    .line 261
    and-long/2addr v14, v2

    .line 262
    cmp-long v5, v14, v24

    .line 263
    .line 264
    if-eqz v5, :cond_14

    .line 265
    .line 266
    iget-object v5, v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->ivLast:Landroidx/appcompat/widget/AppCompatImageView;

    .line 267
    .line 268
    invoke-static {v5, v6}, Le5/c;->b(Landroid/view/View;Z)V

    .line 269
    .line 270
    .line 271
    iget-object v5, v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->ivNext:Landroidx/appcompat/widget/AppCompatImageView;

    .line 272
    .line 273
    invoke-static {v5, v6}, Le5/c;->b(Landroid/view/View;Z)V

    .line 274
    .line 275
    .line 276
    :cond_14
    const-wide/16 v5, 0x140

    .line 277
    .line 278
    and-long/2addr v5, v2

    .line 279
    cmp-long v5, v5, v24

    .line 280
    .line 281
    if-eqz v5, :cond_15

    .line 282
    .line 283
    iget-object v5, v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->llGroupSelect:Landroid/widget/LinearLayout;

    .line 284
    .line 285
    invoke-virtual {v5, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 286
    .line 287
    .line 288
    :cond_15
    and-long v5, v2, v27

    .line 289
    .line 290
    cmp-long v5, v5, v24

    .line 291
    .line 292
    if-eqz v5, :cond_16

    .line 293
    .line 294
    iget-object v5, v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->llGroupSelect:Landroid/widget/LinearLayout;

    .line 295
    .line 296
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    invoke-static {v5, v6}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 301
    .line 302
    .line 303
    iget-object v5, v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->llUserSelect:Landroid/widget/LinearLayout;

    .line 304
    .line 305
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-static {v5, v0}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 310
    .line 311
    .line 312
    :cond_16
    and-long v5, v2, v20

    .line 313
    .line 314
    cmp-long v0, v5, v24

    .line 315
    .line 316
    if-eqz v0, :cond_17

    .line 317
    .line 318
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 319
    .line 320
    invoke-virtual {v0, v13}, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;->setIsDialogVisible(Ljava/lang/Boolean;)V

    .line 321
    .line 322
    .line 323
    :cond_17
    and-long v2, v2, v16

    .line 324
    .line 325
    cmp-long v0, v2, v24

    .line 326
    .line 327
    if-eqz v0, :cond_18

    .line 328
    .line 329
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 330
    .line 331
    invoke-virtual {v0, v4}, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;->setToastLiveData(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)V

    .line 332
    .line 333
    .line 334
    :cond_18
    if-eqz v9, :cond_19

    .line 335
    .line 336
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->tvCourseProgress:Landroid/widget/TextView;

    .line 337
    .line 338
    invoke-static {v0, v8}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 339
    .line 340
    .line 341
    :cond_19
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 342
    .line 343
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 344
    .line 345
    .line 346
    return-void

    .line 347
    :catchall_0
    move-exception v0

    .line 348
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 349
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

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
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

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
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 15
    .line 16
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->onChangeViewModelCurrentStatisticsGroupLiveData(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_1
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 22
    .line 23
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->onChangeViewModelToastLiveData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_2
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 29
    .line 30
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->onChangeViewModelIsShowLiveData(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1

    .line 35
    :cond_3
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 36
    .line 37
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->onChangeViewModelIsDialogVisible(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1
.end method

.method public setEnable(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->mEnable:Z

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x20

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0xd

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

.method public setExamClickListener(Landroid/view/View$OnClickListener;)V
    .locals 4
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->mExamClickListener:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x40

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x11

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

.method public setFromScore(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->mFromScore:Z

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x10

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x14

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
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    .line 6
    check-cast p2, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p0, p1}, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->setFromScore(Z)V

    .line 13
    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    const/16 v0, 0xd

    .line 17
    .line 18
    if-ne v0, p1, :cond_1

    .line 19
    .line 20
    check-cast p2, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0, p1}, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->setEnable(Z)V

    .line 27
    .line 28
    .line 29
    return v1

    .line 30
    :cond_1
    const/16 v0, 0x11

    .line 31
    .line 32
    if-ne v0, p1, :cond_2

    .line 33
    .line 34
    check-cast p2, Landroid/view/View$OnClickListener;

    .line 35
    .line 36
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->setExamClickListener(Landroid/view/View$OnClickListener;)V

    .line 37
    .line 38
    .line 39
    return v1

    .line 40
    :cond_2
    const/16 v0, 0x3b

    .line 41
    .line 42
    if-ne v0, p1, :cond_3

    .line 43
    .line 44
    check-cast p2, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 45
    .line 46
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->setViewModel(Lcom/zykj/study/viewmodels/StudentExercisesViewModel;)V

    .line 47
    .line 48
    .line 49
    return v1

    .line 50
    :cond_3
    const/4 p1, 0x0

    .line 51
    return p1
.end method

.method public setViewModel(Lcom/zykj/study/viewmodels/StudentExercisesViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/study/viewmodels/StudentExercisesViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->mViewModel:Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x80

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBindingImpl;->mDirtyFlags:J

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
