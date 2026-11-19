.class public final Landroidx/compose/material/icons/twotone/ColorLensKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_colorLens",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ColorLens",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getColorLens",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nColorLens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorLens.kt\nandroidx/compose/material/icons/twotone/ColorLensKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,120:1\n212#2,12:121\n233#2,18:134\n253#2:171\n233#2,18:172\n253#2:209\n233#2,18:210\n253#2:247\n233#2,18:248\n253#2:285\n233#2,18:286\n253#2:323\n233#2,18:324\n253#2:361\n174#3:133\n705#4,2:152\n717#4,2:154\n719#4,11:160\n705#4,2:190\n717#4,2:192\n719#4,11:198\n705#4,2:228\n717#4,2:230\n719#4,11:236\n705#4,2:266\n717#4,2:268\n719#4,11:274\n705#4,2:304\n717#4,2:306\n719#4,11:312\n705#4,2:342\n717#4,2:344\n719#4,11:350\n72#5,4:156\n72#5,4:194\n72#5,4:232\n72#5,4:270\n72#5,4:308\n72#5,4:346\n*S KotlinDebug\n*F\n+ 1 ColorLens.kt\nandroidx/compose/material/icons/twotone/ColorLensKt\n*L\n29#1:121,12\n30#1:134,18\n30#1:171\n67#1:172,18\n67#1:209\n91#1:210,18\n91#1:247\n97#1:248,18\n97#1:285\n103#1:286,18\n103#1:323\n109#1:324,18\n109#1:361\n29#1:133\n30#1:152,2\n30#1:154,2\n30#1:160,11\n67#1:190,2\n67#1:192,2\n67#1:198,11\n91#1:228,2\n91#1:230,2\n91#1:236,11\n97#1:266,2\n97#1:268,2\n97#1:274,11\n103#1:304,2\n103#1:306,2\n103#1:312,11\n109#1:342,2\n109#1:344,2\n109#1:350,11\n30#1:156,4\n67#1:194,4\n91#1:232,4\n97#1:270,4\n103#1:308,4\n109#1:346,4\n*E\n"
    }
.end annotation


# static fields
.field private static _colorLens:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getColorLens(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ColorLensKt;->_colorLens:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ColorLens"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, -0x3f72e148    # -4.41f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x4065c28f    # 3.59f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x4065c28f    # 3.59f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x41000000    # 8.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v25, 0x3f000000    # 0.5f

    .line 105
    .line 106
    const/high16 v26, -0x41000000    # -0.5f

    .line 107
    .line 108
    const v21, 0x3e8f5c29    # 0.28f

    .line 109
    .line 110
    .line 111
    const/high16 v23, 0x3f000000    # 0.5f

    .line 112
    .line 113
    const v24, -0x419eb852    # -0.22f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v25, -0x41f0a3d7    # -0.14f

    .line 120
    .line 121
    .line 122
    const v26, -0x414ccccd    # -0.35f

    .line 123
    .line 124
    .line 125
    const/16 v21, 0x0

    .line 126
    .line 127
    const v22, -0x41dc28f6    # -0.16f

    .line 128
    .line 129
    .line 130
    const v23, -0x425c28f6    # -0.08f

    .line 131
    .line 132
    .line 133
    const v24, -0x4170a3d7    # -0.28f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v25, -0x40deb852    # -0.63f

    .line 140
    .line 141
    .line 142
    const v26, -0x402ccccd    # -1.65f

    .line 143
    .line 144
    .line 145
    const v21, -0x412e147b    # -0.41f

    .line 146
    .line 147
    .line 148
    const v22, -0x41147ae1    # -0.46f

    .line 149
    .line 150
    .line 151
    const v23, -0x40deb852    # -0.63f

    .line 152
    .line 153
    .line 154
    const v24, -0x4079999a    # -1.05f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v25, 0x40200000    # 2.5f

    .line 161
    .line 162
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 163
    .line 164
    const/16 v21, 0x0

    .line 165
    .line 166
    const v22, -0x404f5c29    # -1.38f

    .line 167
    .line 168
    .line 169
    const v23, 0x3f8f5c29    # 1.12f

    .line 170
    .line 171
    .line 172
    const/high16 v24, -0x3fe00000    # -2.5f

    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v4, 0x41700000    # 15.0f

    .line 178
    .line 179
    const/high16 v6, 0x41800000    # 16.0f

    .line 180
    .line 181
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v25, 0x40800000    # 4.0f

    .line 185
    .line 186
    const/high16 v26, -0x3f800000    # -4.0f

    .line 187
    .line 188
    const v21, 0x400d70a4    # 2.21f

    .line 189
    .line 190
    .line 191
    const/16 v22, 0x0

    .line 192
    .line 193
    const/high16 v23, 0x40800000    # 4.0f

    .line 194
    .line 195
    const v24, -0x401ae148    # -1.79f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v25, -0x3f000000    # -8.0f

    .line 202
    .line 203
    const/high16 v26, -0x3f200000    # -7.0f

    .line 204
    .line 205
    const/16 v21, 0x0

    .line 206
    .line 207
    const v22, -0x3f88f5c3    # -3.86f

    .line 208
    .line 209
    .line 210
    const v23, -0x3f9a3d71    # -3.59f

    .line 211
    .line 212
    .line 213
    const/high16 v24, -0x3f200000    # -7.0f

    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v4, 0x41500000    # 13.0f

    .line 222
    .line 223
    const/high16 v6, 0x40d00000    # 6.5f

    .line 224
    .line 225
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v25, -0x40400000    # -1.5f

    .line 229
    .line 230
    const/high16 v26, -0x40400000    # -1.5f

    .line 231
    .line 232
    const v21, -0x40ab851f    # -0.83f

    .line 233
    .line 234
    .line 235
    const/16 v22, 0x0

    .line 236
    .line 237
    const/high16 v23, -0x40400000    # -1.5f

    .line 238
    .line 239
    const v24, -0x40d47ae1    # -0.67f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v4, 0x40b570a4    # 5.67f

    .line 246
    .line 247
    .line 248
    const/high16 v7, 0x41200000    # 10.0f

    .line 249
    .line 250
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v4, 0x3f2b851f    # 0.67f

    .line 254
    .line 255
    .line 256
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 257
    .line 258
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v4, 0x40ea8f5c    # 7.33f

    .line 262
    .line 263
    .line 264
    const/high16 v6, 0x41500000    # 13.0f

    .line 265
    .line 266
    const/high16 v7, 0x40d00000    # 6.5f

    .line 267
    .line 268
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v4, 0x41180000    # 9.5f

    .line 275
    .line 276
    const/high16 v6, 0x41100000    # 9.0f

    .line 277
    .line 278
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v25, 0x41000000    # 8.0f

    .line 282
    .line 283
    const/high16 v26, 0x40f00000    # 7.5f

    .line 284
    .line 285
    const v21, 0x410ab852    # 8.67f

    .line 286
    .line 287
    .line 288
    const/high16 v22, 0x41100000    # 9.0f

    .line 289
    .line 290
    const/high16 v23, 0x41000000    # 8.0f

    .line 291
    .line 292
    const v24, 0x410547ae    # 8.33f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v4, 0x410ab852    # 8.67f

    .line 299
    .line 300
    .line 301
    const/high16 v6, 0x40c00000    # 6.0f

    .line 302
    .line 303
    const/high16 v7, 0x41180000    # 9.5f

    .line 304
    .line 305
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v4, 0x3f2b851f    # 0.67f

    .line 309
    .line 310
    .line 311
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 312
    .line 313
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v4, 0x412547ae    # 10.33f

    .line 317
    .line 318
    .line 319
    const/high16 v6, 0x41180000    # 9.5f

    .line 320
    .line 321
    const/high16 v7, 0x41100000    # 9.0f

    .line 322
    .line 323
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v4, 0x41680000    # 14.5f

    .line 330
    .line 331
    const/high16 v6, 0x41100000    # 9.0f

    .line 332
    .line 333
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v25, -0x40400000    # -1.5f

    .line 337
    .line 338
    const/high16 v26, -0x40400000    # -1.5f

    .line 339
    .line 340
    const v21, -0x40ab851f    # -0.83f

    .line 341
    .line 342
    .line 343
    const/16 v22, 0x0

    .line 344
    .line 345
    const/high16 v23, -0x40400000    # -1.5f

    .line 346
    .line 347
    const v24, -0x40d47ae1    # -0.67f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v4, 0x415ab852    # 13.67f

    .line 354
    .line 355
    .line 356
    const/high16 v6, 0x41680000    # 14.5f

    .line 357
    .line 358
    const/high16 v7, 0x40c00000    # 6.0f

    .line 359
    .line 360
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v4, 0x3f2b851f    # 0.67f

    .line 364
    .line 365
    .line 366
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 367
    .line 368
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v4, 0x417547ae    # 15.33f

    .line 372
    .line 373
    .line 374
    const/high16 v6, 0x41680000    # 14.5f

    .line 375
    .line 376
    const/high16 v7, 0x41100000    # 9.0f

    .line 377
    .line 378
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v4, 0x41980000    # 19.0f

    .line 385
    .line 386
    const/high16 v6, 0x41380000    # 11.5f

    .line 387
    .line 388
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 392
    .line 393
    const/16 v21, 0x0

    .line 394
    .line 395
    const v22, 0x3f547ae1    # 0.83f

    .line 396
    .line 397
    .line 398
    const v23, -0x40d47ae1    # -0.67f

    .line 399
    .line 400
    .line 401
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 402
    .line 403
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v4, -0x40d47ae1    # -0.67f

    .line 407
    .line 408
    .line 409
    const/high16 v6, -0x40400000    # -1.5f

    .line 410
    .line 411
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v4, 0x3f2b851f    # 0.67f

    .line 415
    .line 416
    .line 417
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 418
    .line 419
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 423
    .line 424
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    const/16 v16, 0x3800

    .line 435
    .line 436
    const/16 v17, 0x0

    .line 437
    .line 438
    const v6, 0x3e99999a    # 0.3f

    .line 439
    .line 440
    .line 441
    const v8, 0x3e99999a    # 0.3f

    .line 442
    .line 443
    .line 444
    const/4 v7, 0x0

    .line 445
    const/high16 v9, 0x3f800000    # 1.0f

    .line 446
    .line 447
    const/high16 v12, 0x3f800000    # 1.0f

    .line 448
    .line 449
    const/4 v13, 0x0

    .line 450
    const/4 v14, 0x0

    .line 451
    const/4 v15, 0x0

    .line 452
    const-string v4, ""

    .line 453
    .line 454
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 455
    .line 456
    .line 457
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 462
    .line 463
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 464
    .line 465
    .line 466
    move-result-wide v6

    .line 467
    const/4 v2, 0x0

    .line 468
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 472
    .line 473
    .line 474
    move-result v10

    .line 475
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 476
    .line 477
    .line 478
    move-result v11

    .line 479
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 482
    .line 483
    .line 484
    const/high16 v4, 0x40000000    # 2.0f

    .line 485
    .line 486
    const/high16 v6, 0x41400000    # 12.0f

    .line 487
    .line 488
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v25, 0x40000000    # 2.0f

    .line 492
    .line 493
    const/high16 v26, 0x41400000    # 12.0f

    .line 494
    .line 495
    const v21, 0x40cfae14    # 6.49f

    .line 496
    .line 497
    .line 498
    const/high16 v22, 0x40000000    # 2.0f

    .line 499
    .line 500
    const/high16 v23, 0x40000000    # 2.0f

    .line 501
    .line 502
    const v24, 0x40cfae14    # 6.49f

    .line 503
    .line 504
    .line 505
    move-object/from16 v20, v2

    .line 506
    .line 507
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v4, 0x408fae14    # 4.49f

    .line 511
    .line 512
    .line 513
    const/high16 v6, 0x41200000    # 10.0f

    .line 514
    .line 515
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v25, 0x40200000    # 2.5f

    .line 519
    .line 520
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 521
    .line 522
    const v21, 0x3fb0a3d7    # 1.38f

    .line 523
    .line 524
    .line 525
    const/16 v22, 0x0

    .line 526
    .line 527
    const/high16 v23, 0x40200000    # 2.5f

    .line 528
    .line 529
    const v24, -0x4070a3d7    # -1.12f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v25, -0x40dc28f6    # -0.64f

    .line 536
    .line 537
    .line 538
    const v26, -0x402a3d71    # -1.67f

    .line 539
    .line 540
    .line 541
    const/16 v21, 0x0

    .line 542
    .line 543
    const v22, -0x40e3d70a    # -0.61f

    .line 544
    .line 545
    .line 546
    const v23, -0x41947ae1    # -0.23f

    .line 547
    .line 548
    .line 549
    const v24, -0x40651eb8    # -1.21f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v25, -0x41fae148    # -0.13f

    .line 556
    .line 557
    .line 558
    const v26, -0x41570a3d    # -0.33f

    .line 559
    .line 560
    .line 561
    const v21, -0x425c28f6    # -0.08f

    .line 562
    .line 563
    .line 564
    const v22, -0x4247ae14    # -0.09f

    .line 565
    .line 566
    .line 567
    const v23, -0x41fae148    # -0.13f

    .line 568
    .line 569
    .line 570
    const v24, -0x41a8f5c3    # -0.21f

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v25, 0x3f000000    # 0.5f

    .line 577
    .line 578
    const/high16 v26, -0x41000000    # -0.5f

    .line 579
    .line 580
    const/16 v21, 0x0

    .line 581
    .line 582
    const v22, -0x4170a3d7    # -0.28f

    .line 583
    .line 584
    .line 585
    const v23, 0x3e6147ae    # 0.22f

    .line 586
    .line 587
    .line 588
    const/high16 v24, -0x41000000    # -0.5f

    .line 589
    .line 590
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v4, 0x41880000    # 17.0f

    .line 594
    .line 595
    const/high16 v6, 0x41800000    # 16.0f

    .line 596
    .line 597
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v25, 0x40c00000    # 6.0f

    .line 601
    .line 602
    const/high16 v26, -0x3f400000    # -6.0f

    .line 603
    .line 604
    const v21, 0x4053d70a    # 3.31f

    .line 605
    .line 606
    .line 607
    const/16 v22, 0x0

    .line 608
    .line 609
    const/high16 v23, 0x40c00000    # 6.0f

    .line 610
    .line 611
    const v24, -0x3fd3d70a    # -2.69f

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v25, -0x3ee00000    # -10.0f

    .line 618
    .line 619
    const/high16 v26, -0x3ef00000    # -9.0f

    .line 620
    .line 621
    const/16 v21, 0x0

    .line 622
    .line 623
    const v22, -0x3f6147ae    # -4.96f

    .line 624
    .line 625
    .line 626
    const v23, -0x3f7051ec    # -4.49f

    .line 627
    .line 628
    .line 629
    const/high16 v24, -0x3ef00000    # -9.0f

    .line 630
    .line 631
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v4, 0x41700000    # 15.0f

    .line 638
    .line 639
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v4, -0x401d70a4    # -1.77f

    .line 643
    .line 644
    .line 645
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v25, -0x3fe00000    # -2.5f

    .line 649
    .line 650
    const/high16 v26, 0x40200000    # 2.5f

    .line 651
    .line 652
    const v21, -0x404f5c29    # -1.38f

    .line 653
    .line 654
    .line 655
    const/16 v22, 0x0

    .line 656
    .line 657
    const/high16 v23, -0x3fe00000    # -2.5f

    .line 658
    .line 659
    const v24, 0x3f8f5c29    # 1.12f

    .line 660
    .line 661
    .line 662
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v25, 0x3f2147ae    # 0.63f

    .line 666
    .line 667
    .line 668
    const v26, 0x3fd33333    # 1.65f

    .line 669
    .line 670
    .line 671
    const/16 v21, 0x0

    .line 672
    .line 673
    const v22, 0x3f1c28f6    # 0.61f

    .line 674
    .line 675
    .line 676
    const v23, 0x3e6147ae    # 0.22f

    .line 677
    .line 678
    .line 679
    const v24, 0x3f9851ec    # 1.19f

    .line 680
    .line 681
    .line 682
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const v25, 0x3e0f5c29    # 0.14f

    .line 686
    .line 687
    .line 688
    const v26, 0x3eb33333    # 0.35f

    .line 689
    .line 690
    .line 691
    const v21, 0x3d75c28f    # 0.06f

    .line 692
    .line 693
    .line 694
    const v22, 0x3d8f5c29    # 0.07f

    .line 695
    .line 696
    .line 697
    const v23, 0x3e0f5c29    # 0.14f

    .line 698
    .line 699
    .line 700
    const v24, 0x3e428f5c    # 0.19f

    .line 701
    .line 702
    .line 703
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const/high16 v25, -0x41000000    # -0.5f

    .line 707
    .line 708
    const/high16 v26, 0x3f000000    # 0.5f

    .line 709
    .line 710
    const/16 v21, 0x0

    .line 711
    .line 712
    const v22, 0x3e8f5c29    # 0.28f

    .line 713
    .line 714
    .line 715
    const v23, -0x419eb852    # -0.22f

    .line 716
    .line 717
    .line 718
    const/high16 v24, 0x3f000000    # 0.5f

    .line 719
    .line 720
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const/high16 v25, -0x3f000000    # -8.0f

    .line 724
    .line 725
    const/high16 v26, -0x3f000000    # -8.0f

    .line 726
    .line 727
    const v21, -0x3f72e148    # -4.41f

    .line 728
    .line 729
    .line 730
    const/16 v22, 0x0

    .line 731
    .line 732
    const/high16 v23, -0x3f000000    # -8.0f

    .line 733
    .line 734
    const v24, -0x3f9a3d71    # -3.59f

    .line 735
    .line 736
    .line 737
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v4, -0x3f000000    # -8.0f

    .line 741
    .line 742
    const v6, 0x4065c28f    # 3.59f

    .line 743
    .line 744
    .line 745
    const/high16 v7, 0x41000000    # 8.0f

    .line 746
    .line 747
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v4, 0x4048f5c3    # 3.14f

    .line 751
    .line 752
    .line 753
    const/high16 v6, 0x40e00000    # 7.0f

    .line 754
    .line 755
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const/high16 v25, -0x3f800000    # -4.0f

    .line 759
    .line 760
    const/high16 v26, 0x40800000    # 4.0f

    .line 761
    .line 762
    const/16 v21, 0x0

    .line 763
    .line 764
    const v22, 0x400d70a4    # 2.21f

    .line 765
    .line 766
    .line 767
    const v23, -0x401ae148    # -1.79f

    .line 768
    .line 769
    .line 770
    const/high16 v24, 0x40800000    # 4.0f

    .line 771
    .line 772
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 779
    .line 780
    .line 781
    move-result-object v2

    .line 782
    const/high16 v6, 0x3f800000    # 1.0f

    .line 783
    .line 784
    const/high16 v8, 0x3f800000    # 1.0f

    .line 785
    .line 786
    const/4 v7, 0x0

    .line 787
    const-string v4, ""

    .line 788
    .line 789
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 790
    .line 791
    .line 792
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 793
    .line 794
    .line 795
    move-result v3

    .line 796
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 797
    .line 798
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 799
    .line 800
    .line 801
    move-result-wide v6

    .line 802
    const/4 v2, 0x0

    .line 803
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 804
    .line 805
    .line 806
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 807
    .line 808
    .line 809
    move-result v10

    .line 810
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 811
    .line 812
    .line 813
    move-result v11

    .line 814
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 817
    .line 818
    .line 819
    const/high16 v4, 0x41380000    # 11.5f

    .line 820
    .line 821
    const/high16 v6, 0x40d00000    # 6.5f

    .line 822
    .line 823
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const/4 v4, 0x0

    .line 827
    const/high16 v6, -0x40400000    # -1.5f

    .line 828
    .line 829
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const/high16 v26, 0x40400000    # 3.0f

    .line 833
    .line 834
    const/16 v27, 0x0

    .line 835
    .line 836
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 837
    .line 838
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 839
    .line 840
    const/16 v23, 0x0

    .line 841
    .line 842
    const/16 v24, 0x1

    .line 843
    .line 844
    const/16 v25, 0x1

    .line 845
    .line 846
    move-object/from16 v20, v2

    .line 847
    .line 848
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 852
    .line 853
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 857
    .line 858
    .line 859
    move-result-object v2

    .line 860
    const/high16 v6, 0x3f800000    # 1.0f

    .line 861
    .line 862
    const/4 v7, 0x0

    .line 863
    const-string v4, ""

    .line 864
    .line 865
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 866
    .line 867
    .line 868
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 869
    .line 870
    .line 871
    move-result v3

    .line 872
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 873
    .line 874
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 875
    .line 876
    .line 877
    move-result-wide v6

    .line 878
    const/4 v2, 0x0

    .line 879
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 880
    .line 881
    .line 882
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 883
    .line 884
    .line 885
    move-result v10

    .line 886
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 887
    .line 888
    .line 889
    move-result v11

    .line 890
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 891
    .line 892
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 893
    .line 894
    .line 895
    const/high16 v4, 0x40f00000    # 7.5f

    .line 896
    .line 897
    const/high16 v6, 0x41180000    # 9.5f

    .line 898
    .line 899
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const/4 v4, 0x0

    .line 903
    const/high16 v6, -0x40400000    # -1.5f

    .line 904
    .line 905
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    const/high16 v26, 0x40400000    # 3.0f

    .line 909
    .line 910
    move-object/from16 v20, v2

    .line 911
    .line 912
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 913
    .line 914
    .line 915
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 916
    .line 917
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 918
    .line 919
    .line 920
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 921
    .line 922
    .line 923
    move-result-object v2

    .line 924
    const/high16 v6, 0x3f800000    # 1.0f

    .line 925
    .line 926
    const/4 v7, 0x0

    .line 927
    const-string v4, ""

    .line 928
    .line 929
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 930
    .line 931
    .line 932
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 933
    .line 934
    .line 935
    move-result v3

    .line 936
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 937
    .line 938
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 939
    .line 940
    .line 941
    move-result-wide v6

    .line 942
    const/4 v2, 0x0

    .line 943
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 944
    .line 945
    .line 946
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 947
    .line 948
    .line 949
    move-result v10

    .line 950
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 951
    .line 952
    .line 953
    move-result v11

    .line 954
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 955
    .line 956
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 957
    .line 958
    .line 959
    const/high16 v4, 0x40f00000    # 7.5f

    .line 960
    .line 961
    const/high16 v6, 0x41680000    # 14.5f

    .line 962
    .line 963
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 964
    .line 965
    .line 966
    const/4 v4, 0x0

    .line 967
    const/high16 v6, -0x40400000    # -1.5f

    .line 968
    .line 969
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 970
    .line 971
    .line 972
    const/high16 v26, 0x40400000    # 3.0f

    .line 973
    .line 974
    move-object/from16 v20, v2

    .line 975
    .line 976
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 977
    .line 978
    .line 979
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 980
    .line 981
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 982
    .line 983
    .line 984
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 985
    .line 986
    .line 987
    move-result-object v2

    .line 988
    const/high16 v6, 0x3f800000    # 1.0f

    .line 989
    .line 990
    const/4 v7, 0x0

    .line 991
    const-string v4, ""

    .line 992
    .line 993
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 994
    .line 995
    .line 996
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 997
    .line 998
    .line 999
    move-result v3

    .line 1000
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1001
    .line 1002
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1003
    .line 1004
    .line 1005
    move-result-wide v6

    .line 1006
    const/4 v0, 0x0

    .line 1007
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1011
    .line 1012
    .line 1013
    move-result v10

    .line 1014
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1015
    .line 1016
    .line 1017
    move-result v11

    .line 1018
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1019
    .line 1020
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1021
    .line 1022
    .line 1023
    const/high16 v0, 0x418c0000    # 17.5f

    .line 1024
    .line 1025
    const/high16 v2, 0x41380000    # 11.5f

    .line 1026
    .line 1027
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1028
    .line 1029
    .line 1030
    const/4 v0, 0x0

    .line 1031
    const/high16 v2, -0x40400000    # -1.5f

    .line 1032
    .line 1033
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1034
    .line 1035
    .line 1036
    const/high16 v18, 0x40400000    # 3.0f

    .line 1037
    .line 1038
    const/16 v19, 0x0

    .line 1039
    .line 1040
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 1041
    .line 1042
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 1043
    .line 1044
    const/16 v16, 0x1

    .line 1045
    .line 1046
    const/16 v17, 0x1

    .line 1047
    .line 1048
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1049
    .line 1050
    .line 1051
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 1052
    .line 1053
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v2

    .line 1060
    const/16 v16, 0x3800

    .line 1061
    .line 1062
    const/16 v17, 0x0

    .line 1063
    .line 1064
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1065
    .line 1066
    const/4 v7, 0x0

    .line 1067
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1068
    .line 1069
    const/4 v13, 0x0

    .line 1070
    const/4 v14, 0x0

    .line 1071
    const-string v4, ""

    .line 1072
    .line 1073
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v0

    .line 1077
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v0

    .line 1081
    sput-object v0, Landroidx/compose/material/icons/twotone/ColorLensKt;->_colorLens:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1082
    .line 1083
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1084
    .line 1085
    .line 1086
    return-object v0
.end method
