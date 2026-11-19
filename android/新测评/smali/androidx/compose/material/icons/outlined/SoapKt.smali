.class public final Landroidx/compose/material/icons/outlined/SoapKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_soap",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Soap",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getSoap",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nSoap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Soap.kt\nandroidx/compose/material/icons/outlined/SoapKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,106:1\n212#2,12:107\n233#2,18:120\n253#2:157\n174#3:119\n705#4,2:138\n717#4,2:140\n719#4,11:146\n72#5,4:142\n*S KotlinDebug\n*F\n+ 1 Soap.kt\nandroidx/compose/material/icons/outlined/SoapKt\n*L\n29#1:107,12\n30#1:120,18\n30#1:157\n29#1:119\n30#1:138,2\n30#1:140,2\n30#1:146,11\n30#1:142,4\n*E\n"
    }
.end annotation


# static fields
.field private static _soap:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSoap(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SoapKt;->_soap:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Soap"

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
    const/high16 v0, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v2, 0x41640000    # 14.25f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x41700000    # 15.0f

    .line 78
    .line 79
    const/high16 v18, 0x40d80000    # 6.75f

    .line 80
    .line 81
    const v13, 0x416a8f5c    # 14.66f

    .line 82
    .line 83
    .line 84
    const/high16 v14, 0x40c00000    # 6.0f

    .line 85
    .line 86
    const/high16 v15, 0x41700000    # 15.0f

    .line 87
    .line 88
    const v16, 0x40cae148    # 6.34f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, 0x416a8f5c    # 14.66f

    .line 95
    .line 96
    .line 97
    const/high16 v2, 0x40f00000    # 7.5f

    .line 98
    .line 99
    const/high16 v4, 0x41640000    # 14.25f

    .line 100
    .line 101
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v0, 0x40e51eb8    # 7.16f

    .line 105
    .line 106
    .line 107
    const/high16 v2, 0x40d80000    # 6.75f

    .line 108
    .line 109
    const/high16 v4, 0x41580000    # 13.5f

    .line 110
    .line 111
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v0, 0x415d70a4    # 13.84f

    .line 115
    .line 116
    .line 117
    const/high16 v2, 0x40c00000    # 6.0f

    .line 118
    .line 119
    const/high16 v4, 0x41640000    # 14.25f

    .line 120
    .line 121
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x40900000    # 4.5f

    .line 125
    .line 126
    const/high16 v2, 0x41640000    # 14.25f

    .line 127
    .line 128
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v17, 0x41400000    # 12.0f

    .line 132
    .line 133
    const v13, 0x415028f6    # 13.01f

    .line 134
    .line 135
    .line 136
    const/high16 v14, 0x40900000    # 4.5f

    .line 137
    .line 138
    const/high16 v15, 0x41400000    # 12.0f

    .line 139
    .line 140
    const v16, 0x40b051ec    # 5.51f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, 0x415028f6    # 13.01f

    .line 147
    .line 148
    .line 149
    const/high16 v2, 0x41100000    # 9.0f

    .line 150
    .line 151
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, -0x407eb852    # -1.01f

    .line 155
    .line 156
    .line 157
    const/high16 v2, -0x3ff00000    # -2.25f

    .line 158
    .line 159
    const/high16 v4, 0x40100000    # 2.25f

    .line 160
    .line 161
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v0, 0x4177d70a    # 15.49f

    .line 165
    .line 166
    .line 167
    const/high16 v2, 0x40900000    # 4.5f

    .line 168
    .line 169
    const/high16 v4, 0x41640000    # 14.25f

    .line 170
    .line 171
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v0, 0x40900000    # 4.5f

    .line 175
    .line 176
    const/high16 v2, 0x41640000    # 14.25f

    .line 177
    .line 178
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v0, 0x40b00000    # 5.5f

    .line 185
    .line 186
    const/high16 v2, 0x41a00000    # 20.0f

    .line 187
    .line 188
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v17, 0x3f000000    # 0.5f

    .line 192
    .line 193
    const/high16 v18, 0x3f000000    # 0.5f

    .line 194
    .line 195
    const v13, 0x3e8f5c29    # 0.28f

    .line 196
    .line 197
    .line 198
    const/4 v14, 0x0

    .line 199
    const/high16 v15, 0x3f000000    # 0.5f

    .line 200
    .line 201
    const v16, 0x3e6147ae    # 0.22f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x41a23d71    # 20.28f

    .line 208
    .line 209
    .line 210
    const/high16 v2, 0x40d00000    # 6.5f

    .line 211
    .line 212
    const/high16 v4, 0x41a00000    # 20.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v0, 0x40c8f5c3    # 6.28f

    .line 218
    .line 219
    .line 220
    const/high16 v2, 0x419c0000    # 19.5f

    .line 221
    .line 222
    const/high16 v4, 0x40c00000    # 6.0f

    .line 223
    .line 224
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v0, 0x419dc28f    # 19.72f

    .line 228
    .line 229
    .line 230
    const/high16 v2, 0x40b00000    # 5.5f

    .line 231
    .line 232
    const/high16 v4, 0x41a00000    # 20.0f

    .line 233
    .line 234
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v0, 0x40800000    # 4.0f

    .line 238
    .line 239
    const/high16 v2, 0x41a00000    # 20.0f

    .line 240
    .line 241
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, -0x40000000    # -2.0f

    .line 245
    .line 246
    const/high16 v18, 0x40000000    # 2.0f

    .line 247
    .line 248
    const v13, -0x40733333    # -1.1f

    .line 249
    .line 250
    .line 251
    const/high16 v15, -0x40000000    # -2.0f

    .line 252
    .line 253
    const v16, 0x3f666666    # 0.9f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v0, 0x3f666666    # 0.9f

    .line 260
    .line 261
    .line 262
    const/high16 v2, 0x40000000    # 2.0f

    .line 263
    .line 264
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, -0x4099999a    # -0.9f

    .line 268
    .line 269
    .line 270
    const/high16 v2, -0x40000000    # -2.0f

    .line 271
    .line 272
    const/high16 v4, 0x40000000    # 2.0f

    .line 273
    .line 274
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v0, 0x41a8cccd    # 21.1f

    .line 278
    .line 279
    .line 280
    const/high16 v2, 0x40800000    # 4.0f

    .line 281
    .line 282
    const/high16 v4, 0x41a00000    # 20.0f

    .line 283
    .line 284
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v0, 0x40800000    # 4.0f

    .line 288
    .line 289
    const/high16 v2, 0x41a00000    # 20.0f

    .line 290
    .line 291
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v0, 0x3f800000    # 1.0f

    .line 298
    .line 299
    const/high16 v2, 0x41840000    # 16.5f

    .line 300
    .line 301
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v17, 0x41700000    # 15.0f

    .line 305
    .line 306
    const/high16 v18, 0x40200000    # 2.5f

    .line 307
    .line 308
    const v13, 0x417ab852    # 15.67f

    .line 309
    .line 310
    .line 311
    const/high16 v14, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const/high16 v15, 0x41700000    # 15.0f

    .line 314
    .line 315
    const v16, 0x3fd5c28f    # 1.67f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, 0x417ab852    # 15.67f

    .line 322
    .line 323
    .line 324
    const/high16 v4, 0x40800000    # 4.0f

    .line 325
    .line 326
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v17, 0x41900000    # 18.0f

    .line 330
    .line 331
    const v13, 0x418aa3d7    # 17.33f

    .line 332
    .line 333
    .line 334
    const/high16 v14, 0x40800000    # 4.0f

    .line 335
    .line 336
    const/high16 v15, 0x41900000    # 18.0f

    .line 337
    .line 338
    const v16, 0x40551eb8    # 3.33f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x418aa3d7    # 17.33f

    .line 345
    .line 346
    .line 347
    const/high16 v2, 0x3f800000    # 1.0f

    .line 348
    .line 349
    const/high16 v4, 0x41840000    # 16.5f

    .line 350
    .line 351
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v0, 0x41800000    # 16.0f

    .line 358
    .line 359
    const/high16 v2, 0x41a60000    # 20.75f

    .line 360
    .line 361
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 365
    .line 366
    const/high16 v18, -0x40600000    # -1.25f

    .line 367
    .line 368
    const v13, 0x3f30a3d7    # 0.69f

    .line 369
    .line 370
    .line 371
    const/4 v14, 0x0

    .line 372
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 373
    .line 374
    const v16, -0x40f0a3d7    # -0.56f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, -0x40f0a3d7    # -0.56f

    .line 381
    .line 382
    .line 383
    const/high16 v2, -0x40600000    # -1.25f

    .line 384
    .line 385
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v0, 0x41400000    # 12.0f

    .line 389
    .line 390
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v0, -0x40800000    # -1.0f

    .line 394
    .line 395
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x40d80000    # 6.75f

    .line 399
    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v17, -0x4068f5c3    # -1.18f

    .line 407
    .line 408
    .line 409
    const v18, -0x406147ae    # -1.24f

    .line 410
    .line 411
    .line 412
    const/4 v13, 0x0

    .line 413
    const v14, -0x40d47ae1    # -0.67f

    .line 414
    .line 415
    .line 416
    const v15, -0x40f851ec    # -0.53f

    .line 417
    .line 418
    .line 419
    const v16, -0x40666666    # -1.2f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, 0x410deb85    # 8.87f

    .line 426
    .line 427
    .line 428
    const/high16 v2, 0x41200000    # 10.0f

    .line 429
    .line 430
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x3fbd70a4    # 1.48f

    .line 434
    .line 435
    .line 436
    const v2, -0x3fd9999a    # -2.6f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, 0x3e0f5c29    # 0.14f

    .line 443
    .line 444
    .line 445
    const v18, -0x40f5c28f    # -0.54f

    .line 446
    .line 447
    .line 448
    const v13, 0x3db851ec    # 0.09f

    .line 449
    .line 450
    .line 451
    const v14, -0x41d1eb85    # -0.17f

    .line 452
    .line 453
    .line 454
    const v15, 0x3e0f5c29    # 0.14f

    .line 455
    .line 456
    .line 457
    const v16, -0x4151eb85    # -0.34f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v17, -0x417ae148    # -0.26f

    .line 464
    .line 465
    .line 466
    const v18, -0x40cccccd    # -0.7f

    .line 467
    .line 468
    .line 469
    const/4 v13, 0x0

    .line 470
    const v14, -0x417ae148    # -0.26f

    .line 471
    .line 472
    .line 473
    const v15, -0x4247ae14    # -0.09f

    .line 474
    .line 475
    .line 476
    const/high16 v16, -0x41000000    # -0.5f

    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v0, 0x4111eb85    # 9.12f

    .line 482
    .line 483
    .line 484
    const/high16 v2, 0x40a00000    # 5.0f

    .line 485
    .line 486
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v0, -0x3f1a3d71    # -7.18f

    .line 490
    .line 491
    .line 492
    const v2, 0x40d9999a    # 6.8f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v17, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const v18, 0x415f851f    # 13.97f

    .line 501
    .line 502
    .line 503
    const v13, 0x3fab851f    # 1.34f

    .line 504
    .line 505
    .line 506
    const v14, 0x4145c28f    # 12.36f

    .line 507
    .line 508
    .line 509
    const/high16 v15, 0x3f800000    # 1.0f

    .line 510
    .line 511
    const v16, 0x41526666    # 13.15f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x41a00000    # 20.0f

    .line 518
    .line 519
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v17, 0x40400000    # 3.0f

    .line 523
    .line 524
    const/high16 v18, 0x40400000    # 3.0f

    .line 525
    .line 526
    const/4 v13, 0x0

    .line 527
    const v14, 0x3fd47ae1    # 1.66f

    .line 528
    .line 529
    .line 530
    const v15, 0x3fab851f    # 1.34f

    .line 531
    .line 532
    .line 533
    const/high16 v16, 0x40400000    # 3.0f

    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v0, 0x415c0000    # 13.75f

    .line 539
    .line 540
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 544
    .line 545
    const/high16 v18, -0x40600000    # -1.25f

    .line 546
    .line 547
    const v13, 0x3f30a3d7    # 0.69f

    .line 548
    .line 549
    .line 550
    const/4 v14, 0x0

    .line 551
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 552
    .line 553
    const v16, -0x40f0a3d7    # -0.56f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, -0x40f0a3d7    # -0.56f

    .line 560
    .line 561
    .line 562
    const/high16 v2, -0x40600000    # -1.25f

    .line 563
    .line 564
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v0, 0x41400000    # 12.0f

    .line 568
    .line 569
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v0, -0x40800000    # -1.0f

    .line 573
    .line 574
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v0, 0x40f80000    # 7.75f

    .line 578
    .line 579
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v0, 0x419e0000    # 19.75f

    .line 586
    .line 587
    const/high16 v2, 0x41880000    # 17.0f

    .line 588
    .line 589
    const v4, 0x41a3851f    # 20.44f

    .line 590
    .line 591
    .line 592
    const/high16 v6, 0x41880000    # 17.0f

    .line 593
    .line 594
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, 0x41400000    # 12.0f

    .line 598
    .line 599
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v0, -0x40800000    # -1.0f

    .line 603
    .line 604
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const/high16 v0, 0x41a60000    # 20.75f

    .line 608
    .line 609
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v0, 0x41200000    # 10.0f

    .line 616
    .line 617
    const/high16 v2, 0x41a80000    # 21.0f

    .line 618
    .line 619
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v0, 0x40800000    # 4.0f

    .line 623
    .line 624
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const/high16 v17, -0x40800000    # -1.0f

    .line 628
    .line 629
    const/high16 v18, -0x40800000    # -1.0f

    .line 630
    .line 631
    const v13, -0x40f33333    # -0.55f

    .line 632
    .line 633
    .line 634
    const/high16 v15, -0x40800000    # -1.0f

    .line 635
    .line 636
    const v16, -0x4119999a    # -0.45f

    .line 637
    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v0, -0x3f400000    # -6.0f

    .line 643
    .line 644
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v17, 0x3eb851ec    # 0.36f

    .line 648
    .line 649
    .line 650
    const/high16 v18, -0x40c00000    # -0.75f

    .line 651
    .line 652
    const/4 v13, 0x0

    .line 653
    const v14, -0x413851ec    # -0.39f

    .line 654
    .line 655
    .line 656
    const v15, 0x3e6b851f    # 0.23f

    .line 657
    .line 658
    .line 659
    const v16, -0x40dc28f6    # -0.64f

    .line 660
    .line 661
    .line 662
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v0, 0x40e00000    # 7.0f

    .line 666
    .line 667
    const v2, 0x411deb85    # 9.87f

    .line 668
    .line 669
    .line 670
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/high16 v0, 0x41400000    # 12.0f

    .line 674
    .line 675
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v0, 0x40400000    # 3.0f

    .line 679
    .line 680
    const/4 v2, 0x0

    .line 681
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v0, 0x41a80000    # 21.0f

    .line 685
    .line 686
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    const/16 v16, 0x3800

    .line 697
    .line 698
    const/16 v17, 0x0

    .line 699
    .line 700
    const/high16 v6, 0x3f800000    # 1.0f

    .line 701
    .line 702
    const/high16 v8, 0x3f800000    # 1.0f

    .line 703
    .line 704
    const/4 v7, 0x0

    .line 705
    const/high16 v9, 0x3f800000    # 1.0f

    .line 706
    .line 707
    const/high16 v12, 0x3f800000    # 1.0f

    .line 708
    .line 709
    const/4 v14, 0x0

    .line 710
    const/4 v15, 0x0

    .line 711
    const-string v4, ""

    .line 712
    .line 713
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    sput-object v0, Landroidx/compose/material/icons/outlined/SoapKt;->_soap:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 722
    .line 723
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 724
    .line 725
    .line 726
    return-object v0
.end method
