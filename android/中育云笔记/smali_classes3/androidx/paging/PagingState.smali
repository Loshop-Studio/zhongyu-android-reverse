.class public final Landroidx/paging/PagingState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Key:",
        "Ljava/lang/Object;",
        "Value:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final anchorPosition:Ljava/lang/Integer;

.field private final config:Landroidx/paging/PagingConfig;

.field private final leadingPlaceholderCount:I

.field private final pages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/paging/PagingSource$LoadResult$Page<",
            "TKey;TValue;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/Integer;Landroidx/paging/PagingConfig;I)V
    .locals 1
    .param p4    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/paging/PagingSource$LoadResult$Page<",
            "TKey;TValue;>;>;",
            "Ljava/lang/Integer;",
            "Landroidx/paging/PagingConfig;",
            "I)V"
        }
    .end annotation

    .line 1
    const-string v0, "pages"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "config"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 15
    .line 16
    iput-object p2, p0, Landroidx/paging/PagingState;->anchorPosition:Ljava/lang/Integer;

    .line 17
    .line 18
    iput-object p3, p0, Landroidx/paging/PagingState;->config:Landroidx/paging/PagingConfig;

    .line 19
    .line 20
    iput p4, p0, Landroidx/paging/PagingState;->leadingPlaceholderCount:I

    .line 21
    .line 22
    return-void
.end method

.method public static final synthetic access$getLeadingPlaceholderCount$p(Landroidx/paging/PagingState;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/paging/PagingState;->leadingPlaceholderCount:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public final anchorPositionToPagedIndices$paging_common(ILhd/p;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lhd/p;",
            ")TT;"
        }
    .end annotation

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/paging/PagingState;->access$getLeadingPlaceholderCount$p(Landroidx/paging/PagingState;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    sub-int/2addr p1, v0

    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-virtual {p0}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Lrc/w;->p(Ljava/util/List;)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-ge v0, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, Lrc/w;->p(Ljava/util/List;)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-le p1, v1, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 51
    .line 52
    invoke-virtual {v1}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    sub-int/2addr p1, v1

    .line 61
    add-int/lit8 v0, v0, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-interface {p2, v0, p1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1
.end method

.method public final closestItemAroundPosition(ILhd/l;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lhd/l;",
            ")TValue;"
        }
    .end annotation

    .line 1
    const-string v0, "predicate"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Iterable;

    .line 9
    .line 10
    instance-of v1, v0, Ljava/util/Collection;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    move-object v1, v0

    .line 16
    check-cast v1, Ljava/util/Collection;

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    goto/16 :goto_9

    .line 25
    .line 26
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_14

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    invoke-static {p0}, Landroidx/paging/PagingState;->access$getLeadingPlaceholderCount$p(Landroidx/paging/PagingState;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    sub-int/2addr p1, v0

    .line 57
    const/4 v1, 0x0

    .line 58
    move v0, v1

    .line 59
    :goto_0
    invoke-virtual {p0}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-static {v3}, Lrc/w;->p(Ljava/util/List;)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-ge v0, v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 78
    .line 79
    invoke-virtual {v3}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-static {v3}, Lrc/w;->p(Ljava/util/List;)I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-le p1, v3, :cond_2

    .line 88
    .line 89
    invoke-virtual {p0}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 98
    .line 99
    invoke-virtual {v3}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    sub-int/2addr p1, v3

    .line 108
    add-int/lit8 v0, v0, 0x1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    iget-object v3, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 112
    .line 113
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    move v4, v1

    .line 118
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    const/4 v6, -0x1

    .line 123
    if-eqz v5, :cond_4

    .line 124
    .line 125
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    check-cast v5, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 130
    .line 131
    invoke-virtual {v5}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    check-cast v5, Ljava/util/Collection;

    .line 136
    .line 137
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-nez v5, :cond_3

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_4
    move v4, v6

    .line 148
    :goto_2
    iget-object v3, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 149
    .line 150
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    invoke-interface {v3, v5}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    :cond_5
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    if-eqz v5, :cond_6

    .line 163
    .line 164
    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    check-cast v5, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 169
    .line 170
    invoke-virtual {v5}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    check-cast v5, Ljava/util/Collection;

    .line 175
    .line 176
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-nez v5, :cond_5

    .line 181
    .line 182
    invoke-interface {v3}, Ljava/util/ListIterator;->nextIndex()I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    goto :goto_3

    .line 187
    :cond_6
    move v3, v6

    .line 188
    :goto_3
    const/4 v5, 0x1

    .line 189
    if-gez p1, :cond_7

    .line 190
    .line 191
    iget-object p1, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 192
    .line 193
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    check-cast p1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 198
    .line 199
    move v9, v1

    .line 200
    move-object v3, v2

    .line 201
    move v7, v4

    .line 202
    move v8, v5

    .line 203
    move v0, v6

    .line 204
    move-object v4, p1

    .line 205
    move v6, v9

    .line 206
    move p1, v0

    .line 207
    goto :goto_4

    .line 208
    :cond_7
    iget-object v4, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 209
    .line 210
    invoke-static {v4}, Lrc/w;->p(Ljava/util/List;)I

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    if-ne v0, v4, :cond_8

    .line 215
    .line 216
    iget-object v4, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 217
    .line 218
    invoke-static {v4}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    check-cast v4, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 223
    .line 224
    invoke-virtual {v4}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    invoke-static {v4}, Lrc/w;->p(Ljava/util/List;)I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-le p1, v4, :cond_8

    .line 233
    .line 234
    iget-object p1, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 235
    .line 236
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    check-cast p1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 241
    .line 242
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-static {v0}, Lrc/w;->p(Ljava/util/List;)I

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    move v4, v3

    .line 251
    move-object v3, p1

    .line 252
    move p1, v0

    .line 253
    move v0, v4

    .line 254
    move v8, v1

    .line 255
    move-object v4, v2

    .line 256
    move v9, v5

    .line 257
    move v7, v6

    .line 258
    goto :goto_4

    .line 259
    :cond_8
    iget-object v3, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 260
    .line 261
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    check-cast v3, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 266
    .line 267
    iget-object v4, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 268
    .line 269
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    check-cast v4, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 274
    .line 275
    move v6, p1

    .line 276
    move v7, v0

    .line 277
    move v8, v1

    .line 278
    move v9, v8

    .line 279
    :cond_9
    :goto_4
    if-eqz v8, :cond_b

    .line 280
    .line 281
    if-nez v9, :cond_a

    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_a
    return-object v2

    .line 285
    :cond_b
    :goto_5
    if-nez v8, :cond_f

    .line 286
    .line 287
    :goto_6
    if-gez p1, :cond_c

    .line 288
    .line 289
    add-int/lit8 v0, v0, -0x1

    .line 290
    .line 291
    if-ltz v0, :cond_c

    .line 292
    .line 293
    iget-object p1, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 294
    .line 295
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    move-object v3, p1

    .line 300
    check-cast v3, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 301
    .line 302
    invoke-virtual {v3}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-static {p1}, Lrc/w;->p(Ljava/util/List;)I

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    goto :goto_6

    .line 311
    :cond_c
    if-gez v0, :cond_d

    .line 312
    .line 313
    move v8, v5

    .line 314
    goto :goto_7

    .line 315
    :cond_d
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object v10

    .line 322
    invoke-interface {v10, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v10

    .line 326
    invoke-interface {p2, v10}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v11

    .line 330
    check-cast v11, Ljava/lang/Boolean;

    .line 331
    .line 332
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 333
    .line 334
    .line 335
    move-result v11

    .line 336
    if-eqz v11, :cond_e

    .line 337
    .line 338
    return-object v10

    .line 339
    :cond_e
    add-int/lit8 p1, p1, -0x1

    .line 340
    .line 341
    :cond_f
    :goto_7
    if-nez v9, :cond_9

    .line 342
    .line 343
    :goto_8
    invoke-static {v4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v4}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 347
    .line 348
    .line 349
    move-result-object v10

    .line 350
    invoke-static {v10}, Lrc/w;->p(Ljava/util/List;)I

    .line 351
    .line 352
    .line 353
    move-result v10

    .line 354
    if-le v6, v10, :cond_11

    .line 355
    .line 356
    add-int/lit8 v7, v7, 0x1

    .line 357
    .line 358
    iget-object v10, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 359
    .line 360
    invoke-static {v10}, Lrc/w;->p(Ljava/util/List;)I

    .line 361
    .line 362
    .line 363
    move-result v10

    .line 364
    if-gt v7, v10, :cond_11

    .line 365
    .line 366
    iget-object v4, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 367
    .line 368
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    check-cast v4, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 373
    .line 374
    invoke-virtual {v4}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 375
    .line 376
    .line 377
    move-result-object v6

    .line 378
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 379
    .line 380
    .line 381
    move-result v6

    .line 382
    if-eqz v6, :cond_10

    .line 383
    .line 384
    const v6, 0x7fffffff

    .line 385
    .line 386
    .line 387
    goto :goto_8

    .line 388
    :cond_10
    move v6, v1

    .line 389
    goto :goto_8

    .line 390
    :cond_11
    iget-object v10, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 391
    .line 392
    invoke-static {v10}, Lrc/w;->p(Ljava/util/List;)I

    .line 393
    .line 394
    .line 395
    move-result v10

    .line 396
    if-le v7, v10, :cond_12

    .line 397
    .line 398
    move v9, v5

    .line 399
    goto :goto_4

    .line 400
    :cond_12
    invoke-virtual {v4}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 401
    .line 402
    .line 403
    move-result-object v10

    .line 404
    invoke-interface {v10, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v10

    .line 408
    invoke-interface {p2, v10}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v11

    .line 412
    check-cast v11, Ljava/lang/Boolean;

    .line 413
    .line 414
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 415
    .line 416
    .line 417
    move-result v11

    .line 418
    if-eqz v11, :cond_13

    .line 419
    .line 420
    return-object v10

    .line 421
    :cond_13
    add-int/lit8 v6, v6, 0x1

    .line 422
    .line 423
    goto/16 :goto_4

    .line 424
    .line 425
    :cond_14
    :goto_9
    return-object v2
.end method

.method public final closestItemToPosition(I)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TValue;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    instance-of v1, v0, Ljava/util/Collection;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Ljava/util/Collection;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto/16 :goto_1

    .line 19
    .line 20
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_9

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    invoke-static {p0}, Landroidx/paging/PagingState;->access$getLeadingPlaceholderCount$p(Landroidx/paging/PagingState;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    sub-int/2addr p1, v0

    .line 51
    const/4 v0, 0x0

    .line 52
    :goto_0
    invoke-virtual {p0}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1}, Lrc/w;->p(Ljava/util/List;)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-ge v0, v1, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 71
    .line 72
    invoke-virtual {v1}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v1}, Lrc/w;->p(Ljava/util/List;)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-le p1, v1, :cond_2

    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 91
    .line 92
    invoke-virtual {v1}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    sub-int/2addr p1, v1

    .line 101
    add-int/lit8 v0, v0, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    iget-object v1, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 105
    .line 106
    check-cast v1, Ljava/lang/Iterable;

    .line 107
    .line 108
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_8

    .line 117
    .line 118
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    check-cast v3, Ljava/util/Collection;

    .line 129
    .line 130
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-nez v3, :cond_3

    .line 135
    .line 136
    iget-object v1, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 137
    .line 138
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    invoke-interface {v1, v3}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    :cond_4
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_7

    .line 151
    .line 152
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    check-cast v3, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 157
    .line 158
    invoke-virtual {v3}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    check-cast v4, Ljava/util/Collection;

    .line 163
    .line 164
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-nez v4, :cond_4

    .line 169
    .line 170
    if-gez p1, :cond_5

    .line 171
    .line 172
    invoke-virtual {v2}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-static {p1}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    return-object p1

    .line 181
    :cond_5
    iget-object v1, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 182
    .line 183
    invoke-static {v1}, Lrc/w;->p(Ljava/util/List;)I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-ne v0, v1, :cond_6

    .line 188
    .line 189
    iget-object v1, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 190
    .line 191
    invoke-static {v1}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    check-cast v1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 196
    .line 197
    invoke-virtual {v1}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-static {v1}, Lrc/w;->p(Ljava/util/List;)I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    if-le p1, v1, :cond_6

    .line 206
    .line 207
    invoke-virtual {v3}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-static {p1}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    return-object p1

    .line 216
    :cond_6
    iget-object v1, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 217
    .line 218
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    check-cast v0, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 223
    .line 224
    invoke-virtual {v0}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    return-object p1

    .line 233
    :cond_7
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 234
    .line 235
    const-string v0, "List contains no element matching the predicate."

    .line 236
    .line 237
    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw p1

    .line 241
    :cond_8
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 242
    .line 243
    const-string v0, "Collection contains no element matching the predicate."

    .line 244
    .line 245
    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw p1

    .line 249
    :cond_9
    :goto_1
    const/4 p1, 0x0

    .line 250
    return-object p1
.end method

.method public final closestPageToPosition(I)Landroidx/paging/PagingSource$LoadResult$Page;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Landroidx/paging/PagingSource$LoadResult$Page<",
            "TKey;TValue;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    instance-of v1, v0, Ljava/util/Collection;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Ljava/util/Collection;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_4

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 34
    .line 35
    invoke-virtual {v1}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    invoke-static {p0}, Landroidx/paging/PagingState;->access$getLeadingPlaceholderCount$p(Landroidx/paging/PagingState;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    sub-int/2addr p1, v0

    .line 50
    const/4 v0, 0x0

    .line 51
    :goto_0
    invoke-virtual {p0}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1}, Lrc/w;->p(Ljava/util/List;)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-ge v0, v1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 70
    .line 71
    invoke-virtual {v1}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {v1}, Lrc/w;->p(Ljava/util/List;)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-le p1, v1, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 90
    .line 91
    invoke-virtual {v1}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    sub-int/2addr p1, v1

    .line 100
    add-int/lit8 v0, v0, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    if-gez p1, :cond_3

    .line 104
    .line 105
    iget-object p1, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 106
    .line 107
    invoke-static {p1}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 112
    .line 113
    return-object p1

    .line 114
    :cond_3
    iget-object p1, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    check-cast p1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 121
    .line 122
    return-object p1

    .line 123
    :cond_4
    :goto_1
    const/4 p1, 0x0

    .line 124
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Landroidx/paging/PagingState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 6
    .line 7
    check-cast p1, Landroidx/paging/PagingState;

    .line 8
    .line 9
    iget-object v1, p1, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/paging/PagingState;->anchorPosition:Ljava/lang/Integer;

    .line 18
    .line 19
    iget-object v1, p1, Landroidx/paging/PagingState;->anchorPosition:Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/paging/PagingState;->config:Landroidx/paging/PagingConfig;

    .line 28
    .line 29
    iget-object v1, p1, Landroidx/paging/PagingState;->config:Landroidx/paging/PagingConfig;

    .line 30
    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget v0, p0, Landroidx/paging/PagingState;->leadingPlaceholderCount:I

    .line 38
    .line 39
    iget p1, p1, Landroidx/paging/PagingState;->leadingPlaceholderCount:I

    .line 40
    .line 41
    if-ne v0, p1, :cond_0

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    return p1

    .line 45
    :cond_0
    const/4 p1, 0x0

    .line 46
    return p1
.end method

.method public final firstItemOrNull()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TValue;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v3, v1

    .line 21
    check-cast v3, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 22
    .line 23
    invoke-virtual {v3}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Ljava/util/Collection;

    .line 28
    .line 29
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v1, v2

    .line 37
    :goto_0
    check-cast v1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {v1}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-static {v0}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0

    .line 52
    :cond_2
    return-object v2
.end method

.method public final getAnchorPosition()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingState;->anchorPosition:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getConfig()Landroidx/paging/PagingConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingState;->config:Landroidx/paging/PagingConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/paging/PagingSource$LoadResult$Page<",
            "TKey;TValue;>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/paging/PagingState;->anchorPosition:Ljava/lang/Integer;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    add-int/2addr v0, v1

    .line 18
    iget-object v1, p0, Landroidx/paging/PagingState;->config:Landroidx/paging/PagingConfig;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    iget v1, p0, Landroidx/paging/PagingState;->leadingPlaceholderCount:I

    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/2addr v0, v1

    .line 32
    return v0
.end method

.method public final isEmpty()Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    instance-of v1, v0, Ljava/util/Collection;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move-object v1, v0

    .line 11
    check-cast v1, Ljava/util/Collection;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    return v2

    .line 20
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    return v0

    .line 48
    :cond_2
    return v2
.end method

.method public final lastItemOrNull()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TValue;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    move-object v3, v1

    .line 23
    check-cast v3, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 24
    .line 25
    invoke-virtual {v3}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/util/Collection;

    .line 30
    .line 31
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v1, v2

    .line 39
    :goto_0
    check-cast v1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {v1}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-static {v0}, Lrc/g0;->z0(Ljava/util/List;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0

    .line 54
    :cond_2
    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "PagingState(pages="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroidx/paging/PagingState;->pages:Ljava/util/List;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", anchorPosition="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Landroidx/paging/PagingState;->anchorPosition:Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", config="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Landroidx/paging/PagingState;->config:Landroidx/paging/PagingConfig;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", leadingPlaceholderCount="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget v1, p0, Landroidx/paging/PagingState;->leadingPlaceholderCount:I

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const/16 v1, 0x29

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
.end method
