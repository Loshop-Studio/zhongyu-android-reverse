.class public final Landroidx/compose/material/icons/twotone/Face2Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_face2",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Face2",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getFace2",
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
        "SMAP\nFace2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Face2.kt\nandroidx/compose/material/icons/twotone/Face2Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,162:1\n212#2,12:163\n233#2,18:176\n253#2:213\n233#2,18:214\n253#2:251\n233#2,18:252\n253#2:289\n233#2,18:290\n253#2:327\n233#2,18:328\n253#2:365\n233#2,18:366\n253#2:403\n233#2,18:404\n253#2:441\n233#2,18:442\n253#2:479\n233#2,18:480\n253#2:517\n174#3:175\n705#4,2:194\n717#4,2:196\n719#4,11:202\n705#4,2:232\n717#4,2:234\n719#4,11:240\n705#4,2:270\n717#4,2:272\n719#4,11:278\n705#4,2:308\n717#4,2:310\n719#4,11:316\n705#4,2:346\n717#4,2:348\n719#4,11:354\n705#4,2:384\n717#4,2:386\n719#4,11:392\n705#4,2:422\n717#4,2:424\n719#4,11:430\n705#4,2:460\n717#4,2:462\n719#4,11:468\n705#4,2:498\n717#4,2:500\n719#4,11:506\n72#5,4:198\n72#5,4:236\n72#5,4:274\n72#5,4:312\n72#5,4:350\n72#5,4:388\n72#5,4:426\n72#5,4:464\n72#5,4:502\n*S KotlinDebug\n*F\n+ 1 Face2.kt\nandroidx/compose/material/icons/twotone/Face2Kt\n*L\n29#1:163,12\n30#1:176,18\n30#1:213\n38#1:214,18\n38#1:251\n46#1:252,18\n46#1:289\n54#1:290,18\n54#1:327\n62#1:328,18\n62#1:365\n70#1:366,18\n70#1:403\n78#1:404,18\n78#1:441\n145#1:442,18\n145#1:479\n151#1:480,18\n151#1:517\n29#1:175\n30#1:194,2\n30#1:196,2\n30#1:202,11\n38#1:232,2\n38#1:234,2\n38#1:240,11\n46#1:270,2\n46#1:272,2\n46#1:278,11\n54#1:308,2\n54#1:310,2\n54#1:316,11\n62#1:346,2\n62#1:348,2\n62#1:354,11\n70#1:384,2\n70#1:386,2\n70#1:392,11\n78#1:422,2\n78#1:424,2\n78#1:430,11\n145#1:460,2\n145#1:462,2\n145#1:468,11\n151#1:498,2\n151#1:500,2\n151#1:506,11\n30#1:198,4\n38#1:236,4\n46#1:274,4\n54#1:312,4\n62#1:350,4\n70#1:388,4\n78#1:426,4\n145#1:464,4\n151#1:502,4\n*E\n"
    }
.end annotation


# static fields
.field private static _face2:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFace2(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Face2Kt;->_face2:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Face2"

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
    const v4, 0x40c0a3d7    # 6.02f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40a00000    # 5.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v25, 0x40c00000    # 6.0f

    .line 79
    .line 80
    const/high16 v26, 0x40a00000    # 5.0f

    .line 81
    .line 82
    const v21, 0x40c051ec    # 6.01f

    .line 83
    .line 84
    .line 85
    const/high16 v22, 0x40a00000    # 5.0f

    .line 86
    .line 87
    const v23, 0x40c051ec    # 6.01f

    .line 88
    .line 89
    .line 90
    const/high16 v24, 0x40a00000    # 5.0f

    .line 91
    .line 92
    move-object/from16 v20, v2

    .line 93
    .line 94
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v25, 0x40000000    # 2.0f

    .line 98
    .line 99
    const/high16 v26, 0x41100000    # 9.0f

    .line 100
    .line 101
    const v21, 0x40728f5c    # 3.79f

    .line 102
    .line 103
    .line 104
    const/high16 v23, 0x40000000    # 2.0f

    .line 105
    .line 106
    const v24, 0x40d947ae    # 6.79f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v25, 0x3ea3d70a    # 0.32f

    .line 113
    .line 114
    .line 115
    const v26, 0x3fc51eb8    # 1.54f

    .line 116
    .line 117
    .line 118
    const/16 v21, 0x0

    .line 119
    .line 120
    const v22, 0x3f0ccccd    # 0.55f

    .line 121
    .line 122
    .line 123
    const v23, 0x3df5c28f    # 0.12f

    .line 124
    .line 125
    .line 126
    const v24, 0x3f88f5c3    # 1.07f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v25, 0x40c0a3d7    # 6.02f

    .line 133
    .line 134
    .line 135
    const/high16 v26, 0x40a00000    # 5.0f

    .line 136
    .line 137
    const v21, 0x4038f5c3    # 2.89f

    .line 138
    .line 139
    .line 140
    const v22, 0x4104a3d7    # 8.29f

    .line 141
    .line 142
    .line 143
    const v23, 0x40870a3d    # 4.22f

    .line 144
    .line 145
    .line 146
    const v24, 0x40cb3333    # 6.35f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    const/16 v16, 0x3800

    .line 160
    .line 161
    const/16 v17, 0x0

    .line 162
    .line 163
    const v6, 0x3e99999a    # 0.3f

    .line 164
    .line 165
    .line 166
    const v8, 0x3e99999a    # 0.3f

    .line 167
    .line 168
    .line 169
    const/4 v7, 0x0

    .line 170
    const/high16 v9, 0x3f800000    # 1.0f

    .line 171
    .line 172
    const/high16 v12, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const/4 v13, 0x0

    .line 175
    const/4 v14, 0x0

    .line 176
    const/4 v15, 0x0

    .line 177
    const-string v4, ""

    .line 178
    .line 179
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 180
    .line 181
    .line 182
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 187
    .line 188
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 189
    .line 190
    .line 191
    move-result-wide v6

    .line 192
    const/4 v2, 0x0

    .line 193
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 197
    .line 198
    .line 199
    move-result v10

    .line 200
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 201
    .line 202
    .line 203
    move-result v11

    .line 204
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 207
    .line 208
    .line 209
    const v4, 0x4171999a    # 15.1f

    .line 210
    .line 211
    .line 212
    const/high16 v6, 0x40600000    # 3.5f

    .line 213
    .line 214
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v25, 0x41400000    # 12.0f

    .line 218
    .line 219
    const/high16 v26, 0x40000000    # 2.0f

    .line 220
    .line 221
    const v21, 0x4165c28f    # 14.36f

    .line 222
    .line 223
    .line 224
    const v22, 0x4025c28f    # 2.59f

    .line 225
    .line 226
    .line 227
    const/high16 v23, 0x41540000    # 13.25f

    .line 228
    .line 229
    const/high16 v24, 0x40000000    # 2.0f

    .line 230
    .line 231
    move-object/from16 v20, v2

    .line 232
    .line 233
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v4, 0x411a3d71    # 9.64f

    .line 237
    .line 238
    .line 239
    const v6, 0x4025c28f    # 2.59f

    .line 240
    .line 241
    .line 242
    const v7, 0x410e6666    # 8.9f

    .line 243
    .line 244
    .line 245
    const/high16 v8, 0x40600000    # 3.5f

    .line 246
    .line 247
    invoke-virtual {v2, v4, v6, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v26, 0x40400000    # 3.0f

    .line 251
    .line 252
    const v21, 0x411e147b    # 9.88f

    .line 253
    .line 254
    .line 255
    const v22, 0x404b851f    # 3.18f

    .line 256
    .line 257
    .line 258
    const v23, 0x412eb852    # 10.92f

    .line 259
    .line 260
    .line 261
    const/high16 v24, 0x40400000    # 3.0f

    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v4, 0x4161eb85    # 14.12f

    .line 267
    .line 268
    .line 269
    const v6, 0x404b851f    # 3.18f

    .line 270
    .line 271
    .line 272
    const v7, 0x4171999a    # 15.1f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v4, v6, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    const v6, 0x3e99999a    # 0.3f

    .line 286
    .line 287
    .line 288
    const v8, 0x3e99999a    # 0.3f

    .line 289
    .line 290
    .line 291
    const/4 v7, 0x0

    .line 292
    const-string v4, ""

    .line 293
    .line 294
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 295
    .line 296
    .line 297
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 302
    .line 303
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 304
    .line 305
    .line 306
    move-result-wide v6

    .line 307
    const/4 v2, 0x0

    .line 308
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 312
    .line 313
    .line 314
    move-result v10

    .line 315
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 316
    .line 317
    .line 318
    move-result v11

    .line 319
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 322
    .line 323
    .line 324
    const v4, 0x40a9eb85    # 5.31f

    .line 325
    .line 326
    .line 327
    const/high16 v6, 0x41400000    # 12.0f

    .line 328
    .line 329
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v25, 0x4081eb85    # 4.06f

    .line 333
    .line 334
    .line 335
    const v26, 0x4081eb85    # 4.06f

    .line 336
    .line 337
    .line 338
    const/16 v21, 0x0

    .line 339
    .line 340
    const v22, 0x400f5c29    # 2.24f

    .line 341
    .line 342
    .line 343
    const v23, 0x3fe8f5c3    # 1.82f

    .line 344
    .line 345
    .line 346
    const v24, 0x4081eb85    # 4.06f

    .line 347
    .line 348
    .line 349
    move-object/from16 v20, v2

    .line 350
    .line 351
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v25, 0x4021eb85    # 2.53f

    .line 355
    .line 356
    .line 357
    const v26, -0x409c28f6    # -0.89f

    .line 358
    .line 359
    .line 360
    const v21, 0x3f6e147b    # 0.93f

    .line 361
    .line 362
    .line 363
    const/16 v22, 0x0

    .line 364
    .line 365
    const v24, -0x415c28f6    # -0.32f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v25, 0x41407ae1    # 12.03f

    .line 372
    .line 373
    .line 374
    const/high16 v26, 0x40a00000    # 5.0f

    .line 375
    .line 376
    const v21, 0x418947ae    # 17.16f

    .line 377
    .line 378
    .line 379
    const v22, 0x40cc7ae1    # 6.39f

    .line 380
    .line 381
    .line 382
    const/high16 v23, 0x416c0000    # 14.75f

    .line 383
    .line 384
    const v24, 0x40a051ec    # 5.01f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v25, 0x41400000    # 12.0f

    .line 391
    .line 392
    const v26, 0x40a9eb85    # 5.31f

    .line 393
    .line 394
    .line 395
    const v21, 0x414051ec    # 12.02f

    .line 396
    .line 397
    .line 398
    const v22, 0x40a3851f    # 5.11f

    .line 399
    .line 400
    .line 401
    const/high16 v23, 0x41400000    # 12.0f

    .line 402
    .line 403
    const v24, 0x40a6b852    # 5.21f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    const v6, 0x3e99999a    # 0.3f

    .line 417
    .line 418
    .line 419
    const/4 v7, 0x0

    .line 420
    const-string v4, ""

    .line 421
    .line 422
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 423
    .line 424
    .line 425
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 430
    .line 431
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 432
    .line 433
    .line 434
    move-result-wide v6

    .line 435
    const/4 v2, 0x0

    .line 436
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 440
    .line 441
    .line 442
    move-result v10

    .line 443
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 444
    .line 445
    .line 446
    move-result v11

    .line 447
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 450
    .line 451
    .line 452
    const/high16 v4, 0x40200000    # 2.5f

    .line 453
    .line 454
    const v6, 0x4180f5c3    # 16.12f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v25, 0x40000000    # 2.0f

    .line 461
    .line 462
    const/high16 v26, 0x41900000    # 18.0f

    .line 463
    .line 464
    const v21, 0x400c28f6    # 2.19f

    .line 465
    .line 466
    .line 467
    const v22, 0x418570a4    # 16.68f

    .line 468
    .line 469
    .line 470
    const/high16 v23, 0x40000000    # 2.0f

    .line 471
    .line 472
    const v24, 0x418a7ae1    # 17.31f

    .line 473
    .line 474
    .line 475
    move-object/from16 v20, v2

    .line 476
    .line 477
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v25, 0x40800000    # 4.0f

    .line 481
    .line 482
    const/high16 v26, 0x40800000    # 4.0f

    .line 483
    .line 484
    const/16 v21, 0x0

    .line 485
    .line 486
    const v22, 0x400d70a4    # 2.21f

    .line 487
    .line 488
    .line 489
    const v23, 0x3fe51eb8    # 1.79f

    .line 490
    .line 491
    .line 492
    const/high16 v24, 0x40800000    # 4.0f

    .line 493
    .line 494
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v25, 0x3fa00000    # 1.25f

    .line 498
    .line 499
    const v26, -0x41b33333    # -0.2f

    .line 500
    .line 501
    .line 502
    const v21, 0x3ee147ae    # 0.44f

    .line 503
    .line 504
    .line 505
    const/16 v22, 0x0

    .line 506
    .line 507
    const v23, 0x3f59999a    # 0.85f

    .line 508
    .line 509
    .line 510
    const v24, -0x4270a3d7    # -0.07f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v25, 0x40200000    # 2.5f

    .line 517
    .line 518
    const v26, 0x4180f5c3    # 16.12f

    .line 519
    .line 520
    .line 521
    const v21, 0x40a0a3d7    # 5.02f

    .line 522
    .line 523
    .line 524
    const v22, 0x41a4b852    # 20.59f

    .line 525
    .line 526
    .line 527
    const v23, 0x4053d70a    # 3.31f

    .line 528
    .line 529
    .line 530
    const v24, 0x41947ae1    # 18.56f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    const v6, 0x3e99999a    # 0.3f

    .line 544
    .line 545
    .line 546
    const/4 v7, 0x0

    .line 547
    const-string v4, ""

    .line 548
    .line 549
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 550
    .line 551
    .line 552
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 553
    .line 554
    .line 555
    move-result v3

    .line 556
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 557
    .line 558
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 559
    .line 560
    .line 561
    move-result-wide v6

    .line 562
    const/4 v2, 0x0

    .line 563
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 567
    .line 568
    .line 569
    move-result v10

    .line 570
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 571
    .line 572
    .line 573
    move-result v11

    .line 574
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 577
    .line 578
    .line 579
    const v4, 0x41ad70a4    # 21.68f

    .line 580
    .line 581
    .line 582
    const v6, 0x4128a3d7    # 10.54f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v25, 0x41b00000    # 22.0f

    .line 589
    .line 590
    const/high16 v26, 0x41100000    # 9.0f

    .line 591
    .line 592
    const v21, 0x41af0a3d    # 21.88f

    .line 593
    .line 594
    .line 595
    const v22, 0x41211eb8    # 10.07f

    .line 596
    .line 597
    .line 598
    const/high16 v23, 0x41b00000    # 22.0f

    .line 599
    .line 600
    const v24, 0x4118cccd    # 9.55f

    .line 601
    .line 602
    .line 603
    move-object/from16 v20, v2

    .line 604
    .line 605
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v25, -0x3f800000    # -4.0f

    .line 609
    .line 610
    const/high16 v26, -0x3f800000    # -4.0f

    .line 611
    .line 612
    const/16 v21, 0x0

    .line 613
    .line 614
    const v22, -0x3ff28f5c    # -2.21f

    .line 615
    .line 616
    .line 617
    const v23, -0x401ae148    # -1.79f

    .line 618
    .line 619
    .line 620
    const/high16 v24, -0x3f800000    # -4.0f

    .line 621
    .line 622
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v25, -0x435c28f6    # -0.02f

    .line 626
    .line 627
    .line 628
    const/16 v26, 0x0

    .line 629
    .line 630
    const v21, -0x43dc28f6    # -0.01f

    .line 631
    .line 632
    .line 633
    const/16 v22, 0x0

    .line 634
    .line 635
    const v23, -0x43dc28f6    # -0.01f

    .line 636
    .line 637
    .line 638
    const/16 v24, 0x0

    .line 639
    .line 640
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v25, 0x41ad70a4    # 21.68f

    .line 644
    .line 645
    .line 646
    const v26, 0x4128a3d7    # 10.54f

    .line 647
    .line 648
    .line 649
    const v21, 0x419e3d71    # 19.78f

    .line 650
    .line 651
    .line 652
    const v22, 0x40cb3333    # 6.35f

    .line 653
    .line 654
    .line 655
    const v23, 0x41a8e148    # 21.11f

    .line 656
    .line 657
    .line 658
    const v24, 0x4104a3d7    # 8.29f

    .line 659
    .line 660
    .line 661
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    const v6, 0x3e99999a    # 0.3f

    .line 672
    .line 673
    .line 674
    const/4 v7, 0x0

    .line 675
    const-string v4, ""

    .line 676
    .line 677
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 678
    .line 679
    .line 680
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 681
    .line 682
    .line 683
    move-result v3

    .line 684
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 685
    .line 686
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 687
    .line 688
    .line 689
    move-result-wide v6

    .line 690
    const/4 v2, 0x0

    .line 691
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 692
    .line 693
    .line 694
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 695
    .line 696
    .line 697
    move-result v10

    .line 698
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 699
    .line 700
    .line 701
    move-result v11

    .line 702
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 705
    .line 706
    .line 707
    const/high16 v4, 0x41860000    # 16.75f

    .line 708
    .line 709
    const v6, 0x41ae6666    # 21.8f

    .line 710
    .line 711
    .line 712
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const/high16 v25, 0x41900000    # 18.0f

    .line 716
    .line 717
    const/high16 v26, 0x41b00000    # 22.0f

    .line 718
    .line 719
    const v21, 0x41893333    # 17.15f

    .line 720
    .line 721
    .line 722
    const v22, 0x41af70a4    # 21.93f

    .line 723
    .line 724
    .line 725
    const v23, 0x418c7ae1    # 17.56f

    .line 726
    .line 727
    .line 728
    const/high16 v24, 0x41b00000    # 22.0f

    .line 729
    .line 730
    move-object/from16 v20, v2

    .line 731
    .line 732
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const/high16 v25, 0x40800000    # 4.0f

    .line 736
    .line 737
    const/high16 v26, -0x3f800000    # -4.0f

    .line 738
    .line 739
    const v21, 0x400d70a4    # 2.21f

    .line 740
    .line 741
    .line 742
    const/16 v22, 0x0

    .line 743
    .line 744
    const/high16 v23, 0x40800000    # 4.0f

    .line 745
    .line 746
    const v24, -0x401ae148    # -1.79f

    .line 747
    .line 748
    .line 749
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const/high16 v25, -0x41000000    # -0.5f

    .line 753
    .line 754
    const v26, -0x400f5c29    # -1.88f

    .line 755
    .line 756
    .line 757
    const/16 v21, 0x0

    .line 758
    .line 759
    const v22, -0x40cf5c29    # -0.69f

    .line 760
    .line 761
    .line 762
    const v23, -0x41bd70a4    # -0.19f

    .line 763
    .line 764
    .line 765
    const v24, -0x40570a3d    # -1.32f

    .line 766
    .line 767
    .line 768
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const/high16 v25, 0x41860000    # 16.75f

    .line 772
    .line 773
    const v26, 0x41ae6666    # 21.8f

    .line 774
    .line 775
    .line 776
    const v21, 0x41a5851f    # 20.69f

    .line 777
    .line 778
    .line 779
    const v22, 0x41947ae1    # 18.56f

    .line 780
    .line 781
    .line 782
    const v23, 0x4197d70a    # 18.98f

    .line 783
    .line 784
    .line 785
    const v24, 0x41a4b852    # 20.59f

    .line 786
    .line 787
    .line 788
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 795
    .line 796
    .line 797
    move-result-object v2

    .line 798
    const v6, 0x3e99999a    # 0.3f

    .line 799
    .line 800
    .line 801
    const/4 v7, 0x0

    .line 802
    const-string v4, ""

    .line 803
    .line 804
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 805
    .line 806
    .line 807
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 808
    .line 809
    .line 810
    move-result v3

    .line 811
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 812
    .line 813
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 814
    .line 815
    .line 816
    move-result-wide v6

    .line 817
    const/4 v2, 0x0

    .line 818
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 819
    .line 820
    .line 821
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 822
    .line 823
    .line 824
    move-result v10

    .line 825
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 826
    .line 827
    .line 828
    move-result v11

    .line 829
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 832
    .line 833
    .line 834
    const v4, 0x41afc28f    # 21.97f

    .line 835
    .line 836
    .line 837
    const v6, 0x415851ec    # 13.52f

    .line 838
    .line 839
    .line 840
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const/16 v25, 0x0

    .line 844
    .line 845
    const v26, -0x42dc28f6    # -0.04f

    .line 846
    .line 847
    .line 848
    const/16 v21, 0x0

    .line 849
    .line 850
    const v22, -0x43dc28f6    # -0.01f

    .line 851
    .line 852
    .line 853
    const/16 v23, 0x0

    .line 854
    .line 855
    const v24, -0x435c28f6    # -0.02f

    .line 856
    .line 857
    .line 858
    move-object/from16 v20, v2

    .line 859
    .line 860
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const/high16 v25, 0x41c00000    # 24.0f

    .line 864
    .line 865
    const/high16 v26, 0x41100000    # 9.0f

    .line 866
    .line 867
    const v21, 0x41b9ae14    # 23.21f

    .line 868
    .line 869
    .line 870
    const v22, 0x4146147b    # 12.38f

    .line 871
    .line 872
    .line 873
    const/high16 v23, 0x41c00000    # 24.0f

    .line 874
    .line 875
    const v24, 0x412c7ae1    # 10.78f

    .line 876
    .line 877
    .line 878
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    const/high16 v25, -0x3f400000    # -6.0f

    .line 882
    .line 883
    const/high16 v26, -0x3f400000    # -6.0f

    .line 884
    .line 885
    const/16 v21, 0x0

    .line 886
    .line 887
    const v22, -0x3fac28f6    # -3.31f

    .line 888
    .line 889
    .line 890
    const v23, -0x3fd3d70a    # -2.69f

    .line 891
    .line 892
    .line 893
    const/high16 v24, -0x3f400000    # -6.0f

    .line 894
    .line 895
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 896
    .line 897
    .line 898
    const v25, -0x40b851ec    # -0.78f

    .line 899
    .line 900
    .line 901
    const v26, 0x3d75c28f    # 0.06f

    .line 902
    .line 903
    .line 904
    const v21, -0x417ae148    # -0.26f

    .line 905
    .line 906
    .line 907
    const/16 v22, 0x0

    .line 908
    .line 909
    const v23, -0x40fae148    # -0.52f

    .line 910
    .line 911
    .line 912
    const v24, 0x3ca3d70a    # 0.02f

    .line 913
    .line 914
    .line 915
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 916
    .line 917
    .line 918
    const/high16 v25, 0x41400000    # 12.0f

    .line 919
    .line 920
    const/16 v26, 0x0

    .line 921
    .line 922
    const v21, 0x4181851f    # 16.19f

    .line 923
    .line 924
    .line 925
    const v22, 0x3f9d70a4    # 1.23f

    .line 926
    .line 927
    .line 928
    const v23, 0x4163d70a    # 14.24f

    .line 929
    .line 930
    .line 931
    const/16 v24, 0x0

    .line 932
    .line 933
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const v4, 0x40d8f5c3    # 6.78f

    .line 937
    .line 938
    .line 939
    const v6, 0x4043d70a    # 3.06f

    .line 940
    .line 941
    .line 942
    const v7, 0x40f9eb85    # 7.81f

    .line 943
    .line 944
    .line 945
    const v8, 0x3f9d70a4    # 1.23f

    .line 946
    .line 947
    .line 948
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const/high16 v25, 0x40c00000    # 6.0f

    .line 952
    .line 953
    const/high16 v26, 0x40400000    # 3.0f

    .line 954
    .line 955
    const v21, 0x40d0a3d7    # 6.52f

    .line 956
    .line 957
    .line 958
    const v22, 0x404147ae    # 3.02f

    .line 959
    .line 960
    .line 961
    const v23, 0x40c851ec    # 6.26f

    .line 962
    .line 963
    .line 964
    const/high16 v24, 0x40400000    # 3.0f

    .line 965
    .line 966
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 967
    .line 968
    .line 969
    const/16 v25, 0x0

    .line 970
    .line 971
    const/high16 v26, 0x41100000    # 9.0f

    .line 972
    .line 973
    const v21, 0x402c28f6    # 2.69f

    .line 974
    .line 975
    .line 976
    const/high16 v22, 0x40400000    # 3.0f

    .line 977
    .line 978
    const/16 v23, 0x0

    .line 979
    .line 980
    const v24, 0x40b6147b    # 5.69f

    .line 981
    .line 982
    .line 983
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 984
    .line 985
    .line 986
    const v25, 0x400147ae    # 2.02f

    .line 987
    .line 988
    .line 989
    const v26, 0x408f5c29    # 4.48f

    .line 990
    .line 991
    .line 992
    const/16 v21, 0x0

    .line 993
    .line 994
    const v22, 0x3fe3d70a    # 1.78f

    .line 995
    .line 996
    .line 997
    const v23, 0x3f4a3d71    # 0.79f

    .line 998
    .line 999
    .line 1000
    const v24, 0x405851ec    # 3.38f

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1004
    .line 1005
    .line 1006
    const/16 v25, 0x0

    .line 1007
    .line 1008
    const v26, 0x3d23d70a    # 0.04f

    .line 1009
    .line 1010
    .line 1011
    const v22, 0x3c23d70a    # 0.01f

    .line 1012
    .line 1013
    .line 1014
    const/16 v23, 0x0

    .line 1015
    .line 1016
    const v24, 0x3ca3d70a    # 0.02f

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1020
    .line 1021
    .line 1022
    const/high16 v26, 0x41900000    # 18.0f

    .line 1023
    .line 1024
    const v21, 0x3f4a3d71    # 0.79f

    .line 1025
    .line 1026
    .line 1027
    const v22, 0x4169eb85    # 14.62f

    .line 1028
    .line 1029
    .line 1030
    const v24, 0x4181c28f    # 16.22f

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1034
    .line 1035
    .line 1036
    const/high16 v25, 0x40c00000    # 6.0f

    .line 1037
    .line 1038
    const/high16 v26, 0x40c00000    # 6.0f

    .line 1039
    .line 1040
    const/16 v21, 0x0

    .line 1041
    .line 1042
    const v22, 0x4053d70a    # 3.31f

    .line 1043
    .line 1044
    .line 1045
    const v23, 0x402c28f6    # 2.69f

    .line 1046
    .line 1047
    .line 1048
    const/high16 v24, 0x40c00000    # 6.0f

    .line 1049
    .line 1050
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1051
    .line 1052
    .line 1053
    const v25, 0x406c28f6    # 3.69f

    .line 1054
    .line 1055
    .line 1056
    const v26, -0x405c28f6    # -1.28f

    .line 1057
    .line 1058
    .line 1059
    const v21, 0x3fb1eb85    # 1.39f

    .line 1060
    .line 1061
    .line 1062
    const/16 v22, 0x0

    .line 1063
    .line 1064
    const v23, 0x402ae148    # 2.67f

    .line 1065
    .line 1066
    .line 1067
    const v24, -0x410a3d71    # -0.48f

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1071
    .line 1072
    .line 1073
    const/high16 v25, 0x41400000    # 12.0f

    .line 1074
    .line 1075
    const/high16 v26, 0x41b80000    # 23.0f

    .line 1076
    .line 1077
    const v21, 0x4126e148    # 10.43f

    .line 1078
    .line 1079
    .line 1080
    const v22, 0x41b73333    # 22.9f

    .line 1081
    .line 1082
    .line 1083
    const v23, 0x41333333    # 11.2f

    .line 1084
    .line 1085
    .line 1086
    const/high16 v24, 0x41b80000    # 23.0f

    .line 1087
    .line 1088
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1089
    .line 1090
    .line 1091
    const v4, 0x4013d70a    # 2.31f

    .line 1092
    .line 1093
    .line 1094
    const v6, -0x4170a3d7    # -0.28f

    .line 1095
    .line 1096
    .line 1097
    const v7, 0x3fc8f5c3    # 1.57f

    .line 1098
    .line 1099
    .line 1100
    const v8, -0x42333333    # -0.1f

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1104
    .line 1105
    .line 1106
    const/high16 v25, 0x41900000    # 18.0f

    .line 1107
    .line 1108
    const/high16 v26, 0x41c00000    # 24.0f

    .line 1109
    .line 1110
    const v21, 0x417547ae    # 15.33f

    .line 1111
    .line 1112
    .line 1113
    const v22, 0x41bc28f6    # 23.52f

    .line 1114
    .line 1115
    .line 1116
    const v23, 0x4184e148    # 16.61f

    .line 1117
    .line 1118
    .line 1119
    const/high16 v24, 0x41c00000    # 24.0f

    .line 1120
    .line 1121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1122
    .line 1123
    .line 1124
    const/high16 v25, 0x40c00000    # 6.0f

    .line 1125
    .line 1126
    const/high16 v26, -0x3f400000    # -6.0f

    .line 1127
    .line 1128
    const v21, 0x4053d70a    # 3.31f

    .line 1129
    .line 1130
    .line 1131
    const/16 v22, 0x0

    .line 1132
    .line 1133
    const/high16 v23, 0x40c00000    # 6.0f

    .line 1134
    .line 1135
    const v24, -0x3fd3d70a    # -2.69f

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1139
    .line 1140
    .line 1141
    const v25, 0x41afc28f    # 21.97f

    .line 1142
    .line 1143
    .line 1144
    const v26, 0x415851ec    # 13.52f

    .line 1145
    .line 1146
    .line 1147
    const/high16 v21, 0x41c00000    # 24.0f

    .line 1148
    .line 1149
    const v22, 0x4181c28f    # 16.22f

    .line 1150
    .line 1151
    .line 1152
    const v23, 0x41b9ae14    # 23.21f

    .line 1153
    .line 1154
    .line 1155
    const v24, 0x4169eb85    # 14.62f

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1162
    .line 1163
    .line 1164
    const/high16 v4, 0x41900000    # 18.0f

    .line 1165
    .line 1166
    const/high16 v6, 0x40a00000    # 5.0f

    .line 1167
    .line 1168
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1169
    .line 1170
    .line 1171
    const/high16 v25, 0x40800000    # 4.0f

    .line 1172
    .line 1173
    const/high16 v26, 0x40800000    # 4.0f

    .line 1174
    .line 1175
    const v21, 0x400d70a4    # 2.21f

    .line 1176
    .line 1177
    .line 1178
    const/16 v22, 0x0

    .line 1179
    .line 1180
    const/high16 v23, 0x40800000    # 4.0f

    .line 1181
    .line 1182
    const v24, 0x3fe51eb8    # 1.79f

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1186
    .line 1187
    .line 1188
    const v25, -0x415c28f6    # -0.32f

    .line 1189
    .line 1190
    .line 1191
    const v26, 0x3fc51eb8    # 1.54f

    .line 1192
    .line 1193
    .line 1194
    const/16 v21, 0x0

    .line 1195
    .line 1196
    const v22, 0x3f0ccccd    # 0.55f

    .line 1197
    .line 1198
    .line 1199
    const v23, -0x420a3d71    # -0.12f

    .line 1200
    .line 1201
    .line 1202
    const v24, 0x3f88f5c3    # 1.07f

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1206
    .line 1207
    .line 1208
    const v25, -0x3f933333    # -3.7f

    .line 1209
    .line 1210
    .line 1211
    const v26, -0x3f4eb852    # -5.54f

    .line 1212
    .line 1213
    .line 1214
    const v21, -0x40ee147b    # -0.57f

    .line 1215
    .line 1216
    .line 1217
    const/high16 v22, -0x3ff00000    # -2.25f

    .line 1218
    .line 1219
    const v23, -0x400ccccd    # -1.9f

    .line 1220
    .line 1221
    .line 1222
    const v24, -0x3f79eb85    # -4.19f

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1226
    .line 1227
    .line 1228
    const/high16 v25, 0x41900000    # 18.0f

    .line 1229
    .line 1230
    const/high16 v26, 0x40a00000    # 5.0f

    .line 1231
    .line 1232
    const v21, 0x418feb85    # 17.99f

    .line 1233
    .line 1234
    .line 1235
    const/high16 v22, 0x40a00000    # 5.0f

    .line 1236
    .line 1237
    const v23, 0x418feb85    # 17.99f

    .line 1238
    .line 1239
    .line 1240
    const/high16 v24, 0x40a00000    # 5.0f

    .line 1241
    .line 1242
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1246
    .line 1247
    .line 1248
    const v4, 0x4194cccd    # 18.6f

    .line 1249
    .line 1250
    .line 1251
    const v6, 0x4107ae14    # 8.48f

    .line 1252
    .line 1253
    .line 1254
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1255
    .line 1256
    .line 1257
    const v25, -0x3fde147b    # -2.53f

    .line 1258
    .line 1259
    .line 1260
    const v26, 0x3f63d70a    # 0.89f

    .line 1261
    .line 1262
    .line 1263
    const v21, -0x40ca3d71    # -0.71f

    .line 1264
    .line 1265
    .line 1266
    const v22, 0x3f11eb85    # 0.57f

    .line 1267
    .line 1268
    .line 1269
    const v23, -0x40333333    # -1.6f

    .line 1270
    .line 1271
    .line 1272
    const v24, 0x3f63d70a    # 0.89f

    .line 1273
    .line 1274
    .line 1275
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1276
    .line 1277
    .line 1278
    const/high16 v25, 0x41400000    # 12.0f

    .line 1279
    .line 1280
    const v26, 0x40a9eb85    # 5.31f

    .line 1281
    .line 1282
    .line 1283
    const v21, 0x415d1eb8    # 13.82f

    .line 1284
    .line 1285
    .line 1286
    const v22, 0x4116147b    # 9.38f

    .line 1287
    .line 1288
    .line 1289
    const/high16 v23, 0x41400000    # 12.0f

    .line 1290
    .line 1291
    const v24, 0x40f1999a    # 7.55f

    .line 1292
    .line 1293
    .line 1294
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1295
    .line 1296
    .line 1297
    const v25, 0x3cf5c28f    # 0.03f

    .line 1298
    .line 1299
    .line 1300
    const v26, -0x416147ae    # -0.31f

    .line 1301
    .line 1302
    .line 1303
    const/16 v21, 0x0

    .line 1304
    .line 1305
    const v22, -0x42333333    # -0.1f

    .line 1306
    .line 1307
    .line 1308
    const v23, 0x3ca3d70a    # 0.02f

    .line 1309
    .line 1310
    .line 1311
    const v24, -0x41a8f5c3    # -0.21f

    .line 1312
    .line 1313
    .line 1314
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1315
    .line 1316
    .line 1317
    const v25, 0x4194cccd    # 18.6f

    .line 1318
    .line 1319
    .line 1320
    const v26, 0x4107ae14    # 8.48f

    .line 1321
    .line 1322
    .line 1323
    const/high16 v21, 0x416c0000    # 14.75f

    .line 1324
    .line 1325
    const v22, 0x40a051ec    # 5.01f

    .line 1326
    .line 1327
    .line 1328
    const v23, 0x418947ae    # 17.16f

    .line 1329
    .line 1330
    .line 1331
    const v24, 0x40cc7ae1    # 6.39f

    .line 1332
    .line 1333
    .line 1334
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1335
    .line 1336
    .line 1337
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1338
    .line 1339
    .line 1340
    const/high16 v4, 0x40000000    # 2.0f

    .line 1341
    .line 1342
    const/high16 v6, 0x41400000    # 12.0f

    .line 1343
    .line 1344
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1345
    .line 1346
    .line 1347
    const v25, 0x40466666    # 3.1f

    .line 1348
    .line 1349
    .line 1350
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 1351
    .line 1352
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 1353
    .line 1354
    const/16 v22, 0x0

    .line 1355
    .line 1356
    const v23, 0x40170a3d    # 2.36f

    .line 1357
    .line 1358
    .line 1359
    const v24, 0x3f170a3d    # 0.59f

    .line 1360
    .line 1361
    .line 1362
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1363
    .line 1364
    .line 1365
    const/high16 v25, 0x41400000    # 12.0f

    .line 1366
    .line 1367
    const/high16 v26, 0x40400000    # 3.0f

    .line 1368
    .line 1369
    const v21, 0x4161eb85    # 14.12f

    .line 1370
    .line 1371
    .line 1372
    const v22, 0x404b851f    # 3.18f

    .line 1373
    .line 1374
    .line 1375
    const v23, 0x415147ae    # 13.08f

    .line 1376
    .line 1377
    .line 1378
    const/high16 v24, 0x40400000    # 3.0f

    .line 1379
    .line 1380
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1381
    .line 1382
    .line 1383
    const v4, 0x411e147b    # 9.88f

    .line 1384
    .line 1385
    .line 1386
    const v6, 0x404b851f    # 3.18f

    .line 1387
    .line 1388
    .line 1389
    const v7, 0x410e6666    # 8.9f

    .line 1390
    .line 1391
    .line 1392
    const/high16 v8, 0x40600000    # 3.5f

    .line 1393
    .line 1394
    invoke-virtual {v2, v4, v6, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1395
    .line 1396
    .line 1397
    const/high16 v26, 0x40000000    # 2.0f

    .line 1398
    .line 1399
    const v21, 0x411a3d71    # 9.64f

    .line 1400
    .line 1401
    .line 1402
    const v22, 0x4025c28f    # 2.59f

    .line 1403
    .line 1404
    .line 1405
    const/high16 v23, 0x412c0000    # 10.75f

    .line 1406
    .line 1407
    const/high16 v24, 0x40000000    # 2.0f

    .line 1408
    .line 1409
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1410
    .line 1411
    .line 1412
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1413
    .line 1414
    .line 1415
    const/high16 v4, 0x41100000    # 9.0f

    .line 1416
    .line 1417
    const/high16 v6, 0x40000000    # 2.0f

    .line 1418
    .line 1419
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1420
    .line 1421
    .line 1422
    const/high16 v25, 0x40800000    # 4.0f

    .line 1423
    .line 1424
    const/high16 v26, -0x3f800000    # -4.0f

    .line 1425
    .line 1426
    const/16 v21, 0x0

    .line 1427
    .line 1428
    const v22, -0x3ff28f5c    # -2.21f

    .line 1429
    .line 1430
    .line 1431
    const v23, 0x3fe51eb8    # 1.79f

    .line 1432
    .line 1433
    .line 1434
    const/high16 v24, -0x3f800000    # -4.0f

    .line 1435
    .line 1436
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1437
    .line 1438
    .line 1439
    const v25, 0x3ca3d70a    # 0.02f

    .line 1440
    .line 1441
    .line 1442
    const/16 v26, 0x0

    .line 1443
    .line 1444
    const v21, 0x3c23d70a    # 0.01f

    .line 1445
    .line 1446
    .line 1447
    const/16 v22, 0x0

    .line 1448
    .line 1449
    const v23, 0x3c23d70a    # 0.01f

    .line 1450
    .line 1451
    .line 1452
    const/16 v24, 0x0

    .line 1453
    .line 1454
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1455
    .line 1456
    .line 1457
    const v25, -0x3f933333    # -3.7f

    .line 1458
    .line 1459
    .line 1460
    const v26, 0x40b147ae    # 5.54f

    .line 1461
    .line 1462
    .line 1463
    const v21, -0x4019999a    # -1.8f

    .line 1464
    .line 1465
    .line 1466
    const v22, 0x3faccccd    # 1.35f

    .line 1467
    .line 1468
    .line 1469
    const v23, -0x3fb7ae14    # -3.13f

    .line 1470
    .line 1471
    .line 1472
    const v24, 0x40528f5c    # 3.29f

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1476
    .line 1477
    .line 1478
    const/high16 v25, 0x40000000    # 2.0f

    .line 1479
    .line 1480
    const/high16 v26, 0x41100000    # 9.0f

    .line 1481
    .line 1482
    const v21, 0x4007ae14    # 2.12f

    .line 1483
    .line 1484
    .line 1485
    const v22, 0x41211eb8    # 10.07f

    .line 1486
    .line 1487
    .line 1488
    const/high16 v23, 0x40000000    # 2.0f

    .line 1489
    .line 1490
    const v24, 0x4118cccd    # 9.55f

    .line 1491
    .line 1492
    .line 1493
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1494
    .line 1495
    .line 1496
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1497
    .line 1498
    .line 1499
    const/high16 v4, 0x40c00000    # 6.0f

    .line 1500
    .line 1501
    const/high16 v6, 0x41b00000    # 22.0f

    .line 1502
    .line 1503
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1504
    .line 1505
    .line 1506
    const/high16 v25, -0x3f800000    # -4.0f

    .line 1507
    .line 1508
    const/high16 v26, -0x3f800000    # -4.0f

    .line 1509
    .line 1510
    const v21, -0x3ff28f5c    # -2.21f

    .line 1511
    .line 1512
    .line 1513
    const/16 v22, 0x0

    .line 1514
    .line 1515
    const/high16 v23, -0x3f800000    # -4.0f

    .line 1516
    .line 1517
    const v24, -0x401ae148    # -1.79f

    .line 1518
    .line 1519
    .line 1520
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1521
    .line 1522
    .line 1523
    const/high16 v25, 0x3f000000    # 0.5f

    .line 1524
    .line 1525
    const v26, -0x400f5c29    # -1.88f

    .line 1526
    .line 1527
    .line 1528
    const/16 v21, 0x0

    .line 1529
    .line 1530
    const v22, -0x40cf5c29    # -0.69f

    .line 1531
    .line 1532
    .line 1533
    const v23, 0x3e428f5c    # 0.19f

    .line 1534
    .line 1535
    .line 1536
    const v24, -0x40570a3d    # -1.32f

    .line 1537
    .line 1538
    .line 1539
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1540
    .line 1541
    .line 1542
    const v25, 0x4097ae14    # 4.74f

    .line 1543
    .line 1544
    .line 1545
    const v26, 0x40b5c28f    # 5.68f

    .line 1546
    .line 1547
    .line 1548
    const v21, 0x3f4ccccd    # 0.8f

    .line 1549
    .line 1550
    .line 1551
    const v22, 0x401c28f6    # 2.44f

    .line 1552
    .line 1553
    .line 1554
    const v23, 0x402147ae    # 2.52f

    .line 1555
    .line 1556
    .line 1557
    const v24, 0x408f0a3d    # 4.47f

    .line 1558
    .line 1559
    .line 1560
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1561
    .line 1562
    .line 1563
    const/high16 v25, 0x40c00000    # 6.0f

    .line 1564
    .line 1565
    const/high16 v26, 0x41b00000    # 22.0f

    .line 1566
    .line 1567
    const v21, 0x40db3333    # 6.85f

    .line 1568
    .line 1569
    .line 1570
    const v22, 0x41af70a4    # 21.93f

    .line 1571
    .line 1572
    .line 1573
    const v23, 0x40ce147b    # 6.44f

    .line 1574
    .line 1575
    .line 1576
    const/high16 v24, 0x41b00000    # 22.0f

    .line 1577
    .line 1578
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1579
    .line 1580
    .line 1581
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1582
    .line 1583
    .line 1584
    const/high16 v4, 0x41a80000    # 21.0f

    .line 1585
    .line 1586
    const/high16 v6, 0x41400000    # 12.0f

    .line 1587
    .line 1588
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1589
    .line 1590
    .line 1591
    const/high16 v25, -0x3f000000    # -8.0f

    .line 1592
    .line 1593
    const/high16 v26, -0x3f000000    # -8.0f

    .line 1594
    .line 1595
    const v21, -0x3f72e148    # -4.41f

    .line 1596
    .line 1597
    .line 1598
    const/16 v22, 0x0

    .line 1599
    .line 1600
    const/high16 v23, -0x3f000000    # -8.0f

    .line 1601
    .line 1602
    const v24, -0x3f9a3d71    # -3.59f

    .line 1603
    .line 1604
    .line 1605
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1606
    .line 1607
    .line 1608
    const/high16 v25, 0x40c00000    # 6.0f

    .line 1609
    .line 1610
    const v26, -0x3f0851ec    # -7.74f

    .line 1611
    .line 1612
    .line 1613
    const/16 v21, 0x0

    .line 1614
    .line 1615
    const v22, -0x3f91eb85    # -3.72f

    .line 1616
    .line 1617
    .line 1618
    const v23, 0x4023d70a    # 2.56f

    .line 1619
    .line 1620
    .line 1621
    const v24, -0x3f24cccd    # -6.85f

    .line 1622
    .line 1623
    .line 1624
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1625
    .line 1626
    .line 1627
    const/16 v25, 0x0

    .line 1628
    .line 1629
    const v26, 0x3d4ccccd    # 0.05f

    .line 1630
    .line 1631
    .line 1632
    const v22, 0x3ca3d70a    # 0.02f

    .line 1633
    .line 1634
    .line 1635
    const/16 v23, 0x0

    .line 1636
    .line 1637
    const v24, 0x3cf5c28f    # 0.03f

    .line 1638
    .line 1639
    .line 1640
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1641
    .line 1642
    .line 1643
    const v25, 0x40c1eb85    # 6.06f

    .line 1644
    .line 1645
    .line 1646
    const v26, 0x40c1eb85    # 6.06f

    .line 1647
    .line 1648
    .line 1649
    const v22, 0x4055c28f    # 3.34f

    .line 1650
    .line 1651
    .line 1652
    const v23, 0x402e147b    # 2.72f

    .line 1653
    .line 1654
    .line 1655
    const v24, 0x40c1eb85    # 6.06f

    .line 1656
    .line 1657
    .line 1658
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1659
    .line 1660
    .line 1661
    const v25, 0x405ccccd    # 3.45f

    .line 1662
    .line 1663
    .line 1664
    const v26, -0x40747ae1    # -1.09f

    .line 1665
    .line 1666
    .line 1667
    const v21, 0x3fa147ae    # 1.26f

    .line 1668
    .line 1669
    .line 1670
    const/16 v22, 0x0

    .line 1671
    .line 1672
    const v23, 0x401ccccd    # 2.45f

    .line 1673
    .line 1674
    .line 1675
    const v24, -0x413851ec    # -0.39f

    .line 1676
    .line 1677
    .line 1678
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1679
    .line 1680
    .line 1681
    const/high16 v25, 0x41a00000    # 20.0f

    .line 1682
    .line 1683
    const/high16 v26, 0x41500000    # 13.0f

    .line 1684
    .line 1685
    const v21, 0x419e8f5c    # 19.82f

    .line 1686
    .line 1687
    .line 1688
    const v22, 0x41323d71    # 11.14f

    .line 1689
    .line 1690
    .line 1691
    const/high16 v23, 0x41a00000    # 20.0f

    .line 1692
    .line 1693
    const v24, 0x4140cccd    # 12.05f

    .line 1694
    .line 1695
    .line 1696
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1697
    .line 1698
    .line 1699
    const/high16 v25, 0x41400000    # 12.0f

    .line 1700
    .line 1701
    const/high16 v26, 0x41a80000    # 21.0f

    .line 1702
    .line 1703
    const/high16 v21, 0x41a00000    # 20.0f

    .line 1704
    .line 1705
    const v22, 0x418b47ae    # 17.41f

    .line 1706
    .line 1707
    .line 1708
    const v23, 0x418347ae    # 16.41f

    .line 1709
    .line 1710
    .line 1711
    const/high16 v24, 0x41a80000    # 21.0f

    .line 1712
    .line 1713
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1714
    .line 1715
    .line 1716
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1717
    .line 1718
    .line 1719
    const/high16 v4, 0x41b00000    # 22.0f

    .line 1720
    .line 1721
    const/high16 v6, 0x41900000    # 18.0f

    .line 1722
    .line 1723
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1724
    .line 1725
    .line 1726
    const/high16 v25, -0x40600000    # -1.25f

    .line 1727
    .line 1728
    const v26, -0x41b33333    # -0.2f

    .line 1729
    .line 1730
    .line 1731
    const v21, -0x411eb852    # -0.44f

    .line 1732
    .line 1733
    .line 1734
    const/16 v22, 0x0

    .line 1735
    .line 1736
    const v23, -0x40a66666    # -0.85f

    .line 1737
    .line 1738
    .line 1739
    const v24, -0x4270a3d7    # -0.07f

    .line 1740
    .line 1741
    .line 1742
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1743
    .line 1744
    .line 1745
    const v25, 0x4097ae14    # 4.74f

    .line 1746
    .line 1747
    .line 1748
    const v26, -0x3f4a3d71    # -5.68f

    .line 1749
    .line 1750
    .line 1751
    const v21, 0x400eb852    # 2.23f

    .line 1752
    .line 1753
    .line 1754
    const v22, -0x40651eb8    # -1.21f

    .line 1755
    .line 1756
    .line 1757
    const v23, 0x407c28f6    # 3.94f

    .line 1758
    .line 1759
    .line 1760
    const v24, -0x3fb0a3d7    # -3.24f

    .line 1761
    .line 1762
    .line 1763
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1764
    .line 1765
    .line 1766
    const/high16 v25, 0x3f000000    # 0.5f

    .line 1767
    .line 1768
    const v26, 0x3ff0a3d7    # 1.88f

    .line 1769
    .line 1770
    .line 1771
    const v21, 0x3e9eb852    # 0.31f

    .line 1772
    .line 1773
    .line 1774
    const v22, 0x3f0f5c29    # 0.56f

    .line 1775
    .line 1776
    .line 1777
    const/high16 v23, 0x3f000000    # 0.5f

    .line 1778
    .line 1779
    const v24, 0x3f99999a    # 1.2f

    .line 1780
    .line 1781
    .line 1782
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1783
    .line 1784
    .line 1785
    const/high16 v25, 0x41900000    # 18.0f

    .line 1786
    .line 1787
    const/high16 v26, 0x41b00000    # 22.0f

    .line 1788
    .line 1789
    const/high16 v21, 0x41b00000    # 22.0f

    .line 1790
    .line 1791
    const v22, 0x41a1ae14    # 20.21f

    .line 1792
    .line 1793
    .line 1794
    const v23, 0x41a1ae14    # 20.21f

    .line 1795
    .line 1796
    .line 1797
    const/high16 v24, 0x41b00000    # 22.0f

    .line 1798
    .line 1799
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1800
    .line 1801
    .line 1802
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1803
    .line 1804
    .line 1805
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v2

    .line 1809
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1810
    .line 1811
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1812
    .line 1813
    const/4 v7, 0x0

    .line 1814
    const-string v4, ""

    .line 1815
    .line 1816
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1817
    .line 1818
    .line 1819
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1820
    .line 1821
    .line 1822
    move-result v3

    .line 1823
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1824
    .line 1825
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1826
    .line 1827
    .line 1828
    move-result-wide v6

    .line 1829
    const/4 v2, 0x0

    .line 1830
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1831
    .line 1832
    .line 1833
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1834
    .line 1835
    .line 1836
    move-result v10

    .line 1837
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1838
    .line 1839
    .line 1840
    move-result v11

    .line 1841
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1842
    .line 1843
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1844
    .line 1845
    .line 1846
    const/high16 v4, 0x41600000    # 14.0f

    .line 1847
    .line 1848
    const/high16 v6, 0x41100000    # 9.0f

    .line 1849
    .line 1850
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1851
    .line 1852
    .line 1853
    const/4 v4, 0x0

    .line 1854
    const/high16 v6, -0x40600000    # -1.25f

    .line 1855
    .line 1856
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1857
    .line 1858
    .line 1859
    const/high16 v26, 0x40200000    # 2.5f

    .line 1860
    .line 1861
    const/16 v27, 0x0

    .line 1862
    .line 1863
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 1864
    .line 1865
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 1866
    .line 1867
    const/16 v23, 0x0

    .line 1868
    .line 1869
    const/16 v24, 0x1

    .line 1870
    .line 1871
    const/16 v25, 0x1

    .line 1872
    .line 1873
    move-object/from16 v20, v2

    .line 1874
    .line 1875
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1876
    .line 1877
    .line 1878
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 1879
    .line 1880
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1881
    .line 1882
    .line 1883
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v2

    .line 1887
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1888
    .line 1889
    const/4 v7, 0x0

    .line 1890
    const-string v4, ""

    .line 1891
    .line 1892
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1893
    .line 1894
    .line 1895
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1896
    .line 1897
    .line 1898
    move-result v3

    .line 1899
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1900
    .line 1901
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1902
    .line 1903
    .line 1904
    move-result-wide v6

    .line 1905
    const/4 v0, 0x0

    .line 1906
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1907
    .line 1908
    .line 1909
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1910
    .line 1911
    .line 1912
    move-result v10

    .line 1913
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1914
    .line 1915
    .line 1916
    move-result v11

    .line 1917
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1918
    .line 1919
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1920
    .line 1921
    .line 1922
    const/high16 v0, 0x41700000    # 15.0f

    .line 1923
    .line 1924
    const/high16 v2, 0x41600000    # 14.0f

    .line 1925
    .line 1926
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1927
    .line 1928
    .line 1929
    const/4 v0, 0x0

    .line 1930
    const/high16 v2, -0x40600000    # -1.25f

    .line 1931
    .line 1932
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1933
    .line 1934
    .line 1935
    const/high16 v18, 0x40200000    # 2.5f

    .line 1936
    .line 1937
    const/16 v19, 0x0

    .line 1938
    .line 1939
    const/high16 v13, 0x3fa00000    # 1.25f

    .line 1940
    .line 1941
    const/high16 v14, 0x3fa00000    # 1.25f

    .line 1942
    .line 1943
    const/16 v16, 0x1

    .line 1944
    .line 1945
    const/16 v17, 0x1

    .line 1946
    .line 1947
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1948
    .line 1949
    .line 1950
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 1951
    .line 1952
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1953
    .line 1954
    .line 1955
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1956
    .line 1957
    .line 1958
    move-result-object v2

    .line 1959
    const/16 v16, 0x3800

    .line 1960
    .line 1961
    const/16 v17, 0x0

    .line 1962
    .line 1963
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1964
    .line 1965
    const/4 v7, 0x0

    .line 1966
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1967
    .line 1968
    const/4 v13, 0x0

    .line 1969
    const/4 v14, 0x0

    .line 1970
    const-string v4, ""

    .line 1971
    .line 1972
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1973
    .line 1974
    .line 1975
    move-result-object v0

    .line 1976
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v0

    .line 1980
    sput-object v0, Landroidx/compose/material/icons/twotone/Face2Kt;->_face2:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1981
    .line 1982
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1983
    .line 1984
    .line 1985
    return-object v0
.end method
