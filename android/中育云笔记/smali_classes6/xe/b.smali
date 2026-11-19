.class public Lxe/b;
.super Lxe/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/b$c;,
        Lxe/b$b;,
        Lxe/b$a;
    }
.end annotation


# static fields
.field public static final d0:Ljava/util/regex/Pattern;


# instance fields
.field public A:I

.field public B:Ljava/lang/String;

.field public final C:Ljava/util/Random;

.field public D:I

.field public E:I

.field public F:Ljava/net/InetAddress;

.field public G:Ljava/net/InetAddress;

.field public H:Ljava/net/InetAddress;

.field public I:I

.field public J:I

.field public K:I

.field public L:I

.field public M:Z

.field public N:J

.field public O:Lye/b;

.field public P:I

.field public Q:I

.field public R:I

.field public S:Z

.field public T:Z

.field public U:Ljava/lang/String;

.field public V:Ljava/lang/String;

.field public W:Lze/c;

.field public X:J

.field public Y:I

.field public Z:[I

.field public a0:Lxe/b$b;

.field public b0:Z

.field public c0:Ljava/util/HashMap;

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lxe/b;->d0:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lxe/a;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x3e8

    .line 5
    .line 6
    iput v0, p0, Lxe/b;->Y:I

    .line 7
    .line 8
    new-instance v0, Lxe/b$c;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lxe/b$c;-><init>(Lxe/b;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lxe/b;->a0:Lxe/b$b;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lxe/b;->b0:Z

    .line 17
    .line 18
    invoke-virtual {p0}, Lxe/b;->i0()V

    .line 19
    .line 20
    .line 21
    const/4 v1, -0x1

    .line 22
    iput v1, p0, Lxe/b;->z:I

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    iput-boolean v1, p0, Lxe/b;->M:Z

    .line 26
    .line 27
    new-instance v1, Lye/a;

    .line 28
    .line 29
    invoke-direct {v1}, Lye/a;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lxe/b;->O:Lye/b;

    .line 33
    .line 34
    iput-boolean v0, p0, Lxe/b;->S:Z

    .line 35
    .line 36
    iput-boolean v0, p0, Lxe/b;->T:Z

    .line 37
    .line 38
    new-instance v0, Ljava/util/Random;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lxe/b;->C:Ljava/util/Random;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    iput-object v0, p0, Lxe/b;->H:Ljava/net/InetAddress;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public U(Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;
    .locals 8

    .line 1
    iget v0, p0, Lxe/b;->y:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    if-eq v0, v2, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    invoke-virtual {p0}, Lwe/a;->l()Ljava/net/InetAddress;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    instance-of v0, v0, Ljava/net/Inet6Address;

    .line 15
    .line 16
    iget v2, p0, Lxe/b;->y:I

    .line 17
    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    if-nez v2, :cond_c

    .line 21
    .line 22
    iget-object v2, p0, Lwe/a;->h:Ljavax/net/ServerSocketFactory;

    .line 23
    .line 24
    invoke-virtual {p0}, Lxe/b;->b0()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    const/4 v6, 0x1

    .line 29
    invoke-virtual {p0}, Lxe/b;->f0()Ljava/net/InetAddress;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    invoke-virtual {v2, v5, v6, v7}, Ljavax/net/ServerSocketFactory;->createServerSocket(IILjava/net/InetAddress;)Ljava/net/ServerSocket;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    :try_start_0
    invoke-virtual {p0}, Lxe/b;->g0()Ljava/net/InetAddress;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v2}, Ljava/net/ServerSocket;->getLocalPort()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    invoke-virtual {p0, v0, v5}, Lxe/a;->w(Ljava/net/InetAddress;I)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-static {v0}, Lxe/c;->a(I)Z

    .line 52
    .line 53
    .line 54
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/net/ServerSocket;->close()V

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Lxe/b;->g0()Ljava/net/InetAddress;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v2}, Ljava/net/ServerSocket;->getLocalPort()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    invoke-virtual {p0, v0, v5}, Lxe/a;->J(Ljava/net/InetAddress;I)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-static {v0}, Lxe/c;->a(I)Z

    .line 76
    .line 77
    .line 78
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    if-nez v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/net/ServerSocket;->close()V

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_2
    :try_start_2
    iget-wide v5, p0, Lxe/b;->N:J

    .line 86
    .line 87
    cmp-long v0, v5, v3

    .line 88
    .line 89
    if-lez v0, :cond_4

    .line 90
    .line 91
    invoke-virtual {p0, v5, v6}, Lxe/b;->o0(J)Z

    .line 92
    .line 93
    .line 94
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 95
    if-nez v0, :cond_4

    .line 96
    .line 97
    if-eqz v2, :cond_3

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/net/ServerSocket;->close()V

    .line 100
    .line 101
    .line 102
    :cond_3
    return-object v1

    .line 103
    :cond_4
    :try_start_3
    invoke-virtual {p0, p1, p2}, Lxe/a;->N(Ljava/lang/String;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    invoke-static {p1}, Lxe/c;->c(I)Z

    .line 108
    .line 109
    .line 110
    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 111
    if-nez p1, :cond_6

    .line 112
    .line 113
    if-eqz v2, :cond_5

    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/net/ServerSocket;->close()V

    .line 116
    .line 117
    .line 118
    :cond_5
    return-object v1

    .line 119
    :cond_6
    :try_start_4
    iget p1, p0, Lxe/b;->z:I

    .line 120
    .line 121
    if-ltz p1, :cond_7

    .line 122
    .line 123
    invoke-virtual {v2, p1}, Ljava/net/ServerSocket;->setSoTimeout(I)V

    .line 124
    .line 125
    .line 126
    :cond_7
    invoke-virtual {v2}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iget p2, p0, Lxe/b;->z:I

    .line 131
    .line 132
    if-ltz p2, :cond_8

    .line 133
    .line 134
    invoke-virtual {p1, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 135
    .line 136
    .line 137
    :cond_8
    iget p2, p0, Lxe/b;->R:I

    .line 138
    .line 139
    if-lez p2, :cond_9

    .line 140
    .line 141
    invoke-virtual {p1, p2}, Ljava/net/Socket;->setReceiveBufferSize(I)V

    .line 142
    .line 143
    .line 144
    :cond_9
    iget p2, p0, Lxe/b;->Q:I

    .line 145
    .line 146
    if-lez p2, :cond_a

    .line 147
    .line 148
    invoke-virtual {p1, p2}, Ljava/net/Socket;->setSendBufferSize(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 149
    .line 150
    .line 151
    :cond_a
    invoke-virtual {v2}, Ljava/net/ServerSocket;->close()V

    .line 152
    .line 153
    .line 154
    goto/16 :goto_3

    .line 155
    .line 156
    :goto_0
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 157
    :catchall_1
    move-exception p2

    .line 158
    if-eqz v2, :cond_b

    .line 159
    .line 160
    :try_start_6
    invoke-virtual {v2}, Ljava/net/ServerSocket;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :catchall_2
    move-exception v0

    .line 165
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    :cond_b
    :goto_1
    throw p2

    .line 169
    :cond_c
    invoke-virtual {p0}, Lxe/b;->k0()Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    const/4 v5, 0x0

    .line 174
    if-nez v2, :cond_d

    .line 175
    .line 176
    if-eqz v0, :cond_e

    .line 177
    .line 178
    :cond_d
    invoke-virtual {p0}, Lxe/a;->x()I

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    const/16 v6, 0xe5

    .line 183
    .line 184
    if-ne v2, v6, :cond_e

    .line 185
    .line 186
    iget-object v0, p0, Lxe/a;->p:Ljava/util/ArrayList;

    .line 187
    .line 188
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    check-cast v0, Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {p0, v0}, Lxe/b;->V(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_e
    if-eqz v0, :cond_f

    .line 199
    .line 200
    return-object v1

    .line 201
    :cond_f
    invoke-virtual {p0}, Lxe/a;->I()I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    const/16 v2, 0xe3

    .line 206
    .line 207
    if-eq v0, v2, :cond_10

    .line 208
    .line 209
    return-object v1

    .line 210
    :cond_10
    iget-object v0, p0, Lxe/a;->p:Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    check-cast v0, Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {p0, v0}, Lxe/b;->W(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    :goto_2
    iget-object v0, p0, Lwe/a;->g:Ljavax/net/SocketFactory;

    .line 222
    .line 223
    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    iget v2, p0, Lxe/b;->R:I

    .line 228
    .line 229
    if-lez v2, :cond_11

    .line 230
    .line 231
    invoke-virtual {v0, v2}, Ljava/net/Socket;->setReceiveBufferSize(I)V

    .line 232
    .line 233
    .line 234
    :cond_11
    iget v2, p0, Lxe/b;->Q:I

    .line 235
    .line 236
    if-lez v2, :cond_12

    .line 237
    .line 238
    invoke-virtual {v0, v2}, Ljava/net/Socket;->setSendBufferSize(I)V

    .line 239
    .line 240
    .line 241
    :cond_12
    iget-object v2, p0, Lxe/b;->H:Ljava/net/InetAddress;

    .line 242
    .line 243
    if-eqz v2, :cond_13

    .line 244
    .line 245
    new-instance v2, Ljava/net/InetSocketAddress;

    .line 246
    .line 247
    iget-object v6, p0, Lxe/b;->H:Ljava/net/InetAddress;

    .line 248
    .line 249
    invoke-direct {v2, v6, v5}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v2}, Ljava/net/Socket;->bind(Ljava/net/SocketAddress;)V

    .line 253
    .line 254
    .line 255
    :cond_13
    iget v2, p0, Lxe/b;->z:I

    .line 256
    .line 257
    if-ltz v2, :cond_14

    .line 258
    .line 259
    invoke-virtual {v0, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 260
    .line 261
    .line 262
    :cond_14
    new-instance v2, Ljava/net/InetSocketAddress;

    .line 263
    .line 264
    iget-object v5, p0, Lxe/b;->B:Ljava/lang/String;

    .line 265
    .line 266
    iget v6, p0, Lxe/b;->A:I

    .line 267
    .line 268
    invoke-direct {v2, v5, v6}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    .line 269
    .line 270
    .line 271
    iget v5, p0, Lwe/a;->i:I

    .line 272
    .line 273
    invoke-virtual {v0, v2, v5}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 274
    .line 275
    .line 276
    iget-wide v5, p0, Lxe/b;->N:J

    .line 277
    .line 278
    cmp-long v2, v5, v3

    .line 279
    .line 280
    if-lez v2, :cond_15

    .line 281
    .line 282
    invoke-virtual {p0, v5, v6}, Lxe/b;->o0(J)Z

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    if-nez v2, :cond_15

    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    .line 289
    .line 290
    .line 291
    return-object v1

    .line 292
    :cond_15
    invoke-virtual {p0, p1, p2}, Lxe/a;->N(Ljava/lang/String;Ljava/lang/String;)I

    .line 293
    .line 294
    .line 295
    move-result p1

    .line 296
    invoke-static {p1}, Lxe/c;->c(I)Z

    .line 297
    .line 298
    .line 299
    move-result p1

    .line 300
    if-nez p1, :cond_16

    .line 301
    .line 302
    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    .line 303
    .line 304
    .line 305
    return-object v1

    .line 306
    :cond_16
    move-object p1, v0

    .line 307
    :goto_3
    iget-boolean p2, p0, Lxe/b;->M:Z

    .line 308
    .line 309
    if-eqz p2, :cond_18

    .line 310
    .line 311
    invoke-virtual {p0, p1}, Lwe/a;->r(Ljava/net/Socket;)Z

    .line 312
    .line 313
    .line 314
    move-result p2

    .line 315
    if-eqz p2, :cond_17

    .line 316
    .line 317
    goto :goto_4

    .line 318
    :cond_17
    invoke-virtual {p1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    .line 319
    .line 320
    .line 321
    move-result-object p2

    .line 322
    invoke-virtual {p1}, Ljava/net/Socket;->close()V

    .line 323
    .line 324
    .line 325
    new-instance p1, Ljava/io/IOException;

    .line 326
    .line 327
    new-instance v0, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 330
    .line 331
    .line 332
    const-string v1, "Host attempting data connection "

    .line 333
    .line 334
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {p2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object p2

    .line 341
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    const-string p2, " is not same as server "

    .line 345
    .line 346
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {p0}, Lwe/a;->l()Ljava/net/InetAddress;

    .line 350
    .line 351
    .line 352
    move-result-object p2

    .line 353
    invoke-virtual {p2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object p2

    .line 357
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object p2

    .line 364
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    throw p1

    .line 368
    :cond_18
    :goto_4
    return-object p1
.end method

.method public V(Ljava/lang/String;)V
    .locals 6

    .line 1
    const/16 v0, 0x28

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    add-int/2addr v0, v1

    .line 9
    const/16 v2, 0x29

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/4 v3, 0x2

    .line 33
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    sub-int/2addr v4, v1

    .line 42
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    const-string v5, "Could not parse extended passive host information.\nServer Reply: "

    .line 47
    .line 48
    if-ne v0, v2, :cond_0

    .line 49
    .line 50
    if-ne v2, v3, :cond_0

    .line 51
    .line 52
    if-ne v3, v4, :cond_0

    .line 53
    .line 54
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    sub-int/2addr v0, v1

    .line 59
    const/4 v1, 0x3

    .line 60
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    invoke-virtual {p0}, Lwe/a;->l()Ljava/net/InetAddress;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, Lxe/b;->B:Ljava/lang/String;

    .line 77
    .line 78
    iput p1, p0, Lxe/b;->A:I

    .line 79
    .line 80
    return-void

    .line 81
    :catch_0
    new-instance v0, Lorg/apache/commons/net/MalformedServerReplyException;

    .line 82
    .line 83
    new-instance v1, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-direct {v0, p1}, Lorg/apache/commons/net/MalformedServerReplyException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v0

    .line 102
    :cond_0
    new-instance v0, Lorg/apache/commons/net/MalformedServerReplyException;

    .line 103
    .line 104
    new-instance v1, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-direct {v0, p1}, Lorg/apache/commons/net/MalformedServerReplyException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v0
.end method

.method public W(Ljava/lang/String;)V
    .locals 5

    .line 1
    sget-object v0, Lxe/b;->d0:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-string v2, "Could not parse passive host information.\nServer Reply: "

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    const-string v1, "0,0,0,0"

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, Lwe/a;->b:Ljava/net/Socket;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/16 v3, 0x2c

    .line 44
    .line 45
    const/16 v4, 0x2e

    .line 46
    .line 47
    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :goto_0
    iput-object v1, p0, Lxe/b;->B:Ljava/lang/String;

    .line 52
    .line 53
    const/4 v1, 0x2

    .line 54
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    const/4 v3, 0x3

    .line 63
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    shl-int/lit8 v1, v1, 0x8

    .line 72
    .line 73
    or-int/2addr v0, v1

    .line 74
    iput v0, p0, Lxe/b;->A:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    .line 75
    .line 76
    iget-object v0, p0, Lxe/b;->a0:Lxe/b$b;

    .line 77
    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    :try_start_1
    iget-object v1, p0, Lxe/b;->B:Ljava/lang/String;

    .line 81
    .line 82
    invoke-interface {v0, v1}, Lxe/b$b;->resolve(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object v1, p0, Lxe/b;->B:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-nez v1, :cond_1

    .line 93
    .line 94
    new-instance v1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v3, "[Replacing PASV mode reply address "

    .line 100
    .line 101
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget-object v3, p0, Lxe/b;->B:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v3, " with "

    .line 110
    .line 111
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v3, "]\n"

    .line 118
    .line 119
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    const/4 v3, 0x0

    .line 127
    invoke-virtual {p0, v3, v1}, Lwe/a;->i(ILjava/lang/String;)V

    .line 128
    .line 129
    .line 130
    iput-object v0, p0, Lxe/b;->B:Ljava/lang/String;
    :try_end_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_0

    .line 131
    .line 132
    return-void

    .line 133
    :catch_0
    new-instance v0, Lorg/apache/commons/net/MalformedServerReplyException;

    .line 134
    .line 135
    new-instance v1, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-direct {v0, p1}, Lorg/apache/commons/net/MalformedServerReplyException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw v0

    .line 154
    :cond_1
    return-void

    .line 155
    :catch_1
    new-instance v0, Lorg/apache/commons/net/MalformedServerReplyException;

    .line 156
    .line 157
    new-instance v1, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    .line 161
    .line 162
    const-string v2, "Could not parse passive port information.\nServer Reply: "

    .line 163
    .line 164
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-direct {v0, p1}, Lorg/apache/commons/net/MalformedServerReplyException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v0

    .line 178
    :cond_2
    new-instance v0, Lorg/apache/commons/net/MalformedServerReplyException;

    .line 179
    .line 180
    new-instance v1, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-direct {v0, p1}, Lorg/apache/commons/net/MalformedServerReplyException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v0
.end method

.method public X(Ljava/lang/String;Ljava/lang/String;Ljava/io/OutputStream;)Z
    .locals 9

    .line 1
    invoke-virtual {p0, p1, p2}, Lxe/b;->U(Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p2, 0x0

    .line 10
    :try_start_0
    iget v0, p0, Lxe/b;->I:I

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lze/d;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p0, v1}, Lxe/b;->d0(Ljava/io/InputStream;)Ljava/io/InputStream;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, v1}, Lze/d;-><init>(Ljava/io/InputStream;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    move-object v1, v0

    .line 28
    goto :goto_1

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    move-object p3, v0

    .line 31
    move-object p3, p2

    .line 32
    goto :goto_3

    .line 33
    :cond_1
    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0, v0}, Lxe/b;->d0(Ljava/io/InputStream;)Ljava/io/InputStream;

    .line 38
    .line 39
    .line 40
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    goto :goto_0

    .line 42
    :goto_1
    :try_start_1
    iget-wide v2, p0, Lxe/b;->X:J

    .line 43
    .line 44
    const-wide/16 v4, 0x0

    .line 45
    .line 46
    cmp-long v0, v2, v4

    .line 47
    .line 48
    if-lez v0, :cond_2

    .line 49
    .line 50
    new-instance v0, Lxe/b$a;

    .line 51
    .line 52
    iget v4, p0, Lxe/b;->Y:I

    .line 53
    .line 54
    invoke-direct {v0, p0, v2, v3, v4}, Lxe/b$a;-><init>(Lxe/b;JI)V

    .line 55
    .line 56
    .line 57
    move-object p2, v0

    .line 58
    goto :goto_2

    .line 59
    :catchall_1
    move-exception v0

    .line 60
    move-object p3, v0

    .line 61
    move-object p3, p2

    .line 62
    move-object p2, v1

    .line 63
    goto :goto_3

    .line 64
    :cond_2
    :goto_2
    invoke-virtual {p0}, Lxe/b;->c0()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-virtual {p0, p2}, Lxe/b;->n0(Lze/c;)Lze/c;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    const/4 v7, 0x0

    .line 73
    const-wide/16 v4, -0x1

    .line 74
    .line 75
    move-object v2, p3

    .line 76
    invoke-static/range {v1 .. v7}, Lze/f;->c(Ljava/io/InputStream;Ljava/io/OutputStream;IJLze/c;Z)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    .line 79
    :try_start_2
    invoke-static {v1}, Lze/f;->a(Ljava/io/Closeable;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lxe/b;->Z()Z

    .line 83
    .line 84
    .line 85
    move-result p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 86
    invoke-static {p1}, Lze/f;->b(Ljava/net/Socket;)V

    .line 87
    .line 88
    .line 89
    if-eqz p2, :cond_3

    .line 90
    .line 91
    invoke-virtual {p2}, Lxe/b$a;->b()[I

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iput-object p1, p0, Lxe/b;->Z:[I

    .line 96
    .line 97
    :cond_3
    return p3

    .line 98
    :catchall_2
    move-exception v0

    .line 99
    move-object p3, v0

    .line 100
    goto :goto_4

    .line 101
    :goto_3
    :try_start_3
    invoke-static {p2}, Lze/f;->a(Ljava/io/Closeable;)V

    .line 102
    .line 103
    .line 104
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 105
    :catchall_3
    move-exception v0

    .line 106
    move-object p2, v0

    .line 107
    move-object v8, p3

    .line 108
    move-object p3, p2

    .line 109
    move-object p2, v8

    .line 110
    :goto_4
    invoke-static {p1}, Lze/f;->b(Ljava/net/Socket;)V

    .line 111
    .line 112
    .line 113
    if-eqz p2, :cond_4

    .line 114
    .line 115
    invoke-virtual {p2}, Lxe/b$a;->b()[I

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iput-object p1, p0, Lxe/b;->Z:[I

    .line 120
    .line 121
    :cond_4
    throw p3
.end method

.method public Y(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Z
    .locals 7

    .line 1
    invoke-virtual {p0, p1, p2}, Lxe/b;->U(Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget p2, p0, Lxe/b;->I:I

    .line 10
    .line 11
    if-nez p2, :cond_1

    .line 12
    .line 13
    new-instance p2, Lze/e;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, Lxe/b;->e0(Ljava/io/OutputStream;)Ljava/io/OutputStream;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-direct {p2, v0}, Lze/e;-><init>(Ljava/io/OutputStream;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    move-object v1, p2

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p0, p2}, Lxe/b;->e0(Ljava/io/OutputStream;)Ljava/io/OutputStream;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    goto :goto_0

    .line 37
    :goto_1
    iget-wide v2, p0, Lxe/b;->X:J

    .line 38
    .line 39
    const-wide/16 v4, 0x0

    .line 40
    .line 41
    cmp-long p2, v2, v4

    .line 42
    .line 43
    if-lez p2, :cond_2

    .line 44
    .line 45
    new-instance p2, Lxe/b$a;

    .line 46
    .line 47
    iget v0, p0, Lxe/b;->Y:I

    .line 48
    .line 49
    invoke-direct {p2, p0, v2, v3, v0}, Lxe/b$a;-><init>(Lxe/b;JI)V

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/4 p2, 0x0

    .line 54
    :goto_2
    :try_start_0
    invoke-virtual {p0}, Lxe/b;->c0()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-virtual {p0, p2}, Lxe/b;->n0(Lze/c;)Lze/c;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    const/4 v6, 0x0

    .line 63
    const-wide/16 v3, -0x1

    .line 64
    .line 65
    move-object v0, p3

    .line 66
    invoke-static/range {v0 .. v6}, Lze/f;->c(Ljava/io/InputStream;Ljava/io/OutputStream;IJLze/c;Z)J

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/net/Socket;->close()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lxe/b;->Z()Z

    .line 76
    .line 77
    .line 78
    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    if-eqz p2, :cond_3

    .line 80
    .line 81
    invoke-virtual {p2}, Lxe/b$a;->b()[I

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    iput-object p2, p0, Lxe/b;->Z:[I

    .line 86
    .line 87
    :cond_3
    return p1

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    move-object p1, v0

    .line 90
    goto :goto_3

    .line 91
    :catch_0
    move-exception v0

    .line 92
    move-object p3, v0

    .line 93
    :try_start_1
    invoke-static {v1}, Lze/f;->a(Ljava/io/Closeable;)V

    .line 94
    .line 95
    .line 96
    invoke-static {p1}, Lze/f;->b(Ljava/net/Socket;)V

    .line 97
    .line 98
    .line 99
    throw p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    :goto_3
    if-eqz p2, :cond_4

    .line 101
    .line 102
    invoke-virtual {p2}, Lxe/b$a;->b()[I

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    iput-object p2, p0, Lxe/b;->Z:[I

    .line 107
    .line 108
    :cond_4
    throw p1
.end method

.method public Z()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxe/a;->A()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lxe/c;->a(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public a0()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lxe/b;->y:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lxe/b;->B:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lxe/b;->A:I

    .line 9
    .line 10
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lxe/b;->u(Ljava/io/Reader;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final b0()I
    .locals 3

    .line 1
    iget v0, p0, Lxe/b;->D:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    iget v1, p0, Lxe/b;->E:I

    .line 6
    .line 7
    if-lt v1, v0, :cond_1

    .line 8
    .line 9
    if-ne v1, v0, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    iget-object v2, p0, Lxe/b;->C:Ljava/util/Random;

    .line 13
    .line 14
    sub-int/2addr v1, v0

    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/util/Random;->nextInt(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget v1, p0, Lxe/b;->D:I

    .line 22
    .line 23
    add-int/2addr v0, v1

    .line 24
    return v0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return v0
.end method

.method public c0()I
    .locals 1

    .line 1
    iget v0, p0, Lxe/b;->P:I

    .line 2
    .line 3
    return v0
.end method

.method public final d0(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 2

    .line 1
    iget v0, p0, Lxe/b;->P:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 6
    .line 7
    iget v1, p0, Lxe/b;->P:I

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final e0(Ljava/io/OutputStream;)Ljava/io/OutputStream;
    .locals 2

    .line 1
    iget v0, p0, Lxe/b;->P:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/io/BufferedOutputStream;

    .line 6
    .line 7
    iget v1, p0, Lxe/b;->P:I

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v0, Ljava/io/BufferedOutputStream;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final f0()Ljava/net/InetAddress;
    .locals 1

    .line 1
    iget-object v0, p0, Lxe/b;->F:Ljava/net/InetAddress;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lwe/a;->k()Ljava/net/InetAddress;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public g()V
    .locals 0

    .line 1
    invoke-super {p0}, Lxe/a;->g()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lxe/b;->i0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final g0()Ljava/net/InetAddress;
    .locals 1

    .line 1
    iget-object v0, p0, Lxe/b;->G:Ljava/net/InetAddress;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lxe/b;->f0()Ljava/net/InetAddress;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public h0(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxe/b;->j0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v0, p0, Lxe/b;->c0:Ljava/util/HashMap;

    .line 10
    .line 11
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final i0()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lxe/b;->y:I

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lxe/b;->B:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    iput v2, p0, Lxe/b;->A:I

    .line 9
    .line 10
    iput-object v1, p0, Lxe/b;->F:Ljava/net/InetAddress;

    .line 11
    .line 12
    iput-object v1, p0, Lxe/b;->G:Ljava/net/InetAddress;

    .line 13
    .line 14
    iput v0, p0, Lxe/b;->D:I

    .line 15
    .line 16
    iput v0, p0, Lxe/b;->E:I

    .line 17
    .line 18
    iput v0, p0, Lxe/b;->I:I

    .line 19
    .line 20
    const/4 v0, 0x7

    .line 21
    iput v0, p0, Lxe/b;->K:I

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    iput v0, p0, Lxe/b;->J:I

    .line 25
    .line 26
    const/16 v0, 0xa

    .line 27
    .line 28
    iput v0, p0, Lxe/b;->L:I

    .line 29
    .line 30
    const-wide/16 v2, 0x0

    .line 31
    .line 32
    iput-wide v2, p0, Lxe/b;->N:J

    .line 33
    .line 34
    iput-object v1, p0, Lxe/b;->U:Ljava/lang/String;

    .line 35
    .line 36
    const-string v0, ""

    .line 37
    .line 38
    iput-object v0, p0, Lxe/b;->V:Ljava/lang/String;

    .line 39
    .line 40
    iput-object v1, p0, Lxe/b;->c0:Ljava/util/HashMap;

    .line 41
    .line 42
    return-void
.end method

.method public final j0()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lxe/b;->c0:Ljava/util/HashMap;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_5

    .line 5
    .line 6
    invoke-virtual {p0}, Lxe/a;->y()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v2, 0x212

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    return v3

    .line 16
    :cond_0
    invoke-static {v0}, Lxe/c;->a(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    new-instance v2, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v2, p0, Lxe/b;->c0:Ljava/util/HashMap;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    return v3

    .line 30
    :cond_1
    iget-object v0, p0, Lxe/a;->p:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    :cond_2
    :goto_0
    if-ge v3, v2, :cond_5

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    check-cast v4, Ljava/lang/String;

    .line 45
    .line 46
    const-string v5, " "

    .line 47
    .line 48
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_2

    .line 53
    .line 54
    const/16 v5, 0x20

    .line 55
    .line 56
    invoke-virtual {v4, v5, v1}, Ljava/lang/String;->indexOf(II)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-lez v5, :cond_3

    .line 61
    .line 62
    invoke-virtual {v4, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    add-int/lit8 v5, v5, 0x1

    .line 67
    .line 68
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    invoke-virtual {v4, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    const-string v4, ""

    .line 78
    .line 79
    :goto_1
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 80
    .line 81
    invoke-virtual {v6, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    iget-object v6, p0, Lxe/b;->c0:Ljava/util/HashMap;

    .line 86
    .line 87
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, Ljava/util/Set;

    .line 92
    .line 93
    if-nez v6, :cond_4

    .line 94
    .line 95
    new-instance v6, Ljava/util/HashSet;

    .line 96
    .line 97
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 98
    .line 99
    .line 100
    iget-object v7, p0, Lxe/b;->c0:Ljava/util/HashMap;

    .line 101
    .line 102
    invoke-virtual {v7, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    :cond_4
    invoke-interface {v6, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    return v1
.end method

.method public k0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxe/b;->T:Z

    .line 2
    .line 3
    return v0
.end method

.method public l0(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxe/a;->T(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lxe/a;->o:I

    .line 5
    .line 6
    invoke-static {p1}, Lxe/c;->a(I)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :cond_0
    iget p1, p0, Lxe/a;->o:I

    .line 15
    .line 16
    invoke-static {p1}, Lxe/c;->b(I)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    return p1

    .line 24
    :cond_1
    invoke-virtual {p0, p2}, Lxe/a;->H(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p1}, Lxe/c;->a(I)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
.end method

.method public m0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxe/a;->K()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lxe/c;->a(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final n0(Lze/c;)Lze/c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lxe/b;->W:Lze/c;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    iget-object v0, p0, Lxe/b;->W:Lze/c;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_1
    new-instance v0, Lze/b;

    .line 12
    .line 13
    invoke-direct {v0}, Lze/b;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lze/b;->b(Lze/c;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lxe/b;->W:Lze/c;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lze/b;->b(Lze/c;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public o0(J)Z
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lxe/b;->N:J

    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lxe/a;->L(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p1}, Lxe/c;->b(I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public p0(Ljava/lang/String;Ljava/io/OutputStream;)Z
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/net/ftp/FTPCmd;->D:Lorg/apache/commons/net/ftp/FTPCmd;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/commons/net/ftp/FTPCmd;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0, p1, p2}, Lxe/b;->X(Ljava/lang/String;Ljava/lang/String;Ljava/io/OutputStream;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public q0(I)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lxe/a;->S(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lxe/c;->a(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iput p1, p0, Lxe/b;->I:I

    .line 12
    .line 13
    const/4 p1, 0x4

    .line 14
    iput p1, p0, Lxe/b;->J:I

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method public r0(Ljava/lang/String;Ljava/io/InputStream;)Z
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/net/ftp/FTPCmd;->L:Lorg/apache/commons/net/ftp/FTPCmd;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1, p2}, Lxe/b;->s0(Lorg/apache/commons/net/ftp/FTPCmd;Ljava/lang/String;Ljava/io/InputStream;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final s0(Lorg/apache/commons/net/ftp/FTPCmd;Ljava/lang/String;Ljava/io/InputStream;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Lorg/apache/commons/net/ftp/FTPCmd;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lxe/b;->Y(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public u(Ljava/io/Reader;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Lxe/a;->u(Ljava/io/Reader;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lxe/b;->i0()V

    .line 5
    .line 6
    .line 7
    iget-boolean p1, p0, Lxe/b;->b0:Z

    .line 8
    .line 9
    if-eqz p1, :cond_2

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v0, p0, Lxe/a;->p:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 16
    .line 17
    .line 18
    iget v0, p0, Lxe/a;->o:I

    .line 19
    .line 20
    const-string v1, "UTF8"

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lxe/b;->h0(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const-string v2, "UTF-8"

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Lxe/b;->h0(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0, v2}, Lxe/a;->Q(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lze/a;

    .line 40
    .line 41
    new-instance v2, Ljava/io/InputStreamReader;

    .line 42
    .line 43
    iget-object v3, p0, Lwe/a;->e:Ljava/io/InputStream;

    .line 44
    .line 45
    invoke-virtual {p0}, Lxe/a;->z()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-direct {v2, v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, v2}, Lze/a;-><init>(Ljava/io/Reader;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Lxe/a;->w:Ljava/io/BufferedReader;

    .line 56
    .line 57
    new-instance v1, Ljava/io/BufferedWriter;

    .line 58
    .line 59
    new-instance v2, Ljava/io/OutputStreamWriter;

    .line 60
    .line 61
    iget-object v3, p0, Lwe/a;->f:Ljava/io/OutputStream;

    .line 62
    .line 63
    invoke-virtual {p0}, Lxe/a;->z()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-direct {v2, v3, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 71
    .line 72
    .line 73
    iput-object v1, p0, Lxe/a;->x:Ljava/io/BufferedWriter;

    .line 74
    .line 75
    :cond_1
    iget-object v1, p0, Lxe/a;->p:Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, Lxe/a;->p:Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 83
    .line 84
    .line 85
    iput v0, p0, Lxe/a;->o:I

    .line 86
    .line 87
    const/4 p1, 0x1

    .line 88
    iput-boolean p1, p0, Lxe/a;->q:Z

    .line 89
    .line 90
    :cond_2
    return-void
.end method
