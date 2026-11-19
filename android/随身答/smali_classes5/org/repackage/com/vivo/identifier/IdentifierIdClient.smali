.class public Lorg/repackage/com/vivo/identifier/IdentifierIdClient;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static A:Ljava/lang/String; = null

.field private static volatile B:Lorg/repackage/com/vivo/identifier/IdentifierIdClient; = null

.field private static volatile C:Lorg/repackage/com/vivo/identifier/DataBaseOperation; = null

.field private static final a:Ljava/lang/String; = "VMS_IDLG_SDK_Client"

.field private static final b:Ljava/lang/String; = "content://com.vivo.vms.IdProvider/IdentifierId"

.field private static final c:Ljava/lang/String; = "persist.sys.identifierid.supported"

.field private static final d:Ljava/lang/String; = "appid"

.field private static final e:Ljava/lang/String; = "type"

.field private static final f:Ljava/lang/String; = "OAID"

.field private static final g:Ljava/lang/String; = "VAID"

.field private static final h:Ljava/lang/String; = "AAID"

.field private static final i:I = 0x0

.field private static final j:I = 0x1

.field private static final k:I = 0x2

.field private static final l:I = 0x4

.field private static final m:I = 0xb

.field private static final n:I = 0x7d0

.field private static o:Landroid/content/Context; = null

.field private static p:Z = false

.field private static q:Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;

.field private static r:Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;

.field private static s:Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;

.field private static t:Ljava/lang/Object;

.field private static u:Landroid/os/HandlerThread;

.field private static v:Landroid/os/Handler;

.field private static w:Ljava/lang/String;

.field private static x:Ljava/lang/String;

.field private static y:Ljava/lang/String;

.field private static z:Ljava/lang/String;


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
    sput-object v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->t:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 40
    const-class v0, Ljava/lang/String;

    .line 41
    :try_start_0
    const-string v1, "android.os.SystemProperties"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 42
    const-string v2, "get"

    filled-new-array {v0, v0}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 43
    const-string v2, "unknown"

    filled-new-array {p0, v2}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catch_0
    move-exception p0

    .line 44
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    return-object p1
.end method

.method public static a(Landroid/content/Context;)Lorg/repackage/com/vivo/identifier/IdentifierIdClient;
    .locals 2

    .line 1
    sget-object v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->B:Lorg/repackage/com/vivo/identifier/IdentifierIdClient;

    if-nez v0, :cond_0

    .line 2
    const-class v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;

    monitor-enter v0

    .line 3
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sput-object v1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->o:Landroid/content/Context;

    .line 4
    new-instance v1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;

    invoke-direct {v1}, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;-><init>()V

    sput-object v1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->B:Lorg/repackage/com/vivo/identifier/IdentifierIdClient;

    .line 5
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 6
    :cond_0
    :goto_0
    sget-object v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->C:Lorg/repackage/com/vivo/identifier/DataBaseOperation;

    if-nez v0, :cond_1

    .line 7
    const-class v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;

    monitor-enter v0

    .line 8
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->o:Landroid/content/Context;

    .line 9
    invoke-static {}, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->g()V

    .line 10
    new-instance p0, Lorg/repackage/com/vivo/identifier/DataBaseOperation;

    sget-object v1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->o:Landroid/content/Context;

    invoke-direct {p0, v1}, Lorg/repackage/com/vivo/identifier/DataBaseOperation;-><init>(Landroid/content/Context;)V

    sput-object p0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->C:Lorg/repackage/com/vivo/identifier/DataBaseOperation;

    .line 11
    invoke-static {}, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->d()V

    .line 12
    monitor-exit v0

    goto :goto_1

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p0

    .line 13
    :cond_1
    :goto_1
    sget-object p0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->B:Lorg/repackage/com/vivo/identifier/IdentifierIdClient;

    return-object p0
.end method

.method private static a(Landroid/content/Context;ILjava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_2

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    return-void

    .line 45
    :cond_0
    new-instance p1, Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;

    sget-object v2, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->B:Lorg/repackage/com/vivo/identifier/IdentifierIdClient;

    invoke-direct {p1, v2, v1, p2}, Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;-><init>(Lorg/repackage/com/vivo/identifier/IdentifierIdClient;ILjava/lang/String;)V

    sput-object p1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->s:Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;

    .line 46
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    sget-object p2, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->s:Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;

    invoke-virtual {p0, p1, v0, p2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    return-void

    .line 47
    :cond_1
    new-instance p1, Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;

    sget-object v2, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->B:Lorg/repackage/com/vivo/identifier/IdentifierIdClient;

    invoke-direct {p1, v2, v1, p2}, Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;-><init>(Lorg/repackage/com/vivo/identifier/IdentifierIdClient;ILjava/lang/String;)V

    sput-object p1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->r:Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;

    .line 48
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    sget-object p2, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->r:Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;

    invoke-virtual {p0, p1, v0, p2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    return-void

    .line 49
    :cond_2
    new-instance p1, Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;

    sget-object p2, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->B:Lorg/repackage/com/vivo/identifier/IdentifierIdClient;

    const/4 v2, 0x0

    invoke-direct {p1, p2, v0, v2}, Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;-><init>(Lorg/repackage/com/vivo/identifier/IdentifierIdClient;ILjava/lang/String;)V

    sput-object p1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->q:Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;

    .line 50
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string p1, "content://com.vivo.vms.IdProvider/IdentifierId/OAID"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    sget-object p2, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->q:Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;

    invoke-virtual {p0, p1, v1, p2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    return-void
.end method

.method private b(ILjava/lang/String;)V
    .locals 3

    .line 13
    sget-object v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->v:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const/16 v1, 0xb

    .line 14
    iput v1, v0, Landroid/os/Message;->what:I

    .line 15
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 16
    const-string v2, "type"

    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const/4 v2, 0x1

    if-eq p1, v2, :cond_0

    const/4 v2, 0x2

    if-ne p1, v2, :cond_1

    .line 17
    :cond_0
    const-string p1, "appid"

    invoke-virtual {v1, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    :cond_1
    invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 19
    sget-object p1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->v:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public static synthetic c(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    sput-object p0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->w:Ljava/lang/String;

    return-object p0
.end method

.method public static d()V
    .locals 2

    .line 1
    const-string v0, "persist.sys.identifierid.supported"

    .line 2
    .line 3
    const-string v1, "0"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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
    sput-boolean v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->p:Z

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic e()Lorg/repackage/com/vivo/identifier/DataBaseOperation;
    .locals 1

    .line 1
    sget-object v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->C:Lorg/repackage/com/vivo/identifier/DataBaseOperation;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic f()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->t:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method private static g()V
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
    sput-object v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->u:Landroid/os/HandlerThread;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient$1;

    .line 14
    .line 15
    sget-object v1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->u:Landroid/os/HandlerThread;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1}, Lorg/repackage/com/vivo/identifier/IdentifierIdClient$1;-><init>(Landroid/os/Looper;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->v:Landroid/os/Handler;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 15
    invoke-virtual {p0}, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 16
    :cond_0
    sget-object v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->y:Ljava/lang/String;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const/4 v0, 0x1

    .line 17
    invoke-virtual {p0, v0, p1}, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->a(ILjava/lang/String;)V

    .line 18
    sget-object v1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->r:Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;

    if-nez v1, :cond_2

    sget-object v1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->y:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 19
    sget-object v1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->o:Landroid/content/Context;

    invoke-static {v1, v0, p1}, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->a(Landroid/content/Context;ILjava/lang/String;)V

    .line 20
    :cond_2
    sget-object p1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->y:Ljava/lang/String;

    return-object p1
.end method

.method public a(ILjava/lang/String;)V
    .locals 7

    .line 21
    sget-object v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->t:Ljava/lang/Object;

    monitor-enter v0

    .line 22
    :try_start_0
    invoke-direct {p0, p1, p2}, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->b(ILjava/lang/String;)V

    .line 23
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v3, 0x7d0

    .line 24
    :try_start_1
    sget-object p2, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->t:Ljava/lang/Object;

    invoke-virtual {p2, v3, v4}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p2

    .line 25
    :try_start_2
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 26
    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v1

    cmp-long p2, v5, v3

    if-gez p2, :cond_6

    const/4 p2, 0x0

    if-eqz p1, :cond_5

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const/4 v1, 0x4

    if-eq p1, v1, :cond_2

    goto :goto_2

    .line 27
    :cond_0
    sget-object p1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->w:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 28
    sput-object p1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->z:Ljava/lang/String;

    .line 29
    sput-object p2, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->w:Ljava/lang/String;

    goto :goto_1

    .line 30
    :cond_1
    const-string p1, "VMS_IDLG_SDK_Client"

    const-string v1, "get aaid failed"

    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    :cond_2
    :goto_1
    sget-object p1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->w:Ljava/lang/String;

    sput-object p1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->A:Ljava/lang/String;

    .line 32
    sput-object p2, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->w:Ljava/lang/String;

    goto :goto_2

    .line 33
    :cond_3
    sget-object p1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->w:Ljava/lang/String;

    if-eqz p1, :cond_4

    .line 34
    sput-object p1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->y:Ljava/lang/String;

    .line 35
    sput-object p2, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->w:Ljava/lang/String;

    goto :goto_2

    .line 36
    :cond_4
    const-string p1, "VMS_IDLG_SDK_Client"

    const-string p2, "get vaid failed"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 37
    :cond_5
    sget-object p1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->w:Ljava/lang/String;

    sput-object p1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->x:Ljava/lang/String;

    .line 38
    sput-object p2, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->w:Ljava/lang/String;

    .line 39
    :cond_6
    :goto_2
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public a()Z
    .locals 1

    .line 14
    sget-boolean v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->p:Z

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    sget-object v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->x:Ljava/lang/String;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->a(ILjava/lang/String;)V

    .line 4
    sget-object v2, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->q:Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;

    if-nez v2, :cond_2

    .line 5
    sget-object v2, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->o:Landroid/content/Context;

    invoke-static {v2, v0, v1}, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->a(Landroid/content/Context;ILjava/lang/String;)V

    .line 6
    :cond_2
    sget-object v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->x:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 7
    invoke-virtual {p0}, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 8
    :cond_0
    sget-object v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->z:Ljava/lang/String;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const/4 v0, 0x2

    .line 9
    invoke-virtual {p0, v0, p1}, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->a(ILjava/lang/String;)V

    .line 10
    sget-object v1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->s:Lorg/repackage/com/vivo/identifier/IdentifierIdObserver;

    if-nez v1, :cond_2

    sget-object v1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->z:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 11
    sget-object v1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->o:Landroid/content/Context;

    invoke-static {v1, v0, p1}, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->a(Landroid/content/Context;ILjava/lang/String;)V

    .line 12
    :cond_2
    sget-object p1, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->z:Ljava/lang/String;

    return-object p1
.end method

.method public c()Ljava/lang/String;
    .locals 2

    .line 2
    invoke-virtual {p0}, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x4

    .line 3
    invoke-virtual {p0, v0, v1}, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->a(ILjava/lang/String;)V

    .line 4
    sget-object v0, Lorg/repackage/com/vivo/identifier/IdentifierIdClient;->A:Ljava/lang/String;

    return-object v0
.end method
