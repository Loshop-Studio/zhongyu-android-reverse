.class public final synthetic Lcom/zykj/mistake/feature/collection/component/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Z

.field public final synthetic f:J

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:F

.field public final synthetic i:F

.field public final synthetic j:F

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:F

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/lang/Integer;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Landroidx/compose/ui/focus/FocusRequester;

.field public final synthetic q:Lr6/c;

.field public final synthetic r:F

.field public final synthetic s:F

.field public final synthetic t:Lr6/a;

.field public final synthetic u:F

.field public final synthetic v:Z

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lr6/a;


# direct methods
.method public synthetic constructor <init>(FFFLjava/lang/String;ZJLjava/lang/String;FFFLjava/lang/String;FLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Landroidx/compose/ui/focus/FocusRequester;Lr6/c;FFLr6/a;FZLjava/lang/String;Ljava/lang/String;Lr6/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/mistake/feature/collection/component/d;->a:F

    iput p2, p0, Lcom/zykj/mistake/feature/collection/component/d;->b:F

    iput p3, p0, Lcom/zykj/mistake/feature/collection/component/d;->c:F

    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/component/d;->d:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/zykj/mistake/feature/collection/component/d;->e:Z

    iput-wide p6, p0, Lcom/zykj/mistake/feature/collection/component/d;->f:J

    iput-object p8, p0, Lcom/zykj/mistake/feature/collection/component/d;->g:Ljava/lang/String;

    iput p9, p0, Lcom/zykj/mistake/feature/collection/component/d;->h:F

    iput p10, p0, Lcom/zykj/mistake/feature/collection/component/d;->i:F

    iput p11, p0, Lcom/zykj/mistake/feature/collection/component/d;->j:F

    iput-object p12, p0, Lcom/zykj/mistake/feature/collection/component/d;->k:Ljava/lang/String;

    iput p13, p0, Lcom/zykj/mistake/feature/collection/component/d;->l:F

    iput-object p14, p0, Lcom/zykj/mistake/feature/collection/component/d;->m:Ljava/lang/String;

    iput-object p15, p0, Lcom/zykj/mistake/feature/collection/component/d;->n:Ljava/lang/Integer;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/component/d;->o:Ljava/lang/String;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/component/d;->p:Landroidx/compose/ui/focus/FocusRequester;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/component/d;->q:Lr6/c;

    move/from16 p1, p19

    iput p1, p0, Lcom/zykj/mistake/feature/collection/component/d;->r:F

    move/from16 p1, p20

    iput p1, p0, Lcom/zykj/mistake/feature/collection/component/d;->s:F

    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/component/d;->t:Lr6/a;

    move/from16 p1, p22

    iput p1, p0, Lcom/zykj/mistake/feature/collection/component/d;->u:F

    move/from16 p1, p23

    iput-boolean p1, p0, Lcom/zykj/mistake/feature/collection/component/d;->v:Z

    move-object/from16 p1, p24

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/component/d;->w:Ljava/lang/String;

    move-object/from16 p1, p25

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/component/d;->x:Ljava/lang/String;

    move-object/from16 p1, p26

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/component/d;->y:Lr6/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 51

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    check-cast v8, Landroidx/compose/runtime/Composer;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x2

    .line 20
    if-eq v2, v5, :cond_0

    .line 21
    .line 22
    move v2, v3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v4

    .line 25
    :goto_0
    and-int/lit8 v6, v1, 0x1

    .line 26
    .line 27
    invoke-interface {v8, v2, v6}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_21

    .line 32
    .line 33
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    const/4 v2, -0x1

    .line 40
    const-string v6, "com.zykj.mistake.feature.collection.component.MistakeCollectionNameDialog.<anonymous> (MistakeCollectionNameDialog.kt:81)"

    .line 41
    .line 42
    const v7, -0x6ae145e2

    .line 43
    .line 44
    .line 45
    invoke-static {v7, v1, v2, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 49
    .line 50
    iget v2, v0, Lcom/zykj/mistake/feature/collection/component/d;->a:F

    .line 51
    .line 52
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    sget-object v26, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 57
    .line 58
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 59
    .line 60
    .line 61
    move-result-wide v6

    .line 62
    const/4 v9, 0x4

    .line 63
    int-to-float v9, v9

    .line 64
    invoke-static {v9, v2, v6, v7}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iget v6, v0, Lcom/zykj/mistake/feature/collection/component/d;->b:F

    .line 69
    .line 70
    iget v7, v0, Lcom/zykj/mistake/feature/collection/component/d;->c:F

    .line 71
    .line 72
    invoke-static {v2, v6, v7}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    sget-object v27, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 77
    .line 78
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    sget-object v28, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 83
    .line 84
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    const/16 v9, 0x30

    .line 89
    .line 90
    invoke-static {v7, v6, v8, v9}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-static {v8, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    invoke-static {v8, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 107
    .line 108
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 109
    .line 110
    .line 111
    move-result-object v12

    .line 112
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 113
    .line 114
    .line 115
    move-result-object v13

    .line 116
    if-nez v13, :cond_2

    .line 117
    .line 118
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 119
    .line 120
    .line 121
    :cond_2
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 122
    .line 123
    .line 124
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 125
    .line 126
    .line 127
    move-result v13

    .line 128
    if-eqz v13, :cond_3

    .line 129
    .line 130
    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 135
    .line 136
    .line 137
    :goto_1
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    invoke-static {v11, v12, v6, v12, v10}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    if-nez v10, :cond_4

    .line 150
    .line 151
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v13

    .line 159
    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    if-nez v10, :cond_5

    .line 164
    .line 165
    :cond_4
    invoke-static {v7, v12, v7, v6}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 166
    .line 167
    .line 168
    :cond_5
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    invoke-static {v12, v2, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 173
    .line 174
    .line 175
    sget-object v2, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 176
    .line 177
    iget-boolean v2, v0, Lcom/zykj/mistake/feature/collection/component/d;->e:Z

    .line 178
    .line 179
    if-eqz v2, :cond_6

    .line 180
    .line 181
    const-wide v6, 0xff333333L

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    :goto_2
    invoke-static {v6, v7}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 187
    .line 188
    .line 189
    move-result-wide v6

    .line 190
    goto :goto_3

    .line 191
    :cond_6
    const-wide v6, 0xff15171aL

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :goto_3
    sget-object v10, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 198
    .line 199
    invoke-virtual {v10}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    const/16 v24, 0x0

    .line 204
    .line 205
    const v25, 0x1ffd2

    .line 206
    .line 207
    .line 208
    move-object v12, v1

    .line 209
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/component/d;->d:Ljava/lang/String;

    .line 210
    .line 211
    move v13, v2

    .line 212
    const/4 v2, 0x0

    .line 213
    move v14, v4

    .line 214
    move v15, v5

    .line 215
    move-wide/from16 v49, v6

    .line 216
    .line 217
    move v7, v3

    .line 218
    move-wide/from16 v3, v49

    .line 219
    .line 220
    iget-wide v5, v0, Lcom/zykj/mistake/feature/collection/component/d;->f:J

    .line 221
    .line 222
    move/from16 v16, v7

    .line 223
    .line 224
    const/4 v7, 0x0

    .line 225
    move/from16 v17, v9

    .line 226
    .line 227
    const/4 v9, 0x0

    .line 228
    move-object/from16 v22, v8

    .line 229
    .line 230
    move-object v8, v10

    .line 231
    move-object/from16 v18, v11

    .line 232
    .line 233
    const-wide/16 v10, 0x0

    .line 234
    .line 235
    move-object/from16 v19, v12

    .line 236
    .line 237
    const/4 v12, 0x0

    .line 238
    move/from16 v20, v13

    .line 239
    .line 240
    const/4 v13, 0x0

    .line 241
    move/from16 v21, v14

    .line 242
    .line 243
    move/from16 v23, v15

    .line 244
    .line 245
    const-wide/16 v14, 0x0

    .line 246
    .line 247
    move/from16 v29, v16

    .line 248
    .line 249
    const/16 v16, 0x0

    .line 250
    .line 251
    move/from16 v30, v17

    .line 252
    .line 253
    const/16 v17, 0x0

    .line 254
    .line 255
    move-object/from16 v31, v18

    .line 256
    .line 257
    const/16 v18, 0x0

    .line 258
    .line 259
    move-object/from16 v32, v19

    .line 260
    .line 261
    const/16 v19, 0x0

    .line 262
    .line 263
    move/from16 v33, v20

    .line 264
    .line 265
    const/16 v20, 0x0

    .line 266
    .line 267
    move/from16 v34, v21

    .line 268
    .line 269
    const/16 v21, 0x0

    .line 270
    .line 271
    move/from16 v35, v23

    .line 272
    .line 273
    const v23, 0x30c00

    .line 274
    .line 275
    .line 276
    move-object/from16 v36, v32

    .line 277
    .line 278
    invoke-static/range {v1 .. v25}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 279
    .line 280
    .line 281
    move-object/from16 v8, v22

    .line 282
    .line 283
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/component/d;->g:Ljava/lang/String;

    .line 284
    .line 285
    iget v11, v0, Lcom/zykj/mistake/feature/collection/component/d;->h:F

    .line 286
    .line 287
    iget v2, v0, Lcom/zykj/mistake/feature/collection/component/d;->i:F

    .line 288
    .line 289
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/component/d;->k:Ljava/lang/String;

    .line 290
    .line 291
    move-object v4, v1

    .line 292
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/component/d;->m:Ljava/lang/String;

    .line 293
    .line 294
    iget-object v5, v0, Lcom/zykj/mistake/feature/collection/component/d;->n:Ljava/lang/Integer;

    .line 295
    .line 296
    move-object v6, v3

    .line 297
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/component/d;->o:Ljava/lang/String;

    .line 298
    .line 299
    move-object v7, v1

    .line 300
    move-object v1, v4

    .line 301
    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/component/d;->p:Landroidx/compose/ui/focus/FocusRequester;

    .line 302
    .line 303
    move-object/from16 v16, v1

    .line 304
    .line 305
    move-object v1, v7

    .line 306
    iget-object v7, v0, Lcom/zykj/mistake/feature/collection/component/d;->q:Lr6/c;

    .line 307
    .line 308
    const/4 v9, 0x5

    .line 309
    const-wide v29, 0xffff4d4fL

    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    const-wide v34, 0xffe6e8ebL

    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    const/16 v32, 0xf

    .line 320
    .line 321
    const/4 v10, 0x0

    .line 322
    if-eqz v33, :cond_c

    .line 323
    .line 324
    if-nez v16, :cond_c

    .line 325
    .line 326
    const v13, -0x714b54f8

    .line 327
    .line 328
    .line 329
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 330
    .line 331
    .line 332
    move v15, v9

    .line 333
    move-object/from16 v13, v36

    .line 334
    .line 335
    const/4 v14, 0x1

    .line 336
    invoke-static {v13, v10, v14, v12}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    move/from16 v16, v14

    .line 341
    .line 342
    const/16 v14, 0xd

    .line 343
    .line 344
    move/from16 v17, v15

    .line 345
    .line 346
    const/4 v15, 0x0

    .line 347
    move/from16 v18, v10

    .line 348
    .line 349
    const/4 v10, 0x0

    .line 350
    move-object/from16 v19, v12

    .line 351
    .line 352
    const/4 v12, 0x0

    .line 353
    const/4 v13, 0x0

    .line 354
    move-object/from16 p1, v1

    .line 355
    .line 356
    move-object/from16 v17, v3

    .line 357
    .line 358
    move/from16 v1, v16

    .line 359
    .line 360
    move-object/from16 v3, v19

    .line 361
    .line 362
    move-object/from16 v41, v36

    .line 363
    .line 364
    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 365
    .line 366
    .line 367
    move-result-object v9

    .line 368
    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    int-to-float v9, v1

    .line 373
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 374
    .line 375
    .line 376
    move-result v9

    .line 377
    invoke-static/range {v34 .. v35}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 378
    .line 379
    .line 380
    move-result-wide v10

    .line 381
    const/4 v12, 0x2

    .line 382
    int-to-float v13, v12

    .line 383
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 384
    .line 385
    .line 386
    move-result v13

    .line 387
    invoke-static {v13}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 388
    .line 389
    .line 390
    move-result-object v13

    .line 391
    invoke-static {v2, v9, v10, v11, v13}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    iget v9, v0, Lcom/zykj/mistake/feature/collection/component/d;->j:F

    .line 396
    .line 397
    const/4 v10, 0x0

    .line 398
    invoke-static {v2, v9, v10, v12, v3}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getCenterStart()Landroidx/compose/ui/Alignment;

    .line 403
    .line 404
    .line 405
    move-result-object v9

    .line 406
    const/4 v11, 0x0

    .line 407
    invoke-static {v9, v11}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 408
    .line 409
    .line 410
    move-result-object v9

    .line 411
    invoke-static {v8, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 412
    .line 413
    .line 414
    move-result v12

    .line 415
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 416
    .line 417
    .line 418
    move-result-object v13

    .line 419
    invoke-static {v8, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 424
    .line 425
    .line 426
    move-result-object v14

    .line 427
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 428
    .line 429
    .line 430
    move-result-object v15

    .line 431
    if-nez v15, :cond_7

    .line 432
    .line 433
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 434
    .line 435
    .line 436
    :cond_7
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 437
    .line 438
    .line 439
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 440
    .line 441
    .line 442
    move-result v15

    .line 443
    if-eqz v15, :cond_8

    .line 444
    .line 445
    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 446
    .line 447
    .line 448
    goto :goto_4

    .line 449
    :cond_8
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 450
    .line 451
    .line 452
    :goto_4
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 453
    .line 454
    .line 455
    move-result-object v14

    .line 456
    move-object/from16 v15, v31

    .line 457
    .line 458
    invoke-static {v15, v14, v9, v14, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 459
    .line 460
    .line 461
    move-result-object v9

    .line 462
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 463
    .line 464
    .line 465
    move-result v13

    .line 466
    if-nez v13, :cond_9

    .line 467
    .line 468
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v13

    .line 472
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    if-nez v1, :cond_a

    .line 481
    .line 482
    :cond_9
    invoke-static {v12, v14, v12, v9}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 483
    .line 484
    .line 485
    :cond_a
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    invoke-static {v14, v2, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 490
    .line 491
    .line 492
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 493
    .line 494
    move-object v2, v5

    .line 495
    move-object v1, v6

    .line 496
    invoke-static/range {v32 .. v32}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 497
    .line 498
    .line 499
    move-result-wide v5

    .line 500
    const/16 v9, 0x6c00

    .line 501
    .line 502
    move-object v13, v3

    .line 503
    move v12, v10

    .line 504
    move-object/from16 v3, v17

    .line 505
    .line 506
    const/4 v14, 0x1

    .line 507
    move-object v10, v1

    .line 508
    move-object/from16 v1, p1

    .line 509
    .line 510
    invoke-static/range {v1 .. v9}, Lcom/zykj/mistake/feature/collection/component/f;->c(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Landroidx/compose/ui/focus/FocusRequester;JLr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 511
    .line 512
    .line 513
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 514
    .line 515
    .line 516
    invoke-static {v10}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 517
    .line 518
    .line 519
    move-result v1

    .line 520
    if-nez v1, :cond_b

    .line 521
    .line 522
    const v1, -0x713f01a1

    .line 523
    .line 524
    .line 525
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 526
    .line 527
    .line 528
    invoke-static/range {v29 .. v30}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 529
    .line 530
    .line 531
    move-result-wide v3

    .line 532
    invoke-static/range {v32 .. v32}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 533
    .line 534
    .line 535
    move-result-wide v5

    .line 536
    move-object/from16 v1, v41

    .line 537
    .line 538
    invoke-static {v1, v12, v14, v13}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 539
    .line 540
    .line 541
    move-result-object v16

    .line 542
    const/4 v7, 0x5

    .line 543
    int-to-float v2, v7

    .line 544
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 545
    .line 546
    .line 547
    move-result v18

    .line 548
    const/16 v21, 0xd

    .line 549
    .line 550
    const/16 v22, 0x0

    .line 551
    .line 552
    const/16 v17, 0x0

    .line 553
    .line 554
    const/16 v19, 0x0

    .line 555
    .line 556
    const/16 v20, 0x0

    .line 557
    .line 558
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    const/16 v24, 0x0

    .line 563
    .line 564
    const v25, 0x1fff0

    .line 565
    .line 566
    .line 567
    const/4 v7, 0x0

    .line 568
    move-object/from16 v22, v8

    .line 569
    .line 570
    const/4 v8, 0x0

    .line 571
    const/4 v9, 0x0

    .line 572
    move-object/from16 v36, v1

    .line 573
    .line 574
    move-object v1, v10

    .line 575
    move/from16 v34, v11

    .line 576
    .line 577
    const-wide/16 v10, 0x0

    .line 578
    .line 579
    move/from16 v18, v12

    .line 580
    .line 581
    const/4 v12, 0x0

    .line 582
    move-object/from16 v19, v13

    .line 583
    .line 584
    const/4 v13, 0x0

    .line 585
    move/from16 v16, v14

    .line 586
    .line 587
    move-object/from16 v31, v15

    .line 588
    .line 589
    const-wide/16 v14, 0x0

    .line 590
    .line 591
    move/from16 v29, v16

    .line 592
    .line 593
    const/16 v16, 0x0

    .line 594
    .line 595
    const/16 v17, 0x0

    .line 596
    .line 597
    move/from16 v20, v18

    .line 598
    .line 599
    const/16 v18, 0x0

    .line 600
    .line 601
    move-object/from16 v21, v19

    .line 602
    .line 603
    const/16 v19, 0x0

    .line 604
    .line 605
    move/from16 v23, v20

    .line 606
    .line 607
    const/16 v20, 0x0

    .line 608
    .line 609
    move-object/from16 v30, v21

    .line 610
    .line 611
    const/16 v21, 0x0

    .line 612
    .line 613
    move/from16 v32, v23

    .line 614
    .line 615
    const/16 v23, 0xdb0

    .line 616
    .line 617
    move-object/from16 v0, v36

    .line 618
    .line 619
    invoke-static/range {v1 .. v25}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 620
    .line 621
    .line 622
    move-object/from16 v8, v22

    .line 623
    .line 624
    :goto_5
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 625
    .line 626
    .line 627
    goto :goto_6

    .line 628
    :cond_b
    move-object/from16 v31, v15

    .line 629
    .line 630
    move-object/from16 v0, v41

    .line 631
    .line 632
    const v1, -0x7182b852

    .line 633
    .line 634
    .line 635
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 636
    .line 637
    .line 638
    goto :goto_5

    .line 639
    :goto_6
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 640
    .line 641
    .line 642
    :goto_7
    const/4 v1, 0x0

    .line 643
    const/4 v3, 0x0

    .line 644
    const/4 v14, 0x1

    .line 645
    goto/16 :goto_10

    .line 646
    .line 647
    :cond_c
    move-object/from16 v38, v3

    .line 648
    .line 649
    move-object/from16 v39, v4

    .line 650
    .line 651
    move-object/from16 v37, v5

    .line 652
    .line 653
    move-object/from16 v33, v6

    .line 654
    .line 655
    move-object/from16 v41, v7

    .line 656
    .line 657
    move v7, v9

    .line 658
    move-object/from16 v0, v36

    .line 659
    .line 660
    const/4 v12, 0x2

    .line 661
    move-object/from16 v36, v1

    .line 662
    .line 663
    const v1, -0x7138c0e4

    .line 664
    .line 665
    .line 666
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 667
    .line 668
    .line 669
    const/4 v1, 0x0

    .line 670
    const/4 v3, 0x0

    .line 671
    const/4 v4, 0x1

    .line 672
    invoke-static {v0, v1, v4, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 673
    .line 674
    .line 675
    move-result-object v9

    .line 676
    const/16 v14, 0xd

    .line 677
    .line 678
    const/4 v15, 0x0

    .line 679
    const/4 v10, 0x0

    .line 680
    move/from16 v23, v12

    .line 681
    .line 682
    const/4 v12, 0x0

    .line 683
    const/4 v13, 0x0

    .line 684
    move/from16 v5, v23

    .line 685
    .line 686
    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 687
    .line 688
    .line 689
    move-result-object v6

    .line 690
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 691
    .line 692
    .line 693
    move-result-object v9

    .line 694
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 695
    .line 696
    .line 697
    move-result-object v10

    .line 698
    const/16 v11, 0x30

    .line 699
    .line 700
    invoke-static {v10, v9, v8, v11}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 701
    .line 702
    .line 703
    move-result-object v9

    .line 704
    const/4 v10, 0x0

    .line 705
    invoke-static {v8, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 706
    .line 707
    .line 708
    move-result v11

    .line 709
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 710
    .line 711
    .line 712
    move-result-object v12

    .line 713
    invoke-static {v8, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 714
    .line 715
    .line 716
    move-result-object v6

    .line 717
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 718
    .line 719
    .line 720
    move-result-object v13

    .line 721
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 722
    .line 723
    .line 724
    move-result-object v14

    .line 725
    if-nez v14, :cond_d

    .line 726
    .line 727
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 728
    .line 729
    .line 730
    :cond_d
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 731
    .line 732
    .line 733
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 734
    .line 735
    .line 736
    move-result v14

    .line 737
    if-eqz v14, :cond_e

    .line 738
    .line 739
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 740
    .line 741
    .line 742
    goto :goto_8

    .line 743
    :cond_e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 744
    .line 745
    .line 746
    :goto_8
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 747
    .line 748
    .line 749
    move-result-object v13

    .line 750
    move-object/from16 v14, v31

    .line 751
    .line 752
    invoke-static {v14, v13, v9, v13, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 753
    .line 754
    .line 755
    move-result-object v9

    .line 756
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 757
    .line 758
    .line 759
    move-result v12

    .line 760
    if-nez v12, :cond_f

    .line 761
    .line 762
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v12

    .line 766
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 767
    .line 768
    .line 769
    move-result-object v15

    .line 770
    invoke-static {v12, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 771
    .line 772
    .line 773
    move-result v12

    .line 774
    if-nez v12, :cond_10

    .line 775
    .line 776
    :cond_f
    invoke-static {v11, v13, v11, v9}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 777
    .line 778
    .line 779
    :cond_10
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 780
    .line 781
    .line 782
    move-result-object v9

    .line 783
    invoke-static {v13, v6, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 784
    .line 785
    .line 786
    sget-object v31, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 787
    .line 788
    if-eqz v16, :cond_11

    .line 789
    .line 790
    const v6, 0x1bf1f874

    .line 791
    .line 792
    .line 793
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 794
    .line 795
    .line 796
    const-wide v11, 0xff666666L

    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    invoke-static {v11, v12}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 802
    .line 803
    .line 804
    move-result-wide v11

    .line 805
    invoke-static/range {v32 .. v32}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 806
    .line 807
    .line 808
    move-result-wide v17

    .line 809
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 810
    .line 811
    .line 812
    move-result-object v6

    .line 813
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 814
    .line 815
    .line 816
    move-result-object v9

    .line 817
    invoke-static {v6, v9, v10, v5, v3}, Landroidx/compose/foundation/layout/SizeKt;->wrapContentHeight$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 818
    .line 819
    .line 820
    move-result-object v6

    .line 821
    const/16 v24, 0x0

    .line 822
    .line 823
    const v25, 0x1fff0

    .line 824
    .line 825
    .line 826
    move v15, v7

    .line 827
    const/4 v7, 0x0

    .line 828
    move-object/from16 v22, v8

    .line 829
    .line 830
    const/4 v8, 0x0

    .line 831
    const/4 v9, 0x0

    .line 832
    move-object/from16 v19, v3

    .line 833
    .line 834
    move/from16 v45, v4

    .line 835
    .line 836
    move/from16 v46, v10

    .line 837
    .line 838
    move-wide v3, v11

    .line 839
    const-wide/16 v10, 0x0

    .line 840
    .line 841
    const/4 v12, 0x0

    .line 842
    const/4 v13, 0x0

    .line 843
    move-object/from16 v20, v14

    .line 844
    .line 845
    move/from16 v42, v15

    .line 846
    .line 847
    const-wide/16 v14, 0x0

    .line 848
    .line 849
    move/from16 v23, v1

    .line 850
    .line 851
    move-object/from16 v1, v16

    .line 852
    .line 853
    const/16 v16, 0x0

    .line 854
    .line 855
    move/from16 v21, v5

    .line 856
    .line 857
    move-wide/from16 v49, v17

    .line 858
    .line 859
    move/from16 v18, v2

    .line 860
    .line 861
    move-object v2, v6

    .line 862
    move-wide/from16 v5, v49

    .line 863
    .line 864
    const/16 v17, 0x0

    .line 865
    .line 866
    move/from16 v40, v18

    .line 867
    .line 868
    const/16 v18, 0x0

    .line 869
    .line 870
    move-object/from16 v44, v19

    .line 871
    .line 872
    const/16 v19, 0x0

    .line 873
    .line 874
    move-object/from16 v43, v20

    .line 875
    .line 876
    const/16 v20, 0x0

    .line 877
    .line 878
    move/from16 v47, v21

    .line 879
    .line 880
    const/16 v21, 0x0

    .line 881
    .line 882
    move/from16 v48, v23

    .line 883
    .line 884
    const/16 v23, 0xdb0

    .line 885
    .line 886
    move/from16 v42, v40

    .line 887
    .line 888
    move-object/from16 p1, v43

    .line 889
    .line 890
    move-object/from16 v40, v0

    .line 891
    .line 892
    move/from16 v0, v46

    .line 893
    .line 894
    invoke-static/range {v1 .. v25}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 895
    .line 896
    .line 897
    move-object/from16 v8, v22

    .line 898
    .line 899
    :goto_9
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 900
    .line 901
    .line 902
    goto :goto_a

    .line 903
    :cond_11
    move-object/from16 v40, v0

    .line 904
    .line 905
    move/from16 v42, v2

    .line 906
    .line 907
    move v0, v10

    .line 908
    move-object/from16 p1, v14

    .line 909
    .line 910
    move-object/from16 v1, v16

    .line 911
    .line 912
    const v2, 0x1ba4b826

    .line 913
    .line 914
    .line 915
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 916
    .line 917
    .line 918
    goto :goto_9

    .line 919
    :goto_a
    if-eqz v1, :cond_12

    .line 920
    .line 921
    const/16 v1, 0xc

    .line 922
    .line 923
    int-to-float v1, v1

    .line 924
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 925
    .line 926
    .line 927
    move-result v10

    .line 928
    const/16 v14, 0xe

    .line 929
    .line 930
    const/4 v15, 0x0

    .line 931
    const/4 v11, 0x0

    .line 932
    const/4 v12, 0x0

    .line 933
    const/4 v13, 0x0

    .line 934
    move-object/from16 v9, v40

    .line 935
    .line 936
    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 937
    .line 938
    .line 939
    move-result-object v1

    .line 940
    move-object v13, v9

    .line 941
    goto :goto_b

    .line 942
    :cond_12
    move-object/from16 v13, v40

    .line 943
    .line 944
    move-object v1, v13

    .line 945
    :goto_b
    invoke-virtual {v13, v1}, Landroidx/compose/ui/Modifier$Companion;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 946
    .line 947
    .line 948
    move-result-object v18

    .line 949
    const/16 v21, 0x2

    .line 950
    .line 951
    const/16 v22, 0x0

    .line 952
    .line 953
    const/high16 v19, 0x3f800000    # 1.0f

    .line 954
    .line 955
    const/16 v20, 0x0

    .line 956
    .line 957
    move-object/from16 v17, v31

    .line 958
    .line 959
    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 964
    .line 965
    .line 966
    move-result-object v2

    .line 967
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 968
    .line 969
    .line 970
    move-result-object v3

    .line 971
    invoke-static {v2, v3, v8, v0}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 972
    .line 973
    .line 974
    move-result-object v2

    .line 975
    invoke-static {v8, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 976
    .line 977
    .line 978
    move-result v3

    .line 979
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 980
    .line 981
    .line 982
    move-result-object v4

    .line 983
    invoke-static {v8, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 984
    .line 985
    .line 986
    move-result-object v1

    .line 987
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 988
    .line 989
    .line 990
    move-result-object v5

    .line 991
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 992
    .line 993
    .line 994
    move-result-object v6

    .line 995
    if-nez v6, :cond_13

    .line 996
    .line 997
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 998
    .line 999
    .line 1000
    :cond_13
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1001
    .line 1002
    .line 1003
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1004
    .line 1005
    .line 1006
    move-result v6

    .line 1007
    if-eqz v6, :cond_14

    .line 1008
    .line 1009
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 1010
    .line 1011
    .line 1012
    goto :goto_c

    .line 1013
    :cond_14
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1014
    .line 1015
    .line 1016
    :goto_c
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v5

    .line 1020
    move-object/from16 v10, p1

    .line 1021
    .line 1022
    invoke-static {v10, v5, v2, v5, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v2

    .line 1026
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1027
    .line 1028
    .line 1029
    move-result v4

    .line 1030
    if-nez v4, :cond_15

    .line 1031
    .line 1032
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v4

    .line 1036
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v6

    .line 1040
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1041
    .line 1042
    .line 1043
    move-result v4

    .line 1044
    if-nez v4, :cond_16

    .line 1045
    .line 1046
    :cond_15
    invoke-static {v3, v5, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 1047
    .line 1048
    .line 1049
    :cond_16
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v2

    .line 1053
    invoke-static {v5, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 1054
    .line 1055
    .line 1056
    const/4 v1, 0x0

    .line 1057
    const/4 v11, 0x0

    .line 1058
    const/4 v12, 0x1

    .line 1059
    invoke-static {v13, v1, v12, v11}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v2

    .line 1063
    move/from16 v1, v42

    .line 1064
    .line 1065
    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v1

    .line 1069
    int-to-float v2, v12

    .line 1070
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1071
    .line 1072
    .line 1073
    move-result v2

    .line 1074
    invoke-static/range {v34 .. v35}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1075
    .line 1076
    .line 1077
    move-result-wide v3

    .line 1078
    const/4 v15, 0x2

    .line 1079
    int-to-float v5, v15

    .line 1080
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1081
    .line 1082
    .line 1083
    move-result v5

    .line 1084
    invoke-static {v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v5

    .line 1088
    invoke-static {v1, v2, v3, v4, v5}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v1

    .line 1092
    const/16 v2, 0xa

    .line 1093
    .line 1094
    int-to-float v2, v2

    .line 1095
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1096
    .line 1097
    .line 1098
    move-result v2

    .line 1099
    const/4 v3, 0x0

    .line 1100
    invoke-static {v1, v2, v3, v15, v11}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v1

    .line 1104
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getCenterStart()Landroidx/compose/ui/Alignment;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v2

    .line 1108
    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v2

    .line 1112
    invoke-static {v8, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 1113
    .line 1114
    .line 1115
    move-result v3

    .line 1116
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v4

    .line 1120
    invoke-static {v8, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v1

    .line 1124
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v5

    .line 1128
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v6

    .line 1132
    if-nez v6, :cond_17

    .line 1133
    .line 1134
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1135
    .line 1136
    .line 1137
    :cond_17
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1138
    .line 1139
    .line 1140
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1141
    .line 1142
    .line 1143
    move-result v6

    .line 1144
    if-eqz v6, :cond_18

    .line 1145
    .line 1146
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 1147
    .line 1148
    .line 1149
    goto :goto_d

    .line 1150
    :cond_18
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1151
    .line 1152
    .line 1153
    :goto_d
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v5

    .line 1157
    invoke-static {v10, v5, v2, v5, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v2

    .line 1161
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1162
    .line 1163
    .line 1164
    move-result v4

    .line 1165
    if-nez v4, :cond_19

    .line 1166
    .line 1167
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v4

    .line 1171
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v6

    .line 1175
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1176
    .line 1177
    .line 1178
    move-result v4

    .line 1179
    if-nez v4, :cond_1a

    .line 1180
    .line 1181
    :cond_19
    invoke-static {v3, v5, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 1182
    .line 1183
    .line 1184
    :cond_1a
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v2

    .line 1188
    invoke-static {v5, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 1189
    .line 1190
    .line 1191
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 1192
    .line 1193
    invoke-static/range {v32 .. v32}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 1194
    .line 1195
    .line 1196
    move-result-wide v5

    .line 1197
    const/16 v9, 0x6c00

    .line 1198
    .line 1199
    move-object/from16 v1, v36

    .line 1200
    .line 1201
    move-object/from16 v2, v37

    .line 1202
    .line 1203
    move-object/from16 v3, v38

    .line 1204
    .line 1205
    move-object/from16 v4, v39

    .line 1206
    .line 1207
    move-object/from16 v7, v41

    .line 1208
    .line 1209
    invoke-static/range {v1 .. v9}, Lcom/zykj/mistake/feature/collection/component/f;->c(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Landroidx/compose/ui/focus/FocusRequester;JLr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 1210
    .line 1211
    .line 1212
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1213
    .line 1214
    .line 1215
    invoke-static/range {v33 .. v33}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 1216
    .line 1217
    .line 1218
    move-result v1

    .line 1219
    if-nez v1, :cond_1b

    .line 1220
    .line 1221
    const v1, 0x3adcc4b2

    .line 1222
    .line 1223
    .line 1224
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1225
    .line 1226
    .line 1227
    invoke-static/range {v29 .. v30}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1228
    .line 1229
    .line 1230
    move-result-wide v3

    .line 1231
    invoke-static/range {v32 .. v32}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 1232
    .line 1233
    .line 1234
    move-result-wide v5

    .line 1235
    const/4 v15, 0x5

    .line 1236
    int-to-float v1, v15

    .line 1237
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1238
    .line 1239
    .line 1240
    move-result v1

    .line 1241
    const/16 v14, 0xd

    .line 1242
    .line 1243
    const/4 v15, 0x0

    .line 1244
    move-object/from16 v31, v10

    .line 1245
    .line 1246
    const/4 v10, 0x0

    .line 1247
    move/from16 v16, v12

    .line 1248
    .line 1249
    const/4 v12, 0x0

    .line 1250
    move-object/from16 v36, v13

    .line 1251
    .line 1252
    const/4 v13, 0x0

    .line 1253
    move-object/from16 v19, v11

    .line 1254
    .line 1255
    move-object/from16 v9, v36

    .line 1256
    .line 1257
    move v11, v1

    .line 1258
    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v2

    .line 1262
    const/16 v24, 0x0

    .line 1263
    .line 1264
    const v25, 0x1fff0

    .line 1265
    .line 1266
    .line 1267
    const/4 v7, 0x0

    .line 1268
    move-object/from16 v22, v8

    .line 1269
    .line 1270
    const/4 v8, 0x0

    .line 1271
    const/4 v9, 0x0

    .line 1272
    const-wide/16 v10, 0x0

    .line 1273
    .line 1274
    const/4 v12, 0x0

    .line 1275
    const/4 v13, 0x0

    .line 1276
    const-wide/16 v14, 0x0

    .line 1277
    .line 1278
    move/from16 v29, v16

    .line 1279
    .line 1280
    const/16 v16, 0x0

    .line 1281
    .line 1282
    const/16 v17, 0x0

    .line 1283
    .line 1284
    const/16 v18, 0x0

    .line 1285
    .line 1286
    move-object/from16 v44, v19

    .line 1287
    .line 1288
    const/16 v19, 0x0

    .line 1289
    .line 1290
    const/16 v20, 0x0

    .line 1291
    .line 1292
    const/16 v21, 0x0

    .line 1293
    .line 1294
    const/16 v23, 0xdb0

    .line 1295
    .line 1296
    move-object/from16 v1, v33

    .line 1297
    .line 1298
    move-object/from16 v0, v36

    .line 1299
    .line 1300
    invoke-static/range {v1 .. v25}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 1301
    .line 1302
    .line 1303
    move-object/from16 v8, v22

    .line 1304
    .line 1305
    :goto_e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1306
    .line 1307
    .line 1308
    goto :goto_f

    .line 1309
    :cond_1b
    move-object/from16 v31, v10

    .line 1310
    .line 1311
    move-object v0, v13

    .line 1312
    const v1, 0x3a781c30

    .line 1313
    .line 1314
    .line 1315
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1316
    .line 1317
    .line 1318
    goto :goto_e

    .line 1319
    :goto_f
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1320
    .line 1321
    .line 1322
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1323
    .line 1324
    .line 1325
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1326
    .line 1327
    .line 1328
    goto/16 :goto_7

    .line 1329
    .line 1330
    :goto_10
    invoke-static {v0, v1, v14, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v15

    .line 1334
    const/16 v20, 0xd

    .line 1335
    .line 1336
    const/16 v21, 0x0

    .line 1337
    .line 1338
    const/16 v16, 0x0

    .line 1339
    .line 1340
    move-object/from16 v13, p0

    .line 1341
    .line 1342
    iget v1, v13, Lcom/zykj/mistake/feature/collection/component/d;->l:F

    .line 1343
    .line 1344
    const/16 v18, 0x0

    .line 1345
    .line 1346
    const/16 v19, 0x0

    .line 1347
    .line 1348
    move/from16 v17, v1

    .line 1349
    .line 1350
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v1

    .line 1354
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v2

    .line 1358
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v3

    .line 1362
    const/4 v4, 0x6

    .line 1363
    invoke-static {v2, v3, v8, v4}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v2

    .line 1367
    const/4 v10, 0x0

    .line 1368
    invoke-static {v8, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 1369
    .line 1370
    .line 1371
    move-result v3

    .line 1372
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v4

    .line 1376
    invoke-static {v8, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v1

    .line 1380
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v5

    .line 1384
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v6

    .line 1388
    if-nez v6, :cond_1c

    .line 1389
    .line 1390
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1391
    .line 1392
    .line 1393
    :cond_1c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1394
    .line 1395
    .line 1396
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1397
    .line 1398
    .line 1399
    move-result v6

    .line 1400
    if-eqz v6, :cond_1d

    .line 1401
    .line 1402
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 1403
    .line 1404
    .line 1405
    goto :goto_11

    .line 1406
    :cond_1d
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1407
    .line 1408
    .line 1409
    :goto_11
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v5

    .line 1413
    move-object/from16 v15, v31

    .line 1414
    .line 1415
    invoke-static {v15, v5, v2, v5, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v2

    .line 1419
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1420
    .line 1421
    .line 1422
    move-result v4

    .line 1423
    if-nez v4, :cond_1e

    .line 1424
    .line 1425
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v4

    .line 1429
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v6

    .line 1433
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1434
    .line 1435
    .line 1436
    move-result v4

    .line 1437
    if-nez v4, :cond_1f

    .line 1438
    .line 1439
    :cond_1e
    invoke-static {v3, v5, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 1440
    .line 1441
    .line 1442
    :cond_1f
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v2

    .line 1446
    invoke-static {v5, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 1447
    .line 1448
    .line 1449
    sget-object v1, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 1450
    .line 1451
    const-wide v1, 0xffe8f1ffL

    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1457
    .line 1458
    .line 1459
    move-result-wide v2

    .line 1460
    const-wide v15, 0xff1576ffL

    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1466
    .line 1467
    .line 1468
    move-result-wide v4

    .line 1469
    const/16 v11, 0x6db6

    .line 1470
    .line 1471
    const/16 v12, 0x20

    .line 1472
    .line 1473
    const-string v1, "\u53d6\u6d88"

    .line 1474
    .line 1475
    iget v6, v13, Lcom/zykj/mistake/feature/collection/component/d;->r:F

    .line 1476
    .line 1477
    iget v7, v13, Lcom/zykj/mistake/feature/collection/component/d;->s:F

    .line 1478
    .line 1479
    move-object/from16 v22, v8

    .line 1480
    .line 1481
    const/4 v8, 0x0

    .line 1482
    iget-object v9, v13, Lcom/zykj/mistake/feature/collection/component/d;->t:Lr6/a;

    .line 1483
    .line 1484
    move-object/from16 v10, v22

    .line 1485
    .line 1486
    invoke-static/range {v1 .. v12}, Lcom/zykj/mistake/feature/collection/component/f;->a(Ljava/lang/String;JJFFZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 1487
    .line 1488
    .line 1489
    move-object v8, v10

    .line 1490
    iget v1, v13, Lcom/zykj/mistake/feature/collection/component/d;->u:F

    .line 1491
    .line 1492
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v0

    .line 1496
    const/4 v10, 0x0

    .line 1497
    invoke-static {v0, v8, v10}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 1498
    .line 1499
    .line 1500
    iget-boolean v0, v13, Lcom/zykj/mistake/feature/collection/component/d;->v:Z

    .line 1501
    .line 1502
    if-eqz v0, :cond_20

    .line 1503
    .line 1504
    iget-object v1, v13, Lcom/zykj/mistake/feature/collection/component/d;->w:Ljava/lang/String;

    .line 1505
    .line 1506
    goto :goto_12

    .line 1507
    :cond_20
    iget-object v1, v13, Lcom/zykj/mistake/feature/collection/component/d;->x:Ljava/lang/String;

    .line 1508
    .line 1509
    :goto_12
    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1510
    .line 1511
    .line 1512
    move-result-wide v2

    .line 1513
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 1514
    .line 1515
    .line 1516
    move-result-wide v4

    .line 1517
    xor-int/2addr v0, v14

    .line 1518
    const/16 v11, 0x6db0

    .line 1519
    .line 1520
    const/4 v12, 0x0

    .line 1521
    iget-object v9, v13, Lcom/zykj/mistake/feature/collection/component/d;->y:Lr6/a;

    .line 1522
    .line 1523
    move-object v10, v8

    .line 1524
    move v8, v0

    .line 1525
    invoke-static/range {v1 .. v12}, Lcom/zykj/mistake/feature/collection/component/f;->a(Ljava/lang/String;JJFFZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 1526
    .line 1527
    .line 1528
    move-object/from16 v22, v10

    .line 1529
    .line 1530
    invoke-static/range {v22 .. v22}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 1531
    .line 1532
    .line 1533
    move-result v0

    .line 1534
    if-eqz v0, :cond_22

    .line 1535
    .line 1536
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1537
    .line 1538
    .line 1539
    goto :goto_13

    .line 1540
    :cond_21
    move-object v13, v0

    .line 1541
    move-object/from16 v22, v8

    .line 1542
    .line 1543
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1544
    .line 1545
    .line 1546
    :cond_22
    :goto_13
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 1547
    .line 1548
    return-object v0
.end method
