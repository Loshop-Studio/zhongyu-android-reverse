.class public abstract Lcom/zykj/mistake/feature/ask/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final b:J

.field public static final c:J

.field public static final d:J

.field public static final e:J

.field public static final f:J

.field public static final g:J

.field public static final h:J

.field public static final i:J

.field public static final j:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, 0xff1989faL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    sput-wide v0, Lcom/zykj/mistake/feature/ask/o0;->a:J

    .line 11
    .line 12
    const-wide v0, 0xfff4f7faL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    sput-wide v0, Lcom/zykj/mistake/feature/ask/o0;->b:J

    .line 22
    .line 23
    const-wide v0, 0xffeaf4ffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    sput-wide v0, Lcom/zykj/mistake/feature/ask/o0;->c:J

    .line 33
    .line 34
    const-wide v0, 0xffe0e2e5L

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    sput-wide v0, Lcom/zykj/mistake/feature/ask/o0;->d:J

    .line 44
    .line 45
    const-wide v0, 0xff15171aL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    sput-wide v0, Lcom/zykj/mistake/feature/ask/o0;->e:J

    .line 55
    .line 56
    const-wide v0, 0xff666666L

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    sput-wide v0, Lcom/zykj/mistake/feature/ask/o0;->f:J

    .line 66
    .line 67
    const-wide v0, 0xfff5f5f5L

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    sput-wide v0, Lcom/zykj/mistake/feature/ask/o0;->g:J

    .line 77
    .line 78
    const-wide v0, 0xff999999L

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    sput-wide v0, Lcom/zykj/mistake/feature/ask/o0;->h:J

    .line 88
    .line 89
    const-wide v0, 0xff1576ffL

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    sput-wide v0, Lcom/zykj/mistake/feature/ask/o0;->i:J

    .line 99
    .line 100
    const-wide v0, 0xffff4d4fL

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 106
    .line 107
    .line 108
    move-result-wide v0

    .line 109
    sput-wide v0, Lcom/zykj/mistake/feature/ask/o0;->j:J

    .line 110
    .line 111
    return-void
.end method

.method public static final a(Lcom/zykj/mistake/feature/ask/z;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const v3, 0x6a715dca

    .line 8
    .line 9
    .line 10
    move-object/from16 v4, p2

    .line 11
    .line 12
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v9

    .line 16
    and-int/lit8 v4, v2, 0x6

    .line 17
    .line 18
    const/4 v13, 0x2

    .line 19
    if-nez v4, :cond_1

    .line 20
    .line 21
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    const/4 v4, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v4, v13

    .line 30
    :goto_0
    or-int/2addr v4, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v4, v2

    .line 33
    :goto_1
    and-int/lit8 v5, v2, 0x30

    .line 34
    .line 35
    const/16 v15, 0x20

    .line 36
    .line 37
    if-nez v5, :cond_3

    .line 38
    .line 39
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    move v5, v15

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v5, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v4, v5

    .line 50
    :cond_3
    and-int/lit8 v5, v4, 0x13

    .line 51
    .line 52
    const/16 v6, 0x12

    .line 53
    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v8, 0x1

    .line 56
    if-eq v5, v6, :cond_4

    .line 57
    .line 58
    move v5, v8

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move v5, v7

    .line 61
    :goto_3
    and-int/lit8 v10, v4, 0x1

    .line 62
    .line 63
    invoke-interface {v9, v5, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_10

    .line 68
    .line 69
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_5

    .line 74
    .line 75
    const/4 v5, -0x1

    .line 76
    const-string v10, "com.zykj.mistake.feature.ask.AskMaterialBottomBar (MistakeAskMaterialScreen.kt:438)"

    .line 77
    .line 78
    invoke-static {v3, v4, v5, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 82
    .line 83
    const/4 v5, 0x0

    .line 84
    const/4 v10, 0x0

    .line 85
    invoke-static {v3, v5, v8, v10}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    const/16 v10, 0x3a

    .line 90
    .line 91
    int-to-float v10, v10

    .line 92
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    invoke-static {v5, v10}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 97
    .line 98
    .line 99
    move-result-object v16

    .line 100
    sget-object v22, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 101
    .line 102
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 103
    .line 104
    .line 105
    move-result-wide v17

    .line 106
    const/16 v20, 0x2

    .line 107
    .line 108
    const/16 v21, 0x0

    .line 109
    .line 110
    const/16 v19, 0x0

    .line 111
    .line 112
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 113
    .line 114
    .line 115
    move-result-object v23

    .line 116
    int-to-float v5, v6

    .line 117
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 118
    .line 119
    .line 120
    move-result v26

    .line 121
    const/16 v28, 0xb

    .line 122
    .line 123
    const/16 v29, 0x0

    .line 124
    .line 125
    const/16 v24, 0x0

    .line 126
    .line 127
    const/16 v25, 0x0

    .line 128
    .line 129
    const/16 v27, 0x0

    .line 130
    .line 131
    invoke-static/range {v23 .. v29}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    sget-object v6, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 136
    .line 137
    invoke-virtual {v6}, Landroidx/compose/foundation/layout/Arrangement;->getEnd()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    sget-object v10, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 142
    .line 143
    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    const/16 v11, 0x36

    .line 148
    .line 149
    invoke-static {v6, v10, v9, v11}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    invoke-static {v9, v7}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    invoke-static {v9, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    sget-object v12, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 166
    .line 167
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 172
    .line 173
    .line 174
    move-result-object v16

    .line 175
    if-nez v16, :cond_6

    .line 176
    .line 177
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 178
    .line 179
    .line 180
    :cond_6
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 181
    .line 182
    .line 183
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 184
    .line 185
    .line 186
    move-result v16

    .line 187
    if-eqz v16, :cond_7

    .line 188
    .line 189
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 190
    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_7
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 194
    .line 195
    .line 196
    :goto_4
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    invoke-static {v12, v7, v6, v7, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 205
    .line 206
    .line 207
    move-result v11

    .line 208
    if-nez v11, :cond_8

    .line 209
    .line 210
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v14

    .line 218
    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v11

    .line 222
    if-nez v11, :cond_9

    .line 223
    .line 224
    :cond_8
    invoke-static {v10, v7, v10, v6}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 225
    .line 226
    .line 227
    :cond_9
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-static {v7, v5, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 232
    .line 233
    .line 234
    sget-object v5, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 235
    .line 236
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    const-wide v5, 0xffe4f0ffL

    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 245
    .line 246
    .line 247
    move-result-wide v5

    .line 248
    const-wide v10, 0xff666666L

    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 254
    .line 255
    .line 256
    move-result-wide v10

    .line 257
    and-int/lit8 v14, v4, 0x70

    .line 258
    .line 259
    if-ne v14, v15, :cond_a

    .line 260
    .line 261
    move v4, v8

    .line 262
    goto :goto_5

    .line 263
    :cond_a
    const/4 v4, 0x0

    .line 264
    :goto_5
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    if-nez v4, :cond_b

    .line 269
    .line 270
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 271
    .line 272
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    if-ne v7, v4, :cond_c

    .line 277
    .line 278
    :cond_b
    new-instance v7, Lcom/zykj/mistake/feature/ask/h0;

    .line 279
    .line 280
    invoke-direct {v7, v1, v8}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 281
    .line 282
    .line 283
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    :cond_c
    check-cast v7, Lr6/a;

    .line 287
    .line 288
    const/16 v4, 0xd86

    .line 289
    .line 290
    move v12, v8

    .line 291
    move-wide/from16 v30, v10

    .line 292
    .line 293
    move-object v11, v7

    .line 294
    move-wide/from16 v7, v30

    .line 295
    .line 296
    const-string v10, "\u53d6\u6d88"

    .line 297
    .line 298
    move/from16 v17, v12

    .line 299
    .line 300
    const/4 v12, 0x1

    .line 301
    move/from16 v18, v17

    .line 302
    .line 303
    const/16 v17, 0x0

    .line 304
    .line 305
    invoke-static/range {v4 .. v12}, Lcom/zykj/mistake/feature/ask/o0;->b(IJJLandroidx/compose/runtime/Composer;Ljava/lang/String;Lr6/a;Z)V

    .line 306
    .line 307
    .line 308
    const/16 v4, 0xc

    .line 309
    .line 310
    int-to-float v4, v4

    .line 311
    const/4 v5, 0x6

    .line 312
    invoke-static {v4, v3, v9, v5}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 316
    .line 317
    .line 318
    move-result-wide v7

    .line 319
    if-ne v14, v15, :cond_d

    .line 320
    .line 321
    move/from16 v17, v18

    .line 322
    .line 323
    :cond_d
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    if-nez v17, :cond_e

    .line 328
    .line 329
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 330
    .line 331
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    if-ne v3, v4, :cond_f

    .line 336
    .line 337
    :cond_e
    new-instance v3, Lcom/zykj/mistake/feature/ask/h0;

    .line 338
    .line 339
    invoke-direct {v3, v1, v13}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 340
    .line 341
    .line 342
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    :cond_f
    move-object v11, v3

    .line 346
    check-cast v11, Lr6/a;

    .line 347
    .line 348
    const/16 v4, 0xd80

    .line 349
    .line 350
    sget-wide v5, Lcom/zykj/mistake/feature/ask/o0;->a:J

    .line 351
    .line 352
    const-string v10, "\u786e\u8ba4"

    .line 353
    .line 354
    invoke-static/range {v4 .. v12}, Lcom/zykj/mistake/feature/ask/o0;->b(IJJLandroidx/compose/runtime/Composer;Ljava/lang/String;Lr6/a;Z)V

    .line 355
    .line 356
    .line 357
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 358
    .line 359
    .line 360
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 361
    .line 362
    .line 363
    move-result v3

    .line 364
    if-eqz v3, :cond_11

    .line 365
    .line 366
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 367
    .line 368
    .line 369
    goto :goto_6

    .line 370
    :cond_10
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 371
    .line 372
    .line 373
    :cond_11
    :goto_6
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    if-eqz v3, :cond_12

    .line 378
    .line 379
    new-instance v4, Lcom/zykj/mistake/feature/ask/d0;

    .line 380
    .line 381
    const/4 v5, 0x4

    .line 382
    invoke-direct {v4, v0, v1, v2, v5}, Lcom/zykj/mistake/feature/ask/d0;-><init>(Lcom/zykj/mistake/feature/ask/z;Lr6/c;II)V

    .line 383
    .line 384
    .line 385
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 386
    .line 387
    .line 388
    :cond_12
    return-void
.end method

.method public static final b(IJJLandroidx/compose/runtime/Composer;Ljava/lang/String;Lr6/a;Z)V
    .locals 34

    .line 1
    move/from16 v8, p0

    .line 2
    .line 3
    move-object/from16 v7, p7

    .line 4
    .line 5
    move/from16 v1, p8

    .line 6
    .line 7
    const v0, 0x12600beb

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p5

    .line 11
    .line 12
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v9

    .line 16
    and-int/lit8 v2, v8, 0x6

    .line 17
    .line 18
    const/4 v3, 0x4

    .line 19
    move-object/from16 v10, p6

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move v2, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v2, 0x2

    .line 32
    :goto_0
    or-int/2addr v2, v8

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v2, v8

    .line 35
    :goto_1
    and-int/lit8 v4, v8, 0x30

    .line 36
    .line 37
    if-nez v4, :cond_3

    .line 38
    .line 39
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    const/16 v4, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v4, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v2, v4

    .line 51
    :cond_3
    and-int/lit16 v4, v8, 0x180

    .line 52
    .line 53
    move-wide/from16 v11, p1

    .line 54
    .line 55
    if-nez v4, :cond_5

    .line 56
    .line 57
    invoke-interface {v9, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_4

    .line 62
    .line 63
    const/16 v4, 0x100

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/16 v4, 0x80

    .line 67
    .line 68
    :goto_3
    or-int/2addr v2, v4

    .line 69
    :cond_5
    and-int/lit16 v4, v8, 0xc00

    .line 70
    .line 71
    if-nez v4, :cond_7

    .line 72
    .line 73
    move-wide/from16 v4, p3

    .line 74
    .line 75
    invoke-interface {v9, v4, v5}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_6

    .line 80
    .line 81
    const/16 v6, 0x800

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_6
    const/16 v6, 0x400

    .line 85
    .line 86
    :goto_4
    or-int/2addr v2, v6

    .line 87
    goto :goto_5

    .line 88
    :cond_7
    move-wide/from16 v4, p3

    .line 89
    .line 90
    :goto_5
    and-int/lit16 v6, v8, 0x6000

    .line 91
    .line 92
    const/16 v13, 0x4000

    .line 93
    .line 94
    if-nez v6, :cond_9

    .line 95
    .line 96
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_8

    .line 101
    .line 102
    move v6, v13

    .line 103
    goto :goto_6

    .line 104
    :cond_8
    const/16 v6, 0x2000

    .line 105
    .line 106
    :goto_6
    or-int/2addr v2, v6

    .line 107
    :cond_9
    and-int/lit16 v6, v2, 0x2493

    .line 108
    .line 109
    const/16 v14, 0x2492

    .line 110
    .line 111
    const/4 v15, 0x1

    .line 112
    const/4 v5, 0x0

    .line 113
    if-eq v6, v14, :cond_a

    .line 114
    .line 115
    move v4, v15

    .line 116
    goto :goto_7

    .line 117
    :cond_a
    move v4, v5

    .line 118
    :goto_7
    and-int/lit8 v6, v2, 0x1

    .line 119
    .line 120
    invoke-interface {v9, v4, v6}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_14

    .line 125
    .line 126
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_b

    .line 131
    .line 132
    const/4 v4, -0x1

    .line 133
    const-string v6, "com.zykj.mistake.feature.ask.AskMaterialButton (MistakeAskMaterialScreen.kt:473)"

    .line 134
    .line 135
    invoke-static {v0, v2, v4, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_b
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 139
    .line 140
    const/16 v4, 0x65

    .line 141
    .line 142
    int-to-float v4, v4

    .line 143
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    const/16 v4, 0x24

    .line 152
    .line 153
    int-to-float v4, v4

    .line 154
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    int-to-float v3, v3

    .line 163
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    invoke-static {v3}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-static {v0, v3}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    if-eqz v1, :cond_c

    .line 176
    .line 177
    move-wide/from16 v17, v11

    .line 178
    .line 179
    move v3, v13

    .line 180
    move v4, v15

    .line 181
    goto :goto_8

    .line 182
    :cond_c
    const/16 v17, 0xe

    .line 183
    .line 184
    const/16 v18, 0x0

    .line 185
    .line 186
    move v3, v13

    .line 187
    const/high16 v13, 0x3f000000    # 0.5f

    .line 188
    .line 189
    const/4 v14, 0x0

    .line 190
    move v4, v15

    .line 191
    const/4 v15, 0x0

    .line 192
    const/16 v16, 0x0

    .line 193
    .line 194
    invoke-static/range {v11 .. v18}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 195
    .line 196
    .line 197
    move-result-wide v13

    .line 198
    move-wide/from16 v17, v13

    .line 199
    .line 200
    :goto_8
    const/16 v20, 0x2

    .line 201
    .line 202
    const/16 v21, 0x0

    .line 203
    .line 204
    const/16 v19, 0x0

    .line 205
    .line 206
    move-object/from16 v16, v0

    .line 207
    .line 208
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    const v6, 0xe000

    .line 213
    .line 214
    .line 215
    and-int/2addr v6, v2

    .line 216
    if-ne v6, v3, :cond_d

    .line 217
    .line 218
    move v15, v4

    .line 219
    goto :goto_9

    .line 220
    :cond_d
    move v15, v5

    .line 221
    :goto_9
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    if-nez v15, :cond_e

    .line 226
    .line 227
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 228
    .line 229
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    if-ne v3, v6, :cond_f

    .line 234
    .line 235
    :cond_e
    new-instance v3, Landroidx/navigation/internal/e;

    .line 236
    .line 237
    invoke-direct {v3, v7, v4}, Landroidx/navigation/internal/e;-><init>(Lr6/a;I)V

    .line 238
    .line 239
    .line 240
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    :cond_f
    move-object v4, v3

    .line 244
    check-cast v4, Lr6/a;

    .line 245
    .line 246
    move v3, v5

    .line 247
    const/4 v5, 0x6

    .line 248
    const/4 v6, 0x0

    .line 249
    move v11, v2

    .line 250
    const/4 v2, 0x0

    .line 251
    move v12, v3

    .line 252
    const/4 v3, 0x0

    .line 253
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 258
    .line 259
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-static {v9, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    invoke-static {v9, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    sget-object v4, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 280
    .line 281
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 286
    .line 287
    .line 288
    move-result-object v6

    .line 289
    if-nez v6, :cond_10

    .line 290
    .line 291
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 292
    .line 293
    .line 294
    :cond_10
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 295
    .line 296
    .line 297
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 298
    .line 299
    .line 300
    move-result v6

    .line 301
    if-eqz v6, :cond_11

    .line 302
    .line 303
    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 304
    .line 305
    .line 306
    goto :goto_a

    .line 307
    :cond_11
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 308
    .line 309
    .line 310
    :goto_a
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    invoke-static {v4, v5, v1, v5, v3}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    if-nez v3, :cond_12

    .line 323
    .line 324
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    if-nez v3, :cond_13

    .line 337
    .line 338
    :cond_12
    invoke-static {v2, v5, v2, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 339
    .line 340
    .line 341
    :cond_13
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-static {v5, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 346
    .line 347
    .line 348
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 349
    .line 350
    const/16 v0, 0xe

    .line 351
    .line 352
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 353
    .line 354
    .line 355
    move-result-wide v13

    .line 356
    and-int/lit8 v0, v11, 0xe

    .line 357
    .line 358
    or-int/lit16 v0, v0, 0xc00

    .line 359
    .line 360
    shr-int/lit8 v1, v11, 0x3

    .line 361
    .line 362
    and-int/lit16 v1, v1, 0x380

    .line 363
    .line 364
    or-int v31, v0, v1

    .line 365
    .line 366
    const/16 v32, 0x0

    .line 367
    .line 368
    const v33, 0x1fff2

    .line 369
    .line 370
    .line 371
    const/4 v10, 0x0

    .line 372
    const/4 v15, 0x0

    .line 373
    const/16 v16, 0x0

    .line 374
    .line 375
    const/16 v17, 0x0

    .line 376
    .line 377
    const-wide/16 v18, 0x0

    .line 378
    .line 379
    const/16 v20, 0x0

    .line 380
    .line 381
    const/16 v21, 0x0

    .line 382
    .line 383
    const-wide/16 v22, 0x0

    .line 384
    .line 385
    const/16 v24, 0x0

    .line 386
    .line 387
    const/16 v25, 0x0

    .line 388
    .line 389
    const/16 v26, 0x0

    .line 390
    .line 391
    const/16 v27, 0x0

    .line 392
    .line 393
    const/16 v28, 0x0

    .line 394
    .line 395
    const/16 v29, 0x0

    .line 396
    .line 397
    move-wide/from16 v11, p3

    .line 398
    .line 399
    move-object/from16 v30, v9

    .line 400
    .line 401
    move-object/from16 v9, p6

    .line 402
    .line 403
    invoke-static/range {v9 .. v33}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 404
    .line 405
    .line 406
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 407
    .line 408
    .line 409
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-eqz v0, :cond_15

    .line 414
    .line 415
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 416
    .line 417
    .line 418
    goto :goto_b

    .line 419
    :cond_14
    move-object/from16 v30, v9

    .line 420
    .line 421
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 422
    .line 423
    .line 424
    :cond_15
    :goto_b
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 425
    .line 426
    .line 427
    move-result-object v9

    .line 428
    if-eqz v9, :cond_16

    .line 429
    .line 430
    new-instance v0, Lcom/zykj/mistake/feature/ask/e0;

    .line 431
    .line 432
    move-wide/from16 v3, p1

    .line 433
    .line 434
    move-wide/from16 v5, p3

    .line 435
    .line 436
    move-object/from16 v1, p6

    .line 437
    .line 438
    move/from16 v2, p8

    .line 439
    .line 440
    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/feature/ask/e0;-><init>(Ljava/lang/String;ZJJLr6/a;I)V

    .line 441
    .line 442
    .line 443
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 444
    .line 445
    .line 446
    :cond_16
    return-void
.end method

.method public static final c(Lcom/zykj/mistake/feature/ask/z;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const v3, 0x57f44899

    .line 8
    .line 9
    .line 10
    move-object/from16 v4, p2

    .line 11
    .line 12
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v8

    .line 16
    and-int/lit8 v4, v2, 0x6

    .line 17
    .line 18
    const/4 v6, 0x2

    .line 19
    if-nez v4, :cond_1

    .line 20
    .line 21
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    const/4 v4, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v4, v6

    .line 30
    :goto_0
    or-int/2addr v4, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v4, v2

    .line 33
    :goto_1
    and-int/lit8 v7, v2, 0x30

    .line 34
    .line 35
    if-nez v7, :cond_3

    .line 36
    .line 37
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_2

    .line 42
    .line 43
    const/16 v7, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v7, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v4, v7

    .line 49
    :cond_3
    and-int/lit8 v7, v4, 0x13

    .line 50
    .line 51
    const/16 v10, 0x12

    .line 52
    .line 53
    const/4 v11, 0x0

    .line 54
    const/4 v12, 0x1

    .line 55
    if-eq v7, v10, :cond_4

    .line 56
    .line 57
    move v7, v12

    .line 58
    goto :goto_3

    .line 59
    :cond_4
    move v7, v11

    .line 60
    :goto_3
    and-int/lit8 v13, v4, 0x1

    .line 61
    .line 62
    invoke-interface {v8, v7, v13}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_17

    .line 67
    .line 68
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-eqz v7, :cond_5

    .line 73
    .line 74
    const/4 v7, -0x1

    .line 75
    const-string v13, "com.zykj.mistake.feature.ask.AskMaterialContent (MistakeAskMaterialScreen.kt:170)"

    .line 76
    .line 77
    invoke-static {v3, v4, v7, v13}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :cond_5
    iget-object v3, v0, Lcom/zykj/mistake/feature/ask/z;->a:Ljava/util/List;

    .line 81
    .line 82
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    const/4 v13, 0x0

    .line 91
    if-eqz v7, :cond_7

    .line 92
    .line 93
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    move-object v14, v7

    .line 98
    check-cast v14, Lcom/zykj/mistake/feature/ask/n;

    .line 99
    .line 100
    iget-object v14, v14, Lcom/zykj/mistake/feature/ask/n;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 101
    .line 102
    iget-object v15, v0, Lcom/zykj/mistake/feature/ask/z;->b:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 103
    .line 104
    if-ne v14, v15, :cond_6

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_7
    move-object v7, v13

    .line 108
    :goto_4
    check-cast v7, Lcom/zykj/mistake/feature/ask/n;

    .line 109
    .line 110
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 111
    .line 112
    const/4 v14, 0x0

    .line 113
    invoke-static {v3, v14, v12, v13}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 114
    .line 115
    .line 116
    move-result-object v15

    .line 117
    const/16 v19, 0x2

    .line 118
    .line 119
    const/16 v20, 0x0

    .line 120
    .line 121
    sget-wide v16, Lcom/zykj/mistake/feature/ask/o0;->b:J

    .line 122
    .line 123
    const/16 v18, 0x0

    .line 124
    .line 125
    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 126
    .line 127
    .line 128
    move-result-object v15

    .line 129
    int-to-float v10, v10

    .line 130
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    invoke-static {v15, v10}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    sget-object v15, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 139
    .line 140
    invoke-virtual {v15}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 141
    .line 142
    .line 143
    move-result-object v15

    .line 144
    invoke-static {v15, v11}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 145
    .line 146
    .line 147
    move-result-object v15

    .line 148
    invoke-static {v8, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 153
    .line 154
    .line 155
    move-result-object v11

    .line 156
    invoke-static {v8, v10}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 161
    .line 162
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 167
    .line 168
    .line 169
    move-result-object v19

    .line 170
    if-nez v19, :cond_8

    .line 171
    .line 172
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 173
    .line 174
    .line 175
    :cond_8
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 176
    .line 177
    .line 178
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 179
    .line 180
    .line 181
    move-result v19

    .line 182
    if-eqz v19, :cond_9

    .line 183
    .line 184
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 185
    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_9
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 189
    .line 190
    .line 191
    :goto_5
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-static {v14, v5, v15, v5, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 200
    .line 201
    .line 202
    move-result v15

    .line 203
    if-nez v15, :cond_a

    .line 204
    .line 205
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v15

    .line 209
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    invoke-static {v15, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    if-nez v9, :cond_b

    .line 218
    .line 219
    :cond_a
    invoke-static {v13, v5, v13, v11}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 220
    .line 221
    .line 222
    :cond_b
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 223
    .line 224
    .line 225
    move-result-object v9

    .line 226
    invoke-static {v5, v10, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 227
    .line 228
    .line 229
    sget-object v5, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 230
    .line 231
    const v5, 0x633c682d

    .line 232
    .line 233
    .line 234
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 235
    .line 236
    .line 237
    if-nez v7, :cond_c

    .line 238
    .line 239
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 240
    .line 241
    .line 242
    move-object v15, v8

    .line 243
    move v11, v12

    .line 244
    goto/16 :goto_a

    .line 245
    .line 246
    :cond_c
    iget-object v5, v7, Lcom/zykj/mistake/feature/ask/n;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 247
    .line 248
    sget-object v9, Lcom/zykj/mistake/feature/ask/n0;->a:[I

    .line 249
    .line 250
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    aget v5, v9, v5

    .line 255
    .line 256
    if-eq v5, v12, :cond_12

    .line 257
    .line 258
    const/16 v9, 0x36

    .line 259
    .line 260
    if-eq v5, v6, :cond_11

    .line 261
    .line 262
    const/4 v10, 0x3

    .line 263
    if-eq v5, v10, :cond_10

    .line 264
    .line 265
    const v3, 0x636687ef

    .line 266
    .line 267
    .line 268
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 269
    .line 270
    .line 271
    move v5, v4

    .line 272
    new-instance v4, Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;

    .line 273
    .line 274
    invoke-direct {v4, v6}, Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;-><init>(I)V

    .line 275
    .line 276
    .line 277
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 278
    .line 279
    const/16 v6, 0xc

    .line 280
    .line 281
    int-to-float v6, v6

    .line 282
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 283
    .line 284
    .line 285
    move-result v9

    .line 286
    invoke-virtual {v3, v9}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 287
    .line 288
    .line 289
    move-result-object v10

    .line 290
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    invoke-virtual {v3, v6}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 295
    .line 296
    .line 297
    move-result-object v9

    .line 298
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    and-int/lit8 v5, v5, 0x70

    .line 303
    .line 304
    const/16 v6, 0x20

    .line 305
    .line 306
    if-ne v5, v6, :cond_d

    .line 307
    .line 308
    move v11, v12

    .line 309
    goto :goto_6

    .line 310
    :cond_d
    const/4 v11, 0x0

    .line 311
    :goto_6
    or-int/2addr v3, v11

    .line 312
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    if-nez v3, :cond_e

    .line 317
    .line 318
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 319
    .line 320
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    if-ne v5, v3, :cond_f

    .line 325
    .line 326
    :cond_e
    new-instance v5, Landroidx/navigation/d;

    .line 327
    .line 328
    const/4 v3, 0x4

    .line 329
    invoke-direct {v5, v3, v7, v1}, Landroidx/navigation/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    :cond_f
    move-object v14, v5

    .line 336
    check-cast v14, Lr6/c;

    .line 337
    .line 338
    const/16 v17, 0x0

    .line 339
    .line 340
    const/16 v18, 0x39e

    .line 341
    .line 342
    const/4 v5, 0x0

    .line 343
    const/4 v6, 0x0

    .line 344
    const/4 v7, 0x0

    .line 345
    move-object v15, v8

    .line 346
    const/4 v8, 0x0

    .line 347
    const/4 v11, 0x0

    .line 348
    move v3, v12

    .line 349
    const/4 v12, 0x0

    .line 350
    const/4 v13, 0x0

    .line 351
    const/high16 v16, 0x1b0000

    .line 352
    .line 353
    invoke-static/range {v4 .. v18}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt;->LazyVerticalGrid(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;III)V

    .line 354
    .line 355
    .line 356
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 357
    .line 358
    .line 359
    move v11, v3

    .line 360
    goto/16 :goto_9

    .line 361
    .line 362
    :cond_10
    move-object v15, v8

    .line 363
    move v11, v12

    .line 364
    const v4, 0x635696f4

    .line 365
    .line 366
    .line 367
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 368
    .line 369
    .line 370
    const/4 v4, 0x0

    .line 371
    const/4 v5, 0x0

    .line 372
    invoke-static {v3, v4, v11, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    new-instance v3, Lcom/zykj/mistake/feature/ask/l0;

    .line 377
    .line 378
    invoke-direct {v3, v7, v1, v11}, Lcom/zykj/mistake/feature/ask/l0;-><init>(Lcom/zykj/mistake/feature/ask/n;Lr6/c;I)V

    .line 379
    .line 380
    .line 381
    const v5, -0x37d5d04b

    .line 382
    .line 383
    .line 384
    invoke-static {v5, v11, v3, v15, v9}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 385
    .line 386
    .line 387
    move-result-object v7

    .line 388
    const/16 v9, 0xc06

    .line 389
    .line 390
    const/4 v10, 0x6

    .line 391
    const/4 v5, 0x0

    .line 392
    const/4 v6, 0x0

    .line 393
    invoke-static/range {v4 .. v10}, Landroidx/compose/foundation/layout/BoxWithConstraintsKt;->BoxWithConstraints(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLr6/f;Landroidx/compose/runtime/Composer;II)V

    .line 394
    .line 395
    .line 396
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 397
    .line 398
    .line 399
    goto/16 :goto_9

    .line 400
    .line 401
    :cond_11
    move-object v15, v8

    .line 402
    move v11, v12

    .line 403
    const v4, 0x6346ba32

    .line 404
    .line 405
    .line 406
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 407
    .line 408
    .line 409
    const/4 v4, 0x0

    .line 410
    const/4 v5, 0x0

    .line 411
    invoke-static {v3, v4, v11, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    new-instance v3, Lcom/zykj/mistake/feature/ask/l0;

    .line 416
    .line 417
    const/4 v6, 0x0

    .line 418
    invoke-direct {v3, v7, v1, v6}, Lcom/zykj/mistake/feature/ask/l0;-><init>(Lcom/zykj/mistake/feature/ask/n;Lr6/c;I)V

    .line 419
    .line 420
    .line 421
    const v5, -0x48d4a46a

    .line 422
    .line 423
    .line 424
    invoke-static {v5, v11, v3, v15, v9}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 425
    .line 426
    .line 427
    move-result-object v7

    .line 428
    const/16 v9, 0xc06

    .line 429
    .line 430
    const/4 v10, 0x6

    .line 431
    const/4 v5, 0x0

    .line 432
    const/4 v6, 0x0

    .line 433
    invoke-static/range {v4 .. v10}, Landroidx/compose/foundation/layout/BoxWithConstraintsKt;->BoxWithConstraints(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLr6/f;Landroidx/compose/runtime/Composer;II)V

    .line 434
    .line 435
    .line 436
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 437
    .line 438
    .line 439
    goto/16 :goto_9

    .line 440
    .line 441
    :cond_12
    move v5, v4

    .line 442
    move-object v15, v8

    .line 443
    move v11, v12

    .line 444
    const/4 v6, 0x0

    .line 445
    const v4, 0x633ccebd

    .line 446
    .line 447
    .line 448
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 449
    .line 450
    .line 451
    iget-object v4, v7, Lcom/zykj/mistake/feature/ask/n;->e:Ljava/util/List;

    .line 452
    .line 453
    invoke-static {v4}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    check-cast v4, Lcom/zykj/mistake/feature/ask/y;

    .line 458
    .line 459
    if-nez v4, :cond_13

    .line 460
    .line 461
    const v3, 0x633d75f7

    .line 462
    .line 463
    .line 464
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 465
    .line 466
    .line 467
    :goto_7
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 468
    .line 469
    .line 470
    goto :goto_8

    .line 471
    :cond_13
    const v8, 0x633d75f8

    .line 472
    .line 473
    .line 474
    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 475
    .line 476
    .line 477
    iget-object v8, v7, Lcom/zykj/mistake/feature/ask/n;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 478
    .line 479
    const/4 v9, 0x0

    .line 480
    const/4 v10, 0x0

    .line 481
    invoke-static {v3, v9, v11, v10}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 482
    .line 483
    .line 484
    move-result-object v3

    .line 485
    const v9, 0x3f6b851f    # 0.92f

    .line 486
    .line 487
    .line 488
    invoke-static {v3, v9}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 489
    .line 490
    .line 491
    move-result-object v3

    .line 492
    and-int/lit8 v5, v5, 0x70

    .line 493
    .line 494
    const/16 v9, 0x20

    .line 495
    .line 496
    if-ne v5, v9, :cond_14

    .line 497
    .line 498
    move v6, v11

    .line 499
    :cond_14
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    move-result v5

    .line 503
    or-int/2addr v5, v6

    .line 504
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v6

    .line 508
    or-int/2addr v5, v6

    .line 509
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v6

    .line 513
    if-nez v5, :cond_15

    .line 514
    .line 515
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 516
    .line 517
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v5

    .line 521
    if-ne v6, v5, :cond_16

    .line 522
    .line 523
    :cond_15
    new-instance v6, Landroidx/lifecycle/compose/a;

    .line 524
    .line 525
    invoke-direct {v6, v1, v7, v11, v4}, Landroidx/lifecycle/compose/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    :cond_16
    check-cast v6, Lr6/a;

    .line 532
    .line 533
    const/16 v10, 0xd80

    .line 534
    .line 535
    const/4 v7, 0x0

    .line 536
    move-object v5, v4

    .line 537
    move-object v4, v8

    .line 538
    move-object v9, v15

    .line 539
    move-object v8, v6

    .line 540
    move-object v6, v3

    .line 541
    invoke-static/range {v4 .. v10}, Lcom/zykj/mistake/feature/ask/o0;->e(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Lcom/zykj/mistake/feature/ask/y;Landroidx/compose/ui/Modifier;ZLr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 542
    .line 543
    .line 544
    goto :goto_7

    .line 545
    :goto_8
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 546
    .line 547
    .line 548
    :goto_9
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 549
    .line 550
    .line 551
    :goto_a
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 552
    .line 553
    .line 554
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 555
    .line 556
    .line 557
    move-result v3

    .line 558
    if-eqz v3, :cond_18

    .line 559
    .line 560
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 561
    .line 562
    .line 563
    goto :goto_b

    .line 564
    :cond_17
    move-object v15, v8

    .line 565
    move v11, v12

    .line 566
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 567
    .line 568
    .line 569
    :cond_18
    :goto_b
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 570
    .line 571
    .line 572
    move-result-object v3

    .line 573
    if-eqz v3, :cond_19

    .line 574
    .line 575
    new-instance v4, Lcom/zykj/mistake/feature/ask/d0;

    .line 576
    .line 577
    invoke-direct {v4, v0, v1, v2, v11}, Lcom/zykj/mistake/feature/ask/d0;-><init>(Lcom/zykj/mistake/feature/ask/z;Lr6/c;II)V

    .line 578
    .line 579
    .line 580
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 581
    .line 582
    .line 583
    :cond_19
    return-void
.end method

.method public static final d(Lcom/zykj/mistake/feature/ask/z;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const v3, 0x3d55b855

    .line 8
    .line 9
    .line 10
    move-object/from16 v4, p2

    .line 11
    .line 12
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    and-int/lit8 v5, v2, 0x6

    .line 17
    .line 18
    const/4 v6, 0x2

    .line 19
    if-nez v5, :cond_1

    .line 20
    .line 21
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    const/4 v5, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v5, v6

    .line 30
    :goto_0
    or-int/2addr v5, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v5, v2

    .line 33
    :goto_1
    and-int/lit8 v7, v2, 0x30

    .line 34
    .line 35
    const/16 v8, 0x10

    .line 36
    .line 37
    if-nez v7, :cond_3

    .line 38
    .line 39
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_2

    .line 44
    .line 45
    const/16 v7, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    move v7, v8

    .line 49
    :goto_2
    or-int/2addr v5, v7

    .line 50
    :cond_3
    and-int/lit8 v7, v5, 0x13

    .line 51
    .line 52
    const/16 v10, 0x12

    .line 53
    .line 54
    const/4 v11, 0x0

    .line 55
    const/4 v12, 0x1

    .line 56
    if-eq v7, v10, :cond_4

    .line 57
    .line 58
    move v7, v12

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move v7, v11

    .line 61
    :goto_3
    and-int/lit8 v13, v5, 0x1

    .line 62
    .line 63
    invoke-interface {v4, v7, v13}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_16

    .line 68
    .line 69
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_5

    .line 74
    .line 75
    const/4 v7, -0x1

    .line 76
    const-string v13, "com.zykj.mistake.feature.ask.AskMaterialGroupList (MistakeAskMaterialScreen.kt:117)"

    .line 77
    .line 78
    invoke-static {v3, v5, v7, v13}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 82
    .line 83
    const/16 v7, 0xe6

    .line 84
    .line 85
    int-to-float v7, v7

    .line 86
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    const/4 v7, 0x0

    .line 95
    const/4 v13, 0x0

    .line 96
    invoke-static {v3, v7, v12, v13}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 97
    .line 98
    .line 99
    move-result-object v14

    .line 100
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 101
    .line 102
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 103
    .line 104
    .line 105
    move-result-wide v15

    .line 106
    const/16 v18, 0x2

    .line 107
    .line 108
    const/16 v19, 0x0

    .line 109
    .line 110
    const/16 v17, 0x0

    .line 111
    .line 112
    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 113
    .line 114
    .line 115
    move-result-object v20

    .line 116
    int-to-float v3, v10

    .line 117
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 118
    .line 119
    .line 120
    move-result v22

    .line 121
    const/16 v3, 0x16

    .line 122
    .line 123
    int-to-float v3, v3

    .line 124
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 125
    .line 126
    .line 127
    move-result v21

    .line 128
    int-to-float v3, v8

    .line 129
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 130
    .line 131
    .line 132
    move-result v23

    .line 133
    const/16 v25, 0x8

    .line 134
    .line 135
    const/16 v26, 0x0

    .line 136
    .line 137
    const/16 v24, 0x0

    .line 138
    .line 139
    invoke-static/range {v20 .. v26}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    sget-object v8, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 144
    .line 145
    const/16 v10, 0xc

    .line 146
    .line 147
    int-to-float v14, v10

    .line 148
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 149
    .line 150
    .line 151
    move-result v14

    .line 152
    invoke-virtual {v8, v14}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    sget-object v14, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 157
    .line 158
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 159
    .line 160
    .line 161
    move-result-object v14

    .line 162
    const/4 v15, 0x6

    .line 163
    invoke-static {v8, v14, v4, v15}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    invoke-static {v4, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 168
    .line 169
    .line 170
    move-result v14

    .line 171
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    invoke-static {v4, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 180
    .line 181
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 182
    .line 183
    .line 184
    move-result-object v11

    .line 185
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 186
    .line 187
    .line 188
    move-result-object v18

    .line 189
    if-nez v18, :cond_6

    .line 190
    .line 191
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 192
    .line 193
    .line 194
    :cond_6
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 195
    .line 196
    .line 197
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 198
    .line 199
    .line 200
    move-result v18

    .line 201
    if-eqz v18, :cond_7

    .line 202
    .line 203
    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 204
    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_7
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 208
    .line 209
    .line 210
    :goto_4
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    invoke-static {v15, v11, v8, v11, v10}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 215
    .line 216
    .line 217
    move-result-object v8

    .line 218
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 219
    .line 220
    .line 221
    move-result v10

    .line 222
    if-nez v10, :cond_8

    .line 223
    .line 224
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v9

    .line 236
    if-nez v9, :cond_9

    .line 237
    .line 238
    :cond_8
    invoke-static {v14, v11, v14, v8}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 239
    .line 240
    .line 241
    :cond_9
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    invoke-static {v11, v3, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 246
    .line 247
    .line 248
    sget-object v3, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 249
    .line 250
    const v3, -0x69d0f9f0

    .line 251
    .line 252
    .line 253
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 254
    .line 255
    .line 256
    iget-object v3, v0, Lcom/zykj/mistake/feature/ask/z;->a:Ljava/util/List;

    .line 257
    .line 258
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result v8

    .line 266
    if-eqz v8, :cond_15

    .line 267
    .line 268
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    check-cast v8, Lcom/zykj/mistake/feature/ask/n;

    .line 273
    .line 274
    iget-object v9, v8, Lcom/zykj/mistake/feature/ask/n;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 275
    .line 276
    iget-object v10, v0, Lcom/zykj/mistake/feature/ask/z;->b:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 277
    .line 278
    if-ne v9, v10, :cond_a

    .line 279
    .line 280
    move v9, v12

    .line 281
    goto :goto_6

    .line 282
    :cond_a
    const/4 v9, 0x0

    .line 283
    :goto_6
    sget-object v10, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 284
    .line 285
    invoke-static {v10, v7, v12, v13}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 286
    .line 287
    .line 288
    move-result-object v11

    .line 289
    const/16 v14, 0x28

    .line 290
    .line 291
    int-to-float v14, v14

    .line 292
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 293
    .line 294
    .line 295
    move-result v14

    .line 296
    invoke-static {v11, v14}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 297
    .line 298
    .line 299
    move-result-object v11

    .line 300
    int-to-float v14, v6

    .line 301
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 302
    .line 303
    .line 304
    move-result v14

    .line 305
    invoke-static {v14}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 306
    .line 307
    .line 308
    move-result-object v14

    .line 309
    invoke-static {v11, v14}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 310
    .line 311
    .line 312
    move-result-object v19

    .line 313
    if-eqz v9, :cond_b

    .line 314
    .line 315
    sget-wide v14, Lcom/zykj/mistake/feature/ask/o0;->c:J

    .line 316
    .line 317
    :goto_7
    move-wide/from16 v20, v14

    .line 318
    .line 319
    goto :goto_8

    .line 320
    :cond_b
    sget-object v11, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 321
    .line 322
    invoke-virtual {v11}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 323
    .line 324
    .line 325
    move-result-wide v14

    .line 326
    goto :goto_7

    .line 327
    :goto_8
    const/16 v23, 0x2

    .line 328
    .line 329
    const/16 v24, 0x0

    .line 330
    .line 331
    const/16 v22, 0x0

    .line 332
    .line 333
    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 334
    .line 335
    .line 336
    move-result-object v25

    .line 337
    and-int/lit8 v11, v5, 0x70

    .line 338
    .line 339
    const/16 v14, 0x20

    .line 340
    .line 341
    if-ne v11, v14, :cond_c

    .line 342
    .line 343
    move v11, v12

    .line 344
    goto :goto_9

    .line 345
    :cond_c
    const/4 v11, 0x0

    .line 346
    :goto_9
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v15

    .line 350
    or-int/2addr v11, v15

    .line 351
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v15

    .line 355
    if-nez v11, :cond_d

    .line 356
    .line 357
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 358
    .line 359
    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v11

    .line 363
    if-ne v15, v11, :cond_e

    .line 364
    .line 365
    :cond_d
    new-instance v15, Landroidx/navigation/e;

    .line 366
    .line 367
    const/4 v11, 0x3

    .line 368
    invoke-direct {v15, v11, v1, v8}, Landroidx/navigation/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    :cond_e
    move-object/from16 v29, v15

    .line 375
    .line 376
    check-cast v29, Lr6/a;

    .line 377
    .line 378
    const/16 v30, 0x7

    .line 379
    .line 380
    const/16 v31, 0x0

    .line 381
    .line 382
    const/16 v26, 0x0

    .line 383
    .line 384
    const/16 v27, 0x0

    .line 385
    .line 386
    const/16 v28, 0x0

    .line 387
    .line 388
    invoke-static/range {v25 .. v31}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 389
    .line 390
    .line 391
    move-result-object v11

    .line 392
    const/16 v15, 0xe

    .line 393
    .line 394
    int-to-float v12, v15

    .line 395
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 396
    .line 397
    .line 398
    move-result v12

    .line 399
    invoke-static {v11, v12, v7, v6, v13}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 400
    .line 401
    .line 402
    move-result-object v11

    .line 403
    sget-object v12, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 404
    .line 405
    invoke-virtual {v12}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 406
    .line 407
    .line 408
    move-result-object v12

    .line 409
    sget-object v19, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 410
    .line 411
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 412
    .line 413
    .line 414
    move-result-object v6

    .line 415
    const/16 v7, 0x30

    .line 416
    .line 417
    invoke-static {v6, v12, v4, v7}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 418
    .line 419
    .line 420
    move-result-object v6

    .line 421
    const/4 v7, 0x0

    .line 422
    invoke-static {v4, v7}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 423
    .line 424
    .line 425
    move-result v12

    .line 426
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 427
    .line 428
    .line 429
    move-result-object v7

    .line 430
    invoke-static {v4, v11}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 431
    .line 432
    .line 433
    move-result-object v11

    .line 434
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 435
    .line 436
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 437
    .line 438
    .line 439
    move-result-object v14

    .line 440
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 441
    .line 442
    .line 443
    move-result-object v19

    .line 444
    if-nez v19, :cond_f

    .line 445
    .line 446
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 447
    .line 448
    .line 449
    :cond_f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 450
    .line 451
    .line 452
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 453
    .line 454
    .line 455
    move-result v19

    .line 456
    if-eqz v19, :cond_10

    .line 457
    .line 458
    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 459
    .line 460
    .line 461
    goto :goto_a

    .line 462
    :cond_10
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 463
    .line 464
    .line 465
    :goto_a
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 466
    .line 467
    .line 468
    move-result-object v14

    .line 469
    invoke-static {v13, v14, v6, v14, v7}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 470
    .line 471
    .line 472
    move-result-object v6

    .line 473
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 474
    .line 475
    .line 476
    move-result v7

    .line 477
    if-nez v7, :cond_11

    .line 478
    .line 479
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v7

    .line 483
    move/from16 v19, v15

    .line 484
    .line 485
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 486
    .line 487
    .line 488
    move-result-object v15

    .line 489
    invoke-static {v7, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v7

    .line 493
    if-nez v7, :cond_12

    .line 494
    .line 495
    goto :goto_b

    .line 496
    :cond_11
    move/from16 v19, v15

    .line 497
    .line 498
    :goto_b
    invoke-static {v12, v14, v12, v6}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 499
    .line 500
    .line 501
    :cond_12
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 502
    .line 503
    .line 504
    move-result-object v6

    .line 505
    invoke-static {v14, v11, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 506
    .line 507
    .line 508
    move/from16 v6, v19

    .line 509
    .line 510
    sget-object v19, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 511
    .line 512
    const/4 v7, 0x0

    .line 513
    invoke-static {v8, v4, v7}, Lcom/zykj/mistake/feature/ask/o0;->g(Lcom/zykj/mistake/feature/ask/n;Landroidx/compose/runtime/Composer;I)V

    .line 514
    .line 515
    .line 516
    const/16 v11, 0xa

    .line 517
    .line 518
    int-to-float v11, v11

    .line 519
    const/4 v12, 0x6

    .line 520
    invoke-static {v11, v10, v4, v12}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 521
    .line 522
    .line 523
    move-object/from16 v25, v4

    .line 524
    .line 525
    const/4 v11, 0x2

    .line 526
    iget-object v4, v8, Lcom/zykj/mistake/feature/ask/n;->b:Ljava/lang/String;

    .line 527
    .line 528
    if-eqz v9, :cond_13

    .line 529
    .line 530
    sget-wide v13, Lcom/zykj/mistake/feature/ask/o0;->a:J

    .line 531
    .line 532
    goto :goto_c

    .line 533
    :cond_13
    sget-wide v13, Lcom/zykj/mistake/feature/ask/o0;->e:J

    .line 534
    .line 535
    :goto_c
    invoke-static {v6}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 536
    .line 537
    .line 538
    move-result-wide v15

    .line 539
    sget-object v6, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 540
    .line 541
    if-eqz v9, :cond_14

    .line 542
    .line 543
    invoke-virtual {v6}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 544
    .line 545
    .line 546
    move-result-object v6

    .line 547
    goto :goto_d

    .line 548
    :cond_14
    invoke-virtual {v6}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getNormal()Landroidx/compose/ui/text/font/FontWeight;

    .line 549
    .line 550
    .line 551
    move-result-object v6

    .line 552
    :goto_d
    const/16 v23, 0x2

    .line 553
    .line 554
    const/16 v24, 0x0

    .line 555
    .line 556
    const/high16 v21, 0x3f800000    # 1.0f

    .line 557
    .line 558
    const/16 v22, 0x0

    .line 559
    .line 560
    move-object/from16 v20, v10

    .line 561
    .line 562
    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 563
    .line 564
    .line 565
    move-result-object v9

    .line 566
    const/4 v10, 0x0

    .line 567
    const/16 v27, 0x0

    .line 568
    .line 569
    const/16 v17, 0x20

    .line 570
    .line 571
    const v28, 0x1ffd0

    .line 572
    .line 573
    .line 574
    move-object/from16 v19, v10

    .line 575
    .line 576
    const/4 v10, 0x0

    .line 577
    move/from16 v20, v12

    .line 578
    .line 579
    const/4 v12, 0x0

    .line 580
    move/from16 v22, v7

    .line 581
    .line 582
    move/from16 v21, v11

    .line 583
    .line 584
    move-object v11, v6

    .line 585
    move-wide v6, v13

    .line 586
    const-wide/16 v13, 0x0

    .line 587
    .line 588
    move/from16 v23, v5

    .line 589
    .line 590
    move-object v5, v9

    .line 591
    move-wide/from16 v38, v15

    .line 592
    .line 593
    move-object/from16 v16, v8

    .line 594
    .line 595
    move-wide/from16 v8, v38

    .line 596
    .line 597
    const/4 v15, 0x0

    .line 598
    move-object/from16 v24, v16

    .line 599
    .line 600
    const/16 v16, 0x0

    .line 601
    .line 602
    move/from16 v29, v17

    .line 603
    .line 604
    const/16 v30, 0x1

    .line 605
    .line 606
    const-wide/16 v17, 0x0

    .line 607
    .line 608
    move-object/from16 v31, v19

    .line 609
    .line 610
    const/16 v19, 0x0

    .line 611
    .line 612
    move/from16 v32, v20

    .line 613
    .line 614
    const/16 v20, 0x0

    .line 615
    .line 616
    move/from16 v33, v21

    .line 617
    .line 618
    const/16 v21, 0x0

    .line 619
    .line 620
    move/from16 v34, v22

    .line 621
    .line 622
    const/16 v22, 0x0

    .line 623
    .line 624
    move/from16 v35, v23

    .line 625
    .line 626
    const/16 v23, 0x0

    .line 627
    .line 628
    move-object/from16 v36, v24

    .line 629
    .line 630
    const/16 v24, 0x0

    .line 631
    .line 632
    const/16 v37, 0x0

    .line 633
    .line 634
    const/16 v26, 0xc00

    .line 635
    .line 636
    move-object/from16 p2, v3

    .line 637
    .line 638
    move/from16 v33, v32

    .line 639
    .line 640
    move-object/from16 v3, v36

    .line 641
    .line 642
    move/from16 v32, v30

    .line 643
    .line 644
    move/from16 v30, v29

    .line 645
    .line 646
    const/16 v29, 0xc

    .line 647
    .line 648
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 649
    .line 650
    .line 651
    iget v4, v3, Lcom/zykj/mistake/feature/ask/n;->c:I

    .line 652
    .line 653
    iget v3, v3, Lcom/zykj/mistake/feature/ask/n;->d:I

    .line 654
    .line 655
    new-instance v5, Ljava/lang/StringBuilder;

    .line 656
    .line 657
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 661
    .line 662
    .line 663
    const-string v4, "/"

    .line 664
    .line 665
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v4

    .line 675
    invoke-static/range {v29 .. v29}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 676
    .line 677
    .line 678
    move-result-wide v8

    .line 679
    const v28, 0x1fff2

    .line 680
    .line 681
    .line 682
    const/4 v5, 0x0

    .line 683
    sget-wide v6, Lcom/zykj/mistake/feature/ask/o0;->e:J

    .line 684
    .line 685
    const/4 v11, 0x0

    .line 686
    const/16 v26, 0xd80

    .line 687
    .line 688
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 689
    .line 690
    .line 691
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 692
    .line 693
    .line 694
    move-object/from16 v3, p2

    .line 695
    .line 696
    move-object/from16 v4, v25

    .line 697
    .line 698
    move-object/from16 v13, v31

    .line 699
    .line 700
    move/from16 v12, v32

    .line 701
    .line 702
    move/from16 v5, v35

    .line 703
    .line 704
    move/from16 v7, v37

    .line 705
    .line 706
    const/4 v6, 0x2

    .line 707
    goto/16 :goto_5

    .line 708
    .line 709
    :cond_15
    move-object/from16 v25, v4

    .line 710
    .line 711
    invoke-static/range {v25 .. v25}, Landroidx/collection/a;->x(Landroidx/compose/runtime/Composer;)Z

    .line 712
    .line 713
    .line 714
    move-result v3

    .line 715
    if-eqz v3, :cond_17

    .line 716
    .line 717
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 718
    .line 719
    .line 720
    goto :goto_e

    .line 721
    :cond_16
    move-object/from16 v25, v4

    .line 722
    .line 723
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 724
    .line 725
    .line 726
    :cond_17
    :goto_e
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 727
    .line 728
    .line 729
    move-result-object v3

    .line 730
    if-eqz v3, :cond_18

    .line 731
    .line 732
    new-instance v4, Lcom/zykj/mistake/feature/ask/d0;

    .line 733
    .line 734
    const/4 v11, 0x2

    .line 735
    invoke-direct {v4, v0, v1, v2, v11}, Lcom/zykj/mistake/feature/ask/d0;-><init>(Lcom/zykj/mistake/feature/ask/z;Lr6/c;II)V

    .line 736
    .line 737
    .line 738
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 739
    .line 740
    .line 741
    :cond_18
    return-void
.end method

.method public static final e(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Lcom/zykj/mistake/feature/ask/y;Landroidx/compose/ui/Modifier;ZLr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v5, p4

    .line 8
    .line 9
    move/from16 v6, p6

    .line 10
    .line 11
    const v0, 0x4aaf3079    # 5740604.5f

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p5

    .line 15
    .line 16
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    and-int/lit8 v7, v6, 0x6

    .line 21
    .line 22
    const/4 v8, 0x4

    .line 23
    if-nez v7, :cond_1

    .line 24
    .line 25
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    if-eqz v7, :cond_0

    .line 34
    .line 35
    move v7, v8

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v7, 0x2

    .line 38
    :goto_0
    or-int/2addr v7, v6

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v7, v6

    .line 41
    :goto_1
    and-int/lit8 v9, v6, 0x30

    .line 42
    .line 43
    if-nez v9, :cond_3

    .line 44
    .line 45
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    if-eqz v9, :cond_2

    .line 50
    .line 51
    const/16 v9, 0x20

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/16 v9, 0x10

    .line 55
    .line 56
    :goto_2
    or-int/2addr v7, v9

    .line 57
    :cond_3
    and-int/lit16 v9, v6, 0x180

    .line 58
    .line 59
    if-nez v9, :cond_5

    .line 60
    .line 61
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    if-eqz v9, :cond_4

    .line 66
    .line 67
    const/16 v9, 0x100

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    const/16 v9, 0x80

    .line 71
    .line 72
    :goto_3
    or-int/2addr v7, v9

    .line 73
    :cond_5
    and-int/lit16 v9, v6, 0xc00

    .line 74
    .line 75
    if-nez v9, :cond_7

    .line 76
    .line 77
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-eqz v9, :cond_6

    .line 82
    .line 83
    const/16 v9, 0x800

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_6
    const/16 v9, 0x400

    .line 87
    .line 88
    :goto_4
    or-int/2addr v7, v9

    .line 89
    :cond_7
    and-int/lit16 v9, v6, 0x6000

    .line 90
    .line 91
    const/16 v10, 0x4000

    .line 92
    .line 93
    if-nez v9, :cond_9

    .line 94
    .line 95
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    if-eqz v9, :cond_8

    .line 100
    .line 101
    move v9, v10

    .line 102
    goto :goto_5

    .line 103
    :cond_8
    const/16 v9, 0x2000

    .line 104
    .line 105
    :goto_5
    or-int/2addr v7, v9

    .line 106
    :cond_9
    and-int/lit16 v9, v7, 0x2493

    .line 107
    .line 108
    const/16 v11, 0x2492

    .line 109
    .line 110
    const/4 v12, 0x1

    .line 111
    const/4 v13, 0x0

    .line 112
    if-eq v9, v11, :cond_a

    .line 113
    .line 114
    move v9, v12

    .line 115
    goto :goto_6

    .line 116
    :cond_a
    move v9, v13

    .line 117
    :goto_6
    and-int/lit8 v11, v7, 0x1

    .line 118
    .line 119
    invoke-interface {v1, v9, v11}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    if-eqz v9, :cond_1f

    .line 124
    .line 125
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-eqz v9, :cond_b

    .line 130
    .line 131
    const/4 v9, -0x1

    .line 132
    const-string v11, "com.zykj.mistake.feature.ask.AskMaterialImageCard (MistakeAskMaterialScreen.kt:268)"

    .line 133
    .line 134
    invoke-static {v0, v7, v9, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_b
    int-to-float v0, v8

    .line 138
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    invoke-static {v9}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    invoke-static {v3, v9}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 147
    .line 148
    .line 149
    move-result-object v14

    .line 150
    sget-object v9, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 151
    .line 152
    invoke-virtual {v9}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 153
    .line 154
    .line 155
    move-result-wide v15

    .line 156
    const/16 v18, 0x2

    .line 157
    .line 158
    const/16 v19, 0x0

    .line 159
    .line 160
    const/16 v17, 0x0

    .line 161
    .line 162
    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    const-wide/high16 v14, 0x3fe0000000000000L    # 0.5

    .line 167
    .line 168
    double-to-float v11, v14

    .line 169
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 170
    .line 171
    .line 172
    move-result v11

    .line 173
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    sget-wide v14, Lcom/zykj/mistake/feature/ask/o0;->d:J

    .line 182
    .line 183
    invoke-static {v9, v11, v14, v15, v0}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 184
    .line 185
    .line 186
    move-result-object v16

    .line 187
    const v0, 0xe000

    .line 188
    .line 189
    .line 190
    and-int/2addr v0, v7

    .line 191
    if-ne v0, v10, :cond_c

    .line 192
    .line 193
    move v0, v12

    .line 194
    goto :goto_7

    .line 195
    :cond_c
    move v0, v13

    .line 196
    :goto_7
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    if-nez v0, :cond_d

    .line 201
    .line 202
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 203
    .line 204
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    if-ne v9, v0, :cond_e

    .line 209
    .line 210
    :cond_d
    new-instance v9, Landroidx/navigation/internal/e;

    .line 211
    .line 212
    const/4 v0, 0x2

    .line 213
    invoke-direct {v9, v5, v0}, Landroidx/navigation/internal/e;-><init>(Lr6/a;I)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    :cond_e
    move-object/from16 v20, v9

    .line 220
    .line 221
    check-cast v20, Lr6/a;

    .line 222
    .line 223
    const/16 v21, 0x7

    .line 224
    .line 225
    const/16 v22, 0x0

    .line 226
    .line 227
    const/16 v17, 0x0

    .line 228
    .line 229
    const/16 v18, 0x0

    .line 230
    .line 231
    const/16 v19, 0x0

    .line 232
    .line 233
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    sget-object v32, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 238
    .line 239
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    invoke-static {v9, v13}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    invoke-static {v1, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 252
    .line 253
    .line 254
    move-result-object v11

    .line 255
    invoke-static {v1, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 260
    .line 261
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 262
    .line 263
    .line 264
    move-result-object v15

    .line 265
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 266
    .line 267
    .line 268
    move-result-object v16

    .line 269
    if-nez v16, :cond_f

    .line 270
    .line 271
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 272
    .line 273
    .line 274
    :cond_f
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 275
    .line 276
    .line 277
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 278
    .line 279
    .line 280
    move-result v16

    .line 281
    if-eqz v16, :cond_10

    .line 282
    .line 283
    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 284
    .line 285
    .line 286
    goto :goto_8

    .line 287
    :cond_10
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 288
    .line 289
    .line 290
    :goto_8
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 291
    .line 292
    .line 293
    move-result-object v15

    .line 294
    invoke-static {v14, v15, v9, v15, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 295
    .line 296
    .line 297
    move-result-object v9

    .line 298
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 299
    .line 300
    .line 301
    move-result v11

    .line 302
    if-nez v11, :cond_11

    .line 303
    .line 304
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v11

    .line 308
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object v8

    .line 312
    invoke-static {v11, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v8

    .line 316
    if-nez v8, :cond_12

    .line 317
    .line 318
    :cond_11
    invoke-static {v10, v15, v10, v9}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 319
    .line 320
    .line 321
    :cond_12
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 322
    .line 323
    .line 324
    move-result-object v8

    .line 325
    invoke-static {v15, v0, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 326
    .line 327
    .line 328
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 329
    .line 330
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 331
    .line 332
    const/4 v9, 0x0

    .line 333
    const/4 v10, 0x0

    .line 334
    invoke-static {v8, v9, v12, v10}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 335
    .line 336
    .line 337
    move-result-object v11

    .line 338
    sget-object v15, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 339
    .line 340
    invoke-virtual {v15}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 341
    .line 342
    .line 343
    move-result-object v15

    .line 344
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 345
    .line 346
    .line 347
    move-result-object v9

    .line 348
    invoke-static {v15, v9, v1, v13}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 349
    .line 350
    .line 351
    move-result-object v9

    .line 352
    invoke-static {v1, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 353
    .line 354
    .line 355
    move-result v15

    .line 356
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 357
    .line 358
    .line 359
    move-result-object v10

    .line 360
    invoke-static {v1, v11}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 361
    .line 362
    .line 363
    move-result-object v11

    .line 364
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 365
    .line 366
    .line 367
    move-result-object v12

    .line 368
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 369
    .line 370
    .line 371
    move-result-object v16

    .line 372
    if-nez v16, :cond_13

    .line 373
    .line 374
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 375
    .line 376
    .line 377
    :cond_13
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 378
    .line 379
    .line 380
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 381
    .line 382
    .line 383
    move-result v16

    .line 384
    if-eqz v16, :cond_14

    .line 385
    .line 386
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 387
    .line 388
    .line 389
    goto :goto_9

    .line 390
    :cond_14
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 391
    .line 392
    .line 393
    :goto_9
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 394
    .line 395
    .line 396
    move-result-object v12

    .line 397
    invoke-static {v14, v12, v9, v12, v10}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 398
    .line 399
    .line 400
    move-result-object v9

    .line 401
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 402
    .line 403
    .line 404
    move-result v10

    .line 405
    if-nez v10, :cond_15

    .line 406
    .line 407
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v10

    .line 411
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 412
    .line 413
    .line 414
    move-result-object v13

    .line 415
    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v10

    .line 419
    if-nez v10, :cond_16

    .line 420
    .line 421
    :cond_15
    invoke-static {v15, v12, v15, v9}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 422
    .line 423
    .line 424
    :cond_16
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 425
    .line 426
    .line 427
    move-result-object v9

    .line 428
    invoke-static {v12, v11, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 429
    .line 430
    .line 431
    sget-object v15, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 432
    .line 433
    const/16 v19, 0x2

    .line 434
    .line 435
    const/16 v20, 0x0

    .line 436
    .line 437
    const/high16 v17, 0x3f800000    # 1.0f

    .line 438
    .line 439
    const/16 v18, 0x0

    .line 440
    .line 441
    move-object/from16 v16, v8

    .line 442
    .line 443
    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 444
    .line 445
    .line 446
    move-result-object v8

    .line 447
    move-object/from16 v9, v16

    .line 448
    .line 449
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 450
    .line 451
    .line 452
    move-result-object v10

    .line 453
    const/4 v11, 0x0

    .line 454
    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 455
    .line 456
    .line 457
    move-result-object v10

    .line 458
    invoke-static {v1, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 459
    .line 460
    .line 461
    move-result v12

    .line 462
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 463
    .line 464
    .line 465
    move-result-object v13

    .line 466
    invoke-static {v1, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 467
    .line 468
    .line 469
    move-result-object v8

    .line 470
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 471
    .line 472
    .line 473
    move-result-object v15

    .line 474
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 475
    .line 476
    .line 477
    move-result-object v16

    .line 478
    if-nez v16, :cond_17

    .line 479
    .line 480
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 481
    .line 482
    .line 483
    :cond_17
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 484
    .line 485
    .line 486
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 487
    .line 488
    .line 489
    move-result v16

    .line 490
    if-eqz v16, :cond_18

    .line 491
    .line 492
    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 493
    .line 494
    .line 495
    goto :goto_a

    .line 496
    :cond_18
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 497
    .line 498
    .line 499
    :goto_a
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 500
    .line 501
    .line 502
    move-result-object v15

    .line 503
    invoke-static {v14, v15, v10, v15, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 504
    .line 505
    .line 506
    move-result-object v10

    .line 507
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 508
    .line 509
    .line 510
    move-result v13

    .line 511
    if-nez v13, :cond_19

    .line 512
    .line 513
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v13

    .line 517
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 518
    .line 519
    .line 520
    move-result-object v11

    .line 521
    invoke-static {v13, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    move-result v11

    .line 525
    if-nez v11, :cond_1a

    .line 526
    .line 527
    :cond_19
    invoke-static {v12, v15, v12, v10}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 528
    .line 529
    .line 530
    :cond_1a
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 531
    .line 532
    .line 533
    move-result-object v10

    .line 534
    invoke-static {v15, v8, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 535
    .line 536
    .line 537
    const/4 v8, 0x0

    .line 538
    const/4 v10, 0x0

    .line 539
    const/4 v11, 0x1

    .line 540
    invoke-static {v9, v10, v11, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 541
    .line 542
    .line 543
    move-result-object v12

    .line 544
    const/4 v8, 0x3

    .line 545
    shr-int/2addr v7, v8

    .line 546
    and-int/lit8 v7, v7, 0xe

    .line 547
    .line 548
    or-int/lit8 v7, v7, 0x30

    .line 549
    .line 550
    invoke-static {v2, v12, v1, v7}, Lcom/zykj/mistake/feature/ask/o0;->i(Lcom/zykj/mistake/feature/ask/y;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 551
    .line 552
    .line 553
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 554
    .line 555
    .line 556
    if-eqz v4, :cond_1e

    .line 557
    .line 558
    const v7, -0x78851e05

    .line 559
    .line 560
    .line 561
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 562
    .line 563
    .line 564
    iget-object v7, v2, Lcom/zykj/mistake/feature/ask/y;->b:Ljava/lang/String;

    .line 565
    .line 566
    sget-object v10, Lcom/zykj/mistake/feature/ask/n0;->a:[I

    .line 567
    .line 568
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    .line 569
    .line 570
    .line 571
    move-result v11

    .line 572
    aget v10, v10, v11

    .line 573
    .line 574
    if-eq v10, v8, :cond_1c

    .line 575
    .line 576
    const/4 v8, 0x4

    .line 577
    if-eq v10, v8, :cond_1b

    .line 578
    .line 579
    goto :goto_b

    .line 580
    :cond_1b
    invoke-static {v7}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 581
    .line 582
    .line 583
    move-result v8

    .line 584
    if-eqz v8, :cond_1d

    .line 585
    .line 586
    const-string v7, "\u5178\u9519"

    .line 587
    .line 588
    goto :goto_b

    .line 589
    :cond_1c
    invoke-static {v7}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 590
    .line 591
    .line 592
    move-result v8

    .line 593
    if-eqz v8, :cond_1d

    .line 594
    .line 595
    const-string v7, "\u56fe\u7247"

    .line 596
    .line 597
    :cond_1d
    :goto_b
    const/16 v8, 0xc

    .line 598
    .line 599
    invoke-static {v8}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 600
    .line 601
    .line 602
    move-result-wide v11

    .line 603
    sget-object v10, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 604
    .line 605
    invoke-virtual {v10}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    .line 606
    .line 607
    .line 608
    move-result v10

    .line 609
    const/16 v13, 0x22

    .line 610
    .line 611
    int-to-float v13, v13

    .line 612
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 613
    .line 614
    .line 615
    move-result v13

    .line 616
    invoke-static {v9, v13}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 617
    .line 618
    .line 619
    move-result-object v13

    .line 620
    move-object/from16 v28, v1

    .line 621
    .line 622
    const/4 v1, 0x1

    .line 623
    const/4 v14, 0x0

    .line 624
    const/4 v15, 0x0

    .line 625
    invoke-static {v13, v15, v1, v14}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    int-to-float v8, v8

    .line 630
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 631
    .line 632
    .line 633
    move-result v8

    .line 634
    const/16 v13, 0x8

    .line 635
    .line 636
    int-to-float v13, v13

    .line 637
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 638
    .line 639
    .line 640
    move-result v13

    .line 641
    invoke-static {v1, v8, v13}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 642
    .line 643
    .line 644
    move-result-object v8

    .line 645
    const/16 v30, 0xc30

    .line 646
    .line 647
    const v31, 0x1d7f0

    .line 648
    .line 649
    .line 650
    move-object/from16 v16, v9

    .line 651
    .line 652
    move/from16 v22, v10

    .line 653
    .line 654
    sget-wide v9, Lcom/zykj/mistake/feature/ask/o0;->e:J

    .line 655
    .line 656
    const/4 v13, 0x0

    .line 657
    const/4 v14, 0x0

    .line 658
    const/4 v15, 0x0

    .line 659
    move-object/from16 v1, v16

    .line 660
    .line 661
    const-wide/16 v16, 0x0

    .line 662
    .line 663
    const/16 v18, 0x0

    .line 664
    .line 665
    const/16 v19, 0x0

    .line 666
    .line 667
    const-wide/16 v20, 0x0

    .line 668
    .line 669
    const/16 v23, 0x0

    .line 670
    .line 671
    const/16 v25, 0x0

    .line 672
    .line 673
    const/16 v24, 0x1

    .line 674
    .line 675
    move/from16 v26, v25

    .line 676
    .line 677
    const/16 v25, 0x0

    .line 678
    .line 679
    move/from16 v27, v26

    .line 680
    .line 681
    const/16 v26, 0x0

    .line 682
    .line 683
    move/from16 v29, v27

    .line 684
    .line 685
    const/16 v27, 0x0

    .line 686
    .line 687
    move/from16 v33, v29

    .line 688
    .line 689
    const/16 v29, 0xdb0

    .line 690
    .line 691
    move/from16 v3, v33

    .line 692
    .line 693
    invoke-static/range {v7 .. v31}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 694
    .line 695
    .line 696
    move-object/from16 v7, v28

    .line 697
    .line 698
    :goto_c
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 699
    .line 700
    .line 701
    goto :goto_d

    .line 702
    :cond_1e
    move-object v7, v1

    .line 703
    move-object v1, v9

    .line 704
    const/4 v3, 0x0

    .line 705
    const v8, -0x792a0673

    .line 706
    .line 707
    .line 708
    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 709
    .line 710
    .line 711
    goto :goto_c

    .line 712
    :goto_d
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 713
    .line 714
    .line 715
    iget-boolean v8, v2, Lcom/zykj/mistake/feature/ask/y;->h:Z

    .line 716
    .line 717
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Alignment$Companion;->getBottomEnd()Landroidx/compose/ui/Alignment;

    .line 718
    .line 719
    .line 720
    move-result-object v9

    .line 721
    invoke-interface {v0, v1, v9}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    const/16 v1, 0xa

    .line 726
    .line 727
    int-to-float v1, v1

    .line 728
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 729
    .line 730
    .line 731
    move-result v1

    .line 732
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    invoke-static {v8, v0, v7, v3}, Lcom/zykj/mistake/feature/ask/o0;->k(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 737
    .line 738
    .line 739
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 740
    .line 741
    .line 742
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 743
    .line 744
    .line 745
    move-result v0

    .line 746
    if-eqz v0, :cond_20

    .line 747
    .line 748
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 749
    .line 750
    .line 751
    goto :goto_e

    .line 752
    :cond_1f
    move-object v7, v1

    .line 753
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 754
    .line 755
    .line 756
    :cond_20
    :goto_e
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 757
    .line 758
    .line 759
    move-result-object v7

    .line 760
    if-eqz v7, :cond_21

    .line 761
    .line 762
    new-instance v0, Lcom/zykj/mistake/feature/ask/g0;

    .line 763
    .line 764
    move-object/from16 v1, p0

    .line 765
    .line 766
    move-object/from16 v3, p2

    .line 767
    .line 768
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/ask/g0;-><init>(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Lcom/zykj/mistake/feature/ask/y;Landroidx/compose/ui/Modifier;ZLr6/a;I)V

    .line 769
    .line 770
    .line 771
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 772
    .line 773
    .line 774
    :cond_21
    return-void
.end method

.method public static final f(Lcom/zykj/mistake/feature/ask/z;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const v3, -0x6bd11530

    .line 6
    .line 7
    .line 8
    move-object/from16 v4, p2

    .line 9
    .line 10
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v11

    .line 14
    and-int/lit8 v4, p3, 0x6

    .line 15
    .line 16
    const/4 v5, 0x2

    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v4, v5

    .line 28
    :goto_0
    or-int v4, p3, v4

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move/from16 v4, p3

    .line 32
    .line 33
    :goto_1
    and-int/lit8 v6, p3, 0x30

    .line 34
    .line 35
    const/16 v7, 0x20

    .line 36
    .line 37
    if-nez v6, :cond_3

    .line 38
    .line 39
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    move v6, v7

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v6, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v4, v6

    .line 50
    :cond_3
    and-int/lit8 v6, v4, 0x13

    .line 51
    .line 52
    const/16 v8, 0x12

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    const/4 v10, 0x1

    .line 56
    if-eq v6, v8, :cond_4

    .line 57
    .line 58
    move v6, v10

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move v6, v9

    .line 61
    :goto_3
    and-int/lit8 v12, v4, 0x1

    .line 62
    .line 63
    invoke-interface {v11, v6, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_d

    .line 68
    .line 69
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_5

    .line 74
    .line 75
    const/4 v6, -0x1

    .line 76
    const-string v12, "com.zykj.mistake.feature.ask.AskMaterialTopBar (MistakeAskMaterialScreen.kt:86)"

    .line 77
    .line 78
    invoke-static {v3, v4, v6, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 82
    .line 83
    const/4 v6, 0x0

    .line 84
    const/4 v12, 0x0

    .line 85
    invoke-static {v3, v6, v10, v12}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 86
    .line 87
    .line 88
    move-result-object v13

    .line 89
    const/16 v15, 0x2c

    .line 90
    .line 91
    int-to-float v15, v15

    .line 92
    invoke-static {v15}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 93
    .line 94
    .line 95
    move-result v15

    .line 96
    invoke-static {v13, v15}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 97
    .line 98
    .line 99
    move-result-object v16

    .line 100
    sget-object v13, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 101
    .line 102
    invoke-virtual {v13}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 103
    .line 104
    .line 105
    move-result-wide v17

    .line 106
    const/16 v20, 0x2

    .line 107
    .line 108
    const/16 v21, 0x0

    .line 109
    .line 110
    const/16 v19, 0x0

    .line 111
    .line 112
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 113
    .line 114
    .line 115
    move-result-object v13

    .line 116
    const/16 v15, 0x18

    .line 117
    .line 118
    int-to-float v15, v15

    .line 119
    invoke-static {v15}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 120
    .line 121
    .line 122
    move-result v15

    .line 123
    invoke-static {v13, v15, v6, v5, v12}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    sget-object v6, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 128
    .line 129
    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    sget-object v12, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 134
    .line 135
    invoke-virtual {v12}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 136
    .line 137
    .line 138
    move-result-object v12

    .line 139
    const/16 v13, 0x30

    .line 140
    .line 141
    invoke-static {v12, v6, v11, v13}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-static {v11, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 146
    .line 147
    .line 148
    move-result v12

    .line 149
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 150
    .line 151
    .line 152
    move-result-object v13

    .line 153
    invoke-static {v11, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 158
    .line 159
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 164
    .line 165
    .line 166
    move-result-object v16

    .line 167
    if-nez v16, :cond_6

    .line 168
    .line 169
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 170
    .line 171
    .line 172
    :cond_6
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 173
    .line 174
    .line 175
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 176
    .line 177
    .line 178
    move-result v16

    .line 179
    if-eqz v16, :cond_7

    .line 180
    .line 181
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 182
    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_7
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 186
    .line 187
    .line 188
    :goto_4
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    invoke-static {v15, v10, v6, v10, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 197
    .line 198
    .line 199
    move-result v13

    .line 200
    if-nez v13, :cond_8

    .line 201
    .line 202
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v13

    .line 206
    const/16 v16, 0x10

    .line 207
    .line 208
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v14

    .line 212
    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v13

    .line 216
    if-nez v13, :cond_9

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_8
    const/16 v16, 0x10

    .line 220
    .line 221
    :goto_5
    invoke-static {v12, v10, v12, v6}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 222
    .line 223
    .line 224
    :cond_9
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    invoke-static {v10, v5, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 229
    .line 230
    .line 231
    sget-object v5, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 232
    .line 233
    sget v5, Lcom/zykj/mistake/R$drawable;->ic_black_back:I

    .line 234
    .line 235
    invoke-static {v5, v11, v9}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    int-to-float v6, v8

    .line 240
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 245
    .line 246
    .line 247
    move-result-object v17

    .line 248
    and-int/lit8 v4, v4, 0x70

    .line 249
    .line 250
    if-ne v4, v7, :cond_a

    .line 251
    .line 252
    const/4 v10, 0x1

    .line 253
    goto :goto_6

    .line 254
    :cond_a
    move v10, v9

    .line 255
    :goto_6
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    if-nez v10, :cond_b

    .line 260
    .line 261
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 262
    .line 263
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v6

    .line 267
    if-ne v4, v6, :cond_c

    .line 268
    .line 269
    :cond_b
    new-instance v4, Lcom/zykj/mistake/feature/ask/h0;

    .line 270
    .line 271
    invoke-direct {v4, v1, v9}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 272
    .line 273
    .line 274
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    :cond_c
    move-object/from16 v21, v4

    .line 278
    .line 279
    check-cast v21, Lr6/a;

    .line 280
    .line 281
    const/16 v22, 0x7

    .line 282
    .line 283
    const/16 v23, 0x0

    .line 284
    .line 285
    const/16 v18, 0x0

    .line 286
    .line 287
    const/16 v19, 0x0

    .line 288
    .line 289
    const/16 v20, 0x0

    .line 290
    .line 291
    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    const/16 v12, 0x30

    .line 296
    .line 297
    const/16 v13, 0x78

    .line 298
    .line 299
    move-object v4, v5

    .line 300
    const-string v5, "\u8fd4\u56de"

    .line 301
    .line 302
    const/4 v7, 0x0

    .line 303
    const/4 v8, 0x0

    .line 304
    const/4 v9, 0x0

    .line 305
    const/4 v10, 0x0

    .line 306
    invoke-static/range {v4 .. v13}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 307
    .line 308
    .line 309
    const/16 v4, 0x8

    .line 310
    .line 311
    int-to-float v4, v4

    .line 312
    const/4 v5, 0x6

    .line 313
    invoke-static {v4, v3, v11, v5}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 314
    .line 315
    .line 316
    invoke-static/range {v16 .. v16}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 317
    .line 318
    .line 319
    move-result-wide v8

    .line 320
    const/16 v27, 0x0

    .line 321
    .line 322
    const v28, 0x1fff2

    .line 323
    .line 324
    .line 325
    const-string v4, "\u9009\u62e9\u7d20\u6750"

    .line 326
    .line 327
    move v6, v5

    .line 328
    const/4 v5, 0x0

    .line 329
    move v10, v6

    .line 330
    sget-wide v6, Lcom/zykj/mistake/feature/ask/o0;->e:J

    .line 331
    .line 332
    move v12, v10

    .line 333
    const/4 v10, 0x0

    .line 334
    move-object/from16 v25, v11

    .line 335
    .line 336
    const/4 v11, 0x0

    .line 337
    move v13, v12

    .line 338
    const/4 v12, 0x0

    .line 339
    move v15, v13

    .line 340
    const-wide/16 v13, 0x0

    .line 341
    .line 342
    move/from16 v17, v15

    .line 343
    .line 344
    const/4 v15, 0x0

    .line 345
    move/from16 v18, v16

    .line 346
    .line 347
    const/16 v16, 0x0

    .line 348
    .line 349
    move/from16 v20, v17

    .line 350
    .line 351
    move/from16 v19, v18

    .line 352
    .line 353
    const-wide/16 v17, 0x0

    .line 354
    .line 355
    move/from16 v21, v19

    .line 356
    .line 357
    const/16 v19, 0x0

    .line 358
    .line 359
    move/from16 v22, v20

    .line 360
    .line 361
    const/16 v20, 0x0

    .line 362
    .line 363
    move/from16 v23, v21

    .line 364
    .line 365
    const/16 v21, 0x0

    .line 366
    .line 367
    move/from16 v24, v22

    .line 368
    .line 369
    const/16 v22, 0x0

    .line 370
    .line 371
    move/from16 v26, v23

    .line 372
    .line 373
    const/16 v23, 0x0

    .line 374
    .line 375
    move/from16 v29, v24

    .line 376
    .line 377
    const/16 v24, 0x0

    .line 378
    .line 379
    move/from16 v30, v26

    .line 380
    .line 381
    const/16 v26, 0xd86

    .line 382
    .line 383
    move/from16 v2, v29

    .line 384
    .line 385
    move/from16 v1, v30

    .line 386
    .line 387
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 388
    .line 389
    .line 390
    move-object/from16 v11, v25

    .line 391
    .line 392
    int-to-float v1, v1

    .line 393
    invoke-static {v1, v3, v11, v2}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 394
    .line 395
    .line 396
    iget v1, v0, Lcom/zykj/mistake/feature/ask/z;->c:I

    .line 397
    .line 398
    iget v2, v0, Lcom/zykj/mistake/feature/ask/z;->d:I

    .line 399
    .line 400
    const-string v3, "\u5df2\u9009\u56fe\u7247\uff1a"

    .line 401
    .line 402
    const-string v4, "/"

    .line 403
    .line 404
    invoke-static {v1, v2, v3, v4}, Landroidx/collection/a;->m(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    const/16 v1, 0xd

    .line 409
    .line 410
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 411
    .line 412
    .line 413
    move-result-wide v8

    .line 414
    sget-wide v6, Lcom/zykj/mistake/feature/ask/o0;->f:J

    .line 415
    .line 416
    const/4 v11, 0x0

    .line 417
    const/16 v26, 0xd80

    .line 418
    .line 419
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 420
    .line 421
    .line 422
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 423
    .line 424
    .line 425
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    if-eqz v1, :cond_e

    .line 430
    .line 431
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 432
    .line 433
    .line 434
    goto :goto_7

    .line 435
    :cond_d
    move-object/from16 v25, v11

    .line 436
    .line 437
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 438
    .line 439
    .line 440
    :cond_e
    :goto_7
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    if-eqz v1, :cond_f

    .line 445
    .line 446
    new-instance v2, Lcom/zykj/mistake/feature/ask/d0;

    .line 447
    .line 448
    const/4 v3, 0x3

    .line 449
    move-object/from16 v4, p1

    .line 450
    .line 451
    move/from16 v5, p3

    .line 452
    .line 453
    invoke-direct {v2, v0, v4, v5, v3}, Lcom/zykj/mistake/feature/ask/d0;-><init>(Lcom/zykj/mistake/feature/ask/z;Lr6/c;II)V

    .line 454
    .line 455
    .line 456
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 457
    .line 458
    .line 459
    :cond_f
    return-void
.end method

.method public static final g(Lcom/zykj/mistake/feature/ask/n;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    .line 1
    const v0, -0x4bdc94b7

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object v8

    .line 8
    and-int/lit8 p1, p2, 0x6

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    invoke-interface {v8, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move p1, v1

    .line 22
    :goto_0
    or-int/2addr p1, p2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move p1, p2

    .line 25
    :goto_1
    and-int/lit8 v2, p1, 0x3

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    if-eq v2, v1, :cond_2

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move v1, v3

    .line 33
    :goto_2
    and-int/lit8 v2, p1, 0x1

    .line 34
    .line 35
    invoke-interface {v8, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_6

    .line 40
    .line 41
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    const/4 v1, -0x1

    .line 48
    const-string v2, "com.zykj.mistake.feature.ask.GroupStateIcon (MistakeAskMaterialScreen.kt:158)"

    .line 49
    .line 50
    invoke-static {v0, p1, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    iget p1, p0, Lcom/zykj/mistake/feature/ask/n;->c:I

    .line 54
    .line 55
    if-gtz p1, :cond_4

    .line 56
    .line 57
    sget p1, Lcom/zykj/mistake/R$drawable;->ic_mistake_unselected:I

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    iget v0, p0, Lcom/zykj/mistake/feature/ask/n;->d:I

    .line 61
    .line 62
    if-ne p1, v0, :cond_5

    .line 63
    .line 64
    sget p1, Lcom/zykj/mistake/R$drawable;->ic_mistake_selected:I

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_5
    sget p1, Lcom/zykj/mistake/R$drawable;->ic_partial_selected:I

    .line 68
    .line 69
    :goto_3
    invoke-static {p1, v8, v3}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 74
    .line 75
    const/16 v0, 0x11

    .line 76
    .line 77
    int-to-float v0, v0

    .line 78
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-static {p1, v0}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    const/16 v9, 0x1b0

    .line 87
    .line 88
    const/16 v10, 0x78

    .line 89
    .line 90
    const/4 v2, 0x0

    .line 91
    const/4 v4, 0x0

    .line 92
    const/4 v5, 0x0

    .line 93
    const/4 v6, 0x0

    .line 94
    const/4 v7, 0x0

    .line 95
    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 96
    .line 97
    .line 98
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_7

    .line 103
    .line 104
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 105
    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_6
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 109
    .line 110
    .line 111
    :cond_7
    :goto_4
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-eqz p1, :cond_8

    .line 116
    .line 117
    new-instance v0, Landroidx/navigation/compose/d;

    .line 118
    .line 119
    const/4 v1, 0x2

    .line 120
    invoke-direct {v0, p0, p2, v1}, Landroidx/navigation/compose/d;-><init>(Ljava/lang/Object;II)V

    .line 121
    .line 122
    .line 123
    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 124
    .line 125
    .line 126
    :cond_8
    return-void
.end method

.method public static final h(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    .line 1
    const v0, -0x7551f6da

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object v8

    .line 8
    and-int/lit8 p2, p3, 0x6

    .line 9
    .line 10
    if-nez p2, :cond_1

    .line 11
    .line 12
    invoke-interface {v8, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    const/4 p2, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p2, 0x2

    .line 21
    :goto_0
    or-int/2addr p2, p3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move p2, p3

    .line 24
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 25
    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    invoke-interface {v8, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    const/16 v1, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v1, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr p2, v1

    .line 40
    :cond_3
    and-int/lit8 v1, p2, 0x13

    .line 41
    .line 42
    const/16 v2, 0x12

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    if-eq v1, v2, :cond_4

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    goto :goto_3

    .line 49
    :cond_4
    move v1, v3

    .line 50
    :goto_3
    and-int/lit8 v2, p2, 0x1

    .line 51
    .line 52
    invoke-interface {v8, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_8

    .line 57
    .line 58
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_5

    .line 63
    .line 64
    const/4 v1, -0x1

    .line 65
    const-string v2, "com.zykj.mistake.feature.ask.MaterialImage (MistakeAskMaterialScreen.kt:310)"

    .line 66
    .line 67
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_5
    sget-object v0, Lcom/zykj/mistake/utils/e;->a:Lcom/zykj/mistake/utils/e;

    .line 71
    .line 72
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Landroid/content/Context;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/utils/e;->a(Landroid/content/Context;)Lcoil3/n;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget-object v1, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    .line 87
    .line 88
    invoke-virtual {v1}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFit()Landroidx/compose/ui/layout/ContentScale;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    and-int/lit8 v1, p2, 0xe

    .line 93
    .line 94
    const v2, 0xc00030

    .line 95
    .line 96
    .line 97
    or-int/2addr v1, v2

    .line 98
    shl-int/lit8 p2, p2, 0x6

    .line 99
    .line 100
    and-int/lit16 p2, p2, 0x1c00

    .line 101
    .line 102
    or-int/2addr p2, v1

    .line 103
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 104
    .line 105
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    sget-object v1, Landroidx/compose/ui/graphics/drawscope/DrawScope;->Companion:Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;

    .line 110
    .line 111
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;->getDefaultFilterQuality-f-v9h1I()I

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_6

    .line 120
    .line 121
    const v1, 0x262fc5e

    .line 122
    .line 123
    .line 124
    const-string v2, "coil3.compose.AsyncImage (AsyncImage.kt:125)"

    .line 125
    .line 126
    invoke-static {v1, p2, v3, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    shr-int/lit8 p2, p2, 0x3

    .line 130
    .line 131
    new-instance v1, Lm/a;

    .line 132
    .line 133
    sget-object v2, Lcoil3/compose/m;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 134
    .line 135
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    check-cast v2, Lcoil3/compose/c;

    .line 140
    .line 141
    invoke-direct {v1, p0, v2, v0}, Lm/a;-><init>(Ljava/lang/Object;Lcoil3/compose/c;Lcoil3/n;)V

    .line 142
    .line 143
    .line 144
    and-int/lit16 p2, p2, 0x380

    .line 145
    .line 146
    const v0, 0x180030

    .line 147
    .line 148
    .line 149
    or-int v9, p2, v0

    .line 150
    .line 151
    const/4 v10, 0x0

    .line 152
    sget-object v3, Lcoil3/compose/AsyncImagePainter;->q:Landroidx/navigation/a;

    .line 153
    .line 154
    const/4 v4, 0x0

    .line 155
    move-object v2, p1

    .line 156
    invoke-static/range {v1 .. v10}, Lcoil3/compose/b;->a(Lm/a;Landroidx/compose/ui/Modifier;Lr6/c;Lr6/c;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)V

    .line 157
    .line 158
    .line 159
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-eqz p1, :cond_7

    .line 164
    .line 165
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 166
    .line 167
    .line 168
    :cond_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_9

    .line 173
    .line 174
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_8
    move-object v2, p1

    .line 179
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 180
    .line 181
    .line 182
    :cond_9
    :goto_4
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    if-eqz p1, :cond_a

    .line 187
    .line 188
    new-instance p2, Lcom/zykj/mistake/feature/ask/j0;

    .line 189
    .line 190
    const/4 v0, 0x1

    .line 191
    invoke-direct {p2, p0, v2, p3, v0}, Lcom/zykj/mistake/feature/ask/j0;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;II)V

    .line 192
    .line 193
    .line 194
    invoke-interface {p1, p2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 195
    .line 196
    .line 197
    :cond_a
    return-void
.end method

.method public static final i(Lcom/zykj/mistake/feature/ask/y;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    .line 1
    const v0, -0x3575abb8    # -4532772.0f

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    and-int/lit8 v1, p3, 0x6

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v2

    .line 22
    :goto_0
    or-int/2addr v1, p3

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v1, p3

    .line 25
    :goto_1
    and-int/lit8 v3, p3, 0x30

    .line 26
    .line 27
    if-nez v3, :cond_3

    .line 28
    .line 29
    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    const/16 v3, 0x20

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v3, 0x10

    .line 39
    .line 40
    :goto_2
    or-int/2addr v1, v3

    .line 41
    :cond_3
    and-int/lit8 v3, v1, 0x13

    .line 42
    .line 43
    const/16 v4, 0x12

    .line 44
    .line 45
    const/4 v5, 0x1

    .line 46
    if-eq v3, v4, :cond_4

    .line 47
    .line 48
    move v3, v5

    .line 49
    goto :goto_3

    .line 50
    :cond_4
    const/4 v3, 0x0

    .line 51
    :goto_3
    and-int/lit8 v4, v1, 0x1

    .line 52
    .line 53
    invoke-interface {p2, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_a

    .line 58
    .line 59
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_5

    .line 64
    .line 65
    const/4 v3, -0x1

    .line 66
    const-string v4, "com.zykj.mistake.feature.ask.MaterialPreview (MistakeAskMaterialScreen.kt:325)"

    .line 67
    .line 68
    invoke-static {v0, v1, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_5
    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/y;->c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 72
    .line 73
    iget-object v3, p0, Lcom/zykj/mistake/feature/ask/y;->f:Ljava/lang/String;

    .line 74
    .line 75
    sget-object v4, Lcom/zykj/mistake/feature/ask/n0;->b:[I

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    aget v0, v4, v0

    .line 82
    .line 83
    if-eq v0, v5, :cond_9

    .line 84
    .line 85
    if-eq v0, v2, :cond_8

    .line 86
    .line 87
    const/4 v2, 0x3

    .line 88
    if-ne v0, v2, :cond_7

    .line 89
    .line 90
    const v0, -0x287202ef

    .line 91
    .line 92
    .line 93
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 94
    .line 95
    .line 96
    invoke-static {v3}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_6

    .line 101
    .line 102
    const v0, -0x28715ebb

    .line 103
    .line 104
    .line 105
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 106
    .line 107
    .line 108
    and-int/lit8 v0, v1, 0x70

    .line 109
    .line 110
    invoke-static {v3, p1, p2, v0}, Lcom/zykj/mistake/feature/ask/o0;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 111
    .line 112
    .line 113
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_6
    const v0, -0x286f0659

    .line 118
    .line 119
    .line 120
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 121
    .line 122
    .line 123
    and-int/lit8 v0, v1, 0x70

    .line 124
    .line 125
    or-int/lit8 v0, v0, 0x6

    .line 126
    .line 127
    const-string v1, "\u52a0\u8f7d\u4e2d"

    .line 128
    .line 129
    invoke-static {v1, p1, p2, v0}, Lcom/zykj/mistake/feature/ask/o0;->m(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 130
    .line 131
    .line 132
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 133
    .line 134
    .line 135
    :goto_4
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 136
    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_7
    const p0, 0x514675dd

    .line 140
    .line 141
    .line 142
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 143
    .line 144
    .line 145
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 146
    .line 147
    .line 148
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 149
    .line 150
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 151
    .line 152
    .line 153
    throw p0

    .line 154
    :cond_8
    const v0, 0x51468fd4

    .line 155
    .line 156
    .line 157
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 158
    .line 159
    .line 160
    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/y;->g:Lcom/zykj/mistake/feature/ask/c0;

    .line 161
    .line 162
    and-int/lit8 v1, v1, 0x70

    .line 163
    .line 164
    invoke-static {v0, p1, p2, v1}, Lcom/zykj/mistake/feature/ask/o0;->l(Lcom/zykj/mistake/feature/ask/c0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 165
    .line 166
    .line 167
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 168
    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_9
    const v0, 0x51467d45

    .line 172
    .line 173
    .line 174
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 175
    .line 176
    .line 177
    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/y;->d:Ljava/lang/String;

    .line 178
    .line 179
    and-int/lit8 v1, v1, 0x70

    .line 180
    .line 181
    invoke-static {v0, p1, p2, v1}, Lcom/zykj/mistake/feature/ask/o0;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 182
    .line 183
    .line 184
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 185
    .line 186
    .line 187
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_b

    .line 192
    .line 193
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 194
    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_a
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 198
    .line 199
    .line 200
    :cond_b
    :goto_6
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    if-eqz p2, :cond_c

    .line 205
    .line 206
    new-instance v0, Landroidx/navigation/compose/b;

    .line 207
    .line 208
    const/4 v1, 0x2

    .line 209
    invoke-direct {v0, p3, v1, p0, p1}, Landroidx/navigation/compose/b;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 213
    .line 214
    .line 215
    :cond_c
    return-void
.end method

.method public static final j(Lcom/zykj/mistake/feature/ask/z;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "state"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "onIntent"

    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v3, 0x5134c984

    .line 18
    .line 19
    .line 20
    move-object/from16 v4, p2

    .line 21
    .line 22
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    and-int/lit8 v5, v2, 0x6

    .line 27
    .line 28
    if-nez v5, :cond_1

    .line 29
    .line 30
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    const/4 v5, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v5, 0x2

    .line 39
    :goto_0
    or-int/2addr v5, v2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v5, v2

    .line 42
    :goto_1
    and-int/lit8 v6, v2, 0x30

    .line 43
    .line 44
    if-nez v6, :cond_3

    .line 45
    .line 46
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_2

    .line 51
    .line 52
    const/16 v6, 0x20

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v6, 0x10

    .line 56
    .line 57
    :goto_2
    or-int/2addr v5, v6

    .line 58
    :cond_3
    and-int/lit8 v6, v5, 0x13

    .line 59
    .line 60
    const/16 v7, 0x12

    .line 61
    .line 62
    const/4 v8, 0x1

    .line 63
    const/4 v9, 0x0

    .line 64
    if-eq v6, v7, :cond_4

    .line 65
    .line 66
    move v6, v8

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    move v6, v9

    .line 69
    :goto_3
    and-int/lit8 v7, v5, 0x1

    .line 70
    .line 71
    invoke-interface {v4, v6, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_e

    .line 76
    .line 77
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_5

    .line 82
    .line 83
    const/4 v6, -0x1

    .line 84
    const-string v7, "com.zykj.mistake.feature.ask.MistakeAskMaterialScreen (MistakeAskMaterialScreen.kt:62)"

    .line 85
    .line 86
    invoke-static {v3, v5, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_5
    sget-object v11, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    const/4 v6, 0x0

    .line 93
    invoke-static {v11, v3, v8, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 94
    .line 95
    .line 96
    move-result-object v12

    .line 97
    const/16 v16, 0x2

    .line 98
    .line 99
    const/16 v17, 0x0

    .line 100
    .line 101
    sget-wide v13, Lcom/zykj/mistake/feature/ask/o0;->b:J

    .line 102
    .line 103
    const/4 v15, 0x0

    .line 104
    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    sget-object v16, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 109
    .line 110
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    sget-object v17, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 115
    .line 116
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 117
    .line 118
    .line 119
    move-result-object v12

    .line 120
    invoke-static {v10, v12, v4, v9}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    invoke-static {v4, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 125
    .line 126
    .line 127
    move-result v12

    .line 128
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    invoke-static {v4, v7}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 137
    .line 138
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 139
    .line 140
    .line 141
    move-result-object v15

    .line 142
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 143
    .line 144
    .line 145
    move-result-object v18

    .line 146
    if-nez v18, :cond_6

    .line 147
    .line 148
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 149
    .line 150
    .line 151
    :cond_6
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 152
    .line 153
    .line 154
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 155
    .line 156
    .line 157
    move-result v18

    .line 158
    if-eqz v18, :cond_7

    .line 159
    .line 160
    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_7
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 165
    .line 166
    .line 167
    :goto_4
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 168
    .line 169
    .line 170
    move-result-object v15

    .line 171
    invoke-static {v14, v15, v10, v15, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 176
    .line 177
    .line 178
    move-result v13

    .line 179
    if-nez v13, :cond_8

    .line 180
    .line 181
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v13

    .line 185
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-nez v3, :cond_9

    .line 194
    .line 195
    :cond_8
    invoke-static {v12, v15, v12, v10}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 196
    .line 197
    .line 198
    :cond_9
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-static {v15, v7, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 203
    .line 204
    .line 205
    sget-object v10, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 206
    .line 207
    and-int/lit8 v3, v5, 0x7e

    .line 208
    .line 209
    invoke-static {v0, v1, v4, v3}, Lcom/zykj/mistake/feature/ask/o0;->f(Lcom/zykj/mistake/feature/ask/z;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 210
    .line 211
    .line 212
    invoke-static {v6, v4, v9}, Ly4/g;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 213
    .line 214
    .line 215
    move-object v5, v14

    .line 216
    const/4 v14, 0x2

    .line 217
    const/4 v15, 0x0

    .line 218
    const/high16 v12, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const/4 v13, 0x0

    .line 221
    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    const/4 v10, 0x0

    .line 226
    invoke-static {v7, v10, v8, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 227
    .line 228
    .line 229
    move-result-object v6

    .line 230
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    invoke-static {v7, v8, v4, v9}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    invoke-static {v4, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 243
    .line 244
    .line 245
    move-result v8

    .line 246
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 247
    .line 248
    .line 249
    move-result-object v10

    .line 250
    invoke-static {v4, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 255
    .line 256
    .line 257
    move-result-object v11

    .line 258
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 259
    .line 260
    .line 261
    move-result-object v12

    .line 262
    if-nez v12, :cond_a

    .line 263
    .line 264
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 265
    .line 266
    .line 267
    :cond_a
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 268
    .line 269
    .line 270
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 271
    .line 272
    .line 273
    move-result v12

    .line 274
    if-eqz v12, :cond_b

    .line 275
    .line 276
    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 277
    .line 278
    .line 279
    goto :goto_5

    .line 280
    :cond_b
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 281
    .line 282
    .line 283
    :goto_5
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 284
    .line 285
    .line 286
    move-result-object v11

    .line 287
    invoke-static {v5, v11, v7, v11, v10}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    if-nez v10, :cond_c

    .line 296
    .line 297
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v10

    .line 301
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 302
    .line 303
    .line 304
    move-result-object v12

    .line 305
    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v10

    .line 309
    if-nez v10, :cond_d

    .line 310
    .line 311
    :cond_c
    invoke-static {v8, v11, v8, v7}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 312
    .line 313
    .line 314
    :cond_d
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    invoke-static {v11, v6, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 319
    .line 320
    .line 321
    sget-object v5, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 322
    .line 323
    invoke-static {v0, v1, v4, v3}, Lcom/zykj/mistake/feature/ask/o0;->d(Lcom/zykj/mistake/feature/ask/z;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 324
    .line 325
    .line 326
    invoke-static {v0, v1, v4, v3}, Lcom/zykj/mistake/feature/ask/o0;->c(Lcom/zykj/mistake/feature/ask/z;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 327
    .line 328
    .line 329
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 330
    .line 331
    .line 332
    invoke-static {v0, v1, v4, v3}, Lcom/zykj/mistake/feature/ask/o0;->a(Lcom/zykj/mistake/feature/ask/z;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 333
    .line 334
    .line 335
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 336
    .line 337
    .line 338
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    if-eqz v3, :cond_f

    .line 343
    .line 344
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 345
    .line 346
    .line 347
    goto :goto_6

    .line 348
    :cond_e
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 349
    .line 350
    .line 351
    :cond_f
    :goto_6
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    if-eqz v3, :cond_10

    .line 356
    .line 357
    new-instance v4, Lcom/zykj/mistake/feature/ask/d0;

    .line 358
    .line 359
    invoke-direct {v4, v0, v1, v2, v9}, Lcom/zykj/mistake/feature/ask/d0;-><init>(Lcom/zykj/mistake/feature/ask/z;Lr6/c;II)V

    .line 360
    .line 361
    .line 362
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 363
    .line 364
    .line 365
    :cond_10
    return-void
.end method

.method public static final k(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    .line 1
    const v0, -0x3b0bc94a

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object v8

    .line 8
    and-int/lit8 p2, p3, 0x6

    .line 9
    .line 10
    if-nez p2, :cond_1

    .line 11
    .line 12
    invoke-interface {v8, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    const/4 p2, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p2, 0x2

    .line 21
    :goto_0
    or-int/2addr p2, p3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move p2, p3

    .line 24
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 25
    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    invoke-interface {v8, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    const/16 v1, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v1, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr p2, v1

    .line 40
    :cond_3
    and-int/lit8 v1, p2, 0x13

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    const/16 v3, 0x12

    .line 44
    .line 45
    if-eq v1, v3, :cond_4

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    goto :goto_3

    .line 49
    :cond_4
    move v1, v2

    .line 50
    :goto_3
    and-int/lit8 v4, p2, 0x1

    .line 51
    .line 52
    invoke-interface {v8, v1, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_7

    .line 57
    .line 58
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_5

    .line 63
    .line 64
    const/4 v1, -0x1

    .line 65
    const-string v4, "com.zykj.mistake.feature.ask.SelectIcon (MistakeAskMaterialScreen.kt:408)"

    .line 66
    .line 67
    invoke-static {v0, p2, v1, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_5
    if-eqz p0, :cond_6

    .line 71
    .line 72
    sget p2, Lcom/zykj/mistake/R$drawable;->ic_mistake_selected:I

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_6
    sget p2, Lcom/zykj/mistake/R$drawable;->ic_mistake_unselected:I

    .line 76
    .line 77
    :goto_4
    invoke-static {p2, v8, v2}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    int-to-float p2, v3

    .line 82
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    const/16 v9, 0x30

    .line 91
    .line 92
    const/16 v10, 0x78

    .line 93
    .line 94
    const/4 v2, 0x0

    .line 95
    const/4 v4, 0x0

    .line 96
    const/4 v5, 0x0

    .line 97
    const/4 v6, 0x0

    .line 98
    const/4 v7, 0x0

    .line 99
    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 100
    .line 101
    .line 102
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    if-eqz p2, :cond_8

    .line 107
    .line 108
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 109
    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_7
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 113
    .line 114
    .line 115
    :cond_8
    :goto_5
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    if-eqz p2, :cond_9

    .line 120
    .line 121
    new-instance v0, Lcom/zykj/mistake/feature/ask/i0;

    .line 122
    .line 123
    const/4 v1, 0x0

    .line 124
    invoke-direct {v0, p0, p1, p3, v1}, Lcom/zykj/mistake/feature/ask/i0;-><init>(ZLandroidx/compose/ui/Modifier;II)V

    .line 125
    .line 126
    .line 127
    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 128
    .line 129
    .line 130
    :cond_9
    return-void
.end method

.method public static final l(Lcom/zykj/mistake/feature/ask/c0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v7, p3

    .line 6
    .line 7
    const v2, 0x2d6776

    .line 8
    .line 9
    .line 10
    move-object/from16 v3, p2

    .line 11
    .line 12
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v15

    .line 16
    and-int/lit8 v3, v7, 0x6

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v3, 0x2

    .line 29
    :goto_0
    or-int/2addr v3, v7

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v3, v7

    .line 32
    :goto_1
    and-int/lit8 v4, v7, 0x30

    .line 33
    .line 34
    if-nez v4, :cond_3

    .line 35
    .line 36
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    const/16 v4, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v4, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v3, v4

    .line 48
    :cond_3
    and-int/lit8 v4, v3, 0x13

    .line 49
    .line 50
    const/16 v5, 0x12

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v9, 0x1

    .line 54
    if-eq v4, v5, :cond_4

    .line 55
    .line 56
    move v4, v9

    .line 57
    goto :goto_3

    .line 58
    :cond_4
    move v4, v8

    .line 59
    :goto_3
    and-int/lit8 v5, v3, 0x1

    .line 60
    .line 61
    invoke-interface {v15, v4, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_c

    .line 66
    .line 67
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_5

    .line 72
    .line 73
    const/4 v4, -0x1

    .line 74
    const-string v5, "com.zykj.mistake.feature.ask.TextAnswerMaterialPreview (MistakeAskMaterialScreen.kt:367)"

    .line 75
    .line 76
    invoke-static {v2, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_5
    if-nez v0, :cond_7

    .line 80
    .line 81
    const v2, -0x5c41e70b

    .line 82
    .line 83
    .line 84
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 85
    .line 86
    .line 87
    and-int/lit8 v2, v3, 0x70

    .line 88
    .line 89
    or-int/lit8 v2, v2, 0x6

    .line 90
    .line 91
    const-string v3, "\u7b54\u6848"

    .line 92
    .line 93
    invoke-static {v3, v1, v15, v2}, Lcom/zykj/mistake/feature/ask/o0;->m(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 97
    .line 98
    .line 99
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_6

    .line 104
    .line 105
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 106
    .line 107
    .line 108
    :cond_6
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    if-eqz v2, :cond_e

    .line 113
    .line 114
    new-instance v3, Lcom/zykj/mistake/feature/ask/k0;

    .line 115
    .line 116
    invoke-direct {v3, v0, v1, v7, v8}, Lcom/zykj/mistake/feature/ask/k0;-><init>(Lcom/zykj/mistake/feature/ask/c0;Landroidx/compose/ui/Modifier;II)V

    .line 117
    .line 118
    .line 119
    invoke-interface {v2, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_7
    const v2, -0x5d0b5e34

    .line 124
    .line 125
    .line 126
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 130
    .line 131
    .line 132
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 133
    .line 134
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 135
    .line 136
    .line 137
    move-result-wide v2

    .line 138
    const/4 v5, 0x2

    .line 139
    const/4 v6, 0x0

    .line 140
    const/4 v4, 0x0

    .line 141
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    const/16 v3, 0xc

    .line 146
    .line 147
    int-to-float v3, v3

    .line 148
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 157
    .line 158
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 163
    .line 164
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    const/16 v10, 0x30

    .line 169
    .line 170
    invoke-static {v6, v4, v15, v10}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-static {v15, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    invoke-static {v15, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 187
    .line 188
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 189
    .line 190
    .line 191
    move-result-object v11

    .line 192
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 193
    .line 194
    .line 195
    move-result-object v12

    .line 196
    if-nez v12, :cond_8

    .line 197
    .line 198
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 199
    .line 200
    .line 201
    :cond_8
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 202
    .line 203
    .line 204
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    if-eqz v12, :cond_9

    .line 209
    .line 210
    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 211
    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_9
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 215
    .line 216
    .line 217
    :goto_4
    invoke-static {v15}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 218
    .line 219
    .line 220
    move-result-object v11

    .line 221
    invoke-static {v10, v11, v4, v11, v8}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    if-nez v8, :cond_a

    .line 230
    .line 231
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 236
    .line 237
    .line 238
    move-result-object v12

    .line 239
    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v8

    .line 243
    if-nez v8, :cond_b

    .line 244
    .line 245
    :cond_a
    invoke-static {v6, v11, v6, v4}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 246
    .line 247
    .line 248
    :cond_b
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    invoke-static {v11, v2, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 253
    .line 254
    .line 255
    sget-object v2, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 256
    .line 257
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 258
    .line 259
    const/4 v4, 0x0

    .line 260
    const/4 v6, 0x0

    .line 261
    invoke-static {v2, v4, v9, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    const/16 v2, 0x8

    .line 266
    .line 267
    int-to-float v2, v2

    .line 268
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-virtual {v5, v4, v3}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-D5KLDUw(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    invoke-virtual {v5, v2}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 285
    .line 286
    .line 287
    move-result-object v10

    .line 288
    new-instance v2, Landroidx/navigation/serialization/b;

    .line 289
    .line 290
    invoke-direct {v2, v0, v9}, Landroidx/navigation/serialization/b;-><init>(Ljava/lang/Object;I)V

    .line 291
    .line 292
    .line 293
    const/16 v4, 0x36

    .line 294
    .line 295
    const v5, -0xdbb45c1

    .line 296
    .line 297
    .line 298
    invoke-static {v5, v9, v2, v15, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 299
    .line 300
    .line 301
    move-result-object v14

    .line 302
    const v16, 0x1801b6

    .line 303
    .line 304
    .line 305
    const/16 v17, 0x38

    .line 306
    .line 307
    const/4 v11, 0x0

    .line 308
    const/4 v12, 0x0

    .line 309
    const/4 v13, 0x0

    .line 310
    move v2, v9

    .line 311
    move-object v9, v3

    .line 312
    invoke-static/range {v8 .. v17}, Landroidx/compose/foundation/layout/FlowLayoutKt;->FlowRow(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILr6/f;Landroidx/compose/runtime/Composer;II)V

    .line 313
    .line 314
    .line 315
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 316
    .line 317
    .line 318
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    if-eqz v3, :cond_d

    .line 323
    .line 324
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 325
    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_c
    move v2, v9

    .line 329
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 330
    .line 331
    .line 332
    :cond_d
    :goto_5
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    if-eqz v3, :cond_e

    .line 337
    .line 338
    new-instance v4, Lcom/zykj/mistake/feature/ask/k0;

    .line 339
    .line 340
    invoke-direct {v4, v0, v1, v7, v2}, Lcom/zykj/mistake/feature/ask/k0;-><init>(Lcom/zykj/mistake/feature/ask/c0;Landroidx/compose/ui/Modifier;II)V

    .line 341
    .line 342
    .line 343
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 344
    .line 345
    .line 346
    :cond_e
    return-void
.end method

.method public static final m(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const v2, -0x603e2c5a

    .line 6
    .line 7
    .line 8
    move-object/from16 v3, p2

    .line 9
    .line 10
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v7

    .line 14
    and-int/lit8 v3, p3, 0x6

    .line 15
    .line 16
    if-nez v3, :cond_1

    .line 17
    .line 18
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    const/4 v3, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v3, 0x2

    .line 27
    :goto_0
    or-int v3, p3, v3

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move/from16 v3, p3

    .line 31
    .line 32
    :goto_1
    and-int/lit8 v4, p3, 0x30

    .line 33
    .line 34
    if-nez v4, :cond_3

    .line 35
    .line 36
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    const/16 v4, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v4, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v3, v4

    .line 48
    :cond_3
    move v8, v3

    .line 49
    and-int/lit8 v3, v8, 0x13

    .line 50
    .line 51
    const/16 v4, 0x12

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    if-eq v3, v4, :cond_4

    .line 55
    .line 56
    const/4 v3, 0x1

    .line 57
    goto :goto_3

    .line 58
    :cond_4
    move v3, v9

    .line 59
    :goto_3
    and-int/lit8 v4, v8, 0x1

    .line 60
    .line 61
    invoke-interface {v7, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_a

    .line 66
    .line 67
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_5

    .line 72
    .line 73
    const/4 v3, -0x1

    .line 74
    const-string v4, "com.zykj.mistake.feature.ask.WebMaterialPlaceholder (MistakeAskMaterialScreen.kt:352)"

    .line 75
    .line 76
    invoke-static {v2, v8, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_5
    const-wide v2, 0xfff5f7faL

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v2

    .line 88
    const/4 v5, 0x2

    .line 89
    const/4 v6, 0x0

    .line 90
    const/4 v4, 0x0

    .line 91
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 96
    .line 97
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-static {v1, v9}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-static {v7, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-static {v7, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 118
    .line 119
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    if-nez v10, :cond_6

    .line 128
    .line 129
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 130
    .line 131
    .line 132
    :cond_6
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 133
    .line 134
    .line 135
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    if-eqz v10, :cond_7

    .line 140
    .line 141
    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_7
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 146
    .line 147
    .line 148
    :goto_4
    invoke-static {v7}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-static {v5, v6, v1, v6, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-nez v4, :cond_8

    .line 161
    .line 162
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    if-nez v4, :cond_9

    .line 175
    .line 176
    :cond_8
    invoke-static {v3, v6, v3, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 177
    .line 178
    .line 179
    :cond_9
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-static {v6, v2, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 184
    .line 185
    .line 186
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 187
    .line 188
    const/16 v1, 0xe

    .line 189
    .line 190
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 191
    .line 192
    .line 193
    move-result-wide v4

    .line 194
    and-int/2addr v1, v8

    .line 195
    or-int/lit16 v1, v1, 0xd80

    .line 196
    .line 197
    const/16 v23, 0x0

    .line 198
    .line 199
    const v24, 0x1fff2

    .line 200
    .line 201
    .line 202
    move/from16 v22, v1

    .line 203
    .line 204
    const/4 v1, 0x0

    .line 205
    sget-wide v2, Lcom/zykj/mistake/feature/ask/o0;->f:J

    .line 206
    .line 207
    const/4 v6, 0x0

    .line 208
    move-object/from16 v21, v7

    .line 209
    .line 210
    const/4 v7, 0x0

    .line 211
    const/4 v8, 0x0

    .line 212
    move v11, v9

    .line 213
    const-wide/16 v9, 0x0

    .line 214
    .line 215
    move v12, v11

    .line 216
    const/4 v11, 0x0

    .line 217
    move v13, v12

    .line 218
    const/4 v12, 0x0

    .line 219
    move v15, v13

    .line 220
    const-wide/16 v13, 0x0

    .line 221
    .line 222
    move/from16 v16, v15

    .line 223
    .line 224
    const/4 v15, 0x0

    .line 225
    move/from16 v17, v16

    .line 226
    .line 227
    const/16 v16, 0x0

    .line 228
    .line 229
    move/from16 v18, v17

    .line 230
    .line 231
    const/16 v17, 0x0

    .line 232
    .line 233
    move/from16 v19, v18

    .line 234
    .line 235
    const/16 v18, 0x0

    .line 236
    .line 237
    move/from16 v20, v19

    .line 238
    .line 239
    const/16 v19, 0x0

    .line 240
    .line 241
    move/from16 v25, v20

    .line 242
    .line 243
    const/16 v20, 0x0

    .line 244
    .line 245
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 246
    .line 247
    .line 248
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 249
    .line 250
    .line 251
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-eqz v1, :cond_b

    .line 256
    .line 257
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 258
    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_a
    move-object/from16 v21, v7

    .line 262
    .line 263
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 264
    .line 265
    .line 266
    :cond_b
    :goto_5
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    if-eqz v1, :cond_c

    .line 271
    .line 272
    new-instance v2, Lcom/zykj/mistake/feature/ask/j0;

    .line 273
    .line 274
    move-object/from16 v3, p1

    .line 275
    .line 276
    move/from16 v4, p3

    .line 277
    .line 278
    const/4 v12, 0x0

    .line 279
    invoke-direct {v2, v0, v3, v4, v12}, Lcom/zykj/mistake/feature/ask/j0;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;II)V

    .line 280
    .line 281
    .line 282
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 283
    .line 284
    .line 285
    :cond_c
    return-void
.end method
