.class public final Landroidx/compose/material/icons/outlined/YoutubeSearchedForKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_youtubeSearchedFor",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "YoutubeSearchedFor",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getYoutubeSearchedFor",
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
        "SMAP\nYoutubeSearchedFor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YoutubeSearchedFor.kt\nandroidx/compose/material/icons/outlined/YoutubeSearchedForKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,60:1\n212#2,12:61\n233#2,18:74\n253#2:111\n174#3:73\n705#4,2:92\n717#4,2:94\n719#4,11:100\n72#5,4:96\n*S KotlinDebug\n*F\n+ 1 YoutubeSearchedFor.kt\nandroidx/compose/material/icons/outlined/YoutubeSearchedForKt\n*L\n29#1:61,12\n30#1:74,18\n30#1:111\n29#1:73\n30#1:92,2\n30#1:94,2\n30#1:100,11\n30#1:96,4\n*E\n"
    }
.end annotation


# static fields
.field private static _youtubeSearchedFor:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getYoutubeSearchedFor(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/YoutubeSearchedForKt;->_youtubeSearchedFor:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.YoutubeSearchedFor"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

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
    const v0, 0x4188147b    # 17.01f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41600000    # 14.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, -0x40b33333    # -0.8f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v0, -0x4175c28f    # -0.27f

    .line 85
    .line 86
    .line 87
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const v17, 0x3fc8f5c3    # 1.57f

    .line 91
    .line 92
    .line 93
    const v18, -0x3f78a3d7    # -4.23f

    .line 94
    .line 95
    .line 96
    const v13, 0x3f7ae148    # 0.98f

    .line 97
    .line 98
    .line 99
    const v14, -0x406e147b    # -1.14f

    .line 100
    .line 101
    .line 102
    const v15, 0x3fc8f5c3    # 1.57f

    .line 103
    .line 104
    .line 105
    const v16, -0x3fd8f5c3    # -2.61f

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v17, -0x3f300000    # -6.5f

    .line 112
    .line 113
    const/high16 v18, -0x3f300000    # -6.5f

    .line 114
    .line 115
    const/4 v13, 0x0

    .line 116
    const v14, -0x3f9a3d71    # -3.59f

    .line 117
    .line 118
    .line 119
    const v15, -0x3fc5c28f    # -2.91f

    .line 120
    .line 121
    .line 122
    const/high16 v16, -0x3f300000    # -6.5f

    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v0, 0x40400000    # 3.0f

    .line 128
    .line 129
    const/high16 v2, 0x40d00000    # 6.5f

    .line 130
    .line 131
    const/high16 v4, -0x3f300000    # -6.5f

    .line 132
    .line 133
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, 0x40000000    # 2.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v0, 0x4075c28f    # 3.84f

    .line 142
    .line 143
    .line 144
    const/high16 v2, 0x40800000    # 4.0f

    .line 145
    .line 146
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, 0x40851eb8    # 4.16f

    .line 150
    .line 151
    .line 152
    const/high16 v2, -0x3f800000    # -4.0f

    .line 153
    .line 154
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, 0x40d051ec    # 6.51f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, 0x413028f6    # 11.01f

    .line 164
    .line 165
    .line 166
    const/high16 v18, 0x40a00000    # 5.0f

    .line 167
    .line 168
    const v13, 0x40d051ec    # 6.51f

    .line 169
    .line 170
    .line 171
    const/high16 v14, 0x40e00000    # 7.0f

    .line 172
    .line 173
    const v15, 0x41087ae1    # 8.53f

    .line 174
    .line 175
    .line 176
    const/high16 v16, 0x40a00000    # 5.0f

    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x4000a3d7    # 2.01f

    .line 182
    .line 183
    .line 184
    const/high16 v2, 0x40900000    # 4.5f

    .line 185
    .line 186
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v17, -0x3f700000    # -4.5f

    .line 190
    .line 191
    const/high16 v18, 0x40900000    # 4.5f

    .line 192
    .line 193
    const/4 v13, 0x0

    .line 194
    const v14, 0x401eb852    # 2.48f

    .line 195
    .line 196
    .line 197
    const v15, -0x3ffeb852    # -2.02f

    .line 198
    .line 199
    .line 200
    const/high16 v16, 0x40900000    # 4.5f

    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, -0x40170a3d    # -1.82f

    .line 206
    .line 207
    .line 208
    const v18, -0x413d70a4    # -0.38f

    .line 209
    .line 210
    .line 211
    const v13, -0x40d9999a    # -0.65f

    .line 212
    .line 213
    .line 214
    const/4 v14, 0x0

    .line 215
    const v15, -0x405eb852    # -1.26f

    .line 216
    .line 217
    .line 218
    const v16, -0x41f0a3d7    # -0.14f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x40f6b852    # 7.71f

    .line 225
    .line 226
    .line 227
    const v2, 0x4171999a    # 15.1f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, 0x40533333    # 3.3f

    .line 234
    .line 235
    .line 236
    const v18, 0x3f666666    # 0.9f

    .line 237
    .line 238
    .line 239
    const v13, 0x3f7851ec    # 0.97f

    .line 240
    .line 241
    .line 242
    const v14, 0x3f11eb85    # 0.57f

    .line 243
    .line 244
    .line 245
    const v15, 0x4005c28f    # 2.09f

    .line 246
    .line 247
    .line 248
    const v16, 0x3f666666    # 0.9f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, 0x40870a3d    # 4.22f

    .line 255
    .line 256
    .line 257
    const v18, -0x40370a3d    # -1.57f

    .line 258
    .line 259
    .line 260
    const v13, 0x3fce147b    # 1.61f

    .line 261
    .line 262
    .line 263
    const/4 v14, 0x0

    .line 264
    const v15, 0x40451eb8    # 3.08f

    .line 265
    .line 266
    .line 267
    const v16, -0x40e8f5c3    # -0.59f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x3e8a3d71    # 0.27f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, 0x3f4a3d71    # 0.79f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, 0x40a051ec    # 5.01f

    .line 286
    .line 287
    .line 288
    const v2, 0x409fae14    # 4.99f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x41b00000    # 22.0f

    .line 295
    .line 296
    const/high16 v2, 0x41980000    # 19.0f

    .line 297
    .line 298
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, -0x3f6051ec    # -4.99f

    .line 302
    .line 303
    .line 304
    const/high16 v2, -0x3f600000    # -5.0f

    .line 305
    .line 306
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    const/16 v16, 0x3800

    .line 317
    .line 318
    const/16 v17, 0x0

    .line 319
    .line 320
    const-string v4, ""

    .line 321
    .line 322
    const/high16 v6, 0x3f800000    # 1.0f

    .line 323
    .line 324
    const/4 v7, 0x0

    .line 325
    const/high16 v8, 0x3f800000    # 1.0f

    .line 326
    .line 327
    const/high16 v9, 0x3f800000    # 1.0f

    .line 328
    .line 329
    const/high16 v12, 0x3f800000    # 1.0f

    .line 330
    .line 331
    const/4 v13, 0x0

    .line 332
    const/4 v15, 0x0

    .line 333
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    sput-object v0, Landroidx/compose/material/icons/outlined/YoutubeSearchedForKt;->_youtubeSearchedFor:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 342
    .line 343
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    return-object v0
.end method
