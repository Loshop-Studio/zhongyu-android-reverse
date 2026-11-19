.class public final Landroidx/compose/material/icons/twotone/SpeakerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_speaker",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Speaker",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSpeaker",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nSpeaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Speaker.kt\nandroidx/compose/material/icons/twotone/SpeakerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n233#2,18:143\n253#2:180\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n705#4,2:161\n717#4,2:163\n719#4,11:169\n72#5,4:127\n72#5,4:165\n*S KotlinDebug\n*F\n+ 1 Speaker.kt\nandroidx/compose/material/icons/twotone/SpeakerKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n50#1:143,18\n50#1:180\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n50#1:161,2\n50#1:163,2\n50#1:169,11\n30#1:127,4\n50#1:165,4\n*E\n"
    }
.end annotation


# static fields
.field private static _speaker:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSpeaker(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SpeakerKt;->_speaker:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Speaker"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x40e00000    # 7.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41800000    # 16.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41200000    # 10.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x41880000    # 17.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x40e00000    # 7.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v4, 0x40a00000    # 5.0f

    .line 101
    .line 102
    const/high16 v6, 0x41400000    # 12.0f

    .line 103
    .line 104
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v25, 0x40000000    # 2.0f

    .line 108
    .line 109
    const/high16 v26, 0x40000000    # 2.0f

    .line 110
    .line 111
    const v21, 0x3f8ccccd    # 1.1f

    .line 112
    .line 113
    .line 114
    const/16 v22, 0x0

    .line 115
    .line 116
    const/high16 v23, 0x40000000    # 2.0f

    .line 117
    .line 118
    const v24, 0x3f666666    # 0.9f

    .line 119
    .line 120
    .line 121
    move-object/from16 v20, v2

    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v4, -0x4099999a    # -0.9f

    .line 127
    .line 128
    .line 129
    const/high16 v6, -0x40000000    # -2.0f

    .line 130
    .line 131
    const/high16 v7, 0x40000000    # 2.0f

    .line 132
    .line 133
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v25, -0x40000000    # -2.0f

    .line 137
    .line 138
    const/high16 v26, -0x40000000    # -2.0f

    .line 139
    .line 140
    const v21, -0x4071eb85    # -1.11f

    .line 141
    .line 142
    .line 143
    const/high16 v23, -0x40000000    # -2.0f

    .line 144
    .line 145
    const v24, -0x4099999a    # -0.9f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, 0x3f63d70a    # 0.89f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v4, 0x41980000    # 19.0f

    .line 161
    .line 162
    const/high16 v6, 0x41400000    # 12.0f

    .line 163
    .line 164
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v25, -0x3f800000    # -4.0f

    .line 168
    .line 169
    const/high16 v26, -0x3f800000    # -4.0f

    .line 170
    .line 171
    const v21, -0x3ff28f5c    # -2.21f

    .line 172
    .line 173
    .line 174
    const/high16 v23, -0x3f800000    # -4.0f

    .line 175
    .line 176
    const v24, -0x401ae148    # -1.79f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, 0x3fe51eb8    # 1.79f

    .line 183
    .line 184
    .line 185
    const/high16 v6, -0x3f800000    # -4.0f

    .line 186
    .line 187
    const/high16 v7, 0x40800000    # 4.0f

    .line 188
    .line 189
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v6, 0x40800000    # 4.0f

    .line 193
    .line 194
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v4, -0x401ae148    # -1.79f

    .line 198
    .line 199
    .line 200
    const/high16 v6, -0x3f800000    # -4.0f

    .line 201
    .line 202
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    const/16 v16, 0x3800

    .line 213
    .line 214
    const/16 v17, 0x0

    .line 215
    .line 216
    const v6, 0x3e99999a    # 0.3f

    .line 217
    .line 218
    .line 219
    const v8, 0x3e99999a    # 0.3f

    .line 220
    .line 221
    .line 222
    const/4 v7, 0x0

    .line 223
    const/high16 v9, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const/high16 v12, 0x3f800000    # 1.0f

    .line 226
    .line 227
    const/4 v13, 0x0

    .line 228
    const/4 v14, 0x0

    .line 229
    const/4 v15, 0x0

    .line 230
    const-string v4, ""

    .line 231
    .line 232
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 233
    .line 234
    .line 235
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 240
    .line 241
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 242
    .line 243
    .line 244
    move-result-wide v6

    .line 245
    const/4 v0, 0x0

    .line 246
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 250
    .line 251
    .line 252
    move-result v10

    .line 253
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 254
    .line 255
    .line 256
    move-result v11

    .line 257
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 260
    .line 261
    .line 262
    const/high16 v0, 0x41880000    # 17.0f

    .line 263
    .line 264
    const/high16 v2, 0x40000000    # 2.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v0, 0x40e00000    # 7.0f

    .line 270
    .line 271
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, -0x40000000    # -2.0f

    .line 275
    .line 276
    const/high16 v18, 0x40000000    # 2.0f

    .line 277
    .line 278
    const v13, -0x40733333    # -1.1f

    .line 279
    .line 280
    .line 281
    const/high16 v15, -0x40000000    # -2.0f

    .line 282
    .line 283
    const v16, 0x3f666666    # 0.9f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v0, 0x41800000    # 16.0f

    .line 290
    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v17, 0x40000000    # 2.0f

    .line 295
    .line 296
    const v18, 0x3ffeb852    # 1.99f

    .line 297
    .line 298
    .line 299
    const/4 v13, 0x0

    .line 300
    const v14, 0x3f8ccccd    # 1.1f

    .line 301
    .line 302
    .line 303
    const v15, 0x3f666666    # 0.9f

    .line 304
    .line 305
    .line 306
    const v16, 0x3ffeb852    # 1.99f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v0, 0x41b00000    # 22.0f

    .line 313
    .line 314
    const/high16 v2, 0x41880000    # 17.0f

    .line 315
    .line 316
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v18, -0x40000000    # -2.0f

    .line 320
    .line 321
    const v13, 0x3f8ccccd    # 1.1f

    .line 322
    .line 323
    .line 324
    const/4 v14, 0x0

    .line 325
    const/high16 v15, 0x40000000    # 2.0f

    .line 326
    .line 327
    const v16, -0x4099999a    # -0.9f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v0, 0x41980000    # 19.0f

    .line 334
    .line 335
    const/high16 v2, 0x40800000    # 4.0f

    .line 336
    .line 337
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v17, -0x40000000    # -2.0f

    .line 341
    .line 342
    const/4 v13, 0x0

    .line 343
    const v14, -0x40733333    # -1.1f

    .line 344
    .line 345
    .line 346
    const v15, -0x4099999a    # -0.9f

    .line 347
    .line 348
    .line 349
    const/high16 v16, -0x40000000    # -2.0f

    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v0, 0x41a00000    # 20.0f

    .line 358
    .line 359
    const/high16 v2, 0x40e00000    # 7.0f

    .line 360
    .line 361
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v0, 0x40e00000    # 7.0f

    .line 365
    .line 366
    const/high16 v2, 0x40800000    # 4.0f

    .line 367
    .line 368
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, 0x41200000    # 10.0f

    .line 372
    .line 373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x41800000    # 16.0f

    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v0, 0x41a00000    # 20.0f

    .line 382
    .line 383
    const/high16 v2, 0x40e00000    # 7.0f

    .line 384
    .line 385
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, 0x41100000    # 9.0f

    .line 392
    .line 393
    const/high16 v2, 0x41400000    # 12.0f

    .line 394
    .line 395
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v17, 0x40000000    # 2.0f

    .line 399
    .line 400
    const v13, 0x3f8ccccd    # 1.1f

    .line 401
    .line 402
    .line 403
    const/4 v14, 0x0

    .line 404
    const/high16 v15, 0x40000000    # 2.0f

    .line 405
    .line 406
    const v16, -0x4099999a    # -0.9f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, -0x4099999a    # -0.9f

    .line 413
    .line 414
    .line 415
    const/high16 v2, -0x40000000    # -2.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v17, -0x40000000    # -2.0f

    .line 421
    .line 422
    const/high16 v18, 0x40000000    # 2.0f

    .line 423
    .line 424
    const v13, -0x4071eb85    # -1.11f

    .line 425
    .line 426
    .line 427
    const/high16 v15, -0x40000000    # -2.0f

    .line 428
    .line 429
    const v16, 0x3f666666    # 0.9f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, 0x3f63d70a    # 0.89f

    .line 436
    .line 437
    .line 438
    const/high16 v2, 0x40000000    # 2.0f

    .line 439
    .line 440
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v0, 0x41300000    # 11.0f

    .line 447
    .line 448
    const/high16 v2, 0x41400000    # 12.0f

    .line 449
    .line 450
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v17, -0x3f800000    # -4.0f

    .line 454
    .line 455
    const/high16 v18, 0x40800000    # 4.0f

    .line 456
    .line 457
    const v13, -0x3ff28f5c    # -2.21f

    .line 458
    .line 459
    .line 460
    const/high16 v15, -0x3f800000    # -4.0f

    .line 461
    .line 462
    const v16, 0x3fe51eb8    # 1.79f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, 0x3fe51eb8    # 1.79f

    .line 469
    .line 470
    .line 471
    const/high16 v2, 0x40800000    # 4.0f

    .line 472
    .line 473
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, -0x401ae148    # -1.79f

    .line 477
    .line 478
    .line 479
    const/high16 v2, -0x3f800000    # -4.0f

    .line 480
    .line 481
    const/high16 v4, 0x40800000    # 4.0f

    .line 482
    .line 483
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v0, 0x41880000    # 17.0f

    .line 493
    .line 494
    const/high16 v2, 0x41400000    # 12.0f

    .line 495
    .line 496
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v17, -0x40000000    # -2.0f

    .line 500
    .line 501
    const/high16 v18, -0x40000000    # -2.0f

    .line 502
    .line 503
    const v13, -0x40733333    # -1.1f

    .line 504
    .line 505
    .line 506
    const/high16 v15, -0x40000000    # -2.0f

    .line 507
    .line 508
    const v16, -0x4099999a    # -0.9f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x3f666666    # 0.9f

    .line 515
    .line 516
    .line 517
    const/high16 v2, -0x40000000    # -2.0f

    .line 518
    .line 519
    const/high16 v4, 0x40000000    # 2.0f

    .line 520
    .line 521
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v2, 0x40000000    # 2.0f

    .line 525
    .line 526
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v0, -0x4099999a    # -0.9f

    .line 530
    .line 531
    .line 532
    const/high16 v2, -0x40000000    # -2.0f

    .line 533
    .line 534
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    const/16 v16, 0x3800

    .line 545
    .line 546
    const/16 v17, 0x0

    .line 547
    .line 548
    const/high16 v6, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const/high16 v8, 0x3f800000    # 1.0f

    .line 551
    .line 552
    const/4 v7, 0x0

    .line 553
    const/high16 v12, 0x3f800000    # 1.0f

    .line 554
    .line 555
    const/4 v13, 0x0

    .line 556
    const/4 v15, 0x0

    .line 557
    const-string v4, ""

    .line 558
    .line 559
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    sput-object v0, Landroidx/compose/material/icons/twotone/SpeakerKt;->_speaker:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 568
    .line 569
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 570
    .line 571
    .line 572
    return-object v0
.end method
