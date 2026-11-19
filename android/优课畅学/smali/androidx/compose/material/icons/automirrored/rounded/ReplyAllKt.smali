.class public final Landroidx/compose/material/icons/automirrored/rounded/ReplyAllKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _replyAll:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getReplyAll(Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/rounded/ReplyAllKt;->_replyAll:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "AutoMirrored.Rounded.ReplyAll"

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
    const/high16 v0, 0x40e00000    # 7.0f

    .line 71
    .line 72
    const v2, 0x40f1eb85    # 7.56f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x401851ec    # -1.81f

    .line 79
    .line 80
    .line 81
    const/high16 v18, -0x40c00000    # -0.75f

    .line 82
    .line 83
    const/4 v13, 0x0

    .line 84
    const v14, -0x408f5c29    # -0.94f

    .line 85
    .line 86
    .line 87
    const v15, -0x406e147b    # -1.14f

    .line 88
    .line 89
    .line 90
    const v16, -0x404a3d71    # -1.42f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, 0x3f35c28f    # 0.71f

    .line 97
    .line 98
    .line 99
    const v2, 0x4134a3d7    # 11.29f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/16 v17, 0x0

    .line 106
    .line 107
    const v18, 0x3fb47ae1    # 1.41f

    .line 108
    .line 109
    .line 110
    const v13, -0x413851ec    # -0.39f

    .line 111
    .line 112
    .line 113
    const v14, 0x3ec7ae14    # 0.39f

    .line 114
    .line 115
    .line 116
    const v15, -0x413851ec    # -0.39f

    .line 117
    .line 118
    .line 119
    const v16, 0x3f828f5c    # 1.02f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v0, 0x408f5c29    # 4.48f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v17, 0x3fe7ae14    # 1.81f

    .line 132
    .line 133
    .line 134
    const v18, -0x40c28f5c    # -0.74f

    .line 135
    .line 136
    .line 137
    const v13, 0x3f2b851f    # 0.67f

    .line 138
    .line 139
    .line 140
    const v14, 0x3f2e147b    # 0.68f

    .line 141
    .line 142
    .line 143
    const v15, 0x3fe7ae14    # 1.81f

    .line 144
    .line 145
    .line 146
    const v16, 0x3e4ccccd    # 0.2f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v17, -0x416147ae    # -0.31f

    .line 153
    .line 154
    .line 155
    const/high16 v18, -0x40c00000    # -0.75f

    .line 156
    .line 157
    const/4 v13, 0x0

    .line 158
    const v14, -0x4170a3d7    # -0.28f

    .line 159
    .line 160
    .line 161
    const v15, -0x421eb852    # -0.11f

    .line 162
    .line 163
    .line 164
    const v16, -0x40f33333    # -0.55f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v0, 0x40400000    # 3.0f

    .line 171
    .line 172
    const/high16 v2, 0x41400000    # 12.0f

    .line 173
    .line 174
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v0, 0x406c28f6    # 3.69f

    .line 178
    .line 179
    .line 180
    const v2, -0x3f93d70a    # -3.69f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, 0x3e9eb852    # 0.31f

    .line 187
    .line 188
    .line 189
    const v13, 0x3e4ccccd    # 0.2f

    .line 190
    .line 191
    .line 192
    const v14, -0x41b33333    # -0.2f

    .line 193
    .line 194
    .line 195
    const v15, 0x3e9eb852    # 0.31f

    .line 196
    .line 197
    .line 198
    const v16, -0x410f5c29    # -0.47f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x41500000    # 13.0f

    .line 208
    .line 209
    const/high16 v2, 0x41100000    # 9.0f

    .line 210
    .line 211
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, 0x40ed1eb8    # 7.41f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v17, -0x40251eb8    # -1.71f

    .line 221
    .line 222
    .line 223
    const v18, -0x40ca3d71    # -0.71f

    .line 224
    .line 225
    .line 226
    const/4 v13, 0x0

    .line 227
    const v14, -0x409c28f6    # -0.89f

    .line 228
    .line 229
    .line 230
    const v15, -0x4075c28f    # -1.08f

    .line 231
    .line 232
    .line 233
    const v16, -0x40547ae1    # -1.34f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v0, 0x40d66666    # 6.7f

    .line 240
    .line 241
    .line 242
    const v2, 0x4134a3d7    # 11.29f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/16 v17, 0x0

    .line 249
    .line 250
    const v18, 0x3fb47ae1    # 1.41f

    .line 251
    .line 252
    .line 253
    const v13, -0x413851ec    # -0.39f

    .line 254
    .line 255
    .line 256
    const v14, 0x3ec7ae14    # 0.39f

    .line 257
    .line 258
    .line 259
    const v15, -0x413851ec    # -0.39f

    .line 260
    .line 261
    .line 262
    const v16, 0x3f828f5c    # 1.02f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, 0x4092e148    # 4.59f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v17, 0x3fdae148    # 1.71f

    .line 275
    .line 276
    .line 277
    const v18, -0x40ca3d71    # -0.71f

    .line 278
    .line 279
    .line 280
    const v13, 0x3f2147ae    # 0.63f

    .line 281
    .line 282
    .line 283
    const v14, 0x3f2147ae    # 0.63f

    .line 284
    .line 285
    .line 286
    const v15, 0x3fdae148    # 1.71f

    .line 287
    .line 288
    .line 289
    const v16, 0x3e3851ec    # 0.18f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v0, 0x416e6666    # 14.9f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v17, 0x41300000    # 11.0f

    .line 302
    .line 303
    const v18, 0x40a33333    # 5.1f

    .line 304
    .line 305
    .line 306
    const/high16 v13, 0x40a00000    # 5.0f

    .line 307
    .line 308
    const/4 v14, 0x0

    .line 309
    const/high16 v15, 0x41080000    # 8.5f

    .line 310
    .line 311
    const v16, 0x3fcccccd    # 1.6f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v17, -0x3ed00000    # -11.0f

    .line 318
    .line 319
    const/high16 v18, -0x3ed00000    # -11.0f

    .line 320
    .line 321
    const/high16 v13, -0x40800000    # -1.0f

    .line 322
    .line 323
    const/high16 v14, -0x3f600000    # -5.0f

    .line 324
    .line 325
    const/high16 v15, -0x3f800000    # -4.0f

    .line 326
    .line 327
    const/high16 v16, -0x3ee00000    # -10.0f

    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    const/16 v16, 0x3800

    .line 340
    .line 341
    const/16 v17, 0x0

    .line 342
    .line 343
    const/high16 v6, 0x3f800000    # 1.0f

    .line 344
    .line 345
    const/high16 v8, 0x3f800000    # 1.0f

    .line 346
    .line 347
    const/4 v7, 0x0

    .line 348
    const/high16 v9, 0x3f800000    # 1.0f

    .line 349
    .line 350
    const/high16 v12, 0x3f800000    # 1.0f

    .line 351
    .line 352
    const/4 v13, 0x0

    .line 353
    const/4 v14, 0x0

    .line 354
    const/4 v15, 0x0

    .line 355
    const-string v4, ""

    .line 356
    .line 357
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    sput-object v0, Landroidx/compose/material/icons/automirrored/rounded/ReplyAllKt;->_replyAll:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 366
    .line 367
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    return-object v0
.end method
