# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lio/objectbox/annotation/Entity;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0007\u0018\u00002\u00020\u0001B9\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\"\u0010\t\u001a\u00020\u00088\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\u001f\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u001a\u001a\u0004\u0008$\u0010\u001c\"\u0004\u0008%\u0010\u001e\u00a8\u0006&"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
        "",
        "",
        "id",
        "",
        "lineColor",
        "",
        "lineSpace",
        "Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;",
        "lineType",
        "lineWidth",
        "<init>",
        "(JIFLcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;F)V",
        "Ld6/s;",
        "put",
        "()V",
        "J",
        "getId",
        "()J",
        "setId",
        "(J)V",
        "I",
        "getLineColor",
        "()I",
        "setLineColor",
        "(I)V",
        "F",
        "getLineSpace",
        "()F",
        "setLineSpace",
        "(F)V",
        "Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;",
        "getLineType",
        "()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;",
        "setLineType",
        "(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)V",
        "getLineWidth",
        "setLineWidth",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private id:J
    .annotation build Lio/objectbox/annotation/Id;
    .end annotation
.end field

.field private lineColor:I

.field private lineSpace:F

.field private lineType:Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;
    .annotation build Lio/objectbox/annotation/Convert;
        converter = Lcom/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter;
        dbType = I
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

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

    invoke-direct/range {v0 .. v8}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;-><init>(JIFLcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;FILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(JIFLcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;F)V
    .locals 1
    .param p5    # Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "lineType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public synthetic constructor <init>(JIFLcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;FILkotlin/jvm/internal/e;)V
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
    sget-object p5, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->HORIZONTAL:Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

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
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

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
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p0}, Lio/objectbox/a;->e(Ljava/lang/Object;)J

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
    .param p1    # Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
