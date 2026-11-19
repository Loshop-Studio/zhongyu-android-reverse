.class public Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;
.super Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;
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
    sget-object v0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x4

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 4

    const/4 v0, 0x2

    .line 2
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v1, v0}, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/LinearLayout;)V

    const-wide/16 v2, -0x1

    .line 3
    iput-wide v2, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->llProgress:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    aget-object p1, p3, v1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 7
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mboundView1:Landroid/widget/TextView;

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 9
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 10
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p0, p2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 12
    invoke-virtual {p0}, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->invalidateAll()V

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
    iget-wide v2, v1, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget v0, v1, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->mTotalMember:I

    .line 12
    .line 13
    iget-boolean v6, v1, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->mIsSelected:Z

    .line 14
    .line 15
    iget-object v7, v1, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->mEntity:Lcom/zykj/study/bean/course/CatalogBean;

    .line 16
    .line 17
    iget-object v8, v1, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->mOnClick:Landroid/view/View$OnClickListener;

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
    if-eqz v11, :cond_2

    .line 30
    .line 31
    if-eqz v7, :cond_0

    .line 32
    .line 33
    invoke-virtual {v7}, Lcom/zykj/study/bean/course/CatalogBean;->getProgress()I

    .line 34
    .line 35
    .line 36
    move-result v11

    .line 37
    :goto_0
    move-wide/from16 v16, v4

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    move v11, v14

    .line 41
    goto :goto_0

    .line 42
    :goto_1
    iget-object v4, v1, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 43
    .line 44
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    sget v5, Lcom/zykj/study/R$string;->complete_proportion:I

    .line 49
    .line 50
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    filled-new-array {v11, v0}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v4, v5, v0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    and-long v4, v2, v12

    .line 67
    .line 68
    cmp-long v4, v4, v16

    .line 69
    .line 70
    if-eqz v4, :cond_1

    .line 71
    .line 72
    if-eqz v7, :cond_1

    .line 73
    .line 74
    invoke-virtual {v7}, Lcom/zykj/study/bean/course/CatalogBean;->getTitle()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    goto :goto_2

    .line 79
    :cond_1
    move-object v4, v15

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    move-wide/from16 v16, v4

    .line 82
    .line 83
    move-object v0, v15

    .line 84
    move-object v4, v0

    .line 85
    :goto_2
    const-wide/16 v18, 0x12

    .line 86
    .line 87
    and-long v20, v2, v18

    .line 88
    .line 89
    cmp-long v5, v20, v16

    .line 90
    .line 91
    if-eqz v5, :cond_7

    .line 92
    .line 93
    if-eqz v5, :cond_4

    .line 94
    .line 95
    if-eqz v6, :cond_3

    .line 96
    .line 97
    const-wide/16 v14, 0x140

    .line 98
    .line 99
    :goto_3
    or-long/2addr v2, v14

    .line 100
    goto :goto_4

    .line 101
    :cond_3
    const-wide/16 v14, 0xa0

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_4
    :goto_4
    iget-object v5, v1, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->llProgress:Landroid/widget/LinearLayout;

    .line 105
    .line 106
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    if-eqz v6, :cond_5

    .line 111
    .line 112
    sget v7, Lcom/zykj/study/R$drawable;->shape_catalog_complete_pass:I

    .line 113
    .line 114
    :goto_5
    invoke-static {v5, v7}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    move-object v15, v5

    .line 119
    goto :goto_6

    .line 120
    :cond_5
    sget v7, Lcom/zykj/study/R$drawable;->shape_catalog_complete_normal:I

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :goto_6
    iget-object v5, v1, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 124
    .line 125
    if-eqz v6, :cond_6

    .line 126
    .line 127
    sget v6, Lcom/zykj/study/R$color;->white:I

    .line 128
    .line 129
    :goto_7
    invoke-static {v5, v6}, Landroidx/databinding/ViewDataBinding;->getColorFromResource(Landroid/view/View;I)I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    move v14, v5

    .line 134
    goto :goto_8

    .line 135
    :cond_6
    sget v6, Lcom/zykj/study/R$color;->text_label_normal:I

    .line 136
    .line 137
    goto :goto_7

    .line 138
    :cond_7
    :goto_8
    const-wide/16 v5, 0x18

    .line 139
    .line 140
    and-long/2addr v5, v2

    .line 141
    cmp-long v5, v5, v16

    .line 142
    .line 143
    if-eqz v5, :cond_8

    .line 144
    .line 145
    iget-object v5, v1, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->llProgress:Landroid/widget/LinearLayout;

    .line 146
    .line 147
    invoke-virtual {v5, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    .line 149
    .line 150
    :cond_8
    and-long v5, v2, v18

    .line 151
    .line 152
    cmp-long v5, v5, v16

    .line 153
    .line 154
    if-eqz v5, :cond_9

    .line 155
    .line 156
    iget-object v5, v1, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->llProgress:Landroid/widget/LinearLayout;

    .line 157
    .line 158
    invoke-static {v5, v15}, Landroidx/databinding/adapters/ViewBindingAdapter;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 159
    .line 160
    .line 161
    iget-object v5, v1, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 162
    .line 163
    invoke-virtual {v5, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 164
    .line 165
    .line 166
    :cond_9
    and-long v5, v2, v12

    .line 167
    .line 168
    cmp-long v5, v5, v16

    .line 169
    .line 170
    if-eqz v5, :cond_a

    .line 171
    .line 172
    iget-object v5, v1, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mboundView1:Landroid/widget/TextView;

    .line 173
    .line 174
    invoke-static {v5, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 175
    .line 176
    .line 177
    :cond_a
    and-long/2addr v2, v9

    .line 178
    cmp-long v2, v2, v16

    .line 179
    .line 180
    if-eqz v2, :cond_b

    .line 181
    .line 182
    iget-object v2, v1, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 183
    .line 184
    invoke-static {v2, v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 185
    .line 186
    .line 187
    :cond_b
    return-void

    .line 188
    :catchall_0
    move-exception v0

    .line 189
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 190
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mDirtyFlags:J

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
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mDirtyFlags:J

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

.method public setEntity(Lcom/zykj/study/bean/course/CatalogBean;)V
    .locals 4
    .param p1    # Lcom/zykj/study/bean/course/CatalogBean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->mEntity:Lcom/zykj/study/bean/course/CatalogBean;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x4

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mDirtyFlags:J

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
    iput-boolean p1, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->mIsSelected:Z

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x2

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mDirtyFlags:J

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

.method public setOnClick(Landroid/view/View$OnClickListener;)V
    .locals 4
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->mOnClick:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x8

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x25

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
    iput p1, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->mTotalMember:I

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->mDirtyFlags:J

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
    invoke-virtual {p0, p1}, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->setTotalMember(I)V

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
    invoke-virtual {p0, p1}, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->setIsSelected(Z)V

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
    check-cast p2, Lcom/zykj/study/bean/course/CatalogBean;

    .line 35
    .line 36
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->setEntity(Lcom/zykj/study/bean/course/CatalogBean;)V

    .line 37
    .line 38
    .line 39
    return v1

    .line 40
    :cond_2
    const/16 v0, 0x25

    .line 41
    .line 42
    if-ne v0, p1, :cond_3

    .line 43
    .line 44
    check-cast p2, Landroid/view/View$OnClickListener;

    .line 45
    .line 46
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBindingImpl;->setOnClick(Landroid/view/View$OnClickListener;)V

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
