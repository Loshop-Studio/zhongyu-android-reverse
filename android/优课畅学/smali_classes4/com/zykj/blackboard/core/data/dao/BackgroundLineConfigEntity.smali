# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lio/objectbox/annotation/Entity;
.end annotation


# instance fields
.field private id:J

.field private lineColor:I

.field private lineSpace:F

.field private lineType:Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

.field private lineWidth:F


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x1f

    const/4 v8, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;-><init>(JIFLcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;FILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(JIFLcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;F)V
    .locals 1

    const-string v0, "lineType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->id:J

    .line 4
    iput p3, p0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->lineColor:I

    .line 5
    iput p4, p0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->lineSpace:F

    .line 6
    iput-object p5, p0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->lineType:Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 7
    iput p6, p0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->lineWidth:F

    return-void
.end method

.method public synthetic constructor <init>(JIFLcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;FILkotlin/jvm/internal/n;)V
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    const/4 p3, 0x0

    :cond_1
    move v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    const/high16 p4, 0x41a00000    # 20.0f

    :cond_2
    move v4, p4

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    .line 8
    sget-object p5, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->b:Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    const/high16 p6, 0x40400000    # 3.0f

    :cond_4
    move-object v0, p0

    move v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;-><init>(JIFLcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;F)V

    return-void
.end method


# virtual methods
.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getLineColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->lineColor:I

    .line 2
    .line 3
    return v0
.end method

.method public final getLineSpace()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->lineSpace:F

    .line 2
    .line 3
    return v0
.end method

.method public final getLineType()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->lineType:Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLineWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->lineWidth:F

    .line 2
    .line 3
    return v0
.end method

.method public final put()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->d(Ljava/lang/Class;)Lio/objectbox/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p0}, Lio/objectbox/a;->l(Ljava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->id:J

    .line 2
    .line 3
    return-void
.end method

.method public final setLineColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->lineColor:I

    .line 2
    .line 3
    return-void
.end method

.method public final setLineSpace(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->lineSpace:F

    .line 2
    .line 3
    return-void
.end method

.method public final setLineType(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->lineType:Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 7
    .line 8
    return-void
.end method

.method public final setLineWidth(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->lineWidth:F

    .line 2
    .line 3
    return-void
.end method
