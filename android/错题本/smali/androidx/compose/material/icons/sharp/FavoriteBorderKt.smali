.class public final Landroidx/compose/material/icons/sharp/FavoriteBorderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_favoriteBorder",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FavoriteBorder",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getFavoriteBorder",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFavoriteBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavoriteBorder.kt\nandroidx/compose/material/icons/sharp/FavoriteBorderKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,58:1\n212#2,12:59\n233#2,18:72\n253#2:109\n174#3:71\n705#4,2:90\n717#4,2:92\n719#4,11:98\n72#5,4:94\n*S KotlinDebug\n*F\n+ 1 FavoriteBorder.kt\nandroidx/compose/material/icons/sharp/FavoriteBorderKt\n*L\n29#1:59,12\n30#1:72,18\n30#1:109\n29#1:71\n30#1:90,2\n30#1:92,2\n30#1:98,11\n30#1:94,4\n*E\n"
    }
.end annotation


# static fields
.field private static _favoriteBorder:Landroidx/compose/ui/graphics/vector/ImageVector;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static final getFavoriteBorder(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19
    .param p0    # Landroidx/compose/material/icons/Icons$Sharp;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/FavoriteBorderKt;->_favoriteBorder:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 10
    .line 11
    const/high16 v0, 0x41c00000    # 24.0f

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/16 v11, 0x60

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    const/high16 v5, 0x41c00000    # 24.0f

    .line 26
    .line 27
    const/high16 v6, 0x41c00000    # 24.0f

    .line 28
    .line 29
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const-string v2, "Sharp.FavoriteBorder"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/e;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 42
    .line 43
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    const/high16 v0, 0x41840000    # 16.5f

    .line 66
    .line 67
    const/high16 v2, 0x40400000    # 3.0f

    .line 68
    .line 69
    invoke-static {v0, v2}, Lg/a;->a(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 70
    .line 71
    .line 72
    move-result-object v12

    .line 73
    const/high16 v17, -0x3f700000    # -4.5f

    .line 74
    .line 75
    const v18, 0x4005c28f    # 2.09f

    .line 76
    .line 77
    .line 78
    const v13, -0x402147ae    # -1.74f

    .line 79
    .line 80
    .line 81
    const/4 v14, 0x0

    .line 82
    const v15, -0x3fa5c28f    # -3.41f

    .line 83
    .line 84
    .line 85
    const v16, 0x3f4f5c29    # 0.81f

    .line 86
    .line 87
    .line 88
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v17, 0x40f00000    # 7.5f

    .line 92
    .line 93
    const/high16 v18, 0x40400000    # 3.0f

    .line 94
    .line 95
    const v13, 0x412e8f5c    # 10.91f

    .line 96
    .line 97
    .line 98
    const v14, 0x4073d70a    # 3.81f

    .line 99
    .line 100
    .line 101
    const v15, 0x4113d70a    # 9.24f

    .line 102
    .line 103
    .line 104
    const/high16 v16, 0x40400000    # 3.0f

    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v17, 0x40000000    # 2.0f

    .line 110
    .line 111
    const/high16 v18, 0x41080000    # 8.5f

    .line 112
    .line 113
    const v13, 0x408d70a4    # 4.42f

    .line 114
    .line 115
    .line 116
    const/high16 v14, 0x40400000    # 3.0f

    .line 117
    .line 118
    const/high16 v15, 0x40000000    # 2.0f

    .line 119
    .line 120
    const v16, 0x40ad70a4    # 5.42f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v17, 0x4108cccd    # 8.55f

    .line 127
    .line 128
    .line 129
    const v18, 0x4138a3d7    # 11.54f

    .line 130
    .line 131
    .line 132
    const/4 v13, 0x0

    .line 133
    const v14, 0x4071eb85    # 3.78f

    .line 134
    .line 135
    .line 136
    const v15, 0x4059999a    # 3.4f

    .line 137
    .line 138
    .line 139
    const v16, 0x40db851f    # 6.86f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v0, 0x41400000    # 12.0f

    .line 146
    .line 147
    const v2, 0x41aacccd    # 21.35f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, 0x3fb9999a    # 1.45f

    .line 154
    .line 155
    .line 156
    const v2, -0x40570a3d    # -1.32f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v17, 0x41b00000    # 22.0f

    .line 163
    .line 164
    const/high16 v18, 0x41080000    # 8.5f

    .line 165
    .line 166
    const v13, 0x4194cccd    # 18.6f

    .line 167
    .line 168
    .line 169
    const v14, 0x4175c28f    # 15.36f

    .line 170
    .line 171
    .line 172
    const/high16 v15, 0x41b00000    # 22.0f

    .line 173
    .line 174
    const v16, 0x41447ae1    # 12.28f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v17, 0x41840000    # 16.5f

    .line 181
    .line 182
    const/high16 v18, 0x40400000    # 3.0f

    .line 183
    .line 184
    const/high16 v13, 0x41b00000    # 22.0f

    .line 185
    .line 186
    const v14, 0x40ad70a4    # 5.42f

    .line 187
    .line 188
    .line 189
    const v15, 0x419ca3d7    # 19.58f

    .line 190
    .line 191
    .line 192
    const/high16 v16, 0x40400000    # 3.0f

    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v0, 0x4141999a    # 12.1f

    .line 201
    .line 202
    .line 203
    const v2, 0x41946666    # 18.55f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v0, 0x3dcccccd    # 0.1f

    .line 210
    .line 211
    .line 212
    const v2, -0x42333333    # -0.1f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v0, -0x42333333    # -0.1f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v17, 0x40800000    # 4.0f

    .line 225
    .line 226
    const/high16 v18, 0x41080000    # 8.5f

    .line 227
    .line 228
    const v13, 0x40e47ae1    # 7.14f

    .line 229
    .line 230
    .line 231
    const v14, 0x4163d70a    # 14.24f

    .line 232
    .line 233
    .line 234
    const/high16 v15, 0x40800000    # 4.0f

    .line 235
    .line 236
    const v16, 0x41363d71    # 11.39f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v17, 0x40f00000    # 7.5f

    .line 243
    .line 244
    const/high16 v18, 0x40a00000    # 5.0f

    .line 245
    .line 246
    const/high16 v13, 0x40800000    # 4.0f

    .line 247
    .line 248
    const/high16 v14, 0x40d00000    # 6.5f

    .line 249
    .line 250
    const/high16 v15, 0x40b00000    # 5.5f

    .line 251
    .line 252
    const/high16 v16, 0x40a00000    # 5.0f

    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v17, 0x40647ae1    # 3.57f

    .line 258
    .line 259
    .line 260
    const v18, 0x40170a3d    # 2.36f

    .line 261
    .line 262
    .line 263
    const v13, 0x3fc51eb8    # 1.54f

    .line 264
    .line 265
    .line 266
    const/4 v14, 0x0

    .line 267
    const v15, 0x40428f5c    # 3.04f

    .line 268
    .line 269
    .line 270
    const v16, 0x3f7d70a4    # 0.99f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, 0x3fef5c29    # 1.87f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v17, 0x41840000    # 16.5f

    .line 283
    .line 284
    const/high16 v18, 0x40a00000    # 5.0f

    .line 285
    .line 286
    const v13, 0x41575c29    # 13.46f

    .line 287
    .line 288
    .line 289
    const v14, 0x40bfae14    # 5.99f

    .line 290
    .line 291
    .line 292
    const v15, 0x416f5c29    # 14.96f

    .line 293
    .line 294
    .line 295
    const/high16 v16, 0x40a00000    # 5.0f

    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v17, 0x40600000    # 3.5f

    .line 301
    .line 302
    const/high16 v18, 0x40600000    # 3.5f

    .line 303
    .line 304
    const/high16 v13, 0x40000000    # 2.0f

    .line 305
    .line 306
    const/4 v14, 0x0

    .line 307
    const/high16 v15, 0x40600000    # 3.5f

    .line 308
    .line 309
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, -0x3f033333    # -7.9f

    .line 315
    .line 316
    .line 317
    const v18, 0x4120cccd    # 10.05f

    .line 318
    .line 319
    .line 320
    const/4 v13, 0x0

    .line 321
    const v14, 0x4038f5c3    # 2.89f

    .line 322
    .line 323
    .line 324
    const v15, -0x3fb70a3d    # -3.14f

    .line 325
    .line 326
    .line 327
    const v16, 0x40b7ae14    # 5.74f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    const/16 v16, 0x3800

    .line 341
    .line 342
    const/16 v17, 0x0

    .line 343
    .line 344
    const/high16 v6, 0x3f800000    # 1.0f

    .line 345
    .line 346
    const/high16 v8, 0x3f800000    # 1.0f

    .line 347
    .line 348
    const/4 v7, 0x0

    .line 349
    const/high16 v9, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const/high16 v12, 0x3f800000    # 1.0f

    .line 352
    .line 353
    const/4 v14, 0x0

    .line 354
    const/4 v15, 0x0

    .line 355
    const-string v4, ""

    .line 356
    .line 357
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    sput-object v0, Landroidx/compose/material/icons/sharp/FavoriteBorderKt;->_favoriteBorder:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 366
    .line 367
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    return-object v0
.end method
