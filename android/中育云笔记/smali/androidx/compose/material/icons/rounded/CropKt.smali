.class public final Landroidx/compose/material/icons/rounded/CropKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _crop:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCrop(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CropKt;->_crop:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Crop"

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
    const/high16 v0, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v2, 0x41880000    # 17.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x41980000    # 19.0f

    .line 83
    .line 84
    const/high16 v2, 0x40e00000    # 7.0f

    .line 85
    .line 86
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v17, -0x40000000    # -2.0f

    .line 90
    .line 91
    const/high16 v18, -0x40000000    # -2.0f

    .line 92
    .line 93
    const/4 v13, 0x0

    .line 94
    const v14, -0x40733333    # -1.1f

    .line 95
    .line 96
    .line 97
    const v15, -0x4099999a    # -0.9f

    .line 98
    .line 99
    .line 100
    const/high16 v16, -0x40000000    # -2.0f

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v0, 0x41100000    # 9.0f

    .line 106
    .line 107
    const/high16 v2, 0x40a00000    # 5.0f

    .line 108
    .line 109
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v0, 0x40000000    # 2.0f

    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x40e00000    # 7.0f

    .line 118
    .line 119
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v17, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/high16 v18, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const v13, 0x3f0ccccd    # 0.55f

    .line 127
    .line 128
    .line 129
    const/4 v14, 0x0

    .line 130
    const/high16 v15, 0x3f800000    # 1.0f

    .line 131
    .line 132
    const v16, 0x3ee66666    # 0.45f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v0, 0x41000000    # 8.0f

    .line 145
    .line 146
    const/high16 v2, 0x41880000    # 17.0f

    .line 147
    .line 148
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, -0x40800000    # -1.0f

    .line 152
    .line 153
    const/high16 v18, -0x40800000    # -1.0f

    .line 154
    .line 155
    const v13, -0x40f33333    # -0.55f

    .line 156
    .line 157
    .line 158
    const/high16 v15, -0x40800000    # -1.0f

    .line 159
    .line 160
    const v16, -0x4119999a    # -0.45f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x40e00000    # 7.0f

    .line 167
    .line 168
    const/high16 v2, 0x40000000    # 2.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/4 v13, 0x0

    .line 174
    const v14, -0x40f33333    # -0.55f

    .line 175
    .line 176
    .line 177
    const v15, -0x4119999a    # -0.45f

    .line 178
    .line 179
    .line 180
    const/high16 v16, -0x40800000    # -1.0f

    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x3ee66666    # 0.45f

    .line 186
    .line 187
    .line 188
    const/high16 v2, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/high16 v4, -0x40800000    # -1.0f

    .line 191
    .line 192
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v0, 0x40400000    # 3.0f

    .line 196
    .line 197
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v0, 0x40a00000    # 5.0f

    .line 201
    .line 202
    const/high16 v2, 0x40000000    # 2.0f

    .line 203
    .line 204
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v18, 0x3f800000    # 1.0f

    .line 208
    .line 209
    const v13, -0x40f33333    # -0.55f

    .line 210
    .line 211
    .line 212
    const/4 v14, 0x0

    .line 213
    const/high16 v15, -0x40800000    # -1.0f

    .line 214
    .line 215
    const v16, 0x3ee66666    # 0.45f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v0, 0x3ee66666    # 0.45f

    .line 222
    .line 223
    .line 224
    const/high16 v2, 0x3f800000    # 1.0f

    .line 225
    .line 226
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v0, 0x40400000    # 3.0f

    .line 230
    .line 231
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v0, 0x41200000    # 10.0f

    .line 235
    .line 236
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v17, 0x40000000    # 2.0f

    .line 240
    .line 241
    const/high16 v18, 0x40000000    # 2.0f

    .line 242
    .line 243
    const/4 v13, 0x0

    .line 244
    const v14, 0x3f8ccccd    # 1.1f

    .line 245
    .line 246
    .line 247
    const v15, 0x3f666666    # 0.9f

    .line 248
    .line 249
    .line 250
    const/high16 v16, 0x40000000    # 2.0f

    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v0, 0x40400000    # 3.0f

    .line 259
    .line 260
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v17, 0x3f800000    # 1.0f

    .line 264
    .line 265
    const/high16 v18, 0x3f800000    # 1.0f

    .line 266
    .line 267
    const v14, 0x3f0ccccd    # 0.55f

    .line 268
    .line 269
    .line 270
    const v15, 0x3ee66666    # 0.45f

    .line 271
    .line 272
    .line 273
    const/high16 v16, 0x3f800000    # 1.0f

    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, -0x4119999a    # -0.45f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 285
    .line 286
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v0, 0x40400000    # 3.0f

    .line 290
    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v18, -0x40800000    # -1.0f

    .line 295
    .line 296
    const v13, 0x3f0ccccd    # 0.55f

    .line 297
    .line 298
    .line 299
    const/4 v14, 0x0

    .line 300
    const/high16 v15, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const v16, -0x4119999a    # -0.45f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, -0x4119999a    # -0.45f

    .line 309
    .line 310
    .line 311
    const/high16 v2, -0x40800000    # -1.0f

    .line 312
    .line 313
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x41000000    # 8.0f

    .line 317
    .line 318
    const/high16 v2, 0x41880000    # 17.0f

    .line 319
    .line 320
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    const/16 v16, 0x3800

    .line 331
    .line 332
    const/16 v17, 0x0

    .line 333
    .line 334
    const/high16 v6, 0x3f800000    # 1.0f

    .line 335
    .line 336
    const/high16 v8, 0x3f800000    # 1.0f

    .line 337
    .line 338
    const/4 v7, 0x0

    .line 339
    const/high16 v9, 0x3f800000    # 1.0f

    .line 340
    .line 341
    const/high16 v12, 0x3f800000    # 1.0f

    .line 342
    .line 343
    const/4 v13, 0x0

    .line 344
    const/4 v15, 0x0

    .line 345
    const-string v4, ""

    .line 346
    .line 347
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    sput-object v0, Landroidx/compose/material/icons/rounded/CropKt;->_crop:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 356
    .line 357
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    return-object v0
.end method
