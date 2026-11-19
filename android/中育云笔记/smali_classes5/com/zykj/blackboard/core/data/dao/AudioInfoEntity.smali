# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lio/objectbox/annotation/Entity;
.end annotation


# instance fields
.field transient __boxStore:Lio/objectbox/BoxStore;

.field private commandEnum:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

.field private data:[B

.field private delayTime:J

.field private duration:J

.field private id:J

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

    invoke-direct/range {v0 .. v11}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;-><init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[BILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V
    .locals 2

    const-string v0, "commandEnum"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/objectbox/relation/ToOne;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity_;->p:Lio/objectbox/relation/RelationInfo;

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

.method public synthetic constructor <init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[BILkotlin/jvm/internal/n;)V
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
    sget-object p8, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->d:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

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


# virtual methods
.method public final a()Lcom/zykj/board/EzyCommandEnum$CommandEnum;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->commandEnum:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->data:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->delayTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->duration:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final e()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

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
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public final f()Lio/objectbox/relation/ToOne;
    .locals 1

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
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->isPlay:Z

    .line 2
    .line 3
    return v0
.end method

.method public final h()V
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
    const-class v1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

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

.method public hashCode()I
    .locals 3

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
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-wide v1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->delayTime:J

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-wide v1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->duration:J

    .line 19
    .line 20
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-boolean v1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->isPlay:Z

    .line 28
    .line 29
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    mul-int/lit8 v0, v0, 0x1f

    .line 35
    .line 36
    iget-object v1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->commandEnum:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/2addr v0, v1

    .line 43
    mul-int/lit8 v0, v0, 0x1f

    .line 44
    .line 45
    iget-object v1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->data:[B

    .line 46
    .line 47
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v0, v1

    .line 52
    return v0
.end method

.method public final i([B)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->data:[B

    .line 7
    .line 8
    return-void
.end method

.method public final j(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->duration:J

    .line 2
    .line 3
    return-void
.end method

.method public final k(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->id:J

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AudioInfoEntity(id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
