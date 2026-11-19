.class public final Le/q/d/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/q/d/c$a;,
        Le/q/d/c$b;
    }
.end annotation


# static fields
.field public static final h:Le/q/d/c;

.field public static final i:Ljava/util/logging/Logger;

.field public static final j:Le/q/d/c;


# instance fields
.field public a:I

.field public b:Z

.field public c:J

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/q/d/b;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/q/d/b;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/lang/Runnable;

.field public final g:Le/q/d/c$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Le/q/d/c;

    new-instance v1, Le/q/d/c$b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Le/q/b;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " TaskRunner"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "name"

    .line 1
    invoke-static {v2, v3}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Le/q/a;

    const/4 v4, 0x1

    invoke-direct {v3, v2, v4}, Le/q/a;-><init>(Ljava/lang/String;Z)V

    .line 2
    invoke-direct {v1, v3}, Le/q/d/c$b;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    invoke-direct {v0, v1}, Le/q/d/c;-><init>(Le/q/d/c$a;)V

    sput-object v0, Le/q/d/c;->h:Le/q/d/c;

    const-class v0, Le/q/d/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    const-string v1, "Logger.getLogger(TaskRunner::class.java.name)"

    invoke-static {v0, v1}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Le/q/d/c;->i:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Le/q/d/c$a;)V
    .locals 1

    const-string v0, "backend"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/q/d/c;->g:Le/q/d/c$a;

    const/16 p1, 0x2710

    iput p1, p0, Le/q/d/c;->a:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Le/q/d/c;->d:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Le/q/d/c;->e:Ljava/util/List;

    new-instance p1, Le/q/d/c$c;

    invoke-direct {p1, p0}, Le/q/d/c$c;-><init>(Le/q/d/c;)V

    iput-object p1, p0, Le/q/d/c;->f:Ljava/lang/Runnable;

    return-void
.end method

.method public static final a(Le/q/d/c;Le/q/d/a;)V
    .locals 5

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Le/q/b;->a:[B

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    const-string v1, "currentThread"

    invoke-static {v0, v1}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    .line 2
    iget-object v2, p1, Le/q/d/a;->c:Ljava/lang/String;

    .line 3
    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, Le/q/d/a;->a()J

    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0, p1, v2, v3}, Le/q/d/c;->b(Le/q/d/a;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :catchall_1
    move-exception v2

    monitor-enter p0

    const-wide/16 v3, -0x1

    :try_start_2
    invoke-virtual {p0, p1, v3, v4}, Le/q/d/c;->b(Le/q/d/a;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    monitor-exit p0

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    throw v2

    :catchall_2
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final b(Le/q/d/a;J)V
    .locals 11

    sget-object v0, Le/q/b;->a:[B

    .line 1
    iget-object v0, p1, Le/q/d/a;->a:Le/q/d/b;

    .line 2
    invoke-static {v0}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    .line 3
    iget-object v1, v0, Le/q/d/b;->a:Le/q/d/a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v1, p1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-eqz v1, :cond_d

    .line 4
    iget-boolean v1, v0, Le/q/d/b;->c:Z

    .line 5
    iput-boolean v3, v0, Le/q/d/b;->c:Z

    const/4 v4, 0x0

    .line 6
    iput-object v4, v0, Le/q/d/b;->a:Le/q/d/a;

    .line 7
    iget-object v4, p0, Le/q/d/c;->d:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const-wide/16 v4, -0x1

    cmp-long v4, p2, v4

    if-eqz v4, :cond_b

    if-nez v1, :cond_b

    const-string v1, "task"

    .line 8
    invoke-static {p1, v1}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "queue"

    .line 9
    invoke-static {v0, v1}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Le/q/d/a;->a:Le/q/d/b;

    if-ne v1, v0, :cond_1

    goto :goto_2

    :cond_1
    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    move v1, v3

    :goto_1
    if-eqz v1, :cond_a

    iput-object v0, p1, Le/q/d/a;->a:Le/q/d/b;

    .line 10
    :goto_2
    iget-object v1, v0, Le/q/d/b;->d:Le/q/d/c;

    .line 11
    iget-object v1, v1, Le/q/d/c;->g:Le/q/d/c$a;

    .line 12
    invoke-interface {v1}, Le/q/d/c$a;->d()J

    move-result-wide v4

    add-long v6, v4, p2

    iget-object v1, v0, Le/q/d/b;->b:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    const/4 v8, -0x1

    if-eq v1, v8, :cond_4

    .line 13
    iget-wide v9, p1, Le/q/d/a;->b:J

    cmp-long v9, v9, v6

    if-gtz v9, :cond_3

    .line 14
    sget-object p2, Le/q/d/c;->i:Ljava/util/logging/Logger;

    .line 15
    sget-object p3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {p2, p3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result p2

    if-eqz p2, :cond_b

    const-string p2, "already scheduled"

    invoke-static {p1, v0, p2}, Lb/c/a/a;->a(Le/q/d/a;Le/q/d/b;Ljava/lang/String;)V

    goto/16 :goto_6

    :cond_3
    iget-object v9, v0, Le/q/d/b;->b:Ljava/util/List;

    invoke-interface {v9, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 16
    :cond_4
    iput-wide v6, p1, Le/q/d/a;->b:J

    .line 17
    sget-object v1, Le/q/d/c;->i:Ljava/util/logging/Logger;

    .line 18
    sget-object v9, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v1, v9}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "run again after "

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-long/2addr v6, v4

    invoke-static {v6, v7}, Lb/c/a/a;->j(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lb/c/a/a;->a(Le/q/d/a;Le/q/d/b;Ljava/lang/String;)V

    :cond_5
    iget-object v1, v0, Le/q/d/b;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v6, v3

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Le/q/d/a;

    .line 19
    iget-wide v9, v7, Le/q/d/a;->b:J

    sub-long/2addr v9, v4

    cmp-long v7, v9, p2

    if-lez v7, :cond_6

    move v7, v2

    goto :goto_4

    :cond_6
    move v7, v3

    :goto_4
    if-eqz v7, :cond_7

    goto :goto_5

    :cond_7
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_8
    move v6, v8

    :goto_5
    if-ne v6, v8, :cond_9

    .line 20
    iget-object p2, v0, Le/q/d/b;->b:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6

    :cond_9
    iget-object p2, v0, Le/q/d/b;->b:Ljava/util/List;

    invoke-interface {p2, v6, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_6

    .line 21
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "task is in multiple queues"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :cond_b
    :goto_6
    iget-object p1, v0, Le/q/d/b;->b:Ljava/util/List;

    .line 23
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v2

    if-eqz p1, :cond_c

    iget-object p1, p0, Le/q/d/c;->e:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    return-void

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()Le/q/d/a;
    .locals 14

    sget-object v0, Le/q/b;->a:[B

    :goto_0
    iget-object v0, p0, Le/q/d/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Le/q/d/c;->g:Le/q/d/c$a;

    invoke-interface {v0}, Le/q/d/c$a;->d()J

    move-result-wide v2

    const-wide v4, 0x7fffffffffffffffL

    iget-object v0, p0, Le/q/d/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v6, v1

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v7, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Le/q/d/b;

    .line 1
    iget-object v7, v7, Le/q/d/b;->b:Ljava/util/List;

    .line 2
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Le/q/d/a;

    .line 3
    iget-wide v10, v7, Le/q/d/a;->b:J

    sub-long/2addr v10, v2

    const-wide/16 v12, 0x0

    .line 4
    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    cmp-long v12, v10, v12

    if-lez v12, :cond_1

    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    goto :goto_1

    :cond_1
    if-eqz v6, :cond_2

    move v0, v8

    goto :goto_2

    :cond_2
    move-object v6, v7

    goto :goto_1

    :cond_3
    move v0, v9

    :goto_2
    if-eqz v6, :cond_6

    .line 5
    sget-object v1, Le/q/b;->a:[B

    const-wide/16 v1, -0x1

    .line 6
    iput-wide v1, v6, Le/q/d/a;->b:J

    .line 7
    iget-object v1, v6, Le/q/d/a;->a:Le/q/d/b;

    .line 8
    invoke-static {v1}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    .line 9
    iget-object v2, v1, Le/q/d/b;->b:Ljava/util/List;

    .line 10
    invoke-interface {v2, v6}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v2, p0, Le/q/d/c;->e:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 11
    iput-object v6, v1, Le/q/d/b;->a:Le/q/d/a;

    .line 12
    iget-object v2, p0, Le/q/d/c;->d:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-nez v0, :cond_4

    .line 13
    iget-boolean v0, p0, Le/q/d/c;->b:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Le/q/d/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v8

    if-eqz v0, :cond_5

    :cond_4
    iget-object v0, p0, Le/q/d/c;->g:Le/q/d/c$a;

    iget-object v1, p0, Le/q/d/c;->f:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Le/q/d/c$a;->c(Ljava/lang/Runnable;)V

    :cond_5
    return-object v6

    :cond_6
    iget-boolean v0, p0, Le/q/d/c;->b:Z

    if-eqz v0, :cond_8

    iget-wide v6, p0, Le/q/d/c;->c:J

    sub-long/2addr v6, v2

    cmp-long v0, v4, v6

    if-gez v0, :cond_7

    iget-object v0, p0, Le/q/d/c;->g:Le/q/d/c$a;

    invoke-interface {v0, p0}, Le/q/d/c$a;->a(Le/q/d/c;)V

    :cond_7
    return-object v1

    :cond_8
    iput-boolean v8, p0, Le/q/d/c;->b:Z

    add-long/2addr v2, v4

    iput-wide v2, p0, Le/q/d/c;->c:J

    :try_start_0
    iget-object v0, p0, Le/q/d/c;->g:Le/q/d/c$a;

    invoke-interface {v0, p0, v4, v5}, Le/q/d/c$a;->b(Le/q/d/c;J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_3
    iput-boolean v9, p0, Le/q/d/c;->b:Z

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_4

    :catch_0
    :try_start_1
    invoke-virtual {p0}, Le/q/d/c;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_4
    iput-boolean v9, p0, Le/q/d/c;->b:Z

    throw v0
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Le/q/d/c;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    iget-object v1, p0, Le/q/d/c;->d:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/q/d/b;

    invoke-virtual {v1}, Le/q/d/b;->a()Z

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le/q/d/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ltz v0, :cond_2

    iget-object v1, p0, Le/q/d/c;->e:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/q/d/b;

    invoke-virtual {v1}, Le/q/d/b;->a()Z

    .line 1
    iget-object v1, v1, Le/q/d/b;->b:Ljava/util/List;

    .line 2
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Le/q/d/c;->e:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_2
    return-void
.end method
