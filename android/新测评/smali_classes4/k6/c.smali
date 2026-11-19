.class public abstract Lk6/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;Landroidx/navigation/NavController;JJ)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lk6/c;->d(Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;Landroidx/navigation/NavController;JJ)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lk6/c;->e(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v9, p5

    .line 4
    .line 5
    const-string v1, "navController"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v1, 0x4939ce8b

    .line 11
    .line 12
    .line 13
    move-object/from16 v2, p4

    .line 14
    .line 15
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    .line 18
    move-result-object v15

    .line 19
    and-int/lit8 v2, v9, 0x6

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v2, 0x2

    .line 32
    :goto_0
    or-int/2addr v2, v9

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v2, v9

    .line 35
    :goto_1
    and-int/lit8 v3, p6, 0x2

    .line 36
    .line 37
    const/16 v4, 0x20

    .line 38
    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    or-int/lit8 v2, v2, 0x30

    .line 42
    .line 43
    :cond_2
    move-wide/from16 v5, p1

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    and-int/lit8 v5, v9, 0x30

    .line 47
    .line 48
    if-nez v5, :cond_2

    .line 49
    .line 50
    move-wide/from16 v5, p1

    .line 51
    .line 52
    invoke-interface {v15, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_4

    .line 57
    .line 58
    move v7, v4

    .line 59
    goto :goto_2

    .line 60
    :cond_4
    const/16 v7, 0x10

    .line 61
    .line 62
    :goto_2
    or-int/2addr v2, v7

    .line 63
    :goto_3
    and-int/lit16 v7, v9, 0x180

    .line 64
    .line 65
    if-nez v7, :cond_7

    .line 66
    .line 67
    and-int/lit8 v7, p6, 0x4

    .line 68
    .line 69
    if-nez v7, :cond_5

    .line 70
    .line 71
    move-object/from16 v7, p3

    .line 72
    .line 73
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_6

    .line 78
    .line 79
    const/16 v8, 0x100

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_5
    move-object/from16 v7, p3

    .line 83
    .line 84
    :cond_6
    const/16 v8, 0x80

    .line 85
    .line 86
    :goto_4
    or-int/2addr v2, v8

    .line 87
    goto :goto_5

    .line 88
    :cond_7
    move-object/from16 v7, p3

    .line 89
    .line 90
    :goto_5
    and-int/lit16 v8, v2, 0x93

    .line 91
    .line 92
    const/16 v10, 0x92

    .line 93
    .line 94
    const/4 v11, 0x0

    .line 95
    const/16 v18, 0x1

    .line 96
    .line 97
    if-eq v8, v10, :cond_8

    .line 98
    .line 99
    move/from16 v8, v18

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_8
    move v8, v11

    .line 103
    :goto_6
    and-int/lit8 v10, v2, 0x1

    .line 104
    .line 105
    invoke-interface {v15, v8, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    if-eqz v8, :cond_14

    .line 110
    .line 111
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 112
    .line 113
    .line 114
    and-int/lit8 v8, v9, 0x1

    .line 115
    .line 116
    if-eqz v8, :cond_b

    .line 117
    .line 118
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-eqz v8, :cond_9

    .line 123
    .line 124
    goto :goto_7

    .line 125
    :cond_9
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 126
    .line 127
    .line 128
    and-int/lit8 v3, p6, 0x4

    .line 129
    .line 130
    if-eqz v3, :cond_a

    .line 131
    .line 132
    and-int/lit16 v2, v2, -0x381

    .line 133
    .line 134
    :cond_a
    move-object v3, v7

    .line 135
    move v7, v11

    .line 136
    goto :goto_a

    .line 137
    :cond_b
    :goto_7
    if-eqz v3, :cond_c

    .line 138
    .line 139
    const-wide/32 v5, 0x1614ea

    .line 140
    .line 141
    .line 142
    :cond_c
    and-int/lit8 v3, p6, 0x4

    .line 143
    .line 144
    if-eqz v3, :cond_a

    .line 145
    .line 146
    const v3, 0x70b323c8

    .line 147
    .line 148
    .line 149
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 150
    .line 151
    .line 152
    sget-object v3, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 153
    .line 154
    sget v7, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->$stable:I

    .line 155
    .line 156
    invoke-virtual {v3, v15, v7}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    if-eqz v3, :cond_e

    .line 161
    .line 162
    invoke-static {v3, v15, v11}, Landroidx/hilt/navigation/compose/HiltViewModelKt;->createHiltViewModelFactory(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 163
    .line 164
    .line 165
    move-result-object v13

    .line 166
    const v7, 0x671a9c9b

    .line 167
    .line 168
    .line 169
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 170
    .line 171
    .line 172
    instance-of v7, v3, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 173
    .line 174
    if-eqz v7, :cond_d

    .line 175
    .line 176
    move-object v7, v3

    .line 177
    check-cast v7, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 178
    .line 179
    invoke-interface {v7}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    :goto_8
    move-object v14, v7

    .line 184
    goto :goto_9

    .line 185
    :cond_d
    sget-object v7, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 186
    .line 187
    goto :goto_8

    .line 188
    :goto_9
    const v16, 0x9048

    .line 189
    .line 190
    .line 191
    const/16 v17, 0x0

    .line 192
    .line 193
    const-class v10, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;

    .line 194
    .line 195
    const/4 v12, 0x0

    .line 196
    move/from16 v19, v11

    .line 197
    .line 198
    move-object v11, v3

    .line 199
    move/from16 v3, v19

    .line 200
    .line 201
    invoke-static/range {v10 .. v17}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 206
    .line 207
    .line 208
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 209
    .line 210
    .line 211
    check-cast v7, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;

    .line 212
    .line 213
    and-int/lit16 v2, v2, -0x381

    .line 214
    .line 215
    move-object/from16 v19, v7

    .line 216
    .line 217
    move v7, v3

    .line 218
    move-object/from16 v3, v19

    .line 219
    .line 220
    goto :goto_a

    .line 221
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 222
    .line 223
    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 224
    .line 225
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw v0

    .line 229
    :goto_a
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 230
    .line 231
    .line 232
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 233
    .line 234
    .line 235
    move-result v8

    .line 236
    if-eqz v8, :cond_f

    .line 237
    .line 238
    const/4 v8, -0x1

    .line 239
    const-string v10, "com.zykj.evaluation.ui.guide.normal.correcting.CorrectingGuidePage (CorrectingGuidePage.kt:19)"

    .line 240
    .line 241
    invoke-static {v1, v2, v8, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :cond_f
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    or-int/2addr v1, v8

    .line 253
    and-int/lit8 v8, v2, 0x70

    .line 254
    .line 255
    if-ne v8, v4, :cond_10

    .line 256
    .line 257
    move/from16 v11, v18

    .line 258
    .line 259
    goto :goto_b

    .line 260
    :cond_10
    move v11, v7

    .line 261
    :goto_b
    or-int/2addr v1, v11

    .line 262
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    if-nez v1, :cond_11

    .line 267
    .line 268
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 269
    .line 270
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    if-ne v4, v1, :cond_12

    .line 275
    .line 276
    :cond_11
    new-instance v4, Lk6/a;

    .line 277
    .line 278
    invoke-direct {v4, v3, v0, v5, v6}, Lk6/a;-><init>(Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;Landroidx/navigation/NavController;J)V

    .line 279
    .line 280
    .line 281
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    :cond_12
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 285
    .line 286
    and-int/lit16 v7, v2, 0x3fe

    .line 287
    .line 288
    const/16 v8, 0x8

    .line 289
    .line 290
    move-wide v1, v5

    .line 291
    move-object v5, v4

    .line 292
    const/4 v4, 0x0

    .line 293
    move-object v6, v15

    .line 294
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/ui/guide/normal/GuidePageKt;->g(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 295
    .line 296
    .line 297
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-eqz v0, :cond_13

    .line 302
    .line 303
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 304
    .line 305
    .line 306
    :cond_13
    move-object v4, v3

    .line 307
    move-wide v2, v1

    .line 308
    goto :goto_c

    .line 309
    :cond_14
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 310
    .line 311
    .line 312
    move-wide v2, v5

    .line 313
    move-object v4, v7

    .line 314
    :goto_c
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    if-eqz v7, :cond_15

    .line 319
    .line 320
    new-instance v0, Lk6/b;

    .line 321
    .line 322
    move-object/from16 v1, p0

    .line 323
    .line 324
    move/from16 v6, p6

    .line 325
    .line 326
    move v5, v9

    .line 327
    invoke-direct/range {v0 .. v6}, Lk6/b;-><init>(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;II)V

    .line 328
    .line 329
    .line 330
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 331
    .line 332
    .line 333
    :cond_15
    return-void
.end method

.method public static final d(Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;Landroidx/navigation/NavController;JJ)Lkotlin/Unit;
    .locals 6

    .line 1
    invoke-virtual {p0, p4, p5}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->N(J)Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lg7/b;->a()Landroid/os/Bundle;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    const-string p5, "KEY_DETAIL_BUNDLE"

    .line 12
    .line 13
    invoke-virtual {p4, p5, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    new-instance p0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string p4, "DETAIL_CORRECTING/"

    .line 22
    .line 23
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v4, 0x6

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v2, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    move-object v0, p1

    .line 38
    invoke-static/range {v0 .. v5}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0
.end method

.method public static final e(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7

    .line 1
    or-int/lit8 p4, p4, 0x1

    .line 2
    .line 3
    invoke-static {p4}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v5

    .line 7
    move-object v0, p0

    .line 8
    move-wide v1, p1

    .line 9
    move-object v3, p3

    .line 10
    move v6, p5

    .line 11
    move-object v4, p6

    .line 12
    invoke-static/range {v0 .. v6}, Lk6/c;->c(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;Landroidx/compose/runtime/Composer;II)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0
.end method
