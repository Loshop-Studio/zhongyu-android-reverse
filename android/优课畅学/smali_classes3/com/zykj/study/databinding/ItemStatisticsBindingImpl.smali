.class public Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;
.super Lcom/zykj/study/databinding/ItemStatisticsBinding;
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
    .locals 0

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
    sget-object v0, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x6

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ItemStatisticsBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, p0, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mDirtyFlags:J

    .line 4
    aget-object p1, p3, v0

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 6
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mboundView1:Landroid/widget/TextView;

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 8
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 10
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 11
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 12
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mboundView4:Landroid/widget/TextView;

    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x5

    .line 14
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mboundView5:Landroid/widget/TextView;

    .line 15
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 16
    invoke-virtual {p0, p2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 17
    invoke-virtual {p0}, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public executeBindings()V
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemStatisticsBinding;->mEntity:Lcom/zykj/study/bean/teach/SuperviseGroupMemberProgress;

    .line 12
    .line 13
    iget-boolean v6, v1, Lcom/zykj/study/databinding/ItemStatisticsBinding;->mIsLeaf:Z

    .line 14
    .line 15
    const-wide/16 v7, 0x5

    .line 16
    .line 17
    and-long v9, v2, v7

    .line 18
    .line 19
    cmp-long v9, v9, v4

    .line 20
    .line 21
    const/4 v10, 0x1

    .line 22
    const/4 v11, 0x0

    .line 23
    const/4 v12, 0x0

    .line 24
    if-eqz v9, :cond_5

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/SuperviseGroupMemberProgress;->getGroupName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v13

    .line 32
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/SuperviseGroupMemberProgress;->getUserName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v14

    .line 36
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/SuperviseGroupMemberProgress;->getProgress()Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v15

    .line 40
    :goto_0
    move-wide/from16 v16, v4

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    move-object v13, v11

    .line 44
    move-object v14, v13

    .line 45
    move-object v15, v14

    .line 46
    goto :goto_0

    .line 47
    :goto_1
    invoke-static {v15}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    new-instance v5, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v15, "%"

    .line 60
    .line 61
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    const/16 v15, 0x64

    .line 69
    .line 70
    if-ne v4, v15, :cond_1

    .line 71
    .line 72
    move v4, v10

    .line 73
    goto :goto_2

    .line 74
    :cond_1
    move v4, v12

    .line 75
    :goto_2
    if-eqz v9, :cond_3

    .line 76
    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    const-wide/16 v18, 0x40

    .line 80
    .line 81
    :goto_3
    or-long v2, v2, v18

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_2
    const-wide/16 v18, 0x20

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    :goto_4
    if-eqz v4, :cond_4

    .line 88
    .line 89
    iget-object v4, v1, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 90
    .line 91
    sget v9, Lcom/zykj/study/R$color;->text_right_green:I

    .line 92
    .line 93
    :goto_5
    invoke-static {v4, v9}, Landroidx/databinding/ViewDataBinding;->getColorFromResource(Landroid/view/View;I)I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    goto :goto_6

    .line 98
    :cond_4
    iget-object v4, v1, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 99
    .line 100
    sget v9, Lcom/zykj/message/client/R$color;->gray_hint_text:I

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_5
    move-wide/from16 v16, v4

    .line 104
    .line 105
    move-object v5, v11

    .line 106
    move-object v13, v5

    .line 107
    move-object v14, v13

    .line 108
    move v4, v12

    .line 109
    :goto_6
    const-wide/16 v18, 0x7

    .line 110
    .line 111
    and-long v20, v2, v18

    .line 112
    .line 113
    cmp-long v9, v20, v16

    .line 114
    .line 115
    const-wide/16 v20, 0x6

    .line 116
    .line 117
    const-wide/16 v22, 0x110

    .line 118
    .line 119
    if-eqz v9, :cond_8

    .line 120
    .line 121
    if-eqz v9, :cond_7

    .line 122
    .line 123
    if-eqz v6, :cond_6

    .line 124
    .line 125
    or-long v2, v2, v22

    .line 126
    .line 127
    goto :goto_7

    .line 128
    :cond_6
    const-wide/16 v24, 0x88

    .line 129
    .line 130
    or-long v2, v2, v24

    .line 131
    .line 132
    :cond_7
    :goto_7
    and-long v24, v2, v20

    .line 133
    .line 134
    cmp-long v9, v24, v16

    .line 135
    .line 136
    if-eqz v9, :cond_8

    .line 137
    .line 138
    xor-int/lit8 v9, v6, 0x1

    .line 139
    .line 140
    goto :goto_8

    .line 141
    :cond_8
    move v9, v12

    .line 142
    :goto_8
    and-long v22, v2, v22

    .line 143
    .line 144
    cmp-long v15, v22, v16

    .line 145
    .line 146
    if-eqz v15, :cond_c

    .line 147
    .line 148
    if-eqz v0, :cond_9

    .line 149
    .line 150
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/SuperviseGroupMemberProgress;->getStatus()Lcom/zykj/study/bean/course/StudyStatus;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    :cond_9
    const-wide/16 v22, 0x10

    .line 155
    .line 156
    and-long v22, v2, v22

    .line 157
    .line 158
    cmp-long v0, v22, v16

    .line 159
    .line 160
    if-eqz v0, :cond_a

    .line 161
    .line 162
    sget-object v0, Lcom/zykj/study/bean/course/StudyStatus;->COMPLETE:Lcom/zykj/study/bean/course/StudyStatus;

    .line 163
    .line 164
    if-ne v11, v0, :cond_a

    .line 165
    .line 166
    move v0, v10

    .line 167
    goto :goto_9

    .line 168
    :cond_a
    move v0, v12

    .line 169
    :goto_9
    const-wide/16 v22, 0x100

    .line 170
    .line 171
    and-long v22, v2, v22

    .line 172
    .line 173
    cmp-long v15, v22, v16

    .line 174
    .line 175
    if-eqz v15, :cond_b

    .line 176
    .line 177
    sget-object v15, Lcom/zykj/study/bean/course/StudyStatus;->NOT_COMPLETE:Lcom/zykj/study/bean/course/StudyStatus;

    .line 178
    .line 179
    if-ne v11, v15, :cond_b

    .line 180
    .line 181
    goto :goto_a

    .line 182
    :cond_b
    move v10, v12

    .line 183
    goto :goto_a

    .line 184
    :cond_c
    move v0, v12

    .line 185
    move v10, v0

    .line 186
    :goto_a
    and-long v18, v2, v18

    .line 187
    .line 188
    cmp-long v11, v18, v16

    .line 189
    .line 190
    if-eqz v11, :cond_e

    .line 191
    .line 192
    if-eqz v6, :cond_d

    .line 193
    .line 194
    goto :goto_b

    .line 195
    :cond_d
    move v0, v12

    .line 196
    :goto_b
    if-eqz v6, :cond_f

    .line 197
    .line 198
    move v12, v10

    .line 199
    goto :goto_c

    .line 200
    :cond_e
    move v0, v12

    .line 201
    :cond_f
    :goto_c
    and-long v6, v2, v7

    .line 202
    .line 203
    cmp-long v6, v6, v16

    .line 204
    .line 205
    if-eqz v6, :cond_10

    .line 206
    .line 207
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mboundView1:Landroid/widget/TextView;

    .line 208
    .line 209
    invoke-static {v6, v13}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 210
    .line 211
    .line 212
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 213
    .line 214
    invoke-static {v6, v14}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 215
    .line 216
    .line 217
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 218
    .line 219
    invoke-static {v6, v5}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 220
    .line 221
    .line 222
    iget-object v5, v1, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 223
    .line 224
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 225
    .line 226
    .line 227
    :cond_10
    and-long v2, v2, v20

    .line 228
    .line 229
    cmp-long v2, v2, v16

    .line 230
    .line 231
    if-eqz v2, :cond_11

    .line 232
    .line 233
    iget-object v2, v1, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 234
    .line 235
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-static {v2, v3}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 240
    .line 241
    .line 242
    :cond_11
    if-eqz v11, :cond_12

    .line 243
    .line 244
    iget-object v2, v1, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mboundView4:Landroid/widget/TextView;

    .line 245
    .line 246
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-static {v2, v3}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 251
    .line 252
    .line 253
    iget-object v2, v1, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mboundView5:Landroid/widget/TextView;

    .line 254
    .line 255
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-static {v2, v0}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 260
    .line 261
    .line 262
    :cond_12
    return-void

    .line 263
    :catchall_0
    move-exception v0

    .line 264
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 265
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mDirtyFlags:J

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
    const-wide/16 v0, 0x4

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mDirtyFlags:J

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

.method public setEntity(Lcom/zykj/study/bean/teach/SuperviseGroupMemberProgress;)V
    .locals 4
    .param p1    # Lcom/zykj/study/bean/teach/SuperviseGroupMemberProgress;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemStatisticsBinding;->mEntity:Lcom/zykj/study/bean/teach/SuperviseGroupMemberProgress;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mDirtyFlags:J

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

.method public setIsLeaf(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/databinding/ItemStatisticsBinding;->mIsLeaf:Z

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x2

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x1b

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
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    .line 6
    check-cast p2, Lcom/zykj/study/bean/teach/SuperviseGroupMemberProgress;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->setEntity(Lcom/zykj/study/bean/teach/SuperviseGroupMemberProgress;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    const/16 v0, 0x1b

    .line 13
    .line 14
    if-ne v0, p1, :cond_1

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p0, p1}, Lcom/zykj/study/databinding/ItemStatisticsBindingImpl;->setIsLeaf(Z)V

    .line 23
    .line 24
    .line 25
    return v1

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    return p1
.end method
