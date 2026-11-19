.class public final Landroidx/compose/material/icons/rounded/NightlightRoundKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_nightlightRound",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "NightlightRound",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getNightlightRound",
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
        "SMAP\nNightlightRound.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NightlightRound.kt\nandroidx/compose/material/icons/rounded/NightlightRoundKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,48:1\n212#2,12:49\n233#2,18:62\n253#2:99\n174#3:61\n705#4,2:80\n717#4,2:82\n719#4,11:88\n72#5,4:84\n*S KotlinDebug\n*F\n+ 1 NightlightRound.kt\nandroidx/compose/material/icons/rounded/NightlightRoundKt\n*L\n29#1:49,12\n30#1:62,18\n30#1:99\n29#1:61\n30#1:80,2\n30#1:82,2\n30#1:88,11\n30#1:84,4\n*E\n"
    }
.end annotation


# static fields
.field private static _nightlightRound:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNightlightRound(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NightlightRoundKt;->_nightlightRound:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NightlightRound"

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
    const/high16 v0, 0x41780000    # 15.5f

    .line 71
    .line 72
    const/high16 v2, 0x41b00000    # 22.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x3e570a3d    # 0.21f

    .line 78
    .line 79
    .line 80
    const/16 v18, 0x0

    .line 81
    .line 82
    const v13, 0x3d8f5c29    # 0.07f

    .line 83
    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const v15, 0x3e0f5c29    # 0.14f

    .line 87
    .line 88
    .line 89
    const/16 v16, 0x0

    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v17, 0x3ed1eb85    # 0.41f

    .line 95
    .line 96
    .line 97
    const v18, -0x403851ec    # -1.56f

    .line 98
    .line 99
    .line 100
    const v13, 0x3f570a3d    # 0.84f

    .line 101
    .line 102
    .line 103
    const v14, -0x435c28f6    # -0.02f

    .line 104
    .line 105
    .line 106
    const v15, 0x3f8f5c29    # 1.12f

    .line 107
    .line 108
    .line 109
    const v16, -0x4071eb85    # -1.11f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v17, -0x3f6bd70a    # -4.63f

    .line 116
    .line 117
    .line 118
    const v18, -0x3ef91eb8    # -8.43f

    .line 119
    .line 120
    .line 121
    const v13, -0x3fce147b    # -2.78f

    .line 122
    .line 123
    .line 124
    const v14, -0x401d70a4    # -1.77f

    .line 125
    .line 126
    .line 127
    const v15, -0x3f6bd70a    # -4.63f

    .line 128
    .line 129
    .line 130
    const v16, -0x3f63851f    # -4.89f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v17, 0x409428f6    # 4.63f

    .line 137
    .line 138
    .line 139
    const v18, -0x3ef8f5c3    # -8.44f

    .line 140
    .line 141
    .line 142
    const/4 v13, 0x0

    .line 143
    const v14, -0x3f9ccccd    # -3.55f

    .line 144
    .line 145
    .line 146
    const v15, 0x3feccccd    # 1.85f

    .line 147
    .line 148
    .line 149
    const v16, -0x3f2ae148    # -6.66f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, -0x413851ec    # -0.39f

    .line 156
    .line 157
    .line 158
    const v18, -0x403851ec    # -1.56f

    .line 159
    .line 160
    .line 161
    const v13, 0x3f333333    # 0.7f

    .line 162
    .line 163
    .line 164
    const v14, -0x4119999a    # -0.45f

    .line 165
    .line 166
    .line 167
    const v15, 0x3ee147ae    # 0.44f

    .line 168
    .line 169
    .line 170
    const v16, -0x403ae148    # -1.54f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v17, -0x41fae148    # -0.13f

    .line 177
    .line 178
    .line 179
    const/16 v18, 0x0

    .line 180
    .line 181
    const v13, -0x42dc28f6    # -0.04f

    .line 182
    .line 183
    .line 184
    const/4 v14, 0x0

    .line 185
    const v15, -0x4247ae14    # -0.09f

    .line 186
    .line 187
    .line 188
    const/16 v16, 0x0

    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v17, -0x3ee051ec    # -9.98f

    .line 194
    .line 195
    .line 196
    const v18, 0x4105eb85    # 8.37f

    .line 197
    .line 198
    .line 199
    const v13, -0x3f633333    # -4.9f

    .line 200
    .line 201
    .line 202
    const v14, -0x42b33333    # -0.05f

    .line 203
    .line 204
    .line 205
    const v15, -0x3eeca3d7    # -9.21f

    .line 206
    .line 207
    .line 208
    const v16, 0x4061eb85    # 3.53f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v17, 0x41780000    # 15.5f

    .line 215
    .line 216
    const/high16 v18, 0x41b00000    # 22.0f

    .line 217
    .line 218
    const v13, 0x40947ae1    # 4.64f

    .line 219
    .line 220
    .line 221
    const v14, 0x4184e148    # 16.61f

    .line 222
    .line 223
    .line 224
    const v15, 0x41173333    # 9.45f

    .line 225
    .line 226
    .line 227
    const/high16 v16, 0x41b00000    # 22.0f

    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    const/16 v16, 0x3800

    .line 243
    .line 244
    const/16 v17, 0x0

    .line 245
    .line 246
    const-string v4, ""

    .line 247
    .line 248
    const/high16 v6, 0x3f800000    # 1.0f

    .line 249
    .line 250
    const/4 v7, 0x0

    .line 251
    const/high16 v8, 0x3f800000    # 1.0f

    .line 252
    .line 253
    const/high16 v9, 0x3f800000    # 1.0f

    .line 254
    .line 255
    const/high16 v12, 0x3f800000    # 1.0f

    .line 256
    .line 257
    const/4 v13, 0x0

    .line 258
    const/4 v14, 0x0

    .line 259
    const/4 v15, 0x0

    .line 260
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    sput-object v0, Landroidx/compose/material/icons/rounded/NightlightRoundKt;->_nightlightRound:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 269
    .line 270
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    return-object v0
.end method
