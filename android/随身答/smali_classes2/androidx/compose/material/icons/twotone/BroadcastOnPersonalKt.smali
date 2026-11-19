.class public final Landroidx/compose/material/icons/twotone/BroadcastOnPersonalKt;
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
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getBroadcastOnPersonal",
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
        "SMAP\nBroadcastOnPersonal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastOnPersonal.kt\nandroidx/compose/material/icons/twotone/BroadcastOnPersonalKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,98:1\n212#2,12:99\n233#2,18:112\n253#2:149\n233#2,18:150\n253#2:187\n233#2,18:188\n253#2:225\n233#2,18:226\n253#2:263\n233#2,18:264\n253#2:301\n174#3:111\n705#4,2:130\n717#4,2:132\n719#4,11:138\n705#4,2:168\n717#4,2:170\n719#4,11:176\n705#4,2:206\n717#4,2:208\n719#4,11:214\n705#4,2:244\n717#4,2:246\n719#4,11:252\n705#4,2:282\n717#4,2:284\n719#4,11:290\n72#5,4:134\n72#5,4:172\n72#5,4:210\n72#5,4:248\n72#5,4:286\n*S KotlinDebug\n*F\n+ 1 BroadcastOnPersonal.kt\nandroidx/compose/material/icons/twotone/BroadcastOnPersonalKt\n*L\n29#1:99,12\n30#1:112,18\n30#1:149\n40#1:150,18\n40#1:187\n54#1:188,18\n54#1:225\n65#1:226,18\n65#1:263\n79#1:264,18\n79#1:301\n29#1:111\n30#1:130,2\n30#1:132,2\n30#1:138,11\n40#1:168,2\n40#1:170,2\n40#1:176,11\n54#1:206,2\n54#1:208,2\n54#1:214,11\n65#1:244,2\n65#1:246,2\n65#1:252,11\n79#1:282,2\n79#1:284,2\n79#1:290,11\n30#1:134,4\n40#1:172,4\n54#1:210,4\n65#1:248,4\n79#1:286,4\n*E\n"
    }
.end annotation


# static fields
.field private static _broadcastOnPersonal:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBroadcastOnPersonal(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BroadcastOnPersonalKt;->_broadcastOnPersonal:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.BroadcastOnPersonal"

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
    const/high16 v4, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41100000    # 9.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v4, 0x40b2e148    # 5.59f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v25, 0x41100000    # 9.0f

    .line 89
    .line 90
    const/high16 v26, 0x41800000    # 16.0f

    .line 91
    .line 92
    const v21, 0x41135c29    # 9.21f

    .line 93
    .line 94
    .line 95
    const v22, 0x41908f5c    # 18.07f

    .line 96
    .line 97
    .line 98
    const/high16 v23, 0x41100000    # 9.0f

    .line 99
    .line 100
    const v24, 0x41887ae1    # 17.06f

    .line 101
    .line 102
    .line 103
    move-object/from16 v20, v2

    .line 104
    .line 105
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v25, 0x40a28f5c    # 5.08f

    .line 109
    .line 110
    .line 111
    const v26, -0x3f11eb85    # -7.44f

    .line 112
    .line 113
    .line 114
    const/16 v21, 0x0

    .line 115
    .line 116
    const v22, -0x3fa70a3d    # -3.39f

    .line 117
    .line 118
    .line 119
    const v23, 0x40070a3d    # 2.11f

    .line 120
    .line 121
    .line 122
    const v24, -0x3f375c29    # -6.27f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, 0x40b00000    # 5.5f

    .line 129
    .line 130
    const/high16 v6, 0x41200000    # 10.0f

    .line 131
    .line 132
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v4, 0x41200000    # 10.0f

    .line 136
    .line 137
    const/high16 v6, 0x40800000    # 4.0f

    .line 138
    .line 139
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    const/16 v16, 0x3800

    .line 150
    .line 151
    const/16 v17, 0x0

    .line 152
    .line 153
    const v6, 0x3e99999a    # 0.3f

    .line 154
    .line 155
    .line 156
    const v8, 0x3e99999a    # 0.3f

    .line 157
    .line 158
    .line 159
    const/4 v7, 0x0

    .line 160
    const/high16 v9, 0x3f800000    # 1.0f

    .line 161
    .line 162
    const/high16 v12, 0x3f800000    # 1.0f

    .line 163
    .line 164
    const/4 v13, 0x0

    .line 165
    const/4 v14, 0x0

    .line 166
    const/4 v15, 0x0

    .line 167
    const-string v4, ""

    .line 168
    .line 169
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 170
    .line 171
    .line 172
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 177
    .line 178
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 179
    .line 180
    .line 181
    move-result-wide v6

    .line 182
    const/4 v2, 0x0

    .line 183
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 191
    .line 192
    .line 193
    move-result v11

    .line 194
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 197
    .line 198
    .line 199
    const/high16 v4, 0x41980000    # 19.0f

    .line 200
    .line 201
    const/high16 v6, 0x40800000    # 4.0f

    .line 202
    .line 203
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 207
    .line 208
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v4, 0x40c00000    # 6.0f

    .line 212
    .line 213
    const/high16 v6, -0x3f700000    # -4.5f

    .line 214
    .line 215
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v4, 0x40828f5c    # 4.08f

    .line 219
    .line 220
    .line 221
    const v6, 0x4043d70a    # 3.06f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v25, 0x40270a3d    # 2.61f

    .line 228
    .line 229
    .line 230
    const v26, -0x40f5c28f    # -0.54f

    .line 231
    .line 232
    .line 233
    const v21, 0x3f4f5c29    # 0.81f

    .line 234
    .line 235
    .line 236
    const v22, -0x415c28f6    # -0.32f

    .line 237
    .line 238
    .line 239
    const v23, 0x3fd851ec    # 1.69f

    .line 240
    .line 241
    .line 242
    const v24, -0x40fd70a4    # -0.51f

    .line 243
    .line 244
    .line 245
    move-object/from16 v20, v2

    .line 246
    .line 247
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v4, 0x40400000    # 3.0f

    .line 251
    .line 252
    const/high16 v6, 0x41200000    # 10.0f

    .line 253
    .line 254
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v4, 0x40000000    # 2.0f

    .line 258
    .line 259
    const/high16 v6, 0x41100000    # 9.0f

    .line 260
    .line 261
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v4, 0x41400000    # 12.0f

    .line 265
    .line 266
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v4, 0x410c28f6    # 8.76f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v25, -0x406a3d71    # -1.17f

    .line 276
    .line 277
    .line 278
    const/high16 v26, -0x40000000    # -2.0f

    .line 279
    .line 280
    const v21, -0x410a3d71    # -0.48f

    .line 281
    .line 282
    .line 283
    const v22, -0x40e66666    # -0.6f

    .line 284
    .line 285
    .line 286
    const v23, -0x409eb852    # -0.88f

    .line 287
    .line 288
    .line 289
    const v24, -0x405d70a4    # -1.27f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v4, 0x40800000    # 4.0f

    .line 296
    .line 297
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    const/high16 v6, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const/high16 v8, 0x3f800000    # 1.0f

    .line 310
    .line 311
    const/4 v7, 0x0

    .line 312
    const-string v4, ""

    .line 313
    .line 314
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 315
    .line 316
    .line 317
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 322
    .line 323
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 324
    .line 325
    .line 326
    move-result-wide v6

    .line 327
    const/4 v2, 0x0

    .line 328
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 332
    .line 333
    .line 334
    move-result v10

    .line 335
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 336
    .line 337
    .line 338
    move-result v11

    .line 339
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 342
    .line 343
    .line 344
    const/high16 v4, 0x416c0000    # 14.75f

    .line 345
    .line 346
    const/high16 v6, 0x41880000    # 17.0f

    .line 347
    .line 348
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v25, -0x40600000    # -1.25f

    .line 352
    .line 353
    const/high16 v26, 0x3fa00000    # 1.25f

    .line 354
    .line 355
    const v21, -0x40cf5c29    # -0.69f

    .line 356
    .line 357
    .line 358
    const/16 v22, 0x0

    .line 359
    .line 360
    const/high16 v23, -0x40600000    # -1.25f

    .line 361
    .line 362
    const v24, 0x3f0f5c29    # 0.56f

    .line 363
    .line 364
    .line 365
    move-object/from16 v20, v2

    .line 366
    .line 367
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v25, 0x3f000000    # 0.5f

    .line 371
    .line 372
    const v26, 0x3f7851ec    # 0.97f

    .line 373
    .line 374
    .line 375
    const/16 v21, 0x0

    .line 376
    .line 377
    const v22, 0x3ecccccd    # 0.4f

    .line 378
    .line 379
    .line 380
    const v23, 0x3e4ccccd    # 0.2f

    .line 381
    .line 382
    .line 383
    const/high16 v24, 0x3f400000    # 0.75f

    .line 384
    .line 385
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v4, 0x41b00000    # 22.0f

    .line 389
    .line 390
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 394
    .line 395
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v4, -0x3f5f0a3d    # -5.03f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v26, -0x4087ae14    # -0.97f

    .line 405
    .line 406
    .line 407
    const v21, 0x3e99999a    # 0.3f

    .line 408
    .line 409
    .line 410
    const v22, -0x41947ae1    # -0.23f

    .line 411
    .line 412
    .line 413
    const/high16 v23, 0x3f000000    # 0.5f

    .line 414
    .line 415
    const v24, -0x40ee147b    # -0.57f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v25, 0x41880000    # 17.0f

    .line 422
    .line 423
    const/high16 v26, 0x416c0000    # 14.75f

    .line 424
    .line 425
    const/high16 v21, 0x41920000    # 18.25f

    .line 426
    .line 427
    const v22, 0x4174f5c3    # 15.31f

    .line 428
    .line 429
    .line 430
    const v23, 0x418d851f    # 17.69f

    .line 431
    .line 432
    .line 433
    const/high16 v24, 0x416c0000    # 14.75f

    .line 434
    .line 435
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    const/high16 v6, 0x3f800000    # 1.0f

    .line 446
    .line 447
    const/4 v7, 0x0

    .line 448
    const-string v4, ""

    .line 449
    .line 450
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 451
    .line 452
    .line 453
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 454
    .line 455
    .line 456
    move-result v3

    .line 457
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 458
    .line 459
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 460
    .line 461
    .line 462
    move-result-wide v6

    .line 463
    const/4 v2, 0x0

    .line 464
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 468
    .line 469
    .line 470
    move-result v10

    .line 471
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 472
    .line 473
    .line 474
    move-result v11

    .line 475
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 478
    .line 479
    .line 480
    const/high16 v4, 0x41400000    # 12.0f

    .line 481
    .line 482
    const/high16 v6, 0x41880000    # 17.0f

    .line 483
    .line 484
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v25, -0x3f800000    # -4.0f

    .line 488
    .line 489
    const/high16 v26, 0x40800000    # 4.0f

    .line 490
    .line 491
    const v21, -0x3ff28f5c    # -2.21f

    .line 492
    .line 493
    .line 494
    const/16 v22, 0x0

    .line 495
    .line 496
    const/high16 v23, -0x3f800000    # -4.0f

    .line 497
    .line 498
    const v24, 0x3fe51eb8    # 1.79f

    .line 499
    .line 500
    .line 501
    move-object/from16 v20, v2

    .line 502
    .line 503
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v25, 0x3f95c28f    # 1.17f

    .line 507
    .line 508
    .line 509
    const v26, 0x40351eb8    # 2.83f

    .line 510
    .line 511
    .line 512
    const/16 v21, 0x0

    .line 513
    .line 514
    const v22, 0x3f8ccccd    # 1.1f

    .line 515
    .line 516
    .line 517
    const v23, 0x3ee66666    # 0.45f

    .line 518
    .line 519
    .line 520
    const v24, 0x40066666    # 2.1f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v4, -0x407851ec    # -1.06f

    .line 527
    .line 528
    .line 529
    const v6, 0x3f87ae14    # 1.06f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v25, -0x40c51eb8    # -0.73f

    .line 536
    .line 537
    .line 538
    const v26, -0x401d70a4    # -1.77f

    .line 539
    .line 540
    .line 541
    const v21, -0x4119999a    # -0.45f

    .line 542
    .line 543
    .line 544
    const v22, -0x4119999a    # -0.45f

    .line 545
    .line 546
    .line 547
    const v23, -0x40c51eb8    # -0.73f

    .line 548
    .line 549
    .line 550
    const v24, -0x4075c28f    # -1.08f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v25, 0x40200000    # 2.5f

    .line 557
    .line 558
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 559
    .line 560
    const/16 v21, 0x0

    .line 561
    .line 562
    const v22, -0x404f5c29    # -1.38f

    .line 563
    .line 564
    .line 565
    const v23, 0x3f8f5c29    # 1.12f

    .line 566
    .line 567
    .line 568
    const/high16 v24, -0x3fe00000    # -2.5f

    .line 569
    .line 570
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v4, 0x3f8f5c29    # 1.12f

    .line 574
    .line 575
    .line 576
    const/high16 v6, 0x40200000    # 2.5f

    .line 577
    .line 578
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v25, -0x40c51eb8    # -0.73f

    .line 582
    .line 583
    .line 584
    const v26, 0x3fe147ae    # 1.76f

    .line 585
    .line 586
    .line 587
    const v22, 0x3f30a3d7    # 0.69f

    .line 588
    .line 589
    .line 590
    const v23, -0x4170a3d7    # -0.28f

    .line 591
    .line 592
    .line 593
    const v24, 0x3fa7ae14    # 1.31f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v4, 0x3f87ae14    # 1.06f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v25, 0x41a80000    # 21.0f

    .line 606
    .line 607
    const/high16 v26, 0x41800000    # 16.0f

    .line 608
    .line 609
    const v21, 0x41a46666    # 20.55f

    .line 610
    .line 611
    .line 612
    const v22, 0x4190cccd    # 18.1f

    .line 613
    .line 614
    .line 615
    const/high16 v23, 0x41a80000    # 21.0f

    .line 616
    .line 617
    const v24, 0x4188cccd    # 17.1f

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v25, 0x41880000    # 17.0f

    .line 624
    .line 625
    const/high16 v26, 0x41400000    # 12.0f

    .line 626
    .line 627
    const/high16 v21, 0x41a80000    # 21.0f

    .line 628
    .line 629
    const v22, 0x415ca3d7    # 13.79f

    .line 630
    .line 631
    .line 632
    const v23, 0x4199ae14    # 19.21f

    .line 633
    .line 634
    .line 635
    const/high16 v24, 0x41400000    # 12.0f

    .line 636
    .line 637
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    const/high16 v6, 0x3f800000    # 1.0f

    .line 648
    .line 649
    const/4 v7, 0x0

    .line 650
    const-string v4, ""

    .line 651
    .line 652
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 653
    .line 654
    .line 655
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 656
    .line 657
    .line 658
    move-result v3

    .line 659
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 660
    .line 661
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 662
    .line 663
    .line 664
    move-result-wide v6

    .line 665
    const/4 v0, 0x0

    .line 666
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 667
    .line 668
    .line 669
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 670
    .line 671
    .line 672
    move-result v10

    .line 673
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 674
    .line 675
    .line 676
    move-result v11

    .line 677
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 680
    .line 681
    .line 682
    const/high16 v0, 0x41180000    # 9.5f

    .line 683
    .line 684
    const/high16 v2, 0x41880000    # 17.0f

    .line 685
    .line 686
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/high16 v17, -0x3f300000    # -6.5f

    .line 690
    .line 691
    const/high16 v18, 0x40d00000    # 6.5f

    .line 692
    .line 693
    const v13, -0x3f9a3d71    # -3.59f

    .line 694
    .line 695
    .line 696
    const/high16 v15, -0x3f300000    # -6.5f

    .line 697
    .line 698
    const v16, 0x403a3d71    # 2.91f

    .line 699
    .line 700
    .line 701
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const v17, 0x3ff33333    # 1.9f

    .line 705
    .line 706
    .line 707
    const v18, 0x40933333    # 4.6f

    .line 708
    .line 709
    .line 710
    const/4 v13, 0x0

    .line 711
    const v14, 0x3fe51eb8    # 1.79f

    .line 712
    .line 713
    .line 714
    const v15, 0x3f3ae148    # 0.73f

    .line 715
    .line 716
    .line 717
    const v16, 0x405ae148    # 3.42f

    .line 718
    .line 719
    .line 720
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v0, -0x407851ec    # -1.06f

    .line 724
    .line 725
    .line 726
    const v2, 0x3f87ae14    # 1.06f

    .line 727
    .line 728
    .line 729
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v17, 0x41400000    # 12.0f

    .line 733
    .line 734
    const/high16 v18, 0x41800000    # 16.0f

    .line 735
    .line 736
    const v13, 0x4148f5c3    # 12.56f

    .line 737
    .line 738
    .line 739
    const v14, 0x41950a3d    # 18.63f

    .line 740
    .line 741
    .line 742
    const/high16 v15, 0x41400000    # 12.0f

    .line 743
    .line 744
    const v16, 0x418b0a3d    # 17.38f

    .line 745
    .line 746
    .line 747
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const/high16 v17, 0x40a00000    # 5.0f

    .line 751
    .line 752
    const/high16 v18, -0x3f600000    # -5.0f

    .line 753
    .line 754
    const/4 v13, 0x0

    .line 755
    const v14, -0x3fcf5c29    # -2.76f

    .line 756
    .line 757
    .line 758
    const v15, 0x400f5c29    # 2.24f

    .line 759
    .line 760
    .line 761
    const/high16 v16, -0x3f600000    # -5.0f

    .line 762
    .line 763
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const v0, 0x400f5c29    # 2.24f

    .line 767
    .line 768
    .line 769
    const/high16 v2, 0x40a00000    # 5.0f

    .line 770
    .line 771
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const v17, -0x40451eb8    # -1.46f

    .line 775
    .line 776
    .line 777
    const v18, 0x406147ae    # 3.52f

    .line 778
    .line 779
    .line 780
    const v14, 0x3faf5c29    # 1.37f

    .line 781
    .line 782
    .line 783
    const v15, -0x40f0a3d7    # -0.56f

    .line 784
    .line 785
    .line 786
    const v16, 0x4027ae14    # 2.62f

    .line 787
    .line 788
    .line 789
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    const v0, 0x3f88f5c3    # 1.07f

    .line 793
    .line 794
    .line 795
    const v2, 0x3f87ae14    # 1.06f

    .line 796
    .line 797
    .line 798
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const v17, 0x3ff1eb85    # 1.89f

    .line 802
    .line 803
    .line 804
    const v18, -0x3f6d70a4    # -4.58f

    .line 805
    .line 806
    .line 807
    const v13, 0x3f95c28f    # 1.17f

    .line 808
    .line 809
    .line 810
    const v14, -0x4068f5c3    # -1.18f

    .line 811
    .line 812
    .line 813
    const v15, 0x3ff1eb85    # 1.89f

    .line 814
    .line 815
    .line 816
    const v16, -0x3fcccccd    # -2.8f

    .line 817
    .line 818
    .line 819
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const/high16 v17, 0x41880000    # 17.0f

    .line 823
    .line 824
    const/high16 v18, 0x41180000    # 9.5f

    .line 825
    .line 826
    const/high16 v13, 0x41bc0000    # 23.5f

    .line 827
    .line 828
    const v14, 0x41468f5c    # 12.41f

    .line 829
    .line 830
    .line 831
    const v15, 0x41a4b852    # 20.59f

    .line 832
    .line 833
    .line 834
    const/high16 v16, 0x41180000    # 9.5f

    .line 835
    .line 836
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 843
    .line 844
    .line 845
    move-result-object v2

    .line 846
    const/16 v16, 0x3800

    .line 847
    .line 848
    const/16 v17, 0x0

    .line 849
    .line 850
    const/high16 v6, 0x3f800000    # 1.0f

    .line 851
    .line 852
    const/4 v7, 0x0

    .line 853
    const/high16 v12, 0x3f800000    # 1.0f

    .line 854
    .line 855
    const/4 v13, 0x0

    .line 856
    const/4 v14, 0x0

    .line 857
    const/4 v15, 0x0

    .line 858
    const-string v4, ""

    .line 859
    .line 860
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    sput-object v0, Landroidx/compose/material/icons/twotone/BroadcastOnPersonalKt;->_broadcastOnPersonal:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 869
    .line 870
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 871
    .line 872
    .line 873
    return-object v0
.end method
