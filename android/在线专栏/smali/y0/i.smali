.class public Ly0/i;
.super Lx0/w;
.source "SourceFile"


# static fields
.field private static final k:Ljava/lang/String;

.field private static l:Ly0/i;

.field private static m:Ly0/i;

.field private static final n:Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lx0/b;

.field private c:Landroidx/work/impl/WorkDatabase;

.field private d:Lh1/a;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly0/e;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ly0/d;

.field private g:Lg1/f;

.field private h:Z

.field private i:Landroid/content/BroadcastReceiver$PendingResult;

.field private volatile j:Li1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkManagerImpl"

    .line 1
    invoke-static {v0}, Lx0/n;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ly0/i;->k:Ljava/lang/String;

    const/4 v0, 0x0

    .line 2
    sput-object v0, Ly0/i;->l:Ly0/i;

    .line 3
    sput-object v0, Ly0/i;->m:Ly0/i;

    .line 4
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ly0/i;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lx0/b;Lh1/a;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lx0/s;->a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Ly0/i;-><init>(Landroid/content/Context;Lx0/b;Lh1/a;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lx0/b;Lh1/a;Landroidx/work/impl/WorkDatabase;)V
    .locals 10

    .line 7
    invoke-direct {p0}, Lx0/w;-><init>()V

    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 9
    new-instance v1, Lx0/n$a;

    invoke-virtual {p2}, Lx0/b;->i()I

    move-result v2

    invoke-direct {v1, v2}, Lx0/n$a;-><init>(I)V

    invoke-static {v1}, Lx0/n;->e(Lx0/n;)V

    .line 10
    invoke-virtual {p0, v0, p2, p3}, Ly0/i;->j(Landroid/content/Context;Lx0/b;Lh1/a;)Ljava/util/List;

    move-result-object v0

    .line 11
    new-instance v9, Ly0/d;

    move-object v3, v9

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object v8, v0

    invoke-direct/range {v3 .. v8}, Ly0/d;-><init>(Landroid/content/Context;Lx0/b;Lh1/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    move-object v3, p0

    .line 12
    invoke-direct/range {v3 .. v9}, Ly0/i;->v(Landroid/content/Context;Lx0/b;Lh1/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Ly0/d;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lx0/b;Lh1/a;Z)V
    .locals 2

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 4
    invoke-interface {p3}, Lh1/a;->c()Lg1/i;

    move-result-object v1

    .line 5
    invoke-static {v0, v1, p4}, Landroidx/work/impl/WorkDatabase;->C(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Landroidx/work/impl/WorkDatabase;

    move-result-object p4

    .line 6
    invoke-direct {p0, p1, p2, p3, p4}, Ly0/i;-><init>(Landroid/content/Context;Lx0/b;Lh1/a;Landroidx/work/impl/WorkDatabase;)V

    return-void
.end method

.method private D()V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    :try_start_0
    const-class v2, Landroidx/work/multiprocess/RemoteWorkManagerClient;

    sget v3, Landroidx/work/multiprocess/RemoteWorkManagerClient;->g:I

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/Class;

    .line 2
    const-class v5, Landroid/content/Context;

    aput-object v5, v4, v0

    const-class v5, Ly0/i;

    aput-object v5, v4, v1

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Ly0/i;->a:Landroid/content/Context;

    aput-object v4, v3, v0

    aput-object p0, v3, v1

    .line 3
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li1/a;

    iput-object v2, p0, Ly0/i;->j:Li1/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 4
    invoke-static {}, Lx0/n;->c()Lx0/n;

    move-result-object v3

    sget-object v4, Ly0/i;->k:Ljava/lang/String;

    new-array v1, v1, [Ljava/lang/Throwable;

    aput-object v2, v1, v0

    const-string v0, "Unable to initialize multi-process support"

    invoke-virtual {v3, v4, v0, v1}, Lx0/n;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static g(Landroid/content/Context;Lx0/b;)V
    .locals 4

    .line 1
    sget-object v0, Ly0/i;->n:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Ly0/i;->l:Ly0/i;

    if-eqz v1, :cond_1

    sget-object v2, Ly0/i;->m:Ly0/i;

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    if-nez v1, :cond_3

    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 5
    sget-object v1, Ly0/i;->m:Ly0/i;

    if-nez v1, :cond_2

    .line 6
    new-instance v1, Ly0/i;

    new-instance v2, Lh1/b;

    .line 7
    invoke-virtual {p1}, Lx0/b;->k()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-direct {v2, v3}, Lh1/b;-><init>(Ljava/util/concurrent/Executor;)V

    invoke-direct {v1, p0, p1, v2}, Ly0/i;-><init>(Landroid/content/Context;Lx0/b;Lh1/a;)V

    sput-object v1, Ly0/i;->m:Ly0/i;

    .line 8
    :cond_2
    sget-object p0, Ly0/i;->m:Ly0/i;

    sput-object p0, Ly0/i;->l:Ly0/i;

    .line 9
    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static m()Ly0/i;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    sget-object v0, Ly0/i;->n:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Ly0/i;->l:Ly0/i;

    if-eqz v1, :cond_0

    .line 3
    monitor-exit v0

    return-object v1

    .line 4
    :cond_0
    sget-object v1, Ly0/i;->m:Ly0/i;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static n(Landroid/content/Context;)Ly0/i;
    .locals 2

    .line 1
    sget-object v0, Ly0/i;->n:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-static {}, Ly0/i;->m()Ly0/i;

    move-result-object v1

    if-nez v1, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 4
    instance-of v1, p0, Lx0/b$b;

    if-eqz v1, :cond_0

    .line 5
    move-object v1, p0

    check-cast v1, Lx0/b$b;

    .line 6
    invoke-interface {v1}, Lx0/b$b;->a()Lx0/b;

    move-result-object v1

    .line 7
    invoke-static {p0, v1}, Ly0/i;->g(Landroid/content/Context;Lx0/b;)V

    .line 8
    invoke-static {p0}, Ly0/i;->n(Landroid/content/Context;)Ly0/i;

    move-result-object v1

    goto :goto_0

    .line 9
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 10
    :cond_1
    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private v(Landroid/content/Context;Lx0/b;Lh1/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Ly0/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lx0/b;",
            "Lh1/a;",
            "Landroidx/work/impl/WorkDatabase;",
            "Ljava/util/List<",
            "Ly0/e;",
            ">;",
            "Ly0/d;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 2
    iput-object p1, p0, Ly0/i;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Ly0/i;->b:Lx0/b;

    .line 4
    iput-object p3, p0, Ly0/i;->d:Lh1/a;

    .line 5
    iput-object p4, p0, Ly0/i;->c:Landroidx/work/impl/WorkDatabase;

    .line 6
    iput-object p5, p0, Ly0/i;->e:Ljava/util/List;

    .line 7
    iput-object p6, p0, Ly0/i;->f:Ly0/d;

    .line 8
    new-instance p2, Lg1/f;

    invoke-direct {p2, p4}, Lg1/f;-><init>(Landroidx/work/impl/WorkDatabase;)V

    iput-object p2, p0, Ly0/i;->g:Lg1/f;

    const/4 p2, 0x0

    .line 9
    iput-boolean p2, p0, Ly0/i;->h:Z

    .line 10
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x18

    if-lt p2, p3, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->isDeviceProtectedStorage()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot initialize WorkManager in direct boot mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_1
    :goto_0
    iget-object p2, p0, Ly0/i;->d:Lh1/a;

    new-instance p3, Landroidx/work/impl/utils/ForceStopRunnable;

    invoke-direct {p3, p1, p0}, Landroidx/work/impl/utils/ForceStopRunnable;-><init>(Landroid/content/Context;Ly0/i;)V

    invoke-interface {p2, p3}, Lh1/a;->b(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/String;Landroidx/work/WorkerParameters$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly0/i;->d:Lh1/a;

    new-instance v1, Lg1/j;

    invoke-direct {v1, p0, p1, p2}, Lg1/j;-><init>(Ly0/i;Ljava/lang/String;Landroidx/work/WorkerParameters$a;)V

    .line 2
    invoke-interface {v0, v1}, Lh1/a;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public B(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Ly0/i;->d:Lh1/a;

    new-instance v1, Lg1/l;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lg1/l;-><init>(Ly0/i;Ljava/lang/String;Z)V

    invoke-interface {v0, v1}, Lh1/a;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public C(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Ly0/i;->d:Lh1/a;

    new-instance v1, Lg1/l;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lg1/l;-><init>(Ly0/i;Ljava/lang/String;Z)V

    invoke-interface {v0, v1}, Lh1/a;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a()Lx0/q;
    .locals 2

    .line 1
    invoke-static {p0}, Lg1/a;->b(Ly0/i;)Lg1/a;

    move-result-object v0

    .line 2
    iget-object v1, p0, Ly0/i;->d:Lh1/a;

    invoke-interface {v1, v0}, Lh1/a;->b(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {v0}, Lg1/a;->f()Lx0/q;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/util/UUID;)Lx0/q;
    .locals 1

    .line 1
    invoke-static {p1, p0}, Lg1/a;->c(Ljava/util/UUID;Ly0/i;)Lg1/a;

    move-result-object p1

    .line 2
    iget-object v0, p0, Ly0/i;->d:Lh1/a;

    invoke-interface {v0, p1}, Lh1/a;->b(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {p1}, Lg1/a;->f()Lx0/q;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/util/List;)Lx0/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lx0/y;",
            ">;)",
            "Lx0/q;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ly0/g;

    invoke-direct {v0, p0, p1}, Ly0/g;-><init>(Ly0/i;Ljava/util/List;)V

    invoke-virtual {v0}, Ly0/g;->a()Lx0/q;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "enqueue needs at least one WorkRequest."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Ljava/util/UUID;)Landroidx/lifecycle/LiveData;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            ")",
            "Landroidx/lifecycle/LiveData<",
            "Lx0/v;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ly0/i;->c:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->M()Lf1/s;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Lf1/s;->n(Ljava/util/List;)Landroidx/lifecycle/LiveData;

    move-result-object p1

    .line 3
    new-instance v0, Ly0/i$a;

    invoke-direct {v0, p0}, Ly0/i$a;-><init>(Ly0/i;)V

    iget-object v1, p0, Ly0/i;->d:Lh1/a;

    invoke-static {p1, v0, v1}, Lg1/d;->a(Landroidx/lifecycle/LiveData;Lj/a;Lh1/a;)Landroidx/lifecycle/LiveData;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/String;)Lx0/q;
    .locals 1

    .line 1
    invoke-static {p1, p0}, Lg1/a;->e(Ljava/lang/String;Ly0/i;)Lg1/a;

    move-result-object p1

    .line 2
    iget-object v0, p0, Ly0/i;->d:Lh1/a;

    invoke-interface {v0, p1}, Lh1/a;->b(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {p1}, Lg1/a;->f()Lx0/q;

    move-result-object p1

    return-object p1
.end method

.method public i(Ljava/lang/String;)Lx0/q;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-static {p1, p0, v0}, Lg1/a;->d(Ljava/lang/String;Ly0/i;Z)Lg1/a;

    move-result-object p1

    .line 2
    iget-object v0, p0, Ly0/i;->d:Lh1/a;

    invoke-interface {v0, p1}, Lh1/a;->b(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {p1}, Lg1/a;->f()Lx0/q;

    move-result-object p1

    return-object p1
.end method

.method public j(Landroid/content/Context;Lx0/b;Lh1/a;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lx0/b;",
            "Lh1/a;",
            ")",
            "Ljava/util/List<",
            "Ly0/e;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Ly0/e;

    .line 1
    invoke-static {p1, p0}, Ly0/f;->a(Landroid/content/Context;Ly0/i;)Ly0/e;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lz0/b;

    invoke-direct {v1, p1, p2, p3, p0}, Lz0/b;-><init>(Landroid/content/Context;Lx0/b;Lh1/a;Ly0/i;)V

    const/4 p1, 0x1

    aput-object v1, v0, p1

    .line 2
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public k()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Ly0/i;->a:Landroid/content/Context;

    return-object v0
.end method

.method public l()Lx0/b;
    .locals 1

    iget-object v0, p0, Ly0/i;->b:Lx0/b;

    return-object v0
.end method

.method public o()Lg1/f;
    .locals 1

    iget-object v0, p0, Ly0/i;->g:Lg1/f;

    return-object v0
.end method

.method public p()Ly0/d;
    .locals 1

    iget-object v0, p0, Ly0/i;->f:Ly0/d;

    return-object v0
.end method

.method public q()Li1/a;
    .locals 3

    .line 1
    iget-object v0, p0, Ly0/i;->j:Li1/a;

    if-nez v0, :cond_2

    .line 2
    sget-object v0, Ly0/i;->n:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Ly0/i;->j:Li1/a;

    if-nez v1, :cond_1

    .line 4
    invoke-direct {p0}, Ly0/i;->D()V

    .line 5
    iget-object v1, p0, Ly0/i;->j:Li1/a;

    if-nez v1, :cond_1

    iget-object v1, p0, Ly0/i;->b:Lx0/b;

    .line 6
    invoke-virtual {v1}, Lx0/b;->b()Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library"

    .line 8
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 9
    :cond_1
    :goto_0
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 10
    :cond_2
    :goto_1
    iget-object v0, p0, Ly0/i;->j:Li1/a;

    return-object v0
.end method

.method public r()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly0/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly0/i;->e:Ljava/util/List;

    return-object v0
.end method

.method public s()Landroidx/work/impl/WorkDatabase;
    .locals 1

    iget-object v0, p0, Ly0/i;->c:Landroidx/work/impl/WorkDatabase;

    return-object v0
.end method

.method public t(Lx0/x;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/x;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/util/List<",
            "Lx0/v;",
            ">;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lg1/k;->a(Ly0/i;Lx0/x;)Lg1/k;

    move-result-object p1

    .line 2
    iget-object v0, p0, Ly0/i;->d:Lh1/a;

    invoke-interface {v0}, Lh1/a;->c()Lg1/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg1/i;->execute(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {p1}, Lg1/k;->b()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public u()Lh1/a;
    .locals 1

    iget-object v0, p0, Ly0/i;->d:Lh1/a;

    return-object v0
.end method

.method public w()V
    .locals 2

    .line 1
    sget-object v0, Ly0/i;->n:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    iput-boolean v1, p0, Ly0/i;->h:Z

    .line 3
    iget-object v1, p0, Ly0/i;->i:Landroid/content/BroadcastReceiver$PendingResult;

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Ly0/i;->i:Landroid/content/BroadcastReceiver$PendingResult;

    .line 6
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public x()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Ly0/i;->k()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, La1/b;->a(Landroid/content/Context;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Ly0/i;->s()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->M()Lf1/s;

    move-result-object v0

    invoke-interface {v0}, Lf1/s;->v()I

    .line 4
    invoke-virtual {p0}, Ly0/i;->l()Lx0/b;

    move-result-object v0

    invoke-virtual {p0}, Ly0/i;->s()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {p0}, Ly0/i;->r()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v1, v2}, Ly0/f;->b(Lx0/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void
.end method

.method public y(Landroid/content/BroadcastReceiver$PendingResult;)V
    .locals 2

    .line 1
    sget-object v0, Ly0/i;->n:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iput-object p1, p0, Ly0/i;->i:Landroid/content/BroadcastReceiver$PendingResult;

    .line 3
    iget-boolean v1, p0, Ly0/i;->h:Z

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Ly0/i;->i:Landroid/content/BroadcastReceiver$PendingResult;

    .line 6
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public z(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ly0/i;->A(Ljava/lang/String;Landroidx/work/WorkerParameters$a;)V

    return-void
.end method
