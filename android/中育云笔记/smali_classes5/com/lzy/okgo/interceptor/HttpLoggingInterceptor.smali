.class public Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/s;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;
    }
.end annotation


# static fields
.field public static final d:Ljava/nio/charset/Charset;


# instance fields
.field public volatile a:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

.field public b:Ljava/util/logging/Level;

.field public c:Ljava/util/logging/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;->c:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->a:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->c:Ljava/util/logging/Logger;

    .line 13
    .line 14
    return-void
.end method

.method public static b(Lje/t;)Ljava/nio/charset/Charset;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object v0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lje/t;->c(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object p0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d:Ljava/nio/charset/Charset;

    .line 11
    .line 12
    :goto_0
    if-nez p0, :cond_1

    .line 13
    .line 14
    sget-object p0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d:Ljava/nio/charset/Charset;

    .line 15
    .line 16
    :cond_1
    return-object p0
.end method

.method public static c(Lje/t;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lje/t;->i()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lje/t;->i()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v3, "text"

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    return v2

    .line 25
    :cond_1
    invoke-virtual {p0}, Lje/t;->h()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-eqz p0, :cond_3

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v1, "x-www-form-urlencoded"

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    const-string v1, "json"

    .line 44
    .line 45
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    const-string v1, "xml"

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    const-string v1, "html"

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_3

    .line 66
    .line 67
    :cond_2
    return v2

    .line 68
    :cond_3
    return v0
.end method


# virtual methods
.method public final a(Lje/w;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lje/w;->h()Lje/w$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lje/w$a;->b()Lje/w;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lje/w;->a()Lje/x;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Lokio/Buffer;

    .line 17
    .line 18
    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lje/x;->writeTo(Lokio/BufferedSink;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lje/x;->contentType()Lje/t;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->b(Lje/t;)Ljava/nio/charset/Charset;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v2, "\tbody:"

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lokio/Buffer;->readString(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p0, p1}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :catch_0
    move-exception p1

    .line 58
    invoke-static {p1}, Lf7/c;->a(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->c:Ljava/util/logging/Logger;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->b:Ljava/util/logging/Level;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final e(Lje/w;Lje/h;)V
    .locals 10

    .line 1
    const-string v0, "--> END "

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->a:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

    .line 4
    .line 5
    sget-object v2, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;->f:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    move v1, v4

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v1, v3

    .line 14
    :goto_0
    iget-object v5, p0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->a:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

    .line 15
    .line 16
    if-eq v5, v2, :cond_2

    .line 17
    .line 18
    iget-object v2, p0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->a:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

    .line 19
    .line 20
    sget-object v5, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;->e:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

    .line 21
    .line 22
    if-ne v2, v5, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v2, v3

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    :goto_1
    move v2, v4

    .line 28
    :goto_2
    invoke-virtual {p1}, Lje/w;->a()Lje/x;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    if-eqz v5, :cond_3

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_3
    move v4, v3

    .line 36
    :goto_3
    if-eqz p2, :cond_4

    .line 37
    .line 38
    invoke-interface {p2}, Lje/h;->a()Lokhttp3/Protocol;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    goto :goto_4

    .line 43
    :cond_4
    sget-object p2, Lokhttp3/Protocol;->f:Lokhttp3/Protocol;

    .line 44
    .line 45
    :goto_4
    :try_start_0
    new-instance v6, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v7, "--> "

    .line 51
    .line 52
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lje/w;->g()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const/16 v7, 0x20

    .line 63
    .line 64
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lje/w;->j()Lje/r;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-virtual {p0, p2}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    if-eqz v2, :cond_a

    .line 88
    .line 89
    if-eqz v4, :cond_6

    .line 90
    .line 91
    invoke-virtual {v5}, Lje/x;->contentType()Lje/t;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    if-eqz p2, :cond_5

    .line 96
    .line 97
    new-instance p2, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v2, "\tContent-Type: "

    .line 103
    .line 104
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5}, Lje/x;->contentType()Lje/t;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-virtual {p0, p2}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto :goto_5

    .line 122
    :catchall_0
    move-exception p2

    .line 123
    goto/16 :goto_a

    .line 124
    .line 125
    :catch_0
    move-exception p2

    .line 126
    goto/16 :goto_9

    .line 127
    .line 128
    :cond_5
    :goto_5
    invoke-virtual {v5}, Lje/x;->contentLength()J

    .line 129
    .line 130
    .line 131
    move-result-wide v6

    .line 132
    const-wide/16 v8, -0x1

    .line 133
    .line 134
    cmp-long p2, v6, v8

    .line 135
    .line 136
    if-eqz p2, :cond_6

    .line 137
    .line 138
    new-instance p2, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    const-string v2, "\tContent-Length: "

    .line 144
    .line 145
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v5}, Lje/x;->contentLength()J

    .line 149
    .line 150
    .line 151
    move-result-wide v6

    .line 152
    invoke-virtual {p2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-virtual {p0, p2}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :cond_6
    invoke-virtual {p1}, Lje/w;->e()Lje/q;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-virtual {p2}, Lje/q;->size()I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    :goto_6
    if-ge v3, v2, :cond_8

    .line 171
    .line 172
    invoke-virtual {p2, v3}, Lje/q;->b(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    const-string v7, "Content-Type"

    .line 177
    .line 178
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v7

    .line 182
    if-nez v7, :cond_7

    .line 183
    .line 184
    const-string v7, "Content-Length"

    .line 185
    .line 186
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    if-nez v7, :cond_7

    .line 191
    .line 192
    new-instance v7, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    const-string v8, "\t"

    .line 198
    .line 199
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    const-string v6, ": "

    .line 206
    .line 207
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2, v3}, Lje/q;->f(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    invoke-virtual {p0, v6}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_8
    const-string p2, " "

    .line 228
    .line 229
    invoke-virtual {p0, p2}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    if-eqz v1, :cond_a

    .line 233
    .line 234
    if-eqz v4, :cond_a

    .line 235
    .line 236
    invoke-virtual {v5}, Lje/x;->contentType()Lje/t;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    invoke-static {p2}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->c(Lje/t;)Z

    .line 241
    .line 242
    .line 243
    move-result p2

    .line 244
    if-eqz p2, :cond_9

    .line 245
    .line 246
    invoke-virtual {p0, p1}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->a(Lje/w;)V

    .line 247
    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_9
    const-string p2, "\tbody: maybe [binary body], omitted!"

    .line 251
    .line 252
    invoke-virtual {p0, p2}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 253
    .line 254
    .line 255
    :cond_a
    :goto_7
    new-instance p2, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    :goto_8
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1}, Lje/w;->g()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    invoke-virtual {p0, p1}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    :goto_9
    :try_start_1
    invoke-static {p2}, Lf7/c;->a(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 279
    .line 280
    .line 281
    new-instance p2, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    goto :goto_8

    .line 287
    :goto_a
    new-instance v1, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {p1}, Lje/w;->g()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-virtual {p0, p1}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw p2
.end method

.method public final f(Lje/y;J)Lje/y;
    .locals 9

    .line 1
    const-string v0, "<-- END HTTP"

    .line 2
    .line 3
    invoke-virtual {p1}, Lje/y;->v()Lje/y$a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lje/y$a;->c()Lje/y;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lje/y;->e()Lje/z;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, p0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->a:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

    .line 16
    .line 17
    sget-object v4, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;->f:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x1

    .line 21
    if-ne v3, v4, :cond_0

    .line 22
    .line 23
    move v3, v6

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v3, v5

    .line 26
    :goto_0
    iget-object v7, p0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->a:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

    .line 27
    .line 28
    if-eq v7, v4, :cond_2

    .line 29
    .line 30
    iget-object v4, p0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->a:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

    .line 31
    .line 32
    sget-object v7, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;->e:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

    .line 33
    .line 34
    if-ne v4, v7, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v6, v5

    .line 38
    :cond_2
    :goto_1
    :try_start_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v7, "<-- "

    .line 44
    .line 45
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lje/y;->j()I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const/16 v7, 0x20

    .line 56
    .line 57
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Lje/y;->t()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Lje/y;->z()Lje/w;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-virtual {v7}, Lje/w;->j()Lje/r;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v7, " ("

    .line 82
    .line 83
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string p2, "ms\uff09"

    .line 90
    .line 91
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {p0, p2}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    if-eqz v6, :cond_6

    .line 102
    .line 103
    invoke-virtual {v1}, Lje/y;->r()Lje/q;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p2}, Lje/q;->size()I

    .line 108
    .line 109
    .line 110
    move-result p3

    .line 111
    :goto_2
    if-ge v5, p3, :cond_3

    .line 112
    .line 113
    new-instance v4, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    const-string v6, "\t"

    .line 119
    .line 120
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2, v5}, Lje/q;->b(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v6, ": "

    .line 131
    .line 132
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, v5}, Lje/q;->f(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {p0, v4}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    add-int/lit8 v5, v5, 0x1

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :catchall_0
    move-exception p1

    .line 153
    goto :goto_4

    .line 154
    :catch_0
    move-exception p2

    .line 155
    goto :goto_3

    .line 156
    :cond_3
    const-string p2, " "

    .line 157
    .line 158
    invoke-virtual {p0, p2}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    if-eqz v3, :cond_6

    .line 162
    .line 163
    invoke-static {v1}, Lpe/e;->a(Lje/y;)Z

    .line 164
    .line 165
    .line 166
    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    if-eqz p2, :cond_6

    .line 168
    .line 169
    if-nez v2, :cond_4

    .line 170
    .line 171
    invoke-virtual {p0, v0}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    return-object p1

    .line 175
    :cond_4
    :try_start_1
    invoke-virtual {v2}, Lje/z;->contentType()Lje/t;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    invoke-static {p2}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->c(Lje/t;)Z

    .line 180
    .line 181
    .line 182
    move-result p2

    .line 183
    if-eqz p2, :cond_5

    .line 184
    .line 185
    invoke-virtual {v2}, Lje/z;->byteStream()Ljava/io/InputStream;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    invoke-static {p2}, Lf7/b;->f(Ljava/io/InputStream;)[B

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    invoke-virtual {v2}, Lje/z;->contentType()Lje/t;

    .line 194
    .line 195
    .line 196
    move-result-object p3

    .line 197
    new-instance v1, Ljava/lang/String;

    .line 198
    .line 199
    invoke-static {p3}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->b(Lje/t;)Ljava/nio/charset/Charset;

    .line 200
    .line 201
    .line 202
    move-result-object p3

    .line 203
    invoke-direct {v1, p2, p3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 204
    .line 205
    .line 206
    new-instance p3, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    const-string v3, "\tbody:"

    .line 212
    .line 213
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p3

    .line 223
    invoke-virtual {p0, p3}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2}, Lje/z;->contentType()Lje/t;

    .line 227
    .line 228
    .line 229
    move-result-object p3

    .line 230
    invoke-static {p3, p2}, Lje/z;->create(Lje/t;[B)Lje/z;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    invoke-virtual {p1}, Lje/y;->v()Lje/y$a;

    .line 235
    .line 236
    .line 237
    move-result-object p3

    .line 238
    invoke-virtual {p3, p2}, Lje/y$a;->b(Lje/z;)Lje/y$a;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    invoke-virtual {p2}, Lje/y$a;->c()Lje/y;

    .line 243
    .line 244
    .line 245
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 246
    invoke-virtual {p0, v0}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    return-object p1

    .line 250
    :cond_5
    :try_start_2
    const-string p2, "\tbody: maybe [binary body], omitted!"

    .line 251
    .line 252
    invoke-virtual {p0, p2}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 253
    .line 254
    .line 255
    :cond_6
    invoke-virtual {p0, v0}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    return-object p1

    .line 259
    :goto_3
    :try_start_3
    invoke-static {p2}, Lf7/c;->a(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 260
    .line 261
    .line 262
    invoke-virtual {p0, v0}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    return-object p1

    .line 266
    :goto_4
    invoke-virtual {p0, v0}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw p1
.end method

.method public g(Ljava/util/logging/Level;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->b:Ljava/util/logging/Level;

    .line 2
    .line 3
    return-void
.end method

.method public h(Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->a:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->a:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 9
    .line 10
    const-string v0, "printLevel == null. Use Level.NONE instead."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
.end method

.method public intercept(Lje/s$a;)Lje/y;
    .locals 5

    .line 1
    invoke-interface {p1}, Lje/s$a;->request()Lje/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->a:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

    .line 6
    .line 7
    sget-object v2, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;->c:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    invoke-interface {p1, v0}, Lje/s$a;->a(Lje/w;)Lje/y;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-interface {p1}, Lje/s$a;->b()Lje/h;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p0, v0, v1}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->e(Lje/w;Lje/h;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    :try_start_0
    invoke-interface {p1, v0}, Lje/s$a;->a(Lje/w;)Lje/y;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 32
    .line 33
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    sub-long/2addr v3, v1

    .line 38
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    invoke-virtual {p0, p1, v0, v1}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->f(Lje/y;J)Lje/y;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :catch_0
    move-exception p1

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v1, "<-- HTTP FAILED: "

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p0, v0}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->d(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1
.end method
