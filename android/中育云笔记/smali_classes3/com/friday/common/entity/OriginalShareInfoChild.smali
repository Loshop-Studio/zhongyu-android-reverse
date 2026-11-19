.class public final Lcom/friday/common/entity/OriginalShareInfoChild;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final createTime:Ljava/lang/String;

.field private final fileId:Ljava/lang/String;

.field private final fileName:Ljava/lang/String;

.field private final fileUrl:Ljava/lang/String;

.field private final ownerId:J

.field private final ownerName:Ljava/lang/String;

.field private final parentId:Ljava/lang/String;

.field private final shareId:J

.field private final shareTime:Ljava/lang/String;

.field private final type:I

.field private final updateTime:Ljava/lang/String;

.field private final version:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IILjava/lang/String;J)V
    .locals 1

    .line 1
    const-string v0, "createTime"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "updateTime"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "fileUrl"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "parentId"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "ownerName"

    .line 27
    .line 28
    invoke-static {p8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "shareTime"

    .line 32
    .line 33
    invoke-static {p9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "fileId"

    .line 37
    .line 38
    invoke-static {p12, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->createTime:Ljava/lang/String;

    .line 45
    .line 46
    iput-object p2, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileName:Ljava/lang/String;

    .line 47
    .line 48
    iput-object p3, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->updateTime:Ljava/lang/String;

    .line 49
    .line 50
    iput-object p4, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileUrl:Ljava/lang/String;

    .line 51
    .line 52
    iput-object p5, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->parentId:Ljava/lang/String;

    .line 53
    .line 54
    iput-wide p6, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->shareId:J

    .line 55
    .line 56
    iput-object p8, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->ownerName:Ljava/lang/String;

    .line 57
    .line 58
    iput-object p9, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->shareTime:Ljava/lang/String;

    .line 59
    .line 60
    iput p10, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->type:I

    .line 61
    .line 62
    iput p11, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->version:I

    .line 63
    .line 64
    iput-object p12, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileId:Ljava/lang/String;

    .line 65
    .line 66
    iput-wide p13, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->ownerId:J

    .line 67
    .line 68
    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/common/entity/OriginalShareInfoChild;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IILjava/lang/String;JILjava/lang/Object;)Lcom/friday/common/entity/OriginalShareInfoChild;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p15

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->createTime:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileName:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->updateTime:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileUrl:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->parentId:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-wide v7, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->shareId:J

    goto :goto_5

    :cond_5
    move-wide/from16 v7, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->ownerName:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->shareTime:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget v11, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->type:I

    goto :goto_8

    :cond_8
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget v12, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->version:I

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileId:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p12

    :goto_a
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_b

    iget-wide v14, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->ownerId:J

    move-wide/from16 p14, v14

    :goto_b
    move-object/from16 p1, v0

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-wide/from16 p7, v7

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move-object/from16 p13, v13

    goto :goto_c

    :cond_b
    move-wide/from16 p14, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p1 .. p15}, Lcom/friday/common/entity/OriginalShareInfoChild;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IILjava/lang/String;J)Lcom/friday/common/entity/OriginalShareInfoChild;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->createTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->version:I

    return v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileId:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()J
    .locals 2

    iget-wide v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->ownerId:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->updateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->parentId:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->shareId:J

    return-wide v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->ownerName:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->shareTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->type:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IILjava/lang/String;J)Lcom/friday/common/entity/OriginalShareInfoChild;
    .locals 16

    const-string v0, "createTime"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateTime"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileUrl"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parentId"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownerName"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shareTime"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileId"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/common/entity/OriginalShareInfoChild;

    move-wide/from16 v7, p6

    move/from16 v11, p10

    move/from16 v12, p11

    move-wide/from16 v14, p13

    invoke-direct/range {v1 .. v15}, Lcom/friday/common/entity/OriginalShareInfoChild;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IILjava/lang/String;J)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/common/entity/OriginalShareInfoChild;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/entity/OriginalShareInfoChild;

    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->createTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/OriginalShareInfoChild;->createTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileName:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/OriginalShareInfoChild;->fileName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->updateTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/OriginalShareInfoChild;->updateTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/OriginalShareInfoChild;->fileUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->parentId:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/OriginalShareInfoChild;->parentId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->shareId:J

    iget-wide v5, p1, Lcom/friday/common/entity/OriginalShareInfoChild;->shareId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->ownerName:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/OriginalShareInfoChild;->ownerName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->shareTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/OriginalShareInfoChild;->shareTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->type:I

    iget v3, p1, Lcom/friday/common/entity/OriginalShareInfoChild;->type:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->version:I

    iget v3, p1, Lcom/friday/common/entity/OriginalShareInfoChild;->version:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileId:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/OriginalShareInfoChild;->fileId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-wide v3, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->ownerId:J

    iget-wide v5, p1, Lcom/friday/common/entity/OriginalShareInfoChild;->ownerId:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getCreateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->createTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFileId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFileName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFileUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOwnerId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->ownerId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getOwnerName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->ownerName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getParentId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->parentId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getShareId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->shareId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getShareTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->shareTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->type:I

    .line 2
    .line 3
    return v0
.end method

.method public final getUpdateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->updateTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getVersion()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->version:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->createTime:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->updateTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->parentId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->shareId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->ownerName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->shareTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->type:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->version:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/friday/common/entity/OriginalShareInfoChild;->ownerId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->createTime:Ljava/lang/String;

    iget-object v2, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileName:Ljava/lang/String;

    iget-object v3, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->updateTime:Ljava/lang/String;

    iget-object v4, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileUrl:Ljava/lang/String;

    iget-object v5, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->parentId:Ljava/lang/String;

    iget-wide v6, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->shareId:J

    iget-object v8, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->ownerName:Ljava/lang/String;

    iget-object v9, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->shareTime:Ljava/lang/String;

    iget v10, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->type:I

    iget v11, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->version:I

    iget-object v12, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->fileId:Ljava/lang/String;

    iget-wide v13, v0, Lcom/friday/common/entity/OriginalShareInfoChild;->ownerId:J

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "OriginalShareInfoChild(createTime="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fileName="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", updateTime="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fileUrl="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", parentId="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", shareId="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", ownerName="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", shareTime="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", version="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", fileId="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", ownerId="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
