.class final Landroidx/compose/material3/AppBarKt$TopAppBarLayout$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/AppBarKt;->TopAppBarLayout-kXwM9vE(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/ScrolledOffset;JJJLhd/p;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IZLhd/p;Lhd/p;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $scrolledOffset:Landroidx/compose/material3/ScrolledOffset;

.field final synthetic $titleBottomPadding:I

.field final synthetic $titleHorizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

.field final synthetic $titleVerticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;


# direct methods
.method public constructor <init>(Landroidx/compose/material3/ScrolledOffset;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;I)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material3/AppBarKt$TopAppBarLayout$2$1;->$scrolledOffset:Landroidx/compose/material3/ScrolledOffset;

    iput-object p2, p0, Landroidx/compose/material3/AppBarKt$TopAppBarLayout$2$1;->$titleHorizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    iput-object p3, p0, Landroidx/compose/material3/AppBarKt$TopAppBarLayout$2$1;->$titleVerticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    iput p4, p0, Landroidx/compose/material3/AppBarKt$TopAppBarLayout$2$1;->$titleBottomPadding:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;J)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    const-string v5, "Collection contains no element matching the predicate."

    .line 12
    .line 13
    if-ge v4, v2, :cond_9

    .line 14
    .line 15
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    check-cast v6, Landroidx/compose/ui/layout/Measurable;

    .line 20
    .line 21
    invoke-static {v6}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    const-string v8, "navigationIcon"

    .line 26
    .line 27
    invoke-static {v7, v8}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-eqz v7, :cond_8

    .line 32
    .line 33
    const/16 v14, 0xe

    .line 34
    .line 35
    const/4 v15, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    const/4 v12, 0x0

    .line 39
    const/4 v13, 0x0

    .line 40
    move-wide/from16 v8, p3

    .line 41
    .line 42
    invoke-static/range {v8 .. v15}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v10

    .line 46
    invoke-interface {v6, v10, v11}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    move v6, v3

    .line 55
    :goto_1
    if-ge v6, v4, :cond_7

    .line 56
    .line 57
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    check-cast v7, Landroidx/compose/ui/layout/Measurable;

    .line 62
    .line 63
    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    const-string v9, "actionIcons"

    .line 68
    .line 69
    invoke-static {v8, v9}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-eqz v8, :cond_6

    .line 74
    .line 75
    const/16 v18, 0xe

    .line 76
    .line 77
    const/16 v19, 0x0

    .line 78
    .line 79
    const/4 v14, 0x0

    .line 80
    const/4 v15, 0x0

    .line 81
    const/16 v16, 0x0

    .line 82
    .line 83
    const/16 v17, 0x0

    .line 84
    .line 85
    move-wide/from16 v12, p3

    .line 86
    .line 87
    invoke-static/range {v12 .. v19}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v8

    .line 91
    invoke-interface {v7, v8, v9}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    const v7, 0x7fffffff

    .line 100
    .line 101
    .line 102
    if-ne v6, v7, :cond_0

    .line 103
    .line 104
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    :goto_2
    move v15, v6

    .line 109
    goto :goto_3

    .line 110
    :cond_0
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    invoke-virtual {v2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    sub-int/2addr v6, v8

    .line 119
    invoke-virtual {v4}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    sub-int/2addr v6, v8

    .line 124
    invoke-static {v6, v3}, Lnd/o;->e(II)I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    goto :goto_2

    .line 129
    :goto_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    move v8, v3

    .line 134
    :goto_4
    if-ge v8, v6, :cond_5

    .line 135
    .line 136
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    check-cast v9, Landroidx/compose/ui/layout/Measurable;

    .line 141
    .line 142
    invoke-static {v9}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    const-string/jumbo v11, "title"

    .line 147
    .line 148
    .line 149
    invoke-static {v10, v11}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    if-eqz v10, :cond_4

    .line 154
    .line 155
    const/16 v18, 0xc

    .line 156
    .line 157
    const/16 v19, 0x0

    .line 158
    .line 159
    const/4 v14, 0x0

    .line 160
    const/16 v16, 0x0

    .line 161
    .line 162
    const/16 v17, 0x0

    .line 163
    .line 164
    move-wide/from16 v12, p3

    .line 165
    .line 166
    invoke-static/range {v12 .. v19}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 167
    .line 168
    .line 169
    move-result-wide v5

    .line 170
    invoke-interface {v9, v5, v6}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 171
    .line 172
    .line 173
    move-result-object v15

    .line 174
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getLastBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-interface {v15, v1}, Landroidx/compose/ui/layout/Measured;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    const/high16 v5, -0x80000000

    .line 183
    .line 184
    if-eq v1, v5, :cond_1

    .line 185
    .line 186
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getLastBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-interface {v15, v1}, Landroidx/compose/ui/layout/Measured;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    move/from16 v23, v1

    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_1
    move/from16 v23, v3

    .line 198
    .line 199
    :goto_5
    iget-object v1, v0, Landroidx/compose/material3/AppBarKt$TopAppBarLayout$2$1;->$scrolledOffset:Landroidx/compose/material3/ScrolledOffset;

    .line 200
    .line 201
    invoke-interface {v1}, Landroidx/compose/material3/ScrolledOffset;->offset()F

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    if-eqz v5, :cond_2

    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_2
    invoke-static {v1}, Ljd/c;->d(F)I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    :goto_6
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-ne v1, v7, :cond_3

    .line 221
    .line 222
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    :goto_7
    move v14, v1

    .line 227
    goto :goto_8

    .line 228
    :cond_3
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    add-int/2addr v1, v3

    .line 233
    goto :goto_7

    .line 234
    :goto_8
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    new-instance v12, Landroidx/compose/material3/AppBarKt$TopAppBarLayout$2$1$1;

    .line 239
    .line 240
    iget-object v1, v0, Landroidx/compose/material3/AppBarKt$TopAppBarLayout$2$1;->$titleHorizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 241
    .line 242
    iget-object v3, v0, Landroidx/compose/material3/AppBarKt$TopAppBarLayout$2$1;->$titleVerticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 243
    .line 244
    iget v5, v0, Landroidx/compose/material3/AppBarKt$TopAppBarLayout$2$1;->$titleBottomPadding:I

    .line 245
    .line 246
    move-object/from16 v20, p1

    .line 247
    .line 248
    move-wide/from16 v17, p3

    .line 249
    .line 250
    move-object/from16 v16, v1

    .line 251
    .line 252
    move-object v13, v2

    .line 253
    move-object/from16 v21, v3

    .line 254
    .line 255
    move-object/from16 v19, v4

    .line 256
    .line 257
    move/from16 v22, v5

    .line 258
    .line 259
    invoke-direct/range {v12 .. v23}, Landroidx/compose/material3/AppBarKt$TopAppBarLayout$2$1$1;-><init>(Landroidx/compose/ui/layout/Placeable;ILandroidx/compose/ui/layout/Placeable;Landroidx/compose/foundation/layout/Arrangement$Horizontal;JLandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/Arrangement$Vertical;II)V

    .line 260
    .line 261
    .line 262
    const/4 v10, 0x4

    .line 263
    const/4 v11, 0x0

    .line 264
    const/4 v8, 0x0

    .line 265
    move-object/from16 v5, p1

    .line 266
    .line 267
    move-object v9, v12

    .line 268
    move v7, v14

    .line 269
    invoke-static/range {v5 .. v11}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lhd/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    return-object v1

    .line 274
    :cond_4
    move-object v13, v2

    .line 275
    move-object/from16 v19, v4

    .line 276
    .line 277
    add-int/lit8 v8, v8, 0x1

    .line 278
    .line 279
    goto/16 :goto_4

    .line 280
    .line 281
    :cond_5
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 282
    .line 283
    invoke-direct {v1, v5}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    throw v1

    .line 287
    :cond_6
    move-object v13, v2

    .line 288
    add-int/lit8 v6, v6, 0x1

    .line 289
    .line 290
    goto/16 :goto_1

    .line 291
    .line 292
    :cond_7
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 293
    .line 294
    invoke-direct {v1, v5}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw v1

    .line 298
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 299
    .line 300
    goto/16 :goto_0

    .line 301
    .line 302
    :cond_9
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 303
    .line 304
    invoke-direct {v1, v5}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    throw v1
.end method
