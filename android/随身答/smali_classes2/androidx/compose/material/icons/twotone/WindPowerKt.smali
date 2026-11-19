.class public final Landroidx/compose/material/icons/twotone/WindPowerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_windPower",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "WindPower",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getWindPower",
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
        "SMAP\nWindPower.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindPower.kt\nandroidx/compose/material/icons/twotone/WindPowerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,156:1\n212#2,12:157\n233#2,18:170\n253#2:207\n233#2,18:208\n253#2:245\n233#2,18:246\n253#2:283\n233#2,18:284\n253#2:321\n233#2,18:322\n253#2:359\n233#2,18:360\n253#2:397\n233#2,18:398\n253#2:435\n233#2,18:436\n253#2:473\n174#3:169\n705#4,2:188\n717#4,2:190\n719#4,11:196\n705#4,2:226\n717#4,2:228\n719#4,11:234\n705#4,2:264\n717#4,2:266\n719#4,11:272\n705#4,2:302\n717#4,2:304\n719#4,11:310\n705#4,2:340\n717#4,2:342\n719#4,11:348\n705#4,2:378\n717#4,2:380\n719#4,11:386\n705#4,2:416\n717#4,2:418\n719#4,11:424\n705#4,2:454\n717#4,2:456\n719#4,11:462\n72#5,4:192\n72#5,4:230\n72#5,4:268\n72#5,4:306\n72#5,4:344\n72#5,4:382\n72#5,4:420\n72#5,4:458\n*S KotlinDebug\n*F\n+ 1 WindPower.kt\nandroidx/compose/material/icons/twotone/WindPowerKt\n*L\n29#1:157,12\n30#1:170,18\n30#1:207\n36#1:208,18\n36#1:245\n46#1:246,18\n46#1:283\n56#1:284,18\n56#1:321\n66#1:322,18\n66#1:359\n73#1:360,18\n73#1:397\n80#1:398,18\n80#1:435\n87#1:436,18\n87#1:473\n29#1:169\n30#1:188,2\n30#1:190,2\n30#1:196,11\n36#1:226,2\n36#1:228,2\n36#1:234,11\n46#1:264,2\n46#1:266,2\n46#1:272,11\n56#1:302,2\n56#1:304,2\n56#1:310,11\n66#1:340,2\n66#1:342,2\n66#1:348,11\n73#1:378,2\n73#1:380,2\n73#1:386,11\n80#1:416,2\n80#1:418,2\n80#1:424,11\n87#1:454,2\n87#1:456,2\n87#1:462,11\n30#1:192,4\n36#1:230,4\n46#1:268,4\n56#1:306,4\n66#1:344,4\n73#1:382,4\n80#1:420,4\n87#1:458,4\n*E\n"
    }
.end annotation


# static fields
.field private static _windPower:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWindPower(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WindPowerKt;->_windPower:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.WindPower"

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 71
    .line 72
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/high16 v4, -0x40800000    # -1.0f

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 79
    .line 80
    .line 81
    const/high16 v26, 0x40000000    # 2.0f

    .line 82
    .line 83
    const/16 v27, 0x0

    .line 84
    .line 85
    const/high16 v21, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const/high16 v22, 0x3f800000    # 1.0f

    .line 88
    .line 89
    const/16 v23, 0x0

    .line 90
    .line 91
    const/16 v24, 0x1

    .line 92
    .line 93
    const/16 v25, 0x1

    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v26, -0x40000000    # -2.0f

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const/16 v16, 0x3800

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const v6, 0x3e99999a    # 0.3f

    .line 114
    .line 115
    .line 116
    const v8, 0x3e99999a    # 0.3f

    .line 117
    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/high16 v9, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/high16 v12, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    const-string v4, ""

    .line 128
    .line 129
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    const/4 v2, 0x0

    .line 143
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const v4, 0x4051eb85    # 3.28f

    .line 160
    .line 161
    .line 162
    const/high16 v6, 0x41500000    # 13.0f

    .line 163
    .line 164
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v25, 0x40400000    # 3.0f

    .line 168
    .line 169
    const v26, 0x41547ae1    # 13.28f

    .line 170
    .line 171
    .line 172
    const v21, 0x404851ec    # 3.13f

    .line 173
    .line 174
    .line 175
    const/high16 v22, 0x41500000    # 13.0f

    .line 176
    .line 177
    const/high16 v23, 0x40400000    # 3.0f

    .line 178
    .line 179
    const v24, 0x4152147b    # 13.13f

    .line 180
    .line 181
    .line 182
    move-object/from16 v20, v2

    .line 183
    .line 184
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v25, 0x3e4ccccd    # 0.2f

    .line 188
    .line 189
    .line 190
    const v26, 0x3e8a3d71    # 0.27f

    .line 191
    .line 192
    .line 193
    const/16 v21, 0x0

    .line 194
    .line 195
    const v22, 0x3df5c28f    # 0.12f

    .line 196
    .line 197
    .line 198
    const v23, 0x3da3d70a    # 0.08f

    .line 199
    .line 200
    .line 201
    const v24, 0x3e75c28f    # 0.24f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v4, 0x3fa51eb8    # 1.29f

    .line 208
    .line 209
    .line 210
    const v6, 0x409051ec    # 4.51f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v4, 0x40151eb8    # 2.33f

    .line 217
    .line 218
    .line 219
    const v6, -0x404ccccd    # -1.4f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v25, -0x430a3d71    # -0.03f

    .line 226
    .line 227
    .line 228
    const v26, -0x411eb852    # -0.44f

    .line 229
    .line 230
    .line 231
    const v21, -0x435c28f6    # -0.02f

    .line 232
    .line 233
    .line 234
    const v22, -0x41e66666    # -0.15f

    .line 235
    .line 236
    .line 237
    const v23, -0x430a3d71    # -0.03f

    .line 238
    .line 239
    .line 240
    const v24, -0x416b851f    # -0.29f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, 0x4051eb85    # 3.28f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    const v6, 0x3e99999a    # 0.3f

    .line 260
    .line 261
    .line 262
    const/4 v7, 0x0

    .line 263
    const-string v4, ""

    .line 264
    .line 265
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 266
    .line 267
    .line 268
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 273
    .line 274
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 275
    .line 276
    .line 277
    move-result-wide v6

    .line 278
    const/4 v2, 0x0

    .line 279
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 283
    .line 284
    .line 285
    move-result v10

    .line 286
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 293
    .line 294
    .line 295
    const v4, 0x418e147b    # 17.76f

    .line 296
    .line 297
    .line 298
    const v6, 0x40628f5c    # 3.54f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v25, -0x4151eb85    # -0.34f

    .line 305
    .line 306
    .line 307
    const v26, 0x3d23d70a    # 0.04f

    .line 308
    .line 309
    .line 310
    const v21, -0x41e66666    # -0.15f

    .line 311
    .line 312
    .line 313
    const v22, -0x4247ae14    # -0.09f

    .line 314
    .line 315
    .line 316
    const v23, -0x416b851f    # -0.29f

    .line 317
    .line 318
    .line 319
    const v24, -0x43dc28f6    # -0.01f

    .line 320
    .line 321
    .line 322
    move-object/from16 v20, v2

    .line 323
    .line 324
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v4, 0x40d8f5c3    # 6.78f

    .line 328
    .line 329
    .line 330
    const/high16 v6, 0x41600000    # 14.0f

    .line 331
    .line 332
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v4, 0x40570a3d    # 3.36f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v4, 0x3de147ae    # 0.11f

    .line 342
    .line 343
    .line 344
    const v6, 0x3cf5c28f    # 0.03f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v4, 0x406f5c29    # 3.74f

    .line 351
    .line 352
    .line 353
    const v6, -0x3f3851ec    # -6.24f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v25, 0x418e147b    # 17.76f

    .line 360
    .line 361
    .line 362
    const v26, 0x40628f5c    # 3.54f

    .line 363
    .line 364
    .line 365
    const v21, 0x418f851f    # 17.94f

    .line 366
    .line 367
    .line 368
    const v22, 0x40728f5c    # 3.79f

    .line 369
    .line 370
    .line 371
    const v23, 0x418f1eb8    # 17.89f

    .line 372
    .line 373
    .line 374
    const v24, 0x4067ae14    # 3.62f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    const v6, 0x3e99999a    # 0.3f

    .line 388
    .line 389
    .line 390
    const/4 v7, 0x0

    .line 391
    const-string v4, ""

    .line 392
    .line 393
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 394
    .line 395
    .line 396
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 401
    .line 402
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 403
    .line 404
    .line 405
    move-result-wide v6

    .line 406
    const/4 v2, 0x0

    .line 407
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 411
    .line 412
    .line 413
    move-result v10

    .line 414
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 415
    .line 416
    .line 417
    move-result v11

    .line 418
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 421
    .line 422
    .line 423
    const v4, 0x4177ae14    # 15.48f

    .line 424
    .line 425
    .line 426
    const v6, 0x4191851f    # 18.19f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v4, -0x3fce147b    # -2.78f

    .line 433
    .line 434
    .line 435
    const v6, -0x40cf5c29    # -0.69f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v25, -0x418a3d71    # -0.24f

    .line 442
    .line 443
    .line 444
    const v26, 0x3e8f5c29    # 0.28f

    .line 445
    .line 446
    .line 447
    const v21, -0x4270a3d7    # -0.07f

    .line 448
    .line 449
    .line 450
    const v22, 0x3dcccccd    # 0.1f

    .line 451
    .line 452
    .line 453
    const v23, -0x41e66666    # -0.15f

    .line 454
    .line 455
    .line 456
    const v24, 0x3e428f5c    # 0.19f

    .line 457
    .line 458
    .line 459
    move-object/from16 v20, v2

    .line 460
    .line 461
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v4, 0x409b3333    # 4.85f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v25, 0x3ecccccd    # 0.4f

    .line 471
    .line 472
    .line 473
    const/16 v26, 0x0

    .line 474
    .line 475
    const v21, 0x3e23d70a    # 0.16f

    .line 476
    .line 477
    .line 478
    const v22, 0x3e23d70a    # 0.16f

    .line 479
    .line 480
    .line 481
    const v23, 0x3eb33333    # 0.35f

    .line 482
    .line 483
    .line 484
    const v24, 0x3d4ccccd    # 0.05f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v25, 0x3d4ccccd    # 0.05f

    .line 491
    .line 492
    .line 493
    const v26, -0x41570a3d    # -0.33f

    .line 494
    .line 495
    .line 496
    const v21, 0x3db851ec    # 0.09f

    .line 497
    .line 498
    .line 499
    const v22, -0x4247ae14    # -0.09f

    .line 500
    .line 501
    .line 502
    const v23, 0x3de147ae    # 0.11f

    .line 503
    .line 504
    .line 505
    const v24, -0x41947ae1    # -0.23f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v4, 0x4177ae14    # 15.48f

    .line 512
    .line 513
    .line 514
    const v6, 0x4191851f    # 18.19f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    const v6, 0x3e99999a    # 0.3f

    .line 528
    .line 529
    .line 530
    const/4 v7, 0x0

    .line 531
    const-string v4, ""

    .line 532
    .line 533
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 534
    .line 535
    .line 536
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 541
    .line 542
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 543
    .line 544
    .line 545
    move-result-wide v6

    .line 546
    const/4 v2, 0x0

    .line 547
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 551
    .line 552
    .line 553
    move-result v10

    .line 554
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 555
    .line 556
    .line 557
    move-result v11

    .line 558
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 561
    .line 562
    .line 563
    const/high16 v4, 0x40800000    # 4.0f

    .line 564
    .line 565
    const/high16 v6, 0x40400000    # 3.0f

    .line 566
    .line 567
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v4, 0x40c00000    # 6.0f

    .line 571
    .line 572
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v4, 0x40000000    # 2.0f

    .line 576
    .line 577
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v4, -0x3f400000    # -6.0f

    .line 581
    .line 582
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    const/high16 v6, 0x3f800000    # 1.0f

    .line 593
    .line 594
    const/high16 v8, 0x3f800000    # 1.0f

    .line 595
    .line 596
    const/4 v7, 0x0

    .line 597
    const-string v4, ""

    .line 598
    .line 599
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 600
    .line 601
    .line 602
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 603
    .line 604
    .line 605
    move-result v3

    .line 606
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 607
    .line 608
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 609
    .line 610
    .line 611
    move-result-wide v6

    .line 612
    const/4 v2, 0x0

    .line 613
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 617
    .line 618
    .line 619
    move-result v10

    .line 620
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 621
    .line 622
    .line 623
    move-result v11

    .line 624
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 627
    .line 628
    .line 629
    const/high16 v4, 0x40e00000    # 7.0f

    .line 630
    .line 631
    const/high16 v6, 0x3f800000    # 1.0f

    .line 632
    .line 633
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v4, 0x40a00000    # 5.0f

    .line 637
    .line 638
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v4, 0x40000000    # 2.0f

    .line 642
    .line 643
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v4, -0x3f600000    # -5.0f

    .line 647
    .line 648
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 655
    .line 656
    .line 657
    move-result-object v2

    .line 658
    const/4 v7, 0x0

    .line 659
    const-string v4, ""

    .line 660
    .line 661
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 662
    .line 663
    .line 664
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 665
    .line 666
    .line 667
    move-result v3

    .line 668
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 669
    .line 670
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 671
    .line 672
    .line 673
    move-result-wide v6

    .line 674
    const/4 v2, 0x0

    .line 675
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 679
    .line 680
    .line 681
    move-result v10

    .line 682
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 683
    .line 684
    .line 685
    move-result v11

    .line 686
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 689
    .line 690
    .line 691
    const/high16 v4, 0x41980000    # 19.0f

    .line 692
    .line 693
    const/high16 v6, 0x40400000    # 3.0f

    .line 694
    .line 695
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const/high16 v4, 0x40a00000    # 5.0f

    .line 699
    .line 700
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const/high16 v4, 0x40000000    # 2.0f

    .line 704
    .line 705
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const/high16 v4, -0x3f600000    # -5.0f

    .line 709
    .line 710
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 717
    .line 718
    .line 719
    move-result-object v2

    .line 720
    const/high16 v6, 0x3f800000    # 1.0f

    .line 721
    .line 722
    const/4 v7, 0x0

    .line 723
    const-string v4, ""

    .line 724
    .line 725
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 726
    .line 727
    .line 728
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 729
    .line 730
    .line 731
    move-result v3

    .line 732
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 733
    .line 734
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 735
    .line 736
    .line 737
    move-result-wide v6

    .line 738
    const/4 v0, 0x0

    .line 739
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 743
    .line 744
    .line 745
    move-result v10

    .line 746
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 747
    .line 748
    .line 749
    move-result v11

    .line 750
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 753
    .line 754
    .line 755
    const v0, 0x41b1ae14    # 22.21f

    .line 756
    .line 757
    .line 758
    const v2, 0x4194e148    # 18.61f

    .line 759
    .line 760
    .line 761
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const v0, -0x3fee147b    # -2.28f

    .line 765
    .line 766
    .line 767
    const v2, -0x3f7ccccd    # -4.1f

    .line 768
    .line 769
    .line 770
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    const v17, -0x405eb852    # -1.26f

    .line 774
    .line 775
    .line 776
    const v18, -0x4087ae14    # -0.97f

    .line 777
    .line 778
    .line 779
    const v13, -0x4175c28f    # -0.27f

    .line 780
    .line 781
    .line 782
    const v14, -0x410a3d71    # -0.48f

    .line 783
    .line 784
    .line 785
    const v15, -0x40c51eb8    # -0.73f

    .line 786
    .line 787
    .line 788
    const v16, -0x40ab851f    # -0.83f

    .line 789
    .line 790
    .line 791
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const v0, -0x3fd3d70a    # -2.69f

    .line 795
    .line 796
    .line 797
    const v2, -0x40d47ae1    # -0.67f

    .line 798
    .line 799
    .line 800
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const v17, -0x41428f5c    # -0.37f

    .line 804
    .line 805
    .line 806
    const v18, -0x4055c28f    # -1.33f

    .line 807
    .line 808
    .line 809
    const v13, -0x435c28f6    # -0.02f

    .line 810
    .line 811
    .line 812
    const v14, -0x410f5c29    # -0.47f

    .line 813
    .line 814
    .line 815
    const v15, -0x41f0a3d7    # -0.14f

    .line 816
    .line 817
    .line 818
    const v16, -0x40947ae1    # -0.92f

    .line 819
    .line 820
    .line 821
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const v0, 0x407d70a4    # 3.96f

    .line 825
    .line 826
    .line 827
    const v2, -0x3f2d1eb8    # -6.59f

    .line 828
    .line 829
    .line 830
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const v17, -0x40b851ec    # -0.78f

    .line 834
    .line 835
    .line 836
    const v18, -0x3fb7ae14    # -3.13f

    .line 837
    .line 838
    .line 839
    const v13, 0x3f266666    # 0.65f

    .line 840
    .line 841
    .line 842
    const v14, -0x4075c28f    # -1.08f

    .line 843
    .line 844
    .line 845
    const v15, 0x3e99999a    # 0.3f

    .line 846
    .line 847
    .line 848
    const v16, -0x3fe147ae    # -2.48f

    .line 849
    .line 850
    .line 851
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    const v17, -0x406a3d71    # -1.17f

    .line 855
    .line 856
    .line 857
    const v18, -0x415c28f6    # -0.32f

    .line 858
    .line 859
    .line 860
    const v13, -0x4147ae14    # -0.36f

    .line 861
    .line 862
    .line 863
    const v14, -0x419eb852    # -0.22f

    .line 864
    .line 865
    .line 866
    const v15, -0x40bae148    # -0.77f

    .line 867
    .line 868
    .line 869
    const v16, -0x415c28f6    # -0.32f

    .line 870
    .line 871
    .line 872
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    const v17, -0x403851ec    # -1.56f

    .line 876
    .line 877
    .line 878
    const v18, 0x3f1eb852    # 0.62f

    .line 879
    .line 880
    .line 881
    const v13, -0x40f0a3d7    # -0.56f

    .line 882
    .line 883
    .line 884
    const/4 v14, 0x0

    .line 885
    const v15, -0x4070a3d7    # -1.12f

    .line 886
    .line 887
    .line 888
    const v16, 0x3e570a3d    # 0.21f

    .line 889
    .line 890
    .line 891
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 892
    .line 893
    .line 894
    const v0, -0x3fa47ae1    # -3.43f

    .line 895
    .line 896
    .line 897
    const v2, 0x404d70a4    # 3.21f

    .line 898
    .line 899
    .line 900
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    const/high16 v17, 0x41400000    # 12.0f

    .line 904
    .line 905
    const v18, 0x40d8f5c3    # 6.78f

    .line 906
    .line 907
    .line 908
    const v13, 0x4143ae14    # 12.23f

    .line 909
    .line 910
    .line 911
    const v14, 0x40b66666    # 5.7f

    .line 912
    .line 913
    .line 914
    const/high16 v15, 0x41400000    # 12.0f

    .line 915
    .line 916
    const v16, 0x40c75c29    # 6.23f

    .line 917
    .line 918
    .line 919
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 920
    .line 921
    .line 922
    const v0, 0x4059999a    # 3.4f

    .line 923
    .line 924
    .line 925
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 926
    .line 927
    .line 928
    const v17, -0x40628f5c    # -1.23f

    .line 929
    .line 930
    .line 931
    const v18, 0x3f51eb85    # 0.82f

    .line 932
    .line 933
    .line 934
    const v13, -0x410f5c29    # -0.47f

    .line 935
    .line 936
    .line 937
    const v14, 0x3e2e147b    # 0.17f

    .line 938
    .line 939
    .line 940
    const v15, -0x409c28f6    # -0.89f

    .line 941
    .line 942
    .line 943
    const v16, 0x3ee66666    # 0.45f

    .line 944
    .line 945
    .line 946
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 947
    .line 948
    .line 949
    const v0, 0x4051eb85    # 3.28f

    .line 950
    .line 951
    .line 952
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 953
    .line 954
    .line 955
    const/high16 v17, 0x3f800000    # 1.0f

    .line 956
    .line 957
    const v18, 0x41547ae1    # 13.28f

    .line 958
    .line 959
    .line 960
    const v13, 0x400147ae    # 2.02f

    .line 961
    .line 962
    .line 963
    const/high16 v14, 0x41300000    # 11.0f

    .line 964
    .line 965
    const/high16 v15, 0x3f800000    # 1.0f

    .line 966
    .line 967
    const v16, 0x414051ec    # 12.02f

    .line 968
    .line 969
    .line 970
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 971
    .line 972
    .line 973
    const v17, 0x3fd33333    # 1.65f

    .line 974
    .line 975
    .line 976
    const v18, 0x400c28f6    # 2.19f

    .line 977
    .line 978
    .line 979
    const/4 v13, 0x0

    .line 980
    const v14, 0x3f828f5c    # 1.02f

    .line 981
    .line 982
    .line 983
    const v15, 0x3f2b851f    # 0.67f

    .line 984
    .line 985
    .line 986
    const v16, 0x3ff47ae1    # 1.91f

    .line 987
    .line 988
    .line 989
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 990
    .line 991
    .line 992
    const v0, 0x3fa51eb8    # 1.29f

    .line 993
    .line 994
    .line 995
    const v2, 0x409051ec    # 4.51f

    .line 996
    .line 997
    .line 998
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 999
    .line 1000
    .line 1001
    const v17, 0x3f0ccccd    # 0.55f

    .line 1002
    .line 1003
    .line 1004
    const v18, 0x3da3d70a    # 0.08f

    .line 1005
    .line 1006
    .line 1007
    const v13, 0x3e3851ec    # 0.18f

    .line 1008
    .line 1009
    .line 1010
    const v14, 0x3d4ccccd    # 0.05f

    .line 1011
    .line 1012
    .line 1013
    const v15, 0x3ebd70a4    # 0.37f

    .line 1014
    .line 1015
    .line 1016
    const v16, 0x3da3d70a    # 0.08f

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1020
    .line 1021
    .line 1022
    const v17, 0x3f83d70a    # 1.03f

    .line 1023
    .line 1024
    .line 1025
    const v18, -0x416b851f    # -0.29f

    .line 1026
    .line 1027
    .line 1028
    const v13, 0x3eb851ec    # 0.36f

    .line 1029
    .line 1030
    .line 1031
    const/4 v14, 0x0

    .line 1032
    const v15, 0x3f3851ec    # 0.72f

    .line 1033
    .line 1034
    .line 1035
    const v16, -0x42333333    # -0.1f

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1039
    .line 1040
    .line 1041
    const v0, 0x400f5c29    # 2.24f

    .line 1042
    .line 1043
    .line 1044
    const v2, -0x40547ae1    # -1.34f

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1048
    .line 1049
    .line 1050
    const v17, 0x3f828f5c    # 1.02f

    .line 1051
    .line 1052
    .line 1053
    const v18, 0x3f1c28f6    # 0.61f

    .line 1054
    .line 1055
    .line 1056
    const v13, 0x3e947ae1    # 0.29f

    .line 1057
    .line 1058
    .line 1059
    const v14, 0x3e851eb8    # 0.26f

    .line 1060
    .line 1061
    .line 1062
    const v15, 0x3f2147ae    # 0.63f

    .line 1063
    .line 1064
    .line 1065
    const v16, 0x3ef0a3d7    # 0.47f

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1069
    .line 1070
    .line 1071
    const/high16 v0, 0x41a80000    # 21.0f

    .line 1072
    .line 1073
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1074
    .line 1075
    .line 1076
    const/high16 v17, -0x40000000    # -2.0f

    .line 1077
    .line 1078
    const/high16 v18, 0x40000000    # 2.0f

    .line 1079
    .line 1080
    const v13, -0x40733333    # -1.1f

    .line 1081
    .line 1082
    .line 1083
    const/4 v14, 0x0

    .line 1084
    const/high16 v15, -0x40000000    # -2.0f

    .line 1085
    .line 1086
    const v16, 0x3f666666    # 0.9f

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1090
    .line 1091
    .line 1092
    const/high16 v0, 0x40c00000    # 6.0f

    .line 1093
    .line 1094
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1095
    .line 1096
    .line 1097
    const/high16 v18, -0x40000000    # -2.0f

    .line 1098
    .line 1099
    const/4 v13, 0x0

    .line 1100
    const v14, -0x40733333    # -1.1f

    .line 1101
    .line 1102
    .line 1103
    const v15, -0x4099999a    # -0.9f

    .line 1104
    .line 1105
    .line 1106
    const/high16 v16, -0x40000000    # -2.0f

    .line 1107
    .line 1108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1109
    .line 1110
    .line 1111
    const v0, -0x3f770a3d    # -4.28f

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1115
    .line 1116
    .line 1117
    const v0, 0x4093851f    # 4.61f

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1121
    .line 1122
    .line 1123
    const v17, 0x3fce147b    # 1.61f

    .line 1124
    .line 1125
    .line 1126
    const v18, 0x3f2b851f    # 0.67f

    .line 1127
    .line 1128
    .line 1129
    const v13, 0x3ee66666    # 0.45f

    .line 1130
    .line 1131
    .line 1132
    const v14, 0x3ee66666    # 0.45f

    .line 1133
    .line 1134
    .line 1135
    const v15, 0x3f83d70a    # 1.03f

    .line 1136
    .line 1137
    .line 1138
    const v16, 0x3f2b851f    # 0.67f

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1142
    .line 1143
    .line 1144
    const v18, -0x40d47ae1    # -0.67f

    .line 1145
    .line 1146
    .line 1147
    const v13, 0x3f147ae1    # 0.58f

    .line 1148
    .line 1149
    .line 1150
    const/4 v14, 0x0

    .line 1151
    const v15, 0x3f95c28f    # 1.17f

    .line 1152
    .line 1153
    .line 1154
    const v16, -0x419eb852    # -0.22f

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1158
    .line 1159
    .line 1160
    const/4 v0, 0x0

    .line 1161
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1162
    .line 1163
    .line 1164
    const v17, 0x41b1ae14    # 22.21f

    .line 1165
    .line 1166
    .line 1167
    const v18, 0x4194e148    # 18.61f

    .line 1168
    .line 1169
    .line 1170
    const v13, 0x41b46666    # 22.55f

    .line 1171
    .line 1172
    .line 1173
    const v14, 0x41a4e148    # 20.61f

    .line 1174
    .line 1175
    .line 1176
    const v15, 0x41b5ae14    # 22.71f

    .line 1177
    .line 1178
    .line 1179
    const/high16 v16, 0x419c0000    # 19.5f

    .line 1180
    .line 1181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1182
    .line 1183
    .line 1184
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1185
    .line 1186
    .line 1187
    const v0, 0x416d70a4    # 14.84f

    .line 1188
    .line 1189
    .line 1190
    const v2, 0x40f70a3d    # 7.72f

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1194
    .line 1195
    .line 1196
    const v0, 0x404ccccd    # 3.2f

    .line 1197
    .line 1198
    .line 1199
    const v2, 0x4158cccd    # 13.55f

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1203
    .line 1204
    .line 1205
    const/high16 v17, 0x40400000    # 3.0f

    .line 1206
    .line 1207
    const v18, 0x41547ae1    # 13.28f

    .line 1208
    .line 1209
    .line 1210
    const v13, 0x40451eb8    # 3.08f

    .line 1211
    .line 1212
    .line 1213
    const v14, 0x415851ec    # 13.52f

    .line 1214
    .line 1215
    .line 1216
    const/high16 v15, 0x40400000    # 3.0f

    .line 1217
    .line 1218
    const v16, 0x41566666    # 13.4f

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1222
    .line 1223
    .line 1224
    const v17, 0x4051eb85    # 3.28f

    .line 1225
    .line 1226
    .line 1227
    const/high16 v18, 0x41500000    # 13.0f

    .line 1228
    .line 1229
    const/high16 v13, 0x40400000    # 3.0f

    .line 1230
    .line 1231
    const v14, 0x4152147b    # 13.13f

    .line 1232
    .line 1233
    .line 1234
    const v15, 0x404851ec    # 3.13f

    .line 1235
    .line 1236
    .line 1237
    const/high16 v16, 0x41500000    # 13.0f

    .line 1238
    .line 1239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1240
    .line 1241
    .line 1242
    const v0, 0x40d75c29    # 6.73f

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1246
    .line 1247
    .line 1248
    const v17, 0x3cf5c28f    # 0.03f

    .line 1249
    .line 1250
    .line 1251
    const v18, 0x3ee147ae    # 0.44f

    .line 1252
    .line 1253
    .line 1254
    const/4 v13, 0x0

    .line 1255
    const v14, 0x3e19999a    # 0.15f

    .line 1256
    .line 1257
    .line 1258
    const v15, 0x3c23d70a    # 0.01f

    .line 1259
    .line 1260
    .line 1261
    const v16, 0x3e99999a    # 0.3f

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1265
    .line 1266
    .line 1267
    const v0, 0x416d70a4    # 14.84f

    .line 1268
    .line 1269
    .line 1270
    const v2, 0x40f70a3d    # 7.72f

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1277
    .line 1278
    .line 1279
    const/high16 v0, 0x41600000    # 14.0f

    .line 1280
    .line 1281
    const/high16 v2, 0x41500000    # 13.0f

    .line 1282
    .line 1283
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1284
    .line 1285
    .line 1286
    const/high16 v17, -0x40800000    # -1.0f

    .line 1287
    .line 1288
    const/high16 v18, -0x40800000    # -1.0f

    .line 1289
    .line 1290
    const v13, -0x40f33333    # -0.55f

    .line 1291
    .line 1292
    .line 1293
    const/4 v14, 0x0

    .line 1294
    const/high16 v15, -0x40800000    # -1.0f

    .line 1295
    .line 1296
    const v16, -0x4119999a    # -0.45f

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1300
    .line 1301
    .line 1302
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1303
    .line 1304
    const/4 v13, 0x0

    .line 1305
    const v14, -0x40f33333    # -0.55f

    .line 1306
    .line 1307
    .line 1308
    const v15, 0x3ee66666    # 0.45f

    .line 1309
    .line 1310
    .line 1311
    const/high16 v16, -0x40800000    # -1.0f

    .line 1312
    .line 1313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1314
    .line 1315
    .line 1316
    const v0, 0x3ee66666    # 0.45f

    .line 1317
    .line 1318
    .line 1319
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1320
    .line 1321
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1322
    .line 1323
    .line 1324
    const/high16 v17, 0x41500000    # 13.0f

    .line 1325
    .line 1326
    const/high16 v18, 0x41600000    # 14.0f

    .line 1327
    .line 1328
    const/high16 v13, 0x41600000    # 14.0f

    .line 1329
    .line 1330
    const v14, 0x4158cccd    # 13.55f

    .line 1331
    .line 1332
    .line 1333
    const v15, 0x4158cccd    # 13.55f

    .line 1334
    .line 1335
    .line 1336
    const/high16 v16, 0x41600000    # 14.0f

    .line 1337
    .line 1338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1339
    .line 1340
    .line 1341
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1342
    .line 1343
    .line 1344
    const v0, 0x41223d71    # 10.14f

    .line 1345
    .line 1346
    .line 1347
    const/high16 v2, 0x41600000    # 14.0f

    .line 1348
    .line 1349
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1350
    .line 1351
    .line 1352
    const v0, 0x40d8f5c3    # 6.78f

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1356
    .line 1357
    .line 1358
    const v0, 0x405b851f    # 3.43f

    .line 1359
    .line 1360
    .line 1361
    const v2, -0x3fb28f5c    # -3.21f

    .line 1362
    .line 1363
    .line 1364
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1365
    .line 1366
    .line 1367
    const v17, 0x3eae147b    # 0.34f

    .line 1368
    .line 1369
    .line 1370
    const v18, -0x42dc28f6    # -0.04f

    .line 1371
    .line 1372
    .line 1373
    const v13, 0x3d4ccccd    # 0.05f

    .line 1374
    .line 1375
    .line 1376
    const v14, -0x42b33333    # -0.05f

    .line 1377
    .line 1378
    .line 1379
    const v15, 0x3e428f5c    # 0.19f

    .line 1380
    .line 1381
    .line 1382
    const v16, -0x420a3d71    # -0.12f

    .line 1383
    .line 1384
    .line 1385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1386
    .line 1387
    .line 1388
    const v17, 0x3dcccccd    # 0.1f

    .line 1389
    .line 1390
    .line 1391
    const v18, 0x3ec28f5c    # 0.38f

    .line 1392
    .line 1393
    .line 1394
    const v13, 0x3e051eb8    # 0.13f

    .line 1395
    .line 1396
    .line 1397
    const v14, 0x3da3d70a    # 0.08f

    .line 1398
    .line 1399
    .line 1400
    const v15, 0x3e3851ec    # 0.18f

    .line 1401
    .line 1402
    .line 1403
    const/high16 v16, 0x3e800000    # 0.25f

    .line 1404
    .line 1405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1406
    .line 1407
    .line 1408
    const v0, -0x3f90a3d7    # -3.74f

    .line 1409
    .line 1410
    .line 1411
    const v2, 0x40c7ae14    # 6.24f

    .line 1412
    .line 1413
    .line 1414
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1415
    .line 1416
    .line 1417
    const v0, 0x41223d71    # 10.14f

    .line 1418
    .line 1419
    .line 1420
    const/high16 v2, 0x41600000    # 14.0f

    .line 1421
    .line 1422
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1423
    .line 1424
    .line 1425
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1426
    .line 1427
    .line 1428
    const v0, 0x41a35c29    # 20.42f

    .line 1429
    .line 1430
    .line 1431
    const v2, 0x419f5c29    # 19.92f

    .line 1432
    .line 1433
    .line 1434
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1435
    .line 1436
    .line 1437
    const v17, -0x41333333    # -0.4f

    .line 1438
    .line 1439
    .line 1440
    const/16 v18, 0x0

    .line 1441
    .line 1442
    const v13, -0x42b33333    # -0.05f

    .line 1443
    .line 1444
    .line 1445
    const v14, 0x3d4ccccd    # 0.05f

    .line 1446
    .line 1447
    .line 1448
    const v15, -0x418a3d71    # -0.24f

    .line 1449
    .line 1450
    .line 1451
    const v16, 0x3e23d70a    # 0.16f

    .line 1452
    .line 1453
    .line 1454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1455
    .line 1456
    .line 1457
    const v0, -0x3f64cccd    # -4.85f

    .line 1458
    .line 1459
    .line 1460
    const v2, -0x3f64cccd    # -4.85f

    .line 1461
    .line 1462
    .line 1463
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1464
    .line 1465
    .line 1466
    const v17, 0x3e75c28f    # 0.24f

    .line 1467
    .line 1468
    .line 1469
    const v18, -0x4170a3d7    # -0.28f

    .line 1470
    .line 1471
    .line 1472
    const v13, 0x3da3d70a    # 0.08f

    .line 1473
    .line 1474
    .line 1475
    const v14, -0x4247ae14    # -0.09f

    .line 1476
    .line 1477
    .line 1478
    const v15, 0x3e23d70a    # 0.16f

    .line 1479
    .line 1480
    .line 1481
    const v16, -0x41c7ae14    # -0.18f

    .line 1482
    .line 1483
    .line 1484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1485
    .line 1486
    .line 1487
    const v0, 0x4031eb85    # 2.78f

    .line 1488
    .line 1489
    .line 1490
    const v2, 0x3f30a3d7    # 0.69f

    .line 1491
    .line 1492
    .line 1493
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1494
    .line 1495
    .line 1496
    const v0, 0x4011eb85    # 2.28f

    .line 1497
    .line 1498
    .line 1499
    const v2, 0x40833333    # 4.1f

    .line 1500
    .line 1501
    .line 1502
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1503
    .line 1504
    .line 1505
    const v17, 0x41a35c29    # 20.42f

    .line 1506
    .line 1507
    .line 1508
    const v18, 0x419f5c29    # 19.92f

    .line 1509
    .line 1510
    .line 1511
    const v13, 0x41a43d71    # 20.53f

    .line 1512
    .line 1513
    .line 1514
    const v14, 0x419d851f    # 19.69f

    .line 1515
    .line 1516
    .line 1517
    const v15, 0x41a4147b    # 20.51f

    .line 1518
    .line 1519
    .line 1520
    const v16, 0x419ea3d7    # 19.83f

    .line 1521
    .line 1522
    .line 1523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1524
    .line 1525
    .line 1526
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1527
    .line 1528
    .line 1529
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v2

    .line 1533
    const/16 v16, 0x3800

    .line 1534
    .line 1535
    const/16 v17, 0x0

    .line 1536
    .line 1537
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1538
    .line 1539
    const/4 v7, 0x0

    .line 1540
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1541
    .line 1542
    const/4 v13, 0x0

    .line 1543
    const/4 v14, 0x0

    .line 1544
    const/4 v15, 0x0

    .line 1545
    const-string v4, ""

    .line 1546
    .line 1547
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v0

    .line 1551
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v0

    .line 1555
    sput-object v0, Landroidx/compose/material/icons/twotone/WindPowerKt;->_windPower:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1556
    .line 1557
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1558
    .line 1559
    .line 1560
    return-object v0
.end method
