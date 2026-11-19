.class Lcom/tencent/liteav/network/f$2;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/liteav/network/f;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:I

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Lcom/tencent/liteav/network/f;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/network/f;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/network/f$2;->g:Lcom/tencent/liteav/network/f;

    .line 2
    .line 3
    iput p3, p0, Lcom/tencent/liteav/network/f$2;->a:I

    .line 4
    .line 5
    iput-object p4, p0, Lcom/tencent/liteav/network/f$2;->b:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p5, p0, Lcom/tencent/liteav/network/f$2;->c:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p6, p0, Lcom/tencent/liteav/network/f$2;->d:Ljava/lang/String;

    .line 10
    .line 11
    iput p7, p0, Lcom/tencent/liteav/network/f$2;->e:I

    .line 12
    .line 13
    iput-object p8, p0, Lcom/tencent/liteav/network/f$2;->f:Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    const-string v0, "TXCVodPlayerNetApi"

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    :try_start_0
    invoke-static {}, Landroid/os/Looper;->prepare()V

    .line 5
    .line 6
    .line 7
    iget-object v2, p0, Lcom/tencent/liteav/network/f$2;->g:Lcom/tencent/liteav/network/f;

    .line 8
    .line 9
    invoke-static {v2}, Lcom/tencent/liteav/network/f;->a(Lcom/tencent/liteav/network/f;)Z

    .line 10
    .line 11
    .line 12
    move-result v2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    const-string v3, "%s/%d/%s"

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    :try_start_1
    const-string v2, "https://playvideo.qcloud.com/getplayinfo/v2"

    .line 18
    .line 19
    iget v4, p0, Lcom/tencent/liteav/network/f$2;->a:I

    .line 20
    .line 21
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    iget-object v5, p0, Lcom/tencent/liteav/network/f$2;->b:Ljava/lang/String;

    .line 26
    .line 27
    filled-new-array {v2, v4, v5}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move-exception v2

    .line 37
    goto/16 :goto_2

    .line 38
    .line 39
    :cond_0
    const-string v2, "http://playvideo.qcloud.com/getplayinfo/v2"

    .line 40
    .line 41
    iget v4, p0, Lcom/tencent/liteav/network/f$2;->a:I

    .line 42
    .line 43
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    iget-object v5, p0, Lcom/tencent/liteav/network/f$2;->b:Ljava/lang/String;

    .line 48
    .line 49
    filled-new-array {v2, v4, v5}, [Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    :goto_0
    iget-object v3, p0, Lcom/tencent/liteav/network/f$2;->g:Lcom/tencent/liteav/network/f;

    .line 58
    .line 59
    iget-object v4, p0, Lcom/tencent/liteav/network/f$2;->c:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v5, p0, Lcom/tencent/liteav/network/f$2;->d:Ljava/lang/String;

    .line 62
    .line 63
    iget v6, p0, Lcom/tencent/liteav/network/f$2;->e:I

    .line 64
    .line 65
    iget-object v7, p0, Lcom/tencent/liteav/network/f$2;->f:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v3, v4, v5, v6, v7}, Lcom/tencent/liteav/network/f;->a(Lcom/tencent/liteav/network/f;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    if-eqz v3, :cond_1

    .line 72
    .line 73
    new-instance v4, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v2, "?"

    .line 82
    .line 83
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    :cond_1
    new-instance v3, Ljava/net/URL;

    .line 94
    .line 95
    invoke-direct {v3, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    new-instance v4, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v5, "getplayinfo: "

    .line 104
    .line 105
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Ljava/net/HttpURLConnection;

    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/net/URLConnection;->connect()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    const/16 v4, 0xc8

    .line 132
    .line 133
    if-ne v3, v4, :cond_3

    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    new-instance v3, Ljava/io/BufferedReader;

    .line 140
    .line 141
    new-instance v4, Ljava/io/InputStreamReader;

    .line 142
    .line 143
    invoke-direct {v4, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 144
    .line 145
    .line 146
    invoke-direct {v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 147
    .line 148
    .line 149
    new-instance v2, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    :goto_1
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    if-eqz v4, :cond_2

    .line 159
    .line 160
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_2
    iget-object v3, p0, Lcom/tencent/liteav/network/f$2;->g:Lcom/tencent/liteav/network/f;

    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-static {v3, v2}, Lcom/tencent/liteav/network/f;->a(Lcom/tencent/liteav/network/f;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_3
    iget-object v2, p0, Lcom/tencent/liteav/network/f$2;->g:Lcom/tencent/liteav/network/f;

    .line 175
    .line 176
    const-string v3, "Request failed"

    .line 177
    .line 178
    const/4 v4, -0x1

    .line 179
    invoke-virtual {v2, v3, v4}, Lcom/tencent/liteav/network/f;->a(Ljava/lang/String;I)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 186
    .line 187
    .line 188
    const-string v4, "http exception: "

    .line 189
    .line 190
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    iget-object v0, p0, Lcom/tencent/liteav/network/f$2;->g:Lcom/tencent/liteav/network/f;

    .line 208
    .line 209
    const-string v2, "The request was exceptional"

    .line 210
    .line 211
    invoke-virtual {v0, v2, v1}, Lcom/tencent/liteav/network/f;->a(Ljava/lang/String;I)V

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :catch_1
    iget-object v0, p0, Lcom/tencent/liteav/network/f$2;->g:Lcom/tencent/liteav/network/f;

    .line 216
    .line 217
    const-string v2, "Incorrect format"

    .line 218
    .line 219
    invoke-virtual {v0, v2, v1}, Lcom/tencent/liteav/network/f;->a(Ljava/lang/String;I)V

    .line 220
    .line 221
    .line 222
    :goto_3
    return-void
.end method
