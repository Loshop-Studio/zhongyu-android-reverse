.class public Ls6/d$a;
.super Lcom/luck/picture/lib/thread/PictureThreadUtils$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls6/d;->i(JIILq6/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:J

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:Lq6/g;

.field public final synthetic l:Ls6/d;


# direct methods
.method public constructor <init>(Ls6/d;JIILq6/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls6/d$a;->l:Ls6/d;

    .line 2
    .line 3
    iput-wide p2, p0, Ls6/d$a;->h:J

    .line 4
    .line 5
    iput p4, p0, Ls6/d$a;->i:I

    .line 6
    .line 7
    iput p5, p0, Ls6/d$a;->j:I

    .line 8
    .line 9
    iput-object p6, p0, Ls6/d$a;->k:Lq6/g;

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$d;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic d()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls6/d$a;->k()Lo6/a;

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
    check-cast p1, Lo6/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ls6/d$a;->l(Lo6/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k()Lo6/a;
    .locals 11

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_0
    invoke-static {}, La7/j;->f()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ls6/d$a;->l:Ls6/d;

    .line 10
    .line 11
    iget-wide v3, p0, Ls6/d$a;->h:J

    .line 12
    .line 13
    invoke-static {v0, v3, v4}, Ls6/d;->j(Ls6/d;J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v3, p0, Ls6/d$a;->l:Ls6/d;

    .line 18
    .line 19
    iget-wide v4, p0, Ls6/d$a;->h:J

    .line 20
    .line 21
    invoke-static {v3, v4, v5}, Ls6/d;->k(Ls6/d;J)[Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget v4, p0, Ls6/d$a;->i:I

    .line 26
    .line 27
    iget v5, p0, Ls6/d$a;->j:I

    .line 28
    .line 29
    sub-int/2addr v5, v2

    .line 30
    mul-int/2addr v5, v4

    .line 31
    iget-object v6, p0, Ls6/d$a;->l:Ls6/d;

    .line 32
    .line 33
    invoke-virtual {v6}, Ls6/d;->H()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-static {v0, v3, v4, v5, v6}, La7/h;->a(Ljava/lang/String;[Ljava/lang/String;IILjava/lang/String;)Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v3, p0, Ls6/d$a;->l:Ls6/d;

    .line 42
    .line 43
    invoke-virtual {v3}, Ls6/a;->b()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    sget-object v4, Ls6/a;->d:Landroid/net/Uri;

    .line 52
    .line 53
    sget-object v5, Ls6/a;->e:[Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v3, v4, v5, v0, v1}, Ls6/c;->a(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :goto_0
    move-object v1, v0

    .line 60
    goto :goto_3

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto/16 :goto_7

    .line 63
    .line 64
    :catch_0
    move-exception v0

    .line 65
    goto/16 :goto_6

    .line 66
    .line 67
    :cond_0
    iget v0, p0, Ls6/d$a;->j:I

    .line 68
    .line 69
    const/4 v3, -0x1

    .line 70
    if-ne v0, v3, :cond_1

    .line 71
    .line 72
    iget-object v0, p0, Ls6/d$a;->l:Ls6/d;

    .line 73
    .line 74
    invoke-virtual {v0}, Ls6/d;->H()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :goto_1
    move-object v8, v0

    .line 79
    goto :goto_2

    .line 80
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    iget-object v3, p0, Ls6/d$a;->l:Ls6/d;

    .line 86
    .line 87
    invoke-virtual {v3}, Ls6/d;->H()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v3, " limit "

    .line 95
    .line 96
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    iget v3, p0, Ls6/d$a;->i:I

    .line 100
    .line 101
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v3, " offset "

    .line 105
    .line 106
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget v3, p0, Ls6/d$a;->j:I

    .line 110
    .line 111
    sub-int/2addr v3, v2

    .line 112
    iget v4, p0, Ls6/d$a;->i:I

    .line 113
    .line 114
    mul-int/2addr v3, v4

    .line 115
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    goto :goto_1

    .line 123
    :goto_2
    iget-object v0, p0, Ls6/d$a;->l:Ls6/d;

    .line 124
    .line 125
    invoke-virtual {v0}, Ls6/a;->b()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    sget-object v4, Ls6/a;->d:Landroid/net/Uri;

    .line 134
    .line 135
    sget-object v5, Ls6/a;->e:[Ljava/lang/String;

    .line 136
    .line 137
    iget-object v0, p0, Ls6/d$a;->l:Ls6/d;

    .line 138
    .line 139
    iget-wide v6, p0, Ls6/d$a;->h:J

    .line 140
    .line 141
    invoke-static {v0, v6, v7}, Ls6/d;->j(Ls6/d;J)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    iget-object v0, p0, Ls6/d$a;->l:Ls6/d;

    .line 146
    .line 147
    iget-wide v9, p0, Ls6/d$a;->h:J

    .line 148
    .line 149
    invoke-static {v0, v9, v10}, Ls6/d;->k(Ls6/d;J)[Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    goto :goto_0

    .line 158
    :goto_3
    if-eqz v1, :cond_8

    .line 159
    .line 160
    new-instance v0, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    const/4 v4, 0x0

    .line 170
    if-lez v3, :cond_4

    .line 171
    .line 172
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 173
    .line 174
    .line 175
    :cond_2
    iget-object v3, p0, Ls6/d$a;->l:Ls6/d;

    .line 176
    .line 177
    invoke-virtual {v3, v1, v4}, Ls6/d;->J(Landroid/database/Cursor;Z)Lcom/luck/picture/lib/entity/LocalMedia;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    if-nez v3, :cond_3

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_3
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    :goto_4
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-nez v3, :cond_2

    .line 192
    .line 193
    :cond_4
    iget-wide v5, p0, Ls6/d$a;->h:J

    .line 194
    .line 195
    const-wide/16 v7, -0x1

    .line 196
    .line 197
    cmp-long v3, v5, v7

    .line 198
    .line 199
    if-nez v3, :cond_5

    .line 200
    .line 201
    iget v3, p0, Ls6/d$a;->j:I

    .line 202
    .line 203
    if-ne v3, v2, :cond_5

    .line 204
    .line 205
    iget-object v3, p0, Ls6/d$a;->l:Ls6/d;

    .line 206
    .line 207
    invoke-virtual {v3}, Ls6/a;->b()Landroid/content/Context;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    iget-object v5, p0, Ls6/d$a;->l:Ls6/d;

    .line 212
    .line 213
    invoke-virtual {v5}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    iget-object v5, v5, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Z:Ljava/lang/String;

    .line 218
    .line 219
    invoke-static {v3, v5}, Ls6/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    if-eqz v3, :cond_5

    .line 224
    .line 225
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 226
    .line 227
    .line 228
    invoke-static {v0}, La7/m;->d(Ljava/util/List;)V

    .line 229
    .line 230
    .line 231
    :cond_5
    new-instance v3, Lo6/a;

    .line 232
    .line 233
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    if-lez v5, :cond_6

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_6
    move v2, v4

    .line 241
    :goto_5
    invoke-direct {v3, v2, v0}, Lo6/a;-><init>(ZLjava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 242
    .line 243
    .line 244
    invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-nez v0, :cond_7

    .line 249
    .line 250
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 251
    .line 252
    .line 253
    :cond_7
    return-object v3

    .line 254
    :cond_8
    if-eqz v1, :cond_9

    .line 255
    .line 256
    invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-nez v0, :cond_9

    .line 261
    .line 262
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 263
    .line 264
    .line 265
    :cond_9
    new-instance v0, Lo6/a;

    .line 266
    .line 267
    invoke-direct {v0}, Lo6/a;-><init>()V

    .line 268
    .line 269
    .line 270
    return-object v0

    .line 271
    :goto_6
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 272
    .line 273
    .line 274
    sget-object v2, Ls6/a;->c:Ljava/lang/String;

    .line 275
    .line 276
    new-instance v3, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    const-string v4, "loadMedia Page Data Error: "

    .line 282
    .line 283
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 298
    .line 299
    .line 300
    new-instance v0, Lo6/a;

    .line 301
    .line 302
    invoke-direct {v0}, Lo6/a;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 303
    .line 304
    .line 305
    if-eqz v1, :cond_a

    .line 306
    .line 307
    invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    if-nez v2, :cond_a

    .line 312
    .line 313
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 314
    .line 315
    .line 316
    :cond_a
    return-object v0

    .line 317
    :goto_7
    if-eqz v1, :cond_b

    .line 318
    .line 319
    invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    if-nez v2, :cond_b

    .line 324
    .line 325
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 326
    .line 327
    .line 328
    :cond_b
    throw v0
.end method

.method public l(Lo6/a;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->d(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ls6/d$a;->k:Lq6/g;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v1, p1, Lo6/a;->b:Ljava/util/ArrayList;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    :goto_0
    iget-boolean p1, p1, Lo6/a;->a:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1, p1}, Lq6/g;->a(Ljava/util/ArrayList;Z)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method
