.class public Lr5/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:Lr5/o;

.field public static c:Ljava/util/Map;


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lr5/o;->c:Ljava/util/Map;

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

.method public static a()Lr5/o;
    .locals 1

    .line 1
    invoke-static {}, Lr5/o;->h()Lr5/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static declared-synchronized h()Lr5/o;
    .locals 2

    .line 1
    const-class v0, Lr5/o;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lr5/o;->b:Lr5/o;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lr5/o;

    .line 9
    .line 10
    invoke-direct {v1}, Lr5/o;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lr5/o;->b:Lr5/o;

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
    sget-object v1, Lr5/o;->b:Lr5/o;
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


# virtual methods
.method public b(Landroid/content/Context;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lr5/o;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lr5/o;->i(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lr5/z0;->e()Lr5/z0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lr5/z0;->d()Lr5/t;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {}, Lcom/huawei/hms/hatool/o;->c()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1, v0}, Lr5/t;->q(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public c(Ljava/lang/String;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr5/o;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "hmsSdk"

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p1, "onReport() null context or SDK was not init."

    .line 8
    .line 9
    invoke-static {v1, p1}, Lr5/f1;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string v0, "onReport: Before calling runtaskhandler()"

    .line 14
    .line 15
    invoke-static {v1, v0}, Lr5/f1;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p2}, Lr5/o0;->c(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-static {}, Lr5/v0;->m()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, p1, p2, v0}, Lr5/o;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public d(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;)V
    .locals 9

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/4 v2, 0x2

    .line 6
    if-ne v2, p2, :cond_0

    .line 7
    .line 8
    const-string v2, "yyyy-MM-dd"

    .line 9
    .line 10
    invoke-static {v2, v0, v1}, Lr5/o0;->a(Ljava/lang/String;J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    :cond_0
    move-wide v7, v0

    .line 15
    new-instance v2, Lr5/b;

    .line 16
    .line 17
    invoke-static {p2}, Lr5/o0;->c(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    move-object v5, p1

    .line 22
    move-object v3, p3

    .line 23
    move-object v4, p4

    .line 24
    invoke-direct/range {v2 .. v8}, Lr5/b;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;J)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lr5/e;->d()Lr5/e;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1, v2}, Lr5/e;->b(Lr5/u;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public e(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;J)V
    .locals 7

    .line 1
    new-instance v0, Lr5/z;

    .line 2
    .line 3
    invoke-static {p2}, Lr5/o0;->c(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {p4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    move-object v1, p1

    .line 12
    move-object v3, p3

    .line 13
    move-wide v5, p5

    .line 14
    invoke-direct/range {v0 .. v6}, Lr5/z;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lr5/z;->a()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-static {p1, p2}, Lr5/c;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "hmsSdk"

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-static {p1, p2}, Lr5/c;->k(Ljava/lang/String;Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    sub-long v2, v4, v2

    .line 18
    .line 19
    const-wide/16 v6, 0x7530

    .line 20
    .line 21
    cmp-long v0, v2, v6

    .line 22
    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    const-string v0, "begin to call onReport!"

    .line 26
    .line 27
    invoke-static {v1, v0}, Lr5/f1;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p2, v4, v5}, Lr5/c;->a(Ljava/lang/String;Ljava/lang/String;J)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lr5/v0;->m()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0, p1, p2, v0}, Lr5/o;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    const-string p1, "autoReport timeout. interval < 30s "

    .line 42
    .line 43
    invoke-static {v1, p1}, Lr5/f1;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v0, "auto report is closed tag:"

    .line 53
    .line 54
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {v1, p1}, Lr5/f1;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr5/o;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "hmsSdk"

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p1, "onReport() null context or SDK was not init."

    .line 8
    .line 9
    invoke-static {v1, p1}, Lr5/f1;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {v0}, Lcom/huawei/hms/hatool/r0;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1, p2}, Lr5/c;->f(Ljava/lang/String;Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    const-string v2, "WIFI"

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    new-instance p1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string p2, "strNetworkType is :"

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {v1, p1}, Lr5/f1;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    const-string v2, "unknown"

    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_2

    .line 59
    .line 60
    const-string v2, "none"

    .line 61
    .line 62
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_2

    .line 67
    .line 68
    const-string v2, "2G"

    .line 69
    .line 70
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_2

    .line 75
    .line 76
    new-instance v0, Lr5/e1;

    .line 77
    .line 78
    invoke-direct {v0, p1, p2, p3}, Lr5/e1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {}, Lr5/e;->d()Lr5/e;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1, v0}, Lr5/e;->b(Lr5/u;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_2
    const-string p1, "The network is bad."

    .line 90
    .line 91
    invoke-static {v1, p1}, Lr5/f1;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public final i(Landroid/content/Context;)V
    .locals 6

    .line 1
    invoke-static {p1}, Lcom/huawei/hms/hatool/o;->j(Landroid/content/Context;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lr5/v0;->b(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lr5/w0;->b()Lr5/w0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lr5/w0;->a()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const-string v2, "hmsSdk"

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    const-string v1, "global_v2"

    .line 21
    .line 22
    const-string v3, "app_ver"

    .line 23
    .line 24
    const-string v4, ""

    .line 25
    .line 26
    invoke-static {p1, v1, v3, v4}, Lr5/l;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-static {p1, v1, v3, v0}, Lr5/l;->g(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v5}, Lr5/v0;->d(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    const-string p1, "app ver is first save!"

    .line 43
    .line 44
    invoke-static {v2, p1}, Lr5/f1;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    const-string p1, "the appVers are different!"

    .line 55
    .line 56
    invoke-static {v2, p1}, Lr5/f1;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lr5/o;->a()Lr5/o;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const-string v0, "alltype"

    .line 64
    .line 65
    invoke-virtual {p1, v4, v0, v5}, Lr5/o;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    return-void

    .line 69
    :cond_2
    const-string p1, "userManager.isUserUnlocked() == false"

    .line 70
    .line 71
    invoke-static {v2, p1}, Lr5/f1;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method
