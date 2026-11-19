.class public final Landroidx/compose/material/icons/outlined/WaterDropKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_waterDrop",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "WaterDrop",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getWaterDrop",
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
        "SMAP\nWaterDrop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaterDrop.kt\nandroidx/compose/material/icons/outlined/WaterDropKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,57:1\n212#2,12:58\n233#2,18:71\n253#2:108\n174#3:70\n705#4,2:89\n717#4,2:91\n719#4,11:97\n72#5,4:93\n*S KotlinDebug\n*F\n+ 1 WaterDrop.kt\nandroidx/compose/material/icons/outlined/WaterDropKt\n*L\n29#1:58,12\n30#1:71,18\n30#1:108\n29#1:70\n30#1:89,2\n30#1:91,2\n30#1:97,11\n30#1:93,4\n*E\n"
    }
.end annotation


# static fields
.field private static _waterDrop:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWaterDrop(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/WaterDropKt;->_waterDrop:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.WaterDrop"

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
    const/high16 v0, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const v18, 0x413ccccd    # 11.8f

    .line 80
    .line 81
    .line 82
    const v13, -0x3f5570a4    # -5.33f

    .line 83
    .line 84
    .line 85
    const v14, 0x4091999a    # 4.55f

    .line 86
    .line 87
    .line 88
    const/high16 v15, -0x3f000000    # -8.0f

    .line 89
    .line 90
    const v16, 0x4107ae14    # 8.48f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v17, 0x41000000    # 8.0f

    .line 97
    .line 98
    const v18, 0x41033333    # 8.2f

    .line 99
    .line 100
    .line 101
    const/4 v13, 0x0

    .line 102
    const v14, 0x409f5c29    # 4.98f

    .line 103
    .line 104
    .line 105
    const v15, 0x40733333    # 3.8f

    .line 106
    .line 107
    .line 108
    const v16, 0x41033333    # 8.2f

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v0, -0x3fb1eb85    # -3.22f

    .line 115
    .line 116
    .line 117
    const v2, -0x3efccccd    # -8.2f

    .line 118
    .line 119
    .line 120
    const/high16 v4, 0x41000000    # 8.0f

    .line 121
    .line 122
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v17, 0x41400000    # 12.0f

    .line 126
    .line 127
    const/high16 v18, 0x40000000    # 2.0f

    .line 128
    .line 129
    const/high16 v13, 0x41a00000    # 20.0f

    .line 130
    .line 131
    const v14, 0x4127ae14    # 10.48f

    .line 132
    .line 133
    .line 134
    const v15, 0x418aa3d7    # 17.33f

    .line 135
    .line 136
    .line 137
    const v16, 0x40d1999a    # 6.55f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v0, 0x41a00000    # 20.0f

    .line 147
    .line 148
    const/high16 v2, 0x41400000    # 12.0f

    .line 149
    .line 150
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v17, -0x3f400000    # -6.0f

    .line 154
    .line 155
    const v18, -0x3f39999a    # -6.2f

    .line 156
    .line 157
    .line 158
    const v13, -0x3fa9999a    # -3.35f

    .line 159
    .line 160
    .line 161
    const/4 v14, 0x0

    .line 162
    const/high16 v15, -0x3f400000    # -6.0f

    .line 163
    .line 164
    const v16, -0x3fdb851f    # -2.57f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v17, 0x40c00000    # 6.0f

    .line 171
    .line 172
    const v18, -0x3eedc28f    # -9.14f

    .line 173
    .line 174
    .line 175
    const/4 v13, 0x0

    .line 176
    const v14, -0x3fea3d71    # -2.34f

    .line 177
    .line 178
    .line 179
    const v15, 0x3ff9999a    # 1.95f

    .line 180
    .line 181
    .line 182
    const v16, -0x3f51eb85    # -5.44f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v18, 0x41123d71    # 9.14f

    .line 189
    .line 190
    .line 191
    const v13, 0x4081999a    # 4.05f

    .line 192
    .line 193
    .line 194
    const v14, 0x406ccccd    # 3.7f

    .line 195
    .line 196
    .line 197
    const/high16 v15, 0x40c00000    # 6.0f

    .line 198
    .line 199
    const v16, 0x40d947ae    # 6.79f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v17, 0x41400000    # 12.0f

    .line 206
    .line 207
    const/high16 v18, 0x41a00000    # 20.0f

    .line 208
    .line 209
    const/high16 v13, 0x41900000    # 18.0f

    .line 210
    .line 211
    const v14, 0x418b70a4    # 17.43f

    .line 212
    .line 213
    .line 214
    const v15, 0x4175999a    # 15.35f

    .line 215
    .line 216
    .line 217
    const/high16 v16, 0x41a00000    # 20.0f

    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v0, 0x40fa8f5c    # 7.83f

    .line 226
    .line 227
    .line 228
    const/high16 v2, 0x41600000    # 14.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, 0x3f3d70a4    # 0.74f

    .line 234
    .line 235
    .line 236
    const v18, 0x3f1eb852    # 0.62f

    .line 237
    .line 238
    .line 239
    const v13, 0x3ebd70a4    # 0.37f

    .line 240
    .line 241
    .line 242
    const/4 v14, 0x0

    .line 243
    const v15, 0x3f2b851f    # 0.67f

    .line 244
    .line 245
    .line 246
    const v16, 0x3e851eb8    # 0.26f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, 0x4068f5c3    # 3.64f

    .line 253
    .line 254
    .line 255
    const v18, 0x4037ae14    # 2.87f

    .line 256
    .line 257
    .line 258
    const v13, 0x3ed1eb85    # 0.41f

    .line 259
    .line 260
    .line 261
    const v14, 0x400e147b    # 2.22f

    .line 262
    .line 263
    .line 264
    const v15, 0x4011eb85    # 2.28f

    .line 265
    .line 266
    .line 267
    const v16, 0x403eb852    # 2.98f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, 0x3f4a3d71    # 0.79f

    .line 274
    .line 275
    .line 276
    const/high16 v18, 0x3f400000    # 0.75f

    .line 277
    .line 278
    const v13, 0x3edc28f6    # 0.43f

    .line 279
    .line 280
    .line 281
    const v14, -0x435c28f6    # -0.02f

    .line 282
    .line 283
    .line 284
    const v15, 0x3f4a3d71    # 0.79f

    .line 285
    .line 286
    .line 287
    const v16, 0x3ea3d70a    # 0.32f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v17, -0x40c7ae14    # -0.72f

    .line 294
    .line 295
    .line 296
    const/4 v13, 0x0

    .line 297
    const v14, 0x3ecccccd    # 0.4f

    .line 298
    .line 299
    .line 300
    const v15, -0x415c28f6    # -0.32f

    .line 301
    .line 302
    .line 303
    const v16, 0x3f3ae148    # 0.73f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v17, -0x3f59eb85    # -5.19f

    .line 310
    .line 311
    .line 312
    const v18, -0x3f7c28f6    # -4.12f

    .line 313
    .line 314
    .line 315
    const v13, -0x3ff7ae14    # -2.13f

    .line 316
    .line 317
    .line 318
    const v14, 0x3e051eb8    # 0.13f

    .line 319
    .line 320
    .line 321
    const v15, -0x3f6c28f6    # -4.62f

    .line 322
    .line 323
    .line 324
    const v16, -0x40747ae1    # -1.09f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v17, 0x40fa8f5c    # 7.83f

    .line 331
    .line 332
    .line 333
    const/high16 v18, 0x41600000    # 14.0f

    .line 334
    .line 335
    const v13, 0x40e051ec    # 7.01f

    .line 336
    .line 337
    .line 338
    const v14, 0x4166b852    # 14.42f

    .line 339
    .line 340
    .line 341
    const v15, 0x40ebd70a    # 7.37f

    .line 342
    .line 343
    .line 344
    const/high16 v16, 0x41600000    # 14.0f

    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    const/16 v16, 0x3800

    .line 357
    .line 358
    const/16 v17, 0x0

    .line 359
    .line 360
    const/high16 v6, 0x3f800000    # 1.0f

    .line 361
    .line 362
    const/high16 v8, 0x3f800000    # 1.0f

    .line 363
    .line 364
    const/4 v7, 0x0

    .line 365
    const/high16 v9, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const/high16 v12, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const/4 v13, 0x0

    .line 370
    const/4 v14, 0x0

    .line 371
    const/4 v15, 0x0

    .line 372
    const-string v4, ""

    .line 373
    .line 374
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    sput-object v0, Landroidx/compose/material/icons/outlined/WaterDropKt;->_waterDrop:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 383
    .line 384
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    return-object v0
.end method
