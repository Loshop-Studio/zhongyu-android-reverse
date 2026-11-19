.class public Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;
.super Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;
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

.field private final mboundView0:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView01:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final mboundView1:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView2:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView3:Landroid/widget/LinearLayout;
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
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

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
    const-string v1, "layout_exercise_subject"

    .line 32
    .line 33
    const-string v2, "layout_exercise_answer_history"

    .line 34
    .line 35
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/4 v2, 0x4

    .line 40
    const/4 v3, 0x5

    .line 41
    filled-new-array {v2, v3}, [I

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    sget v3, Lcom/zykj/study/R$layout;->layout_exercise_subject:I

    .line 46
    .line 47
    sget v4, Lcom/zykj/study/R$layout;->layout_exercise_answer_history:I

    .line 48
    .line 49
    filled-new-array {v3, v4}, [I

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const/4 v4, 0x3

    .line 54
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 55
    .line 56
    .line 57
    new-instance v0, Landroid/util/SparseIntArray;

    .line 58
    .line 59
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 63
    .line 64
    sget v1, Lcom/zykj/study/R$id;->multiple_choice_view:I

    .line 65
    .line 66
    const/4 v2, 0x7

    .line 67
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 68
    .line 69
    .line 70
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
    sget-object v0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x8

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 8

    const/4 v0, 0x5

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lcom/zykj/study/view/MultipleChoiceAnimationView;

    const/4 v4, 0x5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;Lcom/zykj/study/view/MultipleChoiceAnimationView;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 5
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 p1, 0x0

    .line 6
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    const/4 p2, 0x0

    .line 7
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x6

    .line 8
    aget-object p1, p3, p1

    check-cast p1, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mboundView01:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 9
    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 p1, 0x1

    .line 10
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mboundView1:Landroid/widget/TextView;

    .line 11
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 12
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 13
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 14
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mboundView3:Landroid/widget/LinearLayout;

    .line 15
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 16
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 17
    invoke-virtual {p0}, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeEntityExerciseBeanLiveData(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x10

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

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

.method private onChangeEntityIsDialogVisible(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x4

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

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

.method private onChangeEntityToastLiveData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x8

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

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

.method private onChangeExerciseAnswer(Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

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

.method private onChangeExerciseSubject(Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

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
    iget-wide v2, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-boolean v0, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->mIsTeacher:Z

    .line 12
    .line 13
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->mEntity:Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 14
    .line 15
    iget-object v7, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->mWebViewControlViewModel:Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 16
    .line 17
    const-wide/16 v8, 0x120

    .line 18
    .line 19
    and-long/2addr v8, v2

    .line 20
    cmp-long v8, v8, v4

    .line 21
    .line 22
    const-wide/16 v9, 0x15c

    .line 23
    .line 24
    and-long/2addr v9, v2

    .line 25
    cmp-long v9, v9, v4

    .line 26
    .line 27
    const-wide/16 v10, 0x150

    .line 28
    .line 29
    const-wide/16 v12, 0x148

    .line 30
    .line 31
    const-wide/16 v14, 0x144

    .line 32
    .line 33
    const/16 v16, 0x0

    .line 34
    .line 35
    if-eqz v9, :cond_a

    .line 36
    .line 37
    and-long v17, v2, v14

    .line 38
    .line 39
    cmp-long v9, v17, v4

    .line 40
    .line 41
    if-eqz v9, :cond_1

    .line 42
    .line 43
    if-eqz v6, :cond_0

    .line 44
    .line 45
    invoke-virtual {v6}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    :goto_0
    move-wide/from16 v17, v4

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    move-object/from16 v9, v16

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :goto_1
    const/4 v4, 0x2

    .line 56
    invoke-virtual {v1, v4, v9}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 57
    .line 58
    .line 59
    if-eqz v9, :cond_2

    .line 60
    .line 61
    invoke-virtual {v9}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Ljava/lang/Boolean;

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_1
    move-wide/from16 v17, v4

    .line 69
    .line 70
    :cond_2
    move-object/from16 v4, v16

    .line 71
    .line 72
    :goto_2
    and-long v19, v2, v12

    .line 73
    .line 74
    cmp-long v5, v19, v17

    .line 75
    .line 76
    if-eqz v5, :cond_4

    .line 77
    .line 78
    if-eqz v6, :cond_3

    .line 79
    .line 80
    invoke-virtual {v6}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    goto :goto_3

    .line 85
    :cond_3
    move-object/from16 v5, v16

    .line 86
    .line 87
    :goto_3
    const/4 v9, 0x3

    .line 88
    invoke-virtual {v1, v9, v5}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 89
    .line 90
    .line 91
    if-eqz v5, :cond_5

    .line 92
    .line 93
    invoke-virtual {v5}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    check-cast v9, Lcom/zykj/base/bean/toast/ToastMessage;

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_4
    move-object/from16 v5, v16

    .line 101
    .line 102
    :cond_5
    :goto_4
    and-long v19, v2, v10

    .line 103
    .line 104
    cmp-long v9, v19, v17

    .line 105
    .line 106
    if-eqz v9, :cond_9

    .line 107
    .line 108
    if-eqz v6, :cond_6

    .line 109
    .line 110
    invoke-virtual {v6}, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;->r()Landroidx/lifecycle/MutableLiveData;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    :goto_5
    move-wide/from16 v19, v10

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_6
    move-object/from16 v9, v16

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :goto_6
    const/4 v10, 0x4

    .line 121
    invoke-virtual {v1, v10, v9}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 122
    .line 123
    .line 124
    if-eqz v9, :cond_7

    .line 125
    .line 126
    invoke-virtual {v9}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    check-cast v9, Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 131
    .line 132
    goto :goto_7

    .line 133
    :cond_7
    move-object/from16 v9, v16

    .line 134
    .line 135
    :goto_7
    if-eqz v9, :cond_8

    .line 136
    .line 137
    invoke-virtual {v9}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getUpdateTime()Ljava/util/Date;

    .line 138
    .line 139
    .line 140
    move-result-object v16

    .line 141
    invoke-virtual {v9}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getScore()D

    .line 142
    .line 143
    .line 144
    move-result-wide v9

    .line 145
    goto :goto_8

    .line 146
    :cond_8
    const-wide/16 v9, 0x0

    .line 147
    .line 148
    :goto_8
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    iget-object v10, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 153
    .line 154
    invoke-virtual {v10}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    sget v11, Lcom/zykj/study/R$string;->achievement:I

    .line 159
    .line 160
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v9

    .line 164
    invoke-virtual {v10, v11, v9}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    new-instance v10, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v9, "%"

    .line 177
    .line 178
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    move-object v10, v9

    .line 186
    move-object/from16 v9, v16

    .line 187
    .line 188
    goto :goto_a

    .line 189
    :cond_9
    move-wide/from16 v19, v10

    .line 190
    .line 191
    move-object/from16 v9, v16

    .line 192
    .line 193
    :goto_9
    move-object v10, v9

    .line 194
    goto :goto_a

    .line 195
    :cond_a
    move-wide/from16 v17, v4

    .line 196
    .line 197
    move-wide/from16 v19, v10

    .line 198
    .line 199
    move-object/from16 v4, v16

    .line 200
    .line 201
    move-object v5, v4

    .line 202
    move-object v9, v5

    .line 203
    goto :goto_9

    .line 204
    :goto_a
    const-wide/16 v21, 0x180

    .line 205
    .line 206
    and-long v21, v2, v21

    .line 207
    .line 208
    cmp-long v11, v21, v17

    .line 209
    .line 210
    const-wide/16 v21, 0x140

    .line 211
    .line 212
    and-long v21, v2, v21

    .line 213
    .line 214
    cmp-long v16, v21, v17

    .line 215
    .line 216
    move-wide/from16 v21, v12

    .line 217
    .line 218
    if-eqz v16, :cond_b

    .line 219
    .line 220
    iget-object v12, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 221
    .line 222
    invoke-virtual {v12, v6}, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->setEntity(Lcom/zykj/study/viewmodels/BaseExerciseViewModel;)V

    .line 223
    .line 224
    .line 225
    iget-object v12, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 226
    .line 227
    invoke-virtual {v12, v6}, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->setEntity(Lcom/zykj/study/viewmodels/BaseExerciseViewModel;)V

    .line 228
    .line 229
    .line 230
    :cond_b
    if-eqz v8, :cond_c

    .line 231
    .line 232
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 233
    .line 234
    invoke-virtual {v6, v0}, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->setIsTeacher(Z)V

    .line 235
    .line 236
    .line 237
    :cond_c
    if-eqz v11, :cond_d

    .line 238
    .line 239
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 240
    .line 241
    invoke-virtual {v0, v7}, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->setWebViewControlViewModel(Lcom/zykj/study/viewmodels/WebViewControlViewModel;)V

    .line 242
    .line 243
    .line 244
    :cond_d
    and-long v6, v2, v14

    .line 245
    .line 246
    cmp-long v0, v6, v17

    .line 247
    .line 248
    if-eqz v0, :cond_e

    .line 249
    .line 250
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mboundView01:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 251
    .line 252
    invoke-virtual {v0, v4}, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;->setIsDialogVisible(Ljava/lang/Boolean;)V

    .line 253
    .line 254
    .line 255
    :cond_e
    and-long v6, v2, v21

    .line 256
    .line 257
    cmp-long v0, v6, v17

    .line 258
    .line 259
    if-eqz v0, :cond_f

    .line 260
    .line 261
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mboundView01:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 262
    .line 263
    invoke-virtual {v0, v5}, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;->setToastLiveData(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)V

    .line 264
    .line 265
    .line 266
    :cond_f
    and-long v2, v2, v19

    .line 267
    .line 268
    cmp-long v0, v2, v17

    .line 269
    .line 270
    if-eqz v0, :cond_10

    .line 271
    .line 272
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mboundView1:Landroid/widget/TextView;

    .line 273
    .line 274
    invoke-static {v0, v9}, Le5/c;->n(Landroid/widget/TextView;Ljava/util/Date;)V

    .line 275
    .line 276
    .line 277
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 278
    .line 279
    invoke-static {v0, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 280
    .line 281
    .line 282
    :cond_10
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 283
    .line 284
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 285
    .line 286
    .line 287
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 288
    .line 289
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 290
    .line 291
    .line 292
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mboundView01:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 293
    .line 294
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 295
    .line 296
    .line 297
    return-void

    .line 298
    :catchall_0
    move-exception v0

    .line 299
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 300
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

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
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

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
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mboundView01:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

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
    const/4 v0, 0x0

    .line 44
    return v0

    .line 45
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
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
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mboundView01:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
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
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->onChangeEntityExerciseBeanLiveData(Landroidx/lifecycle/MutableLiveData;I)Z

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
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->onChangeEntityToastLiveData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_2
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 32
    .line 33
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->onChangeEntityIsDialogVisible(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1

    .line 38
    :cond_3
    check-cast p2, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 39
    .line 40
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->onChangeExerciseAnswer(Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;I)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1

    .line 45
    :cond_4
    check-cast p2, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 46
    .line 47
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->onChangeExerciseSubject(Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;I)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    return p1
.end method

.method public setEntity(Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->mEntity:Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x40

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0xf

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

.method public setIsTeacher(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->mIsTeacher:Z

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x20

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x1d

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
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mboundView01:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/16 v0, 0x1d

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
    invoke-virtual {p0, p1}, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->setIsTeacher(Z)V

    .line 13
    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    const/16 v0, 0xf

    .line 17
    .line 18
    if-ne v0, p1, :cond_1

    .line 19
    .line 20
    check-cast p2, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 21
    .line 22
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->setEntity(Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;)V

    .line 23
    .line 24
    .line 25
    return v1

    .line 26
    :cond_1
    const/16 v0, 0x3c

    .line 27
    .line 28
    if-ne v0, p1, :cond_2

    .line 29
    .line 30
    check-cast p2, Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 31
    .line 32
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->setWebViewControlViewModel(Lcom/zykj/study/viewmodels/WebViewControlViewModel;)V

    .line 33
    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    const/4 p1, 0x0

    .line 37
    return p1
.end method

.method public setWebViewControlViewModel(Lcom/zykj/study/viewmodels/WebViewControlViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/study/viewmodels/WebViewControlViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBinding;->mWebViewControlViewModel:Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x80

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemExerciseStudentHistoryBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x3c

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
