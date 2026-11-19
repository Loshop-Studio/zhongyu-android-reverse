# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lio/objectbox/annotation/Entity;
.end annotation


# instance fields
.field transient __boxStore:Lio/objectbox/BoxStore;

.field private dir:Ljava/lang/String;

.field private id:J

.field public pages:Lio/objectbox/relation/ToMany;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x3

    const/4 v5, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;-><init>(JLjava/lang/String;ILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/objectbox/relation/ToMany;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->k:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToMany;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->pages:Lio/objectbox/relation/ToMany;

    .line 3
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->id:J

    .line 4
    iput-object p3, p0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->dir:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;-><init>(JLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->dir:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c()Lio/objectbox/relation/ToMany;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->pages:Lio/objectbox/relation/ToMany;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "pages"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->dir:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lna/d;->a:Lna/d;

    .line 6
    .line 7
    invoke-virtual {v0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :try_start_0
    invoke-virtual {v0, p0}, Ljc/a;->m(Ljava/lang/Object;)J
    :try_end_0
    .catch Lio/objectbox/exception/UniqueViolationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    const-string v1, "box"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljc/a;->o()Lio/objectbox/query/QueryBuilder;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "builder"

    .line 31
    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sget-object v2, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->h:Lio/objectbox/Property;

    .line 36
    .line 37
    iget-object v3, p0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->dir:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2, v3}, Lio/objectbox/query/QueryBuilder;->g(Lio/objectbox/Property;Ljava/lang/String;)Lio/objectbox/query/QueryBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lio/objectbox/query/QueryBuilder;->e()Lio/objectbox/query/Query;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "builder.build()"

    .line 50
    .line 51
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lio/objectbox/query/Query;->l()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-string v2, "box.query {\n            \u2026\n                }.find()"

    .line 59
    .line 60
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    check-cast v1, Ljava/util/Collection;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljc/a;->s(Ljava/util/Collection;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljc/a;->m(Ljava/lang/Object;)J

    .line 69
    .line 70
    .line 71
    :cond_0
    :goto_0
    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->dir:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    iget-wide v3, p0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->id:J

    iget-wide v5, p1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->dir:Ljava/lang/String;

    iget-object p1, p1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->dir:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final f(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->id:J

    .line 2
    .line 3
    return-void
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->dir:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BlackBoardEntity(id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->id:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", dir="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->dir:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
