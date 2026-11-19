.class final Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SnackbarKt;->OneRowSnackbar-kKq0p4A(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $actionTag:Ljava/lang/String;

.field final synthetic $dismissActionTag:Ljava/lang/String;

.field final synthetic $textTag:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2;->$actionTag:Ljava/lang/String;

    iput-object p2, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2;->$dismissActionTag:Ljava/lang/String;

    iput-object p3, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2;->$textTag:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic maxIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/layout/e;->a(Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public synthetic maxIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/layout/e;->b(Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;J)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p3

    .line 6
    .line 7
    const-string v4, "$this$Layout"

    .line 8
    .line 9
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v4, "measurables"

    .line 13
    .line 14
    move-object/from16 v5, p2

    .line 15
    .line 16
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-static {}, Landroidx/compose/material3/SnackbarKt;->access$getContainerMaxWidth$p()F

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-interface {v1, v6}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    iget-object v4, v0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2;->$actionTag:Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const/4 v8, 0x0

    .line 46
    if-eqz v7, :cond_1

    .line 47
    .line 48
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    move-object v9, v7

    .line 53
    check-cast v9, Landroidx/compose/ui/layout/Measurable;

    .line 54
    .line 55
    invoke-static {v9}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    if-eqz v9, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    move-object v7, v8

    .line 67
    :goto_0
    check-cast v7, Landroidx/compose/ui/layout/Measurable;

    .line 68
    .line 69
    if-eqz v7, :cond_2

    .line 70
    .line 71
    invoke-interface {v7, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    move-object v15, v4

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    move-object v15, v8

    .line 78
    :goto_1
    iget-object v4, v0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2;->$dismissActionTag:Ljava/lang/String;

    .line 79
    .line 80
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_4

    .line 89
    .line 90
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    move-object v9, v7

    .line 95
    check-cast v9, Landroidx/compose/ui/layout/Measurable;

    .line 96
    .line 97
    invoke-static {v9}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    if-eqz v9, :cond_3

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    move-object v7, v8

    .line 109
    :goto_2
    check-cast v7, Landroidx/compose/ui/layout/Measurable;

    .line 110
    .line 111
    if-eqz v7, :cond_5

    .line 112
    .line 113
    invoke-interface {v7, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    :cond_5
    move-object v14, v8

    .line 118
    if-eqz v15, :cond_6

    .line 119
    .line 120
    invoke-virtual {v15}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    move v12, v4

    .line 125
    goto :goto_3

    .line 126
    :cond_6
    const/4 v12, 0x0

    .line 127
    :goto_3
    if-eqz v15, :cond_7

    .line 128
    .line 129
    invoke-virtual {v15}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    move v13, v4

    .line 134
    goto :goto_4

    .line 135
    :cond_7
    const/4 v13, 0x0

    .line 136
    :goto_4
    if-eqz v14, :cond_8

    .line 137
    .line 138
    invoke-virtual {v14}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    move/from16 v16, v4

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_8
    const/16 v16, 0x0

    .line 146
    .line 147
    :goto_5
    if-eqz v14, :cond_9

    .line 148
    .line 149
    invoke-virtual {v14}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    move v9, v4

    .line 154
    goto :goto_6

    .line 155
    :cond_9
    const/4 v9, 0x0

    .line 156
    :goto_6
    if-nez v16, :cond_a

    .line 157
    .line 158
    invoke-static {}, Landroidx/compose/material3/SnackbarKt;->access$getTextEndExtraSpacing$p()F

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    invoke-interface {v1, v4}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    goto :goto_7

    .line 167
    :cond_a
    const/4 v4, 0x0

    .line 168
    :goto_7
    sub-int v6, v10, v12

    .line 169
    .line 170
    sub-int v6, v6, v16

    .line 171
    .line 172
    sub-int/2addr v6, v4

    .line 173
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    invoke-static {v6, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    iget-object v4, v0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2;->$textTag:Ljava/lang/String;

    .line 182
    .line 183
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    if-eqz v7, :cond_15

    .line 192
    .line 193
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    move-object v8, v7

    .line 198
    check-cast v8, Landroidx/compose/ui/layout/Measurable;

    .line 199
    .line 200
    invoke-static {v8}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    if-eqz v7, :cond_14

    .line 209
    .line 210
    const/4 v4, 0x0

    .line 211
    const/4 v7, 0x0

    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    const/16 v18, 0x9

    .line 215
    .line 216
    const/16 v19, 0x0

    .line 217
    .line 218
    move-wide/from16 v2, p3

    .line 219
    .line 220
    move v5, v6

    .line 221
    move v6, v7

    .line 222
    move/from16 v7, v17

    .line 223
    .line 224
    move-object v11, v8

    .line 225
    move/from16 v8, v18

    .line 226
    .line 227
    move v0, v9

    .line 228
    move-object/from16 v9, v19

    .line 229
    .line 230
    invoke-static/range {v2 .. v9}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 231
    .line 232
    .line 233
    move-result-wide v2

    .line 234
    invoke-interface {v11, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-interface {v2, v3}, Landroidx/compose/ui/layout/Measured;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    const/4 v4, 0x1

    .line 247
    const/high16 v5, -0x80000000

    .line 248
    .line 249
    if-eq v3, v5, :cond_b

    .line 250
    .line 251
    move v6, v4

    .line 252
    goto :goto_9

    .line 253
    :cond_b
    const/4 v6, 0x0

    .line 254
    :goto_9
    const-string v7, "No baselines for text"

    .line 255
    .line 256
    if-eqz v6, :cond_13

    .line 257
    .line 258
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getLastBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    invoke-interface {v2, v6}, Landroidx/compose/ui/layout/Measured;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    .line 263
    .line 264
    .line 265
    move-result v6

    .line 266
    if-eq v6, v5, :cond_c

    .line 267
    .line 268
    move v8, v4

    .line 269
    goto :goto_a

    .line 270
    :cond_c
    const/4 v8, 0x0

    .line 271
    :goto_a
    if-eqz v8, :cond_12

    .line 272
    .line 273
    if-ne v3, v6, :cond_d

    .line 274
    .line 275
    goto :goto_b

    .line 276
    :cond_d
    const/4 v4, 0x0

    .line 277
    :goto_b
    sub-int v6, v10, v16

    .line 278
    .line 279
    sub-int v18, v6, v12

    .line 280
    .line 281
    if-eqz v4, :cond_f

    .line 282
    .line 283
    sget-object v4, Landroidx/compose/material3/tokens/SnackbarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SnackbarTokens;

    .line 284
    .line 285
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/SnackbarTokens;->getSingleLineContainerHeight-D9Ej5fM()F

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    invoke-interface {v1, v4}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    invoke-static {v13, v0}, Ljava/lang/Math;->max(II)I

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    invoke-virtual {v2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    sub-int v4, v0, v4

    .line 306
    .line 307
    div-int/lit8 v4, v4, 0x2

    .line 308
    .line 309
    if-eqz v15, :cond_e

    .line 310
    .line 311
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    .line 312
    .line 313
    .line 314
    move-result-object v7

    .line 315
    invoke-interface {v15, v7}, Landroidx/compose/ui/layout/Measured;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    .line 316
    .line 317
    .line 318
    move-result v7

    .line 319
    if-eq v7, v5, :cond_e

    .line 320
    .line 321
    add-int/2addr v3, v4

    .line 322
    sub-int/2addr v3, v7

    .line 323
    goto :goto_c

    .line 324
    :cond_e
    const/4 v3, 0x0

    .line 325
    :goto_c
    move/from16 v19, v3

    .line 326
    .line 327
    move v13, v4

    .line 328
    move v3, v0

    .line 329
    goto :goto_e

    .line 330
    :cond_f
    invoke-static {}, Landroidx/compose/material3/SnackbarKt;->access$getHeightToFirstLine$p()F

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    invoke-interface {v1, v0}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    sub-int/2addr v0, v3

    .line 339
    sget-object v3, Landroidx/compose/material3/tokens/SnackbarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SnackbarTokens;

    .line 340
    .line 341
    invoke-virtual {v3}, Landroidx/compose/material3/tokens/SnackbarTokens;->getTwoLinesContainerHeight-D9Ej5fM()F

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    invoke-interface {v1, v3}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    invoke-virtual {v2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    add-int/2addr v4, v0

    .line 354
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    if-eqz v15, :cond_10

    .line 359
    .line 360
    invoke-virtual {v15}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    sub-int v4, v3, v4

    .line 365
    .line 366
    div-int/lit8 v4, v4, 0x2

    .line 367
    .line 368
    goto :goto_d

    .line 369
    :cond_10
    const/4 v4, 0x0

    .line 370
    :goto_d
    move v13, v0

    .line 371
    move/from16 v19, v4

    .line 372
    .line 373
    :goto_e
    if-eqz v14, :cond_11

    .line 374
    .line 375
    invoke-virtual {v14}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    sub-int v0, v3, v0

    .line 380
    .line 381
    div-int/lit8 v0, v0, 0x2

    .line 382
    .line 383
    move/from16 v16, v0

    .line 384
    .line 385
    goto :goto_f

    .line 386
    :cond_11
    const/16 v16, 0x0

    .line 387
    .line 388
    :goto_f
    const/4 v4, 0x0

    .line 389
    new-instance v5, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$measure$4;

    .line 390
    .line 391
    move-object v11, v5

    .line 392
    move-object v12, v2

    .line 393
    move-object v8, v15

    .line 394
    move v15, v6

    .line 395
    move-object/from16 v17, v8

    .line 396
    .line 397
    invoke-direct/range {v11 .. v19}, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$measure$4;-><init>(Landroidx/compose/ui/layout/Placeable;ILandroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;II)V

    .line 398
    .line 399
    .line 400
    const/4 v6, 0x4

    .line 401
    const/4 v7, 0x0

    .line 402
    move-object/from16 v1, p1

    .line 403
    .line 404
    move v2, v10

    .line 405
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope$-CC;->p(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    return-object v0

    .line 410
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 411
    .line 412
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    throw v0

    .line 420
    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 421
    .line 422
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    throw v0

    .line 430
    :cond_14
    move-object/from16 v0, p0

    .line 431
    .line 432
    goto/16 :goto_8

    .line 433
    .line 434
    :cond_15
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 435
    .line 436
    const-string v1, "Collection contains no element matching the predicate."

    .line 437
    .line 438
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    throw v0
.end method

.method public synthetic minIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/layout/e;->c(Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public synthetic minIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/layout/e;->d(Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    move-result p1

    return p1
.end method
