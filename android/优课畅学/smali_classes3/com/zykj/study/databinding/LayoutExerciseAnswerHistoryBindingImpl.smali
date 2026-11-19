.class public Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;
.super Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;
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

.field private final mboundView1:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView2:Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView3:Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

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
    sput-object v0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 8
    .line 9
    const-string v1, "view_answer_micro"

    .line 10
    .line 11
    const-string v2, "view_micro"

    .line 12
    .line 13
    const-string v3, "view_choice"

    .line 14
    .line 15
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x5

    .line 20
    const/4 v3, 0x6

    .line 21
    const/4 v4, 0x4

    .line 22
    filled-new-array {v4, v2, v3}, [I

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    sget v3, Lcom/zykj/study/R$layout;->view_choice:I

    .line 27
    .line 28
    sget v4, Lcom/zykj/study/R$layout;->view_answer_micro:I

    .line 29
    .line 30
    sget v5, Lcom/zykj/study/R$layout;->view_micro:I

    .line 31
    .line 32
    filled-new-array {v3, v4, v5}, [I

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const/4 v4, 0x1

    .line 37
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    sput-object v0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 42
    .line 43
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
    sget-object v0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x7

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 8

    const/4 v0, 0x6

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/zykj/study/databinding/ViewMicroBinding;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/zykj/study/databinding/ViewAnswerMicroBinding;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lcom/zykj/study/databinding/ViewChoiceBinding;

    const/4 v4, 0x4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/study/databinding/ViewMicroBinding;Lcom/zykj/study/databinding/ViewAnswerMicroBinding;Lcom/zykj/study/databinding/ViewChoiceBinding;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 p1, 0x0

    .line 5
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    const/4 p2, 0x0

    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 7
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mboundView1:Landroid/widget/LinearLayout;

    .line 8
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 9
    aget-object p1, p3, p1

    check-cast p1, Landroid/view/View;

    iput-object p1, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mboundView2:Landroid/view/View;

    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 11
    aget-object p1, p3, p1

    check-cast p1, Landroid/view/View;

    iput-object p1, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mboundView3:Landroid/view/View;

    .line 12
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 13
    iget-object p1, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->myAnswerMicro:Lcom/zykj/study/databinding/ViewAnswerMicroBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 14
    iget-object p1, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->viewChoice:Lcom/zykj/study/databinding/ViewChoiceBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 15
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 16
    invoke-virtual {p0}, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeAnswerMicro(Lcom/zykj/study/databinding/ViewMicroBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mDirtyFlags:J

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

.method private onChangeEntityCurrentQuestionLiveData(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/zykj/study/bean/exercise/QuestionBean;",
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x8

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mDirtyFlags:J

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

.method private onChangeMyAnswerMicro(Lcom/zykj/study/databinding/ViewAnswerMicroBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewChoice(Lcom/zykj/study/databinding/ViewChoiceBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x4

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mDirtyFlags:J

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
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-boolean v0, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->mIsTeacher:Z

    .line 12
    .line 13
    iget-object v6, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->mEntity:Lcom/zykj/study/viewmodels/BaseExerciseViewModel;

    .line 14
    .line 15
    const-wide/16 v7, 0xa8

    .line 16
    .line 17
    and-long v9, v2, v7

    .line 18
    .line 19
    cmp-long v9, v9, v4

    .line 20
    .line 21
    const-wide/16 v10, 0x100

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    const/4 v13, 0x1

    .line 25
    const/4 v14, 0x0

    .line 26
    if-eqz v9, :cond_6

    .line 27
    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    invoke-virtual {v6}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v6, v12

    .line 36
    :goto_0
    const/4 v15, 0x3

    .line 37
    invoke-virtual {v1, v15, v6}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 38
    .line 39
    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    invoke-virtual {v6}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    check-cast v6, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object v6, v12

    .line 50
    :goto_1
    if-eqz v6, :cond_2

    .line 51
    .line 52
    invoke-virtual {v6}, Lcom/zykj/study/bean/exercise/QuestionBean;->getQuestionType()Lcom/zykj/study/bean/exercise/QuestionType;

    .line 53
    .line 54
    .line 55
    move-result-object v12

    .line 56
    :cond_2
    sget-object v6, Lcom/zykj/study/bean/exercise/QuestionType;->SINGLE_CHOICE:Lcom/zykj/study/bean/exercise/QuestionType;

    .line 57
    .line 58
    if-ne v12, v6, :cond_3

    .line 59
    .line 60
    move v6, v13

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    move v6, v14

    .line 63
    :goto_2
    sget-object v15, Lcom/zykj/study/bean/exercise/QuestionType;->ANSWER:Lcom/zykj/study/bean/exercise/QuestionType;

    .line 64
    .line 65
    if-ne v12, v15, :cond_4

    .line 66
    .line 67
    move v15, v13

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    move v15, v14

    .line 70
    :goto_3
    if-eqz v9, :cond_7

    .line 71
    .line 72
    if-eqz v6, :cond_5

    .line 73
    .line 74
    const-wide/16 v16, 0x200

    .line 75
    .line 76
    or-long v2, v2, v16

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_5
    or-long/2addr v2, v10

    .line 80
    goto :goto_4

    .line 81
    :cond_6
    move v6, v14

    .line 82
    move v15, v6

    .line 83
    :cond_7
    :goto_4
    and-long v9, v2, v10

    .line 84
    .line 85
    cmp-long v9, v9, v4

    .line 86
    .line 87
    if-eqz v9, :cond_8

    .line 88
    .line 89
    sget-object v9, Lcom/zykj/study/bean/exercise/QuestionType;->MULTIPLE_CHOICE:Lcom/zykj/study/bean/exercise/QuestionType;

    .line 90
    .line 91
    if-ne v12, v9, :cond_8

    .line 92
    .line 93
    move v9, v13

    .line 94
    goto :goto_5

    .line 95
    :cond_8
    move v9, v14

    .line 96
    :goto_5
    and-long/2addr v7, v2

    .line 97
    cmp-long v7, v7, v4

    .line 98
    .line 99
    if-eqz v7, :cond_a

    .line 100
    .line 101
    if-eqz v6, :cond_9

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_9
    move v13, v9

    .line 105
    :goto_6
    move v14, v13

    .line 106
    :cond_a
    if-eqz v7, :cond_b

    .line 107
    .line 108
    iget-object v6, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mboundView2:Landroid/view/View;

    .line 109
    .line 110
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-static {v6, v7}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 115
    .line 116
    .line 117
    iget-object v6, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mboundView3:Landroid/view/View;

    .line 118
    .line 119
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    invoke-static {v6, v7}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 124
    .line 125
    .line 126
    iget-object v6, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->myAnswerMicro:Lcom/zykj/study/databinding/ViewAnswerMicroBinding;

    .line 127
    .line 128
    invoke-virtual {v6}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    invoke-static {v6, v7}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 137
    .line 138
    .line 139
    iget-object v6, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->viewChoice:Lcom/zykj/study/databinding/ViewChoiceBinding;

    .line 140
    .line 141
    invoke-virtual {v6}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-static {v6, v7}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 150
    .line 151
    .line 152
    :cond_b
    const-wide/16 v6, 0x90

    .line 153
    .line 154
    and-long/2addr v2, v6

    .line 155
    cmp-long v2, v2, v4

    .line 156
    .line 157
    if-eqz v2, :cond_c

    .line 158
    .line 159
    iget-object v2, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->myAnswerMicro:Lcom/zykj/study/databinding/ViewAnswerMicroBinding;

    .line 160
    .line 161
    invoke-virtual {v2, v0}, Lcom/zykj/study/databinding/ViewAnswerMicroBinding;->setIsTeacher(Z)V

    .line 162
    .line 163
    .line 164
    iget-object v2, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->viewChoice:Lcom/zykj/study/databinding/ViewChoiceBinding;

    .line 165
    .line 166
    invoke-virtual {v2, v0}, Lcom/zykj/study/databinding/ViewChoiceBinding;->setIsTeacher(Z)V

    .line 167
    .line 168
    .line 169
    :cond_c
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->viewChoice:Lcom/zykj/study/databinding/ViewChoiceBinding;

    .line 170
    .line 171
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 172
    .line 173
    .line 174
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->myAnswerMicro:Lcom/zykj/study/databinding/ViewAnswerMicroBinding;

    .line 175
    .line 176
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 177
    .line 178
    .line 179
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 180
    .line 181
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :catchall_0
    move-exception v0

    .line 186
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 187
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->viewChoice:Lcom/zykj/study/databinding/ViewChoiceBinding;

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
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->myAnswerMicro:Lcom/zykj/study/databinding/ViewAnswerMicroBinding;

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
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

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
    const-wide/16 v0, 0x80

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->viewChoice:Lcom/zykj/study/databinding/ViewChoiceBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->myAnswerMicro:Lcom/zykj/study/databinding/ViewAnswerMicroBinding;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

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
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->onChangeEntityCurrentQuestionLiveData(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_1
    check-cast p2, Lcom/zykj/study/databinding/ViewChoiceBinding;

    .line 22
    .line 23
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->onChangeViewChoice(Lcom/zykj/study/databinding/ViewChoiceBinding;I)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_2
    check-cast p2, Lcom/zykj/study/databinding/ViewAnswerMicroBinding;

    .line 29
    .line 30
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->onChangeMyAnswerMicro(Lcom/zykj/study/databinding/ViewAnswerMicroBinding;I)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1

    .line 35
    :cond_3
    check-cast p2, Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 36
    .line 37
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->onChangeAnswerMicro(Lcom/zykj/study/databinding/ViewMicroBinding;I)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1
.end method

.method public setEntity(Lcom/zykj/study/viewmodels/BaseExerciseViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/study/viewmodels/BaseExerciseViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->mEntity:Lcom/zykj/study/viewmodels/BaseExerciseViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x20

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mDirtyFlags:J

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
    iput-boolean p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->mIsTeacher:Z

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x10

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->viewChoice:Lcom/zykj/study/databinding/ViewChoiceBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->myAnswerMicro:Lcom/zykj/study/databinding/ViewAnswerMicroBinding;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

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
    invoke-virtual {p0, p1}, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->setIsTeacher(Z)V

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
    check-cast p2, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;

    .line 21
    .line 22
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->setEntity(Lcom/zykj/study/viewmodels/BaseExerciseViewModel;)V

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
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBindingImpl;->setWebViewControlViewModel(Lcom/zykj/study/viewmodels/WebViewControlViewModel;)V

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
    .locals 0
    .param p1    # Lcom/zykj/study/viewmodels/WebViewControlViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->mWebViewControlViewModel:Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 2
    .line 3
    return-void
.end method
