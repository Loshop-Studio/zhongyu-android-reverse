.class public abstract Lcom/zykj/mistake/main/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/navigation/NavHostController;Lcom/zykj/mistake/main/MainShellViewModel;Lo2/a;ZLr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v6, p4

    .line 8
    .line 9
    move-object/from16 v7, p5

    .line 10
    .line 11
    move/from16 v8, p7

    .line 12
    .line 13
    const-string v0, "navController"

    .line 14
    .line 15
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "shellViewModel"

    .line 19
    .line 20
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "webCaptureContainer"

    .line 24
    .line 25
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "onShellBack"

    .line 29
    .line 30
    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v0, "onFinishApp"

    .line 34
    .line 35
    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const v0, -0x6cd7909d

    .line 39
    .line 40
    .line 41
    move-object/from16 v4, p6

    .line 42
    .line 43
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 44
    .line 45
    .line 46
    move-result-object v13

    .line 47
    and-int/lit8 v4, v8, 0x6

    .line 48
    .line 49
    if-nez v4, :cond_1

    .line 50
    .line 51
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_0

    .line 56
    .line 57
    const/4 v4, 0x4

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const/4 v4, 0x2

    .line 60
    :goto_0
    or-int/2addr v4, v8

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    move v4, v8

    .line 63
    :goto_1
    and-int/lit8 v5, v8, 0x30

    .line 64
    .line 65
    if-nez v5, :cond_3

    .line 66
    .line 67
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_2

    .line 72
    .line 73
    const/16 v5, 0x20

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    const/16 v5, 0x10

    .line 77
    .line 78
    :goto_2
    or-int/2addr v4, v5

    .line 79
    :cond_3
    and-int/lit16 v5, v8, 0x180

    .line 80
    .line 81
    if-nez v5, :cond_5

    .line 82
    .line 83
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_4

    .line 88
    .line 89
    const/16 v5, 0x100

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_4
    const/16 v5, 0x80

    .line 93
    .line 94
    :goto_3
    or-int/2addr v4, v5

    .line 95
    :cond_5
    and-int/lit16 v5, v8, 0xc00

    .line 96
    .line 97
    if-nez v5, :cond_7

    .line 98
    .line 99
    move/from16 v5, p3

    .line 100
    .line 101
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    if-eqz v9, :cond_6

    .line 106
    .line 107
    const/16 v9, 0x800

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_6
    const/16 v9, 0x400

    .line 111
    .line 112
    :goto_4
    or-int/2addr v4, v9

    .line 113
    goto :goto_5

    .line 114
    :cond_7
    move/from16 v5, p3

    .line 115
    .line 116
    :goto_5
    and-int/lit16 v9, v8, 0x6000

    .line 117
    .line 118
    const/16 v10, 0x4000

    .line 119
    .line 120
    if-nez v9, :cond_9

    .line 121
    .line 122
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    if-eqz v9, :cond_8

    .line 127
    .line 128
    move v9, v10

    .line 129
    goto :goto_6

    .line 130
    :cond_8
    const/16 v9, 0x2000

    .line 131
    .line 132
    :goto_6
    or-int/2addr v4, v9

    .line 133
    :cond_9
    const/high16 v9, 0x30000

    .line 134
    .line 135
    and-int/2addr v9, v8

    .line 136
    const/high16 v11, 0x20000

    .line 137
    .line 138
    if-nez v9, :cond_b

    .line 139
    .line 140
    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v9

    .line 144
    if-eqz v9, :cond_a

    .line 145
    .line 146
    move v9, v11

    .line 147
    goto :goto_7

    .line 148
    :cond_a
    const/high16 v9, 0x10000

    .line 149
    .line 150
    :goto_7
    or-int/2addr v4, v9

    .line 151
    :cond_b
    const v9, 0x12493

    .line 152
    .line 153
    .line 154
    and-int/2addr v9, v4

    .line 155
    const v12, 0x12492

    .line 156
    .line 157
    .line 158
    const/4 v14, 0x0

    .line 159
    const/4 v15, 0x1

    .line 160
    if-eq v9, v12, :cond_c

    .line 161
    .line 162
    move v9, v15

    .line 163
    goto :goto_8

    .line 164
    :cond_c
    move v9, v14

    .line 165
    :goto_8
    and-int/lit8 v12, v4, 0x1

    .line 166
    .line 167
    invoke-interface {v13, v9, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-eqz v9, :cond_12

    .line 172
    .line 173
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    if-eqz v9, :cond_d

    .line 178
    .line 179
    const/4 v9, -0x1

    .line 180
    const-string v12, "com.zykj.mistake.main.MainAppRoot (MainAppRoot.kt:25)"

    .line 181
    .line 182
    invoke-static {v0, v4, v9, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 183
    .line 184
    .line 185
    :cond_d
    iget-object v9, v2, Lcom/zykj/mistake/main/MainShellViewModel;->b:Lkotlinx/coroutines/flow/a0;

    .line 186
    .line 187
    move v0, v14

    .line 188
    const/4 v14, 0x0

    .line 189
    move v12, v15

    .line 190
    const/4 v15, 0x7

    .line 191
    move/from16 v16, v10

    .line 192
    .line 193
    const/4 v10, 0x0

    .line 194
    move/from16 v17, v11

    .line 195
    .line 196
    const/4 v11, 0x0

    .line 197
    move/from16 v18, v12

    .line 198
    .line 199
    const/4 v12, 0x0

    .line 200
    move/from16 v0, v16

    .line 201
    .line 202
    invoke-static/range {v9 .. v15}, Landroidx/lifecycle/compose/FlowExtKt;->collectAsStateWithLifecycle(Lkotlinx/coroutines/flow/m0;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lh6/h;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    shr-int/lit8 v10, v4, 0x3

    .line 207
    .line 208
    and-int/lit8 v10, v10, 0xe

    .line 209
    .line 210
    invoke-static {v2, v13, v10}, Lcom/zykj/mistake/main/l;->a(Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 211
    .line 212
    .line 213
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    const v11, 0xe000

    .line 218
    .line 219
    .line 220
    and-int/2addr v11, v4

    .line 221
    if-ne v11, v0, :cond_e

    .line 222
    .line 223
    const/4 v14, 0x1

    .line 224
    goto :goto_9

    .line 225
    :cond_e
    const/4 v14, 0x0

    .line 226
    :goto_9
    or-int v0, v10, v14

    .line 227
    .line 228
    const/high16 v10, 0x70000

    .line 229
    .line 230
    and-int/2addr v4, v10

    .line 231
    const/high16 v10, 0x20000

    .line 232
    .line 233
    if-ne v4, v10, :cond_f

    .line 234
    .line 235
    const/4 v14, 0x1

    .line 236
    goto :goto_a

    .line 237
    :cond_f
    const/4 v14, 0x0

    .line 238
    :goto_a
    or-int/2addr v0, v14

    .line 239
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    if-nez v0, :cond_10

    .line 244
    .line 245
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 246
    .line 247
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    if-ne v4, v0, :cond_11

    .line 252
    .line 253
    :cond_10
    new-instance v4, Landroidx/lifecycle/compose/a;

    .line 254
    .line 255
    invoke-direct {v4, v2, v6, v7}, Landroidx/lifecycle/compose/a;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;Lr6/a;Lr6/a;)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    :cond_11
    check-cast v4, Lr6/a;

    .line 262
    .line 263
    const/4 v0, 0x0

    .line 264
    const/4 v12, 0x1

    .line 265
    invoke-static {v0, v4, v13, v0, v12}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 266
    .line 267
    .line 268
    new-instance v0, Lcom/zykj/mistake/main/i;

    .line 269
    .line 270
    move-object v4, v3

    .line 271
    move-object v3, v2

    .line 272
    move-object v2, v1

    .line 273
    move v1, v5

    .line 274
    move-object v5, v9

    .line 275
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/main/i;-><init>(ZLandroidx/navigation/NavHostController;Lcom/zykj/mistake/main/MainShellViewModel;Lo2/a;Landroidx/compose/runtime/State;)V

    .line 276
    .line 277
    .line 278
    const/16 v1, 0x36

    .line 279
    .line 280
    const v2, 0x4eab0550

    .line 281
    .line 282
    .line 283
    invoke-static {v2, v12, v0, v13, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    const/4 v1, 0x6

    .line 288
    invoke-static {v13, v1, v0}, Lv7/d;->a(Landroidx/compose/runtime/Composer;ILr6/e;)V

    .line 289
    .line 290
    .line 291
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_13

    .line 296
    .line 297
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 298
    .line 299
    .line 300
    goto :goto_b

    .line 301
    :cond_12
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 302
    .line 303
    .line 304
    :cond_13
    :goto_b
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 305
    .line 306
    .line 307
    move-result-object v9

    .line 308
    if-eqz v9, :cond_14

    .line 309
    .line 310
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/k;

    .line 311
    .line 312
    move-object/from16 v1, p0

    .line 313
    .line 314
    move-object/from16 v2, p1

    .line 315
    .line 316
    move-object/from16 v3, p2

    .line 317
    .line 318
    move/from16 v4, p3

    .line 319
    .line 320
    move-object v5, v6

    .line 321
    move-object v6, v7

    .line 322
    move v7, v8

    .line 323
    invoke-direct/range {v0 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/k;-><init>(Landroidx/navigation/NavHostController;Lcom/zykj/mistake/main/MainShellViewModel;Lo2/a;ZLr6/a;Lr6/a;I)V

    .line 324
    .line 325
    .line 326
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 327
    .line 328
    .line 329
    :cond_14
    return-void
.end method
