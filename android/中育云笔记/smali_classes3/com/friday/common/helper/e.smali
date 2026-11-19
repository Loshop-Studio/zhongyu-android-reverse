.class public final Lcom/friday/common/helper/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/helper/e$a;,
        Lcom/friday/common/helper/e$b;
    }
.end annotation


# static fields
.field public static final k:Lcom/friday/common/helper/e$a;

.field public static final l:I

.field public static volatile m:Lcom/friday/common/helper/e;


# instance fields
.field public a:Ljava/lang/Thread;

.field public b:Lcom/friday/common/helper/e$b;

.field public c:[B

.field public d:Ljava/lang/String;

.field public e:I

.field public f:Landroid/os/Handler;

.field public g:Ljava/lang/String;

.field public final h:Lqc/d;

.field public volatile i:I

.field public j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/helper/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/helper/e$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/helper/e;->k:Lcom/friday/common/helper/e$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/common/helper/e;->l:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x23

    .line 3
    new-array v0, v0, [B

    iput-object v0, p0, Lcom/friday/common/helper/e;->c:[B

    .line 4
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lf2/l;

    invoke-direct {v1, p0}, Lf2/l;-><init>(Lcom/friday/common/helper/e;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/friday/common/helper/e;->f:Landroid/os/Handler;

    .line 5
    new-instance v0, Lf2/m;

    invoke-direct {v0, p0}, Lf2/m;-><init>(Lcom/friday/common/helper/e;)V

    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    move-result-object v0

    iput-object v0, p0, Lcom/friday/common/helper/e;->h:Lqc/d;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/common/helper/e;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/friday/common/helper/e;Landroid/os/Message;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/helper/e;->k(Lcom/friday/common/helper/e;Landroid/os/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/friday/common/helper/e;)Lcom/friday/common/helper/e$c;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/common/helper/e;->l(Lcom/friday/common/helper/e;)Lcom/friday/common/helper/e$c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/friday/common/helper/e;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/common/helper/e;->n(Lcom/friday/common/helper/e;)V

    return-void
.end method

.method public static final synthetic d()Lcom/friday/common/helper/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/helper/e;->m:Lcom/friday/common/helper/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic e(Lcom/friday/common/helper/e;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/friday/common/helper/e;->i:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic f(Lcom/friday/common/helper/e;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/friday/common/helper/e;->m:Lcom/friday/common/helper/e;

    .line 2
    .line 3
    return-void
.end method

.method public static final k(Lcom/friday/common/helper/e;Landroid/os/Message;)Z
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p1, Landroid/os/Message;->what:I

    .line 7
    .line 8
    const/16 v1, 0x64

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v0, "getData(...)"

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v0, "CODE"

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "IP"

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p0, p0, Lcom/friday/common/helper/e;->b:Lcom/friday/common/helper/e$b;

    .line 35
    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    new-instance v1, Li2/a;

    .line 39
    .line 40
    invoke-direct {v1, v0, p1, v2}, Li2/a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p0, v1}, Lcom/friday/common/helper/e$b;->a(Li2/a;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return v2
.end method

.method public static final l(Lcom/friday/common/helper/e;)Lcom/friday/common/helper/e$c;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/common/helper/e$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/friday/common/helper/e$c;-><init>(Lcom/friday/common/helper/e;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final n(Lcom/friday/common/helper/e;)V
    .locals 13

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "wifi"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "null cannot be cast to non-null type android.net.wifi.WifiManager"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 21
    .line 22
    const-string v1, "CloudNote"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/net/wifi/WifiManager;->createMulticastLock(Ljava/lang/String;)Landroid/net/wifi/WifiManager$MulticastLock;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x0

    .line 29
    move-object v3, v2

    .line 30
    :goto_0
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x1

    .line 32
    :try_start_0
    iget v0, p0, Lcom/friday/common/helper/e;->i:I

    .line 33
    .line 34
    if-lez v0, :cond_8

    .line 35
    .line 36
    iget-boolean v0, p0, Lcom/friday/common/helper/e;->j:Z

    .line 37
    .line 38
    if-nez v0, :cond_8

    .line 39
    .line 40
    new-instance v6, Ljava/net/DatagramSocket;

    .line 41
    .line 42
    invoke-direct {v6, v2}, Ljava/net/DatagramSocket;-><init>(Ljava/net/SocketAddress;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 43
    .line 44
    .line 45
    :try_start_1
    invoke-virtual {v6, v5}, Ljava/net/DatagramSocket;->setReuseAddress(Z)V

    .line 46
    .line 47
    .line 48
    new-instance v0, Ljava/net/InetSocketAddress;

    .line 49
    .line 50
    iget v3, p0, Lcom/friday/common/helper/e;->e:I

    .line 51
    .line 52
    invoke-direct {v0, v3}, Ljava/net/InetSocketAddress;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6, v0}, Ljava/net/DatagramSocket;->bind(Ljava/net/SocketAddress;)V

    .line 56
    .line 57
    .line 58
    iget v0, p0, Lcom/friday/common/helper/e;->i:I

    .line 59
    .line 60
    add-int/lit8 v0, v0, -0x1

    .line 61
    .line 62
    iput v0, p0, Lcom/friday/common/helper/e;->i:I

    .line 63
    .line 64
    new-instance v0, Ljava/net/DatagramPacket;

    .line 65
    .line 66
    iget-object v3, p0, Lcom/friday/common/helper/e;->c:[B

    .line 67
    .line 68
    array-length v7, v3

    .line 69
    invoke-direct {v0, v3, v7}, Ljava/net/DatagramPacket;-><init>([BI)V

    .line 70
    .line 71
    .line 72
    if-eqz v1, :cond_0

    .line 73
    .line 74
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager$MulticastLock;->acquire()V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catch_0
    move-exception v0

    .line 79
    move-object v3, v6

    .line 80
    goto/16 :goto_2

    .line 81
    .line 82
    :cond_0
    :goto_1
    invoke-virtual {v6, v0}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    .line 83
    .line 84
    .line 85
    if-eqz v1, :cond_1

    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager$MulticastLock;->isHeld()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-ne v3, v5, :cond_1

    .line 92
    .line 93
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager$MulticastLock;->release()V

    .line 94
    .line 95
    .line 96
    :cond_1
    invoke-virtual {v0}, Ljava/net/DatagramPacket;->getData()[B

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    const-string v3, "getData(...)"

    .line 101
    .line 102
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    new-instance v7, Ljava/lang/String;

    .line 106
    .line 107
    sget-object v3, Lqd/c;->b:Ljava/nio/charset/Charset;

    .line 108
    .line 109
    invoke-direct {v7, v0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 110
    .line 111
    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    const-string v3, "\u6536\u5230udp\u6d88\u606f\uff1a"

    .line 118
    .line 119
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0}, Lz1/b;->c([Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v7}, Lcom/blankj/utilcode/util/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_4

    .line 141
    .line 142
    const-string v0, "::"

    .line 143
    .line 144
    filled-new-array {v0}, [Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    const/4 v11, 0x6

    .line 149
    const/4 v12, 0x0

    .line 150
    const/4 v9, 0x0

    .line 151
    const/4 v10, 0x0

    .line 152
    invoke-static/range {v7 .. v12}, Lqd/c0;->I0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    move-object v3, v0

    .line 157
    check-cast v3, Ljava/util/Collection;

    .line 158
    .line 159
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-nez v3, :cond_4

    .line 164
    .line 165
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    const/4 v7, 0x2

    .line 170
    if-ne v3, v7, :cond_4

    .line 171
    .line 172
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    check-cast v3, Ljava/lang/String;

    .line 177
    .line 178
    invoke-static {v3}, Lcom/blankj/utilcode/util/RegexUtils;->isIP(Ljava/lang/CharSequence;)Z

    .line 179
    .line 180
    .line 181
    move-result v7

    .line 182
    if-eqz v7, :cond_4

    .line 183
    .line 184
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {v0}, Lcom/blankj/utilcode/util/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 191
    .line 192
    .line 193
    move-result v7

    .line 194
    if-nez v7, :cond_4

    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    const/4 v8, 0x4

    .line 201
    if-lt v7, v8, :cond_4

    .line 202
    .line 203
    invoke-virtual {v0, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    const-string v7, "substring(...)"

    .line 208
    .line 209
    invoke-static {v0, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    iget-object v7, p0, Lcom/friday/common/helper/e;->g:Ljava/lang/String;

    .line 213
    .line 214
    invoke-static {v0, v7}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    if-eqz v7, :cond_4

    .line 219
    .line 220
    iget-boolean v7, p0, Lcom/friday/common/helper/e;->j:Z

    .line 221
    .line 222
    if-eqz v7, :cond_2

    .line 223
    .line 224
    invoke-virtual {v6}, Ljava/net/DatagramSocket;->isClosed()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-nez v0, :cond_8

    .line 229
    .line 230
    invoke-virtual {v6}, Ljava/net/DatagramSocket;->close()V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :cond_2
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 235
    .line 236
    .line 237
    move-result-object v7

    .line 238
    const/16 v8, 0x64

    .line 239
    .line 240
    iput v8, v7, Landroid/os/Message;->what:I

    .line 241
    .line 242
    new-instance v8, Landroid/os/Bundle;

    .line 243
    .line 244
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 245
    .line 246
    .line 247
    sget-object v9, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 248
    .line 249
    invoke-virtual {v9}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 250
    .line 251
    .line 252
    move-result-object v9

    .line 253
    invoke-virtual {v9, v3}, Lcom/friday/common/helper/b;->C(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    const-string v9, "IP"

    .line 257
    .line 258
    invoke-virtual {v8, v9, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    const-string v3, "CODE"

    .line 262
    .line 263
    invoke-virtual {v8, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v7, v8}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 267
    .line 268
    .line 269
    iget-object v0, p0, Lcom/friday/common/helper/e;->f:Landroid/os/Handler;

    .line 270
    .line 271
    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 272
    .line 273
    .line 274
    invoke-virtual {v6}, Ljava/net/DatagramSocket;->isClosed()Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-nez v0, :cond_3

    .line 279
    .line 280
    invoke-virtual {v6}, Ljava/net/DatagramSocket;->close()V

    .line 281
    .line 282
    .line 283
    :cond_3
    invoke-virtual {p0}, Lcom/friday/common/helper/e;->h()Lcom/friday/common/helper/e$c;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :cond_4
    iget v0, p0, Lcom/friday/common/helper/e;->i:I

    .line 292
    .line 293
    if-nez v0, :cond_7

    .line 294
    .line 295
    invoke-virtual {v6}, Ljava/net/DatagramSocket;->isClosed()Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-nez v0, :cond_5

    .line 300
    .line 301
    invoke-virtual {v6}, Ljava/net/DatagramSocket;->close()V

    .line 302
    .line 303
    .line 304
    :cond_5
    iget-boolean v0, p0, Lcom/friday/common/helper/e;->j:Z

    .line 305
    .line 306
    if-nez v0, :cond_7

    .line 307
    .line 308
    iget-object v0, p0, Lcom/friday/common/helper/e;->b:Lcom/friday/common/helper/e$b;

    .line 309
    .line 310
    if-eqz v0, :cond_6

    .line 311
    .line 312
    new-instance v3, Li2/a;

    .line 313
    .line 314
    invoke-direct {v3, v2, v2, v4}, Li2/a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 315
    .line 316
    .line 317
    invoke-interface {v0, v3}, Lcom/friday/common/helper/e$b;->a(Li2/a;)V

    .line 318
    .line 319
    .line 320
    :cond_6
    invoke-virtual {p0}, Lcom/friday/common/helper/e;->h()Lcom/friday/common/helper/e$c;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 325
    .line 326
    .line 327
    :cond_7
    move-object v3, v6

    .line 328
    goto/16 :goto_0

    .line 329
    .line 330
    :catch_1
    move-exception v0

    .line 331
    goto :goto_2

    .line 332
    :cond_8
    return-void

    .line 333
    :goto_2
    if-eqz v1, :cond_9

    .line 334
    .line 335
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager$MulticastLock;->isHeld()Z

    .line 336
    .line 337
    .line 338
    move-result v6

    .line 339
    if-ne v6, v5, :cond_9

    .line 340
    .line 341
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager$MulticastLock;->release()V

    .line 342
    .line 343
    .line 344
    :cond_9
    iget-boolean v1, p0, Lcom/friday/common/helper/e;->j:Z

    .line 345
    .line 346
    if-nez v1, :cond_b

    .line 347
    .line 348
    iget-object v1, p0, Lcom/friday/common/helper/e;->b:Lcom/friday/common/helper/e$b;

    .line 349
    .line 350
    if-eqz v1, :cond_a

    .line 351
    .line 352
    new-instance v5, Li2/a;

    .line 353
    .line 354
    invoke-direct {v5, v2, v2, v4}, Li2/a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 355
    .line 356
    .line 357
    invoke-interface {v1, v5}, Lcom/friday/common/helper/e$b;->a(Li2/a;)V

    .line 358
    .line 359
    .line 360
    :cond_a
    invoke-virtual {p0}, Lcom/friday/common/helper/e;->h()Lcom/friday/common/helper/e$c;

    .line 361
    .line 362
    .line 363
    move-result-object p0

    .line 364
    invoke-virtual {p0}, Landroid/os/CountDownTimer;->cancel()V

    .line 365
    .line 366
    .line 367
    :cond_b
    if-eqz v3, :cond_c

    .line 368
    .line 369
    invoke-virtual {v3}, Ljava/net/DatagramSocket;->isClosed()Z

    .line 370
    .line 371
    .line 372
    move-result p0

    .line 373
    if-nez p0, :cond_c

    .line 374
    .line 375
    invoke-virtual {v3}, Ljava/net/DatagramSocket;->close()V

    .line 376
    .line 377
    .line 378
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 379
    .line 380
    .line 381
    return-void
.end method


# virtual methods
.method public final g()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/friday/common/helper/e;->i:I

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    iput-boolean v1, p0, Lcom/friday/common/helper/e;->j:Z

    .line 6
    .line 7
    iget-object v1, p0, Lcom/friday/common/helper/e;->b:Lcom/friday/common/helper/e$b;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance v2, Li2/a;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v2, v3, v3, v0}, Li2/a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v2}, Lcom/friday/common/helper/e$b;->a(Li2/a;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/helper/e;->h()Lcom/friday/common/helper/e$c;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/friday/common/helper/e;->a:Ljava/lang/Thread;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    :catch_0
    :cond_1
    return-void
.end method

.method public final h()Lcom/friday/common/helper/e$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/helper/e;->h:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/common/helper/e$c;

    .line 8
    .line 9
    return-object v0
.end method

.method public final i(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const v1, 0x823a

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, v1, p1}, Lcom/friday/common/helper/e;->j(Ljava/lang/String;ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final j(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lcom/friday/common/helper/e;->g:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p1, p0, Lcom/friday/common/helper/e;->d:Ljava/lang/String;

    .line 4
    .line 5
    iput p2, p0, Lcom/friday/common/helper/e;->e:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/common/helper/e;->m()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final declared-synchronized m()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const/16 v0, 0x14

    .line 3
    .line 4
    :try_start_0
    iput v0, p0, Lcom/friday/common/helper/e;->i:I

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/friday/common/helper/e;->j:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/common/helper/e;->h()Lcom/friday/common/helper/e$c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/friday/common/helper/e;->h()Lcom/friday/common/helper/e$c;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 21
    .line 22
    .line 23
    new-instance v0, Ljava/lang/Thread;

    .line 24
    .line 25
    new-instance v1, Lf2/n;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Lf2/n;-><init>(Lcom/friday/common/helper/e;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/friday/common/helper/e;->a:Ljava/lang/Thread;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    monitor-exit p0

    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw v0
.end method

.method public final o(Lcom/friday/common/helper/e$b;)V
    .locals 1

    .line 1
    const-string v0, "onReceiveListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/common/helper/e;->b:Lcom/friday/common/helper/e$b;

    .line 7
    .line 8
    return-void
.end method
