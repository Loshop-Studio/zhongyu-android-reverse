.class public Li3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Landroid/content/Context; = null

.field public static b:Z = false

.field public static c:Li3/c;

.field public static d:Li3/c;

.field public static e:Li3/c;

.field public static f:Ljava/lang/Object;

.field public static g:Landroid/os/HandlerThread;

.field public static h:Landroid/os/Handler;

.field public static i:Ljava/lang/String;

.field public static j:Ljava/lang/String;

.field public static k:Ljava/lang/String;

.field public static l:Ljava/lang/String;

.field public static m:Ljava/lang/String;

.field public static volatile n:Li3/b;

.field public static volatile o:Li3/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Li3/b;->f:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Landroid/content/Context;)Li3/b;
    .locals 2

    .line 1
    sget-object v0, Li3/b;->n:Li3/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-class v0, Li3/b;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sput-object v1, Li3/b;->a:Landroid/content/Context;

    .line 13
    .line 14
    new-instance v1, Li3/b;

    .line 15
    .line 16
    invoke-direct {v1}, Li3/b;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object v1, Li3/b;->n:Li3/b;

    .line 20
    .line 21
    monitor-exit v0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0

    .line 26
    :cond_0
    :goto_0
    sget-object v0, Li3/b;->o:Li3/a;

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    const-class v0, Li3/b;

    .line 31
    .line 32
    monitor-enter v0

    .line 33
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    sput-object p0, Li3/b;->a:Landroid/content/Context;

    .line 38
    .line 39
    invoke-static {}, Li3/b;->l()V

    .line 40
    .line 41
    .line 42
    new-instance p0, Li3/a;

    .line 43
    .line 44
    sget-object v1, Li3/b;->a:Landroid/content/Context;

    .line 45
    .line 46
    invoke-direct {p0, v1}, Li3/a;-><init>(Landroid/content/Context;)V

    .line 47
    .line 48
    .line 49
    sput-object p0, Li3/b;->o:Li3/a;

    .line 50
    .line 51
    invoke-static {}, Li3/b;->i()V

    .line 52
    .line 53
    .line 54
    monitor-exit v0

    .line 55
    goto :goto_1

    .line 56
    :catchall_1
    move-exception p0

    .line 57
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 58
    throw p0

    .line 59
    :cond_1
    :goto_1
    sget-object p0, Li3/b;->n:Li3/b;

    .line 60
    .line 61
    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    :try_start_0
    const-string v1, "android.os.SystemProperties"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "get"

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    new-array v4, v3, [Ljava/lang/Class;

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    aput-object v0, v4, v5

    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    aput-object v0, v4, v6

    .line 19
    .line 20
    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-array v2, v3, [Ljava/lang/Object;

    .line 25
    .line 26
    aput-object p0, v2, v5

    .line 27
    .line 28
    const-string p0, "unknown"

    .line 29
    .line 30
    aput-object p0, v2, v6

    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    return-object p0

    .line 39
    :catch_0
    move-exception p0

    .line 40
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    .line 43
    :catchall_0
    return-object p1
.end method

.method public static d(Landroid/content/Context;ILjava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    if-eq p1, v1, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p1, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance p1, Li3/c;

    .line 12
    .line 13
    sget-object v2, Li3/b;->n:Li3/b;

    .line 14
    .line 15
    invoke-direct {p1, v2, v1, p2}, Li3/c;-><init>(Li3/b;ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sput-object p1, Li3/b;->e:Li3/c;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance p1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v1, "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"

    .line 30
    .line 31
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    sget-object p2, Li3/b;->e:Li3/c;

    .line 46
    .line 47
    invoke-virtual {p0, p1, v0, p2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    new-instance p1, Li3/c;

    .line 52
    .line 53
    sget-object v2, Li3/b;->n:Li3/b;

    .line 54
    .line 55
    invoke-direct {p1, v2, v1, p2}, Li3/c;-><init>(Li3/b;ILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    sput-object p1, Li3/b;->d:Li3/c;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    new-instance p1, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v1, "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"

    .line 70
    .line 71
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    sget-object p2, Li3/b;->d:Li3/c;

    .line 86
    .line 87
    invoke-virtual {p0, p1, v0, p2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    new-instance p1, Li3/c;

    .line 92
    .line 93
    sget-object p2, Li3/b;->n:Li3/b;

    .line 94
    .line 95
    const/4 v2, 0x0

    .line 96
    invoke-direct {p1, p2, v0, v2}, Li3/c;-><init>(Li3/b;ILjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    sput-object p1, Li3/b;->c:Li3/c;

    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const-string p1, "content://com.vivo.vms.IdProvider/IdentifierId/OAID"

    .line 106
    .line 107
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    sget-object p2, Li3/b;->c:Li3/c;

    .line 112
    .line 113
    invoke-virtual {p0, p1, v1, p2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 114
    .line 115
    .line 116
    :goto_0
    return-void
.end method

.method public static synthetic h(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    sput-object p0, Li3/b;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static i()V
    .locals 2

    .line 1
    const-string v0, "persist.sys.identifierid.supported"

    .line 2
    .line 3
    const-string v1, "0"

    .line 4
    .line 5
    invoke-static {v0, v1}, Li3/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "1"

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sput-boolean v0, Li3/b;->b:Z

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic j()Li3/a;
    .locals 1

    .line 1
    sget-object v0, Li3/b;->o:Li3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic k()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Li3/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public static l()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/HandlerThread;

    .line 2
    .line 3
    const-string v1, "SqlWorkThread"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Li3/b;->g:Landroid/os/HandlerThread;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 11
    .line 12
    .line 13
    new-instance v0, Li3/b$a;

    .line 14
    .line 15
    sget-object v1, Li3/b;->g:Landroid/os/HandlerThread;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1}, Li3/b$a;-><init>(Landroid/os/Looper;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Li3/b;->h:Landroid/os/Handler;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public c(ILjava/lang/String;)V
    .locals 7

    .line 1
    sget-object v0, Li3/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1, p2}, Li3/b;->g(ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    const-wide/16 v3, 0x7d0

    .line 12
    .line 13
    :try_start_1
    sget-object p2, Li3/b;->f:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {p2, v3, v4}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception p2

    .line 20
    :try_start_2
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v5

    .line 27
    sub-long/2addr v5, v1

    .line 28
    cmp-long p2, v5, v3

    .line 29
    .line 30
    if-gez p2, :cond_6

    .line 31
    .line 32
    const/4 p2, 0x0

    .line 33
    if-eqz p1, :cond_5

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    if-eq p1, v1, :cond_3

    .line 37
    .line 38
    const/4 v1, 0x2

    .line 39
    if-eq p1, v1, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x4

    .line 42
    if-eq p1, v1, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_0
    sget-object p1, Li3/b;->i:Ljava/lang/String;

    .line 46
    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    sput-object p1, Li3/b;->l:Ljava/lang/String;

    .line 50
    .line 51
    sput-object p2, Li3/b;->i:Ljava/lang/String;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const-string p1, "VMS_IDLG_SDK_Client"

    .line 55
    .line 56
    const-string v1, "get aaid failed"

    .line 57
    .line 58
    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    :cond_2
    :goto_1
    sget-object p1, Li3/b;->i:Ljava/lang/String;

    .line 62
    .line 63
    sput-object p1, Li3/b;->m:Ljava/lang/String;

    .line 64
    .line 65
    sput-object p2, Li3/b;->i:Ljava/lang/String;

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    sget-object p1, Li3/b;->i:Ljava/lang/String;

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    sput-object p1, Li3/b;->k:Ljava/lang/String;

    .line 73
    .line 74
    sput-object p2, Li3/b;->i:Ljava/lang/String;

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    const-string p1, "VMS_IDLG_SDK_Client"

    .line 78
    .line 79
    const-string p2, "get vaid failed"

    .line 80
    .line 81
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    sget-object p1, Li3/b;->i:Ljava/lang/String;

    .line 86
    .line 87
    sput-object p1, Li3/b;->j:Ljava/lang/String;

    .line 88
    .line 89
    sput-object p2, Li3/b;->i:Ljava/lang/String;

    .line 90
    .line 91
    :cond_6
    :goto_2
    monitor-exit v0

    .line 92
    return-void

    .line 93
    :catchall_0
    move-exception p1

    .line 94
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 95
    throw p1
.end method

.method public e()Z
    .locals 1

    .line 1
    sget-boolean v0, Li3/b;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Li3/b;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    sget-object v0, Li3/b;->j:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v0, v1}, Li3/b;->c(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sget-object v2, Li3/b;->c:Li3/c;

    .line 19
    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    sget-object v2, Li3/b;->a:Landroid/content/Context;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Li3/b;->d(Landroid/content/Context;ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    sget-object v0, Li3/b;->j:Ljava/lang/String;

    .line 28
    .line 29
    return-object v0
.end method

.method public final g(ILjava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Li3/b;->h:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0xb

    .line 8
    .line 9
    iput v1, v0, Landroid/os/Message;->what:I

    .line 10
    .line 11
    new-instance v1, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v2, "type"

    .line 17
    .line 18
    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-eq p1, v2, :cond_0

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-ne p1, v2, :cond_1

    .line 26
    .line 27
    :cond_0
    const-string p1, "appid"

    .line 28
    .line 29
    invoke-virtual {v1, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 33
    .line 34
    .line 35
    sget-object p1, Li3/b;->h:Landroid/os/Handler;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 38
    .line 39
    .line 40
    return-void
.end method
