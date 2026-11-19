.class Lcom/taobao/sophix/b/a/a/b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/taobao/sophix/b/a/a/b;->a(Ljava/io/File;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/io/File;

.field final synthetic b:Lcom/taobao/sophix/b/a/a/b;


# direct methods
.method public constructor <init>(Lcom/taobao/sophix/b/a/a/b;Ljava/io/File;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/taobao/sophix/b/a/a/b$1;->a:Ljava/io/File;

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
    .locals 14

    .line 1
    const-string v0, "patch"

    .line 2
    .line 3
    const-string v1, "ColdDexManager"

    .line 4
    .line 5
    const-string v2, "182"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v4

    .line 12
    iget-object v6, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 13
    .line 14
    iget-object v7, p0, Lcom/taobao/sophix/b/a/a/b$1;->a:Ljava/io/File;

    .line 15
    .line 16
    invoke-static {v6, v7}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;Ljava/io/File;)V

    .line 17
    .line 18
    .line 19
    iget-object v6, p0, Lcom/taobao/sophix/b/a/a/b$1;->a:Ljava/io/File;

    .line 20
    .line 21
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-virtual {v6}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    array-length v7, v6

    .line 30
    const-wide/16 v8, 0x0

    .line 31
    .line 32
    move v10, v3

    .line 33
    :goto_0
    if-ge v10, v7, :cond_2

    .line 34
    .line 35
    aget-object v11, v6, v10

    .line 36
    .line 37
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v12

    .line 41
    const-string v13, ".dex"

    .line 42
    .line 43
    invoke-virtual {v12, v13}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v12

    .line 47
    if-nez v12, :cond_0

    .line 48
    .line 49
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v12

    .line 53
    const-string v13, "sophix-merged.zip"

    .line 54
    .line 55
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    if-eqz v12, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception v4

    .line 63
    goto :goto_2

    .line 64
    :catch_0
    move-exception v4

    .line 65
    goto/16 :goto_3

    .line 66
    .line 67
    :cond_0
    :goto_1
    invoke-virtual {v11}, Ljava/io/File;->length()J

    .line 68
    .line 69
    .line 70
    move-result-wide v11

    .line 71
    add-long/2addr v8, v11

    .line 72
    :cond_1
    add-int/lit8 v10, v10, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    iget-object v6, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 76
    .line 77
    invoke-static {v6}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v6}, Lcom/taobao/sophix/c/c;->a()V

    .line 82
    .line 83
    .line 84
    iget-object v6, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 85
    .line 86
    invoke-static {v6}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    iput-wide v8, v6, Lcom/taobao/sophix/c/c;->g:J

    .line 91
    .line 92
    iget-object v6, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 93
    .line 94
    invoke-static {v6}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 99
    .line 100
    .line 101
    move-result-wide v7

    .line 102
    sub-long/2addr v7, v4

    .line 103
    iput-wide v7, v6, Lcom/taobao/sophix/c/c;->e:J

    .line 104
    .line 105
    iget-object v4, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 106
    .line 107
    invoke-static {v4}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const-string v5, "181"

    .line 112
    .line 113
    iput-object v5, v4, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    .line 114
    .line 115
    iget-object v4, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 116
    .line 117
    invoke-static {v4}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-static {v4}, Lcom/taobao/sophix/c/b;->a(Lcom/taobao/sophix/c/c;)V

    .line 122
    .line 123
    .line 124
    invoke-static {}, Lcom/taobao/sophix/b/a/a/b;->c()Lcom/taobao/sophix/listener/PatchLoadStatusListener;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    const-string v5, "preload success"

    .line 129
    .line 130
    iget-object v6, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 131
    .line 132
    invoke-static {v6}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    iget v6, v6, Lcom/taobao/sophix/c/c;->d:I

    .line 137
    .line 138
    const/16 v7, 0x64

    .line 139
    .line 140
    invoke-interface {v4, v3, v7, v5, v6}, Lcom/taobao/sophix/listener/PatchLoadStatusListener;->onLoad(IILjava/lang/String;I)V

    .line 141
    .line 142
    .line 143
    invoke-static {}, Lcom/taobao/sophix/b/a/a/b;->c()Lcom/taobao/sophix/listener/PatchLoadStatusListener;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    const-string v5, "relaunch app"

    .line 148
    .line 149
    iget-object v6, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 150
    .line 151
    invoke-static {v6}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    iget v6, v6, Lcom/taobao/sophix/c/c;->d:I

    .line 156
    .line 157
    const/16 v7, 0xc

    .line 158
    .line 159
    invoke-interface {v4, v3, v7, v5, v6}, Lcom/taobao/sophix/listener/PatchLoadStatusListener;->onLoad(IILjava/lang/String;I)V
    :try_end_0
    .catch Lcom/taobao/sophix/a/b; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :goto_2
    iget-object v5, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 164
    .line 165
    invoke-static {v5}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-virtual {v5}, Lcom/taobao/sophix/c/c;->a()V

    .line 170
    .line 171
    .line 172
    iget-object v5, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 173
    .line 174
    invoke-static {v5}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    iput-object v2, v5, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    .line 179
    .line 180
    iget-object v2, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 181
    .line 182
    invoke-static {v2}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    const/16 v5, 0x65

    .line 187
    .line 188
    iput v5, v2, Lcom/taobao/sophix/c/c;->i:I

    .line 189
    .line 190
    iget-object v2, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 191
    .line 192
    invoke-static {v2}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-static {v2}, Lcom/taobao/sophix/c/b;->a(Lcom/taobao/sophix/c/c;)V

    .line 197
    .line 198
    .line 199
    new-array v2, v3, [Ljava/lang/Object;

    .line 200
    .line 201
    invoke-static {v1, v0, v4, v2}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 202
    .line 203
    .line 204
    invoke-static {}, Lcom/taobao/sophix/b/a/a/b;->c()Lcom/taobao/sophix/listener/PatchLoadStatusListener;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    iget-object v2, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 213
    .line 214
    invoke-static {v2}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    iget v2, v2, Lcom/taobao/sophix/c/c;->d:I

    .line 219
    .line 220
    invoke-interface {v0, v3, v5, v1, v2}, Lcom/taobao/sophix/listener/PatchLoadStatusListener;->onLoad(IILjava/lang/String;I)V

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :goto_3
    iget-object v5, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 225
    .line 226
    invoke-static {v5}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-virtual {v5}, Lcom/taobao/sophix/c/c;->a()V

    .line 231
    .line 232
    .line 233
    iget-object v5, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 234
    .line 235
    invoke-static {v5}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    iput-object v2, v5, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    .line 240
    .line 241
    iget-object v2, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 242
    .line 243
    invoke-static {v2}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-virtual {v4}, Lcom/taobao/sophix/a/b;->a()I

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    iput v5, v2, Lcom/taobao/sophix/c/c;->i:I

    .line 252
    .line 253
    iget-object v2, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 254
    .line 255
    invoke-static {v2}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-static {v2}, Lcom/taobao/sophix/c/b;->a(Lcom/taobao/sophix/c/c;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v4}, Lcom/taobao/sophix/a/b;->a()I

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    const-string v5, "msg"

    .line 271
    .line 272
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v6

    .line 276
    const-string v7, "code"

    .line 277
    .line 278
    filled-new-array {v7, v2, v5, v6}, [Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-static {v1, v0, v4, v2}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 283
    .line 284
    .line 285
    invoke-static {}, Lcom/taobao/sophix/b/a/a/b;->c()Lcom/taobao/sophix/listener/PatchLoadStatusListener;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {v4}, Lcom/taobao/sophix/a/b;->a()I

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    iget-object v4, p0, Lcom/taobao/sophix/b/a/a/b$1;->b:Lcom/taobao/sophix/b/a/a/b;

    .line 298
    .line 299
    invoke-static {v4}, Lcom/taobao/sophix/b/a/a/b;->a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    iget v4, v4, Lcom/taobao/sophix/c/c;->d:I

    .line 304
    .line 305
    invoke-interface {v0, v3, v1, v2, v4}, Lcom/taobao/sophix/listener/PatchLoadStatusListener;->onLoad(IILjava/lang/String;I)V

    .line 306
    .line 307
    .line 308
    :goto_4
    return-void
.end method
