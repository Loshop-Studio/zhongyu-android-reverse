.class public final Landroidx/compose/material/icons/twotone/CoPresentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_coPresent",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CoPresent",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getCoPresent",
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
        "SMAP\nCoPresent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoPresent.kt\nandroidx/compose/material/icons/twotone/CoPresentKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,96:1\n212#2,12:97\n233#2,18:110\n253#2:147\n233#2,18:148\n253#2:185\n233#2,18:186\n253#2:223\n233#2,18:224\n253#2:261\n233#2,18:262\n253#2:299\n174#3:109\n705#4,2:128\n717#4,2:130\n719#4,11:136\n705#4,2:166\n717#4,2:168\n719#4,11:174\n705#4,2:204\n717#4,2:206\n719#4,11:212\n705#4,2:242\n717#4,2:244\n719#4,11:250\n705#4,2:280\n717#4,2:282\n719#4,11:288\n72#5,4:132\n72#5,4:170\n72#5,4:208\n72#5,4:246\n72#5,4:284\n*S KotlinDebug\n*F\n+ 1 CoPresent.kt\nandroidx/compose/material/icons/twotone/CoPresentKt\n*L\n29#1:97,12\n30#1:110,18\n30#1:147\n36#1:148,18\n36#1:185\n45#1:186,18\n45#1:223\n59#1:224,18\n59#1:261\n73#1:262,18\n73#1:299\n29#1:109\n30#1:128,2\n30#1:130,2\n30#1:136,11\n36#1:166,2\n36#1:168,2\n36#1:174,11\n45#1:204,2\n45#1:206,2\n45#1:212,11\n59#1:242,2\n59#1:244,2\n59#1:250,11\n73#1:280,2\n73#1:282,2\n73#1:288,11\n30#1:132,4\n36#1:170,4\n45#1:208,4\n59#1:246,4\n73#1:284,4\n*E\n"
    }
.end annotation


# static fields
.field private static _coPresent:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCoPresent(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CoPresentKt;->_coPresent:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.CoPresent"

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v6, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40800000    # 4.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x40000000    # 2.0f

    .line 88
    .line 89
    const/high16 v22, 0x40000000    # 2.0f

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const/16 v24, 0x1

    .line 94
    .line 95
    const/16 v25, 0x1

    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x3f800000    # -4.0f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/16 v16, 0x3800

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const v6, 0x3e99999a    # 0.3f

    .line 116
    .line 117
    .line 118
    const v8, 0x3e99999a    # 0.3f

    .line 119
    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    const/high16 v9, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/high16 v12, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const/4 v14, 0x0

    .line 128
    const/4 v15, 0x0

    .line 129
    const-string v4, ""

    .line 130
    .line 131
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 132
    .line 133
    .line 134
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 139
    .line 140
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 141
    .line 142
    .line 143
    move-result-wide v6

    .line 144
    const/4 v2, 0x0

    .line 145
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    const v4, 0x4167ae14    # 14.48f

    .line 162
    .line 163
    .line 164
    const v6, 0x4192b852    # 18.34f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v25, 0x41100000    # 9.0f

    .line 171
    .line 172
    const/high16 v26, 0x41880000    # 17.0f

    .line 173
    .line 174
    const v21, 0x4154a3d7    # 13.29f

    .line 175
    .line 176
    .line 177
    const v22, 0x418dd70a    # 17.73f

    .line 178
    .line 179
    .line 180
    const v23, 0x4135eb85    # 11.37f

    .line 181
    .line 182
    .line 183
    const/high16 v24, 0x41880000    # 17.0f

    .line 184
    .line 185
    move-object/from16 v20, v2

    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v25, -0x3f50a3d7    # -5.48f

    .line 191
    .line 192
    .line 193
    const v26, 0x3fab851f    # 1.34f

    .line 194
    .line 195
    .line 196
    const v21, -0x3fe851ec    # -2.37f

    .line 197
    .line 198
    .line 199
    const/16 v22, 0x0

    .line 200
    .line 201
    const v23, -0x3f76b852    # -4.29f

    .line 202
    .line 203
    .line 204
    const v24, 0x3f3ae148    # 0.73f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v25, 0x40400000    # 3.0f

    .line 211
    .line 212
    const/high16 v26, 0x41a00000    # 20.0f

    .line 213
    .line 214
    const v21, 0x4039999a    # 2.9f

    .line 215
    .line 216
    .line 217
    const v22, 0x419547ae    # 18.66f

    .line 218
    .line 219
    .line 220
    const/high16 v23, 0x40400000    # 3.0f

    .line 221
    .line 222
    const v24, 0x419a3d71    # 19.28f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v4, 0x41400000    # 12.0f

    .line 229
    .line 230
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v25, 0x4167ae14    # 14.48f

    .line 234
    .line 235
    .line 236
    const v26, 0x4192b852    # 18.34f

    .line 237
    .line 238
    .line 239
    const/high16 v21, 0x41700000    # 15.0f

    .line 240
    .line 241
    const v22, 0x419a51ec    # 19.29f

    .line 242
    .line 243
    .line 244
    const v23, 0x4171c28f    # 15.11f

    .line 245
    .line 246
    .line 247
    const v24, 0x419547ae    # 18.66f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    const v6, 0x3e99999a    # 0.3f

    .line 261
    .line 262
    .line 263
    const/4 v7, 0x0

    .line 264
    const-string v4, ""

    .line 265
    .line 266
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 267
    .line 268
    .line 269
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 274
    .line 275
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 276
    .line 277
    .line 278
    move-result-wide v6

    .line 279
    const/4 v2, 0x0

    .line 280
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 284
    .line 285
    .line 286
    move-result v10

    .line 287
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 288
    .line 289
    .line 290
    move-result v11

    .line 291
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 294
    .line 295
    .line 296
    const/high16 v4, 0x41a80000    # 21.0f

    .line 297
    .line 298
    const/high16 v6, 0x40400000    # 3.0f

    .line 299
    .line 300
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v4, 0x40400000    # 3.0f

    .line 304
    .line 305
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v25, 0x3f800000    # 1.0f

    .line 309
    .line 310
    const/high16 v26, 0x40a00000    # 5.0f

    .line 311
    .line 312
    const v21, 0x3ff33333    # 1.9f

    .line 313
    .line 314
    .line 315
    const/high16 v22, 0x40400000    # 3.0f

    .line 316
    .line 317
    const/high16 v23, 0x3f800000    # 1.0f

    .line 318
    .line 319
    const v24, 0x4079999a    # 3.9f

    .line 320
    .line 321
    .line 322
    move-object/from16 v20, v2

    .line 323
    .line 324
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v4, 0x41000000    # 8.0f

    .line 328
    .line 329
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v4, 0x40000000    # 2.0f

    .line 333
    .line 334
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v4, 0x40a00000    # 5.0f

    .line 338
    .line 339
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v4, 0x41900000    # 18.0f

    .line 343
    .line 344
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v4, 0x41800000    # 16.0f

    .line 348
    .line 349
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v25, 0x40000000    # 2.0f

    .line 353
    .line 354
    const/high16 v26, -0x40000000    # -2.0f

    .line 355
    .line 356
    const v21, 0x3f8ccccd    # 1.1f

    .line 357
    .line 358
    .line 359
    const/16 v22, 0x0

    .line 360
    .line 361
    const/high16 v23, 0x40000000    # 2.0f

    .line 362
    .line 363
    const v24, -0x4099999a    # -0.9f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v4, 0x40a00000    # 5.0f

    .line 370
    .line 371
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v25, 0x41a80000    # 21.0f

    .line 375
    .line 376
    const/high16 v26, 0x40400000    # 3.0f

    .line 377
    .line 378
    const/high16 v21, 0x41b80000    # 23.0f

    .line 379
    .line 380
    const v22, 0x4079999a    # 3.9f

    .line 381
    .line 382
    .line 383
    const v23, 0x41b0cccd    # 22.1f

    .line 384
    .line 385
    .line 386
    const/high16 v24, 0x40400000    # 3.0f

    .line 387
    .line 388
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    const/high16 v6, 0x3f800000    # 1.0f

    .line 399
    .line 400
    const/high16 v8, 0x3f800000    # 1.0f

    .line 401
    .line 402
    const/4 v7, 0x0

    .line 403
    const-string v4, ""

    .line 404
    .line 405
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 406
    .line 407
    .line 408
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 413
    .line 414
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 415
    .line 416
    .line 417
    move-result-wide v6

    .line 418
    const/4 v2, 0x0

    .line 419
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 423
    .line 424
    .line 425
    move-result v10

    .line 426
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 427
    .line 428
    .line 429
    move-result v11

    .line 430
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 433
    .line 434
    .line 435
    const/high16 v4, 0x41500000    # 13.0f

    .line 436
    .line 437
    const/high16 v6, 0x41200000    # 10.0f

    .line 438
    .line 439
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v25, -0x3f800000    # -4.0f

    .line 443
    .line 444
    const/high16 v26, -0x3f800000    # -4.0f

    .line 445
    .line 446
    const/16 v21, 0x0

    .line 447
    .line 448
    const v22, -0x3ff28f5c    # -2.21f

    .line 449
    .line 450
    .line 451
    const v23, -0x401ae148    # -1.79f

    .line 452
    .line 453
    .line 454
    const/high16 v24, -0x3f800000    # -4.0f

    .line 455
    .line 456
    move-object/from16 v20, v2

    .line 457
    .line 458
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v4, 0x3fe51eb8    # 1.79f

    .line 462
    .line 463
    .line 464
    const/high16 v6, 0x40800000    # 4.0f

    .line 465
    .line 466
    const/high16 v7, -0x3f800000    # -4.0f

    .line 467
    .line 468
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v25, 0x40800000    # 4.0f

    .line 472
    .line 473
    const/high16 v26, 0x40800000    # 4.0f

    .line 474
    .line 475
    const v22, 0x400d70a4    # 2.21f

    .line 476
    .line 477
    .line 478
    const v23, 0x3fe51eb8    # 1.79f

    .line 479
    .line 480
    .line 481
    const/high16 v24, 0x40800000    # 4.0f

    .line 482
    .line 483
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v4, 0x41435c29    # 12.21f

    .line 487
    .line 488
    .line 489
    const/high16 v6, 0x41500000    # 13.0f

    .line 490
    .line 491
    const/high16 v7, 0x41200000    # 10.0f

    .line 492
    .line 493
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v4, 0x40e00000    # 7.0f

    .line 500
    .line 501
    const/high16 v6, 0x41200000    # 10.0f

    .line 502
    .line 503
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v25, 0x40000000    # 2.0f

    .line 507
    .line 508
    const/high16 v26, -0x40000000    # -2.0f

    .line 509
    .line 510
    const v22, -0x40733333    # -1.1f

    .line 511
    .line 512
    .line 513
    const v23, 0x3f666666    # 0.9f

    .line 514
    .line 515
    .line 516
    const/high16 v24, -0x40000000    # -2.0f

    .line 517
    .line 518
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v4, 0x3f666666    # 0.9f

    .line 522
    .line 523
    .line 524
    const/high16 v6, 0x40000000    # 2.0f

    .line 525
    .line 526
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v25, -0x40000000    # -2.0f

    .line 530
    .line 531
    const/high16 v26, 0x40000000    # 2.0f

    .line 532
    .line 533
    const v22, 0x3f8ccccd    # 1.1f

    .line 534
    .line 535
    .line 536
    const v23, -0x4099999a    # -0.9f

    .line 537
    .line 538
    .line 539
    const/high16 v24, 0x40000000    # 2.0f

    .line 540
    .line 541
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v4, 0x4131999a    # 11.1f

    .line 545
    .line 546
    .line 547
    const/high16 v6, 0x40e00000    # 7.0f

    .line 548
    .line 549
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    const/high16 v6, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/4 v7, 0x0

    .line 562
    const-string v4, ""

    .line 563
    .line 564
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 565
    .line 566
    .line 567
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 568
    .line 569
    .line 570
    move-result v3

    .line 571
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 572
    .line 573
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 574
    .line 575
    .line 576
    move-result-wide v6

    .line 577
    const/4 v0, 0x0

    .line 578
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 582
    .line 583
    .line 584
    move-result v10

    .line 585
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 586
    .line 587
    .line 588
    move-result v11

    .line 589
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 592
    .line 593
    .line 594
    const v0, 0x41763d71    # 15.39f

    .line 595
    .line 596
    .line 597
    const v2, 0x41847ae1    # 16.56f

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v17, 0x41100000    # 9.0f

    .line 604
    .line 605
    const/high16 v18, 0x41700000    # 15.0f

    .line 606
    .line 607
    const v13, 0x415b5c29    # 13.71f

    .line 608
    .line 609
    .line 610
    const v14, 0x417b3333    # 15.7f

    .line 611
    .line 612
    .line 613
    const v15, 0x41387ae1    # 11.53f

    .line 614
    .line 615
    .line 616
    const/high16 v16, 0x41700000    # 15.0f

    .line 617
    .line 618
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v17, -0x3f33851f    # -6.39f

    .line 622
    .line 623
    .line 624
    const v18, 0x3fc7ae14    # 1.56f

    .line 625
    .line 626
    .line 627
    const v13, -0x3fde147b    # -2.53f

    .line 628
    .line 629
    .line 630
    const/4 v14, 0x0

    .line 631
    const v15, -0x3f6947ae    # -4.71f

    .line 632
    .line 633
    .line 634
    const v16, 0x3f333333    # 0.7f

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const/high16 v17, 0x3f800000    # 1.0f

    .line 641
    .line 642
    const v18, 0x4199c28f    # 19.22f

    .line 643
    .line 644
    .line 645
    const v13, 0x3fce147b    # 1.61f

    .line 646
    .line 647
    .line 648
    const v14, 0x41888f5c    # 17.07f

    .line 649
    .line 650
    .line 651
    const/high16 v15, 0x3f800000    # 1.0f

    .line 652
    .line 653
    const v16, 0x4190cccd    # 18.1f

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const/high16 v0, 0x41b00000    # 22.0f

    .line 660
    .line 661
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v0, 0x41800000    # 16.0f

    .line 665
    .line 666
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v0, -0x3fce147b    # -2.78f

    .line 670
    .line 671
    .line 672
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v17, 0x41763d71    # 15.39f

    .line 676
    .line 677
    .line 678
    const v18, 0x41847ae1    # 16.56f

    .line 679
    .line 680
    .line 681
    const/high16 v13, 0x41880000    # 17.0f

    .line 682
    .line 683
    const v14, 0x4190cccd    # 18.1f

    .line 684
    .line 685
    .line 686
    const v15, 0x41831eb8    # 16.39f

    .line 687
    .line 688
    .line 689
    const v16, 0x41888f5c    # 17.07f

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const/high16 v0, 0x41700000    # 15.0f

    .line 699
    .line 700
    const/high16 v2, 0x41a00000    # 20.0f

    .line 701
    .line 702
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const/high16 v0, 0x40400000    # 3.0f

    .line 706
    .line 707
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v17, 0x3f051eb8    # 0.52f

    .line 711
    .line 712
    .line 713
    const v18, -0x402b851f    # -1.66f

    .line 714
    .line 715
    .line 716
    const/4 v13, 0x0

    .line 717
    const v14, -0x40c7ae14    # -0.72f

    .line 718
    .line 719
    .line 720
    const v15, -0x42333333    # -0.1f

    .line 721
    .line 722
    .line 723
    const v16, -0x40547ae1    # -1.34f

    .line 724
    .line 725
    .line 726
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const/high16 v17, 0x41100000    # 9.0f

    .line 730
    .line 731
    const/high16 v18, 0x41880000    # 17.0f

    .line 732
    .line 733
    const v13, 0x4096b852    # 4.71f

    .line 734
    .line 735
    .line 736
    const v14, 0x418dd70a    # 17.73f

    .line 737
    .line 738
    .line 739
    const v15, 0x40d428f6    # 6.63f

    .line 740
    .line 741
    .line 742
    const/high16 v16, 0x41880000    # 17.0f

    .line 743
    .line 744
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v17, 0x40af5c29    # 5.48f

    .line 748
    .line 749
    .line 750
    const v18, 0x3fab851f    # 1.34f

    .line 751
    .line 752
    .line 753
    const v13, 0x4017ae14    # 2.37f

    .line 754
    .line 755
    .line 756
    const/4 v14, 0x0

    .line 757
    const v15, 0x408947ae    # 4.29f

    .line 758
    .line 759
    .line 760
    const v16, 0x3f3ae148    # 0.73f

    .line 761
    .line 762
    .line 763
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const/high16 v17, 0x41700000    # 15.0f

    .line 767
    .line 768
    const/high16 v18, 0x41a00000    # 20.0f

    .line 769
    .line 770
    const v13, 0x4171c28f    # 15.11f

    .line 771
    .line 772
    .line 773
    const v14, 0x419547ae    # 18.66f

    .line 774
    .line 775
    .line 776
    const/high16 v15, 0x41700000    # 15.0f

    .line 777
    .line 778
    const v16, 0x419a51ec    # 19.29f

    .line 779
    .line 780
    .line 781
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 788
    .line 789
    .line 790
    move-result-object v2

    .line 791
    const/16 v16, 0x3800

    .line 792
    .line 793
    const/16 v17, 0x0

    .line 794
    .line 795
    const/high16 v6, 0x3f800000    # 1.0f

    .line 796
    .line 797
    const/4 v7, 0x0

    .line 798
    const/high16 v12, 0x3f800000    # 1.0f

    .line 799
    .line 800
    const/4 v13, 0x0

    .line 801
    const/4 v14, 0x0

    .line 802
    const/4 v15, 0x0

    .line 803
    const-string v4, ""

    .line 804
    .line 805
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    sput-object v0, Landroidx/compose/material/icons/twotone/CoPresentKt;->_coPresent:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 814
    .line 815
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 816
    .line 817
    .line 818
    return-object v0
.end method
