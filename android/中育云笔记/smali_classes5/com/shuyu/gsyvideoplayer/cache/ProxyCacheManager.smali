.class public Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;
.implements Ls1/b;


# static fields
.field public static DEFAULT_MAX_COUNT:I = -0x1

.field public static DEFAULT_MAX_SIZE:J = 0x20000000L

.field private static fileNameGenerator:Lt1/c;

.field private static proxyCacheManager:Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;


# instance fields
.field private cacheAvailableListener:Lcom/shuyu/gsyvideoplayer/cache/ICacheManager$ICacheAvailableListener;

.field protected mCacheDir:Ljava/io/File;

.field protected mCacheFile:Z

.field protected proxy:Ls1/g;

.field private trustAllCerts:[Ljavax/net/ssl/TrustManager;

.field protected userAgentHeadersInjector:Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheUserAgentHeadersInjector;

.field private v:Ljavax/net/ssl/HostnameVerifier;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheUserAgentHeadersInjector;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheUserAgentHeadersInjector;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->userAgentHeadersInjector:Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheUserAgentHeadersInjector;

    .line 10
    .line 11
    return-void
.end method

.method public static clearFileNameGenerator()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    sput-object v0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->fileNameGenerator:Lt1/c;

    .line 3
    .line 4
    return-void
.end method

.method public static getProxy(Landroid/content/Context;)Ls1/g;
    .locals 2

    .line 1
    invoke-static {}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->instance()Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;

    move-result-object v0

    iget-object v0, v0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->proxy:Ls1/g;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->instance()Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->instance()Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->newProxy(Landroid/content/Context;)Ls1/g;

    move-result-object p0

    iput-object p0, v0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->proxy:Ls1/g;

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static getProxy(Landroid/content/Context;Ljava/io/File;)Ls1/g;
    .locals 2

    if-nez p1, :cond_0

    .line 4
    invoke-static {p0}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->getProxy(Landroid/content/Context;)Ls1/g;

    move-result-object p0

    return-object p0

    .line 5
    :cond_0
    invoke-static {}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->instance()Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;

    move-result-object v0

    iget-object v0, v0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->mCacheDir:Ljava/io/File;

    if-eqz v0, :cond_2

    .line 6
    invoke-static {}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->instance()Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;

    move-result-object v0

    iget-object v0, v0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->mCacheDir:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 7
    invoke-static {}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->instance()Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;

    move-result-object v0

    iget-object v0, v0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->proxy:Ls1/g;

    if-eqz v0, :cond_1

    .line 8
    invoke-virtual {v0}, Ls1/g;->r()V

    .line 9
    :cond_1
    invoke-static {}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->instance()Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;

    move-result-object v0

    .line 10
    invoke-static {}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->instance()Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;

    move-result-object v1

    invoke-virtual {v1, p0, p1}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->newProxy(Landroid/content/Context;Ljava/io/File;)Ls1/g;

    move-result-object p0

    iput-object p0, v0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->proxy:Ls1/g;

    return-object p0

    .line 11
    :cond_2
    invoke-static {}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->instance()Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;

    move-result-object v0

    iget-object v0, v0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->proxy:Ls1/g;

    if-nez v0, :cond_3

    .line 12
    invoke-static {}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->instance()Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;

    move-result-object v0

    .line 13
    invoke-static {}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->instance()Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;

    move-result-object v1

    invoke-virtual {v1, p0, p1}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->newProxy(Landroid/content/Context;Ljava/io/File;)Ls1/g;

    move-result-object p0

    iput-object p0, v0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->proxy:Ls1/g;

    return-object p0

    :cond_3
    return-object v0
.end method

.method public static declared-synchronized instance()Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;
    .locals 2

    .line 1
    const-class v0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->proxyCacheManager:Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->proxyCacheManager:Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    sget-object v1, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->proxyCacheManager:Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v1
.end method

.method public static setFileNameGenerator(Lt1/c;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->fileNameGenerator:Lt1/c;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public cachePreview(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1, p2}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->getProxy(Landroid/content/Context;Ljava/io/File;)Ls1/g;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, p3}, Ls1/g;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    :cond_0
    const-string p1, "http"

    .line 16
    .line 17
    invoke-virtual {p3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    xor-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    return p1
.end method

.method public clearCache(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Ls1/q;->c(Landroid/content/Context;)Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance p2, Ljava/io/File;

    .line 22
    .line 23
    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p2}, Lcom/shuyu/gsyvideoplayer/utils/FileUtils;->deleteFiles(Ljava/io/File;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-static {p2}, Lcom/shuyu/gsyvideoplayer/utils/FileUtils;->deleteFiles(Ljava/io/File;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    new-instance v0, Lt1/f;

    .line 35
    .line 36
    invoke-direct {v0}, Lt1/f;-><init>()V

    .line 37
    .line 38
    .line 39
    sget-object v1, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->fileNameGenerator:Lt1/c;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    move-object v0, v1

    .line 44
    :cond_2
    invoke-interface {v0, p3}, Lt1/c;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    const-string v0, ".download"

    .line 49
    .line 50
    if-eqz p2, :cond_3

    .line 51
    .line 52
    new-instance p1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-static {p1}, Lcom/shuyu/gsyvideoplayer/utils/CommonUtil;->deleteFile(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {p2}, Lcom/shuyu/gsyvideoplayer/utils/CommonUtil;->deleteFile(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-static {v1}, Ls1/q;->c(Landroid/content/Context;)Ljava/io/File;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    new-instance v0, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {p1}, Ls1/q;->c(Landroid/content/Context;)Ljava/io/File;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-static {p2}, Lcom/shuyu/gsyvideoplayer/utils/CommonUtil;->deleteFile(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-static {p1}, Lcom/shuyu/gsyvideoplayer/utils/CommonUtil;->deleteFile(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    return-void
.end method

.method public doCacheLogic(Landroid/content/Context;Ltv/danmaku/ijk/media/player/IMediaPlayer;Ljava/lang/String;Ljava/util/Map;Ljava/io/File;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ltv/danmaku/ijk/media/player/IMediaPlayer;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/io/File;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheUserAgentHeadersInjector;->mMapHeadData:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    if-eqz p4, :cond_0

    .line 7
    .line 8
    invoke-interface {v0, p4}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    const-string v0, "http"

    .line 12
    .line 13
    invoke-virtual {p3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const-string v2, ".m3u8"

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    const-string v1, "127.0.0.1"

    .line 22
    .line 23
    invoke-virtual {p3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p3, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1, p5}, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->getProxy(Landroid/content/Context;Ljava/io/File;)Ls1/g;

    .line 40
    .line 41
    .line 42
    move-result-object p5

    .line 43
    if-eqz p5, :cond_3

    .line 44
    .line 45
    invoke-virtual {p5, p3}, Ls1/g;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    xor-int/lit8 v2, v0, 0x1

    .line 54
    .line 55
    iput-boolean v2, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->mCacheFile:Z

    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    invoke-virtual {p5, p0, p3}, Ls1/g;->p(Ls1/b;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    move-object p3, v1

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-virtual {p3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result p5

    .line 68
    if-nez p5, :cond_3

    .line 69
    .line 70
    const-string p5, "rtmp"

    .line 71
    .line 72
    invoke-virtual {p3, p5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result p5

    .line 76
    if-nez p5, :cond_3

    .line 77
    .line 78
    const-string p5, "rtsp"

    .line 79
    .line 80
    invoke-virtual {p3, p5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result p5

    .line 84
    if-nez p5, :cond_3

    .line 85
    .line 86
    invoke-virtual {p3, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result p5

    .line 90
    if-nez p5, :cond_3

    .line 91
    .line 92
    const/4 p5, 0x1

    .line 93
    iput-boolean p5, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->mCacheFile:Z

    .line 94
    .line 95
    :cond_3
    :goto_0
    :try_start_0
    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    invoke-interface {p2, p1, p3, p4}, Ltv/danmaku/ijk/media/player/IMediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :catch_0
    move-exception p1

    .line 104
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->v:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTrustAllCerts()[Ljavax/net/ssl/TrustManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->trustAllCerts:[Ljavax/net/ssl/TrustManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public hadCached()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->mCacheFile:Z

    .line 2
    .line 3
    return v0
.end method

.method public newProxy(Landroid/content/Context;)Ls1/g;
    .locals 2

    .line 15
    new-instance v0, Ls1/g$b;

    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Ls1/g$b;-><init>(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->userAgentHeadersInjector:Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheUserAgentHeadersInjector;

    .line 17
    invoke-virtual {v0, p1}, Ls1/g$b;->e(Lu1/b;)Ls1/g$b;

    move-result-object p1

    .line 18
    sget v0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->DEFAULT_MAX_COUNT:I

    if-lez v0, :cond_0

    .line 19
    invoke-virtual {p1, v0}, Ls1/g$b;->g(I)Ls1/g$b;

    goto :goto_0

    .line 20
    :cond_0
    sget-wide v0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->DEFAULT_MAX_SIZE:J

    invoke-virtual {p1, v0, v1}, Ls1/g$b;->h(J)Ls1/g$b;

    .line 21
    :goto_0
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->v:Ljavax/net/ssl/HostnameVerifier;

    invoke-virtual {p1, v0}, Ls1/g$b;->f(Ljavax/net/ssl/HostnameVerifier;)Ls1/g$b;

    .line 22
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->trustAllCerts:[Ljavax/net/ssl/TrustManager;

    invoke-virtual {p1, v0}, Ls1/g$b;->i([Ljavax/net/ssl/TrustManager;)Ls1/g$b;

    .line 23
    invoke-virtual {p1}, Ls1/g$b;->a()Ls1/g;

    move-result-object p1

    return-object p1
.end method

.method public newProxy(Landroid/content/Context;Ljava/io/File;)Ls1/g;
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z

    .line 3
    :cond_0
    new-instance v0, Ls1/g$b;

    invoke-direct {v0, p1}, Ls1/g$b;-><init>(Landroid/content/Context;)V

    .line 4
    invoke-virtual {v0, p2}, Ls1/g$b;->c(Ljava/io/File;)Ls1/g$b;

    .line 5
    sget p1, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->DEFAULT_MAX_COUNT:I

    if-lez p1, :cond_1

    .line 6
    invoke-virtual {v0, p1}, Ls1/g$b;->g(I)Ls1/g$b;

    goto :goto_0

    .line 7
    :cond_1
    sget-wide v1, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->DEFAULT_MAX_SIZE:J

    invoke-virtual {v0, v1, v2}, Ls1/g$b;->h(J)Ls1/g$b;

    .line 8
    :goto_0
    iget-object p1, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->userAgentHeadersInjector:Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheUserAgentHeadersInjector;

    invoke-virtual {v0, p1}, Ls1/g$b;->e(Lu1/b;)Ls1/g$b;

    .line 9
    iget-object p1, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->v:Ljavax/net/ssl/HostnameVerifier;

    invoke-virtual {v0, p1}, Ls1/g$b;->f(Ljavax/net/ssl/HostnameVerifier;)Ls1/g$b;

    .line 10
    iget-object p1, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->trustAllCerts:[Ljavax/net/ssl/TrustManager;

    invoke-virtual {v0, p1}, Ls1/g$b;->i([Ljavax/net/ssl/TrustManager;)Ls1/g$b;

    .line 11
    sget-object p1, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->fileNameGenerator:Lt1/c;

    if-eqz p1, :cond_2

    .line 12
    invoke-virtual {v0, p1}, Ls1/g$b;->d(Lt1/c;)Ls1/g$b;

    .line 13
    :cond_2
    iput-object p2, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->mCacheDir:Ljava/io/File;

    .line 14
    invoke-virtual {v0}, Ls1/g$b;->a()Ls1/g;

    move-result-object p1

    return-object p1
.end method

.method public onCacheAvailable(Ljava/io/File;Ljava/lang/String;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->cacheAvailableListener:Lcom/shuyu/gsyvideoplayer/cache/ICacheManager$ICacheAvailableListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3}, Lcom/shuyu/gsyvideoplayer/cache/ICacheManager$ICacheAvailableListener;->onCacheAvailable(Ljava/io/File;Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->proxy:Ls1/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0, p0}, Ls1/g;->u(Ls1/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setCacheAvailableListener(Lcom/shuyu/gsyvideoplayer/cache/ICacheManager$ICacheAvailableListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->cacheAvailableListener:Lcom/shuyu/gsyvideoplayer/cache/ICacheManager$ICacheAvailableListener;

    .line 2
    .line 3
    return-void
.end method

.method public setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->v:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-void
.end method

.method public setProxy(Ls1/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->proxy:Ls1/g;

    .line 2
    .line 3
    return-void
.end method

.method public setTrustAllCerts([Ljavax/net/ssl/TrustManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/shuyu/gsyvideoplayer/cache/ProxyCacheManager;->trustAllCerts:[Ljavax/net/ssl/TrustManager;

    .line 2
    .line 3
    return-void
.end method
