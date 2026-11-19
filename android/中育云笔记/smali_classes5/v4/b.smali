.class public Lv4/b;
.super Lr4/c;


# static fields
.field public static d:Ljava/util/List;

.field public static final e:Ljava/util/Map;

.field public static f:Ljava/lang/String;


# instance fields
.field public final a:Lr4/d;

.field public final b:Lv4/c;

.field public final c:Lv4/c;


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
    sput-object v0, Lv4/b;->e:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lr4/d;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lr4/c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv4/b;->a:Lr4/d;

    .line 5
    .line 6
    sget-object v0, Lv4/b;->d:Ljava/util/List;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "AGC_Instance"

    .line 11
    .line 12
    const-string v1, "please call `initialize()` first"

    .line 13
    .line 14
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    :cond_0
    new-instance v0, Lv4/c;

    .line 18
    .line 19
    sget-object v1, Lv4/b;->d:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {p1}, Lr4/d;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {v0, v1, v2}, Lv4/c;-><init>(Ljava/util/List;Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lv4/b;->b:Lv4/c;

    .line 29
    .line 30
    new-instance v0, Lv4/c;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-interface {p1}, Lr4/d;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-direct {v0, v1, v2}, Lv4/c;-><init>(Ljava/util/List;Landroid/content/Context;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lv4/b;->c:Lv4/c;

    .line 41
    .line 42
    instance-of v1, p1, Lt4/c;

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    move-object v1, p1

    .line 47
    check-cast v1, Lt4/c;

    .line 48
    .line 49
    invoke-virtual {v1}, Lt4/c;->c()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {p1}, Lr4/d;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {v0, v1, p1}, Lv4/c;->a(Ljava/util/List;Landroid/content/Context;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void
.end method

.method public static f()Lr4/c;
    .locals 1

    .line 1
    sget-object v0, Lv4/b;->f:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "DEFAULT_INSTANCE"

    .line 6
    .line 7
    invoke-static {v0}, Lv4/b;->g(Ljava/lang/String;)Lr4/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-static {v0}, Lv4/b;->g(Ljava/lang/String;)Lr4/c;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public static declared-synchronized g(Ljava/lang/String;)Lr4/c;
    .locals 5

    .line 1
    const-class v0, Lv4/b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lv4/b;->e:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lr4/c;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    const-string v2, "DEFAULT_INSTANCE"

    .line 15
    .line 16
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    const-string p0, "AGC_Instance"

    .line 23
    .line 24
    const-string v2, "please call `initialize()` first"

    .line 25
    .line 26
    invoke-static {p0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const-string v2, "AGC_Instance"

    .line 33
    .line 34
    new-instance v3, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v4, "not find instance for : "

    .line 40
    .line 41
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    monitor-exit v0

    .line 55
    return-object v1

    .line 56
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    throw p0
.end method

.method public static h(Lr4/d;)Lr4/c;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lv4/b;->i(Lr4/d;Z)Lr4/c;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static declared-synchronized i(Lr4/d;Z)Lr4/c;
    .locals 3

    .line 1
    const-class v0, Lv4/b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lv4/b;->e:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {p0}, Lr4/d;->getIdentifier()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lr4/c;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    :cond_0
    new-instance v2, Lv4/b;

    .line 21
    .line 22
    invoke-direct {v2, p0}, Lv4/b;-><init>(Lr4/d;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Lr4/d;->getIdentifier()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {v1, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    :cond_1
    monitor-exit v0

    .line 33
    return-object v2

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    throw p0
.end method

.method public static declared-synchronized j(Landroid/content/Context;)V
    .locals 3

    .line 1
    const-class v0, Lv4/b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "AGC_Instance"

    .line 5
    .line 6
    const-string v2, "agc sdk initialize"

    .line 7
    .line 8
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    sget-object v1, Lv4/b;->e:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-lez v1, :cond_0

    .line 18
    .line 19
    const-string p0, "AGC_Instance"

    .line 20
    .line 21
    const-string v1, "Repeated invoking initialize"

    .line 22
    .line 23
    invoke-static {p0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    :try_start_1
    invoke-static {p0}, Ls4/a;->b(Landroid/content/Context;)Ls4/a;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {p0, v1}, Lv4/b;->k(Landroid/content/Context;Lr4/d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    .line 36
    .line 37
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    throw p0
.end method

.method public static declared-synchronized k(Landroid/content/Context;Lr4/d;)V
    .locals 3

    .line 1
    const-class v0, Lv4/b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const-string v1, "AGC_Instance"

    .line 11
    .line 12
    const-string v2, "context.getApplicationContext null"

    .line 13
    .line 14
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    move-object p0, v1

    .line 21
    :goto_0
    invoke-static {}, Lv4/b;->l()V

    .line 22
    .line 23
    .line 24
    sget-object v1, Lv4/b;->d:Ljava/util/List;

    .line 25
    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    new-instance v1, Lcom/huawei/agconnect/core/a/c;

    .line 29
    .line 30
    invoke-direct {v1, p0}, Lcom/huawei/agconnect/core/a/c;-><init>(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/huawei/agconnect/core/a/c;->a()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    sput-object p0, Lv4/b;->d:Ljava/util/List;

    .line 38
    .line 39
    :cond_1
    const/4 p0, 0x1

    .line 40
    invoke-static {p1, p0}, Lv4/b;->i(Lr4/d;Z)Lr4/c;

    .line 41
    .line 42
    .line 43
    invoke-interface {p1}, Lr4/d;->getIdentifier()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    sput-object p0, Lv4/b;->f:Ljava/lang/String;

    .line 48
    .line 49
    const-string p0, "AGC_Instance"

    .line 50
    .line 51
    const-string p1, "initFinish callback start"

    .line 52
    .line 53
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lv4/a;->a()V

    .line 57
    .line 58
    .line 59
    const-string p0, "AGC_Instance"

    .line 60
    .line 61
    const-string p1, "AGC SDK initialize end"

    .line 62
    .line 63
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    monitor-exit v0

    .line 67
    return-void

    .line 68
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    throw p0
.end method

.method public static l()V
    .locals 2

    .line 1
    new-instance v0, Lv4/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lv4/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "/agcgw/url"

    .line 7
    .line 8
    invoke-static {v1, v0}, Lr4/f;->b(Ljava/lang/String;Lr4/f$a;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lv4/b$b;

    .line 12
    .line 13
    invoke-direct {v0}, Lv4/b$b;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "/agcgw/backurl"

    .line 17
    .line 18
    invoke-static {v1, v0}, Lr4/f;->b(Ljava/lang/String;Lr4/f$a;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public b()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->a:Lr4/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lr4/d;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public d()Lr4/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->a:Lr4/d;

    .line 2
    .line 3
    return-object v0
.end method
