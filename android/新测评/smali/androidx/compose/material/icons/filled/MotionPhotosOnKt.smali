.class public final Landroidx/compose/material/icons/filled/MotionPhotosOnKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_motionPhotosOn",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MotionPhotosOn",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getMotionPhotosOn",
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
        "SMAP\nMotionPhotosOn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionPhotosOn.kt\nandroidx/compose/material/icons/filled/MotionPhotosOnKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,63:1\n212#2,12:64\n233#2,18:77\n253#2:114\n174#3:76\n705#4,2:95\n717#4,2:97\n719#4,11:103\n72#5,4:99\n*S KotlinDebug\n*F\n+ 1 MotionPhotosOn.kt\nandroidx/compose/material/icons/filled/MotionPhotosOnKt\n*L\n29#1:64,12\n30#1:77,18\n30#1:114\n29#1:76\n30#1:95,2\n30#1:97,2\n30#1:103,11\n30#1:99,4\n*E\n"
    }
.end annotation


# static fields
.field private static _motionPhotosOn:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMotionPhotosOn(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/MotionPhotosOnKt;->_motionPhotosOn:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.MotionPhotosOn"

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
    const v0, 0x403851ec    # 2.88f

    .line 71
    .line 72
    .line 73
    const v2, 0x40fc28f6    # 7.88f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x3fc51eb8    # 1.54f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v17, 0x40800000    # 4.0f

    .line 86
    .line 87
    const/high16 v18, 0x41400000    # 12.0f

    .line 88
    .line 89
    const v13, 0x4084cccd    # 4.15f

    .line 90
    .line 91
    .line 92
    const v14, 0x4123ae14    # 10.23f

    .line 93
    .line 94
    .line 95
    const/high16 v15, 0x40800000    # 4.0f

    .line 96
    .line 97
    const v16, 0x4131999a    # 11.1f

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, 0x41000000    # 8.0f

    .line 104
    .line 105
    const/high16 v18, 0x41000000    # 8.0f

    .line 106
    .line 107
    const/4 v13, 0x0

    .line 108
    const v14, 0x408d1eb8    # 4.41f

    .line 109
    .line 110
    .line 111
    const v15, 0x4065c28f    # 3.59f

    .line 112
    .line 113
    .line 114
    const/high16 v16, 0x41000000    # 8.0f

    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v0, -0x3f9a3d71    # -3.59f

    .line 120
    .line 121
    .line 122
    const/high16 v2, 0x41000000    # 8.0f

    .line 123
    .line 124
    const/high16 v4, -0x3f000000    # -8.0f

    .line 125
    .line 126
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v2, -0x3f000000    # -8.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v17, -0x3fdae148    # -2.58f

    .line 135
    .line 136
    .line 137
    const v18, 0x3ed70a3d    # 0.42f

    .line 138
    .line 139
    .line 140
    const v13, -0x4099999a    # -0.9f

    .line 141
    .line 142
    .line 143
    const/4 v14, 0x0

    .line 144
    const v15, -0x401d70a4    # -1.77f

    .line 145
    .line 146
    .line 147
    const v16, 0x3e19999a    # 0.15f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, 0x40fc7ae1    # 7.89f

    .line 154
    .line 155
    .line 156
    const v2, 0x4038f5c3    # 2.89f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v17, 0x41400000    # 12.0f

    .line 163
    .line 164
    const/high16 v18, 0x40000000    # 2.0f

    .line 165
    .line 166
    const v13, 0x41126666    # 9.15f

    .line 167
    .line 168
    .line 169
    const v14, 0x40147ae1    # 2.32f

    .line 170
    .line 171
    .line 172
    const v15, 0x4128a3d7    # 10.54f

    .line 173
    .line 174
    .line 175
    const/high16 v16, 0x40000000    # 2.0f

    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v17, 0x41200000    # 10.0f

    .line 181
    .line 182
    const/high16 v18, 0x41200000    # 10.0f

    .line 183
    .line 184
    const v13, 0x40b0a3d7    # 5.52f

    .line 185
    .line 186
    .line 187
    const/4 v14, 0x0

    .line 188
    const/high16 v15, 0x41200000    # 10.0f

    .line 189
    .line 190
    const v16, 0x408f5c29    # 4.48f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v0, -0x3f70a3d7    # -4.48f

    .line 197
    .line 198
    .line 199
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 200
    .line 201
    const/high16 v4, 0x41200000    # 10.0f

    .line 202
    .line 203
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v0, 0x418c28f6    # 17.52f

    .line 207
    .line 208
    .line 209
    const/high16 v2, 0x40000000    # 2.0f

    .line 210
    .line 211
    const/high16 v4, 0x41400000    # 12.0f

    .line 212
    .line 213
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, 0x403851ec    # 2.88f

    .line 217
    .line 218
    .line 219
    const v18, 0x40fc28f6    # 7.88f

    .line 220
    .line 221
    .line 222
    const/high16 v13, 0x40000000    # 2.0f

    .line 223
    .line 224
    const v14, 0x41287ae1    # 10.53f

    .line 225
    .line 226
    .line 227
    const v15, 0x40147ae1    # 2.32f

    .line 228
    .line 229
    .line 230
    const v16, 0x41123d71    # 9.14f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v0, 0x41400000    # 12.0f

    .line 240
    .line 241
    const/high16 v2, 0x40c00000    # 6.0f

    .line 242
    .line 243
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v17, 0x40c00000    # 6.0f

    .line 247
    .line 248
    const/high16 v18, -0x3f400000    # -6.0f

    .line 249
    .line 250
    const/4 v13, 0x0

    .line 251
    const v14, -0x3fac28f6    # -3.31f

    .line 252
    .line 253
    .line 254
    const v15, 0x402c28f6    # 2.69f

    .line 255
    .line 256
    .line 257
    const/high16 v16, -0x3f400000    # -6.0f

    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v0, 0x402c28f6    # 2.69f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, -0x3fd3d70a    # -2.69f

    .line 269
    .line 270
    .line 271
    const/high16 v2, -0x3f400000    # -6.0f

    .line 272
    .line 273
    const/high16 v4, 0x40c00000    # 6.0f

    .line 274
    .line 275
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x4174f5c3    # 15.31f

    .line 279
    .line 280
    .line 281
    const/high16 v2, 0x41400000    # 12.0f

    .line 282
    .line 283
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v0, 0x40e00000    # 7.0f

    .line 290
    .line 291
    const/high16 v2, 0x40b00000    # 5.5f

    .line 292
    .line 293
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v17, 0x40b00000    # 5.5f

    .line 297
    .line 298
    const/high16 v18, 0x40e00000    # 7.0f

    .line 299
    .line 300
    const/high16 v13, 0x40e00000    # 7.0f

    .line 301
    .line 302
    const v14, 0x40ca8f5c    # 6.33f

    .line 303
    .line 304
    .line 305
    const v15, 0x40ca8f5c    # 6.33f

    .line 306
    .line 307
    .line 308
    const/high16 v16, 0x40e00000    # 7.0f

    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, 0x40ca8f5c    # 6.33f

    .line 314
    .line 315
    .line 316
    const/high16 v2, 0x40800000    # 4.0f

    .line 317
    .line 318
    const/high16 v4, 0x40b00000    # 5.5f

    .line 319
    .line 320
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x409570a4    # 4.67f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v2, 0x40e00000    # 7.0f

    .line 330
    .line 331
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    const/16 v16, 0x3800

    .line 342
    .line 343
    const/16 v17, 0x0

    .line 344
    .line 345
    const/high16 v6, 0x3f800000    # 1.0f

    .line 346
    .line 347
    const/high16 v8, 0x3f800000    # 1.0f

    .line 348
    .line 349
    const/4 v7, 0x0

    .line 350
    const/high16 v9, 0x3f800000    # 1.0f

    .line 351
    .line 352
    const/high16 v12, 0x3f800000    # 1.0f

    .line 353
    .line 354
    const/4 v13, 0x0

    .line 355
    const/4 v14, 0x0

    .line 356
    const/4 v15, 0x0

    .line 357
    const-string v4, ""

    .line 358
    .line 359
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    sput-object v0, Landroidx/compose/material/icons/filled/MotionPhotosOnKt;->_motionPhotosOn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 368
    .line 369
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    return-object v0
.end method
