.class public Lcom/taobao/accs/AccsState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/taobao/accs/AccsState$b;,
        Lcom/taobao/accs/AccsState$c;,
        Lcom/taobao/accs/AccsState$a;
    }
.end annotation


# static fields
.field public static final ALL:Ljava/lang/String; = "all"

.field public static final BIND_APP_FROM_CACHE:Ljava/lang/String; = "bfc"

.field public static final CONNECTION_CHANGE:Ljava/lang/String; = "cc"

.field public static final LAST_MSG_RECEIVE_TIME:Ljava/lang/String; = "lmrt"

.field public static final LAST_MSG_SEND_TIME:Ljava/lang/String; = "lmst"

.field public static final RECENT_ERRORS:Ljava/lang/String; = "re"

.field public static final SDK_VERSION:Ljava/lang/String; = "sv"


# instance fields
.field private a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/taobao/accs/AccsState$c;",
            ">;"
        }
    .end annotation
.end field

.field private b:J

.field private c:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/taobao/accs/AccsState;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    const-wide/16 v0, -0x1

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/taobao/accs/AccsState;->b:J

    .line 14
    .line 15
    iput-wide v0, p0, Lcom/taobao/accs/AccsState;->c:J

    .line 16
    .line 17
    return-void
.end method

.method private a(Ljava/lang/String;)Lcom/taobao/accs/AccsState$c;
    .locals 2

    .line 7
    iget-object v0, p0, Lcom/taobao/accs/AccsState;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/taobao/accs/AccsState$c;

    if-nez v0, :cond_0

    .line 8
    new-instance v0, Lcom/taobao/accs/AccsState$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/taobao/accs/AccsState$c;-><init>(Lcom/taobao/accs/a;)V

    .line 9
    iget-object v1, p0, Lcom/taobao/accs/AccsState;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private a()V
    .locals 4

    .line 10
    iget-wide v0, p0, Lcom/taobao/accs/AccsState;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    iget-wide v0, p0, Lcom/taobao/accs/AccsState;->b:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 11
    :cond_1
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/taobao/accs/AccsState;->c:J

    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/taobao/accs/AccsState;->b:J

    return-void
.end method

.method private a(Ljava/util/HashMap;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/taobao/accs/AccsState$c;",
            ">;)Z"
        }
    .end annotation

    .line 13
    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private a(Ljava/util/HashMap;Ljava/lang/String;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/taobao/accs/AccsState$c;",
            ">;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    if-ge v2, p1, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    check-cast v3, Lcom/taobao/accs/AccsState$c;

    .line 16
    invoke-virtual {v3, p2}, Lcom/taobao/accs/AccsState$c;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method private b()J
    .locals 4

    .line 7
    invoke-direct {p0}, Lcom/taobao/accs/AccsState;->a()V

    .line 8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/taobao/accs/AccsState;->b:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public static getInstance()Lcom/taobao/accs/AccsState;
    .locals 1

    .line 1
    invoke-static {}, Lcom/taobao/accs/AccsState$a;->a()Lcom/taobao/accs/AccsState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    const-string v0, "all"

    invoke-direct {p0, v0}, Lcom/taobao/accs/AccsState;->a(Ljava/lang/String;)Lcom/taobao/accs/AccsState$c;

    move-result-object v0

    .line 2
    invoke-direct {p0}, Lcom/taobao/accs/AccsState;->b()J

    move-result-wide v1

    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/taobao/accs/AccsState$c;->a(Ljava/lang/String;Ljava/lang/Object;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    monitor-enter p0

    .line 4
    :try_start_0
    invoke-direct {p0, p1}, Lcom/taobao/accs/AccsState;->a(Ljava/lang/String;)Lcom/taobao/accs/AccsState$c;

    move-result-object p1

    .line 5
    invoke-direct {p0}, Lcom/taobao/accs/AccsState;->b()J

    move-result-wide v0

    invoke-virtual {p1, p2, p3, v0, v1}, Lcom/taobao/accs/AccsState$c;->a(Ljava/lang/String;Ljava/lang/Object;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized b(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    const-string v0, "all"

    invoke-direct {p0, v0}, Lcom/taobao/accs/AccsState;->a(Ljava/lang/String;)Lcom/taobao/accs/AccsState$c;

    move-result-object v0

    .line 2
    invoke-direct {p0}, Lcom/taobao/accs/AccsState;->b()J

    move-result-wide v1

    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/taobao/accs/AccsState$c;->b(Ljava/lang/String;Ljava/lang/Object;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    monitor-enter p0

    .line 4
    :try_start_0
    invoke-direct {p0, p1}, Lcom/taobao/accs/AccsState;->a(Ljava/lang/String;)Lcom/taobao/accs/AccsState$c;

    move-result-object p1

    .line 5
    invoke-direct {p0}, Lcom/taobao/accs/AccsState;->b()J

    move-result-wide v0

    invoke-virtual {p1, p2, p3, v0, v1}, Lcom/taobao/accs/AccsState$c;->b(Ljava/lang/String;Ljava/lang/Object;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized getState()Ljava/lang/String;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/taobao/accs/AccsState;->a:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-direct {p0, v0}, Lcom/taobao/accs/AccsState;->a(Ljava/util/HashMap;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "{}"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-object v0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    .line 17
    .line 18
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    .line 21
    :try_start_2
    const-string v1, "t"

    .line 22
    .line 23
    iget-wide v2, p0, Lcom/taobao/accs/AccsState;->c:J

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    iget-object v2, p0, Lcom/taobao/accs/AccsState;->a:Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v3, 0x0

    .line 44
    :goto_0
    if-ge v3, v2, :cond_1

    .line 45
    .line 46
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    check-cast v4, Ljava/util/Map$Entry;

    .line 53
    .line 54
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, Ljava/lang/String;

    .line 59
    .line 60
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Lcom/taobao/accs/AccsState$c;

    .line 65
    .line 66
    invoke-virtual {v4}, Lcom/taobao/accs/AccsState$c;->a()Lorg/json/JSONArray;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v0, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_1
    move-exception v1

    .line 75
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 76
    .line 77
    .line 78
    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 82
    monitor-exit p0

    .line 83
    return-object v0

    .line 84
    :goto_1
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 85
    throw v0
.end method

.method public declared-synchronized getStateByKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/taobao/accs/AccsState;->a:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-direct {p0, v0, p1}, Lcom/taobao/accs/AccsState;->a(Ljava/util/HashMap;Ljava/lang/String;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string p1, "{}"
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
    goto :goto_1

    .line 16
    :cond_0
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    .line 17
    .line 18
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    .line 21
    :try_start_2
    const-string v1, "t"

    .line 22
    .line 23
    iget-wide v2, p0, Lcom/taobao/accs/AccsState;->c:J

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    iget-object v2, p0, Lcom/taobao/accs/AccsState;->a:Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v3, 0x0

    .line 44
    :cond_1
    :goto_0
    if-ge v3, v2, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    check-cast v4, Ljava/util/Map$Entry;

    .line 53
    .line 54
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, Lcom/taobao/accs/AccsState$c;

    .line 59
    .line 60
    invoke-virtual {v5, p1}, Lcom/taobao/accs/AccsState$c;->a(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_1

    .line 65
    .line 66
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    check-cast v5, Ljava/lang/String;

    .line 71
    .line 72
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    check-cast v4, Lcom/taobao/accs/AccsState$c;

    .line 77
    .line 78
    invoke-virtual {v4, p1}, Lcom/taobao/accs/AccsState$c;->b(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v0, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :catchall_1
    move-exception p1

    .line 87
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 88
    .line 89
    .line 90
    :cond_2
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 94
    monitor-exit p0

    .line 95
    return-object p1

    .line 96
    :goto_1
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 97
    throw p1
.end method
