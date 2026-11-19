.class public abstract Lu6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/ArrayList;

.field public static final b:Ljava/util/ArrayList;

.field public static final c:Ljava/util/ArrayList;

.field public static final d:Ljava/util/ArrayList;

.field public static e:Lcom/luck/picture/lib/entity/LocalMediaFolder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu6/a;->a:Ljava/util/ArrayList;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lu6/a;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lu6/a;->c:Ljava/util/ArrayList;

    .line 21
    .line 22
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lu6/a;->d:Ljava/util/ArrayList;

    .line 28
    .line 29
    return-void
.end method

.method public static a(Ljava/util/List;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lu6/a;->e()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lu6/a;->d:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public static b(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lu6/a;->f()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lu6/a;->c:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public static declared-synchronized c(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 2

    .line 1
    const-class v0, Lu6/a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lu6/a;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw p0
.end method

.method public static d(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    invoke-static {}, Lu6/a;->g()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lu6/a;->b:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static e()V
    .locals 2

    .line 1
    sget-object v0, Lu6/a;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static f()V
    .locals 2

    .line 1
    sget-object v0, Lu6/a;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static g()V
    .locals 2

    .line 1
    sget-object v0, Lu6/a;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static declared-synchronized h()V
    .locals 3

    .line 1
    const-class v0, Lu6/a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lu6/a;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-lez v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
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
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v1
.end method

.method public static i()Ljava/util/ArrayList;
    .locals 1

    .line 1
    sget-object v0, Lu6/a;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public static j()Lcom/luck/picture/lib/entity/LocalMediaFolder;
    .locals 1

    .line 1
    sget-object v0, Lu6/a;->e:Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 2
    .line 3
    return-object v0
.end method

.method public static k()Ljava/util/ArrayList;
    .locals 1

    .line 1
    sget-object v0, Lu6/a;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public static l()I
    .locals 1

    .line 1
    sget-object v0, Lu6/a;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static m()Ljava/util/ArrayList;
    .locals 1

    .line 1
    sget-object v0, Lu6/a;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public static declared-synchronized n()Ljava/util/ArrayList;
    .locals 2

    .line 1
    const-class v0, Lu6/a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lu6/a;->a:Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    throw v1
.end method

.method public static o()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lu6/a;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_0
    const-string v0, ""

    .line 22
    .line 23
    return-object v0
.end method

.method public static p(Lcom/luck/picture/lib/entity/LocalMediaFolder;)V
    .locals 0

    .line 1
    sput-object p0, Lu6/a;->e:Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 2
    .line 3
    return-void
.end method
