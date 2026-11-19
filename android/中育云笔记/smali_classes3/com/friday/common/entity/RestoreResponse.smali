.class public final Lcom/friday/common/entity/RestoreResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final expirationTimeStamp:J

.field private final fileId:Ljava/lang/String;

.field private final isRecycleBin:Z

.field private final parentId:Ljava/lang/String;

.field private final updateTime:Ljava/lang/String;

.field private final version:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;I)V
    .locals 1

    .line 1
    const-string v0, "parentId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileId"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "updateTime"

    .line 12
    .line 13
    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/friday/common/entity/RestoreResponse;->parentId:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/friday/common/entity/RestoreResponse;->fileId:Ljava/lang/String;

    .line 22
    .line 23
    iput-boolean p3, p0, Lcom/friday/common/entity/RestoreResponse;->isRecycleBin:Z

    .line 24
    .line 25
    iput-wide p4, p0, Lcom/friday/common/entity/RestoreResponse;->expirationTimeStamp:J

    .line 26
    .line 27
    iput-object p6, p0, Lcom/friday/common/entity/RestoreResponse;->updateTime:Ljava/lang/String;

    .line 28
    .line 29
    iput p7, p0, Lcom/friday/common/entity/RestoreResponse;->version:I

    .line 30
    .line 31
    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/common/entity/RestoreResponse;Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;IILjava/lang/Object;)Lcom/friday/common/entity/RestoreResponse;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/friday/common/entity/RestoreResponse;->parentId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/friday/common/entity/RestoreResponse;->fileId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-boolean p3, p0, Lcom/friday/common/entity/RestoreResponse;->isRecycleBin:Z

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-wide p4, p0, Lcom/friday/common/entity/RestoreResponse;->expirationTimeStamp:J

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p6, p0, Lcom/friday/common/entity/RestoreResponse;->updateTime:Ljava/lang/String;

    :cond_4
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_5

    iget p7, p0, Lcom/friday/common/entity/RestoreResponse;->version:I

    :cond_5
    move-object p8, p6

    move p9, p7

    move-wide p6, p4

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/friday/common/entity/RestoreResponse;->copy(Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;I)Lcom/friday/common/entity/RestoreResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/RestoreResponse;->parentId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/RestoreResponse;->fileId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/RestoreResponse;->isRecycleBin:Z

    return v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/friday/common/entity/RestoreResponse;->expirationTimeStamp:J

    return-wide v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/RestoreResponse;->updateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/friday/common/entity/RestoreResponse;->version:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;I)Lcom/friday/common/entity/RestoreResponse;
    .locals 9

    const-string v0, "parentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateTime"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/common/entity/RestoreResponse;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-wide v5, p4

    move-object v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/friday/common/entity/RestoreResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;I)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/common/entity/RestoreResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/entity/RestoreResponse;

    iget-object v1, p0, Lcom/friday/common/entity/RestoreResponse;->parentId:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/RestoreResponse;->parentId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/common/entity/RestoreResponse;->fileId:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/RestoreResponse;->fileId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/friday/common/entity/RestoreResponse;->isRecycleBin:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/RestoreResponse;->isRecycleBin:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/friday/common/entity/RestoreResponse;->expirationTimeStamp:J

    iget-wide v5, p1, Lcom/friday/common/entity/RestoreResponse;->expirationTimeStamp:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/friday/common/entity/RestoreResponse;->updateTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/RestoreResponse;->updateTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/friday/common/entity/RestoreResponse;->version:I

    iget p1, p1, Lcom/friday/common/entity/RestoreResponse;->version:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getExpirationTimeStamp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/common/entity/RestoreResponse;->expirationTimeStamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getFileId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/RestoreResponse;->fileId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getParentId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/RestoreResponse;->parentId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUpdateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/RestoreResponse;->updateTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getVersion()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/RestoreResponse;->version:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/friday/common/entity/RestoreResponse;->parentId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/RestoreResponse;->fileId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/RestoreResponse;->isRecycleBin:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/friday/common/entity/RestoreResponse;->expirationTimeStamp:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/RestoreResponse;->updateTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/entity/RestoreResponse;->version:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isRecycleBin()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/RestoreResponse;->isRecycleBin:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/friday/common/entity/RestoreResponse;->parentId:Ljava/lang/String;

    iget-object v1, p0, Lcom/friday/common/entity/RestoreResponse;->fileId:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/friday/common/entity/RestoreResponse;->isRecycleBin:Z

    iget-wide v3, p0, Lcom/friday/common/entity/RestoreResponse;->expirationTimeStamp:J

    iget-object v5, p0, Lcom/friday/common/entity/RestoreResponse;->updateTime:Ljava/lang/String;

    iget v6, p0, Lcom/friday/common/entity/RestoreResponse;->version:I

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "RestoreResponse(parentId="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fileId="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isRecycleBin="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", expirationTimeStamp="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", updateTime="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", version="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
