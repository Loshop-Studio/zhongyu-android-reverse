.class public Lcom/tendcloud/tenddata/fw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lcom/tendcloud/tenddata/fi;

.field private static d:Lcom/tendcloud/tenddata/fl;

.field private static e:Lcom/tendcloud/tenddata/fp;

.field private static f:Lcom/tendcloud/tenddata/fm;

.field private static volatile h:Lcom/tendcloud/tenddata/fw;


# instance fields
.field public a:Lorg/json/JSONObject;

.field public b:Lorg/json/JSONObject;

.field private g:Lcom/tendcloud/tenddata/ft;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tendcloud/tenddata/fp;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tendcloud/tenddata/fp;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tendcloud/tenddata/fw;->e:Lcom/tendcloud/tenddata/fp;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput-object v0, Lcom/tendcloud/tenddata/fw;->f:Lcom/tendcloud/tenddata/fm;

    .line 10
    .line 11
    sput-object v0, Lcom/tendcloud/tenddata/fw;->h:Lcom/tendcloud/tenddata/fw;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tendcloud/tenddata/fw;->a:Lorg/json/JSONObject;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tendcloud/tenddata/fw;->b:Lorg/json/JSONObject;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/tendcloud/tenddata/fw;->g:Lcom/tendcloud/tenddata/ft;

    .line 10
    .line 11
    return-void
.end method

.method public static b()Lcom/tendcloud/tenddata/fw;
    .locals 2

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/fw;->h:Lcom/tendcloud/tenddata/fw;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/tendcloud/tenddata/fw;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/fw;->h:Lcom/tendcloud/tenddata/fw;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/tendcloud/tenddata/fw;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/tendcloud/tenddata/fw;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/tendcloud/tenddata/fw;->h:Lcom/tendcloud/tenddata/fw;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_2
    sget-object v0, Lcom/tendcloud/tenddata/fw;->h:Lcom/tendcloud/tenddata/fw;

    .line 27
    .line 28
    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(Lcom/tendcloud/tenddata/fh;Z)Lorg/json/JSONObject;
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, Lcom/tendcloud/tenddata/fw;->a(Lcom/tendcloud/tenddata/fh;ZLcom/tendcloud/tenddata/a;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized a(Lcom/tendcloud/tenddata/fh;ZLcom/tendcloud/tenddata/a;)Lorg/json/JSONObject;
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/tendcloud/tenddata/fw;->a(Lcom/tendcloud/tenddata/fh;ZLcom/tendcloud/tenddata/a;Landroid/util/Pair;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized a(Lcom/tendcloud/tenddata/fh;ZLcom/tendcloud/tenddata/a;Landroid/util/Pair;)Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tendcloud/tenddata/fh;",
            "Z",
            "Lcom/tendcloud/tenddata/a;",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Lorg/json/JSONArray;",
            ">;)",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    monitor-enter p0

    if-eqz p1, :cond_a

    .line 3
    :try_start_0
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 4
    :cond_0
    const-class v0, Landroid/util/EventLogTags;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 5
    :try_start_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 6
    :try_start_2
    invoke-static {}, Lcom/tendcloud/tenddata/du;->a()Lcom/tendcloud/tenddata/du;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tendcloud/tenddata/du;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/tendcloud/tenddata/cg;->getFileLock(Ljava/lang/String;)V

    .line 7
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    iput-object v2, p0, Lcom/tendcloud/tenddata/fw;->a:Lorg/json/JSONObject;

    .line 8
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    iput-object v2, p0, Lcom/tendcloud/tenddata/fw;->b:Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 9
    :try_start_3
    sget-object v2, Lcom/tendcloud/tenddata/fw;->c:Lcom/tendcloud/tenddata/fi;

    if-nez v2, :cond_1

    .line 10
    invoke-static {}, Lcom/tendcloud/tenddata/fi;->a()Lcom/tendcloud/tenddata/fi;

    move-result-object v2

    sput-object v2, Lcom/tendcloud/tenddata/fw;->c:Lcom/tendcloud/tenddata/fi;

    .line 11
    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 12
    sget-object v3, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v3, v2}, Lcom/tendcloud/tenddata/fv;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 13
    sget-object v3, Lcom/tendcloud/tenddata/fw;->c:Lcom/tendcloud/tenddata/fi;

    invoke-virtual {v3, v2}, Lcom/tendcloud/tenddata/fi;->setUniqueId(Ljava/lang/String;)V

    .line 14
    :cond_1
    sget-object v2, Lcom/tendcloud/tenddata/fw;->c:Lcom/tendcloud/tenddata/fi;

    invoke-virtual {v2, p3}, Lcom/tendcloud/tenddata/fi;->setSubmitAppId(Lcom/tendcloud/tenddata/a;)V

    .line 15
    sget-object v2, Lcom/tendcloud/tenddata/fw;->c:Lcom/tendcloud/tenddata/fi;

    invoke-virtual {v2, p3}, Lcom/tendcloud/tenddata/fi;->setSubmitChannelId(Lcom/tendcloud/tenddata/a;)V

    .line 16
    sget-object p3, Lcom/tendcloud/tenddata/fw;->e:Lcom/tendcloud/tenddata/fp;

    if-nez p3, :cond_2

    .line 17
    new-instance p3, Lcom/tendcloud/tenddata/fp;

    invoke-direct {p3}, Lcom/tendcloud/tenddata/fp;-><init>()V

    sput-object p3, Lcom/tendcloud/tenddata/fw;->e:Lcom/tendcloud/tenddata/fp;

    .line 18
    :cond_2
    sget-object p3, Lcom/tendcloud/tenddata/fp;->a:Lcom/tendcloud/tenddata/fo;

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/fo;->a()V

    .line 19
    sget-object p3, Lcom/tendcloud/tenddata/fw;->e:Lcom/tendcloud/tenddata/fp;

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/fp;->c()Lcom/tendcloud/tenddata/fn;

    move-result-object p3

    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v2}, Lcom/tendcloud/tenddata/ch;->B(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {p3, v2}, Lcom/tendcloud/tenddata/fn;->setSlots(I)V

    .line 20
    sget-object p3, Lcom/tendcloud/tenddata/fw;->d:Lcom/tendcloud/tenddata/fl;

    if-nez p3, :cond_3

    .line 21
    new-instance p3, Lcom/tendcloud/tenddata/fl;

    invoke-direct {p3}, Lcom/tendcloud/tenddata/fl;-><init>()V

    sput-object p3, Lcom/tendcloud/tenddata/fw;->d:Lcom/tendcloud/tenddata/fl;

    .line 22
    :cond_3
    sget-object p3, Lcom/tendcloud/tenddata/fw;->f:Lcom/tendcloud/tenddata/fm;

    if-nez p3, :cond_4

    .line 23
    new-instance p3, Lcom/tendcloud/tenddata/fm;

    invoke-direct {p3}, Lcom/tendcloud/tenddata/fm;-><init>()V

    sput-object p3, Lcom/tendcloud/tenddata/fw;->f:Lcom/tendcloud/tenddata/fm;

    .line 24
    invoke-virtual {p3}, Lcom/tendcloud/tenddata/fm;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 25
    :catchall_0
    :cond_4
    :try_start_4
    sget-object p3, Lcom/tendcloud/tenddata/fw;->f:Lcom/tendcloud/tenddata/fm;

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/fm;->c()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 26
    :try_start_5
    const-string p3, "version"

    const-string v2, "2.0"

    invoke-virtual {v1, p3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    const-string p3, "action"

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 28
    const-string p1, "device"

    sget-object p3, Lcom/tendcloud/tenddata/fw;->e:Lcom/tendcloud/tenddata/fp;

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {v1, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 29
    const-string p1, "app"

    sget-object p3, Lcom/tendcloud/tenddata/fw;->c:Lcom/tendcloud/tenddata/fi;

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {v1, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    const-string p1, "sdk"

    sget-object p3, Lcom/tendcloud/tenddata/fw;->d:Lcom/tendcloud/tenddata/fl;

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {v1, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 31
    const-string p1, "appContext"

    invoke-static {}, Lcom/tendcloud/tenddata/ff;->a()Lcom/tendcloud/tenddata/ff;

    move-result-object p3

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/ff;->b()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {v1, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    const-string p1, "user"

    sget-object p3, Lcom/tendcloud/tenddata/fw;->f:Lcom/tendcloud/tenddata/fm;

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {v1, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 33
    const-string p1, "sharingFilterPermission"

    sget-object p3, Lcom/tendcloud/tenddata/ab;->v:Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    invoke-virtual {v1, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 35
    const-string p1, "ts"

    invoke-virtual {v1, p1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 36
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    sget-object p3, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 37
    invoke-static {p3}, Lcom/tendcloud/tenddata/fv;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Lcom/tendcloud/tenddata/fw;->e:Lcom/tendcloud/tenddata/fp;

    .line 38
    invoke-virtual {p3}, Lcom/tendcloud/tenddata/fp;->a()Lcom/tendcloud/tenddata/fq;

    move-result-object p3

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/fq;->a()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Lcom/tendcloud/tenddata/fw;->e:Lcom/tendcloud/tenddata/fp;

    .line 39
    invoke-virtual {p3}, Lcom/tendcloud/tenddata/fp;->a()Lcom/tendcloud/tenddata/fq;

    move-result-object p3

    invoke-virtual {p3}, Lcom/tendcloud/tenddata/fq;->c()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 40
    invoke-static {p1}, Lcom/tendcloud/tenddata/cq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 41
    const-string p3, "fingerprint"

    invoke-virtual {v1, p3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p2, :cond_7

    .line 42
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    .line 43
    new-instance p2, Lcom/tendcloud/tenddata/ft;

    sget-object p3, Lcom/tendcloud/tenddata/fu;->a:Lcom/tendcloud/tenddata/fu;

    invoke-direct {p2, p3}, Lcom/tendcloud/tenddata/ft;-><init>(Lcom/tendcloud/tenddata/fu;)V

    .line 44
    invoke-virtual {p2}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 45
    iget-object p2, p0, Lcom/tendcloud/tenddata/fw;->g:Lcom/tendcloud/tenddata/ft;

    if-nez p2, :cond_5

    .line 46
    new-instance p2, Lcom/tendcloud/tenddata/ft;

    sget-object p3, Lcom/tendcloud/tenddata/fu;->b:Lcom/tendcloud/tenddata/fu;

    invoke-direct {p2, p3}, Lcom/tendcloud/tenddata/ft;-><init>(Lcom/tendcloud/tenddata/fu;)V

    iput-object p2, p0, Lcom/tendcloud/tenddata/fw;->g:Lcom/tendcloud/tenddata/ft;

    .line 47
    :cond_5
    iget-object p2, p0, Lcom/tendcloud/tenddata/fw;->g:Lcom/tendcloud/tenddata/ft;

    invoke-virtual {p2}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 48
    :try_start_6
    sget-object p2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string p3, "android.permission.BLUETOOTH"

    invoke-static {p2, p3}, Lcom/tendcloud/tenddata/cq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 49
    new-instance p2, Lcom/tendcloud/tenddata/ft;

    sget-object p3, Lcom/tendcloud/tenddata/fu;->c:Lcom/tendcloud/tenddata/fu;

    invoke-direct {p2, p3}, Lcom/tendcloud/tenddata/ft;-><init>(Lcom/tendcloud/tenddata/fu;)V

    .line 50
    invoke-virtual {p2}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 51
    :catchall_1
    :cond_6
    :try_start_7
    const-string p2, "networks"

    invoke-virtual {v1, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 52
    invoke-static {}, Lcom/tendcloud/tenddata/du;->a()Lcom/tendcloud/tenddata/du;

    move-result-object p1

    const-string p2, "Location"

    invoke-virtual {p1, p2}, Lcom/tendcloud/tenddata/du;->a(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 53
    new-instance p2, Lcom/tendcloud/tenddata/fj;

    invoke-direct {p2}, Lcom/tendcloud/tenddata/fj;-><init>()V

    .line 54
    const-string p3, "locations"

    invoke-virtual {p2}, Lcom/tendcloud/tenddata/fj;->b()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v1, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 55
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result p2

    if-lez p2, :cond_7

    .line 56
    const-string p2, "Location"

    invoke-virtual {p0, p2, p1}, Lcom/tendcloud/tenddata/fw;->a(Ljava/lang/String;Lorg/json/JSONArray;)V

    :cond_7
    if-eqz p4, :cond_8

    .line 57
    iget-object p1, p4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lorg/json/JSONArray;

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result p1

    if-lez p1, :cond_8

    .line 58
    iget-object p1, p4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, p4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p2, Lorg/json/JSONArray;

    invoke-virtual {p0, p1, p2}, Lcom/tendcloud/tenddata/fw;->a(Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 59
    :cond_8
    sget-boolean p1, Lcom/tendcloud/tenddata/ab;->q:Z

    if-nez p1, :cond_9

    .line 60
    const-string p1, "cloudcontrol"

    iget-object p2, p0, Lcom/tendcloud/tenddata/fw;->a:Lorg/json/JSONObject;

    invoke-virtual {v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 61
    :cond_9
    invoke-static {}, Lcom/tendcloud/tenddata/du;->a()Lcom/tendcloud/tenddata/du;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/du;->c()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 62
    :catchall_2
    :try_start_8
    invoke-static {}, Lcom/tendcloud/tenddata/du;->a()Lcom/tendcloud/tenddata/du;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/du;->b()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lcom/tendcloud/tenddata/cg;->releaseFileLock(Ljava/lang/String;)V

    goto :goto_1

    :catchall_3
    move-exception p1

    goto :goto_2

    :catchall_4
    invoke-static {}, Lcom/tendcloud/tenddata/du;->a()Lcom/tendcloud/tenddata/du;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/du;->b()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 63
    :goto_1
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    monitor-exit p0

    return-object v1

    .line 64
    :goto_2
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :try_start_a
    throw p1

    :catchall_5
    move-exception p1

    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    throw p1

    .line 65
    :cond_a
    :goto_3
    monitor-exit p0

    const/4 p1, 0x0

    return-object p1
.end method

.method public a()V
    .locals 1

    .line 66
    sget-object v0, Lcom/tendcloud/tenddata/fw;->f:Lcom/tendcloud/tenddata/fm;

    if-eqz v0, :cond_0

    .line 67
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/fm;->d()V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;Lorg/json/JSONArray;)V
    .locals 1

    .line 68
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/ab;->q:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 69
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/fw;->a:Lorg/json/JSONObject;

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 70
    iget-object v0, p0, Lcom/tendcloud/tenddata/fw;->a:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method
