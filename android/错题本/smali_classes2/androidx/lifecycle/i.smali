.class public final synthetic Landroidx/lifecycle/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Lr6/c;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/lifecycle/i;->a:I

    iput-object p2, p0, Landroidx/lifecycle/i;->c:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/lifecycle/i;->d:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/lifecycle/i;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p3, p0, Landroidx/lifecycle/i;->a:I

    iput-object p1, p0, Landroidx/lifecycle/i;->b:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/i;->c:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/lifecycle/i;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lr6/c;Ld6/d;I)V
    .locals 0

    .line 3
    iput p4, p0, Landroidx/lifecycle/i;->a:I

    iput-object p1, p0, Landroidx/lifecycle/i;->c:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/i;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/lifecycle/i;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 82

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Landroidx/lifecycle/i;->a:I

    .line 6
    .line 7
    const-string v3, "it"

    .line 8
    .line 9
    const v4, 0x29b3c0fe

    .line 10
    .line 11
    .line 12
    const-string v5, "$this$LazyVerticalGrid"

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    sget-object v7, Ld6/s;->a:Ld6/s;

    .line 16
    .line 17
    const/4 v8, 0x1

    .line 18
    iget-object v9, v0, Landroidx/lifecycle/i;->d:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v10, v0, Landroidx/lifecycle/i;->b:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v11, v0, Landroidx/lifecycle/i;->c:Ljava/lang/Object;

    .line 23
    .line 24
    packed-switch v2, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    check-cast v11, Ljava/io/File;

    .line 28
    .line 29
    check-cast v10, Lr6/c;

    .line 30
    .line 31
    check-cast v9, Lr6/a;

    .line 32
    .line 33
    check-cast v1, Landroid/net/Uri;

    .line 34
    .line 35
    invoke-static {v11, v10, v9, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$initBoardConfig$1$2;->a(Ljava/io/File;Lr6/c;Lr6/a;Landroid/net/Uri;)Ld6/s;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    return-object v1

    .line 40
    :pswitch_0
    check-cast v11, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 41
    .line 42
    check-cast v10, Lr6/c;

    .line 43
    .line 44
    check-cast v9, Lr6/c;

    .line 45
    .line 46
    move-object v12, v1

    .line 47
    check-cast v12, Landroidx/compose/foundation/lazy/grid/LazyGridScope;

    .line 48
    .line 49
    invoke-static {v12, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v11, Lcom/zykj/mistake/feature/notebook/list/e1;->d:Ljava/util/List;

    .line 53
    .line 54
    new-instance v2, Lcom/zykj/mistake/feature/collection/component/j;

    .line 55
    .line 56
    const/16 v3, 0x1a

    .line 57
    .line 58
    invoke-direct {v2, v3}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 59
    .line 60
    .line 61
    sget-object v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookScreenKt$MistakeNotebookGrid$lambda$37$lambda$36$lambda$35$$inlined$items$default$1;->INSTANCE:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookScreenKt$MistakeNotebookGrid$lambda$37$lambda$36$lambda$35$$inlined$items$default$1;

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v13

    .line 67
    new-instance v14, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookScreenKt$MistakeNotebookGrid$lambda$37$lambda$36$lambda$35$$inlined$items$default$2;

    .line 68
    .line 69
    invoke-direct {v14, v2, v1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookScreenKt$MistakeNotebookGrid$lambda$37$lambda$36$lambda$35$$inlined$items$default$2;-><init>(Lr6/c;Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookScreenKt$MistakeNotebookGrid$lambda$37$lambda$36$lambda$35$$inlined$items$default$4;

    .line 73
    .line 74
    invoke-direct {v2, v3, v1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookScreenKt$MistakeNotebookGrid$lambda$37$lambda$36$lambda$35$$inlined$items$default$4;-><init>(Lr6/c;Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    new-instance v3, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookScreenKt$MistakeNotebookGrid$lambda$37$lambda$36$lambda$35$$inlined$items$default$5;

    .line 78
    .line 79
    invoke-direct {v3, v1, v11, v10, v9}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookScreenKt$MistakeNotebookGrid$lambda$37$lambda$36$lambda$35$$inlined$items$default$5;-><init>(Ljava/util/List;Lcom/zykj/mistake/feature/notebook/list/e1;Lr6/c;Lr6/c;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v4, v8, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 83
    .line 84
    .line 85
    move-result-object v17

    .line 86
    const/4 v15, 0x0

    .line 87
    move-object/from16 v16, v2

    .line 88
    .line 89
    invoke-interface/range {v12 .. v17}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->items(ILr6/c;Lr6/e;Lr6/c;Lr6/g;)V

    .line 90
    .line 91
    .line 92
    iget-boolean v1, v11, Lcom/zykj/mistake/feature/notebook/list/e1;->f:Z

    .line 93
    .line 94
    if-nez v1, :cond_0

    .line 95
    .line 96
    iget-boolean v1, v11, Lcom/zykj/mistake/feature/notebook/list/e1;->g:Z

    .line 97
    .line 98
    if-nez v1, :cond_1

    .line 99
    .line 100
    :cond_0
    new-instance v14, Lcom/zykj/mistake/feature/collection/component/j;

    .line 101
    .line 102
    const/16 v1, 0x1b

    .line 103
    .line 104
    invoke-direct {v14, v1}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 105
    .line 106
    .line 107
    new-instance v1, Landroidx/navigation/serialization/b;

    .line 108
    .line 109
    const/4 v2, 0x4

    .line 110
    invoke-direct {v1, v11, v2}, Landroidx/navigation/serialization/b;-><init>(Ljava/lang/Object;I)V

    .line 111
    .line 112
    .line 113
    const v2, 0x794f5a8d

    .line 114
    .line 115
    .line 116
    invoke-static {v2, v8, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 117
    .line 118
    .line 119
    move-result-object v16

    .line 120
    const/16 v17, 0x5

    .line 121
    .line 122
    const/16 v18, 0x0

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v15, 0x0

    .line 126
    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->item$default(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/lang/Object;Lr6/c;Ljava/lang/Object;Lr6/f;ILjava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_1
    return-object v7

    .line 130
    :pswitch_1
    check-cast v10, Landroidx/navigation/NavBackStackEntry;

    .line 131
    .line 132
    check-cast v11, Ljava/lang/String;

    .line 133
    .line 134
    check-cast v9, Lu4/g;

    .line 135
    .line 136
    check-cast v1, Landroidx/compose/runtime/DisposableEffectScope;

    .line 137
    .line 138
    const-string v2, "$this$DisposableEffect"

    .line 139
    .line 140
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    new-instance v1, Landroidx/lifecycle/compose/f;

    .line 144
    .line 145
    invoke-direct {v1, v8, v11, v9}, Landroidx/lifecycle/compose/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v10}, Landroidx/navigation/NavBackStackEntry;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v2, v1}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 153
    .line 154
    .line 155
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$lambda$6$lambda$5$$inlined$onDispose$1;

    .line 156
    .line 157
    invoke-direct {v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$lambda$6$lambda$5$$inlined$onDispose$1;-><init>()V

    .line 158
    .line 159
    .line 160
    return-object v1

    .line 161
    :pswitch_2
    move-object v2, v10

    .line 162
    check-cast v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 163
    .line 164
    check-cast v11, Lcom/zykj/mistake/feature/notebook/detail/v1;

    .line 165
    .line 166
    iget-object v4, v11, Lcom/zykj/mistake/feature/notebook/detail/v1;->e:Ljava/util/ArrayList;

    .line 167
    .line 168
    move-object v5, v9

    .line 169
    check-cast v5, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 170
    .line 171
    check-cast v1, Lcom/zykj/mistake/network/ApiResp;

    .line 172
    .line 173
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-static {}, Lkotlin/collections/u;->q()Lkotlin/collections/builders/ListBuilder;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    iget-object v3, v11, Lcom/zykj/mistake/feature/notebook/detail/v1;->a:Ljava/lang/Integer;

    .line 181
    .line 182
    const-string v8, ""

    .line 183
    .line 184
    if-eqz v3, :cond_3

    .line 185
    .line 186
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    new-instance v12, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 191
    .line 192
    add-int/lit8 v9, v3, -0x1

    .line 193
    .line 194
    sget-object v10, Lcom/zykj/mistake/utils/d;->a:[Ljava/lang/String;

    .line 195
    .line 196
    invoke-static {v9, v10}, Lkotlin/collections/q;->V(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    check-cast v9, Ljava/lang/String;

    .line 201
    .line 202
    if-nez v9, :cond_2

    .line 203
    .line 204
    move-object v13, v8

    .line 205
    goto :goto_0

    .line 206
    :cond_2
    move-object v13, v9

    .line 207
    :goto_0
    int-to-long v14, v3

    .line 208
    const/16 v18, 0x4

    .line 209
    .line 210
    const/16 v19, 0x0

    .line 211
    .line 212
    const/16 v16, 0x0

    .line 213
    .line 214
    const/16 v17, 0x0

    .line 215
    .line 216
    invoke-direct/range {v12 .. v19}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v1, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    :cond_3
    iget-object v3, v11, Lcom/zykj/mistake/feature/notebook/detail/v1;->b:Ljava/lang/Integer;

    .line 223
    .line 224
    if-eqz v3, :cond_5

    .line 225
    .line 226
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    new-instance v12, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 231
    .line 232
    add-int/lit8 v9, v3, -0x1

    .line 233
    .line 234
    sget-object v10, Lcom/zykj/mistake/utils/d;->b:[Ljava/lang/String;

    .line 235
    .line 236
    invoke-static {v9, v10}, Lkotlin/collections/q;->V(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    check-cast v9, Ljava/lang/String;

    .line 241
    .line 242
    if-nez v9, :cond_4

    .line 243
    .line 244
    move-object v13, v8

    .line 245
    goto :goto_1

    .line 246
    :cond_4
    move-object v13, v9

    .line 247
    :goto_1
    int-to-long v14, v3

    .line 248
    const/16 v18, 0x4

    .line 249
    .line 250
    const/16 v19, 0x0

    .line 251
    .line 252
    const/16 v16, 0x0

    .line 253
    .line 254
    const/16 v17, 0x1

    .line 255
    .line 256
    invoke-direct/range {v12 .. v19}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 257
    .line 258
    .line 259
    invoke-interface {v1, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    :cond_5
    iget-object v3, v11, Lcom/zykj/mistake/feature/notebook/detail/v1;->c:Ljava/lang/Integer;

    .line 263
    .line 264
    if-eqz v3, :cond_7

    .line 265
    .line 266
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    new-instance v12, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 271
    .line 272
    add-int/lit8 v9, v3, -0x1

    .line 273
    .line 274
    sget-object v10, Lcom/zykj/mistake/utils/d;->c:[Ljava/lang/String;

    .line 275
    .line 276
    invoke-static {v9, v10}, Lkotlin/collections/q;->V(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v9

    .line 280
    check-cast v9, Ljava/lang/String;

    .line 281
    .line 282
    if-nez v9, :cond_6

    .line 283
    .line 284
    move-object v13, v8

    .line 285
    goto :goto_2

    .line 286
    :cond_6
    move-object v13, v9

    .line 287
    :goto_2
    int-to-long v14, v3

    .line 288
    const/16 v18, 0x4

    .line 289
    .line 290
    const/16 v19, 0x0

    .line 291
    .line 292
    const/16 v16, 0x0

    .line 293
    .line 294
    const/16 v17, 0x2

    .line 295
    .line 296
    invoke-direct/range {v12 .. v19}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 297
    .line 298
    .line 299
    invoke-interface {v1, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    :cond_7
    new-instance v3, Ljava/util/ArrayList;

    .line 303
    .line 304
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 308
    .line 309
    .line 310
    move-result v8

    .line 311
    move v9, v6

    .line 312
    :cond_8
    :goto_3
    if-ge v9, v8, :cond_9

    .line 313
    .line 314
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v10

    .line 318
    add-int/lit8 v9, v9, 0x1

    .line 319
    .line 320
    move-object v12, v10

    .line 321
    check-cast v12, Lp4/i;

    .line 322
    .line 323
    iget-object v13, v12, Lp4/i;->b:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 324
    .line 325
    sget-object v14, Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;->BLUE:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 326
    .line 327
    if-ne v13, v14, :cond_8

    .line 328
    .line 329
    iget-object v12, v12, Lp4/i;->c:Ljava/lang/Integer;

    .line 330
    .line 331
    if-eqz v12, :cond_8

    .line 332
    .line 333
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    goto :goto_3

    .line 337
    :cond_9
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 338
    .line 339
    .line 340
    move-result v8

    .line 341
    :goto_4
    if-ge v6, v8, :cond_a

    .line 342
    .line 343
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v9

    .line 347
    add-int/lit8 v6, v6, 0x1

    .line 348
    .line 349
    check-cast v9, Lp4/i;

    .line 350
    .line 351
    new-instance v12, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 352
    .line 353
    iget-object v13, v9, Lp4/i;->a:Ljava/lang/String;

    .line 354
    .line 355
    iget-object v9, v9, Lp4/i;->c:Ljava/lang/Integer;

    .line 356
    .line 357
    invoke-static {v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 361
    .line 362
    .line 363
    move-result v9

    .line 364
    int-to-long v14, v9

    .line 365
    const/16 v18, 0x4

    .line 366
    .line 367
    const/16 v19, 0x0

    .line 368
    .line 369
    const/16 v16, 0x0

    .line 370
    .line 371
    const/16 v17, -0x1

    .line 372
    .line 373
    invoke-direct/range {v12 .. v19}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 374
    .line 375
    .line 376
    invoke-interface {v1, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    goto :goto_4

    .line 380
    :cond_a
    invoke-virtual {v1}, Lkotlin/collections/builders/ListBuilder;->build()Ljava/util/List;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    new-instance v3, Ljava/util/ArrayList;

    .line 385
    .line 386
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 387
    .line 388
    .line 389
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    :cond_b
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 394
    .line 395
    .line 396
    move-result v6

    .line 397
    if-eqz v6, :cond_c

    .line 398
    .line 399
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    move-object v8, v6

    .line 404
    check-cast v8, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 405
    .line 406
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v8

    .line 410
    invoke-static {v8}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 411
    .line 412
    .line 413
    move-result v8

    .line 414
    if-nez v8, :cond_b

    .line 415
    .line 416
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    goto :goto_5

    .line 420
    :cond_c
    new-instance v1, Landroidx/navigation/i;

    .line 421
    .line 422
    const/16 v6, 0xe

    .line 423
    .line 424
    invoke-direct {v1, v11, v6}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e0(Lr6/c;)Ljava/util/ArrayList;

    .line 428
    .line 429
    .line 430
    move-result-object v57

    .line 431
    iget-object v6, v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 432
    .line 433
    :goto_6
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    move-object v12, v1

    .line 438
    check-cast v12, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 439
    .line 440
    const/16 v80, -0x801

    .line 441
    .line 442
    const/16 v81, 0x1

    .line 443
    .line 444
    const/4 v13, 0x0

    .line 445
    const/4 v14, 0x0

    .line 446
    const-wide/16 v15, 0x0

    .line 447
    .line 448
    const/16 v17, 0x0

    .line 449
    .line 450
    const/16 v18, 0x0

    .line 451
    .line 452
    const/16 v19, 0x0

    .line 453
    .line 454
    const/16 v20, 0x0

    .line 455
    .line 456
    const/16 v21, 0x0

    .line 457
    .line 458
    const/16 v22, 0x0

    .line 459
    .line 460
    const/16 v23, 0x0

    .line 461
    .line 462
    const/16 v24, 0x0

    .line 463
    .line 464
    const/16 v25, 0x0

    .line 465
    .line 466
    const/16 v26, 0x0

    .line 467
    .line 468
    const/16 v27, 0x0

    .line 469
    .line 470
    const/16 v29, 0x0

    .line 471
    .line 472
    const/16 v30, 0x0

    .line 473
    .line 474
    const/16 v31, 0x0

    .line 475
    .line 476
    const/16 v33, 0x0

    .line 477
    .line 478
    const/16 v34, 0x0

    .line 479
    .line 480
    const/16 v35, 0x0

    .line 481
    .line 482
    const/16 v36, 0x1

    .line 483
    .line 484
    const/16 v37, 0x0

    .line 485
    .line 486
    const/16 v38, 0x0

    .line 487
    .line 488
    const/16 v39, 0x0

    .line 489
    .line 490
    const/16 v40, 0x0

    .line 491
    .line 492
    const/16 v41, 0x0

    .line 493
    .line 494
    const/16 v42, 0x0

    .line 495
    .line 496
    const/16 v43, 0x0

    .line 497
    .line 498
    const/16 v44, 0x0

    .line 499
    .line 500
    const/16 v45, 0x0

    .line 501
    .line 502
    const/16 v46, 0x0

    .line 503
    .line 504
    const/16 v47, 0x0

    .line 505
    .line 506
    const/16 v48, 0x0

    .line 507
    .line 508
    const/16 v49, 0x0

    .line 509
    .line 510
    const/16 v50, 0x0

    .line 511
    .line 512
    const/16 v51, 0x0

    .line 513
    .line 514
    const/16 v52, 0x0

    .line 515
    .line 516
    const/16 v53, 0x0

    .line 517
    .line 518
    const/16 v54, 0x0

    .line 519
    .line 520
    const/16 v55, 0x0

    .line 521
    .line 522
    const/16 v56, 0x0

    .line 523
    .line 524
    const/16 v58, 0x0

    .line 525
    .line 526
    const/16 v59, 0x0

    .line 527
    .line 528
    const/16 v60, 0x0

    .line 529
    .line 530
    const/16 v61, 0x0

    .line 531
    .line 532
    const/16 v62, 0x0

    .line 533
    .line 534
    const/16 v63, 0x0

    .line 535
    .line 536
    const/16 v64, 0x0

    .line 537
    .line 538
    const/16 v65, 0x0

    .line 539
    .line 540
    const/16 v66, 0x0

    .line 541
    .line 542
    const/16 v67, 0x0

    .line 543
    .line 544
    const/16 v68, 0x0

    .line 545
    .line 546
    const/16 v69, 0x0

    .line 547
    .line 548
    const/16 v70, 0x0

    .line 549
    .line 550
    const/16 v71, 0x0

    .line 551
    .line 552
    const/16 v72, 0x0

    .line 553
    .line 554
    const/16 v73, 0x0

    .line 555
    .line 556
    const/16 v74, 0x0

    .line 557
    .line 558
    const/16 v75, 0x0

    .line 559
    .line 560
    const/16 v76, 0x0

    .line 561
    .line 562
    const/16 v77, 0x0

    .line 563
    .line 564
    const/16 v78, 0x0

    .line 565
    .line 566
    const v79, -0x444001

    .line 567
    .line 568
    .line 569
    move-object/from16 v28, v3

    .line 570
    .line 571
    move-object/from16 v32, v4

    .line 572
    .line 573
    invoke-static/range {v12 .. v81}, Lcom/zykj/mistake/feature/notebook/detail/m3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    move-object/from16 v4, v28

    .line 578
    .line 579
    invoke-virtual {v6, v1, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v1

    .line 583
    if-eqz v1, :cond_e

    .line 584
    .line 585
    iget-object v1, v5, Lcom/zykj/mistake/feature/notebook/detail/m3;->d:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 586
    .line 587
    sget-object v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;->REVIEW_RECOMMEND:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 588
    .line 589
    if-ne v1, v3, :cond_d

    .line 590
    .line 591
    sget-object v1, Lcom/zykj/mistake/feature/review/q;->a:Lcom/zykj/mistake/feature/review/q;

    .line 592
    .line 593
    iget-object v1, v5, Lcom/zykj/mistake/feature/notebook/detail/m3;->e:Ljava/lang/String;

    .line 594
    .line 595
    iget v3, v5, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 596
    .line 597
    invoke-static {v1, v3, v4}, Lcom/zykj/mistake/feature/review/q;->g(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 598
    .line 599
    .line 600
    :cond_d
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/j1;

    .line 601
    .line 602
    sget v3, Lcom/zykj/mistake/R$string;->set_tag_success:I

    .line 603
    .line 604
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->B(I)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v3

    .line 608
    invoke-direct {v1, v3}, Lcom/zykj/mistake/feature/notebook/detail/j1;-><init>(Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 612
    .line 613
    .line 614
    return-object v7

    .line 615
    :cond_e
    move-object v3, v4

    .line 616
    move-object/from16 v4, v32

    .line 617
    .line 618
    goto/16 :goto_6

    .line 619
    .line 620
    :pswitch_3
    check-cast v10, Lz4/e;

    .line 621
    .line 622
    check-cast v11, Lw4/c;

    .line 623
    .line 624
    check-cast v9, Landroid/os/Messenger;

    .line 625
    .line 626
    check-cast v1, Landroid/net/Uri;

    .line 627
    .line 628
    iget-object v2, v10, Lz4/e;->c:Lcom/zykj/view/utils/ImagePicker;

    .line 629
    .line 630
    iget-object v3, v10, Lz4/e;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 631
    .line 632
    new-instance v4, Lcom/zykj/mistake/feature/notebook/detail/h0;

    .line 633
    .line 634
    invoke-direct {v4, v11, v3, v9, v8}, Lcom/zykj/mistake/feature/notebook/detail/h0;-><init>(Lw4/c;Lcom/zykj/mistake/activity/MainActivity;Landroid/os/Messenger;I)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v2, v1, v4}, Lcom/zykj/view/utils/ImagePicker;->startCrop(Landroid/net/Uri;Lr6/c;)V

    .line 638
    .line 639
    .line 640
    return-object v7

    .line 641
    :pswitch_4
    move-object v14, v10

    .line 642
    check-cast v14, Ljava/lang/String;

    .line 643
    .line 644
    check-cast v11, Ljava/lang/String;

    .line 645
    .line 646
    check-cast v9, Lr6/a;

    .line 647
    .line 648
    move-object v15, v1

    .line 649
    check-cast v15, Lcom/zykj/mistake/feature/notebook/detail/d;

    .line 650
    .line 651
    const-string v1, "container"

    .line 652
    .line 653
    invoke-static {v15, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    const-string v1, "onClick"

    .line 657
    .line 658
    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/a;

    .line 662
    .line 663
    invoke-direct {v1, v9, v6}, Lcom/zykj/mistake/feature/notebook/detail/a;-><init>(Lr6/a;I)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v15, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 667
    .line 668
    .line 669
    iget-object v1, v15, Lcom/zykj/mistake/feature/notebook/detail/d;->d:Ljava/lang/String;

    .line 670
    .line 671
    invoke-static {v1, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    move-result v1

    .line 675
    if-nez v1, :cond_10

    .line 676
    .line 677
    iput-object v14, v15, Lcom/zykj/mistake/feature/notebook/detail/d;->d:Ljava/lang/String;

    .line 678
    .line 679
    iget-object v1, v15, Lcom/zykj/mistake/feature/notebook/detail/d;->g:Ls/k;

    .line 680
    .line 681
    if-eqz v1, :cond_f

    .line 682
    .line 683
    invoke-virtual {v1}, Ls/k;->a()V

    .line 684
    .line 685
    .line 686
    :cond_f
    iget-object v1, v15, Lcom/zykj/mistake/feature/notebook/detail/d;->c:Landroid/widget/LinearLayout;

    .line 687
    .line 688
    const/16 v2, 0x8

    .line 689
    .line 690
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 691
    .line 692
    .line 693
    iget-object v13, v15, Lcom/zykj/mistake/feature/notebook/detail/d;->a:Lcom/zykj/mistake/widget/ResizableImageView;

    .line 694
    .line 695
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/b;

    .line 696
    .line 697
    invoke-direct {v1, v15, v6}, Lcom/zykj/mistake/feature/notebook/detail/b;-><init>(Lcom/zykj/mistake/feature/notebook/detail/d;I)V

    .line 698
    .line 699
    .line 700
    new-instance v2, Lcom/zykj/mistake/feature/notebook/detail/b;

    .line 701
    .line 702
    invoke-direct {v2, v15, v8}, Lcom/zykj/mistake/feature/notebook/detail/b;-><init>(Lcom/zykj/mistake/feature/notebook/detail/d;I)V

    .line 703
    .line 704
    .line 705
    move-object v12, v15

    .line 706
    const/4 v15, 0x0

    .line 707
    move-object/from16 v16, v1

    .line 708
    .line 709
    move-object/from16 v17, v2

    .line 710
    .line 711
    invoke-virtual/range {v12 .. v17}, Lcom/zykj/mistake/feature/notebook/detail/d;->b(Lcom/zykj/mistake/widget/ResizableImageView;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/b;Lcom/zykj/mistake/feature/notebook/detail/b;)Ls/k;

    .line 712
    .line 713
    .line 714
    move-result-object v1

    .line 715
    iput-object v1, v12, Lcom/zykj/mistake/feature/notebook/detail/d;->g:Ls/k;

    .line 716
    .line 717
    goto :goto_7

    .line 718
    :cond_10
    move-object v12, v15

    .line 719
    :goto_7
    if-eqz v14, :cond_11

    .line 720
    .line 721
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 722
    .line 723
    .line 724
    move-result v1

    .line 725
    if-nez v1, :cond_12

    .line 726
    .line 727
    :cond_11
    move v6, v8

    .line 728
    :cond_12
    xor-int/lit8 v1, v6, 0x1

    .line 729
    .line 730
    iget-object v2, v12, Lcom/zykj/mistake/feature/notebook/detail/d;->e:Ljava/lang/String;

    .line 731
    .line 732
    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 733
    .line 734
    .line 735
    move-result v2

    .line 736
    if-eqz v2, :cond_13

    .line 737
    .line 738
    iget-boolean v2, v12, Lcom/zykj/mistake/feature/notebook/detail/d;->f:Z

    .line 739
    .line 740
    if-eq v2, v1, :cond_15

    .line 741
    .line 742
    :cond_13
    iput-object v11, v12, Lcom/zykj/mistake/feature/notebook/detail/d;->e:Ljava/lang/String;

    .line 743
    .line 744
    iput-boolean v1, v12, Lcom/zykj/mistake/feature/notebook/detail/d;->f:Z

    .line 745
    .line 746
    iget-object v2, v12, Lcom/zykj/mistake/feature/notebook/detail/d;->h:Ls/k;

    .line 747
    .line 748
    if-eqz v2, :cond_14

    .line 749
    .line 750
    invoke-virtual {v2}, Ls/k;->a()V

    .line 751
    .line 752
    .line 753
    :cond_14
    iget-object v2, v12, Lcom/zykj/mistake/feature/notebook/detail/d;->b:Lcom/zykj/mistake/widget/ResizableImageView;

    .line 754
    .line 755
    const/16 v19, 0x0

    .line 756
    .line 757
    const/16 v20, 0x0

    .line 758
    .line 759
    move/from16 v18, v1

    .line 760
    .line 761
    move-object/from16 v16, v2

    .line 762
    .line 763
    move-object/from16 v17, v11

    .line 764
    .line 765
    move-object v15, v12

    .line 766
    invoke-virtual/range {v15 .. v20}, Lcom/zykj/mistake/feature/notebook/detail/d;->b(Lcom/zykj/mistake/widget/ResizableImageView;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/b;Lcom/zykj/mistake/feature/notebook/detail/b;)Ls/k;

    .line 767
    .line 768
    .line 769
    move-result-object v1

    .line 770
    iput-object v1, v12, Lcom/zykj/mistake/feature/notebook/detail/d;->h:Ls/k;

    .line 771
    .line 772
    :cond_15
    return-object v7

    .line 773
    :pswitch_5
    check-cast v11, Lcom/zykj/mistake/feature/collection/list/v;

    .line 774
    .line 775
    check-cast v10, Lr6/c;

    .line 776
    .line 777
    check-cast v9, Lr6/c;

    .line 778
    .line 779
    move-object v12, v1

    .line 780
    check-cast v12, Landroidx/compose/foundation/lazy/grid/LazyGridScope;

    .line 781
    .line 782
    invoke-static {v12, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    iget-object v1, v11, Lcom/zykj/mistake/feature/collection/list/v;->c:Ljava/util/List;

    .line 786
    .line 787
    new-instance v2, Lcom/zykj/mistake/feature/collection/component/j;

    .line 788
    .line 789
    const/4 v3, 0x2

    .line 790
    invoke-direct {v2, v3}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 791
    .line 792
    .line 793
    sget-object v3, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$1;->INSTANCE:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$1;

    .line 794
    .line 795
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 796
    .line 797
    .line 798
    move-result v13

    .line 799
    new-instance v14, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$2;

    .line 800
    .line 801
    invoke-direct {v14, v2, v1}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$2;-><init>(Lr6/c;Ljava/util/List;)V

    .line 802
    .line 803
    .line 804
    new-instance v2, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$4;

    .line 805
    .line 806
    invoke-direct {v2, v3, v1}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$4;-><init>(Lr6/c;Ljava/util/List;)V

    .line 807
    .line 808
    .line 809
    new-instance v3, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;

    .line 810
    .line 811
    invoke-direct {v3, v1, v11, v10, v9}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;-><init>(Ljava/util/List;Lcom/zykj/mistake/feature/collection/list/v;Lr6/c;Lr6/c;)V

    .line 812
    .line 813
    .line 814
    invoke-static {v4, v8, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 815
    .line 816
    .line 817
    move-result-object v17

    .line 818
    const/4 v15, 0x0

    .line 819
    move-object/from16 v16, v2

    .line 820
    .line 821
    invoke-interface/range {v12 .. v17}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->items(ILr6/c;Lr6/e;Lr6/c;Lr6/g;)V

    .line 822
    .line 823
    .line 824
    return-object v7

    .line 825
    :pswitch_6
    check-cast v11, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 826
    .line 827
    check-cast v10, Lr6/c;

    .line 828
    .line 829
    check-cast v9, Lr6/c;

    .line 830
    .line 831
    check-cast v1, Lp4/b;

    .line 832
    .line 833
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 834
    .line 835
    .line 836
    iget-object v1, v1, Lp4/b;->a:Ljava/lang/String;

    .line 837
    .line 838
    iget-boolean v2, v11, Lcom/zykj/mistake/feature/collection/detail/z0;->G:Z

    .line 839
    .line 840
    if-eqz v2, :cond_16

    .line 841
    .line 842
    new-instance v2, Lcom/zykj/mistake/feature/collection/detail/v0;

    .line 843
    .line 844
    invoke-direct {v2, v1}, Lcom/zykj/mistake/feature/collection/detail/v0;-><init>(Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    invoke-interface {v10, v2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    goto :goto_8

    .line 851
    :cond_16
    invoke-interface {v9, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    :goto_8
    return-object v7

    .line 855
    :pswitch_7
    check-cast v11, Lcom/zykj/mistake/feature/ask/n;

    .line 856
    .line 857
    check-cast v9, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;

    .line 858
    .line 859
    check-cast v10, Lr6/c;

    .line 860
    .line 861
    move-object v12, v1

    .line 862
    check-cast v12, Landroidx/compose/foundation/lazy/grid/LazyGridScope;

    .line 863
    .line 864
    invoke-static {v12, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    iget-object v1, v11, Lcom/zykj/mistake/feature/ask/n;->e:Ljava/util/List;

    .line 868
    .line 869
    new-instance v2, Landroidx/navigation/a;

    .line 870
    .line 871
    const/16 v3, 0x1c

    .line 872
    .line 873
    invoke-direct {v2, v3}, Landroidx/navigation/a;-><init>(I)V

    .line 874
    .line 875
    .line 876
    sget-object v3, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$23$lambda$22$lambda$21$$inlined$items$default$1;->INSTANCE:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$23$lambda$22$lambda$21$$inlined$items$default$1;

    .line 877
    .line 878
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 879
    .line 880
    .line 881
    move-result v13

    .line 882
    new-instance v14, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$23$lambda$22$lambda$21$$inlined$items$default$2;

    .line 883
    .line 884
    invoke-direct {v14, v2, v1}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$23$lambda$22$lambda$21$$inlined$items$default$2;-><init>(Lr6/c;Ljava/util/List;)V

    .line 885
    .line 886
    .line 887
    new-instance v2, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$23$lambda$22$lambda$21$$inlined$items$default$4;

    .line 888
    .line 889
    invoke-direct {v2, v3, v1}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$23$lambda$22$lambda$21$$inlined$items$default$4;-><init>(Lr6/c;Ljava/util/List;)V

    .line 890
    .line 891
    .line 892
    new-instance v3, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$23$lambda$22$lambda$21$$inlined$items$default$5;

    .line 893
    .line 894
    invoke-direct {v3, v1, v11, v9, v10}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$23$lambda$22$lambda$21$$inlined$items$default$5;-><init>(Ljava/util/List;Lcom/zykj/mistake/feature/ask/n;Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Lr6/c;)V

    .line 895
    .line 896
    .line 897
    invoke-static {v4, v8, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 898
    .line 899
    .line 900
    move-result-object v17

    .line 901
    const/4 v15, 0x0

    .line 902
    move-object/from16 v16, v2

    .line 903
    .line 904
    invoke-interface/range {v12 .. v17}, Landroidx/compose/foundation/lazy/grid/LazyGridScope;->items(ILr6/c;Lr6/e;Lr6/c;Lr6/g;)V

    .line 905
    .line 906
    .line 907
    return-object v7

    .line 908
    :pswitch_8
    check-cast v10, Landroidx/navigation/Navigator;

    .line 909
    .line 910
    check-cast v11, Landroidx/navigation/NavOptions;

    .line 911
    .line 912
    check-cast v9, Landroidx/navigation/Navigator$Extras;

    .line 913
    .line 914
    check-cast v1, Landroidx/navigation/NavBackStackEntry;

    .line 915
    .line 916
    invoke-static {v10, v11, v9, v1}, Landroidx/navigation/Navigator;->b(Landroidx/navigation/Navigator;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;Landroidx/navigation/NavBackStackEntry;)Landroidx/navigation/NavBackStackEntry;

    .line 917
    .line 918
    .line 919
    move-result-object v1

    .line 920
    return-object v1

    .line 921
    :pswitch_9
    check-cast v11, Landroidx/lifecycle/LifecycleOwner;

    .line 922
    .line 923
    check-cast v9, Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;

    .line 924
    .line 925
    check-cast v10, Lr6/c;

    .line 926
    .line 927
    check-cast v1, Landroidx/compose/runtime/DisposableEffectScope;

    .line 928
    .line 929
    invoke-static {v11, v9, v10, v1}, Landroidx/lifecycle/compose/LifecycleEffectKt;->s(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lr6/c;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    .line 930
    .line 931
    .line 932
    move-result-object v1

    .line 933
    return-object v1

    .line 934
    :pswitch_a
    check-cast v11, Landroidx/lifecycle/LifecycleOwner;

    .line 935
    .line 936
    check-cast v9, Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;

    .line 937
    .line 938
    check-cast v10, Lr6/c;

    .line 939
    .line 940
    check-cast v1, Landroidx/compose/runtime/DisposableEffectScope;

    .line 941
    .line 942
    invoke-static {v11, v9, v10, v1}, Landroidx/lifecycle/compose/LifecycleEffectKt;->e(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;Lr6/c;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    .line 943
    .line 944
    .line 945
    move-result-object v1

    .line 946
    return-object v1

    .line 947
    :pswitch_b
    check-cast v10, Landroidx/lifecycle/LifecycleOwner;

    .line 948
    .line 949
    check-cast v11, Landroidx/lifecycle/Lifecycle$Event;

    .line 950
    .line 951
    check-cast v9, Landroidx/compose/runtime/State;

    .line 952
    .line 953
    check-cast v1, Landroidx/compose/runtime/DisposableEffectScope;

    .line 954
    .line 955
    invoke-static {v10, v11, v9, v1}, Landroidx/lifecycle/compose/LifecycleEffectKt;->c(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;Landroidx/compose/runtime/State;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    .line 956
    .line 957
    .line 958
    move-result-object v1

    .line 959
    return-object v1

    .line 960
    :pswitch_c
    check-cast v10, Lr6/c;

    .line 961
    .line 962
    check-cast v11, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 963
    .line 964
    check-cast v9, Landroidx/lifecycle/MediatorLiveData;

    .line 965
    .line 966
    invoke-static {v10, v11, v9, v1}, Landroidx/lifecycle/Transformations;->e(Lr6/c;Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/lifecycle/MediatorLiveData;Ljava/lang/Object;)Ld6/s;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    return-object v1

    .line 971
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
