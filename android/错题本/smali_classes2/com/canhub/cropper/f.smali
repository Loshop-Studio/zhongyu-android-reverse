.class public final Lcom/canhub/cropper/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Z

.field public c:Z

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;IZZ)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/canhub/cropper/f;->d:Ljava/lang/Object;

    .line 5
    iput p2, p0, Lcom/canhub/cropper/f;->a:I

    .line 6
    iput-boolean p3, p0, Lcom/canhub/cropper/f;->b:Z

    .line 7
    iput-boolean p4, p0, Lcom/canhub/cropper/f;->c:Z

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const-string v0, "connectionSpecs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/canhub/cropper/f;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljavax/net/ssl/SSLSocket;)Lokhttp3/l;
    .locals 14

    .line 1
    iget v0, p0, Lcom/canhub/cropper/f;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/f;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    :goto_0
    const/4 v3, 0x1

    .line 12
    if-ge v0, v2, :cond_1

    .line 13
    .line 14
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, Lokhttp3/l;

    .line 19
    .line 20
    invoke-virtual {v4, p1}, Lokhttp3/l;->b(Ljavax/net/ssl/SSLSocket;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    add-int/2addr v0, v3

    .line 27
    iput v0, p0, Lcom/canhub/cropper/f;->a:I

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v4, 0x0

    .line 34
    :goto_1
    if-eqz v4, :cond_b

    .line 35
    .line 36
    iget v0, p0, Lcom/canhub/cropper/f;->a:I

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    :goto_2
    const/4 v5, 0x0

    .line 43
    if-ge v0, v2, :cond_3

    .line 44
    .line 45
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    check-cast v6, Lokhttp3/l;

    .line 50
    .line 51
    invoke-virtual {v6, p1}, Lokhttp3/l;->b(Ljavax/net/ssl/SSLSocket;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_2

    .line 56
    .line 57
    move v0, v3

    .line 58
    goto :goto_3

    .line 59
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    move v0, v5

    .line 63
    :goto_3
    iput-boolean v0, p0, Lcom/canhub/cropper/f;->b:Z

    .line 64
    .line 65
    iget-boolean v0, p0, Lcom/canhub/cropper/f;->c:Z

    .line 66
    .line 67
    iget-object v1, v4, Lokhttp3/l;->d:[Ljava/lang/String;

    .line 68
    .line 69
    iget-object v2, v4, Lokhttp3/l;->c:[Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    const-string/jumbo v7, "sslSocket.enabledCipherSuites"

    .line 78
    .line 79
    .line 80
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sget-object v7, Lokhttp3/j;->c:Lokhttp3/i;

    .line 84
    .line 85
    invoke-static {v6, v2, v7}, Lp7/c;->n([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    goto :goto_4

    .line 90
    :cond_4
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    :goto_4
    if-eqz v1, :cond_5

    .line 95
    .line 96
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    const-string/jumbo v8, "sslSocket.enabledProtocols"

    .line 101
    .line 102
    .line 103
    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    sget-object v8, Lf6/a;->b:Lf6/a;

    .line 107
    .line 108
    invoke-static {v7, v1, v8}, Lp7/c;->n([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    goto :goto_5

    .line 113
    :cond_5
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    :goto_5
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSupportedCipherSuites()[Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    const-string/jumbo v9, "supportedCipherSuites"

    .line 122
    .line 123
    .line 124
    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    sget-object v9, Lokhttp3/j;->c:Lokhttp3/i;

    .line 128
    .line 129
    sget-object v10, Lp7/c;->a:[B

    .line 130
    .line 131
    array-length v10, v8

    .line 132
    :goto_6
    const/4 v11, -0x1

    .line 133
    if-ge v5, v10, :cond_7

    .line 134
    .line 135
    aget-object v12, v8, v5

    .line 136
    .line 137
    const-string v13, "TLS_FALLBACK_SCSV"

    .line 138
    .line 139
    invoke-virtual {v9, v12, v13}, Lokhttp3/i;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    if-nez v12, :cond_6

    .line 144
    .line 145
    goto :goto_7

    .line 146
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_7
    move v5, v11

    .line 150
    :goto_7
    const-string v9, "cipherSuitesIntersection"

    .line 151
    .line 152
    if-eqz v0, :cond_8

    .line 153
    .line 154
    if-eq v5, v11, :cond_8

    .line 155
    .line 156
    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    aget-object v0, v8, v5

    .line 160
    .line 161
    const-string/jumbo v5, "supportedCipherSuites[indexOfFallbackScsv]"

    .line 162
    .line 163
    .line 164
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    array-length v5, v6

    .line 168
    add-int/2addr v5, v3

    .line 169
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    const-string v6, "copyOf(this, newSize)"

    .line 174
    .line 175
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    move-object v6, v5

    .line 179
    check-cast v6, [Ljava/lang/String;

    .line 180
    .line 181
    array-length v5, v6

    .line 182
    sub-int/2addr v5, v3

    .line 183
    aput-object v0, v6, v5

    .line 184
    .line 185
    :cond_8
    new-instance v0, Lokhttp3/k;

    .line 186
    .line 187
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 188
    .line 189
    .line 190
    iget-boolean v3, v4, Lokhttp3/l;->a:Z

    .line 191
    .line 192
    iput-boolean v3, v0, Lokhttp3/k;->a:Z

    .line 193
    .line 194
    iput-object v2, v0, Lokhttp3/k;->b:[Ljava/lang/String;

    .line 195
    .line 196
    iput-object v1, v0, Lokhttp3/k;->c:[Ljava/lang/String;

    .line 197
    .line 198
    iget-boolean v1, v4, Lokhttp3/l;->b:Z

    .line 199
    .line 200
    iput-boolean v1, v0, Lokhttp3/k;->d:Z

    .line 201
    .line 202
    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    array-length v1, v6

    .line 206
    invoke-static {v6, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    check-cast v1, [Ljava/lang/String;

    .line 211
    .line 212
    invoke-virtual {v0, v1}, Lokhttp3/k;->b([Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    const-string/jumbo v1, "tlsVersionsIntersection"

    .line 216
    .line 217
    .line 218
    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    array-length v1, v7

    .line 222
    invoke-static {v7, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    check-cast v1, [Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Lokhttp3/k;->d([Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0}, Lokhttp3/k;->a()Lokhttp3/l;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {v0}, Lokhttp3/l;->c()Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    if-eqz v1, :cond_9

    .line 240
    .line 241
    iget-object v1, v0, Lokhttp3/l;->d:[Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {p1, v1}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    :cond_9
    invoke-virtual {v0}, Lokhttp3/l;->a()Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    if-eqz v1, :cond_a

    .line 251
    .line 252
    iget-object v0, v0, Lokhttp3/l;->c:[Ljava/lang/String;

    .line 253
    .line 254
    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    :cond_a
    return-object v4

    .line 258
    :cond_b
    new-instance v0, Ljava/net/UnknownServiceException;

    .line 259
    .line 260
    new-instance v2, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    const-string v3, "Unable to find acceptable protocols. isFallback="

    .line 263
    .line 264
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    iget-boolean v3, p0, Lcom/canhub/cropper/f;->c:Z

    .line 268
    .line 269
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    const-string v3, ", modes="

    .line 273
    .line 274
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    const-string v1, ", supported protocols="

    .line 281
    .line 282
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    const-string/jumbo v1, "toString(this)"

    .line 297
    .line 298
    .line 299
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    invoke-direct {v0, p1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    throw v0
.end method
