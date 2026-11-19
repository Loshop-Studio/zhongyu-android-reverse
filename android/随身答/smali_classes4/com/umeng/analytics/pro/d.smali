.class public Lcom/umeng/analytics/pro/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/pro/d$b;
    }
.end annotation


# static fields
.field public static i:Ljava/lang/String;

.field public static j:Lorg/json/JSONArray;

.field public static k:Ljava/lang/Object;

.field public static l:Landroid/app/Application;

.field public static m:Lcom/umeng/analytics/MobclickAgent$PageMode;

.field public static n:Ljava/lang/String;

.field public static o:I

.field public static p:Z

.field public static q:Ljava/lang/Object;


# instance fields
.field public final a:Ljava/util/Map;

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:I

.field public f:I

.field public g:Li2/b;

.field public h:Landroid/app/Application$ActivityLifecycleCallbacks;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/umeng/analytics/pro/d;->j:Lorg/json/JSONArray;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/umeng/analytics/pro/d;->k:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    sput-object v0, Lcom/umeng/analytics/pro/d;->l:Landroid/app/Application;

    .line 17
    .line 18
    sget-object v1, Lcom/umeng/analytics/MobclickAgent$PageMode;->a:Lcom/umeng/analytics/MobclickAgent$PageMode;

    .line 19
    .line 20
    sput-object v1, Lcom/umeng/analytics/pro/d;->m:Lcom/umeng/analytics/MobclickAgent$PageMode;

    .line 21
    .line 22
    sput-object v0, Lcom/umeng/analytics/pro/d;->n:Ljava/lang/String;

    .line 23
    .line 24
    const/4 v0, -0x1

    .line 25
    sput v0, Lcom/umeng/analytics/pro/d;->o:I

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    sput-boolean v0, Lcom/umeng/analytics/pro/d;->p:Z

    .line 29
    .line 30
    new-instance v0, Ljava/lang/Object;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/umeng/analytics/pro/d;->q:Ljava/lang/Object;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/pro/d;->a:Ljava/util/Map;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/umeng/analytics/pro/d;->b:Z

    .line 5
    iput-boolean v0, p0, Lcom/umeng/analytics/pro/d;->c:Z

    .line 6
    iput-boolean v0, p0, Lcom/umeng/analytics/pro/d;->d:Z

    .line 7
    iput v0, p0, Lcom/umeng/analytics/pro/d;->e:I

    .line 8
    iput v0, p0, Lcom/umeng/analytics/pro/d;->f:I

    .line 9
    invoke-static {}, Li2/a;->b()Li2/a;

    move-result-object v0

    iput-object v0, p0, Lcom/umeng/analytics/pro/d;->g:Li2/b;

    .line 10
    new-instance v0, Lcom/umeng/analytics/pro/d$a;

    invoke-direct {v0, p0}, Lcom/umeng/analytics/pro/d$a;-><init>(Lcom/umeng/analytics/pro/d;)V

    iput-object v0, p0, Lcom/umeng/analytics/pro/d;->h:Landroid/app/Application$ActivityLifecycleCallbacks;

    .line 11
    monitor-enter p0

    .line 12
    :try_start_0
    sget-object v0, Lcom/umeng/analytics/pro/d;->l:Landroid/app/Application;

    if-eqz v0, :cond_0

    .line 13
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/d;->v()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public synthetic constructor <init>(Lcom/umeng/analytics/pro/d$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/umeng/analytics/pro/d;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/umeng/analytics/pro/d;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/umeng/analytics/pro/d;->f:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, -0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/umeng/analytics/pro/d;->f:I

    .line 6
    .line 7
    return v0
.end method

.method public static declared-synchronized b(Landroid/content/Context;)Lcom/umeng/analytics/pro/d;
    .locals 2

    .line 1
    const-class v0, Lcom/umeng/analytics/pro/d;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/umeng/analytics/pro/d;->l:Landroid/app/Application;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    instance-of v1, p0, Landroid/app/Activity;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast p0, Landroid/app/Activity;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sput-object p0, Lcom/umeng/analytics/pro/d;->l:Landroid/app/Application;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    instance-of v1, p0, Landroid/app/Application;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    check-cast p0, Landroid/app/Application;

    .line 30
    .line 31
    sput-object p0, Lcom/umeng/analytics/pro/d;->l:Landroid/app/Application;

    .line 32
    .line 33
    :cond_1
    :goto_0
    invoke-static {}, Lcom/umeng/analytics/pro/d$b;->a()Lcom/umeng/analytics/pro/d;

    .line 34
    .line 35
    .line 36
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    monitor-exit v0

    .line 38
    return-object p0

    .line 39
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw p0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget v0, Lcom/umeng/analytics/pro/d;->o:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    invoke-static {p0}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v1, "pairUUID"

    .line 18
    .line 19
    sget-object v2, Lcom/umeng/analytics/pro/d;->n:Ljava/lang/String;

    .line 20
    .line 21
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    const-string v1, "reason"

    .line 25
    .line 26
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    sget-object p1, Lcom/umeng/analytics/pro/d;->n:Ljava/lang/String;

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    sput-object p1, Lcom/umeng/analytics/pro/d;->n:Ljava/lang/String;

    .line 35
    .line 36
    :cond_0
    if-eqz p0, :cond_1

    .line 37
    .line 38
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v1, "pid"

    .line 47
    .line 48
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string v1, "isMainProcess"

    .line 60
    .line 61
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    const-string p1, "Context"

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lcom/umeng/analytics/a;->b()Lcom/umeng/analytics/a;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v1, "$$_onUMengEnterBackground"

    .line 78
    .line 79
    invoke-virtual {p1, p0, v1, v0}, Lcom/umeng/analytics/a;->d(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    return-void
.end method

.method public static synthetic e(Lcom/umeng/analytics/pro/d;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/d;->c(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Z)Z
    .locals 0

    .line 1
    sput-boolean p0, Lcom/umeng/analytics/pro/d;->p:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic h(Lcom/umeng/analytics/pro/d;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/umeng/analytics/pro/d;->e:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, -0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/umeng/analytics/pro/d;->e:I

    .line 6
    .line 7
    return v0
.end method

.method public static synthetic l(Lcom/umeng/analytics/pro/d;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/d;->o(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic m(Lcom/umeng/analytics/pro/d;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/umeng/analytics/pro/d;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static p(Landroid/content/Context;)V
    .locals 4

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lcom/umeng/analytics/pro/d;->k:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    sget-object v2, Lcom/umeng/analytics/pro/d;->j:Lorg/json/JSONArray;

    .line 12
    .line 13
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lorg/json/JSONArray;

    .line 18
    .line 19
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v3, Lcom/umeng/analytics/pro/d;->j:Lorg/json/JSONArray;

    .line 23
    .line 24
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-lez v1, :cond_0

    .line 30
    .line 31
    new-instance v1, Lorg/json/JSONArray;

    .line 32
    .line 33
    invoke-direct {v1, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v2, "__b"

    .line 37
    .line 38
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    invoke-static {p0}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {}, Lcom/umeng/analytics/pro/e;->d()Lcom/umeng/analytics/pro/e;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Lcom/umeng/analytics/pro/e;->o()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sget-object v2, Lcom/umeng/analytics/pro/h$a;->a:Lcom/umeng/analytics/pro/h$a;

    .line 54
    .line 55
    invoke-virtual {p0, v1, v0, v2}, Lcom/umeng/analytics/pro/h;->l(Ljava/lang/String;Lorg/json/JSONObject;Lcom/umeng/analytics/pro/h$a;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 61
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 62
    :catchall_1
    :cond_0
    return-void
.end method

.method public static synthetic q(Lcom/umeng/analytics/pro/d;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/umeng/analytics/pro/d;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic r()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/d;->q:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic s(Lcom/umeng/analytics/pro/d;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/umeng/analytics/pro/d;->f:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/umeng/analytics/pro/d;->f:I

    .line 6
    .line 7
    return v0
.end method

.method public static synthetic t()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/umeng/analytics/pro/d;->p:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic u(Lcom/umeng/analytics/pro/d;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/umeng/analytics/pro/d;->e:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/umeng/analytics/pro/d;->e:I

    .line 6
    .line 7
    return v0
.end method


# virtual methods
.method public final c(Landroid/app/Activity;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/d;->m:Lcom/umeng/analytics/MobclickAgent$PageMode;

    .line 2
    .line 3
    sget-object v1, Lcom/umeng/analytics/MobclickAgent$PageMode;->a:Lcom/umeng/analytics/MobclickAgent$PageMode;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    if-eqz p1, :cond_3

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, "."

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, p0, Lcom/umeng/analytics/pro/d;->g:Li2/b;

    .line 39
    .line 40
    invoke-interface {v1, v0}, Li2/b;->a(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-boolean v1, p0, Lcom/umeng/analytics/pro/d;->c:Z

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    iput-boolean v1, p0, Lcom/umeng/analytics/pro/d;->c:Z

    .line 49
    .line 50
    sget-object v1, Lcom/umeng/analytics/pro/d;->i:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    sget-object v1, Lcom/umeng/analytics/pro/d;->i:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_3

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/d;->j(Landroid/app/Activity;)V

    .line 67
    .line 68
    .line 69
    sget-object p1, Lcom/umeng/analytics/pro/d;->q:Ljava/lang/Object;

    .line 70
    .line 71
    monitor-enter p1

    .line 72
    :try_start_0
    invoke-static {}, Lcom/umeng/analytics/a;->b()Lcom/umeng/analytics/a;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Lcom/umeng/analytics/a;->m()V

    .line 77
    .line 78
    .line 79
    monitor-exit p1

    .line 80
    return-void

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    throw v0

    .line 84
    :cond_1
    sput-object v0, Lcom/umeng/analytics/pro/d;->i:Ljava/lang/String;

    .line 85
    .line 86
    return-void

    .line 87
    :cond_2
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/d;->j(Landroid/app/Activity;)V

    .line 88
    .line 89
    .line 90
    sget-object p1, Lcom/umeng/analytics/pro/d;->q:Ljava/lang/Object;

    .line 91
    .line 92
    monitor-enter p1

    .line 93
    :try_start_1
    invoke-static {}, Lcom/umeng/analytics/a;->b()Lcom/umeng/analytics/a;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Lcom/umeng/analytics/a;->m()V

    .line 98
    .line 99
    .line 100
    monitor-exit p1

    .line 101
    return-void

    .line 102
    :catchall_1
    move-exception v0

    .line 103
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    throw v0

    .line 105
    :cond_3
    :goto_0
    return-void
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/umeng/analytics/pro/d;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public i()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/umeng/analytics/pro/d;->b:Z

    .line 3
    .line 4
    sget-object v0, Lcom/umeng/analytics/pro/d;->l:Landroid/app/Application;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/umeng/analytics/pro/d;->l:Landroid/app/Application;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/umeng/analytics/pro/d;->h:Landroid/app/Application$ActivityLifecycleCallbacks;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    sput-object v0, Lcom/umeng/analytics/pro/d;->l:Landroid/app/Application;

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final j(Landroid/app/Activity;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "."

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    sput-object p1, Lcom/umeng/analytics/pro/d;->i:Ljava/lang/String;

    .line 30
    .line 31
    iget-object p1, p0, Lcom/umeng/analytics/pro/d;->a:Ljava/util/Map;

    .line 32
    .line 33
    monitor-enter p1

    .line 34
    :try_start_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/d;->a:Ljava/util/Map;

    .line 35
    .line 36
    sget-object v1, Lcom/umeng/analytics/pro/d;->i:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    monitor-exit p1

    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    throw v0
.end method

.method public k(Landroid/content/Context;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/d;->q:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lcom/umeng/analytics/pro/d;->p:Z

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    sput-boolean v1, Lcom/umeng/analytics/pro/d;->p:Z

    .line 10
    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    invoke-static {p1}, Lv2/b;->s(Landroid/content/Context;)Landroid/app/Activity;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const-string p1, "MobclickRT"

    .line 19
    .line 20
    const-string v0, "--->>> init\u89e6\u53d1onResume: \u65e0\u524d\u53f0Activity\uff0c\u76f4\u63a5\u9000\u51fa\u3002"

    .line 21
    .line 22
    invoke-static {p1, v0}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "MobclickRT"

    .line 31
    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v3, "--->>> init\u89e6\u53d1onResume: \u8865\u6551\u6210\u529f\uff0c\u524d\u53f0Activity\u540d\uff1a"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v1, v0}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/d;->c(Landroid/app/Activity;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    :try_start_1
    const-string p1, "MobclickRT"

    .line 59
    .line 60
    const-string v1, "--->>> init\u89e6\u53d1onResume: firstResumeCall = false\uff0c\u76f4\u63a5\u8fd4\u56de\u3002"

    .line 61
    .line 62
    invoke-static {p1, v1}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    monitor-exit v0

    .line 66
    return-void

    .line 67
    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    throw p1
.end method

.method public n()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/d;->o(Landroid/app/Activity;)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/d;->i()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final o(Landroid/app/Activity;)V
    .locals 7

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/d;->a:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 4
    :try_start_1
    sget-object v1, Lcom/umeng/analytics/pro/d;->i:Ljava/lang/String;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v2, "."

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sput-object p1, Lcom/umeng/analytics/pro/d;->i:Ljava/lang/String;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_2

    .line 43
    :cond_0
    :goto_0
    sget-object p1, Lcom/umeng/analytics/pro/d;->i:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_1

    .line 50
    .line 51
    iget-object p1, p0, Lcom/umeng/analytics/pro/d;->a:Ljava/util/Map;

    .line 52
    .line 53
    sget-object v1, Lcom/umeng/analytics/pro/d;->i:Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    iget-object p1, p0, Lcom/umeng/analytics/pro/d;->a:Ljava/util/Map;

    .line 62
    .line 63
    sget-object v1, Lcom/umeng/analytics/pro/d;->i:Ljava/lang/String;

    .line 64
    .line 65
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Ljava/lang/Long;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide v1

    .line 75
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 76
    .line 77
    .line 78
    move-result-wide v3

    .line 79
    sub-long/2addr v3, v1

    .line 80
    iget-object p1, p0, Lcom/umeng/analytics/pro/d;->a:Ljava/util/Map;

    .line 81
    .line 82
    sget-object v5, Lcom/umeng/analytics/pro/d;->i:Ljava/lang/String;

    .line 83
    .line 84
    invoke-interface {p1, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    const-wide/16 v1, 0x0

    .line 89
    .line 90
    move-wide v3, v1

    .line 91
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    :try_start_2
    sget-object p1, Lcom/umeng/analytics/pro/d;->k:Ljava/lang/Object;

    .line 93
    .line 94
    monitor-enter p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 95
    :try_start_3
    new-instance v0, Lorg/json/JSONObject;

    .line 96
    .line 97
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v5, "page_name"

    .line 101
    .line 102
    sget-object v6, Lcom/umeng/analytics/pro/d;->i:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 105
    .line 106
    .line 107
    const-string v5, "duration"

    .line 108
    .line 109
    invoke-virtual {v0, v5, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 110
    .line 111
    .line 112
    const-string v3, "page_start"

    .line 113
    .line 114
    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    const-string v1, "type"

    .line 118
    .line 119
    const/4 v2, 0x0

    .line 120
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 121
    .line 122
    .line 123
    sget-object v1, Lcom/umeng/analytics/pro/d;->j:Lorg/json/JSONArray;

    .line 124
    .line 125
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 126
    .line 127
    .line 128
    :catchall_1
    :try_start_4
    monitor-exit p1

    .line 129
    goto :goto_3

    .line 130
    :catchall_2
    move-exception v0

    .line 131
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 132
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 133
    :goto_2
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 134
    :try_start_7
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 135
    :catchall_3
    :goto_3
    return-void
.end method

.method public final v()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/umeng/analytics/pro/d;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/umeng/analytics/pro/d;->b:Z

    .line 7
    .line 8
    sget-object v0, Lcom/umeng/analytics/pro/d;->l:Landroid/app/Application;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/umeng/analytics/pro/d;->l:Landroid/app/Application;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/umeng/analytics/pro/d;->h:Landroid/app/Application$ActivityLifecycleCallbacks;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
