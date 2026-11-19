.class public final Landroidx/compose/material/icons/rounded/SoapKt;
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
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSoap",
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
        "SMAP\nSoap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Soap.kt\nandroidx/compose/material/icons/rounded/SoapKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n72#5,4:139\n*S KotlinDebug\n*F\n+ 1 Soap.kt\nandroidx/compose/material/icons/rounded/SoapKt\n*L\n29#1:104,12\n30#1:117,18\n30#1:154\n29#1:116\n30#1:135,2\n30#1:137,2\n30#1:143,11\n30#1:139,4\n*E\n"
    }
.end annotation


# static fields
.field private static _soap:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSoap(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SoapKt;->_soap:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Soap"

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
    const/high16 v0, 0x41900000    # 18.0f

    .line 298
    .line 299
    const/high16 v2, 0x40200000    # 2.5f

    .line 300
    .line 301
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v17, 0x41840000    # 16.5f

    .line 305
    .line 306
    const/high16 v18, 0x40800000    # 4.0f

    .line 307
    .line 308
    const/high16 v13, 0x41900000    # 18.0f

    .line 309
    .line 310
    const v14, 0x40551eb8    # 3.33f

    .line 311
    .line 312
    .line 313
    const v15, 0x418aa3d7    # 17.33f

    .line 314
    .line 315
    .line 316
    const/high16 v16, 0x40800000    # 4.0f

    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v17, 0x41700000    # 15.0f

    .line 322
    .line 323
    const/high16 v18, 0x40200000    # 2.5f

    .line 324
    .line 325
    const v13, 0x417ab852    # 15.67f

    .line 326
    .line 327
    .line 328
    const/high16 v14, 0x40800000    # 4.0f

    .line 329
    .line 330
    const/high16 v15, 0x41700000    # 15.0f

    .line 331
    .line 332
    const v16, 0x40551eb8    # 3.33f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, 0x417ab852    # 15.67f

    .line 339
    .line 340
    .line 341
    const/high16 v2, 0x41840000    # 16.5f

    .line 342
    .line 343
    const/high16 v4, 0x3f800000    # 1.0f

    .line 344
    .line 345
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v17, 0x41900000    # 18.0f

    .line 349
    .line 350
    const v13, 0x418aa3d7    # 17.33f

    .line 351
    .line 352
    .line 353
    const/high16 v14, 0x3f800000    # 1.0f

    .line 354
    .line 355
    const/high16 v15, 0x41900000    # 18.0f

    .line 356
    .line 357
    const v16, 0x3fd5c28f    # 1.67f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v0, 0x413ca3d7    # 11.79f

    .line 367
    .line 368
    .line 369
    const v2, 0x3ff851ec    # 1.94f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v17, 0x3f800000    # 1.0f

    .line 376
    .line 377
    const v18, 0x415f851f    # 13.97f

    .line 378
    .line 379
    .line 380
    const v13, 0x3fab851f    # 1.34f

    .line 381
    .line 382
    .line 383
    const v14, 0x4145999a    # 12.35f

    .line 384
    .line 385
    .line 386
    const/high16 v15, 0x3f800000    # 1.0f

    .line 387
    .line 388
    const v16, 0x41523d71    # 13.14f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v0, 0x41a00000    # 20.0f

    .line 395
    .line 396
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v17, 0x40400000    # 3.0f

    .line 400
    .line 401
    const/high16 v18, 0x40400000    # 3.0f

    .line 402
    .line 403
    const/4 v13, 0x0

    .line 404
    const v14, 0x3fd47ae1    # 1.66f

    .line 405
    .line 406
    .line 407
    const v15, 0x3fab851f    # 1.34f

    .line 408
    .line 409
    .line 410
    const/high16 v16, 0x40400000    # 3.0f

    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, 0x415ae148    # 13.68f

    .line 416
    .line 417
    .line 418
    const/4 v2, 0x0

    .line 419
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v17, 0x3fa8f5c3    # 1.32f

    .line 423
    .line 424
    .line 425
    const v18, -0x4070a3d7    # -1.12f

    .line 426
    .line 427
    .line 428
    const v13, 0x3f266666    # 0.65f

    .line 429
    .line 430
    .line 431
    const/4 v14, 0x0

    .line 432
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 433
    .line 434
    const v16, -0x410f5c29    # -0.47f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v17, -0x406147ae    # -1.24f

    .line 441
    .line 442
    .line 443
    const v18, -0x404f5c29    # -1.38f

    .line 444
    .line 445
    .line 446
    const v13, 0x3da3d70a    # 0.08f

    .line 447
    .line 448
    .line 449
    const/high16 v14, -0x40c00000    # -0.75f

    .line 450
    .line 451
    const v15, -0x40fd70a4    # -0.51f

    .line 452
    .line 453
    .line 454
    const v16, -0x404f5c29    # -1.38f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v0, 0x41480000    # 12.5f

    .line 461
    .line 462
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v17, -0x41000000    # -0.5f

    .line 466
    .line 467
    const/high16 v18, -0x41000000    # -0.5f

    .line 468
    .line 469
    const v13, -0x4170a3d7    # -0.28f

    .line 470
    .line 471
    .line 472
    const/4 v14, 0x0

    .line 473
    const/high16 v15, -0x41000000    # -0.5f

    .line 474
    .line 475
    const v16, -0x419eb852    # -0.22f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/4 v0, 0x0

    .line 482
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v17, 0x3f000000    # 0.5f

    .line 486
    .line 487
    const/4 v13, 0x0

    .line 488
    const v14, -0x4170a3d7    # -0.28f

    .line 489
    .line 490
    .line 491
    const v15, 0x3e6147ae    # 0.22f

    .line 492
    .line 493
    .line 494
    const/high16 v16, -0x41000000    # -0.5f

    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, 0x40e5c28f    # 7.18f

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v17, 0x3fa8f5c3    # 1.32f

    .line 506
    .line 507
    .line 508
    const v18, -0x4070a3d7    # -1.12f

    .line 509
    .line 510
    .line 511
    const v13, 0x3f266666    # 0.65f

    .line 512
    .line 513
    .line 514
    const/4 v14, 0x0

    .line 515
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 516
    .line 517
    const v16, -0x410f5c29    # -0.47f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v17, -0x406147ae    # -1.24f

    .line 524
    .line 525
    .line 526
    const v18, -0x404f5c29    # -1.38f

    .line 527
    .line 528
    .line 529
    const v13, 0x3da3d70a    # 0.08f

    .line 530
    .line 531
    .line 532
    const/high16 v14, -0x40c00000    # -0.75f

    .line 533
    .line 534
    const v15, -0x40fd70a4    # -0.51f

    .line 535
    .line 536
    .line 537
    const v16, -0x404f5c29    # -1.38f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v0, 0x41480000    # 12.5f

    .line 544
    .line 545
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v17, -0x41000000    # -0.5f

    .line 549
    .line 550
    const/high16 v18, -0x41000000    # -0.5f

    .line 551
    .line 552
    const v13, -0x4170a3d7    # -0.28f

    .line 553
    .line 554
    .line 555
    const/4 v14, 0x0

    .line 556
    const/high16 v15, -0x41000000    # -0.5f

    .line 557
    .line 558
    const v16, -0x419eb852    # -0.22f

    .line 559
    .line 560
    .line 561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/4 v0, 0x0

    .line 565
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v17, 0x3f000000    # 0.5f

    .line 569
    .line 570
    const/4 v13, 0x0

    .line 571
    const v14, -0x4170a3d7    # -0.28f

    .line 572
    .line 573
    .line 574
    const v15, 0x3e6147ae    # 0.22f

    .line 575
    .line 576
    .line 577
    const/high16 v16, -0x41000000    # -0.5f

    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, 0x4102e148    # 8.18f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v17, 0x3fa8f5c3    # 1.32f

    .line 589
    .line 590
    .line 591
    const v18, -0x4070a3d7    # -1.12f

    .line 592
    .line 593
    .line 594
    const v13, 0x3f266666    # 0.65f

    .line 595
    .line 596
    .line 597
    const/4 v14, 0x0

    .line 598
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 599
    .line 600
    const v16, -0x410f5c29    # -0.47f

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v17, -0x406147ae    # -1.24f

    .line 607
    .line 608
    .line 609
    const v18, -0x404f5c29    # -1.38f

    .line 610
    .line 611
    .line 612
    const v13, 0x3da3d70a    # 0.08f

    .line 613
    .line 614
    .line 615
    const/high16 v14, -0x40c00000    # -0.75f

    .line 616
    .line 617
    const v15, -0x40fd70a4    # -0.51f

    .line 618
    .line 619
    .line 620
    const v16, -0x404f5c29    # -1.38f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v0, 0x41480000    # 12.5f

    .line 627
    .line 628
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v17, -0x41000000    # -0.5f

    .line 632
    .line 633
    const/high16 v18, -0x41000000    # -0.5f

    .line 634
    .line 635
    const v13, -0x4170a3d7    # -0.28f

    .line 636
    .line 637
    .line 638
    const/4 v14, 0x0

    .line 639
    const/high16 v15, -0x41000000    # -0.5f

    .line 640
    .line 641
    const v16, -0x419eb852    # -0.22f

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const/4 v0, 0x0

    .line 648
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v17, 0x3f000000    # 0.5f

    .line 652
    .line 653
    const/4 v13, 0x0

    .line 654
    const v14, -0x4170a3d7    # -0.28f

    .line 655
    .line 656
    .line 657
    const v15, 0x3e6147ae    # 0.22f

    .line 658
    .line 659
    .line 660
    const/high16 v16, -0x41000000    # -0.5f

    .line 661
    .line 662
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v0, 0x40c5c28f    # 6.18f

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v17, 0x3fa8f5c3    # 1.32f

    .line 672
    .line 673
    .line 674
    const v18, -0x4070a3d7    # -1.12f

    .line 675
    .line 676
    .line 677
    const v13, 0x3f266666    # 0.65f

    .line 678
    .line 679
    .line 680
    const/4 v14, 0x0

    .line 681
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 682
    .line 683
    const v16, -0x410f5c29    # -0.47f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, -0x406147ae    # -1.24f

    .line 690
    .line 691
    .line 692
    const v18, -0x404f5c29    # -1.38f

    .line 693
    .line 694
    .line 695
    const v13, 0x3da3d70a    # 0.08f

    .line 696
    .line 697
    .line 698
    const/high16 v14, -0x40c00000    # -0.75f

    .line 699
    .line 700
    const v15, -0x40fd70a4    # -0.51f

    .line 701
    .line 702
    .line 703
    const v16, -0x404f5c29    # -1.38f

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v0, 0x410dc28f    # 8.86f

    .line 710
    .line 711
    .line 712
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const v0, 0x3fbeb852    # 1.49f

    .line 716
    .line 717
    .line 718
    const v2, -0x3fd8f5c3    # -2.61f

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v17, 0x3e0f5c29    # 0.14f

    .line 725
    .line 726
    .line 727
    const v18, -0x40f851ec    # -0.53f

    .line 728
    .line 729
    .line 730
    const v13, 0x3db851ec    # 0.09f

    .line 731
    .line 732
    .line 733
    const v14, -0x41dc28f6    # -0.16f

    .line 734
    .line 735
    .line 736
    const v15, 0x3e0f5c29    # 0.14f

    .line 737
    .line 738
    .line 739
    const v16, -0x41570a3d    # -0.33f

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v17, -0x417ae148    # -0.26f

    .line 746
    .line 747
    .line 748
    const v18, -0x40cccccd    # -0.7f

    .line 749
    .line 750
    .line 751
    const/4 v13, 0x0

    .line 752
    const v14, -0x417ae148    # -0.26f

    .line 753
    .line 754
    .line 755
    const v15, -0x4247ae14    # -0.09f

    .line 756
    .line 757
    .line 758
    const/high16 v16, -0x41000000    # -0.5f

    .line 759
    .line 760
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const v0, 0x411cf5c3    # 9.81f

    .line 764
    .line 765
    .line 766
    const v2, 0x40b6b852    # 5.71f

    .line 767
    .line 768
    .line 769
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const v17, 0x41066666    # 8.4f

    .line 773
    .line 774
    .line 775
    const v18, 0x40b5c28f    # 5.68f

    .line 776
    .line 777
    .line 778
    const v13, 0x4116e148    # 9.43f

    .line 779
    .line 780
    .line 781
    const v14, 0x40aa3d71    # 5.32f

    .line 782
    .line 783
    .line 784
    const v15, 0x410ccccd    # 8.8f

    .line 785
    .line 786
    .line 787
    const v16, 0x40a9999a    # 5.3f

    .line 788
    .line 789
    .line 790
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    const v0, 0x413ca3d7    # 11.79f

    .line 794
    .line 795
    .line 796
    const v2, 0x3ff851ec    # 1.94f

    .line 797
    .line 798
    .line 799
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 806
    .line 807
    .line 808
    move-result-object v2

    .line 809
    const/16 v16, 0x3800

    .line 810
    .line 811
    const/16 v17, 0x0

    .line 812
    .line 813
    const/high16 v6, 0x3f800000    # 1.0f

    .line 814
    .line 815
    const/high16 v8, 0x3f800000    # 1.0f

    .line 816
    .line 817
    const/4 v7, 0x0

    .line 818
    const/high16 v9, 0x3f800000    # 1.0f

    .line 819
    .line 820
    const/high16 v12, 0x3f800000    # 1.0f

    .line 821
    .line 822
    const/4 v13, 0x0

    .line 823
    const/4 v14, 0x0

    .line 824
    const/4 v15, 0x0

    .line 825
    const-string v4, ""

    .line 826
    .line 827
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    sput-object v0, Landroidx/compose/material/icons/rounded/SoapKt;->_soap:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 836
    .line 837
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 838
    .line 839
    .line 840
    return-object v0
.end method
