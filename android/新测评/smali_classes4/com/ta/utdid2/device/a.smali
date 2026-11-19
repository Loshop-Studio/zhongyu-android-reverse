.class public Lcom/ta/utdid2/device/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/ta/utdid2/device/a;

.field private static c:J


# instance fields
.field private e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/ta/utdid2/device/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/ta/utdid2/device/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/ta/utdid2/device/a;->a:Lcom/ta/utdid2/device/a;

    .line 7
    .line 8
    const-wide/16 v0, 0xbb8

    .line 9
    .line 10
    sput-wide v0, Lcom/ta/utdid2/device/a;->c:J

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/ta/utdid2/device/a;->e:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static a()Lcom/ta/utdid2/device/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/ta/utdid2/device/a;->a:Lcom/ta/utdid2/device/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/ta/utdid2/device/a;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method private h()V
    .locals 2

    .line 1
    invoke-static {}, Lj2/h;->i()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ta/utdid2/device/a;->e:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    :try_start_0
    invoke-static {}, Le2/a;->b()Le2/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Le2/a;->f()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lj2/a;->e(Landroid/content/Context;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    :goto_0
    return-void

    .line 28
    :cond_1
    new-instance v1, Lcom/ta/utdid2/device/a$4;

    .line 29
    .line 30
    invoke-direct {v1, p0, v0}, Lcom/ta/utdid2/device/a$4;-><init>(Lcom/ta/utdid2/device/a;Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    new-instance v0, Ljava/lang/Thread;

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    const-string v1, ""

    .line 44
    .line 45
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v1, v0}, Lj2/h;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method private q()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {}, Le2/a;->b()Le2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Le2/a;->f()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-static {}, Li2/e;->j()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, Lcom/ta/utdid2/device/c;->c(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const-string v3, "AppUtdid"

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    const-string v2, "read utdid from V5AppFile"

    .line 27
    .line 28
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v3, v2}, Lj2/h;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x7

    .line 36
    invoke-static {v2}, Lcom/ta/utdid2/device/c;->setType(I)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Lcom/ta/utdid2/device/a$1;

    .line 40
    .line 41
    invoke-direct {v2, p0, v1, v0}, Lcom/ta/utdid2/device/a$1;-><init>(Lcom/ta/utdid2/device/a;Ljava/lang/String;Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v2}, Lcom/ta/utdid2/device/c;->a(Lcom/ta/utdid2/device/c$a;)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_1
    invoke-static {v0}, Li2/e;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1}, Lcom/ta/utdid2/device/c;->c(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    const-string v0, "read utdid from V5Settings"

    .line 59
    .line 60
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v3, v0}, Lj2/h;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const/16 v0, 0x8

    .line 68
    .line 69
    invoke-static {v0}, Lcom/ta/utdid2/device/c;->setType(I)V

    .line 70
    .line 71
    .line 72
    new-instance v0, Lcom/ta/utdid2/device/a$2;

    .line 73
    .line 74
    invoke-direct {v0, p0, v1}, Lcom/ta/utdid2/device/a$2;-><init>(Lcom/ta/utdid2/device/a;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lcom/ta/utdid2/device/c;->a(Lcom/ta/utdid2/device/c$a;)V

    .line 78
    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_2
    invoke-static {}, Li2/e;->l()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v1}, Lcom/ta/utdid2/device/c;->c(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_3

    .line 90
    .line 91
    const-string v2, "read utdid from V5Sdcard"

    .line 92
    .line 93
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-static {v3, v2}, Lj2/h;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    const/16 v2, 0x9

    .line 101
    .line 102
    invoke-static {v2}, Lcom/ta/utdid2/device/c;->setType(I)V

    .line 103
    .line 104
    .line 105
    new-instance v2, Lcom/ta/utdid2/device/a$3;

    .line 106
    .line 107
    invoke-direct {v2, p0, v1, v0}, Lcom/ta/utdid2/device/a$3;-><init>(Lcom/ta/utdid2/device/a;Ljava/lang/String;Landroid/content/Context;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v2}, Lcom/ta/utdid2/device/c;->a(Lcom/ta/utdid2/device/c$a;)V

    .line 111
    .line 112
    .line 113
    return-object v1

    .line 114
    :cond_3
    const/4 v0, 0x0

    .line 115
    return-object v0
.end method


# virtual methods
.method public declared-synchronized getUtdid(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ta/utdid2/device/a;->e:Ljava/lang/String;

    .line 3
    .line 4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/ta/utdid2/device/a;->e:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-object p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_2

    .line 16
    :cond_0
    :try_start_1
    invoke-static {}, Lj2/e;->b()V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/ta/utdid2/device/a;->q()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-static {p1}, Lcom/ta/utdid2/device/c;->a(Landroid/content/Context;)Lcom/ta/utdid2/device/c;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lcom/ta/utdid2/device/c;->getValue()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_0

    .line 38
    :catchall_1
    move-exception p1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    iput-object v0, p0, Lcom/ta/utdid2/device/a;->e:Ljava/lang/String;

    .line 47
    .line 48
    invoke-direct {p0}, Lcom/ta/utdid2/device/a;->h()V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/ta/utdid2/device/a;->e:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 52
    .line 53
    :try_start_2
    invoke-static {}, Lj2/e;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    .line 55
    .line 56
    monitor-exit p0

    .line 57
    return-object p1

    .line 58
    :cond_2
    :try_start_3
    const-string p1, "ffffffffffffffffffffffff"
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 59
    .line 60
    :try_start_4
    invoke-static {}, Lj2/e;->c()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 61
    .line 62
    .line 63
    monitor-exit p0

    .line 64
    return-object p1

    .line 65
    :goto_1
    :try_start_5
    const-string v0, "AppUtdid"

    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    new-array v1, v1, [Ljava/lang/Object;

    .line 69
    .line 70
    invoke-static {v0, p1, v1}, Lj2/h;->d(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    const-string p1, "ffffffffffffffffffffffff"
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 74
    .line 75
    :try_start_6
    invoke-static {}, Lj2/e;->c()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 76
    .line 77
    .line 78
    monitor-exit p0

    .line 79
    return-object p1

    .line 80
    :catchall_2
    move-exception p1

    .line 81
    :try_start_7
    invoke-static {}, Lj2/e;->c()V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :goto_2
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 86
    throw p1
.end method

.method public declared-synchronized r()Ljava/lang/String;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ta/utdid2/device/a;->e:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method
