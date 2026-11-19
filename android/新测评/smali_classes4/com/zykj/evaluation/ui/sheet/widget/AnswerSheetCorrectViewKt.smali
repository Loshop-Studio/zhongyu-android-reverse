.class public abstract Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroid/graphics/Bitmap;Ljava/util/List;Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt;->h(Landroid/graphics/Bitmap;Ljava/util/List;Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt;->i(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt;->g(Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lb7/t0;Landroid/content/Context;)Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt;->f(Lkotlin/jvm/functions/Function1;Lb7/t0;Landroid/content/Context;)Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 14

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    move-object/from16 v5, p4

    .line 6
    .line 7
    move/from16 v6, p6

    .line 8
    .line 9
    const-string v0, "bitmap"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "dataList"

    .line 15
    .line 16
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v0, "correctFunction"

    .line 20
    .line 21
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v0, "onClickListener"

    .line 25
    .line 26
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const v0, 0xeb3ecc1

    .line 30
    .line 31
    .line 32
    move-object/from16 v1, p5

    .line 33
    .line 34
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    and-int/lit8 v1, p7, 0x1

    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    or-int/lit8 v7, v6, 0x6

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    and-int/lit8 v7, v6, 0x6

    .line 46
    .line 47
    if-nez v7, :cond_2

    .line 48
    .line 49
    invoke-interface {v10, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_1

    .line 54
    .line 55
    const/4 v7, 0x4

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const/4 v7, 0x2

    .line 58
    :goto_0
    or-int/2addr v7, v6

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v7, v6

    .line 61
    :goto_1
    and-int/lit8 v8, v6, 0x30

    .line 62
    .line 63
    if-nez v8, :cond_4

    .line 64
    .line 65
    invoke-interface {v10, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-eqz v8, :cond_3

    .line 70
    .line 71
    const/16 v8, 0x20

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    const/16 v8, 0x10

    .line 75
    .line 76
    :goto_2
    or-int/2addr v7, v8

    .line 77
    :cond_4
    and-int/lit16 v8, v6, 0x180

    .line 78
    .line 79
    if-nez v8, :cond_6

    .line 80
    .line 81
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-eqz v8, :cond_5

    .line 86
    .line 87
    const/16 v8, 0x100

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_5
    const/16 v8, 0x80

    .line 91
    .line 92
    :goto_3
    or-int/2addr v7, v8

    .line 93
    :cond_6
    and-int/lit16 v8, v6, 0xc00

    .line 94
    .line 95
    if-nez v8, :cond_8

    .line 96
    .line 97
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-eqz v8, :cond_7

    .line 102
    .line 103
    const/16 v8, 0x800

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_7
    const/16 v8, 0x400

    .line 107
    .line 108
    :goto_4
    or-int/2addr v7, v8

    .line 109
    :cond_8
    and-int/lit16 v8, v6, 0x6000

    .line 110
    .line 111
    const/16 v9, 0x4000

    .line 112
    .line 113
    if-nez v8, :cond_a

    .line 114
    .line 115
    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-eqz v8, :cond_9

    .line 120
    .line 121
    move v8, v9

    .line 122
    goto :goto_5

    .line 123
    :cond_9
    const/16 v8, 0x2000

    .line 124
    .line 125
    :goto_5
    or-int/2addr v7, v8

    .line 126
    :cond_a
    and-int/lit16 v8, v7, 0x2493

    .line 127
    .line 128
    const/16 v11, 0x2492

    .line 129
    .line 130
    const/4 v12, 0x0

    .line 131
    const/4 v13, 0x1

    .line 132
    if-eq v8, v11, :cond_b

    .line 133
    .line 134
    move v8, v13

    .line 135
    goto :goto_6

    .line 136
    :cond_b
    move v8, v12

    .line 137
    :goto_6
    and-int/lit8 v11, v7, 0x1

    .line 138
    .line 139
    invoke-interface {v10, v8, v11}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    if-eqz v8, :cond_14

    .line 144
    .line 145
    if-eqz v1, :cond_c

    .line 146
    .line 147
    sget-object p0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 148
    .line 149
    :cond_c
    move-object v8, p0

    .line 150
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    if-eqz p0, :cond_d

    .line 155
    .line 156
    const/4 p0, -0x1

    .line 157
    const-string v1, "com.zykj.evaluation.ui.sheet.widget.AnswerSheetCorrectView (AnswerSheetCorrectView.kt:23)"

    .line 158
    .line 159
    invoke-static {v0, v7, p0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :cond_d
    const p0, 0xe000

    .line 163
    .line 164
    .line 165
    and-int/2addr p0, v7

    .line 166
    if-ne p0, v9, :cond_e

    .line 167
    .line 168
    move v12, v13

    .line 169
    :cond_e
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    or-int/2addr p0, v12

    .line 174
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    if-nez p0, :cond_f

    .line 179
    .line 180
    sget-object p0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 181
    .line 182
    invoke-virtual {p0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    if-ne v0, p0, :cond_10

    .line 187
    .line 188
    :cond_f
    new-instance v0, Lb7/a;

    .line 189
    .line 190
    invoke-direct {v0, v5, v4}, Lb7/a;-><init>(Lkotlin/jvm/functions/Function1;Lb7/t0;)V

    .line 191
    .line 192
    .line 193
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_10
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 197
    .line 198
    invoke-interface {v10, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result p0

    .line 202
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    or-int/2addr p0, v1

    .line 207
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    if-nez p0, :cond_11

    .line 212
    .line 213
    sget-object p0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 214
    .line 215
    invoke-virtual {p0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    if-ne v1, p0, :cond_12

    .line 220
    .line 221
    :cond_11
    new-instance v1, Lb7/b;

    .line 222
    .line 223
    invoke-direct {v1, p1, v3}, Lb7/b;-><init>(Landroid/graphics/Bitmap;Ljava/util/List;)V

    .line 224
    .line 225
    .line 226
    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    :cond_12
    move-object v9, v1

    .line 230
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 231
    .line 232
    shl-int/lit8 p0, v7, 0x3

    .line 233
    .line 234
    and-int/lit8 v11, p0, 0x70

    .line 235
    .line 236
    const/4 v12, 0x0

    .line 237
    move-object v7, v0

    .line 238
    invoke-static/range {v7 .. v12}, Landroidx/compose/ui/viewinterop/AndroidView_androidKt;->AndroidView(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 239
    .line 240
    .line 241
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 242
    .line 243
    .line 244
    move-result p0

    .line 245
    if-eqz p0, :cond_13

    .line 246
    .line 247
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 248
    .line 249
    .line 250
    :cond_13
    move-object v1, v8

    .line 251
    goto :goto_7

    .line 252
    :cond_14
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 253
    .line 254
    .line 255
    move-object v1, p0

    .line 256
    :goto_7
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    if-eqz p0, :cond_15

    .line 261
    .line 262
    new-instance v0, Lb7/c;

    .line 263
    .line 264
    move-object v2, p1

    .line 265
    move/from16 v7, p7

    .line 266
    .line 267
    invoke-direct/range {v0 .. v7}, Lb7/c;-><init>(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lkotlin/jvm/functions/Function1;II)V

    .line 268
    .line 269
    .line 270
    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 271
    .line 272
    .line 273
    :cond_15
    return-void
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Lb7/t0;Landroid/content/Context;)Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, p2, v2, v1, v2}, Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    .line 13
    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    invoke-direct {p2, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p0}, Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;->setOnClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 23
    .line 24
    .line 25
    new-instance p0, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;

    .line 26
    .line 27
    invoke-direct {p0, v0, v2}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;-><init>(Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p0}, Lb7/t0;->d(Lkotlin/jvm/functions/Function3;)V

    .line 31
    .line 32
    .line 33
    new-instance p0, Lb7/d;

    .line 34
    .line 35
    invoke-direct {p0, v0}, Lb7/d;-><init>(Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p0}, Lb7/t0;->c(Lkotlin/jvm/functions/Function0;)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method public static final g(Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;->o()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final h(Landroid/graphics/Bitmap;Ljava/util/List;Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, p0}, Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p1}, Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;->q(Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
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
    invoke-static/range {v0 .. v7}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt;->e(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0
.end method
