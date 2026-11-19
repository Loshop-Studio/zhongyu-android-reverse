.class public Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;
.super Lcom/zykj/study/databinding/ItemChapterCompleteBinding;
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

.field private final mboundView4:Landroid/widget/LinearLayout;
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
    sget-object v0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x7

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 4

    const/4 v0, 0x6

    .line 2
    aget-object v0, p3, v0

    check-cast v0, Lcom/zykj/study/view/KnowledgeCompleteView;

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v1, v0}, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/study/view/KnowledgeCompleteView;)V

    const-wide/16 v2, -0x1

    .line 3
    iput-wide v2, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->knowView:Lcom/zykj/study/view/KnowledgeCompleteView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    aget-object p1, p3, v1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 7
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mboundView1:Landroid/widget/ImageView;

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 9
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mboundView2:Landroid/widget/ImageView;

    .line 10
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 11
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 12
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 13
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mboundView4:Landroid/widget/LinearLayout;

    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x5

    .line 15
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mboundView5:Landroid/widget/TextView;

    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 17
    invoke-virtual {p0, p2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 18
    invoke-virtual {p0}, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public executeBindings()V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget v0, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->mTotalMember:I

    .line 12
    .line 13
    iget-boolean v6, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->mIsSelected:Z

    .line 14
    .line 15
    iget-object v7, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->mEntity:Lcom/zykj/study/bean/SelectModel;

    .line 16
    .line 17
    iget-object v8, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->mOnArrowClick:Landroid/view/View$OnClickListener;

    .line 18
    .line 19
    const-wide/16 v9, 0x15

    .line 20
    .line 21
    and-long v11, v2, v9

    .line 22
    .line 23
    cmp-long v11, v11, v4

    .line 24
    .line 25
    const-wide/16 v12, 0x14

    .line 26
    .line 27
    const/4 v14, 0x0

    .line 28
    const/4 v15, 0x0

    .line 29
    if-eqz v11, :cond_5

    .line 30
    .line 31
    and-long v16, v2, v12

    .line 32
    .line 33
    cmp-long v11, v16, v4

    .line 34
    .line 35
    if-eqz v11, :cond_1

    .line 36
    .line 37
    if-eqz v7, :cond_0

    .line 38
    .line 39
    invoke-virtual {v7}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 40
    .line 41
    .line 42
    move-result v16

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move/from16 v16, v15

    .line 45
    .line 46
    :goto_0
    xor-int/lit8 v17, v16, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move/from16 v16, v15

    .line 50
    .line 51
    move/from16 v17, v16

    .line 52
    .line 53
    :goto_1
    if-eqz v7, :cond_2

    .line 54
    .line 55
    invoke-virtual {v7}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, Lcom/zykj/study/bean/course/CatalogBean;

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-object v7, v14

    .line 63
    :goto_2
    if-eqz v11, :cond_3

    .line 64
    .line 65
    if-eqz v7, :cond_3

    .line 66
    .line 67
    invoke-virtual {v7}, Lcom/zykj/study/bean/course/CatalogBean;->getTitle()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v11

    .line 71
    goto :goto_3

    .line 72
    :cond_3
    move-object v11, v14

    .line 73
    :goto_3
    if-eqz v7, :cond_4

    .line 74
    .line 75
    invoke-virtual {v7}, Lcom/zykj/study/bean/course/CatalogBean;->getProgress()I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    :goto_4
    move-wide/from16 v18, v4

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_4
    move v7, v15

    .line 83
    goto :goto_4

    .line 84
    :goto_5
    iget-object v4, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mboundView5:Landroid/widget/TextView;

    .line 85
    .line 86
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    sget v5, Lcom/zykj/study/R$string;->complete_proportion:I

    .line 91
    .line 92
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    filled-new-array {v7, v0}, [Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v4, v5, v0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    goto :goto_6

    .line 109
    :cond_5
    move-wide/from16 v18, v4

    .line 110
    .line 111
    move-object v0, v14

    .line 112
    move-object v11, v0

    .line 113
    move/from16 v16, v15

    .line 114
    .line 115
    move/from16 v17, v16

    .line 116
    .line 117
    :goto_6
    const-wide/16 v4, 0x12

    .line 118
    .line 119
    and-long v20, v2, v4

    .line 120
    .line 121
    cmp-long v7, v20, v18

    .line 122
    .line 123
    if-eqz v7, :cond_a

    .line 124
    .line 125
    if-eqz v7, :cond_7

    .line 126
    .line 127
    if-eqz v6, :cond_6

    .line 128
    .line 129
    const-wide/16 v14, 0x140

    .line 130
    .line 131
    :goto_7
    or-long/2addr v2, v14

    .line 132
    goto :goto_8

    .line 133
    :cond_6
    const-wide/16 v14, 0xa0

    .line 134
    .line 135
    goto :goto_7

    .line 136
    :cond_7
    :goto_8
    iget-object v7, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mboundView5:Landroid/widget/TextView;

    .line 137
    .line 138
    if-eqz v6, :cond_8

    .line 139
    .line 140
    sget v14, Lcom/zykj/study/R$color;->white:I

    .line 141
    .line 142
    :goto_9
    invoke-static {v7, v14}, Landroidx/databinding/ViewDataBinding;->getColorFromResource(Landroid/view/View;I)I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    move v15, v7

    .line 147
    goto :goto_a

    .line 148
    :cond_8
    sget v14, Lcom/zykj/study/R$color;->text_label_normal:I

    .line 149
    .line 150
    goto :goto_9

    .line 151
    :goto_a
    if-eqz v6, :cond_9

    .line 152
    .line 153
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mboundView4:Landroid/widget/LinearLayout;

    .line 154
    .line 155
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    sget v7, Lcom/zykj/study/R$drawable;->shape_catalog_complete_pass:I

    .line 160
    .line 161
    :goto_b
    invoke-static {v6, v7}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    move-object v14, v6

    .line 166
    goto :goto_c

    .line 167
    :cond_9
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mboundView4:Landroid/widget/LinearLayout;

    .line 168
    .line 169
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    sget v7, Lcom/zykj/study/R$drawable;->shape_catalog_complete_normal:I

    .line 174
    .line 175
    goto :goto_b

    .line 176
    :cond_a
    :goto_c
    const-wide/16 v6, 0x18

    .line 177
    .line 178
    and-long/2addr v6, v2

    .line 179
    cmp-long v6, v6, v18

    .line 180
    .line 181
    and-long/2addr v12, v2

    .line 182
    cmp-long v7, v12, v18

    .line 183
    .line 184
    if-eqz v7, :cond_b

    .line 185
    .line 186
    iget-object v7, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->knowView:Lcom/zykj/study/view/KnowledgeCompleteView;

    .line 187
    .line 188
    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 189
    .line 190
    .line 191
    move-result-object v12

    .line 192
    invoke-static {v7, v12}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 193
    .line 194
    .line 195
    iget-object v7, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mboundView1:Landroid/widget/ImageView;

    .line 196
    .line 197
    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 198
    .line 199
    .line 200
    move-result-object v12

    .line 201
    invoke-static {v7, v12}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 202
    .line 203
    .line 204
    iget-object v7, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mboundView2:Landroid/widget/ImageView;

    .line 205
    .line 206
    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 207
    .line 208
    .line 209
    move-result-object v12

    .line 210
    invoke-static {v7, v12}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 211
    .line 212
    .line 213
    iget-object v7, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 214
    .line 215
    invoke-static {v7, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 216
    .line 217
    .line 218
    :cond_b
    if-eqz v6, :cond_c

    .line 219
    .line 220
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mboundView4:Landroid/widget/LinearLayout;

    .line 221
    .line 222
    invoke-virtual {v6, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 223
    .line 224
    .line 225
    :cond_c
    and-long/2addr v4, v2

    .line 226
    cmp-long v4, v4, v18

    .line 227
    .line 228
    if-eqz v4, :cond_d

    .line 229
    .line 230
    iget-object v4, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mboundView4:Landroid/widget/LinearLayout;

    .line 231
    .line 232
    invoke-static {v4, v14}, Landroidx/databinding/adapters/ViewBindingAdapter;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 233
    .line 234
    .line 235
    iget-object v4, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mboundView5:Landroid/widget/TextView;

    .line 236
    .line 237
    invoke-virtual {v4, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 238
    .line 239
    .line 240
    :cond_d
    and-long/2addr v2, v9

    .line 241
    cmp-long v2, v2, v18

    .line 242
    .line 243
    if-eqz v2, :cond_e

    .line 244
    .line 245
    iget-object v2, v1, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mboundView5:Landroid/widget/TextView;

    .line 246
    .line 247
    invoke-static {v2, v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 248
    .line 249
    .line 250
    :cond_e
    return-void

    .line 251
    :catchall_0
    move-exception v0

    .line 252
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 253
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mDirtyFlags:J

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
    const-wide/16 v0, 0x10

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mDirtyFlags:J

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
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->mEntity:Lcom/zykj/study/bean/SelectModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x4

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mDirtyFlags:J

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

.method public setIsSelected(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->mIsSelected:Z

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x2

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x1c

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

.method public setOnArrowClick(Landroid/view/View$OnClickListener;)V
    .locals 4
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->mOnArrowClick:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x8

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x24

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

.method public setTotalMember(I)V
    .locals 4

    .line 1
    iput p1, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->mTotalMember:I

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x34

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
    const/16 v0, 0x34

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    .line 6
    check-cast p2, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p0, p1}, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->setTotalMember(I)V

    .line 13
    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    const/16 v0, 0x1c

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
    invoke-virtual {p0, p1}, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->setIsSelected(Z)V

    .line 27
    .line 28
    .line 29
    return v1

    .line 30
    :cond_1
    const/16 v0, 0xf

    .line 31
    .line 32
    if-ne v0, p1, :cond_2

    .line 33
    .line 34
    check-cast p2, Lcom/zykj/study/bean/SelectModel;

    .line 35
    .line 36
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->setEntity(Lcom/zykj/study/bean/SelectModel;)V

    .line 37
    .line 38
    .line 39
    return v1

    .line 40
    :cond_2
    const/16 v0, 0x24

    .line 41
    .line 42
    if-ne v0, p1, :cond_3

    .line 43
    .line 44
    check-cast p2, Landroid/view/View$OnClickListener;

    .line 45
    .line 46
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemChapterCompleteBindingImpl;->setOnArrowClick(Landroid/view/View$OnClickListener;)V

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
