.class public Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;
.super Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;
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
    sput-object v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 7
    .line 8
    const v1, 0x7f090362

    .line 9
    .line 10
    .line 11
    const/16 v2, 0xe

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 14
    .line 15
    .line 16
    const v1, 0x7f09036a

    .line 17
    .line 18
    .line 19
    const/16 v2, 0xf

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;[Landroid/view/View;)V
    .locals 3
    .param p1    # Landroidx/databinding/DataBindingComponent;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # [Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x10

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;[Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;[Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;[Landroid/view/View;[Ljava/lang/Object;)V
    .locals 20

    const/4 v0, 0x0

    .line 2
    aget-object v2, p2, v0

    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/view/View;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroidx/appcompat/widget/LinearLayoutCompat;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroidx/appcompat/widget/LinearLayoutCompat;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroid/widget/TextView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Landroid/widget/TextView;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v15, v0

    check-cast v15, Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    const/16 v0, 0xf

    aget-object v0, p3, v0

    move-object/from16 v16, v0

    check-cast v16, Landroid/widget/TextView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object/from16 v17, v0

    check-cast v17, Landroid/widget/TextView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object/from16 v18, v0

    check-cast v18, Landroid/widget/TextView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object/from16 v19, v0

    check-cast v19, Landroid/widget/TextView;

    const/4 v3, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v19}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/view/View;Landroidx/appcompat/widget/LinearLayoutCompat;Landroidx/appcompat/widget/LinearLayoutCompat;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;Landroid/widget/TextView;Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;Landroid/widget/TextView;Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->ImgAnswer:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->divider:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 6
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->llNewArticle:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 7
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->llNewReplay:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvAnswer:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 9
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvBetterClass:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 10
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvGallery:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 11
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvNewArticle:Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 12
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvNewQuora:Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 13
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvNewQuoraTitle:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 14
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvNewReplay:Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 15
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvNote:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 16
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvOnline:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 17
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvWrongBook:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v1, p2

    .line 18
    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setRootTag([Landroid/view/View;)V

    .line 19
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeVmTodoResp(Landroidx/lifecycle/LiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;",
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
    iget-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->mDirtyFlags:J

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
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->mVm:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 12
    .line 13
    iget-object v6, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 14
    .line 15
    const-wide/16 v7, 0xb

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
    const-wide/16 v12, 0x40

    .line 24
    .line 25
    const-wide/16 v14, 0x10

    .line 26
    .line 27
    const/16 v16, 0x0

    .line 28
    .line 29
    move-wide/from16 v17, v4

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    if-eqz v9, :cond_c

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->G()Landroidx/lifecycle/LiveData;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object/from16 v0, v16

    .line 42
    .line 43
    :goto_0
    invoke-virtual {v1, v4, v0}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 44
    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object/from16 v0, v16

    .line 56
    .line 57
    :goto_1
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->getUnReplySpecialCount()I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->getUnReadSpecialCount()I

    .line 64
    .line 65
    .line 66
    move-result v19

    .line 67
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;->getQuoraCount()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    move/from16 v4, v19

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    move v0, v4

    .line 75
    move v5, v0

    .line 76
    :goto_2
    const/16 v20, 0x1

    .line 77
    .line 78
    move-wide/from16 v21, v7

    .line 79
    .line 80
    const/16 v7, 0x63

    .line 81
    .line 82
    if-le v5, v7, :cond_3

    .line 83
    .line 84
    move/from16 v8, v20

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    const/4 v8, 0x0

    .line 88
    :goto_3
    if-le v4, v7, :cond_4

    .line 89
    .line 90
    move/from16 v23, v20

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_4
    const/16 v23, 0x0

    .line 94
    .line 95
    :goto_4
    if-le v0, v7, :cond_5

    .line 96
    .line 97
    move/from16 v19, v20

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_5
    const/16 v19, 0x0

    .line 101
    .line 102
    :goto_5
    if-eqz v9, :cond_7

    .line 103
    .line 104
    if-eqz v8, :cond_6

    .line 105
    .line 106
    const-wide/16 v24, 0x20

    .line 107
    .line 108
    or-long v2, v2, v24

    .line 109
    .line 110
    goto :goto_6

    .line 111
    :cond_6
    or-long/2addr v2, v14

    .line 112
    :cond_7
    :goto_6
    and-long v24, v2, v21

    .line 113
    .line 114
    cmp-long v7, v24, v17

    .line 115
    .line 116
    if-eqz v7, :cond_9

    .line 117
    .line 118
    if-eqz v23, :cond_8

    .line 119
    .line 120
    const-wide/16 v24, 0x80

    .line 121
    .line 122
    or-long v2, v2, v24

    .line 123
    .line 124
    goto :goto_7

    .line 125
    :cond_8
    or-long/2addr v2, v12

    .line 126
    :cond_9
    :goto_7
    and-long v24, v2, v21

    .line 127
    .line 128
    cmp-long v7, v24, v17

    .line 129
    .line 130
    if-eqz v7, :cond_a

    .line 131
    .line 132
    if-eqz v19, :cond_b

    .line 133
    .line 134
    const-wide/16 v24, 0x200

    .line 135
    .line 136
    or-long v2, v2, v24

    .line 137
    .line 138
    :cond_a
    :goto_8
    move/from16 v26, v4

    .line 139
    .line 140
    move v4, v0

    .line 141
    move/from16 v0, v19

    .line 142
    .line 143
    move/from16 v19, v26

    .line 144
    .line 145
    goto :goto_9

    .line 146
    :cond_b
    or-long/2addr v2, v10

    .line 147
    goto :goto_8

    .line 148
    :cond_c
    move-wide/from16 v21, v7

    .line 149
    .line 150
    const/4 v0, 0x0

    .line 151
    const/4 v4, 0x0

    .line 152
    const/4 v5, 0x0

    .line 153
    const/4 v8, 0x0

    .line 154
    const/16 v19, 0x0

    .line 155
    .line 156
    const/16 v23, 0x0

    .line 157
    .line 158
    :goto_9
    const-wide/16 v24, 0xc

    .line 159
    .line 160
    and-long v24, v2, v24

    .line 161
    .line 162
    cmp-long v7, v24, v17

    .line 163
    .line 164
    and-long v9, v2, v10

    .line 165
    .line 166
    cmp-long v9, v9, v17

    .line 167
    .line 168
    if-eqz v9, :cond_d

    .line 169
    .line 170
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    goto :goto_a

    .line 175
    :cond_d
    move-object/from16 v4, v16

    .line 176
    .line 177
    :goto_a
    and-long v9, v2, v14

    .line 178
    .line 179
    cmp-long v9, v9, v17

    .line 180
    .line 181
    if-eqz v9, :cond_e

    .line 182
    .line 183
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    goto :goto_b

    .line 188
    :cond_e
    move-object/from16 v5, v16

    .line 189
    .line 190
    :goto_b
    and-long v9, v2, v12

    .line 191
    .line 192
    cmp-long v9, v9, v17

    .line 193
    .line 194
    if-eqz v9, :cond_f

    .line 195
    .line 196
    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    goto :goto_c

    .line 201
    :cond_f
    move-object/from16 v9, v16

    .line 202
    .line 203
    :goto_c
    and-long v2, v2, v21

    .line 204
    .line 205
    cmp-long v2, v2, v17

    .line 206
    .line 207
    if-eqz v2, :cond_13

    .line 208
    .line 209
    if-eqz v8, :cond_10

    .line 210
    .line 211
    const-string v3, "99+"

    .line 212
    .line 213
    move-object/from16 v16, v3

    .line 214
    .line 215
    goto :goto_d

    .line 216
    :cond_10
    move-object/from16 v16, v5

    .line 217
    .line 218
    :goto_d
    if-eqz v23, :cond_11

    .line 219
    .line 220
    const-string v3, "99+"

    .line 221
    .line 222
    goto :goto_e

    .line 223
    :cond_11
    move-object v3, v9

    .line 224
    :goto_e
    if-eqz v0, :cond_12

    .line 225
    .line 226
    const-string v0, "99+"

    .line 227
    .line 228
    goto :goto_f

    .line 229
    :cond_12
    move-object v0, v4

    .line 230
    :goto_f
    move-object/from16 v4, v16

    .line 231
    .line 232
    goto :goto_10

    .line 233
    :cond_13
    move-object/from16 v0, v16

    .line 234
    .line 235
    move-object v3, v0

    .line 236
    move-object v4, v3

    .line 237
    :goto_10
    if-eqz v7, :cond_14

    .line 238
    .line 239
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->ImgAnswer:Landroid/widget/ImageView;

    .line 240
    .line 241
    invoke-static {v5, v6}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 242
    .line 243
    .line 244
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvBetterClass:Landroid/widget/TextView;

    .line 245
    .line 246
    invoke-static {v5, v6}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 247
    .line 248
    .line 249
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvGallery:Landroid/widget/TextView;

    .line 250
    .line 251
    invoke-static {v5, v6}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 252
    .line 253
    .line 254
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvNote:Landroid/widget/TextView;

    .line 255
    .line 256
    invoke-static {v5, v6}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 257
    .line 258
    .line 259
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvOnline:Landroid/widget/TextView;

    .line 260
    .line 261
    invoke-static {v5, v6}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 262
    .line 263
    .line 264
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvWrongBook:Landroid/widget/TextView;

    .line 265
    .line 266
    invoke-static {v5, v6}, Li4/h;->g(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 267
    .line 268
    .line 269
    :cond_14
    if-eqz v2, :cond_15

    .line 270
    .line 271
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvNewArticle:Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    .line 272
    .line 273
    invoke-static {v2, v3}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 274
    .line 275
    .line 276
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvNewQuora:Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    .line 277
    .line 278
    invoke-static {v2, v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 279
    .line 280
    .line 281
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->tvNewReplay:Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    .line 282
    .line 283
    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 284
    .line 285
    .line 286
    :cond_15
    return-void

    .line 287
    :catchall_0
    move-exception v0

    .line 288
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 289
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->mDirtyFlags:J

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
    const-wide/16 v0, 0x8

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->mDirtyFlags:J

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

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 6
    .line 7
    invoke-direct {p0, p2, p3}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->onChangeVmTodoResp(Landroidx/lifecycle/LiveData;I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public setClickListener(Landroid/view/View$OnClickListener;)V
    .locals 4
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x4

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/4 p1, 0x2

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

.method public setVariable(ILjava/lang/Object;)Z
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x7

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    check-cast p2, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->setVm(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)V

    .line 8
    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/4 v0, 0x2

    .line 12
    if-ne v0, p1, :cond_1

    .line 13
    .line 14
    check-cast p2, Landroid/view/View$OnClickListener;

    .line 15
    .line 16
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->setClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method public setVm(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBinding;->mVm:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x2

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeAppBindingImpl;->mDirtyFlags:J

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
