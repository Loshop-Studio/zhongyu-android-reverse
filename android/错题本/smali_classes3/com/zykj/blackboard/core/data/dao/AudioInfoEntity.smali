# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lio/objectbox/annotation/Entity;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000e\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u00002\u00020\u0001BC\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00062\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!JL\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010%\u001a\u00020$H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\'\u001a\u0004\u0008(\u0010\u0019\"\u0004\u0008)\u0010*R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\'\u001a\u0004\u0008+\u0010\u0019\"\u0004\u0008,\u0010*R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\'\u001a\u0004\u0008-\u0010\u0019\"\u0004\u0008.\u0010*R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010/\u001a\u0004\u0008\u0007\u0010\u001d\"\u0004\u00080\u00101R\"\u0010\t\u001a\u00020\u00088\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u00102\u001a\u0004\u00083\u0010\u001f\"\u0004\u00084\u00105R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u00106\u001a\u0004\u00087\u0010!\"\u0004\u00088\u00109R(\u0010<\u001a\u0008\u0012\u0004\u0012\u00020;0:8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010A\u00a8\u0006B"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;",
        "",
        "",
        "id",
        "delayTime",
        "duration",
        "",
        "isPlay",
        "Lcom/zykj/board/EzyCommandEnum$CommandEnum;",
        "commandEnum",
        "",
        "data",
        "<init>",
        "(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "Ld6/s;",
        "put",
        "()V",
        "remove",
        "component1",
        "()J",
        "component2",
        "component3",
        "component4",
        "()Z",
        "component5",
        "()Lcom/zykj/board/EzyCommandEnum$CommandEnum;",
        "component6",
        "()[B",
        "copy",
        "(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "J",
        "getId",
        "setId",
        "(J)V",
        "getDelayTime",
        "setDelayTime",
        "getDuration",
        "setDuration",
        "Z",
        "setPlay",
        "(Z)V",
        "Lcom/zykj/board/EzyCommandEnum$CommandEnum;",
        "getCommandEnum",
        "setCommandEnum",
        "(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)V",
        "[B",
        "getData",
        "setData",
        "([B)V",
        "Lio/objectbox/relation/ToOne;",
        "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;",
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

.field private commandEnum:Lcom/zykj/board/EzyCommandEnum$CommandEnum;
    .annotation build Lio/objectbox/annotation/Convert;
        converter = Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;
        dbType = I
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private data:[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private delayTime:J

.field private duration:J

.field private id:J
    .annotation build Lio/objectbox/annotation/Id;
    .end annotation
.end field

.field private isPlay:Z

.field public record:Lio/objectbox/relation/ToOne;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToOne<",
            "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x3f

    const/4 v11, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;-><init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[BILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V
    .locals 2
    .param p8    # Lcom/zykj/board/EzyCommandEnum$CommandEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "commandEnum"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/objectbox/relation/ToOne;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity_;->record:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToOne;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->record:Lio/objectbox/relation/ToOne;

    .line 3
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->id:J

    .line 4
    iput-wide p3, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->delayTime:J

    .line 5
    iput-wide p5, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->duration:J

    .line 6
    iput-boolean p7, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->isPlay:Z

    .line 7
    iput-object p8, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->commandEnum:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 8
    iput-object p9, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->data:[B

    return-void
.end method

.method public synthetic constructor <init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[BILkotlin/jvm/internal/e;)V
    .locals 2

    and-int/lit8 p11, p10, 0x1

    const-wide/16 v0, 0x0

    if-eqz p11, :cond_0

    move-wide p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    move-wide p3, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    move-wide p5, v0

    :cond_2
    and-int/lit8 p11, p10, 0x8

    const/4 v0, 0x0

    if-eqz p11, :cond_3

    move p7, v0

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    .line 9
    sget-object p8, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_DEFAULT:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    :cond_4
    and-int/lit8 p10, p10, 0x20

    if-eqz p10, :cond_5

    .line 10
    new-array p9, v0, [B

    :cond_5
    move-object p10, p9

    move-object p9, p8

    move p8, p7

    move-wide p6, p5

    move-wide p4, p3

    move-wide p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p10}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;-><init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[BILjava/lang/Object;)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;
    .locals 10

    and-int/lit8 v0, p10, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->id:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p10, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->delayTime:J

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p10, 0x4

    if-eqz p1, :cond_2

    iget-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->duration:J

    move-wide v5, p1

    goto :goto_0

    :cond_2
    move-wide v5, p5

    :goto_0
    and-int/lit8 p1, p10, 0x8

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->isPlay:Z

    move v7, p1

    goto :goto_1

    :cond_3
    move/from16 v7, p7

    :goto_1
    and-int/lit8 p1, p10, 0x10

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->commandEnum:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    move-object v8, p1

    goto :goto_2

    :cond_4
    move-object/from16 v8, p8

    :goto_2
    and-int/lit8 p1, p10, 0x20

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->data:[B

    move-object v9, p1

    :goto_3
    move-object v0, p0

    goto :goto_4

    :cond_5
    move-object/from16 v9, p9

    goto :goto_3

    :goto_4
    invoke-virtual/range {v0 .. v9}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->copy(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->id:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->delayTime:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->duration:J

    return-wide v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->isPlay:Z

    return v0
.end method

.method public final component5()Lcom/zykj/board/EzyCommandEnum$CommandEnum;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->commandEnum:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    return-object v0
.end method

.method public final component6()[B
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->data:[B

    return-object v0
.end method

.method public final copy(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;
    .locals 11
    .param p8    # Lcom/zykj/board/EzyCommandEnum$CommandEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "commandEnum"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    move-wide v2, p1

    move-wide v4, p3

    move-wide/from16 v6, p5

    move/from16 v8, p7

    invoke-direct/range {v1 .. v10}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;-><init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V

    return-object v1
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
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v1, 0x0

    .line 13
    :goto_0
    const-class v2, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    return v2

    .line 23
    :cond_2
    const-string v1, "null cannot be cast to non-null type com.zykj.blackboard.core.data.dao.AudioInfoEntity"

    .line 24
    .line 25
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 29
    .line 30
    iget-wide v3, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->id:J

    .line 31
    .line 32
    iget-wide v5, p1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->id:J

    .line 33
    .line 34
    cmp-long v1, v3, v5

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    return v2

    .line 39
    :cond_3
    iget-wide v3, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->delayTime:J

    .line 40
    .line 41
    iget-wide v5, p1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->delayTime:J

    .line 42
    .line 43
    cmp-long v1, v3, v5

    .line 44
    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    return v2

    .line 48
    :cond_4
    iget-wide v3, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->duration:J

    .line 49
    .line 50
    iget-wide v5, p1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->duration:J

    .line 51
    .line 52
    cmp-long v1, v3, v5

    .line 53
    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-boolean v1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->isPlay:Z

    .line 58
    .line 59
    iget-boolean v3, p1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->isPlay:Z

    .line 60
    .line 61
    if-eq v1, v3, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-object v1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->commandEnum:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 65
    .line 66
    iget-object v3, p1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->commandEnum:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 67
    .line 68
    if-eq v1, v3, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-object v1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->data:[B

    .line 72
    .line 73
    iget-object p1, p1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->data:[B

    .line 74
    .line 75
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-nez p1, :cond_8

    .line 80
    .line 81
    return v2

    .line 82
    :cond_8
    return v0
.end method

.method public final getCommandEnum()Lcom/zykj/board/EzyCommandEnum$CommandEnum;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->commandEnum:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getData()[B
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->data:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDelayTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->delayTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getDuration()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->duration:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getRecord()Lio/objectbox/relation/ToOne;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/objectbox/relation/ToOne<",
            "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->record:Lio/objectbox/relation/ToOne;

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

.method public hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->id:J

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
    iget-wide v2, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->delayTime:J

    .line 11
    .line 12
    invoke-static {v2, v3, v0, v1}, Landroidx/collection/a;->B(JII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->duration:J

    .line 17
    .line 18
    invoke-static {v2, v3, v0, v1}, Landroidx/collection/a;->B(JII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->isPlay:Z

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->commandEnum:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->data:[B

    .line 37
    .line 38
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/2addr v0, v2

    .line 43
    return v0
.end method

.method public final isPlay()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->isPlay:Z

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
    const-class v1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

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
    const-class v1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

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

.method public final setCommandEnum(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)V
    .locals 1
    .param p1    # Lcom/zykj/board/EzyCommandEnum$CommandEnum;
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
    iput-object p1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->commandEnum:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 7
    .line 8
    return-void
.end method

.method public final setData([B)V
    .locals 1
    .param p1    # [B
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
    iput-object p1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->data:[B

    .line 7
    .line 8
    return-void
.end method

.method public final setDelayTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->delayTime:J

    .line 2
    .line 3
    return-void
.end method

.method public final setDuration(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->duration:J

    .line 2
    .line 3
    return-void
.end method

.method public final setId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->id:J

    .line 2
    .line 3
    return-void
.end method

.method public final setPlay(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->isPlay:Z

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
            "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;",
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
    iput-object p1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->record:Lio/objectbox/relation/ToOne;

    .line 7
    .line 8
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AudioInfoEntity(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->id:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", delayTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->delayTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->duration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", isPlay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->isPlay:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", commandEnum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->commandEnum:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->data:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
