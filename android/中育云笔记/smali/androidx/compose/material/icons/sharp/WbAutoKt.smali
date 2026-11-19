.class public final Landroidx/compose/material/icons/sharp/WbAutoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wbAuto:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWbAuto(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/WbAutoKt;->_wbAuto:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.WbAuto"

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
    const v0, 0x40db3333    # 6.85f

    .line 71
    .line 72
    .line 73
    const v2, 0x414a6666    # 12.65f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40133333    # 2.3f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v0, 0x41000000    # 8.0f

    .line 86
    .line 87
    const/high16 v2, 0x41100000    # 9.0f

    .line 88
    .line 89
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v4, -0x406ccccd    # -1.15f

    .line 93
    .line 94
    .line 95
    const v6, 0x4069999a    # 3.65f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v4, 0x41b00000    # 22.0f

    .line 105
    .line 106
    const/high16 v6, 0x40e00000    # 7.0f

    .line 107
    .line 108
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v7, -0x40666666    # -1.2f

    .line 112
    .line 113
    .line 114
    const v8, 0x40c947ae    # 6.29f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v7, 0x419a6666    # 19.3f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v7, -0x40333333    # -1.6f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v7, -0x404147ae    # -1.49f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v7, 0x41700000    # 15.0f

    .line 139
    .line 140
    invoke-virtual {v12, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v7, -0x40bd70a4    # -0.76f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v17, 0x41000000    # 8.0f

    .line 150
    .line 151
    const/high16 v18, 0x40800000    # 4.0f

    .line 152
    .line 153
    const v13, 0x414c51ec    # 12.77f

    .line 154
    .line 155
    .line 156
    const v14, 0x40a570a4    # 5.17f

    .line 157
    .line 158
    .line 159
    const v15, 0x41287ae1    # 10.53f

    .line 160
    .line 161
    .line 162
    const/high16 v16, 0x40800000    # 4.0f

    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v17, -0x3f000000    # -8.0f

    .line 168
    .line 169
    const/high16 v18, 0x41000000    # 8.0f

    .line 170
    .line 171
    const v13, -0x3f728f5c    # -4.42f

    .line 172
    .line 173
    .line 174
    const/4 v14, 0x0

    .line 175
    const/high16 v15, -0x3f000000    # -8.0f

    .line 176
    .line 177
    const v16, 0x40651eb8    # 3.58f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v7, 0x40651eb8    # 3.58f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v7, v0, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, 0x40e4cccd    # 7.15f

    .line 190
    .line 191
    .line 192
    const v18, -0x3f723d71    # -4.43f

    .line 193
    .line 194
    .line 195
    const v13, 0x404851ec    # 3.13f

    .line 196
    .line 197
    .line 198
    const v15, 0x40bae148    # 5.84f

    .line 199
    .line 200
    .line 201
    const v16, -0x401851ec    # -1.81f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x3dcccccd    # 0.1f

    .line 208
    .line 209
    .line 210
    const v7, 0x3edc28f6    # 0.43f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v0, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v0, 0x41880000    # 17.0f

    .line 217
    .line 218
    const/high16 v7, 0x41800000    # 16.0f

    .line 219
    .line 220
    invoke-virtual {v12, v0, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 224
    .line 225
    const v8, -0x3f3ccccd    # -6.1f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12, v0, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v0, 0x41a00000    # 20.0f

    .line 232
    .line 233
    invoke-virtual {v12, v0, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 237
    .line 238
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, 0x40033333    # 2.05f

    .line 242
    .line 243
    .line 244
    const/high16 v8, -0x3ef00000    # -9.0f

    .line 245
    .line 246
    invoke-virtual {v12, v0, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, 0x4124cccd    # 10.3f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v0, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v0, -0x40000000    # -2.0f

    .line 262
    .line 263
    const v4, -0x40cccccd    # -0.7f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, 0x40cccccd    # 6.4f

    .line 270
    .line 271
    .line 272
    const/high16 v8, 0x41600000    # 14.0f

    .line 273
    .line 274
    invoke-virtual {v12, v0, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v0, 0x40000000    # 2.0f

    .line 278
    .line 279
    invoke-virtual {v12, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v4, 0x40733333    # 3.8f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x404ccccd    # 3.2f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, -0x400ccccd    # -1.9f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    const/16 v16, 0x3800

    .line 314
    .line 315
    const/16 v17, 0x0

    .line 316
    .line 317
    const-string v4, ""

    .line 318
    .line 319
    const/high16 v6, 0x3f800000    # 1.0f

    .line 320
    .line 321
    const/4 v7, 0x0

    .line 322
    const/high16 v8, 0x3f800000    # 1.0f

    .line 323
    .line 324
    const/high16 v9, 0x3f800000    # 1.0f

    .line 325
    .line 326
    const/high16 v12, 0x3f800000    # 1.0f

    .line 327
    .line 328
    const/4 v13, 0x0

    .line 329
    const/4 v15, 0x0

    .line 330
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    sput-object v0, Landroidx/compose/material/icons/sharp/WbAutoKt;->_wbAuto:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 339
    .line 340
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    return-object v0
.end method
