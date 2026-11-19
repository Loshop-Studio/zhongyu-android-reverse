.class public final Landroidx/compose/material/icons/outlined/NightlightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_nightlight",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Nightlight",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getNightlight",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nNightlight.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nightlight.kt\nandroidx/compose/material/icons/outlined/NightlightKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,53:1\n212#2,12:54\n233#2,18:67\n253#2:104\n174#3:66\n705#4,2:85\n717#4,2:87\n719#4,11:93\n72#5,4:89\n*S KotlinDebug\n*F\n+ 1 Nightlight.kt\nandroidx/compose/material/icons/outlined/NightlightKt\n*L\n29#1:54,12\n30#1:67,18\n30#1:104\n29#1:66\n30#1:85,2\n30#1:87,2\n30#1:93,11\n30#1:89,4\n*E\n"
    }
.end annotation


# static fields
.field private static _nightlight:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNightlight(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/NightlightKt;->_nightlight:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Nightlight"

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
    const/high16 v0, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v2, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x3f8147ae    # 1.01f

    .line 78
    .line 79
    .line 80
    const v18, 0x3d8f5c29    # 0.07f

    .line 81
    .line 82
    .line 83
    const v13, 0x3eae147b    # 0.34f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, 0x3f2e147b    # 0.68f

    .line 88
    .line 89
    .line 90
    const v16, 0x3ca3d70a    # 0.02f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v17, 0x41400000    # 12.0f

    .line 97
    .line 98
    const/high16 v18, 0x41400000    # 12.0f

    .line 99
    .line 100
    const v13, 0x4151999a    # 13.1f

    .line 101
    .line 102
    .line 103
    const v14, 0x40c75c29    # 6.23f

    .line 104
    .line 105
    .line 106
    const/high16 v15, 0x41400000    # 12.0f

    .line 107
    .line 108
    const v16, 0x4110cccd    # 9.05f

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v0, 0x4040a3d7    # 3.01f

    .line 115
    .line 116
    .line 117
    const v2, 0x40fdc28f    # 7.93f

    .line 118
    .line 119
    .line 120
    const v4, 0x3f8ccccd    # 1.1f

    .line 121
    .line 122
    .line 123
    const v6, 0x40b8a3d7    # 5.77f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v17, 0x41600000    # 14.0f

    .line 130
    .line 131
    const/high16 v18, 0x41a00000    # 20.0f

    .line 132
    .line 133
    const v13, 0x416ae148    # 14.68f

    .line 134
    .line 135
    .line 136
    const v14, 0x419fd70a    # 19.98f

    .line 137
    .line 138
    .line 139
    const v15, 0x416570a4    # 14.34f

    .line 140
    .line 141
    .line 142
    const/high16 v16, 0x41a00000    # 20.0f

    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v17, -0x3f000000    # -8.0f

    .line 148
    .line 149
    const/high16 v18, -0x3f000000    # -8.0f

    .line 150
    .line 151
    const v13, -0x3f72e148    # -4.41f

    .line 152
    .line 153
    .line 154
    const/4 v14, 0x0

    .line 155
    const/high16 v15, -0x3f000000    # -8.0f

    .line 156
    .line 157
    const v16, -0x3f9a3d71    # -3.59f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v0, 0x411970a4    # 9.59f

    .line 164
    .line 165
    .line 166
    const/high16 v2, 0x40800000    # 4.0f

    .line 167
    .line 168
    const/high16 v4, 0x41600000    # 14.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, 0x40000000    # 2.0f

    .line 174
    .line 175
    const/high16 v2, 0x41600000    # 14.0f

    .line 176
    .line 177
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v17, 0x40800000    # 4.0f

    .line 181
    .line 182
    const/high16 v18, 0x41400000    # 12.0f

    .line 183
    .line 184
    const v13, 0x4107ae14    # 8.48f

    .line 185
    .line 186
    .line 187
    const/high16 v14, 0x40000000    # 2.0f

    .line 188
    .line 189
    const/high16 v15, 0x40800000    # 4.0f

    .line 190
    .line 191
    const v16, 0x40cf5c29    # 6.48f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v0, 0x408f5c29    # 4.48f

    .line 198
    .line 199
    .line 200
    const/high16 v2, 0x41200000    # 10.0f

    .line 201
    .line 202
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v17, 0x40a00000    # 5.0f

    .line 206
    .line 207
    const v18, -0x40533333    # -1.35f

    .line 208
    .line 209
    .line 210
    const v13, 0x3fe8f5c3    # 1.82f

    .line 211
    .line 212
    .line 213
    const/4 v14, 0x0

    .line 214
    const v15, 0x4061eb85    # 3.53f

    .line 215
    .line 216
    .line 217
    const/high16 v16, -0x41000000    # -0.5f

    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v17, -0x3f600000    # -5.0f

    .line 223
    .line 224
    const v18, -0x3ef5999a    # -8.65f

    .line 225
    .line 226
    .line 227
    const v13, -0x3fc0a3d7    # -2.99f

    .line 228
    .line 229
    .line 230
    const v14, -0x40228f5c    # -1.73f

    .line 231
    .line 232
    .line 233
    const/high16 v15, -0x3f600000    # -5.0f

    .line 234
    .line 235
    const v16, -0x3f61999a    # -4.95f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v0, 0x40a00000    # 5.0f

    .line 242
    .line 243
    const v2, -0x3ef5999a    # -8.65f

    .line 244
    .line 245
    .line 246
    const v4, 0x4000a3d7    # 2.01f

    .line 247
    .line 248
    .line 249
    const v6, -0x3f228f5c    # -6.92f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v17, 0x41600000    # 14.0f

    .line 256
    .line 257
    const/high16 v18, 0x40000000    # 2.0f

    .line 258
    .line 259
    const v13, 0x418c3d71    # 17.53f

    .line 260
    .line 261
    .line 262
    const/high16 v14, 0x40200000    # 2.5f

    .line 263
    .line 264
    const v15, 0x417d1eb8    # 15.82f

    .line 265
    .line 266
    .line 267
    const/high16 v16, 0x40000000    # 2.0f

    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v0, 0x40000000    # 2.0f

    .line 273
    .line 274
    const/high16 v2, 0x41600000    # 14.0f

    .line 275
    .line 276
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    const/16 v16, 0x3800

    .line 287
    .line 288
    const/16 v17, 0x0

    .line 289
    .line 290
    const/high16 v6, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/high16 v8, 0x3f800000    # 1.0f

    .line 293
    .line 294
    const/4 v7, 0x0

    .line 295
    const/high16 v9, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const/high16 v12, 0x3f800000    # 1.0f

    .line 298
    .line 299
    const/4 v13, 0x0

    .line 300
    const/4 v14, 0x0

    .line 301
    const/4 v15, 0x0

    .line 302
    const-string v4, ""

    .line 303
    .line 304
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    sput-object v0, Landroidx/compose/material/icons/outlined/NightlightKt;->_nightlight:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 313
    .line 314
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    return-object v0
.end method
