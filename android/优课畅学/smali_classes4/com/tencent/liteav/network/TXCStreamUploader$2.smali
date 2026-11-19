.class Lcom/tencent/liteav/network/TXCStreamUploader$2;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/liteav/network/TXCStreamUploader;->startPushTask(Ljava/lang/String;ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/tencent/liteav/network/TXCStreamUploader;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/network/TXCStreamUploader;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 2
    .line 3
    iput-boolean p3, p0, Lcom/tencent/liteav/network/TXCStreamUploader$2;->a:Z

    .line 4
    .line 5
    iput-object p4, p0, Lcom/tencent/liteav/network/TXCStreamUploader$2;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    :catch_0
    :goto_0
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$400(Lcom/tencent/liteav/network/TXCStreamUploader;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    const-wide/16 v4, 0x0

    .line 10
    .line 11
    cmp-long v0, v2, v4

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-wide/16 v3, 0x64

    .line 17
    .line 18
    :try_start_0
    invoke-static {v3, v4, v2}, Ljava/lang/Thread;->sleep(JI)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 23
    .line 24
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$500(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/n;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lcom/tencent/liteav/network/n;->b()V

    .line 29
    .line 30
    .line 31
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 32
    .line 33
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$500(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/n;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v3, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 38
    .line 39
    invoke-static {v3}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$600(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/l;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    iget-boolean v3, v3, Lcom/tencent/liteav/network/l;->j:Z

    .line 44
    .line 45
    invoke-virtual {v0, v3}, Lcom/tencent/liteav/network/n;->a(Z)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 49
    .line 50
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$500(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/n;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v3, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 55
    .line 56
    invoke-static {v3}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$700(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v0, v3}, Lcom/tencent/liteav/network/n;->a(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 64
    .line 65
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$500(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/n;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-boolean v3, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->a:Z

    .line 70
    .line 71
    iget-object v6, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 72
    .line 73
    iget-object v7, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->b:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v6, v7}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$800(Lcom/tencent/liteav/network/TXCStreamUploader;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {v0, v3, v6}, Lcom/tencent/liteav/network/n;->a(ZLjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 83
    .line 84
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$900(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    monitor-enter v3

    .line 89
    :try_start_1
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 90
    .line 91
    iget-boolean v6, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->a:Z

    .line 92
    .line 93
    invoke-static {v0, v6}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1002(Lcom/tencent/liteav/network/TXCStreamUploader;Z)Z

    .line 94
    .line 95
    .line 96
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 97
    .line 98
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$600(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/l;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iget-boolean v0, v0, Lcom/tencent/liteav/network/l;->j:Z

    .line 103
    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 107
    .line 108
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1000(Lcom/tencent/liteav/network/TXCStreamUploader;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_1

    .line 113
    .line 114
    const/4 v0, 0x3

    .line 115
    goto :goto_1

    .line 116
    :cond_1
    const/4 v0, 0x2

    .line 117
    goto :goto_1

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    goto/16 :goto_6

    .line 120
    .line 121
    :cond_2
    const/4 v0, 0x1

    .line 122
    :goto_1
    iget-object v7, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 123
    .line 124
    invoke-static {v7}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1100(Lcom/tencent/liteav/network/TXCStreamUploader;)Z

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    if-nez v7, :cond_4

    .line 129
    .line 130
    iget-object v7, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 131
    .line 132
    invoke-static {v7}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1200(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/util/ArrayList;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    if-eqz v7, :cond_3

    .line 137
    .line 138
    iget-object v7, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 139
    .line 140
    invoke-static {v7}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1200(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/util/ArrayList;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    if-nez v7, :cond_5

    .line 149
    .line 150
    :cond_3
    const/4 v0, 0x1

    .line 151
    goto :goto_2

    .line 152
    :cond_4
    iget-object v7, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 153
    .line 154
    invoke-static {v7}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1300(Lcom/tencent/liteav/network/TXCStreamUploader;)Z

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    if-eqz v7, :cond_5

    .line 159
    .line 160
    iget-object v7, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 161
    .line 162
    invoke-static {v7}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$600(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/l;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    iput-boolean v2, v7, Lcom/tencent/liteav/network/l;->k:Z

    .line 167
    .line 168
    :cond_5
    :goto_2
    iget-object v7, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 169
    .line 170
    int-to-long v8, v0

    .line 171
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    const/16 v9, 0x1b6c

    .line 176
    .line 177
    invoke-virtual {v7, v9, v8}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    iget-object v7, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 181
    .line 182
    invoke-static {v7}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$700(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    iget-object v9, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->b:Ljava/lang/String;

    .line 187
    .line 188
    iget-boolean v10, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->a:Z

    .line 189
    .line 190
    iget-object v11, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 191
    .line 192
    invoke-static {v11}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$600(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/l;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    iget v11, v11, Lcom/tencent/liteav/network/l;->d:I

    .line 197
    .line 198
    iget-object v12, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 199
    .line 200
    invoke-static {v12}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$600(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/l;

    .line 201
    .line 202
    .line 203
    move-result-object v12

    .line 204
    iget v12, v12, Lcom/tencent/liteav/network/l;->c:I

    .line 205
    .line 206
    iget-object v13, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 207
    .line 208
    invoke-static {v13}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$600(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/l;

    .line 209
    .line 210
    .line 211
    move-result-object v13

    .line 212
    iget v13, v13, Lcom/tencent/liteav/network/l;->a:I

    .line 213
    .line 214
    iget-object v14, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 215
    .line 216
    invoke-static {v14}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$600(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/l;

    .line 217
    .line 218
    .line 219
    move-result-object v14

    .line 220
    iget v14, v14, Lcom/tencent/liteav/network/l;->b:I

    .line 221
    .line 222
    iget-object v15, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 223
    .line 224
    invoke-static {v15}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$600(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/l;

    .line 225
    .line 226
    .line 227
    move-result-object v15

    .line 228
    iget v15, v15, Lcom/tencent/liteav/network/l;->g:I

    .line 229
    .line 230
    iget-object v2, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 231
    .line 232
    invoke-static {v2}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$600(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/l;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    iget-boolean v2, v2, Lcom/tencent/liteav/network/l;->k:Z

    .line 237
    .line 238
    iget-object v6, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 239
    .line 240
    invoke-static {v6}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$600(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/l;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    iget v6, v6, Lcom/tencent/liteav/network/l;->l:I

    .line 245
    .line 246
    move-wide/from16 v21, v4

    .line 247
    .line 248
    iget-object v4, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 249
    .line 250
    iget-object v4, v4, Lcom/tencent/liteav/network/TXCStreamUploader;->mMetaData:Ljava/util/HashMap;

    .line 251
    .line 252
    const/16 v16, 0x10

    .line 253
    .line 254
    move/from16 v17, v0

    .line 255
    .line 256
    move/from16 v18, v2

    .line 257
    .line 258
    move-object/from16 v20, v4

    .line 259
    .line 260
    move/from16 v19, v6

    .line 261
    .line 262
    invoke-static/range {v7 .. v20}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1400(Lcom/tencent/liteav/network/TXCStreamUploader;Ljava/lang/String;Ljava/lang/String;ZIIIIIIIZILjava/util/HashMap;)J

    .line 263
    .line 264
    .line 265
    move-result-wide v4

    .line 266
    invoke-static {v7, v4, v5}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$402(Lcom/tencent/liteav/network/TXCStreamUploader;J)J

    .line 267
    .line 268
    .line 269
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 270
    .line 271
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$400(Lcom/tencent/liteav/network/TXCStreamUploader;)J

    .line 272
    .line 273
    .line 274
    move-result-wide v4

    .line 275
    cmp-long v0, v4, v21

    .line 276
    .line 277
    if-eqz v0, :cond_9

    .line 278
    .line 279
    iget-object v4, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 280
    .line 281
    invoke-static {v4}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$400(Lcom/tencent/liteav/network/TXCStreamUploader;)J

    .line 282
    .line 283
    .line 284
    move-result-wide v5

    .line 285
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 286
    .line 287
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$600(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/l;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    iget-boolean v7, v0, Lcom/tencent/liteav/network/l;->i:Z

    .line 292
    .line 293
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 294
    .line 295
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$600(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/l;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    iget v8, v0, Lcom/tencent/liteav/network/l;->g:I

    .line 300
    .line 301
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 302
    .line 303
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$600(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/l;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    iget v9, v0, Lcom/tencent/liteav/network/l;->h:I

    .line 308
    .line 309
    invoke-static/range {v4 .. v9}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1500(Lcom/tencent/liteav/network/TXCStreamUploader;JZII)V

    .line 310
    .line 311
    .line 312
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 313
    .line 314
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1600(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/util/Vector;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    const/4 v2, 0x0

    .line 323
    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    if-eqz v4, :cond_8

    .line 328
    .line 329
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    check-cast v4, Lcom/tencent/liteav/basic/structs/TXSNALPacket;

    .line 334
    .line 335
    if-nez v2, :cond_7

    .line 336
    .line 337
    iget v5, v4, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalType:I

    .line 338
    .line 339
    if-nez v5, :cond_7

    .line 340
    .line 341
    const/4 v2, 0x1

    .line 342
    :cond_7
    if-eqz v2, :cond_6

    .line 343
    .line 344
    iget-object v5, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 345
    .line 346
    invoke-static {v5}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$400(Lcom/tencent/liteav/network/TXCStreamUploader;)J

    .line 347
    .line 348
    .line 349
    move-result-wide v6

    .line 350
    iget-object v8, v4, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalData:[B

    .line 351
    .line 352
    iget v9, v4, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalType:I

    .line 353
    .line 354
    iget-wide v10, v4, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->frameIndex:J

    .line 355
    .line 356
    iget-wide v12, v4, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->pts:J

    .line 357
    .line 358
    iget-wide v14, v4, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->dts:J

    .line 359
    .line 360
    invoke-static/range {v5 .. v15}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1700(Lcom/tencent/liteav/network/TXCStreamUploader;J[BIJJJ)V

    .line 361
    .line 362
    .line 363
    goto :goto_3

    .line 364
    :cond_8
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 365
    .line 366
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1600(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/util/Vector;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-virtual {v0}, Ljava/util/Vector;->removeAllElements()V

    .line 371
    .line 372
    .line 373
    :cond_9
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 374
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 375
    .line 376
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1100(Lcom/tencent/liteav/network/TXCStreamUploader;)Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    if-eqz v0, :cond_a

    .line 381
    .line 382
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 383
    .line 384
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1800(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    monitor-enter v2

    .line 389
    :try_start_2
    iget-object v3, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 390
    .line 391
    invoke-static {v3}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2000(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    iget-wide v4, v0, Lcom/tencent/liteav/network/TXCStreamUploader$a;->a:J

    .line 396
    .line 397
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 398
    .line 399
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2000(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    iget-wide v6, v0, Lcom/tencent/liteav/network/TXCStreamUploader$a;->b:J

    .line 404
    .line 405
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 406
    .line 407
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2000(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    iget-object v8, v0, Lcom/tencent/liteav/network/TXCStreamUploader$a;->c:Ljava/lang/String;

    .line 412
    .line 413
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 414
    .line 415
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2000(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    iget-wide v9, v0, Lcom/tencent/liteav/network/TXCStreamUploader$a;->d:J

    .line 420
    .line 421
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 422
    .line 423
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2000(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    iget-object v11, v0, Lcom/tencent/liteav/network/TXCStreamUploader$a;->e:Ljava/lang/String;

    .line 428
    .line 429
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 430
    .line 431
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2000(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    iget-wide v12, v0, Lcom/tencent/liteav/network/TXCStreamUploader$a;->f:J

    .line 436
    .line 437
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 438
    .line 439
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2000(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    iget-wide v14, v0, Lcom/tencent/liteav/network/TXCStreamUploader$a;->g:J

    .line 444
    .line 445
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 446
    .line 447
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2000(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    iget-object v0, v0, Lcom/tencent/liteav/network/TXCStreamUploader$a;->h:Ljava/lang/String;

    .line 452
    .line 453
    move-object/from16 v16, v0

    .line 454
    .line 455
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 456
    .line 457
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2000(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    iget-boolean v0, v0, Lcom/tencent/liteav/network/TXCStreamUploader$a;->i:Z

    .line 462
    .line 463
    move/from16 v17, v0

    .line 464
    .line 465
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 466
    .line 467
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2000(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    iget-object v0, v0, Lcom/tencent/liteav/network/TXCStreamUploader$a;->j:Ljava/lang/String;

    .line 472
    .line 473
    move-object/from16 v18, v0

    .line 474
    .line 475
    invoke-static/range {v3 .. v18}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2100(Lcom/tencent/liteav/network/TXCStreamUploader;JJLjava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZLjava/lang/String;)J

    .line 476
    .line 477
    .line 478
    move-result-wide v4

    .line 479
    invoke-static {v3, v4, v5}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1902(Lcom/tencent/liteav/network/TXCStreamUploader;J)J

    .line 480
    .line 481
    .line 482
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 483
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 484
    .line 485
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2200(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    monitor-enter v3

    .line 490
    :try_start_3
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 491
    .line 492
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1900(Lcom/tencent/liteav/network/TXCStreamUploader;)J

    .line 493
    .line 494
    .line 495
    move-result-wide v4

    .line 496
    iget-object v2, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 497
    .line 498
    invoke-static {v2}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$400(Lcom/tencent/liteav/network/TXCStreamUploader;)J

    .line 499
    .line 500
    .line 501
    move-result-wide v6

    .line 502
    invoke-static {v0, v4, v5, v6, v7}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2400(Lcom/tencent/liteav/network/TXCStreamUploader;JJ)J

    .line 503
    .line 504
    .line 505
    move-result-wide v4

    .line 506
    invoke-static {v0, v4, v5}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2302(Lcom/tencent/liteav/network/TXCStreamUploader;J)J

    .line 507
    .line 508
    .line 509
    monitor-exit v3

    .line 510
    goto :goto_4

    .line 511
    :catchall_1
    move-exception v0

    .line 512
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 513
    throw v0

    .line 514
    :catchall_2
    move-exception v0

    .line 515
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 516
    throw v0

    .line 517
    :cond_a
    :goto_4
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 518
    .line 519
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$400(Lcom/tencent/liteav/network/TXCStreamUploader;)J

    .line 520
    .line 521
    .line 522
    move-result-wide v2

    .line 523
    invoke-static {v0, v2, v3}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2500(Lcom/tencent/liteav/network/TXCStreamUploader;J)V

    .line 524
    .line 525
    .line 526
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 527
    .line 528
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1100(Lcom/tencent/liteav/network/TXCStreamUploader;)Z

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    if-eqz v0, :cond_b

    .line 533
    .line 534
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 535
    .line 536
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2200(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    monitor-enter v2

    .line 541
    :try_start_5
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 542
    .line 543
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2300(Lcom/tencent/liteav/network/TXCStreamUploader;)J

    .line 544
    .line 545
    .line 546
    move-result-wide v3

    .line 547
    invoke-static {v0, v3, v4}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2600(Lcom/tencent/liteav/network/TXCStreamUploader;J)V

    .line 548
    .line 549
    .line 550
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 551
    .line 552
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2300(Lcom/tencent/liteav/network/TXCStreamUploader;)J

    .line 553
    .line 554
    .line 555
    move-result-wide v3

    .line 556
    invoke-static {v0, v3, v4}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2700(Lcom/tencent/liteav/network/TXCStreamUploader;J)V

    .line 557
    .line 558
    .line 559
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 560
    .line 561
    move-wide/from16 v3, v21

    .line 562
    .line 563
    invoke-static {v0, v3, v4}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2302(Lcom/tencent/liteav/network/TXCStreamUploader;J)J

    .line 564
    .line 565
    .line 566
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 567
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 568
    .line 569
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1800(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v3

    .line 573
    monitor-enter v3

    .line 574
    :try_start_6
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 575
    .line 576
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1900(Lcom/tencent/liteav/network/TXCStreamUploader;)J

    .line 577
    .line 578
    .line 579
    move-result-wide v4

    .line 580
    invoke-static {v0, v4, v5}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2800(Lcom/tencent/liteav/network/TXCStreamUploader;J)V

    .line 581
    .line 582
    .line 583
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 584
    .line 585
    const-wide/16 v4, 0x0

    .line 586
    .line 587
    invoke-static {v0, v4, v5}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$1902(Lcom/tencent/liteav/network/TXCStreamUploader;J)J

    .line 588
    .line 589
    .line 590
    monitor-exit v3

    .line 591
    goto :goto_5

    .line 592
    :catchall_3
    move-exception v0

    .line 593
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 594
    throw v0

    .line 595
    :catchall_4
    move-exception v0

    .line 596
    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 597
    throw v0

    .line 598
    :cond_b
    :goto_5
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 599
    .line 600
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$900(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    monitor-enter v2

    .line 605
    :try_start_8
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 606
    .line 607
    invoke-static {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$400(Lcom/tencent/liteav/network/TXCStreamUploader;)J

    .line 608
    .line 609
    .line 610
    move-result-wide v3

    .line 611
    invoke-static {v0, v3, v4}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$2900(Lcom/tencent/liteav/network/TXCStreamUploader;J)V

    .line 612
    .line 613
    .line 614
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader$2;->c:Lcom/tencent/liteav/network/TXCStreamUploader;

    .line 615
    .line 616
    const-wide/16 v3, 0x0

    .line 617
    .line 618
    invoke-static {v0, v3, v4}, Lcom/tencent/liteav/network/TXCStreamUploader;->access$402(Lcom/tencent/liteav/network/TXCStreamUploader;J)J

    .line 619
    .line 620
    .line 621
    monitor-exit v2

    .line 622
    return-void

    .line 623
    :catchall_5
    move-exception v0

    .line 624
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 625
    throw v0

    .line 626
    :goto_6
    :try_start_9
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 627
    throw v0
.end method
