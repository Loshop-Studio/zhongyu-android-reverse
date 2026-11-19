.class public Lio/objectbox/relation/ToMany;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TARGET:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/List<",
        "TTARGET;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x20da66fa0a80d36eL


# instance fields
.field public transient a:Lio/objectbox/BoxStore;

.field public transient b:Lio/objectbox/a;

.field public volatile transient c:Lio/objectbox/a;

.field public transient d:Z

.field public transient e:Ljava/util/Comparator;

.field private entities:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TTARGET;>;"
        }
    .end annotation
.end field

.field private volatile entitiesAdded:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "TTARGET;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private entitiesRemoved:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "TTARGET;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field entitiesToPut:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TTARGET;>;"
        }
    .end annotation
.end field

.field entitiesToRemoveFromDb:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TTARGET;>;"
        }
    .end annotation
.end field

.field private final entity:Ljava/lang/Object;

.field private entityCounts:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "TTARGET;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private volatile listFactory:Lio/objectbox/relation/ListFactory;

.field private final relationInfo:Lio/objectbox/relation/RelationInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/RelationInfo<",
            "Ljava/lang/Object;",
            "TTARGET;>;"
        }
    .end annotation
.end field


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
    iput-object p1, p0, Lio/objectbox/relation/ToMany;->entity:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    const-string p2, "No relation info given (null)"

    .line 16
    .line 17
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 22
    .line 23
    const-string p2, "No source entity given (null)"

    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method public static synthetic access$000(Lio/objectbox/relation/ToMany;)Lio/objectbox/relation/RelationInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->c:Lio/objectbox/a;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lm5/f;->b:Lm5/f;

    .line 6
    .line 7
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->entity:Ljava/lang/Object;

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
    move-result-object v0

    .line 19
    :try_start_0
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->entity:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lio/objectbox/BoxStore;

    .line 26
    .line 27
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->a:Lio/objectbox/BoxStore;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 32
    .line 33
    iget-object v1, v1, Lio/objectbox/relation/RelationInfo;->sourceInfo:Lio/objectbox/EntityInfo;

    .line 34
    .line 35
    invoke-interface {v1}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/a;

    .line 44
    .line 45
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->a:Lio/objectbox/BoxStore;

    .line 46
    .line 47
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 48
    .line 49
    iget-object v1, v1, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 50
    .line 51
    invoke-interface {v1}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->c:Lio/objectbox/a;

    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    :try_start_1
    new-instance v0, Lio/objectbox/exception/DbDetachedException;

    .line 63
    .line 64
    const-string v1, "Cannot resolve relation for detached entities, call box.attach(entity) beforehand."

    .line 65
    .line 66
    invoke-direct {v0, v1}, Lio/objectbox/exception/DbDetachedException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    .line 70
    :catch_0
    move-exception v0

    .line 71
    new-instance v1, Ljava/lang/RuntimeException;

    .line 72
    .line 73
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    throw v1

    .line 77
    :cond_1
    return-void
.end method

.method public declared-synchronized add(ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITTARGET;)V"
        }
    .end annotation

    monitor-enter p0

    .line 3
    :try_start_0
    invoke-virtual {p0, p2}, Lio/objectbox/relation/ToMany;->d(Ljava/lang/Object;)V

    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized add(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTARGET;)Z"
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lio/objectbox/relation/ToMany;->d(Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized addAll(ILjava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TTARGET;>;)Z"
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 3
    invoke-virtual {p0, v1}, Lio/objectbox/relation/ToMany;->d(Ljava/lang/Object;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized addAll(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TTARGET;>;)Z"
        }
    .end annotation

    monitor-enter p0

    .line 5
    :try_start_0
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 6
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 7
    invoke-virtual {p0, v1}, Lio/objectbox/relation/ToMany;->d(Ljava/lang/Object;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public applyChangesToDb()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 2
    .line 3
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->sourceInfo:Lio/objectbox/EntityInfo;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->getIdGetter()Lm5/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->entity:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :try_start_0
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->a()V
    :try_end_0
    .catch Lio/objectbox/exception/DbDetachedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->internalCheckApplyToDbRequired()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->a:Lio/objectbox/BoxStore;

    .line 31
    .line 32
    new-instance v1, La8/a;

    .line 33
    .line 34
    const/16 v2, 0x17

    .line 35
    .line 36
    invoke-direct {v1, p0, v2}, La8/a;-><init>(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->h(Ljava/lang/Runnable;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void

    .line 43
    :catch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v1, "The source entity was not yet persisted, use box.put() on it instead"

    .line 46
    .line 47
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v1, "The source entity was not yet persisted (no ID), use box.put() on it instead"

    .line 54
    .line 55
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0
.end method

.method public final b()V
    .locals 8

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 6
    .line 7
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->sourceInfo:Lio/objectbox/EntityInfo;

    .line 8
    .line 9
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->getIdGetter()Lm5/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->entity:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    cmp-long v0, v5, v0

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    monitor-enter p0

    .line 26
    :try_start_0
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->getListFactory()Lio/objectbox/relation/ListFactory;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0}, Lio/objectbox/relation/ListFactory;->createList()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :goto_0
    monitor-exit p0

    .line 44
    return-void

    .line 45
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw v0

    .line 47
    :cond_1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->a()V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 51
    .line 52
    iget v4, v0, Lio/objectbox/relation/RelationInfo;->relationId:I

    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->sourceInfo:Lio/objectbox/EntityInfo;

    .line 57
    .line 58
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->getEntityId()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->c:Lio/objectbox/a;

    .line 63
    .line 64
    invoke-virtual {v1}, Lio/objectbox/a;->c()Lio/objectbox/Cursor;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    const/4 v7, 0x0

    .line 69
    :try_start_1
    invoke-virtual/range {v2 .. v7}, Lio/objectbox/Cursor;->getRelationEntities(IIJZ)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    invoke-virtual {v1, v2}, Lio/objectbox/a;->h(Lio/objectbox/Cursor;)V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :catchall_1
    move-exception v0

    .line 78
    invoke-virtual {v1, v2}, Lio/objectbox/a;->h(Lio/objectbox/Cursor;)V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :cond_2
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->targetIdProperty:Lio/objectbox/Property;

    .line 83
    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->c:Lio/objectbox/a;

    .line 87
    .line 88
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 89
    .line 90
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 91
    .line 92
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->getEntityId()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-object v2, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 97
    .line 98
    iget-object v2, v2, Lio/objectbox/relation/RelationInfo;->targetIdProperty:Lio/objectbox/Property;

    .line 99
    .line 100
    invoke-virtual {v1}, Lio/objectbox/a;->c()Lio/objectbox/Cursor;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    :try_start_2
    invoke-virtual {v3, v0, v2, v5, v6}, Lio/objectbox/Cursor;->getBacklinkEntities(ILio/objectbox/Property;J)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 108
    invoke-virtual {v1, v3}, Lio/objectbox/a;->h(Lio/objectbox/Cursor;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :catchall_2
    move-exception v0

    .line 113
    invoke-virtual {v1, v3}, Lio/objectbox/a;->h(Lio/objectbox/Cursor;)V

    .line 114
    .line 115
    .line 116
    throw v0

    .line 117
    :cond_3
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->c:Lio/objectbox/a;

    .line 118
    .line 119
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 120
    .line 121
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 122
    .line 123
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->getEntityId()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 128
    .line 129
    iget v4, v0, Lio/objectbox/relation/RelationInfo;->targetRelationId:I

    .line 130
    .line 131
    invoke-virtual {v1}, Lio/objectbox/a;->c()Lio/objectbox/Cursor;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    const/4 v7, 0x1

    .line 136
    :try_start_3
    invoke-virtual/range {v2 .. v7}, Lio/objectbox/Cursor;->getRelationEntities(IIJZ)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 140
    invoke-virtual {v1, v2}, Lio/objectbox/a;->h(Lio/objectbox/Cursor;)V

    .line 141
    .line 142
    .line 143
    :goto_2
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->e:Ljava/util/Comparator;

    .line 144
    .line 145
    if-eqz v1, :cond_4

    .line 146
    .line 147
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 148
    .line 149
    .line 150
    :cond_4
    monitor-enter p0

    .line 151
    :try_start_4
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 152
    .line 153
    if-nez v1, :cond_5

    .line 154
    .line 155
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :catchall_3
    move-exception v0

    .line 159
    goto :goto_4

    .line 160
    :cond_5
    :goto_3
    monitor-exit p0

    .line 161
    return-void

    .line 162
    :goto_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 163
    throw v0

    .line 164
    :catchall_4
    move-exception v0

    .line 165
    invoke-virtual {v1, v2}, Lio/objectbox/a;->h(Lio/objectbox/Cursor;)V

    .line 166
    .line 167
    .line 168
    throw v0

    .line 169
    :cond_6
    return-void
.end method

.method public final c()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesAdded:Ljava/util/Map;

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    monitor-enter p0

    .line 9
    :try_start_0
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesAdded:Ljava/util/Map;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesAdded:Ljava/util/Map;

    .line 19
    .line 20
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesRemoved:Ljava/util/Map;

    .line 26
    .line 27
    new-instance v0, Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->entityCounts:Ljava/util/Map;

    .line 33
    .line 34
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, p0, Lio/objectbox/relation/ToMany;->entityCounts:Ljava/util/Map;

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-interface {v2, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Ljava/lang/Integer;

    .line 62
    .line 63
    if-eqz v2, :cond_0

    .line 64
    .line 65
    iget-object v4, p0, Lio/objectbox/relation/ToMany;->entityCounts:Ljava/util/Map;

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    add-int/2addr v2, v3

    .line 72
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-interface {v4, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    monitor-exit p0

    .line 83
    return-void

    .line 84
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    throw v0

    .line 86
    :cond_2
    return-void
.end method

.method public declared-synchronized clear()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, Lio/objectbox/relation/ToMany;->entitiesRemoved:Ljava/util/Map;

    .line 24
    .line 25
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesAdded:Ljava/util/Map;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 41
    .line 42
    .line 43
    :cond_2
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entityCounts:Ljava/util/Map;

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    :cond_3
    monitor-exit p0

    .line 51
    return-void

    .line 52
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entityCounts:Ljava/util/Map;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Integer;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lio/objectbox/relation/ToMany;->entityCounts:Ljava/util/Map;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/2addr v0, v1

    .line 26
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesAdded:Ljava/util/Map;

    .line 34
    .line 35
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesRemoved:Ljava/util/Map;

    .line 41
    .line 42
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entityCounts:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Integer;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entityCounts:Ljava/util/Map;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesAdded:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesRemoved:Ljava/util/Map;

    .line 32
    .line 33
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-le v1, v2, :cond_1

    .line 44
    .line 45
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->entityCounts:Ljava/util/Map;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    sub-int/2addr v0, v2

    .line 52
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v2, "Illegal count: "

    .line 65
    .line 66
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :cond_2
    return-void
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TTARGET;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public getAddCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesAdded:Ljava/util/Map;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getById(J)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TTARGET;"
        }
    .end annotation

    .annotation build Lio/objectbox/annotation/apihint/Beta;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 11
    .line 12
    iget-object v1, v1, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 13
    .line 14
    invoke-interface {v1}, Lio/objectbox/EntityInfo;->getIdGetter()Lm5/b;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    array-length v2, v0

    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    if-ge v3, v2, :cond_1

    .line 21
    .line 22
    aget-object v4, v0, v3

    .line 23
    .line 24
    invoke-interface {v1, v4}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    cmp-long v5, v5, p1

    .line 29
    .line 30
    if-nez v5, :cond_0

    .line 31
    .line 32
    return-object v4

    .line 33
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    return-object p1
.end method

.method public getEntity()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entity:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public getListFactory()Lio/objectbox/relation/ListFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->listFactory:Lio/objectbox/relation/ListFactory;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->listFactory:Lio/objectbox/relation/ListFactory;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lio/objectbox/relation/ListFactory$CopyOnWriteArrayListFactory;

    .line 11
    .line 12
    invoke-direct {v0}, Lio/objectbox/relation/ListFactory$CopyOnWriteArrayListFactory;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->listFactory:Lio/objectbox/relation/ListFactory;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit p0

    .line 21
    return-object v0

    .line 22
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v0

    .line 24
    :cond_1
    return-object v0
.end method

.method public getRemoveCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesRemoved:Ljava/util/Map;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public hasA(Lo5/c;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo5/c;",
            ")Z"
        }
    .end annotation

    .annotation build Lio/objectbox/annotation/apihint/Beta;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->toArray()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v3, v1, :cond_1

    .line 9
    .line 10
    aget-object v4, v0, v3

    .line 11
    .line 12
    invoke-interface {p1}, Lo5/c;->a()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return v2
.end method

.method public hasAll(Lo5/c;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo5/c;",
            ")Z"
        }
    .end annotation

    .annotation build Lio/objectbox/annotation/apihint/Beta;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->toArray()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    array-length v1, v0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_2

    .line 13
    .line 14
    aget-object v4, v0, v3

    .line 15
    .line 16
    invoke-interface {p1}, Lo5/c;->a()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    :goto_1
    return v2

    .line 23
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    const/4 p1, 0x1

    .line 27
    return p1
.end method

.method public hasPendingDbChanges()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesAdded:Ljava/util/Map;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesRemoved:Ljava/util/Map;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    return v0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public indexOfId(J)I
    .locals 7
    .annotation build Lio/objectbox/annotation/apihint/Beta;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 11
    .line 12
    iget-object v1, v1, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 13
    .line 14
    invoke-interface {v1}, Lio/objectbox/EntityInfo;->getIdGetter()Lm5/b;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    array-length v2, v0

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v3, v2, :cond_1

    .line 22
    .line 23
    aget-object v5, v0, v3

    .line 24
    .line 25
    invoke-interface {v1, v5}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    cmp-long v5, v5, p1

    .line 30
    .line 31
    if-nez v5, :cond_0

    .line 32
    .line 33
    return v4

    .line 34
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 p1, -0x1

    .line 40
    return p1
.end method

.method public internalApplyToDb(Lio/objectbox/Cursor;Lio/objectbox/Cursor;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/Cursor<",
            "*>;",
            "Lio/objectbox/Cursor<",
            "TTARGET;>;)V"
        }
    .end annotation

    .annotation build Lio/objectbox/annotation/apihint/Internal;
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    iget-object v2, v1, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 6
    .line 7
    iget v3, v2, Lio/objectbox/relation/RelationInfo;->relationId:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v3, v4

    .line 15
    :goto_0
    iget-object v2, v2, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 16
    .line 17
    invoke-interface {v2}, Lio/objectbox/EntityInfo;->getIdGetter()Lm5/b;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    monitor-enter p0

    .line 22
    const-wide/16 v5, 0x0

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    if-eqz v3, :cond_6

    .line 26
    .line 27
    :try_start_0
    iget-object v8, v1, Lio/objectbox/relation/ToMany;->entitiesAdded:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {v8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    :cond_1
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    if-eqz v9, :cond_2

    .line 42
    .line 43
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    invoke-interface {v2, v9}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v10

    .line 51
    cmp-long v10, v10, v5

    .line 52
    .line 53
    if-nez v10, :cond_1

    .line 54
    .line 55
    iget-object v10, v1, Lio/objectbox/relation/ToMany;->entitiesToPut:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v10, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto/16 :goto_b

    .line 63
    .line 64
    :cond_2
    iget-boolean v8, v1, Lio/objectbox/relation/ToMany;->d:Z

    .line 65
    .line 66
    if-eqz v8, :cond_3

    .line 67
    .line 68
    iget-object v8, v1, Lio/objectbox/relation/ToMany;->entitiesToRemoveFromDb:Ljava/util/List;

    .line 69
    .line 70
    iget-object v9, v1, Lio/objectbox/relation/ToMany;->entitiesRemoved:Ljava/util/Map;

    .line 71
    .line 72
    invoke-interface {v9}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    invoke-interface {v8, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 77
    .line 78
    .line 79
    :cond_3
    iget-object v8, v1, Lio/objectbox/relation/ToMany;->entitiesAdded:Ljava/util/Map;

    .line 80
    .line 81
    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-nez v8, :cond_4

    .line 86
    .line 87
    iget-object v8, v1, Lio/objectbox/relation/ToMany;->entitiesAdded:Ljava/util/Map;

    .line 88
    .line 89
    invoke-interface {v8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-interface {v8}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    iget-object v9, v1, Lio/objectbox/relation/ToMany;->entitiesAdded:Ljava/util/Map;

    .line 98
    .line 99
    invoke-interface {v9}, Ljava/util/Map;->clear()V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    move-object v8, v7

    .line 104
    :goto_2
    iget-object v9, v1, Lio/objectbox/relation/ToMany;->entitiesRemoved:Ljava/util/Map;

    .line 105
    .line 106
    invoke-interface {v9}, Ljava/util/Map;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-nez v9, :cond_5

    .line 111
    .line 112
    new-instance v9, Ljava/util/ArrayList;

    .line 113
    .line 114
    iget-object v10, v1, Lio/objectbox/relation/ToMany;->entitiesRemoved:Ljava/util/Map;

    .line 115
    .line 116
    invoke-interface {v10}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 121
    .line 122
    .line 123
    iget-object v10, v1, Lio/objectbox/relation/ToMany;->entitiesRemoved:Ljava/util/Map;

    .line 124
    .line 125
    invoke-interface {v10}, Ljava/util/Map;->clear()V

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    move-object v9, v7

    .line 130
    goto :goto_3

    .line 131
    :cond_6
    move-object v8, v7

    .line 132
    move-object v9, v8

    .line 133
    :goto_3
    iget-object v10, v1, Lio/objectbox/relation/ToMany;->entitiesToRemoveFromDb:Ljava/util/List;

    .line 134
    .line 135
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    if-eqz v10, :cond_7

    .line 140
    .line 141
    move-object v10, v7

    .line 142
    goto :goto_4

    .line 143
    :cond_7
    iget-object v10, v1, Lio/objectbox/relation/ToMany;->entitiesToRemoveFromDb:Ljava/util/List;

    .line 144
    .line 145
    invoke-interface {v10}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    :goto_4
    iget-object v11, v1, Lio/objectbox/relation/ToMany;->entitiesToRemoveFromDb:Ljava/util/List;

    .line 150
    .line 151
    invoke-interface {v11}, Ljava/util/List;->clear()V

    .line 152
    .line 153
    .line 154
    iget-object v11, v1, Lio/objectbox/relation/ToMany;->entitiesToPut:Ljava/util/List;

    .line 155
    .line 156
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    if-eqz v11, :cond_8

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_8
    iget-object v7, v1, Lio/objectbox/relation/ToMany;->entitiesToPut:Ljava/util/List;

    .line 164
    .line 165
    invoke-interface {v7}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    :goto_5
    iget-object v11, v1, Lio/objectbox/relation/ToMany;->entitiesToPut:Ljava/util/List;

    .line 170
    .line 171
    invoke-interface {v11}, Ljava/util/List;->clear()V

    .line 172
    .line 173
    .line 174
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    if-eqz v10, :cond_a

    .line 176
    .line 177
    array-length v11, v10

    .line 178
    move v12, v4

    .line 179
    :goto_6
    if-ge v12, v11, :cond_a

    .line 180
    .line 181
    aget-object v13, v10, v12

    .line 182
    .line 183
    invoke-interface {v2, v13}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 184
    .line 185
    .line 186
    move-result-wide v13

    .line 187
    cmp-long v15, v13, v5

    .line 188
    .line 189
    if-eqz v15, :cond_9

    .line 190
    .line 191
    invoke-virtual {v0, v13, v14}, Lio/objectbox/Cursor;->deleteEntity(J)Z

    .line 192
    .line 193
    .line 194
    :cond_9
    add-int/lit8 v12, v12, 0x1

    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_a
    if-eqz v7, :cond_b

    .line 198
    .line 199
    array-length v10, v7

    .line 200
    move v11, v4

    .line 201
    :goto_7
    if-ge v11, v10, :cond_b

    .line 202
    .line 203
    aget-object v12, v7, v11

    .line 204
    .line 205
    invoke-virtual {v0, v12}, Lio/objectbox/Cursor;->put(Ljava/lang/Object;)J

    .line 206
    .line 207
    .line 208
    add-int/lit8 v11, v11, 0x1

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_b
    if-eqz v3, :cond_13

    .line 212
    .line 213
    iget-object v0, v1, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 214
    .line 215
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->sourceInfo:Lio/objectbox/EntityInfo;

    .line 216
    .line 217
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->getIdGetter()Lm5/b;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    iget-object v3, v1, Lio/objectbox/relation/ToMany;->entity:Ljava/lang/Object;

    .line 222
    .line 223
    invoke-interface {v0, v3}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 224
    .line 225
    .line 226
    move-result-wide v12

    .line 227
    cmp-long v0, v12, v5

    .line 228
    .line 229
    if-eqz v0, :cond_12

    .line 230
    .line 231
    if-eqz v9, :cond_f

    .line 232
    .line 233
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    :cond_c
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-eqz v3, :cond_d

    .line 242
    .line 243
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    invoke-interface {v2, v3}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 248
    .line 249
    .line 250
    move-result-wide v10

    .line 251
    cmp-long v3, v10, v5

    .line 252
    .line 253
    if-nez v3, :cond_c

    .line 254
    .line 255
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 256
    .line 257
    .line 258
    goto :goto_8

    .line 259
    :cond_d
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-lez v0, :cond_f

    .line 264
    .line 265
    new-array v14, v0, [J

    .line 266
    .line 267
    move v3, v4

    .line 268
    :goto_9
    if-ge v3, v0, :cond_e

    .line 269
    .line 270
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    invoke-interface {v2, v7}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 275
    .line 276
    .line 277
    move-result-wide v10

    .line 278
    aput-wide v10, v14, v3

    .line 279
    .line 280
    add-int/lit8 v3, v3, 0x1

    .line 281
    .line 282
    goto :goto_9

    .line 283
    :cond_e
    iget-object v0, v1, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 284
    .line 285
    iget v11, v0, Lio/objectbox/relation/RelationInfo;->relationId:I

    .line 286
    .line 287
    const/4 v15, 0x1

    .line 288
    move-object/from16 v10, p1

    .line 289
    .line 290
    invoke-virtual/range {v10 .. v15}, Lio/objectbox/Cursor;->modifyRelations(IJ[JZ)V

    .line 291
    .line 292
    .line 293
    :cond_f
    if-eqz v8, :cond_13

    .line 294
    .line 295
    array-length v0, v8

    .line 296
    new-array v14, v0, [J

    .line 297
    .line 298
    :goto_a
    if-ge v4, v0, :cond_11

    .line 299
    .line 300
    aget-object v3, v8, v4

    .line 301
    .line 302
    invoke-interface {v2, v3}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 303
    .line 304
    .line 305
    move-result-wide v9

    .line 306
    cmp-long v3, v9, v5

    .line 307
    .line 308
    if-eqz v3, :cond_10

    .line 309
    .line 310
    aput-wide v9, v14, v4

    .line 311
    .line 312
    add-int/lit8 v4, v4, 0x1

    .line 313
    .line 314
    goto :goto_a

    .line 315
    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 316
    .line 317
    const-string v2, "Target entity has no ID (should have been put before)"

    .line 318
    .line 319
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    throw v0

    .line 323
    :cond_11
    iget-object v0, v1, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 324
    .line 325
    iget v11, v0, Lio/objectbox/relation/RelationInfo;->relationId:I

    .line 326
    .line 327
    const/4 v15, 0x0

    .line 328
    move-object/from16 v10, p1

    .line 329
    .line 330
    invoke-virtual/range {v10 .. v15}, Lio/objectbox/Cursor;->modifyRelations(IJ[JZ)V

    .line 331
    .line 332
    .line 333
    return-void

    .line 334
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 335
    .line 336
    const-string v2, "Source entity has no ID (should have been put before)"

    .line 337
    .line 338
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    throw v0

    .line 342
    :cond_13
    return-void

    .line 343
    :goto_b
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 344
    throw v0
.end method

.method public internalCheckApplyToDbRequired()Z
    .locals 15
    .annotation build Lio/objectbox/annotation/apihint/Internal;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->hasPendingDbChanges()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    monitor-enter p0

    .line 10
    :try_start_0
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesToPut:Ljava/util/List;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesToPut:Ljava/util/List;

    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesToRemoveFromDb:Ljava/util/List;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto/16 :goto_7

    .line 31
    .line 32
    :cond_1
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 34
    .line 35
    iget v2, v0, Lio/objectbox/relation/RelationInfo;->relationId:I

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    return v3

    .line 41
    :cond_2
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->sourceInfo:Lio/objectbox/EntityInfo;

    .line 42
    .line 43
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->getIdGetter()Lm5/b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v2, p0, Lio/objectbox/relation/ToMany;->entity:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-interface {v0, v2}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    const-wide/16 v6, 0x0

    .line 54
    .line 55
    cmp-long v0, v4, v6

    .line 56
    .line 57
    if-eqz v0, :cond_1a

    .line 58
    .line 59
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 60
    .line 61
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 62
    .line 63
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->getIdGetter()Lm5/b;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v2, p0, Lio/objectbox/relation/ToMany;->entitiesAdded:Ljava/util/Map;

    .line 68
    .line 69
    iget-object v8, p0, Lio/objectbox/relation/ToMany;->entitiesRemoved:Ljava/util/Map;

    .line 70
    .line 71
    iget-object v9, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 72
    .line 73
    iget v10, v9, Lio/objectbox/relation/RelationInfo;->targetRelationId:I

    .line 74
    .line 75
    if-eqz v10, :cond_e

    .line 76
    .line 77
    iget-object v9, v9, Lio/objectbox/relation/RelationInfo;->backlinkToManyGetter:Lio/objectbox/internal/ToManyGetter;

    .line 78
    .line 79
    monitor-enter p0

    .line 80
    if-eqz v2, :cond_7

    .line 81
    .line 82
    :try_start_1
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-nez v10, :cond_7

    .line 87
    .line 88
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    :cond_3
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    if-eqz v11, :cond_6

    .line 101
    .line 102
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    invoke-interface {v9, v11}, Lio/objectbox/internal/ToManyGetter;->getToMany(Ljava/lang/Object;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v12

    .line 110
    check-cast v12, Lio/objectbox/relation/ToMany;

    .line 111
    .line 112
    if-eqz v12, :cond_5

    .line 113
    .line 114
    invoke-virtual {v12, v4, v5}, Lio/objectbox/relation/ToMany;->getById(J)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    if-nez v13, :cond_4

    .line 119
    .line 120
    iget-object v13, p0, Lio/objectbox/relation/ToMany;->entity:Ljava/lang/Object;

    .line 121
    .line 122
    invoke-virtual {v12, v13}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    iget-object v12, p0, Lio/objectbox/relation/ToMany;->entitiesToPut:Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :catchall_1
    move-exception v0

    .line 132
    goto/16 :goto_3

    .line 133
    .line 134
    :cond_4
    invoke-interface {v0, v11}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 135
    .line 136
    .line 137
    move-result-wide v12

    .line 138
    cmp-long v12, v12, v6

    .line 139
    .line 140
    if-nez v12, :cond_3

    .line 141
    .line 142
    iget-object v12, p0, Lio/objectbox/relation/ToMany;->entitiesToPut:Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 149
    .line 150
    new-instance v1, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    const-string v2, "The ToMany property for "

    .line 156
    .line 157
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    iget-object v2, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 161
    .line 162
    iget-object v2, v2, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 163
    .line 164
    invoke-interface {v2}, Lio/objectbox/EntityInfo;->getEntityName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v2, " is null"

    .line 172
    .line 173
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw v0

    .line 184
    :cond_6
    invoke-interface {v2}, Ljava/util/Map;->clear()V

    .line 185
    .line 186
    .line 187
    :cond_7
    if-eqz v8, :cond_b

    .line 188
    .line 189
    invoke-interface {v8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    :cond_8
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v10

    .line 201
    if-eqz v10, :cond_a

    .line 202
    .line 203
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    invoke-interface {v9, v10}, Lio/objectbox/internal/ToManyGetter;->getToMany(Ljava/lang/Object;)Ljava/util/List;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    check-cast v11, Lio/objectbox/relation/ToMany;

    .line 212
    .line 213
    invoke-virtual {v11, v4, v5}, Lio/objectbox/relation/ToMany;->getById(J)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v12

    .line 217
    if-eqz v12, :cond_8

    .line 218
    .line 219
    invoke-virtual {v11, v4, v5}, Lio/objectbox/relation/ToMany;->removeById(J)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    invoke-interface {v0, v10}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 223
    .line 224
    .line 225
    move-result-wide v11

    .line 226
    cmp-long v11, v11, v6

    .line 227
    .line 228
    if-eqz v11, :cond_8

    .line 229
    .line 230
    iget-boolean v11, p0, Lio/objectbox/relation/ToMany;->d:Z

    .line 231
    .line 232
    if-eqz v11, :cond_9

    .line 233
    .line 234
    iget-object v11, p0, Lio/objectbox/relation/ToMany;->entitiesToRemoveFromDb:Ljava/util/List;

    .line 235
    .line 236
    invoke-interface {v11, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_9
    iget-object v11, p0, Lio/objectbox/relation/ToMany;->entitiesToPut:Ljava/util/List;

    .line 241
    .line 242
    invoke-interface {v11, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_a
    invoke-interface {v8}, Ljava/util/Map;->clear()V

    .line 247
    .line 248
    .line 249
    :cond_b
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesToPut:Ljava/util/List;

    .line 250
    .line 251
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-eqz v0, :cond_c

    .line 256
    .line 257
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesToRemoveFromDb:Ljava/util/List;

    .line 258
    .line 259
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-nez v0, :cond_d

    .line 264
    .line 265
    :cond_c
    move v1, v3

    .line 266
    :cond_d
    monitor-exit p0

    .line 267
    return v1

    .line 268
    :goto_3
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 269
    throw v0

    .line 270
    :cond_e
    iget-object v9, v9, Lio/objectbox/relation/RelationInfo;->backlinkToOneGetter:Lio/objectbox/internal/ToOneGetter;

    .line 271
    .line 272
    monitor-enter p0

    .line 273
    if-eqz v2, :cond_13

    .line 274
    .line 275
    :try_start_2
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 276
    .line 277
    .line 278
    move-result v10

    .line 279
    if-nez v10, :cond_13

    .line 280
    .line 281
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 282
    .line 283
    .line 284
    move-result-object v10

    .line 285
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 286
    .line 287
    .line 288
    move-result-object v10

    .line 289
    :cond_f
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 290
    .line 291
    .line 292
    move-result v11

    .line 293
    if-eqz v11, :cond_12

    .line 294
    .line 295
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v11

    .line 299
    invoke-interface {v9, v11}, Lio/objectbox/internal/ToOneGetter;->getToOne(Ljava/lang/Object;)Lio/objectbox/relation/ToOne;

    .line 300
    .line 301
    .line 302
    move-result-object v12

    .line 303
    if-eqz v12, :cond_11

    .line 304
    .line 305
    invoke-virtual {v12}, Lio/objectbox/relation/ToOne;->getTargetId()J

    .line 306
    .line 307
    .line 308
    move-result-wide v13

    .line 309
    cmp-long v13, v13, v4

    .line 310
    .line 311
    if-eqz v13, :cond_10

    .line 312
    .line 313
    iget-object v13, p0, Lio/objectbox/relation/ToMany;->entity:Ljava/lang/Object;

    .line 314
    .line 315
    invoke-virtual {v12, v13}, Lio/objectbox/relation/ToOne;->setTarget(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    iget-object v12, p0, Lio/objectbox/relation/ToMany;->entitiesToPut:Ljava/util/List;

    .line 319
    .line 320
    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    goto :goto_4

    .line 324
    :catchall_2
    move-exception v0

    .line 325
    goto/16 :goto_6

    .line 326
    .line 327
    :cond_10
    invoke-interface {v0, v11}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 328
    .line 329
    .line 330
    move-result-wide v12

    .line 331
    cmp-long v12, v12, v6

    .line 332
    .line 333
    if-nez v12, :cond_f

    .line 334
    .line 335
    iget-object v12, p0, Lio/objectbox/relation/ToMany;->entitiesToPut:Ljava/util/List;

    .line 336
    .line 337
    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    goto :goto_4

    .line 341
    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 342
    .line 343
    new-instance v1, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 346
    .line 347
    .line 348
    const-string v2, "The ToOne property for "

    .line 349
    .line 350
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    iget-object v2, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 354
    .line 355
    iget-object v2, v2, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 356
    .line 357
    invoke-interface {v2}, Lio/objectbox/EntityInfo;->getEntityName()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    const-string v2, "."

    .line 365
    .line 366
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    iget-object v2, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 370
    .line 371
    iget-object v2, v2, Lio/objectbox/relation/RelationInfo;->targetIdProperty:Lio/objectbox/Property;

    .line 372
    .line 373
    iget-object v2, v2, Lio/objectbox/Property;->name:Ljava/lang/String;

    .line 374
    .line 375
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    const-string v2, " is null"

    .line 379
    .line 380
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    throw v0

    .line 391
    :cond_12
    invoke-interface {v2}, Ljava/util/Map;->clear()V

    .line 392
    .line 393
    .line 394
    :cond_13
    if-eqz v8, :cond_17

    .line 395
    .line 396
    invoke-interface {v8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    :cond_14
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 405
    .line 406
    .line 407
    move-result v10

    .line 408
    if-eqz v10, :cond_16

    .line 409
    .line 410
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v10

    .line 414
    invoke-interface {v9, v10}, Lio/objectbox/internal/ToOneGetter;->getToOne(Ljava/lang/Object;)Lio/objectbox/relation/ToOne;

    .line 415
    .line 416
    .line 417
    move-result-object v11

    .line 418
    invoke-virtual {v11}, Lio/objectbox/relation/ToOne;->getTargetId()J

    .line 419
    .line 420
    .line 421
    move-result-wide v12

    .line 422
    cmp-long v12, v12, v4

    .line 423
    .line 424
    if-nez v12, :cond_14

    .line 425
    .line 426
    const/4 v12, 0x0

    .line 427
    invoke-virtual {v11, v12}, Lio/objectbox/relation/ToOne;->setTarget(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    invoke-interface {v0, v10}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 431
    .line 432
    .line 433
    move-result-wide v11

    .line 434
    cmp-long v11, v11, v6

    .line 435
    .line 436
    if-eqz v11, :cond_14

    .line 437
    .line 438
    iget-boolean v11, p0, Lio/objectbox/relation/ToMany;->d:Z

    .line 439
    .line 440
    if-eqz v11, :cond_15

    .line 441
    .line 442
    iget-object v11, p0, Lio/objectbox/relation/ToMany;->entitiesToRemoveFromDb:Ljava/util/List;

    .line 443
    .line 444
    invoke-interface {v11, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    goto :goto_5

    .line 448
    :cond_15
    iget-object v11, p0, Lio/objectbox/relation/ToMany;->entitiesToPut:Ljava/util/List;

    .line 449
    .line 450
    invoke-interface {v11, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    goto :goto_5

    .line 454
    :cond_16
    invoke-interface {v8}, Ljava/util/Map;->clear()V

    .line 455
    .line 456
    .line 457
    :cond_17
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesToPut:Ljava/util/List;

    .line 458
    .line 459
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    if-eqz v0, :cond_18

    .line 464
    .line 465
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesToRemoveFromDb:Ljava/util/List;

    .line 466
    .line 467
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 468
    .line 469
    .line 470
    move-result v0

    .line 471
    if-nez v0, :cond_19

    .line 472
    .line 473
    :cond_18
    move v1, v3

    .line 474
    :cond_19
    monitor-exit p0

    .line 475
    return v1

    .line 476
    :goto_6
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 477
    throw v0

    .line 478
    :cond_1a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 479
    .line 480
    const-string v1, "Source entity has no ID (should have been put before)"

    .line 481
    .line 482
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    throw v0

    .line 486
    :goto_7
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 487
    throw v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public isResolved()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TTARGET;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "TTARGET;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 2
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "TTARGET;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 3
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized remove(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TTARGET;"
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    .line 3
    invoke-virtual {p0, p1}, Lio/objectbox/relation/ToMany;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
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

.method public declared-synchronized remove(Ljava/lang/Object;)Z
    .locals 1

    monitor-enter p0

    .line 5
    :try_start_0
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 6
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {p0, p1}, Lio/objectbox/relation/ToMany;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 8
    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized removeAll(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const/4 v0, 0x0

    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0, v1}, Lio/objectbox/relation/ToMany;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    or-int/2addr v0, v1

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    monitor-exit p0

    .line 26
    return v0

    .line 27
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw p1
.end method

.method public declared-synchronized removeById(J)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TTARGET;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->relationInfo:Lio/objectbox/relation/RelationInfo;

    .line 12
    .line 13
    iget-object v1, v1, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 14
    .line 15
    invoke-interface {v1}, Lio/objectbox/EntityInfo;->getIdGetter()Lm5/b;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    if-ge v2, v0, :cond_2

    .line 21
    .line 22
    iget-object v3, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-interface {v1, v3}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    cmp-long v4, v4, p1

    .line 33
    .line 34
    if-nez v4, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, v2}, Lio/objectbox/relation/ToMany;->remove(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    if-ne p1, v3, :cond_0

    .line 41
    .line 42
    monitor-exit p0

    .line 43
    return-object v3

    .line 44
    :cond_0
    :try_start_1
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v1, "Mismatch: "

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p1, " vs. "

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    monitor-exit p0

    .line 81
    const/4 p1, 0x0

    .line 82
    return-object p1

    .line 83
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 84
    throw p1
.end method

.method public declared-synchronized reset()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 4
    .line 5
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesAdded:Ljava/util/Map;

    .line 6
    .line 7
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesRemoved:Ljava/util/Map;

    .line 8
    .line 9
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesToRemoveFromDb:Ljava/util/List;

    .line 10
    .line 11
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->entitiesToPut:Ljava/util/List;

    .line 12
    .line 13
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->entityCounts:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw v0
.end method

.method public declared-synchronized retainAll(Ljava/util/Collection;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-interface {p1, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    new-instance v2, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    :goto_1
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    if-eqz v2, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0, v2}, Lio/objectbox/relation/ToMany;->removeAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    :cond_3
    monitor-exit p0

    .line 50
    return v1

    .line 51
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    throw p1
.end method

.method public declared-synchronized set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITTARGET;)TTARGET;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Lio/objectbox/relation/ToMany;->e(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p2}, Lio/objectbox/relation/ToMany;->d(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-object p1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
.end method

.method public setComparator(Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "TTARGET;>;)V"
        }
    .end annotation

    .annotation build Lio/objectbox/annotation/apihint/Experimental;
    .end annotation

    .line 1
    iput-object p1, p0, Lio/objectbox/relation/ToMany;->e:Ljava/util/Comparator;

    .line 2
    .line 3
    return-void
.end method

.method public setListFactory(Lio/objectbox/relation/ListFactory;)V
    .locals 1
    .annotation build Lio/objectbox/annotation/apihint/Experimental;
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lio/objectbox/relation/ToMany;->listFactory:Lio/objectbox/relation/ListFactory;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    const-string v0, "ListFactory is null"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public declared-synchronized setRemoveFromTargetBox(Z)V
    .locals 0
    .annotation build Lio/objectbox/annotation/apihint/Experimental;
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-boolean p1, p0, Lio/objectbox/relation/ToMany;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public size()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public sortById()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 5
    .line 6
    new-instance v1, Lio/objectbox/relation/a;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lio/objectbox/relation/ToMany;->access$000(Lio/objectbox/relation/ToMany;)Lio/objectbox/relation/RelationInfo;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v2, v2, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 16
    .line 17
    invoke-interface {v2}, Lio/objectbox/EntityInfo;->getIdGetter()Lm5/b;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iput-object v2, v1, Lio/objectbox/relation/a;->a:Lm5/b;

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public subList(II)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "TTARGET;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 2
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 3
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->entities:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
