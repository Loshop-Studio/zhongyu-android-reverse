.class public Lcom/liulishuo/okdownload/a;
.super Lr1/a;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/liulishuo/okdownload/a$b;,
        Lcom/liulishuo/okdownload/a$c;,
        Lcom/liulishuo/okdownload/a$a;
    }
.end annotation


# instance fields
.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Landroid/net/Uri;

.field public final e:Ljava/util/Map;

.field public f:Ls1/c;

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:Ljava/lang/Integer;

.field public final m:Ljava/lang/Boolean;

.field public final n:Z

.field public final o:Z

.field public final p:I

.field public volatile q:Lq1/a;

.field public final r:Z

.field public final s:Ljava/util/concurrent/atomic/AtomicLong;

.field public final t:Z

.field public final u:Lv1/g$a;

.field public final v:Ljava/io/File;

.field public final w:Ljava/io/File;

.field public x:Ljava/io/File;

.field public y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/net/Uri;IIIIIZILjava/util/Map;Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr1/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->c:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/liulishuo/okdownload/a;->d:Landroid/net/Uri;

    .line 7
    .line 8
    iput p3, p0, Lcom/liulishuo/okdownload/a;->g:I

    .line 9
    .line 10
    iput p4, p0, Lcom/liulishuo/okdownload/a;->h:I

    .line 11
    .line 12
    iput p5, p0, Lcom/liulishuo/okdownload/a;->i:I

    .line 13
    .line 14
    iput p6, p0, Lcom/liulishuo/okdownload/a;->j:I

    .line 15
    .line 16
    iput p7, p0, Lcom/liulishuo/okdownload/a;->k:I

    .line 17
    .line 18
    iput-boolean p8, p0, Lcom/liulishuo/okdownload/a;->o:Z

    .line 19
    .line 20
    iput p9, p0, Lcom/liulishuo/okdownload/a;->p:I

    .line 21
    .line 22
    iput-object p10, p0, Lcom/liulishuo/okdownload/a;->e:Ljava/util/Map;

    .line 23
    .line 24
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->s:Ljava/util/concurrent/atomic/AtomicLong;

    .line 30
    .line 31
    iput-boolean p12, p0, Lcom/liulishuo/okdownload/a;->n:Z

    .line 32
    .line 33
    iput-boolean p13, p0, Lcom/liulishuo/okdownload/a;->r:Z

    .line 34
    .line 35
    iput-object p15, p0, Lcom/liulishuo/okdownload/a;->l:Ljava/lang/Integer;

    .line 36
    .line 37
    move-object/from16 p1, p16

    .line 38
    .line 39
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->m:Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-static {p2}, Lr1/c;->t(Landroid/net/Uri;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_d

    .line 46
    .line 47
    new-instance p1, Ljava/io/File;

    .line 48
    .line 49
    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    if-eqz p14, :cond_7

    .line 57
    .line 58
    invoke-virtual {p14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_3

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eqz p2, :cond_1

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-nez p2, :cond_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 78
    .line 79
    new-instance p3, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string p4, "If you want filename from response please make sure you provide path is directory "

    .line 85
    .line 86
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p2

    .line 104
    :cond_1
    :goto_0
    invoke-static {p11}, Lr1/c;->p(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-nez p2, :cond_2

    .line 109
    .line 110
    new-instance p2, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string p3, "Discard filename["

    .line 116
    .line 117
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2, p11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string p3, "] because you set filenameFromResponse=true"

    .line 124
    .line 125
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    const-string p3, "DownloadTask"

    .line 133
    .line 134
    invoke-static {p3, p2}, Lr1/c;->z(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const/4 p11, 0x0

    .line 138
    :cond_2
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 139
    .line 140
    :goto_1
    move-object p2, p14

    .line 141
    goto/16 :goto_4

    .line 142
    .line 143
    :cond_3
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    if-eqz p2, :cond_5

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-eqz p2, :cond_5

    .line 154
    .line 155
    invoke-static {p11}, Lr1/c;->p(Ljava/lang/CharSequence;)Z

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    if-nez p2, :cond_4

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_4
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 163
    .line 164
    new-instance p3, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    const-string p4, "If you don\'t want filename from response please make sure you have already provided valid filename or not directory path "

    .line 170
    .line 171
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw p2

    .line 189
    :cond_5
    :goto_2
    invoke-static {p11}, Lr1/c;->p(Ljava/lang/CharSequence;)Z

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    if-eqz p2, :cond_6

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p11

    .line 199
    invoke-static {p1}, Lr1/c;->l(Ljava/io/File;)Ljava/io/File;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_6
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_7
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 210
    .line 211
    .line 212
    move-result p2

    .line 213
    if-eqz p2, :cond_8

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 216
    .line 217
    .line 218
    move-result p2

    .line 219
    if-eqz p2, :cond_8

    .line 220
    .line 221
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 222
    .line 223
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_8
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 229
    .line 230
    .line 231
    move-result p3

    .line 232
    if-eqz p3, :cond_b

    .line 233
    .line 234
    invoke-static {p11}, Lr1/c;->p(Ljava/lang/CharSequence;)Z

    .line 235
    .line 236
    .line 237
    move-result p3

    .line 238
    if-nez p3, :cond_a

    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p3

    .line 244
    invoke-virtual {p3, p11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result p3

    .line 248
    if-eqz p3, :cond_9

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 252
    .line 253
    const-string p2, "Uri already provided filename!"

    .line 254
    .line 255
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw p1

    .line 259
    :cond_a
    :goto_3
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p11

    .line 263
    invoke-static {p1}, Lr1/c;->l(Ljava/io/File;)Ljava/io/File;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_b
    invoke-static {p11}, Lr1/c;->p(Ljava/lang/CharSequence;)Z

    .line 271
    .line 272
    .line 273
    move-result p3

    .line 274
    if-eqz p3, :cond_c

    .line 275
    .line 276
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p11

    .line 280
    invoke-static {p1}, Lr1/c;->l(Ljava/io/File;)Ljava/io/File;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_c
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 288
    .line 289
    :goto_4
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    iput-boolean p1, p0, Lcom/liulishuo/okdownload/a;->t:Z

    .line 294
    .line 295
    goto :goto_5

    .line 296
    :cond_d
    const/4 p1, 0x0

    .line 297
    iput-boolean p1, p0, Lcom/liulishuo/okdownload/a;->t:Z

    .line 298
    .line 299
    new-instance p1, Ljava/io/File;

    .line 300
    .line 301
    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p2

    .line 305
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 309
    .line 310
    :goto_5
    invoke-static {p11}, Lr1/c;->p(Ljava/lang/CharSequence;)Z

    .line 311
    .line 312
    .line 313
    move-result p1

    .line 314
    if-eqz p1, :cond_e

    .line 315
    .line 316
    new-instance p1, Lv1/g$a;

    .line 317
    .line 318
    invoke-direct {p1}, Lv1/g$a;-><init>()V

    .line 319
    .line 320
    .line 321
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->u:Lv1/g$a;

    .line 322
    .line 323
    iget-object p1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 324
    .line 325
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->v:Ljava/io/File;

    .line 326
    .line 327
    goto :goto_6

    .line 328
    :cond_e
    new-instance p1, Lv1/g$a;

    .line 329
    .line 330
    invoke-direct {p1, p11}, Lv1/g$a;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->u:Lv1/g$a;

    .line 334
    .line 335
    new-instance p1, Ljava/io/File;

    .line 336
    .line 337
    iget-object p2, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 338
    .line 339
    invoke-direct {p1, p2, p11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->x:Ljava/io/File;

    .line 343
    .line 344
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->v:Ljava/io/File;

    .line 345
    .line 346
    :goto_6
    invoke-static {}, Lq1/d;->k()Lq1/d;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    invoke-virtual {p1}, Lq1/d;->a()Ls1/f;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    invoke-interface {p1, p0}, Ls1/f;->f(Lcom/liulishuo/okdownload/a;)I

    .line 355
    .line 356
    .line 357
    move-result p1

    .line 358
    iput p1, p0, Lcom/liulishuo/okdownload/a;->b:I

    .line 359
    .line 360
    return-void
.end method

.method public static synthetic g(Lcom/liulishuo/okdownload/a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/liulishuo/okdownload/a;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic h(Lcom/liulishuo/okdownload/a;)Ljava/io/File;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/liulishuo/okdownload/a;->v:Ljava/io/File;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public A()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->d:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public B()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/liulishuo/okdownload/a;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public C()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/liulishuo/okdownload/a;->t:Z

    .line 2
    .line 3
    return v0
.end method

.method public D()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/liulishuo/okdownload/a;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public E()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/liulishuo/okdownload/a;->r:Z

    .line 2
    .line 3
    return v0
.end method

.method public F(I)Lcom/liulishuo/okdownload/a$b;
    .locals 1

    .line 1
    new-instance v0, Lcom/liulishuo/okdownload/a$b;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Lcom/liulishuo/okdownload/a$b;-><init>(ILcom/liulishuo/okdownload/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public G(Ls1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->f:Ls1/c;

    .line 2
    .line 3
    return-void
.end method

.method public H(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->s:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public I(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->y:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->u:Lv1/g$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv1/g$a;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/liulishuo/okdownload/a;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/liulishuo/okdownload/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/liulishuo/okdownload/a;->j(Lcom/liulishuo/okdownload/a;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public d()Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->v:Ljava/io/File;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    instance-of v0, p1, Lcom/liulishuo/okdownload/a;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    check-cast p1, Lcom/liulishuo/okdownload/a;

    .line 14
    .line 15
    iget v0, p1, Lcom/liulishuo/okdownload/a;->b:I

    .line 16
    .line 17
    iget v2, p0, Lcom/liulishuo/okdownload/a;->b:I

    .line 18
    .line 19
    if-ne v0, v2, :cond_1

    .line 20
    .line 21
    return v1

    .line 22
    :cond_1
    invoke-virtual {p0, p1}, Lr1/a;->a(Lr1/a;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_2
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/liulishuo/okdownload/a;->c:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/liulishuo/okdownload/a;->v:Ljava/io/File;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/liulishuo/okdownload/a;->u:Lv1/g$a;

    .line 21
    .line 22
    invoke-virtual {v1}, Lv1/g$a;->a()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    return v0
.end method

.method public i()V
    .locals 1

    .line 1
    invoke-static {}, Lq1/d;->k()Lq1/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lq1/d;->e()Lu1/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p0}, Lu1/b;->a(Lr1/a;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public j(Lcom/liulishuo/okdownload/a;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->t()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Lcom/liulishuo/okdownload/a;->t()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sub-int/2addr p1, v0

    .line 10
    return p1
.end method

.method public k(Lq1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/liulishuo/okdownload/a;->q:Lq1/a;

    .line 2
    .line 3
    invoke-static {}, Lq1/d;->k()Lq1/d;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lq1/d;->e()Lu1/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1, p0}, Lu1/b;->c(Lcom/liulishuo/okdownload/a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public l()Ljava/io/File;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->u:Lv1/g$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv1/g$a;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    iget-object v1, p0, Lcom/liulishuo/okdownload/a;->x:Ljava/io/File;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    new-instance v1, Ljava/io/File;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 18
    .line 19
    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lcom/liulishuo/okdownload/a;->x:Ljava/io/File;

    .line 23
    .line 24
    :cond_1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->x:Ljava/io/File;

    .line 25
    .line 26
    return-object v0
.end method

.method public m()Lv1/g$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->u:Lv1/g$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/liulishuo/okdownload/a;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public o()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->e:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()Ls1/c;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->f:Ls1/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lq1/d;->k()Lq1/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lq1/d;->a()Ls1/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, p0, Lcom/liulishuo/okdownload/a;->b:I

    .line 14
    .line 15
    invoke-interface {v0, v1}, Ls1/f;->get(I)Ls1/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/liulishuo/okdownload/a;->f:Ls1/c;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->f:Ls1/c;

    .line 22
    .line 23
    return-object v0
.end method

.method public q()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->s:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public r()Lq1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->q:Lq1/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public s()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/liulishuo/okdownload/a;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public t()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/liulishuo/okdownload/a;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "@"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v2, p0, Lcom/liulishuo/okdownload/a;->b:I

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lcom/liulishuo/okdownload/a;->c:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lcom/liulishuo/okdownload/a;->w:Ljava/io/File;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, "/"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/liulishuo/okdownload/a;->u:Lv1/g$a;

    .line 49
    .line 50
    invoke-virtual {v1}, Lv1/g$a;->a()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0
.end method

.method public u()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/liulishuo/okdownload/a;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->y:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public w()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->l:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public x()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/liulishuo/okdownload/a;->m:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public y()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/liulishuo/okdownload/a;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public z()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/liulishuo/okdownload/a;->j:I

    .line 2
    .line 3
    return v0
.end method
