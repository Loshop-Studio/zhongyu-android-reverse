# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lio/objectbox/annotation/Entity;
.end annotation


# instance fields
.field transient __boxStore:Lio/objectbox/BoxStore;

.field private color:I

.field private id:J

.field private itemLength:F

.field public record:Lio/objectbox/relation/ToOne;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToOne<",
            "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
            ">;"
        }
    .end annotation
.end field

.field private spacing:F

.field private style:I

.field private textSize:F

.field public touchInfoList:Lio/objectbox/relation/ToMany;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToMany<",
            "Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field private width:F


# direct methods
.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0x7f

    const/4 v10, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;-><init>(JFIFFIFILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(JFIFFIF)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/objectbox/relation/ToMany;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->r:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToMany;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->touchInfoList:Lio/objectbox/relation/ToMany;

    new-instance v0, Lio/objectbox/relation/ToOne;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->q:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToOne;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->record:Lio/objectbox/relation/ToOne;

    .line 3
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->id:J

    .line 4
    iput p3, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->width:F

    .line 5
    iput p4, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->color:I

    .line 6
    iput p5, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->spacing:F

    .line 7
    iput p6, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->itemLength:F

    .line 8
    iput p7, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->style:I

    .line 9
    iput p8, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->textSize:F

    return-void
.end method

.method public synthetic constructor <init>(JFIFFIFILkotlin/jvm/internal/n;)V
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p9, 0x2

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    move v3, p2

    goto :goto_0

    :cond_1
    move v3, p3

    :goto_0
    and-int/lit8 p1, p9, 0x4

    const/4 p3, 0x0

    if-eqz p1, :cond_2

    move v4, p3

    goto :goto_1

    :cond_2
    move v4, p4

    :goto_1
    and-int/lit8 p1, p9, 0x8

    if-eqz p1, :cond_3

    move v5, p2

    goto :goto_2

    :cond_3
    move v5, p5

    :goto_2
    and-int/lit8 p1, p9, 0x10

    if-eqz p1, :cond_4

    move v6, p2

    goto :goto_3

    :cond_4
    move v6, p6

    :goto_3
    and-int/lit8 p1, p9, 0x20

    if-eqz p1, :cond_5

    move v7, p3

    goto :goto_4

    :cond_5
    move/from16 v7, p7

    :goto_4
    and-int/lit8 p1, p9, 0x40

    if-eqz p1, :cond_6

    move v8, p2

    :goto_5
    move-object v0, p0

    goto :goto_6

    :cond_6
    move/from16 v8, p8

    goto :goto_5

    .line 10
    :goto_6
    invoke-direct/range {v0 .. v8}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;-><init>(JFIFFIF)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->color:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->itemLength:F

    .line 2
    .line 3
    return v0
.end method

.method public final d()Lio/objectbox/relation/ToOne;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->record:Lio/objectbox/relation/ToOne;

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

.method public final e()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->spacing:F

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
    instance-of v1, p1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    iget-wide v3, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->id:J

    iget-wide v5, p1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->width:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->width:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->color:I

    iget v3, p1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->color:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->spacing:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->spacing:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->itemLength:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->itemLength:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->style:I

    iget v3, p1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->style:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->textSize:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget p1, p1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->textSize:F

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->style:I

    .line 2
    .line 3
    return v0
.end method

.method public final g()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->textSize:F

    .line 2
    .line 3
    return v0
.end method

.method public final h()Lio/objectbox/relation/ToMany;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->touchInfoList:Lio/objectbox/relation/ToMany;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "touchInfoList"

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

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->width:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->color:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->spacing:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->itemLength:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->style:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->textSize:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->width:F

    .line 2
    .line 3
    return v0
.end method

.method public final j()V
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
    const-class v1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

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

.method public final k(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->id:J

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TouchEventEntity(id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->id:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->width:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", color="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->color:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", spacing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->spacing:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", itemLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->itemLength:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->style:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", textSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->textSize:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
