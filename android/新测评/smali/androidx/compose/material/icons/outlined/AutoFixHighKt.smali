.class public final Landroidx/compose/material/icons/outlined/AutoFixHighKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_autoFixHigh",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AutoFixHigh",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getAutoFixHigh",
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
        "SMAP\nAutoFixHigh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoFixHigh.kt\nandroidx/compose/material/icons/outlined/AutoFixHighKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n212#2,12:95\n233#2,18:108\n253#2:145\n233#2,18:146\n253#2:183\n233#2,18:184\n253#2:221\n233#2,18:222\n253#2:259\n174#3:107\n705#4,2:126\n717#4,2:128\n719#4,11:134\n705#4,2:164\n717#4,2:166\n719#4,11:172\n705#4,2:202\n717#4,2:204\n719#4,11:210\n705#4,2:240\n717#4,2:242\n719#4,11:248\n72#5,4:130\n72#5,4:168\n72#5,4:206\n72#5,4:244\n*S KotlinDebug\n*F\n+ 1 AutoFixHigh.kt\nandroidx/compose/material/icons/outlined/AutoFixHighKt\n*L\n29#1:95,12\n30#1:108,18\n30#1:145\n41#1:146,18\n41#1:183\n52#1:184,18\n52#1:221\n63#1:222,18\n63#1:259\n29#1:107\n30#1:126,2\n30#1:128,2\n30#1:134,11\n41#1:164,2\n41#1:166,2\n41#1:172,11\n52#1:202,2\n52#1:204,2\n52#1:210,11\n63#1:240,2\n63#1:242,2\n63#1:248,11\n30#1:130,4\n41#1:168,4\n52#1:206,4\n63#1:244,4\n*E\n"
    }
.end annotation


# static fields
.field private static _autoFixHigh:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAutoFixHigh(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/AutoFixHighKt;->_autoFixHigh:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.AutoFixHigh"

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
    const/high16 v6, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x3f70a3d7    # 0.94f

    .line 78
    .line 79
    .line 80
    const v6, -0x3ffc28f6    # -2.06f

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v4, 0x4003d70a    # 2.06f

    .line 87
    .line 88
    .line 89
    const v6, -0x408f5c29    # -0.94f

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v4, -0x408f5c29    # -0.94f

    .line 96
    .line 97
    .line 98
    const v6, -0x3ffc28f6    # -2.06f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v4, 0x4003d70a    # 2.06f

    .line 108
    .line 109
    .line 110
    const v6, -0x408f5c29    # -0.94f

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v4, 0x3f70a3d7    # 0.94f

    .line 117
    .line 118
    .line 119
    const v6, -0x3ffc28f6    # -2.06f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v4, 0x4003d70a    # 2.06f

    .line 126
    .line 127
    .line 128
    const v6, 0x3f70a3d7    # 0.94f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    const/16 v16, 0x3800

    .line 142
    .line 143
    const/16 v17, 0x0

    .line 144
    .line 145
    const/high16 v6, 0x3f800000    # 1.0f

    .line 146
    .line 147
    const/high16 v8, 0x3f800000    # 1.0f

    .line 148
    .line 149
    const/4 v7, 0x0

    .line 150
    const/high16 v9, 0x3f800000    # 1.0f

    .line 151
    .line 152
    const/high16 v12, 0x3f800000    # 1.0f

    .line 153
    .line 154
    const/4 v13, 0x0

    .line 155
    const/4 v14, 0x0

    .line 156
    const/4 v15, 0x0

    .line 157
    const-string v4, ""

    .line 158
    .line 159
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 160
    .line 161
    .line 162
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 167
    .line 168
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 169
    .line 170
    .line 171
    move-result-wide v6

    .line 172
    const/4 v2, 0x0

    .line 173
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 181
    .line 182
    .line 183
    move-result v11

    .line 184
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 187
    .line 188
    .line 189
    const/high16 v4, 0x41080000    # 8.5f

    .line 190
    .line 191
    const/high16 v6, 0x40e00000    # 7.0f

    .line 192
    .line 193
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v4, 0x3f70a3d7    # 0.94f

    .line 197
    .line 198
    .line 199
    const v6, -0x3ffc28f6    # -2.06f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v4, 0x4003d70a    # 2.06f

    .line 206
    .line 207
    .line 208
    const v6, -0x408f5c29    # -0.94f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v4, -0x408f5c29    # -0.94f

    .line 215
    .line 216
    .line 217
    const v6, -0x3ffc28f6    # -2.06f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v4, 0x4003d70a    # 2.06f

    .line 227
    .line 228
    .line 229
    const v6, -0x408f5c29    # -0.94f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v4, 0x3f70a3d7    # 0.94f

    .line 236
    .line 237
    .line 238
    const v6, -0x3ffc28f6    # -2.06f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v4, 0x4003d70a    # 2.06f

    .line 245
    .line 246
    .line 247
    const v6, 0x3f70a3d7    # 0.94f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    const/high16 v6, 0x3f800000    # 1.0f

    .line 261
    .line 262
    const/4 v7, 0x0

    .line 263
    const-string v4, ""

    .line 264
    .line 265
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 266
    .line 267
    .line 268
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 273
    .line 274
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 275
    .line 276
    .line 277
    move-result-wide v6

    .line 278
    const/4 v2, 0x0

    .line 279
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 283
    .line 284
    .line 285
    move-result v10

    .line 286
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 293
    .line 294
    .line 295
    const/high16 v4, 0x41480000    # 12.5f

    .line 296
    .line 297
    const/high16 v6, 0x41a00000    # 20.0f

    .line 298
    .line 299
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v4, 0x4003d70a    # 2.06f

    .line 303
    .line 304
    .line 305
    const v6, -0x408f5c29    # -0.94f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v4, 0x3f70a3d7    # 0.94f

    .line 312
    .line 313
    .line 314
    const v6, -0x3ffc28f6    # -2.06f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v4, 0x4003d70a    # 2.06f

    .line 321
    .line 322
    .line 323
    const v6, 0x3f70a3d7    # 0.94f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v4, 0x3f70a3d7    # 0.94f

    .line 333
    .line 334
    .line 335
    const v6, -0x3ffc28f6    # -2.06f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v4, 0x4003d70a    # 2.06f

    .line 342
    .line 343
    .line 344
    const v6, -0x408f5c29    # -0.94f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v4, -0x408f5c29    # -0.94f

    .line 351
    .line 352
    .line 353
    const v6, -0x3ffc28f6    # -2.06f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    const/high16 v6, 0x3f800000    # 1.0f

    .line 367
    .line 368
    const/4 v7, 0x0

    .line 369
    const-string v4, ""

    .line 370
    .line 371
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 372
    .line 373
    .line 374
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 375
    .line 376
    .line 377
    move-result v3

    .line 378
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 379
    .line 380
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 381
    .line 382
    .line 383
    move-result-wide v6

    .line 384
    const/4 v0, 0x0

    .line 385
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 389
    .line 390
    .line 391
    move-result v10

    .line 392
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 393
    .line 394
    .line 395
    move-result v11

    .line 396
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 399
    .line 400
    .line 401
    const v0, 0x418dae14    # 17.71f

    .line 402
    .line 403
    .line 404
    const v2, 0x4111eb85    # 9.12f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, -0x3fcae148    # -2.83f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v17, 0x4162b852    # 14.17f

    .line 417
    .line 418
    .line 419
    const/high16 v18, 0x40c00000    # 6.0f

    .line 420
    .line 421
    const v13, 0x416ae148    # 14.68f

    .line 422
    .line 423
    .line 424
    const v14, 0x40c33333    # 6.1f

    .line 425
    .line 426
    .line 427
    const v15, 0x4166e148    # 14.43f

    .line 428
    .line 429
    .line 430
    const/high16 v16, 0x40c00000    # 6.0f

    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v17, -0x40ca3d71    # -0.71f

    .line 436
    .line 437
    .line 438
    const v18, 0x3e947ae1    # 0.29f

    .line 439
    .line 440
    .line 441
    const v13, -0x417ae148    # -0.26f

    .line 442
    .line 443
    .line 444
    const/4 v14, 0x0

    .line 445
    const v15, -0x40fd70a4    # -0.51f

    .line 446
    .line 447
    .line 448
    const v16, 0x3dcccccd    # 0.1f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, 0x40128f5c    # 2.29f

    .line 455
    .line 456
    .line 457
    const v2, 0x418bae14    # 17.46f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/16 v17, 0x0

    .line 464
    .line 465
    const v18, 0x3fb47ae1    # 1.41f

    .line 466
    .line 467
    .line 468
    const v13, -0x413851ec    # -0.39f

    .line 469
    .line 470
    .line 471
    const v14, 0x3ec7ae14    # 0.39f

    .line 472
    .line 473
    .line 474
    const v15, -0x413851ec    # -0.39f

    .line 475
    .line 476
    .line 477
    const v16, 0x3f828f5c    # 1.02f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, 0x40351eb8    # 2.83f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v17, 0x40ba8f5c    # 5.83f

    .line 490
    .line 491
    .line 492
    const/high16 v18, 0x41b00000    # 22.0f

    .line 493
    .line 494
    const v13, 0x40aa3d71    # 5.32f

    .line 495
    .line 496
    .line 497
    const v14, 0x41af3333    # 21.9f

    .line 498
    .line 499
    .line 500
    const v15, 0x40b23d71    # 5.57f

    .line 501
    .line 502
    .line 503
    const/high16 v16, 0x41b00000    # 22.0f

    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, 0x3f35c28f    # 0.71f

    .line 509
    .line 510
    .line 511
    const v2, -0x416b851f    # -0.29f

    .line 512
    .line 513
    .line 514
    const v4, 0x3f028f5c    # 0.51f

    .line 515
    .line 516
    .line 517
    const v6, -0x42333333    # -0.1f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v0, 0x4132b852    # 11.17f

    .line 524
    .line 525
    .line 526
    const v2, -0x3ecd47ae    # -11.17f

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v17, 0x418dae14    # 17.71f

    .line 533
    .line 534
    .line 535
    const v18, 0x4111eb85    # 9.12f

    .line 536
    .line 537
    .line 538
    const v13, 0x4190cccd    # 18.1f

    .line 539
    .line 540
    .line 541
    const v14, 0x41226666    # 10.15f

    .line 542
    .line 543
    .line 544
    const v15, 0x4190cccd    # 18.1f

    .line 545
    .line 546
    .line 547
    const v16, 0x411828f6    # 9.51f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v0, 0x4106b852    # 8.42f

    .line 557
    .line 558
    .line 559
    const v2, 0x4162b852    # 14.17f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, 0x3fb47ae1    # 1.41f

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, 0x41668f5c    # 14.41f

    .line 572
    .line 573
    .line 574
    const/high16 v2, 0x41300000    # 11.0f

    .line 575
    .line 576
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v0, 0x411970a4    # 9.59f

    .line 580
    .line 581
    .line 582
    const/high16 v2, 0x41500000    # 13.0f

    .line 583
    .line 584
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v0, 0x4106b852    # 8.42f

    .line 588
    .line 589
    .line 590
    const v2, 0x4162b852    # 14.17f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x419cb852    # 19.59f

    .line 600
    .line 601
    .line 602
    const v2, 0x40ba8f5c    # 5.83f

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v0, -0x404b851f    # -1.41f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v0, 0x413970a4    # 11.59f

    .line 615
    .line 616
    .line 617
    const/high16 v2, 0x41300000    # 11.0f

    .line 618
    .line 619
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v0, 0x41468f5c    # 12.41f

    .line 623
    .line 624
    .line 625
    const/high16 v2, 0x41500000    # 13.0f

    .line 626
    .line 627
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v0, 0x419cb852    # 19.59f

    .line 631
    .line 632
    .line 633
    const v2, 0x40ba8f5c    # 5.83f

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 643
    .line 644
    .line 645
    move-result-object v2

    .line 646
    const/16 v16, 0x3800

    .line 647
    .line 648
    const/16 v17, 0x0

    .line 649
    .line 650
    const/high16 v6, 0x3f800000    # 1.0f

    .line 651
    .line 652
    const/4 v7, 0x0

    .line 653
    const/high16 v12, 0x3f800000    # 1.0f

    .line 654
    .line 655
    const/4 v13, 0x0

    .line 656
    const/4 v14, 0x0

    .line 657
    const/4 v15, 0x0

    .line 658
    const-string v4, ""

    .line 659
    .line 660
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    sput-object v0, Landroidx/compose/material/icons/outlined/AutoFixHighKt;->_autoFixHigh:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 669
    .line 670
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 671
    .line 672
    .line 673
    return-object v0
.end method
