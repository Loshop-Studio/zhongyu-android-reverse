.class public Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;
.super Lcom/zykj/study/databinding/ItemChapterProgressBinding;
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

.field private final mboundView1:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView2:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView3:Landroid/widget/TextView;
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
    sget-object v0, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x8

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 9

    const/4 v0, 0x5

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lcom/zykj/study/view/KnowledgeProgressView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v8}, Lcom/zykj/study/databinding/ItemChapterProgressBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/widget/ImageView;Lcom/zykj/study/view/KnowledgeProgressView;Landroid/widget/TextView;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemChapterProgressBinding;->ivProgressComplete:Landroid/widget/ImageView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemChapterProgressBinding;->ivProgressNotComplete:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 6
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemChapterProgressBinding;->knowView:Lcom/zykj/study/view/KnowledgeProgressView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 7
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 8
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 9
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->mboundView1:Landroid/widget/ImageView;

    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 11
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->mboundView2:Landroid/widget/ImageView;

    .line 12
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 13
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 14
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 15
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemChapterProgressBinding;->tvProgress:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 16
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 17
    invoke-virtual {p0}, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->invalidateAll()V

    return-void
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
    iget-wide v2, v1, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemChapterProgressBinding;->mEntity:Lcom/zykj/study/bean/SelectModel;

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
    const-wide/16 v9, 0x28

    .line 20
    .line 21
    const/4 v11, 0x0

    .line 22
    const/4 v12, 0x0

    .line 23
    if-eqz v8, :cond_4

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 28
    .line 29
    .line 30
    move-result v13

    .line 31
    invoke-virtual {v0}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lcom/zykj/study/bean/course/CatalogBean;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v0, v11

    .line 39
    move v13, v12

    .line 40
    :goto_0
    xor-int/lit8 v14, v13, 0x1

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf()Z

    .line 45
    .line 46
    .line 47
    move-result v15

    .line 48
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogBean;->getTitle()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v16

    .line 52
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogBean;->getProgress()I

    .line 53
    .line 54
    .line 55
    move-result v17

    .line 56
    move-wide/from16 v21, v4

    .line 57
    .line 58
    move/from16 v4, v17

    .line 59
    .line 60
    move-wide/from16 v17, v21

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move-wide/from16 v17, v4

    .line 64
    .line 65
    move-object/from16 v16, v11

    .line 66
    .line 67
    move v4, v12

    .line 68
    move v15, v4

    .line 69
    :goto_1
    if-eqz v8, :cond_3

    .line 70
    .line 71
    if-eqz v15, :cond_2

    .line 72
    .line 73
    or-long/2addr v2, v9

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    const-wide/16 v19, 0x14

    .line 76
    .line 77
    or-long v2, v2, v19

    .line 78
    .line 79
    :cond_3
    :goto_2
    xor-int/lit8 v5, v15, 0x1

    .line 80
    .line 81
    new-instance v8, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v4, "%"

    .line 90
    .line 91
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    move-object/from16 v8, v16

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_4
    move-wide/from16 v17, v4

    .line 106
    .line 107
    move-object v0, v11

    .line 108
    move-object v4, v0

    .line 109
    move-object v8, v4

    .line 110
    move v5, v12

    .line 111
    move v13, v5

    .line 112
    move v14, v13

    .line 113
    move v15, v14

    .line 114
    :goto_3
    and-long/2addr v9, v2

    .line 115
    cmp-long v9, v9, v17

    .line 116
    .line 117
    if-eqz v9, :cond_8

    .line 118
    .line 119
    if-eqz v0, :cond_5

    .line 120
    .line 121
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogBean;->getStatus()Lcom/zykj/study/bean/course/StudyStatus;

    .line 122
    .line 123
    .line 124
    move-result-object v11

    .line 125
    :cond_5
    const-wide/16 v9, 0x8

    .line 126
    .line 127
    and-long/2addr v9, v2

    .line 128
    cmp-long v0, v9, v17

    .line 129
    .line 130
    const/4 v9, 0x1

    .line 131
    if-eqz v0, :cond_6

    .line 132
    .line 133
    sget-object v0, Lcom/zykj/study/bean/course/StudyStatus;->NOT_COMPLETE:Lcom/zykj/study/bean/course/StudyStatus;

    .line 134
    .line 135
    if-ne v11, v0, :cond_6

    .line 136
    .line 137
    move v0, v9

    .line 138
    goto :goto_4

    .line 139
    :cond_6
    move v0, v12

    .line 140
    :goto_4
    const-wide/16 v19, 0x20

    .line 141
    .line 142
    and-long v19, v2, v19

    .line 143
    .line 144
    cmp-long v10, v19, v17

    .line 145
    .line 146
    if-eqz v10, :cond_7

    .line 147
    .line 148
    sget-object v10, Lcom/zykj/study/bean/course/StudyStatus;->COMPLETE:Lcom/zykj/study/bean/course/StudyStatus;

    .line 149
    .line 150
    if-ne v11, v10, :cond_7

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_7
    move v9, v12

    .line 154
    goto :goto_5

    .line 155
    :cond_8
    move v0, v12

    .line 156
    move v9, v0

    .line 157
    :goto_5
    and-long/2addr v2, v6

    .line 158
    cmp-long v2, v2, v17

    .line 159
    .line 160
    if-eqz v2, :cond_a

    .line 161
    .line 162
    if-eqz v15, :cond_9

    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_9
    move v0, v12

    .line 166
    :goto_6
    if-eqz v15, :cond_b

    .line 167
    .line 168
    move v12, v9

    .line 169
    goto :goto_7

    .line 170
    :cond_a
    move v0, v12

    .line 171
    :cond_b
    :goto_7
    if-eqz v2, :cond_c

    .line 172
    .line 173
    iget-object v2, v1, Lcom/zykj/study/databinding/ItemChapterProgressBinding;->ivProgressComplete:Landroid/widget/ImageView;

    .line 174
    .line 175
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-static {v2, v3}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 180
    .line 181
    .line 182
    iget-object v2, v1, Lcom/zykj/study/databinding/ItemChapterProgressBinding;->ivProgressNotComplete:Landroid/widget/ImageView;

    .line 183
    .line 184
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {v2, v0}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 189
    .line 190
    .line 191
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemChapterProgressBinding;->knowView:Lcom/zykj/study/view/KnowledgeProgressView;

    .line 192
    .line 193
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-static {v0, v2}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 198
    .line 199
    .line 200
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->mboundView1:Landroid/widget/ImageView;

    .line 201
    .line 202
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-static {v0, v2}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 207
    .line 208
    .line 209
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->mboundView2:Landroid/widget/ImageView;

    .line 210
    .line 211
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-static {v0, v2}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 216
    .line 217
    .line 218
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 219
    .line 220
    invoke-static {v0, v8}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 221
    .line 222
    .line 223
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemChapterProgressBinding;->tvProgress:Landroid/widget/TextView;

    .line 224
    .line 225
    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 226
    .line 227
    .line 228
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemChapterProgressBinding;->tvProgress:Landroid/widget/TextView;

    .line 229
    .line 230
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-static {v0, v2}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 235
    .line 236
    .line 237
    :cond_c
    return-void

    .line 238
    :catchall_0
    move-exception v0

    .line 239
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 240
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->mDirtyFlags:J

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
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->mDirtyFlags:J

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

.method public setEntity(Lcom/zykj/study/bean/SelectModel;)V
    .locals 4
    .param p1    # Lcom/zykj/study/bean/SelectModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/bean/SelectModel<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemChapterProgressBinding;->mEntity:Lcom/zykj/study/bean/SelectModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->mDirtyFlags:J

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
    check-cast p2, Lcom/zykj/study/bean/SelectModel;

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemChapterProgressBindingImpl;->setEntity(Lcom/zykj/study/bean/SelectModel;)V

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
