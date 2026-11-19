.class public Ls6/b$a;
.super Lcom/luck/picture/lib/thread/PictureThreadUtils$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls6/b;->g(Lq6/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lq6/f;

.field public final synthetic i:Ls6/b;


# direct methods
.method public constructor <init>(Ls6/b;Lq6/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls6/b$a;->i:Ls6/b;

    .line 2
    .line 3
    iput-object p2, p0, Ls6/b$a;->h:Lq6/f;

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$d;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic d()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls6/b$a;->k()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic i(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ls6/b$a;->l(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k()Ljava/util/List;
    .locals 10

    .line 1
    new-instance v1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls6/b$a;->i:Ls6/b;

    .line 7
    .line 8
    invoke-virtual {v0}, Ls6/a;->b()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget-object v3, Ls6/a;->d:Landroid/net/Uri;

    .line 17
    .line 18
    sget-object v4, Ls6/a;->e:[Ljava/lang/String;

    .line 19
    .line 20
    iget-object v0, p0, Ls6/b$a;->i:Ls6/b;

    .line 21
    .line 22
    invoke-virtual {v0}, Ls6/b;->l()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    iget-object v0, p0, Ls6/b$a;->i:Ls6/b;

    .line 27
    .line 28
    invoke-virtual {v0}, Ls6/b;->m()[Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    iget-object v0, p0, Ls6/b$a;->i:Ls6/b;

    .line 33
    .line 34
    invoke-virtual {v0}, Ls6/b;->r()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-eqz v2, :cond_7

    .line 43
    .line 44
    :try_start_0
    new-instance v0, Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 45
    .line 46
    invoke-direct {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v3, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-lez v4, :cond_7

    .line 59
    .line 60
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 61
    .line 62
    .line 63
    :cond_0
    iget-object v4, p0, Ls6/b$a;->i:Ls6/b;

    .line 64
    .line 65
    const/4 v5, 0x0

    .line 66
    invoke-virtual {v4, v2, v5}, Ls6/b;->s(Landroid/database/Cursor;Z)Lcom/luck/picture/lib/entity/LocalMedia;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    if-nez v4, :cond_1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    iget-object v6, p0, Ls6/b$a;->i:Ls6/b;

    .line 74
    .line 75
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMedia;->w()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-static {v6, v7, v8, v9, v1}, Ls6/b;->j(Ls6/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMedia;->h()J

    .line 92
    .line 93
    .line 94
    move-result-wide v7

    .line 95
    invoke-virtual {v6, v7, v8}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->m(J)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v6}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c()Ljava/util/ArrayList;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    invoke-virtual {v6}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j()I

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    add-int/lit8 v7, v7, 0x1

    .line 110
    .line 111
    invoke-virtual {v6, v7}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->s(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMedia;->h()J

    .line 115
    .line 116
    .line 117
    move-result-wide v7

    .line 118
    invoke-virtual {v6, v7, v8}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->m(J)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    add-int/lit8 v4, v4, 0x1

    .line 129
    .line 130
    invoke-virtual {v0, v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->s(I)V

    .line 131
    .line 132
    .line 133
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-nez v4, :cond_0

    .line 138
    .line 139
    iget-object v4, p0, Ls6/b$a;->i:Ls6/b;

    .line 140
    .line 141
    invoke-virtual {v4}, Ls6/a;->b()Landroid/content/Context;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    iget-object v6, p0, Ls6/b$a;->i:Ls6/b;

    .line 146
    .line 147
    invoke-virtual {v6}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    iget-object v6, v6, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Z:Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v4, v6}, Ls6/e;->b(Landroid/content/Context;Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    if-eqz v4, :cond_3

    .line 158
    .line 159
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j()I

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j()I

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    add-int/2addr v6, v7

    .line 171
    invoke-virtual {v0, v6}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->s(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c()Ljava/util/ArrayList;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    invoke-virtual {v0, v6}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->o(Ljava/util/ArrayList;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c()Ljava/util/ArrayList;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    invoke-virtual {v3, v5, v6}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j()I

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    const/16 v6, 0x3c

    .line 193
    .line 194
    if-le v6, v4, :cond_3

    .line 195
    .line 196
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-le v4, v6, :cond_2

    .line 201
    .line 202
    invoke-virtual {v3, v5, v6}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-static {v4}, La7/m;->d(Ljava/util/List;)V

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :catchall_0
    move-exception v0

    .line 211
    goto/16 :goto_5

    .line 212
    .line 213
    :catch_0
    move-exception v0

    .line 214
    goto :goto_4

    .line 215
    :cond_2
    invoke-static {v3}, La7/m;->d(Ljava/util/List;)V

    .line 216
    .line 217
    .line 218
    :cond_3
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-lez v4, :cond_7

    .line 223
    .line 224
    invoke-static {v1}, La7/m;->c(Ljava/util/List;)V

    .line 225
    .line 226
    .line 227
    invoke-interface {v1, v5, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    check-cast v4, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 235
    .line 236
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    invoke-virtual {v0, v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->p(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    check-cast v4, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 248
    .line 249
    invoke-virtual {v4}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-virtual {v0, v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->q(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    iget-object v4, p0, Ls6/b$a;->i:Ls6/b;

    .line 257
    .line 258
    invoke-virtual {v4}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    iget-object v4, v4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->h0:Ljava/lang/String;

    .line 263
    .line 264
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    if-eqz v4, :cond_5

    .line 269
    .line 270
    iget-object v4, p0, Ls6/b$a;->i:Ls6/b;

    .line 271
    .line 272
    invoke-virtual {v4}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    iget v4, v4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 277
    .line 278
    invoke-static {}, Ll6/d;->b()I

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    if-ne v4, v5, :cond_4

    .line 283
    .line 284
    iget-object v4, p0, Ls6/b$a;->i:Ls6/b;

    .line 285
    .line 286
    invoke-virtual {v4}, Ls6/a;->b()Landroid/content/Context;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    sget v5, Lcom/luck/picture/lib/R$string;->ps_all_audio:I

    .line 291
    .line 292
    :goto_2
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    goto :goto_3

    .line 297
    :cond_4
    iget-object v4, p0, Ls6/b$a;->i:Ls6/b;

    .line 298
    .line 299
    invoke-virtual {v4}, Ls6/a;->b()Landroid/content/Context;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    sget v5, Lcom/luck/picture/lib/R$string;->ps_camera_roll:I

    .line 304
    .line 305
    goto :goto_2

    .line 306
    :cond_5
    iget-object v4, p0, Ls6/b$a;->i:Ls6/b;

    .line 307
    .line 308
    invoke-virtual {v4}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    iget-object v4, v4, Lcom/luck/picture/lib/config/PictureSelectionConfig;->h0:Ljava/lang/String;

    .line 313
    .line 314
    :goto_3
    invoke-virtual {v0, v4}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->r(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    const-wide/16 v4, -0x1

    .line 318
    .line 319
    invoke-virtual {v0, v4, v5}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->m(J)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0, v3}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->o(Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 323
    .line 324
    .line 325
    goto :goto_6

    .line 326
    :goto_4
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 327
    .line 328
    .line 329
    invoke-interface {v2}, Landroid/database/Cursor;->isClosed()Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-nez v0, :cond_8

    .line 334
    .line 335
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 336
    .line 337
    .line 338
    goto :goto_7

    .line 339
    :goto_5
    invoke-interface {v2}, Landroid/database/Cursor;->isClosed()Z

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    if-nez v1, :cond_6

    .line 344
    .line 345
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 346
    .line 347
    .line 348
    :cond_6
    throw v0

    .line 349
    :cond_7
    :goto_6
    if-eqz v2, :cond_8

    .line 350
    .line 351
    invoke-interface {v2}, Landroid/database/Cursor;->isClosed()Z

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    if-nez v0, :cond_8

    .line 356
    .line 357
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 358
    .line 359
    .line 360
    :cond_8
    :goto_7
    return-object v1
.end method

.method public l(Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->d(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ls6/b$a;->h:Lq6/f;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lq6/f;->a(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method
