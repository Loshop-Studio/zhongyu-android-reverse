.class public final Landroidx/compose/material/icons/automirrored/rounded/_360Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __360:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_360(Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/rounded/_360Kt;->__360:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const/4 v10, 0x1

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
    const-string v2, "AutoMirrored.Rounded._360"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, 0x41400000    # 12.0f

    .line 80
    .line 81
    const v13, 0x40cf5c29    # 6.48f

    .line 82
    .line 83
    .line 84
    const/high16 v14, 0x40e00000    # 7.0f

    .line 85
    .line 86
    const/high16 v15, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v16, 0x4113d70a    # 9.24f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v17, 0x40e00000    # 7.0f

    .line 95
    .line 96
    const v18, 0x4098a3d7    # 4.77f

    .line 97
    .line 98
    .line 99
    const/4 v13, 0x0

    .line 100
    const v14, 0x400f5c29    # 2.24f

    .line 101
    .line 102
    .line 103
    const v15, 0x403c28f6    # 2.94f

    .line 104
    .line 105
    .line 106
    const v16, 0x408428f6    # 4.13f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x400147ae    # 2.02f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, 0x3f59999a    # 0.85f

    .line 119
    .line 120
    .line 121
    const v18, 0x3eb33333    # 0.35f

    .line 122
    .line 123
    .line 124
    const v14, 0x3ee66666    # 0.45f

    .line 125
    .line 126
    .line 127
    const v15, 0x3f0a3d71    # 0.54f

    .line 128
    .line 129
    .line 130
    const v16, 0x3f2b851f    # 0.67f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, 0x40328f5c    # 2.79f

    .line 137
    .line 138
    .line 139
    const v2, -0x3fcd70a4    # -2.79f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/16 v17, 0x0

    .line 146
    .line 147
    const v18, -0x40ca3d71    # -0.71f

    .line 148
    .line 149
    .line 150
    const v13, 0x3e4ccccd    # 0.2f

    .line 151
    .line 152
    .line 153
    const v14, -0x41b33333    # -0.2f

    .line 154
    .line 155
    .line 156
    const v15, 0x3e4ccccd    # 0.2f

    .line 157
    .line 158
    .line 159
    const v16, -0x40fd70a4    # -0.51f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v0, -0x3fcd70a4    # -2.79f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v17, -0x40a66666    # -0.85f

    .line 172
    .line 173
    .line 174
    const v18, 0x3eb851ec    # 0.36f

    .line 175
    .line 176
    .line 177
    const v13, -0x416147ae    # -0.31f

    .line 178
    .line 179
    .line 180
    const v14, -0x416147ae    # -0.31f

    .line 181
    .line 182
    .line 183
    const v15, -0x40a66666    # -0.85f

    .line 184
    .line 185
    .line 186
    const v16, -0x4247ae14    # -0.09f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x3fc28f5c    # 1.52f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v17, -0x3f600000    # -5.0f

    .line 199
    .line 200
    const v18, -0x3fd147ae    # -2.73f

    .line 201
    .line 202
    .line 203
    const v13, -0x3fb66666    # -3.15f

    .line 204
    .line 205
    .line 206
    const v14, -0x40f0a3d7    # -0.56f

    .line 207
    .line 208
    .line 209
    const/high16 v15, -0x3f600000    # -5.0f

    .line 210
    .line 211
    const v16, -0x400ccccd    # -1.9f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, 0x41000000    # 8.0f

    .line 218
    .line 219
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 220
    .line 221
    const/4 v13, 0x0

    .line 222
    const v14, -0x407851ec    # -1.06f

    .line 223
    .line 224
    .line 225
    const v15, 0x40428f5c    # 3.04f

    .line 226
    .line 227
    .line 228
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v0, 0x3ff851ec    # 1.94f

    .line 234
    .line 235
    .line 236
    const/high16 v2, 0x40400000    # 3.0f

    .line 237
    .line 238
    const/high16 v4, 0x41000000    # 8.0f

    .line 239
    .line 240
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v17, -0x3fab851f    # -3.32f

    .line 244
    .line 245
    .line 246
    const v18, 0x4015c28f    # 2.34f

    .line 247
    .line 248
    .line 249
    const v14, 0x3f28f5c3    # 0.66f

    .line 250
    .line 251
    .line 252
    const v15, -0x40666666    # -1.2f

    .line 253
    .line 254
    .line 255
    const v16, 0x3fd70a3d    # 1.68f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v17, -0x40d1eb85    # -0.68f

    .line 262
    .line 263
    .line 264
    const v18, 0x3f70a3d7    # 0.94f

    .line 265
    .line 266
    .line 267
    const v13, -0x412e147b    # -0.41f

    .line 268
    .line 269
    .line 270
    const v14, 0x3e051eb8    # 0.13f

    .line 271
    .line 272
    .line 273
    const v15, -0x40d1eb85    # -0.68f

    .line 274
    .line 275
    .line 276
    const v16, 0x3f028f5c    # 0.51f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, 0x3fa3d70a    # 1.28f

    .line 283
    .line 284
    .line 285
    const v18, 0x3f75c28f    # 0.96f

    .line 286
    .line 287
    .line 288
    const/4 v13, 0x0

    .line 289
    const v14, 0x3f2b851f    # 0.67f

    .line 290
    .line 291
    .line 292
    const v15, 0x3f266666    # 0.65f

    .line 293
    .line 294
    .line 295
    const v16, 0x3f947ae1    # 1.16f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v17, 0x41b00000    # 22.0f

    .line 302
    .line 303
    const/high16 v18, 0x41400000    # 12.0f

    .line 304
    .line 305
    const v13, 0x41a0e148    # 20.11f

    .line 306
    .line 307
    .line 308
    const v14, 0x4175c28f    # 15.36f

    .line 309
    .line 310
    .line 311
    const/high16 v15, 0x41b00000    # 22.0f

    .line 312
    .line 313
    const v16, 0x415ca3d7    # 13.79f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 320
    .line 321
    const/high16 v18, -0x3f600000    # -5.0f

    .line 322
    .line 323
    const/4 v13, 0x0

    .line 324
    const v14, -0x3fcf5c29    # -2.76f

    .line 325
    .line 326
    .line 327
    const v15, -0x3f70a3d7    # -4.48f

    .line 328
    .line 329
    .line 330
    const/high16 v16, -0x3f600000    # -5.0f

    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    const/16 v16, 0x3800

    .line 343
    .line 344
    const/16 v17, 0x0

    .line 345
    .line 346
    const/high16 v6, 0x3f800000    # 1.0f

    .line 347
    .line 348
    const/high16 v8, 0x3f800000    # 1.0f

    .line 349
    .line 350
    const/4 v7, 0x0

    .line 351
    const/high16 v9, 0x3f800000    # 1.0f

    .line 352
    .line 353
    const/high16 v12, 0x3f800000    # 1.0f

    .line 354
    .line 355
    const/4 v14, 0x0

    .line 356
    const/4 v15, 0x0

    .line 357
    const-string v4, ""

    .line 358
    .line 359
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    sput-object v0, Landroidx/compose/material/icons/automirrored/rounded/_360Kt;->__360:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 368
    .line 369
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    return-object v0
.end method
