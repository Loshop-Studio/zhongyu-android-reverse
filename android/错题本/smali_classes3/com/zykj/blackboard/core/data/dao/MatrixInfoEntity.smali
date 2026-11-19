# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lio/objectbox/annotation/Entity;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bu\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0019J\u0010\u0010!\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u0019J~\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00052\u0008\u0008\u0002\u0010\r\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010%\u001a\u00020$H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010(\u001a\u00020\'H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u0016\"\u0004\u00080\u00101R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010.\u001a\u0004\u00082\u0010\u0016\"\u0004\u00083\u00101R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0006\u00104\u001a\u0004\u00085\u0010\u0019\"\u0004\u00086\u00107R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00104\u001a\u0004\u00088\u0010\u0019\"\u0004\u00089\u00107R\"\u0010\u0008\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00104\u001a\u0004\u0008:\u0010\u0019\"\u0004\u0008;\u00107R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u00104\u001a\u0004\u0008<\u0010\u0019\"\u0004\u0008=\u00107R\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u00104\u001a\u0004\u0008>\u0010\u0019\"\u0004\u0008?\u00107R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u00104\u001a\u0004\u0008@\u0010\u0019\"\u0004\u0008A\u00107R\"\u0010\u000c\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u00104\u001a\u0004\u0008B\u0010\u0019\"\u0004\u0008C\u00107R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u00104\u001a\u0004\u0008D\u0010\u0019\"\u0004\u0008E\u00107R\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u00104\u001a\u0004\u0008F\u0010\u0019\"\u0004\u0008G\u00107R(\u0010J\u001a\u0008\u0012\u0004\u0012\u00020I0H8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008J\u0010K\u001a\u0004\u0008L\u0010M\"\u0004\u0008N\u0010O\u00a8\u0006P"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;",
        "",
        "",
        "id",
        "eventTime",
        "",
        "scaleX",
        "skewX",
        "transX",
        "skewY",
        "scaleY",
        "transY",
        "perSp0",
        "perSp1",
        "perSp2",
        "<init>",
        "(JJFFFFFFFFF)V",
        "Ld6/s;",
        "put",
        "()V",
        "remove",
        "component1",
        "()J",
        "component2",
        "component3",
        "()F",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "copy",
        "(JJFFFFFFFFF)Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "J",
        "getId",
        "setId",
        "(J)V",
        "getEventTime",
        "setEventTime",
        "F",
        "getScaleX",
        "setScaleX",
        "(F)V",
        "getSkewX",
        "setSkewX",
        "getTransX",
        "setTransX",
        "getSkewY",
        "setSkewY",
        "getScaleY",
        "setScaleY",
        "getTransY",
        "setTransY",
        "getPerSp0",
        "setPerSp0",
        "getPerSp1",
        "setPerSp1",
        "getPerSp2",
        "setPerSp2",
        "Lio/objectbox/relation/ToOne;",
        "Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;",
        "record",
        "Lio/objectbox/relation/ToOne;",
        "getRecord",
        "()Lio/objectbox/relation/ToOne;",
        "setRecord",
        "(Lio/objectbox/relation/ToOne;)V",
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
.field transient __boxStore:Lio/objectbox/BoxStore;

.field private eventTime:J

.field private id:J
    .annotation build Lio/objectbox/annotation/Id;
    .end annotation
.end field

.field private perSp0:F

.field private perSp1:F

.field private perSp2:F

.field public record:Lio/objectbox/relation/ToOne;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToOne<",
            "Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;",
            ">;"
        }
    .end annotation
.end field

.field private scaleX:F

.field private scaleY:F

.field private skewX:F

.field private skewY:F

.field private transX:F

.field private transY:F


# direct methods
.method public constructor <init>()V
    .locals 16

    .line 1
    const/16 v14, 0x7ff

    const/4 v15, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v15}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;-><init>(JJFFFFFFFFFILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(JJFFFFFFFFF)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/objectbox/relation/ToOne;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->record:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToOne;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->record:Lio/objectbox/relation/ToOne;

    .line 3
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->id:J

    .line 4
    iput-wide p3, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->eventTime:J

    .line 5
    iput p5, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleX:F

    .line 6
    iput p6, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewX:F

    .line 7
    iput p7, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transX:F

    .line 8
    iput p8, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewY:F

    .line 9
    iput p9, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleY:F

    .line 10
    iput p10, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transY:F

    .line 11
    iput p11, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp0:F

    .line 12
    iput p12, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp1:F

    .line 13
    iput p13, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp2:F

    return-void
.end method

.method public synthetic constructor <init>(JJFFFFFFFFFILkotlin/jvm/internal/e;)V
    .locals 14

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    move-wide v4, v2

    goto :goto_0

    :cond_0
    move-wide v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move-wide/from16 v2, p3

    :goto_1
    and-int/lit8 v1, v0, 0x4

    const/4 v6, 0x0

    if-eqz v1, :cond_2

    move v1, v6

    goto :goto_2

    :cond_2
    move/from16 v1, p5

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    move v7, v6

    goto :goto_3

    :cond_3
    move/from16 v7, p6

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    move v8, v6

    goto :goto_4

    :cond_4
    move/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    move v9, v6

    goto :goto_5

    :cond_5
    move/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    move v10, v6

    goto :goto_6

    :cond_6
    move/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    move v11, v6

    goto :goto_7

    :cond_7
    move/from16 v11, p10

    :goto_7
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_8

    move v12, v6

    goto :goto_8

    :cond_8
    move/from16 v12, p11

    :goto_8
    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_9

    move v13, v6

    goto :goto_9

    :cond_9
    move/from16 v13, p12

    :goto_9
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_a

    move/from16 p14, v6

    :goto_a
    move-object p1, p0

    move/from16 p6, v1

    move-wide/from16 p4, v2

    move-wide/from16 p2, v4

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    goto :goto_b

    :cond_a
    move/from16 p14, p13

    goto :goto_a

    .line 14
    :goto_b
    invoke-direct/range {p1 .. p14}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;-><init>(JJFFFFFFFFF)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;JJFFFFFFFFFILjava/lang/Object;)Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;
    .locals 13

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->id:J

    goto :goto_0

    :cond_0
    move-wide v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->eventTime:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p3

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    iget v5, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleX:F

    goto :goto_2

    :cond_2
    move/from16 v5, p5

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    iget v6, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewX:F

    goto :goto_3

    :cond_3
    move/from16 v6, p6

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    iget v7, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transX:F

    goto :goto_4

    :cond_4
    move/from16 v7, p7

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    iget v8, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewY:F

    goto :goto_5

    :cond_5
    move/from16 v8, p8

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    iget v9, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleY:F

    goto :goto_6

    :cond_6
    move/from16 v9, p9

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    iget v10, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transY:F

    goto :goto_7

    :cond_7
    move/from16 v10, p10

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    iget v11, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp0:F

    goto :goto_8

    :cond_8
    move/from16 v11, p11

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    iget v12, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp1:F

    goto :goto_9

    :cond_9
    move/from16 v12, p12

    :goto_9
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_a

    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp2:F

    move/from16 p14, v0

    :goto_a
    move-object p1, p0

    move-wide p2, v1

    move-wide/from16 p4, v3

    move/from16 p6, v5

    move/from16 p7, v6

    move/from16 p8, v7

    move/from16 p9, v8

    move/from16 p10, v9

    move/from16 p11, v10

    move/from16 p12, v11

    move/from16 p13, v12

    goto :goto_b

    :cond_a
    move/from16 p14, p13

    goto :goto_a

    :goto_b
    invoke-virtual/range {p1 .. p14}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->copy(JJFFFFFFFFF)Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->id:J

    return-wide v0
.end method

.method public final component10()F
    .locals 1

    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp1:F

    return v0
.end method

.method public final component11()F
    .locals 1

    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp2:F

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->eventTime:J

    return-wide v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleX:F

    return v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewX:F

    return v0
.end method

.method public final component5()F
    .locals 1

    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transX:F

    return v0
.end method

.method public final component6()F
    .locals 1

    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewY:F

    return v0
.end method

.method public final component7()F
    .locals 1

    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleY:F

    return v0
.end method

.method public final component8()F
    .locals 1

    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transY:F

    return v0
.end method

.method public final component9()F
    .locals 1

    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp0:F

    return v0
.end method

.method public final copy(JJFFFFFFFFF)Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;
    .locals 14
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    move-wide v1, p1

    move-wide/from16 v3, p3

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;-><init>(JJFFFFFFFFF)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 12
    .line 13
    iget-wide v3, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->id:J

    .line 14
    .line 15
    iget-wide v5, p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->id:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget-wide v3, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->eventTime:J

    .line 23
    .line 24
    iget-wide v5, p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->eventTime:J

    .line 25
    .line 26
    cmp-long v1, v3, v5

    .line 27
    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleX:F

    .line 32
    .line 33
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget v3, p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleX:F

    .line 38
    .line 39
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_4

    .line 48
    .line 49
    return v2

    .line 50
    :cond_4
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewX:F

    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget v3, p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewX:F

    .line 57
    .line 58
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_5

    .line 67
    .line 68
    return v2

    .line 69
    :cond_5
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transX:F

    .line 70
    .line 71
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget v3, p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transX:F

    .line 76
    .line 77
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_6

    .line 86
    .line 87
    return v2

    .line 88
    :cond_6
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewY:F

    .line 89
    .line 90
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iget v3, p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewY:F

    .line 95
    .line 96
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_7

    .line 105
    .line 106
    return v2

    .line 107
    :cond_7
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleY:F

    .line 108
    .line 109
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    iget v3, p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleY:F

    .line 114
    .line 115
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-nez v1, :cond_8

    .line 124
    .line 125
    return v2

    .line 126
    :cond_8
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transY:F

    .line 127
    .line 128
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    iget v3, p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transY:F

    .line 133
    .line 134
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_9

    .line 143
    .line 144
    return v2

    .line 145
    :cond_9
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp0:F

    .line 146
    .line 147
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    iget v3, p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp0:F

    .line 152
    .line 153
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-nez v1, :cond_a

    .line 162
    .line 163
    return v2

    .line 164
    :cond_a
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp1:F

    .line 165
    .line 166
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    iget v3, p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp1:F

    .line 171
    .line 172
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-nez v1, :cond_b

    .line 181
    .line 182
    return v2

    .line 183
    :cond_b
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp2:F

    .line 184
    .line 185
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    iget p1, p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp2:F

    .line 190
    .line 191
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-nez p1, :cond_c

    .line 200
    .line 201
    return v2

    .line 202
    :cond_c
    return v0
.end method

.method public final getEventTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->eventTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getPerSp0()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp0:F

    .line 2
    .line 3
    return v0
.end method

.method public final getPerSp1()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp1:F

    .line 2
    .line 3
    return v0
.end method

.method public final getPerSp2()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp2:F

    .line 2
    .line 3
    return v0
.end method

.method public final getRecord()Lio/objectbox/relation/ToOne;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/objectbox/relation/ToOne<",
            "Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->record:Lio/objectbox/relation/ToOne;

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
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final getScaleX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleX:F

    .line 2
    .line 3
    return v0
.end method

.method public final getScaleY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleY:F

    .line 2
    .line 3
    return v0
.end method

.method public final getSkewX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewX:F

    .line 2
    .line 3
    return v0
.end method

.method public final getSkewY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewY:F

    .line 2
    .line 3
    return v0
.end method

.method public final getTransX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transX:F

    .line 2
    .line 3
    return v0
.end method

.method public final getTransY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transY:F

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->id:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-wide v2, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->eventTime:J

    .line 11
    .line 12
    invoke-static {v2, v3, v0, v1}, Landroidx/collection/a;->B(JII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleX:F

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewX:F

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transX:F

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewY:F

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleY:F

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transY:F

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v2, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp0:F

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget v2, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp1:F

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp2:F

    .line 65
    .line 66
    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    add-int/2addr v1, v0

    .line 71
    return v1
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
    const-class v1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

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

.method public final remove()V
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
    const-class v1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p0}, Lio/objectbox/a;->j(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setEventTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->eventTime:J

    .line 2
    .line 3
    return-void
.end method

.method public final setId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->id:J

    .line 2
    .line 3
    return-void
.end method

.method public final setPerSp0(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp0:F

    .line 2
    .line 3
    return-void
.end method

.method public final setPerSp1(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp1:F

    .line 2
    .line 3
    return-void
.end method

.method public final setPerSp2(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp2:F

    .line 2
    .line 3
    return-void
.end method

.method public final setRecord(Lio/objectbox/relation/ToOne;)V
    .locals 1
    .param p1    # Lio/objectbox/relation/ToOne;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/relation/ToOne<",
            "Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->record:Lio/objectbox/relation/ToOne;

    .line 7
    .line 8
    return-void
.end method

.method public final setScaleX(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleX:F

    .line 2
    .line 3
    return-void
.end method

.method public final setScaleY(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleY:F

    .line 2
    .line 3
    return-void
.end method

.method public final setSkewX(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewX:F

    .line 2
    .line 3
    return-void
.end method

.method public final setSkewY(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewY:F

    .line 2
    .line 3
    return-void
.end method

.method public final setTransX(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transX:F

    .line 2
    .line 3
    return-void
.end method

.method public final setTransY(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transY:F

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MatrixInfoEntity(id="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->id:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", eventTime="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->eventTime:J

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", scaleX="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleX:F

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", skewX="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewX:F

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", transX="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transX:F

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", skewY="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->skewY:F

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", scaleY="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->scaleY:F

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", transY="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->transY:F

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", perSp0="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp0:F

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", perSp1="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp1:F

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", perSp2="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget v1, p0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->perSp2:F

    .line 109
    .line 110
    const/16 v2, 0x29

    .line 111
    .line 112
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->p(Ljava/lang/StringBuilder;FC)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    return-object v0
.end method
