.class public Lo2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/commonsdk/framework/UMLogDataProtocol;


# static fields
.field public static b:I = 0x1

.field public static c:Ljava/lang/Class; = null

.field public static d:Ljava/lang/reflect/Method; = null

.field public static e:Ljava/lang/reflect/Method; = null

.field public static f:Ljava/lang/reflect/Method; = null

.field public static g:Z = false


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lo2/c;->k()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lo2/c;->a:Landroid/content/Context;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static synthetic b(Lo2/c;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lo2/c;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/Class;
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    const/4 p0, 0x0

    .line 7
    return-object p0
.end method

.method public static h(Landroid/content/Context;Lr2/a;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    new-instance v0, Ljava/lang/Thread;

    .line 9
    .line 10
    new-instance v1, Lo2/c$b;

    .line 11
    .line 12
    invoke-direct {v1, p0, p1}, Lo2/c$b;-><init>(Landroid/content/Context;Lr2/a;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static i()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lo2/c;->c:Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lo2/c;->d:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v2, Lo2/c;->f:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :try_start_0
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object v1, Lo2/c;->f:Ljava/lang/reflect/Method;

    .line 21
    .line 22
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    return-object v0

    .line 29
    :catchall_0
    :cond_0
    const-string v0, ""

    .line 30
    .line 31
    return-object v0
.end method

.method public static j(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, Lo2/c$a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lo2/c$a;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static k()V
    .locals 4

    .line 1
    :try_start_0
    const-class v0, Lc3/a;

    .line 2
    .line 3
    sput-object v0, Lo2/c;->c:Ljava/lang/Class;

    .line 4
    .line 5
    const-string v1, "getInstance"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sput-object v0, Lo2/c;->d:Ljava/lang/reflect/Method;

    .line 15
    .line 16
    :cond_0
    sget-object v0, Lo2/c;->c:Ljava/lang/Class;

    .line 17
    .line 18
    const-string v1, "getZID"

    .line 19
    .line 20
    const-class v3, Landroid/content/Context;

    .line 21
    .line 22
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    sput-object v0, Lo2/c;->e:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    :cond_1
    sget-object v0, Lo2/c;->c:Ljava/lang/Class;

    .line 35
    .line 36
    const-string v1, "getSDKVersion"

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    sput-object v0, Lo2/c;->f:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    :catchall_0
    :cond_2
    return-void
.end method

.method public static l(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "header_device_oaid"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/umeng/commonsdk/config/a;->e(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v1, 0x1c

    .line 12
    .line 13
    if-le v0, v1, :cond_0

    .line 14
    .line 15
    new-instance v0, Lo2/c$c;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lo2/c$c;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v0}, Lo2/c;->h(Landroid/content/Context;Lr2/a;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public static p(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/io/File;

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    sget-object p0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, "umeng_zcfg_flag"

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-nez p0, :cond_0

    .line 41
    .line 42
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    :catchall_0
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Ljava/lang/Object;I)V
    .locals 9

    .line 1
    const-string v0, "[internal] workEvent"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "walle"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lv2/f;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const-class v0, Lq2/c;

    .line 13
    .line 14
    const-string v2, "[internal] workEvent send envelope"

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const-class v4, Ljava/lang/String;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const-class v6, Landroid/content/Context;

    .line 21
    .line 22
    const/4 v7, 0x1

    .line 23
    const-string v8, "MobclickRT"

    .line 24
    .line 25
    packed-switch p2, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    :pswitch_0
    goto/16 :goto_1

    .line 29
    .line 30
    :pswitch_1
    :try_start_0
    iget-object p1, p0, Lo2/c;->a:Landroid/content/Context;

    .line 31
    .line 32
    invoke-static {p1}, Lm2/d;->a(Landroid/content/Context;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    const-string p1, "--->>> \u6b63\u5e38\u51b7\u542f\u52a8\u6d41\u7a0b\uff0c\u63a5\u6536\u5230\u4e91\u63a7\u914d\u7f6e\u52a0\u8f7d\u6210\u529f\u901a\u77e5\u3002"

    .line 37
    .line 38
    invoke-static {v8, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lo2/c;->a:Landroid/content/Context;

    .line 42
    .line 43
    invoke-static {p1}, Lo2/c;->l(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lo2/c;->a:Landroid/content/Context;

    .line 47
    .line 48
    invoke-static {p1}, Lk2/e;->a(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lo2/c;->a:Landroid/content/Context;

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lo2/c;->n(Landroid/content/Context;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_3
    const-string p1, "--->>> \u6210\u529f\u63a5\u6536\u5230(OAID)\u8bfb\u53d6\u7ed3\u675f\u901a\u77e5\u3002"

    .line 58
    .line 59
    invoke-static {v8, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sget p1, Lo2/c;->b:I

    .line 63
    .line 64
    sub-int/2addr p1, v7

    .line 65
    sput p1, Lo2/c;->b:I

    .line 66
    .line 67
    invoke-virtual {p0}, Lo2/c;->r()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_4
    const-string p1, "--->>> \u4e91\u63a7\u4e0b\u53d1\u53c2\u6570\u66f4\u65b0\uff0c\u89e6\u53d1 \u4f2a\u51b7\u542f\u52a8\u3002"

    .line 72
    .line 73
    invoke-static {v8, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lu2/e;->h()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lo2/c;->o()V

    .line 80
    .line 81
    .line 82
    const-string p1, "header_foreground_count"

    .line 83
    .line 84
    invoke-static {p1}, Lcom/umeng/commonsdk/config/a;->e(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_0

    .line 89
    .line 90
    invoke-static {}, Ln2/c;->e()Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-nez p1, :cond_0

    .line 95
    .line 96
    const-string p1, "--->>> \u4e91\u63a7\u4e0b\u53d1\u53c2\u6570\u66f4\u65b0 \u524d\u53f0\u8ba1\u6570\u5668\u529f\u80fd \u6253\u5f00\uff0c\u89e6\u53d1 5\u79d2\u5468\u671f\u68c0\u67e5\u673a\u5236"

    .line 97
    .line 98
    invoke-static {v8, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Lo2/c;->a:Landroid/content/Context;

    .line 102
    .line 103
    invoke-static {v0}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    const/4 v3, 0x0

    .line 108
    const-wide/16 v4, 0x1388

    .line 109
    .line 110
    const/16 v1, 0x2015

    .line 111
    .line 112
    invoke-static/range {v0 .. v5}, Ln2/c;->n(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;J)V

    .line 113
    .line 114
    .line 115
    :cond_0
    const-string p1, "header_first_resume"

    .line 116
    .line 117
    invoke-static {p1}, Lcom/umeng/commonsdk/config/a;->e(Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_7

    .line 122
    .line 123
    const-string p1, "--->>> \u4e91\u63a7\u4e0b\u53d1\u53c2\u6570\u66f4\u65b0 FirstResume\u529f\u80fd \u6253\u5f00\uff0c\u89e6\u53d1 trigger"

    .line 124
    .line 125
    invoke-static {v8, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Lo2/c;->a:Landroid/content/Context;

    .line 129
    .line 130
    invoke-static {p1}, Lcom/umeng/analytics/pro/d;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/d;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    iget-object p2, p0, Lo2/c;->a:Landroid/content/Context;

    .line 135
    .line 136
    invoke-virtual {p1, p2}, Lcom/umeng/analytics/pro/d;->k(Landroid/content/Context;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :pswitch_5
    :try_start_1
    const-string p1, "--->>> \u89e6\u53d12\u53f7\u4ed3\u9057\u7559\u4fe1\u5c01\u68c0\u67e5\u52a8\u4f5c\u3002"

    .line 141
    .line 142
    invoke-static {v8, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget-object p1, p0, Lo2/c;->a:Landroid/content/Context;

    .line 146
    .line 147
    invoke-static {p1, v5}, Lt2/d;->c(Landroid/content/Context;Z)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iget-object p2, p0, Lo2/c;->a:Landroid/content/Context;

    .line 152
    .line 153
    invoke-static {p2, v7}, Lt2/d;->c(Landroid/content/Context;Z)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-nez v0, :cond_1

    .line 162
    .line 163
    new-instance v0, Ljava/io/File;

    .line 164
    .line 165
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_1

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-eqz p1, :cond_1

    .line 179
    .line 180
    move v5, v7

    .line 181
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    if-nez p1, :cond_2

    .line 186
    .line 187
    new-instance p1, Ljava/io/File;

    .line 188
    .line 189
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 193
    .line 194
    .line 195
    move-result p2

    .line 196
    if-eqz p2, :cond_2

    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    if-eqz p1, :cond_2

    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_2
    move v7, v5

    .line 206
    :goto_0
    if-eqz v7, :cond_4

    .line 207
    .line 208
    invoke-static {}, Lt2/b;->c()Z

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    if-nez p1, :cond_3

    .line 213
    .line 214
    new-instance p1, Lt2/b;

    .line 215
    .line 216
    iget-object p2, p0, Lo2/c;->a:Landroid/content/Context;

    .line 217
    .line 218
    invoke-direct {p1, p2}, Lt2/b;-><init>(Landroid/content/Context;)V

    .line 219
    .line 220
    .line 221
    invoke-static {}, Lt2/b;->e()V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_3
    const-string p1, "--->>> \u89e6\u53d12\u53f7\u4ed3\u9057\u7559\u4fe1\u5c01\u68c0\u67e5\uff0cSender\u5df2\u521b\u5efa\uff0c\u4e0d\u9700\u8981\u5904\u7406\u3002"

    .line 226
    .line 227
    invoke-static {v8, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :cond_4
    const-string p1, "--->>> \u89e6\u53d12\u53f7\u4ed3\u9057\u7559\u4fe1\u5c01\u68c0\u67e5\uff0c\u6ca1\u6709\u9700\u8981\u5904\u7406\u7684\u76ee\u5f55\uff0c\u4e0d\u9700\u8981\u5904\u7406\u3002"

    .line 232
    .line 233
    invoke-static {v8, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :pswitch_6
    iget-object p2, p0, Lo2/c;->a:Landroid/content/Context;

    .line 238
    .line 239
    invoke-static {p2, p1}, Lp2/a;->a(Landroid/content/Context;Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :pswitch_7
    const-string p1, "--->>> [\u6709\u72b6\u6001]\u63a5\u6536\u5230\u6d88\u8d39\u4e8c\u7ea7\u7f13\u5b58\u6570\u636e\u901a\u77e5."

    .line 244
    .line 245
    invoke-static {v8, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    iget-object p1, p0, Lo2/c;->a:Landroid/content/Context;

    .line 249
    .line 250
    invoke-static {p1}, Lg2/j;->c(Landroid/content/Context;)Lg2/j;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-virtual {p1}, Lg2/j;->o()Z

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    if-eqz p1, :cond_5

    .line 259
    .line 260
    const-string p1, "--->>> [\u6709\u72b6\u6001]\u5df2\u6d88\u8d39\u5b8c\u6bd5,\u4e8c\u7ea7\u7f13\u5b58\u6570\u636e\u5e93\u4e3a\u7a7a."

    .line 261
    .line 262
    invoke-static {v8, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :cond_5
    invoke-virtual {p0}, Lo2/c;->m()V

    .line 267
    .line 268
    .line 269
    const p1, 0x8011

    .line 270
    .line 271
    .line 272
    invoke-static {p1}, Ln2/c;->f(I)Z

    .line 273
    .line 274
    .line 275
    move-result p2

    .line 276
    if-nez p2, :cond_7

    .line 277
    .line 278
    iget-object p2, p0, Lo2/c;->a:Landroid/content/Context;

    .line 279
    .line 280
    invoke-static {p2}, Lo2/b;->a(Landroid/content/Context;)Lo2/b;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-virtual {v0}, Lo2/b;->b()Lo2/c;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-static {p2, p1, v0, v3}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :pswitch_8
    const-string p1, "--->>> \u96f6\u53f7\u62a5\u6587\u6d41\u7a0b\uff0c\u63a5\u6536\u5230\u4e91\u63a7\u914d\u7f6e\u52a0\u8f7d\u6210\u529f\u901a\u77e5(\u6210\u529f\u6536\u5230\u96f6\u53f7\u62a5\u6587\u5e94\u7b54)\u3002"

    .line 293
    .line 294
    invoke-static {v8, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {p0}, Lo2/c;->q()V

    .line 298
    .line 299
    .line 300
    sget p1, Lo2/c;->b:I

    .line 301
    .line 302
    sub-int/2addr p1, v7

    .line 303
    sput p1, Lo2/c;->b:I

    .line 304
    .line 305
    invoke-virtual {p0}, Lo2/c;->r()V

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :pswitch_9
    iget-object p1, p0, Lo2/c;->a:Landroid/content/Context;

    .line 310
    .line 311
    sget-object p2, Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;->c:Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;

    .line 312
    .line 313
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/framework/b;->k(Landroid/content/Context;Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;)Z

    .line 314
    .line 315
    .line 316
    move-result p1

    .line 317
    if-nez p1, :cond_6

    .line 318
    .line 319
    const-string p1, "--->>> \u6784\u5efa\u96f6\u53f7\u62a5\u6587"

    .line 320
    .line 321
    invoke-static {v8, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    iget-object p1, p0, Lo2/c;->a:Landroid/content/Context;

    .line 325
    .line 326
    invoke-virtual {p0, p1}, Lo2/c;->g(Landroid/content/Context;)V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :cond_6
    const-string p1, "--->>> \u96f6\u53f7\u62a5\u6587\u4fe1\u5c01\u6587\u4ef6\u5df2\u5b58\u5728\uff0c\u5c1d\u8bd5\u53d1\u9001\u4e4b!"

    .line 331
    .line 332
    invoke-static {v8, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    return-void

    .line 336
    :pswitch_a
    invoke-static {p1}, Lq/a;->a(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    iget-object p1, p0, Lo2/c;->a:Landroid/content/Context;

    .line 340
    .line 341
    invoke-static {p1, v3}, La3/a;->a(Landroid/content/Context;La3/c;)V

    .line 342
    .line 343
    .line 344
    return-void

    .line 345
    :pswitch_b
    :try_start_2
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    invoke-static {v1, p1}, Lv2/f;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    new-instance p1, Lorg/json/JSONObject;

    .line 353
    .line 354
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 355
    .line 356
    .line 357
    const-string p2, "i_sdk_v"

    .line 358
    .line 359
    const-string v0, "1.2.0"

    .line 360
    .line 361
    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 362
    .line 363
    .line 364
    new-instance p2, Lorg/json/JSONObject;

    .line 365
    .line 366
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 367
    .line 368
    .line 369
    new-instance v0, Lorg/json/JSONObject;

    .line 370
    .line 371
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 372
    .line 373
    .line 374
    const-string v2, "inner"

    .line 375
    .line 376
    invoke-virtual {p2, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 377
    .line 378
    .line 379
    iget-object v0, p0, Lo2/c;->a:Landroid/content/Context;

    .line 380
    .line 381
    invoke-static {v0, p1, p2}, Lcom/umeng/commonsdk/framework/a;->b(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    if-eqz p1, :cond_7

    .line 386
    .line 387
    const-string p2, "exception"

    .line 388
    .line 389
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 390
    .line 391
    .line 392
    move-result p1

    .line 393
    if-nez p1, :cond_7

    .line 394
    .line 395
    const-string p1, "[internal] workEvent send envelope back, result is ok"

    .line 396
    .line 397
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    invoke-static {v1, p1}, Lv2/f;->i(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 402
    .line 403
    .line 404
    return-void

    .line 405
    :pswitch_c
    iget-object p2, p0, Lo2/c;->a:Landroid/content/Context;

    .line 406
    .line 407
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 408
    .line 409
    .line 410
    move-result-object p2

    .line 411
    const-string v0, "info"

    .line 412
    .line 413
    invoke-virtual {p2, v0, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 414
    .line 415
    .line 416
    move-result-object p2

    .line 417
    if-eqz p2, :cond_7

    .line 418
    .line 419
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 420
    .line 421
    .line 422
    move-result-object p2

    .line 423
    const-string v0, "stat"

    .line 424
    .line 425
    check-cast p1, Ljava/lang/String;

    .line 426
    .line 427
    invoke-interface {p2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 432
    .line 433
    .line 434
    return-void

    .line 435
    :pswitch_d
    :try_start_3
    const-class p2, Lq2/b;

    .line 436
    .line 437
    const-string v0, "saveUA"

    .line 438
    .line 439
    filled-new-array {v6, v4}, [Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    invoke-virtual {p2, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    check-cast p1, Ljava/lang/String;

    .line 448
    .line 449
    iget-object v1, p0, Lo2/c;->a:Landroid/content/Context;

    .line 450
    .line 451
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object p1

    .line 455
    invoke-virtual {v0, p2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    return-void

    .line 459
    :pswitch_e
    const-class p1, Lq2/a;

    .line 460
    .line 461
    const-string p2, "wifiChange"

    .line 462
    .line 463
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 468
    .line 469
    .line 470
    move-result-object p2

    .line 471
    iget-object v0, p0, Lo2/c;->a:Landroid/content/Context;

    .line 472
    .line 473
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-virtual {p2, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 478
    .line 479
    .line 480
    return-void

    .line 481
    :pswitch_f
    new-instance p2, Ljava/lang/StringBuilder;

    .line 482
    .line 483
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 484
    .line 485
    .line 486
    const-string v2, "[internal] workEvent cache station, event is "

    .line 487
    .line 488
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object p2

    .line 502
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object p2

    .line 506
    invoke-static {v1, p2}, Lv2/f;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    :try_start_4
    const-string p2, "saveBaseStationStrength"

    .line 510
    .line 511
    filled-new-array {v6, v4}, [Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    invoke-virtual {v0, p2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 516
    .line 517
    .line 518
    move-result-object p2

    .line 519
    check-cast p1, Ljava/lang/String;

    .line 520
    .line 521
    iget-object v1, p0, Lo2/c;->a:Landroid/content/Context;

    .line 522
    .line 523
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object p1

    .line 527
    invoke-virtual {p2, v0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 528
    .line 529
    .line 530
    return-void

    .line 531
    :pswitch_10
    new-instance p2, Ljava/lang/StringBuilder;

    .line 532
    .line 533
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 534
    .line 535
    .line 536
    const-string v2, "[internal] workEvent cache battery, event is "

    .line 537
    .line 538
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object p2

    .line 552
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object p2

    .line 556
    invoke-static {v1, p2}, Lv2/f;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    :try_start_5
    const-string p2, "saveBattery"

    .line 560
    .line 561
    filled-new-array {v6, v4}, [Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    invoke-virtual {v0, p2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 566
    .line 567
    .line 568
    move-result-object p2

    .line 569
    check-cast p1, Ljava/lang/String;

    .line 570
    .line 571
    iget-object v1, p0, Lo2/c;->a:Landroid/content/Context;

    .line 572
    .line 573
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object p1

    .line 577
    invoke-virtual {p2, v0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 578
    .line 579
    .line 580
    return-void

    .line 581
    :pswitch_11
    :try_start_6
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object p1

    .line 585
    invoke-static {v1, p1}, Lv2/f;->i(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 586
    .line 587
    .line 588
    :try_start_7
    const-class p1, Lo2/a;

    .line 589
    .line 590
    const-string p2, "sendInternalEnvelopeByStateful2"

    .line 591
    .line 592
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 597
    .line 598
    .line 599
    move-result-object p2

    .line 600
    iget-object v0, p0, Lo2/c;->a:Landroid/content/Context;

    .line 601
    .line 602
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    invoke-virtual {p2, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 607
    .line 608
    .line 609
    :catch_0
    :catchall_0
    :cond_7
    :goto_1
    return-void

    .line 610
    nop

    .line 611
    :pswitch_data_0
    .packed-switch 0x8001
        :pswitch_11
        :pswitch_0
        :pswitch_10
        :pswitch_f
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public d(J)Lorg/json/JSONObject;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public f()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lo2/c;->c:Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lo2/c;->d:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v2, Lo2/c;->e:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :try_start_0
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object v1, Lo2/c;->e:Ljava/lang/reflect/Method;

    .line 21
    .line 22
    iget-object v2, p0, Lo2/c;->a:Landroid/content/Context;

    .line 23
    .line 24
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    return-object v0

    .line 35
    :catchall_0
    :cond_0
    const-string v0, ""

    .line 36
    .line 37
    return-object v0
.end method

.method public final g(Landroid/content/Context;)V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "appkey"

    .line 7
    .line 8
    invoke-static {p1}, Ls2/a;->e(Landroid/content/Context;)Ls2/a;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ls2/a;->d()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    const-string v1, "app_version"

    .line 20
    .line 21
    invoke-static {p1}, Ls2/a;->e(Landroid/content/Context;)Ls2/a;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ls2/a;->c()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    const-string v1, "os"

    .line 33
    .line 34
    const-string v2, "Android"

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 37
    .line 38
    .line 39
    sget-object v1, Lu2/c;->a:Ljava/lang/String;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-static {p1, v0, v2, v1}, Lcom/umeng/commonsdk/framework/a;->d(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    const-string v0, "MobclickRT"

    .line 47
    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    :try_start_1
    const-string v1, "exception"

    .line 51
    .line 52
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_0

    .line 57
    .line 58
    const-string p1, "--->>> \u6784\u5efa\u96f6\u53f7\u62a5\u6587\u5931\u8d25."

    .line 59
    .line 60
    invoke-static {v0, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_0
    const-string p1, "--->>> \u6784\u5efa\u96f6\u53f7\u62a5\u6587 \u6210\u529f!!!"

    .line 65
    .line 66
    invoke-static {v0, p1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    .line 68
    .line 69
    :catchall_0
    return-void
.end method

.method public final m()V
    .locals 12

    .line 1
    iget-object v0, p0, Lo2/c;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lg2/j;->c(Landroid/content/Context;)Lg2/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "stf"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lg2/j;->g(Ljava/lang/String;)Lg2/k;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    const-string v3, "--->>> [\u6709\u72b6\u6001]\u4e8c\u7ea7\u7f13\u5b58\u8bb0\u5f55\u6784\u5efa\u6210\u771f\u6b63\u4fe1\u5c01\u3002"

    .line 16
    .line 17
    const-string v4, "MobclickRT"

    .line 18
    .line 19
    invoke-static {v4, v3}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    iget-object v3, v2, Lg2/k;->a:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v10, v2, Lg2/k;->b:Ljava/lang/String;

    .line 25
    .line 26
    new-instance v7, Lorg/json/JSONObject;

    .line 27
    .line 28
    iget-object v5, v2, Lg2/k;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-direct {v7, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v8, Lorg/json/JSONObject;

    .line 34
    .line 35
    iget-object v5, v2, Lg2/k;->d:Ljava/lang/String;

    .line 36
    .line 37
    invoke-direct {v8, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v9, v2, Lg2/k;->e:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v11, v2, Lg2/k;->f:Ljava/lang/String;

    .line 43
    .line 44
    new-instance v5, Lu2/e;

    .line 45
    .line 46
    invoke-direct {v5}, Lu2/e;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, Lo2/c;->a:Landroid/content/Context;

    .line 50
    .line 51
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual/range {v5 .. v11}, Lu2/e;->e(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-eqz v2, :cond_0

    .line 60
    .line 61
    const-string v5, "exception"

    .line 62
    .line 63
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_0

    .line 68
    .line 69
    const-string v2, "--->>> [\u6709\u72b6\u6001]\u4e8c\u7ea7\u7f13\u5b58\u8bb0\u5f55\u6784\u5efa\u771f\u6b63\u4fe1\u5c01 \u5931\u8d25\u3002\u5220\u9664\u4e8c\u7ea7\u7f13\u5b58\u8bb0\u5f55"

    .line 70
    .line 71
    invoke-static {v4, v2}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    const-string v2, "--->>> [\u6709\u72b6\u6001]\u4e8c\u7ea7\u7f13\u5b58\u8bb0\u5f55\u6784\u5efa\u771f\u6b63\u4fe1\u5c01 \u6210\u529f! \u5220\u9664\u4e8c\u7ea7\u7f13\u5b58\u8bb0\u5f55\u3002"

    .line 76
    .line 77
    invoke-static {v4, v2}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :goto_0
    invoke-virtual {v0, v1, v3}, Lg2/j;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Lg2/j;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    .line 86
    :catchall_0
    :cond_1
    return-void
.end method

.method public final n(Landroid/content/Context;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lz2/d;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :try_start_0
    const-string v1, "com.umeng.umzid.ZIDManager"

    .line 10
    .line 11
    invoke-static {v1}, Lo2/c;->e(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "getInstance"

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    const-string v4, "com.umeng.umzid.IZIDCompletionCallback"

    .line 31
    .line 32
    invoke-static {v4}, Lo2/c;->e(Ljava/lang/String;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const-string v5, "init"

    .line 37
    .line 38
    const-class v6, Landroid/content/Context;

    .line 39
    .line 40
    const-class v7, Ljava/lang/String;

    .line 41
    .line 42
    filled-new-array {v6, v7, v4}, [Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v1, v5, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    filled-new-array {v0, p1, v3}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {v1, v2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    :catchall_0
    :cond_0
    return-void
.end method

.method public final o()V
    .locals 2

    .line 1
    sget-boolean v0, Lo2/c;->g:Z

    .line 2
    .line 3
    const-string v1, "header_device_oaid"

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {v1}, Lcom/umeng/commonsdk/config/a;->e(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v1, 0x1c

    .line 16
    .line 17
    if-le v0, v1, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    sput-boolean v0, Lo2/c;->g:Z

    .line 21
    .line 22
    new-instance v0, Lo2/c$d;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lo2/c$d;-><init>(Lo2/c;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lo2/c;->a:Landroid/content/Context;

    .line 28
    .line 29
    invoke-static {v1, v0}, Lo2/c;->h(Landroid/content/Context;Lr2/a;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-static {v1}, Lcom/umeng/commonsdk/config/a;->e(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    sput-boolean v0, Lo2/c;->g:Z

    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public final q()V
    .locals 2

    .line 1
    const-string v0, "header_device_oaid"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/umeng/commonsdk/config/a;->e(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v1, 0x1c

    .line 12
    .line 13
    if-le v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    sput-boolean v0, Lo2/c;->g:Z

    .line 17
    .line 18
    invoke-static {}, Lk2/b;->n()V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lo2/c;->a:Landroid/content/Context;

    .line 22
    .line 23
    invoke-static {v1}, Lk2/b;->m(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    sget v1, Lo2/c;->b:I

    .line 27
    .line 28
    add-int/2addr v1, v0

    .line 29
    sput v1, Lo2/c;->b:I

    .line 30
    .line 31
    const-string v0, "MobclickRT"

    .line 32
    .line 33
    const-string v1, "--->>> \u8981\u8bfb\u53d6 oaid\uff0c\u9700\u7b49\u5f85\u8bfb\u53d6\u7ed3\u679c."

    .line 34
    .line 35
    invoke-static {v0, v1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Lo2/c$e;

    .line 39
    .line 40
    invoke-direct {v0, p0}, Lo2/c$e;-><init>(Lo2/c;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lk2/b;->o(Lz2/e;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lo2/c;->a:Landroid/content/Context;

    .line 47
    .line 48
    invoke-static {v0}, Lo2/c;->j(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
.end method

.method public final r()V
    .locals 1

    .line 1
    sget v0, Lo2/c;->b:I

    .line 2
    .line 3
    if-gtz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lo2/c;->s()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lo2/c;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lo2/c;->n(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final s()V
    .locals 4

    .line 1
    const-string v0, "MobclickRT"

    .line 2
    .line 3
    const-string v1, "--->>> \u771f\u5b9e\u6784\u5efa\u6761\u4ef6\u6ee1\u8db3\uff0c\u5f00\u59cb\u6784\u5efa\u4e1a\u52a1\u4fe1\u5c01\u3002"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lo2/c;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {v0}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lo2/c;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {v0}, Lo2/c;->p(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lo2/c;->a:Landroid/content/Context;

    .line 22
    .line 23
    invoke-static {v0}, Lk2/e;->a(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lo2/c;->a:Landroid/content/Context;

    .line 27
    .line 28
    const/16 v1, 0x2010

    .line 29
    .line 30
    invoke-static {v0}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-static {v0, v1, v2, v3}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lo2/c;->a:Landroid/content/Context;

    .line 39
    .line 40
    invoke-static {v0}, Lo2/b;->a(Landroid/content/Context;)Lo2/b;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Lo2/b;->b()Lo2/c;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const v2, 0x8011

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v2, v1, v3}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method
