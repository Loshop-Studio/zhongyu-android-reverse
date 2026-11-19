.class public final Landroidx/compose/material/icons/rounded/FitScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_fitScreen",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FitScreen",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getFitScreen",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-extended_release"
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
        "SMAP\nFitScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitScreen.kt\nandroidx/compose/material/icons/rounded/FitScreenKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,99:1\n212#2,12:100\n233#2,18:113\n253#2:150\n174#3:112\n705#4,2:131\n717#4,2:133\n719#4,11:139\n72#5,4:135\n*S KotlinDebug\n*F\n+ 1 FitScreen.kt\nandroidx/compose/material/icons/rounded/FitScreenKt\n*L\n29#1:100,12\n30#1:113,18\n30#1:150\n29#1:112\n30#1:131,2\n30#1:133,2\n30#1:139,11\n30#1:135,4\n*E\n"
    }
.end annotation


# static fields
.field private static _fitScreen:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFitScreen(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FitScreenKt;->_fitScreen:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

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
    const-string v2, "Rounded.FitScreen"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v0, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v2, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x40000000    # 2.0f

    .line 83
    .line 84
    const/high16 v18, 0x40000000    # 2.0f

    .line 85
    .line 86
    const v13, 0x3f8ccccd    # 1.1f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, 0x40000000    # 2.0f

    .line 91
    .line 92
    const v16, 0x3f666666    # 0.9f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v17, -0x40800000    # -1.0f

    .line 102
    .line 103
    const/high16 v18, 0x3f800000    # 1.0f

    .line 104
    .line 105
    const/4 v13, 0x0

    .line 106
    const v14, 0x3f0ccccd    # 0.55f

    .line 107
    .line 108
    .line 109
    const v15, -0x4119999a    # -0.45f

    .line 110
    .line 111
    .line 112
    const/high16 v16, 0x3f800000    # 1.0f

    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/4 v0, 0x0

    .line 118
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v18, -0x40800000    # -1.0f

    .line 122
    .line 123
    const v13, -0x40f33333    # -0.55f

    .line 124
    .line 125
    .line 126
    const/4 v14, 0x0

    .line 127
    const/high16 v15, -0x40800000    # -1.0f

    .line 128
    .line 129
    const v16, -0x4119999a    # -0.45f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v0, 0x40c00000    # 6.0f

    .line 136
    .line 137
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v0, -0x40000000    # -2.0f

    .line 141
    .line 142
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/4 v0, 0x0

    .line 149
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v17, 0x41900000    # 18.0f

    .line 153
    .line 154
    const/high16 v18, 0x40800000    # 4.0f

    .line 155
    .line 156
    const/high16 v13, 0x41880000    # 17.0f

    .line 157
    .line 158
    const v14, 0x408e6666    # 4.45f

    .line 159
    .line 160
    .line 161
    const v15, 0x418b999a    # 17.45f

    .line 162
    .line 163
    .line 164
    const/high16 v16, 0x40800000    # 4.0f

    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v0, 0x41000000    # 8.0f

    .line 173
    .line 174
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v0, -0x40000000    # -2.0f

    .line 178
    .line 179
    const/4 v2, 0x0

    .line 180
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v0, 0x40000000    # 2.0f

    .line 184
    .line 185
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v17, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/high16 v18, -0x40800000    # -1.0f

    .line 191
    .line 192
    const v13, 0x3f0ccccd    # 0.55f

    .line 193
    .line 194
    .line 195
    const/4 v14, 0x0

    .line 196
    const/high16 v15, 0x3f800000    # 1.0f

    .line 197
    .line 198
    const v16, -0x4119999a    # -0.45f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/4 v0, 0x0

    .line 205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v17, -0x40800000    # -1.0f

    .line 209
    .line 210
    const/4 v13, 0x0

    .line 211
    const v14, -0x40f33333    # -0.55f

    .line 212
    .line 213
    .line 214
    const v15, -0x4119999a    # -0.45f

    .line 215
    .line 216
    .line 217
    const/high16 v16, -0x40800000    # -1.0f

    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v0, 0x40800000    # 4.0f

    .line 223
    .line 224
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v17, 0x40000000    # 2.0f

    .line 228
    .line 229
    const/high16 v18, 0x40c00000    # 6.0f

    .line 230
    .line 231
    const v13, 0x4039999a    # 2.9f

    .line 232
    .line 233
    .line 234
    const/high16 v14, 0x40800000    # 4.0f

    .line 235
    .line 236
    const/high16 v15, 0x40000000    # 2.0f

    .line 237
    .line 238
    const v16, 0x409ccccd    # 4.9f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v0, 0x40000000    # 2.0f

    .line 245
    .line 246
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v17, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const/high16 v18, 0x3f800000    # 1.0f

    .line 252
    .line 253
    const/4 v13, 0x0

    .line 254
    const v14, 0x3f0ccccd    # 0.55f

    .line 255
    .line 256
    .line 257
    const v15, 0x3ee66666    # 0.45f

    .line 258
    .line 259
    .line 260
    const/high16 v16, 0x3f800000    # 1.0f

    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/4 v0, 0x0

    .line 266
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v17, 0x40800000    # 4.0f

    .line 270
    .line 271
    const/high16 v18, 0x41000000    # 8.0f

    .line 272
    .line 273
    const v13, 0x40633333    # 3.55f

    .line 274
    .line 275
    .line 276
    const/high16 v14, 0x41100000    # 9.0f

    .line 277
    .line 278
    const/high16 v15, 0x40800000    # 4.0f

    .line 279
    .line 280
    const v16, 0x4108cccd    # 8.55f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v0, 0x41a00000    # 20.0f

    .line 290
    .line 291
    const/high16 v2, 0x41800000    # 16.0f

    .line 292
    .line 293
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v0, 0x40000000    # 2.0f

    .line 297
    .line 298
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v0, -0x40000000    # -2.0f

    .line 302
    .line 303
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v17, -0x40800000    # -1.0f

    .line 307
    .line 308
    const/high16 v18, 0x3f800000    # 1.0f

    .line 309
    .line 310
    const v13, -0x40f33333    # -0.55f

    .line 311
    .line 312
    .line 313
    const/4 v14, 0x0

    .line 314
    const/high16 v15, -0x40800000    # -1.0f

    .line 315
    .line 316
    const v16, 0x3ee66666    # 0.45f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/4 v0, 0x0

    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v17, 0x3f800000    # 1.0f

    .line 327
    .line 328
    const/4 v13, 0x0

    .line 329
    const v14, 0x3f0ccccd    # 0.55f

    .line 330
    .line 331
    .line 332
    const v15, 0x3ee66666    # 0.45f

    .line 333
    .line 334
    .line 335
    const/high16 v16, 0x3f800000    # 1.0f

    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x40000000    # 2.0f

    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, 0x40000000    # 2.0f

    .line 346
    .line 347
    const/high16 v18, -0x40000000    # -2.0f

    .line 348
    .line 349
    const v13, 0x3f8ccccd    # 1.1f

    .line 350
    .line 351
    .line 352
    const/4 v14, 0x0

    .line 353
    const/high16 v15, 0x40000000    # 2.0f

    .line 354
    .line 355
    const v16, -0x4099999a    # -0.9f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v0, -0x40000000    # -2.0f

    .line 362
    .line 363
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v17, -0x40800000    # -1.0f

    .line 367
    .line 368
    const/high16 v18, -0x40800000    # -1.0f

    .line 369
    .line 370
    const/4 v13, 0x0

    .line 371
    const v14, -0x40f33333    # -0.55f

    .line 372
    .line 373
    .line 374
    const v15, -0x4119999a    # -0.45f

    .line 375
    .line 376
    .line 377
    const/high16 v16, -0x40800000    # -1.0f

    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/4 v0, 0x0

    .line 383
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v17, 0x41a00000    # 20.0f

    .line 387
    .line 388
    const/high16 v18, 0x41800000    # 16.0f

    .line 389
    .line 390
    const v13, 0x41a3999a    # 20.45f

    .line 391
    .line 392
    .line 393
    const/high16 v14, 0x41700000    # 15.0f

    .line 394
    .line 395
    const/high16 v15, 0x41a00000    # 20.0f

    .line 396
    .line 397
    const v16, 0x41773333    # 15.45f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x40c00000    # 6.0f

    .line 407
    .line 408
    const/high16 v2, 0x41900000    # 18.0f

    .line 409
    .line 410
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v0, 0x40800000    # 4.0f

    .line 414
    .line 415
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v0, -0x40000000    # -2.0f

    .line 419
    .line 420
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v17, -0x40800000    # -1.0f

    .line 424
    .line 425
    const/high16 v18, -0x40800000    # -1.0f

    .line 426
    .line 427
    const/4 v13, 0x0

    .line 428
    const v14, -0x40f33333    # -0.55f

    .line 429
    .line 430
    .line 431
    const v15, -0x4119999a    # -0.45f

    .line 432
    .line 433
    .line 434
    const/high16 v16, -0x40800000    # -1.0f

    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/4 v0, 0x0

    .line 440
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v18, 0x3f800000    # 1.0f

    .line 444
    .line 445
    const v13, -0x40f33333    # -0.55f

    .line 446
    .line 447
    .line 448
    const/4 v14, 0x0

    .line 449
    const/high16 v15, -0x40800000    # -1.0f

    .line 450
    .line 451
    const v16, 0x3ee66666    # 0.45f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v0, 0x40000000    # 2.0f

    .line 458
    .line 459
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v17, 0x40000000    # 2.0f

    .line 463
    .line 464
    const/high16 v18, 0x40000000    # 2.0f

    .line 465
    .line 466
    const/4 v13, 0x0

    .line 467
    const v14, 0x3f8ccccd    # 1.1f

    .line 468
    .line 469
    .line 470
    const v15, 0x3f666666    # 0.9f

    .line 471
    .line 472
    .line 473
    const/high16 v16, 0x40000000    # 2.0f

    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v17, 0x3f800000    # 1.0f

    .line 482
    .line 483
    const/high16 v18, -0x40800000    # -1.0f

    .line 484
    .line 485
    const v13, 0x3f0ccccd    # 0.55f

    .line 486
    .line 487
    .line 488
    const/4 v14, 0x0

    .line 489
    const/high16 v15, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const v16, -0x4119999a    # -0.45f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/4 v0, 0x0

    .line 498
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v17, 0x40c00000    # 6.0f

    .line 502
    .line 503
    const/high16 v18, 0x41900000    # 18.0f

    .line 504
    .line 505
    const/high16 v13, 0x40e00000    # 7.0f

    .line 506
    .line 507
    const v14, 0x4193999a    # 18.45f

    .line 508
    .line 509
    .line 510
    const v15, 0x40d1999a    # 6.55f

    .line 511
    .line 512
    .line 513
    const/high16 v16, 0x41900000    # 18.0f

    .line 514
    .line 515
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v0, 0x41800000    # 16.0f

    .line 522
    .line 523
    const/high16 v2, 0x41000000    # 8.0f

    .line 524
    .line 525
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v0, 0x41000000    # 8.0f

    .line 529
    .line 530
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v17, -0x40000000    # -2.0f

    .line 534
    .line 535
    const/high16 v18, 0x40000000    # 2.0f

    .line 536
    .line 537
    const v13, -0x40733333    # -1.1f

    .line 538
    .line 539
    .line 540
    const/4 v14, 0x0

    .line 541
    const/high16 v15, -0x40000000    # -2.0f

    .line 542
    .line 543
    const v16, 0x3f666666    # 0.9f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v0, 0x40800000    # 4.0f

    .line 550
    .line 551
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v17, 0x40000000    # 2.0f

    .line 555
    .line 556
    const/4 v13, 0x0

    .line 557
    const v14, 0x3f8ccccd    # 1.1f

    .line 558
    .line 559
    .line 560
    const v15, 0x3f666666    # 0.9f

    .line 561
    .line 562
    .line 563
    const/high16 v16, 0x40000000    # 2.0f

    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v0, 0x41000000    # 8.0f

    .line 569
    .line 570
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v18, -0x40000000    # -2.0f

    .line 574
    .line 575
    const v13, 0x3f8ccccd    # 1.1f

    .line 576
    .line 577
    .line 578
    const/4 v14, 0x0

    .line 579
    const/high16 v15, 0x40000000    # 2.0f

    .line 580
    .line 581
    const v16, -0x4099999a    # -0.9f

    .line 582
    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v0, -0x3f800000    # -4.0f

    .line 588
    .line 589
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v17, 0x41800000    # 16.0f

    .line 593
    .line 594
    const/high16 v18, 0x41000000    # 8.0f

    .line 595
    .line 596
    const/high16 v13, 0x41900000    # 18.0f

    .line 597
    .line 598
    const v14, 0x410e6666    # 8.9f

    .line 599
    .line 600
    .line 601
    const v15, 0x4188cccd    # 17.1f

    .line 602
    .line 603
    .line 604
    const/high16 v16, 0x41000000    # 8.0f

    .line 605
    .line 606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    const/16 v16, 0x3800

    .line 617
    .line 618
    const/16 v17, 0x0

    .line 619
    .line 620
    const/high16 v6, 0x3f800000    # 1.0f

    .line 621
    .line 622
    const/high16 v8, 0x3f800000    # 1.0f

    .line 623
    .line 624
    const/4 v7, 0x0

    .line 625
    const/high16 v9, 0x3f800000    # 1.0f

    .line 626
    .line 627
    const/high16 v12, 0x3f800000    # 1.0f

    .line 628
    .line 629
    const/4 v13, 0x0

    .line 630
    const/4 v14, 0x0

    .line 631
    const/4 v15, 0x0

    .line 632
    const-string v4, ""

    .line 633
    .line 634
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    sput-object v0, Landroidx/compose/material/icons/rounded/FitScreenKt;->_fitScreen:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 643
    .line 644
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 645
    .line 646
    .line 647
    return-object v0
.end method
