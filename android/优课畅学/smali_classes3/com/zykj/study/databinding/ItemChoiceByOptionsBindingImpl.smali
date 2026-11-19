.class public Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;
.super Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;
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

.field private final mboundView4:Landroid/widget/TextView;
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
    sput-object v0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 7
    .line 8
    sget v1, Lcom/zykj/study/R$id;->view_line:I

    .line 9
    .line 10
    const/4 v2, 0x5

    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 12
    .line 13
    .line 14
    sget v1, Lcom/zykj/study/R$id;->iv_bubble:I

    .line 15
    .line 16
    const/4 v2, 0x6

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 18
    .line 19
    .line 20
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
    sget-object v0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x7

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 10

    const/4 v0, 0x6

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/view/View;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/view/View;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/view/View;

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v9}, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->mDirtyFlags:J

    const/4 p1, 0x0

    .line 4
    aget-object p1, p3, p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->mboundView0:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 p2, 0x0

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 6
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->mboundView4:Landroid/widget/TextView;

    .line 7
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->tvName:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 9
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->viewBackground:Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 10
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->viewContent:Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 12
    invoke-virtual {p0}, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public executeBindings()V
    .locals 15

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->mDirtyFlags:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    iput-wide v2, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->mDirtyFlags:J

    .line 7
    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-object v4, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->mIsSelected:Ljava/lang/Boolean;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->mData:Lcom/zykj/study/bean/teach/ChoiceChartData;

    .line 12
    .line 13
    const-wide/16 v6, 0x5

    .line 14
    .line 15
    and-long v8, v0, v6

    .line 16
    .line 17
    cmp-long v8, v8, v2

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    if-eqz v8, :cond_3

    .line 21
    .line 22
    invoke-static {v4}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v8, :cond_1

    .line 27
    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    const-wide/16 v10, 0x40

    .line 31
    .line 32
    :goto_0
    or-long/2addr v0, v10

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const-wide/16 v10, 0x20

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    :goto_1
    if-eqz v4, :cond_2

    .line 38
    .line 39
    iget-object v4, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->tvName:Landroid/widget/TextView;

    .line 40
    .line 41
    sget v8, Lcom/zykj/study/R$color;->list_table_text_pass:I

    .line 42
    .line 43
    :goto_2
    invoke-static {v4, v8}, Landroidx/databinding/ViewDataBinding;->getColorFromResource(Landroid/view/View;I)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    goto :goto_3

    .line 48
    :cond_2
    iget-object v4, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->tvName:Landroid/widget/TextView;

    .line 49
    .line 50
    sget v8, Lcom/zykj/study/R$color;->unselected_gray:I

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    move v4, v9

    .line 54
    :goto_3
    const-wide/16 v10, 0x6

    .line 55
    .line 56
    and-long v12, v0, v10

    .line 57
    .line 58
    cmp-long v8, v12, v2

    .line 59
    .line 60
    const/4 v12, 0x0

    .line 61
    if-eqz v8, :cond_9

    .line 62
    .line 63
    if-eqz v5, :cond_4

    .line 64
    .line 65
    invoke-virtual {v5}, Lcom/zykj/study/bean/teach/ChoiceChartData;->isRight()Z

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    invoke-virtual {v5}, Lcom/zykj/study/bean/teach/ChoiceChartData;->getProgress()I

    .line 70
    .line 71
    .line 72
    move-result v12

    .line 73
    invoke-virtual {v5}, Lcom/zykj/study/bean/teach/ChoiceChartData;->getShowName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    goto :goto_4

    .line 78
    :cond_4
    move-object v5, v12

    .line 79
    move v12, v9

    .line 80
    :goto_4
    if-eqz v8, :cond_6

    .line 81
    .line 82
    if-eqz v9, :cond_5

    .line 83
    .line 84
    const-wide/16 v13, 0x110

    .line 85
    .line 86
    :goto_5
    or-long/2addr v0, v13

    .line 87
    goto :goto_6

    .line 88
    :cond_5
    const-wide/16 v13, 0x88

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_6
    :goto_6
    iget-object v8, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->viewContent:Landroid/view/View;

    .line 92
    .line 93
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    if-eqz v9, :cond_7

    .line 98
    .line 99
    sget v13, Lcom/zykj/study/R$drawable;->item_bg_choice_right:I

    .line 100
    .line 101
    :goto_7
    invoke-static {v8, v13}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    goto :goto_8

    .line 106
    :cond_7
    sget v13, Lcom/zykj/study/R$drawable;->item_bg_choice_wrong:I

    .line 107
    .line 108
    goto :goto_7

    .line 109
    :goto_8
    if-eqz v9, :cond_8

    .line 110
    .line 111
    iget-object v9, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->viewBackground:Landroid/view/View;

    .line 112
    .line 113
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    sget v13, Lcom/zykj/study/R$drawable;->item_bg_choice_right_background:I

    .line 118
    .line 119
    :goto_9
    invoke-static {v9, v13}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    goto :goto_a

    .line 124
    :cond_8
    iget-object v9, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->viewBackground:Landroid/view/View;

    .line 125
    .line 126
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    sget v13, Lcom/zykj/study/R$drawable;->item_bg_choice_wrong_background:I

    .line 131
    .line 132
    goto :goto_9

    .line 133
    :goto_a
    new-instance v13, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v12, "%"

    .line 142
    .line 143
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v12

    .line 150
    goto :goto_b

    .line 151
    :cond_9
    move-object v5, v12

    .line 152
    move-object v8, v5

    .line 153
    move-object v9, v8

    .line 154
    :goto_b
    and-long/2addr v10, v0

    .line 155
    cmp-long v10, v10, v2

    .line 156
    .line 157
    if-eqz v10, :cond_a

    .line 158
    .line 159
    iget-object v10, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->mboundView4:Landroid/widget/TextView;

    .line 160
    .line 161
    invoke-static {v10, v12}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 162
    .line 163
    .line 164
    iget-object v10, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->tvName:Landroid/widget/TextView;

    .line 165
    .line 166
    invoke-static {v10, v5}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 167
    .line 168
    .line 169
    iget-object v5, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->viewBackground:Landroid/view/View;

    .line 170
    .line 171
    invoke-static {v5, v9}, Landroidx/databinding/adapters/ViewBindingAdapter;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 172
    .line 173
    .line 174
    iget-object v5, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->viewContent:Landroid/view/View;

    .line 175
    .line 176
    invoke-static {v5, v8}, Landroidx/databinding/adapters/ViewBindingAdapter;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 177
    .line 178
    .line 179
    :cond_a
    and-long/2addr v0, v6

    .line 180
    cmp-long v0, v0, v2

    .line 181
    .line 182
    if-eqz v0, :cond_b

    .line 183
    .line 184
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->tvName:Landroid/widget/TextView;

    .line 185
    .line 186
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 187
    .line 188
    .line 189
    :cond_b
    return-void

    .line 190
    :catchall_0
    move-exception v0

    .line 191
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 192
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->mDirtyFlags:J

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
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->mDirtyFlags:J

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

.method public setData(Lcom/zykj/study/bean/teach/ChoiceChartData;)V
    .locals 4
    .param p1    # Lcom/zykj/study/bean/teach/ChoiceChartData;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->mData:Lcom/zykj/study/bean/teach/ChoiceChartData;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x2

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->mDirtyFlags:J

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

.method public setIsSelected(Ljava/lang/Boolean;)V
    .locals 4
    .param p1    # Ljava/lang/Boolean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBinding;->mIsSelected:Ljava/lang/Boolean;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->mDirtyFlags:J

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

.method public setVariable(ILjava/lang/Object;)Z
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/16 v0, 0x1c

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
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->setIsSelected(Ljava/lang/Boolean;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    const/4 v0, 0x7

    .line 13
    if-ne v0, p1, :cond_1

    .line 14
    .line 15
    check-cast p2, Lcom/zykj/study/bean/teach/ChoiceChartData;

    .line 16
    .line 17
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemChoiceByOptionsBindingImpl;->setData(Lcom/zykj/study/bean/teach/ChoiceChartData;)V

    .line 18
    .line 19
    .line 20
    return v1

    .line 21
    :cond_1
    const/4 p1, 0x0

    .line 22
    return p1
.end method
