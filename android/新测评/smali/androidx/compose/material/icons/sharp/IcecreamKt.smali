.class public final Landroidx/compose/material/icons/sharp/IcecreamKt;
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
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getIcecream",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nIcecream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icecream.kt\nandroidx/compose/material/icons/sharp/IcecreamKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,55:1\n212#2,12:56\n233#2,18:69\n253#2:106\n174#3:68\n705#4,2:87\n717#4,2:89\n719#4,11:95\n72#5,4:91\n*S KotlinDebug\n*F\n+ 1 Icecream.kt\nandroidx/compose/material/icons/sharp/IcecreamKt\n*L\n29#1:56,12\n30#1:69,18\n30#1:106\n29#1:68\n30#1:87,2\n30#1:89,2\n30#1:95,11\n30#1:91,4\n*E\n"
    }
.end annotation


# static fields
.field private static _icecream:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getIcecream(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/IcecreamKt;->_icecream:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Icecream"

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
    const v0, 0x41930a3d    # 18.38f

    .line 71
    .line 72
    .line 73
    const v2, 0x40c7ae14    # 6.24f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v18, 0x3f800000    # 1.0f

    .line 82
    .line 83
    const v13, 0x418e51ec    # 17.79f

    .line 84
    .line 85
    .line 86
    const v14, 0x404f5c29    # 3.24f

    .line 87
    .line 88
    .line 89
    const v15, 0x41723d71    # 15.14f

    .line 90
    .line 91
    .line 92
    const/high16 v16, 0x3f800000    # 1.0f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v0, 0x404f5c29    # 3.24f

    .line 98
    .line 99
    .line 100
    const v2, 0x40b3d70a    # 5.62f

    .line 101
    .line 102
    .line 103
    const v4, 0x40c7ae14    # 6.24f

    .line 104
    .line 105
    .line 106
    const v6, 0x40c6b852    # 6.21f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v17, 0x40400000    # 3.0f

    .line 113
    .line 114
    const/high16 v18, 0x41200000    # 10.0f

    .line 115
    .line 116
    const v13, 0x40828f5c    # 4.08f

    .line 117
    .line 118
    .line 119
    const v14, 0x40d9eb85    # 6.81f

    .line 120
    .line 121
    .line 122
    const/high16 v15, 0x40400000    # 3.0f

    .line 123
    .line 124
    const v16, 0x4104a3d7    # 8.29f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v17, 0x40800000    # 4.0f

    .line 131
    .line 132
    const/high16 v18, 0x40800000    # 4.0f

    .line 133
    .line 134
    const/4 v13, 0x0

    .line 135
    const v14, 0x400d70a4    # 2.21f

    .line 136
    .line 137
    .line 138
    const v15, 0x3fe51eb8    # 1.79f

    .line 139
    .line 140
    .line 141
    const/high16 v16, 0x40800000    # 4.0f

    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v17, 0x3eae147b    # 0.34f

    .line 147
    .line 148
    .line 149
    const v18, -0x435c28f6    # -0.02f

    .line 150
    .line 151
    .line 152
    const v13, 0x3df5c28f    # 0.12f

    .line 153
    .line 154
    .line 155
    const/4 v14, 0x0

    .line 156
    const v15, 0x3e6b851f    # 0.23f

    .line 157
    .line 158
    .line 159
    const v16, -0x435c28f6    # -0.02f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v0, 0x41411eb8    # 12.07f

    .line 166
    .line 167
    .line 168
    const/high16 v2, 0x41b80000    # 23.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x4093851f    # 4.61f

    .line 174
    .line 175
    .line 176
    const v2, -0x3eef851f    # -9.03f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v17, 0x41880000    # 17.0f

    .line 183
    .line 184
    const/high16 v18, 0x41600000    # 14.0f

    .line 185
    .line 186
    const v13, 0x418651ec    # 16.79f

    .line 187
    .line 188
    .line 189
    const v14, 0x415fae14    # 13.98f

    .line 190
    .line 191
    .line 192
    const v15, 0x41871eb8    # 16.89f

    .line 193
    .line 194
    .line 195
    const/high16 v16, 0x41600000    # 14.0f

    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v17, 0x40800000    # 4.0f

    .line 201
    .line 202
    const/high16 v18, -0x3f800000    # -4.0f

    .line 203
    .line 204
    const v13, 0x400d70a4    # 2.21f

    .line 205
    .line 206
    .line 207
    const/4 v14, 0x0

    .line 208
    const/high16 v15, 0x40800000    # 4.0f

    .line 209
    .line 210
    const v16, -0x401ae148    # -1.79f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, 0x41930a3d    # 18.38f

    .line 217
    .line 218
    .line 219
    const v18, 0x40c7ae14    # 6.24f

    .line 220
    .line 221
    .line 222
    const/high16 v13, 0x41a80000    # 21.0f

    .line 223
    .line 224
    const v14, 0x4104a3d7    # 8.29f

    .line 225
    .line 226
    .line 227
    const v15, 0x419f5c29    # 19.92f

    .line 228
    .line 229
    .line 230
    const v16, 0x40d9eb85    # 6.81f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v0, 0x41950a3d    # 18.63f

    .line 240
    .line 241
    .line 242
    const v2, 0x4140cccd    # 12.05f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, -0x3fd147ae    # -2.73f

    .line 249
    .line 250
    .line 251
    const v2, -0x3f5947ae    # -5.21f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v17, 0x41400000    # 12.0f

    .line 258
    .line 259
    const/high16 v18, 0x41600000    # 14.0f

    .line 260
    .line 261
    const v13, 0x41226666    # 10.15f

    .line 262
    .line 263
    .line 264
    const v14, 0x415ca3d7    # 13.79f

    .line 265
    .line 266
    .line 267
    const v15, 0x4130f5c3    # 11.06f

    .line 268
    .line 269
    .line 270
    const/high16 v16, 0x41600000    # 14.0f

    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, 0x402e147b    # 2.72f

    .line 276
    .line 277
    .line 278
    const v18, -0x40e66666    # -0.6f

    .line 279
    .line 280
    .line 281
    const v13, 0x3f733333    # 0.95f

    .line 282
    .line 283
    .line 284
    const/4 v14, 0x0

    .line 285
    const v15, 0x3ff0a3d7    # 1.88f

    .line 286
    .line 287
    .line 288
    const v16, -0x41a8f5c3    # -0.21f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x41950a3d    # 18.63f

    .line 295
    .line 296
    .line 297
    const v2, 0x4140cccd    # 12.05f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    const/16 v16, 0x3800

    .line 311
    .line 312
    const/16 v17, 0x0

    .line 313
    .line 314
    const/high16 v6, 0x3f800000    # 1.0f

    .line 315
    .line 316
    const/high16 v8, 0x3f800000    # 1.0f

    .line 317
    .line 318
    const/4 v7, 0x0

    .line 319
    const/high16 v9, 0x3f800000    # 1.0f

    .line 320
    .line 321
    const/high16 v12, 0x3f800000    # 1.0f

    .line 322
    .line 323
    const/4 v13, 0x0

    .line 324
    const/4 v15, 0x0

    .line 325
    const-string v4, ""

    .line 326
    .line 327
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    sput-object v0, Landroidx/compose/material/icons/sharp/IcecreamKt;->_icecream:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 336
    .line 337
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    return-object v0
.end method
