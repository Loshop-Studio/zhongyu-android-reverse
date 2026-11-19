.class public final Landroidx/compose/material/icons/sharp/DataSaverOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_dataSaverOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DataSaverOff",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getDataSaverOff",
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
        "SMAP\nDataSaverOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataSaverOff.kt\nandroidx/compose/material/icons/sharp/DataSaverOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,55:1\n212#2,12:56\n233#2,18:69\n253#2:106\n174#3:68\n705#4,2:87\n717#4,2:89\n719#4,11:95\n72#5,4:91\n*S KotlinDebug\n*F\n+ 1 DataSaverOff.kt\nandroidx/compose/material/icons/sharp/DataSaverOffKt\n*L\n29#1:56,12\n30#1:69,18\n30#1:106\n29#1:68\n30#1:87,2\n30#1:89,2\n30#1:95,11\n30#1:91,4\n*E\n"
    }
.end annotation


# static fields
.field private static _dataSaverOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDataSaverOff(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/DataSaverOffKt;->_dataSaverOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.DataSaverOff"

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
    const/high16 v0, 0x41500000    # 13.0f

    .line 71
    .line 72
    const v2, 0x40033333    # 2.05f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x4041eb85    # 3.03f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v17, 0x40c00000    # 6.0f

    .line 85
    .line 86
    const v18, 0x40dd70a4    # 6.92f

    .line 87
    .line 88
    .line 89
    const v13, 0x4058f5c3    # 3.39f

    .line 90
    .line 91
    .line 92
    const v14, 0x3efae148    # 0.49f

    .line 93
    .line 94
    .line 95
    const/high16 v15, 0x40c00000    # 6.0f

    .line 96
    .line 97
    const v16, 0x4058f5c3    # 3.39f

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v17, -0x410a3d71    # -0.48f

    .line 104
    .line 105
    .line 106
    const v18, 0x40228f5c    # 2.54f

    .line 107
    .line 108
    .line 109
    const/4 v13, 0x0

    .line 110
    const v14, 0x3f666666    # 0.9f

    .line 111
    .line 112
    .line 113
    const v15, -0x41c7ae14    # -0.18f

    .line 114
    .line 115
    .line 116
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, 0x40266666    # 2.6f

    .line 122
    .line 123
    .line 124
    const v2, 0x3fc3d70a    # 1.53f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v17, 0x41b00000    # 22.0f

    .line 131
    .line 132
    const/high16 v18, 0x41400000    # 12.0f

    .line 133
    .line 134
    const v13, 0x41ad70a4    # 21.68f

    .line 135
    .line 136
    .line 137
    const v14, 0x416d47ae    # 14.83f

    .line 138
    .line 139
    .line 140
    const/high16 v15, 0x41b00000    # 22.0f

    .line 141
    .line 142
    const v16, 0x41573333    # 13.45f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v17, 0x41500000    # 13.0f

    .line 149
    .line 150
    const v18, 0x40033333    # 2.05f

    .line 151
    .line 152
    .line 153
    const/high16 v13, 0x41b00000    # 22.0f

    .line 154
    .line 155
    const v14, 0x40da3d71    # 6.82f

    .line 156
    .line 157
    .line 158
    const v15, 0x41906666    # 18.05f

    .line 159
    .line 160
    .line 161
    const v16, 0x40233333    # 2.55f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v0, 0x41400000    # 12.0f

    .line 171
    .line 172
    const/high16 v2, 0x41980000    # 19.0f

    .line 173
    .line 174
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v17, -0x3f200000    # -7.0f

    .line 178
    .line 179
    const/high16 v18, -0x3f200000    # -7.0f

    .line 180
    .line 181
    const v13, -0x3f8851ec    # -3.87f

    .line 182
    .line 183
    .line 184
    const/4 v14, 0x0

    .line 185
    const/high16 v15, -0x3f200000    # -7.0f

    .line 186
    .line 187
    const v16, -0x3fb7ae14    # -3.13f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v17, 0x40c00000    # 6.0f

    .line 194
    .line 195
    const v18, -0x3f228f5c    # -6.92f

    .line 196
    .line 197
    .line 198
    const/4 v13, 0x0

    .line 199
    const v14, -0x3f9e147b    # -3.53f

    .line 200
    .line 201
    .line 202
    const v15, 0x40270a3d    # 2.61f

    .line 203
    .line 204
    .line 205
    const v16, -0x3f323d71    # -6.43f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v0, 0x40033333    # 2.05f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, 0x40000000    # 2.0f

    .line 218
    .line 219
    const/high16 v18, 0x41400000    # 12.0f

    .line 220
    .line 221
    const v13, 0x40be147b    # 5.94f

    .line 222
    .line 223
    .line 224
    const v14, 0x40233333    # 2.55f

    .line 225
    .line 226
    .line 227
    const/high16 v15, 0x40000000    # 2.0f

    .line 228
    .line 229
    const v16, 0x40d9eb85    # 6.81f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, 0x411fd70a    # 9.99f

    .line 236
    .line 237
    .line 238
    const/high16 v18, 0x41200000    # 10.0f

    .line 239
    .line 240
    const/4 v13, 0x0

    .line 241
    const v14, 0x40b0a3d7    # 5.52f

    .line 242
    .line 243
    .line 244
    const v15, 0x408f0a3d    # 4.47f

    .line 245
    .line 246
    .line 247
    const/high16 v16, 0x41200000    # 10.0f

    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, 0x4100f5c3    # 8.06f

    .line 253
    .line 254
    .line 255
    const v18, -0x3f7d1eb8    # -4.09f

    .line 256
    .line 257
    .line 258
    const v13, 0x4053d70a    # 3.31f

    .line 259
    .line 260
    .line 261
    const/4 v14, 0x0

    .line 262
    const v15, 0x40c7ae14    # 6.24f

    .line 263
    .line 264
    .line 265
    const v16, -0x4031eb85    # -1.61f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, -0x3fd9999a    # -2.6f

    .line 272
    .line 273
    .line 274
    const v2, -0x403c28f6    # -1.53f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, 0x41400000    # 12.0f

    .line 281
    .line 282
    const/high16 v18, 0x41980000    # 19.0f

    .line 283
    .line 284
    const v13, 0x41815c29    # 16.17f

    .line 285
    .line 286
    .line 287
    const v14, 0x418fd70a    # 17.98f

    .line 288
    .line 289
    .line 290
    const v15, 0x41635c29    # 14.21f

    .line 291
    .line 292
    .line 293
    const/high16 v16, 0x41980000    # 19.0f

    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    const/16 v16, 0x3800

    .line 306
    .line 307
    const/16 v17, 0x0

    .line 308
    .line 309
    const/high16 v6, 0x3f800000    # 1.0f

    .line 310
    .line 311
    const/high16 v8, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const/4 v7, 0x0

    .line 314
    const/high16 v9, 0x3f800000    # 1.0f

    .line 315
    .line 316
    const/high16 v12, 0x3f800000    # 1.0f

    .line 317
    .line 318
    const/4 v13, 0x0

    .line 319
    const/4 v14, 0x0

    .line 320
    const/4 v15, 0x0

    .line 321
    const-string v4, ""

    .line 322
    .line 323
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    sput-object v0, Landroidx/compose/material/icons/sharp/DataSaverOffKt;->_dataSaverOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 332
    .line 333
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    return-object v0
.end method
