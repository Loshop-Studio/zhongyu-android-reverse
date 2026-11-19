.class public final Landroidx/compose/material/icons/outlined/DonutLargeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_donutLarge",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DonutLarge",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getDonutLarge",
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
        "SMAP\nDonutLarge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DonutLarge.kt\nandroidx/compose/material/icons/outlined/DonutLargeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,57:1\n212#2,12:58\n233#2,18:71\n253#2:108\n174#3:70\n705#4,2:89\n717#4,2:91\n719#4,11:97\n72#5,4:93\n*S KotlinDebug\n*F\n+ 1 DonutLarge.kt\nandroidx/compose/material/icons/outlined/DonutLargeKt\n*L\n29#1:58,12\n30#1:71,18\n30#1:108\n29#1:70\n30#1:89,2\n30#1:91,2\n30#1:97,11\n30#1:93,4\n*E\n"
    }
.end annotation


# static fields
.field private static _donutLarge:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDonutLarge(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/DonutLargeKt;->_donutLarge:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.DonutLarge"

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
    const v0, 0x40a28f5c    # 5.08f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41500000    # 13.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, 0x40bd70a4    # 5.92f

    .line 79
    .line 80
    .line 81
    const v18, 0x40bd70a4    # 5.92f

    .line 82
    .line 83
    .line 84
    const v13, 0x4043d70a    # 3.06f

    .line 85
    .line 86
    .line 87
    const v14, 0x3ee147ae    # 0.44f

    .line 88
    .line 89
    .line 90
    const v15, 0x40af5c29    # 5.48f

    .line 91
    .line 92
    .line 93
    const v16, 0x40370a3d    # 2.86f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, 0x4041eb85    # 3.03f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v17, -0x3ef0cccd    # -8.95f

    .line 106
    .line 107
    .line 108
    const v18, -0x3ef0cccd    # -8.95f

    .line 109
    .line 110
    .line 111
    const v13, -0x410f5c29    # -0.47f

    .line 112
    .line 113
    .line 114
    const v14, -0x3f68f5c3    # -4.72f

    .line 115
    .line 116
    .line 117
    const v15, -0x3f78a3d7    # -4.23f

    .line 118
    .line 119
    .line 120
    const v16, -0x3ef851ec    # -8.48f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v4, 0x41975c29    # 18.92f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, -0x3f428f5c    # -5.92f

    .line 139
    .line 140
    .line 141
    const v18, 0x40bd70a4    # 5.92f

    .line 142
    .line 143
    .line 144
    const v13, -0x411eb852    # -0.44f

    .line 145
    .line 146
    .line 147
    const v14, 0x4043d70a    # 3.06f

    .line 148
    .line 149
    .line 150
    const v15, -0x3fc8f5c3    # -2.86f

    .line 151
    .line 152
    .line 153
    const v16, 0x40af5c29    # 5.48f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v17, 0x410f3333    # 8.95f

    .line 163
    .line 164
    .line 165
    const v18, -0x3ef0cccd    # -8.95f

    .line 166
    .line 167
    .line 168
    const v13, 0x40970a3d    # 4.72f

    .line 169
    .line 170
    .line 171
    const v14, -0x410f5c29    # -0.47f

    .line 172
    .line 173
    .line 174
    const v15, 0x4107ae14    # 8.48f

    .line 175
    .line 176
    .line 177
    const v16, -0x3f78a3d7    # -4.23f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v0, -0x3fbe147b    # -3.03f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v2, 0x41300000    # 11.0f

    .line 193
    .line 194
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v17, -0x3f400000    # -6.0f

    .line 198
    .line 199
    const v18, -0x3f228f5c    # -6.92f

    .line 200
    .line 201
    .line 202
    const v13, -0x3fa70a3d    # -3.39f

    .line 203
    .line 204
    .line 205
    const v14, -0x41051eb8    # -0.49f

    .line 206
    .line 207
    .line 208
    const/high16 v15, -0x3f400000    # -6.0f

    .line 209
    .line 210
    const v16, -0x3fa66666    # -3.4f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v2, 0x40c00000    # 6.0f

    .line 217
    .line 218
    const v4, -0x3f228f5c    # -6.92f

    .line 219
    .line 220
    .line 221
    const v6, 0x40270a3d    # 2.61f

    .line 222
    .line 223
    .line 224
    const v7, -0x3f323d71    # -6.43f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v6, v7, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v2, 0x40033333    # 2.05f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 237
    .line 238
    const v18, 0x411f3333    # 9.95f

    .line 239
    .line 240
    .line 241
    const v13, -0x3f5e6666    # -5.05f

    .line 242
    .line 243
    .line 244
    const/high16 v14, 0x3f000000    # 0.5f

    .line 245
    .line 246
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 247
    .line 248
    const v16, 0x409851ec    # 4.76f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v17, 0x41100000    # 9.0f

    .line 255
    .line 256
    const/4 v13, 0x0

    .line 257
    const v14, 0x40a6147b    # 5.19f

    .line 258
    .line 259
    .line 260
    const v15, 0x407ccccd    # 3.95f

    .line 261
    .line 262
    .line 263
    const v16, 0x41173333    # 9.45f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    const/16 v16, 0x3800

    .line 280
    .line 281
    const/16 v17, 0x0

    .line 282
    .line 283
    const-string v4, ""

    .line 284
    .line 285
    const/high16 v6, 0x3f800000    # 1.0f

    .line 286
    .line 287
    const/4 v7, 0x0

    .line 288
    const/high16 v8, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/high16 v9, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/high16 v12, 0x3f800000    # 1.0f

    .line 293
    .line 294
    const/4 v14, 0x0

    .line 295
    const/4 v15, 0x0

    .line 296
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    sput-object v0, Landroidx/compose/material/icons/outlined/DonutLargeKt;->_donutLarge:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 305
    .line 306
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    return-object v0
.end method
