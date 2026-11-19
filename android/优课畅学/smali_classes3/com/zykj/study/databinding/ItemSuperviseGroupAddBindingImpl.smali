.class public Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;
.super Lcom/zykj/study/databinding/ItemSuperviseGroupAddBinding;
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

.field private final mboundView0:Landroid/widget/RelativeLayout;
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

.field private final mboundView4:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView5:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView6:Landroid/widget/ImageView;
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
    sget-object v0, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x7

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, p0, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mDirtyFlags:J

    .line 4
    aget-object p1, p3, v0

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mboundView0:Landroid/widget/RelativeLayout;

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 6
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mboundView1:Landroid/widget/TextView;

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 8
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 10
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 11
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 12
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mboundView4:Landroid/widget/ImageView;

    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x5

    .line 14
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mboundView5:Landroid/widget/ImageView;

    .line 15
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x6

    .line 16
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mboundView6:Landroid/widget/ImageView;

    .line 17
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 18
    invoke-virtual {p0, p2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 19
    invoke-virtual {p0}, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->invalidateAll()V

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
    iget-wide v2, v1, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBinding;->mOnclick:Landroid/view/View$OnClickListener;

    .line 12
    .line 13
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBinding;->mEntity:Lcom/zykj/study/bean/SelectModel;

    .line 14
    .line 15
    const-wide/16 v7, 0x7

    .line 16
    .line 17
    and-long v9, v2, v7

    .line 18
    .line 19
    cmp-long v9, v9, v4

    .line 20
    .line 21
    const-wide/16 v10, 0x140

    .line 22
    .line 23
    const-wide/16 v12, 0x6

    .line 24
    .line 25
    const/4 v14, 0x0

    .line 26
    const/4 v15, 0x0

    .line 27
    if-eqz v9, :cond_8

    .line 28
    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    invoke-virtual {v6}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v16

    .line 35
    check-cast v16, Lcom/zykj/study/bean/teach/CourseBindBean;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object/from16 v16, v14

    .line 39
    .line 40
    :goto_0
    and-long v17, v2, v12

    .line 41
    .line 42
    cmp-long v17, v17, v4

    .line 43
    .line 44
    if-eqz v17, :cond_1

    .line 45
    .line 46
    if-eqz v16, :cond_1

    .line 47
    .line 48
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/study/bean/teach/CourseBindBean;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v17

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object/from16 v17, v14

    .line 54
    .line 55
    :goto_1
    if-eqz v16, :cond_2

    .line 56
    .line 57
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/study/bean/teach/CourseBindBean;->isBind()Z

    .line 58
    .line 59
    .line 60
    move-result v16

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move/from16 v16, v15

    .line 63
    .line 64
    :goto_2
    if-eqz v9, :cond_4

    .line 65
    .line 66
    if-eqz v16, :cond_3

    .line 67
    .line 68
    const-wide/16 v18, 0x10

    .line 69
    .line 70
    :goto_3
    or-long v2, v2, v18

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_3
    const-wide/16 v18, 0x8

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    :goto_4
    and-long v18, v2, v12

    .line 77
    .line 78
    cmp-long v9, v18, v4

    .line 79
    .line 80
    if-eqz v9, :cond_7

    .line 81
    .line 82
    xor-int/lit8 v18, v16, 0x1

    .line 83
    .line 84
    if-eqz v9, :cond_5

    .line 85
    .line 86
    if-nez v16, :cond_6

    .line 87
    .line 88
    or-long/2addr v2, v10

    .line 89
    :cond_5
    :goto_5
    move-object/from16 v9, v17

    .line 90
    .line 91
    goto :goto_6

    .line 92
    :cond_6
    const-wide/16 v19, 0xa0

    .line 93
    .line 94
    or-long v2, v2, v19

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_7
    move/from16 v18, v15

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_8
    move-object v9, v14

    .line 101
    move/from16 v16, v15

    .line 102
    .line 103
    move/from16 v18, v16

    .line 104
    .line 105
    :goto_6
    and-long/2addr v10, v2

    .line 106
    cmp-long v10, v10, v4

    .line 107
    .line 108
    if-eqz v10, :cond_b

    .line 109
    .line 110
    if-eqz v6, :cond_9

    .line 111
    .line 112
    invoke-virtual {v6}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    goto :goto_7

    .line 117
    :cond_9
    move v6, v15

    .line 118
    :goto_7
    const-wide/16 v10, 0x100

    .line 119
    .line 120
    and-long/2addr v10, v2

    .line 121
    cmp-long v10, v10, v4

    .line 122
    .line 123
    if-eqz v10, :cond_a

    .line 124
    .line 125
    xor-int/lit8 v10, v6, 0x1

    .line 126
    .line 127
    goto :goto_8

    .line 128
    :cond_a
    move v10, v15

    .line 129
    goto :goto_8

    .line 130
    :cond_b
    move v6, v15

    .line 131
    move v10, v6

    .line 132
    :goto_8
    and-long/2addr v7, v2

    .line 133
    cmp-long v7, v7, v4

    .line 134
    .line 135
    if-eqz v7, :cond_d

    .line 136
    .line 137
    if-eqz v16, :cond_c

    .line 138
    .line 139
    move-object v0, v14

    .line 140
    :cond_c
    move-object v14, v0

    .line 141
    :cond_d
    and-long/2addr v2, v12

    .line 142
    cmp-long v0, v2, v4

    .line 143
    .line 144
    if-eqz v0, :cond_10

    .line 145
    .line 146
    if-eqz v18, :cond_e

    .line 147
    .line 148
    goto :goto_9

    .line 149
    :cond_e
    move v6, v15

    .line 150
    :goto_9
    if-eqz v18, :cond_f

    .line 151
    .line 152
    move v15, v10

    .line 153
    :cond_f
    move v2, v15

    .line 154
    move v15, v6

    .line 155
    goto :goto_a

    .line 156
    :cond_10
    move v2, v15

    .line 157
    :goto_a
    if-eqz v7, :cond_11

    .line 158
    .line 159
    iget-object v3, v1, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mboundView0:Landroid/widget/RelativeLayout;

    .line 160
    .line 161
    invoke-virtual {v3, v14}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    .line 163
    .line 164
    :cond_11
    if-eqz v0, :cond_12

    .line 165
    .line 166
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mboundView1:Landroid/widget/TextView;

    .line 167
    .line 168
    invoke-static {v0, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    .line 171
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mboundView1:Landroid/widget/TextView;

    .line 172
    .line 173
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-static {v0, v3}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 178
    .line 179
    .line 180
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 181
    .line 182
    invoke-static {v0, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 183
    .line 184
    .line 185
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 186
    .line 187
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-static {v0, v3}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 192
    .line 193
    .line 194
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 195
    .line 196
    invoke-static {v0, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 197
    .line 198
    .line 199
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 200
    .line 201
    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    invoke-static {v0, v3}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 206
    .line 207
    .line 208
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mboundView4:Landroid/widget/ImageView;

    .line 209
    .line 210
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-static {v0, v3}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 215
    .line 216
    .line 217
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mboundView5:Landroid/widget/ImageView;

    .line 218
    .line 219
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-static {v0, v2}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 224
    .line 225
    .line 226
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mboundView6:Landroid/widget/ImageView;

    .line 227
    .line 228
    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-static {v0, v2}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 233
    .line 234
    .line 235
    :cond_12
    return-void

    .line 236
    :catchall_0
    move-exception v0

    .line 237
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 238
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mDirtyFlags:J

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
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mDirtyFlags:J

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
            "Lcom/zykj/study/bean/teach/CourseBindBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBinding;->mEntity:Lcom/zykj/study/bean/SelectModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x2

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mDirtyFlags:J

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

.method public setOnclick(Landroid/view/View$OnClickListener;)V
    .locals 4
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBinding;->mOnclick:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x27

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
    const/16 v0, 0x27

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    .line 6
    check-cast p2, Landroid/view/View$OnClickListener;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->setOnclick(Landroid/view/View$OnClickListener;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    const/16 v0, 0xf

    .line 13
    .line 14
    if-ne v0, p1, :cond_1

    .line 15
    .line 16
    check-cast p2, Lcom/zykj/study/bean/SelectModel;

    .line 17
    .line 18
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemSuperviseGroupAddBindingImpl;->setEntity(Lcom/zykj/study/bean/SelectModel;)V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    return p1
.end method
