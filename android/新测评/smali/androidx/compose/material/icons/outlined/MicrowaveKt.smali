.class public final Landroidx/compose/material/icons/outlined/MicrowaveKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_microwave",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Microwave",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getMicrowave",
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
        "SMAP\nMicrowave.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Microwave.kt\nandroidx/compose/material/icons/outlined/MicrowaveKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,109:1\n212#2,12:110\n233#2,18:123\n253#2:160\n174#3:122\n705#4,2:141\n717#4,2:143\n719#4,11:149\n72#5,4:145\n*S KotlinDebug\n*F\n+ 1 Microwave.kt\nandroidx/compose/material/icons/outlined/MicrowaveKt\n*L\n29#1:110,12\n30#1:123,18\n30#1:160\n29#1:122\n30#1:141,2\n30#1:143,2\n30#1:149,11\n30#1:145,4\n*E\n"
    }
.end annotation


# static fields
.field private static _microwave:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMicrowave(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/MicrowaveKt;->_microwave:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Microwave"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x40000000    # 2.0f

    .line 83
    .line 84
    const/high16 v18, 0x40c00000    # 6.0f

    .line 85
    .line 86
    const v13, 0x4039999a    # 2.9f

    .line 87
    .line 88
    .line 89
    const/high16 v14, 0x40800000    # 4.0f

    .line 90
    .line 91
    const/high16 v15, 0x40000000    # 2.0f

    .line 92
    .line 93
    const v16, 0x409ccccd    # 4.9f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x41400000    # 12.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v18, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/4 v13, 0x0

    .line 107
    const v14, 0x3f8ccccd    # 1.1f

    .line 108
    .line 109
    .line 110
    const v15, 0x3f666666    # 0.9f

    .line 111
    .line 112
    .line 113
    const/high16 v16, 0x40000000    # 2.0f

    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v0, 0x41800000    # 16.0f

    .line 119
    .line 120
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v18, -0x40000000    # -2.0f

    .line 124
    .line 125
    const v13, 0x3f8ccccd    # 1.1f

    .line 126
    .line 127
    .line 128
    const/4 v14, 0x0

    .line 129
    const/high16 v15, 0x40000000    # 2.0f

    .line 130
    .line 131
    const v16, -0x4099999a    # -0.9f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x40c00000    # 6.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v17, 0x41a00000    # 20.0f

    .line 143
    .line 144
    const/high16 v18, 0x40800000    # 4.0f

    .line 145
    .line 146
    const/high16 v13, 0x41b00000    # 22.0f

    .line 147
    .line 148
    const v14, 0x409ccccd    # 4.9f

    .line 149
    .line 150
    .line 151
    const v15, 0x41a8cccd    # 21.1f

    .line 152
    .line 153
    .line 154
    const/high16 v16, 0x40800000    # 4.0f

    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, 0x41200000    # 10.0f

    .line 166
    .line 167
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v0, 0x41400000    # 12.0f

    .line 171
    .line 172
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v0, 0x40800000    # 4.0f

    .line 176
    .line 177
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v0, 0x40c00000    # 6.0f

    .line 181
    .line 182
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v0, 0x41a00000    # 20.0f

    .line 189
    .line 190
    const/high16 v2, 0x41900000    # 18.0f

    .line 191
    .line 192
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v0, -0x3f800000    # -4.0f

    .line 196
    .line 197
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v0, 0x40c00000    # 6.0f

    .line 201
    .line 202
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x40800000    # 4.0f

    .line 206
    .line 207
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v0, 0x41900000    # 18.0f

    .line 211
    .line 212
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v0, 0x41980000    # 19.0f

    .line 219
    .line 220
    const/high16 v2, 0x41100000    # 9.0f

    .line 221
    .line 222
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, -0x40000000    # -2.0f

    .line 226
    .line 227
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v0, 0x40e00000    # 7.0f

    .line 231
    .line 232
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v0, 0x40000000    # 2.0f

    .line 236
    .line 237
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v0, 0x41100000    # 9.0f

    .line 241
    .line 242
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v0, 0x41500000    # 13.0f

    .line 249
    .line 250
    const/high16 v2, 0x41900000    # 18.0f

    .line 251
    .line 252
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v17, -0x40800000    # -1.0f

    .line 259
    .line 260
    const/high16 v18, -0x40800000    # -1.0f

    .line 261
    .line 262
    const v13, -0x40f33333    # -0.55f

    .line 263
    .line 264
    .line 265
    const/4 v14, 0x0

    .line 266
    const/high16 v15, -0x40800000    # -1.0f

    .line 267
    .line 268
    const v16, -0x4119999a    # -0.45f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/4 v0, 0x0

    .line 275
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v17, 0x3f800000    # 1.0f

    .line 279
    .line 280
    const/4 v13, 0x0

    .line 281
    const v14, -0x40f33333    # -0.55f

    .line 282
    .line 283
    .line 284
    const v15, 0x3ee66666    # 0.45f

    .line 285
    .line 286
    .line 287
    const/high16 v16, -0x40800000    # -1.0f

    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v18, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const v13, 0x3f0ccccd    # 0.55f

    .line 298
    .line 299
    .line 300
    const/4 v14, 0x0

    .line 301
    const/high16 v15, 0x3f800000    # 1.0f

    .line 302
    .line 303
    const v16, 0x3ee66666    # 0.45f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v17, 0x41900000    # 18.0f

    .line 313
    .line 314
    const/high16 v18, 0x41500000    # 13.0f

    .line 315
    .line 316
    const/high16 v13, 0x41980000    # 19.0f

    .line 317
    .line 318
    const v14, 0x4148cccd    # 12.55f

    .line 319
    .line 320
    .line 321
    const v15, 0x41946666    # 18.55f

    .line 322
    .line 323
    .line 324
    const/high16 v16, 0x41500000    # 13.0f

    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v0, 0x41880000    # 17.0f

    .line 333
    .line 334
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v17, -0x40800000    # -1.0f

    .line 341
    .line 342
    const/high16 v18, -0x40800000    # -1.0f

    .line 343
    .line 344
    const v13, -0x40f33333    # -0.55f

    .line 345
    .line 346
    .line 347
    const/4 v14, 0x0

    .line 348
    const/high16 v15, -0x40800000    # -1.0f

    .line 349
    .line 350
    const v16, -0x4119999a    # -0.45f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/4 v0, 0x0

    .line 357
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v17, 0x3f800000    # 1.0f

    .line 361
    .line 362
    const/4 v13, 0x0

    .line 363
    const v14, -0x40f33333    # -0.55f

    .line 364
    .line 365
    .line 366
    const v15, 0x3ee66666    # 0.45f

    .line 367
    .line 368
    .line 369
    const/high16 v16, -0x40800000    # -1.0f

    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v18, 0x3f800000    # 1.0f

    .line 378
    .line 379
    const v13, 0x3f0ccccd    # 0.55f

    .line 380
    .line 381
    .line 382
    const/4 v14, 0x0

    .line 383
    const/high16 v15, 0x3f800000    # 1.0f

    .line 384
    .line 385
    const v16, 0x3ee66666    # 0.45f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v17, 0x41900000    # 18.0f

    .line 395
    .line 396
    const/high16 v18, 0x41880000    # 17.0f

    .line 397
    .line 398
    const/high16 v13, 0x41980000    # 19.0f

    .line 399
    .line 400
    const v14, 0x41846666    # 16.55f

    .line 401
    .line 402
    .line 403
    const v15, 0x41946666    # 18.55f

    .line 404
    .line 405
    .line 406
    const/high16 v16, 0x41880000    # 17.0f

    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v0, 0x41240000    # 10.25f

    .line 415
    .line 416
    const/high16 v2, 0x41800000    # 16.0f

    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, -0x401ae148    # -1.79f

    .line 422
    .line 423
    .line 424
    const v18, -0x40d70a3d    # -0.66f

    .line 425
    .line 426
    .line 427
    const v13, -0x40b5c28f    # -0.79f

    .line 428
    .line 429
    .line 430
    const/4 v14, 0x0

    .line 431
    const v15, -0x4050a3d7    # -1.37f

    .line 432
    .line 433
    .line 434
    const v16, -0x413d70a4    # -0.38f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v17, 0x40f80000    # 7.75f

    .line 441
    .line 442
    const/high16 v18, 0x41700000    # 15.0f

    .line 443
    .line 444
    const v13, 0x4102147b    # 8.13f

    .line 445
    .line 446
    .line 447
    const v14, 0x4171eb85    # 15.12f

    .line 448
    .line 449
    .line 450
    const v15, 0x40fe147b    # 7.94f

    .line 451
    .line 452
    .line 453
    const/high16 v16, 0x41700000    # 15.0f

    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v17, -0x408ccccd    # -0.95f

    .line 459
    .line 460
    .line 461
    const v18, 0x3f1c28f6    # 0.61f

    .line 462
    .line 463
    .line 464
    const v13, -0x41428f5c    # -0.37f

    .line 465
    .line 466
    .line 467
    const/4 v14, 0x0

    .line 468
    const v15, -0x40b33333    # -0.8f

    .line 469
    .line 470
    .line 471
    const v16, 0x3ed1eb85    # 0.41f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, -0x404a3d71    # -1.42f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v17, 0x40f80000    # 7.75f

    .line 484
    .line 485
    const/high16 v18, 0x41500000    # 13.0f

    .line 486
    .line 487
    const v13, 0x40b75c29    # 5.73f

    .line 488
    .line 489
    .line 490
    const v14, 0x415ca3d7    # 13.79f

    .line 491
    .line 492
    .line 493
    const v15, 0x40d2e148    # 6.59f

    .line 494
    .line 495
    .line 496
    const/high16 v16, 0x41500000    # 13.0f

    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v17, 0x3fe7ae14    # 1.81f

    .line 502
    .line 503
    .line 504
    const v18, 0x3f2b851f    # 0.67f

    .line 505
    .line 506
    .line 507
    const v13, 0x3f4ccccd    # 0.8f

    .line 508
    .line 509
    .line 510
    const/4 v14, 0x0

    .line 511
    const v15, 0x3fb1eb85    # 1.39f

    .line 512
    .line 513
    .line 514
    const v16, 0x3ec7ae14    # 0.39f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v17, 0x41240000    # 10.25f

    .line 521
    .line 522
    const/high16 v18, 0x41600000    # 14.0f

    .line 523
    .line 524
    const v13, 0x411deb85    # 9.87f

    .line 525
    .line 526
    .line 527
    const v14, 0x415e147b    # 13.88f

    .line 528
    .line 529
    .line 530
    const v15, 0x41211eb8    # 10.07f

    .line 531
    .line 532
    .line 533
    const/high16 v16, 0x41600000    # 14.0f

    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v17, 0x3f733333    # 0.95f

    .line 539
    .line 540
    .line 541
    const v18, -0x40e3d70a    # -0.61f

    .line 542
    .line 543
    .line 544
    const v13, 0x3ebd70a4    # 0.37f

    .line 545
    .line 546
    .line 547
    const/4 v14, 0x0

    .line 548
    const v15, 0x3f4ccccd    # 0.8f

    .line 549
    .line 550
    .line 551
    const v16, -0x412e147b    # -0.41f

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, 0x3fb5c28f    # 1.42f

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v17, 0x41240000    # 10.25f

    .line 564
    .line 565
    const/high16 v18, 0x41800000    # 16.0f

    .line 566
    .line 567
    const v13, 0x414428f6    # 12.26f

    .line 568
    .line 569
    .line 570
    const v14, 0x41735c29    # 15.21f

    .line 571
    .line 572
    .line 573
    const v15, 0x41368f5c    # 11.41f

    .line 574
    .line 575
    .line 576
    const/high16 v16, 0x41800000    # 16.0f

    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v0, 0x41300000    # 11.0f

    .line 585
    .line 586
    const/high16 v2, 0x41240000    # 10.25f

    .line 587
    .line 588
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v17, -0x401ae148    # -1.79f

    .line 592
    .line 593
    .line 594
    const v18, -0x40d70a3d    # -0.66f

    .line 595
    .line 596
    .line 597
    const v13, -0x40b5c28f    # -0.79f

    .line 598
    .line 599
    .line 600
    const/4 v14, 0x0

    .line 601
    const v15, -0x4050a3d7    # -1.37f

    .line 602
    .line 603
    .line 604
    const v16, -0x413d70a4    # -0.38f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v17, 0x40f80000    # 7.75f

    .line 611
    .line 612
    const/high16 v18, 0x41200000    # 10.0f

    .line 613
    .line 614
    const v13, 0x4102147b    # 8.13f

    .line 615
    .line 616
    .line 617
    const v14, 0x4121eb85    # 10.12f

    .line 618
    .line 619
    .line 620
    const v15, 0x40fe147b    # 7.94f

    .line 621
    .line 622
    .line 623
    const/high16 v16, 0x41200000    # 10.0f

    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v17, -0x408ccccd    # -0.95f

    .line 629
    .line 630
    .line 631
    const v18, 0x3f1c28f6    # 0.61f

    .line 632
    .line 633
    .line 634
    const v13, -0x41428f5c    # -0.37f

    .line 635
    .line 636
    .line 637
    const/4 v14, 0x0

    .line 638
    const v15, -0x40b33333    # -0.8f

    .line 639
    .line 640
    .line 641
    const v16, 0x3ed1eb85    # 0.41f

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v0, 0x40abd70a    # 5.37f

    .line 648
    .line 649
    .line 650
    const v2, 0x41130a3d    # 9.19f

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v17, 0x40f80000    # 7.75f

    .line 657
    .line 658
    const/high16 v18, 0x41000000    # 8.0f

    .line 659
    .line 660
    const v13, 0x40b75c29    # 5.73f

    .line 661
    .line 662
    .line 663
    const v14, 0x410ca3d7    # 8.79f

    .line 664
    .line 665
    .line 666
    const v15, 0x40d2e148    # 6.59f

    .line 667
    .line 668
    .line 669
    const/high16 v16, 0x41000000    # 8.0f

    .line 670
    .line 671
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v17, 0x3fe7ae14    # 1.81f

    .line 675
    .line 676
    .line 677
    const v18, 0x3f2b851f    # 0.67f

    .line 678
    .line 679
    .line 680
    const v13, 0x3f4ccccd    # 0.8f

    .line 681
    .line 682
    .line 683
    const/4 v14, 0x0

    .line 684
    const v15, 0x3fb1eb85    # 1.39f

    .line 685
    .line 686
    .line 687
    const v16, 0x3ec7ae14    # 0.39f

    .line 688
    .line 689
    .line 690
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const/high16 v17, 0x41240000    # 10.25f

    .line 694
    .line 695
    const/high16 v18, 0x41100000    # 9.0f

    .line 696
    .line 697
    const v13, 0x411deb85    # 9.87f

    .line 698
    .line 699
    .line 700
    const v14, 0x410e147b    # 8.88f

    .line 701
    .line 702
    .line 703
    const v15, 0x41211eb8    # 10.07f

    .line 704
    .line 705
    .line 706
    const/high16 v16, 0x41100000    # 9.0f

    .line 707
    .line 708
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v17, 0x3f733333    # 0.95f

    .line 712
    .line 713
    .line 714
    const v18, -0x40e3d70a    # -0.61f

    .line 715
    .line 716
    .line 717
    const v13, 0x3ebd70a4    # 0.37f

    .line 718
    .line 719
    .line 720
    const/4 v14, 0x0

    .line 721
    const v15, 0x3f4ccccd    # 0.8f

    .line 722
    .line 723
    .line 724
    const v16, -0x412e147b    # -0.41f

    .line 725
    .line 726
    .line 727
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const v0, 0x3fb5c28f    # 1.42f

    .line 731
    .line 732
    .line 733
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const/high16 v17, 0x41240000    # 10.25f

    .line 737
    .line 738
    const/high16 v18, 0x41300000    # 11.0f

    .line 739
    .line 740
    const v13, 0x414428f6    # 12.26f

    .line 741
    .line 742
    .line 743
    const v14, 0x41235c29    # 10.21f

    .line 744
    .line 745
    .line 746
    const v15, 0x41368f5c    # 11.41f

    .line 747
    .line 748
    .line 749
    const/high16 v16, 0x41300000    # 11.0f

    .line 750
    .line 751
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    const/16 v16, 0x3800

    .line 762
    .line 763
    const/16 v17, 0x0

    .line 764
    .line 765
    const/high16 v6, 0x3f800000    # 1.0f

    .line 766
    .line 767
    const/high16 v8, 0x3f800000    # 1.0f

    .line 768
    .line 769
    const/4 v7, 0x0

    .line 770
    const/high16 v9, 0x3f800000    # 1.0f

    .line 771
    .line 772
    const/high16 v12, 0x3f800000    # 1.0f

    .line 773
    .line 774
    const/4 v13, 0x0

    .line 775
    const/4 v14, 0x0

    .line 776
    const/4 v15, 0x0

    .line 777
    const-string v4, ""

    .line 778
    .line 779
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    sput-object v0, Landroidx/compose/material/icons/outlined/MicrowaveKt;->_microwave:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 788
    .line 789
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 790
    .line 791
    .line 792
    return-object v0
.end method
