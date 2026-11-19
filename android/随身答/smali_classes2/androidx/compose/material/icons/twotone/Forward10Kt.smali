.class public final Landroidx/compose/material/icons/twotone/Forward10Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_forward10",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Forward10",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getForward10",
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
        "SMAP\nForward10.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Forward10.kt\nandroidx/compose/material/icons/twotone/Forward10Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,102:1\n212#2,12:103\n233#2,18:116\n253#2:153\n233#2,18:154\n253#2:191\n233#2,18:192\n253#2:229\n174#3:115\n705#4,2:134\n717#4,2:136\n719#4,11:142\n705#4,2:172\n717#4,2:174\n719#4,11:180\n705#4,2:210\n717#4,2:212\n719#4,11:218\n72#5,4:138\n72#5,4:176\n72#5,4:214\n*S KotlinDebug\n*F\n+ 1 Forward10.kt\nandroidx/compose/material/icons/twotone/Forward10Kt\n*L\n29#1:103,12\n30#1:116,18\n30#1:153\n45#1:154,18\n45#1:191\n55#1:192,18\n55#1:229\n29#1:115\n30#1:134,2\n30#1:136,2\n30#1:142,11\n45#1:172,2\n45#1:174,2\n45#1:180,11\n55#1:210,2\n55#1:212,2\n55#1:218,11\n30#1:138,4\n45#1:176,4\n55#1:214,4\n*E\n"
    }
.end annotation


# static fields
.field private static _forward10:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getForward10(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Forward10Kt;->_forward10:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Forward10"

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
    const/high16 v6, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f400000    # -6.0f

    .line 78
    .line 79
    const/high16 v26, 0x40c00000    # 6.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, 0x4053d70a    # 3.31f

    .line 84
    .line 85
    .line 86
    const v23, -0x3fd3d70a    # -2.69f

    .line 87
    .line 88
    .line 89
    const/high16 v24, 0x40c00000    # 6.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, -0x3fd3d70a    # -2.69f

    .line 97
    .line 98
    .line 99
    const/high16 v6, -0x3f400000    # -6.0f

    .line 100
    .line 101
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, 0x402c28f6    # 2.69f

    .line 105
    .line 106
    .line 107
    const/high16 v6, 0x40c00000    # 6.0f

    .line 108
    .line 109
    const/high16 v7, -0x3f400000    # -6.0f

    .line 110
    .line 111
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v4, 0x40800000    # 4.0f

    .line 115
    .line 116
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v4, 0x40a00000    # 5.0f

    .line 120
    .line 121
    const/high16 v6, -0x3f600000    # -5.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, -0x3f600000    # -5.0f

    .line 127
    .line 128
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v4, 0x40800000    # 4.0f

    .line 132
    .line 133
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v25, -0x3f000000    # -8.0f

    .line 137
    .line 138
    const/high16 v26, 0x41000000    # 8.0f

    .line 139
    .line 140
    const v21, -0x3f728f5c    # -4.42f

    .line 141
    .line 142
    .line 143
    const/16 v22, 0x0

    .line 144
    .line 145
    const/high16 v23, -0x3f000000    # -8.0f

    .line 146
    .line 147
    const v24, 0x40651eb8    # 3.58f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v25, 0x41000000    # 8.0f

    .line 154
    .line 155
    const/16 v21, 0x0

    .line 156
    .line 157
    const v22, 0x408d70a4    # 4.42f

    .line 158
    .line 159
    .line 160
    const v23, 0x40651eb8    # 3.58f

    .line 161
    .line 162
    .line 163
    const/high16 v24, 0x41000000    # 8.0f

    .line 164
    .line 165
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v4, -0x3f9ae148    # -3.58f

    .line 169
    .line 170
    .line 171
    const/high16 v6, -0x3f000000    # -8.0f

    .line 172
    .line 173
    const/high16 v7, 0x41000000    # 8.0f

    .line 174
    .line 175
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v4, 0x41900000    # 18.0f

    .line 179
    .line 180
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    const/16 v16, 0x3800

    .line 191
    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    const/high16 v6, 0x3f800000    # 1.0f

    .line 195
    .line 196
    const/high16 v8, 0x3f800000    # 1.0f

    .line 197
    .line 198
    const/4 v7, 0x0

    .line 199
    const/high16 v9, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const/high16 v12, 0x3f800000    # 1.0f

    .line 202
    .line 203
    const/4 v13, 0x0

    .line 204
    const/4 v14, 0x0

    .line 205
    const/4 v15, 0x0

    .line 206
    const-string v4, ""

    .line 207
    .line 208
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 209
    .line 210
    .line 211
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 216
    .line 217
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 218
    .line 219
    .line 220
    move-result-wide v6

    .line 221
    const/4 v2, 0x0

    .line 222
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    const v4, 0x412e6666    # 10.9f

    .line 239
    .line 240
    .line 241
    const/high16 v6, 0x41800000    # 16.0f

    .line 242
    .line 243
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, -0x3f775c29    # -4.27f

    .line 247
    .line 248
    .line 249
    const/4 v6, 0x0

    .line 250
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v4, -0x4247ae14    # -0.09f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v4, -0x401d70a4    # -1.77f

    .line 260
    .line 261
    .line 262
    const v6, 0x3f2147ae    # 0.63f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v4, 0x3f30a3d7    # 0.69f

    .line 269
    .line 270
    .line 271
    const/4 v6, 0x0

    .line 272
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v4, 0x3f8147ae    # 1.01f

    .line 276
    .line 277
    .line 278
    const v6, -0x416147ae    # -0.31f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v4, 0x4050a3d7    # 3.26f

    .line 285
    .line 286
    .line 287
    const/4 v6, 0x0

    .line 288
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    const/high16 v6, 0x3f800000    # 1.0f

    .line 299
    .line 300
    const/4 v7, 0x0

    .line 301
    const-string v4, ""

    .line 302
    .line 303
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 304
    .line 305
    .line 306
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 311
    .line 312
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 313
    .line 314
    .line 315
    move-result-wide v6

    .line 316
    const/4 v0, 0x0

    .line 317
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 321
    .line 322
    .line 323
    move-result v10

    .line 324
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 325
    .line 326
    .line 327
    move-result v11

    .line 328
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 331
    .line 332
    .line 333
    const v0, 0x413c7ae1    # 11.78f

    .line 334
    .line 335
    .line 336
    const v2, 0x41651eb8    # 14.32f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v17, -0x40e8f5c3    # -0.59f

    .line 343
    .line 344
    .line 345
    const v18, -0x42333333    # -0.1f

    .line 346
    .line 347
    .line 348
    const v13, -0x41c7ae14    # -0.18f

    .line 349
    .line 350
    .line 351
    const v14, -0x4270a3d7    # -0.07f

    .line 352
    .line 353
    .line 354
    const v15, -0x41428f5c    # -0.37f

    .line 355
    .line 356
    .line 357
    const v16, -0x42333333    # -0.1f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v0, 0x3cf5c28f    # 0.03f

    .line 364
    .line 365
    .line 366
    const v2, -0x40e8f5c3    # -0.59f

    .line 367
    .line 368
    .line 369
    const v4, 0x3dcccccd    # 0.1f

    .line 370
    .line 371
    .line 372
    const v6, -0x412e147b    # -0.41f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v0, -0x4119999a    # -0.45f

    .line 379
    .line 380
    .line 381
    const v2, -0x41570a3d    # -0.33f

    .line 382
    .line 383
    .line 384
    const v4, 0x3ea8f5c3    # 0.33f

    .line 385
    .line 386
    .line 387
    const v6, 0x3e3851ec    # 0.18f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v2, v6, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, -0x416b851f    # -0.29f

    .line 394
    .line 395
    .line 396
    const v2, 0x3f11eb85    # 0.57f

    .line 397
    .line 398
    .line 399
    const v4, -0x41947ae1    # -0.23f

    .line 400
    .line 401
    .line 402
    const v6, 0x3eae147b    # 0.34f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x3f000000    # 0.5f

    .line 409
    .line 410
    const v2, 0x3f51eb85    # 0.82f

    .line 411
    .line 412
    .line 413
    const v4, -0x42333333    # -0.1f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, 0x3f3d70a4    # 0.74f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v17, 0x3de147ae    # 0.11f

    .line 426
    .line 427
    .line 428
    const v18, 0x3f51eb85    # 0.82f

    .line 429
    .line 430
    .line 431
    const/4 v13, 0x0

    .line 432
    const v14, 0x3ea3d70a    # 0.32f

    .line 433
    .line 434
    .line 435
    const v15, 0x3d23d70a    # 0.04f

    .line 436
    .line 437
    .line 438
    const v16, 0x3f19999a    # 0.6f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x3e99999a    # 0.3f

    .line 445
    .line 446
    .line 447
    const v2, 0x3f11eb85    # 0.57f

    .line 448
    .line 449
    .line 450
    const v4, 0x3e2e147b    # 0.17f

    .line 451
    .line 452
    .line 453
    const v6, 0x3ed70a3d    # 0.42f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, 0x3e851eb8    # 0.26f

    .line 460
    .line 461
    .line 462
    const v2, 0x3eeb851f    # 0.46f

    .line 463
    .line 464
    .line 465
    const v4, 0x3ea8f5c3    # 0.33f

    .line 466
    .line 467
    .line 468
    const v6, 0x3e8f5c29    # 0.28f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x3ebd70a4    # 0.37f

    .line 475
    .line 476
    .line 477
    const v2, 0x3f170a3d    # 0.59f

    .line 478
    .line 479
    .line 480
    const v4, 0x3dcccccd    # 0.1f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, -0x430a3d71    # -0.03f

    .line 487
    .line 488
    .line 489
    const v4, -0x42333333    # -0.1f

    .line 490
    .line 491
    .line 492
    const v6, 0x3ed1eb85    # 0.41f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, -0x41c7ae14    # -0.18f

    .line 499
    .line 500
    .line 501
    const v2, 0x3ee66666    # 0.45f

    .line 502
    .line 503
    .line 504
    const v4, -0x41570a3d    # -0.33f

    .line 505
    .line 506
    .line 507
    const v6, 0x3ea8f5c3    # 0.33f

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, 0x3e947ae1    # 0.29f

    .line 514
    .line 515
    .line 516
    const v2, -0x40ee147b    # -0.57f

    .line 517
    .line 518
    .line 519
    const v4, 0x3e6147ae    # 0.22f

    .line 520
    .line 521
    .line 522
    const v6, -0x4151eb85    # -0.34f

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v0, -0x41000000    # -0.5f

    .line 529
    .line 530
    const v2, -0x40ae147b    # -0.82f

    .line 531
    .line 532
    .line 533
    const v4, 0x3dcccccd    # 0.1f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v0, 0x41580000    # 13.5f

    .line 540
    .line 541
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v17, -0x421eb852    # -0.11f

    .line 545
    .line 546
    .line 547
    const v18, -0x40ae147b    # -0.82f

    .line 548
    .line 549
    .line 550
    const v14, -0x415c28f6    # -0.32f

    .line 551
    .line 552
    .line 553
    const v15, -0x42dc28f6    # -0.04f

    .line 554
    .line 555
    .line 556
    const v16, -0x40e66666    # -0.6f

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v0, -0x41666666    # -0.3f

    .line 563
    .line 564
    .line 565
    const v2, -0x40ee147b    # -0.57f

    .line 566
    .line 567
    .line 568
    const v4, -0x41d1eb85    # -0.17f

    .line 569
    .line 570
    .line 571
    const v6, -0x4128f5c3    # -0.42f

    .line 572
    .line 573
    .line 574
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v0, 0x4167d70a    # 14.49f

    .line 578
    .line 579
    .line 580
    const v2, 0x413d999a    # 11.85f

    .line 581
    .line 582
    .line 583
    const v4, 0x413c7ae1    # 11.78f

    .line 584
    .line 585
    .line 586
    const v6, 0x41651eb8    # 14.32f

    .line 587
    .line 588
    .line 589
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v0, 0x416547ae    # 14.33f

    .line 596
    .line 597
    .line 598
    const v2, 0x4165999a    # 14.35f

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v17, -0x42dc28f6    # -0.04f

    .line 605
    .line 606
    .line 607
    const v18, 0x3ef5c28f    # 0.48f

    .line 608
    .line 609
    .line 610
    const v14, 0x3e428f5c    # 0.19f

    .line 611
    .line 612
    .line 613
    const v15, -0x43dc28f6    # -0.01f

    .line 614
    .line 615
    .line 616
    const v16, 0x3eb33333    # 0.35f

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v0, -0x421eb852    # -0.11f

    .line 623
    .line 624
    .line 625
    const v2, 0x3ea3d70a    # 0.32f

    .line 626
    .line 627
    .line 628
    const v4, -0x428a3d71    # -0.06f

    .line 629
    .line 630
    .line 631
    const v6, 0x3e75c28f    # 0.24f

    .line 632
    .line 633
    .line 634
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v2, 0x3e0f5c29    # 0.14f

    .line 638
    .line 639
    .line 640
    const v4, -0x41bd70a4    # -0.19f

    .line 641
    .line 642
    .line 643
    const v6, 0x3e2e147b    # 0.17f

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v0, -0x41dc28f6    # -0.16f

    .line 650
    .line 651
    .line 652
    const/high16 v2, -0x41800000    # -0.25f

    .line 653
    .line 654
    const v4, 0x3d4ccccd    # 0.05f

    .line 655
    .line 656
    .line 657
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v0, -0x435c28f6    # -0.02f

    .line 661
    .line 662
    .line 663
    const v4, -0x42b33333    # -0.05f

    .line 664
    .line 665
    .line 666
    const v6, -0x41c7ae14    # -0.18f

    .line 667
    .line 668
    .line 669
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v0, -0x41f0a3d7    # -0.14f

    .line 673
    .line 674
    .line 675
    const v2, -0x41bd70a4    # -0.19f

    .line 676
    .line 677
    .line 678
    const v4, -0x41d1eb85    # -0.17f

    .line 679
    .line 680
    .line 681
    const v6, -0x4247ae14    # -0.09f

    .line 682
    .line 683
    .line 684
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v0, -0x420a3d71    # -0.12f

    .line 688
    .line 689
    .line 690
    const v2, -0x415c28f6    # -0.32f

    .line 691
    .line 692
    .line 693
    const v4, -0x41bd70a4    # -0.19f

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v0, -0x42dc28f6    # -0.04f

    .line 700
    .line 701
    .line 702
    const v2, -0x410a3d71    # -0.48f

    .line 703
    .line 704
    .line 705
    const v4, -0x42dc28f6    # -0.04f

    .line 706
    .line 707
    .line 708
    const v6, -0x416b851f    # -0.29f

    .line 709
    .line 710
    .line 711
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v0, -0x4087ae14    # -0.97f

    .line 715
    .line 716
    .line 717
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const v17, 0x3d23d70a    # 0.04f

    .line 721
    .line 722
    .line 723
    const v18, -0x410a3d71    # -0.48f

    .line 724
    .line 725
    .line 726
    const v14, -0x41bd70a4    # -0.19f

    .line 727
    .line 728
    .line 729
    const v15, 0x3c23d70a    # 0.01f

    .line 730
    .line 731
    .line 732
    const v16, -0x414ccccd    # -0.35f

    .line 733
    .line 734
    .line 735
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const v0, -0x41947ae1    # -0.23f

    .line 739
    .line 740
    .line 741
    const v2, 0x3df5c28f    # 0.12f

    .line 742
    .line 743
    .line 744
    const v4, -0x416147ae    # -0.31f

    .line 745
    .line 746
    .line 747
    const v6, 0x3d75c28f    # 0.06f

    .line 748
    .line 749
    .line 750
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const v0, -0x41f0a3d7    # -0.14f

    .line 754
    .line 755
    .line 756
    const v2, 0x3e428f5c    # 0.19f

    .line 757
    .line 758
    .line 759
    const v4, -0x41d1eb85    # -0.17f

    .line 760
    .line 761
    .line 762
    const v6, 0x3de147ae    # 0.11f

    .line 763
    .line 764
    .line 765
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const v0, 0x3e23d70a    # 0.16f

    .line 769
    .line 770
    .line 771
    const/high16 v2, 0x3e800000    # 0.25f

    .line 772
    .line 773
    const v4, -0x42b33333    # -0.05f

    .line 774
    .line 775
    .line 776
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const v0, 0x3ca3d70a    # 0.02f

    .line 780
    .line 781
    .line 782
    const v4, 0x3d4ccccd    # 0.05f

    .line 783
    .line 784
    .line 785
    const v6, 0x3e3851ec    # 0.18f

    .line 786
    .line 787
    .line 788
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const v0, 0x3db851ec    # 0.09f

    .line 792
    .line 793
    .line 794
    const v2, 0x3e428f5c    # 0.19f

    .line 795
    .line 796
    .line 797
    const v4, 0x3e2e147b    # 0.17f

    .line 798
    .line 799
    .line 800
    const v6, 0x3e0f5c29    # 0.14f

    .line 801
    .line 802
    .line 803
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v0, 0x3df5c28f    # 0.12f

    .line 807
    .line 808
    .line 809
    const v2, 0x3e9eb852    # 0.31f

    .line 810
    .line 811
    .line 812
    const v4, 0x3e3851ec    # 0.18f

    .line 813
    .line 814
    .line 815
    const v6, 0x3db851ec    # 0.09f

    .line 816
    .line 817
    .line 818
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const v0, 0x3d23d70a    # 0.04f

    .line 822
    .line 823
    .line 824
    const v2, 0x3ef5c28f    # 0.48f

    .line 825
    .line 826
    .line 827
    const v4, 0x3d23d70a    # 0.04f

    .line 828
    .line 829
    .line 830
    const v6, 0x3e947ae1    # 0.29f

    .line 831
    .line 832
    .line 833
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const v0, 0x4165999a    # 14.35f

    .line 837
    .line 838
    .line 839
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 846
    .line 847
    .line 848
    move-result-object v2

    .line 849
    const/16 v16, 0x3800

    .line 850
    .line 851
    const/16 v17, 0x0

    .line 852
    .line 853
    const/high16 v6, 0x3f800000    # 1.0f

    .line 854
    .line 855
    const/4 v7, 0x0

    .line 856
    const/high16 v12, 0x3f800000    # 1.0f

    .line 857
    .line 858
    const/4 v14, 0x0

    .line 859
    const/4 v15, 0x0

    .line 860
    const-string v4, ""

    .line 861
    .line 862
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    sput-object v0, Landroidx/compose/material/icons/twotone/Forward10Kt;->_forward10:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 871
    .line 872
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 873
    .line 874
    .line 875
    return-object v0
.end method
