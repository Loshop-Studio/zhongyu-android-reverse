# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lio/objectbox/annotation/Entity;
.end annotation


# instance fields
.field transient __boxStore:Lio/objectbox/BoxStore;

.field private fileName:Ljava/lang/String;

.field private id:J

.field public record:Lio/objectbox/relation/ToOne;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToOne<",
            "Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
            ">;"
        }
    .end annotation
.end field

.field public textInfoEntityList:Lio/objectbox/relation/ToMany;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field private validate:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/4 v5, 0x7

    const/4 v6, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "fileName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/objectbox/relation/ToMany;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity_;->n:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToMany;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->textInfoEntityList:Lio/objectbox/relation/ToMany;

    new-instance v0, Lio/objectbox/relation/ToOne;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity_;->m:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToOne;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->record:Lio/objectbox/relation/ToOne;

    .line 3
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->id:J

    .line 4
    iput-object p3, p0, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->fileName:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->validate:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 6
    const-string v0, ""

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    move-object p4, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->fileName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c()Lio/objectbox/relation/ToMany;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->textInfoEntityList:Lio/objectbox/relation/ToMany;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "textInfoEntityList"

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

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->validate:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()V
    .locals 4

    .line 1
    sget-object v0, Lna/d;->a:Lna/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :try_start_0
    invoke-virtual {v0, p0}, Ljc/a;->m(Ljava/lang/Object;)J
    :try_end_0
    .catch Lio/objectbox/exception/UniqueViolationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    const-string v1, "box"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljc/a;->o()Lio/objectbox/query/QueryBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "builder"

    .line 27
    .line 28
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object v2, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity_;->h:Lio/objectbox/Property;

    .line 32
    .line 33
    iget-object v3, p0, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->fileName:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v1, v2, v3}, Lio/objectbox/query/QueryBuilder;->g(Lio/objectbox/Property;Ljava/lang/String;)Lio/objectbox/query/QueryBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lio/objectbox/query/QueryBuilder;->e()Lio/objectbox/query/Query;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "builder.build()"

    .line 43
    .line 44
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Lio/objectbox/query/Query;->l()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v2, "box.query {\n            \u2026ame)\n            }.find()"

    .line 52
    .line 53
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    check-cast v1, Ljava/util/Collection;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljc/a;->s(Ljava/util/Collection;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p0}, Ljc/a;->m(Ljava/lang/Object;)J

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final f(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->id:J

    .line 2
    .line 3
    return-void
.end method

.method public final g(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->validate:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method
