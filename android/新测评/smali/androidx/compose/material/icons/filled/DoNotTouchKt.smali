.class public final Landroidx/compose/material/icons/filled/DoNotTouchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_doNotTouch",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DoNotTouch",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getDoNotTouch",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nDoNotTouch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoNotTouch.kt\nandroidx/compose/material/icons/filled/DoNotTouchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,109:1\n212#2,12:110\n233#2,18:123\n253#2:160\n174#3:122\n705#4,2:141\n717#4,2:143\n719#4,11:149\n72#5,4:145\n*S KotlinDebug\n*F\n+ 1 DoNotTouch.kt\nandroidx/compose/material/icons/filled/DoNotTouchKt\n*L\n29#1:110,12\n30#1:123,18\n30#1:160\n29#1:122\n30#1:141,2\n30#1:143,2\n30#1:149,11\n30#1:145,4\n*E\n"
    }
.end annotation


# static fields
.field private static _doNotTouch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDoNotTouch(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/DoNotTouchKt;->_doNotTouch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.DoNotTouch"

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
    const v0, 0x4122b852    # 10.17f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41500000    # 13.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 79
    .line 80
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v0, 0x40100000    # 2.25f

    .line 84
    .line 85
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v17, 0x413c0000    # 11.75f

    .line 89
    .line 90
    const/high16 v18, 0x3f800000    # 1.0f

    .line 91
    .line 92
    const/high16 v13, 0x41280000    # 10.5f

    .line 93
    .line 94
    const v14, 0x3fc7ae14    # 1.56f

    .line 95
    .line 96
    .line 97
    const v15, 0x4130f5c3    # 11.06f

    .line 98
    .line 99
    .line 100
    const/high16 v16, 0x3f800000    # 1.0f

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, 0x3fc7ae14    # 1.56f

    .line 106
    .line 107
    .line 108
    const/high16 v2, 0x40100000    # 2.25f

    .line 109
    .line 110
    const/high16 v4, 0x41500000    # 13.0f

    .line 111
    .line 112
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v0, 0x4122b852    # 10.17f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x41a00000    # 20.0f

    .line 125
    .line 126
    const/high16 v2, 0x414c0000    # 12.75f

    .line 127
    .line 128
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v0, 0x41300000    # 11.0f

    .line 132
    .line 133
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, 0x40a80000    # 5.25f

    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v17, 0x41960000    # 18.75f

    .line 142
    .line 143
    const/high16 v18, 0x40800000    # 4.0f

    .line 144
    .line 145
    const/high16 v13, 0x41a00000    # 20.0f

    .line 146
    .line 147
    const v14, 0x4091eb85    # 4.56f

    .line 148
    .line 149
    .line 150
    const v15, 0x419b851f    # 19.44f

    .line 151
    .line 152
    .line 153
    const/high16 v16, 0x40800000    # 4.0f

    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, 0x4091eb85    # 4.56f

    .line 159
    .line 160
    .line 161
    const/high16 v2, 0x418c0000    # 17.5f

    .line 162
    .line 163
    const/high16 v4, 0x40a80000    # 5.25f

    .line 164
    .line 165
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, 0x41300000    # 11.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, -0x40800000    # -1.0f

    .line 174
    .line 175
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v0, 0x40500000    # 3.25f

    .line 179
    .line 180
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v17, 0x41740000    # 15.25f

    .line 184
    .line 185
    const/high16 v18, 0x40000000    # 2.0f

    .line 186
    .line 187
    const/high16 v13, 0x41840000    # 16.5f

    .line 188
    .line 189
    const v14, 0x4023d70a    # 2.56f

    .line 190
    .line 191
    .line 192
    const v15, 0x417f0a3d    # 15.94f

    .line 193
    .line 194
    .line 195
    const/high16 v16, 0x40000000    # 2.0f

    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v0, 0x4023d70a    # 2.56f

    .line 201
    .line 202
    .line 203
    const/high16 v2, 0x41600000    # 14.0f

    .line 204
    .line 205
    const/high16 v4, 0x40500000    # 3.25f

    .line 206
    .line 207
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, 0x40fd70a4    # 7.92f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v0, 0x40c00000    # 6.0f

    .line 217
    .line 218
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v0, 0x414c0000    # 12.75f

    .line 222
    .line 223
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v0, 0x40880000    # 4.25f

    .line 230
    .line 231
    const/high16 v2, 0x41180000    # 9.5f

    .line 232
    .line 233
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v17, 0x41040000    # 8.25f

    .line 237
    .line 238
    const/high16 v18, 0x40400000    # 3.0f

    .line 239
    .line 240
    const/high16 v13, 0x41180000    # 9.5f

    .line 241
    .line 242
    const v14, 0x4063d70a    # 3.56f

    .line 243
    .line 244
    .line 245
    const v15, 0x410f0a3d    # 8.94f

    .line 246
    .line 247
    .line 248
    const/high16 v16, 0x40400000    # 3.0f

    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v17, -0x406147ae    # -1.24f

    .line 254
    .line 255
    .line 256
    const v18, 0x3f970a3d    # 1.18f

    .line 257
    .line 258
    .line 259
    const v13, -0x40d47ae1    # -0.67f

    .line 260
    .line 261
    .line 262
    const/4 v14, 0x0

    .line 263
    const v15, -0x40666666    # -1.2f

    .line 264
    .line 265
    .line 266
    const v16, 0x3f07ae14    # 0.53f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, 0x40d570a4    # 6.67f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v0, 0x40880000    # 4.25f

    .line 279
    .line 280
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, 0x4122b852    # 10.17f

    .line 287
    .line 288
    .line 289
    const/high16 v2, 0x41500000    # 13.0f

    .line 290
    .line 291
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 295
    .line 296
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v0, 0x40100000    # 2.25f

    .line 300
    .line 301
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v17, 0x413c0000    # 11.75f

    .line 305
    .line 306
    const/high16 v18, 0x3f800000    # 1.0f

    .line 307
    .line 308
    const/high16 v13, 0x41280000    # 10.5f

    .line 309
    .line 310
    const v14, 0x3fc7ae14    # 1.56f

    .line 311
    .line 312
    .line 313
    const v15, 0x4130f5c3    # 11.06f

    .line 314
    .line 315
    .line 316
    const/high16 v16, 0x3f800000    # 1.0f

    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, 0x3fc7ae14    # 1.56f

    .line 322
    .line 323
    .line 324
    const/high16 v2, 0x40100000    # 2.25f

    .line 325
    .line 326
    const/high16 v4, 0x41500000    # 13.0f

    .line 327
    .line 328
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, 0x4122b852    # 10.17f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x41a00000    # 20.0f

    .line 341
    .line 342
    const/high16 v2, 0x414c0000    # 12.75f

    .line 343
    .line 344
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x41300000    # 11.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, 0x40a80000    # 5.25f

    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v17, 0x41960000    # 18.75f

    .line 358
    .line 359
    const/high16 v18, 0x40800000    # 4.0f

    .line 360
    .line 361
    const/high16 v13, 0x41a00000    # 20.0f

    .line 362
    .line 363
    const v14, 0x4091eb85    # 4.56f

    .line 364
    .line 365
    .line 366
    const v15, 0x419b851f    # 19.44f

    .line 367
    .line 368
    .line 369
    const/high16 v16, 0x40800000    # 4.0f

    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x4091eb85    # 4.56f

    .line 375
    .line 376
    .line 377
    const/high16 v2, 0x418c0000    # 17.5f

    .line 378
    .line 379
    const/high16 v4, 0x40a80000    # 5.25f

    .line 380
    .line 381
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v0, 0x41300000    # 11.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v0, -0x40800000    # -1.0f

    .line 390
    .line 391
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v0, 0x40500000    # 3.25f

    .line 395
    .line 396
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v17, 0x41740000    # 15.25f

    .line 400
    .line 401
    const/high16 v18, 0x40000000    # 2.0f

    .line 402
    .line 403
    const/high16 v13, 0x41840000    # 16.5f

    .line 404
    .line 405
    const v14, 0x4023d70a    # 2.56f

    .line 406
    .line 407
    .line 408
    const v15, 0x417f0a3d    # 15.94f

    .line 409
    .line 410
    .line 411
    const/high16 v16, 0x40000000    # 2.0f

    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, 0x4023d70a    # 2.56f

    .line 417
    .line 418
    .line 419
    const/high16 v2, 0x41600000    # 14.0f

    .line 420
    .line 421
    const/high16 v4, 0x40500000    # 3.25f

    .line 422
    .line 423
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, 0x40fd70a4    # 7.92f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x40c00000    # 6.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x414c0000    # 12.75f

    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, 0x40880000    # 4.25f

    .line 446
    .line 447
    const/high16 v2, 0x41180000    # 9.5f

    .line 448
    .line 449
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v17, 0x41040000    # 8.25f

    .line 453
    .line 454
    const/high16 v18, 0x40400000    # 3.0f

    .line 455
    .line 456
    const/high16 v13, 0x41180000    # 9.5f

    .line 457
    .line 458
    const v14, 0x4063d70a    # 3.56f

    .line 459
    .line 460
    .line 461
    const v15, 0x410f0a3d    # 8.94f

    .line 462
    .line 463
    .line 464
    const/high16 v16, 0x40400000    # 3.0f

    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v17, -0x406147ae    # -1.24f

    .line 470
    .line 471
    .line 472
    const v18, 0x3f970a3d    # 1.18f

    .line 473
    .line 474
    .line 475
    const v13, -0x40d47ae1    # -0.67f

    .line 476
    .line 477
    .line 478
    const/4 v14, 0x0

    .line 479
    const v15, -0x40666666    # -1.2f

    .line 480
    .line 481
    .line 482
    const v16, 0x3f07ae14    # 0.53f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, 0x40d570a4    # 6.67f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v0, 0x40880000    # 4.25f

    .line 495
    .line 496
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v0, 0x41a9851f    # 21.19f

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, 0x4033d70a    # 2.81f

    .line 509
    .line 510
    .line 511
    const v2, 0x4033d70a    # 2.81f

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x3fb1eb85    # 1.39f

    .line 518
    .line 519
    .line 520
    const v2, 0x40870a3d    # 4.22f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v0, 0x40b428f6    # 5.63f

    .line 527
    .line 528
    .line 529
    const v2, 0x40b428f6    # 5.63f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v0, 0x40e00000    # 7.0f

    .line 536
    .line 537
    const v2, 0x411d47ae    # 9.83f

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, 0x4089999a    # 4.3f

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v17, -0x3fd9999a    # -2.6f

    .line 550
    .line 551
    .line 552
    const v18, -0x40428f5c    # -1.48f

    .line 553
    .line 554
    .line 555
    const v13, -0x4071eb85    # -1.11f

    .line 556
    .line 557
    .line 558
    const v14, -0x40dc28f6    # -0.64f

    .line 559
    .line 560
    .line 561
    const v15, -0x3fdae148    # -2.58f

    .line 562
    .line 563
    .line 564
    const v16, -0x4043d70a    # -1.47f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v17, -0x40f5c28f    # -0.54f

    .line 571
    .line 572
    .line 573
    const v18, -0x41f0a3d7    # -0.14f

    .line 574
    .line 575
    .line 576
    const v13, -0x41d1eb85    # -0.17f

    .line 577
    .line 578
    .line 579
    const v14, -0x4247ae14    # -0.09f

    .line 580
    .line 581
    .line 582
    const v15, -0x4151eb85    # -0.34f

    .line 583
    .line 584
    .line 585
    const v16, -0x41f0a3d7    # -0.14f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v17, -0x40cccccd    # -0.7f

    .line 592
    .line 593
    .line 594
    const v18, 0x3e851eb8    # 0.26f

    .line 595
    .line 596
    .line 597
    const v13, -0x417ae148    # -0.26f

    .line 598
    .line 599
    .line 600
    const/4 v14, 0x0

    .line 601
    const/high16 v15, -0x41000000    # -0.5f

    .line 602
    .line 603
    const v16, 0x3db851ec    # 0.09f

    .line 604
    .line 605
    .line 606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v17, 0x40000000    # 2.0f

    .line 610
    .line 611
    const v18, 0x415e147b    # 13.88f

    .line 612
    .line 613
    .line 614
    const v13, 0x4047ae14    # 3.12f

    .line 615
    .line 616
    .line 617
    const v14, 0x414c7ae1    # 12.78f

    .line 618
    .line 619
    .line 620
    const/high16 v15, 0x40000000    # 2.0f

    .line 621
    .line 622
    const v16, 0x415e147b    # 13.88f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v0, 0x40d9999a    # 6.8f

    .line 629
    .line 630
    .line 631
    const v2, 0x40e5c28f    # 7.18f

    .line 632
    .line 633
    .line 634
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v17, 0x400b851f    # 2.18f

    .line 638
    .line 639
    .line 640
    const v18, 0x3f70a3d7    # 0.94f

    .line 641
    .line 642
    .line 643
    const v13, 0x3f11eb85    # 0.57f

    .line 644
    .line 645
    .line 646
    const v14, 0x3f19999a    # 0.6f

    .line 647
    .line 648
    .line 649
    const v15, 0x3faccccd    # 1.35f

    .line 650
    .line 651
    .line 652
    const v16, 0x3f70a3d7    # 0.94f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/high16 v0, 0x41880000    # 17.0f

    .line 659
    .line 660
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v17, 0x3fd33333    # 1.65f

    .line 664
    .line 665
    .line 666
    const v18, -0x40fae148    # -0.52f

    .line 667
    .line 668
    .line 669
    const v13, 0x3f1eb852    # 0.62f

    .line 670
    .line 671
    .line 672
    const/4 v14, 0x0

    .line 673
    const v15, 0x3f970a3d    # 1.18f

    .line 674
    .line 675
    .line 676
    const v16, -0x41bd70a4    # -0.19f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v0, -0x435c28f6    # -0.02f

    .line 683
    .line 684
    .line 685
    const v2, -0x435c28f6    # -0.02f

    .line 686
    .line 687
    .line 688
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v0, 0x3f933333    # 1.15f

    .line 692
    .line 693
    .line 694
    const v2, 0x3f933333    # 1.15f

    .line 695
    .line 696
    .line 697
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v0, 0x41a9851f    # 21.19f

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 710
    .line 711
    .line 712
    move-result-object v2

    .line 713
    const/16 v16, 0x3800

    .line 714
    .line 715
    const/16 v17, 0x0

    .line 716
    .line 717
    const/high16 v6, 0x3f800000    # 1.0f

    .line 718
    .line 719
    const/high16 v8, 0x3f800000    # 1.0f

    .line 720
    .line 721
    const/4 v7, 0x0

    .line 722
    const/high16 v9, 0x3f800000    # 1.0f

    .line 723
    .line 724
    const/high16 v12, 0x3f800000    # 1.0f

    .line 725
    .line 726
    const/4 v13, 0x0

    .line 727
    const/4 v15, 0x0

    .line 728
    const-string v4, ""

    .line 729
    .line 730
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    sput-object v0, Landroidx/compose/material/icons/filled/DoNotTouchKt;->_doNotTouch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 739
    .line 740
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 741
    .line 742
    .line 743
    return-object v0
.end method
