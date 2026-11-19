.class public Lcom/tendcloud/dot/DotActivityLifeCycleManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;
    }
.end annotation


# static fields
.field private static a:Lcom/tendcloud/dot/DotActivityLifeCycleManager;


# instance fields
.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
.end method

.method private a()[Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->b:Ljava/util/ArrayList;

    .line 3
    .line 4
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    iget-object v2, p0, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-lez v2, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v2

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v1

    .line 23
    return-object v0

    .line 24
    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    :try_start_2
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 26
    :catchall_1
    move-exception v1

    .line 27
    invoke-static {v1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public static declared-synchronized getInstance()Lcom/tendcloud/dot/DotActivityLifeCycleManager;
    .locals 2

    .line 1
    const-class v0, Lcom/tendcloud/dot/DotActivityLifeCycleManager;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->a:Lcom/tendcloud/dot/DotActivityLifeCycleManager;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/tendcloud/dot/DotActivityLifeCycleManager;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/tendcloud/dot/DotActivityLifeCycleManager;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->a:Lcom/tendcloud/dot/DotActivityLifeCycleManager;

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
    sget-object v1, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->a:Lcom/tendcloud/dot/DotActivityLifeCycleManager;
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
.method public dispatchActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->a()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    array-length v2, v0

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    aget-object v2, v0, v1

    .line 12
    .line 13
    check-cast v2, Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;

    .line 14
    .line 15
    invoke-interface {v2, p1, p2}, Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;->onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    return-void

    .line 24
    :goto_1
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public dispatchActivityDestroyed(Landroid/app/Activity;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->a()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    array-length v2, v0

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    aget-object v2, v0, v1

    .line 12
    .line 13
    check-cast v2, Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;

    .line 14
    .line 15
    invoke-interface {v2, p1}, Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;->onActivityDestroyed(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    return-void

    .line 24
    :goto_1
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public dispatchActivityPaused(Landroid/app/Activity;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->a()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    array-length v2, v0

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    aget-object v2, v0, v1

    .line 12
    .line 13
    check-cast v2, Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;

    .line 14
    .line 15
    invoke-interface {v2, p1}, Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;->onActivityPaused(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    return-void

    .line 24
    :goto_1
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public dispatchActivityResumed(Landroid/app/Activity;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->a()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    array-length v2, v0

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    aget-object v2, v0, v1

    .line 12
    .line 13
    check-cast v2, Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;

    .line 14
    .line 15
    invoke-interface {v2, p1}, Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;->onActivityResumed(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    return-void

    .line 24
    :goto_1
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public dispatchActivityStarted(Landroid/app/Activity;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->a()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    array-length v2, v0

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    aget-object v2, v0, v1

    .line 12
    .line 13
    check-cast v2, Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;

    .line 14
    .line 15
    invoke-interface {v2, p1}, Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;->onActivityStarted(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    return-void

    .line 24
    :goto_1
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public dispatchActivityStopped(Landroid/app/Activity;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->a()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    array-length v2, v0

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    aget-object v2, v0, v1

    .line 12
    .line 13
    check-cast v2, Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;

    .line 14
    .line 15
    invoke-interface {v2, p1}, Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;->onActivityStopped(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    return-void

    .line 24
    :goto_1
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public registerDotActivityLifecycleCallbacks(Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->b:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
.end method

.method public unregisterDotActivityLifecycleCallbacks(Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->b:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
.end method
