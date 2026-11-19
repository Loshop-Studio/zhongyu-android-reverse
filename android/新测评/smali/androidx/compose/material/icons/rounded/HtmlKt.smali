.class public final Landroidx/compose/material/icons/rounded/HtmlKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_html",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Html",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getHtml",
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
        "SMAP\nHtml.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.kt\nandroidx/compose/material/icons/rounded/HtmlKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,98:1\n212#2,12:99\n233#2,18:112\n253#2:149\n174#3:111\n705#4,2:130\n717#4,2:132\n719#4,11:138\n72#5,4:134\n*S KotlinDebug\n*F\n+ 1 Html.kt\nandroidx/compose/material/icons/rounded/HtmlKt\n*L\n29#1:99,12\n30#1:112,18\n30#1:149\n29#1:111\n30#1:130,2\n30#1:132,2\n30#1:138,11\n30#1:134,4\n*E\n"
    }
.end annotation


# static fields
.field private static _html:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHtml(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HtmlKt;->_html:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Html"

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
    const/high16 v0, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a80000    # 21.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v18, -0x40800000    # -1.0f

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
    const v16, -0x4119999a    # -0.45f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, 0x411c0000    # 9.75f

    .line 94
    .line 95
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v17, 0x41a60000    # 20.75f

    .line 99
    .line 100
    const/high16 v18, 0x41100000    # 9.0f

    .line 101
    .line 102
    const/high16 v13, 0x41a00000    # 20.0f

    .line 103
    .line 104
    const v14, 0x411570a4    # 9.34f

    .line 105
    .line 106
    .line 107
    const v15, 0x41a2b852    # 20.34f

    .line 108
    .line 109
    .line 110
    const/high16 v16, 0x41100000    # 9.0f

    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v0, 0x3eae147b    # 0.34f

    .line 116
    .line 117
    .line 118
    const/high16 v2, 0x3f400000    # 0.75f

    .line 119
    .line 120
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v0, 0x40700000    # 3.75f

    .line 124
    .line 125
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 129
    .line 130
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, 0x3f400000    # 0.75f

    .line 134
    .line 135
    const/high16 v18, 0x3f400000    # 0.75f

    .line 136
    .line 137
    const v13, 0x3ed1eb85    # 0.41f

    .line 138
    .line 139
    .line 140
    const/4 v14, 0x0

    .line 141
    const/high16 v15, 0x3f400000    # 0.75f

    .line 142
    .line 143
    const v16, 0x3eae147b    # 0.34f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v17, -0x40c00000    # -0.75f

    .line 150
    .line 151
    const/4 v13, 0x0

    .line 152
    const v14, 0x3ed1eb85    # 0.41f

    .line 153
    .line 154
    .line 155
    const v15, -0x4151eb85    # -0.34f

    .line 156
    .line 157
    .line 158
    const/high16 v16, 0x3f400000    # 0.75f

    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v0, 0x41a80000    # 21.0f

    .line 164
    .line 165
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v0, 0x4127d70a    # 10.49f

    .line 172
    .line 173
    .line 174
    const/high16 v2, 0x41800000    # 16.0f

    .line 175
    .line 176
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v0, 0x3f800000    # 1.0f

    .line 180
    .line 181
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v0, 0x4070a3d7    # 3.76f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v17, 0x3f400000    # 0.75f

    .line 191
    .line 192
    const v15, 0x3eae147b    # 0.34f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, -0x40c00000    # -0.75f

    .line 199
    .line 200
    const v2, -0x4151eb85    # -0.34f

    .line 201
    .line 202
    .line 203
    const/high16 v4, 0x3f400000    # 0.75f

    .line 204
    .line 205
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v0, 0x41200000    # 10.0f

    .line 209
    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v17, -0x40800000    # -1.0f

    .line 214
    .line 215
    const/high16 v18, -0x40800000    # -1.0f

    .line 216
    .line 217
    const v14, -0x40f33333    # -0.55f

    .line 218
    .line 219
    .line 220
    const v15, -0x4119999a    # -0.45f

    .line 221
    .line 222
    .line 223
    const/high16 v16, -0x40800000    # -1.0f

    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v0, 0x41500000    # 13.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v18, 0x3f800000    # 1.0f

    .line 234
    .line 235
    const v13, -0x40f33333    # -0.55f

    .line 236
    .line 237
    .line 238
    const/4 v14, 0x0

    .line 239
    const/high16 v15, -0x40800000    # -1.0f

    .line 240
    .line 241
    const v16, 0x3ee66666    # 0.45f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v0, 0x40880000    # 4.25f

    .line 248
    .line 249
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v17, 0x3f400000    # 0.75f

    .line 253
    .line 254
    const/high16 v18, 0x3f400000    # 0.75f

    .line 255
    .line 256
    const/4 v13, 0x0

    .line 257
    const v14, 0x3ed1eb85    # 0.41f

    .line 258
    .line 259
    .line 260
    const v15, 0x3eae147b    # 0.34f

    .line 261
    .line 262
    .line 263
    const/high16 v16, 0x3f400000    # 0.75f

    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v0, -0x40c00000    # -0.75f

    .line 269
    .line 270
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v0, 0x41280000    # 10.5f

    .line 274
    .line 275
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v0, 0x3f800000    # 1.0f

    .line 279
    .line 280
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v0, 0x40300000    # 2.75f

    .line 284
    .line 285
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v0, 0x415a8f5c    # 13.66f

    .line 292
    .line 293
    .line 294
    const/high16 v2, 0x41540000    # 13.25f

    .line 295
    .line 296
    const/high16 v4, 0x41800000    # 16.0f

    .line 297
    .line 298
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, 0x4127d70a    # 10.49f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v0, 0x40a00000    # 5.0f

    .line 311
    .line 312
    const/high16 v2, 0x411c0000    # 9.75f

    .line 313
    .line 314
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v17, 0x40880000    # 4.25f

    .line 318
    .line 319
    const/high16 v18, 0x41100000    # 9.0f

    .line 320
    .line 321
    const/high16 v13, 0x40a00000    # 5.0f

    .line 322
    .line 323
    const v14, 0x411570a4    # 9.34f

    .line 324
    .line 325
    .line 326
    const v15, 0x40951eb8    # 4.66f

    .line 327
    .line 328
    .line 329
    const/high16 v16, 0x41100000    # 9.0f

    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, 0x411570a4    # 9.34f

    .line 335
    .line 336
    .line 337
    const/high16 v2, 0x40600000    # 3.5f

    .line 338
    .line 339
    const/high16 v4, 0x411c0000    # 9.75f

    .line 340
    .line 341
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v0, 0x41300000    # 11.0f

    .line 345
    .line 346
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v0, -0x40000000    # -2.0f

    .line 350
    .line 351
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, 0x411c0000    # 9.75f

    .line 355
    .line 356
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v17, 0x3f400000    # 0.75f

    .line 360
    .line 361
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 362
    .line 363
    const v15, 0x3f947ae1    # 1.16f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/4 v0, 0x0

    .line 370
    const v2, 0x411570a4    # 9.34f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x40900000    # 4.5f

    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v18, 0x41700000    # 15.0f

    .line 382
    .line 383
    const/4 v13, 0x0

    .line 384
    const v14, 0x416a8f5c    # 14.66f

    .line 385
    .line 386
    .line 387
    const v15, 0x3eae147b    # 0.34f

    .line 388
    .line 389
    .line 390
    const/high16 v16, 0x41700000    # 15.0f

    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, -0x40c00000    # -0.75f

    .line 396
    .line 397
    const v2, -0x4151eb85    # -0.34f

    .line 398
    .line 399
    .line 400
    const/high16 v4, 0x3f400000    # 0.75f

    .line 401
    .line 402
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, 0x41480000    # 12.5f

    .line 406
    .line 407
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v0, 0x40000000    # 2.0f

    .line 411
    .line 412
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 416
    .line 417
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v17, 0x40880000    # 4.25f

    .line 421
    .line 422
    const/high16 v13, 0x40600000    # 3.5f

    .line 423
    .line 424
    const v15, 0x4075c28f    # 3.84f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v0, 0x416a8f5c    # 14.66f

    .line 431
    .line 432
    .line 433
    const/high16 v2, 0x41640000    # 14.25f

    .line 434
    .line 435
    const/high16 v4, 0x40a00000    # 5.0f

    .line 436
    .line 437
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v0, 0x411c0000    # 9.75f

    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, 0x41240000    # 10.25f

    .line 449
    .line 450
    const/high16 v2, 0x41280000    # 10.5f

    .line 451
    .line 452
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v17, 0x3f400000    # 0.75f

    .line 456
    .line 457
    const/high16 v18, -0x40c00000    # -0.75f

    .line 458
    .line 459
    const v13, 0x3ed1eb85    # 0.41f

    .line 460
    .line 461
    .line 462
    const/4 v14, 0x0

    .line 463
    const/high16 v15, 0x3f400000    # 0.75f

    .line 464
    .line 465
    const v16, -0x4151eb85    # -0.34f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v17, 0x41240000    # 10.25f

    .line 472
    .line 473
    const/high16 v18, 0x41100000    # 9.0f

    .line 474
    .line 475
    const/high16 v13, 0x41300000    # 11.0f

    .line 476
    .line 477
    const v14, 0x411570a4    # 9.34f

    .line 478
    .line 479
    .line 480
    const v15, 0x412a8f5c    # 10.66f

    .line 481
    .line 482
    .line 483
    const/high16 v16, 0x41100000    # 9.0f

    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 489
    .line 490
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v17, 0x40c00000    # 6.0f

    .line 494
    .line 495
    const/high16 v18, 0x411c0000    # 9.75f

    .line 496
    .line 497
    const v13, 0x40cae148    # 6.34f

    .line 498
    .line 499
    .line 500
    const/high16 v14, 0x41100000    # 9.0f

    .line 501
    .line 502
    const/high16 v15, 0x40c00000    # 6.0f

    .line 503
    .line 504
    const v16, 0x411570a4    # 9.34f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v17, 0x3f400000    # 0.75f

    .line 511
    .line 512
    const/high16 v18, 0x3f400000    # 0.75f

    .line 513
    .line 514
    const/4 v13, 0x0

    .line 515
    const v14, 0x3ed1eb85    # 0.41f

    .line 516
    .line 517
    .line 518
    const v15, 0x3eae147b    # 0.34f

    .line 519
    .line 520
    .line 521
    const/high16 v16, 0x3f400000    # 0.75f

    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v0, 0x3f800000    # 1.0f

    .line 527
    .line 528
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v0, 0x40700000    # 3.75f

    .line 532
    .line 533
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v17, 0x41080000    # 8.5f

    .line 537
    .line 538
    const/high16 v18, 0x41700000    # 15.0f

    .line 539
    .line 540
    const/high16 v13, 0x40f80000    # 7.75f

    .line 541
    .line 542
    const v14, 0x416a8f5c    # 14.66f

    .line 543
    .line 544
    .line 545
    const v15, 0x410170a4    # 8.09f

    .line 546
    .line 547
    .line 548
    const/high16 v16, 0x41700000    # 15.0f

    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v0, -0x40c00000    # -0.75f

    .line 554
    .line 555
    const v2, -0x4151eb85    # -0.34f

    .line 556
    .line 557
    .line 558
    const/high16 v4, 0x3f400000    # 0.75f

    .line 559
    .line 560
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v0, 0x41280000    # 10.5f

    .line 564
    .line 565
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v0, 0x41240000    # 10.25f

    .line 569
    .line 570
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    const/16 v16, 0x3800

    .line 581
    .line 582
    const/16 v17, 0x0

    .line 583
    .line 584
    const/high16 v6, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/high16 v8, 0x3f800000    # 1.0f

    .line 587
    .line 588
    const/4 v7, 0x0

    .line 589
    const/high16 v9, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const/high16 v12, 0x3f800000    # 1.0f

    .line 592
    .line 593
    const/4 v13, 0x0

    .line 594
    const/4 v14, 0x0

    .line 595
    const/4 v15, 0x0

    .line 596
    const-string v4, ""

    .line 597
    .line 598
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    sput-object v0, Landroidx/compose/material/icons/rounded/HtmlKt;->_html:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 607
    .line 608
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    return-object v0
.end method
