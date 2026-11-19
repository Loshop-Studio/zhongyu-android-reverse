.class public abstract Lc7/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/runtime/MutableState;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lc7/r;->j(Landroidx/compose/runtime/MutableState;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc7/c;Landroidx/compose/runtime/MutableState;Landroid/content/Context;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lc7/r;->m(Lc7/c;Landroidx/compose/runtime/MutableState;Landroid/content/Context;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc7/c;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lc7/r;->k(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc7/c;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc7/c;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lc7/r;->o(Lc7/c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/runtime/MutableState;)F
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lc7/r;->n(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/runtime/MutableState;)F

    move-result p0

    return p0
.end method

.method public static synthetic f(Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lc7/r;->i(Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc7/c;Landroidx/compose/runtime/Composer;II)V
    .locals 20

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p4

    .line 6
    .line 7
    const-string v0, "path"

    .line 8
    .line 9
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "sketchPlayFunction"

    .line 13
    .line 14
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v0, -0x50fd99f1

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p3

    .line 21
    .line 22
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    and-int/lit8 v1, p5, 0x1

    .line 27
    .line 28
    const/4 v5, 0x2

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    or-int/lit8 v6, v4, 0x6

    .line 32
    .line 33
    move v7, v6

    .line 34
    move-object/from16 v6, p0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    and-int/lit8 v6, v4, 0x6

    .line 38
    .line 39
    if-nez v6, :cond_2

    .line 40
    .line 41
    move-object/from16 v6, p0

    .line 42
    .line 43
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_1

    .line 48
    .line 49
    const/4 v7, 0x4

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v7, v5

    .line 52
    :goto_0
    or-int/2addr v7, v4

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move-object/from16 v6, p0

    .line 55
    .line 56
    move v7, v4

    .line 57
    :goto_1
    and-int/lit8 v9, v4, 0x30

    .line 58
    .line 59
    const/16 v10, 0x20

    .line 60
    .line 61
    if-nez v9, :cond_4

    .line 62
    .line 63
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    if-eqz v9, :cond_3

    .line 68
    .line 69
    move v9, v10

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    const/16 v9, 0x10

    .line 72
    .line 73
    :goto_2
    or-int/2addr v7, v9

    .line 74
    :cond_4
    and-int/lit16 v9, v4, 0x180

    .line 75
    .line 76
    if-nez v9, :cond_6

    .line 77
    .line 78
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    if-eqz v9, :cond_5

    .line 83
    .line 84
    const/16 v9, 0x100

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_5
    const/16 v9, 0x80

    .line 88
    .line 89
    :goto_3
    or-int/2addr v7, v9

    .line 90
    :cond_6
    and-int/lit16 v9, v7, 0x93

    .line 91
    .line 92
    const/16 v11, 0x92

    .line 93
    .line 94
    const/4 v12, 0x0

    .line 95
    const/4 v13, 0x1

    .line 96
    if-eq v9, v11, :cond_7

    .line 97
    .line 98
    move v9, v13

    .line 99
    goto :goto_4

    .line 100
    :cond_7
    move v9, v12

    .line 101
    :goto_4
    and-int/lit8 v11, v7, 0x1

    .line 102
    .line 103
    invoke-interface {v8, v9, v11}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-eqz v9, :cond_12

    .line 108
    .line 109
    if-eqz v1, :cond_8

    .line 110
    .line 111
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 112
    .line 113
    move-object v14, v1

    .line 114
    goto :goto_5

    .line 115
    :cond_8
    move-object v14, v6

    .line 116
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_9

    .line 121
    .line 122
    const/4 v1, -0x1

    .line 123
    const-string v6, "com.zykj.evaluation.ui.sketch.SketchPlayView (SketchPlayView.kt:29)"

    .line 124
    .line 125
    invoke-static {v0, v7, v1, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :cond_9
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 133
    .line 134
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    if-ne v0, v6, :cond_a

    .line 139
    .line 140
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 141
    .line 142
    const/4 v6, 0x0

    .line 143
    invoke-static {v0, v6, v5, v6}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_a
    check-cast v0, Landroidx/compose/runtime/MutableState;

    .line 151
    .line 152
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-nez v5, :cond_b

    .line 157
    .line 158
    const v0, 0x825ecb3

    .line 159
    .line 160
    .line 161
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 162
    .line 163
    .line 164
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 165
    .line 166
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 167
    .line 168
    .line 169
    move-result-wide v15

    .line 170
    const/16 v18, 0x2

    .line 171
    .line 172
    const/16 v19, 0x0

    .line 173
    .line 174
    const/16 v17, 0x0

    .line 175
    .line 176
    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0, v8, v12}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 181
    .line 182
    .line 183
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 184
    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_b
    const v5, 0x827d550

    .line 188
    .line 189
    .line 190
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 191
    .line 192
    .line 193
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    if-nez v5, :cond_c

    .line 202
    .line 203
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    if-ne v6, v5, :cond_d

    .line 208
    .line 209
    :cond_c
    new-instance v6, Lc7/l;

    .line 210
    .line 211
    invoke-direct {v6, v3, v0}, Lc7/l;-><init>(Lc7/c;Landroidx/compose/runtime/MutableState;)V

    .line 212
    .line 213
    .line 214
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_d
    move-object v5, v6

    .line 218
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 219
    .line 220
    and-int/lit8 v6, v7, 0x70

    .line 221
    .line 222
    if-ne v6, v10, :cond_e

    .line 223
    .line 224
    move v12, v13

    .line 225
    :cond_e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    if-nez v12, :cond_f

    .line 230
    .line 231
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    if-ne v6, v1, :cond_10

    .line 236
    .line 237
    :cond_f
    new-instance v6, Lc7/m;

    .line 238
    .line 239
    invoke-direct {v6, v2, v0}, Lc7/m;-><init>(Ljava/lang/String;Landroidx/compose/runtime/MutableState;)V

    .line 240
    .line 241
    .line 242
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    :cond_10
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 246
    .line 247
    shl-int/lit8 v0, v7, 0x3

    .line 248
    .line 249
    and-int/lit8 v9, v0, 0x70

    .line 250
    .line 251
    const/4 v10, 0x0

    .line 252
    move-object v7, v6

    .line 253
    move-object v6, v14

    .line 254
    invoke-static/range {v5 .. v10}, Landroidx/compose/ui/viewinterop/AndroidView_androidKt;->AndroidView(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 255
    .line 256
    .line 257
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 258
    .line 259
    .line 260
    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_11

    .line 265
    .line 266
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 267
    .line 268
    .line 269
    :cond_11
    move-object v1, v14

    .line 270
    goto :goto_7

    .line 271
    :cond_12
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 272
    .line 273
    .line 274
    move-object v1, v6

    .line 275
    :goto_7
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    if-eqz v6, :cond_13

    .line 280
    .line 281
    new-instance v0, Lc7/n;

    .line 282
    .line 283
    move/from16 v5, p5

    .line 284
    .line 285
    invoke-direct/range {v0 .. v5}, Lc7/n;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc7/c;II)V

    .line 286
    .line 287
    .line 288
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 289
    .line 290
    .line 291
    :cond_13
    return-void
.end method

.method public static final h(Landroidx/compose/runtime/MutableState;)Z
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static final i(Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroid/view/View;)Lkotlin/Unit;
    .locals 8

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const-string v0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    .line 11
    .line 12
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p2, Landroidx/appcompat/app/AppCompatActivity;

    .line 16
    .line 17
    invoke-virtual {p2}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const-string v0, "getSupportFragmentManager(...)"

    .line 22
    .line 23
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "SketchPlayFragment"

    .line 27
    .line 28
    invoke-virtual {p2, v0}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    move-object v0, p2

    .line 33
    check-cast v0, Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    new-instance v5, Lc7/o;

    .line 38
    .line 39
    invoke-direct {v5, p1}, Lc7/o;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 40
    .line 41
    .line 42
    const/16 v6, 0xe

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v2, 0x0

    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    move-object v1, p0

    .line 49
    invoke-static/range {v0 .. v7}, Lcom/zykj/view/board/play/SketchPlayFragment;->b0(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;IZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0
.end method

.method public static final j(Landroidx/compose/runtime/MutableState;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lc7/r;->l(Landroidx/compose/runtime/MutableState;Z)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final k(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc7/c;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    .line 1
    or-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v4

    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move v5, p4

    .line 11
    move-object v3, p5

    .line 12
    invoke-static/range {v0 .. v5}, Lc7/r;->g(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc7/c;Landroidx/compose/runtime/Composer;II)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0
.end method

.method public static final l(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final m(Lc7/c;Landroidx/compose/runtime/MutableState;Landroid/content/Context;)Landroid/view/View;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "context"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v1, Ll8/h;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    check-cast v1, Landroidx/appcompat/app/AppCompatActivity;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "getSupportFragmentManager(...)"

    .line 28
    .line 29
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v3, "beginTransaction(...)"

    .line 37
    .line 38
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 42
    .line 43
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v4, "SketchPlayFragment"

    .line 47
    .line 48
    invoke-virtual {v1, v4}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 53
    .line 54
    iput-object v1, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 55
    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Landroidx/fragment/app/FragmentTransaction;->remove(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 61
    .line 62
    .line 63
    :cond_0
    new-instance v1, Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 64
    .line 65
    invoke-direct {v1}, Lcom/zykj/view/board/play/SketchPlayFragment;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v1, v4}, Landroidx/fragment/app/FragmentTransaction;->add(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v2}, Landroidx/fragment/app/FragmentTransaction;->commitNowAllowingStateLoss()V

    .line 73
    .line 74
    .line 75
    iput-object v1, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 76
    .line 77
    new-instance v1, Lc7/p;

    .line 78
    .line 79
    move-object/from16 v2, p1

    .line 80
    .line 81
    invoke-direct {v1, v3, v2}, Lc7/p;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/runtime/MutableState;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lc7/c;->g(Lkotlin/jvm/functions/Function0;)V

    .line 85
    .line 86
    .line 87
    iget-object v1, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v1, Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 90
    .line 91
    new-instance v4, Lt7/a;

    .line 92
    .line 93
    new-instance v6, Lc7/q;

    .line 94
    .line 95
    invoke-direct {v6, v0}, Lc7/q;-><init>(Lc7/c;)V

    .line 96
    .line 97
    .line 98
    const/16 v15, 0xfd

    .line 99
    .line 100
    const/16 v16, 0x0

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    const/4 v7, 0x0

    .line 104
    const/4 v8, 0x0

    .line 105
    const/4 v9, 0x0

    .line 106
    const/4 v10, 0x0

    .line 107
    const/4 v11, 0x0

    .line 108
    const/4 v12, 0x0

    .line 109
    const/4 v13, 0x1

    .line 110
    const/4 v14, 0x1

    .line 111
    invoke-direct/range {v4 .. v16}, Lt7/a;-><init>(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lt7/b;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v4}, Lcom/zykj/view/board/play/SketchPlayFragment;->e0(Lt7/a;)V

    .line 115
    .line 116
    .line 117
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 120
    .line 121
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0
.end method

.method public static final n(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/runtime/MutableState;)F
    .locals 0

    .line 1
    invoke-static {p1}, Lc7/r;->h(Landroidx/compose/runtime/MutableState;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->H()F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    .line 17
    .line 18
    return p0
.end method

.method public static final o(Lc7/c;)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc7/c;->e()Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lc7/c;->f()Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0
.end method
