.class public abstract Lw6/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Lw6/c;->e(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lw6/c;->d(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 18

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
    move-object/from16 v4, p3

    .line 8
    .line 9
    move/from16 v9, p6

    .line 10
    .line 11
    const-string v3, "answerSheetBundleString"

    .line 12
    .line 13
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v3, "navController"

    .line 17
    .line 18
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v3, "changeOrientation"

    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v3, "requestPermission"

    .line 27
    .line 28
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const v3, -0x2e43a6d4

    .line 32
    .line 33
    .line 34
    move-object/from16 v5, p5

    .line 35
    .line 36
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 37
    .line 38
    .line 39
    move-result-object v15

    .line 40
    and-int/lit8 v5, v9, 0x6

    .line 41
    .line 42
    if-nez v5, :cond_1

    .line 43
    .line 44
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_0

    .line 49
    .line 50
    const/4 v5, 0x4

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 v5, 0x2

    .line 53
    :goto_0
    or-int/2addr v5, v9

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move v5, v9

    .line 56
    :goto_1
    and-int/lit8 v6, v9, 0x30

    .line 57
    .line 58
    if-nez v6, :cond_3

    .line 59
    .line 60
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    const/16 v6, 0x20

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    const/16 v6, 0x10

    .line 70
    .line 71
    :goto_2
    or-int/2addr v5, v6

    .line 72
    :cond_3
    and-int/lit16 v6, v9, 0x180

    .line 73
    .line 74
    if-nez v6, :cond_5

    .line 75
    .line 76
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-eqz v6, :cond_4

    .line 81
    .line 82
    const/16 v6, 0x100

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    const/16 v6, 0x80

    .line 86
    .line 87
    :goto_3
    or-int/2addr v5, v6

    .line 88
    :cond_5
    and-int/lit16 v6, v9, 0xc00

    .line 89
    .line 90
    if-nez v6, :cond_7

    .line 91
    .line 92
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_6

    .line 97
    .line 98
    const/16 v6, 0x800

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_6
    const/16 v6, 0x400

    .line 102
    .line 103
    :goto_4
    or-int/2addr v5, v6

    .line 104
    :cond_7
    and-int/lit16 v6, v9, 0x6000

    .line 105
    .line 106
    if-nez v6, :cond_a

    .line 107
    .line 108
    and-int/lit8 v6, p7, 0x10

    .line 109
    .line 110
    if-nez v6, :cond_8

    .line 111
    .line 112
    move-object/from16 v6, p4

    .line 113
    .line 114
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-eqz v7, :cond_9

    .line 119
    .line 120
    const/16 v7, 0x4000

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_8
    move-object/from16 v6, p4

    .line 124
    .line 125
    :cond_9
    const/16 v7, 0x2000

    .line 126
    .line 127
    :goto_5
    or-int/2addr v5, v7

    .line 128
    goto :goto_6

    .line 129
    :cond_a
    move-object/from16 v6, p4

    .line 130
    .line 131
    :goto_6
    and-int/lit16 v7, v5, 0x2493

    .line 132
    .line 133
    const/16 v8, 0x2492

    .line 134
    .line 135
    const/4 v10, 0x0

    .line 136
    if-eq v7, v8, :cond_b

    .line 137
    .line 138
    const/4 v7, 0x1

    .line 139
    goto :goto_7

    .line 140
    :cond_b
    move v7, v10

    .line 141
    :goto_7
    and-int/lit8 v8, v5, 0x1

    .line 142
    .line 143
    invoke-interface {v15, v7, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-eqz v7, :cond_15

    .line 148
    .line 149
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 150
    .line 151
    .line 152
    and-int/lit8 v7, v9, 0x1

    .line 153
    .line 154
    const v8, -0xe001

    .line 155
    .line 156
    .line 157
    if-eqz v7, :cond_d

    .line 158
    .line 159
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    if-eqz v7, :cond_c

    .line 164
    .line 165
    goto :goto_9

    .line 166
    :cond_c
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 167
    .line 168
    .line 169
    and-int/lit8 v7, p7, 0x10

    .line 170
    .line 171
    if-eqz v7, :cond_10

    .line 172
    .line 173
    :goto_8
    and-int/2addr v5, v8

    .line 174
    goto :goto_c

    .line 175
    :cond_d
    :goto_9
    and-int/lit8 v7, p7, 0x10

    .line 176
    .line 177
    if-eqz v7, :cond_10

    .line 178
    .line 179
    const v6, 0x70b323c8

    .line 180
    .line 181
    .line 182
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 183
    .line 184
    .line 185
    sget-object v6, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 186
    .line 187
    sget v7, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->$stable:I

    .line 188
    .line 189
    invoke-virtual {v6, v15, v7}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    if-eqz v11, :cond_f

    .line 194
    .line 195
    invoke-static {v11, v15, v10}, Landroidx/hilt/navigation/compose/HiltViewModelKt;->createHiltViewModelFactory(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 196
    .line 197
    .line 198
    move-result-object v13

    .line 199
    const v6, 0x671a9c9b

    .line 200
    .line 201
    .line 202
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 203
    .line 204
    .line 205
    instance-of v6, v11, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 206
    .line 207
    if-eqz v6, :cond_e

    .line 208
    .line 209
    move-object v6, v11

    .line 210
    check-cast v6, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 211
    .line 212
    invoke-interface {v6}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    :goto_a
    move-object v14, v6

    .line 217
    goto :goto_b

    .line 218
    :cond_e
    sget-object v6, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 219
    .line 220
    goto :goto_a

    .line 221
    :goto_b
    const v16, 0x9048

    .line 222
    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    const-class v10, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    .line 227
    .line 228
    const/4 v12, 0x0

    .line 229
    invoke-static/range {v10 .. v17}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 234
    .line 235
    .line 236
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 237
    .line 238
    .line 239
    check-cast v6, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    .line 240
    .line 241
    goto :goto_8

    .line 242
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 243
    .line 244
    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 245
    .line 246
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw v0

    .line 250
    :cond_10
    :goto_c
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 251
    .line 252
    .line 253
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 254
    .line 255
    .line 256
    move-result v7

    .line 257
    if-eqz v7, :cond_11

    .line 258
    .line 259
    const/4 v7, -0x1

    .line 260
    const-string v8, "com.zykj.evaluation.ui.sheet.composition.CompositionSheetPage (CompositionSheetPage.kt:17)"

    .line 261
    .line 262
    invoke-static {v3, v5, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 263
    .line 264
    .line 265
    :cond_11
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v7

    .line 273
    or-int/2addr v3, v7

    .line 274
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    if-nez v3, :cond_12

    .line 279
    .line 280
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 281
    .line 282
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    if-ne v7, v3, :cond_13

    .line 287
    .line 288
    :cond_12
    new-instance v7, Lw6/a;

    .line 289
    .line 290
    invoke-direct {v7, v1, v6}, Lw6/a;-><init>(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)V

    .line 291
    .line 292
    .line 293
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    :cond_13
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 297
    .line 298
    and-int/lit16 v3, v5, 0x3fe

    .line 299
    .line 300
    shr-int/lit8 v8, v5, 0x3

    .line 301
    .line 302
    and-int/lit16 v8, v8, 0x1c00

    .line 303
    .line 304
    or-int/2addr v3, v8

    .line 305
    const v8, 0xe000

    .line 306
    .line 307
    .line 308
    shl-int/lit8 v5, v5, 0x3

    .line 309
    .line 310
    and-int/2addr v5, v8

    .line 311
    or-int/2addr v3, v5

    .line 312
    const/4 v8, 0x0

    .line 313
    move-object v5, v7

    .line 314
    move v7, v3

    .line 315
    move-object v3, v6

    .line 316
    move-object v6, v15

    .line 317
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->v(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 318
    .line 319
    .line 320
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-eqz v0, :cond_14

    .line 325
    .line 326
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 327
    .line 328
    .line 329
    :cond_14
    move-object v5, v3

    .line 330
    goto :goto_d

    .line 331
    :cond_15
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 332
    .line 333
    .line 334
    move-object v5, v6

    .line 335
    :goto_d
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 336
    .line 337
    .line 338
    move-result-object v8

    .line 339
    if-eqz v8, :cond_16

    .line 340
    .line 341
    new-instance v0, Lw6/b;

    .line 342
    .line 343
    move-object/from16 v1, p0

    .line 344
    .line 345
    move-object/from16 v2, p1

    .line 346
    .line 347
    move-object/from16 v3, p2

    .line 348
    .line 349
    move-object/from16 v4, p3

    .line 350
    .line 351
    move/from16 v7, p7

    .line 352
    .line 353
    move v6, v9

    .line 354
    invoke-direct/range {v0 .. v7}, Lw6/b;-><init>(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;II)V

    .line 355
    .line 356
    .line 357
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 358
    .line 359
    .line 360
    :cond_16
    return-void
.end method

.method public static final d(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)Lkotlin/Unit;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/navigation/NavController;->getPreviousBackStackEntry()Landroidx/navigation/NavBackStackEntry;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/navigation/NavBackStackEntry;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lcom/google/gson/Gson;

    .line 14
    .line 15
    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lcom/zykj/evaluation/bean/bundle/AnswerData;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->d0()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->c0()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {v1, v2, p1}, Lcom/zykj/evaluation/bean/bundle/AnswerData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v0, "ANSWER_SHEET_RESULT_ANSWER_DATA"

    .line 36
    .line 37
    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0
.end method

.method public static final e(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 8

    .line 1
    or-int/lit8 p5, p5, 0x1

    .line 2
    .line 3
    invoke-static {p5}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v6

    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move-object v3, p3

    .line 11
    move-object v4, p4

    .line 12
    move v7, p6

    .line 13
    move-object v5, p7

    .line 14
    invoke-static/range {v0 .. v7}, Lw6/c;->c(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;Landroidx/compose/runtime/Composer;II)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0
.end method
