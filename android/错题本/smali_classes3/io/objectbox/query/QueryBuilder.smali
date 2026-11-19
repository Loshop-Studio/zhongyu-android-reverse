.class public Lio/objectbox/query/QueryBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/objectbox/query/QueryBuilder$Operator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Closeable;"
    }
.end annotation


# instance fields
.field public final a:Lio/objectbox/a;

.field public b:J

.field public c:J

.field public d:Lio/objectbox/query/QueryBuilder$Operator;


# direct methods
.method public constructor <init>(Lio/objectbox/a;JLjava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lio/objectbox/query/QueryBuilder$Operator;->NONE:Lio/objectbox/query/QueryBuilder$Operator;

    .line 5
    .line 6
    iput-object v0, p0, Lio/objectbox/query/QueryBuilder;->d:Lio/objectbox/query/QueryBuilder$Operator;

    .line 7
    .line 8
    iput-object p1, p0, Lio/objectbox/query/QueryBuilder;->a:Lio/objectbox/a;

    .line 9
    .line 10
    invoke-direct {p0, p2, p3, p4}, Lio/objectbox/query/QueryBuilder;->nativeCreate(JLjava/lang/String;)J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iput-wide p1, p0, Lio/objectbox/query/QueryBuilder;->b:J

    .line 15
    .line 16
    const-wide/16 p3, 0x0

    .line 17
    .line 18
    cmp-long p1, p1, p3

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    new-instance p1, Lio/objectbox/exception/DbException;

    .line 24
    .line 25
    const-string p2, "Could not create native query builder"

    .line 26
    .line 27
    invoke-direct {p1, p2}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1
.end method

.method private native nativeBuild(J)J
.end method

.method private native nativeCombine(JJJZ)J
.end method

.method private native nativeCreate(JLjava/lang/String;)J
.end method

.method private native nativeDestroy(J)V
.end method

.method private native nativeEqual(JILjava/lang/String;Z)J
.end method


# virtual methods
.method public final a()Lio/objectbox/query/Query;
    .locals 6

    .line 1
    iget-wide v0, p0, Lio/objectbox/query/QueryBuilder;->b:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-eqz v4, :cond_2

    .line 8
    .line 9
    iget-object v4, p0, Lio/objectbox/query/QueryBuilder;->d:Lio/objectbox/query/QueryBuilder$Operator;

    .line 10
    .line 11
    sget-object v5, Lio/objectbox/query/QueryBuilder$Operator;->NONE:Lio/objectbox/query/QueryBuilder$Operator;

    .line 12
    .line 13
    if-ne v4, v5, :cond_1

    .line 14
    .line 15
    invoke-direct {p0, v0, v1}, Lio/objectbox/query/QueryBuilder;->nativeBuild(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    cmp-long v2, v0, v2

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    new-instance v2, Lio/objectbox/query/Query;

    .line 24
    .line 25
    iget-object v3, p0, Lio/objectbox/query/QueryBuilder;->a:Lio/objectbox/a;

    .line 26
    .line 27
    invoke-direct {v2, v3, v0, v1}, Lio/objectbox/query/Query;-><init>(Lio/objectbox/a;J)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lio/objectbox/query/QueryBuilder;->close()V

    .line 31
    .line 32
    .line 33
    return-object v2

    .line 34
    :cond_0
    new-instance v0, Lio/objectbox/exception/DbException;

    .line 35
    .line 36
    const-string v1, "Could not create native query"

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v1, "Incomplete logic condition. Use or()/and() between two conditions only."

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v1, "This QueryBuilder has already been closed. Please use a new instance."

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0
.end method

.method public final b(Lio/objectbox/Property;Ljava/lang/String;)V
    .locals 9

    .line 1
    iget-wide v1, p0, Lio/objectbox/query/QueryBuilder;->b:J

    .line 2
    .line 3
    const-wide/16 v3, 0x0

    .line 4
    .line 5
    cmp-long v3, v1, v3

    .line 6
    .line 7
    if-eqz v3, :cond_2

    .line 8
    .line 9
    invoke-virtual {p1}, Lio/objectbox/Property;->getId()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v5, 0x0

    .line 14
    move-object v0, p0

    .line 15
    move-object v4, p2

    .line 16
    invoke-direct/range {v0 .. v5}, Lio/objectbox/query/QueryBuilder;->nativeEqual(JILjava/lang/String;Z)J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    iget-object v1, p0, Lio/objectbox/query/QueryBuilder;->d:Lio/objectbox/query/QueryBuilder$Operator;

    .line 21
    .line 22
    sget-object v8, Lio/objectbox/query/QueryBuilder$Operator;->NONE:Lio/objectbox/query/QueryBuilder$Operator;

    .line 23
    .line 24
    if-eq v1, v8, :cond_1

    .line 25
    .line 26
    sget-object v2, Lio/objectbox/query/QueryBuilder$Operator;->OR:Lio/objectbox/query/QueryBuilder$Operator;

    .line 27
    .line 28
    if-ne v1, v2, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    :goto_0
    move v7, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const/4 v1, 0x0

    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-wide v1, p0, Lio/objectbox/query/QueryBuilder;->b:J

    .line 36
    .line 37
    iget-wide v3, p0, Lio/objectbox/query/QueryBuilder;->c:J

    .line 38
    .line 39
    move-object v0, p0

    .line 40
    invoke-direct/range {v0 .. v7}, Lio/objectbox/query/QueryBuilder;->nativeCombine(JJJZ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    iput-wide v1, p0, Lio/objectbox/query/QueryBuilder;->c:J

    .line 45
    .line 46
    iput-object v8, p0, Lio/objectbox/query/QueryBuilder;->d:Lio/objectbox/query/QueryBuilder$Operator;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    iput-wide v5, p0, Lio/objectbox/query/QueryBuilder;->c:J

    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v2, "This QueryBuilder has already been closed. Please use a new instance."

    .line 55
    .line 56
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v1
.end method

.method public final declared-synchronized close()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lio/objectbox/query/QueryBuilder;->b:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v4, v0, v2

    .line 7
    .line 8
    if-eqz v4, :cond_0

    .line 9
    .line 10
    iput-wide v2, p0, Lio/objectbox/query/QueryBuilder;->b:J

    .line 11
    .line 12
    invoke-direct {p0, v0, v1}, Lio/objectbox/query/QueryBuilder;->nativeDestroy(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v0
.end method

.method public final finalize()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/objectbox/query/QueryBuilder;->close()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
