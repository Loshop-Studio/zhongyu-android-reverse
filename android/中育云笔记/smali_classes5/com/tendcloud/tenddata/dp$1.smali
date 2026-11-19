.class Lcom/tendcloud/tenddata/dp$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/dp;->getShortUrl(Lcom/tendcloud/tenddata/TDGenerateUrl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/dp;

.field final synthetic val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/dp;Lcom/tendcloud/tenddata/TDGenerateUrl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/dp$1;->this$0:Lcom/tendcloud/tenddata/dp;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/tendcloud/tenddata/dp$1;->val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 3
    .line 4
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v2, p0, Lcom/tendcloud/tenddata/dp$1;->this$0:Lcom/tendcloud/tenddata/dp;

    .line 8
    .line 9
    invoke-static {v2}, Lcom/tendcloud/tenddata/dp;->a(Lcom/tendcloud/tenddata/dp;)Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Ljava/lang/String;

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v1

    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_0
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 59
    .line 60
    .line 61
    move-result-wide v3

    .line 62
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    iget-object v4, p0, Lcom/tendcloud/tenddata/dp$1;->this$0:Lcom/tendcloud/tenddata/dp;

    .line 67
    .line 68
    invoke-static {v4, v1, v3}, Lcom/tendcloud/tenddata/dp;->a(Lcom/tendcloud/tenddata/dp;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v4, Ljava/net/URL;

    .line 73
    .line 74
    new-instance v5, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v6, "https://api.talkingdata.com/adt/openapi/rest/socialSharing/getShortUrl?sign="

    .line 80
    .line 81
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v1, "&nonce="

    .line 88
    .line 89
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-direct {v4, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    new-instance v1, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string v3, "Short url serve: "

    .line 108
    .line 109
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    filled-new-array {v1}, [Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-static {v1}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    check-cast v1, Ljava/net/HttpURLConnection;

    .line 131
    .line 132
    const/16 v3, 0xbb8

    .line 133
    .line 134
    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 135
    .line 136
    .line 137
    const/16 v3, 0x3a98

    .line 138
    .line 139
    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 140
    .line 141
    .line 142
    const/4 v3, 0x1

    .line 143
    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 147
    .line 148
    .line 149
    const-string v3, "POST"

    .line 150
    .line 151
    invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    const/4 v3, 0x0

    .line 155
    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 156
    .line 157
    .line 158
    const-string v3, "Content-Type"

    .line 159
    .line 160
    const-string v4, "application/json"

    .line 161
    .line 162
    invoke-virtual {v1, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    const-string v3, "Content-Length"

    .line 166
    .line 167
    array-length v4, v2

    .line 168
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-virtual {v1, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-virtual {v3, v2}, Ljava/io/OutputStream;->write([B)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    const/16 v3, 0xc8

    .line 187
    .line 188
    if-ne v2, v3, :cond_3

    .line 189
    .line 190
    new-instance v2, Ljava/io/BufferedReader;

    .line 191
    .line 192
    new-instance v4, Ljava/io/InputStreamReader;

    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-direct {v4, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 199
    .line 200
    .line 201
    invoke-direct {v2, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 202
    .line 203
    .line 204
    new-instance v1, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 207
    .line 208
    .line 209
    :goto_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    if-eqz v4, :cond_1

    .line 214
    .line 215
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    const-string v2, "TD getShortUrl success:"

    .line 224
    .line 225
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-static {v2}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    new-instance v2, Lorg/json/JSONObject;

    .line 233
    .line 234
    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    const-string v4, "code"

    .line 238
    .line 239
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    if-eq v4, v3, :cond_2

    .line 244
    .line 245
    const-string v2, "TD getShortUrl Error:"

    .line 246
    .line 247
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-static {v1}, Lcom/tendcloud/tenddata/ca;->eForInternal([Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    iget-object v1, p0, Lcom/tendcloud/tenddata/dp$1;->val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;

    .line 255
    .line 256
    invoke-interface {v1, v0}, Lcom/tendcloud/tenddata/TDGenerateUrl;->callback(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :cond_2
    iget-object v1, p0, Lcom/tendcloud/tenddata/dp$1;->val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;

    .line 261
    .line 262
    const-string v3, "result"

    .line 263
    .line 264
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    invoke-interface {v1, v2}, Lcom/tendcloud/tenddata/TDGenerateUrl;->callback(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 273
    .line 274
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 275
    .line 276
    .line 277
    const-string v3, "TD getShortUrl Http Error:"

    .line 278
    .line 279
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    filled-new-array {v1}, [Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-static {v1}, Lcom/tendcloud/tenddata/ca;->eForInternal([Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    iget-object v1, p0, Lcom/tendcloud/tenddata/dp$1;->val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;

    .line 297
    .line 298
    invoke-interface {v1, v0}, Lcom/tendcloud/tenddata/TDGenerateUrl;->callback(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 303
    .line 304
    .line 305
    iget-object v1, p0, Lcom/tendcloud/tenddata/dp$1;->val$generateUrl:Lcom/tendcloud/tenddata/TDGenerateUrl;

    .line 306
    .line 307
    invoke-interface {v1, v0}, Lcom/tendcloud/tenddata/TDGenerateUrl;->callback(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    return-void
.end method
