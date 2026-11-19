.class public final Lm/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm/j;
.implements Lh0/a$f;


# static fields
.field public static final e:Landroidx/core/util/Pools$Pool;


# instance fields
.field public final a:Lh0/c;

.field public b:Lm/j;

.field public c:Z

.field public d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lm/i$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lm/i$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    invoke-static {v1, v0}, Lh0/a;->d(ILh0/a$d;)Landroidx/core/util/Pools$Pool;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lm/i;->e:Landroidx/core/util/Pools$Pool;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lh0/c;->a()Lh0/c;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lm/i;->a:Lh0/c;

    .line 9
    .line 10
    return-void
.end method

.method public static c(Lm/j;)Lm/i;
    .locals 1

    .line 1
    sget-object v0, Lm/i;->e:Landroidx/core/util/Pools$Pool;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/core/util/Pools$Pool;->acquire()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lm/i;

    .line 8
    .line 9
    invoke-static {v0}, Lg0/i;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lm/i;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Lm/i;->a(Lm/j;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method


# virtual methods
.method public final a(Lm/j;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lm/i;->d:Z

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lm/i;->c:Z

    .line 6
    .line 7
    iput-object p1, p0, Lm/i;->b:Lm/j;

    .line 8
    .line 9
    return-void
.end method

.method public b()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/i;->b:Lm/j;

    .line 2
    .line 3
    invoke-interface {v0}, Lm/j;->b()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lm/i;->b:Lm/j;

    .line 3
    .line 4
    sget-object v0, Lm/i;->e:Landroidx/core/util/Pools$Pool;

    .line 5
    .line 6
    invoke-interface {v0, p0}, Landroidx/core/util/Pools$Pool;->release(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public e()Lh0/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/i;->a:Lh0/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public declared-synchronized f()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lm/i;->a:Lh0/c;

    .line 3
    .line 4
    invoke-virtual {v0}, Lh0/c;->c()V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lm/i;->c:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lm/i;->c:Z

    .line 13
    .line 14
    iget-boolean v0, p0, Lm/i;->d:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lm/i;->recycle()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :cond_0
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v1, "Already unlocked"

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    monitor-exit p0

    .line 33
    throw v0
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/i;->b:Lm/j;

    .line 2
    .line 3
    invoke-interface {v0}, Lm/j;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lm/i;->b:Lm/j;

    .line 2
    .line 3
    invoke-interface {v0}, Lm/j;->getSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public declared-synchronized recycle()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lm/i;->a:Lh0/c;

    .line 3
    .line 4
    invoke-virtual {v0}, Lh0/c;->c()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lm/i;->d:Z

    .line 9
    .line 10
    iget-boolean v0, p0, Lm/i;->c:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lm/i;->b:Lm/j;

    .line 15
    .line 16
    invoke-interface {v0}, Lm/j;->recycle()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lm/i;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :cond_0
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    monitor-exit p0

    .line 26
    throw v0
.end method
