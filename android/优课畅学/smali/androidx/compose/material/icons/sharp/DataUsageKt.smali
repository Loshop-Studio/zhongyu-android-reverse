.class public final Landroidx/compose/material/icons/sharp/DataUsageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _dataUsage:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDataUsage(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/DataUsageKt;->_dataUsage:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.DataUsage"

    .line 33
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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    const v17, 0x3f6147ae    # 0.88f

    .line 131
    .line 132
    .line 133
    const v18, -0x3f7dc28f    # -4.07f

    .line 134
    .line 135
    .line 136
    const v13, 0x3f0f5c29    # 0.56f

    .line 137
    .line 138
    .line 139
    const v14, -0x406147ae    # -1.24f

    .line 140
    .line 141
    .line 142
    const v15, 0x3f6147ae    # 0.88f

    .line 143
    .line 144
    .line 145
    const v16, -0x3fd851ec    # -2.62f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 152
    .line 153
    const v18, -0x3ee0cccd    # -9.95f

    .line 154
    .line 155
    .line 156
    const/4 v13, 0x0

    .line 157
    const v14, -0x3f5a3d71    # -5.18f

    .line 158
    .line 159
    .line 160
    const v15, -0x3f833333    # -3.95f

    .line 161
    .line 162
    .line 163
    const v16, -0x3ee8cccd    # -9.45f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v0, 0x41400000    # 12.0f

    .line 173
    .line 174
    const/high16 v2, 0x41980000    # 19.0f

    .line 175
    .line 176
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, -0x3f200000    # -7.0f

    .line 180
    .line 181
    const/high16 v18, -0x3f200000    # -7.0f

    .line 182
    .line 183
    const v13, -0x3f8851ec    # -3.87f

    .line 184
    .line 185
    .line 186
    const/4 v14, 0x0

    .line 187
    const/high16 v15, -0x3f200000    # -7.0f

    .line 188
    .line 189
    const v16, -0x3fb7ae14    # -3.13f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v17, 0x40c00000    # 6.0f

    .line 196
    .line 197
    const v18, -0x3f228f5c    # -6.92f

    .line 198
    .line 199
    .line 200
    const/4 v13, 0x0

    .line 201
    const v14, -0x3f9e147b    # -3.53f

    .line 202
    .line 203
    .line 204
    const v15, 0x40270a3d    # 2.61f

    .line 205
    .line 206
    .line 207
    const v16, -0x3f323d71    # -6.43f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, 0x40033333    # 2.05f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 220
    .line 221
    const v18, 0x411f3333    # 9.95f

    .line 222
    .line 223
    .line 224
    const v13, -0x3f5e147b    # -5.06f

    .line 225
    .line 226
    .line 227
    const/high16 v14, 0x3f000000    # 0.5f

    .line 228
    .line 229
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 230
    .line 231
    const v16, 0x409851ec    # 4.76f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, 0x411fd70a    # 9.99f

    .line 238
    .line 239
    .line 240
    const/high16 v18, 0x41200000    # 10.0f

    .line 241
    .line 242
    const/4 v13, 0x0

    .line 243
    const v14, 0x40b0a3d7    # 5.52f

    .line 244
    .line 245
    .line 246
    const v15, 0x408f0a3d    # 4.47f

    .line 247
    .line 248
    .line 249
    const/high16 v16, 0x41200000    # 10.0f

    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, 0x4100f5c3    # 8.06f

    .line 255
    .line 256
    .line 257
    const v18, -0x3f7d1eb8    # -4.09f

    .line 258
    .line 259
    .line 260
    const v13, 0x4053d70a    # 3.31f

    .line 261
    .line 262
    .line 263
    const/4 v14, 0x0

    .line 264
    const v15, 0x40c7ae14    # 6.24f

    .line 265
    .line 266
    .line 267
    const v16, -0x4031eb85    # -1.61f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, -0x3fd9999a    # -2.6f

    .line 274
    .line 275
    .line 276
    const v2, -0x403c28f6    # -1.53f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v17, 0x41400000    # 12.0f

    .line 283
    .line 284
    const/high16 v18, 0x41980000    # 19.0f

    .line 285
    .line 286
    const v13, 0x41815c29    # 16.17f

    .line 287
    .line 288
    .line 289
    const v14, 0x418fd70a    # 17.98f

    .line 290
    .line 291
    .line 292
    const v15, 0x41635c29    # 14.21f

    .line 293
    .line 294
    .line 295
    const/high16 v16, 0x41980000    # 19.0f

    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    const/16 v16, 0x3800

    .line 308
    .line 309
    const/16 v17, 0x0

    .line 310
    .line 311
    const/high16 v6, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const/high16 v8, 0x3f800000    # 1.0f

    .line 314
    .line 315
    const/4 v7, 0x0

    .line 316
    const/high16 v9, 0x3f800000    # 1.0f

    .line 317
    .line 318
    const/high16 v12, 0x3f800000    # 1.0f

    .line 319
    .line 320
    const/4 v13, 0x0

    .line 321
    const/4 v14, 0x0

    .line 322
    const/4 v15, 0x0

    .line 323
    const-string v4, ""

    .line 324
    .line 325
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    sput-object v0, Landroidx/compose/material/icons/sharp/DataUsageKt;->_dataUsage:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 334
    .line 335
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    return-object v0
.end method
