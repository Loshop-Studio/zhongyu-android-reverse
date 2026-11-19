.class public final synthetic Lcom/zykj/mistake/main/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Landroidx/navigation/NavHostController;

.field public final synthetic c:Lcom/zykj/mistake/main/MainShellViewModel;

.field public final synthetic d:Lo2/a;

.field public final synthetic e:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(ZLandroidx/navigation/NavHostController;Lcom/zykj/mistake/main/MainShellViewModel;Lo2/a;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/zykj/mistake/main/i;->a:Z

    iput-object p2, p0, Lcom/zykj/mistake/main/i;->b:Landroidx/navigation/NavHostController;

    iput-object p3, p0, Lcom/zykj/mistake/main/i;->c:Lcom/zykj/mistake/main/MainShellViewModel;

    iput-object p4, p0, Lcom/zykj/mistake/main/i;->d:Lo2/a;

    iput-object p5, p0, Lcom/zykj/mistake/main/i;->e:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v14, p1

    .line 4
    .line 5
    check-cast v14, Landroidx/compose/runtime/Composer;

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
    invoke-interface {v14, v2, v6}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_23

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
    const-string v6, "com.zykj.mistake.main.MainAppRoot.<anonymous> (MainAppRoot.kt:39)"

    .line 41
    .line 42
    const v7, 0x4eab0550

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
    const/4 v2, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    invoke-static {v1, v2, v3, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 57
    .line 58
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {v14, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-static {v14, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    sget-object v9, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 79
    .line 80
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    if-nez v11, :cond_2

    .line 89
    .line 90
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 91
    .line 92
    .line 93
    :cond_2
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 94
    .line 95
    .line 96
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    if-eqz v11, :cond_3

    .line 101
    .line 102
    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 107
    .line 108
    .line 109
    :goto_1
    invoke-static {v14}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    invoke-static {v9, v10, v2, v10, v8}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    if-nez v8, :cond_4

    .line 122
    .line 123
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    if-nez v8, :cond_5

    .line 136
    .line 137
    :cond_4
    invoke-static {v7, v10, v7, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 138
    .line 139
    .line 140
    :cond_5
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-static {v10, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 145
    .line 146
    .line 147
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 148
    .line 149
    iget-object v1, v0, Lcom/zykj/mistake/main/i;->b:Landroidx/navigation/NavHostController;

    .line 150
    .line 151
    iget-object v2, v0, Lcom/zykj/mistake/main/i;->c:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 152
    .line 153
    invoke-static {v1, v2, v6, v14, v4}, Lt4/g;->a(Landroidx/navigation/NavHostController;Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 154
    .line 155
    .line 156
    iget-object v1, v0, Lcom/zykj/mistake/main/i;->e:Landroidx/compose/runtime/State;

    .line 157
    .line 158
    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    check-cast v7, Lcom/zykj/mistake/main/m;

    .line 163
    .line 164
    iget-object v7, v7, Lcom/zykj/mistake/main/m;->a:Lcom/zykj/mistake/main/l;

    .line 165
    .line 166
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    if-nez v8, :cond_6

    .line 175
    .line 176
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 177
    .line 178
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    if-ne v9, v8, :cond_7

    .line 183
    .line 184
    :cond_6
    new-instance v9, Lcom/zykj/mistake/main/g;

    .line 185
    .line 186
    const/4 v8, 0x3

    .line 187
    invoke-direct {v9, v2, v8}, Lcom/zykj/mistake/main/g;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_7
    check-cast v9, Lr6/a;

    .line 194
    .line 195
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    if-nez v8, :cond_8

    .line 204
    .line 205
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 206
    .line 207
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    if-ne v10, v8, :cond_9

    .line 212
    .line 213
    :cond_8
    new-instance v10, Lcom/zykj/mistake/main/h;

    .line 214
    .line 215
    invoke-direct {v10, v2, v3}, Lcom/zykj/mistake/main/h;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V

    .line 216
    .line 217
    .line 218
    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    :cond_9
    check-cast v10, Lr6/e;

    .line 222
    .line 223
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v11

    .line 231
    if-nez v8, :cond_a

    .line 232
    .line 233
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 234
    .line 235
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v8

    .line 239
    if-ne v11, v8, :cond_b

    .line 240
    .line 241
    :cond_a
    new-instance v11, Lcom/zykj/mistake/main/g;

    .line 242
    .line 243
    const/4 v8, 0x6

    .line 244
    invoke-direct {v11, v2, v8}, Lcom/zykj/mistake/main/g;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V

    .line 245
    .line 246
    .line 247
    invoke-interface {v14, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    :cond_b
    check-cast v11, Lr6/a;

    .line 251
    .line 252
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v12

    .line 260
    if-nez v8, :cond_c

    .line 261
    .line 262
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 263
    .line 264
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v8

    .line 268
    if-ne v12, v8, :cond_d

    .line 269
    .line 270
    :cond_c
    new-instance v12, Lcom/zykj/mistake/main/f;

    .line 271
    .line 272
    invoke-direct {v12, v2, v5}, Lcom/zykj/mistake/main/f;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V

    .line 273
    .line 274
    .line 275
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    :cond_d
    check-cast v12, Lr6/c;

    .line 279
    .line 280
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v8

    .line 284
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v13

    .line 288
    if-nez v8, :cond_e

    .line 289
    .line 290
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 291
    .line 292
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    if-ne v13, v8, :cond_f

    .line 297
    .line 298
    :cond_e
    new-instance v13, Lcom/zykj/mistake/main/MainAppRootKt$MainAppRoot$2$1$5$1;

    .line 299
    .line 300
    invoke-direct {v13, v2}, Lcom/zykj/mistake/main/MainAppRootKt$MainAppRoot$2$1$5$1;-><init>(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    invoke-interface {v14, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    :cond_f
    check-cast v13, Ly6/e;

    .line 307
    .line 308
    check-cast v13, Lr6/c;

    .line 309
    .line 310
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v8

    .line 314
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v15

    .line 318
    if-nez v8, :cond_10

    .line 319
    .line 320
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 321
    .line 322
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v8

    .line 326
    if-ne v15, v8, :cond_11

    .line 327
    .line 328
    :cond_10
    new-instance v15, Lcom/zykj/mistake/main/f;

    .line 329
    .line 330
    invoke-direct {v15, v2, v4}, Lcom/zykj/mistake/main/f;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V

    .line 331
    .line 332
    .line 333
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    :cond_11
    check-cast v15, Lr6/c;

    .line 337
    .line 338
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v8

    .line 342
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    if-nez v8, :cond_12

    .line 347
    .line 348
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 349
    .line 350
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v8

    .line 354
    if-ne v6, v8, :cond_13

    .line 355
    .line 356
    :cond_12
    new-instance v6, Lcom/zykj/mistake/main/g;

    .line 357
    .line 358
    invoke-direct {v6, v2, v4}, Lcom/zykj/mistake/main/g;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V

    .line 359
    .line 360
    .line 361
    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    :cond_13
    move-object v8, v6

    .line 365
    check-cast v8, Lr6/a;

    .line 366
    .line 367
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v5

    .line 375
    if-nez v6, :cond_14

    .line 376
    .line 377
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 378
    .line 379
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    if-ne v5, v6, :cond_15

    .line 384
    .line 385
    :cond_14
    new-instance v5, Lcom/zykj/mistake/main/g;

    .line 386
    .line 387
    invoke-direct {v5, v2, v3}, Lcom/zykj/mistake/main/g;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V

    .line 388
    .line 389
    .line 390
    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    :cond_15
    check-cast v5, Lr6/a;

    .line 394
    .line 395
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v6

    .line 399
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    if-nez v6, :cond_16

    .line 404
    .line 405
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 406
    .line 407
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v6

    .line 411
    if-ne v3, v6, :cond_17

    .line 412
    .line 413
    :cond_16
    new-instance v3, Lcom/zykj/mistake/main/h;

    .line 414
    .line 415
    invoke-direct {v3, v2, v4}, Lcom/zykj/mistake/main/h;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V

    .line 416
    .line 417
    .line 418
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    :cond_17
    check-cast v3, Lr6/e;

    .line 422
    .line 423
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v6

    .line 427
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    if-nez v6, :cond_18

    .line 432
    .line 433
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 434
    .line 435
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v6

    .line 439
    if-ne v4, v6, :cond_19

    .line 440
    .line 441
    :cond_18
    new-instance v4, Lcom/zykj/mistake/main/f;

    .line 442
    .line 443
    const/4 v6, 0x1

    .line 444
    invoke-direct {v4, v2, v6}, Lcom/zykj/mistake/main/f;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V

    .line 445
    .line 446
    .line 447
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    :cond_19
    check-cast v4, Lr6/c;

    .line 451
    .line 452
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    move-object/from16 v16, v1

    .line 457
    .line 458
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    if-nez v6, :cond_1a

    .line 463
    .line 464
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 465
    .line 466
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v6

    .line 470
    if-ne v1, v6, :cond_1b

    .line 471
    .line 472
    :cond_1a
    new-instance v1, Lcom/zykj/mistake/main/g;

    .line 473
    .line 474
    const/4 v6, 0x2

    .line 475
    invoke-direct {v1, v2, v6}, Lcom/zykj/mistake/main/g;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V

    .line 476
    .line 477
    .line 478
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    :cond_1b
    check-cast v1, Lr6/a;

    .line 482
    .line 483
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result v6

    .line 487
    move-object/from16 p2, v1

    .line 488
    .line 489
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    if-nez v6, :cond_1c

    .line 494
    .line 495
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 496
    .line 497
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v6

    .line 501
    if-ne v1, v6, :cond_1d

    .line 502
    .line 503
    :cond_1c
    new-instance v1, Lcom/zykj/mistake/main/g;

    .line 504
    .line 505
    const/4 v6, 0x4

    .line 506
    invoke-direct {v1, v2, v6}, Lcom/zykj/mistake/main/g;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V

    .line 507
    .line 508
    .line 509
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    :cond_1d
    check-cast v1, Lr6/a;

    .line 513
    .line 514
    move-object v6, v13

    .line 515
    move-object v13, v1

    .line 516
    move-object v1, v7

    .line 517
    move-object v7, v15

    .line 518
    const/4 v15, 0x0

    .line 519
    move-object/from16 v17, v16

    .line 520
    .line 521
    const/16 v16, 0x0

    .line 522
    .line 523
    move-object/from16 v18, v10

    .line 524
    .line 525
    move-object v10, v3

    .line 526
    move-object/from16 v3, v18

    .line 527
    .line 528
    move-object/from16 v18, v11

    .line 529
    .line 530
    move-object v11, v4

    .line 531
    move-object/from16 v4, v18

    .line 532
    .line 533
    move-object/from16 v18, v2

    .line 534
    .line 535
    move-object v2, v9

    .line 536
    move-object v9, v5

    .line 537
    move-object v5, v12

    .line 538
    move-object/from16 v12, p2

    .line 539
    .line 540
    invoke-static/range {v1 .. v16}, Lcom/zykj/mistake/main/drawer/e;->a(Lcom/zykj/mistake/main/l;Lr6/a;Lr6/e;Lr6/a;Lr6/c;Lr6/c;Lr6/c;Lr6/a;Lr6/a;Lr6/e;Lr6/c;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 541
    .line 542
    .line 543
    iget-object v1, v0, Lcom/zykj/mistake/main/i;->d:Lo2/a;

    .line 544
    .line 545
    const/4 v2, 0x0

    .line 546
    const/4 v3, 0x0

    .line 547
    invoke-static {v1, v2, v14, v3}, Lcom/zykj/mistake/main/c1;->a(Lo2/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 548
    .line 549
    .line 550
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    check-cast v1, Lcom/zykj/mistake/main/m;

    .line 555
    .line 556
    iget-object v1, v1, Lcom/zykj/mistake/main/m;->b:Lcom/zykj/mistake/main/RemoveDialogTarget;

    .line 557
    .line 558
    if-nez v1, :cond_1e

    .line 559
    .line 560
    const v1, 0x2ce919fc

    .line 561
    .line 562
    .line 563
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 564
    .line 565
    .line 566
    :goto_2
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 567
    .line 568
    .line 569
    goto :goto_3

    .line 570
    :cond_1e
    const v2, 0x2ce919fd

    .line 571
    .line 572
    .line 573
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 574
    .line 575
    .line 576
    move-object/from16 v2, v18

    .line 577
    .line 578
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    move-result v4

    .line 582
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v5

    .line 586
    if-nez v4, :cond_1f

    .line 587
    .line 588
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 589
    .line 590
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v4

    .line 594
    if-ne v5, v4, :cond_20

    .line 595
    .line 596
    :cond_1f
    new-instance v5, Lcom/zykj/mistake/main/g;

    .line 597
    .line 598
    const/4 v4, 0x5

    .line 599
    invoke-direct {v5, v2, v4}, Lcom/zykj/mistake/main/g;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V

    .line 600
    .line 601
    .line 602
    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    :cond_20
    check-cast v5, Lr6/a;

    .line 606
    .line 607
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 608
    .line 609
    .line 610
    move-result v4

    .line 611
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 612
    .line 613
    .line 614
    move-result v4

    .line 615
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    move-result v6

    .line 619
    or-int/2addr v4, v6

    .line 620
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v6

    .line 624
    if-nez v4, :cond_21

    .line 625
    .line 626
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 627
    .line 628
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v4

    .line 632
    if-ne v6, v4, :cond_22

    .line 633
    .line 634
    :cond_21
    new-instance v6, Landroidx/navigation/e;

    .line 635
    .line 636
    const/16 v4, 0xf

    .line 637
    .line 638
    invoke-direct {v6, v4, v1, v2}, Landroidx/navigation/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    :cond_22
    check-cast v6, Lr6/a;

    .line 645
    .line 646
    invoke-static {v1, v5, v6, v14, v3}, Lr4/c;->b(Lcom/zykj/mistake/main/RemoveDialogTarget;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 647
    .line 648
    .line 649
    goto :goto_2

    .line 650
    :goto_3
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 651
    .line 652
    .line 653
    iget-boolean v1, v0, Lcom/zykj/mistake/main/i;->a:Z

    .line 654
    .line 655
    invoke-static {v1, v14, v3}, La/a;->a(ZLandroidx/compose/runtime/Composer;I)V

    .line 656
    .line 657
    .line 658
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 659
    .line 660
    .line 661
    move-result v1

    .line 662
    if-eqz v1, :cond_24

    .line 663
    .line 664
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 665
    .line 666
    .line 667
    goto :goto_4

    .line 668
    :cond_23
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 669
    .line 670
    .line 671
    :cond_24
    :goto_4
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 672
    .line 673
    return-object v1
.end method
