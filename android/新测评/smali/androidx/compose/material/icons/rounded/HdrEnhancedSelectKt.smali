.class public final Landroidx/compose/material/icons/rounded/HdrEnhancedSelectKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_hdrEnhancedSelect",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "HdrEnhancedSelect",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getHdrEnhancedSelect",
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
        "SMAP\nHdrEnhancedSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HdrEnhancedSelect.kt\nandroidx/compose/material/icons/rounded/HdrEnhancedSelectKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,157:1\n212#2,12:158\n233#2,18:171\n253#2:208\n233#2,18:209\n253#2:246\n233#2,18:247\n253#2:284\n233#2,18:285\n253#2:322\n233#2,18:323\n253#2:360\n174#3:170\n705#4,2:189\n717#4,2:191\n719#4,11:197\n705#4,2:227\n717#4,2:229\n719#4,11:235\n705#4,2:265\n717#4,2:267\n719#4,11:273\n705#4,2:303\n717#4,2:305\n719#4,11:311\n705#4,2:341\n717#4,2:343\n719#4,11:349\n72#5,4:193\n72#5,4:231\n72#5,4:269\n72#5,4:307\n72#5,4:345\n*S KotlinDebug\n*F\n+ 1 HdrEnhancedSelect.kt\nandroidx/compose/material/icons/rounded/HdrEnhancedSelectKt\n*L\n29#1:158,12\n30#1:171,18\n30#1:208\n60#1:209,18\n60#1:246\n78#1:247,18\n78#1:284\n104#1:285,18\n104#1:322\n128#1:323,18\n128#1:360\n29#1:170\n30#1:189,2\n30#1:191,2\n30#1:197,11\n60#1:227,2\n60#1:229,2\n60#1:235,11\n78#1:265,2\n78#1:267,2\n78#1:273,11\n104#1:303,2\n104#1:305,2\n104#1:311,11\n128#1:341,2\n128#1:343,2\n128#1:349,11\n30#1:193,4\n60#1:231,4\n78#1:269,4\n104#1:307,4\n128#1:345,4\n*E\n"
    }
.end annotation


# static fields
.field private static _hdrEnhancedSelect:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHdrEnhancedSelect(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HdrEnhancedSelectKt;->_hdrEnhancedSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.HdrEnhancedSelect"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v6, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40c00000    # 6.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, 0x410b0a3d    # 8.69f

    .line 82
    .line 83
    .line 84
    const/high16 v22, 0x40000000    # 2.0f

    .line 85
    .line 86
    const/high16 v23, 0x40c00000    # 6.0f

    .line 87
    .line 88
    const v24, 0x4096147b    # 4.69f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x402c28f6    # 2.69f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x40c00000    # 6.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3fd3d70a    # -2.69f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3f400000    # -6.0f

    .line 108
    .line 109
    const/high16 v7, 0x40c00000    # 6.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x4174f5c3    # 15.31f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x41400000    # 12.0f

    .line 118
    .line 119
    const/high16 v7, 0x40000000    # 2.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x41100000    # 9.0f

    .line 128
    .line 129
    const/high16 v6, 0x41600000    # 14.0f

    .line 130
    .line 131
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, -0x40800000    # -1.0f

    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, 0x3f800000    # 1.0f

    .line 140
    .line 141
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v25, -0x40800000    # -1.0f

    .line 145
    .line 146
    const/high16 v26, 0x3f800000    # 1.0f

    .line 147
    .line 148
    const/16 v21, 0x0

    .line 149
    .line 150
    const v22, 0x3f0ccccd    # 0.55f

    .line 151
    .line 152
    .line 153
    const v23, -0x4119999a    # -0.45f

    .line 154
    .line 155
    .line 156
    const/high16 v24, 0x3f800000    # 1.0f

    .line 157
    .line 158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/4 v4, 0x0

    .line 162
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v26, -0x40800000    # -1.0f

    .line 166
    .line 167
    const v21, -0x40f33333    # -0.55f

    .line 168
    .line 169
    .line 170
    const/16 v22, 0x0

    .line 171
    .line 172
    const/high16 v23, -0x40800000    # -1.0f

    .line 173
    .line 174
    const v24, -0x4119999a    # -0.45f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v4, 0x41100000    # 9.0f

    .line 181
    .line 182
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v4, -0x40800000    # -1.0f

    .line 186
    .line 187
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v25, 0x41100000    # 9.0f

    .line 191
    .line 192
    const/high16 v26, 0x41000000    # 8.0f

    .line 193
    .line 194
    const v21, 0x41173333    # 9.45f

    .line 195
    .line 196
    .line 197
    const/high16 v22, 0x41100000    # 9.0f

    .line 198
    .line 199
    const/high16 v23, 0x41100000    # 9.0f

    .line 200
    .line 201
    const v24, 0x4108cccd    # 8.55f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/4 v4, 0x0

    .line 208
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v25, 0x3f800000    # 1.0f

    .line 212
    .line 213
    const/high16 v26, -0x40800000    # -1.0f

    .line 214
    .line 215
    const/16 v21, 0x0

    .line 216
    .line 217
    const v22, -0x40f33333    # -0.55f

    .line 218
    .line 219
    .line 220
    const v23, 0x3ee66666    # 0.45f

    .line 221
    .line 222
    .line 223
    const/high16 v24, -0x40800000    # -1.0f

    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v4, 0x3f800000    # 1.0f

    .line 229
    .line 230
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v4, 0x40c00000    # 6.0f

    .line 234
    .line 235
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/4 v4, 0x0

    .line 242
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v26, 0x3f800000    # 1.0f

    .line 246
    .line 247
    const v21, 0x3f0ccccd    # 0.55f

    .line 248
    .line 249
    .line 250
    const/16 v22, 0x0

    .line 251
    .line 252
    const/high16 v23, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const v24, 0x3ee66666    # 0.45f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v4, 0x3f800000    # 1.0f

    .line 261
    .line 262
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/4 v4, 0x0

    .line 272
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v25, 0x41600000    # 14.0f

    .line 276
    .line 277
    const/high16 v26, 0x41100000    # 9.0f

    .line 278
    .line 279
    const/high16 v21, 0x41700000    # 15.0f

    .line 280
    .line 281
    const v22, 0x4108cccd    # 8.55f

    .line 282
    .line 283
    .line 284
    const v23, 0x4168cccd    # 14.55f

    .line 285
    .line 286
    .line 287
    const/high16 v24, 0x41100000    # 9.0f

    .line 288
    .line 289
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    const/16 v16, 0x3800

    .line 300
    .line 301
    const/16 v17, 0x0

    .line 302
    .line 303
    const/high16 v6, 0x3f800000    # 1.0f

    .line 304
    .line 305
    const/high16 v8, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const/4 v7, 0x0

    .line 308
    const/high16 v9, 0x3f800000    # 1.0f

    .line 309
    .line 310
    const/high16 v12, 0x3f800000    # 1.0f

    .line 311
    .line 312
    const/4 v13, 0x0

    .line 313
    const/4 v14, 0x0

    .line 314
    const/4 v15, 0x0

    .line 315
    const-string v4, ""

    .line 316
    .line 317
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 318
    .line 319
    .line 320
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 325
    .line 326
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 327
    .line 328
    .line 329
    move-result-wide v6

    .line 330
    const/4 v2, 0x0

    .line 331
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 335
    .line 336
    .line 337
    move-result v10

    .line 338
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 339
    .line 340
    .line 341
    move-result v11

    .line 342
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 345
    .line 346
    .line 347
    const/high16 v4, 0x41800000    # 16.0f

    .line 348
    .line 349
    const/high16 v6, 0x41200000    # 10.0f

    .line 350
    .line 351
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v4, 0x40e00000    # 7.0f

    .line 355
    .line 356
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v25, -0x41000000    # -0.5f

    .line 360
    .line 361
    const/high16 v26, 0x3f000000    # 0.5f

    .line 362
    .line 363
    const v21, -0x4170a3d7    # -0.28f

    .line 364
    .line 365
    .line 366
    const/16 v22, 0x0

    .line 367
    .line 368
    const/high16 v23, -0x41000000    # -0.5f

    .line 369
    .line 370
    const v24, 0x3e6147ae    # 0.22f

    .line 371
    .line 372
    .line 373
    move-object/from16 v20, v2

    .line 374
    .line 375
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v4, 0x40a00000    # 5.0f

    .line 379
    .line 380
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v25, 0x40e00000    # 7.0f

    .line 384
    .line 385
    const/high16 v26, 0x41b00000    # 22.0f

    .line 386
    .line 387
    const/high16 v21, 0x40d00000    # 6.5f

    .line 388
    .line 389
    const v22, 0x41ae3d71    # 21.78f

    .line 390
    .line 391
    .line 392
    const v23, 0x40d70a3d    # 6.72f

    .line 393
    .line 394
    .line 395
    const/high16 v24, 0x41b00000    # 22.0f

    .line 396
    .line 397
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v4, 0x40400000    # 3.0f

    .line 401
    .line 402
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 406
    .line 407
    const/high16 v26, -0x40400000    # -1.5f

    .line 408
    .line 409
    const v21, 0x3f51eb85    # 0.82f

    .line 410
    .line 411
    .line 412
    const/16 v22, 0x0

    .line 413
    .line 414
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 415
    .line 416
    const v24, -0x40d47ae1    # -0.67f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 423
    .line 424
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v25, 0x41200000    # 10.0f

    .line 428
    .line 429
    const/high16 v26, 0x41800000    # 16.0f

    .line 430
    .line 431
    const/high16 v21, 0x41380000    # 11.5f

    .line 432
    .line 433
    const v22, 0x41855c29    # 16.67f

    .line 434
    .line 435
    .line 436
    const v23, 0x412d1eb8    # 10.82f

    .line 437
    .line 438
    .line 439
    const/high16 v24, 0x41800000    # 16.0f

    .line 440
    .line 441
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v4, 0x41a40000    # 20.5f

    .line 448
    .line 449
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v4, 0x41000000    # 8.0f

    .line 453
    .line 454
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 458
    .line 459
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v4, 0x40000000    # 2.0f

    .line 463
    .line 464
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v4, 0x41a40000    # 20.5f

    .line 468
    .line 469
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 476
    .line 477
    .line 478
    move-result-object v2

    .line 479
    const/high16 v6, 0x3f800000    # 1.0f

    .line 480
    .line 481
    const/4 v7, 0x0

    .line 482
    const-string v4, ""

    .line 483
    .line 484
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 485
    .line 486
    .line 487
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 492
    .line 493
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 494
    .line 495
    .line 496
    move-result-wide v6

    .line 497
    const/4 v2, 0x0

    .line 498
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 502
    .line 503
    .line 504
    move-result v10

    .line 505
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 506
    .line 507
    .line 508
    move-result v11

    .line 509
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 512
    .line 513
    .line 514
    const/high16 v4, 0x41840000    # 16.5f

    .line 515
    .line 516
    const/high16 v6, 0x41800000    # 16.0f

    .line 517
    .line 518
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v4, 0x41600000    # 14.0f

    .line 522
    .line 523
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v25, -0x40800000    # -1.0f

    .line 527
    .line 528
    const/high16 v26, 0x3f800000    # 1.0f

    .line 529
    .line 530
    const v21, -0x40f33333    # -0.55f

    .line 531
    .line 532
    .line 533
    const/16 v22, 0x0

    .line 534
    .line 535
    const/high16 v23, -0x40800000    # -1.0f

    .line 536
    .line 537
    const v24, 0x3ee66666    # 0.45f

    .line 538
    .line 539
    .line 540
    move-object/from16 v20, v2

    .line 541
    .line 542
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v4, 0x4089eb85    # 4.31f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v25, 0x3f30a3d7    # 0.69f

    .line 552
    .line 553
    .line 554
    const v26, 0x3f30a3d7    # 0.69f

    .line 555
    .line 556
    .line 557
    const/16 v21, 0x0

    .line 558
    .line 559
    const v22, 0x3ec28f5c    # 0.38f

    .line 560
    .line 561
    .line 562
    const v23, 0x3e9eb852    # 0.31f

    .line 563
    .line 564
    .line 565
    const v24, 0x3f30a3d7    # 0.69f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v4, 0x3de147ae    # 0.11f

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v26, -0x40cf5c29    # -0.69f

    .line 578
    .line 579
    .line 580
    const v21, 0x3ec28f5c    # 0.38f

    .line 581
    .line 582
    .line 583
    const/16 v22, 0x0

    .line 584
    .line 585
    const v23, 0x3f30a3d7    # 0.69f

    .line 586
    .line 587
    .line 588
    const v24, -0x416147ae    # -0.31f

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v4, 0x41a00000    # 20.0f

    .line 595
    .line 596
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v4, 0x3f8ccccd    # 1.1f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v4, 0x3f3851ec    # 0.72f

    .line 606
    .line 607
    .line 608
    const v6, 0x3fcb851f    # 1.59f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v25, 0x3f2147ae    # 0.63f

    .line 615
    .line 616
    .line 617
    const v26, 0x3ed1eb85    # 0.41f

    .line 618
    .line 619
    .line 620
    const v21, 0x3de147ae    # 0.11f

    .line 621
    .line 622
    .line 623
    const/high16 v22, 0x3e800000    # 0.25f

    .line 624
    .line 625
    const v23, 0x3eb851ec    # 0.36f

    .line 626
    .line 627
    .line 628
    const v24, 0x3ed1eb85    # 0.41f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/4 v4, 0x0

    .line 635
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v25, 0x3f23d70a    # 0.64f

    .line 639
    .line 640
    .line 641
    const v26, -0x4087ae14    # -0.97f

    .line 642
    .line 643
    .line 644
    const/high16 v21, 0x3f000000    # 0.5f

    .line 645
    .line 646
    const/16 v22, 0x0

    .line 647
    .line 648
    const v23, 0x3f547ae1    # 0.83f

    .line 649
    .line 650
    .line 651
    const v24, -0x40fd70a4    # -0.51f

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v4, 0x4188cccd    # 17.1f

    .line 658
    .line 659
    .line 660
    const v6, 0x419f3333    # 19.9f

    .line 661
    .line 662
    .line 663
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const v25, 0x3f666666    # 0.9f

    .line 667
    .line 668
    .line 669
    const v26, -0x404ccccd    # -1.4f

    .line 670
    .line 671
    .line 672
    const v22, -0x41666666    # -0.3f

    .line 673
    .line 674
    .line 675
    const v23, 0x3f666666    # 0.9f

    .line 676
    .line 677
    .line 678
    const v24, -0x40b33333    # -0.8f

    .line 679
    .line 680
    .line 681
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v4, -0x40800000    # -1.0f

    .line 685
    .line 686
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/high16 v25, 0x41840000    # 16.5f

    .line 690
    .line 691
    const/high16 v26, 0x41800000    # 16.0f

    .line 692
    .line 693
    const/high16 v21, 0x41900000    # 18.0f

    .line 694
    .line 695
    const v22, 0x41855c29    # 16.67f

    .line 696
    .line 697
    .line 698
    const v23, 0x418aa3d7    # 17.33f

    .line 699
    .line 700
    .line 701
    const/high16 v24, 0x41800000    # 16.0f

    .line 702
    .line 703
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const/high16 v4, 0x41840000    # 16.5f

    .line 710
    .line 711
    const/high16 v6, 0x41940000    # 18.5f

    .line 712
    .line 713
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v4, -0x40000000    # -2.0f

    .line 717
    .line 718
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v4, -0x40800000    # -1.0f

    .line 722
    .line 723
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v4, 0x40000000    # 2.0f

    .line 727
    .line 728
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const/high16 v4, 0x41940000    # 18.5f

    .line 732
    .line 733
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 740
    .line 741
    .line 742
    move-result-object v2

    .line 743
    const/high16 v6, 0x3f800000    # 1.0f

    .line 744
    .line 745
    const/4 v7, 0x0

    .line 746
    const-string v4, ""

    .line 747
    .line 748
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 749
    .line 750
    .line 751
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 752
    .line 753
    .line 754
    move-result v3

    .line 755
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 756
    .line 757
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 758
    .line 759
    .line 760
    move-result-wide v6

    .line 761
    const/4 v2, 0x0

    .line 762
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 763
    .line 764
    .line 765
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 766
    .line 767
    .line 768
    move-result v10

    .line 769
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 770
    .line 771
    .line 772
    move-result v11

    .line 773
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 776
    .line 777
    .line 778
    const/high16 v4, 0x40600000    # 3.5f

    .line 779
    .line 780
    const/high16 v6, 0x41900000    # 18.0f

    .line 781
    .line 782
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const/high16 v4, -0x40000000    # -2.0f

    .line 786
    .line 787
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const/high16 v4, -0x40600000    # -1.25f

    .line 791
    .line 792
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const/high16 v25, 0x3f400000    # 0.75f

    .line 796
    .line 797
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 798
    .line 799
    const v22, 0x4182b852    # 16.34f

    .line 800
    .line 801
    .line 802
    const v23, 0x3f947ae1    # 1.16f

    .line 803
    .line 804
    .line 805
    move-object/from16 v20, v2

    .line 806
    .line 807
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const/4 v4, 0x0

    .line 811
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const/16 v25, 0x0

    .line 815
    .line 816
    const/high16 v26, 0x41860000    # 16.75f

    .line 817
    .line 818
    const v21, 0x3eae147b    # 0.34f

    .line 819
    .line 820
    .line 821
    const/high16 v22, 0x41800000    # 16.0f

    .line 822
    .line 823
    const/16 v23, 0x0

    .line 824
    .line 825
    const v24, 0x4182b852    # 16.34f

    .line 826
    .line 827
    .line 828
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const/high16 v4, 0x40900000    # 4.5f

    .line 832
    .line 833
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const/high16 v25, 0x3f400000    # 0.75f

    .line 837
    .line 838
    const/high16 v26, 0x41b00000    # 22.0f

    .line 839
    .line 840
    const/16 v21, 0x0

    .line 841
    .line 842
    const v22, 0x41ad47ae    # 21.66f

    .line 843
    .line 844
    .line 845
    const v23, 0x3eae147b    # 0.34f

    .line 846
    .line 847
    .line 848
    const/high16 v24, 0x41b00000    # 22.0f

    .line 849
    .line 850
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const/4 v4, 0x0

    .line 854
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const/high16 v26, -0x40c00000    # -0.75f

    .line 858
    .line 859
    const v21, 0x3ed1eb85    # 0.41f

    .line 860
    .line 861
    .line 862
    const/16 v22, 0x0

    .line 863
    .line 864
    const/high16 v23, 0x3f400000    # 0.75f

    .line 865
    .line 866
    const v24, -0x4151eb85    # -0.34f

    .line 867
    .line 868
    .line 869
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const/high16 v4, 0x419c0000    # 19.5f

    .line 873
    .line 874
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 875
    .line 876
    .line 877
    const/high16 v4, 0x40000000    # 2.0f

    .line 878
    .line 879
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const/high16 v4, 0x3fe00000    # 1.75f

    .line 883
    .line 884
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const/high16 v25, 0x40880000    # 4.25f

    .line 888
    .line 889
    const/high16 v26, 0x41b00000    # 22.0f

    .line 890
    .line 891
    const/high16 v21, 0x40600000    # 3.5f

    .line 892
    .line 893
    const v22, 0x41ad47ae    # 21.66f

    .line 894
    .line 895
    .line 896
    const v23, 0x4075c28f    # 3.84f

    .line 897
    .line 898
    .line 899
    const/high16 v24, 0x41b00000    # 22.0f

    .line 900
    .line 901
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 902
    .line 903
    .line 904
    const/4 v4, 0x0

    .line 905
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    const/high16 v25, 0x40a00000    # 5.0f

    .line 909
    .line 910
    const/high16 v26, 0x41aa0000    # 21.25f

    .line 911
    .line 912
    const v21, 0x40951eb8    # 4.66f

    .line 913
    .line 914
    .line 915
    const/high16 v22, 0x41b00000    # 22.0f

    .line 916
    .line 917
    const/high16 v23, 0x40a00000    # 5.0f

    .line 918
    .line 919
    const v24, 0x41ad47ae    # 21.66f

    .line 920
    .line 921
    .line 922
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const/high16 v4, -0x3f700000    # -4.5f

    .line 926
    .line 927
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const/high16 v25, 0x40880000    # 4.25f

    .line 931
    .line 932
    const/high16 v26, 0x41800000    # 16.0f

    .line 933
    .line 934
    const/high16 v21, 0x40a00000    # 5.0f

    .line 935
    .line 936
    const v22, 0x4182b852    # 16.34f

    .line 937
    .line 938
    .line 939
    const v23, 0x40951eb8    # 4.66f

    .line 940
    .line 941
    .line 942
    const/high16 v24, 0x41800000    # 16.0f

    .line 943
    .line 944
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 945
    .line 946
    .line 947
    const/4 v4, 0x0

    .line 948
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const/high16 v25, -0x40c00000    # -0.75f

    .line 952
    .line 953
    const/high16 v26, 0x3f400000    # 0.75f

    .line 954
    .line 955
    const v21, -0x412e147b    # -0.41f

    .line 956
    .line 957
    .line 958
    const/16 v22, 0x0

    .line 959
    .line 960
    const/high16 v23, -0x40c00000    # -0.75f

    .line 961
    .line 962
    const v24, 0x3eae147b    # 0.34f

    .line 963
    .line 964
    .line 965
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 966
    .line 967
    .line 968
    const/high16 v4, 0x41900000    # 18.0f

    .line 969
    .line 970
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 971
    .line 972
    .line 973
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 974
    .line 975
    .line 976
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 977
    .line 978
    .line 979
    move-result-object v2

    .line 980
    const/high16 v6, 0x3f800000    # 1.0f

    .line 981
    .line 982
    const/4 v7, 0x0

    .line 983
    const-string v4, ""

    .line 984
    .line 985
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 986
    .line 987
    .line 988
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 989
    .line 990
    .line 991
    move-result v3

    .line 992
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 993
    .line 994
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 995
    .line 996
    .line 997
    move-result-wide v6

    .line 998
    const/4 v0, 0x0

    .line 999
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1003
    .line 1004
    .line 1005
    move-result v10

    .line 1006
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1007
    .line 1008
    .line 1009
    move-result v11

    .line 1010
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1011
    .line 1012
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1013
    .line 1014
    .line 1015
    const/high16 v0, 0x41b00000    # 22.0f

    .line 1016
    .line 1017
    const/high16 v2, 0x41940000    # 18.5f

    .line 1018
    .line 1019
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1020
    .line 1021
    .line 1022
    const/high16 v0, -0x40600000    # -1.25f

    .line 1023
    .line 1024
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1025
    .line 1026
    .line 1027
    const/high16 v17, -0x40c00000    # -0.75f

    .line 1028
    .line 1029
    const/high16 v18, -0x40c00000    # -0.75f

    .line 1030
    .line 1031
    const v14, -0x412e147b    # -0.41f

    .line 1032
    .line 1033
    .line 1034
    const v15, -0x4151eb85    # -0.34f

    .line 1035
    .line 1036
    .line 1037
    const/high16 v16, -0x40c00000    # -0.75f

    .line 1038
    .line 1039
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1040
    .line 1041
    .line 1042
    const/4 v0, 0x0

    .line 1043
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1044
    .line 1045
    .line 1046
    const/high16 v18, 0x3f400000    # 0.75f

    .line 1047
    .line 1048
    const v13, -0x412e147b    # -0.41f

    .line 1049
    .line 1050
    .line 1051
    const/4 v14, 0x0

    .line 1052
    const/high16 v15, -0x40c00000    # -0.75f

    .line 1053
    .line 1054
    const v16, 0x3eae147b    # 0.34f

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1058
    .line 1059
    .line 1060
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 1061
    .line 1062
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1063
    .line 1064
    .line 1065
    const/high16 v0, -0x40600000    # -1.25f

    .line 1066
    .line 1067
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1071
    .line 1072
    .line 1073
    const/4 v0, 0x0

    .line 1074
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1075
    .line 1076
    .line 1077
    const/high16 v17, 0x3f400000    # 0.75f

    .line 1078
    .line 1079
    const/4 v13, 0x0

    .line 1080
    const v14, 0x3ed1eb85    # 0.41f

    .line 1081
    .line 1082
    .line 1083
    const v15, 0x3eae147b    # 0.34f

    .line 1084
    .line 1085
    .line 1086
    const/high16 v16, 0x3f400000    # 0.75f

    .line 1087
    .line 1088
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1089
    .line 1090
    .line 1091
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 1092
    .line 1093
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1097
    .line 1098
    .line 1099
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1100
    .line 1101
    .line 1102
    const/4 v0, 0x0

    .line 1103
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1104
    .line 1105
    .line 1106
    const/high16 v18, -0x40c00000    # -0.75f

    .line 1107
    .line 1108
    const v13, 0x3ed1eb85    # 0.41f

    .line 1109
    .line 1110
    .line 1111
    const/4 v14, 0x0

    .line 1112
    const/high16 v15, 0x3f400000    # 0.75f

    .line 1113
    .line 1114
    const v16, -0x4151eb85    # -0.34f

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1118
    .line 1119
    .line 1120
    const/high16 v0, 0x41a00000    # 20.0f

    .line 1121
    .line 1122
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1123
    .line 1124
    .line 1125
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 1126
    .line 1127
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1131
    .line 1132
    .line 1133
    const/4 v0, 0x0

    .line 1134
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1135
    .line 1136
    .line 1137
    const/high16 v17, -0x40c00000    # -0.75f

    .line 1138
    .line 1139
    const/4 v13, 0x0

    .line 1140
    const v14, -0x412e147b    # -0.41f

    .line 1141
    .line 1142
    .line 1143
    const v15, -0x4151eb85    # -0.34f

    .line 1144
    .line 1145
    .line 1146
    const/high16 v16, -0x40c00000    # -0.75f

    .line 1147
    .line 1148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1149
    .line 1150
    .line 1151
    const/high16 v0, 0x41b00000    # 22.0f

    .line 1152
    .line 1153
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v2

    .line 1163
    const/16 v16, 0x3800

    .line 1164
    .line 1165
    const/16 v17, 0x0

    .line 1166
    .line 1167
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1168
    .line 1169
    const/4 v7, 0x0

    .line 1170
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1171
    .line 1172
    const/4 v14, 0x0

    .line 1173
    const/4 v15, 0x0

    .line 1174
    const-string v4, ""

    .line 1175
    .line 1176
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v0

    .line 1180
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v0

    .line 1184
    sput-object v0, Landroidx/compose/material/icons/rounded/HdrEnhancedSelectKt;->_hdrEnhancedSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1185
    .line 1186
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1187
    .line 1188
    .line 1189
    return-object v0
.end method
