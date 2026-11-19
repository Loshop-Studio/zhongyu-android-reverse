.class public Lcom/tencent/liteav/basic/log/TXCLog;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/basic/log/TXCLog$a;
    }
.end annotation


# static fields
.field public static final LOG_ASYNC:I = 0x0

.field public static final LOG_DEBUG:I = 0x1

.field public static final LOG_ERROR:I = 0x4

.field public static final LOG_FATAL:I = 0x5

.field public static final LOG_INFO:I = 0x2

.field public static final LOG_NONE:I = 0x6

.field public static final LOG_SYNC:I = 0x1

.field public static final LOG_VERBOSE:I = 0x0

.field public static final LOG_WARNING:I = 0x3

.field private static mEnableCallback:Z = false

.field private static mEnableCompress:Z = true

.field private static mEnableConsole:Z = true

.field private static mHasInit:Z = false

.field private static mListener:Lcom/tencent/liteav/basic/log/TXCLog$a; = null

.field private static mLogCacheDir:Ljava/lang/String; = ""

.field public static mLogDir:Ljava/lang/String; = ""

.field private static mLogLevel:I

.field private static final mLogLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tencent/liteav/basic/log/TXCLog;->mLogLock:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->log(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static varargs d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->log(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x4

    .line 2
    invoke-static {v0, p0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->log(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 3
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 5
    invoke-virtual {p2, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 6
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    :goto_0
    if-eqz p2, :cond_0

    .line 7
    invoke-virtual {p2, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 8
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v1}, Ljava/io/PrintWriter;->close()V

    .line 10
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static varargs e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x4

    .line 1
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->log(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    .line 2
    invoke-static {v0, p0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->log(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static varargs i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x2

    .line 1
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->log(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static init()Z
    .locals 7

    .line 1
    sget-boolean v0, Lcom/tencent/liteav/basic/log/TXCLog;->mHasInit:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    sget-object v0, Lcom/tencent/liteav/basic/log/TXCLog;->mLogLock:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sget-boolean v2, Lcom/tencent/liteav/basic/log/TXCLog;->mHasInit:Z

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return v1

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :cond_1
    invoke-static {}, Lcom/tencent/liteav/basic/util/e;->f()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCCommonUtil;->getAppContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v2, :cond_3

    .line 28
    .line 29
    if-eqz v3, :cond_3

    .line 30
    .line 31
    sget-object v2, Lcom/tencent/liteav/basic/log/TXCLog;->mLogDir:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-virtual {v3, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    new-instance v4, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v2, "/log/tencent/liteav"

    .line 59
    .line 60
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    sput-object v2, Lcom/tencent/liteav/basic/log/TXCLog;->mLogDir:Ljava/lang/String;

    .line 68
    .line 69
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v3, "/log/tencent/liteav"

    .line 86
    .line 87
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    sput-object v2, Lcom/tencent/liteav/basic/log/TXCLog;->mLogCacheDir:Ljava/lang/String;

    .line 95
    .line 96
    const-string v2, "TXCLog"

    .line 97
    .line 98
    new-instance v3, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v4, "TXCLog init log file path : "

    .line 104
    .line 105
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    sget-object v4, Lcom/tencent/liteav/basic/log/TXCLog;->mLogDir:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v4, ", cache : "

    .line 114
    .line 115
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    sget-object v4, Lcom/tencent/liteav/basic/log/TXCLog;->mLogCacheDir:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    invoke-static {}, Lcom/tencent/liteav/basic/log/TXCLog;->nativeLogInit()V

    .line 131
    .line 132
    .line 133
    sget v2, Lcom/tencent/liteav/basic/log/TXCLog;->mLogLevel:I

    .line 134
    .line 135
    invoke-static {v2}, Lcom/tencent/liteav/basic/log/TXCLog;->nativeLogSetLevel(I)V

    .line 136
    .line 137
    .line 138
    sget-boolean v2, Lcom/tencent/liteav/basic/log/TXCLog;->mEnableConsole:Z

    .line 139
    .line 140
    invoke-static {v2}, Lcom/tencent/liteav/basic/log/TXCLog;->nativeLogSetConsole(Z)V

    .line 141
    .line 142
    .line 143
    sget-object v2, Lcom/tencent/liteav/basic/log/TXCLog;->mLogDir:Ljava/lang/String;

    .line 144
    .line 145
    sget-object v3, Lcom/tencent/liteav/basic/log/TXCLog;->mLogCacheDir:Ljava/lang/String;

    .line 146
    .line 147
    const-string v4, "LiteAV"

    .line 148
    .line 149
    sget-boolean v5, Lcom/tencent/liteav/basic/log/TXCLog;->mEnableCompress:Z

    .line 150
    .line 151
    const/4 v6, 0x0

    .line 152
    invoke-static {v6, v2, v3, v4, v5}, Lcom/tencent/liteav/basic/log/TXCLog;->nativeLogOpen(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 153
    .line 154
    .line 155
    sget-boolean v2, Lcom/tencent/liteav/basic/log/TXCLog;->mEnableCallback:Z

    .line 156
    .line 157
    invoke-static {v2}, Lcom/tencent/liteav/basic/log/TXCLog;->nativeEnableCallback(Z)V

    .line 158
    .line 159
    .line 160
    sput-boolean v1, Lcom/tencent/liteav/basic/log/TXCLog;->mHasInit:Z

    .line 161
    .line 162
    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    sget-boolean v0, Lcom/tencent/liteav/basic/log/TXCLog;->mHasInit:Z

    .line 164
    .line 165
    return v0

    .line 166
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 167
    throw v1
.end method

.method public static log(ILjava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-static {}, Lcom/tencent/liteav/basic/log/TXCLog;->init()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const-string v5, ""

    .line 9
    .line 10
    const-string v3, ""

    .line 11
    .line 12
    move v1, p0

    .line 13
    move-object v2, p1

    .line 14
    move-object v6, p2

    .line 15
    invoke-static/range {v1 .. v6}, Lcom/tencent/liteav/basic/log/TXCLog;->nativeLog(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v1, p0

    .line 20
    move-object v2, p1

    .line 21
    move-object v6, p2

    .line 22
    :goto_0
    invoke-static {v1, v2, v6}, Lcom/tencent/liteav/basic/log/TXCLog;->log_callback(ILjava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private static log_callback(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/liteav/basic/log/TXCLog;->mListener:Lcom/tencent/liteav/basic/log/TXCLog$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p0, p1, p2}, Lcom/tencent/liteav/basic/log/TXCLog$a;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private static native nativeEnableCallback(Z)V
.end method

.method private static native nativeLog(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
.end method

.method private static native nativeLogClose()V
.end method

.method private static native nativeLogInit()V
.end method

.method private static native nativeLogOpen(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
.end method

.method private static native nativeLogSetConsole(Z)V
.end method

.method private static native nativeLogSetLevel(I)V
.end method

.method public static setConsoleEnabled(Z)V
    .locals 1

    .line 1
    sput-boolean p0, Lcom/tencent/liteav/basic/log/TXCLog;->mEnableConsole:Z

    .line 2
    .line 3
    sget-boolean v0, Lcom/tencent/liteav/basic/log/TXCLog;->mHasInit:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lcom/tencent/liteav/basic/log/TXCLog;->nativeLogSetConsole(Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static setLevel(I)V
    .locals 1

    .line 1
    sput p0, Lcom/tencent/liteav/basic/log/TXCLog;->mLogLevel:I

    .line 2
    .line 3
    sget-boolean v0, Lcom/tencent/liteav/basic/log/TXCLog;->mHasInit:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lcom/tencent/liteav/basic/log/TXCLog;->nativeLogSetLevel(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static setListener(Lcom/tencent/liteav/basic/log/TXCLog$a;)V
    .locals 1

    .line 1
    sput-object p0, Lcom/tencent/liteav/basic/log/TXCLog;->mListener:Lcom/tencent/liteav/basic/log/TXCLog$a;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    :goto_0
    sput-boolean p0, Lcom/tencent/liteav/basic/log/TXCLog;->mEnableCallback:Z

    .line 9
    .line 10
    sget-boolean v0, Lcom/tencent/liteav/basic/log/TXCLog;->mHasInit:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-static {p0}, Lcom/tencent/liteav/basic/log/TXCLog;->nativeEnableCallback(Z)V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method public static setLogCompressEnabled(Z)V
    .locals 4

    .line 1
    sget-boolean v0, Lcom/tencent/liteav/basic/log/TXCLog;->mEnableCompress:Z

    .line 2
    .line 3
    if-eq v0, p0, :cond_0

    .line 4
    .line 5
    sput-boolean p0, Lcom/tencent/liteav/basic/log/TXCLog;->mEnableCompress:Z

    .line 6
    .line 7
    sget-boolean p0, Lcom/tencent/liteav/basic/log/TXCLog;->mHasInit:Z

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/tencent/liteav/basic/log/TXCLog;->nativeLogClose()V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lcom/tencent/liteav/basic/log/TXCLog;->mLogDir:Ljava/lang/String;

    .line 15
    .line 16
    sget-object v0, Lcom/tencent/liteav/basic/log/TXCLog;->mLogCacheDir:Ljava/lang/String;

    .line 17
    .line 18
    const-string v1, "LiteAV"

    .line 19
    .line 20
    sget-boolean v2, Lcom/tencent/liteav/basic/log/TXCLog;->mEnableCompress:Z

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static {v3, p0, v0, v1, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->nativeLogOpen(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public static setLogDirPath(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lcom/tencent/liteav/basic/log/TXCLog;->mLogDir:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    sput-object p0, Lcom/tencent/liteav/basic/log/TXCLog;->mLogDir:Ljava/lang/String;

    .line 17
    .line 18
    sget-boolean v0, Lcom/tencent/liteav/basic/log/TXCLog;->mHasInit:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v1, "TXCLog setLogDirPath "

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string v0, "TXCLog"

    .line 40
    .line 41
    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lcom/tencent/liteav/basic/log/TXCLog;->nativeLogClose()V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lcom/tencent/liteav/basic/log/TXCLog;->mLogDir:Ljava/lang/String;

    .line 48
    .line 49
    sget-object v0, Lcom/tencent/liteav/basic/log/TXCLog;->mLogCacheDir:Ljava/lang/String;

    .line 50
    .line 51
    const-string v1, "LiteAV"

    .line 52
    .line 53
    sget-boolean v2, Lcom/tencent/liteav/basic/log/TXCLog;->mEnableCompress:Z

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-static {v3, p0, v0, v1, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->nativeLogOpen(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    :cond_1
    :goto_0
    return-void
.end method

.method public static sliceLogFile()V
    .locals 5

    .line 1
    sget-boolean v0, Lcom/tencent/liteav/basic/log/TXCLog;->mHasInit:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "TXCLog"

    .line 6
    .line 7
    const-string v1, "TXCLog sliceLogFile"

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    sget-object v0, Lcom/tencent/liteav/basic/log/TXCLog;->mLogDir:Ljava/lang/String;

    .line 13
    .line 14
    sget-object v1, Lcom/tencent/liteav/basic/log/TXCLog;->mLogCacheDir:Ljava/lang/String;

    .line 15
    .line 16
    const-string v2, "LiteAV"

    .line 17
    .line 18
    sget-boolean v3, Lcom/tencent/liteav/basic/log/TXCLog;->mEnableCompress:Z

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-static {v4, v0, v1, v2, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->nativeLogOpen(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->log(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static varargs v(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->log(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x3

    .line 2
    invoke-static {v0, p0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->log(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static varargs w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x3

    .line 1
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->log(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
