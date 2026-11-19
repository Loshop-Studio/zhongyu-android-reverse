.class public final synthetic Lcom/zykj/mistake/main/drawer/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/f;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/main/l;

.field public final synthetic b:Lr6/a;

.field public final synthetic c:Lr6/e;

.field public final synthetic d:Lr6/a;

.field public final synthetic e:Lr6/e;

.field public final synthetic f:Lr6/c;

.field public final synthetic g:Lr6/a;

.field public final synthetic h:Lr6/a;

.field public final synthetic i:Lr6/a;

.field public final synthetic j:Lr6/c;

.field public final synthetic k:Lr6/c;

.field public final synthetic l:Lr6/a;

.field public final synthetic m:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/main/l;Lr6/a;Lr6/e;Lr6/a;Lr6/e;Lr6/c;Lr6/a;Lr6/a;Lr6/a;Lr6/c;Lr6/c;Lr6/a;Lr6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/main/drawer/b;->a:Lcom/zykj/mistake/main/l;

    iput-object p2, p0, Lcom/zykj/mistake/main/drawer/b;->b:Lr6/a;

    iput-object p3, p0, Lcom/zykj/mistake/main/drawer/b;->c:Lr6/e;

    iput-object p4, p0, Lcom/zykj/mistake/main/drawer/b;->d:Lr6/a;

    iput-object p5, p0, Lcom/zykj/mistake/main/drawer/b;->e:Lr6/e;

    iput-object p6, p0, Lcom/zykj/mistake/main/drawer/b;->f:Lr6/c;

    iput-object p7, p0, Lcom/zykj/mistake/main/drawer/b;->g:Lr6/a;

    iput-object p8, p0, Lcom/zykj/mistake/main/drawer/b;->h:Lr6/a;

    iput-object p9, p0, Lcom/zykj/mistake/main/drawer/b;->i:Lr6/a;

    iput-object p10, p0, Lcom/zykj/mistake/main/drawer/b;->j:Lr6/c;

    iput-object p11, p0, Lcom/zykj/mistake/main/drawer/b;->k:Lr6/c;

    iput-object p12, p0, Lcom/zykj/mistake/main/drawer/b;->l:Lr6/a;

    iput-object p13, p0, Lcom/zykj/mistake/main/drawer/b;->m:Lr6/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Landroidx/compose/animation/AnimatedVisibilityScope;

    .line 6
    .line 7
    move-object/from16 v15, p2

    .line 8
    .line 9
    check-cast v15, Landroidx/compose/runtime/Composer;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const-string v3, "$this$AnimatedVisibility"

    .line 20
    .line 21
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    const/4 v1, -0x1

    .line 31
    const-string v3, "com.zykj.mistake.main.drawer.MainEndDrawerHost.<anonymous>.<anonymous> (MainEndDrawerHost.kt:63)"

    .line 32
    .line 33
    const v4, -0x2f0fd141

    .line 34
    .line 35
    .line 36
    invoke-static {v4, v2, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, 0x1

    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    sget-object v6, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 49
    .line 50
    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getCenterEnd()Landroidx/compose/ui/Alignment;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    const/4 v8, 0x0

    .line 55
    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-static {v15, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    invoke-static {v15, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 72
    .line 73
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 74
    .line 75
    .line 76
    move-result-object v12

    .line 77
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    if-nez v13, :cond_1

    .line 82
    .line 83
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 84
    .line 85
    .line 86
    :cond_1
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 87
    .line 88
    .line 89
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 90
    .line 91
    .line 92
    move-result v13

    .line 93
    if-eqz v13, :cond_2

    .line 94
    .line 95
    invoke-interface {v15, v12}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 100
    .line 101
    .line 102
    :goto_0
    invoke-static {v15}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    invoke-static {v11, v12, v7, v12, v10}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    if-nez v10, :cond_3

    .line 115
    .line 116
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v13

    .line 124
    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    if-nez v10, :cond_4

    .line 129
    .line 130
    :cond_3
    invoke-static {v9, v12, v9, v7}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 131
    .line 132
    .line 133
    :cond_4
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    invoke-static {v12, v5, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 138
    .line 139
    .line 140
    sget-object v5, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 141
    .line 142
    sget v5, Lcom/zykj/mistake/main/drawer/e;->a:F

    .line 143
    .line 144
    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 149
    .line 150
    .line 151
    move-result-object v16

    .line 152
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 153
    .line 154
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 155
    .line 156
    .line 157
    move-result-wide v17

    .line 158
    const/16 v20, 0x2

    .line 159
    .line 160
    const/16 v21, 0x0

    .line 161
    .line 162
    const/16 v19, 0x0

    .line 163
    .line 164
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-static {v2, v8}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-static {v15, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-static {v15, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    if-nez v6, :cond_5

    .line 197
    .line 198
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 199
    .line 200
    .line 201
    :cond_5
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 202
    .line 203
    .line 204
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    if-eqz v6, :cond_6

    .line 209
    .line 210
    invoke-interface {v15, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 211
    .line 212
    .line 213
    goto :goto_1

    .line 214
    :cond_6
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 215
    .line 216
    .line 217
    :goto_1
    invoke-static {v15}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    invoke-static {v11, v5, v2, v5, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    if-nez v4, :cond_7

    .line 230
    .line 231
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    if-nez v4, :cond_8

    .line 244
    .line 245
    :cond_7
    invoke-static {v3, v5, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 246
    .line 247
    .line 248
    :cond_8
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-static {v5, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 253
    .line 254
    .line 255
    sget-object v1, Lcom/zykj/mistake/main/b;->a:Lcom/zykj/mistake/main/b;

    .line 256
    .line 257
    iget-object v2, v0, Lcom/zykj/mistake/main/drawer/b;->a:Lcom/zykj/mistake/main/l;

    .line 258
    .line 259
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-eqz v1, :cond_9

    .line 264
    .line 265
    const v1, 0x70492a77

    .line 266
    .line 267
    .line 268
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 269
    .line 270
    .line 271
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 272
    .line 273
    .line 274
    goto/16 :goto_2

    .line 275
    .line 276
    :cond_9
    instance-of v1, v2, Lcom/zykj/mistake/main/d;

    .line 277
    .line 278
    const/16 v3, 0xd

    .line 279
    .line 280
    if-eqz v1, :cond_c

    .line 281
    .line 282
    const v1, -0x6722a0bd

    .line 283
    .line 284
    .line 285
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 286
    .line 287
    .line 288
    move-object v1, v2

    .line 289
    check-cast v1, Lcom/zykj/mistake/main/d;

    .line 290
    .line 291
    iget-object v1, v1, Lcom/zykj/mistake/main/d;->a:Lcom/zykj/mistake/main/a1;

    .line 292
    .line 293
    iget-object v4, v0, Lcom/zykj/mistake/main/drawer/b;->c:Lr6/e;

    .line 294
    .line 295
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v5

    .line 299
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    or-int/2addr v5, v6

    .line 304
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v6

    .line 308
    if-nez v5, :cond_a

    .line 309
    .line 310
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 311
    .line 312
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    if-ne v6, v5, :cond_b

    .line 317
    .line 318
    :cond_a
    new-instance v6, Landroidx/navigation/d;

    .line 319
    .line 320
    invoke-direct {v6, v3, v4, v2}, Landroidx/navigation/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    :cond_b
    move-object v4, v6

    .line 327
    check-cast v4, Lr6/c;

    .line 328
    .line 329
    const/4 v11, 0x0

    .line 330
    iget-object v3, v0, Lcom/zykj/mistake/main/drawer/b;->b:Lr6/a;

    .line 331
    .line 332
    iget-object v5, v0, Lcom/zykj/mistake/main/drawer/b;->d:Lr6/a;

    .line 333
    .line 334
    iget-object v6, v0, Lcom/zykj/mistake/main/drawer/b;->e:Lr6/e;

    .line 335
    .line 336
    iget-object v7, v0, Lcom/zykj/mistake/main/drawer/b;->f:Lr6/c;

    .line 337
    .line 338
    iget-object v8, v0, Lcom/zykj/mistake/main/drawer/b;->g:Lr6/a;

    .line 339
    .line 340
    iget-object v9, v0, Lcom/zykj/mistake/main/drawer/b;->h:Lr6/a;

    .line 341
    .line 342
    move-object v2, v1

    .line 343
    move-object v10, v15

    .line 344
    invoke-static/range {v2 .. v11}, Lcom/zykj/mistake/main/drawer/l;->b(Lcom/zykj/mistake/main/a1;Lr6/a;Lr6/c;Lr6/a;Lr6/e;Lr6/c;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 345
    .line 346
    .line 347
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 348
    .line 349
    .line 350
    goto/16 :goto_2

    .line 351
    .line 352
    :cond_c
    instance-of v1, v2, Lcom/zykj/mistake/main/c;

    .line 353
    .line 354
    if-eqz v1, :cond_20

    .line 355
    .line 356
    const v1, -0x67151b84

    .line 357
    .line 358
    .line 359
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 360
    .line 361
    .line 362
    move-object v1, v2

    .line 363
    check-cast v1, Lcom/zykj/mistake/main/c;

    .line 364
    .line 365
    iget-object v1, v1, Lcom/zykj/mistake/main/c;->a:Lcom/zykj/mistake/main/p;

    .line 366
    .line 367
    iget-object v4, v0, Lcom/zykj/mistake/main/drawer/b;->j:Lr6/c;

    .line 368
    .line 369
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v6

    .line 377
    or-int/2addr v5, v6

    .line 378
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v6

    .line 382
    if-nez v5, :cond_d

    .line 383
    .line 384
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 385
    .line 386
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    if-ne v6, v5, :cond_e

    .line 391
    .line 392
    :cond_d
    new-instance v6, Landroidx/navigation/e;

    .line 393
    .line 394
    const/16 v5, 0x10

    .line 395
    .line 396
    invoke-direct {v6, v5, v4, v2}, Landroidx/navigation/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    :cond_e
    move-object v4, v6

    .line 403
    check-cast v4, Lr6/a;

    .line 404
    .line 405
    iget-object v2, v0, Lcom/zykj/mistake/main/drawer/b;->m:Lr6/c;

    .line 406
    .line 407
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-result v5

    .line 411
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v6

    .line 415
    if-nez v5, :cond_f

    .line 416
    .line 417
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 418
    .line 419
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v5

    .line 423
    if-ne v6, v5, :cond_10

    .line 424
    .line 425
    :cond_f
    new-instance v6, Lcom/zykj/mistake/feature/notebook/list/g1;

    .line 426
    .line 427
    const/16 v5, 0xe

    .line 428
    .line 429
    invoke-direct {v6, v2, v5}, Lcom/zykj/mistake/feature/notebook/list/g1;-><init>(Lr6/c;I)V

    .line 430
    .line 431
    .line 432
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    :cond_10
    move-object v7, v6

    .line 436
    check-cast v7, Lr6/a;

    .line 437
    .line 438
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v5

    .line 442
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v6

    .line 446
    if-nez v5, :cond_11

    .line 447
    .line 448
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 449
    .line 450
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    if-ne v6, v5, :cond_12

    .line 455
    .line 456
    :cond_11
    new-instance v6, Lcom/zykj/mistake/feature/notebook/detail/m4;

    .line 457
    .line 458
    const/4 v5, 0x7

    .line 459
    invoke-direct {v6, v2, v5}, Lcom/zykj/mistake/feature/notebook/detail/m4;-><init>(Lr6/c;I)V

    .line 460
    .line 461
    .line 462
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    :cond_12
    move-object v8, v6

    .line 466
    check-cast v8, Lr6/c;

    .line 467
    .line 468
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v5

    .line 472
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v6

    .line 476
    if-nez v5, :cond_13

    .line 477
    .line 478
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 479
    .line 480
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v5

    .line 484
    if-ne v6, v5, :cond_14

    .line 485
    .line 486
    :cond_13
    new-instance v6, Lcom/zykj/mistake/feature/notebook/detail/m4;

    .line 487
    .line 488
    const/16 v5, 0x8

    .line 489
    .line 490
    invoke-direct {v6, v2, v5}, Lcom/zykj/mistake/feature/notebook/detail/m4;-><init>(Lr6/c;I)V

    .line 491
    .line 492
    .line 493
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 494
    .line 495
    .line 496
    :cond_14
    move-object v9, v6

    .line 497
    check-cast v9, Lr6/c;

    .line 498
    .line 499
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    move-result v5

    .line 503
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v6

    .line 507
    if-nez v5, :cond_15

    .line 508
    .line 509
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 510
    .line 511
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v5

    .line 515
    if-ne v6, v5, :cond_16

    .line 516
    .line 517
    :cond_15
    new-instance v6, Lcom/zykj/mistake/feature/notebook/detail/m4;

    .line 518
    .line 519
    const/16 v5, 0x9

    .line 520
    .line 521
    invoke-direct {v6, v2, v5}, Lcom/zykj/mistake/feature/notebook/detail/m4;-><init>(Lr6/c;I)V

    .line 522
    .line 523
    .line 524
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    :cond_16
    move-object v10, v6

    .line 528
    check-cast v10, Lr6/c;

    .line 529
    .line 530
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    move-result v5

    .line 534
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v6

    .line 538
    if-nez v5, :cond_17

    .line 539
    .line 540
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 541
    .line 542
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v5

    .line 546
    if-ne v6, v5, :cond_18

    .line 547
    .line 548
    :cond_17
    new-instance v6, Lcom/zykj/mistake/feature/notebook/detail/m4;

    .line 549
    .line 550
    const/16 v5, 0xa

    .line 551
    .line 552
    invoke-direct {v6, v2, v5}, Lcom/zykj/mistake/feature/notebook/detail/m4;-><init>(Lr6/c;I)V

    .line 553
    .line 554
    .line 555
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 556
    .line 557
    .line 558
    :cond_18
    move-object v11, v6

    .line 559
    check-cast v11, Lr6/c;

    .line 560
    .line 561
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    move-result v5

    .line 565
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v6

    .line 569
    if-nez v5, :cond_19

    .line 570
    .line 571
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 572
    .line 573
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v5

    .line 577
    if-ne v6, v5, :cond_1a

    .line 578
    .line 579
    :cond_19
    new-instance v6, Lcom/zykj/mistake/feature/notebook/list/g1;

    .line 580
    .line 581
    const/16 v5, 0xc

    .line 582
    .line 583
    invoke-direct {v6, v2, v5}, Lcom/zykj/mistake/feature/notebook/list/g1;-><init>(Lr6/c;I)V

    .line 584
    .line 585
    .line 586
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    :cond_1a
    move-object v12, v6

    .line 590
    check-cast v12, Lr6/a;

    .line 591
    .line 592
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    move-result v5

    .line 596
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v6

    .line 600
    if-nez v5, :cond_1b

    .line 601
    .line 602
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 603
    .line 604
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v5

    .line 608
    if-ne v6, v5, :cond_1c

    .line 609
    .line 610
    :cond_1b
    new-instance v6, Lcom/zykj/mistake/feature/notebook/list/g1;

    .line 611
    .line 612
    invoke-direct {v6, v2, v3}, Lcom/zykj/mistake/feature/notebook/list/g1;-><init>(Lr6/c;I)V

    .line 613
    .line 614
    .line 615
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 616
    .line 617
    .line 618
    :cond_1c
    move-object v13, v6

    .line 619
    check-cast v13, Lr6/a;

    .line 620
    .line 621
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 622
    .line 623
    .line 624
    move-result v3

    .line 625
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v5

    .line 629
    if-nez v3, :cond_1d

    .line 630
    .line 631
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 632
    .line 633
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v3

    .line 637
    if-ne v5, v3, :cond_1e

    .line 638
    .line 639
    :cond_1d
    new-instance v5, Lcom/zykj/mistake/feature/notebook/detail/m4;

    .line 640
    .line 641
    const/4 v3, 0x6

    .line 642
    invoke-direct {v5, v2, v3}, Lcom/zykj/mistake/feature/notebook/detail/m4;-><init>(Lr6/c;I)V

    .line 643
    .line 644
    .line 645
    invoke-interface {v15, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 646
    .line 647
    .line 648
    :cond_1e
    move-object v14, v5

    .line 649
    check-cast v14, Lr6/c;

    .line 650
    .line 651
    const/16 v16, 0x0

    .line 652
    .line 653
    const/16 v17, 0x0

    .line 654
    .line 655
    iget-object v3, v0, Lcom/zykj/mistake/main/drawer/b;->i:Lr6/a;

    .line 656
    .line 657
    iget-object v5, v0, Lcom/zykj/mistake/main/drawer/b;->k:Lr6/c;

    .line 658
    .line 659
    iget-object v6, v0, Lcom/zykj/mistake/main/drawer/b;->l:Lr6/a;

    .line 660
    .line 661
    move-object v2, v1

    .line 662
    invoke-static/range {v2 .. v17}, Lcom/zykj/mistake/main/drawer/g;->a(Lcom/zykj/mistake/main/p;Lr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/a;Lr6/a;Lr6/c;Landroidx/compose/runtime/Composer;II)V

    .line 663
    .line 664
    .line 665
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 666
    .line 667
    .line 668
    :goto_2
    invoke-static {v15}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 669
    .line 670
    .line 671
    move-result v1

    .line 672
    if-eqz v1, :cond_1f

    .line 673
    .line 674
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 675
    .line 676
    .line 677
    :cond_1f
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 678
    .line 679
    return-object v1

    .line 680
    :cond_20
    const v1, 0x7049339b

    .line 681
    .line 682
    .line 683
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 684
    .line 685
    .line 686
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 687
    .line 688
    .line 689
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 690
    .line 691
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 692
    .line 693
    .line 694
    throw v1
.end method
