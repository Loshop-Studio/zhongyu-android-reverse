.class public final Landroidx/compose/material/icons/twotone/CancelScheduleSendKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_cancelScheduleSend",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CancelScheduleSend",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getCancelScheduleSend",
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
        "SMAP\nCancelScheduleSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancelScheduleSend.kt\nandroidx/compose/material/icons/twotone/CancelScheduleSendKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,120:1\n212#2,12:121\n233#2,18:134\n253#2:171\n233#2,18:172\n253#2:209\n233#2,18:210\n253#2:247\n233#2,18:248\n253#2:285\n233#2,18:286\n253#2:323\n174#3:133\n705#4,2:152\n717#4,2:154\n719#4,11:160\n705#4,2:190\n717#4,2:192\n719#4,11:198\n705#4,2:228\n717#4,2:230\n719#4,11:236\n705#4,2:266\n717#4,2:268\n719#4,11:274\n705#4,2:304\n717#4,2:306\n719#4,11:312\n72#5,4:156\n72#5,4:194\n72#5,4:232\n72#5,4:270\n72#5,4:308\n*S KotlinDebug\n*F\n+ 1 CancelScheduleSend.kt\nandroidx/compose/material/icons/twotone/CancelScheduleSendKt\n*L\n29#1:121,12\n30#1:134,18\n30#1:171\n38#1:172,18\n38#1:209\n60#1:210,18\n60#1:247\n66#1:248,18\n66#1:285\n100#1:286,18\n100#1:323\n29#1:133\n30#1:152,2\n30#1:154,2\n30#1:160,11\n38#1:190,2\n38#1:192,2\n38#1:198,11\n60#1:228,2\n60#1:230,2\n60#1:236,11\n66#1:266,2\n66#1:268,2\n66#1:274,11\n100#1:304,2\n100#1:306,2\n100#1:312,11\n30#1:156,4\n38#1:194,4\n60#1:232,4\n66#1:270,4\n100#1:308,4\n*E\n"
    }
.end annotation


# static fields
.field private static _cancelScheduleSend:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCancelScheduleSend(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CancelScheduleSendKt;->_cancelScheduleSend:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.CancelScheduleSend"

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
    const v4, 0x418fc28f    # 17.97f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40400000    # 3.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x40c33333    # 6.1f

    .line 79
    .line 80
    .line 81
    const v6, -0x3fd8f5c3    # -2.61f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v25, 0x3d8f5c29    # 0.07f

    .line 88
    .line 89
    .line 90
    const v26, -0x4123d70a    # -0.43f

    .line 91
    .line 92
    .line 93
    const v21, 0x3ca3d70a    # 0.02f

    .line 94
    .line 95
    .line 96
    const v22, -0x41f0a3d7    # -0.14f

    .line 97
    .line 98
    .line 99
    const v23, 0x3d23d70a    # 0.04f

    .line 100
    .line 101
    .line 102
    const v24, -0x416b851f    # -0.29f

    .line 103
    .line 104
    .line 105
    move-object/from16 v20, v2

    .line 106
    .line 107
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v4, 0x417c0000    # 15.75f

    .line 111
    .line 112
    const/high16 v6, 0x40400000    # 3.0f

    .line 113
    .line 114
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v4, 0x418fc28f    # 17.97f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    const/16 v16, 0x3800

    .line 131
    .line 132
    const/16 v17, 0x0

    .line 133
    .line 134
    const v6, 0x3e99999a    # 0.3f

    .line 135
    .line 136
    .line 137
    const v8, 0x3e99999a    # 0.3f

    .line 138
    .line 139
    .line 140
    const/4 v7, 0x0

    .line 141
    const/high16 v9, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const/high16 v12, 0x3f800000    # 1.0f

    .line 144
    .line 145
    const/4 v13, 0x0

    .line 146
    const/4 v14, 0x0

    .line 147
    const/4 v15, 0x0

    .line 148
    const-string v4, ""

    .line 149
    .line 150
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 151
    .line 152
    .line 153
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 158
    .line 159
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 160
    .line 161
    .line 162
    move-result-wide v6

    .line 163
    const/4 v2, 0x0

    .line 164
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 172
    .line 173
    .line 174
    move-result v11

    .line 175
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 178
    .line 179
    .line 180
    const/high16 v4, 0x41300000    # 11.0f

    .line 181
    .line 182
    const/high16 v6, 0x41840000    # 16.5f

    .line 183
    .line 184
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v25, -0x3f500000    # -5.5f

    .line 188
    .line 189
    const/high16 v26, 0x40b00000    # 5.5f

    .line 190
    .line 191
    const v21, -0x3fbe147b    # -3.03f

    .line 192
    .line 193
    .line 194
    const/16 v22, 0x0

    .line 195
    .line 196
    const/high16 v23, -0x3f500000    # -5.5f

    .line 197
    .line 198
    const v24, 0x401e147b    # 2.47f

    .line 199
    .line 200
    .line 201
    move-object/from16 v20, v2

    .line 202
    .line 203
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v4, 0x401e147b    # 2.47f

    .line 207
    .line 208
    .line 209
    const/high16 v6, 0x40b00000    # 5.5f

    .line 210
    .line 211
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v4, -0x3fe1eb85    # -2.47f

    .line 215
    .line 216
    .line 217
    const/high16 v6, -0x3f500000    # -5.5f

    .line 218
    .line 219
    const/high16 v7, 0x40b00000    # 5.5f

    .line 220
    .line 221
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v4, 0x419c3d71    # 19.53f

    .line 225
    .line 226
    .line 227
    const/high16 v6, 0x41300000    # 11.0f

    .line 228
    .line 229
    const/high16 v7, 0x41840000    # 16.5f

    .line 230
    .line 231
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v4, 0x4197c28f    # 18.97f

    .line 238
    .line 239
    .line 240
    const v6, 0x419228f6    # 18.27f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, 0x3f35c28f    # 0.71f

    .line 247
    .line 248
    .line 249
    const v6, -0x40ca3d71    # -0.71f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v4, -0x401d70a4    # -1.77f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v4, 0x3fe28f5c    # 1.77f

    .line 262
    .line 263
    .line 264
    const v6, -0x401d70a4    # -1.77f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v4, -0x40ca3d71    # -0.71f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v4, 0x3fe28f5c    # 1.77f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v4, -0x401d70a4    # -1.77f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v4, 0x3f35c28f    # 0.71f

    .line 289
    .line 290
    .line 291
    const v6, -0x40ca3d71    # -0.71f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v4, 0x3fe28f5c    # 1.77f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v6, -0x401d70a4    # -1.77f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v4, 0x3f35c28f    # 0.71f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v4, 0x3fe28f5c    # 1.77f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v4, 0x4197c28f    # 18.97f

    .line 322
    .line 323
    .line 324
    const v6, 0x419228f6    # 18.27f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    const v6, 0x3e99999a    # 0.3f

    .line 338
    .line 339
    .line 340
    const/4 v7, 0x0

    .line 341
    const-string v4, ""

    .line 342
    .line 343
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 344
    .line 345
    .line 346
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 351
    .line 352
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 353
    .line 354
    .line 355
    move-result-wide v6

    .line 356
    const/4 v2, 0x0

    .line 357
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 361
    .line 362
    .line 363
    move-result v10

    .line 364
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 365
    .line 366
    .line 367
    move-result v11

    .line 368
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 371
    .line 372
    .line 373
    const/high16 v4, 0x41040000    # 8.25f

    .line 374
    .line 375
    const/high16 v6, 0x40400000    # 3.0f

    .line 376
    .line 377
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v4, 0x40f0a3d7    # 7.52f

    .line 381
    .line 382
    .line 383
    const/high16 v6, 0x3f800000    # 1.0f

    .line 384
    .line 385
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v4, -0x3f0fae14    # -7.51f

    .line 389
    .line 390
    .line 391
    const v6, -0x3fb1eb85    # -3.22f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    const v6, 0x3e99999a    # 0.3f

    .line 405
    .line 406
    .line 407
    const/4 v7, 0x0

    .line 408
    const-string v4, ""

    .line 409
    .line 410
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 411
    .line 412
    .line 413
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 418
    .line 419
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 420
    .line 421
    .line 422
    move-result-wide v6

    .line 423
    const/4 v2, 0x0

    .line 424
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 428
    .line 429
    .line 430
    move-result v10

    .line 431
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 432
    .line 433
    .line 434
    move-result v11

    .line 435
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 438
    .line 439
    .line 440
    const/high16 v4, 0x41100000    # 9.0f

    .line 441
    .line 442
    const/high16 v6, 0x41840000    # 16.5f

    .line 443
    .line 444
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v25, -0x406147ae    # -1.24f

    .line 448
    .line 449
    .line 450
    const v26, 0x3de147ae    # 0.11f

    .line 451
    .line 452
    .line 453
    const v21, -0x4128f5c3    # -0.42f

    .line 454
    .line 455
    .line 456
    const v23, -0x40ab851f    # -0.83f

    .line 457
    .line 458
    .line 459
    const v24, 0x3d23d70a    # 0.04f

    .line 460
    .line 461
    .line 462
    move-object/from16 v20, v2

    .line 463
    .line 464
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/16 v25, 0x0

    .line 468
    .line 469
    const/16 v26, 0x0

    .line 470
    .line 471
    const/16 v21, 0x0

    .line 472
    .line 473
    const/16 v23, 0x0

    .line 474
    .line 475
    const/16 v24, 0x0

    .line 476
    .line 477
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v4, 0x3f8147ae    # 1.01f

    .line 481
    .line 482
    .line 483
    const/high16 v6, 0x40400000    # 3.0f

    .line 484
    .line 485
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v4, 0x41200000    # 10.0f

    .line 489
    .line 490
    const/high16 v6, 0x3f800000    # 1.0f

    .line 491
    .line 492
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v4, 0x4120f5c3    # 10.06f

    .line 496
    .line 497
    .line 498
    const v6, 0x3fab851f    # 1.34f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v25, -0x40747ae1    # -1.09f

    .line 505
    .line 506
    .line 507
    const v26, 0x3fbae148    # 1.46f

    .line 508
    .line 509
    .line 510
    const v21, -0x4128f5c3    # -0.42f

    .line 511
    .line 512
    .line 513
    const v22, 0x3ee147ae    # 0.44f

    .line 514
    .line 515
    .line 516
    const v23, -0x40b851ec    # -0.78f

    .line 517
    .line 518
    .line 519
    const v24, 0x3f6e147b    # 0.93f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v4, 0x41600000    # 14.0f

    .line 526
    .line 527
    const/high16 v6, 0x3f800000    # 1.0f

    .line 528
    .line 529
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v4, 0x3c23d70a    # 0.01f

    .line 533
    .line 534
    .line 535
    const/high16 v6, 0x40e00000    # 7.0f

    .line 536
    .line 537
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v4, 0x41011eb8    # 8.07f

    .line 541
    .line 542
    .line 543
    const v6, -0x3fa28f5c    # -3.46f

    .line 544
    .line 545
    .line 546
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/16 v25, 0x0

    .line 550
    .line 551
    const/16 v26, 0x0

    .line 552
    .line 553
    const/16 v21, 0x0

    .line 554
    .line 555
    const/16 v22, 0x0

    .line 556
    .line 557
    const/16 v23, 0x0

    .line 558
    .line 559
    const/16 v24, 0x0

    .line 560
    .line 561
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v25, 0x41840000    # 16.5f

    .line 565
    .line 566
    const/high16 v26, 0x41c00000    # 24.0f

    .line 567
    .line 568
    const v21, 0x411970a4    # 9.59f

    .line 569
    .line 570
    .line 571
    const v22, 0x41a9851f    # 21.19f

    .line 572
    .line 573
    .line 574
    const v23, 0x414b5c29    # 12.71f

    .line 575
    .line 576
    .line 577
    const/high16 v24, 0x41c00000    # 24.0f

    .line 578
    .line 579
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v25, 0x40f00000    # 7.5f

    .line 583
    .line 584
    const/high16 v26, -0x3f100000    # -7.5f

    .line 585
    .line 586
    const v21, 0x40847ae1    # 4.14f

    .line 587
    .line 588
    .line 589
    const/16 v22, 0x0

    .line 590
    .line 591
    const/high16 v23, 0x40f00000    # 7.5f

    .line 592
    .line 593
    const v24, -0x3fa8f5c3    # -3.36f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v4, 0x41a51eb8    # 20.64f

    .line 600
    .line 601
    .line 602
    const/high16 v6, 0x41100000    # 9.0f

    .line 603
    .line 604
    const/high16 v7, 0x41840000    # 16.5f

    .line 605
    .line 606
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const/high16 v4, 0x41040000    # 8.25f

    .line 613
    .line 614
    const/high16 v6, 0x40400000    # 3.0f

    .line 615
    .line 616
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v4, 0x3c23d70a    # 0.01f

    .line 620
    .line 621
    .line 622
    const v6, -0x3ff1eb85    # -2.22f

    .line 623
    .line 624
    .line 625
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v4, 0x40f051ec    # 7.51f

    .line 629
    .line 630
    .line 631
    const v6, 0x404e147b    # 3.22f

    .line 632
    .line 633
    .line 634
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v4, 0x41040000    # 8.25f

    .line 638
    .line 639
    const/high16 v6, 0x40400000    # 3.0f

    .line 640
    .line 641
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v4, 0x4111999a    # 9.1f

    .line 648
    .line 649
    .line 650
    const v6, 0x4175c28f    # 15.36f

    .line 651
    .line 652
    .line 653
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v4, 0x418fc28f    # 17.97f

    .line 657
    .line 658
    .line 659
    const/high16 v6, 0x40400000    # 3.0f

    .line 660
    .line 661
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v4, -0x3ff1eb85    # -2.22f

    .line 665
    .line 666
    .line 667
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v4, 0x40c570a4    # 6.17f

    .line 671
    .line 672
    .line 673
    const v6, -0x40ae147b    # -0.82f

    .line 674
    .line 675
    .line 676
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v25, 0x4111999a    # 9.1f

    .line 680
    .line 681
    .line 682
    const v26, 0x4175c28f    # 15.36f

    .line 683
    .line 684
    .line 685
    const v21, 0x41123d71    # 9.14f

    .line 686
    .line 687
    .line 688
    const v22, 0x41711eb8    # 15.07f

    .line 689
    .line 690
    .line 691
    const v23, 0x4111eb85    # 9.12f

    .line 692
    .line 693
    .line 694
    const v24, 0x41735c29    # 15.21f

    .line 695
    .line 696
    .line 697
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const/high16 v4, 0x41b00000    # 22.0f

    .line 704
    .line 705
    const/high16 v6, 0x41840000    # 16.5f

    .line 706
    .line 707
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/high16 v25, -0x3f500000    # -5.5f

    .line 711
    .line 712
    const/high16 v26, -0x3f500000    # -5.5f

    .line 713
    .line 714
    const v21, -0x3fbe147b    # -3.03f

    .line 715
    .line 716
    .line 717
    const/16 v22, 0x0

    .line 718
    .line 719
    const/high16 v23, -0x3f500000    # -5.5f

    .line 720
    .line 721
    const v24, -0x3fe1eb85    # -2.47f

    .line 722
    .line 723
    .line 724
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v4, -0x3f500000    # -5.5f

    .line 728
    .line 729
    const v6, 0x401e147b    # 2.47f

    .line 730
    .line 731
    .line 732
    const/high16 v7, 0x40b00000    # 5.5f

    .line 733
    .line 734
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const v4, 0x401e147b    # 2.47f

    .line 738
    .line 739
    .line 740
    const/high16 v6, 0x40b00000    # 5.5f

    .line 741
    .line 742
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v4, 0x419c3d71    # 19.53f

    .line 746
    .line 747
    .line 748
    const/high16 v6, 0x41b00000    # 22.0f

    .line 749
    .line 750
    const/high16 v7, 0x41840000    # 16.5f

    .line 751
    .line 752
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 759
    .line 760
    .line 761
    move-result-object v2

    .line 762
    const/high16 v6, 0x3f800000    # 1.0f

    .line 763
    .line 764
    const/high16 v8, 0x3f800000    # 1.0f

    .line 765
    .line 766
    const/4 v7, 0x0

    .line 767
    const-string v4, ""

    .line 768
    .line 769
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 770
    .line 771
    .line 772
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 773
    .line 774
    .line 775
    move-result v3

    .line 776
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 777
    .line 778
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 779
    .line 780
    .line 781
    move-result-wide v6

    .line 782
    const/4 v0, 0x0

    .line 783
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 784
    .line 785
    .line 786
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 787
    .line 788
    .line 789
    move-result v10

    .line 790
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 791
    .line 792
    .line 793
    move-result v11

    .line 794
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 797
    .line 798
    .line 799
    const v2, 0x41607ae1    # 14.03f

    .line 800
    .line 801
    .line 802
    const v4, 0x419228f6    # 18.27f

    .line 803
    .line 804
    .line 805
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    const v2, 0x3fe147ae    # 1.76f

    .line 809
    .line 810
    .line 811
    const v4, -0x401d70a4    # -1.77f

    .line 812
    .line 813
    .line 814
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const v2, -0x401eb852    # -1.76f

    .line 818
    .line 819
    .line 820
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    const v2, -0x40cccccd    # -0.7f

    .line 824
    .line 825
    .line 826
    const v4, 0x3f333333    # 0.7f

    .line 827
    .line 828
    .line 829
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const v2, 0x3fe147ae    # 1.76f

    .line 833
    .line 834
    .line 835
    const v4, 0x3fe28f5c    # 1.77f

    .line 836
    .line 837
    .line 838
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const v2, -0x401eb852    # -1.76f

    .line 842
    .line 843
    .line 844
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const v2, 0x3f333333    # 0.7f

    .line 848
    .line 849
    .line 850
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const v2, -0x401eb852    # -1.76f

    .line 854
    .line 855
    .line 856
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const v2, 0x3fe147ae    # 1.76f

    .line 860
    .line 861
    .line 862
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    const v2, -0x40cccccd    # -0.7f

    .line 866
    .line 867
    .line 868
    const v4, 0x3f333333    # 0.7f

    .line 869
    .line 870
    .line 871
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 872
    .line 873
    .line 874
    const v2, -0x401eb852    # -1.76f

    .line 875
    .line 876
    .line 877
    const v4, -0x401d70a4    # -1.77f

    .line 878
    .line 879
    .line 880
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const v2, 0x3fe147ae    # 1.76f

    .line 884
    .line 885
    .line 886
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 887
    .line 888
    .line 889
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 893
    .line 894
    .line 895
    move-result-object v2

    .line 896
    const/high16 v6, 0x3f800000    # 1.0f

    .line 897
    .line 898
    const/4 v7, 0x0

    .line 899
    const-string v4, ""

    .line 900
    .line 901
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    sput-object v0, Landroidx/compose/material/icons/twotone/CancelScheduleSendKt;->_cancelScheduleSend:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 910
    .line 911
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 912
    .line 913
    .line 914
    return-object v0
.end method
