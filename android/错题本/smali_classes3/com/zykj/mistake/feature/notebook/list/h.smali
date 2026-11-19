.class public final synthetic Lcom/zykj/mistake/feature/notebook/list/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(JI)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/mistake/feature/notebook/list/h;->a:I

    iput-wide p1, p0, Lcom/zykj/mistake/feature/notebook/list/h;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/zykj/mistake/feature/notebook/list/h;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p1

    .line 9
    .line 10
    check-cast v2, Lcom/zykj/mistake/main/p;

    .line 11
    .line 12
    const-string v1, "draft"

    .line 13
    .line 14
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v2, Lcom/zykj/mistake/main/p;->g:Ljava/util/Set;

    .line 18
    .line 19
    check-cast v1, Ljava/lang/Iterable;

    .line 20
    .line 21
    invoke-static {v1}, Lkotlin/collections/t;->G0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v9

    .line 25
    iget-wide v3, v0, Lcom/zykj/mistake/feature/notebook/list/h;->b:J

    .line 26
    .line 27
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v9, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v9, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :cond_0
    const/4 v14, 0x0

    .line 45
    const/16 v15, 0xfbf

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    const/4 v4, 0x0

    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v11, 0x0

    .line 55
    const/4 v12, 0x0

    .line 56
    const/4 v13, 0x0

    .line 57
    invoke-static/range {v2 .. v15}, Lcom/zykj/mistake/main/p;->a(Lcom/zykj/mistake/main/p;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;I)Lcom/zykj/mistake/main/p;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    return-object v1

    .line 62
    :pswitch_0
    move-object/from16 v2, p1

    .line 63
    .line 64
    check-cast v2, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    .line 65
    .line 66
    const-string v1, "$this$drawBehind"

    .line 67
    .line 68
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    int-to-float v3, v1

    .line 73
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-interface {v2, v3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    const/4 v3, 0x2

    .line 82
    int-to-float v4, v3

    .line 83
    div-float v4, v5, v4

    .line 84
    .line 85
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    int-to-long v6, v6

    .line 90
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    int-to-long v8, v4

    .line 95
    const/16 v4, 0x20

    .line 96
    .line 97
    shl-long/2addr v6, v4

    .line 98
    const-wide v10, 0xffffffffL

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    and-long/2addr v8, v10

    .line 104
    or-long/2addr v6, v8

    .line 105
    invoke-static {v6, v7}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 106
    .line 107
    .line 108
    move-result-wide v12

    .line 109
    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 110
    .line 111
    .line 112
    move-result-wide v6

    .line 113
    shr-long/2addr v6, v4

    .line 114
    long-to-int v6, v6

    .line 115
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    sub-float/2addr v6, v5

    .line 120
    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 121
    .line 122
    .line 123
    move-result-wide v7

    .line 124
    and-long/2addr v7, v10

    .line 125
    long-to-int v7, v7

    .line 126
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    sub-float/2addr v7, v5

    .line 131
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    int-to-long v8, v6

    .line 136
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    int-to-long v6, v6

    .line 141
    shl-long/2addr v8, v4

    .line 142
    and-long/2addr v6, v10

    .line 143
    or-long/2addr v6, v8

    .line 144
    invoke-static {v6, v7}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    .line 145
    .line 146
    .line 147
    move-result-wide v14

    .line 148
    const/4 v6, 0x3

    .line 149
    int-to-float v6, v6

    .line 150
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    invoke-interface {v2, v7}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    invoke-interface {v2, v6}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    int-to-long v7, v7

    .line 171
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    move v9, v4

    .line 176
    move/from16 p1, v5

    .line 177
    .line 178
    int-to-long v4, v6

    .line 179
    shl-long v6, v7, v9

    .line 180
    .line 181
    and-long/2addr v4, v10

    .line 182
    or-long/2addr v4, v6

    .line 183
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/CornerRadius;->constructor-impl(J)J

    .line 184
    .line 185
    .line 186
    move-result-wide v16

    .line 187
    new-instance v4, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 188
    .line 189
    sget-object v5, Landroidx/compose/ui/graphics/PathEffect;->Companion:Landroidx/compose/ui/graphics/PathEffect$Companion;

    .line 190
    .line 191
    const/4 v6, 0x5

    .line 192
    int-to-float v6, v6

    .line 193
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    invoke-interface {v2, v7}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 198
    .line 199
    .line 200
    move-result v7

    .line 201
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    invoke-interface {v2, v6}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    new-array v8, v3, [F

    .line 210
    .line 211
    const/4 v9, 0x0

    .line 212
    aput v7, v8, v9

    .line 213
    .line 214
    aput v6, v8, v1

    .line 215
    .line 216
    const/4 v1, 0x0

    .line 217
    const/4 v6, 0x0

    .line 218
    invoke-static {v5, v8, v1, v3, v6}, Landroidx/compose/ui/graphics/PathEffect$Companion;->dashPathEffect$default(Landroidx/compose/ui/graphics/PathEffect$Companion;[FFILjava/lang/Object;)Landroidx/compose/ui/graphics/PathEffect;

    .line 219
    .line 220
    .line 221
    move-result-object v9

    .line 222
    const/16 v10, 0xe

    .line 223
    .line 224
    const/4 v11, 0x0

    .line 225
    const/4 v6, 0x0

    .line 226
    const/4 v7, 0x0

    .line 227
    const/4 v8, 0x0

    .line 228
    move/from16 v5, p1

    .line 229
    .line 230
    invoke-direct/range {v4 .. v11}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/e;)V

    .line 231
    .line 232
    .line 233
    move-wide v7, v14

    .line 234
    const/16 v15, 0xe0

    .line 235
    .line 236
    move-wide/from16 v9, v16

    .line 237
    .line 238
    const/16 v16, 0x0

    .line 239
    .line 240
    move-object v11, v4

    .line 241
    iget-wide v3, v0, Lcom/zykj/mistake/feature/notebook/list/h;->b:J

    .line 242
    .line 243
    move-wide v5, v12

    .line 244
    const/4 v12, 0x0

    .line 245
    const/4 v13, 0x0

    .line 246
    const/4 v14, 0x0

    .line 247
    invoke-static/range {v2 .. v16}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRoundRect-u-Aw5IA$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 251
    .line 252
    return-object v1

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
