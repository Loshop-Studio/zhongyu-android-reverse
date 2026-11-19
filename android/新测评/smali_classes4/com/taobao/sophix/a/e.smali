.class public Lcom/taobao/sophix/a/e;
.super Lcom/taobao/sophix/SophixManager;
.source "SourceFile"


# static fields
.field public static a:Lcom/taobao/sophix/a/e;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Lcom/taobao/sophix/listener/PatchLoadStatusListener;

.field private d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private e:Lcom/taobao/sophix/d/a;

.field private f:Lcom/taobao/sophix/a/c;

.field private g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/taobao/sophix/a/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/taobao/sophix/a/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/taobao/sophix/a/e;->a:Lcom/taobao/sophix/a/e;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/taobao/sophix/SophixManager;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/taobao/sophix/a/e;->g:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lcom/taobao/sophix/a/e;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    new-instance v0, Lcom/taobao/sophix/d/a;

    .line 15
    .line 16
    invoke-direct {v0}, Lcom/taobao/sophix/d/a;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/taobao/sophix/a/e;->e:Lcom/taobao/sophix/d/a;

    .line 20
    .line 21
    new-instance v0, Lcom/taobao/sophix/a/c;

    .line 22
    .line 23
    invoke-direct {v0}, Lcom/taobao/sophix/a/c;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/taobao/sophix/a/e;->e:Lcom/taobao/sophix/d/a;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/taobao/sophix/a/c;->a(Lcom/taobao/sophix/c/a;)V

    .line 31
    .line 32
    .line 33
    new-instance v0, Lcom/taobao/sophix/listener/a;

    .line 34
    .line 35
    invoke-direct {v0}, Lcom/taobao/sophix/listener/a;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lcom/taobao/sophix/a/e;->c:Lcom/taobao/sophix/listener/PatchLoadStatusListener;

    .line 39
    .line 40
    return-void
.end method

.method public static synthetic a(Lcom/taobao/sophix/a/e;)Lcom/taobao/sophix/d/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/taobao/sophix/a/e;->e:Lcom/taobao/sophix/d/a;

    return-object p0
.end method

.method public static synthetic b(Lcom/taobao/sophix/a/e;)Lcom/taobao/sophix/a/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    return-object p0
.end method

.method private c()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v1, v0, Lcom/taobao/sophix/a/e;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    sget-object v1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v6, "sophix"

    .line 28
    .line 29
    invoke-static {v1, v6}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v6, v0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    .line 38
    .line 39
    invoke-virtual {v6, v1}, Lcom/taobao/sophix/a/c;->a(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    sget-object v6, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 43
    .line 44
    const-string v7, "hpatch_version"

    .line 45
    .line 46
    invoke-static {v6, v7, v2}, Lcom/taobao/sophix/e/j;->a(Landroid/content/Context;Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    sput v6, Lcom/taobao/sophix/b/b;->a:I

    .line 51
    .line 52
    sget-object v6, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 53
    .line 54
    invoke-static {v6}, Lcom/taobao/sophix/e/g;->a(Landroid/app/Application;)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    sget-object v12, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v14, v0, Lcom/taobao/sophix/a/e;->b:Ljava/lang/String;

    .line 65
    .line 66
    sget v6, Lcom/taobao/sophix/b/b;->a:I

    .line 67
    .line 68
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v16

    .line 72
    const-string v7, "sdk"

    .line 73
    .line 74
    const-string v8, "3.3.5"

    .line 75
    .line 76
    const-string v9, "main process"

    .line 77
    .line 78
    const-string v11, "fingerprint"

    .line 79
    .line 80
    const-string v13, "app version"

    .line 81
    .line 82
    const-string v15, "patch version"

    .line 83
    .line 84
    filled-new-array/range {v7 .. v16}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    const-string v7, "SophixManager"

    .line 89
    .line 90
    const-string v8, "Sophix starting..."

    .line 91
    .line 92
    invoke-static {v7, v8, v6}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 93
    .line 94
    .line 95
    invoke-static {v2, v3}, Lcom/taobao/sophix/d/a/a;->a(IZ)V

    .line 96
    .line 97
    .line 98
    iget-object v3, v0, Lcom/taobao/sophix/a/e;->e:Lcom/taobao/sophix/d/a;

    .line 99
    .line 100
    iget-object v6, v0, Lcom/taobao/sophix/a/e;->b:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v3, v1, v6}, Lcom/taobao/sophix/d/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object v1, v0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Lcom/taobao/sophix/a/c;->c(Z)V

    .line 108
    .line 109
    .line 110
    iget-object v1, v0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Lcom/taobao/sophix/a/c;->d(Z)V

    .line 113
    .line 114
    .line 115
    iget-object v1, v0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    .line 116
    .line 117
    iget-object v2, v0, Lcom/taobao/sophix/a/e;->b:Ljava/lang/String;

    .line 118
    .line 119
    iget-object v3, v0, Lcom/taobao/sophix/a/e;->c:Lcom/taobao/sophix/listener/PatchLoadStatusListener;

    .line 120
    .line 121
    invoke-virtual {v1, v2, v3}, Lcom/taobao/sophix/a/c;->a(Ljava/lang/String;Lcom/taobao/sophix/listener/PatchLoadStatusListener;)V

    .line 122
    .line 123
    .line 124
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 125
    .line 126
    .line 127
    move-result-wide v1

    .line 128
    sub-long/2addr v1, v4

    .line 129
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const-string v2, "time consumed(ms)"

    .line 134
    .line 135
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    const-string v2, "initialize"

    .line 140
    .line 141
    invoke-static {v7, v2, v1}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 142
    .line 143
    .line 144
    :cond_0
    return-void

    .line 145
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 146
    .line 147
    const-string v2, "app is null"

    .line 148
    .line 149
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v1
.end method


# virtual methods
.method public a(Landroid/net/Uri;Lcom/taobao/sophix/listener/PatchLoadStatusListener;)V
    .locals 6

    .line 13
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/taobao/sophix/a/e;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-static {v0}, Lcom/taobao/sophix/e/g;->a(Landroid/app/Application;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 14
    :try_start_0
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 15
    :try_start_1
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    const-string v2, "sophix"

    invoke-static {v0, v2}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 16
    new-instance v2, Ljava/io/File;

    const-string v3, "download_local"

    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 18
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    goto :goto_1

    :catchall_0
    move-exception p2

    move-object v2, v1

    :goto_0
    move-object v1, p1

    goto/16 :goto_8

    :catch_0
    move-exception v0

    move-object v2, v1

    goto :goto_4

    :catch_1
    move-exception v0

    move-object v2, v1

    goto :goto_6

    .line 19
    :cond_0
    invoke-static {v2}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;)V

    .line 20
    :goto_1
    new-instance v0, Ljava/io/File;

    const-string v3, "sophix-patch.jar"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 21
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v3, 0x400

    .line 22
    :try_start_2
    new-array v3, v3, [B

    .line 23
    :goto_2
    invoke-virtual {p1, v3}, Ljava/io/InputStream;->read([B)I

    move-result v4

    if-lez v4, :cond_1

    const/4 v5, 0x0

    .line 24
    invoke-virtual {v2, v3, v5, v4}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_2

    :catchall_1
    move-exception p2

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_6

    .line 25
    :cond_1
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    .line 26
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 27
    :try_start_3
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    goto :goto_3

    :catch_4
    move-exception p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 29
    :goto_3
    :try_start_4
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5

    goto :goto_b

    :catch_5
    move-exception p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_b

    :catchall_2
    move-exception p2

    move-object v2, v1

    goto :goto_8

    :catch_6
    move-exception v0

    move-object p1, v1

    move-object v2, p1

    goto :goto_4

    :catch_7
    move-exception v0

    move-object p1, v1

    move-object v2, p1

    goto :goto_6

    .line 31
    :goto_4
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eqz p1, :cond_2

    .line 32
    :try_start_6
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_8

    goto :goto_5

    :catch_8
    move-exception p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_5
    if-eqz v2, :cond_6

    goto :goto_3

    .line 34
    :goto_6
    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-eqz p1, :cond_3

    .line 35
    :try_start_8
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_9

    goto :goto_7

    :catch_9
    move-exception p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    :goto_7
    if-eqz v2, :cond_6

    goto :goto_3

    :goto_8
    if-eqz v1, :cond_4

    .line 37
    :try_start_9
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_a

    goto :goto_9

    :catch_a
    move-exception p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_4
    :goto_9
    if-eqz v2, :cond_5

    .line 39
    :try_start_a
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_b

    goto :goto_a

    :catch_b
    move-exception p1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 41
    :cond_5
    :goto_a
    throw p2

    .line 42
    :cond_6
    :goto_b
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 43
    invoke-virtual {p0, v1, p2}, Lcom/taobao/sophix/a/e;->a(Ljava/lang/String;Lcom/taobao/sophix/listener/PatchLoadStatusListener;)V

    :cond_7
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/taobao/sophix/c/c;Lcom/taobao/sophix/listener/PatchLoadStatusListener;)V
    .locals 1

    .line 3
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    if-eqz v0, :cond_1

    .line 4
    invoke-static {v0}, Lcom/taobao/sophix/e/g;->a(Landroid/app/Application;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    const-string p1, "not in main progress, skip"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "SophixManager"

    const-string p3, "queryLoadPatch"

    invoke-static {p2, p3, p1}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    return-void

    .line 6
    :cond_0
    new-instance v0, Lcom/taobao/sophix/a/e$1;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/taobao/sophix/a/e$1;-><init>(Lcom/taobao/sophix/a/e;Ljava/lang/String;Lcom/taobao/sophix/c/c;Lcom/taobao/sophix/listener/PatchLoadStatusListener;)V

    invoke-static {v0}, Lcom/taobao/sophix/e/l;->a(Ljava/lang/Runnable;)V

    return-void

    .line 7
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "app is null"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Ljava/lang/String;Lcom/taobao/sophix/listener/PatchLoadStatusListener;)V
    .locals 2

    .line 8
    iget-object v0, p0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    invoke-virtual {v0}, Lcom/taobao/sophix/a/c;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 9
    const-string p1, "forbid loading local patch for secure reason in release mode"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "SophixManager"

    const-string v0, "addPatch"

    invoke-static {p2, v0, p1}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    return-void

    .line 10
    :cond_0
    new-instance v0, Lcom/taobao/sophix/c/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/taobao/sophix/c/c;-><init>(I)V

    const/4 v1, -0x1

    .line 11
    iput v1, v0, Lcom/taobao/sophix/c/c;->d:I

    .line 12
    iget-object v1, p0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    invoke-virtual {v1, p1, p2, v0}, Lcom/taobao/sophix/a/c;->a(Ljava/lang/String;Lcom/taobao/sophix/listener/PatchLoadStatusListener;Lcom/taobao/sophix/c/c;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    invoke-virtual {v0, p1}, Lcom/taobao/sophix/a/c;->b(Z)V

    return-void
.end method

.method public a()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/taobao/sophix/a/e;->g:Z

    return v0
.end method

.method public b()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    invoke-virtual {v0}, Lcom/taobao/sophix/a/c;->b()V

    return-void
.end method

.method public cleanPatches()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/taobao/sophix/a/e;->a(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public getPatchStateInfo()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/taobao/sophix/a/c;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public initialize()V
    .locals 5

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/taobao/sophix/a/e;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception v0

    .line 6
    const-string v1, "init"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    new-array v3, v2, [Ljava/lang/Object;

    .line 10
    .line 11
    const-string v4, "SophixManager"

    .line 12
    .line 13
    invoke-static {v4, v1, v0, v3}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/taobao/sophix/a/a;->a()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Lcom/taobao/sophix/a/e;->a(Z)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    throw v0
.end method

.method public killProcessSafely()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/taobao/sophix/a/c;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public queryAndLoadNewPatch()V
    .locals 3

    .line 1
    new-instance v0, Lcom/taobao/sophix/c/c;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lcom/taobao/sophix/c/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget v1, Lcom/taobao/sophix/b/b;->a:I

    .line 8
    .line 9
    const/4 v2, -0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget v1, Lcom/taobao/sophix/b/b;->a:I

    .line 15
    .line 16
    :goto_0
    iput v1, v0, Lcom/taobao/sophix/c/c;->d:I

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iget-object v2, p0, Lcom/taobao/sophix/a/e;->c:Lcom/taobao/sophix/listener/PatchLoadStatusListener;

    .line 20
    .line 21
    invoke-virtual {p0, v1, v0, v2}, Lcom/taobao/sophix/a/e;->a(Ljava/lang/String;Lcom/taobao/sophix/c/c;Lcom/taobao/sophix/listener/PatchLoadStatusListener;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setAesKey(Ljava/lang/String;)Lcom/taobao/sophix/SophixManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/taobao/sophix/a/c;->b(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setAppVersion(Ljava/lang/String;)Lcom/taobao/sophix/SophixManager;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/taobao/sophix/a/e;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setContext(Landroid/app/Application;)Lcom/taobao/sophix/SophixManager;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/taobao/sophix/a/e;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p1, "can not set app again"

    .line 10
    .line 11
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "SophixManager"

    .line 16
    .line 17
    const-string v1, "setContext"

    .line 18
    .line 19
    invoke-static {v0, v1, p1}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    sput-object p1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 24
    .line 25
    return-object p0
.end method

.method public setEnableClassLoaderLog()Lcom/taobao/sophix/SophixManager;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/taobao/sophix/a/e;->g:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public setEnableDebug(Z)Lcom/taobao/sophix/SophixManager;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/taobao/sophix/a/e;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "SophixManager"

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string p1, "can not set debug state again"

    .line 12
    .line 13
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v0, "setEnableDebug"

    .line 18
    .line 19
    invoke-static {v1, v0, p1}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lcom/taobao/sophix/a/c;->a(Z)V

    .line 26
    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    sget-object v0, Lcom/taobao/sophix/e/e$a;->b:Lcom/taobao/sophix/e/e$a;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/taobao/sophix/e/e;->a(Lcom/taobao/sophix/e/e$a;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    sget-object v0, Lcom/taobao/sophix/e/e$a;->c:Lcom/taobao/sophix/e/e$a;

    .line 37
    .line 38
    invoke-static {v0}, Lcom/taobao/sophix/e/e;->a(Lcom/taobao/sophix/e/e$a;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    :try_start_0
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v2, "com.ta.utdid2.device.SophixInvoker"

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-string v2, "invokeAlicloudSenderDebug"

    .line 54
    .line 55
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 56
    .line 57
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const/4 v2, 0x0

    .line 74
    invoke-virtual {v0, v2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    .line 77
    return-object p0

    .line 78
    :catch_0
    move-exception p1

    .line 79
    const/4 v0, 0x0

    .line 80
    new-array v0, v0, [Ljava/lang/Object;

    .line 81
    .line 82
    const-string v2, "alicloudSender fail to invoke debug"

    .line 83
    .line 84
    invoke-static {v1, v2, p1, v0}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 85
    .line 86
    .line 87
    return-object p0
.end method

.method public setEnableFullLog()Lcom/taobao/sophix/SophixManager;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/taobao/sophix/e/e;->a(Z)V

    .line 3
    .line 4
    .line 5
    sget-object v0, Lcom/taobao/sophix/e/e$a;->a:Lcom/taobao/sophix/e/e$a;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/taobao/sophix/e/e;->a(Lcom/taobao/sophix/e/e$a;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public setHost(Ljava/lang/String;Z)Lcom/taobao/sophix/SophixManager;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "SophixManager"

    .line 5
    .line 6
    const-string v2, "setHost"

    .line 7
    .line 8
    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Lcom/taobao/sophix/d/a/a;->a(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public setOatSdkVersion(I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 2
    .line 3
    const-string v1, "oat_sdk_int"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/taobao/sophix/e/j;->b(Landroid/content/Context;Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setPatchLoadStatusStub(Lcom/taobao/sophix/listener/PatchLoadStatusListener;)Lcom/taobao/sophix/SophixManager;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/taobao/sophix/a/e;->c:Lcom/taobao/sophix/listener/PatchLoadStatusListener;

    .line 4
    .line 5
    sput-object p1, Lcom/taobao/sophix/b/b;->g:Lcom/taobao/sophix/listener/PatchLoadStatusListener;

    .line 6
    .line 7
    :cond_0
    return-object p0
.end method

.method public setPreLoadedClass(Ljava/lang/Class;)Lcom/taobao/sophix/SophixManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/taobao/sophix/a/c;->b(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setProcessSpecialClass(Ljava/lang/Class;)Lcom/taobao/sophix/SophixManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/taobao/sophix/a/c;->a(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setSecretMetaData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/taobao/sophix/SophixManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/taobao/sophix/a/e;->e:Lcom/taobao/sophix/d/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lcom/taobao/sophix/d/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setTags(Ljava/util/List;)Lcom/taobao/sophix/SophixManager;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/taobao/sophix/SophixManager;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/taobao/sophix/a/e;->e:Lcom/taobao/sophix/d/a;

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/taobao/sophix/d/a;->a(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-object p0
.end method

.method public setUnsupportedModel(Ljava/lang/String;I)Lcom/taobao/sophix/SophixManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/taobao/sophix/a/c;->a(Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setUsingEnhance()Lcom/taobao/sophix/SophixManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/taobao/sophix/a/e;->f:Lcom/taobao/sophix/a/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/taobao/sophix/a/c;->f()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
