.class public abstract Landroidx/room/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/room/h0$f;,
        Landroidx/room/h0$e;,
        Landroidx/room/h0$b;,
        Landroidx/room/h0$d;,
        Landroidx/room/h0$a;,
        Landroidx/room/h0$c;
    }
.end annotation


# instance fields
.field protected volatile a:Ls0/b;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private b:Ljava/util/concurrent/Executor;

.field private c:Ljava/util/concurrent/Executor;

.field private d:Ls0/c;

.field private final e:Landroidx/room/o;

.field private f:Z

.field g:Z

.field protected h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/room/h0$b;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private final i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field private j:Landroidx/room/a;

.field private final k:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
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
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Landroidx/room/h0;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 3
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Landroidx/room/h0;->k:Ljava/lang/ThreadLocal;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 5
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Landroidx/room/h0;->l:Ljava/util/Map;

    .line 6
    invoke-virtual {p0}, Landroidx/room/h0;->g()Landroidx/room/o;

    move-result-object v0

    iput-object v0, p0, Landroidx/room/h0;->e:Landroidx/room/o;

    .line 7
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/room/h0;->m:Ljava/util/Map;

    return-void
.end method

.method private B(Ljava/lang/Class;Ls0/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ls0/c;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    .line 2
    :cond_0
    instance-of v0, p2, Landroidx/room/j;

    if-eqz v0, :cond_1

    .line 3
    check-cast p2, Landroidx/room/j;

    invoke-interface {p2}, Landroidx/room/j;->getDelegate()Ls0/c;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Landroidx/room/h0;->B(Ljava/lang/Class;Ls0/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public static synthetic a(Landroidx/room/h0;Ls0/b;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/room/h0;->w(Ls0/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/room/h0;Ls0/b;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/room/h0;->x(Ls0/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private r()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/room/h0;->c()V

    .line 2
    iget-object v0, p0, Landroidx/room/h0;->d:Ls0/c;

    invoke-interface {v0}, Ls0/c;->F()Ls0/b;

    move-result-object v0

    .line 3
    iget-object v1, p0, Landroidx/room/h0;->e:Landroidx/room/o;

    invoke-virtual {v1, v0}, Landroidx/room/o;->r(Ls0/b;)V

    .line 4
    invoke-interface {v0}, Ls0/b;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    invoke-interface {v0}, Ls0/b;->A()V

    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {v0}, Ls0/b;->f()V

    :goto_0
    return-void
.end method

.method private s()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/h0;->d:Ls0/c;

    invoke-interface {v0}, Ls0/c;->F()Ls0/b;

    move-result-object v0

    invoke-interface {v0}, Ls0/b;->e()V

    .line 2
    invoke-virtual {p0}, Landroidx/room/h0;->p()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/room/h0;->e:Landroidx/room/o;

    invoke-virtual {v0}, Landroidx/room/o;->j()V

    :cond_0
    return-void
.end method

.method private static u()Z
    .locals 2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private synthetic w(Ls0/b;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Landroidx/room/h0;->r()V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic x(Ls0/b;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Landroidx/room/h0;->s()V

    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public A()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/room/h0;->d:Ls0/c;

    invoke-interface {v0}, Ls0/c;->F()Ls0/b;

    move-result-object v0

    invoke-interface {v0}, Ls0/b;->x()V

    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/room/h0;->f:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Landroidx/room/h0;->u()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access database on the main thread since it may potentially lock the UI for a long period of time."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/room/h0;->p()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/room/h0;->k:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access database on a different coroutine context inherited from a suspending transaction."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public e()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/room/h0;->c()V

    .line 2
    iget-object v0, p0, Landroidx/room/h0;->j:Landroidx/room/a;

    if-nez v0, :cond_0

    .line 3
    invoke-direct {p0}, Landroidx/room/h0;->r()V

    goto :goto_0

    .line 4
    :cond_0
    new-instance v1, Lp0/h;

    invoke-direct {v1, p0}, Lp0/h;-><init>(Landroidx/room/h0;)V

    invoke-virtual {v0, v1}, Landroidx/room/a;->c(Lj/a;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public f(Ljava/lang/String;)Ls0/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/room/h0;->c()V

    .line 2
    invoke-virtual {p0}, Landroidx/room/h0;->d()V

    .line 3
    iget-object v0, p0, Landroidx/room/h0;->d:Ls0/c;

    invoke-interface {v0}, Ls0/c;->F()Ls0/b;

    move-result-object v0

    invoke-interface {v0, p1}, Ls0/b;->j(Ljava/lang/String;)Ls0/f;

    move-result-object p1

    return-object p1
.end method

.method protected abstract g()Landroidx/room/o;
.end method

.method protected abstract h(Landroidx/room/i;)Ls0/c;
.end method

.method public i()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/room/h0;->j:Landroidx/room/a;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Landroidx/room/h0;->s()V

    goto :goto_0

    .line 3
    :cond_0
    new-instance v1, Lp0/i;

    invoke-direct {v1, p0}, Lp0/i;-><init>(Landroidx/room/h0;)V

    invoke-virtual {v0, v1}, Landroidx/room/a;->c(Lj/a;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method j()Ljava/util/concurrent/locks/Lock;
    .locals 1

    iget-object v0, p0, Landroidx/room/h0;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    return-object v0
.end method

.method public k()Landroidx/room/o;
    .locals 1

    iget-object v0, p0, Landroidx/room/h0;->e:Landroidx/room/o;

    return-object v0
.end method

.method public l()Ls0/c;
    .locals 1

    iget-object v0, p0, Landroidx/room/h0;->d:Ls0/c;

    return-object v0
.end method

.method public m()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Landroidx/room/h0;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method protected n()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public o()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Landroidx/room/h0;->c:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public p()Z
    .locals 1

    iget-object v0, p0, Landroidx/room/h0;->d:Ls0/c;

    invoke-interface {v0}, Ls0/c;->F()Ls0/b;

    move-result-object v0

    invoke-interface {v0}, Ls0/b;->p()Z

    move-result v0

    return v0
.end method

.method public q(Landroidx/room/i;)V
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Landroidx/room/h0;->h(Landroidx/room/i;)Ls0/c;

    move-result-object v0

    iput-object v0, p0, Landroidx/room/h0;->d:Ls0/c;

    .line 2
    const-class v1, Landroidx/room/k0;

    invoke-direct {p0, v1, v0}, Landroidx/room/h0;->B(Ljava/lang/Class;Ls0/c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/room/k0;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Landroidx/room/k0;->d(Landroidx/room/i;)V

    .line 4
    :cond_0
    const-class v0, Landroidx/room/f;

    iget-object v1, p0, Landroidx/room/h0;->d:Ls0/c;

    .line 5
    invoke-direct {p0, v0, v1}, Landroidx/room/h0;->B(Ljava/lang/Class;Ls0/c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/room/f;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0}, Landroidx/room/f;->a()Landroidx/room/a;

    move-result-object v0

    iput-object v0, p0, Landroidx/room/h0;->j:Landroidx/room/a;

    .line 7
    iget-object v1, p0, Landroidx/room/h0;->e:Landroidx/room/o;

    invoke-virtual {v1, v0}, Landroidx/room/o;->m(Landroidx/room/a;)V

    .line 8
    :cond_1
    iget-object v0, p1, Landroidx/room/i;->h:Landroidx/room/h0$c;

    sget-object v1, Landroidx/room/h0$c;->c:Landroidx/room/h0$c;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, Landroidx/room/h0;->d:Ls0/c;

    invoke-interface {v1, v0}, Ls0/c;->setWriteAheadLoggingEnabled(Z)V

    .line 10
    iget-object v1, p1, Landroidx/room/i;->e:Ljava/util/List;

    iput-object v1, p0, Landroidx/room/h0;->h:Ljava/util/List;

    .line 11
    iget-object v1, p1, Landroidx/room/i;->i:Ljava/util/concurrent/Executor;

    iput-object v1, p0, Landroidx/room/h0;->b:Ljava/util/concurrent/Executor;

    .line 12
    new-instance v1, Landroidx/room/m0;

    iget-object v3, p1, Landroidx/room/i;->j:Ljava/util/concurrent/Executor;

    invoke-direct {v1, v3}, Landroidx/room/m0;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v1, p0, Landroidx/room/h0;->c:Ljava/util/concurrent/Executor;

    .line 13
    iget-boolean v1, p1, Landroidx/room/i;->g:Z

    iput-boolean v1, p0, Landroidx/room/h0;->f:Z

    .line 14
    iput-boolean v0, p0, Landroidx/room/h0;->g:Z

    .line 15
    iget-boolean v0, p1, Landroidx/room/i;->k:Z

    if-eqz v0, :cond_3

    .line 16
    iget-object v0, p0, Landroidx/room/h0;->e:Landroidx/room/o;

    iget-object v1, p1, Landroidx/room/i;->b:Landroid/content/Context;

    iget-object v3, p1, Landroidx/room/i;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Landroidx/room/o;->n(Landroid/content/Context;Ljava/lang/String;)V

    .line 17
    :cond_3
    invoke-virtual {p0}, Landroidx/room/h0;->n()Ljava/util/Map;

    move-result-object v0

    .line 18
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    .line 19
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 20
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    .line 21
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Class;

    .line 22
    iget-object v6, p1, Landroidx/room/i;->f:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    sub-int/2addr v6, v2

    :goto_2
    if-ltz v6, :cond_6

    .line 23
    iget-object v7, p1, Landroidx/room/i;->f:Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 24
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 25
    invoke-virtual {v1, v6}, Ljava/util/BitSet;->set(I)V

    goto :goto_3

    :cond_5
    add-int/lit8 v6, v6, -0x1

    goto :goto_2

    :cond_6
    const/4 v6, -0x1

    :goto_3
    if-ltz v6, :cond_7

    .line 26
    iget-object v7, p0, Landroidx/room/h0;->m:Ljava/util/Map;

    iget-object v8, p1, Landroidx/room/i;->f:Ljava/util/List;

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 27
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "A required type converter ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is missing in the database configuration."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 29
    :cond_8
    iget-object v0, p1, Landroidx/room/i;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v2

    :goto_4
    if-ltz v0, :cond_a

    .line 30
    invoke-virtual {v1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-eqz v2, :cond_9

    add-int/lit8 v0, v0, -0x1

    goto :goto_4

    .line 31
    :cond_9
    iget-object p1, p1, Landroidx/room/i;->f:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    .line 32
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected type converter "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    return-void
.end method

.method protected t(Ls0/b;)V
    .locals 1

    iget-object v0, p0, Landroidx/room/h0;->e:Landroidx/room/o;

    invoke-virtual {v0, p1}, Landroidx/room/o;->g(Ls0/b;)V

    return-void
.end method

.method public v()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/h0;->j:Landroidx/room/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroidx/room/a;->g()Z

    move-result v0

    return v0

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/room/h0;->a:Ls0/b;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0}, Ls0/b;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public y(Ls0/e;)Landroid/database/Cursor;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/room/h0;->z(Ls0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public z(Ls0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/room/h0;->c()V

    .line 2
    invoke-virtual {p0}, Landroidx/room/h0;->d()V

    if-eqz p2, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/room/h0;->d:Ls0/c;

    invoke-interface {v0}, Ls0/c;->F()Ls0/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ls0/b;->E(Ls0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    iget-object p2, p0, Landroidx/room/h0;->d:Ls0/c;

    invoke-interface {p2}, Ls0/c;->F()Ls0/b;

    move-result-object p2

    invoke-interface {p2, p1}, Ls0/b;->D(Ls0/e;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method
