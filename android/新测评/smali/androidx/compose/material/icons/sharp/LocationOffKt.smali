.class public final Landroidx/compose/material/icons/sharp/LocationOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_locationOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "LocationOff",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getLocationOff",
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
        "SMAP\nLocationOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationOff.kt\nandroidx/compose/material/icons/sharp/LocationOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,57:1\n212#2,12:58\n233#2,18:71\n253#2:108\n174#3:70\n705#4,2:89\n717#4,2:91\n719#4,11:97\n72#5,4:93\n*S KotlinDebug\n*F\n+ 1 LocationOff.kt\nandroidx/compose/material/icons/sharp/LocationOffKt\n*L\n29#1:58,12\n30#1:71,18\n30#1:108\n29#1:70\n30#1:89,2\n30#1:91,2\n30#1:97,11\n30#1:93,4\n*E\n"
    }
.end annotation


# static fields
.field private static _locationOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocationOff(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/LocationOffKt;->_locationOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.LocationOff"

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
    const v0, 0x40370a3d    # 2.86f

    .line 71
    .line 72
    .line 73
    const v2, 0x405a3d71    # 3.41f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x4088a3d7    # 4.27f

    .line 80
    .line 81
    .line 82
    const/high16 v2, 0x40000000    # 2.0f

    .line 83
    .line 84
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v0, 0x404b851f    # 3.18f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v17, 0x40a00000    # 5.0f

    .line 94
    .line 95
    const/high16 v18, 0x41100000    # 9.0f

    .line 96
    .line 97
    const v13, 0x40a23d71    # 5.07f

    .line 98
    .line 99
    .line 100
    const v14, 0x40fe6666    # 7.95f

    .line 101
    .line 102
    .line 103
    const/high16 v15, 0x40a00000    # 5.0f

    .line 104
    .line 105
    const v16, 0x4107851f    # 8.47f

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v17, 0x40e00000    # 7.0f

    .line 112
    .line 113
    const/high16 v18, 0x41500000    # 13.0f

    .line 114
    .line 115
    const/4 v13, 0x0

    .line 116
    const/high16 v14, 0x40a80000    # 5.25f

    .line 117
    .line 118
    const/high16 v15, 0x40e00000    # 7.0f

    .line 119
    .line 120
    const/high16 v16, 0x41500000    # 13.0f

    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v0, 0x405851ec    # 3.38f

    .line 126
    .line 127
    .line 128
    const v2, -0x3f74cccd    # -4.35f

    .line 129
    .line 130
    .line 131
    const v4, 0x3fd5c28f    # 1.67f

    .line 132
    .line 133
    .line 134
    const v6, -0x40133333    # -1.85f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, 0x4195d70a    # 18.73f

    .line 141
    .line 142
    .line 143
    const/high16 v2, 0x41a80000    # 21.0f

    .line 144
    .line 145
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v0, 0x3fb47ae1    # 1.41f

    .line 149
    .line 150
    .line 151
    const v2, -0x404b851f    # -1.41f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, 0x40370a3d    # 2.86f

    .line 158
    .line 159
    .line 160
    const v2, 0x405a3d71    # 3.41f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v0, 0x41400000    # 12.0f

    .line 170
    .line 171
    const/high16 v2, 0x40000000    # 2.0f

    .line 172
    .line 173
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v17, -0x3f680000    # -4.75f

    .line 177
    .line 178
    const v18, 0x3fee147b    # 1.86f

    .line 179
    .line 180
    .line 181
    const v13, -0x40147ae1    # -1.84f

    .line 182
    .line 183
    .line 184
    const/4 v14, 0x0

    .line 185
    const/high16 v15, -0x3fa00000    # -3.5f

    .line 186
    .line 187
    const v16, 0x3f35c28f    # 0.71f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, 0x404c28f6    # 3.19f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v17, 0x3fc7ae14    # 1.56f

    .line 200
    .line 201
    .line 202
    const v18, -0x40f33333    # -0.55f

    .line 203
    .line 204
    .line 205
    const v13, 0x3edc28f6    # 0.43f

    .line 206
    .line 207
    .line 208
    const v14, -0x4151eb85    # -0.34f

    .line 209
    .line 210
    .line 211
    const v15, 0x3f7851ec    # 0.97f

    .line 212
    .line 213
    .line 214
    const v16, -0x40f33333    # -0.55f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v17, 0x40200000    # 2.5f

    .line 221
    .line 222
    const/high16 v18, 0x40200000    # 2.5f

    .line 223
    .line 224
    const v13, 0x3fb0a3d7    # 1.38f

    .line 225
    .line 226
    .line 227
    const/4 v14, 0x0

    .line 228
    const/high16 v15, 0x40200000    # 2.5f

    .line 229
    .line 230
    const v16, 0x3f8f5c29    # 1.12f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, -0x40f0a3d7    # -0.56f

    .line 237
    .line 238
    .line 239
    const v18, 0x3fc7ae14    # 1.56f

    .line 240
    .line 241
    .line 242
    const/4 v13, 0x0

    .line 243
    const v14, 0x3f170a3d    # 0.59f

    .line 244
    .line 245
    .line 246
    const v15, -0x41a8f5c3    # -0.21f

    .line 247
    .line 248
    .line 249
    const v16, 0x3f90a3d7    # 1.13f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, 0x40633333    # 3.55f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v17, 0x41980000    # 19.0f

    .line 262
    .line 263
    const/high16 v18, 0x41100000    # 9.0f

    .line 264
    .line 265
    const v13, 0x4192f5c3    # 18.37f

    .line 266
    .line 267
    .line 268
    const v14, 0x4145c28f    # 12.36f

    .line 269
    .line 270
    .line 271
    const/high16 v15, 0x41980000    # 19.0f

    .line 272
    .line 273
    const v16, 0x41291eb8    # 10.57f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v17, -0x3f200000    # -7.0f

    .line 280
    .line 281
    const/high16 v18, -0x3f200000    # -7.0f

    .line 282
    .line 283
    const/4 v13, 0x0

    .line 284
    const v14, -0x3f8851ec    # -3.87f

    .line 285
    .line 286
    .line 287
    const v15, -0x3fb7ae14    # -3.13f

    .line 288
    .line 289
    .line 290
    const/high16 v16, -0x3f200000    # -7.0f

    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    const/16 v16, 0x3800

    .line 303
    .line 304
    const/16 v17, 0x0

    .line 305
    .line 306
    const/high16 v6, 0x3f800000    # 1.0f

    .line 307
    .line 308
    const/high16 v8, 0x3f800000    # 1.0f

    .line 309
    .line 310
    const/4 v7, 0x0

    .line 311
    const/high16 v9, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const/high16 v12, 0x3f800000    # 1.0f

    .line 314
    .line 315
    const/4 v14, 0x0

    .line 316
    const/4 v15, 0x0

    .line 317
    const-string v4, ""

    .line 318
    .line 319
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    sput-object v0, Landroidx/compose/material/icons/sharp/LocationOffKt;->_locationOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 328
    .line 329
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    return-object v0
.end method
