.class public final Ly4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Ly4/c;->a:F

    .line 5
    .line 6
    iput-object p1, p0, Ly4/c;->b:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "$this$Layout"

    .line 8
    .line 9
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "measurables"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget v3, v0, Ly4/c;->a:F

    .line 18
    .line 19
    invoke-interface {v1, v3}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    sget v4, Ly4/e;->b:F

    .line 28
    .line 29
    invoke-interface {v1, v4}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 30
    .line 31
    .line 32
    move-result v12

    .line 33
    new-instance v4, Ljava/util/ArrayList;

    .line 34
    .line 35
    const/16 v5, 0xa

    .line 36
    .line 37
    invoke-static {v2, v5}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_0

    .line 53
    .line 54
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, Landroidx/compose/ui/layout/Measurable;

    .line 59
    .line 60
    invoke-interface {v6, v12}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    const/4 v6, 0x0

    .line 77
    move v8, v6

    .line 78
    move v9, v8

    .line 79
    move v10, v9

    .line 80
    :goto_1
    if-ge v8, v5, :cond_3

    .line 81
    .line 82
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    check-cast v11, Ljava/lang/Number;

    .line 87
    .line 88
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    if-lez v8, :cond_1

    .line 93
    .line 94
    move v13, v3

    .line 95
    goto :goto_2

    .line 96
    :cond_1
    move v13, v6

    .line 97
    :goto_2
    add-int/2addr v11, v13

    .line 98
    add-int/2addr v11, v9

    .line 99
    if-le v11, v7, :cond_2

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_2
    add-int/lit8 v10, v8, 0x1

    .line 103
    .line 104
    move v8, v10

    .line 105
    move v9, v11

    .line 106
    goto :goto_1

    .line 107
    :cond_3
    :goto_3
    invoke-static {}, Lkotlin/collections/u;->q()Lkotlin/collections/builders/ListBuilder;

    .line 108
    .line 109
    .line 110
    move-result-object v13

    .line 111
    if-nez v10, :cond_4

    .line 112
    .line 113
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .line 118
    .line 119
    const/16 v10, 0xc

    .line 120
    .line 121
    const/4 v11, 0x0

    .line 122
    const/4 v6, 0x0

    .line 123
    const/4 v8, 0x0

    .line 124
    const/4 v9, 0x0

    .line 125
    move-wide/from16 v4, p3

    .line 126
    .line 127
    invoke-static/range {v4 .. v11}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 128
    .line 129
    .line 130
    move-result-wide v4

    .line 131
    invoke-interface {v2, v4, v5}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-interface {v13, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move v11, v7

    .line 139
    goto :goto_6

    .line 140
    :cond_4
    move v5, v6

    .line 141
    :goto_4
    if-ge v5, v10, :cond_5

    .line 142
    .line 143
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    check-cast v8, Landroidx/compose/ui/layout/Measurable;

    .line 148
    .line 149
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v11

    .line 153
    check-cast v11, Ljava/lang/Number;

    .line 154
    .line 155
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result v17

    .line 159
    const/16 v20, 0xc

    .line 160
    .line 161
    const/16 v21, 0x0

    .line 162
    .line 163
    const/16 v16, 0x0

    .line 164
    .line 165
    const/16 v18, 0x0

    .line 166
    .line 167
    const/16 v19, 0x0

    .line 168
    .line 169
    move-wide/from16 v14, p3

    .line 170
    .line 171
    move v11, v7

    .line 172
    invoke-static/range {v14 .. v21}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 173
    .line 174
    .line 175
    move-result-wide v6

    .line 176
    invoke-interface {v8, v6, v7}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    invoke-interface {v13, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    add-int/lit8 v5, v5, 0x1

    .line 184
    .line 185
    move v7, v11

    .line 186
    const/4 v6, 0x0

    .line 187
    goto :goto_4

    .line 188
    :cond_5
    move v11, v7

    .line 189
    iget-object v4, v0, Ly4/c;->b:Ljava/util/List;

    .line 190
    .line 191
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-ge v10, v4, :cond_7

    .line 196
    .line 197
    sub-int v7, v11, v9

    .line 198
    .line 199
    sub-int/2addr v7, v3

    .line 200
    if-gez v7, :cond_6

    .line 201
    .line 202
    const/16 v17, 0x0

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_6
    move/from16 v17, v7

    .line 206
    .line 207
    :goto_5
    if-lez v17, :cond_7

    .line 208
    .line 209
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .line 214
    .line 215
    const/16 v20, 0xc

    .line 216
    .line 217
    const/16 v21, 0x0

    .line 218
    .line 219
    const/16 v16, 0x0

    .line 220
    .line 221
    const/16 v18, 0x0

    .line 222
    .line 223
    const/16 v19, 0x0

    .line 224
    .line 225
    move-wide/from16 v14, p3

    .line 226
    .line 227
    invoke-static/range {v14 .. v21}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 228
    .line 229
    .line 230
    move-result-wide v4

    .line 231
    invoke-interface {v2, v4, v5}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-interface {v13, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    :cond_7
    :goto_6
    invoke-virtual {v13}, Lkotlin/collections/builders/ListBuilder;->build()Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    new-instance v5, Ly4/b;

    .line 243
    .line 244
    invoke-direct {v5, v2, v3, v12}, Ly4/b;-><init>(Ljava/util/List;II)V

    .line 245
    .line 246
    .line 247
    const/4 v6, 0x4

    .line 248
    const/4 v7, 0x0

    .line 249
    const/4 v4, 0x0

    .line 250
    move v2, v11

    .line 251
    move v3, v12

    .line 252
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    return-object v1
.end method
