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


# static fields
.field private static final serialVersionUID:J = 0x46ac5c8e2b9cb221L


# instance fields
.field public transient a:Lio/objectbox/BoxStore;

.field public transient b:Lio/objectbox/a;

.field public volatile transient c:Lio/objectbox/a;

.field private checkIdOfTargetForPut:Z

.field public transient d:Ljava/lang/reflect/Field;

.field private debugRelations:Z

.field private final entity:Ljava/lang/Object;

.field private final relationInfo:Lio/objectbox/relation/RelationInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/RelationInfo<",
            "Ljava/lang/Object;",
            "TTARGET;>;"
        }
    .end annotation
.end field

.field private volatile resolvedTargetId:J

.field private target:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TTARGET;"
        }
    .end annotation
.end field

.field private targetId:J

.field private final virtualProperty:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lio/objectbox/relation/RelationInfo<",
            "*TTARGET;>;)V"
        }
    .end annotation

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
    iput-object p1, p0, Lio/objectbox/relation/ToOne;->entity:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lio/objectbox/relation/ToOne;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 11
    .line 12
    iget-object p1, p2, Lio/objectbox/relation/RelationInfo;->targetIdProperty:Lio/objectbox/Property;

    .line 13
    .line 14
    iget-boolean p1, p1, Lio/objectbox/Property;->isVirtual:Z

    .line 15
    .line 16
    iput-boolean p1, p0, Lio/objectbox/relation/ToOne;->virtualProperty:Z

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

.method public static synthetic a(Lio/objectbox/relation/ToOne;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->c:Lio/objectbox/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/objectbox/a;->e(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p0, p1, v0, v1}, Lio/objectbox/relation/ToOne;->d(Ljava/lang/Object;J)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lio/objectbox/relation/ToOne;->b:Lio/objectbox/a;

    .line 11
    .line 12
    iget-object p0, p0, Lio/objectbox/relation/ToOne;->entity:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Lio/objectbox/a;->e(Ljava/lang/Object;)J

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final declared-synchronized b()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lio/objectbox/relation/ToOne;->resolvedTargetId:J

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lio/objectbox/relation/ToOne;->target:Ljava/lang/Object;
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
    .locals 4

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->c:Lio/objectbox/a;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    sget-object v0, Lm5/f;->b:Lm5/f;

    .line 6
    .line 7
    iget-object v1, p0, Lio/objectbox/relation/ToOne;->entity:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "__boxStore"

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Lm5/f;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :try_start_0
    iget-object v3, p0, Lio/objectbox/relation/ToOne;->entity:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lio/objectbox/BoxStore;

    .line 26
    .line 27
    iput-object v1, p0, Lio/objectbox/relation/ToOne;->a:Lio/objectbox/BoxStore;

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1, v2}, Lm5/f;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lio/objectbox/BoxStore;

    .line 46
    .line 47
    iput-object p1, p0, Lio/objectbox/relation/ToOne;->a:Lio/objectbox/BoxStore;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception p1

    .line 51
    goto :goto_2

    .line 52
    :cond_0
    :goto_0
    iget-object p1, p0, Lio/objectbox/relation/ToOne;->a:Lio/objectbox/BoxStore;

    .line 53
    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    new-instance p1, Lio/objectbox/exception/DbDetachedException;

    .line 58
    .line 59
    const-string v0, "Cannot resolve relation for detached entities, call box.attach(entity) beforehand."

    .line 60
    .line 61
    invoke-direct {p1, v0}, Lio/objectbox/exception/DbDetachedException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_2
    :goto_1
    iget-object p1, p0, Lio/objectbox/relation/ToOne;->a:Lio/objectbox/BoxStore;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    iput-boolean p1, p0, Lio/objectbox/relation/ToOne;->debugRelations:Z
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    iget-object p1, p0, Lio/objectbox/relation/ToOne;->a:Lio/objectbox/BoxStore;

    .line 74
    .line 75
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 76
    .line 77
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->sourceInfo:Lio/objectbox/EntityInfo;

    .line 78
    .line 79
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p1, v0}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iput-object p1, p0, Lio/objectbox/relation/ToOne;->b:Lio/objectbox/a;

    .line 88
    .line 89
    iget-object p1, p0, Lio/objectbox/relation/ToOne;->a:Lio/objectbox/BoxStore;

    .line 90
    .line 91
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 92
    .line 93
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 94
    .line 95
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p1, v0}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iput-object p1, p0, Lio/objectbox/relation/ToOne;->c:Lio/objectbox/a;

    .line 104
    .line 105
    return-void

    .line 106
    :goto_2
    new-instance v0, Ljava/lang/RuntimeException;

    .line 107
    .line 108
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    throw v0

    .line 112
    :cond_3
    return-void
.end method

.method public final declared-synchronized d(Ljava/lang/Object;J)V
    .locals 3

    .line 1
    const-string v0, "Setting resolved ToOne target to "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lio/objectbox/relation/ToOne;->debugRelations:Z

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 9
    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const-string v0, "null"

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const-string v0, "non-null"

    .line 23
    .line 24
    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, " for ID "

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iput-wide p2, p0, Lio/objectbox/relation/ToOne;->resolvedTargetId:J

    .line 43
    .line 44
    iput-object p1, p0, Lio/objectbox/relation/ToOne;->target:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    monitor-exit p0

    .line 47
    return-void

    .line 48
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
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
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 10
    .line 11
    iget-object v2, p1, Lio/objectbox/relation/ToOne;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 12
    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lio/objectbox/relation/ToOne;->getTargetId()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->getTargetId()J

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

.method public getCachedTarget()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTARGET;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->target:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEntity()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->entity:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTarget()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTARGET;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToOne;->getTargetId()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lio/objectbox/relation/ToOne;->getTarget(J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getTarget(J)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TTARGET;"
        }
    .end annotation

    .annotation build Lio/objectbox/annotation/apihint/Internal;
    .end annotation

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lio/objectbox/relation/ToOne;->resolvedTargetId:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_0

    .line 4
    iget-object p1, p0, Lio/objectbox/relation/ToOne;->target:Ljava/lang/Object;

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 5
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lio/objectbox/relation/ToOne;->c(Ljava/lang/Object;)V

    .line 7
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->c:Lio/objectbox/a;

    .line 8
    invoke-virtual {v0}, Lio/objectbox/a;->c()Lio/objectbox/Cursor;

    move-result-object v1

    .line 9
    :try_start_1
    invoke-virtual {v1, p1, p2}, Lio/objectbox/Cursor;->get(J)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 10
    invoke-virtual {v0, v1}, Lio/objectbox/a;->h(Lio/objectbox/Cursor;)V

    .line 11
    invoke-virtual {p0, v2, p1, p2}, Lio/objectbox/relation/ToOne;->d(Ljava/lang/Object;J)V

    return-object v2

    :catchall_1
    move-exception p1

    .line 12
    invoke-virtual {v0, v1}, Lio/objectbox/a;->h(Lio/objectbox/Cursor;)V

    .line 13
    throw p1

    .line 14
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public getTargetId()J
    .locals 4

    .line 1
    iget-boolean v0, p0, Lio/objectbox/relation/ToOne;->virtualProperty:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Lio/objectbox/relation/ToOne;->targetId:J

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->d:Ljava/lang/reflect/Field;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    sget-object v0, Lm5/f;->b:Lm5/f;

    .line 13
    .line 14
    iget-object v1, p0, Lio/objectbox/relation/ToOne;->entity:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Lio/objectbox/relation/ToOne;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 21
    .line 22
    iget-object v2, v2, Lio/objectbox/relation/RelationInfo;->targetIdProperty:Lio/objectbox/Property;

    .line 23
    .line 24
    iget-object v2, v2, Lio/objectbox/Property;->name:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Lm5/f;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lio/objectbox/relation/ToOne;->d:Ljava/lang/reflect/Field;

    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->d:Ljava/lang/reflect/Field;

    .line 33
    .line 34
    :try_start_0
    iget-object v1, p0, Lio/objectbox/relation/ToOne;->entity:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/Long;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    return-wide v0

    .line 49
    :cond_2
    const-wide/16 v0, 0x0

    .line 50
    .line 51
    return-wide v0

    .line 52
    :catch_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 53
    .line 54
    new-instance v2, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v3, "Could not access field "

    .line 57
    .line 58
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v1
.end method

.method public hashCode()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToOne;->getTargetId()J

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

.method public internalPutTarget(Lio/objectbox/Cursor;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/Cursor<",
            "TTARGET;>;)V"
        }
    .end annotation

    .annotation build Lio/objectbox/annotation/apihint/Internal;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lio/objectbox/relation/ToOne;->checkIdOfTargetForPut:Z

    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->target:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lio/objectbox/Cursor;->put(Ljava/lang/Object;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-virtual {p0, v0, v1}, Lio/objectbox/relation/ToOne;->setTargetId(J)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lio/objectbox/relation/ToOne;->target:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {p0, p1, v0, v1}, Lio/objectbox/relation/ToOne;->d(Ljava/lang/Object;J)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public internalRequiresPutTarget()Z
    .locals 4
    .annotation build Lio/objectbox/annotation/apihint/Internal;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/objectbox/relation/ToOne;->checkIdOfTargetForPut:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->target:Ljava/lang/Object;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/objectbox/relation/ToOne;->getTargetId()J

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

.method public isNull()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToOne;->getTargetId()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->target:Ljava/lang/Object;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public isResolved()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lio/objectbox/relation/ToOne;->resolvedTargetId:J

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/objectbox/relation/ToOne;->getTargetId()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public isResolvedAndNotNull()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lio/objectbox/relation/ToOne;->resolvedTargetId:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lio/objectbox/relation/ToOne;->resolvedTargetId:J

    .line 10
    .line 11
    invoke-virtual {p0}, Lio/objectbox/relation/ToOne;->getTargetId()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

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

.method public setAndPutTarget(Ljava/lang/Object;)V
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTARGET;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lio/objectbox/relation/ToOne;->c(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    iget-object v2, p0, Lio/objectbox/relation/ToOne;->c:Lio/objectbox/a;

    .line 9
    .line 10
    iget-object v2, v2, Lio/objectbox/a;->e:Lm5/b;

    .line 11
    .line 12
    invoke-interface {v2, p1}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    cmp-long v0, v2, v0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lio/objectbox/relation/ToOne;->setAndPutTargetAlways(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {p0, v2, v3}, Lio/objectbox/relation/ToOne;->setTargetId(J)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1, v2, v3}, Lio/objectbox/relation/ToOne;->d(Ljava/lang/Object;J)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lio/objectbox/relation/ToOne;->b:Lio/objectbox/a;

    .line 31
    .line 32
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->entity:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lio/objectbox/a;->e(Ljava/lang/Object;)J

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-virtual {p0, v0, v1}, Lio/objectbox/relation/ToOne;->setTargetId(J)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lio/objectbox/relation/ToOne;->b()V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lio/objectbox/relation/ToOne;->b:Lio/objectbox/a;

    .line 45
    .line 46
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->entity:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lio/objectbox/a;->e(Ljava/lang/Object;)J

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public setAndPutTargetAlways(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTARGET;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lio/objectbox/relation/ToOne;->c(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->a:Lio/objectbox/BoxStore;

    .line 7
    .line 8
    new-instance v1, Landroidx/camera/core/impl/utils/a;

    .line 9
    .line 10
    const/16 v2, 0x17

    .line 11
    .line 12
    invoke-direct {v1, v2, p0, p1}, Landroidx/camera/core/impl/utils/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->h(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    invoke-virtual {p0, v0, v1}, Lio/objectbox/relation/ToOne;->setTargetId(J)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lio/objectbox/relation/ToOne;->b()V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lio/objectbox/relation/ToOne;->b:Lio/objectbox/a;

    .line 28
    .line 29
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->entity:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lio/objectbox/a;->e(Ljava/lang/Object;)J

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public setAndUpdateTargetId(J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/objectbox/relation/ToOne;->setTargetId(J)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-virtual {p0, p1}, Lio/objectbox/relation/ToOne;->c(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 9
    .line 10
    const-string p2, "Not implemented yet"

    .line 11
    .line 12
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
.end method

.method public setTarget(Ljava/lang/Object;)V
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTARGET;)V"
        }
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object v2, p0, Lio/objectbox/relation/ToOne;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 6
    .line 7
    iget-object v2, v2, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 8
    .line 9
    invoke-interface {v2}, Lio/objectbox/EntityInfo;->getIdGetter()Lm5/b;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v2, p1}, Lm5/b;->getId(Ljava/lang/Object;)J

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
    iput-boolean v0, p0, Lio/objectbox/relation/ToOne;->checkIdOfTargetForPut:Z

    .line 25
    .line 26
    invoke-virtual {p0, v2, v3}, Lio/objectbox/relation/ToOne;->setTargetId(J)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1, v2, v3}, Lio/objectbox/relation/ToOne;->d(Ljava/lang/Object;J)V

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
    invoke-virtual {p0}, Lio/objectbox/relation/ToOne;->b()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public setTargetId(J)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lio/objectbox/relation/ToOne;->virtualProperty:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-wide p1, p0, Lio/objectbox/relation/ToOne;->targetId:J

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->d:Ljava/lang/reflect/Field;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    sget-object v0, Lm5/f;->b:Lm5/f;

    .line 13
    .line 14
    iget-object v1, p0, Lio/objectbox/relation/ToOne;->entity:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Lio/objectbox/relation/ToOne;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 21
    .line 22
    iget-object v2, v2, Lio/objectbox/relation/RelationInfo;->targetIdProperty:Lio/objectbox/Property;

    .line 23
    .line 24
    iget-object v2, v2, Lio/objectbox/Property;->name:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Lm5/f;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lio/objectbox/relation/ToOne;->d:Ljava/lang/reflect/Field;

    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Lio/objectbox/relation/ToOne;->d:Ljava/lang/reflect/Field;

    .line 33
    .line 34
    iget-object v1, p0, Lio/objectbox/relation/ToOne;->entity:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    :goto_0
    const-wide/16 v0, 0x0

    .line 44
    .line 45
    cmp-long p1, p1, v0

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    iput-boolean p1, p0, Lio/objectbox/relation/ToOne;->checkIdOfTargetForPut:Z

    .line 51
    .line 52
    :cond_2
    return-void

    .line 53
    :catch_0
    move-exception p1

    .line 54
    new-instance p2, Ljava/lang/RuntimeException;

    .line 55
    .line 56
    const-string v0, "Could not update to-one ID in entity"

    .line 57
    .line 58
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    throw p2
.end method
