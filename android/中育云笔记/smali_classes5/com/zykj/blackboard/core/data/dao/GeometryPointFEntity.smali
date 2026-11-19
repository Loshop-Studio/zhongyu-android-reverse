# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lio/objectbox/annotation/Entity;
.end annotation


# instance fields
.field transient __boxStore:Lio/objectbox/BoxStore;

.field private id:J

.field public record:Lio/objectbox/relation/ToOne;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToOne<",
            "Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field private x:F

.field private y:F


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

    invoke-direct/range {v0 .. v6}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;-><init>(JFFILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(JFF)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/objectbox/relation/ToOne;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->m:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToOne;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->record:Lio/objectbox/relation/ToOne;

    .line 3
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->id:J

    .line 4
    iput p3, p0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->x:F

    .line 5
    iput p4, p0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->y:F

    return-void
.end method

.method public synthetic constructor <init>(JFFILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    move p4, v0

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;-><init>(JFF)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()Lio/objectbox/relation/ToOne;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->record:Lio/objectbox/relation/ToOne;

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

.method public final c()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->x:F

    .line 2
    .line 3
    return v0
.end method

.method public final d()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->y:F

    .line 2
    .line 3
    return v0
.end method

.method public final e()V
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
    const-class v1, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;

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

.method public final f(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->id:J

    .line 2
    .line 3
    return-void
.end method
