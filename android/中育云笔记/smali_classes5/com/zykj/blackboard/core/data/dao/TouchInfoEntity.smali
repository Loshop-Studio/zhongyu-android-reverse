# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lio/objectbox/annotation/Entity;
.end annotation


# instance fields
.field transient __boxStore:Lio/objectbox/BoxStore;

.field private eventTime:J

.field private id:J

.field public record:Lio/objectbox/relation/ToOne;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToOne<",
            "Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;",
            ">;"
        }
    .end annotation
.end field

.field private x:F

.field private y:F


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0xf

    const/4 v8, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;-><init>(JJFFILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(JJFF)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/objectbox/relation/ToOne;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->n:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToOne;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->record:Lio/objectbox/relation/ToOne;

    .line 3
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->id:J

    .line 4
    iput-wide p3, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->eventTime:J

    .line 5
    iput p5, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->x:F

    .line 6
    iput p6, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->y:F

    return-void
.end method

.method public synthetic constructor <init>(JJFFILkotlin/jvm/internal/n;)V
    .locals 2

    and-int/lit8 p8, p7, 0x1

    const-wide/16 v0, 0x0

    if-eqz p8, :cond_0

    move-wide p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    move-wide p3, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    const/4 v0, 0x0

    if-eqz p8, :cond_2

    move p5, v0

    :cond_2
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_3

    move p7, v0

    :goto_0
    move p6, p5

    move-wide p4, p3

    move-wide p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move p7, p6

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p7}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;-><init>(JJFF)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->eventTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c()Lio/objectbox/relation/ToOne;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->record:Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "record"

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

.method public final d()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->x:F

    .line 2
    .line 3
    return v0
.end method

.method public final e()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->y:F

    .line 2
    .line 3
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    iget-wide v3, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->id:J

    iget-wide v5, p1, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->eventTime:J

    iget-wide v5, p1, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->eventTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->x:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->x:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->y:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget p1, p1, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->y:F

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()V
    .locals 2

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
    const-class v1, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p0}, Ljc/a;->m(Ljava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final g(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->id:J

    .line 2
    .line 3
    return-void
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->eventTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->x:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->y:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TouchInfoEntity(id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->id:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", eventTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->eventTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", x="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->x:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", y="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->y:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
