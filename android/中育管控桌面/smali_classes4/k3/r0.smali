.class public abstract Lk3/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk3/r0$a;
    }
.end annotation


# direct methods
.method public static final a(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Landroid/app/Activity;Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;)V
    .locals 2

    .line 1
    const-string p1, "currentScreenState"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "viewModel"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lk3/r0$a;->a:[I

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    aget p0, p1, p0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    if-eq p0, p1, :cond_3

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    const/4 v1, 0x0

    .line 24
    if-eq p0, v0, :cond_2

    .line 25
    .line 26
    const/4 v0, 0x3

    .line 27
    if-eq p0, v0, :cond_1

    .line 28
    .line 29
    const/4 p1, 0x4

    .line 30
    if-ne p0, p1, :cond_0

    .line 31
    .line 32
    sget-object p0, Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;->d:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    .line 33
    .line 34
    invoke-virtual {p2, p0, v1}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->r(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->t()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 42
    .line 43
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :cond_1
    sget-object p0, Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;->a:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    .line 48
    .line 49
    invoke-virtual {p2, p0, p1}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->r(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Z)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    sget-object p0, Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;->a:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    .line 54
    .line 55
    invoke-virtual {p2, p0, v1}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->r(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->t()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3
    const-class p0, Lcom/zykj/gallery/ui/activity/GalleryActivity;

    .line 63
    .line 64
    invoke-static {p0}, Lcom/dylanc/longan/ActivityKt;->a(Ljava/lang/Class;)Z

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public static final b(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;)Lh3/c0;
    .locals 1

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lk3/r0$a;->a:[I

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    aget p0, v0, p0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    if-eq p0, v0, :cond_0

    .line 19
    .line 20
    sget-object p0, Lh3/c0$c;->g:Lh3/c0$c;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    sget-object p0, Lh3/c0$d;->g:Lh3/c0$d;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    sget-object p0, Lh3/c0$b;->g:Lh3/c0$b;

    .line 27
    .line 28
    return-object p0
.end method

.method public static final c(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;IILandroidx/compose/runtime/Composer;II)Lk3/s0;
    .locals 20

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    const-string v1, "currentScreenState"

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    and-int/lit8 v1, p5, 0x2

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    move v1, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move/from16 v1, p1

    .line 18
    .line 19
    :goto_0
    const/4 v4, 0x4

    .line 20
    and-int/lit8 v5, p5, 0x4

    .line 21
    .line 22
    if-eqz v5, :cond_1

    .line 23
    .line 24
    move v5, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move/from16 v5, p2

    .line 27
    .line 28
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-eqz v6, :cond_2

    .line 33
    .line 34
    const/4 v6, -0x1

    .line 35
    const-string v7, "com.zykj.gallery.ui.gallery.screenList.getState (ScreenState.kt:23)"

    .line 36
    .line 37
    const v8, 0x10c903f1

    .line 38
    .line 39
    .line 40
    move/from16 v9, p4

    .line 41
    .line 42
    invoke-static {v8, v9, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    sget-object v6, Lk3/r0$a;->a:[I

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    aget v2, v6, v2

    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    if-eq v2, v6, :cond_c

    .line 55
    .line 56
    const/4 v1, 0x2

    .line 57
    if-eq v2, v1, :cond_8

    .line 58
    .line 59
    const/4 v1, 0x3

    .line 60
    if-eq v2, v1, :cond_7

    .line 61
    .line 62
    if-ne v2, v4, :cond_6

    .line 63
    .line 64
    const v1, 0x507697df

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 68
    .line 69
    .line 70
    new-instance v7, Lk3/s0$a;

    .line 71
    .line 72
    if-nez v5, :cond_3

    .line 73
    .line 74
    const v1, 0x29880b8

    .line 75
    .line 76
    .line 77
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 78
    .line 79
    .line 80
    sget v1, Lcom/zykj/gallery/R$string;->no_select:I

    .line 81
    .line 82
    invoke-static {v1, v0, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :goto_2
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 87
    .line 88
    .line 89
    move-object v8, v1

    .line 90
    goto :goto_3

    .line 91
    :cond_3
    const v1, 0x29886a5

    .line 92
    .line 93
    .line 94
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 95
    .line 96
    .line 97
    sget v1, Lcom/zykj/gallery/R$string;->select_capacity:I

    .line 98
    .line 99
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-static {v1, v2, v0, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    goto :goto_2

    .line 112
    :goto_3
    sget v1, Lcom/zykj/gallery/R$string;->delete:I

    .line 113
    .line 114
    invoke-static {v1, v0, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    if-nez v5, :cond_4

    .line 119
    .line 120
    invoke-static {}, Ln3/a;->d()J

    .line 121
    .line 122
    .line 123
    move-result-wide v1

    .line 124
    :goto_4
    move-wide v13, v1

    .line 125
    goto :goto_5

    .line 126
    :cond_4
    invoke-static {}, Ln3/a;->a()J

    .line 127
    .line 128
    .line 129
    move-result-wide v1

    .line 130
    goto :goto_4

    .line 131
    :goto_5
    if-eqz v5, :cond_5

    .line 132
    .line 133
    move/from16 v16, v6

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_5
    move/from16 v16, v3

    .line 137
    .line 138
    :goto_6
    const/16 v18, 0x5c

    .line 139
    .line 140
    const/16 v19, 0x0

    .line 141
    .line 142
    const/4 v10, 0x0

    .line 143
    const/4 v11, 0x0

    .line 144
    const/4 v12, 0x0

    .line 145
    const/4 v15, 0x0

    .line 146
    const/16 v17, 0x1

    .line 147
    .line 148
    invoke-direct/range {v7 .. v19}, Lk3/s0$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZJIZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 152
    .line 153
    .line 154
    goto/16 :goto_d

    .line 155
    .line 156
    :cond_6
    const v1, 0x297e1a7

    .line 157
    .line 158
    .line 159
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 160
    .line 161
    .line 162
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 163
    .line 164
    .line 165
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 166
    .line 167
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 168
    .line 169
    .line 170
    throw v0

    .line 171
    :cond_7
    const v1, 0x507111dc

    .line 172
    .line 173
    .line 174
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 175
    .line 176
    .line 177
    new-instance v4, Lk3/s0$b;

    .line 178
    .line 179
    sget v1, Lcom/zykj/gallery/R$string;->recent_delete:I

    .line 180
    .line 181
    invoke-static {v1, v0, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    sget v1, Lcom/zykj/gallery/R$string;->select_tips:I

    .line 186
    .line 187
    invoke-static {v1, v0, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    sget v1, Lcom/zykj/gallery/R$string;->recent_delete_clear:I

    .line 192
    .line 193
    invoke-static {v1, v0, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    invoke-static {}, Ln3/a;->a()J

    .line 198
    .line 199
    .line 200
    move-result-wide v11

    .line 201
    const/16 v13, 0x38

    .line 202
    .line 203
    const/4 v14, 0x0

    .line 204
    const/4 v8, 0x0

    .line 205
    const/4 v9, 0x0

    .line 206
    const/4 v10, 0x0

    .line 207
    invoke-direct/range {v4 .. v14}, Lk3/s0$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 208
    .line 209
    .line 210
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 211
    .line 212
    .line 213
    :goto_7
    move-object v7, v4

    .line 214
    goto/16 :goto_d

    .line 215
    .line 216
    :cond_8
    const v1, 0x50698306

    .line 217
    .line 218
    .line 219
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 220
    .line 221
    .line 222
    new-instance v7, Lk3/s0$a;

    .line 223
    .line 224
    if-nez v5, :cond_9

    .line 225
    .line 226
    const v1, 0x29814d8

    .line 227
    .line 228
    .line 229
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 230
    .line 231
    .line 232
    sget v1, Lcom/zykj/gallery/R$string;->no_select:I

    .line 233
    .line 234
    invoke-static {v1, v0, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    :goto_8
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 239
    .line 240
    .line 241
    move-object v8, v1

    .line 242
    goto :goto_9

    .line 243
    :cond_9
    const v1, 0x2981ac5

    .line 244
    .line 245
    .line 246
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 247
    .line 248
    .line 249
    sget v1, Lcom/zykj/gallery/R$string;->select_capacity:I

    .line 250
    .line 251
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-static {v1, v2, v0, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    goto :goto_8

    .line 264
    :goto_9
    sget v1, Lcom/zykj/gallery/R$string;->delete:I

    .line 265
    .line 266
    invoke-static {v1, v0, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    if-nez v5, :cond_a

    .line 271
    .line 272
    invoke-static {}, Ln3/a;->d()J

    .line 273
    .line 274
    .line 275
    move-result-wide v1

    .line 276
    :goto_a
    move-wide v13, v1

    .line 277
    goto :goto_b

    .line 278
    :cond_a
    invoke-static {}, Ln3/a;->a()J

    .line 279
    .line 280
    .line 281
    move-result-wide v1

    .line 282
    goto :goto_a

    .line 283
    :goto_b
    if-eqz v5, :cond_b

    .line 284
    .line 285
    move/from16 v16, v6

    .line 286
    .line 287
    goto :goto_c

    .line 288
    :cond_b
    move/from16 v16, v3

    .line 289
    .line 290
    :goto_c
    const/16 v18, 0x15c

    .line 291
    .line 292
    const/16 v19, 0x0

    .line 293
    .line 294
    const/4 v10, 0x0

    .line 295
    const/4 v11, 0x0

    .line 296
    const/4 v12, 0x0

    .line 297
    const/4 v15, 0x0

    .line 298
    const/16 v17, 0x0

    .line 299
    .line 300
    invoke-direct/range {v7 .. v19}, Lk3/s0$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZJIZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 301
    .line 302
    .line 303
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 304
    .line 305
    .line 306
    goto :goto_d

    .line 307
    :cond_c
    const v2, 0x5064a03f

    .line 308
    .line 309
    .line 310
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 311
    .line 312
    .line 313
    new-instance v4, Lk3/s0$b;

    .line 314
    .line 315
    sget v2, Lcom/zykj/gallery/R$string;->hw_gallery:I

    .line 316
    .line 317
    invoke-static {v2, v0, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    sget v2, Lcom/zykj/gallery/R$string;->gallery_capacity:I

    .line 322
    .line 323
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-static {v2, v1, v0, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    sget v1, Lcom/zykj/gallery/R$string;->recent_delete:I

    .line 336
    .line 337
    invoke-static {v1, v0, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v7

    .line 341
    const/16 v13, 0x78

    .line 342
    .line 343
    const/4 v14, 0x0

    .line 344
    const/4 v8, 0x0

    .line 345
    const/4 v9, 0x0

    .line 346
    const/4 v10, 0x0

    .line 347
    const-wide/16 v11, 0x0

    .line 348
    .line 349
    invoke-direct/range {v4 .. v14}, Lk3/s0$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 350
    .line 351
    .line 352
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 353
    .line 354
    .line 355
    goto/16 :goto_7

    .line 356
    .line 357
    :goto_d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    if-eqz v0, :cond_d

    .line 362
    .line 363
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 364
    .line 365
    .line 366
    :cond_d
    return-object v7
.end method

.method public static final d(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const-string v0, "screenState"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "viewModel"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "selectList"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onShowDeleteDialog"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lk3/r0$a;->a:[I

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    aget p0, v0, p0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    if-eq p0, v0, :cond_3

    .line 31
    .line 32
    const/4 p1, 0x2

    .line 33
    if-eq p0, p1, :cond_2

    .line 34
    .line 35
    const/4 p1, 0x3

    .line 36
    if-eq p0, p1, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x4

    .line 39
    if-ne p0, p1, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 43
    .line 44
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :cond_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    :goto_0
    invoke-interface {p3, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    sget-object p0, Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;->d:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    .line 61
    .line 62
    invoke-virtual {p1, p0, v0}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->r(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Z)V

    .line 63
    .line 64
    .line 65
    return-void
.end method
