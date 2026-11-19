.class public Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;
.super Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;
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
    sput-object v0, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 7
    .line 8
    sget v1, Lcom/zykj/study/R$id;->divider:I

    .line 9
    .line 10
    const/4 v2, 0x6

    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 12
    .line 13
    .line 14
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
    sget-object v0, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x7

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 11

    const/4 v0, 0x5

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/Button;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/Button;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/Button;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/Button;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/Button;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/view/View;

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v10}, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/view/View;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->btExistTeach:Landroid/widget/Button;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->btSubscribe:Landroid/widget/Button;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 6
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->btSubscribeCancel:Landroid/widget/Button;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 7
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->btnCanNotUnsubscribe:Landroid/widget/Button;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->btnChoiceToTeach:Landroid/widget/Button;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 9
    aget-object p1, p3, p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;->mboundView0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 12
    invoke-virtual {p0}, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;->invalidateAll()V

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
    iget-wide v2, v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->mEntity:Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 12
    .line 13
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->mUserInfo:Lcom/zykj/lib/login/proto/UserBean;

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
    const-wide/16 v10, 0x400

    .line 22
    .line 23
    const-wide/16 v12, 0x4010

    .line 24
    .line 25
    const-wide/16 v14, 0x5

    .line 26
    .line 27
    const/16 v16, 0x1

    .line 28
    .line 29
    const/16 v17, 0x0

    .line 30
    .line 31
    if-eqz v9, :cond_b

    .line 32
    .line 33
    and-long v18, v2, v14

    .line 34
    .line 35
    cmp-long v9, v18, v4

    .line 36
    .line 37
    if-eqz v9, :cond_5

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseDetailsBean;->isLearning()Z

    .line 42
    .line 43
    .line 44
    move-result v18

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move/from16 v18, v17

    .line 47
    .line 48
    :goto_0
    if-eqz v9, :cond_2

    .line 49
    .line 50
    if-eqz v18, :cond_1

    .line 51
    .line 52
    or-long/2addr v2, v12

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const-wide/16 v19, 0x2008

    .line 55
    .line 56
    or-long v2, v2, v19

    .line 57
    .line 58
    :cond_2
    :goto_1
    if-eqz v0, :cond_3

    .line 59
    .line 60
    move/from16 v9, v16

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move/from16 v9, v17

    .line 64
    .line 65
    :goto_2
    xor-int/lit8 v19, v18, 0x1

    .line 66
    .line 67
    and-long v20, v2, v14

    .line 68
    .line 69
    cmp-long v20, v20, v4

    .line 70
    .line 71
    if-eqz v20, :cond_6

    .line 72
    .line 73
    if-nez v18, :cond_4

    .line 74
    .line 75
    or-long/2addr v2, v10

    .line 76
    goto :goto_3

    .line 77
    :cond_4
    const-wide/16 v20, 0x200

    .line 78
    .line 79
    or-long v2, v2, v20

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    move/from16 v9, v17

    .line 83
    .line 84
    move/from16 v18, v9

    .line 85
    .line 86
    move/from16 v19, v18

    .line 87
    .line 88
    :cond_6
    :goto_3
    if-eqz v0, :cond_7

    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseDetailsBean;->isTutoring()Z

    .line 91
    .line 92
    .line 93
    move-result v20

    .line 94
    goto :goto_4

    .line 95
    :cond_7
    move/from16 v20, v17

    .line 96
    .line 97
    :goto_4
    and-long v21, v2, v7

    .line 98
    .line 99
    cmp-long v21, v21, v4

    .line 100
    .line 101
    if-eqz v21, :cond_9

    .line 102
    .line 103
    if-eqz v20, :cond_8

    .line 104
    .line 105
    const-wide/16 v21, 0x100

    .line 106
    .line 107
    :goto_5
    or-long v2, v2, v21

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_8
    const-wide/16 v21, 0x80

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_9
    :goto_6
    xor-int/lit8 v21, v20, 0x1

    .line 114
    .line 115
    and-long v22, v2, v7

    .line 116
    .line 117
    cmp-long v22, v22, v4

    .line 118
    .line 119
    if-eqz v22, :cond_c

    .line 120
    .line 121
    if-nez v20, :cond_a

    .line 122
    .line 123
    const-wide/16 v22, 0x40

    .line 124
    .line 125
    :goto_7
    or-long v2, v2, v22

    .line 126
    .line 127
    goto :goto_8

    .line 128
    :cond_a
    const-wide/16 v22, 0x20

    .line 129
    .line 130
    goto :goto_7

    .line 131
    :cond_b
    move/from16 v9, v17

    .line 132
    .line 133
    move/from16 v18, v9

    .line 134
    .line 135
    move/from16 v19, v18

    .line 136
    .line 137
    move/from16 v20, v19

    .line 138
    .line 139
    move/from16 v21, v20

    .line 140
    .line 141
    :cond_c
    :goto_8
    const-wide/16 v22, 0x140

    .line 142
    .line 143
    and-long v22, v2, v22

    .line 144
    .line 145
    cmp-long v22, v22, v4

    .line 146
    .line 147
    const/16 v23, 0x0

    .line 148
    .line 149
    if-eqz v22, :cond_e

    .line 150
    .line 151
    if-eqz v6, :cond_d

    .line 152
    .line 153
    invoke-virtual {v6}, Lcom/zykj/lib/login/proto/UserBean;->getRole()Lcom/zykj/lib/login/proto/RoleType;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    :goto_9
    move-wide/from16 v24, v4

    .line 158
    .line 159
    goto :goto_a

    .line 160
    :cond_d
    move-object/from16 v6, v23

    .line 161
    .line 162
    goto :goto_9

    .line 163
    :goto_a
    sget-object v4, Lcom/zykj/lib/login/proto/RoleType;->Teacher:Lcom/zykj/lib/login/proto/RoleType;

    .line 164
    .line 165
    if-ne v6, v4, :cond_f

    .line 166
    .line 167
    move/from16 v4, v16

    .line 168
    .line 169
    goto :goto_b

    .line 170
    :cond_e
    move-wide/from16 v24, v4

    .line 171
    .line 172
    :cond_f
    move/from16 v4, v17

    .line 173
    .line 174
    :goto_b
    and-long v5, v2, v10

    .line 175
    .line 176
    cmp-long v5, v5, v24

    .line 177
    .line 178
    if-eqz v5, :cond_12

    .line 179
    .line 180
    if-eqz v0, :cond_10

    .line 181
    .line 182
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseBean;->getStatus()Lcom/zykj/study/bean/course/CourseType;

    .line 183
    .line 184
    .line 185
    move-result-object v23

    .line 186
    :cond_10
    move-object/from16 v5, v23

    .line 187
    .line 188
    sget-object v6, Lcom/zykj/study/bean/course/CourseType;->GROUNDING:Lcom/zykj/study/bean/course/CourseType;

    .line 189
    .line 190
    if-ne v5, v6, :cond_11

    .line 191
    .line 192
    move/from16 v6, v16

    .line 193
    .line 194
    goto :goto_c

    .line 195
    :cond_11
    move/from16 v6, v17

    .line 196
    .line 197
    :goto_c
    move-object/from16 v23, v5

    .line 198
    .line 199
    goto :goto_d

    .line 200
    :cond_12
    move/from16 v6, v17

    .line 201
    .line 202
    :goto_d
    and-long v10, v2, v12

    .line 203
    .line 204
    cmp-long v5, v10, v24

    .line 205
    .line 206
    if-eqz v5, :cond_15

    .line 207
    .line 208
    if-eqz v0, :cond_13

    .line 209
    .line 210
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseDetailsBean;->isBindTeach()Z

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    goto :goto_e

    .line 215
    :cond_13
    move/from16 v5, v17

    .line 216
    .line 217
    :goto_e
    const-wide/16 v10, 0x10

    .line 218
    .line 219
    and-long/2addr v10, v2

    .line 220
    cmp-long v10, v10, v24

    .line 221
    .line 222
    if-eqz v10, :cond_14

    .line 223
    .line 224
    xor-int/lit8 v10, v5, 0x1

    .line 225
    .line 226
    goto :goto_f

    .line 227
    :cond_14
    move/from16 v10, v17

    .line 228
    .line 229
    goto :goto_f

    .line 230
    :cond_15
    move/from16 v5, v17

    .line 231
    .line 232
    move v10, v5

    .line 233
    :goto_f
    and-long v11, v2, v14

    .line 234
    .line 235
    cmp-long v11, v11, v24

    .line 236
    .line 237
    if-eqz v11, :cond_19

    .line 238
    .line 239
    if-eqz v18, :cond_16

    .line 240
    .line 241
    goto :goto_10

    .line 242
    :cond_16
    move/from16 v10, v17

    .line 243
    .line 244
    :goto_10
    if-eqz v19, :cond_17

    .line 245
    .line 246
    move v11, v6

    .line 247
    goto :goto_11

    .line 248
    :cond_17
    move/from16 v11, v17

    .line 249
    .line 250
    :goto_11
    if-eqz v18, :cond_18

    .line 251
    .line 252
    goto :goto_12

    .line 253
    :cond_18
    move/from16 v5, v17

    .line 254
    .line 255
    goto :goto_12

    .line 256
    :cond_19
    move/from16 v5, v17

    .line 257
    .line 258
    move v10, v5

    .line 259
    move v11, v10

    .line 260
    :goto_12
    and-long v12, v2, v7

    .line 261
    .line 262
    cmp-long v12, v12, v24

    .line 263
    .line 264
    const-wide/16 v18, 0x1000

    .line 265
    .line 266
    if-eqz v12, :cond_1d

    .line 267
    .line 268
    if-eqz v21, :cond_1a

    .line 269
    .line 270
    move v13, v4

    .line 271
    goto :goto_13

    .line 272
    :cond_1a
    move/from16 v13, v17

    .line 273
    .line 274
    :goto_13
    if-eqz v20, :cond_1b

    .line 275
    .line 276
    goto :goto_14

    .line 277
    :cond_1b
    move/from16 v4, v17

    .line 278
    .line 279
    :goto_14
    if-eqz v12, :cond_1e

    .line 280
    .line 281
    if-eqz v13, :cond_1c

    .line 282
    .line 283
    or-long v2, v2, v18

    .line 284
    .line 285
    goto :goto_15

    .line 286
    :cond_1c
    const-wide/16 v20, 0x800

    .line 287
    .line 288
    or-long v2, v2, v20

    .line 289
    .line 290
    goto :goto_15

    .line 291
    :cond_1d
    move/from16 v4, v17

    .line 292
    .line 293
    move v13, v4

    .line 294
    :cond_1e
    :goto_15
    and-long v18, v2, v18

    .line 295
    .line 296
    cmp-long v12, v18, v24

    .line 297
    .line 298
    if-eqz v12, :cond_21

    .line 299
    .line 300
    if-eqz v0, :cond_1f

    .line 301
    .line 302
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseBean;->getStatus()Lcom/zykj/study/bean/course/CourseType;

    .line 303
    .line 304
    .line 305
    move-result-object v23

    .line 306
    :cond_1f
    move-object/from16 v0, v23

    .line 307
    .line 308
    sget-object v6, Lcom/zykj/study/bean/course/CourseType;->GROUNDING:Lcom/zykj/study/bean/course/CourseType;

    .line 309
    .line 310
    if-ne v0, v6, :cond_20

    .line 311
    .line 312
    goto :goto_16

    .line 313
    :cond_20
    move/from16 v16, v17

    .line 314
    .line 315
    :goto_16
    move/from16 v6, v16

    .line 316
    .line 317
    :cond_21
    and-long/2addr v7, v2

    .line 318
    cmp-long v0, v7, v24

    .line 319
    .line 320
    if-eqz v0, :cond_22

    .line 321
    .line 322
    if-eqz v13, :cond_22

    .line 323
    .line 324
    move/from16 v17, v6

    .line 325
    .line 326
    :cond_22
    if-eqz v0, :cond_23

    .line 327
    .line 328
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->btExistTeach:Landroid/widget/Button;

    .line 329
    .line 330
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    invoke-static {v0, v4}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 335
    .line 336
    .line 337
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->btnChoiceToTeach:Landroid/widget/Button;

    .line 338
    .line 339
    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    invoke-static {v0, v4}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 344
    .line 345
    .line 346
    :cond_23
    and-long/2addr v2, v14

    .line 347
    cmp-long v0, v2, v24

    .line 348
    .line 349
    if-eqz v0, :cond_24

    .line 350
    .line 351
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->btSubscribe:Landroid/widget/Button;

    .line 352
    .line 353
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    invoke-static {v0, v2}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 358
    .line 359
    .line 360
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->btSubscribeCancel:Landroid/widget/Button;

    .line 361
    .line 362
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-static {v0, v2}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 367
    .line 368
    .line 369
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->btnCanNotUnsubscribe:Landroid/widget/Button;

    .line 370
    .line 371
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    invoke-static {v0, v2}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 376
    .line 377
    .line 378
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;->mboundView0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 379
    .line 380
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-static {v0, v2}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 385
    .line 386
    .line 387
    :cond_24
    return-void

    .line 388
    :catchall_0
    move-exception v0

    .line 389
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 390
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;->mDirtyFlags:J

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
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;->mDirtyFlags:J

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

.method public setEntity(Lcom/zykj/study/bean/course/CourseDetailsBean;)V
    .locals 4
    .param p1    # Lcom/zykj/study/bean/course/CourseDetailsBean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->mEntity:Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;->mDirtyFlags:J

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

.method public setUserInfo(Lcom/zykj/lib/login/proto/UserBean;)V
    .locals 4
    .param p1    # Lcom/zykj/lib/login/proto/UserBean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->mUserInfo:Lcom/zykj/lib/login/proto/UserBean;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x2

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x38

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
    check-cast p2, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;->setEntity(Lcom/zykj/study/bean/course/CourseDetailsBean;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    const/16 v0, 0x38

    .line 13
    .line 14
    if-ne v0, p1, :cond_1

    .line 15
    .line 16
    check-cast p2, Lcom/zykj/lib/login/proto/UserBean;

    .line 17
    .line 18
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemCourseStatusBtnBindingImpl;->setUserInfo(Lcom/zykj/lib/login/proto/UserBean;)V

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
