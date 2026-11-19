.class public Lg2/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg2/o0$b;
    }
.end annotation


# static fields
.field public static f:Landroid/content/Context;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public e:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x80

    .line 3
    iput v0, p0, Lg2/o0;->a:I

    const/16 v0, 0x100

    .line 4
    iput v0, p0, Lg2/o0;->b:I

    const/16 v0, 0x400

    .line 5
    iput v0, p0, Lg2/o0;->c:I

    const/16 v0, 0xa

    .line 6
    iput v0, p0, Lg2/o0;->d:I

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lg2/o0;->e:Lorg/json/JSONObject;

    .line 8
    :try_start_0
    sget-object v0, Lg2/o0;->f:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lg2/o0;->g(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public synthetic constructor <init>(Lg2/o0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lg2/o0;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lg2/o0;
    .locals 1

    .line 1
    sget-object v0, Lg2/o0;->f:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sput-object p0, Lg2/o0;->f:Landroid/content/Context;

    .line 12
    .line 13
    :cond_0
    invoke-static {}, Lg2/o0$b;->a()Lg2/o0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 6

    .line 1
    :try_start_0
    sget-object v0, Lg2/o0;->f:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "track_list"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_4

    .line 16
    .line 17
    const-string v1, "!"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Lorg/json/JSONObject;

    .line 24
    .line 25
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lg2/o0;->e:Lorg/json/JSONObject;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    move v2, v3

    .line 34
    :goto_0
    array-length v4, v0

    .line 35
    if-ge v2, v4, :cond_1

    .line 36
    .line 37
    aget-object v4, v0, v2

    .line 38
    .line 39
    const/16 v5, 0x80

    .line 40
    .line 41
    invoke-static {v4, v5}, Lv2/c;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    iget-object v5, p0, Lg2/o0;->e:Lorg/json/JSONObject;

    .line 46
    .line 47
    invoke-virtual {v5, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_0

    .line 52
    .line 53
    iget-object v5, p0, Lg2/o0;->e:Lorg/json/JSONObject;

    .line 54
    .line 55
    invoke-virtual {v5, v4}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    new-instance v2, Lorg/json/JSONObject;

    .line 66
    .line 67
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v2, p0, Lg2/o0;->e:Lorg/json/JSONObject;

    .line 71
    .line 72
    array-length v2, v0

    .line 73
    const/16 v4, 0xa

    .line 74
    .line 75
    if-lt v2, v4, :cond_2

    .line 76
    .line 77
    :goto_1
    if-ge v3, v4, :cond_3

    .line 78
    .line 79
    aget-object v2, v0, v3

    .line 80
    .line 81
    invoke-virtual {p0, v2, v1}, Lg2/o0;->d(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v3, v3, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    :goto_2
    array-length v2, v0

    .line 88
    if-ge v3, v2, :cond_3

    .line 89
    .line 90
    aget-object v2, v0, v3

    .line 91
    .line 92
    invoke-virtual {p0, v2, v1}, Lg2/o0;->d(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 93
    .line 94
    .line 95
    add-int/lit8 v3, v3, 0x1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    sget-object v0, Lg2/o0;->f:Landroid/content/Context;

    .line 99
    .line 100
    invoke-virtual {p0, v0}, Lg2/o0;->j(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    .line 103
    :catch_0
    :cond_4
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/util/Map;JLjava/lang/String;Z)V
    .locals 8

    .line 1
    const-string v0, "ts"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, p1}, Lg2/o0;->f(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    const-string v2, "\\|"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    :try_start_1
    sget-object p1, Lg2/g0;->f:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p1, v3, v2}, Lm2/f;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0, p2}, Lg2/o0;->i(Ljava/util/Map;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto/16 :goto_9

    .line 25
    .line 26
    :cond_1
    invoke-interface {p2}, Ljava/util/Map;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/16 v4, 0x64

    .line 31
    .line 32
    if-le v1, v4, :cond_2

    .line 33
    .line 34
    new-instance p1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string p3, "map size is "

    .line 40
    .line 41
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-interface {p2}, Ljava/util/Map;->size()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string p2, ", please check"

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1}, Lv2/d;->c(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    sget-object v1, Lg2/y;->b:[Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_3

    .line 75
    .line 76
    new-instance p2, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    const-string p3, "key is "

    .line 82
    .line 83
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string p1, ", please check key, illegal"

    .line 90
    .line 91
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {p1}, Lv2/d;->c(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    sget-object p1, Lg2/g0;->b:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {p1, v3, v2}, Lm2/f;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_3
    new-instance v1, Lorg/json/JSONObject;

    .line 108
    .line 109
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 110
    .line 111
    .line 112
    const-string v4, "id"

    .line 113
    .line 114
    invoke-virtual {v1, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 118
    .line 119
    .line 120
    move-result-wide v4

    .line 121
    invoke-virtual {v1, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    const-wide/16 v4, 0x0

    .line 125
    .line 126
    cmp-long v4, p3, v4

    .line 127
    .line 128
    if-lez v4, :cond_4

    .line 129
    .line 130
    const-string v4, "du"

    .line 131
    .line 132
    invoke-virtual {v1, v4, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 133
    .line 134
    .line 135
    :cond_4
    const-string p3, "__t"

    .line 136
    .line 137
    const/16 p4, 0x801

    .line 138
    .line 139
    invoke-virtual {v1, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 140
    .line 141
    .line 142
    new-instance p3, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    const-string p4, "befort ekv map, event is "

    .line 148
    .line 149
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p4

    .line 156
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p3

    .line 163
    invoke-static {p3}, Lv2/f;->g(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result p3

    .line 178
    if-eqz p3, :cond_1d

    .line 179
    .line 180
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p3

    .line 184
    check-cast p3, Ljava/util/Map$Entry;

    .line 185
    .line 186
    sget-object p4, Lg2/y;->b:[Ljava/lang/String;

    .line 187
    .line 188
    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object p4

    .line 192
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-interface {p4, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result p4

    .line 200
    if-nez p4, :cond_1c

    .line 201
    .line 202
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p4

    .line 206
    instance-of v4, p4, Ljava/lang/String;

    .line 207
    .line 208
    if-nez v4, :cond_1b

    .line 209
    .line 210
    instance-of v4, p4, Ljava/lang/Integer;

    .line 211
    .line 212
    if-nez v4, :cond_1b

    .line 213
    .line 214
    instance-of v4, p4, Ljava/lang/Long;

    .line 215
    .line 216
    if-nez v4, :cond_1b

    .line 217
    .line 218
    instance-of v4, p4, Ljava/lang/Short;

    .line 219
    .line 220
    if-nez v4, :cond_1b

    .line 221
    .line 222
    instance-of v4, p4, Ljava/lang/Float;

    .line 223
    .line 224
    if-nez v4, :cond_1b

    .line 225
    .line 226
    instance-of v4, p4, Ljava/lang/Double;

    .line 227
    .line 228
    if-eqz v4, :cond_5

    .line 229
    .line 230
    goto/16 :goto_7

    .line 231
    .line 232
    :cond_5
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    .line 237
    .line 238
    .line 239
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 240
    const-string v5, "please check key or value, illegal type!"

    .line 241
    .line 242
    if-eqz v4, :cond_1a

    .line 243
    .line 244
    :try_start_2
    instance-of v4, p4, [I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 245
    .line 246
    const-string v6, "please check key or value, size overlength!"

    .line 247
    .line 248
    const/16 v7, 0xa

    .line 249
    .line 250
    if-eqz v4, :cond_8

    .line 251
    .line 252
    :try_start_3
    check-cast p4, [I

    .line 253
    .line 254
    array-length v4, p4

    .line 255
    if-le v4, v7, :cond_6

    .line 256
    .line 257
    invoke-static {v6}, Lv2/d;->c(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    return-void

    .line 261
    :cond_6
    new-instance v4, Lorg/json/JSONArray;

    .line 262
    .line 263
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 264
    .line 265
    .line 266
    move v5, v3

    .line 267
    :goto_1
    array-length v6, p4

    .line 268
    if-ge v5, v6, :cond_7

    .line 269
    .line 270
    aget v6, p4, v5

    .line 271
    .line 272
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 273
    .line 274
    .line 275
    add-int/lit8 v5, v5, 0x1

    .line 276
    .line 277
    goto :goto_1

    .line 278
    :cond_7
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p3

    .line 282
    check-cast p3, Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {v1, p3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 285
    .line 286
    .line 287
    goto :goto_0

    .line 288
    :cond_8
    instance-of v4, p4, [D

    .line 289
    .line 290
    if-eqz v4, :cond_b

    .line 291
    .line 292
    check-cast p4, [D

    .line 293
    .line 294
    array-length v4, p4

    .line 295
    if-le v4, v7, :cond_9

    .line 296
    .line 297
    invoke-static {v6}, Lv2/d;->c(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    return-void

    .line 301
    :cond_9
    new-instance v4, Lorg/json/JSONArray;

    .line 302
    .line 303
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 304
    .line 305
    .line 306
    move v5, v3

    .line 307
    :goto_2
    array-length v6, p4

    .line 308
    if-ge v5, v6, :cond_a

    .line 309
    .line 310
    aget-wide v6, p4, v5

    .line 311
    .line 312
    invoke-virtual {v4, v6, v7}, Lorg/json/JSONArray;->put(D)Lorg/json/JSONArray;

    .line 313
    .line 314
    .line 315
    add-int/lit8 v5, v5, 0x1

    .line 316
    .line 317
    goto :goto_2

    .line 318
    :cond_a
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object p3

    .line 322
    check-cast p3, Ljava/lang/String;

    .line 323
    .line 324
    invoke-virtual {v1, p3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 325
    .line 326
    .line 327
    goto/16 :goto_0

    .line 328
    .line 329
    :cond_b
    instance-of v4, p4, [J

    .line 330
    .line 331
    if-eqz v4, :cond_e

    .line 332
    .line 333
    check-cast p4, [J

    .line 334
    .line 335
    array-length v4, p4

    .line 336
    if-le v4, v7, :cond_c

    .line 337
    .line 338
    invoke-static {v6}, Lv2/d;->c(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    return-void

    .line 342
    :cond_c
    new-instance v4, Lorg/json/JSONArray;

    .line 343
    .line 344
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 345
    .line 346
    .line 347
    move v5, v3

    .line 348
    :goto_3
    array-length v6, p4

    .line 349
    if-ge v5, v6, :cond_d

    .line 350
    .line 351
    aget-wide v6, p4, v5

    .line 352
    .line 353
    invoke-virtual {v4, v6, v7}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 354
    .line 355
    .line 356
    add-int/lit8 v5, v5, 0x1

    .line 357
    .line 358
    goto :goto_3

    .line 359
    :cond_d
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object p3

    .line 363
    check-cast p3, Ljava/lang/String;

    .line 364
    .line 365
    invoke-virtual {v1, p3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 366
    .line 367
    .line 368
    goto/16 :goto_0

    .line 369
    .line 370
    :cond_e
    instance-of v4, p4, [F

    .line 371
    .line 372
    if-eqz v4, :cond_11

    .line 373
    .line 374
    check-cast p4, [F

    .line 375
    .line 376
    array-length v4, p4

    .line 377
    if-le v4, v7, :cond_f

    .line 378
    .line 379
    invoke-static {v6}, Lv2/d;->c(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    return-void

    .line 383
    :cond_f
    new-instance v4, Lorg/json/JSONArray;

    .line 384
    .line 385
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 386
    .line 387
    .line 388
    move v5, v3

    .line 389
    :goto_4
    array-length v6, p4

    .line 390
    if-ge v5, v6, :cond_10

    .line 391
    .line 392
    aget v6, p4, v5

    .line 393
    .line 394
    float-to-double v6, v6

    .line 395
    invoke-virtual {v4, v6, v7}, Lorg/json/JSONArray;->put(D)Lorg/json/JSONArray;

    .line 396
    .line 397
    .line 398
    add-int/lit8 v5, v5, 0x1

    .line 399
    .line 400
    goto :goto_4

    .line 401
    :cond_10
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object p3

    .line 405
    check-cast p3, Ljava/lang/String;

    .line 406
    .line 407
    invoke-virtual {v1, p3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 408
    .line 409
    .line 410
    goto/16 :goto_0

    .line 411
    .line 412
    :cond_11
    instance-of v4, p4, [S

    .line 413
    .line 414
    if-eqz v4, :cond_14

    .line 415
    .line 416
    check-cast p4, [S

    .line 417
    .line 418
    array-length v4, p4

    .line 419
    if-le v4, v7, :cond_12

    .line 420
    .line 421
    invoke-static {v6}, Lv2/d;->c(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    return-void

    .line 425
    :cond_12
    new-instance v4, Lorg/json/JSONArray;

    .line 426
    .line 427
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 428
    .line 429
    .line 430
    move v5, v3

    .line 431
    :goto_5
    array-length v6, p4

    .line 432
    if-ge v5, v6, :cond_13

    .line 433
    .line 434
    aget-short v6, p4, v5

    .line 435
    .line 436
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 437
    .line 438
    .line 439
    add-int/lit8 v5, v5, 0x1

    .line 440
    .line 441
    goto :goto_5

    .line 442
    :cond_13
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object p3

    .line 446
    check-cast p3, Ljava/lang/String;

    .line 447
    .line 448
    invoke-virtual {v1, p3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 449
    .line 450
    .line 451
    goto/16 :goto_0

    .line 452
    .line 453
    :cond_14
    instance-of v4, p4, [Ljava/lang/String;

    .line 454
    .line 455
    if-eqz v4, :cond_19

    .line 456
    .line 457
    check-cast p4, [Ljava/lang/String;

    .line 458
    .line 459
    array-length v4, p4

    .line 460
    if-le v4, v7, :cond_15

    .line 461
    .line 462
    invoke-static {v6}, Lv2/d;->c(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    return-void

    .line 466
    :cond_15
    new-instance v4, Lorg/json/JSONArray;

    .line 467
    .line 468
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 469
    .line 470
    .line 471
    move v5, v3

    .line 472
    :goto_6
    array-length v6, p4

    .line 473
    if-ge v5, v6, :cond_18

    .line 474
    .line 475
    aget-object v6, p4, v5

    .line 476
    .line 477
    if-nez v6, :cond_16

    .line 478
    .line 479
    const-string p1, "please check array, null item!"

    .line 480
    .line 481
    invoke-static {p1}, Lv2/d;->c(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    return-void

    .line 485
    :cond_16
    invoke-virtual {p0, v6}, Lg2/o0;->h(Ljava/lang/String;)Z

    .line 486
    .line 487
    .line 488
    move-result v6

    .line 489
    if-nez v6, :cond_17

    .line 490
    .line 491
    goto/16 :goto_9

    .line 492
    .line 493
    :cond_17
    aget-object v6, p4, v5

    .line 494
    .line 495
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 496
    .line 497
    .line 498
    add-int/lit8 v5, v5, 0x1

    .line 499
    .line 500
    goto :goto_6

    .line 501
    :cond_18
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object p3

    .line 505
    check-cast p3, Ljava/lang/String;

    .line 506
    .line 507
    invoke-virtual {v1, p3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 508
    .line 509
    .line 510
    goto/16 :goto_0

    .line 511
    .line 512
    :cond_19
    invoke-static {v5}, Lv2/d;->c(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    return-void

    .line 516
    :cond_1a
    invoke-static {v5}, Lv2/d;->c(Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    return-void

    .line 520
    :cond_1b
    :goto_7
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object p3

    .line 524
    check-cast p3, Ljava/lang/String;

    .line 525
    .line 526
    invoke-virtual {v1, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 527
    .line 528
    .line 529
    goto/16 :goto_0

    .line 530
    .line 531
    :cond_1c
    sget-object p1, Lg2/g0;->e:Ljava/lang/String;

    .line 532
    .line 533
    invoke-static {p1, v3, v2}, Lm2/f;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 534
    .line 535
    .line 536
    return-void

    .line 537
    :cond_1d
    sget-object p2, Lg2/o0;->f:Landroid/content/Context;

    .line 538
    .line 539
    invoke-static {p2}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 540
    .line 541
    .line 542
    move-result p2

    .line 543
    if-eqz p2, :cond_1e

    .line 544
    .line 545
    invoke-static {}, Lcom/umeng/analytics/pro/g;->b()Lcom/umeng/analytics/pro/g;

    .line 546
    .line 547
    .line 548
    move-result-object p2

    .line 549
    sget-object p3, Lg2/o0;->f:Landroid/content/Context;

    .line 550
    .line 551
    invoke-static {p3}, Ls2/a;->b(Landroid/content/Context;)Landroid/content/Context;

    .line 552
    .line 553
    .line 554
    move-result-object p3

    .line 555
    invoke-virtual {p2, p3}, Lcom/umeng/analytics/pro/g;->i(Landroid/content/Context;)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object p2

    .line 559
    goto :goto_8

    .line 560
    :cond_1e
    invoke-static {}, Lcom/umeng/analytics/pro/g;->b()Lcom/umeng/analytics/pro/g;

    .line 561
    .line 562
    .line 563
    move-result-object p2

    .line 564
    sget-object p3, Lg2/o0;->f:Landroid/content/Context;

    .line 565
    .line 566
    invoke-static {p3}, Ls2/a;->b(Landroid/content/Context;)Landroid/content/Context;

    .line 567
    .line 568
    .line 569
    move-result-object p3

    .line 570
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 571
    .line 572
    .line 573
    move-result-wide v4

    .line 574
    invoke-virtual {p2, p3, v4, v5}, Lcom/umeng/analytics/pro/g;->d(Landroid/content/Context;J)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object p2

    .line 578
    :goto_8
    const-string p3, "__i"

    .line 579
    .line 580
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 581
    .line 582
    .line 583
    move-result p4

    .line 584
    if-eqz p4, :cond_1f

    .line 585
    .line 586
    const-string p2, "-1"

    .line 587
    .line 588
    :cond_1f
    invoke-virtual {v1, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 589
    .line 590
    .line 591
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 592
    .line 593
    .line 594
    move-result p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 595
    if-nez p2, :cond_20

    .line 596
    .line 597
    :try_start_4
    new-instance p2, Lorg/json/JSONObject;

    .line 598
    .line 599
    invoke-direct {p2, p5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {p2}, Lorg/json/JSONObject;->length()I

    .line 603
    .line 604
    .line 605
    move-result p3

    .line 606
    if-lez p3, :cond_20

    .line 607
    .line 608
    const-string p3, "_$sp"

    .line 609
    .line 610
    invoke-virtual {v1, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 611
    .line 612
    .line 613
    :catch_0
    :cond_20
    :try_start_5
    const-string p2, "ds"

    .line 614
    .line 615
    invoke-virtual {v1, p2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 616
    .line 617
    .line 618
    const-string p2, "pn"

    .line 619
    .line 620
    sget-object p3, Lg2/o0;->f:Landroid/content/Context;

    .line 621
    .line 622
    invoke-static {p3}, Ls2/a;->e(Landroid/content/Context;)Ls2/a;

    .line 623
    .line 624
    .line 625
    move-result-object p3

    .line 626
    sget-object p4, Lg2/o0;->f:Landroid/content/Context;

    .line 627
    .line 628
    invoke-virtual {p3, p4}, Ls2/a;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object p3

    .line 632
    invoke-virtual {v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 633
    .line 634
    .line 635
    invoke-virtual {p0}, Lg2/o0;->b()V

    .line 636
    .line 637
    .line 638
    iget-object p2, p0, Lg2/o0;->e:Lorg/json/JSONObject;

    .line 639
    .line 640
    if-eqz p2, :cond_21

    .line 641
    .line 642
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 643
    .line 644
    .line 645
    move-result p2

    .line 646
    if-eqz p2, :cond_21

    .line 647
    .line 648
    iget-object p2, p0, Lg2/o0;->e:Lorg/json/JSONObject;

    .line 649
    .line 650
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object p2

    .line 654
    check-cast p2, Ljava/lang/Boolean;

    .line 655
    .line 656
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 657
    .line 658
    .line 659
    move-result p2

    .line 660
    if-nez p2, :cond_21

    .line 661
    .line 662
    const-string p2, "$st_fl"

    .line 663
    .line 664
    const/4 p3, 0x1

    .line 665
    invoke-virtual {v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 666
    .line 667
    .line 668
    iget-object p2, p0, Lg2/o0;->e:Lorg/json/JSONObject;

    .line 669
    .line 670
    invoke-virtual {p2, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 671
    .line 672
    .line 673
    sget-object p1, Lg2/o0;->f:Landroid/content/Context;

    .line 674
    .line 675
    invoke-virtual {p0, p1}, Lg2/o0;->j(Landroid/content/Context;)V

    .line 676
    .line 677
    .line 678
    :cond_21
    new-instance p1, Ljava/lang/StringBuilder;

    .line 679
    .line 680
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 681
    .line 682
    .line 683
    const-string p2, "----->>>>>ekv event json is "

    .line 684
    .line 685
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object p2

    .line 692
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object p1

    .line 699
    invoke-static {p1}, Lv2/f;->g(Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    if-nez p6, :cond_22

    .line 703
    .line 704
    sget-object p1, Lg2/o0;->f:Landroid/content/Context;

    .line 705
    .line 706
    invoke-static {p1}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 707
    .line 708
    .line 709
    move-result-object p2

    .line 710
    const/16 p3, 0x1001

    .line 711
    .line 712
    invoke-static {p1, p3, p2, v1}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 713
    .line 714
    .line 715
    goto :goto_9

    .line 716
    :cond_22
    sget-object p1, Lg2/o0;->f:Landroid/content/Context;

    .line 717
    .line 718
    invoke-static {p1}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 719
    .line 720
    .line 721
    move-result-object p2

    .line 722
    const/16 p3, 0x1103

    .line 723
    .line 724
    invoke-static {p1, p3, p2, v1}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 725
    .line 726
    .line 727
    :catchall_0
    :goto_9
    return-void
.end method

.method public final d(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv2/c;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-virtual {p0, p1, p2}, Lg2/o0;->e(Ljava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const/4 p2, 0x0

    .line 28
    invoke-virtual {p0, p1, p2}, Lg2/o0;->e(Ljava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final e(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "$st_fl"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "du"

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string v0, "id"

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const-string v0, "ts"

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lg2/o0;->e:Lorg/json/JSONObject;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    iget-object v0, p0, Lg2/o0;->e:Lorg/json/JSONObject;

    .line 42
    .line 43
    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    :catch_0
    :cond_0
    return-void
.end method

.method public final f(Ljava/lang/String;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    array-length v0, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    const/16 v1, 0x80

    .line 15
    .line 16
    if-gt v0, v1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :catch_0
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v1, "key is "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p1, ", please check key, illegal"

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, Lv2/d;->c(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    return p1
.end method

.method public final g(Landroid/content/Context;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "fs_lc_tl_uapp"

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Lorg/json/JSONObject;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lg2/o0;->e:Lorg/json/JSONObject;

    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Lg2/o0;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    :catch_0
    return-void
.end method

.method public final h(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    array-length v1, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    const/16 v2, 0x100

    .line 15
    .line 16
    if-gt v1, v2, :cond_1

    .line 17
    .line 18
    return v0

    .line 19
    :catch_0
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v1, "value is "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p1, ", please check value, illegal"

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Lv2/d;->c(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    return p1
.end method

.method public final i(Ljava/util/Map;)Z
    .locals 5

    .line 1
    const-string v0, "\\|"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_6

    .line 5
    .line 6
    :try_start_0
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    goto/16 :goto_0

    .line 13
    .line 14
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_7

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/util/Map$Entry;

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p0, v3}, Lg2/o0;->f(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-nez v3, :cond_2

    .line 45
    .line 46
    sget-object p1, Lg2/g0;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p1, v1, v0}, Lm2/f;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return v1

    .line 52
    :cond_2
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-nez v3, :cond_3

    .line 57
    .line 58
    sget-object p1, Lg2/g0;->i:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {p1, v1, v0}, Lm2/f;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return v1

    .line 64
    :cond_3
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    instance-of v3, v3, Ljava/lang/String;

    .line 69
    .line 70
    if-eqz v3, :cond_1

    .line 71
    .line 72
    const-string v3, "_$!link"

    .line 73
    .line 74
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_4

    .line 83
    .line 84
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {p0, v2}, Lg2/o0;->k(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_1

    .line 97
    .line 98
    const-string p1, "MobclickAgent.onDeepLinkReceived\u65b9\u6cd5link\u53c2\u6570\u957f\u5ea6\u8d85\u8fc7\u9650\u5236\u3002|\u53c2\u6570link\u957f\u5ea6\u4e0d\u80fd\u8d85\u8fc71024\u5b57\u7b26\u3002"

    .line 99
    .line 100
    invoke-static {p1, v1, v0}, Lm2/f;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return v1

    .line 104
    :cond_4
    const-string v3, "_$!url"

    .line 105
    .line 106
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_5

    .line 115
    .line 116
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {p0, v2}, Lg2/o0;->k(Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-nez v2, :cond_1

    .line 129
    .line 130
    const-string p1, "url\u53c2\u6570\u957f\u5ea6\u8d85\u8fc7\u9650\u5236\u3002|\u53c2\u6570url\u957f\u5ea6\u4e0d\u80fd\u8d85\u8fc71024\u5b57\u7b26\u3002"

    .line 131
    .line 132
    invoke-static {p1, v1, v0}, Lm2/f;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return v1

    .line 136
    :cond_5
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-virtual {p0, v2}, Lg2/o0;->h(Ljava/lang/String;)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-nez v2, :cond_1

    .line 149
    .line 150
    sget-object p1, Lg2/g0;->j:Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {p1, v1, v0}, Lm2/f;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return v1

    .line 156
    :cond_6
    :goto_0
    sget-object p1, Lg2/g0;->g:Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {p1, v1, v0}, Lm2/f;->a(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    .line 160
    .line 161
    return v1

    .line 162
    :catch_0
    :cond_7
    const/4 p1, 0x1

    .line 163
    return p1
.end method

.method public final j(Landroid/content/Context;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object p1, p0, Lg2/o0;->e:Lorg/json/JSONObject;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sget-object p1, Lg2/o0;->f:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "fs_lc_tl_uapp"

    .line 16
    .line 17
    iget-object v1, p0, Lg2/o0;->e:Lorg/json/JSONObject;

    .line 18
    .line 19
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    :catchall_0
    :cond_0
    return-void
.end method

.method public final k(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    array-length p1, p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    const/16 v1, 0x400

    .line 15
    .line 16
    if-gt p1, v1, :cond_1

    .line 17
    .line 18
    return v0

    .line 19
    :catch_0
    :cond_1
    const/4 p1, 0x0

    .line 20
    return p1
.end method
