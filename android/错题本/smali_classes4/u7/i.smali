.class public final Lu7/i;
.super Lr7/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lu7/i;->e:I

    iput-object p3, p0, Lu7/i;->f:Ljava/lang/Object;

    iput-object p4, p0, Lu7/i;->g:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p2, p1}, Lr7/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 15

    .line 1
    iget v0, p0, Lu7/i;->e:I

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lu7/i;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/zykj/mistake/feature/collection/component/n;

    .line 11
    .line 12
    iget-object v3, p0, Lu7/i;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Lu7/b0;

    .line 15
    .line 16
    new-instance v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 17
    .line 18
    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lu7/o;

    .line 24
    .line 25
    iget-object v5, v0, Lu7/o;->w:Lu7/x;

    .line 26
    .line 27
    monitor-enter v5

    .line 28
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    :try_start_1
    iget-object v6, v0, Lu7/o;->q:Lu7/b0;

    .line 30
    .line 31
    new-instance v7, Lu7/b0;

    .line 32
    .line 33
    invoke-direct {v7}, Lu7/b0;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v7, v6}, Lu7/b0;->b(Lu7/b0;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v7, v3}, Lu7/b0;->b(Lu7/b0;)V

    .line 40
    .line 41
    .line 42
    iput-object v7, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v7}, Lu7/b0;->a()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    int-to-long v7, v3

    .line 49
    invoke-virtual {v6}, Lu7/b0;->a()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    int-to-long v9, v3

    .line 54
    sub-long/2addr v7, v9

    .line 55
    const-wide/16 v9, 0x0

    .line 56
    .line 57
    cmp-long v3, v7, v9

    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    iget-object v11, v0, Lu7/o;->b:Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    invoke-interface {v11}, Ljava/util/Map;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    if-eqz v11, :cond_0

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    iget-object v11, v0, Lu7/o;->b:Ljava/util/LinkedHashMap;

    .line 72
    .line 73
    invoke-virtual {v11}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    new-array v12, v6, [Lu7/w;

    .line 78
    .line 79
    invoke-interface {v11, v12}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    check-cast v11, [Lu7/w;

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception v1

    .line 87
    goto :goto_4

    .line 88
    :cond_1
    :goto_0
    const/4 v11, 0x0

    .line 89
    :goto_1
    iget-object v12, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v12, Lu7/b0;

    .line 92
    .line 93
    const-string v13, "<set-?>"

    .line 94
    .line 95
    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iput-object v12, v0, Lu7/o;->q:Lu7/b0;

    .line 99
    .line 100
    iget-object v12, v0, Lu7/o;->j:Lr7/b;

    .line 101
    .line 102
    new-instance v13, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    iget-object v14, v0, Lu7/o;->c:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v14, " onSettings"

    .line 113
    .line 114
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v13

    .line 121
    new-instance v14, Lu7/i;

    .line 122
    .line 123
    invoke-direct {v14, v6, v13, v0, v4}, Lu7/i;-><init>(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12, v14, v9, v10}, Lr7/b;->b(Lr7/a;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    .line 128
    .line 129
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 130
    :try_start_3
    iget-object v9, v0, Lu7/o;->w:Lu7/x;

    .line 131
    .line 132
    iget-object v4, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v4, Lu7/b0;

    .line 135
    .line 136
    invoke-virtual {v9, v4}, Lu7/x;->a(Lu7/b0;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :catchall_1
    move-exception v0

    .line 141
    goto :goto_5

    .line 142
    :catch_0
    move-exception v4

    .line 143
    :try_start_4
    invoke-virtual {v0, v4}, Lu7/o;->b(Ljava/io/IOException;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 144
    .line 145
    .line 146
    :goto_2
    monitor-exit v5

    .line 147
    if-eqz v11, :cond_3

    .line 148
    .line 149
    array-length v0, v11

    .line 150
    :goto_3
    if-ge v6, v0, :cond_3

    .line 151
    .line 152
    aget-object v4, v11, v6

    .line 153
    .line 154
    monitor-enter v4

    .line 155
    :try_start_5
    iget-wide v9, v4, Lu7/w;->f:J

    .line 156
    .line 157
    add-long/2addr v9, v7

    .line 158
    iput-wide v9, v4, Lu7/w;->f:J

    .line 159
    .line 160
    if-lez v3, :cond_2

    .line 161
    .line 162
    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 163
    .line 164
    .line 165
    :cond_2
    monitor-exit v4

    .line 166
    add-int/lit8 v6, v6, 0x1

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :catchall_2
    move-exception v0

    .line 170
    monitor-exit v4

    .line 171
    throw v0

    .line 172
    :cond_3
    return-wide v1

    .line 173
    :goto_4
    :try_start_6
    monitor-exit v0

    .line 174
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 175
    :goto_5
    monitor-exit v5

    .line 176
    throw v0

    .line 177
    :pswitch_0
    :try_start_7
    iget-object v0, p0, Lu7/i;->f:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Lu7/o;

    .line 180
    .line 181
    iget-object v0, v0, Lu7/o;->a:Lu7/h;

    .line 182
    .line 183
    iget-object v3, p0, Lu7/i;->g:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v3, Lu7/w;

    .line 186
    .line 187
    invoke-virtual {v0, v3}, Lu7/h;->b(Lu7/w;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    .line 188
    .line 189
    .line 190
    goto :goto_6

    .line 191
    :catch_1
    move-exception v0

    .line 192
    sget-object v3, Lv7/n;->a:Lv7/n;

    .line 193
    .line 194
    sget-object v3, Lv7/n;->a:Lv7/n;

    .line 195
    .line 196
    new-instance v4, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    const-string v5, "Http2Connection.Listener failure for "

    .line 199
    .line 200
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    iget-object v5, p0, Lu7/i;->f:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v5, Lu7/o;

    .line 206
    .line 207
    iget-object v5, v5, Lu7/o;->c:Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    const/4 v3, 0x4

    .line 220
    invoke-static {v4, v3, v0}, Lv7/n;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    :try_start_8
    iget-object v3, p0, Lu7/i;->g:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v3, Lu7/w;

    .line 226
    .line 227
    sget-object v4, Lokhttp3/internal/http2/ErrorCode;->PROTOCOL_ERROR:Lokhttp3/internal/http2/ErrorCode;

    .line 228
    .line 229
    invoke-virtual {v3, v4, v0}, Lu7/w;->c(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    .line 230
    .line 231
    .line 232
    :catch_2
    :goto_6
    return-wide v1

    .line 233
    :pswitch_1
    iget-object v0, p0, Lu7/i;->f:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Lu7/o;

    .line 236
    .line 237
    iget-object v3, v0, Lu7/o;->a:Lu7/h;

    .line 238
    .line 239
    iget-object v4, p0, Lu7/i;->g:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 242
    .line 243
    iget-object v4, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v4, Lu7/b0;

    .line 246
    .line 247
    invoke-virtual {v3, v0, v4}, Lu7/h;->a(Lu7/o;Lu7/b0;)V

    .line 248
    .line 249
    .line 250
    return-wide v1

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
