.class Lcom/taobao/accs/net/w$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/taobao/accs/net/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:I

.field b:J

.field final synthetic c:Lcom/taobao/accs/net/w;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/taobao/accs/net/w;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lcom/taobao/accs/net/w$a;->a:I

    .line 14
    .line 15
    return-void
.end method

.method private a(Z)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/16 v1, 0x1388

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eq v0, v4, :cond_5

    .line 12
    .line 13
    iget-object v0, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    const-string v6, "force"

    .line 24
    .line 25
    filled-new-array {v6, v5}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const-string v7, "tryConnect"

    .line 30
    .line 31
    invoke-static {v0, v7, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    iput v3, p0, Lcom/taobao/accs/net/w$a;->a:I

    .line 37
    .line 38
    :cond_0
    iget-object v0, p0, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget v5, p0, Lcom/taobao/accs/net/w$a;->a:I

    .line 45
    .line 46
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    const-string v8, "failTimes"

    .line 51
    .line 52
    filled-new-array {v6, p1, v8, v5}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {v0, v7, p1}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 60
    .line 61
    invoke-static {p1}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eq p1, v4, :cond_1

    .line 66
    .line 67
    iget p1, p0, Lcom/taobao/accs/net/w$a;->a:I

    .line 68
    .line 69
    const/4 v0, 0x4

    .line 70
    if-lt p1, v0, :cond_1

    .line 71
    .line 72
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 73
    .line 74
    invoke-static {p1, v4}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;Z)Z

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 78
    .line 79
    const-string v1, "maxTimes"

    .line 80
    .line 81
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const-string v1, "tryConnect fail"

    .line 90
    .line 91
    invoke-static {p1, v1, v0}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_1
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 96
    .line 97
    invoke-static {p1}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;)I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eq p1, v4, :cond_6

    .line 102
    .line 103
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 104
    .line 105
    iget p1, p1, Lcom/taobao/accs/net/b;->c:I

    .line 106
    .line 107
    if-ne p1, v4, :cond_2

    .line 108
    .line 109
    iget p1, p0, Lcom/taobao/accs/net/w$a;->a:I

    .line 110
    .line 111
    if-nez p1, :cond_2

    .line 112
    .line 113
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 114
    .line 115
    const-string v0, "tryConnect in app, no sleep"

    .line 116
    .line 117
    new-array v1, v3, [Ljava/lang/Object;

    .line 118
    .line 119
    invoke-static {p1, v0, v1}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_2
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 124
    .line 125
    const-string v0, "tryConnect, need sleep"

    .line 126
    .line 127
    new-array v5, v3, [Ljava/lang/Object;

    .line 128
    .line 129
    invoke-static {p1, v0, v5}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :catch_0
    move-exception p1

    .line 137
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 138
    .line 139
    .line 140
    :goto_0
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 141
    .line 142
    const-string v0, ""

    .line 143
    .line 144
    invoke-static {p1, v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    iget p1, p0, Lcom/taobao/accs/net/w$a;->a:I

    .line 148
    .line 149
    const/4 v0, 0x3

    .line 150
    if-ne p1, v0, :cond_3

    .line 151
    .line 152
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 153
    .line 154
    invoke-static {p1}, Lcom/taobao/accs/net/w;->e(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/net/g;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    iget-object v0, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 159
    .line 160
    invoke-virtual {v0}, Lcom/taobao/accs/net/w;->r()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {p1, v0}, Lcom/taobao/accs/net/g;->b(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_3
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 168
    .line 169
    const/4 v0, 0x0

    .line 170
    invoke-static {p1, v0}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 174
    .line 175
    invoke-static {p1}, Lcom/taobao/accs/net/w;->c(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/ut/monitor/SessionMonitor;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    iget v0, p0, Lcom/taobao/accs/net/w$a;->a:I

    .line 180
    .line 181
    invoke-virtual {p1, v0}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->setRetryTimes(I)V

    .line 182
    .line 183
    .line 184
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 185
    .line 186
    invoke-static {p1}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;)I

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-eq p1, v4, :cond_4

    .line 191
    .line 192
    iget p1, p0, Lcom/taobao/accs/net/w$a;->a:I

    .line 193
    .line 194
    add-int/2addr p1, v4

    .line 195
    iput p1, p0, Lcom/taobao/accs/net/w$a;->a:I

    .line 196
    .line 197
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 198
    .line 199
    const-string v0, "try connect fail, ready for reconnect"

    .line 200
    .line 201
    new-array v1, v3, [Ljava/lang/Object;

    .line 202
    .line 203
    invoke-static {p1, v0, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    invoke-direct {p0, v3}, Lcom/taobao/accs/net/w$a;->a(Z)V

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 211
    .line 212
    .line 213
    move-result-wide v0

    .line 214
    iput-wide v0, p0, Lcom/taobao/accs/net/w$a;->b:J

    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_5
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 218
    .line 219
    invoke-static {p1}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;)I

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    if-ne p1, v4, :cond_6

    .line 224
    .line 225
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 226
    .line 227
    .line 228
    move-result-wide v4

    .line 229
    iget-wide v6, p0, Lcom/taobao/accs/net/w$a;->b:J

    .line 230
    .line 231
    sub-long/2addr v4, v6

    .line 232
    cmp-long p1, v4, v1

    .line 233
    .line 234
    if-lez p1, :cond_6

    .line 235
    .line 236
    iput v3, p0, Lcom/taobao/accs/net/w$a;->a:I

    .line 237
    .line 238
    :cond_6
    :goto_1
    return-void
.end method


# virtual methods
.method public run()V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "NetworkThread run"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    new-array v4, v3, [Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {v0, v2, v4}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput v3, v1, Lcom/taobao/accs/net/w$a;->a:I

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :goto_0
    iget-object v2, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 17
    .line 18
    invoke-static {v2}, Lcom/taobao/accs/net/w;->f(Lcom/taobao/accs/net/w;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1e

    .line 23
    .line 24
    iget-object v2, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 25
    .line 26
    const-string v4, "ready to get message"

    .line 27
    .line 28
    new-array v5, v3, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {v2, v4, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 34
    .line 35
    invoke-static {v2}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    monitor-enter v2

    .line 40
    :try_start_0
    iget-object v4, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 41
    .line 42
    invoke-static {v4}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v4}, Ljava/util/LinkedList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    if-nez v4, :cond_0

    .line 51
    .line 52
    :try_start_1
    iget-object v4, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 53
    .line 54
    const-string v5, "no message, wait"

    .line 55
    .line 56
    new-array v6, v3, [Ljava/lang/Object;

    .line 57
    .line 58
    invoke-static {v4, v5, v6}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v4, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 62
    .line 63
    invoke-static {v4}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v4}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    goto/16 :goto_19

    .line 73
    .line 74
    :catch_0
    move-exception v0

    .line 75
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 76
    .line 77
    .line 78
    monitor-exit v2

    .line 79
    goto/16 :goto_1a

    .line 80
    .line 81
    :cond_0
    :goto_1
    iget-object v4, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 82
    .line 83
    const-string v5, "try get message"

    .line 84
    .line 85
    new-array v6, v3, [Ljava/lang/Object;

    .line 86
    .line 87
    invoke-static {v4, v5, v6}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object v4, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 91
    .line 92
    invoke-static {v4}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v4}, Ljava/util/LinkedList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_1

    .line 101
    .line 102
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 103
    .line 104
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Lcom/taobao/accs/data/Message;

    .line 113
    .line 114
    invoke-virtual {v0}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    if-eqz v4, :cond_1

    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-virtual {v4}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->onTakeFromQueue()V

    .line 125
    .line 126
    .line 127
    :cond_1
    move-object v4, v0

    .line 128
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 129
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 130
    .line 131
    invoke-static {v0}, Lcom/taobao/accs/net/w;->f(Lcom/taobao/accs/net/w;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-nez v0, :cond_2

    .line 136
    .line 137
    goto/16 :goto_1a

    .line 138
    .line 139
    :cond_2
    if-eqz v4, :cond_1d

    .line 140
    .line 141
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 142
    .line 143
    const-string v2, "sendMessage not null"

    .line 144
    .line 145
    new-array v5, v3, [Ljava/lang/Object;

    .line 146
    .line 147
    invoke-static {v0, v2, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    const/16 v2, 0xc9

    .line 151
    .line 152
    const/16 v5, 0x64

    .line 153
    .line 154
    const/4 v6, 0x1

    .line 155
    :try_start_3
    invoke-virtual {v4}, Lcom/taobao/accs/data/Message;->a()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    iget-object v7, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 160
    .line 161
    const-string v8, "sendMessage"

    .line 162
    .line 163
    const-string v9, "type"

    .line 164
    .line 165
    invoke-static {v0}, Lcom/taobao/accs/data/Message$c;->b(I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    const-string v11, "status"

    .line 170
    .line 171
    iget-object v12, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 172
    .line 173
    invoke-static {v12}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;)I

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v12

    .line 181
    filled-new-array {v9, v10, v11, v12}, [Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    invoke-static {v7, v8, v9}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    const/4 v7, 0x2

    .line 189
    if-ne v0, v7, :cond_7

    .line 190
    .line 191
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 192
    .line 193
    iget v0, v0, Lcom/taobao/accs/net/b;->c:I

    .line 194
    .line 195
    if-ne v0, v6, :cond_3

    .line 196
    .line 197
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 198
    .line 199
    const-string v7, "sendMessage INAPP ping, skip"

    .line 200
    .line 201
    new-array v8, v3, [Ljava/lang/Object;

    .line 202
    .line 203
    invoke-static {v0, v7, v8}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 204
    .line 205
    .line 206
    :try_start_4
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 207
    .line 208
    const-string v2, "send succ, remove it"

    .line 209
    .line 210
    new-array v5, v3, [Ljava/lang/Object;

    .line 211
    .line 212
    invoke-static {v0, v2, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 216
    .line 217
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    monitor-enter v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 222
    :try_start_5
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 223
    .line 224
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    monitor-exit v2

    .line 232
    goto/16 :goto_18

    .line 233
    .line 234
    :catchall_1
    move-exception v0

    .line 235
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 236
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 237
    :catchall_2
    move-exception v0

    .line 238
    iget-object v2, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 239
    .line 240
    const-string v5, " run finally error"

    .line 241
    .line 242
    new-array v6, v3, [Ljava/lang/Object;

    .line 243
    .line 244
    invoke-static {v2, v5, v0, v6}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_18

    .line 248
    .line 249
    :catchall_3
    move-exception v0

    .line 250
    move v7, v6

    .line 251
    goto/16 :goto_c

    .line 252
    .line 253
    :cond_3
    :try_start_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 254
    .line 255
    .line 256
    move-result-wide v7

    .line 257
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 258
    .line 259
    invoke-static {v0}, Lcom/taobao/accs/net/w;->g(Lcom/taobao/accs/net/w;)J

    .line 260
    .line 261
    .line 262
    move-result-wide v9

    .line 263
    sub-long/2addr v7, v9

    .line 264
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 265
    .line 266
    iget-object v0, v0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    .line 267
    .line 268
    invoke-static {v0}, Lcom/taobao/accs/net/f;->a(Landroid/content/Context;)Lcom/taobao/accs/net/f;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {v0}, Lcom/taobao/accs/net/f;->b()I

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    sub-int/2addr v0, v6

    .line 277
    mul-int/lit16 v0, v0, 0x3e8

    .line 278
    .line 279
    int-to-long v9, v0

    .line 280
    cmp-long v0, v7, v9

    .line 281
    .line 282
    if-gez v0, :cond_5

    .line 283
    .line 284
    iget-boolean v0, v4, Lcom/taobao/accs/data/Message;->d:Z

    .line 285
    .line 286
    if-eqz v0, :cond_4

    .line 287
    .line 288
    goto :goto_2

    .line 289
    :cond_4
    invoke-direct {v1, v3}, Lcom/taobao/accs/net/w$a;->a(Z)V

    .line 290
    .line 291
    .line 292
    goto/16 :goto_5

    .line 293
    .line 294
    :cond_5
    :goto_2
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 295
    .line 296
    const-string v7, "sendMessage"

    .line 297
    .line 298
    const-string v8, "force"

    .line 299
    .line 300
    iget-boolean v9, v4, Lcom/taobao/accs/data/Message;->d:Z

    .line 301
    .line 302
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 303
    .line 304
    .line 305
    move-result-object v9

    .line 306
    const-string v10, "last ping"

    .line 307
    .line 308
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 309
    .line 310
    .line 311
    move-result-wide v11

    .line 312
    iget-object v13, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 313
    .line 314
    invoke-static {v13}, Lcom/taobao/accs/net/w;->g(Lcom/taobao/accs/net/w;)J

    .line 315
    .line 316
    .line 317
    move-result-wide v13

    .line 318
    sub-long/2addr v11, v13

    .line 319
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 320
    .line 321
    .line 322
    move-result-object v11

    .line 323
    filled-new-array {v8, v9, v10, v11}, [Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v8

    .line 327
    invoke-static {v0, v7, v8}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    invoke-direct {v1, v6}, Lcom/taobao/accs/net/w$a;->a(Z)V

    .line 331
    .line 332
    .line 333
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 334
    .line 335
    invoke-static {v0}, Lcom/taobao/accs/net/w;->h(Lcom/taobao/accs/net/w;)Lorg/android/spdy/SpdySession;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    if-eqz v0, :cond_6

    .line 340
    .line 341
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 342
    .line 343
    invoke-static {v0}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;)I

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-ne v0, v6, :cond_6

    .line 348
    .line 349
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 350
    .line 351
    .line 352
    move-result-wide v7

    .line 353
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 354
    .line 355
    invoke-static {v0}, Lcom/taobao/accs/net/w;->g(Lcom/taobao/accs/net/w;)J

    .line 356
    .line 357
    .line 358
    move-result-wide v9

    .line 359
    sub-long/2addr v7, v9

    .line 360
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 361
    .line 362
    iget-object v0, v0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    .line 363
    .line 364
    invoke-static {v0}, Lcom/taobao/accs/net/f;->a(Landroid/content/Context;)Lcom/taobao/accs/net/f;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {v0}, Lcom/taobao/accs/net/f;->b()I

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    sub-int/2addr v0, v6

    .line 373
    mul-int/lit16 v0, v0, 0x3e8

    .line 374
    .line 375
    int-to-long v9, v0

    .line 376
    cmp-long v0, v7, v9

    .line 377
    .line 378
    if-ltz v0, :cond_c

    .line 379
    .line 380
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 381
    .line 382
    const-string v7, "sendMessage onSendPing"

    .line 383
    .line 384
    new-array v8, v3, [Ljava/lang/Object;

    .line 385
    .line 386
    invoke-static {v0, v7, v8}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 390
    .line 391
    iget-object v0, v0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    .line 392
    .line 393
    invoke-virtual {v0}, Lcom/taobao/accs/data/d;->a()V

    .line 394
    .line 395
    .line 396
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 397
    .line 398
    invoke-static {v0}, Lcom/taobao/accs/net/w;->h(Lcom/taobao/accs/net/w;)Lorg/android/spdy/SpdySession;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-virtual {v0}, Lorg/android/spdy/SpdySession;->submitPing()I

    .line 403
    .line 404
    .line 405
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 406
    .line 407
    invoke-static {v0}, Lcom/taobao/accs/net/w;->c(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/ut/monitor/SessionMonitor;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    invoke-virtual {v0}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->onSendPing()V

    .line 412
    .line 413
    .line 414
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 415
    .line 416
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 417
    .line 418
    .line 419
    move-result-wide v7

    .line 420
    invoke-static {v0, v7, v8}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;J)J

    .line 421
    .line 422
    .line 423
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 424
    .line 425
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 426
    .line 427
    .line 428
    move-result-wide v7

    .line 429
    invoke-static {v0, v7, v8}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;J)J

    .line 430
    .line 431
    .line 432
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 433
    .line 434
    invoke-virtual {v0}, Lcom/taobao/accs/net/b;->f()V

    .line 435
    .line 436
    .line 437
    goto/16 :goto_5

    .line 438
    .line 439
    :cond_6
    move v7, v3

    .line 440
    goto/16 :goto_6

    .line 441
    .line 442
    :cond_7
    if-ne v0, v6, :cond_d

    .line 443
    .line 444
    invoke-direct {v1, v6}, Lcom/taobao/accs/net/w$a;->a(Z)V

    .line 445
    .line 446
    .line 447
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 448
    .line 449
    invoke-static {v0}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;)I

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    if-ne v0, v6, :cond_6

    .line 454
    .line 455
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 456
    .line 457
    invoke-static {v0}, Lcom/taobao/accs/net/w;->h(Lcom/taobao/accs/net/w;)Lorg/android/spdy/SpdySession;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    if-eqz v0, :cond_6

    .line 462
    .line 463
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 464
    .line 465
    iget-object v7, v0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    .line 466
    .line 467
    iget v0, v0, Lcom/taobao/accs/net/b;->c:I

    .line 468
    .line 469
    invoke-virtual {v4, v7, v0}, Lcom/taobao/accs/data/Message;->a(Landroid/content/Context;I)[B

    .line 470
    .line 471
    .line 472
    move-result-object v13

    .line 473
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 474
    .line 475
    .line 476
    move-result-wide v7

    .line 477
    invoke-virtual {v4, v7, v8}, Lcom/taobao/accs/data/Message;->a(J)V

    .line 478
    .line 479
    .line 480
    array-length v0, v13

    .line 481
    const/16 v7, 0x4000

    .line 482
    .line 483
    if-le v0, v7, :cond_8

    .line 484
    .line 485
    iget-object v0, v4, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    .line 486
    .line 487
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    const/16 v7, 0x66

    .line 492
    .line 493
    if-eq v0, v7, :cond_8

    .line 494
    .line 495
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 496
    .line 497
    iget-object v0, v0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    .line 498
    .line 499
    sget-object v7, Lcom/taobao/accs/AccsErrorCode;->MESSAGE_TOO_LARGE:Lcom/alibaba/sdk/android/error/ErrorCode;

    .line 500
    .line 501
    invoke-virtual {v0, v4, v7}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 502
    .line 503
    .line 504
    goto/16 :goto_5

    .line 505
    .line 506
    :cond_8
    iget-boolean v0, v4, Lcom/taobao/accs/data/Message;->c:Z

    .line 507
    .line 508
    if-eqz v0, :cond_9

    .line 509
    .line 510
    invoke-virtual {v4}, Lcom/taobao/accs/data/Message;->d()Lcom/taobao/accs/data/Message$a;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    invoke-virtual {v0}, Lcom/taobao/accs/data/Message$a;->a()I

    .line 515
    .line 516
    .line 517
    move-result v0

    .line 518
    neg-int v0, v0

    .line 519
    :goto_3
    move v9, v0

    .line 520
    goto :goto_4

    .line 521
    :cond_9
    invoke-virtual {v4}, Lcom/taobao/accs/data/Message;->d()Lcom/taobao/accs/data/Message$a;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-virtual {v0}, Lcom/taobao/accs/data/Message$a;->a()I

    .line 526
    .line 527
    .line 528
    move-result v0

    .line 529
    goto :goto_3

    .line 530
    :goto_4
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 531
    .line 532
    invoke-static {v0}, Lcom/taobao/accs/net/w;->h(Lcom/taobao/accs/net/w;)Lorg/android/spdy/SpdySession;

    .line 533
    .line 534
    .line 535
    move-result-object v8

    .line 536
    array-length v12, v13

    .line 537
    const/16 v10, 0xc8

    .line 538
    .line 539
    const/4 v11, 0x0

    .line 540
    invoke-virtual/range {v8 .. v13}, Lorg/android/spdy/SpdySession;->sendCustomControlFrame(IIII[B)I

    .line 541
    .line 542
    .line 543
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 544
    .line 545
    const-string v7, "send data"

    .line 546
    .line 547
    const-string v14, "length"

    .line 548
    .line 549
    array-length v8, v13

    .line 550
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 551
    .line 552
    .line 553
    move-result-object v15

    .line 554
    const-string v16, "dataId"

    .line 555
    .line 556
    invoke-virtual {v4}, Lcom/taobao/accs/data/Message;->b()Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v17

    .line 560
    const-string v18, "utdid"

    .line 561
    .line 562
    iget-object v8, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 563
    .line 564
    iget-object v8, v8, Lcom/taobao/accs/net/b;->j:Ljava/lang/String;

    .line 565
    .line 566
    move-object/from16 v19, v8

    .line 567
    .line 568
    filled-new-array/range {v14 .. v19}, [Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v8

    .line 572
    invoke-static {v0, v7, v8}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 576
    .line 577
    iget-object v0, v0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    .line 578
    .line 579
    invoke-virtual {v0, v4}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;)V

    .line 580
    .line 581
    .line 582
    iget-boolean v0, v4, Lcom/taobao/accs/data/Message;->c:Z

    .line 583
    .line 584
    if-eqz v0, :cond_a

    .line 585
    .line 586
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 587
    .line 588
    const-string v7, "sendCFrame end ack"

    .line 589
    .line 590
    const-string v8, "dataId"

    .line 591
    .line 592
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 593
    .line 594
    .line 595
    move-result-object v10

    .line 596
    filled-new-array {v8, v10}, [Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v8

    .line 600
    invoke-static {v0, v7, v8}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 604
    .line 605
    iget-object v0, v0, Lcom/taobao/accs/net/b;->l:Ljava/util/LinkedHashMap;

    .line 606
    .line 607
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 608
    .line 609
    .line 610
    move-result-object v7

    .line 611
    invoke-virtual {v0, v7, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    :cond_a
    invoke-virtual {v4}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    if-eqz v0, :cond_b

    .line 619
    .line 620
    invoke-virtual {v4}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    invoke-virtual {v0}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->onSendData()V

    .line 625
    .line 626
    .line 627
    :cond_b
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 628
    .line 629
    invoke-virtual {v4}, Lcom/taobao/accs/data/Message;->b()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v7

    .line 633
    iget-object v8, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 634
    .line 635
    iget-object v8, v8, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    .line 636
    .line 637
    invoke-virtual {v8}, Lcom/taobao/accs/AccsClientConfig;->isQuickReconnect()Z

    .line 638
    .line 639
    .line 640
    move-result v8

    .line 641
    iget v9, v4, Lcom/taobao/accs/data/Message;->S:I

    .line 642
    .line 643
    int-to-long v9, v9

    .line 644
    invoke-virtual {v0, v7, v8, v9, v10}, Lcom/taobao/accs/net/b;->a(Ljava/lang/String;ZJ)V

    .line 645
    .line 646
    .line 647
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 648
    .line 649
    iget-object v0, v0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    .line 650
    .line 651
    new-instance v7, Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;

    .line 652
    .line 653
    iget-object v8, v4, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    .line 654
    .line 655
    invoke-static {}, Lanet/channel/GlobalAppRuntimeInfo;->isAppBackground()Z

    .line 656
    .line 657
    .line 658
    move-result v9

    .line 659
    iget-object v10, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 660
    .line 661
    invoke-virtual {v10}, Lcom/taobao/accs/net/w;->r()Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v10

    .line 665
    array-length v11, v13

    .line 666
    int-to-long v11, v11

    .line 667
    invoke-direct/range {v7 .. v12}, Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;-><init>(Ljava/lang/String;ZLjava/lang/String;J)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v0, v7}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;)V

    .line 671
    .line 672
    .line 673
    :cond_c
    :goto_5
    move v7, v6

    .line 674
    goto :goto_6

    .line 675
    :cond_d
    invoke-direct {v1, v3}, Lcom/taobao/accs/net/w$a;->a(Z)V

    .line 676
    .line 677
    .line 678
    iget-object v7, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 679
    .line 680
    const-string v8, "skip msg"

    .line 681
    .line 682
    const-string v9, "type"

    .line 683
    .line 684
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    filled-new-array {v9, v0}, [Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    invoke-static {v7, v8, v0}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 693
    .line 694
    .line 695
    goto :goto_5

    .line 696
    :goto_6
    :try_start_8
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 697
    .line 698
    invoke-static {v0}, Lcom/taobao/accs/net/w;->i(Lcom/taobao/accs/net/w;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 699
    .line 700
    .line 701
    if-nez v7, :cond_12

    .line 702
    .line 703
    :try_start_9
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 704
    .line 705
    invoke-virtual {v0}, Lcom/taobao/accs/net/w;->q()V

    .line 706
    .line 707
    .line 708
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 709
    .line 710
    invoke-static {v0}, Lcom/taobao/accs/net/w;->c(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/ut/monitor/SessionMonitor;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    if-eqz v0, :cond_e

    .line 715
    .line 716
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 717
    .line 718
    invoke-static {v0}, Lcom/taobao/accs/net/w;->c(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/ut/monitor/SessionMonitor;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    const-string v7, "send fail"

    .line 723
    .line 724
    invoke-virtual {v0, v7}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->setCloseReason(Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    goto :goto_7

    .line 728
    :catchall_4
    move-exception v0

    .line 729
    goto/16 :goto_b

    .line 730
    .line 731
    :cond_e
    :goto_7
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 732
    .line 733
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 734
    .line 735
    .line 736
    move-result-object v7

    .line 737
    monitor-enter v7
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 738
    :try_start_a
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 739
    .line 740
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 745
    .line 746
    .line 747
    move-result v0

    .line 748
    sub-int/2addr v0, v6

    .line 749
    :goto_8
    if-ltz v0, :cond_11

    .line 750
    .line 751
    iget-object v6, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 752
    .line 753
    invoke-static {v6}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 754
    .line 755
    .line 756
    move-result-object v6

    .line 757
    invoke-virtual {v6, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v6

    .line 761
    check-cast v6, Lcom/taobao/accs/data/Message;

    .line 762
    .line 763
    if-eqz v6, :cond_10

    .line 764
    .line 765
    iget-object v8, v6, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    .line 766
    .line 767
    if-eqz v8, :cond_10

    .line 768
    .line 769
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 770
    .line 771
    .line 772
    move-result v8

    .line 773
    if-eq v8, v5, :cond_f

    .line 774
    .line 775
    iget-object v8, v6, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    .line 776
    .line 777
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 778
    .line 779
    .line 780
    move-result v8

    .line 781
    if-ne v8, v2, :cond_10

    .line 782
    .line 783
    goto :goto_9

    .line 784
    :catchall_5
    move-exception v0

    .line 785
    goto :goto_a

    .line 786
    :cond_f
    :goto_9
    iget-object v8, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 787
    .line 788
    iget-object v8, v8, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    .line 789
    .line 790
    sget-object v9, Lcom/taobao/accs/AccsErrorCode;->SPDY_CONNECTION_DISCONNECTED_WHEN_SEND_DATA:Lcom/alibaba/sdk/android/error/ErrorCode;

    .line 791
    .line 792
    invoke-virtual {v8, v6, v9}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 793
    .line 794
    .line 795
    iget-object v6, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 796
    .line 797
    invoke-static {v6}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 798
    .line 799
    .line 800
    move-result-object v6

    .line 801
    invoke-virtual {v6, v0}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    :cond_10
    add-int/lit8 v0, v0, -0x1

    .line 805
    .line 806
    goto :goto_8

    .line 807
    :cond_11
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 808
    .line 809
    const-string v2, "network disconnected, wait"

    .line 810
    .line 811
    new-array v5, v3, [Ljava/lang/Object;

    .line 812
    .line 813
    invoke-static {v0, v2, v5}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 814
    .line 815
    .line 816
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 817
    .line 818
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V

    .line 823
    .line 824
    .line 825
    monitor-exit v7

    .line 826
    goto/16 :goto_18

    .line 827
    .line 828
    :goto_a
    monitor-exit v7
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 829
    :try_start_b
    throw v0

    .line 830
    :cond_12
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 831
    .line 832
    const-string v2, "send succ, remove it"

    .line 833
    .line 834
    new-array v5, v3, [Ljava/lang/Object;

    .line 835
    .line 836
    invoke-static {v0, v2, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 837
    .line 838
    .line 839
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 840
    .line 841
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 842
    .line 843
    .line 844
    move-result-object v2

    .line 845
    monitor-enter v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 846
    :try_start_c
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 847
    .line 848
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 853
    .line 854
    .line 855
    monitor-exit v2

    .line 856
    goto/16 :goto_18

    .line 857
    .line 858
    :catchall_6
    move-exception v0

    .line 859
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 860
    :try_start_d
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 861
    :goto_b
    iget-object v2, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 862
    .line 863
    const-string v5, " run finally error"

    .line 864
    .line 865
    new-array v6, v3, [Ljava/lang/Object;

    .line 866
    .line 867
    invoke-static {v2, v5, v0, v6}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 868
    .line 869
    .line 870
    goto/16 :goto_18

    .line 871
    .line 872
    :catchall_7
    move-exception v0

    .line 873
    :goto_c
    :try_start_e
    const-string v8, "accs"

    .line 874
    .line 875
    const-string v9, "send_fail"

    .line 876
    .line 877
    iget-object v10, v4, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    .line 878
    .line 879
    const-string v11, "1"

    .line 880
    .line 881
    new-instance v12, Ljava/lang/StringBuilder;

    .line 882
    .line 883
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 884
    .line 885
    .line 886
    iget-object v13, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 887
    .line 888
    iget v13, v13, Lcom/taobao/accs/net/b;->c:I

    .line 889
    .line 890
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v13

    .line 897
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 898
    .line 899
    .line 900
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 901
    .line 902
    .line 903
    move-result-object v12

    .line 904
    invoke-static {v8, v9, v10, v11, v12}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 908
    .line 909
    .line 910
    iget-object v8, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 911
    .line 912
    const-string v9, "service connection run"

    .line 913
    .line 914
    new-array v10, v3, [Ljava/lang/Object;

    .line 915
    .line 916
    invoke-static {v8, v9, v0, v10}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_b

    .line 917
    .line 918
    .line 919
    if-nez v7, :cond_17

    .line 920
    .line 921
    :try_start_f
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 922
    .line 923
    invoke-virtual {v0}, Lcom/taobao/accs/net/w;->q()V

    .line 924
    .line 925
    .line 926
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 927
    .line 928
    invoke-static {v0}, Lcom/taobao/accs/net/w;->c(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/ut/monitor/SessionMonitor;

    .line 929
    .line 930
    .line 931
    move-result-object v0

    .line 932
    if-eqz v0, :cond_13

    .line 933
    .line 934
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 935
    .line 936
    invoke-static {v0}, Lcom/taobao/accs/net/w;->c(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/ut/monitor/SessionMonitor;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    const-string v7, "send fail"

    .line 941
    .line 942
    invoke-virtual {v0, v7}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->setCloseReason(Ljava/lang/String;)V

    .line 943
    .line 944
    .line 945
    goto :goto_d

    .line 946
    :catchall_8
    move-exception v0

    .line 947
    goto/16 :goto_11

    .line 948
    .line 949
    :cond_13
    :goto_d
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 950
    .line 951
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 952
    .line 953
    .line 954
    move-result-object v7

    .line 955
    monitor-enter v7
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 956
    :try_start_10
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 957
    .line 958
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 963
    .line 964
    .line 965
    move-result v0

    .line 966
    sub-int/2addr v0, v6

    .line 967
    :goto_e
    if-ltz v0, :cond_16

    .line 968
    .line 969
    iget-object v6, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 970
    .line 971
    invoke-static {v6}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 972
    .line 973
    .line 974
    move-result-object v6

    .line 975
    invoke-virtual {v6, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v6

    .line 979
    check-cast v6, Lcom/taobao/accs/data/Message;

    .line 980
    .line 981
    if-eqz v6, :cond_15

    .line 982
    .line 983
    iget-object v8, v6, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    .line 984
    .line 985
    if-eqz v8, :cond_15

    .line 986
    .line 987
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 988
    .line 989
    .line 990
    move-result v8

    .line 991
    if-eq v8, v5, :cond_14

    .line 992
    .line 993
    iget-object v8, v6, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    .line 994
    .line 995
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 996
    .line 997
    .line 998
    move-result v8

    .line 999
    if-ne v8, v2, :cond_15

    .line 1000
    .line 1001
    goto :goto_f

    .line 1002
    :catchall_9
    move-exception v0

    .line 1003
    goto :goto_10

    .line 1004
    :cond_14
    :goto_f
    iget-object v8, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 1005
    .line 1006
    iget-object v8, v8, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    .line 1007
    .line 1008
    sget-object v9, Lcom/taobao/accs/AccsErrorCode;->SPDY_CONNECTION_DISCONNECTED_WHEN_SEND_DATA:Lcom/alibaba/sdk/android/error/ErrorCode;

    .line 1009
    .line 1010
    invoke-virtual {v8, v6, v9}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 1011
    .line 1012
    .line 1013
    iget-object v6, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 1014
    .line 1015
    invoke-static {v6}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v6

    .line 1019
    invoke-virtual {v6, v0}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    :cond_15
    add-int/lit8 v0, v0, -0x1

    .line 1023
    .line 1024
    goto :goto_e

    .line 1025
    :cond_16
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 1026
    .line 1027
    const-string v2, "network disconnected, wait"

    .line 1028
    .line 1029
    new-array v5, v3, [Ljava/lang/Object;

    .line 1030
    .line 1031
    invoke-static {v0, v2, v5}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1032
    .line 1033
    .line 1034
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 1035
    .line 1036
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V

    .line 1041
    .line 1042
    .line 1043
    monitor-exit v7

    .line 1044
    goto/16 :goto_18

    .line 1045
    .line 1046
    :goto_10
    monitor-exit v7
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 1047
    :try_start_11
    throw v0

    .line 1048
    :cond_17
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 1049
    .line 1050
    const-string v2, "send succ, remove it"

    .line 1051
    .line 1052
    new-array v5, v3, [Ljava/lang/Object;

    .line 1053
    .line 1054
    invoke-static {v0, v2, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1055
    .line 1056
    .line 1057
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 1058
    .line 1059
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v2

    .line 1063
    monitor-enter v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 1064
    :try_start_12
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 1065
    .line 1066
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v0

    .line 1070
    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 1071
    .line 1072
    .line 1073
    monitor-exit v2

    .line 1074
    goto/16 :goto_18

    .line 1075
    .line 1076
    :catchall_a
    move-exception v0

    .line 1077
    monitor-exit v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    .line 1078
    :try_start_13
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    .line 1079
    :goto_11
    iget-object v2, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 1080
    .line 1081
    const-string v5, " run finally error"

    .line 1082
    .line 1083
    new-array v6, v3, [Ljava/lang/Object;

    .line 1084
    .line 1085
    invoke-static {v2, v5, v0, v6}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 1086
    .line 1087
    .line 1088
    goto/16 :goto_18

    .line 1089
    .line 1090
    :catchall_b
    move-exception v0

    .line 1091
    move-object v8, v0

    .line 1092
    if-nez v7, :cond_1c

    .line 1093
    .line 1094
    :try_start_14
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 1095
    .line 1096
    invoke-virtual {v0}, Lcom/taobao/accs/net/w;->q()V

    .line 1097
    .line 1098
    .line 1099
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 1100
    .line 1101
    invoke-static {v0}, Lcom/taobao/accs/net/w;->c(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/ut/monitor/SessionMonitor;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    if-eqz v0, :cond_18

    .line 1106
    .line 1107
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 1108
    .line 1109
    invoke-static {v0}, Lcom/taobao/accs/net/w;->c(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/ut/monitor/SessionMonitor;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v0

    .line 1113
    const-string v4, "send fail"

    .line 1114
    .line 1115
    invoke-virtual {v0, v4}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->setCloseReason(Ljava/lang/String;)V

    .line 1116
    .line 1117
    .line 1118
    goto :goto_12

    .line 1119
    :catchall_c
    move-exception v0

    .line 1120
    goto/16 :goto_16

    .line 1121
    .line 1122
    :cond_18
    :goto_12
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 1123
    .line 1124
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v4

    .line 1128
    monitor-enter v4
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    .line 1129
    :try_start_15
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 1130
    .line 1131
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 1136
    .line 1137
    .line 1138
    move-result v0

    .line 1139
    sub-int/2addr v0, v6

    .line 1140
    :goto_13
    if-ltz v0, :cond_1b

    .line 1141
    .line 1142
    iget-object v6, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 1143
    .line 1144
    invoke-static {v6}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v6

    .line 1148
    invoke-virtual {v6, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v6

    .line 1152
    check-cast v6, Lcom/taobao/accs/data/Message;

    .line 1153
    .line 1154
    if-eqz v6, :cond_1a

    .line 1155
    .line 1156
    iget-object v7, v6, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    .line 1157
    .line 1158
    if-eqz v7, :cond_1a

    .line 1159
    .line 1160
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 1161
    .line 1162
    .line 1163
    move-result v7

    .line 1164
    if-eq v7, v5, :cond_19

    .line 1165
    .line 1166
    iget-object v7, v6, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    .line 1167
    .line 1168
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 1169
    .line 1170
    .line 1171
    move-result v7

    .line 1172
    if-ne v7, v2, :cond_1a

    .line 1173
    .line 1174
    goto :goto_14

    .line 1175
    :catchall_d
    move-exception v0

    .line 1176
    goto :goto_15

    .line 1177
    :cond_19
    :goto_14
    iget-object v7, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 1178
    .line 1179
    iget-object v7, v7, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    .line 1180
    .line 1181
    sget-object v9, Lcom/taobao/accs/AccsErrorCode;->SPDY_CONNECTION_DISCONNECTED_WHEN_SEND_DATA:Lcom/alibaba/sdk/android/error/ErrorCode;

    .line 1182
    .line 1183
    invoke-virtual {v7, v6, v9}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 1184
    .line 1185
    .line 1186
    iget-object v6, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 1187
    .line 1188
    invoke-static {v6}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v6

    .line 1192
    invoke-virtual {v6, v0}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    .line 1193
    .line 1194
    .line 1195
    :cond_1a
    add-int/lit8 v0, v0, -0x1

    .line 1196
    .line 1197
    goto :goto_13

    .line 1198
    :cond_1b
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 1199
    .line 1200
    const-string v2, "network disconnected, wait"

    .line 1201
    .line 1202
    new-array v5, v3, [Ljava/lang/Object;

    .line 1203
    .line 1204
    invoke-static {v0, v2, v5}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1205
    .line 1206
    .line 1207
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 1208
    .line 1209
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v0

    .line 1213
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V

    .line 1214
    .line 1215
    .line 1216
    monitor-exit v4

    .line 1217
    goto :goto_17

    .line 1218
    :goto_15
    monitor-exit v4
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_d

    .line 1219
    :try_start_16
    throw v0

    .line 1220
    :cond_1c
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 1221
    .line 1222
    const-string v2, "send succ, remove it"

    .line 1223
    .line 1224
    new-array v5, v3, [Ljava/lang/Object;

    .line 1225
    .line 1226
    invoke-static {v0, v2, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1227
    .line 1228
    .line 1229
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 1230
    .line 1231
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v2

    .line 1235
    monitor-enter v2
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_c

    .line 1236
    :try_start_17
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 1237
    .line 1238
    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v0

    .line 1242
    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 1243
    .line 1244
    .line 1245
    monitor-exit v2

    .line 1246
    goto :goto_17

    .line 1247
    :catchall_e
    move-exception v0

    .line 1248
    monitor-exit v2
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_e

    .line 1249
    :try_start_18
    throw v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_c

    .line 1250
    :goto_16
    iget-object v2, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    .line 1251
    .line 1252
    const-string v4, " run finally error"

    .line 1253
    .line 1254
    new-array v3, v3, [Ljava/lang/Object;

    .line 1255
    .line 1256
    invoke-static {v2, v4, v0, v3}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 1257
    .line 1258
    .line 1259
    :goto_17
    throw v8

    .line 1260
    :cond_1d
    :goto_18
    move-object v0, v4

    .line 1261
    goto/16 :goto_0

    .line 1262
    .line 1263
    :goto_19
    :try_start_19
    monitor-exit v2
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    .line 1264
    throw v0

    .line 1265
    :cond_1e
    :goto_1a
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 1266
    .line 1267
    invoke-virtual {v0}, Lcom/taobao/accs/net/w;->q()V

    .line 1268
    .line 1269
    .line 1270
    return-void
.end method
