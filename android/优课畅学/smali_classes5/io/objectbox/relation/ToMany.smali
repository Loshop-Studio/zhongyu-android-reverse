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
.field public static final o:Ljava/lang/Integer;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lio/objectbox/relation/RelationInfo;

.field public volatile c:Lio/objectbox/relation/ListFactory;

.field public d:Ljava/util/List;

.field public e:Ljava/util/Map;

.field public volatile f:Ljava/util/Map;

.field public g:Ljava/util/Map;

.field public h:Ljava/util/List;

.field public i:Ljava/util/List;

.field public transient j:Lio/objectbox/BoxStore;

.field public transient k:Lio/objectbox/a;

.field public volatile transient l:Lio/objectbox/a;

.field public transient m:Z

.field public transient n:Ljava/util/Comparator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Lio/objectbox/relation/ToMany;->o:Ljava/lang/Integer;

    .line 7
    .line 8
    return-void
.end method

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
    iput-object p1, p0, Lio/objectbox/relation/ToMany;->a:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

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


# virtual methods
.method public final a(Lio/objectbox/Cursor;J[Ljava/lang/Object;Ln6/c;)V
    .locals 8

    .line 1
    array-length v0, p4

    .line 2
    new-array v5, v0, [J

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    aget-object v2, p4, v1

    .line 8
    .line 9
    invoke-interface {p5, v2}, Ln6/c;->getId(Ljava/lang/Object;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    const-wide/16 v6, 0x0

    .line 14
    .line 15
    cmp-long v4, v2, v6

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    aput-wide v2, v5, v1

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string p2, "Target entity has no ID (should have been put before)"

    .line 27
    .line 28
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    iget-object p4, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 33
    .line 34
    iget v2, p4, Lio/objectbox/relation/RelationInfo;->i:I

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    move-object v1, p1

    .line 38
    move-wide v3, p2

    .line 39
    invoke-virtual/range {v1 .. v6}, Lio/objectbox/Cursor;->modifyRelations(IJ[JZ)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public declared-synchronized add(ILjava/lang/Object;)V
    .locals 1

    monitor-enter p0

    .line 3
    :try_start_0
    invoke-virtual {p0, p2}, Lio/objectbox/relation/ToMany;->p(Ljava/lang/Object;)V

    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

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

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lio/objectbox/relation/ToMany;->p(Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

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
    .locals 1

    monitor-enter p0

    .line 3
    :try_start_0
    invoke-virtual {p0, p2}, Lio/objectbox/relation/ToMany;->q(Ljava/util/Collection;)V

    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

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
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lio/objectbox/relation/ToMany;->q(Ljava/util/Collection;)V

    .line 2
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

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

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->l:Lio/objectbox/a;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Ln6/f;->b()Ln6/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->a:Ljava/lang/Object;

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
    invoke-virtual {v0, v1, v2}, Ln6/f;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :try_start_0
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->a:Ljava/lang/Object;

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
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->j:Lio/objectbox/BoxStore;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 34
    .line 35
    iget-object v1, v1, Lio/objectbox/relation/RelationInfo;->a:Lio/objectbox/EntityInfo;

    .line 36
    .line 37
    invoke-interface {v1}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->d(Ljava/lang/Class;)Lio/objectbox/a;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->k:Lio/objectbox/a;

    .line 46
    .line 47
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->j:Lio/objectbox/BoxStore;

    .line 48
    .line 49
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 50
    .line 51
    iget-object v1, v1, Lio/objectbox/relation/RelationInfo;->b:Lio/objectbox/EntityInfo;

    .line 52
    .line 53
    invoke-interface {v1}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->d(Ljava/lang/Class;)Lio/objectbox/a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->l:Lio/objectbox/a;

    .line 62
    .line 63
    return-void

    .line 64
    :cond_0
    :try_start_1
    new-instance v0, Lio/objectbox/exception/DbDetachedException;

    .line 65
    .line 66
    const-string v1, "Cannot resolve relation for detached entities, call box.attach(entity) beforehand."

    .line 67
    .line 68
    invoke-direct {v0, v1}, Lio/objectbox/exception/DbDetachedException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    .line 72
    :catch_0
    move-exception v0

    .line 73
    new-instance v1, Ljava/lang/RuntimeException;

    .line 74
    .line 75
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    throw v1

    .line 79
    :cond_1
    return-void
.end method

.method public final c()V
    .locals 8

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 6
    .line 7
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->a:Lio/objectbox/EntityInfo;

    .line 8
    .line 9
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->getIdGetter()Ln6/c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->a:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Ln6/c;->getId(Ljava/lang/Object;)J

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
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->g()Lio/objectbox/relation/ListFactory;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0}, Lio/objectbox/relation/ListFactory;->f()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

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
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->b()V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 51
    .line 52
    iget v4, v0, Lio/objectbox/relation/RelationInfo;->i:I

    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->a:Lio/objectbox/EntityInfo;

    .line 57
    .line 58
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->getEntityId()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    iget-object v2, p0, Lio/objectbox/relation/ToMany;->l:Lio/objectbox/a;

    .line 63
    .line 64
    const/4 v7, 0x0

    .line 65
    invoke-virtual/range {v2 .. v7}, Lio/objectbox/a;->k(IIJZ)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->c:Lio/objectbox/Property;

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->l:Lio/objectbox/a;

    .line 75
    .line 76
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 77
    .line 78
    iget-object v1, v1, Lio/objectbox/relation/RelationInfo;->b:Lio/objectbox/EntityInfo;

    .line 79
    .line 80
    invoke-interface {v1}, Lio/objectbox/EntityInfo;->getEntityId()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    iget-object v2, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 85
    .line 86
    iget-object v2, v2, Lio/objectbox/relation/RelationInfo;->c:Lio/objectbox/Property;

    .line 87
    .line 88
    invoke-virtual {v0, v1, v2, v5, v6}, Lio/objectbox/a;->j(ILio/objectbox/Property;J)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    goto :goto_2

    .line 93
    :cond_3
    iget-object v2, p0, Lio/objectbox/relation/ToMany;->l:Lio/objectbox/a;

    .line 94
    .line 95
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 96
    .line 97
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->b:Lio/objectbox/EntityInfo;

    .line 98
    .line 99
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->getEntityId()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 104
    .line 105
    iget v4, v0, Lio/objectbox/relation/RelationInfo;->d:I

    .line 106
    .line 107
    const/4 v7, 0x1

    .line 108
    invoke-virtual/range {v2 .. v7}, Lio/objectbox/a;->k(IIJZ)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    :goto_2
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->n:Ljava/util/Comparator;

    .line 113
    .line 114
    if-eqz v1, :cond_4

    .line 115
    .line 116
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 117
    .line 118
    .line 119
    :cond_4
    monitor-enter p0

    .line 120
    :try_start_1
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

    .line 121
    .line 122
    if-nez v1, :cond_5

    .line 123
    .line 124
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :catchall_1
    move-exception v0

    .line 128
    goto :goto_4

    .line 129
    :cond_5
    :goto_3
    monitor-exit p0

    .line 130
    return-void

    .line 131
    :goto_4
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 132
    throw v0

    .line 133
    :cond_6
    return-void
.end method

.method public declared-synchronized clear()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->d()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

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
    iget-object v3, p0, Lio/objectbox/relation/ToMany;->g:Ljava/util/Map;

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
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->f:Ljava/util/Map;

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
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->e:Ljava/util/Map;

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
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

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

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

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

.method public final d()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->f:Ljava/util/Map;

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    monitor-enter p0

    .line 9
    :try_start_0
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->f:Ljava/util/Map;

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
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->f:Ljava/util/Map;

    .line 19
    .line 20
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->g:Ljava/util/Map;

    .line 26
    .line 27
    new-instance v0, Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->e:Ljava/util/Map;

    .line 33
    .line 34
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

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
    iget-object v2, p0, Lio/objectbox/relation/ToMany;->e:Ljava/util/Map;

    .line 51
    .line 52
    sget-object v3, Lio/objectbox/relation/ToMany;->o:Ljava/lang/Integer;

    .line 53
    .line 54
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/lang/Integer;

    .line 59
    .line 60
    if-eqz v2, :cond_0

    .line 61
    .line 62
    iget-object v3, p0, Lio/objectbox/relation/ToMany;->e:Ljava/util/Map;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    monitor-exit p0

    .line 81
    return-void

    .line 82
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    throw v0

    .line 84
    :cond_2
    return-void
.end method

.method public e(J)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 11
    .line 12
    iget-object v1, v1, Lio/objectbox/relation/RelationInfo;->b:Lio/objectbox/EntityInfo;

    .line 13
    .line 14
    invoke-interface {v1}, Lio/objectbox/EntityInfo;->getIdGetter()Ln6/c;

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
    invoke-interface {v1, v4}, Ln6/c;->getId(Ljava/lang/Object;)J

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

.method public g()Lio/objectbox/relation/ListFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->c:Lio/objectbox/relation/ListFactory;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->c:Lio/objectbox/relation/ListFactory;

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
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->c:Lio/objectbox/relation/ListFactory;

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

.method public get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

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

.method public h()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->f:Ljava/util/Map;

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
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->g:Ljava/util/Map;

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

.method public i(J)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 11
    .line 12
    iget-object v1, v1, Lio/objectbox/relation/RelationInfo;->b:Lio/objectbox/EntityInfo;

    .line 13
    .line 14
    invoke-interface {v1}, Lio/objectbox/EntityInfo;->getIdGetter()Ln6/c;

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
    invoke-interface {v1, v5}, Ln6/c;->getId(Ljava/lang/Object;)J

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

.method public indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

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

.method public isEmpty()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

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

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

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

.method public j(Lio/objectbox/Cursor;Lio/objectbox/Cursor;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    iget-object v2, v1, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 6
    .line 7
    iget v3, v2, Lio/objectbox/relation/RelationInfo;->i:I

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
    iget-object v2, v2, Lio/objectbox/relation/RelationInfo;->b:Lio/objectbox/EntityInfo;

    .line 16
    .line 17
    invoke-interface {v2}, Lio/objectbox/EntityInfo;->getIdGetter()Ln6/c;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    monitor-enter p0

    .line 22
    const-wide/16 v7, 0x0

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz v3, :cond_6

    .line 26
    .line 27
    :try_start_0
    iget-object v5, v1, Lio/objectbox/relation/ToMany;->f:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    :cond_1
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    if-eqz v9, :cond_2

    .line 42
    .line 43
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    invoke-interface {v6, v9}, Ln6/c;->getId(Ljava/lang/Object;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v10

    .line 51
    cmp-long v10, v10, v7

    .line 52
    .line 53
    if-nez v10, :cond_1

    .line 54
    .line 55
    iget-object v10, v1, Lio/objectbox/relation/ToMany;->h:Ljava/util/List;

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
    goto/16 :goto_8

    .line 63
    .line 64
    :cond_2
    iget-boolean v5, v1, Lio/objectbox/relation/ToMany;->m:Z

    .line 65
    .line 66
    if-eqz v5, :cond_3

    .line 67
    .line 68
    iget-object v5, v1, Lio/objectbox/relation/ToMany;->i:Ljava/util/List;

    .line 69
    .line 70
    iget-object v9, v1, Lio/objectbox/relation/ToMany;->g:Ljava/util/Map;

    .line 71
    .line 72
    invoke-interface {v9}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    invoke-interface {v5, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 77
    .line 78
    .line 79
    :cond_3
    iget-object v5, v1, Lio/objectbox/relation/ToMany;->f:Ljava/util/Map;

    .line 80
    .line 81
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-nez v5, :cond_4

    .line 86
    .line 87
    iget-object v5, v1, Lio/objectbox/relation/ToMany;->f:Ljava/util/Map;

    .line 88
    .line 89
    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-interface {v5}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    iget-object v9, v1, Lio/objectbox/relation/ToMany;->f:Ljava/util/Map;

    .line 98
    .line 99
    invoke-interface {v9}, Ljava/util/Map;->clear()V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    move-object v5, v2

    .line 104
    :goto_2
    iget-object v9, v1, Lio/objectbox/relation/ToMany;->g:Ljava/util/Map;

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
    iget-object v10, v1, Lio/objectbox/relation/ToMany;->g:Ljava/util/Map;

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
    iget-object v10, v1, Lio/objectbox/relation/ToMany;->g:Ljava/util/Map;

    .line 124
    .line 125
    invoke-interface {v10}, Ljava/util/Map;->clear()V

    .line 126
    .line 127
    .line 128
    move-object/from16 v16, v9

    .line 129
    .line 130
    move-object v9, v5

    .line 131
    move-object/from16 v5, v16

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_5
    move-object v9, v5

    .line 135
    move-object v5, v2

    .line 136
    goto :goto_3

    .line 137
    :cond_6
    move-object v5, v2

    .line 138
    move-object v9, v5

    .line 139
    :goto_3
    iget-object v10, v1, Lio/objectbox/relation/ToMany;->i:Ljava/util/List;

    .line 140
    .line 141
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    if-eqz v10, :cond_7

    .line 146
    .line 147
    move-object v10, v2

    .line 148
    goto :goto_4

    .line 149
    :cond_7
    iget-object v10, v1, Lio/objectbox/relation/ToMany;->i:Ljava/util/List;

    .line 150
    .line 151
    invoke-interface {v10}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    :goto_4
    iget-object v11, v1, Lio/objectbox/relation/ToMany;->i:Ljava/util/List;

    .line 156
    .line 157
    invoke-interface {v11}, Ljava/util/List;->clear()V

    .line 158
    .line 159
    .line 160
    iget-object v11, v1, Lio/objectbox/relation/ToMany;->h:Ljava/util/List;

    .line 161
    .line 162
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    if-eqz v11, :cond_8

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_8
    iget-object v2, v1, Lio/objectbox/relation/ToMany;->h:Ljava/util/List;

    .line 170
    .line 171
    invoke-interface {v2}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    :goto_5
    iget-object v11, v1, Lio/objectbox/relation/ToMany;->h:Ljava/util/List;

    .line 176
    .line 177
    invoke-interface {v11}, Ljava/util/List;->clear()V

    .line 178
    .line 179
    .line 180
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    if-eqz v10, :cond_a

    .line 182
    .line 183
    array-length v11, v10

    .line 184
    move v12, v4

    .line 185
    :goto_6
    if-ge v12, v11, :cond_a

    .line 186
    .line 187
    aget-object v13, v10, v12

    .line 188
    .line 189
    invoke-interface {v6, v13}, Ln6/c;->getId(Ljava/lang/Object;)J

    .line 190
    .line 191
    .line 192
    move-result-wide v13

    .line 193
    cmp-long v15, v13, v7

    .line 194
    .line 195
    if-eqz v15, :cond_9

    .line 196
    .line 197
    invoke-virtual {v0, v13, v14}, Lio/objectbox/Cursor;->deleteEntity(J)Z

    .line 198
    .line 199
    .line 200
    :cond_9
    add-int/lit8 v12, v12, 0x1

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_a
    if-eqz v2, :cond_b

    .line 204
    .line 205
    array-length v10, v2

    .line 206
    :goto_7
    if-ge v4, v10, :cond_b

    .line 207
    .line 208
    aget-object v11, v2, v4

    .line 209
    .line 210
    invoke-virtual {v0, v11}, Lio/objectbox/Cursor;->put(Ljava/lang/Object;)J

    .line 211
    .line 212
    .line 213
    add-int/lit8 v4, v4, 0x1

    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_b
    if-eqz v3, :cond_e

    .line 217
    .line 218
    iget-object v0, v1, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 219
    .line 220
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->a:Lio/objectbox/EntityInfo;

    .line 221
    .line 222
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->getIdGetter()Ln6/c;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    iget-object v2, v1, Lio/objectbox/relation/ToMany;->a:Ljava/lang/Object;

    .line 227
    .line 228
    invoke-interface {v0, v2}, Ln6/c;->getId(Ljava/lang/Object;)J

    .line 229
    .line 230
    .line 231
    move-result-wide v3

    .line 232
    cmp-long v0, v3, v7

    .line 233
    .line 234
    if-eqz v0, :cond_d

    .line 235
    .line 236
    if-eqz v5, :cond_c

    .line 237
    .line 238
    move-object/from16 v2, p1

    .line 239
    .line 240
    invoke-virtual/range {v1 .. v6}, Lio/objectbox/relation/ToMany;->o(Lio/objectbox/Cursor;JLjava/util/List;Ln6/c;)V

    .line 241
    .line 242
    .line 243
    :cond_c
    if-eqz v9, :cond_e

    .line 244
    .line 245
    move-object/from16 v1, p0

    .line 246
    .line 247
    move-object/from16 v2, p1

    .line 248
    .line 249
    move-object v5, v9

    .line 250
    invoke-virtual/range {v1 .. v6}, Lio/objectbox/relation/ToMany;->a(Lio/objectbox/Cursor;J[Ljava/lang/Object;Ln6/c;)V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 255
    .line 256
    const-string v1, "Source entity has no ID (should have been put before)"

    .line 257
    .line 258
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v0

    .line 262
    :cond_e
    return-void

    .line 263
    :goto_8
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 264
    throw v0
.end method

.method public k()Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    monitor-enter p0

    .line 10
    :try_start_0
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->h:Ljava/util/List;

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
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->h:Ljava/util/List;

    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lio/objectbox/relation/ToMany;->i:Ljava/util/List;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    move-object v2, p0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 34
    .line 35
    iget v1, v0, Lio/objectbox/relation/RelationInfo;->i:I

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    return v0

    .line 41
    :cond_2
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->a:Lio/objectbox/EntityInfo;

    .line 42
    .line 43
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->getIdGetter()Ln6/c;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->a:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-interface {v0, v1}, Ln6/c;->getId(Ljava/lang/Object;)J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    const-wide/16 v0, 0x0

    .line 54
    .line 55
    cmp-long v0, v3, v0

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 60
    .line 61
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->b:Lio/objectbox/EntityInfo;

    .line 62
    .line 63
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->getIdGetter()Ln6/c;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    iget-object v6, p0, Lio/objectbox/relation/ToMany;->f:Ljava/util/Map;

    .line 68
    .line 69
    iget-object v7, p0, Lio/objectbox/relation/ToMany;->g:Ljava/util/Map;

    .line 70
    .line 71
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 72
    .line 73
    iget v0, v0, Lio/objectbox/relation/RelationInfo;->d:I

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    move-object v2, p0

    .line 78
    invoke-virtual/range {v2 .. v7}, Lio/objectbox/relation/ToMany;->l(JLn6/c;Ljava/util/Map;Ljava/util/Map;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    return v0

    .line 83
    :cond_3
    move-object v2, p0

    .line 84
    invoke-virtual/range {v2 .. v7}, Lio/objectbox/relation/ToMany;->m(JLn6/c;Ljava/util/Map;Ljava/util/Map;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    return v0

    .line 89
    :cond_4
    move-object v2, p0

    .line 90
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 91
    .line 92
    const-string v1, "Source entity has no ID (should have been put before)"

    .line 93
    .line 94
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v0

    .line 98
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    throw v0

    .line 100
    :catchall_1
    move-exception v0

    .line 101
    goto :goto_1
.end method

.method public final l(JLn6/c;Ljava/util/Map;Ljava/util/Map;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 2
    .line 3
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->h:Lio/objectbox/internal/ToManyGetter;

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    if-eqz p4, :cond_4

    .line 9
    .line 10
    :try_start_0
    invoke-interface {p4}, Ljava/util/Map;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-nez v3, :cond_4

    .line 15
    .line 16
    invoke-interface {p4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_3

    .line 29
    .line 30
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-interface {v0, v4}, Lio/objectbox/internal/ToManyGetter;->getToMany(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, Lio/objectbox/relation/ToMany;

    .line 39
    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    invoke-virtual {v5, p1, p2}, Lio/objectbox/relation/ToMany;->e(J)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    if-nez v6, :cond_1

    .line 47
    .line 48
    iget-object v6, p0, Lio/objectbox/relation/ToMany;->a:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-virtual {v5, v6}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    iget-object v5, p0, Lio/objectbox/relation/ToMany;->h:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_1
    invoke-interface {p3, v4}, Ln6/c;->getId(Ljava/lang/Object;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v5

    .line 66
    cmp-long v5, v5, v1

    .line 67
    .line 68
    if-nez v5, :cond_0

    .line 69
    .line 70
    iget-object v5, p0, Lio/objectbox/relation/ToMany;->h:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    new-instance p2, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string p3, "The ToMany property for "

    .line 84
    .line 85
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object p3, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 89
    .line 90
    iget-object p3, p3, Lio/objectbox/relation/RelationInfo;->b:Lio/objectbox/EntityInfo;

    .line 91
    .line 92
    invoke-interface {p3}, Lio/objectbox/EntityInfo;->getEntityName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string p3, " is null"

    .line 100
    .line 101
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_3
    invoke-interface {p4}, Ljava/util/Map;->clear()V

    .line 113
    .line 114
    .line 115
    :cond_4
    if-eqz p5, :cond_8

    .line 116
    .line 117
    invoke-interface {p5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 118
    .line 119
    .line 120
    move-result-object p4

    .line 121
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object p4

    .line 125
    :cond_5
    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_7

    .line 130
    .line 131
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-interface {v0, v3}, Lio/objectbox/internal/ToManyGetter;->getToMany(Ljava/lang/Object;)Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    check-cast v4, Lio/objectbox/relation/ToMany;

    .line 140
    .line 141
    invoke-virtual {v4, p1, p2}, Lio/objectbox/relation/ToMany;->e(J)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    if-eqz v5, :cond_5

    .line 146
    .line 147
    invoke-virtual {v4, p1, p2}, Lio/objectbox/relation/ToMany;->n(J)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    invoke-interface {p3, v3}, Ln6/c;->getId(Ljava/lang/Object;)J

    .line 151
    .line 152
    .line 153
    move-result-wide v4

    .line 154
    cmp-long v4, v4, v1

    .line 155
    .line 156
    if-eqz v4, :cond_5

    .line 157
    .line 158
    iget-boolean v4, p0, Lio/objectbox/relation/ToMany;->m:Z

    .line 159
    .line 160
    if-eqz v4, :cond_6

    .line 161
    .line 162
    iget-object v4, p0, Lio/objectbox/relation/ToMany;->i:Ljava/util/List;

    .line 163
    .line 164
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_6
    iget-object v4, p0, Lio/objectbox/relation/ToMany;->h:Ljava/util/List;

    .line 169
    .line 170
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_7
    invoke-interface {p5}, Ljava/util/Map;->clear()V

    .line 175
    .line 176
    .line 177
    :cond_8
    iget-object p1, p0, Lio/objectbox/relation/ToMany;->h:Ljava/util/List;

    .line 178
    .line 179
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    if-eqz p1, :cond_a

    .line 184
    .line 185
    iget-object p1, p0, Lio/objectbox/relation/ToMany;->i:Ljava/util/List;

    .line 186
    .line 187
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-nez p1, :cond_9

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_9
    const/4 p1, 0x0

    .line 195
    goto :goto_3

    .line 196
    :cond_a
    :goto_2
    const/4 p1, 0x1

    .line 197
    :goto_3
    monitor-exit p0

    .line 198
    return p1

    .line 199
    :goto_4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 200
    throw p1
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

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

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    return-object p1
.end method

.method public final m(JLn6/c;Ljava/util/Map;Ljava/util/Map;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 2
    .line 3
    iget-object v0, v0, Lio/objectbox/relation/RelationInfo;->g:Lio/objectbox/internal/ToOneGetter;

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    if-eqz p4, :cond_4

    .line 9
    .line 10
    :try_start_0
    invoke-interface {p4}, Ljava/util/Map;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-nez v3, :cond_4

    .line 15
    .line 16
    invoke-interface {p4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_3

    .line 29
    .line 30
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-interface {v0, v4}, Lio/objectbox/internal/ToOneGetter;->getToOne(Ljava/lang/Object;)Lio/objectbox/relation/ToOne;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    invoke-virtual {v5}, Lio/objectbox/relation/ToOne;->e()J

    .line 41
    .line 42
    .line 43
    move-result-wide v6

    .line 44
    cmp-long v6, v6, p1

    .line 45
    .line 46
    if-eqz v6, :cond_1

    .line 47
    .line 48
    iget-object v6, p0, Lio/objectbox/relation/ToMany;->a:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-virtual {v5, v6}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v5, p0, Lio/objectbox/relation/ToMany;->h:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_1
    invoke-interface {p3, v4}, Ln6/c;->getId(Ljava/lang/Object;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v5

    .line 66
    cmp-long v5, v5, v1

    .line 67
    .line 68
    if-nez v5, :cond_0

    .line 69
    .line 70
    iget-object v5, p0, Lio/objectbox/relation/ToMany;->h:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    new-instance p2, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string p3, "The ToOne property for "

    .line 84
    .line 85
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object p3, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 89
    .line 90
    iget-object p3, p3, Lio/objectbox/relation/RelationInfo;->b:Lio/objectbox/EntityInfo;

    .line 91
    .line 92
    invoke-interface {p3}, Lio/objectbox/EntityInfo;->getEntityName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string p3, "."

    .line 100
    .line 101
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget-object p3, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 105
    .line 106
    iget-object p3, p3, Lio/objectbox/relation/RelationInfo;->c:Lio/objectbox/Property;

    .line 107
    .line 108
    iget-object p3, p3, Lio/objectbox/Property;->e:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string p3, " is null"

    .line 114
    .line 115
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p1

    .line 126
    :cond_3
    invoke-interface {p4}, Ljava/util/Map;->clear()V

    .line 127
    .line 128
    .line 129
    :cond_4
    if-eqz p5, :cond_8

    .line 130
    .line 131
    invoke-interface {p5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 132
    .line 133
    .line 134
    move-result-object p4

    .line 135
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object p4

    .line 139
    :cond_5
    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_7

    .line 144
    .line 145
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-interface {v0, v3}, Lio/objectbox/internal/ToOneGetter;->getToOne(Ljava/lang/Object;)Lio/objectbox/relation/ToOne;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {v4}, Lio/objectbox/relation/ToOne;->e()J

    .line 154
    .line 155
    .line 156
    move-result-wide v5

    .line 157
    cmp-long v5, v5, p1

    .line 158
    .line 159
    if-nez v5, :cond_5

    .line 160
    .line 161
    const/4 v5, 0x0

    .line 162
    invoke-virtual {v4, v5}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-interface {p3, v3}, Ln6/c;->getId(Ljava/lang/Object;)J

    .line 166
    .line 167
    .line 168
    move-result-wide v4

    .line 169
    cmp-long v4, v4, v1

    .line 170
    .line 171
    if-eqz v4, :cond_5

    .line 172
    .line 173
    iget-boolean v4, p0, Lio/objectbox/relation/ToMany;->m:Z

    .line 174
    .line 175
    if-eqz v4, :cond_6

    .line 176
    .line 177
    iget-object v4, p0, Lio/objectbox/relation/ToMany;->i:Ljava/util/List;

    .line 178
    .line 179
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_6
    iget-object v4, p0, Lio/objectbox/relation/ToMany;->h:Ljava/util/List;

    .line 184
    .line 185
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_7
    invoke-interface {p5}, Ljava/util/Map;->clear()V

    .line 190
    .line 191
    .line 192
    :cond_8
    iget-object p1, p0, Lio/objectbox/relation/ToMany;->h:Ljava/util/List;

    .line 193
    .line 194
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    if-eqz p1, :cond_a

    .line 199
    .line 200
    iget-object p1, p0, Lio/objectbox/relation/ToMany;->i:Ljava/util/List;

    .line 201
    .line 202
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    if-nez p1, :cond_9

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_9
    const/4 p1, 0x0

    .line 210
    goto :goto_3

    .line 211
    :cond_a
    :goto_2
    const/4 p1, 0x1

    .line 212
    :goto_3
    monitor-exit p0

    .line 213
    return p1

    .line 214
    :goto_4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    throw p1
.end method

.method public declared-synchronized n(J)Ljava/lang/Object;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 12
    .line 13
    iget-object v1, v1, Lio/objectbox/relation/RelationInfo;->b:Lio/objectbox/EntityInfo;

    .line 14
    .line 15
    invoke-interface {v1}, Lio/objectbox/EntityInfo;->getIdGetter()Ln6/c;

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
    iget-object v3, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-interface {v1, v3}, Ln6/c;->getId(Ljava/lang/Object;)J

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

.method public final o(Lio/objectbox/Cursor;JLjava/util/List;Ln6/c;)V
    .locals 7

    .line 1
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {p5, v1}, Ln6/c;->getId(Ljava/lang/Object;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    const-wide/16 v3, 0x0

    .line 20
    .line 21
    cmp-long v1, v1, v3

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-interface {p4}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-lez v0, :cond_3

    .line 34
    .line 35
    new-array v5, v0, [J

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    :goto_1
    if-ge v1, v0, :cond_2

    .line 39
    .line 40
    invoke-interface {p4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {p5, v2}, Ln6/c;->getId(Ljava/lang/Object;)J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    aput-wide v2, v5, v1

    .line 49
    .line 50
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    iget-object p4, p0, Lio/objectbox/relation/ToMany;->b:Lio/objectbox/relation/RelationInfo;

    .line 54
    .line 55
    iget v2, p4, Lio/objectbox/relation/RelationInfo;->i:I

    .line 56
    .line 57
    const/4 v6, 0x1

    .line 58
    move-object v1, p1

    .line 59
    move-wide v3, p2

    .line 60
    invoke-virtual/range {v1 .. v6}, Lio/objectbox/Cursor;->modifyRelations(IJ[JZ)V

    .line 61
    .line 62
    .line 63
    :cond_3
    return-void
.end method

.method public final p(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->e:Ljava/util/Map;

    .line 5
    .line 6
    sget-object v1, Lio/objectbox/relation/ToMany;->o:Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Integer;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->e:Ljava/util/Map;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->f:Ljava/util/Map;

    .line 32
    .line 33
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->g:Ljava/util/Map;

    .line 39
    .line 40
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final q(Ljava/util/Collection;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->d()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Lio/objectbox/relation/ToMany;->p(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public final r(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->e:Ljava/util/Map;

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
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->e:Ljava/util/Map;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->f:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->g:Ljava/util/Map;

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
    iget-object v1, p0, Lio/objectbox/relation/ToMany;->e:Ljava/util/Map;

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
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v2, "Illegal count: "

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1

    .line 83
    :cond_2
    return-void
.end method

.method public declared-synchronized remove(I)Ljava/lang/Object;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->d()V

    .line 2
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    .line 3
    invoke-virtual {p0, p1}, Lio/objectbox/relation/ToMany;->r(Ljava/lang/Object;)V
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
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->d()V

    .line 6
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {p0, p1}, Lio/objectbox/relation/ToMany;->r(Ljava/lang/Object;)V
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

.method public declared-synchronized retainAll(Ljava/util/Collection;)Z
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->d()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

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

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->d()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Lio/objectbox/relation/ToMany;->r(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p2}, Lio/objectbox/relation/ToMany;->p(Ljava/lang/Object;)V
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

.method public size()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

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

.method public subList(II)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

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

    .line 1
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 2
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->c()V

    .line 4
    iget-object v0, p0, Lio/objectbox/relation/ToMany;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
