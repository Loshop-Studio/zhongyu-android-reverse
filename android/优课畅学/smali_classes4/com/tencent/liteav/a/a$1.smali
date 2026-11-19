.class Lcom/tencent/liteav/a/a$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/liteav/a/a;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/a/a;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/a/a$1;->a:Lcom/tencent/liteav/a/a;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/a/a$1;->a:Lcom/tencent/liteav/a/a;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tencent/liteav/a/a;->a(Lcom/tencent/liteav/a/a;)Lcom/tencent/liteav/a/a$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget v0, p1, Landroid/os/Message;->what:I

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_3

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v1, "record complete. errcode = "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget v1, p1, Landroid/os/Message;->arg1:I

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, ", errmsg = "

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ", outputPath = "

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lcom/tencent/liteav/a/a$1;->a:Lcom/tencent/liteav/a/a;

    .line 52
    .line 53
    invoke-static {v1}, Lcom/tencent/liteav/a/a;->b(Lcom/tencent/liteav/a/a;)Lcom/tencent/liteav/a/a$a;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v1, v1, Lcom/tencent/liteav/a/a$a;->f:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ", coverImage = "

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lcom/tencent/liteav/a/a$1;->a:Lcom/tencent/liteav/a/a;

    .line 68
    .line 69
    invoke-static {v1}, Lcom/tencent/liteav/a/a;->b(Lcom/tencent/liteav/a/a;)Lcom/tencent/liteav/a/a$a;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-object v1, v1, Lcom/tencent/liteav/a/a$a;->g:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v1, "TXCStreamRecord"

    .line 83
    .line 84
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 88
    .line 89
    if-nez v0, :cond_1

    .line 90
    .line 91
    iget-object v0, p0, Lcom/tencent/liteav/a/a$1;->a:Lcom/tencent/liteav/a/a;

    .line 92
    .line 93
    invoke-static {v0}, Lcom/tencent/liteav/a/a;->b(Lcom/tencent/liteav/a/a;)Lcom/tencent/liteav/a/a$a;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget-object v0, v0, Lcom/tencent/liteav/a/a$a;->g:Ljava/lang/String;

    .line 98
    .line 99
    if-eqz v0, :cond_1

    .line 100
    .line 101
    iget-object v0, p0, Lcom/tencent/liteav/a/a$1;->a:Lcom/tencent/liteav/a/a;

    .line 102
    .line 103
    invoke-static {v0}, Lcom/tencent/liteav/a/a;->b(Lcom/tencent/liteav/a/a;)Lcom/tencent/liteav/a/a$a;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget-object v0, v0, Lcom/tencent/liteav/a/a$a;->g:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_1

    .line 114
    .line 115
    iget-object v0, p0, Lcom/tencent/liteav/a/a$1;->a:Lcom/tencent/liteav/a/a;

    .line 116
    .line 117
    invoke-static {v0}, Lcom/tencent/liteav/a/a;->b(Lcom/tencent/liteav/a/a;)Lcom/tencent/liteav/a/a$a;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iget-object v0, v0, Lcom/tencent/liteav/a/a$a;->f:Ljava/lang/String;

    .line 122
    .line 123
    iget-object v2, p0, Lcom/tencent/liteav/a/a$1;->a:Lcom/tencent/liteav/a/a;

    .line 124
    .line 125
    invoke-static {v2}, Lcom/tencent/liteav/a/a;->b(Lcom/tencent/liteav/a/a;)Lcom/tencent/liteav/a/a$a;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    iget-object v2, v2, Lcom/tencent/liteav/a/a$a;->g:Ljava/lang/String;

    .line 130
    .line 131
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/util/e;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-nez v0, :cond_1

    .line 136
    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    const-string v2, "saveVideoThumb error. sourcePath = "

    .line 143
    .line 144
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    iget-object v2, p0, Lcom/tencent/liteav/a/a$1;->a:Lcom/tencent/liteav/a/a;

    .line 148
    .line 149
    invoke-static {v2}, Lcom/tencent/liteav/a/a;->b(Lcom/tencent/liteav/a/a;)Lcom/tencent/liteav/a/a$a;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    iget-object v2, v2, Lcom/tencent/liteav/a/a$a;->f:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string v2, ", coverImagePath = "

    .line 159
    .line 160
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    iget-object v2, p0, Lcom/tencent/liteav/a/a$1;->a:Lcom/tencent/liteav/a/a;

    .line 164
    .line 165
    invoke-static {v2}, Lcom/tencent/liteav/a/a;->b(Lcom/tencent/liteav/a/a;)Lcom/tencent/liteav/a/a$a;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    iget-object v2, v2, Lcom/tencent/liteav/a/a$a;->g:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    :cond_1
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 182
    .line 183
    if-eqz v0, :cond_2

    .line 184
    .line 185
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 186
    .line 187
    iget-object v2, p0, Lcom/tencent/liteav/a/a$1;->a:Lcom/tencent/liteav/a/a;

    .line 188
    .line 189
    invoke-static {v2}, Lcom/tencent/liteav/a/a;->b(Lcom/tencent/liteav/a/a;)Lcom/tencent/liteav/a/a$a;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    iget-object v2, v2, Lcom/tencent/liteav/a/a$a;->f:Ljava/lang/String;

    .line 194
    .line 195
    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_2

    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 205
    .line 206
    .line 207
    goto :goto_0

    .line 208
    :catch_0
    move-exception v0

    .line 209
    const-string v2, "delete file failed."

    .line 210
    .line 211
    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/a/a$1;->a:Lcom/tencent/liteav/a/a;

    .line 215
    .line 216
    invoke-static {v0}, Lcom/tencent/liteav/a/a;->a(Lcom/tencent/liteav/a/a;)Lcom/tencent/liteav/a/a$b;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    iget v1, p1, Landroid/os/Message;->arg1:I

    .line 221
    .line 222
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast p1, Ljava/lang/String;

    .line 225
    .line 226
    iget-object v2, p0, Lcom/tencent/liteav/a/a$1;->a:Lcom/tencent/liteav/a/a;

    .line 227
    .line 228
    invoke-static {v2}, Lcom/tencent/liteav/a/a;->b(Lcom/tencent/liteav/a/a;)Lcom/tencent/liteav/a/a$a;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    iget-object v2, v2, Lcom/tencent/liteav/a/a$a;->f:Ljava/lang/String;

    .line 233
    .line 234
    iget-object v3, p0, Lcom/tencent/liteav/a/a$1;->a:Lcom/tencent/liteav/a/a;

    .line 235
    .line 236
    invoke-static {v3}, Lcom/tencent/liteav/a/a;->b(Lcom/tencent/liteav/a/a;)Lcom/tencent/liteav/a/a$a;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    iget-object v3, v3, Lcom/tencent/liteav/a/a$a;->g:Ljava/lang/String;

    .line 241
    .line 242
    invoke-interface {v0, v1, p1, v2, v3}, Lcom/tencent/liteav/a/a$b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :cond_3
    iget-object v0, p0, Lcom/tencent/liteav/a/a$1;->a:Lcom/tencent/liteav/a/a;

    .line 247
    .line 248
    invoke-static {v0}, Lcom/tencent/liteav/a/a;->a(Lcom/tencent/liteav/a/a;)Lcom/tencent/liteav/a/a$b;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast p1, Ljava/lang/Long;

    .line 255
    .line 256
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 257
    .line 258
    .line 259
    move-result-wide v1

    .line 260
    invoke-interface {v0, v1, v2}, Lcom/tencent/liteav/a/a$b;->a(J)V

    .line 261
    .line 262
    .line 263
    :cond_4
    :goto_1
    return-void
.end method
