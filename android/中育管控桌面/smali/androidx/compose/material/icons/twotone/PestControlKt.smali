.class public final Landroidx/compose/material/icons/twotone/PestControlKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_pestControl",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PestControl",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPestControl",
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
        "SMAP\nPestControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PestControl.kt\nandroidx/compose/material/icons/twotone/PestControlKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,115:1\n212#2,12:116\n233#2,18:129\n253#2:166\n233#2,18:167\n253#2:204\n233#2,18:205\n253#2:242\n233#2,18:243\n253#2:280\n174#3:128\n705#4,2:147\n717#4,2:149\n719#4,11:155\n705#4,2:185\n717#4,2:187\n719#4,11:193\n705#4,2:223\n717#4,2:225\n719#4,11:231\n705#4,2:261\n717#4,2:263\n719#4,11:269\n72#5,4:151\n72#5,4:189\n72#5,4:227\n72#5,4:265\n*S KotlinDebug\n*F\n+ 1 PestControl.kt\nandroidx/compose/material/icons/twotone/PestControlKt\n*L\n29#1:116,12\n30#1:129,18\n30#1:166\n44#1:167,18\n44#1:204\n52#1:205,18\n52#1:242\n103#1:243,18\n103#1:280\n29#1:128\n30#1:147,2\n30#1:149,2\n30#1:155,11\n44#1:185,2\n44#1:187,2\n44#1:193,11\n52#1:223,2\n52#1:225,2\n52#1:231,11\n103#1:261,2\n103#1:263,2\n103#1:269,11\n30#1:151,4\n44#1:189,4\n52#1:227,4\n103#1:265,4\n*E\n"
    }
.end annotation


# static fields
.field private static _pestControl:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPestControl(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PestControlKt;->_pestControl:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PestControl"

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
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f800000    # -4.0f

    .line 78
    .line 79
    const/high16 v26, 0x40a00000    # 5.0f

    .line 80
    .line 81
    const v21, -0x3ff28f5c    # -2.21f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f800000    # -4.0f

    .line 87
    .line 88
    const v24, 0x400f5c29    # 2.24f

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
    const v4, 0x3fe51eb8    # 1.79f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x40a00000    # 5.0f

    .line 100
    .line 101
    const/high16 v7, 0x40800000    # 4.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, -0x3ff0a3d7    # -2.24f

    .line 107
    .line 108
    .line 109
    const/high16 v6, -0x3f600000    # -5.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x41635c29    # 14.21f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x41100000    # 9.0f

    .line 118
    .line 119
    const/high16 v7, 0x41400000    # 12.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x41500000    # 13.0f

    .line 128
    .line 129
    const/high16 v6, 0x41880000    # 17.0f

    .line 130
    .line 131
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, -0x40000000    # -2.0f

    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, -0x3f400000    # -6.0f

    .line 140
    .line 141
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v4, 0x40000000    # 2.0f

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v4, 0x41880000    # 17.0f

    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    const/16 v16, 0x3800

    .line 162
    .line 163
    const/16 v17, 0x0

    .line 164
    .line 165
    const v6, 0x3e99999a    # 0.3f

    .line 166
    .line 167
    .line 168
    const v8, 0x3e99999a    # 0.3f

    .line 169
    .line 170
    .line 171
    const/4 v7, 0x0

    .line 172
    const/high16 v9, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const/high16 v12, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/4 v13, 0x0

    .line 177
    const/4 v14, 0x0

    .line 178
    const/4 v15, 0x0

    .line 179
    const-string v4, ""

    .line 180
    .line 181
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 182
    .line 183
    .line 184
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 189
    .line 190
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 191
    .line 192
    .line 193
    move-result-wide v6

    .line 194
    const/4 v2, 0x0

    .line 195
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    const v4, 0x40eb851f    # 7.36f

    .line 212
    .line 213
    .line 214
    const v6, 0x415e147b    # 13.88f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v25, 0x41400000    # 12.0f

    .line 221
    .line 222
    const/high16 v26, 0x40c00000    # 6.0f

    .line 223
    .line 224
    const v21, 0x4159eb85    # 13.62f

    .line 225
    .line 226
    .line 227
    const v22, 0x40d23d71    # 6.57f

    .line 228
    .line 229
    .line 230
    const v23, 0x414e147b    # 12.88f

    .line 231
    .line 232
    .line 233
    const/high16 v24, 0x40c00000    # 6.0f

    .line 234
    .line 235
    move-object/from16 v20, v2

    .line 236
    .line 237
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v4, 0x3f11eb85    # 0.57f

    .line 241
    .line 242
    .line 243
    const v6, 0x3fae147b    # 1.36f

    .line 244
    .line 245
    .line 246
    const v7, -0x400f5c29    # -1.88f

    .line 247
    .line 248
    .line 249
    const v8, -0x4030a3d7    # -1.62f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v26, 0x40e00000    # 7.0f

    .line 256
    .line 257
    const v21, 0x412b5c29    # 10.71f

    .line 258
    .line 259
    .line 260
    const v22, 0x40e428f6    # 7.13f

    .line 261
    .line 262
    .line 263
    const v23, 0x413570a4    # 11.34f

    .line 264
    .line 265
    .line 266
    const/high16 v24, 0x40e00000    # 7.0f

    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v4, 0x4154a3d7    # 13.29f

    .line 272
    .line 273
    .line 274
    const v6, 0x40e428f6    # 7.13f

    .line 275
    .line 276
    .line 277
    const v7, 0x40eb851f    # 7.36f

    .line 278
    .line 279
    .line 280
    const v8, 0x415e147b    # 13.88f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2, v4, v6, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    const v6, 0x3e99999a    # 0.3f

    .line 294
    .line 295
    .line 296
    const v8, 0x3e99999a    # 0.3f

    .line 297
    .line 298
    .line 299
    const/4 v7, 0x0

    .line 300
    const-string v4, ""

    .line 301
    .line 302
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 303
    .line 304
    .line 305
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 310
    .line 311
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 312
    .line 313
    .line 314
    move-result-wide v6

    .line 315
    const/4 v2, 0x0

    .line 316
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 320
    .line 321
    .line 322
    move-result v10

    .line 323
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 324
    .line 325
    .line 326
    move-result v11

    .line 327
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 330
    .line 331
    .line 332
    const/high16 v4, 0x41700000    # 15.0f

    .line 333
    .line 334
    const/high16 v6, 0x41a80000    # 21.0f

    .line 335
    .line 336
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v4, -0x40000000    # -2.0f

    .line 340
    .line 341
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v4, -0x3fbb851f    # -3.07f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v25, -0x419eb852    # -0.22f

    .line 351
    .line 352
    .line 353
    const v26, -0x406e147b    # -1.14f

    .line 354
    .line 355
    .line 356
    const v21, -0x42b33333    # -0.05f

    .line 357
    .line 358
    .line 359
    const v22, -0x413851ec    # -0.39f

    .line 360
    .line 361
    .line 362
    const v23, -0x420a3d71    # -0.12f

    .line 363
    .line 364
    .line 365
    const v24, -0x40bae148    # -0.77f

    .line 366
    .line 367
    .line 368
    move-object/from16 v20, v2

    .line 369
    .line 370
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v4, -0x404147ae    # -1.49f

    .line 374
    .line 375
    .line 376
    const v6, 0x40251eb8    # 2.58f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v4, -0x40228f5c    # -1.73f

    .line 383
    .line 384
    .line 385
    const/high16 v6, -0x40800000    # -1.0f

    .line 386
    .line 387
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v4, 0x41875c29    # 16.92f

    .line 391
    .line 392
    .line 393
    const/high16 v6, 0x41200000    # 10.0f

    .line 394
    .line 395
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v25, -0x40828f5c    # -0.99f

    .line 399
    .line 400
    .line 401
    const v26, -0x405ae148    # -1.29f

    .line 402
    .line 403
    .line 404
    const v21, -0x4170a3d7    # -0.28f

    .line 405
    .line 406
    .line 407
    const v22, -0x410a3d71    # -0.48f

    .line 408
    .line 409
    .line 410
    const v23, -0x40e147ae    # -0.62f

    .line 411
    .line 412
    .line 413
    const v24, -0x40970a3d    # -0.91f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v25, -0x40eb851f    # -0.58f

    .line 420
    .line 421
    .line 422
    const v26, -0x3fc70a3d    # -2.89f

    .line 423
    .line 424
    .line 425
    const v21, 0x3dcccccd    # 0.1f

    .line 426
    .line 427
    .line 428
    const v22, -0x40f0a3d7    # -0.56f

    .line 429
    .line 430
    .line 431
    const v23, 0x3e4ccccd    # 0.2f

    .line 432
    .line 433
    .line 434
    const v24, -0x4027ae14    # -1.69f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v4, 0x408570a4    # 4.17f

    .line 441
    .line 442
    .line 443
    const/high16 v6, 0x41880000    # 17.0f

    .line 444
    .line 445
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v4, -0x404b851f    # -1.41f

    .line 449
    .line 450
    .line 451
    const v6, -0x404b851f    # -1.41f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v4, -0x4023d70a    # -1.72f

    .line 458
    .line 459
    .line 460
    const v6, 0x3fdc28f6    # 1.72f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v25, -0x3f9147ae    # -3.73f

    .line 467
    .line 468
    .line 469
    const/16 v26, 0x0

    .line 470
    .line 471
    const v21, -0x4028f5c3    # -1.68f

    .line 472
    .line 473
    .line 474
    const v22, -0x409c28f6    # -0.89f

    .line 475
    .line 476
    .line 477
    const v23, -0x3fb9999a    # -3.1f

    .line 478
    .line 479
    .line 480
    const v24, -0x41570a3d    # -0.33f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v4, 0x41068f5c    # 8.41f

    .line 487
    .line 488
    .line 489
    const v6, 0x4030a3d7    # 2.76f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v4, 0x40e00000    # 7.0f

    .line 496
    .line 497
    const v6, 0x408570a4    # 4.17f

    .line 498
    .line 499
    .line 500
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v4, 0x3fd33333    # 1.65f

    .line 504
    .line 505
    .line 506
    const v6, 0x3fd33333    # 1.65f

    .line 507
    .line 508
    .line 509
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v25, -0x40eb851f    # -0.58f

    .line 513
    .line 514
    .line 515
    const v26, 0x4038f5c3    # 2.89f

    .line 516
    .line 517
    .line 518
    const v21, -0x40b851ec    # -0.78f

    .line 519
    .line 520
    .line 521
    const v22, 0x3f99999a    # 1.2f

    .line 522
    .line 523
    .line 524
    const v23, -0x40d1eb85    # -0.68f

    .line 525
    .line 526
    .line 527
    const v24, 0x4015c28f    # 2.34f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v25, 0x40e28f5c    # 7.08f

    .line 534
    .line 535
    .line 536
    const/high16 v26, 0x41200000    # 10.0f

    .line 537
    .line 538
    const v21, 0x40f66666    # 7.7f

    .line 539
    .line 540
    .line 541
    const v22, 0x4111999a    # 9.1f

    .line 542
    .line 543
    .line 544
    const v23, 0x40eb851f    # 7.36f

    .line 545
    .line 546
    .line 547
    const v24, 0x41187ae1    # 9.53f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v4, 0x4096b852    # 4.71f

    .line 554
    .line 555
    .line 556
    const v6, 0x410a147b    # 8.63f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v4, 0x3fdd70a4    # 1.73f

    .line 563
    .line 564
    .line 565
    const/high16 v6, -0x40800000    # -1.0f

    .line 566
    .line 567
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v4, 0x3fbeb852    # 1.49f

    .line 571
    .line 572
    .line 573
    const v6, 0x40251eb8    # 2.58f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v25, -0x419eb852    # -0.22f

    .line 580
    .line 581
    .line 582
    const v26, 0x3f91eb85    # 1.14f

    .line 583
    .line 584
    .line 585
    const v21, -0x42333333    # -0.1f

    .line 586
    .line 587
    .line 588
    const v22, 0x3ebd70a4    # 0.37f

    .line 589
    .line 590
    .line 591
    const v23, -0x41d1eb85    # -0.17f

    .line 592
    .line 593
    .line 594
    const/high16 v24, 0x3f400000    # 0.75f

    .line 595
    .line 596
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v4, 0x40400000    # 3.0f

    .line 600
    .line 601
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v4, 0x40000000    # 2.0f

    .line 605
    .line 606
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v4, 0x40447ae1    # 3.07f

    .line 610
    .line 611
    .line 612
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v25, 0x3e6147ae    # 0.22f

    .line 616
    .line 617
    .line 618
    const v21, 0x3d4ccccd    # 0.05f

    .line 619
    .line 620
    .line 621
    const v22, 0x3ec7ae14    # 0.39f

    .line 622
    .line 623
    .line 624
    const v23, 0x3df5c28f    # 0.12f

    .line 625
    .line 626
    .line 627
    const v24, 0x3f451eb8    # 0.77f

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const v4, -0x3fdae148    # -2.58f

    .line 634
    .line 635
    .line 636
    const v6, 0x3fbeb852    # 1.49f

    .line 637
    .line 638
    .line 639
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v4, 0x3f800000    # 1.0f

    .line 643
    .line 644
    const v6, 0x3fdd70a4    # 1.73f

    .line 645
    .line 646
    .line 647
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v4, 0x40e28f5c    # 7.08f

    .line 651
    .line 652
    .line 653
    const/high16 v6, 0x41900000    # 18.0f

    .line 654
    .line 655
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v25, 0x409d70a4    # 4.92f

    .line 659
    .line 660
    .line 661
    const/high16 v26, 0x40400000    # 3.0f

    .line 662
    .line 663
    const v21, 0x3f8a3d71    # 1.08f

    .line 664
    .line 665
    .line 666
    const v22, 0x3fe7ae14    # 1.81f

    .line 667
    .line 668
    .line 669
    const v23, 0x403851ec    # 2.88f

    .line 670
    .line 671
    .line 672
    const/high16 v24, 0x40400000    # 3.0f

    .line 673
    .line 674
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v4, 0x409d70a4    # 4.92f

    .line 678
    .line 679
    .line 680
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 681
    .line 682
    const v7, 0x4075c28f    # 3.84f

    .line 683
    .line 684
    .line 685
    const v8, -0x4067ae14    # -1.19f

    .line 686
    .line 687
    .line 688
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v4, 0x4017ae14    # 2.37f

    .line 692
    .line 693
    .line 694
    const v6, 0x3faf5c29    # 1.37f

    .line 695
    .line 696
    .line 697
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const/high16 v4, 0x3f800000    # 1.0f

    .line 701
    .line 702
    const v6, -0x40228f5c    # -1.73f

    .line 703
    .line 704
    .line 705
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v4, -0x3fdae148    # -2.58f

    .line 709
    .line 710
    .line 711
    const v6, -0x404147ae    # -1.49f

    .line 712
    .line 713
    .line 714
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v25, 0x3e6147ae    # 0.22f

    .line 718
    .line 719
    .line 720
    const v26, -0x406e147b    # -1.14f

    .line 721
    .line 722
    .line 723
    const v21, 0x3dcccccd    # 0.1f

    .line 724
    .line 725
    .line 726
    const v22, -0x41428f5c    # -0.37f

    .line 727
    .line 728
    .line 729
    const v23, 0x3e2e147b    # 0.17f

    .line 730
    .line 731
    .line 732
    const/high16 v24, -0x40c00000    # -0.75f

    .line 733
    .line 734
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const/high16 v4, 0x41a80000    # 21.0f

    .line 738
    .line 739
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v4, 0x40c00000    # 6.0f

    .line 746
    .line 747
    const/high16 v6, 0x41400000    # 12.0f

    .line 748
    .line 749
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v25, 0x3ff0a3d7    # 1.88f

    .line 753
    .line 754
    .line 755
    const v26, 0x3fae147b    # 1.36f

    .line 756
    .line 757
    .line 758
    const v21, 0x3f6147ae    # 0.88f

    .line 759
    .line 760
    .line 761
    const/16 v22, 0x0

    .line 762
    .line 763
    const v23, 0x3fcf5c29    # 1.62f

    .line 764
    .line 765
    .line 766
    const v24, 0x3f11eb85    # 0.57f

    .line 767
    .line 768
    .line 769
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const/high16 v25, 0x41400000    # 12.0f

    .line 773
    .line 774
    const/high16 v26, 0x40e00000    # 7.0f

    .line 775
    .line 776
    const v21, 0x4154a3d7    # 13.29f

    .line 777
    .line 778
    .line 779
    const v22, 0x40e428f6    # 7.13f

    .line 780
    .line 781
    .line 782
    const v23, 0x414a8f5c    # 12.66f

    .line 783
    .line 784
    .line 785
    const/high16 v24, 0x40e00000    # 7.0f

    .line 786
    .line 787
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const v4, 0x3e051eb8    # 0.13f

    .line 791
    .line 792
    .line 793
    const v6, 0x3eb851ec    # 0.36f

    .line 794
    .line 795
    .line 796
    const v7, -0x400f5c29    # -1.88f

    .line 797
    .line 798
    .line 799
    const v8, -0x405ae148    # -1.29f

    .line 800
    .line 801
    .line 802
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const/high16 v26, 0x40c00000    # 6.0f

    .line 806
    .line 807
    const v21, 0x4126147b    # 10.38f

    .line 808
    .line 809
    .line 810
    const v22, 0x40d23d71    # 6.57f

    .line 811
    .line 812
    .line 813
    const v23, 0x4131eb85    # 11.12f

    .line 814
    .line 815
    .line 816
    const/high16 v24, 0x40c00000    # 6.0f

    .line 817
    .line 818
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const/high16 v4, 0x41980000    # 19.0f

    .line 825
    .line 826
    const/high16 v6, 0x41400000    # 12.0f

    .line 827
    .line 828
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const/high16 v25, -0x3f800000    # -4.0f

    .line 832
    .line 833
    const/high16 v26, -0x3f600000    # -5.0f

    .line 834
    .line 835
    const v21, -0x3ff28f5c    # -2.21f

    .line 836
    .line 837
    .line 838
    const/16 v22, 0x0

    .line 839
    .line 840
    const/high16 v23, -0x3f800000    # -4.0f

    .line 841
    .line 842
    const v24, -0x3ff0a3d7    # -2.24f

    .line 843
    .line 844
    .line 845
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const v4, 0x3fe51eb8    # 1.79f

    .line 849
    .line 850
    .line 851
    const/high16 v6, -0x3f600000    # -5.0f

    .line 852
    .line 853
    const/high16 v7, 0x40800000    # 4.0f

    .line 854
    .line 855
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    const v4, 0x400f5c29    # 2.24f

    .line 859
    .line 860
    .line 861
    const/high16 v6, 0x40a00000    # 5.0f

    .line 862
    .line 863
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const v4, 0x41635c29    # 14.21f

    .line 867
    .line 868
    .line 869
    const/high16 v6, 0x41980000    # 19.0f

    .line 870
    .line 871
    const/high16 v7, 0x41400000    # 12.0f

    .line 872
    .line 873
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 880
    .line 881
    .line 882
    move-result-object v2

    .line 883
    const/high16 v6, 0x3f800000    # 1.0f

    .line 884
    .line 885
    const/high16 v8, 0x3f800000    # 1.0f

    .line 886
    .line 887
    const/4 v7, 0x0

    .line 888
    const-string v4, ""

    .line 889
    .line 890
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 891
    .line 892
    .line 893
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 894
    .line 895
    .line 896
    move-result v3

    .line 897
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 898
    .line 899
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 900
    .line 901
    .line 902
    move-result-wide v6

    .line 903
    const/4 v0, 0x0

    .line 904
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 905
    .line 906
    .line 907
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 908
    .line 909
    .line 910
    move-result v10

    .line 911
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 912
    .line 913
    .line 914
    move-result v11

    .line 915
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 916
    .line 917
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 918
    .line 919
    .line 920
    const/high16 v2, 0x41300000    # 11.0f

    .line 921
    .line 922
    const/high16 v4, 0x41300000    # 11.0f

    .line 923
    .line 924
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    const/high16 v2, 0x40000000    # 2.0f

    .line 928
    .line 929
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 930
    .line 931
    .line 932
    const/high16 v2, 0x40c00000    # 6.0f

    .line 933
    .line 934
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    const/high16 v2, -0x40000000    # -2.0f

    .line 938
    .line 939
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 940
    .line 941
    .line 942
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 943
    .line 944
    .line 945
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    const/high16 v6, 0x3f800000    # 1.0f

    .line 950
    .line 951
    const/4 v7, 0x0

    .line 952
    const-string v4, ""

    .line 953
    .line 954
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 955
    .line 956
    .line 957
    move-result-object v0

    .line 958
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    sput-object v0, Landroidx/compose/material/icons/twotone/PestControlKt;->_pestControl:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 963
    .line 964
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 965
    .line 966
    .line 967
    return-object v0
.end method
