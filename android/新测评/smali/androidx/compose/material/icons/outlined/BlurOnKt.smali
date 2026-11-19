.class public final Landroidx/compose/material/icons/outlined/BlurOnKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_blurOn",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "BlurOn",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getBlurOn",
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
        "SMAP\nBlurOn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlurOn.kt\nandroidx/compose/material/icons/outlined/BlurOnKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,181:1\n212#2,12:182\n233#2,18:195\n253#2:232\n174#3:194\n705#4,2:213\n717#4,2:215\n719#4,11:221\n72#5,4:217\n*S KotlinDebug\n*F\n+ 1 BlurOn.kt\nandroidx/compose/material/icons/outlined/BlurOnKt\n*L\n29#1:182,12\n30#1:195,18\n30#1:232\n29#1:194\n30#1:213,2\n30#1:215,2\n30#1:221,11\n30#1:217,4\n*E\n"
    }
.end annotation


# static fields
.field private static _blurOn:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBlurOn(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/BlurOnKt;->_blurOn:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.BlurOn"

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
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v18, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const v13, -0x40f33333    # -0.55f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x40800000    # -1.0f

    .line 86
    .line 87
    const v16, 0x3ee66666    # 0.45f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x3ee66666    # 0.45f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x3f800000    # 1.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, -0x4119999a    # -0.45f

    .line 102
    .line 103
    .line 104
    const/high16 v2, -0x40800000    # -1.0f

    .line 105
    .line 106
    const/high16 v4, 0x3f800000    # 1.0f

    .line 107
    .line 108
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x41880000    # 17.0f

    .line 118
    .line 119
    const/high16 v2, 0x40c00000    # 6.0f

    .line 120
    .line 121
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v0, 0x3ee66666    # 0.45f

    .line 128
    .line 129
    .line 130
    const/high16 v2, 0x3f800000    # 1.0f

    .line 131
    .line 132
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, -0x4119999a    # -0.45f

    .line 136
    .line 137
    .line 138
    const/high16 v2, -0x40800000    # -1.0f

    .line 139
    .line 140
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v0, 0x41100000    # 9.0f

    .line 150
    .line 151
    const/high16 v2, 0x40c00000    # 6.0f

    .line 152
    .line 153
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, 0x3ee66666    # 0.45f

    .line 160
    .line 161
    .line 162
    const/high16 v2, 0x3f800000    # 1.0f

    .line 163
    .line 164
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v0, -0x4119999a    # -0.45f

    .line 168
    .line 169
    .line 170
    const/high16 v2, -0x40800000    # -1.0f

    .line 171
    .line 172
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v0, 0x41180000    # 9.5f

    .line 182
    .line 183
    const/high16 v2, 0x40400000    # 3.0f

    .line 184
    .line 185
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v17, -0x41000000    # -0.5f

    .line 189
    .line 190
    const/high16 v18, 0x3f000000    # 0.5f

    .line 191
    .line 192
    const v13, -0x4170a3d7    # -0.28f

    .line 193
    .line 194
    .line 195
    const/high16 v15, -0x41000000    # -0.5f

    .line 196
    .line 197
    const v16, 0x3e6147ae    # 0.22f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v0, 0x3e6147ae    # 0.22f

    .line 204
    .line 205
    .line 206
    const/high16 v2, 0x3f000000    # 0.5f

    .line 207
    .line 208
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v0, -0x419eb852    # -0.22f

    .line 212
    .line 213
    .line 214
    const/high16 v2, -0x41000000    # -0.5f

    .line 215
    .line 216
    const/high16 v4, 0x3f000000    # 0.5f

    .line 217
    .line 218
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v0, 0x40a00000    # 5.0f

    .line 228
    .line 229
    const/high16 v2, 0x40c00000    # 6.0f

    .line 230
    .line 231
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v17, -0x40800000    # -1.0f

    .line 235
    .line 236
    const/high16 v18, 0x3f800000    # 1.0f

    .line 237
    .line 238
    const v13, -0x40f33333    # -0.55f

    .line 239
    .line 240
    .line 241
    const/high16 v15, -0x40800000    # -1.0f

    .line 242
    .line 243
    const v16, 0x3ee66666    # 0.45f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v0, 0x3ee66666    # 0.45f

    .line 250
    .line 251
    .line 252
    const/high16 v2, 0x3f800000    # 1.0f

    .line 253
    .line 254
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, -0x4119999a    # -0.45f

    .line 258
    .line 259
    .line 260
    const/high16 v2, -0x40800000    # -1.0f

    .line 261
    .line 262
    const/high16 v4, 0x3f800000    # 1.0f

    .line 263
    .line 264
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v0, 0x41a80000    # 21.0f

    .line 274
    .line 275
    const/high16 v2, 0x41280000    # 10.5f

    .line 276
    .line 277
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, 0x3f000000    # 0.5f

    .line 281
    .line 282
    const/high16 v18, -0x41000000    # -0.5f

    .line 283
    .line 284
    const v13, 0x3e8f5c29    # 0.28f

    .line 285
    .line 286
    .line 287
    const/high16 v15, 0x3f000000    # 0.5f

    .line 288
    .line 289
    const v16, -0x419eb852    # -0.22f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v0, -0x419eb852    # -0.22f

    .line 296
    .line 297
    .line 298
    const/high16 v2, -0x41000000    # -0.5f

    .line 299
    .line 300
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, 0x3e6147ae    # 0.22f

    .line 304
    .line 305
    .line 306
    const/high16 v4, 0x3f000000    # 0.5f

    .line 307
    .line 308
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v2, 0x3f000000    # 0.5f

    .line 312
    .line 313
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, 0x40e00000    # 7.0f

    .line 320
    .line 321
    const/high16 v2, 0x41600000    # 14.0f

    .line 322
    .line 323
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v17, 0x3f800000    # 1.0f

    .line 327
    .line 328
    const/high16 v18, -0x40800000    # -1.0f

    .line 329
    .line 330
    const v13, 0x3f0ccccd    # 0.55f

    .line 331
    .line 332
    .line 333
    const/high16 v15, 0x3f800000    # 1.0f

    .line 334
    .line 335
    const v16, -0x4119999a    # -0.45f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, -0x4119999a    # -0.45f

    .line 342
    .line 343
    .line 344
    const/high16 v2, -0x40800000    # -1.0f

    .line 345
    .line 346
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, 0x3ee66666    # 0.45f

    .line 350
    .line 351
    .line 352
    const/high16 v4, 0x3f800000    # 1.0f

    .line 353
    .line 354
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v2, 0x3f800000    # 1.0f

    .line 358
    .line 359
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x40600000    # 3.5f

    .line 366
    .line 367
    const/high16 v2, 0x41600000    # 14.0f

    .line 368
    .line 369
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v17, 0x3f000000    # 0.5f

    .line 373
    .line 374
    const/high16 v18, -0x41000000    # -0.5f

    .line 375
    .line 376
    const v13, 0x3e8f5c29    # 0.28f

    .line 377
    .line 378
    .line 379
    const/high16 v15, 0x3f000000    # 0.5f

    .line 380
    .line 381
    const v16, -0x419eb852    # -0.22f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, -0x419eb852    # -0.22f

    .line 388
    .line 389
    .line 390
    const/high16 v2, -0x41000000    # -0.5f

    .line 391
    .line 392
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, 0x3e6147ae    # 0.22f

    .line 396
    .line 397
    .line 398
    const/high16 v4, 0x3f000000    # 0.5f

    .line 399
    .line 400
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v2, 0x3f000000    # 0.5f

    .line 404
    .line 405
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v0, 0x41580000    # 13.5f

    .line 412
    .line 413
    const/high16 v2, 0x40400000    # 3.0f

    .line 414
    .line 415
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v17, -0x41000000    # -0.5f

    .line 419
    .line 420
    const/high16 v18, 0x3f000000    # 0.5f

    .line 421
    .line 422
    const v13, -0x4170a3d7    # -0.28f

    .line 423
    .line 424
    .line 425
    const/high16 v15, -0x41000000    # -0.5f

    .line 426
    .line 427
    const v16, 0x3e6147ae    # 0.22f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x3e6147ae    # 0.22f

    .line 434
    .line 435
    .line 436
    const/high16 v2, 0x3f000000    # 0.5f

    .line 437
    .line 438
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, -0x419eb852    # -0.22f

    .line 442
    .line 443
    .line 444
    const/high16 v2, -0x41000000    # -0.5f

    .line 445
    .line 446
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v0, 0x41a40000    # 20.5f

    .line 456
    .line 457
    const/high16 v2, 0x41200000    # 10.0f

    .line 458
    .line 459
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v0, 0x3e6147ae    # 0.22f

    .line 466
    .line 467
    .line 468
    const/high16 v2, 0x3f000000    # 0.5f

    .line 469
    .line 470
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, -0x419eb852    # -0.22f

    .line 474
    .line 475
    .line 476
    const/high16 v2, -0x41000000    # -0.5f

    .line 477
    .line 478
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v0, 0x40600000    # 3.5f

    .line 488
    .line 489
    const/high16 v2, 0x41200000    # 10.0f

    .line 490
    .line 491
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v17, 0x3f000000    # 0.5f

    .line 495
    .line 496
    const/high16 v18, -0x41000000    # -0.5f

    .line 497
    .line 498
    const v13, 0x3e8f5c29    # 0.28f

    .line 499
    .line 500
    .line 501
    const/high16 v15, 0x3f000000    # 0.5f

    .line 502
    .line 503
    const v16, -0x419eb852    # -0.22f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, -0x419eb852    # -0.22f

    .line 510
    .line 511
    .line 512
    const/high16 v2, -0x41000000    # -0.5f

    .line 513
    .line 514
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x3e6147ae    # 0.22f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v2, 0x3f000000    # 0.5f

    .line 524
    .line 525
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v0, 0x40e00000    # 7.0f

    .line 532
    .line 533
    const/high16 v2, 0x41200000    # 10.0f

    .line 534
    .line 535
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v17, 0x3f800000    # 1.0f

    .line 539
    .line 540
    const/high16 v18, -0x40800000    # -1.0f

    .line 541
    .line 542
    const v13, 0x3f0ccccd    # 0.55f

    .line 543
    .line 544
    .line 545
    const/high16 v15, 0x3f800000    # 1.0f

    .line 546
    .line 547
    const v16, -0x4119999a    # -0.45f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, -0x4119999a    # -0.45f

    .line 554
    .line 555
    .line 556
    const/high16 v2, -0x40800000    # -1.0f

    .line 557
    .line 558
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v0, 0x3ee66666    # 0.45f

    .line 562
    .line 563
    .line 564
    const/high16 v4, 0x3f800000    # 1.0f

    .line 565
    .line 566
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v2, 0x3f800000    # 1.0f

    .line 570
    .line 571
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v0, 0x41480000    # 12.5f

    .line 578
    .line 579
    const/high16 v2, 0x41200000    # 10.0f

    .line 580
    .line 581
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v17, -0x40400000    # -1.5f

    .line 585
    .line 586
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 587
    .line 588
    const v13, -0x40ab851f    # -0.83f

    .line 589
    .line 590
    .line 591
    const/high16 v15, -0x40400000    # -1.5f

    .line 592
    .line 593
    const v16, 0x3f2b851f    # 0.67f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x3f2b851f    # 0.67f

    .line 600
    .line 601
    .line 602
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 603
    .line 604
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v0, -0x40d47ae1    # -0.67f

    .line 608
    .line 609
    .line 610
    const/high16 v2, -0x40400000    # -1.5f

    .line 611
    .line 612
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 613
    .line 614
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v0, 0x41500000    # 13.0f

    .line 624
    .line 625
    const/high16 v2, 0x41900000    # 18.0f

    .line 626
    .line 627
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v17, -0x40800000    # -1.0f

    .line 631
    .line 632
    const/high16 v18, 0x3f800000    # 1.0f

    .line 633
    .line 634
    const v13, -0x40f33333    # -0.55f

    .line 635
    .line 636
    .line 637
    const/high16 v15, -0x40800000    # -1.0f

    .line 638
    .line 639
    const v16, 0x3ee66666    # 0.45f

    .line 640
    .line 641
    .line 642
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v0, 0x3ee66666    # 0.45f

    .line 646
    .line 647
    .line 648
    const/high16 v2, 0x3f800000    # 1.0f

    .line 649
    .line 650
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, -0x4119999a    # -0.45f

    .line 654
    .line 655
    .line 656
    const/high16 v2, -0x40800000    # -1.0f

    .line 657
    .line 658
    const/high16 v4, 0x3f800000    # 1.0f

    .line 659
    .line 660
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v0, 0x41900000    # 18.0f

    .line 670
    .line 671
    const/high16 v2, 0x41880000    # 17.0f

    .line 672
    .line 673
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v0, 0x3ee66666    # 0.45f

    .line 680
    .line 681
    .line 682
    const/high16 v2, 0x3f800000    # 1.0f

    .line 683
    .line 684
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v0, -0x4119999a    # -0.45f

    .line 688
    .line 689
    .line 690
    const/high16 v2, -0x40800000    # -1.0f

    .line 691
    .line 692
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const/high16 v0, 0x41100000    # 9.0f

    .line 702
    .line 703
    const/high16 v2, 0x41900000    # 18.0f

    .line 704
    .line 705
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v0, 0x3ee66666    # 0.45f

    .line 712
    .line 713
    .line 714
    const/high16 v2, 0x3f800000    # 1.0f

    .line 715
    .line 716
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v0, -0x4119999a    # -0.45f

    .line 720
    .line 721
    .line 722
    const/high16 v2, -0x40800000    # -1.0f

    .line 723
    .line 724
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const/high16 v0, 0x40a00000    # 5.0f

    .line 734
    .line 735
    const/high16 v2, 0x41900000    # 18.0f

    .line 736
    .line 737
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v0, 0x3ee66666    # 0.45f

    .line 744
    .line 745
    .line 746
    const/high16 v2, 0x3f800000    # 1.0f

    .line 747
    .line 748
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v0, -0x4119999a    # -0.45f

    .line 752
    .line 753
    .line 754
    const/high16 v2, -0x40800000    # -1.0f

    .line 755
    .line 756
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/high16 v0, 0x41a80000    # 21.0f

    .line 766
    .line 767
    const/high16 v2, 0x41580000    # 13.5f

    .line 768
    .line 769
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const/high16 v17, -0x41000000    # -0.5f

    .line 773
    .line 774
    const/high16 v18, 0x3f000000    # 0.5f

    .line 775
    .line 776
    const v13, -0x4170a3d7    # -0.28f

    .line 777
    .line 778
    .line 779
    const/high16 v15, -0x41000000    # -0.5f

    .line 780
    .line 781
    const v16, 0x3e6147ae    # 0.22f

    .line 782
    .line 783
    .line 784
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const v0, 0x3e6147ae    # 0.22f

    .line 788
    .line 789
    .line 790
    const/high16 v2, 0x3f000000    # 0.5f

    .line 791
    .line 792
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const v0, -0x419eb852    # -0.22f

    .line 796
    .line 797
    .line 798
    const/high16 v2, -0x41000000    # -0.5f

    .line 799
    .line 800
    const/high16 v4, 0x3f000000    # 0.5f

    .line 801
    .line 802
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const/high16 v0, 0x41880000    # 17.0f

    .line 812
    .line 813
    const/high16 v2, 0x41600000    # 14.0f

    .line 814
    .line 815
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const/high16 v17, -0x40800000    # -1.0f

    .line 819
    .line 820
    const/high16 v18, 0x3f800000    # 1.0f

    .line 821
    .line 822
    const v13, -0x40f33333    # -0.55f

    .line 823
    .line 824
    .line 825
    const/high16 v15, -0x40800000    # -1.0f

    .line 826
    .line 827
    const v16, 0x3ee66666    # 0.45f

    .line 828
    .line 829
    .line 830
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const v0, 0x3ee66666    # 0.45f

    .line 834
    .line 835
    .line 836
    const/high16 v2, 0x3f800000    # 1.0f

    .line 837
    .line 838
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const v0, -0x4119999a    # -0.45f

    .line 842
    .line 843
    .line 844
    const/high16 v2, -0x40800000    # -1.0f

    .line 845
    .line 846
    const/high16 v4, 0x3f800000    # 1.0f

    .line 847
    .line 848
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const/high16 v0, 0x41a40000    # 20.5f

    .line 858
    .line 859
    const/high16 v2, 0x41600000    # 14.0f

    .line 860
    .line 861
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    const/high16 v17, -0x41000000    # -0.5f

    .line 865
    .line 866
    const/high16 v18, 0x3f000000    # 0.5f

    .line 867
    .line 868
    const v13, -0x4170a3d7    # -0.28f

    .line 869
    .line 870
    .line 871
    const/high16 v15, -0x41000000    # -0.5f

    .line 872
    .line 873
    const v16, 0x3e6147ae    # 0.22f

    .line 874
    .line 875
    .line 876
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const v0, 0x3e6147ae    # 0.22f

    .line 880
    .line 881
    .line 882
    const/high16 v2, 0x3f000000    # 0.5f

    .line 883
    .line 884
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const v0, -0x419eb852    # -0.22f

    .line 888
    .line 889
    .line 890
    const/high16 v2, -0x41000000    # -0.5f

    .line 891
    .line 892
    const/high16 v4, 0x3f000000    # 0.5f

    .line 893
    .line 894
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    const/high16 v0, 0x41080000    # 8.5f

    .line 904
    .line 905
    const/high16 v2, 0x41200000    # 10.0f

    .line 906
    .line 907
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    const/high16 v17, -0x40400000    # -1.5f

    .line 911
    .line 912
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 913
    .line 914
    const v13, -0x40ab851f    # -0.83f

    .line 915
    .line 916
    .line 917
    const/high16 v15, -0x40400000    # -1.5f

    .line 918
    .line 919
    const v16, 0x3f2b851f    # 0.67f

    .line 920
    .line 921
    .line 922
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const v0, 0x3f2b851f    # 0.67f

    .line 926
    .line 927
    .line 928
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 929
    .line 930
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 931
    .line 932
    .line 933
    const v0, -0x40d47ae1    # -0.67f

    .line 934
    .line 935
    .line 936
    const/high16 v2, -0x40400000    # -1.5f

    .line 937
    .line 938
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 939
    .line 940
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 941
    .line 942
    .line 943
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 944
    .line 945
    .line 946
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 947
    .line 948
    .line 949
    const/high16 v0, 0x41880000    # 17.0f

    .line 950
    .line 951
    const/high16 v2, 0x41200000    # 10.0f

    .line 952
    .line 953
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 954
    .line 955
    .line 956
    const/high16 v17, -0x40800000    # -1.0f

    .line 957
    .line 958
    const/high16 v18, 0x3f800000    # 1.0f

    .line 959
    .line 960
    const v13, -0x40f33333    # -0.55f

    .line 961
    .line 962
    .line 963
    const/high16 v15, -0x40800000    # -1.0f

    .line 964
    .line 965
    const v16, 0x3ee66666    # 0.45f

    .line 966
    .line 967
    .line 968
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    const v0, 0x3ee66666    # 0.45f

    .line 972
    .line 973
    .line 974
    const/high16 v2, 0x3f800000    # 1.0f

    .line 975
    .line 976
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 977
    .line 978
    .line 979
    const v0, -0x4119999a    # -0.45f

    .line 980
    .line 981
    .line 982
    const/high16 v2, -0x40800000    # -1.0f

    .line 983
    .line 984
    const/high16 v4, 0x3f800000    # 1.0f

    .line 985
    .line 986
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 987
    .line 988
    .line 989
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 990
    .line 991
    .line 992
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 993
    .line 994
    .line 995
    const/high16 v0, 0x41480000    # 12.5f

    .line 996
    .line 997
    const/high16 v2, 0x41600000    # 14.0f

    .line 998
    .line 999
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1000
    .line 1001
    .line 1002
    const/high16 v17, -0x40400000    # -1.5f

    .line 1003
    .line 1004
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 1005
    .line 1006
    const v13, -0x40ab851f    # -0.83f

    .line 1007
    .line 1008
    .line 1009
    const/high16 v15, -0x40400000    # -1.5f

    .line 1010
    .line 1011
    const v16, 0x3f2b851f    # 0.67f

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1015
    .line 1016
    .line 1017
    const v0, 0x3f2b851f    # 0.67f

    .line 1018
    .line 1019
    .line 1020
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 1021
    .line 1022
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1023
    .line 1024
    .line 1025
    const v0, -0x40d47ae1    # -0.67f

    .line 1026
    .line 1027
    .line 1028
    const/high16 v2, -0x40400000    # -1.5f

    .line 1029
    .line 1030
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 1031
    .line 1032
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1039
    .line 1040
    .line 1041
    const/high16 v0, 0x41080000    # 8.5f

    .line 1042
    .line 1043
    const/high16 v2, 0x41600000    # 14.0f

    .line 1044
    .line 1045
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1049
    .line 1050
    .line 1051
    const v0, 0x3f2b851f    # 0.67f

    .line 1052
    .line 1053
    .line 1054
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 1055
    .line 1056
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1057
    .line 1058
    .line 1059
    const v0, -0x40d47ae1    # -0.67f

    .line 1060
    .line 1061
    .line 1062
    const/high16 v2, -0x40400000    # -1.5f

    .line 1063
    .line 1064
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v2

    .line 1077
    const/16 v16, 0x3800

    .line 1078
    .line 1079
    const/16 v17, 0x0

    .line 1080
    .line 1081
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1082
    .line 1083
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1084
    .line 1085
    const/4 v7, 0x0

    .line 1086
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1087
    .line 1088
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1089
    .line 1090
    const/4 v13, 0x0

    .line 1091
    const/4 v15, 0x0

    .line 1092
    const-string v4, ""

    .line 1093
    .line 1094
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v0

    .line 1098
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v0

    .line 1102
    sput-object v0, Landroidx/compose/material/icons/outlined/BlurOnKt;->_blurOn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1103
    .line 1104
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1105
    .line 1106
    .line 1107
    return-object v0
.end method
