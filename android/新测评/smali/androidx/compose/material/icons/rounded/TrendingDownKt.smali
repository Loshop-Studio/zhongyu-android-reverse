.class public final Landroidx/compose/material/icons/rounded/TrendingDownKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "_trendingDown",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "TrendingDown",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getTrendingDown$annotations",
        "(Landroidx/compose/material/icons/Icons$Rounded;)V",
        "getTrendingDown",
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
        "SMAP\nTrendingDown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrendingDown.kt\nandroidx/compose/material/icons/rounded/TrendingDownKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,62:1\n212#2,12:63\n233#2,18:76\n253#2:113\n174#3:75\n705#4,2:94\n717#4,2:96\n719#4,11:102\n72#5,4:98\n*S KotlinDebug\n*F\n+ 1 TrendingDown.kt\nandroidx/compose/material/icons/rounded/TrendingDownKt\n*L\n35#1:63,12\n36#1:76,18\n36#1:113\n35#1:75\n36#1:94,2\n36#1:96,2\n36#1:102,11\n36#1:98,4\n*E\n"
    }
.end annotation


# static fields
.field private static _trendingDown:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTrendingDown(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TrendingDownKt;->_trendingDown:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.TrendingDown"

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
    const v0, 0x4186cccd    # 16.85f

    .line 71
    .line 72
    .line 73
    const v2, 0x41893333    # 17.15f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x3fb851ec    # 1.44f

    .line 80
    .line 81
    .line 82
    const v2, -0x4047ae14    # -1.44f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, -0x3f63d70a    # -4.88f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v4, -0x3fad70a4    # -3.29f

    .line 95
    .line 96
    .line 97
    const v6, 0x40528f5c    # 3.29f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v17, -0x404b851f    # -1.41f

    .line 104
    .line 105
    .line 106
    const/16 v18, 0x0

    .line 107
    .line 108
    const v13, -0x413851ec    # -0.39f

    .line 109
    .line 110
    .line 111
    const v14, 0x3ec7ae14    # 0.39f

    .line 112
    .line 113
    .line 114
    const v15, -0x407d70a4    # -1.02f

    .line 115
    .line 116
    .line 117
    const v16, 0x3ec7ae14    # 0.39f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v7, -0x3f400000    # -6.0f

    .line 124
    .line 125
    const v8, -0x3f3fae14    # -6.01f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v12, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/16 v17, 0x0

    .line 132
    .line 133
    const v18, -0x404b851f    # -1.41f

    .line 134
    .line 135
    .line 136
    const v14, -0x413851ec    # -0.39f

    .line 137
    .line 138
    .line 139
    const v15, -0x413851ec    # -0.39f

    .line 140
    .line 141
    .line 142
    const v16, -0x407d70a4    # -1.02f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, 0x3fb47ae1    # 1.41f

    .line 149
    .line 150
    .line 151
    const/16 v18, 0x0

    .line 152
    .line 153
    const v13, 0x3ec7ae14    # 0.39f

    .line 154
    .line 155
    .line 156
    const v15, 0x3f828f5c    # 1.02f

    .line 157
    .line 158
    .line 159
    const v16, -0x413851ec    # -0.39f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v7, 0x41168f5c    # 9.41f

    .line 166
    .line 167
    .line 168
    const/high16 v8, 0x41400000    # 12.0f

    .line 169
    .line 170
    invoke-virtual {v12, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v4, 0x40b2e148    # 5.59f

    .line 180
    .line 181
    .line 182
    const v6, 0x40b28f5c    # 5.58f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v17, 0x3f59999a    # 0.85f

    .line 192
    .line 193
    .line 194
    const v18, 0x3eb33333    # 0.35f

    .line 195
    .line 196
    .line 197
    const v13, 0x3e9eb852    # 0.31f

    .line 198
    .line 199
    .line 200
    const v14, -0x416147ae    # -0.31f

    .line 201
    .line 202
    .line 203
    const v15, 0x3f59999a    # 0.85f

    .line 204
    .line 205
    .line 206
    const v16, -0x4247ae14    # -0.09f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, 0x408947ae    # 4.29f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v17, -0x41000000    # -0.5f

    .line 219
    .line 220
    const/high16 v18, 0x3f000000    # 0.5f

    .line 221
    .line 222
    const/4 v13, 0x0

    .line 223
    const v14, 0x3e8f5c29    # 0.28f

    .line 224
    .line 225
    .line 226
    const v15, -0x419eb852    # -0.22f

    .line 227
    .line 228
    .line 229
    const/high16 v16, 0x3f000000    # 0.5f

    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x4189999a    # 17.2f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, -0x414ccccd    # -0.35f

    .line 241
    .line 242
    .line 243
    const v18, -0x40a8f5c3    # -0.84f

    .line 244
    .line 245
    .line 246
    const v13, -0x411eb852    # -0.44f

    .line 247
    .line 248
    .line 249
    const v14, 0x3c23d70a    # 0.01f

    .line 250
    .line 251
    .line 252
    const v15, -0x40d70a3d    # -0.66f

    .line 253
    .line 254
    .line 255
    const v16, -0x40f851ec    # -0.53f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    const/16 v16, 0x3800

    .line 269
    .line 270
    const/16 v17, 0x0

    .line 271
    .line 272
    const-string v4, ""

    .line 273
    .line 274
    const/high16 v6, 0x3f800000    # 1.0f

    .line 275
    .line 276
    const/4 v7, 0x0

    .line 277
    const/high16 v8, 0x3f800000    # 1.0f

    .line 278
    .line 279
    const/high16 v9, 0x3f800000    # 1.0f

    .line 280
    .line 281
    const/high16 v12, 0x3f800000    # 1.0f

    .line 282
    .line 283
    const/4 v13, 0x0

    .line 284
    const/4 v14, 0x0

    .line 285
    const/4 v15, 0x0

    .line 286
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    sput-object v0, Landroidx/compose/material/icons/rounded/TrendingDownKt;->_trendingDown:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 295
    .line 296
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    return-object v0
.end method

.method public static synthetic getTrendingDown$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.TrendingDown"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "Icons.AutoMirrored.Rounded.TrendingDown"
            imports = {
                "androidx.compose.material.icons.automirrored.rounded.TrendingDown"
            }
        .end subannotation
    .end annotation

    return-void
.end method
