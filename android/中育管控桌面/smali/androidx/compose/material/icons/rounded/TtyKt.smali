.class public final Landroidx/compose/material/icons/rounded/TtyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_tty",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Tty",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getTty",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nTty.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tty.kt\nandroidx/compose/material/icons/rounded/TtyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,165:1\n212#2,12:166\n233#2,18:179\n253#2:216\n174#3:178\n705#4,2:197\n717#4,2:199\n719#4,11:205\n72#5,4:201\n*S KotlinDebug\n*F\n+ 1 Tty.kt\nandroidx/compose/material/icons/rounded/TtyKt\n*L\n29#1:166,12\n30#1:179,18\n30#1:216\n29#1:178\n30#1:197,2\n30#1:199,2\n30#1:205,11\n30#1:201,4\n*E\n"
    }
.end annotation


# static fields
.field private static _tty:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTty(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TtyKt;->_tty:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Tty"

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
    const/high16 v2, 0x41700000    # 15.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v17, 0x3f800000    # 1.0f

    .line 81
    .line 82
    const/high16 v18, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const v13, 0x3f0ccccd    # 0.55f

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const/high16 v15, 0x3f800000    # 1.0f

    .line 89
    .line 90
    const v16, 0x3ee66666    # 0.45f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, -0x40800000    # -1.0f

    .line 101
    .line 102
    const/4 v13, 0x0

    .line 103
    const v14, 0x3f0ccccd    # 0.55f

    .line 104
    .line 105
    .line 106
    const v15, -0x4119999a    # -0.45f

    .line 107
    .line 108
    .line 109
    const/high16 v16, 0x3f800000    # 1.0f

    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v18, -0x40800000    # -1.0f

    .line 118
    .line 119
    const v13, -0x40f33333    # -0.55f

    .line 120
    .line 121
    .line 122
    const/4 v14, 0x0

    .line 123
    const/high16 v15, -0x40800000    # -1.0f

    .line 124
    .line 125
    const v16, -0x4119999a    # -0.45f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v17, 0x41700000    # 15.0f

    .line 135
    .line 136
    const/high16 v18, 0x40800000    # 4.0f

    .line 137
    .line 138
    const/high16 v13, 0x41600000    # 14.0f

    .line 139
    .line 140
    const v14, 0x408e6666    # 4.45f

    .line 141
    .line 142
    .line 143
    const v15, 0x41673333    # 14.45f

    .line 144
    .line 145
    .line 146
    const/high16 v16, 0x40800000    # 4.0f

    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v0, 0x40e00000    # 7.0f

    .line 155
    .line 156
    const/high16 v2, 0x41600000    # 14.0f

    .line 157
    .line 158
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v17, 0x3f800000    # 1.0f

    .line 165
    .line 166
    const/high16 v18, 0x3f800000    # 1.0f

    .line 167
    .line 168
    const v13, 0x3f0ccccd    # 0.55f

    .line 169
    .line 170
    .line 171
    const/4 v14, 0x0

    .line 172
    const/high16 v15, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const v16, 0x3ee66666    # 0.45f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/4 v0, 0x0

    .line 181
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v17, -0x40800000    # -1.0f

    .line 185
    .line 186
    const/4 v13, 0x0

    .line 187
    const v14, 0x3f0ccccd    # 0.55f

    .line 188
    .line 189
    .line 190
    const v15, -0x4119999a    # -0.45f

    .line 191
    .line 192
    .line 193
    const/high16 v16, 0x3f800000    # 1.0f

    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v18, -0x40800000    # -1.0f

    .line 202
    .line 203
    const v13, -0x40f33333    # -0.55f

    .line 204
    .line 205
    .line 206
    const/4 v14, 0x0

    .line 207
    const/high16 v15, -0x40800000    # -1.0f

    .line 208
    .line 209
    const v16, -0x4119999a    # -0.45f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v17, 0x41600000    # 14.0f

    .line 219
    .line 220
    const/high16 v18, 0x40e00000    # 7.0f

    .line 221
    .line 222
    const/high16 v13, 0x41500000    # 13.0f

    .line 223
    .line 224
    const v14, 0x40ee6666    # 7.45f

    .line 225
    .line 226
    .line 227
    const v15, 0x41573333    # 13.45f

    .line 228
    .line 229
    .line 230
    const/high16 v16, 0x40e00000    # 7.0f

    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v0, 0x40800000    # 4.0f

    .line 239
    .line 240
    const/high16 v2, 0x41400000    # 12.0f

    .line 241
    .line 242
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v17, 0x3f800000    # 1.0f

    .line 249
    .line 250
    const/high16 v18, 0x3f800000    # 1.0f

    .line 251
    .line 252
    const v13, 0x3f0ccccd    # 0.55f

    .line 253
    .line 254
    .line 255
    const/4 v14, 0x0

    .line 256
    const/high16 v15, 0x3f800000    # 1.0f

    .line 257
    .line 258
    const v16, 0x3ee66666    # 0.45f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/4 v0, 0x0

    .line 265
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v17, -0x40800000    # -1.0f

    .line 269
    .line 270
    const/4 v13, 0x0

    .line 271
    const v14, 0x3f0ccccd    # 0.55f

    .line 272
    .line 273
    .line 274
    const v15, -0x4119999a    # -0.45f

    .line 275
    .line 276
    .line 277
    const/high16 v16, 0x3f800000    # 1.0f

    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v18, -0x40800000    # -1.0f

    .line 286
    .line 287
    const v13, -0x40f33333    # -0.55f

    .line 288
    .line 289
    .line 290
    const/4 v14, 0x0

    .line 291
    const/high16 v15, -0x40800000    # -1.0f

    .line 292
    .line 293
    const v16, -0x4119999a    # -0.45f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v17, 0x41400000    # 12.0f

    .line 303
    .line 304
    const/high16 v18, 0x40800000    # 4.0f

    .line 305
    .line 306
    const/high16 v13, 0x41300000    # 11.0f

    .line 307
    .line 308
    const v14, 0x408e6666    # 4.45f

    .line 309
    .line 310
    .line 311
    const v15, 0x41373333    # 11.45f

    .line 312
    .line 313
    .line 314
    const/high16 v16, 0x40800000    # 4.0f

    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v0, 0x41880000    # 17.0f

    .line 323
    .line 324
    const/high16 v2, 0x41100000    # 9.0f

    .line 325
    .line 326
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v17, -0x40800000    # -1.0f

    .line 333
    .line 334
    const/high16 v18, -0x40800000    # -1.0f

    .line 335
    .line 336
    const v13, -0x40f33333    # -0.55f

    .line 337
    .line 338
    .line 339
    const/4 v14, 0x0

    .line 340
    const/high16 v15, -0x40800000    # -1.0f

    .line 341
    .line 342
    const v16, -0x4119999a    # -0.45f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/4 v0, 0x0

    .line 349
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v17, 0x3f800000    # 1.0f

    .line 353
    .line 354
    const/4 v13, 0x0

    .line 355
    const v14, -0x40f33333    # -0.55f

    .line 356
    .line 357
    .line 358
    const v15, 0x3ee66666    # 0.45f

    .line 359
    .line 360
    .line 361
    const/high16 v16, -0x40800000    # -1.0f

    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v18, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const v13, 0x3f0ccccd    # 0.55f

    .line 372
    .line 373
    .line 374
    const/4 v14, 0x0

    .line 375
    const/high16 v15, 0x3f800000    # 1.0f

    .line 376
    .line 377
    const v16, 0x3ee66666    # 0.45f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v17, 0x41880000    # 17.0f

    .line 387
    .line 388
    const/high16 v18, 0x41100000    # 9.0f

    .line 389
    .line 390
    const/high16 v13, 0x41900000    # 18.0f

    .line 391
    .line 392
    const v14, 0x4108cccd    # 8.55f

    .line 393
    .line 394
    .line 395
    const v15, 0x418c6666    # 17.55f

    .line 396
    .line 397
    .line 398
    const/high16 v16, 0x41100000    # 9.0f

    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x40c00000    # 6.0f

    .line 407
    .line 408
    const/high16 v2, 0x41900000    # 18.0f

    .line 409
    .line 410
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v17, -0x40800000    # -1.0f

    .line 417
    .line 418
    const/high16 v18, -0x40800000    # -1.0f

    .line 419
    .line 420
    const v13, -0x40f33333    # -0.55f

    .line 421
    .line 422
    .line 423
    const/4 v14, 0x0

    .line 424
    const/high16 v15, -0x40800000    # -1.0f

    .line 425
    .line 426
    const v16, -0x4119999a    # -0.45f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/4 v0, 0x0

    .line 433
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v17, 0x3f800000    # 1.0f

    .line 437
    .line 438
    const/4 v13, 0x0

    .line 439
    const v14, -0x40f33333    # -0.55f

    .line 440
    .line 441
    .line 442
    const v15, 0x3ee66666    # 0.45f

    .line 443
    .line 444
    .line 445
    const/high16 v16, -0x40800000    # -1.0f

    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v18, 0x3f800000    # 1.0f

    .line 454
    .line 455
    const v13, 0x3f0ccccd    # 0.55f

    .line 456
    .line 457
    .line 458
    const/4 v14, 0x0

    .line 459
    const/high16 v15, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const v16, 0x3ee66666    # 0.45f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v17, 0x41900000    # 18.0f

    .line 471
    .line 472
    const/high16 v18, 0x40c00000    # 6.0f

    .line 473
    .line 474
    const/high16 v13, 0x41980000    # 19.0f

    .line 475
    .line 476
    const v14, 0x40b1999a    # 5.55f

    .line 477
    .line 478
    .line 479
    const v15, 0x41946666    # 18.55f

    .line 480
    .line 481
    .line 482
    const/high16 v16, 0x40c00000    # 6.0f

    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, 0x41a00000    # 20.0f

    .line 491
    .line 492
    const/high16 v2, 0x41100000    # 9.0f

    .line 493
    .line 494
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, -0x40800000    # -1.0f

    .line 501
    .line 502
    const/high16 v18, -0x40800000    # -1.0f

    .line 503
    .line 504
    const v13, -0x40f33333    # -0.55f

    .line 505
    .line 506
    .line 507
    const/4 v14, 0x0

    .line 508
    const/high16 v15, -0x40800000    # -1.0f

    .line 509
    .line 510
    const v16, -0x4119999a    # -0.45f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/4 v0, 0x0

    .line 517
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v17, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const/4 v13, 0x0

    .line 523
    const v14, -0x40f33333    # -0.55f

    .line 524
    .line 525
    .line 526
    const v15, 0x3ee66666    # 0.45f

    .line 527
    .line 528
    .line 529
    const/high16 v16, -0x40800000    # -1.0f

    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v18, 0x3f800000    # 1.0f

    .line 538
    .line 539
    const v13, 0x3f0ccccd    # 0.55f

    .line 540
    .line 541
    .line 542
    const/4 v14, 0x0

    .line 543
    const/high16 v15, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const v16, 0x3ee66666    # 0.45f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v17, 0x41a00000    # 20.0f

    .line 555
    .line 556
    const/high16 v18, 0x41100000    # 9.0f

    .line 557
    .line 558
    const/high16 v13, 0x41a80000    # 21.0f

    .line 559
    .line 560
    const v14, 0x4108cccd    # 8.55f

    .line 561
    .line 562
    .line 563
    const v15, 0x41a46666    # 20.55f

    .line 564
    .line 565
    .line 566
    const/high16 v16, 0x41100000    # 9.0f

    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, 0x41a80000    # 21.0f

    .line 575
    .line 576
    const/high16 v2, 0x40c00000    # 6.0f

    .line 577
    .line 578
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v17, -0x40800000    # -1.0f

    .line 585
    .line 586
    const/high16 v18, -0x40800000    # -1.0f

    .line 587
    .line 588
    const v13, -0x40f33333    # -0.55f

    .line 589
    .line 590
    .line 591
    const/4 v14, 0x0

    .line 592
    const/high16 v15, -0x40800000    # -1.0f

    .line 593
    .line 594
    const v16, -0x4119999a    # -0.45f

    .line 595
    .line 596
    .line 597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/4 v0, 0x0

    .line 601
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v17, 0x3f800000    # 1.0f

    .line 605
    .line 606
    const/4 v13, 0x0

    .line 607
    const v14, -0x40f33333    # -0.55f

    .line 608
    .line 609
    .line 610
    const v15, 0x3ee66666    # 0.45f

    .line 611
    .line 612
    .line 613
    const/high16 v16, -0x40800000    # -1.0f

    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v18, 0x3f800000    # 1.0f

    .line 622
    .line 623
    const v13, 0x3f0ccccd    # 0.55f

    .line 624
    .line 625
    .line 626
    const/4 v14, 0x0

    .line 627
    const/high16 v15, 0x3f800000    # 1.0f

    .line 628
    .line 629
    const v16, 0x3ee66666    # 0.45f

    .line 630
    .line 631
    .line 632
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v17, 0x41a80000    # 21.0f

    .line 639
    .line 640
    const/high16 v18, 0x40c00000    # 6.0f

    .line 641
    .line 642
    const/high16 v13, 0x41b00000    # 22.0f

    .line 643
    .line 644
    const v14, 0x40b1999a    # 5.55f

    .line 645
    .line 646
    .line 647
    const v15, 0x41ac6666    # 21.55f

    .line 648
    .line 649
    .line 650
    const/high16 v16, 0x40c00000    # 6.0f

    .line 651
    .line 652
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v0, 0x4169eb85    # 14.62f

    .line 659
    .line 660
    .line 661
    const v2, 0x4166147b    # 14.38f

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v0, 0x4141999a    # 12.1f

    .line 668
    .line 669
    .line 670
    const v2, 0x41873333    # 16.9f

    .line 671
    .line 672
    .line 673
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v17, -0x3f400000    # -6.0f

    .line 677
    .line 678
    const/high16 v18, -0x3f400000    # -6.0f

    .line 679
    .line 680
    const/high16 v13, -0x3fe00000    # -2.5f

    .line 681
    .line 682
    const v14, -0x4048f5c3    # -1.43f

    .line 683
    .line 684
    .line 685
    const v15, -0x3f6dc28f    # -4.57f

    .line 686
    .line 687
    .line 688
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 689
    .line 690
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v0, 0x402147ae    # 2.52f

    .line 694
    .line 695
    .line 696
    const v2, -0x3fdeb852    # -2.52f

    .line 697
    .line 698
    .line 699
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v17, 0x410e6666    # 8.9f

    .line 703
    .line 704
    .line 705
    const v18, 0x40ef5c29    # 7.48f

    .line 706
    .line 707
    .line 708
    const v13, 0x410dc28f    # 8.86f

    .line 709
    .line 710
    .line 711
    const v14, 0x41023d71    # 8.14f

    .line 712
    .line 713
    .line 714
    const v15, 0x410f5c29    # 8.96f

    .line 715
    .line 716
    .line 717
    const v16, 0x40f9999a    # 7.8f

    .line 718
    .line 719
    .line 720
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v0, 0x41028f5c    # 8.16f

    .line 724
    .line 725
    .line 726
    const v2, 0x40733333    # 3.8f

    .line 727
    .line 728
    .line 729
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const v17, 0x40e5c28f    # 7.18f

    .line 733
    .line 734
    .line 735
    const/high16 v18, 0x40400000    # 3.0f

    .line 736
    .line 737
    const v13, 0x41011eb8    # 8.07f

    .line 738
    .line 739
    .line 740
    const v14, 0x4055c28f    # 3.34f

    .line 741
    .line 742
    .line 743
    const v15, 0x40f51eb8    # 7.66f

    .line 744
    .line 745
    .line 746
    const/high16 v16, 0x40400000    # 3.0f

    .line 747
    .line 748
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v0, 0x4041eb85    # 3.03f

    .line 752
    .line 753
    .line 754
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const v17, 0x4001eb85    # 2.03f

    .line 758
    .line 759
    .line 760
    const v18, 0x4080f5c3    # 4.03f

    .line 761
    .line 762
    .line 763
    const v13, 0x401e147b    # 2.47f

    .line 764
    .line 765
    .line 766
    const/high16 v14, 0x40400000    # 3.0f

    .line 767
    .line 768
    const/high16 v15, 0x40000000    # 2.0f

    .line 769
    .line 770
    const v16, 0x405e147b    # 3.47f

    .line 771
    .line 772
    .line 773
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const v17, 0x408dc28f    # 4.43f

    .line 777
    .line 778
    .line 779
    const/high16 v18, 0x41400000    # 12.0f

    .line 780
    .line 781
    const v13, 0x400ccccd    # 2.2f

    .line 782
    .line 783
    .line 784
    const v14, 0x40dd70a4    # 6.92f

    .line 785
    .line 786
    .line 787
    const v15, 0x40433333    # 3.05f

    .line 788
    .line 789
    .line 790
    const v16, 0x411a147b    # 9.63f

    .line 791
    .line 792
    .line 793
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const v17, 0x40d23d71    # 6.57f

    .line 797
    .line 798
    .line 799
    const v18, 0x40d23d71    # 6.57f

    .line 800
    .line 801
    .line 802
    const v13, 0x3fca3d71    # 1.58f

    .line 803
    .line 804
    .line 805
    const v14, 0x402eb852    # 2.73f

    .line 806
    .line 807
    .line 808
    const v15, 0x40766666    # 3.85f

    .line 809
    .line 810
    .line 811
    const v16, 0x409fae14    # 4.99f

    .line 812
    .line 813
    .line 814
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const v17, 0x40ff0a3d    # 7.97f

    .line 818
    .line 819
    .line 820
    const v18, 0x4019999a    # 2.4f

    .line 821
    .line 822
    .line 823
    const v13, 0x4017ae14    # 2.37f

    .line 824
    .line 825
    .line 826
    const v14, 0x3faf5c29    # 1.37f

    .line 827
    .line 828
    .line 829
    const v15, 0x40a28f5c    # 5.08f

    .line 830
    .line 831
    .line 832
    const v16, 0x400eb852    # 2.23f

    .line 833
    .line 834
    .line 835
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const v17, 0x3f83d70a    # 1.03f

    .line 839
    .line 840
    .line 841
    const/high16 v18, -0x40800000    # -1.0f

    .line 842
    .line 843
    const v13, 0x3f0f5c29    # 0.56f

    .line 844
    .line 845
    .line 846
    const v14, 0x3cf5c28f    # 0.03f

    .line 847
    .line 848
    .line 849
    const v15, 0x3f83d70a    # 1.03f

    .line 850
    .line 851
    .line 852
    const v16, -0x411eb852    # -0.44f

    .line 853
    .line 854
    .line 855
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    const v0, -0x3f7b3333    # -4.15f

    .line 859
    .line 860
    .line 861
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    const v17, -0x40b33333    # -0.8f

    .line 865
    .line 866
    .line 867
    const v18, -0x40851eb8    # -0.98f

    .line 868
    .line 869
    .line 870
    const/4 v13, 0x0

    .line 871
    const v14, -0x410a3d71    # -0.48f

    .line 872
    .line 873
    .line 874
    const v15, -0x4151eb85    # -0.34f

    .line 875
    .line 876
    .line 877
    const v16, -0x409c28f6    # -0.89f

    .line 878
    .line 879
    .line 880
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const v0, -0x3f951eb8    # -3.67f

    .line 884
    .line 885
    .line 886
    const v2, -0x40c51eb8    # -0.73f

    .line 887
    .line 888
    .line 889
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const v17, 0x4169eb85    # 14.62f

    .line 893
    .line 894
    .line 895
    const v18, 0x4166147b    # 14.38f

    .line 896
    .line 897
    .line 898
    const v13, 0x41733333    # 15.2f

    .line 899
    .line 900
    .line 901
    const v14, 0x4160a3d7    # 14.04f

    .line 902
    .line 903
    .line 904
    const v15, 0x416dc28f    # 14.86f

    .line 905
    .line 906
    .line 907
    const v16, 0x41623d71    # 14.14f

    .line 908
    .line 909
    .line 910
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 911
    .line 912
    .line 913
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    .line 916
    const/high16 v0, 0x41200000    # 10.0f

    .line 917
    .line 918
    const/high16 v2, 0x41700000    # 15.0f

    .line 919
    .line 920
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 924
    .line 925
    .line 926
    const/high16 v17, 0x3f800000    # 1.0f

    .line 927
    .line 928
    const/high16 v18, 0x3f800000    # 1.0f

    .line 929
    .line 930
    const v13, 0x3f0ccccd    # 0.55f

    .line 931
    .line 932
    .line 933
    const/4 v14, 0x0

    .line 934
    const/high16 v15, 0x3f800000    # 1.0f

    .line 935
    .line 936
    const v16, 0x3ee66666    # 0.45f

    .line 937
    .line 938
    .line 939
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 940
    .line 941
    .line 942
    const/4 v0, 0x0

    .line 943
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 944
    .line 945
    .line 946
    const/high16 v17, -0x40800000    # -1.0f

    .line 947
    .line 948
    const/4 v13, 0x0

    .line 949
    const v14, 0x3f0ccccd    # 0.55f

    .line 950
    .line 951
    .line 952
    const v15, -0x4119999a    # -0.45f

    .line 953
    .line 954
    .line 955
    const/high16 v16, 0x3f800000    # 1.0f

    .line 956
    .line 957
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 958
    .line 959
    .line 960
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 961
    .line 962
    .line 963
    const/high16 v18, -0x40800000    # -1.0f

    .line 964
    .line 965
    const v13, -0x40f33333    # -0.55f

    .line 966
    .line 967
    .line 968
    const/4 v14, 0x0

    .line 969
    const/high16 v15, -0x40800000    # -1.0f

    .line 970
    .line 971
    const v16, -0x4119999a    # -0.45f

    .line 972
    .line 973
    .line 974
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 975
    .line 976
    .line 977
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 978
    .line 979
    .line 980
    const/high16 v17, 0x41700000    # 15.0f

    .line 981
    .line 982
    const/high16 v18, 0x41200000    # 10.0f

    .line 983
    .line 984
    const/high16 v13, 0x41600000    # 14.0f

    .line 985
    .line 986
    const v14, 0x41273333    # 10.45f

    .line 987
    .line 988
    .line 989
    const v15, 0x41673333    # 14.45f

    .line 990
    .line 991
    .line 992
    const/high16 v16, 0x41200000    # 10.0f

    .line 993
    .line 994
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 995
    .line 996
    .line 997
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 998
    .line 999
    .line 1000
    const/high16 v0, 0x41200000    # 10.0f

    .line 1001
    .line 1002
    const/high16 v2, 0x41400000    # 12.0f

    .line 1003
    .line 1004
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1008
    .line 1009
    .line 1010
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1011
    .line 1012
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1013
    .line 1014
    const v13, 0x3f0ccccd    # 0.55f

    .line 1015
    .line 1016
    .line 1017
    const/4 v14, 0x0

    .line 1018
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1019
    .line 1020
    const v16, 0x3ee66666    # 0.45f

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1024
    .line 1025
    .line 1026
    const/4 v0, 0x0

    .line 1027
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1028
    .line 1029
    .line 1030
    const/high16 v17, -0x40800000    # -1.0f

    .line 1031
    .line 1032
    const/4 v13, 0x0

    .line 1033
    const v14, 0x3f0ccccd    # 0.55f

    .line 1034
    .line 1035
    .line 1036
    const v15, -0x4119999a    # -0.45f

    .line 1037
    .line 1038
    .line 1039
    const/high16 v16, 0x3f800000    # 1.0f

    .line 1040
    .line 1041
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1045
    .line 1046
    .line 1047
    const/high16 v18, -0x40800000    # -1.0f

    .line 1048
    .line 1049
    const v13, -0x40f33333    # -0.55f

    .line 1050
    .line 1051
    .line 1052
    const/4 v14, 0x0

    .line 1053
    const/high16 v15, -0x40800000    # -1.0f

    .line 1054
    .line 1055
    const v16, -0x4119999a    # -0.45f

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1062
    .line 1063
    .line 1064
    const/high16 v17, 0x41400000    # 12.0f

    .line 1065
    .line 1066
    const/high16 v18, 0x41200000    # 10.0f

    .line 1067
    .line 1068
    const/high16 v13, 0x41300000    # 11.0f

    .line 1069
    .line 1070
    const v14, 0x41273333    # 10.45f

    .line 1071
    .line 1072
    .line 1073
    const v15, 0x41373333    # 11.45f

    .line 1074
    .line 1075
    .line 1076
    const/high16 v16, 0x41200000    # 10.0f

    .line 1077
    .line 1078
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1082
    .line 1083
    .line 1084
    const/high16 v0, 0x41900000    # 18.0f

    .line 1085
    .line 1086
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1090
    .line 1091
    .line 1092
    const/high16 v17, -0x40800000    # -1.0f

    .line 1093
    .line 1094
    const/high16 v18, -0x40800000    # -1.0f

    .line 1095
    .line 1096
    const v13, -0x40f33333    # -0.55f

    .line 1097
    .line 1098
    .line 1099
    const/4 v14, 0x0

    .line 1100
    const/high16 v15, -0x40800000    # -1.0f

    .line 1101
    .line 1102
    const v16, -0x4119999a    # -0.45f

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1106
    .line 1107
    .line 1108
    const/4 v0, 0x0

    .line 1109
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1110
    .line 1111
    .line 1112
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1113
    .line 1114
    const/4 v13, 0x0

    .line 1115
    const v14, -0x40f33333    # -0.55f

    .line 1116
    .line 1117
    .line 1118
    const v15, 0x3ee66666    # 0.45f

    .line 1119
    .line 1120
    .line 1121
    const/high16 v16, -0x40800000    # -1.0f

    .line 1122
    .line 1123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1127
    .line 1128
    .line 1129
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1130
    .line 1131
    const v13, 0x3f0ccccd    # 0.55f

    .line 1132
    .line 1133
    .line 1134
    const/4 v14, 0x0

    .line 1135
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1136
    .line 1137
    const v16, 0x3ee66666    # 0.45f

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1144
    .line 1145
    .line 1146
    const/high16 v17, 0x41900000    # 18.0f

    .line 1147
    .line 1148
    const/high16 v18, 0x41400000    # 12.0f

    .line 1149
    .line 1150
    const/high16 v13, 0x41980000    # 19.0f

    .line 1151
    .line 1152
    const v14, 0x4138cccd    # 11.55f

    .line 1153
    .line 1154
    .line 1155
    const v15, 0x41946666    # 18.55f

    .line 1156
    .line 1157
    .line 1158
    const/high16 v16, 0x41400000    # 12.0f

    .line 1159
    .line 1160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1164
    .line 1165
    .line 1166
    const/high16 v0, 0x41a80000    # 21.0f

    .line 1167
    .line 1168
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1172
    .line 1173
    .line 1174
    const/high16 v17, -0x40800000    # -1.0f

    .line 1175
    .line 1176
    const/high16 v18, -0x40800000    # -1.0f

    .line 1177
    .line 1178
    const v13, -0x40f33333    # -0.55f

    .line 1179
    .line 1180
    .line 1181
    const/4 v14, 0x0

    .line 1182
    const/high16 v15, -0x40800000    # -1.0f

    .line 1183
    .line 1184
    const v16, -0x4119999a    # -0.45f

    .line 1185
    .line 1186
    .line 1187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1188
    .line 1189
    .line 1190
    const/4 v0, 0x0

    .line 1191
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1192
    .line 1193
    .line 1194
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1195
    .line 1196
    const/4 v13, 0x0

    .line 1197
    const v14, -0x40f33333    # -0.55f

    .line 1198
    .line 1199
    .line 1200
    const v15, 0x3ee66666    # 0.45f

    .line 1201
    .line 1202
    .line 1203
    const/high16 v16, -0x40800000    # -1.0f

    .line 1204
    .line 1205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1209
    .line 1210
    .line 1211
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1212
    .line 1213
    const v13, 0x3f0ccccd    # 0.55f

    .line 1214
    .line 1215
    .line 1216
    const/4 v14, 0x0

    .line 1217
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1218
    .line 1219
    const v16, 0x3ee66666    # 0.45f

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1226
    .line 1227
    .line 1228
    const/high16 v17, 0x41a80000    # 21.0f

    .line 1229
    .line 1230
    const/high16 v18, 0x41400000    # 12.0f

    .line 1231
    .line 1232
    const/high16 v13, 0x41b00000    # 22.0f

    .line 1233
    .line 1234
    const v14, 0x4138cccd    # 11.55f

    .line 1235
    .line 1236
    .line 1237
    const v15, 0x41ac6666    # 21.55f

    .line 1238
    .line 1239
    .line 1240
    const/high16 v16, 0x41400000    # 12.0f

    .line 1241
    .line 1242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1246
    .line 1247
    .line 1248
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v2

    .line 1252
    const/16 v16, 0x3800

    .line 1253
    .line 1254
    const/16 v17, 0x0

    .line 1255
    .line 1256
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1257
    .line 1258
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1259
    .line 1260
    const/4 v7, 0x0

    .line 1261
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1262
    .line 1263
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1264
    .line 1265
    const/4 v13, 0x0

    .line 1266
    const/4 v14, 0x0

    .line 1267
    const/4 v15, 0x0

    .line 1268
    const-string v4, ""

    .line 1269
    .line 1270
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v0

    .line 1274
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v0

    .line 1278
    sput-object v0, Landroidx/compose/material/icons/rounded/TtyKt;->_tty:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1279
    .line 1280
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1281
    .line 1282
    .line 1283
    return-object v0
.end method
