.class public final Landroidx/compose/material/icons/outlined/DomainVerificationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _domainVerification:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDomainVerification(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 21

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/DomainVerificationKt;->_domainVerification:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

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
    const-string v2, "Outlined.DomainVerification"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/n;)V

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
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v6, 0x4184cccd    # 16.6f

    .line 71
    .line 72
    .line 73
    const v7, 0x412e147b    # 10.88f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v6, -0x404a3d71    # -1.42f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v7, -0x3f7851ec    # -4.24f

    .line 86
    .line 87
    .line 88
    const/high16 v8, 0x40880000    # 4.25f

    .line 89
    .line 90
    invoke-virtual {v4, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v7, -0x3ff851ec    # -2.12f

    .line 94
    .line 95
    .line 96
    const v8, -0x3ff7ae14    # -2.13f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v7, 0x3fb5c28f    # 1.42f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v6, 0x40628f5c    # 3.54f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    const/16 v16, 0x3800

    .line 122
    .line 123
    const/16 v17, 0x0

    .line 124
    .line 125
    move-object v6, v2

    .line 126
    move-object v2, v4

    .line 127
    const-string v4, ""

    .line 128
    .line 129
    move-object v7, v6

    .line 130
    const/high16 v6, 0x3f800000    # 1.0f

    .line 131
    .line 132
    move-object v8, v7

    .line 133
    const/4 v7, 0x0

    .line 134
    move-object v9, v8

    .line 135
    const/high16 v8, 0x3f800000    # 1.0f

    .line 136
    .line 137
    move-object v12, v9

    .line 138
    const/high16 v9, 0x3f800000    # 1.0f

    .line 139
    .line 140
    move-object v13, v12

    .line 141
    const/high16 v12, 0x3f800000    # 1.0f

    .line 142
    .line 143
    move-object v14, v13

    .line 144
    const/4 v13, 0x0

    .line 145
    move-object v15, v14

    .line 146
    const/4 v14, 0x0

    .line 147
    move-object/from16 v20, v15

    .line 148
    .line 149
    const/4 v15, 0x0

    .line 150
    move-object/from16 p0, v0

    .line 151
    .line 152
    move-object/from16 v0, v20

    .line 153
    .line 154
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 155
    .line 156
    .line 157
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 162
    .line 163
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 164
    .line 165
    .line 166
    move-result-wide v6

    .line 167
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 175
    .line 176
    .line 177
    move-result v11

    .line 178
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    const/high16 v0, 0x40800000    # 4.0f

    .line 184
    .line 185
    const/high16 v2, 0x41980000    # 19.0f

    .line 186
    .line 187
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v0, 0x40a00000    # 5.0f

    .line 191
    .line 192
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v17, 0x40400000    # 3.0f

    .line 196
    .line 197
    const/high16 v18, 0x40c00000    # 6.0f

    .line 198
    .line 199
    const v13, 0x4078f5c3    # 3.89f

    .line 200
    .line 201
    .line 202
    const/high16 v14, 0x40800000    # 4.0f

    .line 203
    .line 204
    const/high16 v15, 0x40400000    # 3.0f

    .line 205
    .line 206
    const v16, 0x409ccccd    # 4.9f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v4, 0x41400000    # 12.0f

    .line 213
    .line 214
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, 0x40000000    # 2.0f

    .line 218
    .line 219
    const/high16 v18, 0x40000000    # 2.0f

    .line 220
    .line 221
    const/4 v13, 0x0

    .line 222
    const v14, 0x3f8ccccd    # 1.1f

    .line 223
    .line 224
    .line 225
    const v15, 0x3f63d70a    # 0.89f

    .line 226
    .line 227
    .line 228
    const/high16 v16, 0x40000000    # 2.0f

    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v4, 0x41600000    # 14.0f

    .line 234
    .line 235
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v18, -0x40000000    # -2.0f

    .line 239
    .line 240
    const v13, 0x3f8ccccd    # 1.1f

    .line 241
    .line 242
    .line 243
    const/4 v14, 0x0

    .line 244
    const/high16 v15, 0x40000000    # 2.0f

    .line 245
    .line 246
    const v16, -0x4099999a    # -0.9f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v6, 0x40c00000    # 6.0f

    .line 253
    .line 254
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v17, 0x41980000    # 19.0f

    .line 258
    .line 259
    const/high16 v18, 0x40800000    # 4.0f

    .line 260
    .line 261
    const/high16 v13, 0x41a80000    # 21.0f

    .line 262
    .line 263
    const v14, 0x409ccccd    # 4.9f

    .line 264
    .line 265
    .line 266
    const v15, 0x41a0e148    # 20.11f

    .line 267
    .line 268
    .line 269
    const/high16 v16, 0x40800000    # 4.0f

    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v6, 0x41900000    # 18.0f

    .line 278
    .line 279
    invoke-virtual {v12, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, 0x41000000    # 8.0f

    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    const/16 v16, 0x3800

    .line 304
    .line 305
    const/16 v17, 0x0

    .line 306
    .line 307
    const-string v4, ""

    .line 308
    .line 309
    const/high16 v6, 0x3f800000    # 1.0f

    .line 310
    .line 311
    const/4 v7, 0x0

    .line 312
    const/high16 v12, 0x3f800000    # 1.0f

    .line 313
    .line 314
    const/4 v13, 0x0

    .line 315
    const/4 v14, 0x0

    .line 316
    const/4 v15, 0x0

    .line 317
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    sput-object v0, Landroidx/compose/material/icons/outlined/DomainVerificationKt;->_domainVerification:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 326
    .line 327
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    return-object v0
.end method
