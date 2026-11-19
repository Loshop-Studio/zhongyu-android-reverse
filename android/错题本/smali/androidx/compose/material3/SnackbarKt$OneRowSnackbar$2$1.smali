.class final Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SnackbarKt;->OneRowSnackbar-kKq0p4A(Lr6/e;Lr6/e;Lr6/e;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "measurables",
        "",
        "Landroidx/compose/ui/layout/Measurable;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "measure-3p2s80s",
        "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,450:1\n116#2,2:451\n33#2,6:453\n118#2:459\n116#2,2:460\n33#2,6:462\n118#2:468\n544#2,2:469\n33#2,6:471\n546#2:477\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$1\n*L\n342#1:451,2\n342#1:453,6\n342#1:459\n344#1:460,2\n344#1:462,6\n344#1:468\n355#1:469,2\n355#1:471,6\n355#1:477\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $actionTag:Ljava/lang/String;

.field final synthetic $dismissActionTag:Ljava/lang/String;

.field final synthetic $textTag:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$1;->$actionTag:Ljava/lang/String;

    iput-object p2, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$1;->$dismissActionTag:Ljava/lang/String;

    iput-object p3, p0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$1;->$textTag:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 21
    .param p1    # Landroidx/compose/ui/layout/MeasureScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-wide/from16 v3, p3

    .line 8
    .line 9
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    invoke-static {}, Landroidx/compose/material3/SnackbarKt;->access$getContainerMaxWidth$p()F

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    invoke-interface {v1, v6}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result v10

    .line 25
    iget-object v5, v0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$1;->$actionTag:Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    const/4 v7, 0x0

    .line 32
    :goto_0
    const/4 v8, 0x0

    .line 33
    if-ge v7, v6, :cond_1

    .line 34
    .line 35
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v9

    .line 39
    move-object v12, v9

    .line 40
    check-cast v12, Landroidx/compose/ui/layout/Measurable;

    .line 41
    .line 42
    invoke-static {v12}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v12

    .line 46
    invoke-static {v12, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v12

    .line 50
    if-eqz v12, :cond_0

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move-object v9, v8

    .line 57
    :goto_1
    check-cast v9, Landroidx/compose/ui/layout/Measurable;

    .line 58
    .line 59
    if-eqz v9, :cond_2

    .line 60
    .line 61
    invoke-interface {v9, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    move-object v12, v5

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    move-object v12, v8

    .line 68
    :goto_2
    iget-object v5, v0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$1;->$dismissActionTag:Ljava/lang/String;

    .line 69
    .line 70
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    const/4 v7, 0x0

    .line 75
    :goto_3
    if-ge v7, v6, :cond_4

    .line 76
    .line 77
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    move-object v13, v9

    .line 82
    check-cast v13, Landroidx/compose/ui/layout/Measurable;

    .line 83
    .line 84
    invoke-static {v13}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v13

    .line 88
    invoke-static {v13, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    if-eqz v13, :cond_3

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    move-object v9, v8

    .line 99
    :goto_4
    check-cast v9, Landroidx/compose/ui/layout/Measurable;

    .line 100
    .line 101
    if-eqz v9, :cond_5

    .line 102
    .line 103
    invoke-interface {v9, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    :cond_5
    move-object v15, v8

    .line 108
    if-eqz v12, :cond_6

    .line 109
    .line 110
    invoke-virtual {v12}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    move v13, v5

    .line 115
    goto :goto_5

    .line 116
    :cond_6
    const/4 v13, 0x0

    .line 117
    :goto_5
    if-eqz v12, :cond_7

    .line 118
    .line 119
    invoke-virtual {v12}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    move v14, v5

    .line 124
    goto :goto_6

    .line 125
    :cond_7
    const/4 v14, 0x0

    .line 126
    :goto_6
    if-eqz v15, :cond_8

    .line 127
    .line 128
    invoke-virtual {v15}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    move/from16 v16, v5

    .line 133
    .line 134
    goto :goto_7

    .line 135
    :cond_8
    const/16 v16, 0x0

    .line 136
    .line 137
    :goto_7
    if-eqz v15, :cond_9

    .line 138
    .line 139
    invoke-virtual {v15}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    goto :goto_8

    .line 144
    :cond_9
    const/4 v5, 0x0

    .line 145
    :goto_8
    if-nez v16, :cond_a

    .line 146
    .line 147
    invoke-static {}, Landroidx/compose/material3/SnackbarKt;->access$getTextEndExtraSpacing$p()F

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    invoke-interface {v1, v6}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    goto :goto_9

    .line 156
    :cond_a
    const/4 v6, 0x0

    .line 157
    :goto_9
    sub-int v7, v10, v13

    .line 158
    .line 159
    sub-int v7, v7, v16

    .line 160
    .line 161
    sub-int/2addr v7, v6

    .line 162
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-ge v7, v6, :cond_b

    .line 167
    .line 168
    move v7, v6

    .line 169
    :cond_b
    iget-object v6, v0, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$1;->$textTag:Ljava/lang/String;

    .line 170
    .line 171
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    const/4 v9, 0x0

    .line 176
    :goto_a
    if-ge v9, v8, :cond_13

    .line 177
    .line 178
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v17

    .line 182
    move-object/from16 v11, v17

    .line 183
    .line 184
    check-cast v11, Landroidx/compose/ui/layout/Measurable;

    .line 185
    .line 186
    invoke-static {v11}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_12

    .line 195
    .line 196
    const/16 v8, 0x9

    .line 197
    .line 198
    const/4 v9, 0x0

    .line 199
    const/4 v4, 0x0

    .line 200
    const/4 v6, 0x0

    .line 201
    move v0, v5

    .line 202
    move v5, v7

    .line 203
    const/4 v7, 0x0

    .line 204
    move-wide/from16 v2, p3

    .line 205
    .line 206
    invoke-static/range {v2 .. v9}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 207
    .line 208
    .line 209
    move-result-wide v2

    .line 210
    invoke-interface {v11, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-interface {v2, v3}, Landroidx/compose/ui/layout/Measured;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getLastBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-interface {v2, v4}, Landroidx/compose/ui/layout/Measured;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    const/high16 v5, -0x80000000

    .line 231
    .line 232
    const/4 v6, 0x1

    .line 233
    if-eq v3, v5, :cond_c

    .line 234
    .line 235
    if-eq v4, v5, :cond_c

    .line 236
    .line 237
    move v7, v6

    .line 238
    goto :goto_b

    .line 239
    :cond_c
    const/4 v7, 0x0

    .line 240
    :goto_b
    if-eq v3, v4, :cond_e

    .line 241
    .line 242
    if-nez v7, :cond_d

    .line 243
    .line 244
    goto :goto_c

    .line 245
    :cond_d
    const/4 v6, 0x0

    .line 246
    :cond_e
    :goto_c
    sub-int v16, v10, v16

    .line 247
    .line 248
    sub-int v19, v16, v13

    .line 249
    .line 250
    const/4 v4, 0x2

    .line 251
    if-eqz v6, :cond_10

    .line 252
    .line 253
    sget-object v6, Landroidx/compose/material3/tokens/SnackbarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SnackbarTokens;

    .line 254
    .line 255
    invoke-virtual {v6}, Landroidx/compose/material3/tokens/SnackbarTokens;->getSingleLineContainerHeight-D9Ej5fM()F

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    invoke-interface {v1, v6}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    invoke-static {v2, v0, v4}, Landroidx/collection/a;->g(Landroidx/compose/ui/layout/Placeable;II)I

    .line 272
    .line 273
    .line 274
    move-result v6

    .line 275
    if-eqz v12, :cond_f

    .line 276
    .line 277
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    .line 278
    .line 279
    .line 280
    move-result-object v7

    .line 281
    invoke-interface {v12, v7}, Landroidx/compose/ui/layout/Measured;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    .line 282
    .line 283
    .line 284
    move-result v7

    .line 285
    if-eq v7, v5, :cond_f

    .line 286
    .line 287
    add-int/2addr v3, v6

    .line 288
    sub-int/2addr v3, v7

    .line 289
    goto :goto_d

    .line 290
    :cond_f
    const/4 v3, 0x0

    .line 291
    :goto_d
    move/from16 v20, v3

    .line 292
    .line 293
    move v14, v6

    .line 294
    move v3, v0

    .line 295
    goto :goto_e

    .line 296
    :cond_10
    invoke-static {}, Landroidx/compose/material3/SnackbarKt;->access$getHeightToFirstLine$p()F

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    invoke-interface {v1, v0}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    sub-int v6, v0, v3

    .line 305
    .line 306
    sget-object v0, Landroidx/compose/material3/tokens/SnackbarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SnackbarTokens;

    .line 307
    .line 308
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/SnackbarTokens;->getTwoLinesContainerHeight-D9Ej5fM()F

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    invoke-interface {v1, v0}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    invoke-virtual {v2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    add-int/2addr v3, v6

    .line 321
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v12, :cond_f

    .line 326
    .line 327
    invoke-static {v12, v0, v4}, Landroidx/collection/a;->g(Landroidx/compose/ui/layout/Placeable;II)I

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    goto :goto_d

    .line 332
    :goto_e
    if-eqz v15, :cond_11

    .line 333
    .line 334
    invoke-static {v15, v3, v4}, Landroidx/collection/a;->g(Landroidx/compose/ui/layout/Placeable;II)I

    .line 335
    .line 336
    .line 337
    move-result v11

    .line 338
    move/from16 v17, v11

    .line 339
    .line 340
    goto :goto_f

    .line 341
    :cond_11
    const/16 v17, 0x0

    .line 342
    .line 343
    :goto_f
    new-instance v5, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$1$2;

    .line 344
    .line 345
    move-object v13, v2

    .line 346
    move-object/from16 v18, v12

    .line 347
    .line 348
    move-object v12, v5

    .line 349
    invoke-direct/range {v12 .. v20}, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$1$2;-><init>(Landroidx/compose/ui/layout/Placeable;ILandroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;II)V

    .line 350
    .line 351
    .line 352
    const/4 v6, 0x4

    .line 353
    const/4 v7, 0x0

    .line 354
    const/4 v4, 0x0

    .line 355
    move v2, v10

    .line 356
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    return-object v0

    .line 361
    :cond_12
    move v0, v5

    .line 362
    move v1, v10

    .line 363
    move-object v5, v12

    .line 364
    add-int/lit8 v9, v9, 0x1

    .line 365
    .line 366
    move-wide/from16 v3, p3

    .line 367
    .line 368
    move-object/from16 v1, p1

    .line 369
    .line 370
    move v5, v0

    .line 371
    move-object/from16 v0, p0

    .line 372
    .line 373
    goto/16 :goto_a

    .line 374
    .line 375
    :cond_13
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 376
    .line 377
    const-string v1, "Collection contains no element matching the predicate."

    .line 378
    .line 379
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    throw v0
.end method
