.class public final Lcom/friday/document/model/ShareIntentEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final fileName:Ljava/lang/String;

.field private final fileType:Ljava/lang/String;

.field private final originalUserId:J

.field private final originalUserName:Ljava/lang/String;

.field private final shareId:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    .line 1
    const-string v0, "fileType"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "originalUserName"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-wide p1, p0, Lcom/friday/document/model/ShareIntentEntity;->shareId:J

    .line 20
    .line 21
    iput-object p3, p0, Lcom/friday/document/model/ShareIntentEntity;->fileType:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p4, p0, Lcom/friday/document/model/ShareIntentEntity;->fileName:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p5, p0, Lcom/friday/document/model/ShareIntentEntity;->originalUserName:Ljava/lang/String;

    .line 26
    .line 27
    iput-wide p6, p0, Lcom/friday/document/model/ShareIntentEntity;->originalUserId:J

    .line 28
    .line 29
    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/document/model/ShareIntentEntity;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)Lcom/friday/document/model/ShareIntentEntity;
    .locals 8

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/friday/document/model/ShareIntentEntity;->shareId:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/friday/document/model/ShareIntentEntity;->fileType:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p8, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/friday/document/model/ShareIntentEntity;->fileName:Ljava/lang/String;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p8, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lcom/friday/document/model/ShareIntentEntity;->originalUserName:Ljava/lang/String;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p8, 0x10

    if-eqz p1, :cond_4

    iget-wide p6, p0, Lcom/friday/document/model/ShareIntentEntity;->originalUserId:J

    :cond_4
    move-object v0, p0

    move-wide v6, p6

    invoke-virtual/range {v0 .. v7}, Lcom/friday/document/model/ShareIntentEntity;->copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/friday/document/model/ShareIntentEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/friday/document/model/ShareIntentEntity;->shareId:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/model/ShareIntentEntity;->fileType:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/model/ShareIntentEntity;->fileName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/model/ShareIntentEntity;->originalUserName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lcom/friday/document/model/ShareIntentEntity;->originalUserId:J

    return-wide v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/friday/document/model/ShareIntentEntity;
    .locals 9

    const-string v0, "fileType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalUserName"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/document/model/ShareIntentEntity;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-wide v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/friday/document/model/ShareIntentEntity;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/document/model/ShareIntentEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/document/model/ShareIntentEntity;

    iget-wide v3, p0, Lcom/friday/document/model/ShareIntentEntity;->shareId:J

    iget-wide v5, p1, Lcom/friday/document/model/ShareIntentEntity;->shareId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/document/model/ShareIntentEntity;->fileType:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/document/model/ShareIntentEntity;->fileType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/friday/document/model/ShareIntentEntity;->fileName:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/document/model/ShareIntentEntity;->fileName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/friday/document/model/ShareIntentEntity;->originalUserName:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/document/model/ShareIntentEntity;->originalUserName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/friday/document/model/ShareIntentEntity;->originalUserId:J

    iget-wide v5, p1, Lcom/friday/document/model/ShareIntentEntity;->originalUserId:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getFileName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareIntentEntity;->fileName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFileType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareIntentEntity;->fileType:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOriginalUserId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/document/model/ShareIntentEntity;->originalUserId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getOriginalUserName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareIntentEntity;->originalUserName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getShareId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/document/model/ShareIntentEntity;->shareId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/friday/document/model/ShareIntentEntity;->shareId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/document/model/ShareIntentEntity;->fileType:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/document/model/ShareIntentEntity;->fileName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/document/model/ShareIntentEntity;->originalUserName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/friday/document/model/ShareIntentEntity;->originalUserId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-wide v0, p0, Lcom/friday/document/model/ShareIntentEntity;->shareId:J

    iget-object v2, p0, Lcom/friday/document/model/ShareIntentEntity;->fileType:Ljava/lang/String;

    iget-object v3, p0, Lcom/friday/document/model/ShareIntentEntity;->fileName:Ljava/lang/String;

    iget-object v4, p0, Lcom/friday/document/model/ShareIntentEntity;->originalUserName:Ljava/lang/String;

    iget-wide v5, p0, Lcom/friday/document/model/ShareIntentEntity;->originalUserId:J

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "ShareIntentEntity(shareId="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", fileType="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fileName="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", originalUserName="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", originalUserId="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
