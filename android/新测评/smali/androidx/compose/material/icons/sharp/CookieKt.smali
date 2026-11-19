.class public final Landroidx/compose/material/icons/sharp/CookieKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_cookie",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Cookie",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getCookie",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nCookie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cookie.kt\nandroidx/compose/material/icons/sharp/CookieKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,62:1\n212#2,12:63\n233#2,18:76\n253#2:113\n174#3:75\n705#4,2:94\n717#4,2:96\n719#4,11:102\n72#5,4:98\n*S KotlinDebug\n*F\n+ 1 Cookie.kt\nandroidx/compose/material/icons/sharp/CookieKt\n*L\n29#1:63,12\n30#1:76,18\n30#1:113\n29#1:75\n30#1:94,2\n30#1:96,2\n30#1:102,11\n30#1:98,4\n*E\n"
    }
.end annotation


# static fields
.field private static _cookie:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCookie(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/CookieKt;->_cookie:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Cookie"

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
    const v0, 0x41af999a    # 21.95f

    .line 71
    .line 72
    .line 73
    const v2, 0x412fd70a    # 10.99f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x3fd47ae1    # -2.68f

    .line 80
    .line 81
    .line 82
    const v18, -0x3f78f5c3    # -4.22f

    .line 83
    .line 84
    .line 85
    const v13, -0x401ae148    # -1.79f

    .line 86
    .line 87
    .line 88
    const v14, -0x430a3d71    # -0.03f

    .line 89
    .line 90
    .line 91
    const v15, -0x3f933333    # -3.7f

    .line 92
    .line 93
    .line 94
    const v16, -0x40066666    # -1.95f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, -0x3f59eb85    # -5.19f

    .line 101
    .line 102
    .line 103
    const v18, -0x3f6e147b    # -4.56f

    .line 104
    .line 105
    .line 106
    const v13, -0x3fc147ae    # -2.98f

    .line 107
    .line 108
    .line 109
    const/high16 v14, 0x3f800000    # 1.0f

    .line 110
    .line 111
    const v15, -0x3f475c29    # -5.77f

    .line 112
    .line 113
    .line 114
    const v16, -0x40347ae1    # -1.59f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v17, 0x40000000    # 2.0f

    .line 121
    .line 122
    const/high16 v18, 0x41400000    # 12.0f

    .line 123
    .line 124
    const v13, 0x40de6666    # 6.95f

    .line 125
    .line 126
    .line 127
    const v14, 0x3f35c28f    # 0.71f

    .line 128
    .line 129
    .line 130
    const/high16 v15, 0x40000000    # 2.0f

    .line 131
    .line 132
    const v16, 0x40d28f5c    # 6.58f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v17, 0x41200000    # 10.0f

    .line 139
    .line 140
    const/high16 v18, 0x41200000    # 10.0f

    .line 141
    .line 142
    const/4 v13, 0x0

    .line 143
    const v14, 0x40b0a3d7    # 5.52f

    .line 144
    .line 145
    .line 146
    const v15, 0x408f5c29    # 4.48f

    .line 147
    .line 148
    .line 149
    const/high16 v16, 0x41200000    # 10.0f

    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v17, 0x41af999a    # 21.95f

    .line 155
    .line 156
    .line 157
    const v18, 0x412fd70a    # 10.99f

    .line 158
    .line 159
    .line 160
    const v13, 0x418f1eb8    # 17.89f

    .line 161
    .line 162
    .line 163
    const/high16 v14, 0x41b00000    # 22.0f

    .line 164
    .line 165
    const v15, 0x41b451ec    # 22.54f

    .line 166
    .line 167
    .line 168
    const v16, 0x41875c29    # 16.92f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v0, 0x41700000    # 15.0f

    .line 178
    .line 179
    const/high16 v2, 0x41080000    # 8.5f

    .line 180
    .line 181
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v17, 0x40e00000    # 7.0f

    .line 185
    .line 186
    const/high16 v18, 0x41580000    # 13.5f

    .line 187
    .line 188
    const v13, 0x40f570a4    # 7.67f

    .line 189
    .line 190
    .line 191
    const/high16 v14, 0x41700000    # 15.0f

    .line 192
    .line 193
    const/high16 v15, 0x40e00000    # 7.0f

    .line 194
    .line 195
    const v16, 0x416547ae    # 14.33f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, 0x40f570a4    # 7.67f

    .line 202
    .line 203
    .line 204
    const/high16 v2, 0x41400000    # 12.0f

    .line 205
    .line 206
    const/high16 v4, 0x41080000    # 8.5f

    .line 207
    .line 208
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v0, 0x3f2b851f    # 0.67f

    .line 212
    .line 213
    .line 214
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 215
    .line 216
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v0, 0x411547ae    # 9.33f

    .line 220
    .line 221
    .line 222
    const/high16 v2, 0x41700000    # 15.0f

    .line 223
    .line 224
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v0, 0x41200000    # 10.0f

    .line 231
    .line 232
    const/high16 v2, 0x41280000    # 10.5f

    .line 233
    .line 234
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v17, 0x41100000    # 9.0f

    .line 238
    .line 239
    const/high16 v18, 0x41080000    # 8.5f

    .line 240
    .line 241
    const v13, 0x411ab852    # 9.67f

    .line 242
    .line 243
    .line 244
    const/high16 v14, 0x41200000    # 10.0f

    .line 245
    .line 246
    const/high16 v15, 0x41100000    # 9.0f

    .line 247
    .line 248
    const v16, 0x411547ae    # 9.33f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, 0x411ab852    # 9.67f

    .line 255
    .line 256
    .line 257
    const/high16 v2, 0x40e00000    # 7.0f

    .line 258
    .line 259
    const/high16 v4, 0x41280000    # 10.5f

    .line 260
    .line 261
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x40f570a4    # 7.67f

    .line 265
    .line 266
    .line 267
    const/high16 v2, 0x41400000    # 12.0f

    .line 268
    .line 269
    const/high16 v4, 0x41080000    # 8.5f

    .line 270
    .line 271
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, 0x413547ae    # 11.33f

    .line 275
    .line 276
    .line 277
    const/high16 v2, 0x41200000    # 10.0f

    .line 278
    .line 279
    const/high16 v4, 0x41280000    # 10.5f

    .line 280
    .line 281
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v0, 0x41800000    # 16.0f

    .line 288
    .line 289
    const/high16 v2, 0x41700000    # 15.0f

    .line 290
    .line 291
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v17, -0x40800000    # -1.0f

    .line 295
    .line 296
    const/high16 v18, -0x40800000    # -1.0f

    .line 297
    .line 298
    const v13, -0x40f33333    # -0.55f

    .line 299
    .line 300
    .line 301
    const/4 v14, 0x0

    .line 302
    const/high16 v15, -0x40800000    # -1.0f

    .line 303
    .line 304
    const v16, -0x4119999a    # -0.45f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v17, 0x3f800000    # 1.0f

    .line 311
    .line 312
    const/4 v13, 0x0

    .line 313
    const v14, -0x40f33333    # -0.55f

    .line 314
    .line 315
    .line 316
    const v15, 0x3ee66666    # 0.45f

    .line 317
    .line 318
    .line 319
    const/high16 v16, -0x40800000    # -1.0f

    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, 0x3ee66666    # 0.45f

    .line 325
    .line 326
    .line 327
    const/high16 v2, 0x3f800000    # 1.0f

    .line 328
    .line 329
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v17, 0x41700000    # 15.0f

    .line 333
    .line 334
    const/high16 v18, 0x41800000    # 16.0f

    .line 335
    .line 336
    const/high16 v13, 0x41800000    # 16.0f

    .line 337
    .line 338
    const v14, 0x4178cccd    # 15.55f

    .line 339
    .line 340
    .line 341
    const v15, 0x4178cccd    # 15.55f

    .line 342
    .line 343
    .line 344
    const/high16 v16, 0x41800000    # 16.0f

    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    const/16 v16, 0x3800

    .line 357
    .line 358
    const/16 v17, 0x0

    .line 359
    .line 360
    const/high16 v6, 0x3f800000    # 1.0f

    .line 361
    .line 362
    const/high16 v8, 0x3f800000    # 1.0f

    .line 363
    .line 364
    const/4 v7, 0x0

    .line 365
    const/high16 v9, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const/high16 v12, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const/4 v13, 0x0

    .line 370
    const/4 v14, 0x0

    .line 371
    const/4 v15, 0x0

    .line 372
    const-string v4, ""

    .line 373
    .line 374
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    sput-object v0, Landroidx/compose/material/icons/sharp/CookieKt;->_cookie:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 383
    .line 384
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    return-object v0
.end method
