.class public Lio/objectbox/relation/ToOne;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TARGET:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field public final c:Ljava/lang/Object;

.field public final d:Lio/objectbox/relation/RelationInfo;

.field public final e:Z

.field public transient f:Lio/objectbox/BoxStore;

.field public transient g:Ljc/a;

.field public volatile transient h:Ljc/a;

.field public transient i:Ljava/lang/reflect/Field;

.field public j:Ljava/lang/Object;

.field public k:J

.field public volatile l:J

.field public m:Z

.field public n:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lio/objectbox/relation/ToOne;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lio/objectbox/relation/ToOne;->d:Lio/objectbox/relation/RelationInfo;

    .line 11
    .line 12
    iget-object p1, p2, Lio/objectbox/relation/RelationInfo;->e:Lio/objectbox/Property;

    .line 13
    .line 14
    iget-boolean p1, p1, Lio/objectbox/Property;->i:Z

    .line 15
    .line 16
    iput-boolean p1, p0, Lio/objectbox/relation/ToOne;->e:Z

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string p2, "No relation info given (null)"

    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    const-string p2, "No source entity given (null)"

    .line 30
    .line 31
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lio/objectbox/relation/ToOne;->l:J

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lio/objectbox/relation/ToOne;->j:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw v0
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->h:Ljc/a;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    invoke-static {}, Lkc/f;->b()Lkc/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lio/objectbox/relation/ToOne;->c:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "__boxStore"

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lkc/f;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :try_start_0
    iget-object v1, p0, Lio/objectbox/relation/ToOne;->c:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lio/objectbox/BoxStore;

    .line 28
    .line 29
    iput-object v0, p0, Lio/objectbox/relation/ToOne;->f:Lio/objectbox/BoxStore;

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-static {}, Lkc/f;->b()Lkc/f;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1, v2}, Lkc/f;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Lio/objectbox/BoxStore;

    .line 52
    .line 53
    iput-object p1, p0, Lio/objectbox/relation/ToOne;->f:Lio/objectbox/BoxStore;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catch_0
    move-exception p1

    .line 57
    goto :goto_2

    .line 58
    :cond_0
    :goto_0
    iget-object p1, p0, Lio/objectbox/relation/ToOne;->f:Lio/objectbox/BoxStore;

    .line 59
    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    new-instance p1, Lio/objectbox/exception/DbDetachedException;

    .line 64
    .line 65
    const-string v0, "Cannot resolve relation for detached entities, call box.attach(entity) beforehand."

    .line 66
    .line 67
    invoke-direct {p1, v0}, Lio/objectbox/exception/DbDetachedException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_2
    :goto_1
    iget-object p1, p0, Lio/objectbox/relation/ToOne;->f:Lio/objectbox/BoxStore;

    .line 72
    .line 73
    invoke-virtual {p1}, Lio/objectbox/BoxStore;->F()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iput-boolean p1, p0, Lio/objectbox/relation/ToOne;->n:Z
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    iget-object p1, p0, Lio/objectbox/relation/ToOne;->f:Lio/objectbox/BoxStore;

    .line 80
    .line 81
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->d:Lio/objectbox/relation/RelationInfo;

    .line 82
    .line 83
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->c:Lio/objectbox/EntityInfo;

    .line 84
    .line 85
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->j()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p1, v0}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iput-object p1, p0, Lio/objectbox/relation/ToOne;->g:Ljc/a;

    .line 94
    .line 95
    iget-object p1, p0, Lio/objectbox/relation/ToOne;->f:Lio/objectbox/BoxStore;

    .line 96
    .line 97
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->d:Lio/objectbox/relation/RelationInfo;

    .line 98
    .line 99
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->d:Lio/objectbox/EntityInfo;

    .line 100
    .line 101
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->j()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {p1, v0}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iput-object p1, p0, Lio/objectbox/relation/ToOne;->h:Ljc/a;

    .line 110
    .line 111
    return-void

    .line 112
    :goto_2
    new-instance v0, Ljava/lang/RuntimeException;

    .line 113
    .line 114
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    throw v0

    .line 118
    :cond_3
    return-void
.end method

.method public d()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToOne;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, v0, v1}, Lio/objectbox/relation/ToOne;->e(J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public e(J)Ljava/lang/Object;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lio/objectbox/relation/ToOne;->l:J

    .line 3
    .line 4
    cmp-long v0, v0, p1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lio/objectbox/relation/ToOne;->j:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-object p1

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, v0}, Lio/objectbox/relation/ToOne;->c(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->h:Ljc/a;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Ljc/a;->c(J)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0, v0, p1, p2}, Lio/objectbox/relation/ToOne;->n(Ljava/lang/Object;J)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    instance-of v0, p1, Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lio/objectbox/relation/ToOne;

    .line 8
    .line 9
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->d:Lio/objectbox/relation/RelationInfo;

    .line 10
    .line 11
    iget-object v2, p1, Lio/objectbox/relation/ToOne;->d:Lio/objectbox/relation/RelationInfo;

    .line 12
    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lio/objectbox/relation/ToOne;->f()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->f()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    cmp-long p1, v2, v4

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_1
    return v1
.end method

.method public f()J
    .locals 4

    .line 1
    iget-boolean v0, p0, Lio/objectbox/relation/ToOne;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Lio/objectbox/relation/ToOne;->k:J

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lio/objectbox/relation/ToOne;->g()Ljava/lang/reflect/Field;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_0
    iget-object v1, p0, Lio/objectbox/relation/ToOne;->c:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Long;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return-wide v0

    .line 27
    :cond_1
    const-wide/16 v0, 0x0

    .line 28
    .line 29
    return-wide v0

    .line 30
    :catch_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 31
    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v3, "Could not access field "

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v1
.end method

.method public final g()Ljava/lang/reflect/Field;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->i:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lkc/f;->b()Lkc/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lio/objectbox/relation/ToOne;->c:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Lio/objectbox/relation/ToOne;->d:Lio/objectbox/relation/RelationInfo;

    .line 16
    .line 17
    iget-object v2, v2, Lio/objectbox/relation/RelationInfo;->e:Lio/objectbox/Property;

    .line 18
    .line 19
    iget-object v2, v2, Lio/objectbox/Property;->g:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Lkc/f;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lio/objectbox/relation/ToOne;->i:Ljava/lang/reflect/Field;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->i:Ljava/lang/reflect/Field;

    .line 28
    .line 29
    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToOne;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    ushr-long v2, v0, v2

    .line 8
    .line 9
    xor-long/2addr v0, v2

    .line 10
    long-to-int v0, v0

    .line 11
    return v0
.end method

.method public k(Lio/objectbox/Cursor;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lio/objectbox/relation/ToOne;->m:Z

    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->j:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lio/objectbox/Cursor;->s(Ljava/lang/Object;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-virtual {p0, v0, v1}, Lio/objectbox/relation/ToOne;->setTargetId(J)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lio/objectbox/relation/ToOne;->j:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {p0, p1, v0, v1}, Lio/objectbox/relation/ToOne;->n(Ljava/lang/Object;J)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public m()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lio/objectbox/relation/ToOne;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->j:Ljava/lang/Object;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/objectbox/relation/ToOne;->f()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public final declared-synchronized n(Ljava/lang/Object;J)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/objectbox/relation/ToOne;->n:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v2, "Setting resolved ToOne target to "

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const-string v2, "null"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const-string v2, "non-null"

    .line 26
    .line 27
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v2, " for ID "

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    iput-wide p2, p0, Lio/objectbox/relation/ToOne;->l:J

    .line 46
    .line 47
    iput-object p1, p0, Lio/objectbox/relation/ToOne;->j:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    monitor-exit p0

    .line 50
    return-void

    .line 51
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    throw p1
.end method

.method public o(Ljava/lang/Object;)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object v2, p0, Lio/objectbox/relation/ToOne;->d:Lio/objectbox/relation/RelationInfo;

    .line 6
    .line 7
    iget-object v2, v2, Lio/objectbox/relation/RelationInfo;->d:Lio/objectbox/EntityInfo;

    .line 8
    .line 9
    invoke-interface {v2}, Lio/objectbox/EntityInfo;->s()Lkc/c;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v2, p1}, Lkc/c;->a(Ljava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    cmp-long v0, v2, v0

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    iput-boolean v0, p0, Lio/objectbox/relation/ToOne;->m:Z

    .line 25
    .line 26
    invoke-virtual {p0, v2, v3}, Lio/objectbox/relation/ToOne;->setTargetId(J)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1, v2, v3}, Lio/objectbox/relation/ToOne;->n(Ljava/lang/Object;J)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    invoke-virtual {p0, v0, v1}, Lio/objectbox/relation/ToOne;->setTargetId(J)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lio/objectbox/relation/ToOne;->a()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public setTargetId(J)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lio/objectbox/relation/ToOne;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-wide p1, p0, Lio/objectbox/relation/ToOne;->k:J

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lio/objectbox/relation/ToOne;->g()Ljava/lang/reflect/Field;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lio/objectbox/relation/ToOne;->c:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    :goto_0
    const-wide/16 v0, 0x0

    .line 22
    .line 23
    cmp-long p1, p1, v0

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    iput-boolean p1, p0, Lio/objectbox/relation/ToOne;->m:Z

    .line 29
    .line 30
    :cond_1
    return-void

    .line 31
    :catch_0
    move-exception p1

    .line 32
    new-instance p2, Ljava/lang/RuntimeException;

    .line 33
    .line 34
    const-string v0, "Could not update to-one ID in entity"

    .line 35
    .line 36
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    throw p2
.end method
