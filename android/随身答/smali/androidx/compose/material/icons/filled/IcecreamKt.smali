.class public final Landroidx/compose/material/icons/filled/IcecreamKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_icecream",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Icecream",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getIcecream",
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
        "SMAP\nIcecream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icecream.kt\nandroidx/compose/material/icons/filled/IcecreamKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,56:1\n212#2,12:57\n233#2,18:70\n253#2:107\n174#3:69\n705#4,2:88\n717#4,2:90\n719#4,11:96\n72#5,4:92\n*S KotlinDebug\n*F\n+ 1 Icecream.kt\nandroidx/compose/material/icons/filled/IcecreamKt\n*L\n30#1:57,12\n31#1:70,18\n31#1:107\n30#1:69\n31#1:88,2\n31#1:90,2\n31#1:96,11\n31#1:92,4\n*E\n"
    }
.end annotation


# static fields
.field private static _icecream:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getIcecream(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/IcecreamKt;->_icecream:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Icecream"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Landroidx/compose/ui/graphics/PathFillType;->Companion:Landroidx/compose/ui/graphics/PathFillType$Companion;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/PathFillType$Companion;->getEvenOdd-Rg-k1Os()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 44
    .line 45
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 48
    .line 49
    .line 50
    move-result-wide v6

    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 62
    .line 63
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 68
    .line 69
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const v0, 0x410ca3d7    # 8.79f

    .line 73
    .line 74
    .line 75
    const v2, 0x41466666    # 12.4f

    .line 76
    .line 77
    .line 78
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 79
    .line 80
    .line 81
    const v0, 0x4050a3d7    # 3.26f

    .line 82
    .line 83
    .line 84
    const v2, 0x40c70a3d    # 6.22f

    .line 85
    .line 86
    .line 87
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const v0, 0x404ae148    # 3.17f

    .line 91
    .line 92
    .line 93
    const v2, -0x3f3947ae    # -6.21f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, -0x41666666    # -0.3f

    .line 100
    .line 101
    .line 102
    const/high16 v18, -0x41800000    # -0.25f

    .line 103
    .line 104
    const v13, -0x421eb852    # -0.11f

    .line 105
    .line 106
    .line 107
    const v14, -0x425c28f6    # -0.08f

    .line 108
    .line 109
    .line 110
    const v15, -0x41a8f5c3    # -0.21f

    .line 111
    .line 112
    .line 113
    const v16, -0x41dc28f6    # -0.16f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v17, 0x41400000    # 12.0f

    .line 120
    .line 121
    const/high16 v18, 0x41500000    # 13.0f

    .line 122
    .line 123
    const v13, 0x416147ae    # 14.08f

    .line 124
    .line 125
    .line 126
    const v14, 0x414b0a3d    # 12.69f

    .line 127
    .line 128
    .line 129
    const v15, 0x41511eb8    # 13.07f

    .line 130
    .line 131
    .line 132
    const/high16 v16, 0x41500000    # 13.0f

    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, -0x3fc51eb8    # -2.92f

    .line 138
    .line 139
    .line 140
    const v2, -0x40a8f5c3    # -0.84f

    .line 141
    .line 142
    .line 143
    const v4, -0x3ffae148    # -2.08f

    .line 144
    .line 145
    .line 146
    const v6, -0x416147ae    # -0.31f

    .line 147
    .line 148
    .line 149
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v17, 0x410ca3d7    # 8.79f

    .line 153
    .line 154
    .line 155
    const v18, 0x41466666    # 12.4f

    .line 156
    .line 157
    .line 158
    const v13, 0x410fd70a    # 8.99f

    .line 159
    .line 160
    .line 161
    const/high16 v14, 0x41440000    # 12.25f

    .line 162
    .line 163
    const v15, 0x410e3d71    # 8.89f

    .line 164
    .line 165
    .line 166
    const v16, 0x414547ae    # 12.33f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x414fd70a    # 12.99f

    .line 176
    .line 177
    .line 178
    const v2, 0x40da8f5c    # 6.83f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v17, 0x40800000    # 4.0f

    .line 185
    .line 186
    const/high16 v18, 0x41200000    # 10.0f

    .line 187
    .line 188
    const/high16 v13, 0x40a80000    # 5.25f

    .line 189
    .line 190
    const v14, 0x414e6666    # 12.9f

    .line 191
    .line 192
    .line 193
    const/high16 v15, 0x40800000    # 4.0f

    .line 194
    .line 195
    const v16, 0x4139999a    # 11.6f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v17, 0x402147ae    # 2.52f

    .line 202
    .line 203
    .line 204
    const v18, -0x3fc28f5c    # -2.96f

    .line 205
    .line 206
    .line 207
    const/4 v13, 0x0

    .line 208
    const v14, -0x404147ae    # -1.49f

    .line 209
    .line 210
    .line 211
    const v15, 0x3f8b851f    # 1.09f

    .line 212
    .line 213
    .line 214
    const v16, -0x3fd147ae    # -2.73f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v17, 0x41400000    # 12.0f

    .line 221
    .line 222
    const/high16 v18, 0x40000000    # 2.0f

    .line 223
    .line 224
    const/high16 v13, 0x40d80000    # 6.75f

    .line 225
    .line 226
    const v14, 0x40870a3d    # 4.22f

    .line 227
    .line 228
    .line 229
    const v15, 0x4111eb85    # 9.12f

    .line 230
    .line 231
    .line 232
    const/high16 v16, 0x40000000    # 2.0f

    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, 0x40af5c29    # 5.48f

    .line 238
    .line 239
    .line 240
    const v2, 0x40a147ae    # 5.04f

    .line 241
    .line 242
    .line 243
    const/high16 v4, 0x40a80000    # 5.25f

    .line 244
    .line 245
    const v6, 0x400e147b    # 2.22f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v17, 0x41a00000    # 20.0f

    .line 252
    .line 253
    const/high16 v18, 0x41200000    # 10.0f

    .line 254
    .line 255
    const v13, 0x419747ae    # 18.91f

    .line 256
    .line 257
    .line 258
    const v14, 0x40e8a3d7    # 7.27f

    .line 259
    .line 260
    .line 261
    const/high16 v15, 0x41a00000    # 20.0f

    .line 262
    .line 263
    const v16, 0x410828f6    # 8.51f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, -0x3fcc28f6    # -2.81f

    .line 270
    .line 271
    .line 272
    const v18, 0x403f5c29    # 2.99f

    .line 273
    .line 274
    .line 275
    const/4 v13, 0x0

    .line 276
    const v14, 0x3fcb851f    # 1.59f

    .line 277
    .line 278
    .line 279
    const v15, -0x406147ae    # -1.24f

    .line 280
    .line 281
    .line 282
    const v16, 0x4039999a    # 2.9f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x41411eb8    # 12.07f

    .line 289
    .line 290
    .line 291
    const/high16 v2, 0x41b80000    # 23.0f

    .line 292
    .line 293
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x414fd70a    # 12.99f

    .line 297
    .line 298
    .line 299
    const v2, 0x40da8f5c    # 6.83f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    const/16 v16, 0x3800

    .line 313
    .line 314
    const/16 v17, 0x0

    .line 315
    .line 316
    const/high16 v6, 0x3f800000    # 1.0f

    .line 317
    .line 318
    const/high16 v8, 0x3f800000    # 1.0f

    .line 319
    .line 320
    const/4 v7, 0x0

    .line 321
    const/high16 v9, 0x3f800000    # 1.0f

    .line 322
    .line 323
    const/high16 v12, 0x3f800000    # 1.0f

    .line 324
    .line 325
    const/4 v14, 0x0

    .line 326
    const/4 v15, 0x0

    .line 327
    const-string v4, ""

    .line 328
    .line 329
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    sput-object v0, Landroidx/compose/material/icons/filled/IcecreamKt;->_icecream:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 338
    .line 339
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    return-object v0
.end method
