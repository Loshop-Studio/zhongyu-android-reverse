.class public Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBindingImpl;
.super Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;
.source "SourceFile"


# static fields
.field public static final A:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field public static final B:Landroid/util/SparseIntArray;


# instance fields
.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 2
    .line 3
    const/16 v1, 0x27

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBindingImpl;->A:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 9
    .line 10
    const-string v1, "include_mistake_detail_end"

    .line 11
    .line 12
    filled-new-array {v1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x1

    .line 17
    filled-new-array {v2}, [I

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget v3, Lcom/zykj/mistake/R$layout;->include_mistake_detail_end:I

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
    new-instance v0, Landroid/util/SparseIntArray;

    .line 32
    .line 33
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBindingImpl;->B:Landroid/util/SparseIntArray;

    .line 37
    .line 38
    sget v1, Lcom/zykj/mistake/R$id;->view:I

    .line 39
    .line 40
    const/4 v2, 0x2

    .line 41
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 42
    .line 43
    .line 44
    sget v1, Lcom/zykj/mistake/R$id;->ib_back:I

    .line 45
    .line 46
    const/4 v2, 0x3

    .line 47
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 48
    .line 49
    .line 50
    sget v1, Lcom/zykj/mistake/R$id;->tv_title:I

    .line 51
    .line 52
    const/4 v2, 0x4

    .line 53
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 54
    .line 55
    .line 56
    sget v1, Lcom/zykj/mistake/R$id;->v_line:I

    .line 57
    .line 58
    const/4 v2, 0x5

    .line 59
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 60
    .line 61
    .line 62
    sget v1, Lcom/zykj/mistake/R$id;->scrollView2:I

    .line 63
    .line 64
    const/4 v2, 0x6

    .line 65
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 66
    .line 67
    .line 68
    sget v1, Lcom/zykj/mistake/R$id;->tv_star1:I

    .line 69
    .line 70
    const/4 v2, 0x7

    .line 71
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 72
    .line 73
    .line 74
    sget v1, Lcom/zykj/mistake/R$id;->tv_mistake_subject:I

    .line 75
    .line 76
    const/16 v2, 0x8

    .line 77
    .line 78
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 79
    .line 80
    .line 81
    sget v1, Lcom/zykj/mistake/R$id;->nice_spinner:I

    .line 82
    .line 83
    const/16 v2, 0x9

    .line 84
    .line 85
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 86
    .line 87
    .line 88
    sget v1, Lcom/zykj/mistake/R$id;->view_fixed_content_width_anchor:I

    .line 89
    .line 90
    const/16 v2, 0xa

    .line 91
    .line 92
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 93
    .line 94
    .line 95
    sget v1, Lcom/zykj/mistake/R$id;->tv_topic_diff_tip:I

    .line 96
    .line 97
    const/16 v2, 0xb

    .line 98
    .line 99
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 100
    .line 101
    .line 102
    sget v1, Lcom/zykj/mistake/R$id;->tv_star2:I

    .line 103
    .line 104
    const/16 v2, 0xc

    .line 105
    .line 106
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 107
    .line 108
    .line 109
    sget v1, Lcom/zykj/mistake/R$id;->tv_mistake_title:I

    .line 110
    .line 111
    const/16 v2, 0xd

    .line 112
    .line 113
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 114
    .line 115
    .line 116
    sget v1, Lcom/zykj/mistake/R$id;->et_mistake_title:I

    .line 117
    .line 118
    const/16 v2, 0xe

    .line 119
    .line 120
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 121
    .line 122
    .line 123
    sget v1, Lcom/zykj/mistake/R$id;->tv_star3:I

    .line 124
    .line 125
    const/16 v2, 0xf

    .line 126
    .line 127
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 128
    .line 129
    .line 130
    sget v1, Lcom/zykj/mistake/R$id;->tv_mistake_stem:I

    .line 131
    .line 132
    const/16 v2, 0x10

    .line 133
    .line 134
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 135
    .line 136
    .line 137
    sget v1, Lcom/zykj/mistake/R$id;->iv_first_stem_background:I

    .line 138
    .line 139
    const/16 v2, 0x11

    .line 140
    .line 141
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 142
    .line 143
    .line 144
    sget v1, Lcom/zykj/mistake/R$id;->iv_first_stem:I

    .line 145
    .line 146
    const/16 v2, 0x12

    .line 147
    .line 148
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 149
    .line 150
    .line 151
    sget v1, Lcom/zykj/mistake/R$id;->iv_first_stem_delete:I

    .line 152
    .line 153
    const/16 v2, 0x13

    .line 154
    .line 155
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 156
    .line 157
    .line 158
    sget v1, Lcom/zykj/mistake/R$id;->iv_second_stem_background:I

    .line 159
    .line 160
    const/16 v2, 0x14

    .line 161
    .line 162
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 163
    .line 164
    .line 165
    sget v1, Lcom/zykj/mistake/R$id;->iv_second_stem:I

    .line 166
    .line 167
    const/16 v2, 0x15

    .line 168
    .line 169
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 170
    .line 171
    .line 172
    sget v1, Lcom/zykj/mistake/R$id;->iv_second_stem_delete:I

    .line 173
    .line 174
    const/16 v2, 0x16

    .line 175
    .line 176
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 177
    .line 178
    .line 179
    sget v1, Lcom/zykj/mistake/R$id;->group_answer:I

    .line 180
    .line 181
    const/16 v2, 0x17

    .line 182
    .line 183
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 184
    .line 185
    .line 186
    sget v1, Lcom/zykj/mistake/R$id;->tv_mistake_answer:I

    .line 187
    .line 188
    const/16 v2, 0x18

    .line 189
    .line 190
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 191
    .line 192
    .line 193
    sget v1, Lcom/zykj/mistake/R$id;->iv_first_answer_background:I

    .line 194
    .line 195
    const/16 v2, 0x19

    .line 196
    .line 197
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 198
    .line 199
    .line 200
    sget v1, Lcom/zykj/mistake/R$id;->iv_first_answer:I

    .line 201
    .line 202
    const/16 v2, 0x1a

    .line 203
    .line 204
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 205
    .line 206
    .line 207
    sget v1, Lcom/zykj/mistake/R$id;->iv_first_answer_delete:I

    .line 208
    .line 209
    const/16 v2, 0x1b

    .line 210
    .line 211
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 212
    .line 213
    .line 214
    sget v1, Lcom/zykj/mistake/R$id;->iv_second_answer_background:I

    .line 215
    .line 216
    const/16 v2, 0x1c

    .line 217
    .line 218
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 219
    .line 220
    .line 221
    sget v1, Lcom/zykj/mistake/R$id;->iv_second_answer:I

    .line 222
    .line 223
    const/16 v2, 0x1d

    .line 224
    .line 225
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 226
    .line 227
    .line 228
    sget v1, Lcom/zykj/mistake/R$id;->iv_second_answer_delete:I

    .line 229
    .line 230
    const/16 v2, 0x1e

    .line 231
    .line 232
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 233
    .line 234
    .line 235
    sget v1, Lcom/zykj/mistake/R$id;->group_photo_tip:I

    .line 236
    .line 237
    const/16 v2, 0x1f

    .line 238
    .line 239
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 240
    .line 241
    .line 242
    sget v1, Lcom/zykj/mistake/R$id;->iv_image_tip:I

    .line 243
    .line 244
    const/16 v2, 0x20

    .line 245
    .line 246
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 247
    .line 248
    .line 249
    sget v1, Lcom/zykj/mistake/R$id;->tv_image_tip:I

    .line 250
    .line 251
    const/16 v2, 0x21

    .line 252
    .line 253
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 254
    .line 255
    .line 256
    sget v1, Lcom/zykj/mistake/R$id;->tv_mistake_tag:I

    .line 257
    .line 258
    const/16 v2, 0x22

    .line 259
    .line 260
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 261
    .line 262
    .line 263
    sget v1, Lcom/zykj/mistake/R$id;->flow_layout:I

    .line 264
    .line 265
    const/16 v2, 0x23

    .line 266
    .line 267
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 268
    .line 269
    .line 270
    sget v1, Lcom/zykj/mistake/R$id;->guide_line_mistake_create_main:I

    .line 271
    .line 272
    const/16 v2, 0x24

    .line 273
    .line 274
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 275
    .line 276
    .line 277
    sget v1, Lcom/zykj/mistake/R$id;->btn_main_cancel:I

    .line 278
    .line 279
    const/16 v2, 0x25

    .line 280
    .line 281
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 282
    .line 283
    .line 284
    sget v1, Lcom/zykj/mistake/R$id;->btn_main_confirm:I

    .line 285
    .line 286
    const/16 v2, 0x26

    .line 287
    .line 288
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 289
    .line 290
    .line 291
    return-void
.end method


# virtual methods
.method public final executeBindings()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBindingImpl;->z:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v0
.end method

.method public final hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBindingImpl;->z:J

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
    iget-object v0, p0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

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
    const/4 v0, 0x0

    .line 26
    return v0

    .line 27
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v0
.end method

.method public final invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x2

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBindingImpl;->z:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
.end method

.method public final onFieldChange(ILjava/lang/Object;I)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    check-cast p2, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 6
    .line 7
    if-nez p3, :cond_1

    .line 8
    .line 9
    monitor-enter p0

    .line 10
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBindingImpl;->z:J

    .line 11
    .line 12
    const-wide/16 v0, 0x1

    .line 13
    .line 14
    or-long/2addr p1, v0

    .line 15
    iput-wide p1, p0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBindingImpl;->z:J

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p1

    .line 23
    :cond_1
    return v0
.end method

.method public final setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setVariable(ILjava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
