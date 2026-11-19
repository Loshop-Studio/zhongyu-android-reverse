.class public Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;
.super Lcom/zykj/study/databinding/ItemStudentAchievementBinding;
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

.field private final mboundView1:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView2:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView3:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView4:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView5:Landroid/widget/TextView;
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
    sput-object v0, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 7
    .line 8
    sget v1, Lcom/zykj/study/R$id;->linearLayout3:I

    .line 9
    .line 10
    const/4 v2, 0x7

    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 12
    .line 13
    .line 14
    sget v1, Lcom/zykj/study/R$id;->view8:I

    .line 15
    .line 16
    const/16 v2, 0x8

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 19
    .line 20
    .line 21
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
    sget-object v0, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x9

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 8

    const/4 v0, 0x6

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroidx/appcompat/widget/AppCompatImageView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/view/View;

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/zykj/study/databinding/ItemStudentAchievementBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/appcompat/widget/AppCompatImageView;Landroid/widget/LinearLayout;Landroid/view/View;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBinding;->ivDetail:Landroidx/appcompat/widget/AppCompatImageView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 5
    aget-object p1, p3, p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mboundView0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 7
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mboundView1:Landroid/widget/TextView;

    .line 8
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 9
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 11
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 12
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 13
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mboundView4:Landroid/widget/TextView;

    .line 14
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x5

    .line 15
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mboundView5:Landroid/widget/TextView;

    .line 16
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 17
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 18
    invoke-virtual {p0}, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public executeBindings()V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBinding;->mEntity:Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    .line 12
    .line 13
    const-wide/16 v6, 0x3

    .line 14
    .line 15
    and-long v8, v2, v6

    .line 16
    .line 17
    cmp-long v8, v8, v4

    .line 18
    .line 19
    const/4 v9, 0x1

    .line 20
    const/4 v10, 0x0

    .line 21
    const/4 v11, 0x0

    .line 22
    if-eqz v8, :cond_5

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->getGroupName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v10

    .line 30
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->getUserName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v12

    .line 34
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->getStatus()Lcom/zykj/study/bean/exercise/ExerciseType;

    .line 35
    .line 36
    .line 37
    move-result-object v13

    .line 38
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->getScore()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    move-object/from16 v20, v12

    .line 43
    .line 44
    move-object v12, v10

    .line 45
    move-object v10, v13

    .line 46
    move-object/from16 v13, v20

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-object v12, v10

    .line 50
    move-object v13, v12

    .line 51
    move v0, v11

    .line 52
    :goto_0
    sget-object v14, Lcom/zykj/study/bean/exercise/ExerciseType;->COMPLETED:Lcom/zykj/study/bean/exercise/ExerciseType;

    .line 53
    .line 54
    if-ne v10, v14, :cond_1

    .line 55
    .line 56
    move v15, v9

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move v15, v11

    .line 59
    :goto_1
    if-eq v10, v14, :cond_2

    .line 60
    .line 61
    move v10, v9

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    move v10, v11

    .line 64
    :goto_2
    new-instance v14, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    move-wide/from16 v16, v4

    .line 73
    .line 74
    const-string v4, "%"

    .line 75
    .line 76
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    if-eqz v8, :cond_3

    .line 84
    .line 85
    if-eqz v15, :cond_4

    .line 86
    .line 87
    const-wide/16 v18, 0x28

    .line 88
    .line 89
    :goto_3
    or-long v2, v2, v18

    .line 90
    .line 91
    :cond_3
    move v5, v10

    .line 92
    move-object v10, v12

    .line 93
    goto :goto_4

    .line 94
    :cond_4
    const-wide/16 v18, 0x14

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    move-wide/from16 v16, v4

    .line 98
    .line 99
    move-object v4, v10

    .line 100
    move-object v13, v4

    .line 101
    move v0, v11

    .line 102
    move v5, v0

    .line 103
    move v15, v5

    .line 104
    :goto_4
    const-wide/16 v18, 0x8

    .line 105
    .line 106
    and-long v18, v2, v18

    .line 107
    .line 108
    cmp-long v8, v18, v16

    .line 109
    .line 110
    const/16 v12, 0x3c

    .line 111
    .line 112
    if-eqz v8, :cond_6

    .line 113
    .line 114
    if-lt v0, v12, :cond_6

    .line 115
    .line 116
    move v8, v9

    .line 117
    goto :goto_5

    .line 118
    :cond_6
    move v8, v11

    .line 119
    :goto_5
    const-wide/16 v18, 0x20

    .line 120
    .line 121
    and-long v18, v2, v18

    .line 122
    .line 123
    cmp-long v14, v18, v16

    .line 124
    .line 125
    if-eqz v14, :cond_7

    .line 126
    .line 127
    if-ge v0, v12, :cond_7

    .line 128
    .line 129
    goto :goto_6

    .line 130
    :cond_7
    move v9, v11

    .line 131
    :goto_6
    and-long/2addr v2, v6

    .line 132
    cmp-long v0, v2, v16

    .line 133
    .line 134
    if-eqz v0, :cond_a

    .line 135
    .line 136
    if-eqz v15, :cond_8

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_8
    move v8, v11

    .line 140
    :goto_7
    if-eqz v15, :cond_9

    .line 141
    .line 142
    move v11, v9

    .line 143
    :cond_9
    move v2, v11

    .line 144
    move v11, v8

    .line 145
    goto :goto_8

    .line 146
    :cond_a
    move v2, v11

    .line 147
    :goto_8
    if-eqz v0, :cond_b

    .line 148
    .line 149
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBinding;->ivDetail:Landroidx/appcompat/widget/AppCompatImageView;

    .line 150
    .line 151
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-static {v0, v3}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 156
    .line 157
    .line 158
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mboundView1:Landroid/widget/TextView;

    .line 159
    .line 160
    invoke-static {v0, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 161
    .line 162
    .line 163
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 164
    .line 165
    invoke-static {v0, v13}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 166
    .line 167
    .line 168
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 169
    .line 170
    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 174
    .line 175
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-static {v0, v3}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 180
    .line 181
    .line 182
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mboundView4:Landroid/widget/TextView;

    .line 183
    .line 184
    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 185
    .line 186
    .line 187
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mboundView4:Landroid/widget/TextView;

    .line 188
    .line 189
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-static {v0, v2}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 194
    .line 195
    .line 196
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mboundView5:Landroid/widget/TextView;

    .line 197
    .line 198
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-static {v0, v2}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 203
    .line 204
    .line 205
    :cond_b
    return-void

    .line 206
    :catchall_0
    move-exception v0

    .line 207
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 208
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mDirtyFlags:J

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
    const-wide/16 v0, 0x2

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mDirtyFlags:J

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

    const/4 p1, 0x0

    return p1
.end method

.method public setEntity(Lcom/zykj/study/bean/teach/SuperviseGroupMember;)V
    .locals 4
    .param p1    # Lcom/zykj/study/bean/teach/SuperviseGroupMember;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemStudentAchievementBinding;->mEntity:Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->mDirtyFlags:J

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

.method public setVariable(ILjava/lang/Object;)Z
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    check-cast p2, Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemStudentAchievementBindingImpl;->setEntity(Lcom/zykj/study/bean/teach/SuperviseGroupMember;)V

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
