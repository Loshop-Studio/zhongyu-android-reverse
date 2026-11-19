.class public abstract Lq4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/List;)Ljava/util/List;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_2

    .line 23
    .line 24
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Lcom/zykj/study/bean/course/CatalogBean;

    .line 29
    .line 30
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CatalogBean;->getSort()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-nez v4, :cond_1

    .line 35
    .line 36
    move v3, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    :goto_0
    move v3, v2

    .line 39
    :goto_1
    const/4 v4, 0x0

    .line 40
    if-eqz v3, :cond_4

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    new-instance v5, Lq4/a$a;

    .line 45
    .line 46
    invoke-direct {v5}, Lq4/a$a;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v5}, Li7/f0;->M0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    goto :goto_2

    .line 54
    :cond_3
    move-object v0, v4

    .line 55
    :cond_4
    :goto_2
    if-eqz v0, :cond_12

    .line 56
    .line 57
    new-instance v5, Ljava/util/ArrayList;

    .line 58
    .line 59
    const/16 v6, 0xa

    .line 60
    .line 61
    invoke-static {v0, v6}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    move v7, v2

    .line 73
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_10

    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    add-int/lit8 v9, v7, 0x1

    .line 84
    .line 85
    if-gez v7, :cond_5

    .line 86
    .line 87
    invoke-static {}, Li7/v;->w()V

    .line 88
    .line 89
    .line 90
    :cond_5
    move-object v10, v8

    .line 91
    check-cast v10, Lcom/zykj/study/bean/course/CatalogBean;

    .line 92
    .line 93
    invoke-virtual {v10}, Lcom/zykj/study/bean/course/CatalogBean;->getChildren()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    if-eqz v7, :cond_8

    .line 98
    .line 99
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-eqz v8, :cond_6

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_6
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    :cond_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    if-eqz v8, :cond_8

    .line 115
    .line 116
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    check-cast v8, Lcom/zykj/study/bean/course/CatalogBean;

    .line 121
    .line 122
    invoke-virtual {v8}, Lcom/zykj/study/bean/course/CatalogBean;->getSort()I

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    if-nez v8, :cond_7

    .line 127
    .line 128
    move v7, v1

    .line 129
    goto :goto_5

    .line 130
    :cond_8
    :goto_4
    move v7, v2

    .line 131
    :goto_5
    invoke-virtual {v10}, Lcom/zykj/study/bean/course/CatalogBean;->getChildren()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    if-eqz v7, :cond_a

    .line 136
    .line 137
    if-eqz v8, :cond_9

    .line 138
    .line 139
    new-instance v11, Lq4/a$c;

    .line 140
    .line 141
    invoke-direct {v11}, Lq4/a$c;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-static {v8, v11}, Li7/f0;->M0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    goto :goto_6

    .line 149
    :cond_9
    move-object v8, v4

    .line 150
    :cond_a
    :goto_6
    if-eqz v8, :cond_e

    .line 151
    .line 152
    new-instance v11, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-static {v8, v6}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    move v12, v2

    .line 166
    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v13

    .line 170
    if-eqz v13, :cond_d

    .line 171
    .line 172
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v13

    .line 176
    add-int/lit8 v14, v12, 0x1

    .line 177
    .line 178
    if-gez v12, :cond_b

    .line 179
    .line 180
    invoke-static {}, Li7/v;->w()V

    .line 181
    .line 182
    .line 183
    :cond_b
    move-object v15, v13

    .line 184
    check-cast v15, Lcom/zykj/study/bean/course/CatalogBean;

    .line 185
    .line 186
    invoke-virtual {v10}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 187
    .line 188
    .line 189
    move-result v25

    .line 190
    if-eqz v7, :cond_c

    .line 191
    .line 192
    move/from16 v22, v14

    .line 193
    .line 194
    goto :goto_8

    .line 195
    :cond_c
    invoke-virtual {v15}, Lcom/zykj/study/bean/course/CatalogBean;->getSort()I

    .line 196
    .line 197
    .line 198
    move-result v12

    .line 199
    move/from16 v22, v12

    .line 200
    .line 201
    :goto_8
    const/16 v27, 0x4bf

    .line 202
    .line 203
    const/16 v28, 0x0

    .line 204
    .line 205
    const/16 v16, 0x0

    .line 206
    .line 207
    const/16 v17, 0x0

    .line 208
    .line 209
    const/16 v18, 0x0

    .line 210
    .line 211
    const/16 v19, 0x0

    .line 212
    .line 213
    const/16 v20, 0x0

    .line 214
    .line 215
    const/16 v21, 0x0

    .line 216
    .line 217
    const/16 v23, 0x0

    .line 218
    .line 219
    const/16 v24, 0x1

    .line 220
    .line 221
    const/16 v26, 0x0

    .line 222
    .line 223
    invoke-static/range {v15 .. v28}, Lcom/zykj/study/bean/course/CatalogBean;->copy$default(Lcom/zykj/study/bean/course/CatalogBean;ILjava/lang/String;ZILjava/util/List;Ljava/util/List;ILcom/zykj/study/bean/course/StudyStatus;ZIIILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogBean;

    .line 224
    .line 225
    .line 226
    move-result-object v12

    .line 227
    invoke-interface {v11, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move v12, v14

    .line 231
    goto :goto_7

    .line 232
    :cond_d
    new-instance v7, Lq4/a$d;

    .line 233
    .line 234
    invoke-direct {v7}, Lq4/a$d;-><init>()V

    .line 235
    .line 236
    .line 237
    invoke-static {v11, v7}, Li7/f0;->M0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    if-eqz v7, :cond_e

    .line 242
    .line 243
    invoke-static {v7}, Li7/f0;->X0(Ljava/util/Collection;)Ljava/util/List;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    if-eqz v7, :cond_e

    .line 248
    .line 249
    :goto_9
    move-object v15, v7

    .line 250
    goto :goto_a

    .line 251
    :cond_e
    new-instance v7, Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 254
    .line 255
    .line 256
    goto :goto_9

    .line 257
    :goto_a
    invoke-static {v15}, Li7/f0;->X0(Ljava/util/Collection;)Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object v16

    .line 261
    if-eqz v3, :cond_f

    .line 262
    .line 263
    move/from16 v17, v9

    .line 264
    .line 265
    goto :goto_b

    .line 266
    :cond_f
    invoke-virtual {v10}, Lcom/zykj/study/bean/course/CatalogBean;->getSort()I

    .line 267
    .line 268
    .line 269
    move-result v7

    .line 270
    move/from16 v17, v7

    .line 271
    .line 272
    :goto_b
    const/16 v22, 0x48f

    .line 273
    .line 274
    const/16 v23, 0x0

    .line 275
    .line 276
    const/4 v11, 0x0

    .line 277
    const/4 v12, 0x0

    .line 278
    const/4 v13, 0x0

    .line 279
    const/4 v14, 0x0

    .line 280
    const/16 v18, 0x0

    .line 281
    .line 282
    const/16 v19, 0x0

    .line 283
    .line 284
    const/16 v20, 0x0

    .line 285
    .line 286
    const/16 v21, 0x0

    .line 287
    .line 288
    invoke-static/range {v10 .. v23}, Lcom/zykj/study/bean/course/CatalogBean;->copy$default(Lcom/zykj/study/bean/course/CatalogBean;ILjava/lang/String;ZILjava/util/List;Ljava/util/List;ILcom/zykj/study/bean/course/StudyStatus;ZIIILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogBean;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move v7, v9

    .line 296
    goto/16 :goto_3

    .line 297
    .line 298
    :cond_10
    new-instance v0, Lq4/a$b;

    .line 299
    .line 300
    invoke-direct {v0}, Lq4/a$b;-><init>()V

    .line 301
    .line 302
    .line 303
    invoke-static {v5, v0}, Li7/f0;->M0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    if-nez v0, :cond_11

    .line 308
    .line 309
    goto :goto_c

    .line 310
    :cond_11
    return-object v0

    .line 311
    :cond_12
    :goto_c
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    return-object v0
.end method
