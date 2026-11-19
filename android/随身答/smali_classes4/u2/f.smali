.class public Lu2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public b:Lx2/g;

.field public c:Lw2/b;

.field public d:Lw2/g;

.field public e:Lw2/b$a;

.field public f:Ly2/a;

.field public g:Ly2/b;

.field public h:J

.field public i:I

.field public j:I

.field public k:Ljava/lang/String;

.field public l:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lu2/f;->a:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lu2/f;->d:Lw2/g;

    .line 9
    .line 10
    iput-object v0, p0, Lu2/f;->e:Lw2/b$a;

    .line 11
    .line 12
    iput-object v0, p0, Lu2/f;->f:Ly2/a;

    .line 13
    .line 14
    iput-object v0, p0, Lu2/f;->g:Ly2/b;

    .line 15
    .line 16
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    iput-wide v1, p0, Lu2/f;->h:J

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    iput v3, p0, Lu2/f;->i:I

    .line 22
    .line 23
    iput v3, p0, Lu2/f;->j:I

    .line 24
    .line 25
    iput-object v0, p0, Lu2/f;->k:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p1, p0, Lu2/f;->l:Landroid/content/Context;

    .line 28
    .line 29
    invoke-static {p1}, Lw2/b;->u(Landroid/content/Context;)Lw2/b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lw2/b;->o()Lw2/b$a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lu2/f;->e:Lw2/b$a;

    .line 38
    .line 39
    iget-object p1, p0, Lu2/f;->l:Landroid/content/Context;

    .line 40
    .line 41
    invoke-static {p1}, Ly2/b;->c(Landroid/content/Context;)Ly2/b;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lu2/f;->g:Ly2/b;

    .line 46
    .line 47
    iget-object p1, p0, Lu2/f;->l:Landroid/content/Context;

    .line 48
    .line 49
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v4, "thtstart"

    .line 54
    .line 55
    invoke-interface {p1, v4, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v1

    .line 59
    iput-wide v1, p0, Lu2/f;->h:J

    .line 60
    .line 61
    const-string v1, "gkvc"

    .line 62
    .line 63
    invoke-interface {p1, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    iput v1, p0, Lu2/f;->i:I

    .line 68
    .line 69
    const-string v1, "ekvc"

    .line 70
    .line 71
    invoke-interface {p1, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    iput p1, p0, Lu2/f;->j:I

    .line 76
    .line 77
    iget-object p1, p0, Lu2/f;->l:Landroid/content/Context;

    .line 78
    .line 79
    const-string v1, "track_list"

    .line 80
    .line 81
    invoke-static {p1, v1, v0}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, Lu2/f;->k:Ljava/lang/String;

    .line 86
    .line 87
    iget-object p1, p0, Lu2/f;->l:Landroid/content/Context;

    .line 88
    .line 89
    invoke-static {p1}, Lw2/b;->u(Landroid/content/Context;)Lw2/b;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iput-object p1, p0, Lu2/f;->c:Lw2/b;

    .line 94
    .line 95
    new-instance v0, Lu2/f$a;

    .line 96
    .line 97
    invoke-direct {v0, p0}, Lu2/f$a;-><init>(Lu2/f;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v0}, Lw2/b;->i(Lx2/h;)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Lu2/f;->l:Landroid/content/Context;

    .line 104
    .line 105
    invoke-static {p1}, Lk2/a;->g(Landroid/content/Context;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_0

    .line 110
    .line 111
    iget-object p1, p0, Lu2/f;->l:Landroid/content/Context;

    .line 112
    .line 113
    invoke-static {p1}, Lw2/g;->a(Landroid/content/Context;)Lw2/g;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iput-object p1, p0, Lu2/f;->d:Lw2/g;

    .line 118
    .line 119
    :cond_0
    new-instance p1, Lx2/g;

    .line 120
    .line 121
    iget-object v0, p0, Lu2/f;->l:Landroid/content/Context;

    .line 122
    .line 123
    invoke-direct {p1, v0}, Lx2/g;-><init>(Landroid/content/Context;)V

    .line 124
    .line 125
    .line 126
    iput-object p1, p0, Lu2/f;->b:Lx2/g;

    .line 127
    .line 128
    iget-object v0, p0, Lu2/f;->l:Landroid/content/Context;

    .line 129
    .line 130
    invoke-static {v0}, Lx2/b;->e(Landroid/content/Context;)Lx2/b;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {p1, v0}, Lx2/g;->c(Lx2/f;)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method public static synthetic b(Lu2/f;)Ly2/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lu2/f;->g:Ly2/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Lu2/f;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lu2/f;->l:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final a([B)I
    .locals 3

    .line 1
    new-instance v0, Lcom/umeng/commonsdk/statistics/proto/Response;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/umeng/commonsdk/statistics/proto/Response;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/umeng/analytics/pro/a;

    .line 7
    .line 8
    new-instance v2, Lcom/umeng/analytics/pro/bi$a;

    .line 9
    .line 10
    invoke-direct {v2}, Lcom/umeng/analytics/pro/bi$a;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v2}, Lcom/umeng/analytics/pro/a;-><init>(Lcom/umeng/analytics/pro/br;)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    :try_start_0
    invoke-virtual {v1, v0, p1}, Lcom/umeng/analytics/pro/a;->a(Lcom/umeng/analytics/pro/aq;[B)V

    .line 18
    .line 19
    .line 20
    iget p1, v0, Lcom/umeng/commonsdk/statistics/proto/Response;->a:I

    .line 21
    .line 22
    if-ne p1, v2, :cond_0

    .line 23
    .line 24
    iget-object p1, p0, Lu2/f;->c:Lw2/b;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/umeng/commonsdk/statistics/proto/Response;->u()Lcom/umeng/commonsdk/statistics/proto/d;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p1, v1}, Lw2/b;->m(Lcom/umeng/commonsdk/statistics/proto/d;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lu2/f;->c:Lw2/b;

    .line 34
    .line 35
    invoke-virtual {p1}, Lw2/b;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    iget-object v1, p0, Lu2/f;->l:Landroid/content/Context;

    .line 41
    .line 42
    invoke-static {v1, p1}, Lp2/a;->b(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    :goto_0
    iget p1, v0, Lcom/umeng/commonsdk/statistics/proto/Response;->a:I

    .line 46
    .line 47
    if-ne p1, v2, :cond_1

    .line 48
    .line 49
    const/4 p1, 0x2

    .line 50
    return p1

    .line 51
    :cond_1
    const/4 p1, 0x3

    .line 52
    return p1
.end method

.method public c(Ljava/io/File;)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lcom/umeng/commonsdk/framework/b;->q(Ljava/lang/String;)[B

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    return v0

    .line 16
    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    return v0

    .line 27
    :cond_2
    iget-object v2, p0, Lu2/f;->l:Landroid/content/Context;

    .line 28
    .line 29
    invoke-static {v2}, Lx2/e;->b(Landroid/content/Context;)Lx2/e;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2, p1}, Lx2/e;->g(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, p1}, Lx2/e;->c(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {v2, p1}, Lx2/e;->e(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-virtual {v2, p1}, Lx2/e;->f(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-static {p1}, Lt2/d;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-nez v5, :cond_3

    .line 57
    .line 58
    invoke-static {p1}, Lt2/d;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    goto/16 :goto_4

    .line 65
    .line 66
    :cond_3
    if-eqz v2, :cond_4

    .line 67
    .line 68
    sget-object p1, Lu2/c;->a:Ljava/lang/String;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    sget-object p1, Lu2/c;->d:Ljava/lang/String;

    .line 72
    .line 73
    :goto_0
    iget-object v5, p0, Lu2/f;->b:Lx2/g;

    .line 74
    .line 75
    invoke-virtual {v5, v1, v3, v2, p1}, Lx2/g;->e([BZZLjava/lang/String;)[B

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const/4 v1, 0x1

    .line 80
    if-nez p1, :cond_5

    .line 81
    .line 82
    move p1, v1

    .line 83
    goto :goto_1

    .line 84
    :cond_5
    invoke-virtual {p0, p1}, Lu2/f;->a([B)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    :goto_1
    invoke-static {}, Lk2/a;->e()Z

    .line 89
    .line 90
    .line 91
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    const-string v6, "MobclickRT"

    .line 93
    .line 94
    const/4 v7, 0x2

    .line 95
    if-eqz v5, :cond_9

    .line 96
    .line 97
    if-eqz v2, :cond_6

    .line 98
    .line 99
    if-ne p1, v7, :cond_6

    .line 100
    .line 101
    :try_start_1
    const-string v3, "Zero req: succeed."

    .line 102
    .line 103
    invoke-static {v6, v3}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_6
    if-eqz v4, :cond_7

    .line 108
    .line 109
    if-ne p1, v7, :cond_7

    .line 110
    .line 111
    const-string v3, "\u672c\u6b21\u542f\u52a8\u6570\u636e: \u53d1\u9001\u6210\u529f!"

    .line 112
    .line 113
    invoke-static {v3}, Lv2/d;->a(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    const-string v3, "Send instant data: succeed."

    .line 117
    .line 118
    invoke-static {v6, v3}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_7
    if-eqz v3, :cond_8

    .line 123
    .line 124
    if-ne p1, v7, :cond_8

    .line 125
    .line 126
    const-string v3, "\u666e\u901a\u7edf\u8ba1\u6570\u636e: \u53d1\u9001\u6210\u529f!"

    .line 127
    .line 128
    invoke-static {v3}, Lv2/d;->a(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const-string v3, "Send analytics data: succeed."

    .line 132
    .line 133
    invoke-static {v6, v3}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_8
    const-string v3, "Inner req: succeed."

    .line 138
    .line 139
    invoke-static {v6, v3}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :cond_9
    :goto_2
    if-eq p1, v7, :cond_b

    .line 143
    .line 144
    const/4 v3, 0x3

    .line 145
    if-eq p1, v3, :cond_a

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_a
    iget-object v3, p0, Lu2/f;->l:Landroid/content/Context;

    .line 149
    .line 150
    invoke-static {v3}, Lx2/b;->e(Landroid/content/Context;)Lx2/b;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-virtual {v3}, Lx2/b;->k()V

    .line 155
    .line 156
    .line 157
    if-eqz v2, :cond_d

    .line 158
    .line 159
    invoke-static {}, Lcom/umeng/commonsdk/config/a;->b()Lcom/umeng/commonsdk/config/a;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iget-object v2, p0, Lu2/f;->l:Landroid/content/Context;

    .line 164
    .line 165
    invoke-virtual {p1, v2}, Lcom/umeng/commonsdk/config/a;->c(Landroid/content/Context;)V

    .line 166
    .line 167
    .line 168
    const-string p1, "--->>> \u96f6\u53f7\u62a5\u6587\u5e94\u7b54\u5185\u5bb9\u62a5\u9519!!! \uff0c\u7279\u6b8a\u5904\u7406!\uff0c\u7ee7\u7eed\u6b63\u5e38\u6d41\u7a0b\u3002"

    .line 169
    .line 170
    invoke-static {v6, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, Lu2/f;->l:Landroid/content/Context;

    .line 174
    .line 175
    invoke-static {p1}, Lo2/b;->a(Landroid/content/Context;)Lo2/b;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {v2}, Lo2/b;->b()Lo2/c;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    const/4 v3, 0x0

    .line 184
    const v4, 0x8010

    .line 185
    .line 186
    .line 187
    invoke-static {p1, v4, v2, v3}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    return v1

    .line 191
    :cond_b
    iget-object v2, p0, Lu2/f;->d:Lw2/g;

    .line 192
    .line 193
    if-eqz v2, :cond_c

    .line 194
    .line 195
    invoke-virtual {v2}, Lw2/g;->h()V

    .line 196
    .line 197
    .line 198
    :cond_c
    iget-object v2, p0, Lu2/f;->l:Landroid/content/Context;

    .line 199
    .line 200
    invoke-static {v2}, Lx2/b;->e(Landroid/content/Context;)Lx2/b;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-virtual {v2}, Lx2/b;->k()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 205
    .line 206
    .line 207
    :cond_d
    :goto_3
    if-ne p1, v7, :cond_e

    .line 208
    .line 209
    return v1

    .line 210
    :cond_e
    return v0

    .line 211
    :goto_4
    iget-object v1, p0, Lu2/f;->l:Landroid/content/Context;

    .line 212
    .line 213
    invoke-static {v1, p1}, Lp2/a;->b(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    return v0
.end method
