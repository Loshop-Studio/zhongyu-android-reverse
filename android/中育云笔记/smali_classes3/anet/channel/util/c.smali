.class public Lanet/channel/util/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final IPV4_ONLY:I = 0x1

.field public static final IPV6_ONLY:I = 0x2

.field public static final IP_DUAL_STACK:I = 0x3

.field public static final IP_STACK_UNKNOWN:I

.field static final a:[[B

.field static volatile b:Ljava/lang/String;

.field static c:Lanet/channel/util/f;

.field static d:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lanet/channel/util/f;",
            ">;"
        }
    .end annotation
.end field

.field static e:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    new-array v0, v0, [B

    .line 8
    .line 9
    fill-array-data v0, :array_1

    .line 10
    .line 11
    .line 12
    filled-new-array {v1, v0}, [[B

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lanet/channel/util/c;->a:[[B

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    sput-object v0, Lanet/channel/util/c;->b:Ljava/lang/String;

    .line 20
    .line 21
    sput-object v0, Lanet/channel/util/c;->c:Lanet/channel/util/f;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lanet/channel/util/c;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lanet/channel/util/c;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    .line 37
    :try_start_0
    new-instance v0, Lanet/channel/util/f;

    .line 38
    .line 39
    const-string v1, "64:ff9b::"

    .line 40
    .line 41
    invoke-static {v1}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/4 v2, 0x0

    .line 46
    aget-object v1, v1, v2

    .line 47
    .line 48
    check-cast v1, Ljava/net/Inet6Address;

    .line 49
    .line 50
    const/16 v2, 0x60

    .line 51
    .line 52
    invoke-direct {v0, v1, v2}, Lanet/channel/util/f;-><init>(Ljava/net/Inet6Address;I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lanet/channel/util/c;->c:Lanet/channel/util/f;

    .line 56
    .line 57
    invoke-static {}, Lanet/channel/status/NetworkStatusHelper;->getStatus()Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Lanet/channel/util/c;->b(Lanet/channel/status/NetworkStatusHelper$NetworkStatus;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lanet/channel/util/c;->b:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    :catch_0
    return-void

    .line 68
    nop

    .line 69
    :array_0
    .array-data 1
        -0x40t
        0x0t
        0x0t
        -0x56t
    .end array-data

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    :array_1
    .array-data 1
        -0x40t
        0x0t
        0x0t
        -0x55t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lanet/channel/status/NetworkStatusHelper$NetworkStatus;)Ljava/lang/String;
    .locals 0

    .line 2
    invoke-static {p0}, Lanet/channel/util/c;->b(Lanet/channel/status/NetworkStatusHelper$NetworkStatus;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 11
    invoke-static {p0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p0

    check-cast p0, Ljava/net/Inet4Address;

    .line 12
    invoke-static {p0}, Lanet/channel/util/c;->a(Ljava/net/Inet4Address;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/net/Inet4Address;)Ljava/lang/String;
    .locals 8

    if-eqz p0, :cond_3

    .line 3
    invoke-static {}, Lanet/channel/util/c;->d()Lanet/channel/util/f;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 4
    invoke-virtual {p0}, Ljava/net/Inet4Address;->getAddress()[B

    move-result-object p0

    .line 5
    iget-object v1, v0, Lanet/channel/util/f;->b:Ljava/net/Inet6Address;

    invoke-virtual {v1}, Ljava/net/Inet6Address;->getAddress()[B

    move-result-object v1

    .line 6
    iget v0, v0, Lanet/channel/util/f;->a:I

    const/16 v2, 0x8

    div-int/2addr v0, v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    add-int v5, v3, v0

    const/16 v6, 0xf

    if-gt v5, v6, :cond_1

    const/4 v6, 0x4

    if-ge v4, v6, :cond_1

    if-ne v5, v2, :cond_0

    goto :goto_1

    .line 7
    :cond_0
    aget-byte v6, v1, v5

    add-int/lit8 v7, v4, 0x1

    aget-byte v4, p0, v4

    or-int/2addr v4, v6

    int-to-byte v4, v4

    aput-byte v4, v1, v5

    move v4, v7

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 8
    :cond_1
    invoke-static {v1}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object p0

    invoke-virtual {p0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 9
    :cond_2
    new-instance p0, Ljava/lang/Exception;

    const-string v0, "cannot get nat64 prefix"

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    .line 10
    :cond_3
    new-instance p0, Ljava/security/InvalidParameterException;

    const-string v0, "address in null"

    invoke-direct {p0, v0}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method private static a(Ljava/net/InetAddress;)Z
    .locals 1

    .line 13
    invoke-virtual {p0}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/net/InetAddress;->isAnyLocalAddress()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static b(Lanet/channel/status/NetworkStatusHelper$NetworkStatus;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lanet/channel/status/NetworkStatusHelper$NetworkStatus;->isWifi()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Lanet/channel/status/NetworkStatusHelper;->getWifiBSSID()Ljava/lang/String;

    move-result-object p0

    .line 3
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    const-string p0, ""

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "WIFI$"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 6
    :cond_1
    invoke-virtual {p0}, Lanet/channel/status/NetworkStatusHelper$NetworkStatus;->isMobile()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lanet/channel/status/NetworkStatusHelper$NetworkStatus;->getType()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string p0, "$"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lanet/channel/status/NetworkStatusHelper;->getApn()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 8
    :cond_2
    const-string p0, "UnknownNetwork"

    return-object p0
.end method

.method public static b()Z
    .locals 2

    .line 9
    sget-object v0, Lanet/channel/util/c;->e:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v1, Lanet/channel/util/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static c()I
    .locals 2

    .line 1
    sget-object v0, Lanet/channel/util/c;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    sget-object v1, Lanet/channel/util/c;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Integer;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public static d()Lanet/channel/util/f;
    .locals 2

    .line 1
    sget-object v0, Lanet/channel/util/c;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    sget-object v1, Lanet/channel/util/c;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lanet/channel/util/f;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lanet/channel/util/c;->c:Lanet/channel/util/f;

    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method public static e()V
    .locals 4

    .line 1
    invoke-static {}, Lanet/channel/AwcnConfig;->isIpv6Enable()Z

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
    const/4 v0, 0x0

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const-string v2, "awcn.Inet64Util"

    .line 12
    .line 13
    const-string v3, "[startIpStackDetect]ipv6Enable=false"

    .line 14
    .line 15
    invoke-static {v2, v3, v0, v1}, Lanet/channel/util/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-static {}, Lanet/channel/status/NetworkStatusHelper;->getStatus()Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lanet/channel/util/c;->b(Lanet/channel/status/NetworkStatusHelper$NetworkStatus;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lanet/channel/util/c;->b:Ljava/lang/String;

    .line 28
    .line 29
    sget-object v0, Lanet/channel/util/c;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 30
    .line 31
    sget-object v2, Lanet/channel/util/c;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {}, Lanet/channel/util/c;->j()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    sget-object v1, Lanet/channel/util/c;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 49
    .line 50
    sget-object v2, Lanet/channel/util/c;->b:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    new-instance v1, Lanet/channel/statist/NetTypeStat;

    .line 60
    .line 61
    invoke-direct {v1}, Lanet/channel/statist/NetTypeStat;-><init>()V

    .line 62
    .line 63
    .line 64
    iput v0, v1, Lanet/channel/statist/NetTypeStat;->ipStackType:I

    .line 65
    .line 66
    sget-object v2, Lanet/channel/util/c;->b:Ljava/lang/String;

    .line 67
    .line 68
    const/4 v3, 0x2

    .line 69
    if-eq v0, v3, :cond_4

    .line 70
    .line 71
    const/4 v3, 0x3

    .line 72
    if-ne v0, v3, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-static {}, Lanet/channel/GlobalAppRuntimeInfo;->isTargetProcess()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    invoke-static {}, Lanet/channel/appmonitor/AppMonitor;->getInstance()Lanet/channel/appmonitor/IAppMonitor;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-interface {v0, v1}, Lanet/channel/appmonitor/IAppMonitor;->commitStat(Lanet/channel/statist/StatObject;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    :goto_0
    return-void

    .line 89
    :cond_4
    :goto_1
    new-instance v0, Lanet/channel/util/d;

    .line 90
    .line 91
    invoke-direct {v0, v2, v1}, Lanet/channel/util/d;-><init>(Ljava/lang/String;Lanet/channel/statist/NetTypeStat;)V

    .line 92
    .line 93
    .line 94
    const-wide/16 v1, 0x5dc

    .line 95
    .line 96
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 97
    .line 98
    invoke-static {v0, v1, v2, v3}, Lanet/channel/thread/ThreadPoolExecutorFactory;->submitScheduledTask(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/Future;

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public static synthetic f()I
    .locals 1

    .line 1
    invoke-static {}, Lanet/channel/util/c;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public static synthetic g()Lanet/channel/util/f;
    .locals 1

    .line 1
    invoke-static {}, Lanet/channel/util/c;->k()Lanet/channel/util/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static h()I
    .locals 13

    .line 1
    new-instance v0, Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v3

    .line 20
    :cond_0
    :goto_0
    const/4 v5, 0x0

    .line 21
    if-ge v4, v2, :cond_5

    .line 22
    .line 23
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    add-int/lit8 v4, v4, 0x1

    .line 28
    .line 29
    check-cast v6, Ljava/net/NetworkInterface;

    .line 30
    .line 31
    invoke-virtual {v6}, Ljava/net/NetworkInterface;->getInterfaceAddresses()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v6}, Ljava/net/NetworkInterface;->getDisplayName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    new-instance v8, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v9, "find NetworkInterface:"

    .line 52
    .line 53
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    new-array v9, v3, [Ljava/lang/Object;

    .line 64
    .line 65
    const-string v10, "awcn.Inet64Util"

    .line 66
    .line 67
    invoke-static {v10, v8, v5, v9}, Lanet/channel/util/ALog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/net/NetworkInterface;->getInterfaceAddresses()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    move v8, v3

    .line 79
    :cond_2
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    if-eqz v9, :cond_4

    .line 84
    .line 85
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    check-cast v9, Ljava/net/InterfaceAddress;

    .line 90
    .line 91
    invoke-virtual {v9}, Ljava/net/InterfaceAddress;->getAddress()Ljava/net/InetAddress;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    instance-of v11, v9, Ljava/net/Inet6Address;

    .line 96
    .line 97
    if-eqz v11, :cond_3

    .line 98
    .line 99
    check-cast v9, Ljava/net/Inet6Address;

    .line 100
    .line 101
    invoke-static {v9}, Lanet/channel/util/c;->a(Ljava/net/InetAddress;)Z

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-nez v11, :cond_2

    .line 106
    .line 107
    new-instance v11, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    const-string v12, "Found IPv6 address:"

    .line 113
    .line 114
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    new-array v11, v3, [Ljava/lang/Object;

    .line 129
    .line 130
    invoke-static {v10, v9, v5, v11}, Lanet/channel/util/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    or-int/lit8 v8, v8, 0x2

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_3
    instance-of v11, v9, Ljava/net/Inet4Address;

    .line 137
    .line 138
    if-eqz v11, :cond_2

    .line 139
    .line 140
    check-cast v9, Ljava/net/Inet4Address;

    .line 141
    .line 142
    invoke-static {v9}, Lanet/channel/util/c;->a(Ljava/net/InetAddress;)Z

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    if-nez v11, :cond_2

    .line 147
    .line 148
    invoke-virtual {v9}, Ljava/net/Inet4Address;->getHostAddress()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v11

    .line 152
    const-string v12, "192.168.43."

    .line 153
    .line 154
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    if-nez v11, :cond_2

    .line 159
    .line 160
    new-instance v11, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    const-string v12, "Found IPv4 address:"

    .line 166
    .line 167
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    new-array v11, v3, [Ljava/lang/Object;

    .line 182
    .line 183
    invoke-static {v10, v9, v5, v11}, Lanet/channel/util/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    or-int/lit8 v8, v8, 0x1

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_4
    if-eqz v8, :cond_0

    .line 190
    .line 191
    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    invoke-virtual {v0, v5, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :cond_5
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_6

    .line 209
    .line 210
    return v3

    .line 211
    :cond_6
    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    const/4 v2, 0x1

    .line 216
    if-ne v1, v2, :cond_7

    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/util/TreeMap;->firstEntry()Ljava/util/Map$Entry;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, Ljava/lang/Integer;

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    return v0

    .line 233
    :cond_7
    invoke-static {}, Lanet/channel/status/NetworkStatusHelper;->getStatus()Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v1}, Lanet/channel/status/NetworkStatusHelper$NetworkStatus;->isWifi()Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-eqz v1, :cond_8

    .line 242
    .line 243
    const-string v5, "wlan"

    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_8
    invoke-static {}, Lanet/channel/status/NetworkStatusHelper;->getStatus()Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-virtual {v1}, Lanet/channel/status/NetworkStatusHelper$NetworkStatus;->isMobile()Z

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    if-eqz v1, :cond_9

    .line 255
    .line 256
    const-string v5, "rmnet"

    .line 257
    .line 258
    :cond_9
    :goto_2
    if-eqz v5, :cond_b

    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    :cond_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    if-eqz v2, :cond_b

    .line 273
    .line 274
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    check-cast v2, Ljava/util/Map$Entry;

    .line 279
    .line 280
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    check-cast v4, Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    if-eqz v4, :cond_a

    .line 291
    .line 292
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    check-cast v1, Ljava/lang/Integer;

    .line 297
    .line 298
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    :cond_b
    const/4 v1, 0x2

    .line 303
    if-ne v3, v1, :cond_c

    .line 304
    .line 305
    const-string v1, "v4-wlan0"

    .line 306
    .line 307
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    if-eqz v2, :cond_c

    .line 312
    .line 313
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    check-cast v0, Ljava/lang/Integer;

    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    or-int/2addr v0, v3

    .line 324
    return v0

    .line 325
    :cond_c
    return v3
.end method

.method private static i()I
    .locals 3

    .line 1
    invoke-static {}, Lanet/channel/GlobalAppRuntimeInfo;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lorg/android/spdy/SpdyVersion;->SPDY3:Lorg/android/spdy/SpdyVersion;

    .line 6
    .line 7
    sget-object v2, Lorg/android/spdy/SpdySessionKind;->NONE_SESSION:Lorg/android/spdy/SpdySessionKind;

    .line 8
    .line 9
    invoke-static {v0, v1, v2}, Lorg/android/spdy/SpdyAgent;->getInstance(Landroid/content/Context;Lorg/android/spdy/SpdyVersion;Lorg/android/spdy/SpdySessionKind;)Lorg/android/spdy/SpdyAgent;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lorg/android/netutil/UdpConnectType;->a()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {}, Lorg/android/netutil/UdpConnectType;->b()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    or-int/lit8 v0, v0, 0x2

    .line 23
    .line 24
    :cond_0
    return v0
.end method

.method private static j()I
    .locals 7

    .line 1
    const-string v0, "awcn.Inet64Util"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {}, Lanet/channel/AwcnConfig;->isIpStackDetectByUdpConnect()Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    const-string v2, "udp_connect"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    :try_start_1
    invoke-static {}, Lanet/channel/util/c;->i()I

    .line 13
    .line 14
    .line 15
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    goto :goto_1

    .line 17
    :catchall_0
    move-exception v3

    .line 18
    goto :goto_0

    .line 19
    :catchall_1
    move-exception v3

    .line 20
    move-object v2, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    :try_start_2
    const-string v2, "interfaces"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 23
    .line 24
    :try_start_3
    invoke-static {}, Lanet/channel/util/c;->h()I

    .line 25
    .line 26
    .line 27
    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 28
    goto :goto_1

    .line 29
    :goto_0
    const-string v4, "[detectIpStack]error."

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    new-array v6, v5, [Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {v0, v4, v1, v3, v6}, Lanet/channel/util/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move v3, v5

    .line 38
    :goto_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    const-string v5, "detectType"

    .line 43
    .line 44
    const-string v6, "ip stack"

    .line 45
    .line 46
    filled-new-array {v6, v4, v5, v2}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const-string v4, "startIpStackDetect"

    .line 51
    .line 52
    invoke-static {v0, v4, v1, v2}, Lanet/channel/util/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return v3
.end method

.method private static k()Lanet/channel/util/f;
    .locals 9

    .line 1
    const-string v0, "ipv4only.arpa"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 5
    .line 6
    .line 7
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-object v2, v1

    .line 10
    :goto_0
    instance-of v3, v2, Ljava/net/Inet6Address;

    .line 11
    .line 12
    const-string v4, "awcn.Inet64Util"

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-eqz v3, :cond_3

    .line 16
    .line 17
    new-instance v3, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v6, "Resolved AAAA: "

    .line 23
    .line 24
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/net/InetAddress;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    new-array v6, v5, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-static {v4, v3, v1, v6}, Lanet/channel/util/ALog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/net/InetAddress;->getAddress()[B

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    array-length v3, v2

    .line 48
    const/16 v4, 0x10

    .line 49
    .line 50
    if-eq v3, v4, :cond_0

    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_0
    const/16 v3, 0xc

    .line 54
    .line 55
    :goto_1
    if-ltz v3, :cond_4

    .line 56
    .line 57
    aget-byte v4, v2, v3

    .line 58
    .line 59
    sget-object v6, Lanet/channel/util/c;->a:[[B

    .line 60
    .line 61
    aget-object v7, v6, v5

    .line 62
    .line 63
    aget-byte v8, v7, v5

    .line 64
    .line 65
    and-int/2addr v4, v8

    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    add-int/lit8 v4, v3, 0x1

    .line 69
    .line 70
    aget-byte v4, v2, v4

    .line 71
    .line 72
    if-nez v4, :cond_2

    .line 73
    .line 74
    add-int/lit8 v4, v3, 0x2

    .line 75
    .line 76
    aget-byte v4, v2, v4

    .line 77
    .line 78
    if-nez v4, :cond_2

    .line 79
    .line 80
    add-int/lit8 v4, v3, 0x3

    .line 81
    .line 82
    aget-byte v4, v2, v4

    .line 83
    .line 84
    const/4 v8, 0x3

    .line 85
    aget-byte v7, v7, v8

    .line 86
    .line 87
    if-eq v4, v7, :cond_1

    .line 88
    .line 89
    const/4 v7, 0x1

    .line 90
    aget-object v6, v6, v7

    .line 91
    .line 92
    aget-byte v6, v6, v8

    .line 93
    .line 94
    if-ne v4, v6, :cond_2

    .line 95
    .line 96
    :cond_1
    add-int/lit8 v1, v3, 0x1

    .line 97
    .line 98
    add-int/lit8 v4, v3, 0x2

    .line 99
    .line 100
    add-int/lit8 v6, v3, 0x3

    .line 101
    .line 102
    aput-byte v5, v2, v6

    .line 103
    .line 104
    aput-byte v5, v2, v4

    .line 105
    .line 106
    aput-byte v5, v2, v1

    .line 107
    .line 108
    aput-byte v5, v2, v3

    .line 109
    .line 110
    invoke-static {v0, v2, v5}, Ljava/net/Inet6Address;->getByAddress(Ljava/lang/String;[BI)Ljava/net/Inet6Address;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    new-instance v1, Lanet/channel/util/f;

    .line 115
    .line 116
    mul-int/lit8 v3, v3, 0x8

    .line 117
    .line 118
    invoke-direct {v1, v0, v3}, Lanet/channel/util/f;-><init>(Ljava/net/Inet6Address;I)V

    .line 119
    .line 120
    .line 121
    return-object v1

    .line 122
    :cond_2
    add-int/lit8 v3, v3, -0x1

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_3
    instance-of v0, v2, Ljava/net/Inet4Address;

    .line 126
    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    const-string v3, "Resolved A: "

    .line 135
    .line 136
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/net/InetAddress;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    new-array v2, v5, [Ljava/lang/Object;

    .line 151
    .line 152
    invoke-static {v4, v0, v1, v2}, Lanet/channel/util/ALog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :cond_4
    return-object v1
.end method
