# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lio/objectbox/annotation/Entity;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001c\u0008\u0007\u0018\u00002\u00020\u0001BW\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u001b\u001a\u0004\u0008\u0005\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u001b\u001a\u0004\u0008\u001f\u0010\u001c\"\u0004\u0008 \u0010\u001eR\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u001b\u001a\u0004\u0008!\u0010\u001c\"\u0004\u0008\"\u0010\u001eR\"\u0010\u0008\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\u001b\u001a\u0004\u0008#\u0010\u001c\"\u0004\u0008$\u0010\u001eR\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\u001b\u001a\u0004\u0008%\u0010\u001c\"\u0004\u0008&\u0010\u001eR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\'\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R\"\u0010\u000c\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\'\u001a\u0004\u0008,\u0010)\"\u0004\u0008-\u0010+\u00a8\u0006."
    }
    d2 = {
        "Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;",
        "",
        "",
        "id",
        "",
        "isEnable",
        "verticalTranslate",
        "horizontalTranslate",
        "scale",
        "rotate",
        "",
        "maxHeightTimes",
        "maxWidthTimes",
        "<init>",
        "(JZZZZZII)V",
        "Ld6/s;",
        "put",
        "()V",
        "Lcom/zykj/blackboard/bean/MoveActionConfig;",
        "moveActionConfig",
        "set",
        "(Lcom/zykj/blackboard/bean/MoveActionConfig;)V",
        "J",
        "getId",
        "()J",
        "setId",
        "(J)V",
        "Z",
        "()Z",
        "setEnable",
        "(Z)V",
        "getVerticalTranslate",
        "setVerticalTranslate",
        "getHorizontalTranslate",
        "setHorizontalTranslate",
        "getScale",
        "setScale",
        "getRotate",
        "setRotate",
        "I",
        "getMaxHeightTimes",
        "()I",
        "setMaxHeightTimes",
        "(I)V",
        "getMaxWidthTimes",
        "setMaxWidthTimes",
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
.field private horizontalTranslate:Z

.field private id:J
    .annotation build Lio/objectbox/annotation/Id;
    .end annotation
.end field

.field private isEnable:Z

.field private maxHeightTimes:I

.field private maxWidthTimes:I

.field private rotate:Z

.field private scale:Z

.field private verticalTranslate:Z


# direct methods
.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0xff

    const/4 v11, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;-><init>(JZZZZZIIILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(JZZZZZII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->id:J

    .line 4
    iput-boolean p3, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->isEnable:Z

    .line 5
    iput-boolean p4, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->verticalTranslate:Z

    .line 6
    iput-boolean p5, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->horizontalTranslate:Z

    .line 7
    iput-boolean p6, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->scale:Z

    .line 8
    iput-boolean p7, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->rotate:Z

    .line 9
    iput p8, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->maxHeightTimes:I

    .line 10
    iput p9, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->maxWidthTimes:I

    return-void
.end method

.method public synthetic constructor <init>(JZZZZZIIILkotlin/jvm/internal/e;)V
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    move v3, p2

    goto :goto_0

    :cond_1
    move v3, p3

    :goto_0
    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    move v4, p2

    goto :goto_1

    :cond_2
    move v4, p4

    :goto_1
    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    move v5, p2

    goto :goto_2

    :cond_3
    move v5, p5

    :goto_2
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    move v6, p2

    goto :goto_3

    :cond_4
    move/from16 v6, p6

    :goto_3
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    move v7, p2

    goto :goto_4

    :cond_5
    move/from16 v7, p7

    :goto_4
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    move v8, p2

    goto :goto_5

    :cond_6
    move/from16 v8, p8

    :goto_5
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    move v9, p2

    :goto_6
    move-object v0, p0

    goto :goto_7

    :cond_7
    move/from16 v9, p9

    goto :goto_6

    .line 11
    :goto_7
    invoke-direct/range {v0 .. v9}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;-><init>(JZZZZZII)V

    return-void
.end method


# virtual methods
.method public final getHorizontalTranslate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->horizontalTranslate:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getMaxHeightTimes()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->maxHeightTimes:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMaxWidthTimes()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->maxWidthTimes:I

    .line 2
    .line 3
    return v0
.end method

.method public final getRotate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->rotate:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getScale()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->scale:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getVerticalTranslate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->verticalTranslate:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isEnable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->isEnable:Z

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
    const-class v1, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

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

.method public final set(Lcom/zykj/blackboard/bean/MoveActionConfig;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/bean/MoveActionConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "moveActionConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->isEnable:Z

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getVerticalTranslate()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->verticalTranslate:Z

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getHorizontalTranslate()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->horizontalTranslate:Z

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getScale()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->scale:Z

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getRotate()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->rotate:Z

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxWidthTimes()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iput v0, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->maxWidthTimes:I

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxHeightTimes()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iput p1, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->maxHeightTimes:I

    .line 47
    .line 48
    return-void
.end method

.method public final setEnable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->isEnable:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHorizontalTranslate(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->horizontalTranslate:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->id:J

    .line 2
    .line 3
    return-void
.end method

.method public final setMaxHeightTimes(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->maxHeightTimes:I

    .line 2
    .line 3
    return-void
.end method

.method public final setMaxWidthTimes(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->maxWidthTimes:I

    .line 2
    .line 3
    return-void
.end method

.method public final setRotate(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->rotate:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setScale(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->scale:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setVerticalTranslate(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->verticalTranslate:Z

    .line 2
    .line 3
    return-void
.end method
