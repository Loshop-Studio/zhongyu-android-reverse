.class public final Landroidx/compose/material/icons/filled/BroadcastOnPersonalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_broadcastOnPersonal",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "BroadcastOnPersonal",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getBroadcastOnPersonal",
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
        "SMAP\nBroadcastOnPersonal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastOnPersonal.kt\nandroidx/compose/material/icons/filled/BroadcastOnPersonalKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n233#2,18:137\n253#2:174\n233#2,18:175\n253#2:212\n233#2,18:213\n253#2:250\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n705#4,2:155\n717#4,2:157\n719#4,11:163\n705#4,2:193\n717#4,2:195\n719#4,11:201\n705#4,2:231\n717#4,2:233\n719#4,11:239\n72#5,4:121\n72#5,4:159\n72#5,4:197\n72#5,4:235\n*S KotlinDebug\n*F\n+ 1 BroadcastOnPersonal.kt\nandroidx/compose/material/icons/filled/BroadcastOnPersonalKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n41#1:137,18\n41#1:174\n52#1:175,18\n52#1:212\n66#1:213,18\n66#1:250\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n41#1:155,2\n41#1:157,2\n41#1:163,11\n52#1:193,2\n52#1:195,2\n52#1:201,11\n66#1:231,2\n66#1:233,2\n66#1:239,11\n30#1:121,4\n41#1:159,4\n52#1:197,4\n66#1:235,4\n*E\n"
    }
.end annotation


# static fields
.field private static _broadcastOnPersonal:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBroadcastOnPersonal(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/BroadcastOnPersonalKt;->_broadcastOnPersonal:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.BroadcastOnPersonal"

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
    const/high16 v4, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v6, 0x41880000    # 17.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, 0x400147ae    # 2.02f

    .line 78
    .line 79
    .line 80
    const v26, 0x3e8a3d71    # 0.27f

    .line 81
    .line 82
    .line 83
    const v21, 0x3f333333    # 0.7f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, 0x3fb0a3d7    # 1.38f

    .line 89
    .line 90
    .line 91
    const v24, 0x3dcccccd    # 0.1f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v4, 0x40400000    # 3.0f

    .line 100
    .line 101
    const/high16 v6, 0x41400000    # 12.0f

    .line 102
    .line 103
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x40800000    # 4.0f

    .line 107
    .line 108
    const/high16 v6, 0x41100000    # 9.0f

    .line 109
    .line 110
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v4, 0x41400000    # 12.0f

    .line 114
    .line 115
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v4, 0x40d851ec    # 6.76f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v25, 0x41100000    # 9.0f

    .line 125
    .line 126
    const/high16 v26, 0x41800000    # 16.0f

    .line 127
    .line 128
    const v21, 0x411a8f5c    # 9.66f

    .line 129
    .line 130
    .line 131
    const v22, 0x419d0a3d    # 19.63f

    .line 132
    .line 133
    .line 134
    const/high16 v23, 0x41100000    # 9.0f

    .line 135
    .line 136
    const v24, 0x418f1eb8    # 17.89f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v25, 0x41880000    # 17.0f

    .line 143
    .line 144
    const/high16 v26, 0x41000000    # 8.0f

    .line 145
    .line 146
    const/high16 v21, 0x41100000    # 9.0f

    .line 147
    .line 148
    const v22, 0x413947ae    # 11.58f

    .line 149
    .line 150
    .line 151
    const v23, 0x414947ae    # 12.58f

    .line 152
    .line 153
    .line 154
    const/high16 v24, 0x41000000    # 8.0f

    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    const/16 v16, 0x3800

    .line 167
    .line 168
    const/16 v17, 0x0

    .line 169
    .line 170
    const/high16 v6, 0x3f800000    # 1.0f

    .line 171
    .line 172
    const/high16 v8, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const/4 v7, 0x0

    .line 175
    const/high16 v9, 0x3f800000    # 1.0f

    .line 176
    .line 177
    const/high16 v12, 0x3f800000    # 1.0f

    .line 178
    .line 179
    const/4 v13, 0x0

    .line 180
    const/4 v14, 0x0

    .line 181
    const/4 v15, 0x0

    .line 182
    const-string v4, ""

    .line 183
    .line 184
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 185
    .line 186
    .line 187
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 192
    .line 193
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 194
    .line 195
    .line 196
    move-result-wide v6

    .line 197
    const/4 v2, 0x0

    .line 198
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 206
    .line 207
    .line 208
    move-result v11

    .line 209
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    const/high16 v4, 0x416c0000    # 14.75f

    .line 215
    .line 216
    const/high16 v6, 0x41880000    # 17.0f

    .line 217
    .line 218
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v25, -0x40600000    # -1.25f

    .line 222
    .line 223
    const/high16 v26, 0x3fa00000    # 1.25f

    .line 224
    .line 225
    const v21, -0x40cf5c29    # -0.69f

    .line 226
    .line 227
    .line 228
    const/16 v22, 0x0

    .line 229
    .line 230
    const/high16 v23, -0x40600000    # -1.25f

    .line 231
    .line 232
    const v24, 0x3f0f5c29    # 0.56f

    .line 233
    .line 234
    .line 235
    move-object/from16 v20, v2

    .line 236
    .line 237
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v25, 0x3f000000    # 0.5f

    .line 241
    .line 242
    const v26, 0x3f7851ec    # 0.97f

    .line 243
    .line 244
    .line 245
    const/16 v21, 0x0

    .line 246
    .line 247
    const v22, 0x3ecccccd    # 0.4f

    .line 248
    .line 249
    .line 250
    const v23, 0x3e4ccccd    # 0.2f

    .line 251
    .line 252
    .line 253
    const/high16 v24, 0x3f400000    # 0.75f

    .line 254
    .line 255
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v4, 0x41b00000    # 22.0f

    .line 259
    .line 260
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v4, -0x3f5f0a3d    # -5.03f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v26, -0x4087ae14    # -0.97f

    .line 275
    .line 276
    .line 277
    const v21, 0x3e99999a    # 0.3f

    .line 278
    .line 279
    .line 280
    const v22, -0x41947ae1    # -0.23f

    .line 281
    .line 282
    .line 283
    const/high16 v23, 0x3f000000    # 0.5f

    .line 284
    .line 285
    const v24, -0x40ee147b    # -0.57f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v25, 0x41880000    # 17.0f

    .line 292
    .line 293
    const/high16 v26, 0x416c0000    # 14.75f

    .line 294
    .line 295
    const/high16 v21, 0x41920000    # 18.25f

    .line 296
    .line 297
    const v22, 0x4174f5c3    # 15.31f

    .line 298
    .line 299
    .line 300
    const v23, 0x418d851f    # 17.69f

    .line 301
    .line 302
    .line 303
    const/high16 v24, 0x416c0000    # 14.75f

    .line 304
    .line 305
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    const/high16 v6, 0x3f800000    # 1.0f

    .line 316
    .line 317
    const/4 v7, 0x0

    .line 318
    const-string v4, ""

    .line 319
    .line 320
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 321
    .line 322
    .line 323
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 328
    .line 329
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 330
    .line 331
    .line 332
    move-result-wide v6

    .line 333
    const/4 v2, 0x0

    .line 334
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 338
    .line 339
    .line 340
    move-result v10

    .line 341
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 342
    .line 343
    .line 344
    move-result v11

    .line 345
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 348
    .line 349
    .line 350
    const/high16 v4, 0x41400000    # 12.0f

    .line 351
    .line 352
    const/high16 v6, 0x41880000    # 17.0f

    .line 353
    .line 354
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v25, -0x3f800000    # -4.0f

    .line 358
    .line 359
    const/high16 v26, 0x40800000    # 4.0f

    .line 360
    .line 361
    const v21, -0x3ff28f5c    # -2.21f

    .line 362
    .line 363
    .line 364
    const/16 v22, 0x0

    .line 365
    .line 366
    const/high16 v23, -0x3f800000    # -4.0f

    .line 367
    .line 368
    const v24, 0x3fe51eb8    # 1.79f

    .line 369
    .line 370
    .line 371
    move-object/from16 v20, v2

    .line 372
    .line 373
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v25, 0x3f95c28f    # 1.17f

    .line 377
    .line 378
    .line 379
    const v26, 0x40351eb8    # 2.83f

    .line 380
    .line 381
    .line 382
    const/16 v21, 0x0

    .line 383
    .line 384
    const v22, 0x3f8ccccd    # 1.1f

    .line 385
    .line 386
    .line 387
    const v23, 0x3ee66666    # 0.45f

    .line 388
    .line 389
    .line 390
    const v24, 0x40066666    # 2.1f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v4, -0x407851ec    # -1.06f

    .line 397
    .line 398
    .line 399
    const v6, 0x3f87ae14    # 1.06f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v25, -0x40c51eb8    # -0.73f

    .line 406
    .line 407
    .line 408
    const v26, -0x401d70a4    # -1.77f

    .line 409
    .line 410
    .line 411
    const v21, -0x4119999a    # -0.45f

    .line 412
    .line 413
    .line 414
    const v22, -0x4119999a    # -0.45f

    .line 415
    .line 416
    .line 417
    const v23, -0x40c51eb8    # -0.73f

    .line 418
    .line 419
    .line 420
    const v24, -0x4075c28f    # -1.08f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v25, 0x40200000    # 2.5f

    .line 427
    .line 428
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 429
    .line 430
    const/16 v21, 0x0

    .line 431
    .line 432
    const v22, -0x404f5c29    # -1.38f

    .line 433
    .line 434
    .line 435
    const v23, 0x3f8f5c29    # 1.12f

    .line 436
    .line 437
    .line 438
    const/high16 v24, -0x3fe00000    # -2.5f

    .line 439
    .line 440
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v4, 0x3f8f5c29    # 1.12f

    .line 444
    .line 445
    .line 446
    const/high16 v6, 0x40200000    # 2.5f

    .line 447
    .line 448
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v25, -0x40c51eb8    # -0.73f

    .line 452
    .line 453
    .line 454
    const v26, 0x3fe147ae    # 1.76f

    .line 455
    .line 456
    .line 457
    const v22, 0x3f30a3d7    # 0.69f

    .line 458
    .line 459
    .line 460
    const v23, -0x4170a3d7    # -0.28f

    .line 461
    .line 462
    .line 463
    const v24, 0x3fa7ae14    # 1.31f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v4, 0x3f87ae14    # 1.06f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v25, 0x41a80000    # 21.0f

    .line 476
    .line 477
    const/high16 v26, 0x41800000    # 16.0f

    .line 478
    .line 479
    const v21, 0x41a46666    # 20.55f

    .line 480
    .line 481
    .line 482
    const v22, 0x4190cccd    # 18.1f

    .line 483
    .line 484
    .line 485
    const/high16 v23, 0x41a80000    # 21.0f

    .line 486
    .line 487
    const v24, 0x4188cccd    # 17.1f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v25, 0x41880000    # 17.0f

    .line 494
    .line 495
    const/high16 v26, 0x41400000    # 12.0f

    .line 496
    .line 497
    const/high16 v21, 0x41a80000    # 21.0f

    .line 498
    .line 499
    const v22, 0x415ca3d7    # 13.79f

    .line 500
    .line 501
    .line 502
    const v23, 0x4199ae14    # 19.21f

    .line 503
    .line 504
    .line 505
    const/high16 v24, 0x41400000    # 12.0f

    .line 506
    .line 507
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    const/high16 v6, 0x3f800000    # 1.0f

    .line 518
    .line 519
    const/4 v7, 0x0

    .line 520
    const-string v4, ""

    .line 521
    .line 522
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 523
    .line 524
    .line 525
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 526
    .line 527
    .line 528
    move-result v3

    .line 529
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 530
    .line 531
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 532
    .line 533
    .line 534
    move-result-wide v6

    .line 535
    const/4 v0, 0x0

    .line 536
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 540
    .line 541
    .line 542
    move-result v10

    .line 543
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 544
    .line 545
    .line 546
    move-result v11

    .line 547
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 550
    .line 551
    .line 552
    const/high16 v0, 0x41180000    # 9.5f

    .line 553
    .line 554
    const/high16 v2, 0x41880000    # 17.0f

    .line 555
    .line 556
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v17, -0x3f300000    # -6.5f

    .line 560
    .line 561
    const/high16 v18, 0x40d00000    # 6.5f

    .line 562
    .line 563
    const v13, -0x3f9a3d71    # -3.59f

    .line 564
    .line 565
    .line 566
    const/high16 v15, -0x3f300000    # -6.5f

    .line 567
    .line 568
    const v16, 0x403a3d71    # 2.91f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v17, 0x3ff33333    # 1.9f

    .line 575
    .line 576
    .line 577
    const v18, 0x40933333    # 4.6f

    .line 578
    .line 579
    .line 580
    const/4 v13, 0x0

    .line 581
    const v14, 0x3fe51eb8    # 1.79f

    .line 582
    .line 583
    .line 584
    const v15, 0x3f3ae148    # 0.73f

    .line 585
    .line 586
    .line 587
    const v16, 0x405ae148    # 3.42f

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v0, -0x407851ec    # -1.06f

    .line 594
    .line 595
    .line 596
    const v2, 0x3f87ae14    # 1.06f

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v17, 0x41400000    # 12.0f

    .line 603
    .line 604
    const/high16 v18, 0x41800000    # 16.0f

    .line 605
    .line 606
    const v13, 0x4148f5c3    # 12.56f

    .line 607
    .line 608
    .line 609
    const v14, 0x41950a3d    # 18.63f

    .line 610
    .line 611
    .line 612
    const/high16 v15, 0x41400000    # 12.0f

    .line 613
    .line 614
    const v16, 0x418b0a3d    # 17.38f

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v17, 0x40a00000    # 5.0f

    .line 621
    .line 622
    const/high16 v18, -0x3f600000    # -5.0f

    .line 623
    .line 624
    const/4 v13, 0x0

    .line 625
    const v14, -0x3fcf5c29    # -2.76f

    .line 626
    .line 627
    .line 628
    const v15, 0x400f5c29    # 2.24f

    .line 629
    .line 630
    .line 631
    const/high16 v16, -0x3f600000    # -5.0f

    .line 632
    .line 633
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v0, 0x400f5c29    # 2.24f

    .line 637
    .line 638
    .line 639
    const/high16 v2, 0x40a00000    # 5.0f

    .line 640
    .line 641
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v17, -0x40451eb8    # -1.46f

    .line 645
    .line 646
    .line 647
    const v18, 0x406147ae    # 3.52f

    .line 648
    .line 649
    .line 650
    const v14, 0x3faf5c29    # 1.37f

    .line 651
    .line 652
    .line 653
    const v15, -0x40f0a3d7    # -0.56f

    .line 654
    .line 655
    .line 656
    const v16, 0x4027ae14    # 2.62f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v0, 0x3f88f5c3    # 1.07f

    .line 663
    .line 664
    .line 665
    const v2, 0x3f87ae14    # 1.06f

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v17, 0x3ff1eb85    # 1.89f

    .line 672
    .line 673
    .line 674
    const v18, -0x3f6d70a4    # -4.58f

    .line 675
    .line 676
    .line 677
    const v13, 0x3f95c28f    # 1.17f

    .line 678
    .line 679
    .line 680
    const v14, -0x4068f5c3    # -1.18f

    .line 681
    .line 682
    .line 683
    const v15, 0x3ff1eb85    # 1.89f

    .line 684
    .line 685
    .line 686
    const v16, -0x3fcccccd    # -2.8f

    .line 687
    .line 688
    .line 689
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v17, 0x41880000    # 17.0f

    .line 693
    .line 694
    const/high16 v18, 0x41180000    # 9.5f

    .line 695
    .line 696
    const/high16 v13, 0x41bc0000    # 23.5f

    .line 697
    .line 698
    const v14, 0x41468f5c    # 12.41f

    .line 699
    .line 700
    .line 701
    const v15, 0x41a4b852    # 20.59f

    .line 702
    .line 703
    .line 704
    const/high16 v16, 0x41180000    # 9.5f

    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    const/16 v16, 0x3800

    .line 717
    .line 718
    const/16 v17, 0x0

    .line 719
    .line 720
    const/high16 v6, 0x3f800000    # 1.0f

    .line 721
    .line 722
    const/4 v7, 0x0

    .line 723
    const/high16 v12, 0x3f800000    # 1.0f

    .line 724
    .line 725
    const/4 v13, 0x0

    .line 726
    const/4 v14, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/filled/BroadcastOnPersonalKt;->_broadcastOnPersonal:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 739
    .line 740
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 741
    .line 742
    .line 743
    return-object v0
.end method
